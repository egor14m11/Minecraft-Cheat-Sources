import io.netty.channel.ChannelHandlerContext;
import io.netty.buffer.ByteBuf;
import io.netty.handler.codec.MessageToByteEncoder;

// 
// Decompiled by Procyon v0.5.36
// 

public class er extends MessageToByteEncoder<ByteBuf>
{
    protected void a(final ChannelHandlerContext \u2603, final ByteBuf \u2603, final ByteBuf \u2603) throws Exception {
        final int readableBytes = \u2603.readableBytes();
        final int a = em.a(readableBytes);
        if (a > 3) {
            throw new IllegalArgumentException("unable to fit " + readableBytes + " into " + 3);
        }
        final em em = new em(\u2603);
        em.ensureWritable(a + readableBytes);
        em.b(readableBytes);
        em.writeBytes(\u2603, \u2603.readerIndex(), readableBytes);
    }
}
