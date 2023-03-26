import org.apache.logging.log4j.LogManager;
import java.util.Collection;
import java.io.IOException;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.FutureCallback;
import java.io.File;
import java.util.Iterator;
import net.minecraft.realms.DisconnectedRealmsScreen;
import java.util.List;
import net.minecraft.client.ClientBrandRetriever;
import io.netty.buffer.Unpooled;
import com.google.common.collect.Maps;
import java.util.Random;
import java.util.UUID;
import java.util.Map;
import com.mojang.authlib.GameProfile;
import org.apache.logging.log4j.Logger;

// 
// Decompiled by Procyon v0.5.36
// 

public class bcy implements fj
{
    private static final Logger b;
    private final ek c;
    private final GameProfile d;
    private final axu e;
    private ave f;
    private bdb g;
    private boolean h;
    private final Map<UUID, bdc> i;
    public int a;
    private boolean j;
    private final Random k;
    
    public bcy(final ave \u2603, final axu \u2603, final ek \u2603, final GameProfile \u2603) {
        this.i = (Map<UUID, bdc>)Maps.newHashMap();
        this.a = 20;
        this.j = false;
        this.k = new Random();
        this.f = \u2603;
        this.e = \u2603;
        this.c = \u2603;
        this.d = \u2603;
    }
    
    public void b() {
        this.g = null;
    }
    
    @Override
    public void a(final gt \u2603) {
        fh.a((ff<bcy>)\u2603, this, this.f);
        this.f.c = new bda(this.f, this);
        this.g = new bdb(this, new adp(0L, \u2603.c(), false, \u2603.b(), \u2603.g()), \u2603.d(), \u2603.e(), this.f.A);
        this.f.t.ay = \u2603.e();
        this.f.a(this.g);
        this.f.h.am = \u2603.d();
        this.f.a(new axs(this));
        this.f.h.d(\u2603.a());
        this.a = \u2603.f();
        this.f.h.k(\u2603.h());
        this.f.c.a(\u2603.c());
        this.f.t.c();
        this.c.a(new im("MC|Brand", new em(Unpooled.buffer()).a(ClientBrandRetriever.getClientModName())));
    }
    
    @Override
    public void a(final fk \u2603) {
        fh.a((ff<bcy>)\u2603, this, this.f);
        final double \u26032 = \u2603.b() / 32.0;
        final double \u26033 = \u2603.c() / 32.0;
        final double \u26034 = \u2603.d() / 32.0;
        pk a = null;
        if (\u2603.j() == 10) {
            a = va.a(this.g, \u26032, \u26033, \u26034, va.a.a(\u2603.k()));
        }
        else if (\u2603.j() == 90) {
            final pk a2 = this.g.a(\u2603.k());
            if (a2 instanceof wn) {
                a = new ur(this.g, \u26032, \u26033, \u26034, (wn)a2);
            }
            \u2603.g(0);
        }
        else if (\u2603.j() == 60) {
            a = new wq(this.g, \u26032, \u26033, \u26034);
        }
        else if (\u2603.j() == 61) {
            a = new wx(this.g, \u26032, \u26033, \u26034);
        }
        else if (\u2603.j() == 71) {
            a = new uo(this.g, new cj(ns.c(\u26032), ns.c(\u26033), ns.c(\u26034)), cq.b(\u2603.k()));
            \u2603.g(0);
        }
        else if (\u2603.j() == 77) {
            a = new up(this.g, new cj(ns.c(\u26032), ns.c(\u26033), ns.c(\u26034)));
            \u2603.g(0);
        }
        else if (\u2603.j() == 65) {
            a = new xa(this.g, \u26032, \u26033, \u26034);
        }
        else if (\u2603.j() == 72) {
            a = new wr(this.g, \u26032, \u26033, \u26034);
        }
        else if (\u2603.j() == 76) {
            a = new wt(this.g, \u26032, \u26033, \u26034, null);
        }
        else if (\u2603.j() == 63) {
            a = new wu(this.g, \u26032, \u26033, \u26034, \u2603.e() / 8000.0, \u2603.f() / 8000.0, \u2603.g() / 8000.0);
            \u2603.g(0);
        }
        else if (\u2603.j() == 64) {
            a = new ww(this.g, \u26032, \u26033, \u26034, \u2603.e() / 8000.0, \u2603.f() / 8000.0, \u2603.g() / 8000.0);
            \u2603.g(0);
        }
        else if (\u2603.j() == 66) {
            a = new xd(this.g, \u26032, \u26033, \u26034, \u2603.e() / 8000.0, \u2603.f() / 8000.0, \u2603.g() / 8000.0);
            \u2603.g(0);
        }
        else if (\u2603.j() == 62) {
            a = new wz(this.g, \u26032, \u26033, \u26034);
        }
        else if (\u2603.j() == 73) {
            a = new xc(this.g, \u26032, \u26033, \u26034, \u2603.k());
            \u2603.g(0);
        }
        else if (\u2603.j() == 75) {
            a = new xb(this.g, \u26032, \u26033, \u26034);
            \u2603.g(0);
        }
        else if (\u2603.j() == 1) {
            a = new ux(this.g, \u26032, \u26033, \u26034);
        }
        else if (\u2603.j() == 50) {
            a = new vj(this.g, \u26032, \u26033, \u26034, null);
        }
        else if (\u2603.j() == 78) {
            a = new um(this.g, \u26032, \u26033, \u26034);
        }
        else if (\u2603.j() == 51) {
            a = new uf(this.g, \u26032, \u26033, \u26034);
        }
        else if (\u2603.j() == 2) {
            a = new uz(this.g, \u26032, \u26033, \u26034);
        }
        else if (\u2603.j() == 70) {
            a = new uy(this.g, \u26032, \u26033, \u26034, afh.d(\u2603.k() & 0xFFFF));
            \u2603.g(0);
        }
        if (a != null) {
            a.bW = \u2603.b();
            a.bX = \u2603.c();
            a.bY = \u2603.d();
            a.z = \u2603.h() * 360 / 256.0f;
            a.y = \u2603.i() * 360 / 256.0f;
            final pk[] ab = a.aB();
            if (ab != null) {
                final int n = \u2603.a() - a.F();
                for (int i = 0; i < ab.length; ++i) {
                    ab[i].d(ab[i].F() + n);
                }
            }
            a.d(\u2603.a());
            this.g.a(\u2603.a(), a);
            if (\u2603.k() > 0) {
                if (\u2603.j() == 60) {
                    final pk a3 = this.g.a(\u2603.k());
                    if (a3 instanceof pr && a instanceof wq) {
                        ((wq)a).c = a3;
                    }
                }
                a.i(\u2603.e() / 8000.0, \u2603.f() / 8000.0, \u2603.g() / 8000.0);
            }
        }
    }
    
    @Override
    public void a(final fl \u2603) {
        fh.a((ff<bcy>)\u2603, this, this.f);
        final pk \u26032 = new pp(this.g, \u2603.b() / 32.0, \u2603.c() / 32.0, \u2603.d() / 32.0, \u2603.e());
        \u26032.bW = \u2603.b();
        \u26032.bX = \u2603.c();
        \u26032.bY = \u2603.d();
        \u26032.y = 0.0f;
        \u26032.z = 0.0f;
        \u26032.d(\u2603.a());
        this.g.a(\u2603.a(), \u26032);
    }
    
    @Override
    public void a(final fm \u2603) {
        fh.a((ff<bcy>)\u2603, this, this.f);
        final double \u26032 = \u2603.b() / 32.0;
        final double \u26033 = \u2603.c() / 32.0;
        final double \u26034 = \u2603.d() / 32.0;
        pk \u26035 = null;
        if (\u2603.e() == 1) {
            \u26035 = new uv(this.g, \u26032, \u26033, \u26034);
        }
        if (\u26035 != null) {
            \u26035.bW = \u2603.b();
            \u26035.bX = \u2603.c();
            \u26035.bY = \u2603.d();
            \u26035.y = 0.0f;
            \u26035.z = 0.0f;
            \u26035.d(\u2603.a());
            this.g.c(\u26035);
        }
    }
    
    @Override
    public void a(final fo \u2603) {
        fh.a((ff<bcy>)\u2603, this, this.f);
        final uq \u26032 = new uq(this.g, \u2603.b(), \u2603.c(), \u2603.d());
        this.g.a(\u2603.a(), \u26032);
    }
    
    @Override
    public void a(final hm \u2603) {
        fh.a((ff<bcy>)\u2603, this, this.f);
        final pk a = this.g.a(\u2603.a());
        if (a == null) {
            return;
        }
        a.i(\u2603.b() / 8000.0, \u2603.c() / 8000.0, \u2603.d() / 8000.0);
    }
    
    @Override
    public void a(final hk \u2603) {
        fh.a((ff<bcy>)\u2603, this, this.f);
        final pk a = this.g.a(\u2603.b());
        if (a != null && \u2603.a() != null) {
            a.H().a(\u2603.a());
        }
    }
    
    @Override
    public void a(final fp \u2603) {
        fh.a((ff<bcy>)\u2603, this, this.f);
        final double \u26032 = \u2603.d() / 32.0;
        final double \u26033 = \u2603.e() / 32.0;
        final double \u26034 = \u2603.f() / 32.0;
        final float \u26035 = \u2603.g() * 360 / 256.0f;
        final float \u26036 = \u2603.h() * 360 / 256.0f;
        final bex bex3;
        final bex bex2;
        final bex bex;
        final bex \u26037 = bex = (bex2 = (bex3 = new bex(this.f.f, this.a(\u2603.c()).a())));
        final int d = \u2603.d();
        bex.bW = d;
        final double n = d;
        bex2.P = n;
        bex3.p = n;
        final bex bex4 = \u26037;
        final bex bex5 = \u26037;
        final bex bex6 = \u26037;
        final int e = \u2603.e();
        bex6.bX = e;
        final double n2 = e;
        bex5.Q = n2;
        bex4.q = n2;
        final bex bex7 = \u26037;
        final bex bex8 = \u26037;
        final bex bex9 = \u26037;
        final int f = \u2603.f();
        bex9.bY = f;
        final double n3 = f;
        bex8.R = n3;
        bex7.r = n3;
        final int i = \u2603.i();
        if (i == 0) {
            \u26037.bi.a[\u26037.bi.c] = null;
        }
        else {
            \u26037.bi.a[\u26037.bi.c] = new zx(zw.b(i), 1, 0);
        }
        \u26037.a(\u26032, \u26033, \u26034, \u26035, \u26036);
        this.g.a(\u2603.b(), \u26037);
        final List<pz.a> a = \u2603.a();
        if (a != null) {
            \u26037.H().a(a);
        }
    }
    
    @Override
    public void a(final hz \u2603) {
        fh.a((ff<bcy>)\u2603, this, this.f);
        final pk a = this.g.a(\u2603.a());
        if (a == null) {
            return;
        }
        a.bW = \u2603.b();
        a.bX = \u2603.c();
        a.bY = \u2603.d();
        final double \u26032 = a.bW / 32.0;
        final double \u26033 = a.bX / 32.0;
        final double \u26034 = a.bY / 32.0;
        final float n = \u2603.e() * 360 / 256.0f;
        final float n2 = \u2603.f() * 360 / 256.0f;
        if (Math.abs(a.s - \u26032) >= 0.03125 || Math.abs(a.t - \u26033) >= 0.015625 || Math.abs(a.u - \u26034) >= 0.03125) {
            a.a(\u26032, \u26033, \u26034, n, n2, 3, true);
        }
        else {
            a.a(a.s, a.t, a.u, n, n2, 3, true);
        }
        a.C = \u2603.g();
    }
    
    @Override
    public void a(final hi \u2603) {
        fh.a((ff<bcy>)\u2603, this, this.f);
        if (\u2603.a() >= 0 && \u2603.a() < wm.i()) {
            this.f.h.bi.c = \u2603.a();
        }
    }
    
    @Override
    public void a(final gv \u2603) {
        fh.a((ff<bcy>)\u2603, this, this.f);
        final pk a = \u2603.a(this.g);
        if (a == null) {
            return;
        }
        final pk pk = a;
        pk.bW += \u2603.a();
        final pk pk2 = a;
        pk2.bX += \u2603.b();
        final pk pk3 = a;
        pk3.bY += \u2603.c();
        final double \u26032 = a.bW / 32.0;
        final double \u26033 = a.bX / 32.0;
        final double \u26034 = a.bY / 32.0;
        final float \u26035 = \u2603.f() ? (\u2603.d() * 360 / 256.0f) : a.y;
        final float \u26036 = \u2603.f() ? (\u2603.e() * 360 / 256.0f) : a.z;
        a.a(\u26032, \u26033, \u26034, \u26035, \u26036, 3, false);
        a.C = \u2603.g();
    }
    
    @Override
    public void a(final hf \u2603) {
        fh.a((ff<bcy>)\u2603, this, this.f);
        final pk a = \u2603.a(this.g);
        if (a == null) {
            return;
        }
        final float \u26032 = \u2603.a() * 360 / 256.0f;
        a.f(\u26032);
    }
    
    @Override
    public void a(final hb \u2603) {
        fh.a((ff<bcy>)\u2603, this, this.f);
        for (int i = 0; i < \u2603.a().length; ++i) {
            this.g.e(\u2603.a()[i]);
        }
    }
    
    @Override
    public void a(final fi \u2603) {
        fh.a((ff<bcy>)\u2603, this, this.f);
        final wn h = this.f.h;
        double a = \u2603.a();
        double b = \u2603.b();
        double c = \u2603.c();
        float d = \u2603.d();
        float e = \u2603.e();
        if (\u2603.f().contains(fi.a.a)) {
            a += h.s;
        }
        else {
            h.v = 0.0;
        }
        if (\u2603.f().contains(fi.a.b)) {
            b += h.t;
        }
        else {
            h.w = 0.0;
        }
        if (\u2603.f().contains(fi.a.c)) {
            c += h.u;
        }
        else {
            h.x = 0.0;
        }
        if (\u2603.f().contains(fi.a.e)) {
            e += h.z;
        }
        if (\u2603.f().contains(fi.a.d)) {
            d += h.y;
        }
        h.a(a, b, c, d, e);
        this.c.a(new ip.b(h.s, h.aR().b, h.u, h.y, h.z, false));
        if (!this.h) {
            this.f.h.p = this.f.h.s;
            this.f.h.q = this.f.h.t;
            this.f.h.r = this.f.h.u;
            this.h = true;
            this.f.a((axu)null);
        }
    }
    
    @Override
    public void a(final fz \u2603) {
        fh.a((ff<bcy>)\u2603, this, this.f);
        for (final fz.a a2 : \u2603.a()) {
            this.g.b(a2.a(), a2.c());
        }
    }
    
    @Override
    public void a(final go \u2603) {
        fh.a((ff<bcy>)\u2603, this, this.f);
        if (\u2603.e()) {
            if (\u2603.d() == 0) {
                this.g.b(\u2603.b(), \u2603.c(), false);
                return;
            }
            this.g.b(\u2603.b(), \u2603.c(), true);
        }
        this.g.a(\u2603.b() << 4, 0, \u2603.c() << 4, (\u2603.b() << 4) + 15, 256, (\u2603.c() << 4) + 15);
        final amy a = this.g.a(\u2603.b(), \u2603.c());
        a.a(\u2603.a(), \u2603.d(), \u2603.e());
        this.g.b(\u2603.b() << 4, 0, \u2603.c() << 4, (\u2603.b() << 4) + 15, 256, (\u2603.c() << 4) + 15);
        if (!\u2603.e() || !(this.g.t instanceof ano)) {
            a.l();
        }
    }
    
    @Override
    public void a(final fv \u2603) {
        fh.a((ff<bcy>)\u2603, this, this.f);
        this.g.b(\u2603.b(), \u2603.a());
    }
    
    @Override
    public void a(final gh \u2603) {
        this.c.a(\u2603.a());
    }
    
    @Override
    public void a(final eu \u2603) {
        this.f.a((bdb)null);
        if (this.e != null) {
            if (this.e instanceof awr) {
                this.f.a(new DisconnectedRealmsScreen(((awr)this.e).a(), "disconnect.lost", \u2603).getProxy());
            }
            else {
                this.f.a(new axh(this.e, "disconnect.lost", \u2603));
            }
        }
        else {
            this.f.a(new axh(new azh(new aya()), "disconnect.lost", \u2603));
        }
    }
    
    public void a(final ff \u2603) {
        this.c.a(\u2603);
    }
    
    @Override
    public void a(final hy \u2603) {
        fh.a((ff<bcy>)\u2603, this, this.f);
        final pk a = this.g.a(\u2603.a());
        pr h = (pr)this.g.a(\u2603.b());
        if (h == null) {
            h = this.f.h;
        }
        if (a != null) {
            if (a instanceof pp) {
                this.g.a(a, "random.orb", 0.2f, ((this.k.nextFloat() - this.k.nextFloat()) * 0.7f + 1.0f) * 2.0f);
            }
            else {
                this.g.a(a, "random.pop", 0.2f, ((this.k.nextFloat() - this.k.nextFloat()) * 0.7f + 1.0f) * 2.0f);
            }
            this.f.j.a(new bdw(this.g, a, h, 0.5f));
            this.g.e(\u2603.a());
        }
    }
    
    @Override
    public void a(final fy \u2603) {
        fh.a((ff<bcy>)\u2603, this, this.f);
        if (\u2603.c() == 2) {
            this.f.q.a(\u2603.a(), false);
        }
        else {
            this.f.q.d().a(\u2603.a());
        }
    }
    
    @Override
    public void a(final fq \u2603) {
        fh.a((ff<bcy>)\u2603, this, this.f);
        final pk a = this.g.a(\u2603.a());
        if (a == null) {
            return;
        }
        if (\u2603.b() == 0) {
            final pr pr = (pr)a;
            pr.bw();
        }
        else if (\u2603.b() == 1) {
            a.ar();
        }
        else if (\u2603.b() == 2) {
            final wn wn = (wn)a;
            wn.a(false, false, false);
        }
        else if (\u2603.b() == 4) {
            this.f.j.a(a, cy.j);
        }
        else if (\u2603.b() == 5) {
            this.f.j.a(a, cy.k);
        }
    }
    
    @Override
    public void a(final ha \u2603) {
        fh.a((ff<bcy>)\u2603, this, this.f);
        \u2603.a(this.g).a(\u2603.a());
    }
    
    @Override
    public void a(final fn \u2603) {
        fh.a((ff<bcy>)\u2603, this, this.f);
        final double \u26032 = \u2603.d() / 32.0;
        final double \u26033 = \u2603.e() / 32.0;
        final double \u26034 = \u2603.f() / 32.0;
        final float \u26035 = \u2603.j() * 360 / 256.0f;
        final float \u26036 = \u2603.k() * 360 / 256.0f;
        final pr \u26037 = (pr)pm.a(\u2603.c(), this.f.f);
        \u26037.bW = \u2603.d();
        \u26037.bX = \u2603.e();
        \u26037.bY = \u2603.f();
        final pr pr = \u26037;
        final pr pr2 = \u26037;
        final float n = \u2603.l() * 360 / 256.0f;
        pr2.aK = n;
        pr.aI = n;
        final pk[] ab = \u26037.aB();
        if (ab != null) {
            final int n2 = \u2603.b() - \u26037.F();
            for (int i = 0; i < ab.length; ++i) {
                ab[i].d(ab[i].F() + n2);
            }
        }
        \u26037.d(\u2603.b());
        \u26037.a(\u26032, \u26033, \u26034, \u26035, \u26036);
        \u26037.v = \u2603.g() / 8000.0f;
        \u26037.w = \u2603.h() / 8000.0f;
        \u26037.x = \u2603.i() / 8000.0f;
        this.g.a(\u2603.b(), \u26037);
        final List<pz.a> a = \u2603.a();
        if (a != null) {
            \u26037.H().a(a);
        }
    }
    
    @Override
    public void a(final hu \u2603) {
        fh.a((ff<bcy>)\u2603, this, this.f);
        this.f.f.a(\u2603.a());
        this.f.f.b(\u2603.b());
    }
    
    @Override
    public void a(final ht \u2603) {
        fh.a((ff<bcy>)\u2603, this, this.f);
        this.f.h.a(\u2603.a(), true);
        this.f.f.P().a(\u2603.a());
    }
    
    @Override
    public void a(final hl \u2603) {
        fh.a((ff<bcy>)\u2603, this, this.f);
        pk pk = this.g.a(\u2603.b());
        final pk a = this.g.a(\u2603.c());
        if (\u2603.a() == 0) {
            boolean b = false;
            if (\u2603.b() == this.f.h.F()) {
                pk = this.f.h;
                if (a instanceof ux) {
                    ((ux)a).a(false);
                }
                b = (pk.m == null && a != null);
            }
            else if (a instanceof ux) {
                ((ux)a).a(true);
            }
            if (pk == null) {
                return;
            }
            pk.a(a);
            if (b) {
                final avh t = this.f.t;
                this.f.q.a(bnq.a("mount.onboard", avh.c(t.ac.i())), false);
            }
        }
        else if (\u2603.a() == 1 && pk instanceof ps) {
            if (a != null) {
                ((ps)pk).a(a, false);
            }
            else {
                ((ps)pk).a(false, false);
            }
        }
    }
    
    @Override
    public void a(final gi \u2603) {
        fh.a((ff<bcy>)\u2603, this, this.f);
        final pk a = \u2603.a(this.g);
        if (a != null) {
            if (\u2603.a() == 21) {
                this.f.W().a(new bpc((vt)a));
            }
            else {
                a.a(\u2603.a());
            }
        }
    }
    
    @Override
    public void a(final hp \u2603) {
        fh.a((ff<bcy>)\u2603, this, this.f);
        this.f.h.n(\u2603.a());
        this.f.h.cl().a(\u2603.b());
        this.f.h.cl().b(\u2603.c());
    }
    
    @Override
    public void a(final ho \u2603) {
        fh.a((ff<bcy>)\u2603, this, this.f);
        this.f.h.a(\u2603.a(), \u2603.b(), \u2603.c());
    }
    
    @Override
    public void a(final he \u2603) {
        fh.a((ff<bcy>)\u2603, this, this.f);
        if (\u2603.a() != this.f.h.am) {
            this.h = false;
            final auo z = this.g.Z();
            (this.g = new bdb(this, new adp(0L, \u2603.c(), false, this.f.f.P().t(), \u2603.d()), \u2603.a(), \u2603.b(), this.f.A)).a(z);
            this.f.a(this.g);
            this.f.h.am = \u2603.a();
            this.f.a(new axs(this));
        }
        this.f.a(\u2603.a());
        this.f.c.a(\u2603.c());
    }
    
    @Override
    public void a(final gk \u2603) {
        fh.a((ff<bcy>)\u2603, this, this.f);
        final adi adi = new adi(this.f.f, null, \u2603.d(), \u2603.e(), \u2603.f(), \u2603.g(), \u2603.h());
        adi.a(true);
        final bew h = this.f.h;
        h.v += \u2603.a();
        final bew h2 = this.f.h;
        h2.w += \u2603.b();
        final bew h3 = this.f.h;
        h3.x += \u2603.c();
    }
    
    @Override
    public void a(final gc \u2603) {
        fh.a((ff<bcy>)\u2603, this, this.f);
        final bew h = this.f.h;
        if ("minecraft:container".equals(\u2603.b())) {
            h.a(new oq(\u2603.c(), \u2603.d()));
            h.bk.d = \u2603.a();
        }
        else if ("minecraft:villager".equals(\u2603.b())) {
            h.a(new wg(h, \u2603.c()));
            h.bk.d = \u2603.a();
        }
        else if ("EntityHorse".equals(\u2603.b())) {
            final pk a = this.g.a(\u2603.e());
            if (a instanceof tp) {
                h.a((tp)a, new xj(\u2603.c(), \u2603.d()));
                h.bk.d = \u2603.a();
            }
        }
        else if (!\u2603.f()) {
            h.a(new bey(\u2603.b(), \u2603.c()));
            h.bk.d = \u2603.a();
        }
        else {
            final bez \u26032 = new bez(\u2603.b(), \u2603.c(), \u2603.d());
            h.a((og)\u26032);
            h.bk.d = \u2603.a();
        }
    }
    
    @Override
    public void a(final gf \u2603) {
        fh.a((ff<bcy>)\u2603, this, this.f);
        final wn h = this.f.h;
        if (\u2603.a() == -1) {
            h.bi.b(\u2603.c());
        }
        else {
            boolean b = false;
            if (this.f.m instanceof ayu) {
                final ayu ayu = (ayu)this.f.m;
                b = (ayu.f() != yz.m.a());
            }
            if (\u2603.a() == 0 && \u2603.b() >= 36 && \u2603.b() < 45) {
                final zx d = h.bj.a(\u2603.b()).d();
                if (\u2603.c() != null && (d == null || d.b < \u2603.c().b)) {
                    \u2603.c().c = 5;
                }
                h.bj.a(\u2603.b(), \u2603.c());
            }
            else if (\u2603.a() == h.bk.d && (\u2603.a() != 0 || !b)) {
                h.bk.a(\u2603.b(), \u2603.c());
            }
        }
    }
    
    @Override
    public void a(final ga \u2603) {
        fh.a((ff<bcy>)\u2603, this, this.f);
        xi xi = null;
        final wn h = this.f.h;
        if (\u2603.a() == 0) {
            xi = h.bj;
        }
        else if (\u2603.a() == h.bk.d) {
            xi = h.bk;
        }
        if (xi != null && !\u2603.c()) {
            this.a(new ii(\u2603.a(), \u2603.b(), true));
        }
    }
    
    @Override
    public void a(final gd \u2603) {
        fh.a((ff<bcy>)\u2603, this, this.f);
        final wn h = this.f.h;
        if (\u2603.a() == 0) {
            h.bj.a(\u2603.b());
        }
        else if (\u2603.a() == h.bk.d) {
            h.bk.a(\u2603.b());
        }
    }
    
    @Override
    public void a(final gw \u2603) {
        fh.a((ff<bcy>)\u2603, this, this.f);
        akw s = this.g.s(\u2603.a());
        if (!(s instanceof aln)) {
            s = new aln();
            s.a(this.g);
            s.a(\u2603.a());
        }
        this.f.h.a((aln)s);
    }
    
    @Override
    public void a(final hw \u2603) {
        fh.a((ff<bcy>)\u2603, this, this.f);
        boolean b = false;
        if (this.f.f.e(\u2603.a())) {
            final akw s = this.f.f.s(\u2603.a());
            if (s instanceof aln) {
                final aln aln = (aln)s;
                if (aln.b()) {
                    System.arraycopy(\u2603.b(), 0, aln.a, 0, 4);
                    aln.p_();
                }
                b = true;
            }
        }
        if (!b && this.f.h != null) {
            this.f.h.a(new fa("Unable to locate sign at " + \u2603.a().n() + ", " + \u2603.a().o() + ", " + \u2603.a().p()));
        }
    }
    
    @Override
    public void a(final ft \u2603) {
        fh.a((ff<bcy>)\u2603, this, this.f);
        if (this.f.f.e(\u2603.a())) {
            final akw s = this.f.f.s(\u2603.a());
            final int b = \u2603.b();
            if ((b == 1 && s instanceof all) || (b == 2 && s instanceof akz) || (b == 3 && s instanceof akv) || (b == 4 && s instanceof alo) || (b == 5 && s instanceof alg) || (b == 6 && s instanceof aku)) {
                s.a(\u2603.c());
            }
        }
    }
    
    @Override
    public void a(final ge \u2603) {
        fh.a((ff<bcy>)\u2603, this, this.f);
        final wn h = this.f.h;
        if (h.bk != null && h.bk.d == \u2603.a()) {
            h.bk.b(\u2603.b(), \u2603.c());
        }
    }
    
    @Override
    public void a(final hn \u2603) {
        fh.a((ff<bcy>)\u2603, this, this.f);
        final pk a = this.g.a(\u2603.b());
        if (a != null) {
            a.c(\u2603.c(), \u2603.a());
        }
    }
    
    @Override
    public void a(final gb \u2603) {
        fh.a((ff<bcy>)\u2603, this, this.f);
        this.f.h.q();
    }
    
    @Override
    public void a(final fu \u2603) {
        fh.a((ff<bcy>)\u2603, this, this.f);
        this.f.f.c(\u2603.a(), \u2603.d(), \u2603.b(), \u2603.c());
    }
    
    @Override
    public void a(final fs \u2603) {
        fh.a((ff<bcy>)\u2603, this, this.f);
        this.f.f.c(\u2603.a(), \u2603.b(), \u2603.c());
    }
    
    @Override
    public void a(final gp \u2603) {
        fh.a((ff<bcy>)\u2603, this, this.f);
        for (int i = 0; i < \u2603.a(); ++i) {
            final int a = \u2603.a(i);
            final int b = \u2603.b(i);
            this.g.b(a, b, true);
            this.g.a(a << 4, 0, b << 4, (a << 4) + 15, 256, (b << 4) + 15);
            final amy a2 = this.g.a(a, b);
            a2.a(\u2603.c(i), \u2603.d(i), true);
            this.g.b(a << 4, 0, b << 4, (a << 4) + 15, 256, (b << 4) + 15);
            if (!(this.g.t instanceof ano)) {
                a2.l();
            }
        }
    }
    
    @Override
    public void a(final gm \u2603) {
        fh.a((ff<bcy>)\u2603, this, this.f);
        final wn h = this.f.h;
        final int a = \u2603.a();
        final float b = \u2603.b();
        final int d = ns.d(b + 0.5f);
        if (a >= 0 && a < gm.a.length && gm.a[a] != null) {
            h.b(new fb(gm.a[a], new Object[0]));
        }
        if (a == 1) {
            this.g.P().b(true);
            this.g.k(0.0f);
        }
        else if (a == 2) {
            this.g.P().b(false);
            this.g.k(1.0f);
        }
        else if (a == 3) {
            this.f.c.a(adp.a.a(d));
        }
        else if (a == 4) {
            this.f.a(new ayc());
        }
        else if (a == 5) {
            final avh t = this.f.t;
            if (b == 0.0f) {
                this.f.a(new axf());
            }
            else if (b == 101.0f) {
                this.f.q.d().a(new fb("demo.help.movement", new Object[] { avh.c(t.X.i()), avh.c(t.Y.i()), avh.c(t.Z.i()), avh.c(t.aa.i()) }));
            }
            else if (b == 102.0f) {
                this.f.q.d().a(new fb("demo.help.jump", new Object[] { avh.c(t.ab.i()) }));
            }
            else if (b == 103.0f) {
                this.f.q.d().a(new fb("demo.help.inventory", new Object[] { avh.c(t.ae.i()) }));
            }
        }
        else if (a == 6) {
            this.g.a(h.s, h.t + h.aS(), h.u, "random.successful_hit", 0.18f, 0.45f, false);
        }
        else if (a == 7) {
            this.g.k(b);
        }
        else if (a == 8) {
            this.g.i(b);
        }
        else if (a == 10) {
            this.g.a(cy.P, h.s, h.t, h.u, 0.0, 0.0, 0.0, new int[0]);
            this.g.a(h.s, h.t, h.u, "mob.guardian.curse", 1.0f, 1.0f, false);
        }
    }
    
    @Override
    public void a(final gu \u2603) {
        fh.a((ff<bcy>)\u2603, this, this.f);
        final atg a = aab.a(\u2603.a(), this.f.f);
        \u2603.a(a);
        this.f.o.k().a(a);
    }
    
    @Override
    public void a(final gq \u2603) {
        fh.a((ff<bcy>)\u2603, this, this.f);
        if (\u2603.a()) {
            this.f.f.a(\u2603.b(), \u2603.d(), \u2603.c());
        }
        else {
            this.f.f.b(\u2603.b(), \u2603.d(), \u2603.c());
        }
    }
    
    @Override
    public void a(final fr \u2603) {
        fh.a((ff<bcy>)\u2603, this, this.f);
        boolean b = false;
        for (final Map.Entry<mw, Integer> entry : \u2603.a().entrySet()) {
            final mw mw = entry.getKey();
            final int intValue = entry.getValue();
            if (mw.d() && intValue > 0) {
                if (this.j && this.f.h.x().a(mw) == 0) {
                    final mq mq = (mq)mw;
                    this.f.p.a(mq);
                    this.f.Y().a(new bqe(mq), 0L);
                    if (mw == mr.f) {
                        this.f.t.I = false;
                        this.f.t.b();
                    }
                }
                b = true;
            }
            this.f.h.x().a(this.f.h, mw, intValue);
        }
        if (!this.j && !b && this.f.t.I) {
            this.f.p.b(mr.f);
        }
        this.j = true;
        if (this.f.m instanceof ayg) {
            ((ayg)this.f.m).a();
        }
    }
    
    @Override
    public void a(final ib \u2603) {
        fh.a((ff<bcy>)\u2603, this, this.f);
        final pk a = this.g.a(\u2603.b());
        if (!(a instanceof pr)) {
            return;
        }
        final pf \u26032 = new pf(\u2603.c(), \u2603.e(), \u2603.d(), false, \u2603.f());
        \u26032.b(\u2603.a());
        ((pr)a).c(\u26032);
    }
    
    @Override
    public void a(final gy \u2603) {
        fh.a((ff<bcy>)\u2603, this, this.f);
        final pk a = this.g.a(\u2603.c);
        final pr pr = (a instanceof pr) ? ((pr)a) : null;
        if (\u2603.a == gy.a.b) {
            final long n = 1000 * \u2603.d / 20;
            final bqf bqf = new bqf(this.f.h, pr);
            this.f.Y().a(bqf, 0L - n, 0L);
        }
        else if (\u2603.a == gy.a.c) {
            final pk a2 = this.g.a(\u2603.b);
            if (a2 instanceof wn) {
                final bqg bqg = new bqg((pr)a2, pr);
                bqg.a(\u2603.e);
                this.f.Y().a(bqg, 0L);
            }
        }
    }
    
    @Override
    public void a(final fw \u2603) {
        fh.a((ff<bcy>)\u2603, this, this.f);
        this.f.f.P().a(\u2603.b());
        this.f.f.P().e(\u2603.a());
    }
    
    @Override
    public void a(final hh \u2603) {
        fh.a((ff<bcy>)\u2603, this, this.f);
        final pk a = \u2603.a(this.g);
        if (a != null) {
            this.f.a(a);
        }
    }
    
    @Override
    public void a(final hg \u2603) {
        fh.a((ff<bcy>)\u2603, this, this.f);
        \u2603.a(this.g.af());
    }
    
    @Override
    public void a(final hv \u2603) {
        fh.a((ff<bcy>)\u2603, this, this.f);
        final hv.a a = \u2603.a();
        String \u26032 = null;
        String \u26033 = null;
        final String s = (\u2603.b() != null) ? \u2603.b().d() : "";
        switch (bcy$4.a[a.ordinal()]) {
            case 1: {
                \u26032 = s;
                break;
            }
            case 2: {
                \u26033 = s;
                break;
            }
            case 3: {
                this.f.q.a("", "", -1, -1, -1);
                this.f.q.a();
                return;
            }
        }
        this.f.q.a(\u26032, \u26033, \u2603.c(), \u2603.d(), \u2603.e());
    }
    
    @Override
    public void a(final gl \u2603) {
        if (!this.c.c()) {
            this.c.a(\u2603.a());
        }
    }
    
    @Override
    public void a(final hx \u2603) {
        this.f.q.h().b((\u2603.a().d().length() == 0) ? null : \u2603.a());
        this.f.q.h().a((\u2603.b().d().length() == 0) ? null : \u2603.b());
    }
    
    @Override
    public void a(final hc \u2603) {
        fh.a((ff<bcy>)\u2603, this, this.f);
        final pk a = this.g.a(\u2603.a());
        if (a instanceof pr) {
            ((pr)a).l(\u2603.b());
        }
    }
    
    @Override
    public void a(final gz \u2603) {
        fh.a((ff<bcy>)\u2603, this, this.f);
        for (final gz.b \u26032 : \u2603.a()) {
            if (\u2603.b() == gz.a.e) {
                this.i.remove(\u26032.a().getId());
            }
            else {
                bdc bdc = this.i.get(\u26032.a().getId());
                if (\u2603.b() == gz.a.a) {
                    bdc = new bdc(\u26032);
                    this.i.put(bdc.a().getId(), bdc);
                }
                if (bdc == null) {
                    continue;
                }
                switch (bcy$4.b[\u2603.b().ordinal()]) {
                    case 1: {
                        bdc.a(\u26032.c());
                        bdc.a(\u26032.b());
                        continue;
                    }
                    case 2: {
                        bdc.a(\u26032.c());
                        continue;
                    }
                    case 3: {
                        bdc.a(\u26032.b());
                        continue;
                    }
                    case 4: {
                        bdc.a(\u26032.d());
                        continue;
                    }
                }
            }
        }
    }
    
    @Override
    public void a(final gn \u2603) {
        this.a(new io(\u2603.a()));
    }
    
    @Override
    public void a(final gx \u2603) {
        fh.a((ff<bcy>)\u2603, this, this.f);
        final wn h = this.f.h;
        h.bA.b = \u2603.b();
        h.bA.d = \u2603.d();
        h.bA.a = \u2603.a();
        h.bA.c = \u2603.c();
        h.bA.a(\u2603.e());
        h.bA.b(\u2603.f());
    }
    
    @Override
    public void a(final fx \u2603) {
        fh.a((ff<bcy>)\u2603, this, this.f);
        final String[] a = \u2603.a();
        if (this.f.m instanceof awv) {
            final awv awv = (awv)this.f.m;
            awv.a(a);
        }
    }
    
    @Override
    public void a(final gs \u2603) {
        fh.a((ff<bcy>)\u2603, this, this.f);
        this.f.f.a(\u2603.b(), \u2603.c(), \u2603.d(), \u2603.a(), \u2603.e(), \u2603.f(), false);
    }
    
    @Override
    public void a(final hd \u2603) {
        final String a = \u2603.a();
        final String b = \u2603.b();
        if (a.startsWith("level://")) {
            final String substring = a.substring("level://".length());
            final File parent = new File(this.f.v, "saves");
            final File \u26032 = new File(parent, substring);
            if (\u26032.isFile()) {
                this.c.a(new iu(b, iu.a.d));
                Futures.addCallback((ListenableFuture)this.f.R().a(\u26032), (FutureCallback)new FutureCallback<Object>() {
                    @Override
                    public void onSuccess(final Object \u2603) {
                        bcy.this.c.a(new iu(b, iu.a.a));
                    }
                    
                    @Override
                    public void onFailure(final Throwable \u2603) {
                        bcy.this.c.a(new iu(b, iu.a.c));
                    }
                });
            }
            else {
                this.c.a(new iu(b, iu.a.c));
            }
            return;
        }
        if (this.f.D() != null && this.f.D().b() == bde.a.a) {
            this.c.a(new iu(b, iu.a.d));
            Futures.addCallback((ListenableFuture)this.f.R().a(a, b), (FutureCallback)new FutureCallback<Object>() {
                @Override
                public void onSuccess(final Object \u2603) {
                    bcy.this.c.a(new iu(b, iu.a.a));
                }
                
                @Override
                public void onFailure(final Throwable \u2603) {
                    bcy.this.c.a(new iu(b, iu.a.c));
                }
            });
        }
        else if (this.f.D() == null || this.f.D().b() == bde.a.c) {
            this.f.a(new Runnable() {
                @Override
                public void run() {
                    bcy.this.f.a(new awy(new awx() {
                        @Override
                        public void a(final boolean \u2603, final int \u2603) {
                            bcy.this.f = ave.A();
                            if (\u2603) {
                                if (bcy.this.f.D() != null) {
                                    bcy.this.f.D().a(bde.a.a);
                                }
                                bcy.this.c.a(new iu(b, iu.a.d));
                                Futures.addCallback((ListenableFuture)bcy.this.f.R().a(a, b), (FutureCallback)new FutureCallback<Object>() {
                                    @Override
                                    public void onSuccess(final Object \u2603) {
                                        bcy.this.c.a(new iu(b, iu.a.a));
                                    }
                                    
                                    @Override
                                    public void onFailure(final Throwable \u2603) {
                                        bcy.this.c.a(new iu(b, iu.a.c));
                                    }
                                });
                            }
                            else {
                                if (bcy.this.f.D() != null) {
                                    bcy.this.f.D().a(bde.a.b);
                                }
                                bcy.this.c.a(new iu(b, iu.a.b));
                            }
                            bdf.b(bcy.this.f.D());
                            bcy.this.f.a((axu)null);
                        }
                    }, bnq.a("multiplayer.texturePrompt.line1", new Object[0]), bnq.a("multiplayer.texturePrompt.line2", new Object[0]), 0));
                }
            });
        }
        else {
            this.c.a(new iu(b, iu.a.b));
        }
    }
    
    @Override
    public void a(final gj \u2603) {
        fh.a((ff<bcy>)\u2603, this, this.f);
        final pk a = \u2603.a(this.g);
        if (a != null) {
            a.g(\u2603.a());
        }
    }
    
    @Override
    public void a(final gg \u2603) {
        fh.a((ff<bcy>)\u2603, this, this.f);
        if ("MC|TrList".equals(\u2603.a())) {
            final em b = \u2603.b();
            try {
                final int int1 = b.readInt();
                final axu m = this.f.m;
                if (m != null && m instanceof azd && int1 == this.f.h.bk.d) {
                    final acy a = ((azd)m).a();
                    final ada b2 = ada.b(b);
                    a.a(b2);
                }
            }
            catch (IOException throwable) {
                bcy.b.error("Couldn't load trade info", throwable);
            }
            finally {
                b.release();
            }
        }
        else if ("MC|Brand".equals(\u2603.a())) {
            this.f.h.f(\u2603.b().c(32767));
        }
        else if ("MC|BOpen".equals(\u2603.a())) {
            final zx bz = this.f.h.bZ();
            if (bz != null && bz.b() == zy.bN) {
                this.f.a(new ayo(this.f.h, bz, false));
            }
        }
    }
    
    @Override
    public void a(final hq \u2603) {
        fh.a((ff<bcy>)\u2603, this, this.f);
        final auo z = this.g.Z();
        if (\u2603.c() == 0) {
            final auk \u26032 = z.a(\u2603.a(), auu.b);
            \u26032.a(\u2603.b());
            \u26032.a(\u2603.d());
        }
        else {
            final auk \u26032 = z.b(\u2603.a());
            if (\u2603.c() == 1) {
                z.k(\u26032);
            }
            else if (\u2603.c() == 2) {
                \u26032.a(\u2603.b());
                \u26032.a(\u2603.d());
            }
        }
    }
    
    @Override
    public void a(final hs \u2603) {
        fh.a((ff<bcy>)\u2603, this, this.f);
        final auo z = this.g.Z();
        final auk b = z.b(\u2603.b());
        if (\u2603.d() == hs.a.a) {
            final aum c = z.c(\u2603.a(), b);
            c.c(\u2603.c());
        }
        else if (\u2603.d() == hs.a.b) {
            if (nx.b(\u2603.b())) {
                z.d(\u2603.a(), null);
            }
            else if (b != null) {
                z.d(\u2603.a(), b);
            }
        }
    }
    
    @Override
    public void a(final hj \u2603) {
        fh.a((ff<bcy>)\u2603, this, this.f);
        final auo z = this.g.Z();
        if (\u2603.b().length() == 0) {
            z.a(\u2603.a(), null);
        }
        else {
            final auk b = z.b(\u2603.b());
            z.a(\u2603.a(), b);
        }
    }
    
    @Override
    public void a(final hr \u2603) {
        fh.a((ff<bcy>)\u2603, this, this.f);
        final auo z = this.g.Z();
        aul aul;
        if (\u2603.f() == 0) {
            aul = z.e(\u2603.a());
        }
        else {
            aul = z.d(\u2603.a());
        }
        if (\u2603.f() == 0 || \u2603.f() == 2) {
            aul.a(\u2603.b());
            aul.b(\u2603.c());
            aul.c(\u2603.d());
            aul.a(a.a(\u2603.h()));
            aul.a(\u2603.g());
            final auq.a a = auq.a.a(\u2603.i());
            if (a != null) {
                aul.a(a);
            }
        }
        if (\u2603.f() == 0 || \u2603.f() == 3) {
            for (final String s : \u2603.e()) {
                z.a(s, \u2603.a());
            }
        }
        if (\u2603.f() == 4) {
            for (final String s : \u2603.e()) {
                z.a(s, aul);
            }
        }
        if (\u2603.f() == 1) {
            z.d(aul);
        }
    }
    
    @Override
    public void a(final gr \u2603) {
        fh.a((ff<bcy>)\u2603, this, this.f);
        if (\u2603.j() == 0) {
            final double \u26032 = \u2603.i() * \u2603.f();
            final double \u26033 = \u2603.i() * \u2603.g();
            final double \u26034 = \u2603.i() * \u2603.h();
            try {
                this.g.a(\u2603.a(), \u2603.b(), \u2603.c(), \u2603.d(), \u2603.e(), \u26032, \u26033, \u26034, \u2603.k());
            }
            catch (Throwable t) {
                bcy.b.warn("Could not spawn particle effect " + \u2603.a());
            }
        }
        else {
            for (int i = 0; i < \u2603.j(); ++i) {
                final double n = this.k.nextGaussian() * \u2603.f();
                final double n2 = this.k.nextGaussian() * \u2603.g();
                final double n3 = this.k.nextGaussian() * \u2603.h();
                final double \u26035 = this.k.nextGaussian() * \u2603.i();
                final double \u26036 = this.k.nextGaussian() * \u2603.i();
                final double \u26037 = this.k.nextGaussian() * \u2603.i();
                try {
                    this.g.a(\u2603.a(), \u2603.b(), \u2603.c() + n, \u2603.d() + n2, \u2603.e() + n3, \u26035, \u26036, \u26037, \u2603.k());
                }
                catch (Throwable t2) {
                    bcy.b.warn("Could not spawn particle effect " + \u2603.a());
                    return;
                }
            }
        }
    }
    
    @Override
    public void a(final ia \u2603) {
        fh.a((ff<bcy>)\u2603, this, this.f);
        final pk a = this.g.a(\u2603.a());
        if (a == null) {
            return;
        }
        if (!(a instanceof pr)) {
            throw new IllegalStateException("Server tried to update attributes of a non-living entity (actually: " + a + ")");
        }
        final qf by = ((pr)a).by();
        for (final ia.a a2 : \u2603.b()) {
            qc qc = by.a(a2.a());
            if (qc == null) {
                qc = by.b(new qj(null, a2.a(), 0.0, Double.MIN_NORMAL, Double.MAX_VALUE));
            }
            qc.a(a2.b());
            qc.d();
            for (final qd qd : a2.c()) {
                qc.b(qd);
            }
        }
    }
    
    public ek a() {
        return this.c;
    }
    
    public Collection<bdc> d() {
        return this.i.values();
    }
    
    public bdc a(final UUID \u2603) {
        return this.i.get(\u2603);
    }
    
    public bdc a(final String \u2603) {
        for (final bdc bdc : this.i.values()) {
            if (bdc.a().getName().equals(\u2603)) {
                return bdc;
            }
        }
        return null;
    }
    
    public GameProfile e() {
        return this.d;
    }
    
    static {
        b = LogManager.getLogger();
    }
}
