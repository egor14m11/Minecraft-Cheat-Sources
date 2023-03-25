package org.spray.infinity.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spray.infinity.features.module.visual.XRay;
import org.spray.infinity.main.Infinity;

import net.minecraft.block.BlockState;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.block.BlockModelRenderer;
import net.minecraft.client.render.model.BakedQuad;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockRenderView;

@Mixin(BlockModelRenderer.class)
public class BlockModelRendererMixin {

	@Inject(method = "renderQuad", at = @At("HEAD"), cancellable = true)
	private void renderQuad(BlockRenderView world, BlockState state, BlockPos pos, VertexConsumer vertexConsumer,
			MatrixStack.Entry matrixEntry, BakedQuad quad, float brightness0, float brightness1, float brightness2,
			float brightness3, int light0, int light1, int light2, int light3, int overlay, CallbackInfo ci) {
		XRay xray = ((XRay) Infinity.getModuleManager().get(XRay.class));
		if (!xray.isValid(state.getBlock()) && xray.isNoRender()) {
			ci.cancel();
		}
	}

}
