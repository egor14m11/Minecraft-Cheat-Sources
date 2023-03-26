import io.netty.channel.ChannelHandlerContext;
import javax.crypto.Cipher;
import io.netty.buffer.ByteBuf;
import io.netty.handler.codec.MessageToByteEncoder;

// 
// Decompiled by Procyon v0.5.36
// 

public class eh extends MessageToByteEncoder<ByteBuf>
{
    private final ef a;
    
    public eh(final Cipher \u2603) {
        this.a = new ef(\u2603);
    }
    
    protected void a(final ChannelHandlerContext \u2603, final ByteBuf \u2603, final ByteBuf \u2603) throws Exception {
        this.a.a(\u2603, \u2603);
    }
}
