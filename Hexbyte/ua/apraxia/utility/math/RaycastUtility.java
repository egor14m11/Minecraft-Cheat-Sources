package ua.apraxia.utility.math;

import java.util.List;

import com.google.common.base.Predicates;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.EntitySelectors;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.optifine.reflect.Reflector;
import ua.apraxia.vecmath.Vector2f;

public class RaycastUtility {
    private static Minecraft mc = Minecraft.getMinecraft();

    public static RayTraceResult getPointed(Vector2f rot, double dst, float scale, boolean walls) {
        Entity entity = mc.player;
        double d0 = dst;
        RayTraceResult objectMouseOver = rayTrace(d0, rot.x, rot.y, walls);
        Vec3d vec3d = entity.getPositionEyes(1);
        boolean flag = false;
        double d1 = d0;
        if (objectMouseOver != null) {
            d1 = objectMouseOver.hitVec.distanceTo(vec3d);
        }
        Vec3d vec3d1 = getLook(rot.x, rot.y);
        Vec3d vec3d2 = vec3d.add(vec3d1.x * d0, vec3d1.y * d0, vec3d1.z * d0);
        Entity pointedEntity = null;
        Vec3d vec3d3 = null;
        List<Entity> list = mc.world.getEntitiesInAABBexcluding(entity,
                entity.getEntityBoundingBox().addCoord(vec3d1.x * d0, vec3d1.y * d0, vec3d1.z * d0)
                        .expand(1.0D, 1.0D, 1.0D),
                Predicates.and(EntitySelectors.NOT_SPECTATING,
                        p_apply_1_ -> p_apply_1_ != null && p_apply_1_.canBeCollidedWith()));
        double d2 = d1;
        for (Entity entity1 : list) {
            if (entity1 != mc.player) {
                float widthPrev = entity1.width;
                float heightPrev = entity1.height;
                entity1.setSizeAdvanced(widthPrev / scale, heightPrev);
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
                entity1.setSizeAdvanced(widthPrev, heightPrev);
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
        Entity entity = mc.player;
        double d0 = dst;
        RayTraceResult objectMouseOver = rayTrace(d0, rot.x, rot.y, walls);
        Vec3d vec3d = entity.getPositionEyes(1);
        boolean flag = false;
        double d1 = d0;
        if (objectMouseOver != null) {
            d1 = objectMouseOver.hitVec.distanceTo(vec3d);
        }
        Vec3d vec3d1 = getLook(rot.x, rot.y);
        Vec3d vec3d2 = vec3d.add(vec3d1.x * d0, vec3d1.y * d0, vec3d1.z * d0);
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
                ? (objectMouseOver.entityHit instanceof Entity ? (Entity) objectMouseOver.entityHit : null)
                : null;
    }
    public static boolean isLookingAtEntity(float yaw, float pitch, float xExp, float yExp, float zExp, Entity entity, double range) {
        Vec3d src = mc.player.getPositionEyes(1.0F);
        Vec3d vectorForRotation = Entity.getVectorForRotation(pitch, yaw);
        Vec3d dest = src.add(vectorForRotation.x * range, vectorForRotation.y * range, vectorForRotation.z * range);
        RayTraceResult rayTraceResult = mc.world.rayTraceBlocks(src, dest, false, false, true);
        if (rayTraceResult == null) {
            return false;
        }
        return (entity.getEntityBoundingBox().expand(xExp, yExp, zExp).calculateIntercept(src, dest) != null);
    }

    public static EntityLivingBase getPointedEntity(Vector2f rot, double dst, float scale, boolean walls) {
        Entity entity = mc.player;
        double d0 = dst;
        RayTraceResult objectMouseOver = rayTrace(d0, rot.x, rot.y, walls);
        Vec3d vec3d = entity.getPositionEyes(1);
        boolean flag = false;
        double d1 = d0;
        if (objectMouseOver != null) {
            d1 = objectMouseOver.hitVec.distanceTo(vec3d);
        }
        Vec3d vec3d1 = getLook(rot.x, rot.y);
        Vec3d vec3d2 = vec3d.add(vec3d1.x * d0, vec3d1.y * d0, vec3d1.z * d0);
        Entity pointedEntity = null;
        Vec3d vec3d3 = null;
        List<Entity> list = mc.world.getEntitiesInAABBexcluding(entity,
                entity.getEntityBoundingBox().addCoord(vec3d1.x * d0, vec3d1.y * d0, vec3d1.z * d0)
                        .expand(1.0D, 1.0D, 1.0D),
                Predicates.and(EntitySelectors.NOT_SPECTATING,
                        p_apply_1_ -> p_apply_1_ != null && p_apply_1_.canBeCollidedWith()));
        double d2 = d1;
        for (Entity entity1 : list) {
            if (entity1 != mc.player) {
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
        Vec3d vec3d = mc.player.getPositionEyes(1);
        Vec3d vec3d1 = getLook(yaw, pitch);
        Vec3d vec3d2 = vec3d.add(vec3d1.x * blockReachDistance, vec3d1.y * blockReachDistance,
                vec3d1.z * blockReachDistance);
        return mc.world.rayTraceBlocks(vec3d, vec3d2, true, true, true);
    }

    static Vec3d getVectorForRotation(float pitch, float yaw) {
        float f = MathHelper.cos(-yaw * 0.017453292F - (float) Math.PI);
        float f1 = MathHelper.sin(-yaw * 0.017453292F - (float) Math.PI);
        float f2 = -MathHelper.cos(-pitch * 0.017453292F);
        float f3 = MathHelper.sin(-pitch * 0.017453292F);
        return new Vec3d((double) (f1 * f2), (double) f3, (double) (f * f2));
    }

    static Vec3d getLook(float yaw, float pitch) {
        return getVectorForRotation(pitch, yaw);
    }
}
