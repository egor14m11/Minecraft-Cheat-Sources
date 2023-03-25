package ru.wendoxd.events.impl.render;

import net.minecraft.client.renderer.chunk.RenderChunk;
import net.minecraft.util.math.BlockPos;
import ru.wendoxd.events.Event;

public class EventRenderChunk extends Event {

    public BlockPos blockPos;
    public RenderChunk renderChunk;

    public EventRenderChunk(RenderChunk renderChunk, BlockPos blockPos) {
        this.blockPos = blockPos;
        this.renderChunk = renderChunk;
    }

    public BlockPos getBlockPos() {
        return blockPos;
    }

    public void setBlockPos(BlockPos blockPos) {
        this.blockPos = blockPos;
    }

    public RenderChunk getRenderChunk() {
        return renderChunk;
    }

    public void setRenderChunk(RenderChunk renderChunk) {
        this.renderChunk = renderChunk;
    }
}