package org.moonware.client.feature.impl.combat.KillAuraUtilsi;

import com.google.common.base.Predicates;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.EntitySelectors;
import net.minecraft.util.math.*;
import optifine.Reflector;

import javax.vecmath.Vector2f;
import java.util.List;

public class RaycastHelper {
    private static Minecraft mc = Minecraft.getMinecraft();

    public static RayTraceResult getPointed(Vector2f rot, double dst, float scale, boolean walls) {
        Entity entity = Minecraft.player;
        double d0 = dst;
        RayTraceResult objectMouseOver = rayTrace(d0, rot.x, rot.y, walls);
        Vec3d vec3d = entity.getPositionEyes(1);
        boolean flag = false;
        double d1 = d0;
        if (objectMouseOver != null) {
            d1 = objectMouseOver.hitVec.distanceTo(vec3d);
        }
        Vec3d vec3d1 = getLook(rot.x, rot.y);
        Vec3d vec3d2 = vec3d.addVector(vec3d1.xCoord * d0, vec3d1.yCoord * d0, vec3d1.zCoord * d0);
        Entity pointedEntity = null;
        Vec3d vec3d3 = null;
        List<Entity> list = Minecraft.world.getEntitiesInAABBexcluding(entity,
                entity.getEntityBoundingBox().addCoord(vec3d1.xCoord * d0, vec3d1.yCoord * d0, vec3d1.zCoord * d0)
                        .expand(1.0D, 1.0D, 1.0D),
                Predicates.and(EntitySelectors.NOT_SPECTATING,
                        p_apply_1_ -> p_apply_1_ != null && p_apply_1_.canBeCollidedWith()));
        double d2 = d1;
        for (Entity entity1 : list) {
            if (entity1 != Minecraft.player) {
                float widthPrev = entity1.width;
                float heightPrev = entity1.height;
                //entity1.setEntityBoundingBox(widthPrev / scale, heightPrev);
                AxisAlignedBB axisalignedbb = entity1.getEntityBoundingBox()
                        .expandXyz(entity1.getCollisionBorderSize());
                RayTraceResult raytraceresult = axisalignedbb.calculateIntercept(vec3d, vec3d2);
                if (axisalignedbb.isVecInside(vec3d)) {
                    if (d2 >= 0.0D) {
                        pointedEntity = entity1;
                        vec3d3 = raytraceresult == null ? vec3d : raytraceresult.hitVec;
                        d2 = 0.0D;
                    }
                } else if (raytraceresult != null) {
                    double d3 = vec3d.distanceTo(raytraceresult.hitVec);

                    if (d3 < d2 || d2 == 0.0D) {
                        boolean flag1 = false;

                        if (Reflector.ForgeEntity_canRiderInteract.exists()) {
                            flag1 = Reflector.callBoolean(entity1, Reflector.ForgeEntity_canRiderInteract);
                        }

                        if (!flag1 && entity1.getLowestRidingEntity() == entity.getLowestRidingEntity()) {
                            if (d2 == 0.0D) {
                                pointedEntity = entity1;
                                vec3d3 = raytraceresult.hitVec;
                            }
                        } else {
                            pointedEntity = entity1;
                            vec3d3 = raytraceresult.hitVec;
                            d2 = d3;
                        }
                    }
                }
                //entity1.setSizeAdvanced(widthPrev, heightPrev);
            }
        }
        if (pointedEntity != null && flag && vec3d.distanceTo(vec3d3) > dst) {
            pointedEntity = null;
            objectMouseOver = new RayTraceResult(RayTraceResult.Type.MISS, vec3d3, null, new BlockPos(vec3d3));
        }
        if (pointedEntity != null && (d2 < d1 || objectMouseOver == null)) {
            objectMouseOver = new RayTraceResult(pointedEntity, vec3d3);
        }
        return objectMouseOver;
    }

    public static Entity getPointedEntity(Vector2f rot, double dst, float scale, boolean walls, Entity target) {
        Entity entity = Minecraft.player;
        double d0 = dst;
        RayTraceResult objectMouseOver = rayTrace(d0, rot.x, rot.y, walls);
        Vec3d vec3d = entity.getPositionEyes(1);
        boolean flag = false;
        double d1 = d0;
        if (objectMouseOver != null) {
            d1 = objectMouseOver.hitVec.distanceTo(vec3d);
        }
        Vec3d vec3d1 = getLook(rot.x, rot.y);
        Vec3d vec3d2 = vec3d.addVector(vec3d1.xCoord * d0, vec3d1.yCoord * d0, vec3d1.zCoord * d0);
        Entity pointedEntity = null;
        Vec3d vec3d3 = null;
        double d2 = d1;
        Entity entity1 = target;
        float widthPrev = entity1.width;
        float heightPrev = entity1.height;
        AxisAlignedBB axisalignedbb = entity1.getEntityBoundingBox().expandXyz(entity1.getCollisionBorderSize());
        RayTraceResult raytraceresult = axisalignedbb.calculateIntercept(vec3d, vec3d2);
        if (axisalignedbb.isVecInside(vec3d)) {
            if (d2 >= 0.0D) {
                pointedEntity = entity1;
                vec3d3 = raytraceresult == null ? vec3d : raytraceresult.hitVec;
                d2 = 0.0D;
            }
        } else if (raytraceresult != null) {
            double d3 = vec3d.distanceTo(raytraceresult.hitVec);

            if (d3 < d2 || d2 == 0.0D) {
                boolean flag1 = false;
                if (!flag1 && entity1.getLowestRidingEntity() == entity.getLowestRidingEntity()) {
                    if (d2 == 0.0D) {
                        pointedEntity = entity1;
                        vec3d3 = raytraceresult.hitVec;
                    }
                } else {
                    pointedEntity = entity1;
                    vec3d3 = raytraceresult.hitVec;
                    d2 = d3;
                }
            }
        }
        if (pointedEntity != null && flag && vec3d.distanceTo(vec3d3) > dst) {
            pointedEntity = null;
            objectMouseOver = new RayTraceResult(RayTraceResult.Type.MISS, vec3d3, null, new BlockPos(vec3d3));
        }
        if (pointedEntity != null && (d2 < d1 || objectMouseOver == null)) {
            objectMouseOver = new RayTraceResult(pointedEntity, vec3d3);
        }
        return objectMouseOver != null
                ? (objectMouseOver.entityHit instanceof Entity ? objectMouseOver.entityHit : null)
                : null;
    }

    public static EntityLivingBase getPointedEntity(Vector2f rot, double dst, float scale, boolean walls) {
        Entity entity = Minecraft.player;
        double d0 = dst;
        RayTraceResult objectMouseOver = rayTrace(d0, rot.x, rot.y, walls);
        Vec3d vec3d = entity.getPositionEyes(1);
        boolean flag = false;
        double d1 = d0;
        if (objectMouseOver != null) {
            d1 = objectMouseOver.hitVec.distanceTo(vec3d);
        }
        Vec3d vec3d1 = getLook(rot.x, rot.y);
        Vec3d vec3d2 = vec3d.addVector(vec3d1.xCoord * d0, vec3d1.yCoord * d0, vec3d1.zCoord * d0);
        Entity pointedEntity = null;
        Vec3d vec3d3 = null;
        List<Entity> list = Minecraft.world.getEntitiesInAABBexcluding(entity,
                entity.getEntityBoundingBox().addCoord(vec3d1.xCoord * d0, vec3d1.yCoord * d0, vec3d1.zCoord * d0)
                        .expand(1.0D, 1.0D, 1.0D),
                Predicates.and(EntitySelectors.NOT_SPECTATING,
                        p_apply_1_ -> p_apply_1_ != null && p_apply_1_.canBeCollidedWith()));
        double d2 = d1;
        for (Entity entity1 : list) {
            if (entity1 != Minecraft.player) {
                float widthPrev = entity1.width;
                float heightPrev = entity1.height;
                AxisAlignedBB axisalignedbb = entity1.getEntityBoundingBox()
                        .expandXyz(entity1.getCollisionBorderSize());
                RayTraceResult raytraceresult = axisalignedbb.calculateIntercept(vec3d, vec3d2);
                if (axisalignedbb.isVecInside(vec3d)) {
                    if (d2 >= 0.0D) {
                        pointedEntity = entity1;
                        vec3d3 = raytraceresult == null ? vec3d : raytraceresult.hitVec;
                        d2 = 0.0D;
                    }
                } else if (raytraceresult != null) {
                    double d3 = vec3d.distanceTo(raytraceresult.hitVec);

                    if (d3 < d2 || d2 == 0.0D) {
                        boolean flag1 = false;

                        if (Reflector.ForgeEntity_canRiderInteract.exists()) {
                            flag1 = Reflector.callBoolean(entity1, Reflector.ForgeEntity_canRiderInteract);
                        }

                        if (!flag1 && entity1.getLowestRidingEntity() == entity.getLowestRidingEntity()) {
                            if (d2 == 0.0D) {
                                pointedEntity = entity1;
                                vec3d3 = raytraceresult.hitVec;
                            }
                        } else {
                            pointedEntity = entity1;
                            vec3d3 = raytraceresult.hitVec;
                            d2 = d3;
                        }
                    }
                }
            }
        }
        if (pointedEntity != null && flag && vec3d.distanceTo(vec3d3) > dst) {
            pointedEntity = null;
            objectMouseOver = new RayTraceResult(RayTraceResult.Type.MISS, vec3d3, null, new BlockPos(vec3d3));
        }
        if (pointedEntity != null && (d2 < d1 || objectMouseOver == null)) {
            objectMouseOver = new RayTraceResult(pointedEntity, vec3d3);
        }
        return objectMouseOver != null
                ? (objectMouseOver.entityHit instanceof EntityLivingBase ? (EntityLivingBase) objectMouseOver.entityHit
                : null)
                : null;
    }

    public static RayTraceResult rayTrace(double blockReachDistance, float yaw, float pitch, boolean walls) {
        if (!walls) {
            return null;
        }
        Vec3d vec3d = Minecraft.player.getPositionEyes(1);
        Vec3d vec3d1 = getLook(yaw, pitch);
        Vec3d vec3d2 = vec3d.addVector(vec3d1.xCoord * blockReachDistance, vec3d1.yCoord * blockReachDistance,
                vec3d1.zCoord * blockReachDistance);
        return Minecraft.world.rayTraceBlocks(vec3d, vec3d2, true, true, true);
    }

    static Vec3d getVectorForRotation(float pitch, float yaw) {
        float f = MathHelper.cos(-yaw * 0.017453292F - (float) Math.PI);
        float f1 = MathHelper.sin(-yaw * 0.017453292F - (float) Math.PI);
        float f2 = -MathHelper.cos(-pitch * 0.017453292F);
        float f3 = MathHelper.sin(-pitch * 0.017453292F);
        return new Vec3d(f1 * f2, f3, f * f2);
    }

    static Vec3d getLook(float yaw, float pitch) {
        return getVectorForRotation(pitch, yaw);
    }
}
