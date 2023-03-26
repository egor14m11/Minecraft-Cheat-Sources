import javax.crypto.ShortBufferException;
import io.netty.channel.ChannelHandlerContext;
import io.netty.buffer.ByteBuf;
import javax.crypto.Cipher;

// 
// Decompiled by Procyon v0.5.36
// 

public class ef
{
    private final Cipher a;
    private byte[] b;
    private byte[] c;
    
    protected ef(final Cipher \u2603) {
        this.b = new byte[0];
        this.c = new byte[0];
        this.a = \u2603;
    }
    
    private byte[] a(final ByteBuf \u2603) {
        final int readableBytes = \u2603.readableBytes();
        if (this.b.length < readableBytes) {
            this.b = new byte[readableBytes];
        }
        \u2603.readBytes(this.b, 0, readableBytes);
        return this.b;
    }
    
    protected ByteBuf a(final ChannelHandlerContext \u2603, final ByteBuf \u2603) throws ShortBufferException {
        final int readableBytes = \u2603.readableBytes();
        final byte[] a = this.a(\u2603);
        final ByteBuf heapBuffer = \u2603.alloc().heapBuffer(this.a.getOutputSize(readableBytes));
        heapBuffer.writerIndex(this.a.update(a, 0, readableBytes, heapBuffer.array(), heapBuffer.arrayOffset()));
        return heapBuffer;
    }
    
    protected void a(final ByteBuf \u2603, final ByteBuf \u2603) throws ShortBufferException {
        final int readableBytes = \u2603.readableBytes();
        final byte[] a = this.a(\u2603);
        final int outputSize = this.a.getOutputSize(readableBytes);
        if (this.c.length < outputSize) {
            this.c = new byte[outputSize];
        }
        \u2603.writeBytes(this.c, 0, this.a.update(a, 0, readableBytes, this.c));
    }
}
