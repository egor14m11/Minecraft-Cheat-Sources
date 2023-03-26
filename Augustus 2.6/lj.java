import org.apache.logging.log4j.LogManager;
import io.netty.buffer.Unpooled;
import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;
import io.netty.channel.ChannelFutureListener;
import net.minecraft.server.MinecraftServer;
import com.google.common.base.Charsets;
import java.net.InetSocketAddress;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import org.apache.logging.log4j.Logger;
import io.netty.channel.ChannelInboundHandlerAdapter;

// 
// Decompiled by Procyon v0.5.36
// 

public class lj extends ChannelInboundHandlerAdapter
{
    private static final Logger a;
    private ll b;
    
    public lj(final ll \u2603) {
        this.b = \u2603;
    }
    
    @Override
    public void channelRead(final ChannelHandlerContext \u2603, final Object \u2603) throws Exception {
        final ByteBuf byteBuf = (ByteBuf)\u2603;
        byteBuf.markReaderIndex();
        boolean b = true;
        try {
            if (byteBuf.readUnsignedByte() != 254) {
                return;
            }
            final InetSocketAddress inetSocketAddress = (InetSocketAddress)\u2603.channel().remoteAddress();
            final MinecraftServer d = this.b.d();
            final int readableBytes = byteBuf.readableBytes();
            switch (readableBytes) {
                case 0: {
                    lj.a.debug("Ping: (<1.3.x) from {}:{}", new Object[] { inetSocketAddress.getAddress(), inetSocketAddress.getPort() });
                    final String s = String.format("%s§%d§%d", d.am(), d.I(), d.J());
                    this.a(\u2603, this.a(s));
                    break;
                }
                case 1: {
                    if (byteBuf.readUnsignedByte() != 1) {
                        return;
                    }
                    lj.a.debug("Ping: (1.4-1.5.x) from {}:{}", new Object[] { inetSocketAddress.getAddress(), inetSocketAddress.getPort() });
                    final String s = String.format("§1\u0000%d\u0000%s\u0000%s\u0000%d\u0000%d", 127, d.H(), d.am(), d.I(), d.J());
                    this.a(\u2603, this.a(s));
                    break;
                }
                default: {
                    boolean b2 = byteBuf.readUnsignedByte() == 1;
                    b2 &= (byteBuf.readUnsignedByte() == 250);
                    b2 &= "MC|PingHost".equals(new String(byteBuf.readBytes(byteBuf.readShort() * 2).array(), Charsets.UTF_16BE));
                    final int unsignedShort = byteBuf.readUnsignedShort();
                    b2 &= (byteBuf.readUnsignedByte() >= 73);
                    b2 &= (3 + byteBuf.readBytes(byteBuf.readShort() * 2).array().length + 4 == unsignedShort);
                    b2 &= (byteBuf.readInt() <= 65535);
                    b2 &= (byteBuf.readableBytes() == 0);
                    if (!b2) {
                        return;
                    }
                    lj.a.debug("Ping: (1.6) from {}:{}", new Object[] { inetSocketAddress.getAddress(), inetSocketAddress.getPort() });
                    final String format = String.format("§1\u0000%d\u0000%s\u0000%s\u0000%d\u0000%d", 127, d.H(), d.am(), d.I(), d.J());
                    final ByteBuf a = this.a(format);
                    try {
                        this.a(\u2603, a);
                    }
                    finally {
                        a.release();
                    }
                    break;
                }
            }
            byteBuf.release();
            b = false;
        }
        catch (RuntimeException ex) {}
        finally {
            if (b) {
                byteBuf.resetReaderIndex();
                \u2603.channel().pipeline().remove("legacy_query");
                \u2603.fireChannelRead(\u2603);
            }
        }
    }
    
    private void a(final ChannelHandlerContext \u2603, final ByteBuf \u2603) {
        \u2603.pipeline().firstContext().writeAndFlush(\u2603).addListener((GenericFutureListener<? extends Future<? super Void>>)ChannelFutureListener.CLOSE);
    }
    
    private ByteBuf a(final String \u2603) {
        final ByteBuf buffer = Unpooled.buffer();
        buffer.writeByte(255);
        final char[] charArray = \u2603.toCharArray();
        buffer.writeShort(charArray.length);
        for (final char c : charArray) {
            buffer.writeChar(c);
        }
        return buffer;
    }
    
    static {
        a = LogManager.getLogger();
    }
}
