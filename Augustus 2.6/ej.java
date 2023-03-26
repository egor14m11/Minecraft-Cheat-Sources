import io.netty.channel.ChannelHandlerContext;
import java.util.zip.Deflater;
import io.netty.buffer.ByteBuf;
import io.netty.handler.codec.MessageToByteEncoder;

// 
// Decompiled by Procyon v0.5.36
// 

public class ej extends MessageToByteEncoder<ByteBuf>
{
    private final byte[] a;
    private final Deflater b;
    private int c;
    
    public ej(final int \u2603) {
        this.a = new byte[8192];
        this.c = \u2603;
        this.b = new Deflater();
    }
    
    protected void a(final ChannelHandlerContext \u2603, final ByteBuf \u2603, final ByteBuf \u2603) throws Exception {
        final int readableBytes = \u2603.readableBytes();
        final em em = new em(\u2603);
        if (readableBytes < this.c) {
            em.b(0);
            em.writeBytes(\u2603);
        }
        else {
            final byte[] input = new byte[readableBytes];
            \u2603.readBytes(input);
            em.b(input.length);
            this.b.setInput(input, 0, readableBytes);
            this.b.finish();
            while (!this.b.finished()) {
                final int deflate = this.b.deflate(this.a);
                em.writeBytes(this.a, 0, deflate);
            }
            this.b.reset();
        }
    }
    
    public void a(final int \u2603) {
        this.c = \u2603;
    }
}
