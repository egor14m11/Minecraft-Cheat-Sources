import io.netty.bootstrap.AbstractBootstrap;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import org.apache.logging.log4j.LogManager;
import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;
import java.util.concurrent.Callable;
import java.util.Iterator;
import io.netty.channel.local.LocalAddress;
import io.netty.channel.local.LocalServerChannel;
import java.net.SocketAddress;
import java.io.IOException;
import io.netty.channel.socket.ServerSocketChannel;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.ChannelHandler;
import io.netty.handler.timeout.ReadTimeoutHandler;
import io.netty.channel.ChannelException;
import io.netty.channel.ChannelOption;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.Channel;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.channel.epoll.EpollServerSocketChannel;
import io.netty.channel.epoll.Epoll;
import java.net.InetAddress;
import java.util.Collections;
import com.google.common.collect.Lists;
import io.netty.channel.ChannelFuture;
import java.util.List;
import net.minecraft.server.MinecraftServer;
import io.netty.channel.local.LocalEventLoopGroup;
import io.netty.channel.epoll.EpollEventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import org.apache.logging.log4j.Logger;

// 
// Decompiled by Procyon v0.5.36
// 

public class ll
{
    private static final Logger e;
    public static final no<NioEventLoopGroup> a;
    public static final no<EpollEventLoopGroup> b;
    public static final no<LocalEventLoopGroup> c;
    private final MinecraftServer f;
    public volatile boolean d;
    private final List<ChannelFuture> g;
    private final List<ek> h;
    
    public ll(final MinecraftServer \u2603) {
        this.g = Collections.synchronizedList((List<ChannelFuture>)Lists.newArrayList());
        this.h = Collections.synchronizedList((List<ek>)Lists.newArrayList());
        this.f = \u2603;
        this.d = true;
    }
    
    public void a(final InetAddress \u2603, final int \u2603) throws IOException {
        synchronized (this.g) {
            Class<? extends ServerSocketChannel> channelClass;
            no<? extends EventLoopGroup> no;
            if (Epoll.isAvailable() && this.f.ai()) {
                channelClass = EpollServerSocketChannel.class;
                no = ll.b;
                ll.e.info("Using epoll channel type");
            }
            else {
                channelClass = NioServerSocketChannel.class;
                no = ll.a;
                ll.e.info("Using default channel type");
            }
            this.g.add(((AbstractBootstrap<ServerBootstrap, C>)((AbstractBootstrap<ServerBootstrap, Channel>)new ServerBootstrap()).channel(channelClass).childHandler(new ChannelInitializer<Channel>() {
                @Override
                protected void initChannel(final Channel \u2603) throws Exception {
                    try {
                        \u2603.config().setOption(ChannelOption.TCP_NODELAY, true);
                    }
                    catch (ChannelException ex) {}
                    \u2603.pipeline().addLast("timeout", new ReadTimeoutHandler(30)).addLast("legacy_query", new lj(ll.this)).addLast("splitter", new eq()).addLast("decoder", new en(fg.a)).addLast("prepender", new er()).addLast("encoder", new eo(fg.b));
                    final ek \u26032 = new ek(fg.a);
                    ll.this.h.add(\u26032);
                    \u2603.pipeline().addLast("packet_handler", \u26032);
                    \u26032.a(new ln(ll.this.f, \u26032));
                }
            }).group((EventLoopGroup)no.c())).localAddress(\u2603, \u2603).bind().syncUninterruptibly());
        }
    }
    
    public SocketAddress a() {
        final ChannelFuture syncUninterruptibly;
        synchronized (this.g) {
            syncUninterruptibly = ((AbstractBootstrap<ServerBootstrap, C>)((AbstractBootstrap<ServerBootstrap, Channel>)new ServerBootstrap()).channel(LocalServerChannel.class).childHandler(new ChannelInitializer<Channel>() {
                @Override
                protected void initChannel(final Channel \u2603) throws Exception {
                    final ek \u26032 = new ek(fg.a);
                    \u26032.a(new lk(ll.this.f, \u26032));
                    ll.this.h.add(\u26032);
                    \u2603.pipeline().addLast("packet_handler", \u26032);
                }
            }).group(ll.a.c())).localAddress(LocalAddress.ANY).bind().syncUninterruptibly();
            this.g.add(syncUninterruptibly);
        }
        return syncUninterruptibly.channel().localAddress();
    }
    
    public void b() {
        this.d = false;
        for (final ChannelFuture channelFuture : this.g) {
            try {
                channelFuture.channel().close().sync();
            }
            catch (InterruptedException ex) {
                ll.e.error("Interrupted whilst closing channel");
            }
        }
    }
    
    public void c() {
        synchronized (this.h) {
            final Iterator<ek> iterator = this.h.iterator();
            while (iterator.hasNext()) {
                final ek ek = iterator.next();
                if (!ek.h()) {
                    if (!ek.g()) {
                        iterator.remove();
                        ek.l();
                    }
                    else {
                        try {
                            ek.a();
                        }
                        catch (Exception ex) {
                            if (ek.c()) {
                                final b a = b.a(ex, "Ticking memory connection");
                                final c a2 = a.a("Ticking connection");
                                a2.a("Connection", new Callable<String>() {
                                    public String a() throws Exception {
                                        return ek.toString();
                                    }
                                });
                                throw new e(a);
                            }
                            ll.e.warn("Failed to handle packet for " + ek.b(), ex);
                            final fa \u2603 = new fa("Internal server error");
                            ek.a(new gh(\u2603), new GenericFutureListener<Future<? super Void>>() {
                                @Override
                                public void operationComplete(final Future<? super Void> \u2603) throws Exception {
                                    ek.a(\u2603);
                                }
                            }, (GenericFutureListener<? extends Future<? super Void>>[])new GenericFutureListener[0]);
                            ek.k();
                        }
                    }
                }
            }
        }
    }
    
    public MinecraftServer d() {
        return this.f;
    }
    
    static {
        e = LogManager.getLogger();
        a = new no<NioEventLoopGroup>() {
            protected NioEventLoopGroup a() {
                return new NioEventLoopGroup(0, new ThreadFactoryBuilder().setNameFormat("Netty Server IO #%d").setDaemon(true).build());
            }
        };
        b = new no<EpollEventLoopGroup>() {
            protected EpollEventLoopGroup a() {
                return new EpollEventLoopGroup(0, new ThreadFactoryBuilder().setNameFormat("Netty Epoll Server IO #%d").setDaemon(true).build());
            }
        };
        c = new no<LocalEventLoopGroup>() {
            protected LocalEventLoopGroup a() {
                return new LocalEventLoopGroup(0, new ThreadFactoryBuilder().setNameFormat("Netty Local Server IO #%d").setDaemon(true).build());
            }
        };
    }
}
