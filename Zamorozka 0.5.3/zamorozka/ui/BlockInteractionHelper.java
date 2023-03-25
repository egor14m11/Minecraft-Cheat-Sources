package zamorozka.ui;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.PlayerControllerMP;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.network.play.client.CPacketAnimation;
import net.minecraft.network.play.client.CPacketEntityAction;
import net.minecraft.network.play.client.CPacketPlayer;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.*;
import zamorozka.ui.PlayerUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.Double.isNaN;

public class BlockInteractionHelper
{

    public static final List<Block> blackList = Arrays.asList(Blocks.ENDER_CHEST, Blocks.CHEST, Blocks.TRAPPED_CHEST, Blocks.CRAFTING_TABLE, Blocks.ANVIL, Blocks.BREWING_STAND, Blocks.HOPPER,
            Blocks.DROPPER, Blocks.DISPENSER, Blocks.TRAPDOOR, Blocks.ENCHANTING_TABLE);
    
    public static final List<Item> blackList2 = Arrays.asList(Items.SLIME_BALL);

    private static final Minecraft mc = Minecraft.getMinecraft();

    public static void placeBlockScaffold(BlockPos pos)
    {
        Vec3d eyesPos = new Vec3d(Minecraft.getMinecraft().player.posX, Minecraft.getMinecraft().player.posY + Minecraft.getMinecraft().player.getEyeHeight(), Minecraft.getMinecraft().player.posZ);

        for (EnumFacing side : EnumFacing.values())
        {
            BlockPos neighbor = pos.offset(side);
            EnumFacing side2 = side.getOpposite();

            // check if neighbor can be right clicked
            if (!canBeClicked(neighbor))
            {
                continue;
            }

            Vec3d hitVec = new Vec3d(neighbor).addVector(0.5, 0.5, 0.5).add(new Vec3d(side2.getDirectionVec()).scale(0.5));

            // check if hitVec is within range (4.25 blocks)
            if (eyesPos.squareDistanceTo(hitVec) > 18.0625)
            {
                continue;
            }

            // place block
            faceVectorPacketInstant(hitVec);
            processRightClickBlock(neighbor, side2, hitVec);
            Minecraft.getMinecraft().player.swingArm(EnumHand.MAIN_HAND);
            mc.rightClickDelayTimer = 4;

            return;
        }

    }

    public static float[] getLegitRotations(Vec3d vec)
    {
        Vec3d eyesPos = getEyesPos();

        double diffX = vec.xCoord - eyesPos.xCoord;
        double diffY = vec.yCoord - eyesPos.yCoord;
        double diffZ = vec.zCoord - eyesPos.zCoord;

        double diffXZ = Math.sqrt(diffX * diffX + diffZ * diffZ);

        float yaw = (float) Math.toDegrees(Math.atan2(diffZ, diffX)) - 90F;
        float pitch = (float) -Math.toDegrees(Math.atan2(diffY, diffXZ));

        return new float[]
        { Minecraft.getMinecraft().player.rotationYaw + MathHelper.wrapDegrees(yaw - Minecraft.getMinecraft().player.rotationYaw),
                Minecraft.getMinecraft().player.rotationPitch + MathHelper.wrapDegrees(pitch - Minecraft.getMinecraft().player.rotationPitch) };
    }

    private static Vec3d getEyesPos()
    {
        return new Vec3d(Minecraft.getMinecraft().player.posX, Minecraft.getMinecraft().player.posY + Minecraft.getMinecraft().player.getEyeHeight(), Minecraft.getMinecraft().player.posZ);
    }

    public static void faceVectorPacketInstant(Vec3d vec)
    {
        float[] rotations = getLegitRotations(vec);

        Minecraft.getMinecraft().player.connection.sendPacket(new CPacketPlayer.Rotation(rotations[0], rotations[1], Minecraft.getMinecraft().player.onGround));
    }

    private static void processRightClickBlock(BlockPos pos, EnumFacing side, Vec3d hitVec)
    {
        getPlayerController().processRightClickBlock(Minecraft.getMinecraft().player, mc.world, pos, side, hitVec, EnumHand.MAIN_HAND);
    }

    public static boolean canBeClicked(BlockPos pos)
    {
        return getBlock(pos).canCollideCheck(getState(pos), false);
    }

    private static Block getBlock(BlockPos pos)
    {
        return getState(pos).getBlock();
    }

    private static PlayerControllerMP getPlayerController()
    {
        return Minecraft.getMinecraft().playerController;
    }

    private static IBlockState getState(BlockPos pos)
    {
        return Minecraft.getMinecraft().world.getBlockState(pos);
    }

    public static boolean checkForNeighbours(BlockPos blockPos)
    {
        // check if we don't have a block adjacent to blockpos
        if (!hasNeighbour(blockPos))
        {
            // find air adjacent to blockpos that does have a block adjacent to it, let's fill this first as to form a bridge between the player and the original blockpos. necessary if the player is
            // going diagonal.
            for (EnumFacing side : EnumFacing.values())
            {
                BlockPos neighbour = blockPos.offset(side);
                if (hasNeighbour(neighbour))
                {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public static boolean hasNeighbour(BlockPos blockPos)
    {
        for (EnumFacing side : EnumFacing.values())
        {
            BlockPos neighbour = blockPos.offset(side);
            if (!Minecraft.getMinecraft().world.getBlockState(neighbour).getMaterial().isReplaceable())
            {
                return true;
            }
        }
        return false;
    }


    public static List<BlockPos> getSphere(BlockPos loc, float r, int h, boolean hollow, boolean sphere, int plus_y)
    {
        List<BlockPos> circleblocks = new ArrayList<>();
        int cx = loc.getX();
        int cy = loc.getY();
        int cz = loc.getZ();
        for (int x = cx - (int) r; x <= cx + r; x++)
        {
            for (int z = cz - (int) r; z <= cz + r; z++)
            {
                for (int y = (sphere ? cy - (int) r : cy); y < (sphere ? cy + r : cy + h); y++)
                {
                    double dist = (cx - x) * (cx - x) + (cz - z) * (cz - z) + (sphere ? (cy - y) * (cy - y) : 0);
                    if (dist < r * r && !(hollow && dist < (r - 1) * (r - 1)))
                    {
                        circleblocks.add(new BlockPos(x, y + plus_y, z));
                    }
                }
            }
        }
        return circleblocks;
    }

    public enum ValidResult
    {
        NoEntityCollision,
        AlreadyBlockThere,
        NoNeighbors,
        Ok,
    }

    public static ValidResult valid(BlockPos pos)
    {
        return valid(pos, false);
    }

    public enum PlaceResult
    {
        NotReplaceable,
        Neighbors,
        CantPlace,
        Placed,
    }

    public static PlaceResult place(BlockPos pos, float p_Distance, boolean p_Rotate, boolean p_UseSlabRule)
    {
        return place(pos, p_Distance, p_Rotate, p_UseSlabRule, false);
    }
    
    public static PlaceResult place(BlockPos pos, float p_Distance, boolean p_Rotate, boolean p_UseSlabRule, boolean packetSwing)
    {
        IBlockState l_State = mc.world.getBlockState(pos);

        boolean l_Replaceable = l_State.getMaterial().isReplaceable();

        boolean l_IsSlabAtBlock = l_State.getBlock() instanceof BlockSlab;
        
        if (!l_Replaceable && !l_IsSlabAtBlock)
            return PlaceResult.NotReplaceable;
        if (!BlockInteractionHelper.checkForNeighbours(pos))
            return PlaceResult.Neighbors;

        if (!l_IsSlabAtBlock)
        {
            ValidResult l_Result = valid(pos);

            if (l_Result != ValidResult.Ok && !l_Replaceable)
                return PlaceResult.CantPlace;
        }

        if (p_UseSlabRule)
        {
            if (l_IsSlabAtBlock && !l_State.isFullCube())
                return PlaceResult.CantPlace;
        }

        final Vec3d eyesPos = new Vec3d(mc.player.posX, mc.player.posY + mc.player.getEyeHeight(), mc.player.posZ);

        for (final EnumFacing side : EnumFacing.values())
        {
            final BlockPos neighbor = pos.offset(side);
            final EnumFacing side2 = side.getOpposite();

            if (mc.world.getBlockState(neighbor).getBlock().canCollideCheck(mc.world.getBlockState(neighbor), false))
            {
                final Vec3d hitVec = new Vec3d((Vec3i) neighbor).addVector(0.5, 0.5, 0.5).add(new Vec3d(side2.getDirectionVec()).scale(0.5));
                if (eyesPos.distanceTo(hitVec) <= p_Distance)
                {
                    final Block neighborPos = mc.world.getBlockState(neighbor).getBlock();

                    final boolean activated = neighborPos.onBlockActivated(mc.world, pos, mc.world.getBlockState(pos), mc.player, EnumHand.MAIN_HAND, side, 0, 0, 0);

                    if (BlockInteractionHelper.blackList.contains(neighborPos) || activated)
                    {
                        mc.player.connection.sendPacket(new CPacketEntityAction(mc.player, CPacketEntityAction.Action.START_SNEAKING));
                    }
                    if (p_Rotate)
                    {
                        BlockInteractionHelper.faceVectorPacketInstant(hitVec);
                    }
                    EnumActionResult l_Result2 = mc.playerController.processRightClickBlock(mc.player, mc.world, neighbor, side2, hitVec, EnumHand.MAIN_HAND);

                    if (l_Result2 != EnumActionResult.FAIL)
                    {
                        if (packetSwing)
                            mc.player.connection.sendPacket(new CPacketAnimation(EnumHand.MAIN_HAND));
                        else
                            mc.player.swingArm(EnumHand.MAIN_HAND);
                        if (activated)
                        {
                            mc.player.connection.sendPacket(new CPacketEntityAction(mc.player, CPacketEntityAction.Action.STOP_SNEAKING));
                        }
                        return PlaceResult.Placed;
                    }
                }
            }
        }
        return PlaceResult.CantPlace;
    }

    public static boolean IsLiquidOrAir(BlockPos p_Pos)
    {
        IBlockState l_State = mc.world.getBlockState(p_Pos);

        return l_State.getBlock() == Blocks.WATER || l_State.getBlock() == Blocks.LAVA || l_State.getBlock() == Blocks.AIR;
    }

    public static float[] getFacingRotations(int x, int y, int z, EnumFacing facing)
    {
        return getFacingRotations(x, y, z, facing, 1);
    }

    public static float[] getFacingRotations(int x, int y, int z, EnumFacing facing, double width)
    {
        return getRotationsForPosition(x + 0.5 + facing.getDirectionVec().getX() * width / 2.0, y + 0.5 + facing.getDirectionVec().getY() * width / 2.0, z + 0.5 + facing.getDirectionVec().getZ() * width / 2.0);
    }

    public static float[] getRotationsForPosition(double x, double y, double z)
    {
        return getRotationsForPosition(x, y, z, mc.player.posX, mc.player.posY + mc.player.getEyeHeight(), mc.player.posZ);
    }

    public static float[] getRotationsForPosition(double x, double y, double z, double sourceX, double sourceY, double sourceZ)
    {
        double deltaX = x - sourceX;
        double deltaY = y - sourceY;
        double deltaZ = z - sourceZ;

        double yawToEntity;

        if (deltaZ < 0 && deltaX < 0) { // quadrant 3
            yawToEntity = 90D + Math.toDegrees(Math.atan(deltaZ / deltaX)); // 90
            // degrees
            // forward
        } else if (deltaZ < 0 && deltaX > 0) { // quadrant 4
            yawToEntity = -90D + Math.toDegrees(Math.atan(deltaZ / deltaX)); // 90
            // degrees
            // back
        } else { // quadrants one or two
            yawToEntity = Math.toDegrees(-Math.atan(deltaX / deltaZ));
        }

        double distanceXZ = Math.sqrt(deltaX * deltaX + deltaZ
                * deltaZ);

        double pitchToEntity = -Math.toDegrees(Math.atan(deltaY / distanceXZ));

        yawToEntity = wrapAngleTo180((float) yawToEntity);
        pitchToEntity = wrapAngleTo180((float) pitchToEntity);

        yawToEntity = isNaN(yawToEntity) ? 0 : yawToEntity;
        pitchToEntity = isNaN(pitchToEntity) ? 0 : pitchToEntity;

        return new float[] { (float) yawToEntity, (float) pitchToEntity };
    }

    public static float wrapAngleTo180(float angle)
    {
        angle %= 360.0F;

        while (angle >= 180.0F) {
            angle -= 360.0F;
        }
        while (angle < -180.0F) {
            angle += 360.0F;
        }

        return angle;
    }

    public static ValidResult valid(BlockPos pos, boolean ignoreEntityCollision)
    {
        if (mc.world == null)
            return ValidResult.NoEntityCollision;
        // There are no entities to block placement,
        if (!mc.world.checkNoEntityCollision(new AxisAlignedBB(pos)) && !ignoreEntityCollision)
            return ValidResult.NoEntityCollision;
        
        if (!BlockInteractionHelper.checkForNeighbours(pos))
            return ValidResult.NoNeighbors;

        IBlockState l_State = mc.world.getBlockState(pos);

        if (l_State.getBlock() == Blocks.AIR)
        {
            final BlockPos[] l_Blocks =
            { pos.north(), pos.south(), pos.east(), pos.west(), pos.up(), pos.down() };

            for (BlockPos l_Pos : l_Blocks)
            {
                IBlockState l_State2 = mc.world.getBlockState(l_Pos);

                if (l_State2.getBlock() == Blocks.AIR)
                    continue;

                for (final EnumFacing side : EnumFacing.values())
                {
                    final BlockPos neighbor = pos.offset(side);

                    if (mc.world.getBlockState(neighbor).getBlock().canCollideCheck(mc.world.getBlockState(neighbor), false))
                    {
                        return ValidResult.Ok;
                    }
                }
            }

            return ValidResult.NoNeighbors;
        }

        return ValidResult.AlreadyBlockThere;
    }
    
    public static List<BlockPos> getCube() {
        List<BlockPos> cubeBlocks = new ArrayList<>();
        BlockPos playerPos = PlayerUtil.GetLocalPlayerPosFloored();
        switch (PlayerUtil.GetFacing()) {
            case East:
                for (int i = 0; i < 7; ++i) {
                    cubeBlocks.add(playerPos.east());
                    cubeBlocks.add(playerPos.east().up());
                    cubeBlocks.add(playerPos.east().up().up());
                    cubeBlocks.add(playerPos.east().north());
                    cubeBlocks.add(playerPos.east().north().up());
                    cubeBlocks.add(playerPos.east().north().up().up());
                    cubeBlocks.add(playerPos.east().south());
                    cubeBlocks.add(playerPos.east().south().up());
                    cubeBlocks.add(playerPos.east().south().up().up());

                    playerPos = new BlockPos(playerPos).east();
                }
                break;
            case North:
                for (int i = 0; i < 7; ++i) {
                    cubeBlocks.add(playerPos.north());
                    cubeBlocks.add(playerPos.north().up());
                    cubeBlocks.add(playerPos.north().up().up());
                    cubeBlocks.add(playerPos.north().east());
                    cubeBlocks.add(playerPos.north().east().up());
                    cubeBlocks.add(playerPos.north().east().up().up());
                    cubeBlocks.add(playerPos.north().west());
                    cubeBlocks.add(playerPos.north().west().up());
                    cubeBlocks.add(playerPos.north().west().up().up());

                    playerPos = new BlockPos(playerPos).north();
                }
                break;
            case South:
                for (int i = 0; i < 7; ++i) {
                    cubeBlocks.add(playerPos.south());
                    cubeBlocks.add(playerPos.south().up());
                    cubeBlocks.add(playerPos.south().up().up());
                    cubeBlocks.add(playerPos.south().west());
                    cubeBlocks.add(playerPos.south().west().up());
                    cubeBlocks.add(playerPos.south().west().up().up());
                    cubeBlocks.add(playerPos.south().east());
                    cubeBlocks.add(playerPos.south().east().up());
                    cubeBlocks.add(playerPos.south().east().up().up());

                    playerPos = new BlockPos(playerPos).south();
                }
                break;
            case West:
                for (int i = 0; i < 7; ++i) {
                    cubeBlocks.add(playerPos.west());
                    cubeBlocks.add(playerPos.west().up());
                    cubeBlocks.add(playerPos.west().up().up());
                    cubeBlocks.add(playerPos.west().south());
                    cubeBlocks.add(playerPos.west().south().up());
                    cubeBlocks.add(playerPos.west().south().up().up());
                    cubeBlocks.add(playerPos.west().north());
                    cubeBlocks.add(playerPos.west().north().up());
                    cubeBlocks.add(playerPos.west().north().up().up());


                    playerPos = new BlockPos(playerPos).west();
                }
                break;
        }
        return cubeBlocks;
    }
    
    public static List<BlockPos> get1x3() {
        List<BlockPos> cubeBlocks = new ArrayList<>();
        BlockPos playerPos = PlayerUtil.GetLocalPlayerPosFloored();
        switch (PlayerUtil.GetFacing()) {
            case East:
                for (int i = 0; i < 7; ++i) {
                    cubeBlocks.add(playerPos.east());
                    cubeBlocks.add(playerPos.east().up());
                    cubeBlocks.add(playerPos.east().up().up());

                    playerPos = new BlockPos(playerPos).east();
                }
                break;
            case North:
                for (int i = 0; i < 7; ++i) {
                    cubeBlocks.add(playerPos.north());
                    cubeBlocks.add(playerPos.north().up());
                    cubeBlocks.add(playerPos.north().up().up());

                    playerPos = new BlockPos(playerPos).north();
                }
                break;
            case South:
                for (int i = 0; i < 7; ++i) {
                    cubeBlocks.add(playerPos.south());
                    cubeBlocks.add(playerPos.south().up());
                    cubeBlocks.add(playerPos.south().up().up());

                    playerPos = new BlockPos(playerPos).south();
                }
                break;
            case West:
                for (int i = 0; i < 7; ++i) {
                    cubeBlocks.add(playerPos.west());
                    cubeBlocks.add(playerPos.west().up());
                    cubeBlocks.add(playerPos.west().up().up());


                    playerPos = new BlockPos(playerPos).west();
                }
                break;
        }
        return cubeBlocks;
    }
    public static List<BlockPos> get2x3() {
        List<BlockPos> cubeBlocks = new ArrayList<>();
        BlockPos playerPos = PlayerUtil.GetLocalPlayerPosFloored();
        switch (PlayerUtil.GetFacing()) {
            case East:
                for (int i = 0; i < 7; ++i) {
                    cubeBlocks.add(playerPos.east());
                    cubeBlocks.add(playerPos.east().up());
                    cubeBlocks.add(playerPos.east().up().up());
                    cubeBlocks.add(playerPos.east().north());
                    cubeBlocks.add(playerPos.east().north().up());
                    cubeBlocks.add(playerPos.east().north().up().up());
                    playerPos = new BlockPos(playerPos).east();
                }
                break;
            case North:
                for (int i = 0; i < 7; ++i) {
                    cubeBlocks.add(playerPos.north());
                    cubeBlocks.add(playerPos.north().up());
                    cubeBlocks.add(playerPos.north().up().up());
                    cubeBlocks.add(playerPos.north().east());
                    cubeBlocks.add(playerPos.north().east().up());
                    cubeBlocks.add(playerPos.north().east().up().up());
                    playerPos = new BlockPos(playerPos).north();
                }
                break;
            case South:
                for (int i = 0; i < 7; ++i) {
                    cubeBlocks.add(playerPos.south());
                    cubeBlocks.add(playerPos.south().up());
                    cubeBlocks.add(playerPos.south().up().up());
                    cubeBlocks.add(playerPos.south().west());
                    cubeBlocks.add(playerPos.south().west().up());
                    cubeBlocks.add(playerPos.south().west().up().up());
                    playerPos = new BlockPos(playerPos).south();
                }
                break;
            case West:
                for (int i = 0; i < 7; ++i) {
                    cubeBlocks.add(playerPos.west());
                    cubeBlocks.add(playerPos.west().up());
                    cubeBlocks.add(playerPos.west().up().up());
                    cubeBlocks.add(playerPos.west().south());
                    cubeBlocks.add(playerPos.west().south().up());
                    cubeBlocks.add(playerPos.west().south().up().up());
                    playerPos = new BlockPos(playerPos).west();
                }
                break;
        }
        return cubeBlocks;
    }
    public static List<BlockPos> getHighway2() {
        List<BlockPos> cubeBlocks = new ArrayList<>();
        BlockPos playerPos = PlayerUtil.GetLocalPlayerPosFloored();
        switch (PlayerUtil.GetFacing()) {
            case East:
                for (int i = 0; i < 7; ++i) {
                    cubeBlocks.add(playerPos.east());
                    cubeBlocks.add(playerPos.east().up());
                    cubeBlocks.add(playerPos.east().up().up());
                    cubeBlocks.add(playerPos.east().up().up().up());
                    cubeBlocks.add(playerPos.east().south().up());
                    cubeBlocks.add(playerPos.east().south().up().up());
                    cubeBlocks.add(playerPos.east().south().up().up().up());
                    cubeBlocks.add(playerPos.east().north());
                    cubeBlocks.add(playerPos.east().north().up());
                    cubeBlocks.add(playerPos.east().north().up().up());
                    cubeBlocks.add(playerPos.east().north().up().up().up());
                    cubeBlocks.add(playerPos.east().north().north().up());
                    cubeBlocks.add(playerPos.east().north().north().up().up());
                    cubeBlocks.add(playerPos.east().north().north().up().up().up());
                    playerPos = new BlockPos(playerPos).east();
                }
                break;
            case North:
                for (int i = 0; i < 7; ++i) {
                    cubeBlocks.add(playerPos.north());
                    cubeBlocks.add(playerPos.north().up());
                    cubeBlocks.add(playerPos.north().up().up());
                    cubeBlocks.add(playerPos.north().up().up().up());
                    cubeBlocks.add(playerPos.north().west().up());
                    cubeBlocks.add(playerPos.north().west().up().up());
                    cubeBlocks.add(playerPos.north().west().up().up().up());
                    cubeBlocks.add(playerPos.north().east());
                    cubeBlocks.add(playerPos.north().east().up());
                    cubeBlocks.add(playerPos.north().east().up().up());
                    cubeBlocks.add(playerPos.north().east().up().up().up());
                    cubeBlocks.add(playerPos.north().east().north().up());
                    cubeBlocks.add(playerPos.north().east().north().up().up());
                    cubeBlocks.add(playerPos.north().east().north().up().up().up());
                    playerPos = new BlockPos(playerPos).north();
                }
                break;
            case South:
                for (int i = 0; i < 7; ++i) {
                    cubeBlocks.add(playerPos.south());
                    cubeBlocks.add(playerPos.south().up());
                    cubeBlocks.add(playerPos.south().up().up());
                    cubeBlocks.add(playerPos.south().up().up().up());
                    cubeBlocks.add(playerPos.south().east().up());
                    cubeBlocks.add(playerPos.south().east().up().up());
                    cubeBlocks.add(playerPos.south().east().up().up().up());
                    cubeBlocks.add(playerPos.south().west());
                    cubeBlocks.add(playerPos.south().west().up());
                    cubeBlocks.add(playerPos.south().west().up().up());
                    cubeBlocks.add(playerPos.south().west().up().up().up());
                    cubeBlocks.add(playerPos.south().west().west().up());
                    cubeBlocks.add(playerPos.south().west().west().up().up());
                    cubeBlocks.add(playerPos.south().west().west().up().up().up());
                    playerPos = new BlockPos(playerPos).south();
                }
                break;
            case West:
                for (int i = 0; i < 7; ++i) {
                    cubeBlocks.add(playerPos.west());
                    cubeBlocks.add(playerPos.west().up());
                    cubeBlocks.add(playerPos.west().up().up());
                    cubeBlocks.add(playerPos.west().up().up().up());
                    cubeBlocks.add(playerPos.west().north().up());
                    cubeBlocks.add(playerPos.west().north().up().up());
                    cubeBlocks.add(playerPos.west().north().up().up().up());
                    cubeBlocks.add(playerPos.west().south());
                    cubeBlocks.add(playerPos.west().south().up());
                    cubeBlocks.add(playerPos.west().south().up().up());
                    cubeBlocks.add(playerPos.west().south().up().up().up());
                    cubeBlocks.add(playerPos.west().south().south().up());
                    cubeBlocks.add(playerPos.west().south().south().up().up());
                    cubeBlocks.add(playerPos.west().south().south().up().up().up());
                    playerPos = new BlockPos(playerPos).west();
                }
                break;
        }
        return cubeBlocks;
    }

    public static List<BlockPos> getHighway3() {
        List<BlockPos> cubeBlocks = new ArrayList<>();
        BlockPos playerPos = PlayerUtil.GetLocalPlayerPosFloored();
        switch (PlayerUtil.GetFacing()) {
            case East:
                for (int i = 0; i < 4; ++i) {
                    cubeBlocks.add(playerPos.east());
                    cubeBlocks.add(playerPos.east().up());
                    cubeBlocks.add(playerPos.east().up(2));
                    cubeBlocks.add(playerPos.east().up(3));
                    cubeBlocks.add(playerPos.east().south());
                    cubeBlocks.add(playerPos.east().south().up());
                    cubeBlocks.add(playerPos.east().south().up(2));
                    cubeBlocks.add(playerPos.east().south().up(3));
                    cubeBlocks.add(playerPos.east().south(2).up());
                    cubeBlocks.add(playerPos.east().south(2).up(2));
                    cubeBlocks.add(playerPos.east().south(2).up(3));
                    cubeBlocks.add(playerPos.east().north());
                    cubeBlocks.add(playerPos.east().north().up());
                    cubeBlocks.add(playerPos.east().north().up(2));
                    cubeBlocks.add(playerPos.east().north().up(3));
                    cubeBlocks.add(playerPos.east().north(2).up());
                    cubeBlocks.add(playerPos.east().north(2).up(2));
                    cubeBlocks.add(playerPos.east().north(2).up(3));
                    playerPos = new BlockPos(playerPos).east();
                }
                break;
            case North:
                for (int i = 0; i < 4; ++i) {
                    cubeBlocks.add(playerPos.north());
                    cubeBlocks.add(playerPos.north().up());
                    cubeBlocks.add(playerPos.north().up(2));
                    cubeBlocks.add(playerPos.north().up(3));
                    cubeBlocks.add(playerPos.north().east());
                    cubeBlocks.add(playerPos.north().east().up());
                    cubeBlocks.add(playerPos.north().east().up(2));
                    cubeBlocks.add(playerPos.north().east().up(3));
                    cubeBlocks.add(playerPos.north().east(2).up());
                    cubeBlocks.add(playerPos.north().east(2).up(2));
                    cubeBlocks.add(playerPos.north().east(2).up(3));
                    cubeBlocks.add(playerPos.north().west());
                    cubeBlocks.add(playerPos.north().west().up());
                    cubeBlocks.add(playerPos.north().west().up(2));
                    cubeBlocks.add(playerPos.north().west().up(3));
                    cubeBlocks.add(playerPos.north().west(2).up());
                    cubeBlocks.add(playerPos.north().west(2).up(2));
                    cubeBlocks.add(playerPos.north().west(2).up(3));
                    playerPos = new BlockPos(playerPos).north();
                }
                break;
            case South:
                for (int i = 0; i < 4; ++i) {
                    cubeBlocks.add(playerPos.south());
                    cubeBlocks.add(playerPos.south().up());
                    cubeBlocks.add(playerPos.south().up(2));
                    cubeBlocks.add(playerPos.south().up(3));
                    cubeBlocks.add(playerPos.south().west());
                    cubeBlocks.add(playerPos.south().west().up());
                    cubeBlocks.add(playerPos.south().west().up(2));
                    cubeBlocks.add(playerPos.south().west().up(3));
                    cubeBlocks.add(playerPos.south().west(2).up());
                    cubeBlocks.add(playerPos.south().west(2).up(2));
                    cubeBlocks.add(playerPos.south().west(2).up(3));
                    cubeBlocks.add(playerPos.south().east());
                    cubeBlocks.add(playerPos.south().east().up());
                    cubeBlocks.add(playerPos.south().east().up(2));
                    cubeBlocks.add(playerPos.south().east().up(3));
                    cubeBlocks.add(playerPos.south().east(2).up());
                    cubeBlocks.add(playerPos.south().east(2).up(2));
                    cubeBlocks.add(playerPos.south().east(2).up(3));
                    playerPos = new BlockPos(playerPos).south();
                }
                break;
            case West:
                for (int i = 0; i < 4; ++i) {
                    cubeBlocks.add(playerPos.west());
                    cubeBlocks.add(playerPos.west().up());
                    cubeBlocks.add(playerPos.west().up(2));
                    cubeBlocks.add(playerPos.west().up(3));
                    cubeBlocks.add(playerPos.west().north());
                    cubeBlocks.add(playerPos.west().north().up());
                    cubeBlocks.add(playerPos.west().north().up(2));
                    cubeBlocks.add(playerPos.west().north().up(3));
                    cubeBlocks.add(playerPos.west().north(2).up());
                    cubeBlocks.add(playerPos.west().north(2).up(2));
                    cubeBlocks.add(playerPos.west().north(2).up(3));
                    cubeBlocks.add(playerPos.west().south());
                    cubeBlocks.add(playerPos.west().south().up());
                    cubeBlocks.add(playerPos.west().south().up(2));
                    cubeBlocks.add(playerPos.west().south().up(3));
                    cubeBlocks.add(playerPos.west().south(2).up());
                    cubeBlocks.add(playerPos.west().south(2).up(2));
                    cubeBlocks.add(playerPos.west().south(2).up(3));
                    playerPos = new BlockPos(playerPos).west();
                }
                break;
        }
        return cubeBlocks;
    }
    public static List<BlockPos> getHighway4() {
        List<BlockPos> cubeBlocks = new ArrayList<>();
        BlockPos playerPos = PlayerUtil.GetLocalPlayerPosFloored();
        switch (PlayerUtil.GetFacing()) {
            case East:
                for (int i = 0; i < 4; ++i) {
                    cubeBlocks.add(playerPos.east());
                    cubeBlocks.add(playerPos.east().up());
                    cubeBlocks.add(playerPos.east().up(2));
                    cubeBlocks.add(playerPos.east().up(3));
                    cubeBlocks.add(playerPos.east().south());
                    cubeBlocks.add(playerPos.east().south().up());
                    cubeBlocks.add(playerPos.east().south().up(2));
                    cubeBlocks.add(playerPos.east().south().up(3));
                    cubeBlocks.add(playerPos.east().south(2).up());
                    cubeBlocks.add(playerPos.east().south(2).up(2));
                    cubeBlocks.add(playerPos.east().south(2).up(3));
                    cubeBlocks.add(playerPos.east().north());
                    cubeBlocks.add(playerPos.east().north().up());
                    cubeBlocks.add(playerPos.east().north().up(2));
                    cubeBlocks.add(playerPos.east().north().up(3));
                    cubeBlocks.add(playerPos.east().north(2));
                    cubeBlocks.add(playerPos.east().north(2).up());
                    cubeBlocks.add(playerPos.east().north(2).up(2));
                    cubeBlocks.add(playerPos.east().north(2).up(3));
                    cubeBlocks.add(playerPos.east().north(3).up());
                    cubeBlocks.add(playerPos.east().north(3).up(2));
                    cubeBlocks.add(playerPos.east().north(3).up(3));
                    playerPos = new BlockPos(playerPos).east();
                }
                break;
            case North:
                for (int i = 0; i < 4; ++i) {
                    cubeBlocks.add(playerPos.north());
                    cubeBlocks.add(playerPos.north().up());
                    cubeBlocks.add(playerPos.north().up(2));
                    cubeBlocks.add(playerPos.north().up(3));
                    cubeBlocks.add(playerPos.north().east());
                    cubeBlocks.add(playerPos.north().east().up());
                    cubeBlocks.add(playerPos.north().east().up(2));
                    cubeBlocks.add(playerPos.north().east().up(3));
                    cubeBlocks.add(playerPos.north().east(2).up());
                    cubeBlocks.add(playerPos.north().east(2).up(2));
                    cubeBlocks.add(playerPos.north().east(2).up(3));
                    cubeBlocks.add(playerPos.north().west());
                    cubeBlocks.add(playerPos.north().west().up());
                    cubeBlocks.add(playerPos.north().west().up(2));
                    cubeBlocks.add(playerPos.north().west().up(3));
                    cubeBlocks.add(playerPos.north().west(2));
                    cubeBlocks.add(playerPos.north().west(2).up());
                    cubeBlocks.add(playerPos.north().west(2).up(2));
                    cubeBlocks.add(playerPos.north().west(2).up(3));
                    cubeBlocks.add(playerPos.north().west(3).up());
                    cubeBlocks.add(playerPos.north().west(3).up(2));
                    cubeBlocks.add(playerPos.north().west(3).up(3));
                    playerPos = new BlockPos(playerPos).north();
                }
                break;
            case South:
                for (int i = 0; i < 4; ++i) {
                    cubeBlocks.add(playerPos.south());
                    cubeBlocks.add(playerPos.south().up());
                    cubeBlocks.add(playerPos.south().up(2));
                    cubeBlocks.add(playerPos.south().up(3));
                    cubeBlocks.add(playerPos.south().west());
                    cubeBlocks.add(playerPos.south().west().up());
                    cubeBlocks.add(playerPos.south().west().up(2));
                    cubeBlocks.add(playerPos.south().west().up(3));
                    cubeBlocks.add(playerPos.south().west(2).up());
                    cubeBlocks.add(playerPos.south().west(2).up(2));
                    cubeBlocks.add(playerPos.south().west(2).up(3));
                    cubeBlocks.add(playerPos.south().east());
                    cubeBlocks.add(playerPos.south().east().up());
                    cubeBlocks.add(playerPos.south().east().up(2));
                    cubeBlocks.add(playerPos.south().east().up(3));
                    cubeBlocks.add(playerPos.south().east(2));
                    cubeBlocks.add(playerPos.south().east(2).up());
                    cubeBlocks.add(playerPos.south().east(2).up(2));
                    cubeBlocks.add(playerPos.south().east(2).up(3));
                    cubeBlocks.add(playerPos.south().east(3).up());
                    cubeBlocks.add(playerPos.south().east(3).up(2));
                    cubeBlocks.add(playerPos.south().east(3).up(3));
                    playerPos = new BlockPos(playerPos).south();
                }
                break;
            case West:
                for (int i = 0; i < 4; ++i) {
                    cubeBlocks.add(playerPos.west());
                    cubeBlocks.add(playerPos.west().up());
                    cubeBlocks.add(playerPos.west().up(2));
                    cubeBlocks.add(playerPos.west().up(3));
                    cubeBlocks.add(playerPos.west().north());
                    cubeBlocks.add(playerPos.west().north().up());
                    cubeBlocks.add(playerPos.west().north().up(2));
                    cubeBlocks.add(playerPos.west().north().up(3));
                    cubeBlocks.add(playerPos.west().north(2).up());
                    cubeBlocks.add(playerPos.west().north(2).up(2));
                    cubeBlocks.add(playerPos.west().north(2).up(3));
                    cubeBlocks.add(playerPos.west().south());
                    cubeBlocks.add(playerPos.west().south().up());
                    cubeBlocks.add(playerPos.west().south().up(2));
                    cubeBlocks.add(playerPos.west().south().up(3));
                    cubeBlocks.add(playerPos.west().south(2));
                    cubeBlocks.add(playerPos.west().south(2).up());
                    cubeBlocks.add(playerPos.west().south(2).up(2));
                    cubeBlocks.add(playerPos.west().south(2).up(3));
                    cubeBlocks.add(playerPos.west().south(3).up());
                    cubeBlocks.add(playerPos.west().south(3).up(2));
                    cubeBlocks.add(playerPos.west().south(3).up(3));
                    playerPos = new BlockPos(playerPos).west();
                }
                break;
        }
        return cubeBlocks;
    }
}