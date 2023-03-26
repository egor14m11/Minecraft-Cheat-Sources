import io.netty.handler.codec.CorruptedFrameException;
import io.netty.buffer.Unpooled;
import java.util.List;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;

// 
// Decompiled by Procyon v0.5.36
// 

public class eq extends ByteToMessageDecoder
{
    @Override
    protected void decode(final ChannelHandlerContext \u2603, final ByteBuf \u2603, final List<Object> \u2603) throws Exception {
        \u2603.markReaderIndex();
        final byte[] array = new byte[3];
        for (int i = 0; i < array.length; ++i) {
            if (!\u2603.isReadable()) {
                \u2603.resetReaderIndex();
                return;
            }
            array[i] = \u2603.readByte();
            if (array[i] >= 0) {
                final em em = new em(Unpooled.wrappedBuffer(array));
                try {
                    final int e = em.e();
                    if (\u2603.readableBytes() < e) {
                        \u2603.resetReaderIndex();
                        return;
                    }
                    \u2603.add(\u2603.readBytes(e));
                    return;
                }
                finally {
                    em.release();
                }
            }
        }
        throw new CorruptedFrameException("length wider than 21-bit");
    }
}
