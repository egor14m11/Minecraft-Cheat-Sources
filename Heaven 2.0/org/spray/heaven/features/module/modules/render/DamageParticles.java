package org.spray.heaven.features.module.modules.render;

import java.awt.*;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import com.darkmagician6.eventapi.EventTarget;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;
import org.spray.heaven.events.EventPreMotion;
import org.spray.heaven.events.MotionEvent;
import org.spray.heaven.events.WorldRenderEvent;
import org.spray.heaven.features.module.Category;
import org.spray.heaven.features.module.Module;
import org.spray.heaven.features.module.ModuleInfo;
import org.spray.heaven.util.MathUtil;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import org.spray.heaven.util.render.RenderUtil;
import org.spray.heaven.util.render.WorldRender;

@ModuleInfo(name = "DamageParticles", category = Category.RENDER, visible = true, key = Keyboard.KEY_NONE)
public class DamageParticles extends Module {
	ArrayList<partical> particals = new ArrayList<>();


	@EventTarget
	public void onUpdate(MotionEvent event) {
		if (mc.world != null && mc.world != null) {
			for (Entity entity : mc.world.loadedEntityList) {
				EntityLivingBase player = (EntityLivingBase) entity;
				final String name = player.getName();
				if (player.hurtTime > 0) {
					particals.add(new partical(player.posX + MathUtil.random(-0.05f, 0.05f), MathUtil.random((float) (player.posY + player.height), (float) player.posY), player.posZ + MathUtil.random(-0.05f, 0.05f)));
					particals.add(new partical(player.posX, MathUtil.random((float) (player.posY + player.height), (float) (player.posY + 0.1f)), player.posZ));
					particals.add(new partical(player.posX, MathUtil.random((float) (player.posY + player.height), (float) (player.posY + 0.1f)), player.posZ));
				}

				for (int i = 0; i < particals.size(); i++) {
					if (System.currentTimeMillis() - particals.get(i).getTime() >= 10000) {
						particals.remove(i);
					}
				}
			}
		}
	}

	@EventTarget
	public void render(WorldRenderEvent event) {

		if (mc.player != null && mc.world != null) {
			for (partical partical : particals) {
				float step = (System.currentTimeMillis() - partical.time) / 10;

				partical.render(new Color(99, 50, 255, (int) Math.round(partical.alpha)).getRGB());
			}
		}
	}

	public class partical {
		double x;
		double y;
		double z;
		double motionX;
		double motionY;
		double motionZ;
		long time;
		public int alpha = 180;

		public partical(double x, double y, double z) {
			this.x = x;
			this.y = y;
			this.z = z;
			motionX = MathUtil.random(-0.02f, 0.02f);
			motionY = MathUtil.random(-0.02f, 0.02f);
			motionZ = MathUtil.random(-0.02f, 0.02f);
			time = System.currentTimeMillis();
		}


		public long getTime() {
			return time;
		}

		public void update() {
			double yEx = 0;

			double sp = Math.sqrt(motionX * motionX + motionZ * motionZ) * 1;
			x += motionX;

			y += motionY;

			if (posBlock(x, y, z)) {
				motionY = -motionY / 1.1;
			} else {
				if (
						posBlock(x, y, z) ||
								posBlock(x, y - yEx, z) ||
								posBlock(x, y + yEx, z) ||

								posBlock(x - sp, y, z - sp) ||
								posBlock(x + sp, y, z + sp) ||
								posBlock(x + sp, y, z - sp) ||
								posBlock(x - sp, y, z + sp) ||
								posBlock(x + sp, y, z) ||
								posBlock(x - sp, y, z) ||
								posBlock(x, y, z + sp) ||
								posBlock(x, y, z - sp) ||

								posBlock(x - sp, y - yEx, z - sp) ||
								posBlock(x + sp, y - yEx, z + sp) ||
								posBlock(x + sp, y - yEx, z - sp) ||
								posBlock(x - sp, y - yEx, z + sp) ||
								posBlock(x + sp, y - yEx, z) ||
								posBlock(x - sp, y - yEx, z) ||
								posBlock(x, y - yEx, z + sp) ||
								posBlock(x, y - yEx, z - sp) ||

								posBlock(x - sp, y + yEx, z - sp) ||
								posBlock(x + sp, y + yEx, z + sp) ||
								posBlock(x + sp, y + yEx, z - sp) ||
								posBlock(x - sp, y + yEx, z + sp) ||
								posBlock(x + sp, y + yEx, z) ||
								posBlock(x - sp, y + yEx, z) ||
								posBlock(x, y + yEx, z + sp) ||
								posBlock(x, y + yEx, z - sp)

				) {
					motionX = -motionX + motionZ;
					motionZ = -motionZ + motionX;
				}


			}

			z += motionZ;


			motionX /= 1.005;
			motionZ /= 1.005;
			motionY /= 1.005;
		}

		public void render(int color) {
			update();
			alpha-=0.1;
			float scale = 0.07f;
			GlStateManager.disableDepth();
			GL11.glEnable(GL11.GL_BLEND);
			GL11.glDisable(GL11.GL_TEXTURE_2D);
			GL11.glEnable(GL11.GL_LINE_SMOOTH);
			GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);

			try {

				final double posX = x - (mc.getRenderManager()).getRenderPosX();
				final double posY = y - (mc.getRenderManager()).getRenderPosY();
				final double posZ = z - (mc.getRenderManager()).getRenderPosZ();

				final double distanceFromPlayer = mc.player.getDistance(x, y - 1, z);
				int quality = (int) (distanceFromPlayer * 4 + 10);

				if (quality > 350)
					quality = 350;

				GL11.glPushMatrix();
				GL11.glTranslated(posX, posY, posZ);


				GL11.glScalef(-scale, -scale, -scale);

				GL11.glRotated(-(mc.getRenderManager()).playerViewY, 0.0D, 1.0D, 0.0D);
				GL11.glRotated((mc.getRenderManager()).playerViewX, 1.0D, 0.0D, 0.0D);

				final Color c = new Color(color);

				RenderUtil.drawFilledCircleNoGL(0, 0, 0.7, c.hashCode(), quality);

				if (distanceFromPlayer < 4)
					RenderUtil.drawFilledCircleNoGL(0, 0, 1.4, new Color(c.getRed(), c.getGreen(), c.getBlue(), 50).hashCode(), quality);

				if (distanceFromPlayer < 20)
					RenderUtil.drawFilledCircleNoGL(0, 0, 2.3, new Color(c.getRed(), c.getGreen(), c.getBlue(), 30).hashCode(), quality);


				GL11.glScalef(0.8f, 0.8f, 0.8f);

				GL11.glPopMatrix();


			} catch (final ConcurrentModificationException ignored) {
			}

			GL11.glDisable(GL11.GL_LINE_SMOOTH);
			GL11.glEnable(GL11.GL_TEXTURE_2D);
			GL11.glDisable(GL11.GL_BLEND);
			GlStateManager.enableDepth();

			GL11.glColor3d(255, 255, 255);
		}

		private boolean posBlock(double x, double y, double z) {
			return (mc.world.getBlockState(new BlockPos(x, y, z)).getBlock() != Blocks.AIR &&
					mc.world.getBlockState(new BlockPos(x, y, z)).getBlock() != Blocks.WATER &&
					mc.world.getBlockState(new BlockPos(x, y, z)).getBlock() != Blocks.LAVA &&
					mc.world.getBlockState(new BlockPos(x, y, z)).getBlock() != Blocks.BED &&
					mc.world.getBlockState(new BlockPos(x, y, z)).getBlock() != Blocks.CAKE &&
					mc.world.getBlockState(new BlockPos(x, y, z)).getBlock() != Blocks.TALLGRASS &&
					mc.world.getBlockState(new BlockPos(x, y, z)).getBlock() != Blocks.GRASS &&
					mc.world.getBlockState(new BlockPos(x, y, z)).getBlock() != Blocks.FLOWER_POT &&
					mc.world.getBlockState(new BlockPos(x, y, z)).getBlock() != Blocks.RED_FLOWER &&
					mc.world.getBlockState(new BlockPos(x, y, z)).getBlock() != Blocks.YELLOW_FLOWER &&
					mc.world.getBlockState(new BlockPos(x, y, z)).getBlock() != Blocks.SAPLING &&
					mc.world.getBlockState(new BlockPos(x, y, z)).getBlock() != Blocks.VINE &&
					mc.world.getBlockState(new BlockPos(x, y, z)).getBlock() != Blocks.ACACIA_FENCE &&
					mc.world.getBlockState(new BlockPos(x, y, z)).getBlock() != Blocks.ACACIA_FENCE_GATE &&
					mc.world.getBlockState(new BlockPos(x, y, z)).getBlock() != Blocks.BIRCH_FENCE &&
					mc.world.getBlockState(new BlockPos(x, y, z)).getBlock() != Blocks.BIRCH_FENCE_GATE &&
					mc.world.getBlockState(new BlockPos(x, y, z)).getBlock() != Blocks.DARK_OAK_FENCE &&
					mc.world.getBlockState(new BlockPos(x, y, z)).getBlock() != Blocks.DARK_OAK_FENCE_GATE &&
					mc.world.getBlockState(new BlockPos(x, y, z)).getBlock() != Blocks.JUNGLE_FENCE &&
					mc.world.getBlockState(new BlockPos(x, y, z)).getBlock() != Blocks.JUNGLE_FENCE_GATE &&
					mc.world.getBlockState(new BlockPos(x, y, z)).getBlock() != Blocks.NETHER_BRICK_FENCE &&
					mc.world.getBlockState(new BlockPos(x, y, z)).getBlock() != Blocks.OAK_FENCE &&
					mc.world.getBlockState(new BlockPos(x, y, z)).getBlock() != Blocks.OAK_FENCE_GATE &&
					mc.world.getBlockState(new BlockPos(x, y, z)).getBlock() != Blocks.SPRUCE_FENCE &&
					mc.world.getBlockState(new BlockPos(x, y, z)).getBlock() != Blocks.SPRUCE_FENCE_GATE &&
					mc.world.getBlockState(new BlockPos(x, y, z)).getBlock() != Blocks.ENCHANTING_TABLE &&
					mc.world.getBlockState(new BlockPos(x, y, z)).getBlock() != Blocks.END_PORTAL_FRAME &&
					mc.world.getBlockState(new BlockPos(x, y, z)).getBlock() != Blocks.DOUBLE_PLANT &&
					mc.world.getBlockState(new BlockPos(x, y, z)).getBlock() != Blocks.STANDING_SIGN &&
					mc.world.getBlockState(new BlockPos(x, y, z)).getBlock() != Blocks.WALL_SIGN &&
					mc.world.getBlockState(new BlockPos(x, y, z)).getBlock() != Blocks.SKULL &&
					mc.world.getBlockState(new BlockPos(x, y, z)).getBlock() != Blocks.DAYLIGHT_DETECTOR &&
					mc.world.getBlockState(new BlockPos(x, y, z)).getBlock() != Blocks.DAYLIGHT_DETECTOR_INVERTED &&
					mc.world.getBlockState(new BlockPos(x, y, z)).getBlock() != Blocks.STONE_SLAB &&
					mc.world.getBlockState(new BlockPos(x, y, z)).getBlock() != Blocks.WOODEN_SLAB &&
					mc.world.getBlockState(new BlockPos(x, y, z)).getBlock() != Blocks.CARPET &&
					mc.world.getBlockState(new BlockPos(x, y, z)).getBlock() != Blocks.DEADBUSH &&
					mc.world.getBlockState(new BlockPos(x, y, z)).getBlock() != Blocks.VINE &&
					mc.world.getBlockState(new BlockPos(x, y, z)).getBlock() != Blocks.REDSTONE_WIRE &&
					mc.world.getBlockState(new BlockPos(x, y, z)).getBlock() != Blocks.REEDS &&
					mc.world.getBlockState(new BlockPos(x, y, z)).getBlock() != Blocks.SNOW_LAYER);
		}

	}
}