import io.netty.bootstrap.AbstractBootstrap;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import org.apache.logging.log4j.MarkerManager;
import org.apache.logging.log4j.LogManager;
import java.security.Key;
import javax.crypto.SecretKey;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.ChannelHandler;
import io.netty.handler.timeout.ReadTimeoutHandler;
import io.netty.channel.ChannelException;
import io.netty.channel.ChannelOption;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.EventLoopGroup;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.channel.epoll.EpollSocketChannel;
import io.netty.channel.epoll.Epoll;
import java.net.InetAddress;
import io.netty.channel.local.LocalServerChannel;
import io.netty.channel.local.LocalChannel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import org.apache.commons.lang3.ArrayUtils;
import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;
import org.apache.commons.lang3.Validate;
import io.netty.handler.timeout.TimeoutException;
import io.netty.channel.ChannelHandlerContext;
import com.google.common.collect.Queues;
import java.net.SocketAddress;
import io.netty.channel.Channel;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.Queue;
import io.netty.channel.local.LocalEventLoopGroup;
import io.netty.channel.epoll.EpollEventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.util.AttributeKey;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.Logger;
import io.netty.channel.SimpleChannelInboundHandler;

// 
// Decompiled by Procyon v0.5.36
// 

public class ek extends SimpleChannelInboundHandler<ff>
{
    private static final Logger g;
    public static final Marker a;
    public static final Marker b;
    public static final AttributeKey<el> c;
    public static final no<NioEventLoopGroup> d;
    public static final no<EpollEventLoopGroup> e;
    public static final no<LocalEventLoopGroup> f;
    private final fg h;
    private final Queue<a> i;
    private final ReentrantReadWriteLock j;
    private Channel k;
    private SocketAddress l;
    private ep m;
    private eu n;
    private boolean o;
    private boolean p;
    
    public ek(final fg \u2603) {
        this.i = (Queue<a>)Queues.newConcurrentLinkedQueue();
        this.j = new ReentrantReadWriteLock();
        this.h = \u2603;
    }
    
    @Override
    public void channelActive(final ChannelHandlerContext \u2603) throws Exception {
        super.channelActive(\u2603);
        this.k = \u2603.channel();
        this.l = this.k.remoteAddress();
        try {
            this.a(el.a);
        }
        catch (Throwable message) {
            ek.g.fatal(message);
        }
    }
    
    public void a(final el \u2603) {
        this.k.attr(ek.c).set(\u2603);
        this.k.config().setAutoRead(true);
        ek.g.debug("Enabled auto read");
    }
    
    @Override
    public void channelInactive(final ChannelHandlerContext \u2603) throws Exception {
        this.a(new fb("disconnect.endOfStream", new Object[0]));
    }
    
    @Override
    public void exceptionCaught(final ChannelHandlerContext \u2603, final Throwable \u2603) throws Exception {
        fb \u26032;
        if (\u2603 instanceof TimeoutException) {
            \u26032 = new fb("disconnect.timeout", new Object[0]);
        }
        else {
            \u26032 = new fb("disconnect.genericReason", new Object[] { "Internal Exception: " + \u2603 });
        }
        this.a(\u26032);
    }
    
    protected void a(final ChannelHandlerContext \u2603, final ff \u2603) throws Exception {
        if (this.k.isOpen()) {
            try {
                \u2603.a(this.m);
            }
            catch (ki ki) {}
        }
    }
    
    public void a(final ep \u2603) {
        Validate.notNull(\u2603, "packetListener", new Object[0]);
        ek.g.debug("Set listener of {} to {}", new Object[] { this, \u2603 });
        this.m = \u2603;
    }
    
    public void a(final ff \u2603) {
        if (this.g()) {
            this.m();
            this.a(\u2603, null);
        }
        else {
            this.j.writeLock().lock();
            try {
                this.i.add(new a(\u2603, (GenericFutureListener<? extends Future<? super Void>>[])null));
            }
            finally {
                this.j.writeLock().unlock();
            }
        }
    }
    
    public void a(final ff \u2603, final GenericFutureListener<? extends Future<? super Void>> \u2603, final GenericFutureListener<? extends Future<? super Void>>... \u2603) {
        if (this.g()) {
            this.m();
            this.a(\u2603, ArrayUtils.add(\u2603, 0, \u2603));
        }
        else {
            this.j.writeLock().lock();
            try {
                this.i.add(new a(\u2603, (GenericFutureListener<? extends Future<? super Void>>[])ArrayUtils.add(\u2603, 0, \u2603)));
            }
            finally {
                this.j.writeLock().unlock();
            }
        }
    }
    
    private void a(final ff \u2603, final GenericFutureListener<? extends Future<? super Void>>[] \u2603) {
        final el a = el.a(\u2603);
        final el el = this.k.attr(ek.c).get();
        if (el != a) {
            ek.g.debug("Disabled auto read");
            this.k.config().setAutoRead(false);
        }
        if (this.k.eventLoop().inEventLoop()) {
            if (a != el) {
                this.a(a);
            }
            final ChannelFuture writeAndFlush = this.k.writeAndFlush(\u2603);
            if (\u2603 != null) {
                writeAndFlush.addListeners(\u2603);
            }
            writeAndFlush.addListener((GenericFutureListener<? extends Future<? super Void>>)ChannelFutureListener.FIRE_EXCEPTION_ON_FAILURE);
        }
        else {
            this.k.eventLoop().execute(new Runnable() {
                @Override
                public void run() {
                    if (a != el) {
                        ek.this.a(a);
                    }
                    final ChannelFuture writeAndFlush = ek.this.k.writeAndFlush(\u2603);
                    if (\u2603 != null) {
                        writeAndFlush.addListeners((GenericFutureListener<? extends Future<? super Void>>[])\u2603);
                    }
                    writeAndFlush.addListener((GenericFutureListener<? extends Future<? super Void>>)ChannelFutureListener.FIRE_EXCEPTION_ON_FAILURE);
                }
            });
        }
    }
    
    private void m() {
        if (this.k == null || !this.k.isOpen()) {
            return;
        }
        this.j.readLock().lock();
        try {
            while (!this.i.isEmpty()) {
                final a a = this.i.poll();
                this.a(a.a, a.b);
            }
        }
        finally {
            this.j.readLock().unlock();
        }
    }
    
    public void a() {
        this.m();
        if (this.m instanceof km) {
            ((km)this.m).c();
        }
        this.k.flush();
    }
    
    public SocketAddress b() {
        return this.l;
    }
    
    public void a(final eu \u2603) {
        if (this.k.isOpen()) {
            this.k.close().awaitUninterruptibly();
            this.n = \u2603;
        }
    }
    
    public boolean c() {
        return this.k instanceof LocalChannel || this.k instanceof LocalServerChannel;
    }
    
    public static ek a(final InetAddress \u2603, final int \u2603, final boolean \u2603) {
        final ek ek = new ek(fg.b);
        Class<? extends SocketChannel> channelClass;
        no<? extends EventLoopGroup> no;
        if (Epoll.isAvailable() && \u2603) {
            channelClass = EpollSocketChannel.class;
            no = ek.e;
        }
        else {
            channelClass = NioSocketChannel.class;
            no = ek.d;
        }
        ((AbstractBootstrap<Bootstrap, C>)((AbstractBootstrap<Bootstrap, C>)new Bootstrap()).group((EventLoopGroup)no.c())).handler(new ChannelInitializer<Channel>() {
            @Override
            protected void initChannel(final Channel \u2603) throws Exception {
                try {
                    \u2603.config().setOption(ChannelOption.TCP_NODELAY, true);
                }
                catch (ChannelException ex) {}
                \u2603.pipeline().addLast("timeout", new ReadTimeoutHandler(30)).addLast("splitter", new eq()).addLast("decoder", new en(fg.b)).addLast("prepender", new er()).addLast("encoder", new eo(fg.a)).addLast("packet_handler", ek);
            }
        }).channel(channelClass).connect(\u2603, \u2603).syncUninterruptibly();
        return ek;
    }
    
    public static ek a(final SocketAddress \u2603) {
        final ek ek = new ek(fg.b);
        ((AbstractBootstrap<Bootstrap, C>)((AbstractBootstrap<Bootstrap, C>)new Bootstrap()).group(ek.f.c())).handler(new ChannelInitializer<Channel>() {
            @Override
            protected void initChannel(final Channel \u2603) throws Exception {
                \u2603.pipeline().addLast("packet_handler", ek);
            }
        }).channel(LocalChannel.class).connect(\u2603).syncUninterruptibly();
        return ek;
    }
    
    public void a(final SecretKey \u2603) {
        this.o = true;
        this.k.pipeline().addBefore("splitter", "decrypt", new eg(ng.a(2, \u2603)));
        this.k.pipeline().addBefore("prepender", "encrypt", new eh(ng.a(1, \u2603)));
    }
    
    public boolean f() {
        return this.o;
    }
    
    public boolean g() {
        return this.k != null && this.k.isOpen();
    }
    
    public boolean h() {
        return this.k == null;
    }
    
    public ep i() {
        return this.m;
    }
    
    public eu j() {
        return this.n;
    }
    
    public void k() {
        this.k.config().setAutoRead(false);
    }
    
    public void a(final int \u2603) {
        if (\u2603 >= 0) {
            if (this.k.pipeline().get("decompress") instanceof ei) {
                ((ei)this.k.pipeline().get("decompress")).a(\u2603);
            }
            else {
                this.k.pipeline().addBefore("decoder", "decompress", new ei(\u2603));
            }
            if (this.k.pipeline().get("compress") instanceof ej) {
                ((ej)this.k.pipeline().get("decompress")).a(\u2603);
            }
            else {
                this.k.pipeline().addBefore("encoder", "compress", new ej(\u2603));
            }
        }
        else {
            if (this.k.pipeline().get("decompress") instanceof ei) {
                this.k.pipeline().remove("decompress");
            }
            if (this.k.pipeline().get("compress") instanceof ej) {
                this.k.pipeline().remove("compress");
            }
        }
    }
    
    public void l() {
        if (this.k == null || this.k.isOpen()) {
            return;
        }
        if (!this.p) {
            this.p = true;
            if (this.j() != null) {
                this.i().a(this.j());
            }
            else if (this.i() != null) {
                this.i().a(new fa("Disconnected"));
            }
        }
        else {
            ek.g.warn("handleDisconnection() called twice");
        }
    }
    
    static {
        g = LogManager.getLogger();
        a = MarkerManager.getMarker("NETWORK");
        b = MarkerManager.getMarker("NETWORK_PACKETS", ek.a);
        c = AttributeKey.valueOf("protocol");
        d = new no<NioEventLoopGroup>() {
            protected NioEventLoopGroup a() {
                return new NioEventLoopGroup(0, new ThreadFactoryBuilder().setNameFormat("Netty Client IO #%d").setDaemon(true).build());
            }
        };
        e = new no<EpollEventLoopGroup>() {
            protected EpollEventLoopGroup a() {
                return new EpollEventLoopGroup(0, new ThreadFactoryBuilder().setNameFormat("Netty Epoll Client IO #%d").setDaemon(true).build());
            }
        };
        f = new no<LocalEventLoopGroup>() {
            protected LocalEventLoopGroup a() {
                return new LocalEventLoopGroup(0, new ThreadFactoryBuilder().setNameFormat("Netty Local Client IO #%d").setDaemon(true).build());
            }
        };
    }
    
    static class a
    {
        private final ff a;
        private final GenericFutureListener<? extends Future<? super Void>>[] b;
        
        public a(final ff \u2603, final GenericFutureListener<? extends Future<? super Void>>... \u2603) {
            this.a = \u2603;
            this.b = \u2603;
        }
    }
}
