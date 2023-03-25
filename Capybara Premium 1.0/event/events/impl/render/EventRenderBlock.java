package fun.rich.client.event.events.impl.render;

import fun.rich.client.event.events.Event;
import fun.rich.client.event.events.callables.EventCancellable;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

import java.awt.*;

public class EventRenderBlock implements Event {

    private final IBlockState state;
    private final BlockPos pos;
    private final IBlockAccess access;
    private final BufferBuilder bufferBuilder;

    public EventRenderBlock(IBlockState state, BlockPos pos, IBlockAccess access, BufferBuilder bufferBuilder) {
        this.state = state;
        this.pos = pos;
        this.access = access;
        this.bufferBuilder = bufferBuilder;
    }

    public IBlockState getState() {
        return state;
    }

    public BufferBuilder getBufferBuilder() {
        return bufferBuilder;
    }

    public BlockPos getPos() {
        return pos;
    }

    public IBlockAccess getAccess() {
        return access;
    }
}