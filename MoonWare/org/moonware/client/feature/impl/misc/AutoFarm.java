package org.moonware.client.feature.impl.misc;

import net.minecraft.block.*;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.ClickType;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemSeeds;
import net.minecraft.item.ItemStack;
import net.minecraft.network.play.client.CPacketHeldItemChange;
import net.minecraft.network.play.client.CPacketPlayerTryUseItemOnBlock;
import net.minecraft.network.play.server.SPacketBlockChange;
import net.minecraft.network.play.server.SPacketMultiBlockChange;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import org.moonware.client.event.EventTarget;
import org.moonware.client.event.events.impl.packet.EventReceivePacket;
import org.moonware.client.event.events.impl.player.EventPreMotion;
import org.moonware.client.feature.Feature;
import org.moonware.client.feature.impl.Type;
import org.moonware.client.helpers.math.RotationHelper;
import org.moonware.client.helpers.misc.TimerHelper;
import org.moonware.client.helpers.world.BlockHelper;
import org.moonware.client.helpers.world.EntityHelper;
import org.moonware.client.settings.impl.BooleanSetting;
import org.moonware.client.settings.impl.NumberSetting;

import java.util.ArrayList;
import java.util.Comparator;

public class AutoFarm extends Feature {

    private final NumberSetting delay;
    private final NumberSetting radius;
    private final BooleanSetting autoHoe;
    private final BooleanSetting autoFarm;
    ArrayList<BlockPos> crops = new ArrayList<>();
    ArrayList<BlockPos> check = new ArrayList<>();
    TimerHelper timerHelper = new TimerHelper();
    TimerHelper timerHelper2 = new TimerHelper();

    public AutoFarm() {
        super("Auto Farm", "Автоматически садит и ломает урожай", Type.Other);
        autoFarm = new BooleanSetting("Auto Farm", true, () -> true);
        autoHoe = new BooleanSetting("Auto Hoe", false, () -> true);
        delay = new NumberSetting("Farm Delay", 2, 0, 10, 0.1F, () -> true);
        radius = new NumberSetting("Farm Radius", 4, 1, 7, 0.1F, () -> true);
        addSettings(autoFarm, autoHoe, delay, radius);
    }

    public static boolean doesHaveSeeds() {
        for (int i = 0; i < 9; ++i) {
            Minecraft.player.inventory.getStackInSlot(i);
            if (Minecraft.player.inventory.getStackInSlot(i).getItem() instanceof ItemSeeds) {
                return true;
            }
        }
        return false;
    }

    public static int searchSeeds() {
        for (int i = 0; i < 45; ++i) {
            ItemStack itemStack = Minecraft.player.inventoryContainer.getSlot(i).getStack();
            if (itemStack.getItem() instanceof ItemSeeds) {
                return i;
            }
        }
        return -1;
    }

    public static int getSlotWithSeeds() {
        for (int i = 0; i < 9; ++i) {
            Minecraft.player.inventory.getStackInSlot(i);
            if (Minecraft.player.inventory.getStackInSlot(i).getItem() instanceof ItemSeeds) {
                return i;
            }
        }
        return 0;
    }

    @Override
    public void onEnable() {
        crops.clear();
        check.clear();
        super.onEnable();
    }

    private boolean isOnCrops() {
        for (double x = Minecraft.player.boundingBox.minX; x < Minecraft.player.boundingBox.maxX; x += 0.01f) {
            for (double z = Minecraft.player.boundingBox.minZ; z < Minecraft.player.boundingBox.maxZ; z += 0.01f) {
                Block block = Minecraft.world.getBlockState(new BlockPos(x, Minecraft.player.posY - 0.1, z)).getBlock();
                if (!(block instanceof BlockFarmland || block instanceof BlockCarrot || block instanceof BlockSoulSand || block instanceof BlockSand) && !(block instanceof BlockAir)) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean IsValidBlockPos(BlockPos pos) {
        IBlockState state = Minecraft.world.getBlockState(pos);
        if ((state).getBlock() instanceof BlockFarmland || state.getBlock() instanceof BlockSand || state.getBlock() instanceof BlockSoulSand)
            return Minecraft.world.getBlockState(pos.up()).getBlock() == Blocks.AIR;
        return false;
    }

    @EventTarget
    public void onPreMotion(EventPreMotion event) {
        if (Minecraft.player == null && Minecraft.world == null) return;
        BlockPos pos = BlockHelper.getSphere(BlockHelper.getPlayerPos(), radius.getNumberValue(), 6, false, true).stream().filter(BlockHelper::IsValidBlockPos).min(Comparator.comparing(blockPos -> EntityHelper.getDistanceOfEntityToBlock(Minecraft.player, blockPos))).orElse(null);
        if (pos != null && Minecraft.player.getHeldItemMainhand().getItem() instanceof ItemHoe) {
            float[] rots = RotationHelper.getRotationVector(new Vec3d(pos.getX() + 0.5F, pos.getY() + 0.5F, pos.getZ() + 0.5F), true, 2, 2, 360);
            event.setYaw(rots[0]);
            event.setPitch(rots[1]);
            Minecraft.player.renderYawOffset = rots[0];
            Minecraft.player.rotationYawHead = rots[0];
            Minecraft.player.rotationPitchHead = rots[1];
            if (timerHelper2.hasReached(delay.getNumberValue() * 100)) {
                Minecraft.player.connection.sendPacket(new CPacketPlayerTryUseItemOnBlock(pos, EnumFacing.UP, EnumHand.MAIN_HAND, 0, 0, 0));
                Minecraft.player.swingArm(EnumHand.MAIN_HAND);
                timerHelper2.reset();
            }
        }


        if (!doesHaveSeeds()) {
            if (searchSeeds() != -1) {
                Minecraft.playerController.windowClick(0, searchSeeds(), 1, ClickType.QUICK_MOVE, Minecraft.player);
            }
        }
    }

    @EventTarget
    public void onPre(EventPreMotion e) {
        if (autoFarm.getBoolValue()) {
            ArrayList<BlockPos> blockPositions = getBlocks(radius.getNumberValue(), radius.getNumberValue(), radius.getNumberValue());
            for (BlockPos pos : blockPositions) {
                IBlockState state = Minecraft.world.getBlockState(pos);
                if (isCheck(Block.getIdFromBlock(state.getBlock()))) {
                    if (!isCheck(0)) {
                        check.add(pos);
                    }
                    Block block = Minecraft.world.getBlockState(pos).getBlock();
                    BlockPos downPos = pos.down(1);
                    if (block instanceof BlockCrops || block instanceof BlockCarrot) {
                        BlockCrops crop = (BlockCrops) block;
                        if (!crop.canGrow(Minecraft.world, pos, state, true)) {
                            if (timerHelper.hasReached(delay.getNumberValue() * 100)) {
                                if (pos != null) {
                                    float[] rots = RotationHelper.getRotationVector(new Vec3d(pos.getX() + 0.5F, pos.getY() + 0.5F, pos.getZ() + 0.5F), true, 2, 2, 360);
                                    e.setYaw(rots[0]);
                                    e.setPitch(rots[1]);
                                    Minecraft.player.renderYawOffset = rots[0];
                                    Minecraft.player.rotationYawHead = rots[0];
                                    Minecraft.player.rotationPitchHead = rots[1];
                                    Minecraft.playerController.onPlayerDamageBlock(pos, Minecraft.player.getHorizontalFacing());
                                    Minecraft.player.swingArm(EnumHand.MAIN_HAND);

                                    if (doesHaveSeeds()) {
                                        Minecraft.player.connection.sendPacket(new CPacketHeldItemChange(getSlotWithSeeds()));
                                        Minecraft.player.connection.sendPacket(new CPacketPlayerTryUseItemOnBlock(downPos, EnumFacing.UP, EnumHand.MAIN_HAND, 0, 0, 0));
                                        Minecraft.player.swingArm(EnumHand.MAIN_HAND);
                                    }

                                    timerHelper.reset();
                                }
                            }
                        }
                    }
                }
            }
        }
        BlockPos pos = BlockHelper.getSphere(BlockHelper.getPlayerPos(), radius.getNumberValue(), 6, false, true).stream().filter(this::IsValidBlockPos).min(Comparator.comparing(blockPos -> EntityHelper.getDistanceOfEntityToBlock(Minecraft.player, blockPos))).orElse(null);
        Vec3d vec = new Vec3d(0, 0, 0);
        if (timerHelper.hasReached(delay.getNumberValue() * 100)) {
            if (isOnCrops()) {
                if (pos != null) {
                    if (doesHaveSeeds()) {
                        float[] rots = RotationHelper.getRotationVector(new Vec3d(pos.getX() + 0.5F, pos.getY() + 0.5F, pos.getZ() + 0.5F), true, 2, 2, 360);
                        e.setYaw(rots[0]);
                        e.setPitch(rots[1]);
                        Minecraft.player.renderYawOffset = rots[0];
                        Minecraft.player.rotationYawHead = rots[0];
                        Minecraft.player.rotationPitchHead = rots[1];
                        Minecraft.player.connection.sendPacket(new CPacketHeldItemChange(getSlotWithSeeds()));
                        Minecraft.playerController.processRightClickBlock(Minecraft.player, Minecraft.world, pos, EnumFacing.VALUES[0].getOpposite(), vec, EnumHand.MAIN_HAND);
                        timerHelper.reset();
                    }
                }
            }
        }
    }

    @EventTarget
    public void onReceivePacket(EventReceivePacket e) {
        if (autoFarm.getBoolValue()) {
            if (e.getPacket() instanceof SPacketBlockChange) {
                SPacketBlockChange p = (SPacketBlockChange) e.getPacket();

                if (isEnabled(Block.getIdFromBlock(p.getBlockState().getBlock()))) {
                    crops.add(p.getBlockPosition());
                }
            } else if (e.getPacket() instanceof SPacketMultiBlockChange) {
                SPacketMultiBlockChange p = (SPacketMultiBlockChange) e.getPacket();

                for (SPacketMultiBlockChange.BlockUpdateData dat : p.getChangedBlocks()) {
                    if (isEnabled(Block.getIdFromBlock(dat.getBlockState().getBlock()))) {
                        crops.add(dat.getPos());
                    }
                }
            }
        }
    }

    private boolean isCheck(int id) {
        int check = 0;
        if (id != 0) {
            check = 59;
        }
        if (id == 0) {
            return false;
        }
        return id == check;
    }

    private boolean isEnabled(int id) {
        int check = 0;
        if (id != 0) {
            check = 59;
        }
        if (id == 0) {
            return false;
        }
        return id == check;
    }

    private ArrayList<BlockPos> getBlocks(float x, float y, float z) {
        BlockPos min = new BlockPos(Minecraft.player.posX - x, Minecraft.player.posY - y, Minecraft.player.posZ - z);
        BlockPos max = new BlockPos(Minecraft.player.posX + x, Minecraft.player.posY + y, Minecraft.player.posZ + z);

        return BlockHelper.getAllInBox(min, max);
    }
}
