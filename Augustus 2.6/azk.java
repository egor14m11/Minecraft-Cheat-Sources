import java.util.concurrent.ScheduledThreadPoolExecutor;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import org.apache.logging.log4j.LogManager;
import java.awt.image.BufferedImage;
import io.netty.buffer.ByteBuf;
import org.apache.commons.lang3.Validate;
import java.io.InputStream;
import io.netty.buffer.ByteBufInputStream;
import io.netty.handler.codec.base64.Base64;
import io.netty.buffer.Unpooled;
import com.google.common.base.Charsets;
import java.util.List;
import java.net.UnknownHostException;
import java.util.concurrent.ThreadPoolExecutor;
import org.apache.logging.log4j.Logger;

// 
// Decompiled by Procyon v0.5.36
// 

public class azk implements awd.a
{
    private static final Logger a;
    private static final ThreadPoolExecutor b;
    private static final jy c;
    private static final jy d;
    private final azh e;
    private final ave f;
    private final bde g;
    private final jy h;
    private String i;
    private blz j;
    private long k;
    
    protected azk(final azh \u2603, final bde \u2603) {
        this.e = \u2603;
        this.g = \u2603;
        this.f = ave.A();
        this.h = new jy("servers/" + \u2603.b + "/icon");
        this.j = (blz)this.f.P().b(this.h);
    }
    
    @Override
    public void a(final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final boolean \u2603) {
        if (!this.g.h) {
            this.g.h = true;
            this.g.e = -2L;
            this.g.d = "";
            this.g.c = "";
            azk.b.submit(new Runnable() {
                @Override
                public void run() {
                    try {
                        azk.this.e.g().a(azk.this.g);
                    }
                    catch (UnknownHostException ex) {
                        azk.this.g.e = -1L;
                        azk.this.g.d = a.e + "Can't resolve hostname";
                    }
                    catch (Exception ex2) {
                        azk.this.g.e = -1L;
                        azk.this.g.d = a.e + "Can't connect to server.";
                    }
                }
            });
        }
        final boolean b = this.g.f > 47;
        final boolean b2 = this.g.f < 47;
        final boolean b3 = b || b2;
        this.f.k.a(this.g.a, \u2603 + 32 + 3, \u2603 + 1, 16777215);
        final List<String> c = this.f.k.c(this.g.d, \u2603 - 32 - 2);
        for (int i = 0; i < Math.min(c.size(), 2); ++i) {
            this.f.k.a(c.get(i), \u2603 + 32 + 3, \u2603 + 12 + this.f.k.a * i, 8421504);
        }
        final String s = b3 ? (a.e + this.g.g) : this.g.c;
        final int a = this.f.k.a(s);
        this.f.k.a(s, \u2603 + \u2603 - a - 15 - 2, \u2603 + 1, 8421504);
        int n = 0;
        String \u26032 = null;
        int n2;
        String string;
        if (b3) {
            n2 = 5;
            string = (b ? "Client out of date!" : "Server out of date!");
            \u26032 = this.g.i;
        }
        else if (this.g.h && this.g.e != -2L) {
            if (this.g.e < 0L) {
                n2 = 5;
            }
            else if (this.g.e < 150L) {
                n2 = 0;
            }
            else if (this.g.e < 300L) {
                n2 = 1;
            }
            else if (this.g.e < 600L) {
                n2 = 2;
            }
            else if (this.g.e < 1000L) {
                n2 = 3;
            }
            else {
                n2 = 4;
            }
            if (this.g.e < 0L) {
                string = "(no connection)";
            }
            else {
                string = this.g.e + "ms";
                \u26032 = this.g.i;
            }
        }
        else {
            n = 1;
            n2 = (int)(ave.J() / 100L + \u2603 * 2 & 0x7L);
            if (n2 > 4) {
                n2 = 8 - n2;
            }
            string = "Pinging...";
        }
        bfl.c(1.0f, 1.0f, 1.0f, 1.0f);
        this.f.P().a(avp.d);
        avp.a(\u2603 + \u2603 - 15, \u2603, (float)(n * 10), (float)(176 + n2 * 8), 10, 8, 256.0f, 256.0f);
        if (this.g.c() != null && !this.g.c().equals(this.i)) {
            this.i = this.g.c();
            this.c();
            this.e.h().b();
        }
        if (this.j != null) {
            this.a(\u2603, \u2603, this.h);
        }
        else {
            this.a(\u2603, \u2603, azk.c);
        }
        final int n3 = \u2603 - \u2603;
        final int n4 = \u2603 - \u2603;
        if (n3 >= \u2603 - 15 && n3 <= \u2603 - 5 && n4 >= 0 && n4 <= 8) {
            this.e.a(string);
        }
        else if (n3 >= \u2603 - a - 15 - 2 && n3 <= \u2603 - 15 - 2 && n4 >= 0 && n4 <= 8) {
            this.e.a(\u26032);
        }
        if (this.f.t.A || \u2603) {
            this.f.P().a(azk.d);
            avp.a(\u2603, \u2603, \u2603 + 32, \u2603 + 32, -1601138544);
            bfl.c(1.0f, 1.0f, 1.0f, 1.0f);
            final int n5 = \u2603 - \u2603;
            final int n6 = \u2603 - \u2603;
            if (this.b()) {
                if (n5 < 32 && n5 > 16) {
                    avp.a(\u2603, \u2603, 0.0f, 32.0f, 32, 32, 256.0f, 256.0f);
                }
                else {
                    avp.a(\u2603, \u2603, 0.0f, 0.0f, 32, 32, 256.0f, 256.0f);
                }
            }
            if (this.e.a(this, \u2603)) {
                if (n5 < 16 && n6 < 16) {
                    avp.a(\u2603, \u2603, 96.0f, 32.0f, 32, 32, 256.0f, 256.0f);
                }
                else {
                    avp.a(\u2603, \u2603, 96.0f, 0.0f, 32, 32, 256.0f, 256.0f);
                }
            }
            if (this.e.b(this, \u2603)) {
                if (n5 < 16 && n6 > 16) {
                    avp.a(\u2603, \u2603, 64.0f, 32.0f, 32, 32, 256.0f, 256.0f);
                }
                else {
                    avp.a(\u2603, \u2603, 64.0f, 0.0f, 32, 32, 256.0f, 256.0f);
                }
            }
        }
    }
    
    protected void a(final int \u2603, final int \u2603, final jy \u2603) {
        this.f.P().a(\u2603);
        bfl.l();
        avp.a(\u2603, \u2603, 0.0f, 0.0f, 32, 32, 32.0f, 32.0f);
        bfl.k();
    }
    
    private boolean b() {
        return true;
    }
    
    private void c() {
        if (this.g.c() == null) {
            this.f.P().c(this.h);
            this.j = null;
        }
        else {
            final ByteBuf copiedBuffer = Unpooled.copiedBuffer(this.g.c(), Charsets.UTF_8);
            final ByteBuf decode = Base64.decode(copiedBuffer);
            BufferedImage a;
            try {
                a = bml.a(new ByteBufInputStream(decode));
                Validate.validState(a.getWidth() == 64, "Must be 64 pixels wide", new Object[0]);
                Validate.validState(a.getHeight() == 64, "Must be 64 pixels high", new Object[0]);
            }
            catch (Throwable throwable) {
                azk.a.error("Invalid icon for server " + this.g.a + " (" + this.g.b + ")", throwable);
                this.g.a((String)null);
                return;
            }
            finally {
                copiedBuffer.release();
                decode.release();
            }
            if (this.j == null) {
                this.j = new blz(a.getWidth(), a.getHeight());
                this.f.P().a(this.h, this.j);
            }
            a.getRGB(0, 0, a.getWidth(), a.getHeight(), this.j.e(), 0, a.getWidth());
            this.j.d();
        }
    }
    
    @Override
    public boolean a(final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603) {
        if (\u2603 <= 32) {
            if (\u2603 < 32 && \u2603 > 16 && this.b()) {
                this.e.b(\u2603);
                this.e.f();
                return true;
            }
            if (\u2603 < 16 && \u2603 < 16 && this.e.a(this, \u2603)) {
                this.e.a(this, \u2603, axu.r());
                return true;
            }
            if (\u2603 < 16 && \u2603 > 16 && this.e.b(this, \u2603)) {
                this.e.b(this, \u2603, axu.r());
                return true;
            }
        }
        this.e.b(\u2603);
        if (ave.J() - this.k < 250L) {
            this.e.f();
        }
        this.k = ave.J();
        return false;
    }
    
    @Override
    public void a(final int \u2603, final int \u2603, final int \u2603) {
    }
    
    @Override
    public void b(final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603) {
    }
    
    public bde a() {
        return this.g;
    }
    
    static {
        a = LogManager.getLogger();
        b = new ScheduledThreadPoolExecutor(5, new ThreadFactoryBuilder().setNameFormat("Server Pinger #%d").setDaemon(true).build());
        c = new jy("textures/misc/unknown_server.png");
        d = new jy("textures/gui/server_selection.png");
    }
}
