import org.apache.logging.log4j.LogManager;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.glu.Project;
import java.net.URI;
import net.minecraft.realms.RealmsBridge;
import java.util.Date;
import java.util.Calendar;
import java.util.List;
import org.lwjgl.opengl.GLContext;
import java.io.IOException;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import org.apache.commons.io.Charsets;
import com.google.common.collect.Lists;
import java.util.Random;
import org.apache.logging.log4j.Logger;
import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.5.36
// 

public class aya extends axu implements awx
{
    private static final AtomicInteger f;
    private static final Logger g;
    private static final Random h;
    private float i;
    private String r;
    private avs s;
    private int t;
    private blz u;
    private boolean v;
    private final Object w;
    private String x;
    private String y;
    private String z;
    private static final jy A;
    private static final jy B;
    private static final jy[] C;
    public static final String a;
    private int D;
    private int E;
    private int F;
    private int G;
    private int H;
    private int I;
    private jy J;
    private avs K;
    
    public aya() {
        this.v = true;
        this.w = new Object();
        this.y = aya.a;
        this.r = "missingno";
        BufferedReader bufferedReader = null;
        try {
            final List<String> arrayList = (List<String>)Lists.newArrayList();
            bufferedReader = new BufferedReader(new InputStreamReader(ave.A().Q().a(aya.A).b(), Charsets.UTF_8));
            String s;
            while ((s = bufferedReader.readLine()) != null) {
                s = s.trim();
                if (!s.isEmpty()) {
                    arrayList.add(s);
                }
            }
            if (!arrayList.isEmpty()) {
                do {
                    this.r = arrayList.get(aya.h.nextInt(arrayList.size()));
                } while (this.r.hashCode() == 125780783);
            }
        }
        catch (IOException ex) {}
        finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                }
                catch (IOException ex2) {}
            }
        }
        this.i = aya.h.nextFloat();
        this.x = "";
        if (!GLContext.getCapabilities().OpenGL20 && !bqs.b()) {
            this.x = bnq.a("title.oldgl1", new Object[0]);
            this.y = bnq.a("title.oldgl2", new Object[0]);
            this.z = "https://help.mojang.com/customer/portal/articles/325948?ref=game";
        }
    }
    
    @Override
    public void e() {
        ++this.t;
    }
    
    @Override
    public boolean d() {
        return false;
    }
    
    @Override
    protected void a(final char \u2603, final int \u2603) {
    }
    
    @Override
    public void b() {
        this.u = new blz(256, 256);
        this.J = this.j.P().a("background", this.u);
        final Calendar instance = Calendar.getInstance();
        instance.setTime(new Date());
        if (instance.get(2) + 1 == 12 && instance.get(5) == 24) {
            this.r = "Merry X-mas!";
        }
        else if (instance.get(2) + 1 == 1 && instance.get(5) == 1) {
            this.r = "Happy new year!";
        }
        else if (instance.get(2) + 1 == 10 && instance.get(5) == 31) {
            this.r = "OOoooOOOoooo! Spooky!";
        }
        final int n = 24;
        final int n2 = this.m / 4 + 48;
        if (this.j.t()) {
            this.c(n2, 24);
        }
        else {
            this.b(n2, 24);
        }
        this.n.add(new avs(0, this.l / 2 - 100, n2 + 72 + 12, 98, 20, bnq.a("menu.options", new Object[0])));
        this.n.add(new avs(4, this.l / 2 + 2, n2 + 72 + 12, 98, 20, bnq.a("menu.quit", new Object[0])));
        this.n.add(new avz(5, this.l / 2 - 124, n2 + 72 + 12));
        synchronized (this.w) {
            this.E = this.q.a(this.x);
            this.D = this.q.a(this.y);
            final int max = Math.max(this.E, this.D);
            this.F = (this.l - max) / 2;
            this.G = this.n.get(0).i - 24;
            this.H = this.F + max;
            this.I = this.G + 24;
        }
        this.j.a(false);
    }
    
    private void b(final int \u2603, final int \u2603) {
        this.n.add(new avs(1, this.l / 2 - 100, \u2603, bnq.a("menu.singleplayer", new Object[0])));
        this.n.add(new avs(2, this.l / 2 - 100, \u2603 + \u2603 * 1, bnq.a("menu.multiplayer", new Object[0])));
        this.n.add(this.K = new avs(14, this.l / 2 - 100, \u2603 + \u2603 * 2, bnq.a("menu.online", new Object[0])));
    }
    
    private void c(final int \u2603, final int \u2603) {
        this.n.add(new avs(11, this.l / 2 - 100, \u2603, bnq.a("menu.playdemo", new Object[0])));
        this.n.add(this.s = new avs(12, this.l / 2 - 100, \u2603 + \u2603 * 1, bnq.a("menu.resetdemo", new Object[0])));
        final atr f = this.j.f();
        final ato c = f.c("Demo_World");
        if (c == null) {
            this.s.l = false;
        }
    }
    
    @Override
    protected void a(final avs \u2603) {
        if (\u2603.k == 0) {
            this.j.a(new axn(this, this.j.t));
        }
        if (\u2603.k == 5) {
            this.j.a(new axl(this, this.j.t, this.j.S()));
        }
        if (\u2603.k == 1) {
            this.j.a(new axv(this));
        }
        if (\u2603.k == 2) {
            this.j.a(new azh(this));
        }
        if (\u2603.k == 14 && this.K.m) {
            this.a();
        }
        if (\u2603.k == 4) {
            this.j.m();
        }
        if (\u2603.k == 11) {
            this.j.a("Demo_World", "Demo_World", kx.a);
        }
        if (\u2603.k == 12) {
            final atr f = this.j.f();
            final ato c = f.c("Demo_World");
            if (c != null) {
                final awy a = axv.a(this, c.k(), 12);
                this.j.a(a);
            }
        }
    }
    
    private void a() {
        final RealmsBridge realmsBridge = new RealmsBridge();
        realmsBridge.switchToRealms((axu)this);
    }
    
    @Override
    public void a(final boolean \u2603, final int \u2603) {
        if (\u2603 && \u2603 == 12) {
            final atr f = this.j.f();
            f.d();
            f.e("Demo_World");
            this.j.a(this);
        }
        else if (\u2603 == 13) {
            if (\u2603) {
                try {
                    final Class<?> forName = Class.forName("java.awt.Desktop");
                    final Object invoke = forName.getMethod("getDesktop", (Class<?>[])new Class[0]).invoke(null, new Object[0]);
                    forName.getMethod("browse", URI.class).invoke(invoke, new URI(this.z));
                }
                catch (Throwable throwable) {
                    aya.g.error("Couldn't open link", throwable);
                }
            }
            this.j.a(this);
        }
    }
    
    private void b(final int \u2603, final int \u2603, final float \u2603) {
        final bfx a = bfx.a();
        final bfd c = a.c();
        bfl.n(5889);
        bfl.E();
        bfl.D();
        Project.gluPerspective(120.0f, 1.0f, 0.05f, 10.0f);
        bfl.n(5888);
        bfl.E();
        bfl.D();
        bfl.c(1.0f, 1.0f, 1.0f, 1.0f);
        bfl.b(180.0f, 1.0f, 0.0f, 0.0f);
        bfl.b(90.0f, 0.0f, 0.0f, 1.0f);
        bfl.l();
        bfl.c();
        bfl.p();
        bfl.a(false);
        bfl.a(770, 771, 1, 0);
        for (int n = 8, i = 0; i < n * n; ++i) {
            bfl.E();
            final float \u26032 = (i % n / (float)n - 0.5f) / 64.0f;
            final float \u26033 = (i / n / (float)n - 0.5f) / 64.0f;
            final float \u26034 = 0.0f;
            bfl.b(\u26032, \u26033, \u26034);
            bfl.b(ns.a((this.t + \u2603) / 400.0f) * 25.0f + 20.0f, 1.0f, 0.0f, 0.0f);
            bfl.b(-(this.t + \u2603) * 0.1f, 0.0f, 1.0f, 0.0f);
            for (int j = 0; j < 6; ++j) {
                bfl.E();
                if (j == 1) {
                    bfl.b(90.0f, 0.0f, 1.0f, 0.0f);
                }
                if (j == 2) {
                    bfl.b(180.0f, 0.0f, 1.0f, 0.0f);
                }
                if (j == 3) {
                    bfl.b(-90.0f, 0.0f, 1.0f, 0.0f);
                }
                if (j == 4) {
                    bfl.b(90.0f, 1.0f, 0.0f, 0.0f);
                }
                if (j == 5) {
                    bfl.b(-90.0f, 1.0f, 0.0f, 0.0f);
                }
                this.j.P().a(aya.C[j]);
                c.a(7, bms.i);
                final int n2 = 255 / (i + 1);
                final float n3 = 0.0f;
                c.b(-1.0, -1.0, 1.0).a(0.0, 0.0).b(255, 255, 255, n2).d();
                c.b(1.0, -1.0, 1.0).a(1.0, 0.0).b(255, 255, 255, n2).d();
                c.b(1.0, 1.0, 1.0).a(1.0, 1.0).b(255, 255, 255, n2).d();
                c.b(-1.0, 1.0, 1.0).a(0.0, 1.0).b(255, 255, 255, n2).d();
                a.b();
                bfl.F();
            }
            bfl.F();
            bfl.a(true, true, true, false);
        }
        c.c(0.0, 0.0, 0.0);
        bfl.a(true, true, true, true);
        bfl.n(5889);
        bfl.F();
        bfl.n(5888);
        bfl.F();
        bfl.a(true);
        bfl.o();
        bfl.j();
    }
    
    private void a(final float \u2603) {
        this.j.P().a(this.J);
        GL11.glTexParameteri(3553, 10241, 9729);
        GL11.glTexParameteri(3553, 10240, 9729);
        GL11.glCopyTexSubImage2D(3553, 0, 0, 0, 0, 0, 256, 256);
        bfl.l();
        bfl.a(770, 771, 1, 0);
        bfl.a(true, true, true, false);
        final bfx a = bfx.a();
        final bfd c = a.c();
        c.a(7, bms.i);
        bfl.c();
        for (int n = 3, i = 0; i < n; ++i) {
            final float n2 = 1.0f / (i + 1);
            final int l = this.l;
            final int m = this.m;
            final float n3 = (i - n / 2) / 256.0f;
            c.b(l, m, (double)this.e).a(0.0f + n3, 1.0).a(1.0f, 1.0f, 1.0f, n2).d();
            c.b(l, 0.0, this.e).a(1.0f + n3, 1.0).a(1.0f, 1.0f, 1.0f, n2).d();
            c.b(0.0, 0.0, this.e).a(1.0f + n3, 0.0).a(1.0f, 1.0f, 1.0f, n2).d();
            c.b(0.0, m, this.e).a(0.0f + n3, 0.0).a(1.0f, 1.0f, 1.0f, n2).d();
        }
        a.b();
        bfl.d();
        bfl.a(true, true, true, true);
    }
    
    private void c(final int \u2603, final int \u2603, final float \u2603) {
        this.j.b().e();
        bfl.b(0, 0, 256, 256);
        this.b(\u2603, \u2603, \u2603);
        this.a(\u2603);
        this.a(\u2603);
        this.a(\u2603);
        this.a(\u2603);
        this.a(\u2603);
        this.a(\u2603);
        this.a(\u2603);
        this.j.b().a(true);
        bfl.b(0, 0, this.j.d, this.j.e);
        final float n = (this.l > this.m) ? (120.0f / this.l) : (120.0f / this.m);
        final float n2 = this.m * n / 256.0f;
        final float n3 = this.l * n / 256.0f;
        final int l = this.l;
        final int m = this.m;
        final bfx a = bfx.a();
        final bfd c = a.c();
        c.a(7, bms.i);
        c.b(0.0, m, this.e).a(0.5f - n2, 0.5f + n3).a(1.0f, 1.0f, 1.0f, 1.0f).d();
        c.b(l, m, (double)this.e).a(0.5f - n2, 0.5f - n3).a(1.0f, 1.0f, 1.0f, 1.0f).d();
        c.b(l, 0.0, this.e).a(0.5f + n2, 0.5f - n3).a(1.0f, 1.0f, 1.0f, 1.0f).d();
        c.b(0.0, 0.0, this.e).a(0.5f + n2, 0.5f + n3).a(1.0f, 1.0f, 1.0f, 1.0f).d();
        a.b();
    }
    
    @Override
    public void a(final int \u2603, final int \u2603, final float \u2603) {
        bfl.c();
        this.c(\u2603, \u2603, \u2603);
        bfl.d();
        final bfx a = bfx.a();
        final bfd c = a.c();
        final int n = 274;
        final int n2 = this.l / 2 - n / 2;
        final int n3 = 30;
        this.a(0, 0, this.l, this.m, -2130706433, 16777215);
        this.a(0, 0, this.l, this.m, 0, Integer.MIN_VALUE);
        this.j.P().a(aya.B);
        bfl.c(1.0f, 1.0f, 1.0f, 1.0f);
        if (this.i < 1.0E-4) {
            this.b(n2 + 0, n3 + 0, 0, 0, 99, 44);
            this.b(n2 + 99, n3 + 0, 129, 0, 27, 44);
            this.b(n2 + 99 + 26, n3 + 0, 126, 0, 3, 44);
            this.b(n2 + 99 + 26 + 3, n3 + 0, 99, 0, 26, 44);
            this.b(n2 + 155, n3 + 0, 0, 45, 155, 44);
        }
        else {
            this.b(n2 + 0, n3 + 0, 0, 0, 155, 44);
            this.b(n2 + 155, n3 + 0, 0, 45, 155, 44);
        }
        bfl.E();
        bfl.b((float)(this.l / 2 + 90), 70.0f, 0.0f);
        bfl.b(-20.0f, 0.0f, 0.0f, 1.0f);
        float n4 = 1.8f - ns.e(ns.a(ave.J() % 1000L / 1000.0f * 3.1415927f * 2.0f) * 0.1f);
        n4 = n4 * 100.0f / (this.q.a(this.r) + 32);
        bfl.a(n4, n4, n4);
        this.a(this.q, this.r, 0, -8, -256);
        bfl.F();
        String string = "Minecraft 1.8.8";
        if (this.j.t()) {
            string += " Demo";
        }
        this.c(this.q, string, 2, this.m - 10, -1);
        final String s = "Copyright Mojang AB. Do not distribute!";
        this.c(this.q, s, this.l - this.q.a(s) - 2, this.m - 10, -1);
        if (this.x != null && this.x.length() > 0) {
            avp.a(this.F - 2, this.G - 2, this.H + 2, this.I - 1, 1428160512);
            this.c(this.q, this.x, this.F, this.G, -1);
            this.c(this.q, this.y, (this.l - this.D) / 2, this.n.get(0).i - 12, -1);
        }
        super.a(\u2603, \u2603, \u2603);
    }
    
    @Override
    protected void a(final int \u2603, final int \u2603, final int \u2603) {
        super.a(\u2603, \u2603, \u2603);
        synchronized (this.w) {
            if (this.x.length() > 0 && \u2603 >= this.F && \u2603 <= this.H && \u2603 >= this.G && \u2603 <= this.I) {
                final aww \u26032 = new aww(this, this.z, 13, true);
                \u26032.f();
                this.j.a(\u26032);
            }
        }
    }
    
    static {
        f = new AtomicInteger(0);
        g = LogManager.getLogger();
        h = new Random();
        A = new jy("texts/splashes.txt");
        B = new jy("textures/gui/title/minecraft.png");
        C = new jy[] { new jy("textures/gui/title/background/panorama_0.png"), new jy("textures/gui/title/background/panorama_1.png"), new jy("textures/gui/title/background/panorama_2.png"), new jy("textures/gui/title/background/panorama_3.png"), new jy("textures/gui/title/background/panorama_4.png"), new jy("textures/gui/title/background/panorama_5.png") };
        a = "Please click " + a.t + "here" + a.v + " for more information.";
    }
}
