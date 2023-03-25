package ru.wendoxd.modules.impl.combat;

import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Set;

import com.google.common.collect.Sets;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.enchantment.EnchantmentProtection;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import ru.wendoxd.modules.Module;

public class CrystalAura extends Module {

	public static class ExplosionBuilder {
		private final boolean isFlaming;
		private final boolean isSmoking;
		private final Random explosionRNG;
		private final World worldObj;
		private final double explosionX;
		private final double explosionY;
		private final double explosionZ;
		private final Entity exploder;
		private final float explosionSize;
		public HashMap<EntityPlayer, Float> damageMap = new HashMap();

		public ExplosionBuilder(World worldIn, Entity entityIn, double x, double y, double z, float size,
				List<BlockPos> affectedPositions) {
			this(worldIn, entityIn, x, y, z, size, false, true, affectedPositions);
		}

		public ExplosionBuilder(World worldIn, Entity entityIn, double x, double y, double z, float size,
				boolean flaming, boolean smoking, List<BlockPos> affectedPositions) {
			this(worldIn, entityIn, x, y, z, size, flaming, smoking);
		}

		public ExplosionBuilder(World worldIn, Entity entityIn, double x, double y, double z, float size,
				boolean flaming, boolean smoking) {
			this.explosionRNG = new Random();
			this.worldObj = worldIn;
			this.exploder = entityIn;
			this.explosionSize = size;
			this.explosionX = x;
			this.explosionY = y;
			this.explosionZ = z;
			this.isFlaming = flaming;
			this.isSmoking = smoking;
			this.doExplosionA();
		}

		public Float getExplosionDamage(EntityPlayer player) {
			return damageMap.get(player);
		}

		public void doExplosionA() {
			Set<BlockPos> set = Sets.<BlockPos>newHashSet();
			int i = 16;

			for (int j = 0; j < 16; ++j) {
				for (int k = 0; k < 16; ++k) {
					for (int l = 0; l < 16; ++l) {
						if (j == 0 || j == 15 || k == 0 || k == 15 || l == 0 || l == 15) {
							double d0 = (double) ((float) j / 15.0F * 2.0F - 1.0F);
							double d1 = (double) ((float) k / 15.0F * 2.0F - 1.0F);
							double d2 = (double) ((float) l / 15.0F * 2.0F - 1.0F);
							double d3 = Math.sqrt(d0 * d0 + d1 * d1 + d2 * d2);
							d0 = d0 / d3;
							d1 = d1 / d3;
							d2 = d2 / d3;
							float f = this.explosionSize * (0.7F + this.worldObj.rand.nextFloat() * 0.6F);
							double d4 = this.explosionX;
							double d6 = this.explosionY;
							double d8 = this.explosionZ;

							for (float f1 = 0.3F; f > 0.0F; f -= 0.22500001F) {
								BlockPos blockpos = new BlockPos(d4, d6, d8);
								IBlockState iblockstate = this.worldObj.getBlockState(blockpos);

								if (iblockstate.getMaterial() != Material.AIR) {
									float f2 = iblockstate.getBlock().getExplosionResistance((Entity) null);
									f -= (f2 + 0.3F) * 0.3F;
								}

								if (f > 0.0F && (this.exploder == null)) {
									set.add(blockpos);
								}

								d4 += d0 * 0.30000001192092896D;
								d6 += d1 * 0.30000001192092896D;
								d8 += d2 * 0.30000001192092896D;
							}
						}
					}
				}
			}
			float f3 = this.explosionSize * 2.0F;
			int k1 = MathHelper.floor(this.explosionX - (double) f3 - 1.0D);
			int l1 = MathHelper.floor(this.explosionX + (double) f3 + 1.0D);
			int i2 = MathHelper.floor(this.explosionY - (double) f3 - 1.0D);
			int i1 = MathHelper.floor(this.explosionY + (double) f3 + 1.0D);
			int j2 = MathHelper.floor(this.explosionZ - (double) f3 - 1.0D);
			int j1 = MathHelper.floor(this.explosionZ + (double) f3 + 1.0D);
			List<Entity> list = this.worldObj.getEntitiesWithinAABBExcludingEntity(this.exploder,
					new AxisAlignedBB((double) k1, (double) i2, (double) j2, (double) l1, (double) i1, (double) j1));
			Vec3d vec3d = new Vec3d(this.explosionX, this.explosionY, this.explosionZ);

			for (int k2 = 0; k2 < list.size(); ++k2) {
				Entity entity = list.get(k2);

				if (!entity.isImmuneToExplosions()) {
					double d12 = entity.getDistance(this.explosionX, this.explosionY, this.explosionZ) / (double) f3;

					if (d12 <= 1.0D) {
						double d5 = entity.posX - this.explosionX;
						double d7 = entity.posY + (double) entity.getEyeHeight() - this.explosionY;
						double d9 = entity.posZ - this.explosionZ;
						double d13 = (double) MathHelper.sqrt(d5 * d5 + d7 * d7 + d9 * d9);

						if (d13 != 0.0D) {
							d5 = d5 / d13;
							d7 = d7 / d13;
							d9 = d9 / d13;
							double d14 = (double) this.worldObj.getBlockDensity(vec3d, entity.getEntityBoundingBox());
							double d10 = (1.0D - d12) * d14;
							if (entity instanceof EntityPlayer)
								this.damageMap.put((EntityPlayer) entity, Float.valueOf(
										(float) ((int) ((d10 * d10 + d10) / 2.0D * 7.0D * (double) f3 + 1.0D))));
							double d11 = d10;

							if (entity instanceof EntityLivingBase) {
								d11 = EnchantmentProtection.getBlastDamageReduction((EntityLivingBase) entity, d10);
							}
						}
					}
				}
			}
		}
	}

}
