import org.apache.logging.log4j.LogManager;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import java.security.PublicKey;
import javax.crypto.SecretKey;
import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;
import com.mojang.authlib.exceptions.InvalidCredentialsException;
import com.mojang.authlib.exceptions.AuthenticationUnavailableException;
import com.mojang.authlib.exceptions.AuthenticationException;
import java.math.BigInteger;
import com.mojang.authlib.GameProfile;
import org.apache.logging.log4j.Logger;

// 
// Decompiled by Procyon v0.5.36
// 

public class bcx implements jf
{
    private static final Logger a;
    private final ave b;
    private final axu c;
    private final ek d;
    private GameProfile e;
    
    public bcx(final ek \u2603, final ave \u2603, final axu \u2603) {
        this.d = \u2603;
        this.b = \u2603;
        this.c = \u2603;
    }
    
    @Override
    public void a(final jh \u2603) {
        final SecretKey a = ng.a();
        final String a2 = \u2603.a();
        final PublicKey b = \u2603.b();
        final String string = new BigInteger(ng.a(a2, b, a)).toString(16);
        if (this.b.D() != null && this.b.D().d()) {
            try {
                this.b().joinServer(this.b.L().e(), this.b.L().d(), string);
            }
            catch (AuthenticationException ex) {
                bcx.a.warn("Couldn't connect to auth servers but will continue to join LAN");
            }
        }
        else {
            try {
                this.b().joinServer(this.b.L().e(), this.b.L().d(), string);
            }
            catch (AuthenticationUnavailableException ex2) {
                this.d.a(new fb("disconnect.loginFailedInfo", new Object[] { new fb("disconnect.loginFailedInfo.serversUnavailable", new Object[0]) }));
                return;
            }
            catch (InvalidCredentialsException ex3) {
                this.d.a(new fb("disconnect.loginFailedInfo", new Object[] { new fb("disconnect.loginFailedInfo.invalidSession", new Object[0]) }));
                return;
            }
            catch (AuthenticationException ex) {
                this.d.a(new fb("disconnect.loginFailedInfo", new Object[] { ex.getMessage() }));
                return;
            }
        }
        this.d.a(new jm(a, b, \u2603.c()), new GenericFutureListener<Future<? super Void>>() {
            @Override
            public void operationComplete(final Future<? super Void> \u2603) throws Exception {
                bcx.this.d.a(a);
            }
        }, (GenericFutureListener<? extends Future<? super Void>>[])new GenericFutureListener[0]);
    }
    
    private MinecraftSessionService b() {
        return this.b.aa();
    }
    
    @Override
    public void a(final jg \u2603) {
        this.e = \u2603.a();
        this.d.a(el.b);
        this.d.a(new bcy(this.b, this.c, this.d, this.e));
    }
    
    @Override
    public void a(final eu \u2603) {
        this.b.a(new axh(this.c, "connect.failed", \u2603));
    }
    
    @Override
    public void a(final jj \u2603) {
        this.d.a(\u2603.a());
    }
    
    @Override
    public void a(final ji \u2603) {
        if (!this.d.c()) {
            this.d.a(\u2603.a());
        }
    }
    
    static {
        a = LogManager.getLogger();
    }
}
