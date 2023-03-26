import org.apache.logging.log4j.LogManager;
import com.google.common.base.Charsets;
import java.security.PrivateKey;
import com.mojang.authlib.exceptions.AuthenticationUnavailableException;
import java.util.UUID;
import java.math.BigInteger;
import java.util.Arrays;
import org.apache.commons.lang3.Validate;
import io.netty.util.concurrent.GenericFutureListener;
import io.netty.util.concurrent.Future;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import javax.crypto.SecretKey;
import com.mojang.authlib.GameProfile;
import net.minecraft.server.MinecraftServer;
import java.util.Random;
import org.apache.logging.log4j.Logger;
import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.5.36
// 

public class lo implements jk, km
{
    private static final AtomicInteger b;
    private static final Logger c;
    private static final Random d;
    private final byte[] e;
    private final MinecraftServer f;
    public final ek a;
    private a g;
    private int h;
    private GameProfile i;
    private String j;
    private SecretKey k;
    private lf l;
    
    public lo(final MinecraftServer \u2603, final ek \u2603) {
        this.e = new byte[4];
        this.g = lo.a.a;
        this.j = "";
        this.f = \u2603;
        this.a = \u2603;
        lo.d.nextBytes(this.e);
    }
    
    @Override
    public void c() {
        if (this.g == lo.a.d) {
            this.b();
        }
        else if (this.g == lo.a.e) {
            final lf a = this.f.ap().a(this.i.getId());
            if (a == null) {
                this.g = lo.a.d;
                this.f.ap().a(this.a, this.l);
                this.l = null;
            }
        }
        if (this.h++ == 600) {
            this.a("Took too long to log in");
        }
    }
    
    public void a(final String \u2603) {
        try {
            lo.c.info("Disconnecting " + this.d() + ": " + \u2603);
            final fa fa = new fa(\u2603);
            this.a.a(new jj(fa));
            this.a.a(fa);
        }
        catch (Exception throwable) {
            lo.c.error("Error whilst disconnecting player", throwable);
        }
    }
    
    public void b() {
        if (!this.i.isComplete()) {
            this.i = this.a(this.i);
        }
        final String a = this.f.ap().a(this.a.b(), this.i);
        if (a != null) {
            this.a(a);
        }
        else {
            this.g = lo.a.f;
            if (this.f.aK() >= 0 && !this.a.c()) {
                this.a.a(new ji(this.f.aK()), new ChannelFutureListener() {
                    public void a(final ChannelFuture \u2603) throws Exception {
                        lo.this.a.a(lo.this.f.aK());
                    }
                }, (GenericFutureListener<? extends Future<? super Void>>[])new GenericFutureListener[0]);
            }
            this.a.a(new jg(this.i));
            final lf a2 = this.f.ap().a(this.i.getId());
            if (a2 != null) {
                this.g = lo.a.e;
                this.l = this.f.ap().g(this.i);
            }
            else {
                this.f.ap().a(this.a, this.f.ap().g(this.i));
            }
        }
    }
    
    @Override
    public void a(final eu \u2603) {
        lo.c.info(this.d() + " lost connection: " + \u2603.c());
    }
    
    public String d() {
        if (this.i != null) {
            return this.i.toString() + " (" + this.a.b().toString() + ")";
        }
        return String.valueOf(this.a.b());
    }
    
    @Override
    public void a(final jl \u2603) {
        Validate.validState(this.g == lo.a.a, "Unexpected hello packet", new Object[0]);
        this.i = \u2603.a();
        if (this.f.af() && !this.a.c()) {
            this.g = lo.a.b;
            this.a.a(new jh(this.j, this.f.Q().getPublic(), this.e));
        }
        else {
            this.g = lo.a.d;
        }
    }
    
    @Override
    public void a(final jm \u2603) {
        Validate.validState(this.g == lo.a.b, "Unexpected key packet", new Object[0]);
        final PrivateKey private1 = this.f.Q().getPrivate();
        if (!Arrays.equals(this.e, \u2603.b(private1))) {
            throw new IllegalStateException("Invalid nonce!");
        }
        this.k = \u2603.a(private1);
        this.g = lo.a.c;
        this.a.a(this.k);
        new Thread("User Authenticator #" + lo.b.incrementAndGet()) {
            @Override
            public void run() {
                final GameProfile b = lo.this.i;
                try {
                    final String string = new BigInteger(ng.a(lo.this.j, lo.this.f.Q().getPublic(), lo.this.k)).toString(16);
                    lo.this.i = lo.this.f.aD().hasJoinedServer(new GameProfile(null, b.getName()), string);
                    if (lo.this.i != null) {
                        lo.c.info("UUID of player " + lo.this.i.getName() + " is " + lo.this.i.getId());
                        lo.this.g = lo.a.d;
                    }
                    else if (lo.this.f.T()) {
                        lo.c.warn("Failed to verify username but will let them in anyway!");
                        lo.this.i = lo.this.a(b);
                        lo.this.g = lo.a.d;
                    }
                    else {
                        lo.this.a("Failed to verify username!");
                        lo.c.error("Username '" + lo.this.i.getName() + "' tried to join with an invalid session");
                    }
                }
                catch (AuthenticationUnavailableException ex) {
                    if (lo.this.f.T()) {
                        lo.c.warn("Authentication servers are down but will let them in anyway!");
                        lo.this.i = lo.this.a(b);
                        lo.this.g = lo.a.d;
                    }
                    else {
                        lo.this.a("Authentication servers are down. Please try again later, sorry!");
                        lo.c.error("Couldn't verify username because servers are unavailable");
                    }
                }
            }
        }.start();
    }
    
    protected GameProfile a(final GameProfile \u2603) {
        final UUID nameUUIDFromBytes = UUID.nameUUIDFromBytes(("OfflinePlayer:" + \u2603.getName()).getBytes(Charsets.UTF_8));
        return new GameProfile(nameUUIDFromBytes, \u2603.getName());
    }
    
    static {
        b = new AtomicInteger(0);
        c = LogManager.getLogger();
        d = new Random();
    }
    
    enum a
    {
        a, 
        b, 
        c, 
        d, 
        e, 
        f;
    }
}
