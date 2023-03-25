package net.minecraft.item;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.Namespaced;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class ItemClock extends Item
{
    public ItemClock()
    {
        addPropertyOverride(new Namespaced("time"), new IItemPropertyGetter()
        {
            double rotation;
            double rota;
            long lastUpdateTick;
            public float apply(ItemStack stack, @Nullable World worldIn, @Nullable EntityLivingBase entityIn)
            {
                boolean flag = entityIn != null;
                Entity entity = flag ? entityIn : stack.getItemFrame();

                if (worldIn == null && entity != null)
                {
                    worldIn = entity.world;
                }

                if (worldIn == null)
                {
                    return 0.0F;
                }
                else
                {
                    double d0;

                    if (worldIn.provider.isSurfaceWorld())
                    {
                        d0 = worldIn.getCelestialAngle(1.0F);
                    }
                    else
                    {
                        d0 = Math.random();
                    }

                    d0 = wobble(worldIn, d0);
                    return (float)d0;
                }
            }
            private double wobble(World p_185087_1_, double p_185087_2_)
            {
                if (p_185087_1_.getTotalWorldTime() != lastUpdateTick)
                {
                    lastUpdateTick = p_185087_1_.getTotalWorldTime();
                    double d0 = p_185087_2_ - rotation;
                    d0 = MathHelper.func_191273_b(d0 + 0.5D, 1.0D) - 0.5D;
                    rota += d0 * 0.1D;
                    rota *= 0.9D;
                    rotation = MathHelper.func_191273_b(rotation + rota, 1.0D);
                }

                return rotation;
            }
        });
    }
}
