import io.netty.buffer.Unpooled;
import io.netty.handler.codec.DecoderException;
import java.util.List;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import java.util.zip.Inflater;
import io.netty.handler.codec.ByteToMessageDecoder;

// 
// Decompiled by Procyon v0.5.36
// 

public class ei extends ByteToMessageDecoder
{
    private final Inflater a;
    private int b;
    
    public ei(final int \u2603) {
        this.b = \u2603;
        this.a = new Inflater();
    }
    
    @Override
    protected void decode(final ChannelHandlerContext \u2603, final ByteBuf \u2603, final List<Object> \u2603) throws Exception {
        if (\u2603.readableBytes() == 0) {
            return;
        }
        final em em = new em(\u2603);
        final int e = em.e();
        if (e == 0) {
            \u2603.add(em.readBytes(em.readableBytes()));
        }
        else {
            if (e < this.b) {
                throw new DecoderException("Badly compressed packet - size of " + e + " is below server threshold of " + this.b);
            }
            if (e > 2097152) {
                throw new DecoderException("Badly compressed packet - size of " + e + " is larger than protocol maximum of " + 2097152);
            }
            final byte[] array = new byte[em.readableBytes()];
            em.readBytes(array);
            this.a.setInput(array);
            final byte[] array2 = new byte[e];
            this.a.inflate(array2);
            \u2603.add(Unpooled.wrappedBuffer(array2));
            this.a.reset();
        }
    }
    
    public void a(final int \u2603) {
        this.b = \u2603;
    }
}
