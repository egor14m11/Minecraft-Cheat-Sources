// 
// Decompiled by Procyon v0.5.36
// 

package net.augustus.modules.render;

import net.lenni0451.eventapi.reflection.EventTarget;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.util.AxisAlignedBB;
import java.util.Iterator;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.GlStateManager;
import org.lwjgl.opengl.GL11;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;
import java.util.Random;
import net.minecraft.util.MathHelper;
import net.minecraft.item.ItemEnderPearl;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemEgg;
import net.minecraft.item.ItemSnowball;
import net.augustus.events.EventRender3D;
import net.augustus.modules.Categorys;
import java.awt.Color;
import net.minecraft.util.Vec3;
import java.util.ArrayList;
import net.augustus.settings.DoubleValue;
import net.augustus.settings.ColorSetting;
import net.augustus.modules.Module;

public class Trajectories extends Module
{
    public final ColorSetting color;
    public final DoubleValue lineWidth;
    private final ArrayList<Vec3> positions;
    
    public Trajectories() {
        super("Trajectories", new Color(29, 202, 103), Categorys.RENDER);
        this.color = new ColorSetting(1, "Color", this, new Color(21, 121, 230));
        this.lineWidth = new DoubleValue(2, "LineWidth", this, 6.0, 1.0, 12.0, 0);
        this.positions = new ArrayList<Vec3>();
    }
    
    @Override
    public void onDisable() {
        super.onDisable();
        this.positions.clear();
    }
    
    @EventTarget
    public void onEvent3D(final EventRender3D eventRender3D) {
        this.positions.clear();
        final ItemStack itemStack = Trajectories.mc.thePlayer.getCurrentEquippedItem();
        MovingObjectPosition m = null;
        if (itemStack != null && (itemStack.getItem() instanceof ItemSnowball || itemStack.getItem() instanceof ItemEgg || itemStack.getItem() instanceof ItemBow || itemStack.getItem() instanceof ItemEnderPearl)) {
            final EntityLivingBase thrower = Trajectories.mc.thePlayer;
            float rotationYaw = thrower.prevRotationYaw + (thrower.rotationYaw - thrower.prevRotationYaw) * Trajectories.mc.getTimer().renderPartialTicks;
            float rotationPitch = thrower.prevRotationPitch + (thrower.rotationPitch - thrower.prevRotationPitch) * Trajectories.mc.getTimer().renderPartialTicks;
            double posX = thrower.lastTickPosX + (thrower.posX - thrower.lastTickPosX) * Trajectories.mc.getTimer().renderPartialTicks;
            double posY = thrower.lastTickPosY + thrower.getEyeHeight() + (thrower.posY - thrower.lastTickPosY) * Trajectories.mc.getTimer().renderPartialTicks;
            double posZ = thrower.lastTickPosZ + (thrower.posZ - thrower.lastTickPosZ) * Trajectories.mc.getTimer().renderPartialTicks;
            posX -= MathHelper.cos(rotationYaw / 180.0f * 3.1415927f) * 0.16f;
            posY -= 0.10000000149011612;
            posZ -= MathHelper.sin(rotationYaw / 180.0f * 3.1415927f) * 0.16f;
            float multipicator = 0.4f;
            if (itemStack.getItem() instanceof ItemBow) {
                multipicator = 1.0f;
            }
            double motionX = -MathHelper.sin(rotationYaw / 180.0f * 3.1415927f) * MathHelper.cos(rotationPitch / 180.0f * 3.1415927f) * multipicator;
            double motionZ = MathHelper.cos(rotationYaw / 180.0f * 3.1415927f) * MathHelper.cos(rotationPitch / 180.0f * 3.1415927f) * multipicator;
            double motionY = -MathHelper.sin(rotationPitch / 180.0f * 3.1415927f) * multipicator;
            double x = motionX;
            double y = motionY;
            double z = motionZ;
            final float inaccuracy = 0.0f;
            float velocity = 1.5f;
            if (itemStack.getItem() instanceof ItemBow) {
                final int i = Trajectories.mc.thePlayer.getItemInUseDuration() - Trajectories.mc.thePlayer.getItemInUseCount();
                float f = i / 20.0f;
                f = (f * f + f * 2.0f) / 3.0f;
                if (f < 0.1) {
                    return;
                }
                if (f > 1.0f) {
                    f = 1.0f;
                }
                velocity = f * 2.0f * 1.5f;
            }
            final Random rand = new Random();
            final float ff = MathHelper.sqrt_double(x * x + y * y + z * z);
            x /= ff;
            y /= ff;
            z /= ff;
            x += rand.nextGaussian() * 0.007499999832361937 * inaccuracy;
            y += rand.nextGaussian() * 0.007499999832361937 * inaccuracy;
            z += rand.nextGaussian() * 0.007499999832361937 * inaccuracy;
            x *= velocity;
            y *= velocity;
            z *= velocity;
            motionX = x;
            motionY = y;
            motionZ = z;
            float prevRotationYaw;
            rotationYaw = (prevRotationYaw = (float)(MathHelper.func_181159_b(x, z) * 180.0 / 3.141592653589793));
            float prevRotationPitch;
            rotationPitch = (prevRotationPitch = (float)(MathHelper.func_181159_b(y, MathHelper.sqrt_double(x * x + z * z)) * 180.0 / 3.141592653589793));
            boolean b = true;
            int ticksInAir = 0;
            while (b) {
                if (ticksInAir > 300) {
                    b = false;
                }
                ++ticksInAir;
                Vec3 vec3 = new Vec3(posX, posY, posZ);
                Vec3 vec4 = new Vec3(posX + motionX, posY + motionY, posZ + motionZ);
                MovingObjectPosition movingobjectposition = Trajectories.mc.theWorld.rayTraceBlocks(vec3, vec4);
                vec3 = new Vec3(posX, posY, posZ);
                vec4 = new Vec3(posX + motionX, posY + motionY, posZ + motionZ);
                if (movingobjectposition != null) {
                    vec4 = new Vec3(movingobjectposition.hitVec.xCoord, movingobjectposition.hitVec.yCoord, movingobjectposition.hitVec.zCoord);
                }
                for (final Entity entity : Trajectories.mc.theWorld.loadedEntityList) {
                    if (entity != Trajectories.mc.thePlayer && entity instanceof EntityLivingBase) {
                        final float f2 = 0.3f;
                        final AxisAlignedBB localAxisAlignedBB = entity.getEntityBoundingBox().expand(f2, f2, f2);
                        final MovingObjectPosition localMovingObjectPosition = localAxisAlignedBB.calculateIntercept(vec3, vec4);
                        if (localMovingObjectPosition != null) {
                            movingobjectposition = localMovingObjectPosition;
                            break;
                        }
                        continue;
                    }
                }
                if (movingobjectposition != null) {
                    b = false;
                }
                m = movingobjectposition;
                posX += motionX;
                posY += motionY;
                posZ += motionZ;
                final float f3 = MathHelper.sqrt_double(motionX * motionX + motionZ * motionZ);
                rotationYaw = (float)(MathHelper.func_181159_b(motionX, motionZ) * 180.0 / 3.141592653589793);
                for (rotationPitch = (float)(MathHelper.func_181159_b(motionY, f3) * 180.0 / 3.141592653589793); rotationPitch - prevRotationPitch < -180.0f; prevRotationPitch -= 360.0f) {}
                while (rotationPitch - prevRotationPitch >= 180.0f) {
                    prevRotationPitch += 360.0f;
                }
                while (rotationYaw - prevRotationYaw < -180.0f) {
                    prevRotationYaw -= 360.0f;
                }
                while (rotationYaw - prevRotationYaw >= 180.0f) {
                    prevRotationYaw += 360.0f;
                }
                final float f4 = 0.99f;
                float f5 = 0.03f;
                if (itemStack.getItem() instanceof ItemBow) {
                    f5 = 0.05f;
                }
                motionX *= f4;
                motionY *= f4;
                motionZ *= f4;
                motionY -= f5;
                this.positions.add(new Vec3(posX, posY, posZ));
            }
            if (this.positions.size() > 1) {
                GL11.glEnable(3042);
                GL11.glBlendFunc(770, 771);
                GL11.glEnable(2848);
                GL11.glDisable(3553);
                GlStateManager.disableCull();
                GL11.glDepthMask(false);
                GL11.glColor4f(this.color.getColor().getRed() / 255.0f, this.color.getColor().getGreen() / 255.0f, this.color.getColor().getBlue() / 255.0f, 0.7f);
                GL11.glLineWidth((float)this.lineWidth.getValue() / 2.0f);
                final Tessellator tessellator = Tessellator.getInstance();
                final WorldRenderer worldrenderer = tessellator.getWorldRenderer();
                GlStateManager.tryBlendFuncSeparate(770, 771, 1, 0);
                worldrenderer.begin(3, DefaultVertexFormats.POSITION);
                for (final Vec3 vec5 : this.positions) {
                    worldrenderer.pos((float)vec5.xCoord - Trajectories.mc.getRenderManager().getRenderPosX(), (float)vec5.yCoord - Trajectories.mc.getRenderManager().getRenderPosY(), (float)vec5.zCoord - Trajectories.mc.getRenderManager().getRenderPosZ()).endVertex();
                }
                tessellator.draw();
                if (m != null) {
                    GL11.glColor4f(this.color.getColor().getRed() / 255.0f, this.color.getColor().getGreen() / 255.0f, this.color.getColor().getBlue() / 255.0f, 0.3f);
                    final Vec3 hitVec = m.hitVec;
                    final EnumFacing enumFacing1 = m.sideHit;
                    float minX = (float)(hitVec.xCoord - Trajectories.mc.getRenderManager().getRenderPosX());
                    float maxX = (float)(hitVec.xCoord - Trajectories.mc.getRenderManager().getRenderPosX());
                    float minY = (float)(hitVec.yCoord - Trajectories.mc.getRenderManager().getRenderPosY());
                    float maxY = (float)(hitVec.yCoord - Trajectories.mc.getRenderManager().getRenderPosY());
                    float minZ = (float)(hitVec.zCoord - Trajectories.mc.getRenderManager().getRenderPosZ());
                    float maxZ = (float)(hitVec.zCoord - Trajectories.mc.getRenderManager().getRenderPosZ());
                    if (enumFacing1 == EnumFacing.SOUTH) {
                        minX -= (float)0.4;
                        maxX += (float)0.4;
                        minY -= (float)0.4;
                        maxY += (float)0.4;
                        maxZ += (float)0.02;
                        minZ += (float)0.05;
                    }
                    else if (enumFacing1 == EnumFacing.NORTH) {
                        minX -= (float)0.4;
                        maxX += (float)0.4;
                        minY -= (float)0.4;
                        maxY += (float)0.4;
                        maxZ -= (float)0.02;
                        minZ -= (float)0.05;
                    }
                    else if (enumFacing1 == EnumFacing.EAST) {
                        maxX += (float)0.02;
                        minX += (float)0.05;
                        minY -= (float)0.4;
                        maxY += (float)0.4;
                        minZ -= (float)0.4;
                        maxZ += (float)0.4;
                    }
                    else if (enumFacing1 == EnumFacing.WEST) {
                        maxX -= (float)0.02;
                        minX -= (float)0.05;
                        minY -= (float)0.4;
                        maxY += (float)0.4;
                        minZ -= (float)0.4;
                        maxZ += (float)0.4;
                    }
                    else if (enumFacing1 == EnumFacing.UP) {
                        minX -= (float)0.4;
                        maxX += (float)0.4;
                        maxY += (float)0.02;
                        minY += (float)0.05;
                        minZ -= (float)0.4;
                        maxZ += (float)0.4;
                    }
                    else if (enumFacing1 == EnumFacing.DOWN) {
                        minX -= (float)0.4;
                        maxX += (float)0.4;
                        maxY -= (float)0.02;
                        minY -= (float)0.05;
                        minZ -= (float)0.4;
                        maxZ += (float)0.4;
                    }
                    worldrenderer.begin(7, DefaultVertexFormats.POSITION);
                    worldrenderer.pos(minX, minY, minZ).endVertex();
                    worldrenderer.pos(minX, minY, maxZ).endVertex();
                    worldrenderer.pos(minX, maxY, maxZ).endVertex();
                    worldrenderer.pos(minX, maxY, minZ).endVertex();
                    worldrenderer.pos(minX, minY, maxZ).endVertex();
                    worldrenderer.pos(maxX, minY, maxZ).endVertex();
                    worldrenderer.pos(maxX, maxY, maxZ).endVertex();
                    worldrenderer.pos(minX, maxY, maxZ).endVertex();
                    worldrenderer.pos(maxX, minY, maxZ).endVertex();
                    worldrenderer.pos(maxX, minY, minZ).endVertex();
                    worldrenderer.pos(maxX, maxY, minZ).endVertex();
                    worldrenderer.pos(maxX, maxY, maxZ).endVertex();
                    worldrenderer.pos(maxX, minY, minZ).endVertex();
                    worldrenderer.pos(minX, minY, minZ).endVertex();
                    worldrenderer.pos(minX, maxY, minZ).endVertex();
                    worldrenderer.pos(maxX, maxY, minZ).endVertex();
                    worldrenderer.pos(minX, minY, minZ).endVertex();
                    worldrenderer.pos(minX, minY, maxZ).endVertex();
                    worldrenderer.pos(maxX, minY, maxZ).endVertex();
                    worldrenderer.pos(maxX, minY, minZ).endVertex();
                    worldrenderer.pos(minX, maxY, minZ).endVertex();
                    worldrenderer.pos(minX, maxY, maxZ).endVertex();
                    worldrenderer.pos(maxX, maxY, maxZ).endVertex();
                    worldrenderer.pos(maxX, maxY, minZ).endVertex();
                    worldrenderer.endVertex();
                    tessellator.draw();
                    GL11.glLineWidth(2.0f);
                    worldrenderer.begin(3, DefaultVertexFormats.POSITION);
                    worldrenderer.pos(minX, minY, minZ).endVertex();
                    worldrenderer.pos(minX, minY, maxZ).endVertex();
                    worldrenderer.pos(minX, maxY, maxZ).endVertex();
                    worldrenderer.pos(minX, maxY, minZ).endVertex();
                    worldrenderer.pos(minX, minY, minZ).endVertex();
                    worldrenderer.pos(maxX, minY, minZ).endVertex();
                    worldrenderer.pos(maxX, maxY, minZ).endVertex();
                    worldrenderer.pos(maxX, maxY, maxZ).endVertex();
                    worldrenderer.pos(maxX, minY, maxZ).endVertex();
                    worldrenderer.pos(maxX, minY, minZ).endVertex();
                    worldrenderer.pos(maxX, minY, maxZ).endVertex();
                    worldrenderer.pos(minX, minY, maxZ).endVertex();
                    worldrenderer.pos(minX, maxY, maxZ).endVertex();
                    worldrenderer.pos(maxX, maxY, maxZ).endVertex();
                    worldrenderer.pos(maxX, maxY, minZ).endVertex();
                    worldrenderer.pos(minX, maxY, minZ).endVertex();
                    worldrenderer.endVertex();
                    tessellator.draw();
                }
                GL11.glLineWidth(1.0f);
                GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
                GL11.glDepthMask(true);
                GlStateManager.enableCull();
                GL11.glEnable(3553);
                GL11.glEnable(2929);
                GL11.glDisable(3042);
                GL11.glBlendFunc(770, 771);
                GL11.glDisable(2848);
            }
        }
    }
}
