import org.apache.logging.log4j.MarkerManager;
import org.apache.logging.log4j.LogManager;
import java.io.IOException;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.Logger;
import io.netty.handler.codec.MessageToByteEncoder;

// 
// Decompiled by Procyon v0.5.36
// 

public class eo extends MessageToByteEncoder<ff>
{
    private static final Logger a;
    private static final Marker b;
    private final fg c;
    
    public eo(final fg \u2603) {
        this.c = \u2603;
    }
    
    protected void a(final ChannelHandlerContext \u2603, ff \u2603, final ByteBuf \u2603) throws Exception {
        final Integer a = \u2603.channel().attr(ek.c).get().a(this.c, \u2603);
        if (eo.a.isDebugEnabled()) {
            eo.a.debug(eo.b, "OUT: [{}:{}] {}", new Object[] { \u2603.channel().attr(ek.c).get(), a, \u2603.getClass().getName() });
        }
        if (a == null) {
            throw new IOException("Can't serialize unregistered packet");
        }
        final em em = new em(\u2603);
        em.b(a);
        try {
            if (\u2603 instanceof fp) {
                \u2603 = \u2603;
            }
            \u2603.b(em);
        }
        catch (Throwable message) {
            eo.a.error(message);
        }
    }
    
    static {
        a = LogManager.getLogger();
        b = MarkerManager.getMarker("PACKET_SENT", ek.b);
    }
}
