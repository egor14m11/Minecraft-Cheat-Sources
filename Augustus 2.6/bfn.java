import org.lwjgl.opengl.GL11;

// 
// Decompiled by Procyon v0.5.36
// 

public class bfn
{
    private static final jy a;
    private static final jy b;
    private final ave c;
    private zx d;
    private float e;
    private float f;
    private final biu g;
    private final bjh h;
    private int i;
    
    public bfn(final ave \u2603) {
        this.i = -1;
        this.c = \u2603;
        this.g = \u2603.af();
        this.h = \u2603.ag();
    }
    
    public void a(final pr \u2603, final zx \u2603, final bgr.b \u2603) {
        if (\u2603 == null) {
            return;
        }
        final zw b = \u2603.b();
        final afh a = afh.a(b);
        bfl.E();
        if (this.h.a(\u2603)) {
            bfl.a(2.0f, 2.0f, 2.0f);
            if (this.a(a)) {
                bfl.a(false);
            }
        }
        this.h.a(\u2603, \u2603, \u2603);
        if (this.a(a)) {
            bfl.a(true);
        }
        bfl.F();
    }
    
    private boolean a(final afh \u2603) {
        return \u2603 != null && \u2603.m() == adf.d;
    }
    
    private void a(final float \u2603, final float \u2603) {
        bfl.E();
        bfl.b(\u2603, 1.0f, 0.0f, 0.0f);
        bfl.b(\u2603, 0.0f, 1.0f, 0.0f);
        avc.b();
        bfl.F();
    }
    
    private void a(final bet \u2603) {
        final int b = this.c.f.b(new cj(\u2603.s, \u2603.t + \u2603.aS(), \u2603.u), 0);
        final float \u26032 = (float)(b & 0xFFFF);
        final float \u26033 = (float)(b >> 16);
        bqs.a(bqs.r, \u26032, \u26033);
    }
    
    private void a(final bew \u2603, final float \u2603) {
        final float n = \u2603.i + (\u2603.g - \u2603.i) * \u2603;
        final float n2 = \u2603.h + (\u2603.f - \u2603.h) * \u2603;
        bfl.b((\u2603.z - n) * 0.1f, 1.0f, 0.0f, 0.0f);
        bfl.b((\u2603.y - n2) * 0.1f, 0.0f, 1.0f, 0.0f);
    }
    
    private float c(final float \u2603) {
        float a = 1.0f - \u2603 / 45.0f + 0.1f;
        a = ns.a(a, 0.0f, 1.0f);
        a = -ns.b(a * 3.1415927f) * 0.5f + 0.5f;
        return a;
    }
    
    private void a(final bln \u2603) {
        bfl.E();
        bfl.b(54.0f, 0.0f, 1.0f, 0.0f);
        bfl.b(64.0f, 1.0f, 0.0f, 0.0f);
        bfl.b(-62.0f, 0.0f, 0.0f, 1.0f);
        bfl.b(0.25f, -0.85f, 0.75f);
        \u2603.b((bet)this.c.h);
        bfl.F();
    }
    
    private void b(final bln \u2603) {
        bfl.E();
        bfl.b(92.0f, 0.0f, 1.0f, 0.0f);
        bfl.b(45.0f, 1.0f, 0.0f, 0.0f);
        bfl.b(41.0f, 0.0f, 0.0f, 1.0f);
        bfl.b(-0.3f, -1.1f, 0.45f);
        \u2603.c(this.c.h);
        bfl.F();
    }
    
    private void b(final bet \u2603) {
        this.c.P().a(\u2603.i());
        final biv<bet> a = this.g.a(this.c.h);
        final bln bln = (bln)a;
        if (!\u2603.ax()) {
            bfl.p();
            this.a(bln);
            this.b(bln);
            bfl.o();
        }
    }
    
    private void a(final bet \u2603, final float \u2603, final float \u2603, final float \u2603) {
        final float \u26032 = -0.4f * ns.a(ns.c(\u2603) * 3.1415927f);
        final float \u26033 = 0.2f * ns.a(ns.c(\u2603) * 3.1415927f * 2.0f);
        final float \u26034 = -0.2f * ns.a(\u2603 * 3.1415927f);
        bfl.b(\u26032, \u26033, \u26034);
        final float c = this.c(\u2603);
        bfl.b(0.0f, 0.04f, -0.72f);
        bfl.b(0.0f, \u2603 * -1.2f, 0.0f);
        bfl.b(0.0f, c * -0.5f, 0.0f);
        bfl.b(90.0f, 0.0f, 1.0f, 0.0f);
        bfl.b(c * -85.0f, 0.0f, 0.0f, 1.0f);
        bfl.b(0.0f, 1.0f, 0.0f, 0.0f);
        this.b(\u2603);
        final float a = ns.a(\u2603 * \u2603 * 3.1415927f);
        final float a2 = ns.a(ns.c(\u2603) * 3.1415927f);
        bfl.b(a * -20.0f, 0.0f, 1.0f, 0.0f);
        bfl.b(a2 * -20.0f, 0.0f, 0.0f, 1.0f);
        bfl.b(a2 * -80.0f, 1.0f, 0.0f, 0.0f);
        bfl.a(0.38f, 0.38f, 0.38f);
        bfl.b(90.0f, 0.0f, 1.0f, 0.0f);
        bfl.b(180.0f, 0.0f, 0.0f, 1.0f);
        bfl.b(0.0f, 1.0f, 0.0f, 0.0f);
        bfl.b(-1.0f, -1.0f, 0.0f);
        bfl.a(0.015625f, 0.015625f, 0.015625f);
        this.c.P().a(bfn.a);
        final bfx a3 = bfx.a();
        final bfd c2 = a3.c();
        GL11.glNormal3f(0.0f, 0.0f, -1.0f);
        c2.a(7, bms.g);
        c2.b(-7.0, 135.0, 0.0).a(0.0, 1.0).d();
        c2.b(135.0, 135.0, 0.0).a(1.0, 1.0).d();
        c2.b(135.0, -7.0, 0.0).a(1.0, 0.0).d();
        c2.b(-7.0, -7.0, 0.0).a(0.0, 0.0).d();
        a3.b();
        final atg a4 = zy.bd.a(this.d, this.c.f);
        if (a4 != null) {
            this.c.o.k().a(a4, false);
        }
    }
    
    private void a(final bet \u2603, final float \u2603, final float \u2603) {
        final float \u26032 = -0.3f * ns.a(ns.c(\u2603) * 3.1415927f);
        final float \u26033 = 0.4f * ns.a(ns.c(\u2603) * 3.1415927f * 2.0f);
        final float \u26034 = -0.4f * ns.a(\u2603 * 3.1415927f);
        bfl.b(\u26032, \u26033, \u26034);
        bfl.b(0.64000005f, -0.6f, -0.71999997f);
        bfl.b(0.0f, \u2603 * -0.6f, 0.0f);
        bfl.b(45.0f, 0.0f, 1.0f, 0.0f);
        final float a = ns.a(\u2603 * \u2603 * 3.1415927f);
        final float a2 = ns.a(ns.c(\u2603) * 3.1415927f);
        bfl.b(a2 * 70.0f, 0.0f, 1.0f, 0.0f);
        bfl.b(a * -20.0f, 0.0f, 0.0f, 1.0f);
        this.c.P().a(\u2603.i());
        bfl.b(-1.0f, 3.6f, 3.5f);
        bfl.b(120.0f, 0.0f, 0.0f, 1.0f);
        bfl.b(200.0f, 1.0f, 0.0f, 0.0f);
        bfl.b(-135.0f, 0.0f, 1.0f, 0.0f);
        bfl.a(1.0f, 1.0f, 1.0f);
        bfl.b(5.6f, 0.0f, 0.0f);
        final biv<bet> a3 = this.g.a(this.c.h);
        bfl.p();
        final bln bln = (bln)a3;
        bln.b((bet)this.c.h);
        bfl.o();
    }
    
    private void d(final float \u2603) {
        final float \u26032 = -0.4f * ns.a(ns.c(\u2603) * 3.1415927f);
        final float \u26033 = 0.2f * ns.a(ns.c(\u2603) * 3.1415927f * 2.0f);
        final float \u26034 = -0.2f * ns.a(\u2603 * 3.1415927f);
        bfl.b(\u26032, \u26033, \u26034);
    }
    
    private void a(final bet \u2603, final float \u2603) {
        final float n = \u2603.bR() - \u2603 + 1.0f;
        final float n2 = n / this.d.l();
        float e = ns.e(ns.b(n / 4.0f * 3.1415927f) * 0.1f);
        if (n2 >= 0.8f) {
            e = 0.0f;
        }
        bfl.b(0.0f, e, 0.0f);
        final float n3 = 1.0f - (float)Math.pow(n2, 27.0);
        bfl.b(n3 * 0.6f, n3 * -0.5f, n3 * 0.0f);
        bfl.b(n3 * 90.0f, 0.0f, 1.0f, 0.0f);
        bfl.b(n3 * 10.0f, 1.0f, 0.0f, 0.0f);
        bfl.b(n3 * 30.0f, 0.0f, 0.0f, 1.0f);
    }
    
    private void b(final float \u2603, final float \u2603) {
        bfl.b(0.56f, -0.52f, -0.71999997f);
        bfl.b(0.0f, \u2603 * -0.6f, 0.0f);
        bfl.b(45.0f, 0.0f, 1.0f, 0.0f);
        final float a = ns.a(\u2603 * \u2603 * 3.1415927f);
        final float a2 = ns.a(ns.c(\u2603) * 3.1415927f);
        bfl.b(a * -20.0f, 0.0f, 1.0f, 0.0f);
        bfl.b(a2 * -20.0f, 0.0f, 0.0f, 1.0f);
        bfl.b(a2 * -80.0f, 1.0f, 0.0f, 0.0f);
        bfl.a(0.4f, 0.4f, 0.4f);
    }
    
    private void a(final float \u2603, final bet \u2603) {
        bfl.b(-18.0f, 0.0f, 0.0f, 1.0f);
        bfl.b(-12.0f, 0.0f, 1.0f, 0.0f);
        bfl.b(-8.0f, 1.0f, 0.0f, 0.0f);
        bfl.b(-0.9f, 0.2f, 0.0f);
        final float n = this.d.l() - (\u2603.bR() - \u2603 + 1.0f);
        float n2 = n / 20.0f;
        n2 = (n2 * n2 + n2 * 2.0f) / 3.0f;
        if (n2 > 1.0f) {
            n2 = 1.0f;
        }
        if (n2 > 0.1f) {
            final float a = ns.a((n - 0.1f) * 1.3f);
            final float n3 = n2 - 0.1f;
            final float n4 = a * n3;
            bfl.b(n4 * 0.0f, n4 * 0.01f, n4 * 0.0f);
        }
        bfl.b(n2 * 0.0f, n2 * 0.0f, n2 * 0.1f);
        bfl.a(1.0f, 1.0f, 1.0f + n2 * 0.2f);
    }
    
    private void d() {
        bfl.b(-0.5f, 0.2f, 0.0f);
        bfl.b(30.0f, 0.0f, 1.0f, 0.0f);
        bfl.b(-80.0f, 1.0f, 0.0f, 0.0f);
        bfl.b(60.0f, 0.0f, 1.0f, 0.0f);
    }
    
    public void a(final float \u2603) {
        final float \u26032 = 1.0f - (this.f + (this.e - this.f) * \u2603);
        final bet h = this.c.h;
        final float l = h.l(\u2603);
        final float n = h.B + (h.z - h.B) * \u2603;
        final float \u26033 = h.A + (h.y - h.A) * \u2603;
        this.a(n, \u26033);
        this.a(h);
        this.a((bew)h, \u2603);
        bfl.B();
        bfl.E();
        if (this.d != null) {
            if (this.d.b() == zy.bd) {
                this.a(h, n, \u26032, l);
            }
            else if (h.bR() > 0) {
                final aba m = this.d.m();
                switch (bfn$1.a[m.ordinal()]) {
                    case 1: {
                        this.b(\u26032, 0.0f);
                        break;
                    }
                    case 2:
                    case 3: {
                        this.a(h, \u2603);
                        this.b(\u26032, 0.0f);
                        break;
                    }
                    case 4: {
                        this.b(\u26032, 0.0f);
                        this.d();
                        break;
                    }
                    case 5: {
                        this.b(\u26032, 0.0f);
                        this.a(\u2603, h);
                        break;
                    }
                }
            }
            else {
                this.d(l);
                this.b(\u26032, l);
            }
            this.a(h, this.d, bgr.b.c);
        }
        else if (!h.ax()) {
            this.a(h, \u26032, l);
        }
        bfl.F();
        bfl.C();
        avc.a();
    }
    
    public void b(final float \u2603) {
        bfl.c();
        if (this.c.h.aj()) {
            alz p = this.c.f.p(new cj(this.c.h));
            final wn h = this.c.h;
            for (int i = 0; i < 8; ++i) {
                final double \u26032 = h.s + ((i >> 0) % 2 - 0.5f) * h.J * 0.8f;
                final double n = h.t + ((i >> 1) % 2 - 0.5f) * 0.1f;
                final double \u26033 = h.u + ((i >> 2) % 2 - 0.5f) * h.J * 0.8f;
                final cj \u26034 = new cj(\u26032, n + h.aS(), \u26033);
                final alz p2 = this.c.f.p(\u26034);
                if (p2.c().w()) {
                    p = p2;
                }
            }
            if (p.c().b() != -1) {
                this.a(\u2603, this.c.ae().a().a(p));
            }
        }
        if (!this.c.h.v()) {
            if (this.c.h.a(arm.h)) {
                this.e(\u2603);
            }
            if (this.c.h.at()) {
                this.f(\u2603);
            }
        }
        bfl.d();
    }
    
    private void a(final float \u2603, final bmi \u2603) {
        this.c.P().a(bmh.g);
        final bfx a = bfx.a();
        final bfd c = a.c();
        final float n = 0.1f;
        bfl.c(0.1f, 0.1f, 0.1f, 0.5f);
        bfl.E();
        final float n2 = -1.0f;
        final float n3 = 1.0f;
        final float n4 = -1.0f;
        final float n5 = 1.0f;
        final float n6 = -0.5f;
        final float e = \u2603.e();
        final float f = \u2603.f();
        final float g = \u2603.g();
        final float h = \u2603.h();
        c.a(7, bms.g);
        c.b(-1.0, -1.0, -0.5).a(f, h).d();
        c.b(1.0, -1.0, -0.5).a(e, h).d();
        c.b(1.0, 1.0, -0.5).a(e, g).d();
        c.b(-1.0, 1.0, -0.5).a(f, g).d();
        a.b();
        bfl.F();
        bfl.c(1.0f, 1.0f, 1.0f, 1.0f);
    }
    
    private void e(final float \u2603) {
        this.c.P().a(bfn.b);
        final bfx a = bfx.a();
        final bfd c = a.c();
        final float c2 = this.c.h.c(\u2603);
        bfl.c(c2, c2, c2, 0.5f);
        bfl.l();
        bfl.a(770, 771, 1, 0);
        bfl.E();
        final float n = 4.0f;
        final float n2 = -1.0f;
        final float n3 = 1.0f;
        final float n4 = -1.0f;
        final float n5 = 1.0f;
        final float n6 = -0.5f;
        final float n7 = -this.c.h.y / 64.0f;
        final float n8 = this.c.h.z / 64.0f;
        c.a(7, bms.g);
        c.b(-1.0, -1.0, -0.5).a(4.0f + n7, 4.0f + n8).d();
        c.b(1.0, -1.0, -0.5).a(0.0f + n7, 4.0f + n8).d();
        c.b(1.0, 1.0, -0.5).a(0.0f + n7, 0.0f + n8).d();
        c.b(-1.0, 1.0, -0.5).a(4.0f + n7, 0.0f + n8).d();
        a.b();
        bfl.F();
        bfl.c(1.0f, 1.0f, 1.0f, 1.0f);
        bfl.k();
    }
    
    private void f(final float \u2603) {
        final bfx a = bfx.a();
        final bfd c = a.c();
        bfl.c(1.0f, 1.0f, 1.0f, 0.9f);
        bfl.c(519);
        bfl.a(false);
        bfl.l();
        bfl.a(770, 771, 1, 0);
        final float n = 1.0f;
        for (int i = 0; i < 2; ++i) {
            bfl.E();
            final bmi a2 = this.c.T().a("minecraft:blocks/fire_layer_1");
            this.c.P().a(bmh.g);
            final float e = a2.e();
            final float f = a2.f();
            final float g = a2.g();
            final float h = a2.h();
            final float n2 = (0.0f - n) / 2.0f;
            final float n3 = n2 + n;
            final float n4 = 0.0f - n / 2.0f;
            final float n5 = n4 + n;
            final float n6 = -0.5f;
            bfl.b(-(i * 2 - 1) * 0.24f, -0.3f, 0.0f);
            bfl.b((i * 2 - 1) * 10.0f, 0.0f, 1.0f, 0.0f);
            c.a(7, bms.g);
            c.b(n2, n4, (double)n6).a(f, h).d();
            c.b(n3, n4, (double)n6).a(e, h).d();
            c.b(n3, n5, (double)n6).a(e, g).d();
            c.b(n2, n5, (double)n6).a(f, g).d();
            a.b();
            bfl.F();
        }
        bfl.c(1.0f, 1.0f, 1.0f, 1.0f);
        bfl.k();
        bfl.a(true);
        bfl.c(515);
    }
    
    public void a() {
        this.f = this.e;
        final wn h = this.c.h;
        final zx h2 = h.bi.h();
        boolean b = false;
        if (this.d != null && h2 != null) {
            if (!this.d.c(h2)) {
                b = true;
            }
        }
        else {
            b = (this.d != null || h2 != null);
        }
        final float \u2603 = 0.4f;
        final float n = b ? 0.0f : 1.0f;
        final float a = ns.a(n - this.e, -\u2603, \u2603);
        this.e += a;
        if (this.e < 0.1f) {
            this.d = h2;
            this.i = h.bi.c;
        }
    }
    
    public void b() {
        this.e = 0.0f;
    }
    
    public void c() {
        this.e = 0.0f;
    }
    
    static {
        a = new jy("textures/map/map_background.png");
        b = new jy("textures/misc/underwater.png");
    }
}
