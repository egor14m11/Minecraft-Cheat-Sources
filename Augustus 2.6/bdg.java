import io.netty.bootstrap.AbstractBootstrap;
import org.apache.logging.log4j.LogManager;
import java.util.Iterator;
import io.netty.channel.socket.nio.NioSocketChannel;
import com.google.common.collect.Iterables;
import com.google.common.base.Charsets;
import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;
import io.netty.channel.ChannelFutureListener;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.buffer.ByteBuf;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelException;
import io.netty.channel.ChannelOption;
import io.netty.channel.Channel;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.bootstrap.Bootstrap;
import java.net.UnknownHostException;
import com.mojang.authlib.GameProfile;
import org.apache.commons.lang3.ArrayUtils;
import java.net.InetAddress;
import java.util.Collections;
import com.google.common.collect.Lists;
import java.util.List;
import org.apache.logging.log4j.Logger;
import com.google.common.base.Splitter;

// 
// Decompiled by Procyon v0.5.36
// 

public class bdg
{
    private static final Splitter a;
    private static final Logger b;
    private final List<ek> c;
    
    public bdg() {
        this.c = Collections.synchronizedList((List<ek>)Lists.newArrayList());
    }
    
    public void a(final bde \u2603) throws UnknownHostException {
        final bdd a = bdd.a(\u2603.b);
        final ek a2 = ek.a(InetAddress.getByName(a.a()), a.b(), false);
        this.c.add(a2);
        \u2603.d = "Pinging...";
        \u2603.e = -1L;
        \u2603.i = null;
        a2.a(new jp() {
            private boolean d = false;
            private boolean e = false;
            private long f = 0L;
            
            @Override
            public void a(final jr \u2603) {
                if (this.e) {
                    a2.a(new fa("Received unrequested status"));
                    return;
                }
                this.e = true;
                final js a = \u2603.a();
                if (a.a() != null) {
                    \u2603.d = a.a().d();
                }
                else {
                    \u2603.d = "";
                }
                if (a.c() != null) {
                    \u2603.g = a.c().a();
                    \u2603.f = a.c().b();
                }
                else {
                    \u2603.g = "Old";
                    \u2603.f = 0;
                }
                if (a.b() != null) {
                    \u2603.c = a.h + "" + a.b().b() + "" + a.i + "/" + a.h + a.b().a();
                    if (ArrayUtils.isNotEmpty(a.b().c())) {
                        final StringBuilder sb = new StringBuilder();
                        for (final GameProfile gameProfile : a.b().c()) {
                            if (sb.length() > 0) {
                                sb.append("\n");
                            }
                            sb.append(gameProfile.getName());
                        }
                        if (a.b().c().length < a.b().b()) {
                            if (sb.length() > 0) {
                                sb.append("\n");
                            }
                            sb.append("... and ").append(a.b().b() - a.b().c().length).append(" more ...");
                        }
                        \u2603.i = sb.toString();
                    }
                }
                else {
                    \u2603.c = a.i + "???";
                }
                if (a.d() != null) {
                    final String d = a.d();
                    if (d.startsWith("data:image/png;base64,")) {
                        \u2603.a(d.substring("data:image/png;base64,".length()));
                    }
                    else {
                        bdg.b.error("Invalid server icon (unknown format)");
                    }
                }
                else {
                    \u2603.a((String)null);
                }
                this.f = ave.J();
                a2.a(new ju(this.f));
                this.d = true;
            }
            
            @Override
            public void a(final jq \u2603) {
                final long f = this.f;
                final long j = ave.J();
                \u2603.e = j - f;
                a2.a(new fa("Finished"));
            }
            
            @Override
            public void a(final eu \u2603) {
                if (!this.d) {
                    bdg.b.error("Can't ping " + \u2603.b + ": " + \u2603.c());
                    \u2603.d = a.e + "Can't connect to server.";
                    \u2603.c = "";
                    bdg.this.b(\u2603);
                }
            }
        });
        try {
            a2.a(new jc(47, a.a(), a.b(), el.c));
            a2.a(new jv());
        }
        catch (Throwable message) {
            bdg.b.error(message);
        }
    }
    
    private void b(final bde \u2603) {
        final bdd a = bdd.a(\u2603.b);
        ((AbstractBootstrap<Bootstrap, C>)((AbstractBootstrap<Bootstrap, C>)new Bootstrap()).group(ek.d.c())).handler(new ChannelInitializer<Channel>() {
            @Override
            protected void initChannel(final Channel \u2603) throws Exception {
                try {
                    \u2603.config().setOption(ChannelOption.TCP_NODELAY, true);
                }
                catch (ChannelException ex) {}
                \u2603.pipeline().addLast(new SimpleChannelInboundHandler<ByteBuf>() {
                    @Override
                    public void channelActive(final ChannelHandlerContext \u2603) throws Exception {
                        super.channelActive(\u2603);
                        final ByteBuf buffer = Unpooled.buffer();
                        try {
                            buffer.writeByte(254);
                            buffer.writeByte(1);
                            buffer.writeByte(250);
                            char[] array = "MC|PingHost".toCharArray();
                            buffer.writeShort(array.length);
                            for (final char c : array) {
                                buffer.writeChar(c);
                            }
                            buffer.writeShort(7 + 2 * a.a().length());
                            buffer.writeByte(127);
                            array = a.a().toCharArray();
                            buffer.writeShort(array.length);
                            for (final char c : array) {
                                buffer.writeChar(c);
                            }
                            buffer.writeInt(a.b());
                            \u2603.channel().writeAndFlush(buffer).addListener((GenericFutureListener<? extends Future<? super Void>>)ChannelFutureListener.CLOSE_ON_FAILURE);
                        }
                        finally {
                            buffer.release();
                        }
                    }
                    
                    protected void a(final ChannelHandlerContext \u2603, final ByteBuf \u2603) throws Exception {
                        final short unsignedByte = \u2603.readUnsignedByte();
                        if (unsignedByte == 255) {
                            final String sequence = new String(\u2603.readBytes(\u2603.readShort() * 2).array(), Charsets.UTF_16BE);
                            final String[] array = Iterables.toArray(bdg.a.split(sequence), String.class);
                            if ("§1".equals(array[0])) {
                                final int a = ns.a(array[1], 0);
                                final String g = array[2];
                                final String d = array[3];
                                final int a2 = ns.a(array[4], -1);
                                final int a3 = ns.a(array[5], -1);
                                \u2603.f = -1;
                                \u2603.g = g;
                                \u2603.d = d;
                                \u2603.c = a.h + "" + a2 + "" + a.i + "/" + a.h + a3;
                            }
                        }
                        \u2603.close();
                    }
                    
                    @Override
                    public void exceptionCaught(final ChannelHandlerContext \u2603, final Throwable \u2603) throws Exception {
                        \u2603.close();
                    }
                });
            }
        }).channel(NioSocketChannel.class).connect(a.a(), a.b());
    }
    
    public void a() {
        synchronized (this.c) {
            final Iterator<ek> iterator = this.c.iterator();
            while (iterator.hasNext()) {
                final ek ek = iterator.next();
                if (ek.g()) {
                    ek.a();
                }
                else {
                    iterator.remove();
                    ek.l();
                }
            }
        }
    }
    
    public void b() {
        synchronized (this.c) {
            final Iterator<ek> iterator = this.c.iterator();
            while (iterator.hasNext()) {
                final ek ek = iterator.next();
                if (ek.g()) {
                    iterator.remove();
                    ek.a(new fa("Cancelled"));
                }
            }
        }
    }
    
    static {
        a = Splitter.on('\0').limit(6);
        b = LogManager.getLogger();
    }
}
