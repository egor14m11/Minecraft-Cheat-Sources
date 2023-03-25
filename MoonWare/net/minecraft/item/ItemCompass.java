package net.minecraft.item;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItemFrame;
import net.minecraft.util.Namespaced;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class ItemCompass extends Item
{
    public ItemCompass()
    {
        addPropertyOverride(new Namespaced("angle"), new IItemPropertyGetter()
        {
            double rotation;
            double rota;
            long lastUpdateTick;
            public float apply(ItemStack stack, @Nullable World worldIn, @Nullable EntityLivingBase entityIn)
            {
                if (entityIn == null && !stack.isOnItemFrame())
                {
                    return 0.0F;
                }
                else
                {
                    boolean flag = entityIn != null;
                    Entity entity = flag ? entityIn : stack.getItemFrame();

                    if (worldIn == null)
                    {
                        worldIn = entity.world;
                    }

                    double d0;

                    if (worldIn.provider.isSurfaceWorld())
                    {
                        double d1 = flag ? (double)entity.rotationYaw : getFrameRotation((EntityItemFrame)entity);
                        d1 = MathHelper.func_191273_b(d1 / 360.0D, 1.0D);
                        double d2 = getSpawnToAngle(worldIn, entity) / (Math.PI * 2D);
                        d0 = 0.5D - (d1 - 0.25D - d2);
                    }
                    else
                    {
                        d0 = Math.random();
                    }

                    if (flag)
                    {
                        d0 = wobble(worldIn, d0);
                    }

                    return MathHelper.positiveModulo((float)d0, 1.0F);
                }
            }
            private double wobble(World worldIn, double p_185093_2_)
            {
                if (worldIn.getTotalWorldTime() != lastUpdateTick)
                {
                    lastUpdateTick = worldIn.getTotalWorldTime();
                    double d0 = p_185093_2_ - rotation;
                    d0 = MathHelper.func_191273_b(d0 + 0.5D, 1.0D) - 0.5D;
                    rota += d0 * 0.1D;
                    rota *= 0.8D;
                    rotation = MathHelper.func_191273_b(rotation + rota, 1.0D);
                }

                return rotation;
            }
            private double getFrameRotation(EntityItemFrame p_185094_1_)
            {
                return MathHelper.clampAngle(180 + p_185094_1_.facingDirection.getHorizontalIndex() * 90);
            }
            private double getSpawnToAngle(World p_185092_1_, Entity p_185092_2_)
            {
                BlockPos blockpos = p_185092_1_.getSpawnPoint();
                return Math.atan2((double)blockpos.getZ() - p_185092_2_.posZ, (double)blockpos.getX() - p_185092_2_.posX);
            }
        });
    }
}
