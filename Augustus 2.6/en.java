import org.apache.logging.log4j.MarkerManager;
import org.apache.logging.log4j.LogManager;
import java.io.IOException;
import java.util.List;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.Logger;
import io.netty.handler.codec.ByteToMessageDecoder;

// 
// Decompiled by Procyon v0.5.36
// 

public class en extends ByteToMessageDecoder
{
    private static final Logger a;
    private static final Marker b;
    private final fg c;
    
    public en(final fg \u2603) {
        this.c = \u2603;
    }
    
    @Override
    protected void decode(final ChannelHandlerContext \u2603, final ByteBuf \u2603, final List<Object> \u2603) throws Exception {
        if (\u2603.readableBytes() == 0) {
            return;
        }
        final em em = new em(\u2603);
        final int e = em.e();
        final ff a = \u2603.channel().attr(ek.c).get().a(this.c, e);
        if (a == null) {
            throw new IOException("Bad packet id " + e);
        }
        a.a(em);
        if (em.readableBytes() > 0) {
            throw new IOException("Packet " + \u2603.channel().attr(ek.c).get().a() + "/" + e + " (" + a.getClass().getSimpleName() + ") was larger than I expected, found " + em.readableBytes() + " bytes extra whilst reading packet " + e);
        }
        \u2603.add(a);
        if (en.a.isDebugEnabled()) {
            en.a.debug(en.b, " IN: [{}:{}] {}", new Object[] { \u2603.channel().attr(ek.c).get(), e, a.getClass().getName() });
        }
    }
    
    static {
        a = LogManager.getLogger();
        b = MarkerManager.getMarker("PACKET_RECEIVED", ek.b);
    }
}
