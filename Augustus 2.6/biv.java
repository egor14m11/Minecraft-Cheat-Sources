import org.lwjgl.opengl.GL11;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.5.36
// 

public abstract class biv<T extends pk>
{
    private static final jy a;
    protected final biu b;
    protected float c;
    protected float d;
    
    protected biv(final biu \u2603) {
        this.d = 1.0f;
        this.b = \u2603;
    }
    
    public boolean a(final T \u2603, final bia \u2603, final double \u2603, final double \u2603, final double \u2603) {
        aug ar = \u2603.aR();
        if (ar.b() || ar.a() == 0.0) {
            ar = new aug(\u2603.s - 2.0, \u2603.t - 2.0, \u2603.u - 2.0, \u2603.s + 2.0, \u2603.t + 2.0, \u2603.u + 2.0);
        }
        return \u2603.h(\u2603, \u2603, \u2603) && (\u2603.ah || \u2603.a(ar));
    }
    
    public void a(final T \u2603, final double \u2603, final double \u2603, final double \u2603, final float \u2603, final float \u2603) {
        this.a(\u2603, \u2603, \u2603, \u2603);
    }
    
    protected void a(final T \u2603, final double \u2603, final double \u2603, final double \u2603) {
        if (!this.b(\u2603)) {
            return;
        }
        this.a(\u2603, \u2603.f_().d(), \u2603, \u2603, \u2603, 64);
    }
    
    protected boolean b(final T \u2603) {
        return \u2603.aO() && \u2603.l_();
    }
    
    protected void a(final T \u2603, final double \u2603, final double \u2603, final double \u2603, final String \u2603, final float \u2603, final double \u2603) {
        this.a(\u2603, \u2603, \u2603, \u2603, \u2603, 64);
    }
    
    protected abstract jy a(final T p0);
    
    protected boolean c(final T \u2603) {
        final jy a = this.a(\u2603);
        if (a == null) {
            return false;
        }
        this.a(a);
        return true;
    }
    
    public void a(final jy \u2603) {
        this.b.a.a(\u2603);
    }
    
    private void a(final pk \u2603, final double \u2603, final double \u2603, final double \u2603, final float \u2603) {
        bfl.f();
        final bmh t = ave.A().T();
        final bmi a = t.a("minecraft:blocks/fire_layer_0");
        final bmi a2 = t.a("minecraft:blocks/fire_layer_1");
        bfl.E();
        bfl.b((float)\u2603, (float)\u2603, (float)\u2603);
        final float n = \u2603.J * 1.4f;
        bfl.a(n, n, n);
        final bfx a3 = bfx.a();
        final bfd c = a3.c();
        float n2 = 0.5f;
        final float n3 = 0.0f;
        float n4 = \u2603.K / n;
        float n5 = (float)(\u2603.t - \u2603.aR().b);
        bfl.b(-this.b.e, 0.0f, 1.0f, 0.0f);
        bfl.b(0.0f, 0.0f, -0.3f + (int)n4 * 0.02f);
        bfl.c(1.0f, 1.0f, 1.0f, 1.0f);
        float n6 = 0.0f;
        int n7 = 0;
        c.a(7, bms.g);
        while (n4 > 0.0f) {
            final bmi bmi = (n7 % 2 == 0) ? a : a2;
            this.a(bmh.g);
            float e = bmi.e();
            final float g = bmi.g();
            float f = bmi.f();
            final float h = bmi.h();
            if (n7 / 2 % 2 == 0) {
                final float n8 = f;
                f = e;
                e = n8;
            }
            c.b(n2 - n3, 0.0f - n5, (double)n6).a(f, h).d();
            c.b(-n2 - n3, 0.0f - n5, (double)n6).a(e, h).d();
            c.b(-n2 - n3, 1.4f - n5, (double)n6).a(e, g).d();
            c.b(n2 - n3, 1.4f - n5, (double)n6).a(f, g).d();
            n4 -= 0.45f;
            n5 -= 0.45f;
            n2 *= 0.9f;
            n6 += 0.03f;
            ++n7;
        }
        a3.b();
        bfl.F();
        bfl.e();
    }
    
    private void c(final pk \u2603, final double \u2603, final double \u2603, final double \u2603, final float \u2603, final float \u2603) {
        bfl.l();
        bfl.b(770, 771);
        this.b.a.a(biv.a);
        final adm a = this.a();
        bfl.a(false);
        float c = this.c;
        if (\u2603 instanceof ps) {
            final ps ps = (ps)\u2603;
            c *= ps.bT();
            if (ps.j_()) {
                c *= 0.5f;
            }
        }
        final double n = \u2603.P + (\u2603.s - \u2603.P) * \u2603;
        final double \u26032 = \u2603.Q + (\u2603.t - \u2603.Q) * \u2603;
        final double n2 = \u2603.R + (\u2603.u - \u2603.R) * \u2603;
        final int c2 = ns.c(n - c);
        final int c3 = ns.c(n + c);
        final int c4 = ns.c(\u26032 - c);
        final int c5 = ns.c(\u26032);
        final int c6 = ns.c(n2 - c);
        final int c7 = ns.c(n2 + c);
        final double \u26033 = \u2603 - n;
        final double \u26034 = \u2603 - \u26032;
        final double \u26035 = \u2603 - n2;
        final bfx a2 = bfx.a();
        final bfd c8 = a2.c();
        c8.a(7, bms.i);
        for (final cj cj : cj.b(new cj(c2, c4, c6), new cj(c3, c5, c7))) {
            final afh c9 = a.p(cj.b()).c();
            if (c9.b() != -1 && a.l(cj) > 3) {
                this.a(c9, \u2603, \u2603, \u2603, cj, \u2603, c, \u26033, \u26034, \u26035);
            }
        }
        a2.b();
        bfl.c(1.0f, 1.0f, 1.0f, 1.0f);
        bfl.k();
        bfl.a(true);
    }
    
    private adm a() {
        return this.b.b;
    }
    
    private void a(final afh \u2603, final double \u2603, final double \u2603, final double \u2603, final cj \u2603, final float \u2603, final float \u2603, final double \u2603, final double \u2603, final double \u2603) {
        if (!\u2603.d()) {
            return;
        }
        final bfx a = bfx.a();
        final bfd c = a.c();
        double n = (\u2603 - (\u2603 - (\u2603.o() + \u2603)) / 2.0) * 0.5 * this.a().o(\u2603);
        if (n < 0.0) {
            return;
        }
        if (n > 1.0) {
            n = 1.0;
        }
        final double n2 = \u2603.n() + \u2603.B() + \u2603;
        final double n3 = \u2603.n() + \u2603.C() + \u2603;
        final double n4 = \u2603.o() + \u2603.D() + \u2603 + 0.015625;
        final double n5 = \u2603.p() + \u2603.F() + \u2603;
        final double n6 = \u2603.p() + \u2603.G() + \u2603;
        final float n7 = (float)((\u2603 - n2) / 2.0 / \u2603 + 0.5);
        final float n8 = (float)((\u2603 - n3) / 2.0 / \u2603 + 0.5);
        final float n9 = (float)((\u2603 - n5) / 2.0 / \u2603 + 0.5);
        final float n10 = (float)((\u2603 - n6) / 2.0 / \u2603 + 0.5);
        c.b(n2, n4, n5).a(n7, n9).a(1.0f, 1.0f, 1.0f, (float)n).d();
        c.b(n2, n4, n6).a(n7, n10).a(1.0f, 1.0f, 1.0f, (float)n).d();
        c.b(n3, n4, n6).a(n8, n10).a(1.0f, 1.0f, 1.0f, (float)n).d();
        c.b(n3, n4, n5).a(n8, n9).a(1.0f, 1.0f, 1.0f, (float)n).d();
    }
    
    public static void a(final aug \u2603, final double \u2603, final double \u2603, final double \u2603) {
        bfl.x();
        final bfx a = bfx.a();
        final bfd c = a.c();
        bfl.c(1.0f, 1.0f, 1.0f, 1.0f);
        c.c(\u2603, \u2603, \u2603);
        c.a(7, bms.h);
        c.b(\u2603.a, \u2603.e, \u2603.c).c(0.0f, 0.0f, -1.0f).d();
        c.b(\u2603.d, \u2603.e, \u2603.c).c(0.0f, 0.0f, -1.0f).d();
        c.b(\u2603.d, \u2603.b, \u2603.c).c(0.0f, 0.0f, -1.0f).d();
        c.b(\u2603.a, \u2603.b, \u2603.c).c(0.0f, 0.0f, -1.0f).d();
        c.b(\u2603.a, \u2603.b, \u2603.f).c(0.0f, 0.0f, 1.0f).d();
        c.b(\u2603.d, \u2603.b, \u2603.f).c(0.0f, 0.0f, 1.0f).d();
        c.b(\u2603.d, \u2603.e, \u2603.f).c(0.0f, 0.0f, 1.0f).d();
        c.b(\u2603.a, \u2603.e, \u2603.f).c(0.0f, 0.0f, 1.0f).d();
        c.b(\u2603.a, \u2603.b, \u2603.c).c(0.0f, -1.0f, 0.0f).d();
        c.b(\u2603.d, \u2603.b, \u2603.c).c(0.0f, -1.0f, 0.0f).d();
        c.b(\u2603.d, \u2603.b, \u2603.f).c(0.0f, -1.0f, 0.0f).d();
        c.b(\u2603.a, \u2603.b, \u2603.f).c(0.0f, -1.0f, 0.0f).d();
        c.b(\u2603.a, \u2603.e, \u2603.f).c(0.0f, 1.0f, 0.0f).d();
        c.b(\u2603.d, \u2603.e, \u2603.f).c(0.0f, 1.0f, 0.0f).d();
        c.b(\u2603.d, \u2603.e, \u2603.c).c(0.0f, 1.0f, 0.0f).d();
        c.b(\u2603.a, \u2603.e, \u2603.c).c(0.0f, 1.0f, 0.0f).d();
        c.b(\u2603.a, \u2603.b, \u2603.f).c(-1.0f, 0.0f, 0.0f).d();
        c.b(\u2603.a, \u2603.e, \u2603.f).c(-1.0f, 0.0f, 0.0f).d();
        c.b(\u2603.a, \u2603.e, \u2603.c).c(-1.0f, 0.0f, 0.0f).d();
        c.b(\u2603.a, \u2603.b, \u2603.c).c(-1.0f, 0.0f, 0.0f).d();
        c.b(\u2603.d, \u2603.b, \u2603.c).c(1.0f, 0.0f, 0.0f).d();
        c.b(\u2603.d, \u2603.e, \u2603.c).c(1.0f, 0.0f, 0.0f).d();
        c.b(\u2603.d, \u2603.e, \u2603.f).c(1.0f, 0.0f, 0.0f).d();
        c.b(\u2603.d, \u2603.b, \u2603.f).c(1.0f, 0.0f, 0.0f).d();
        a.b();
        c.c(0.0, 0.0, 0.0);
        bfl.w();
    }
    
    public void b(final pk \u2603, final double \u2603, final double \u2603, final double \u2603, final float \u2603, final float \u2603) {
        if (this.b.g == null) {
            return;
        }
        if (this.b.g.W && this.c > 0.0f && !\u2603.ax() && this.b.a()) {
            final double b = this.b.b(\u2603.s, \u2603.t, \u2603.u);
            final float \u26032 = (float)((1.0 - b / 256.0) * this.d);
            if (\u26032 > 0.0f) {
                this.c(\u2603, \u2603, \u2603, \u2603, \u26032, \u2603);
            }
        }
        if (\u2603.aJ() && (!(\u2603 instanceof wn) || !((wn)\u2603).v())) {
            this.a(\u2603, \u2603, \u2603, \u2603, \u2603);
        }
    }
    
    public avn c() {
        return this.b.c();
    }
    
    protected void a(final T \u2603, final String \u2603, final double \u2603, final double \u2603, final double \u2603, final int \u2603) {
        final double h = \u2603.h(this.b.c);
        if (h > \u2603 * \u2603) {
            return;
        }
        final avn c = this.c();
        final float n = 1.6f;
        final float \u26032 = 0.016666668f * n;
        bfl.E();
        bfl.b((float)\u2603 + 0.0f, (float)\u2603 + \u2603.K + 0.5f, (float)\u2603);
        GL11.glNormal3f(0.0f, 1.0f, 0.0f);
        bfl.b(-this.b.e, 0.0f, 1.0f, 0.0f);
        bfl.b(this.b.f, 1.0f, 0.0f, 0.0f);
        bfl.a(-\u26032, -\u26032, \u26032);
        bfl.f();
        bfl.a(false);
        bfl.i();
        bfl.l();
        bfl.a(770, 771, 1, 0);
        final bfx a = bfx.a();
        final bfd c2 = a.c();
        int n2 = 0;
        if (\u2603.equals("deadmau5")) {
            n2 = -10;
        }
        final int n3 = c.a(\u2603) / 2;
        bfl.x();
        c2.a(7, bms.f);
        c2.b(-n3 - 1, -1 + n2, 0.0).a(0.0f, 0.0f, 0.0f, 0.25f).d();
        c2.b(-n3 - 1, 8 + n2, 0.0).a(0.0f, 0.0f, 0.0f, 0.25f).d();
        c2.b(n3 + 1, 8 + n2, 0.0).a(0.0f, 0.0f, 0.0f, 0.25f).d();
        c2.b(n3 + 1, -1 + n2, 0.0).a(0.0f, 0.0f, 0.0f, 0.25f).d();
        a.b();
        bfl.w();
        c.a(\u2603, -c.a(\u2603) / 2, n2, 553648127);
        bfl.j();
        bfl.a(true);
        c.a(\u2603, -c.a(\u2603) / 2, n2, -1);
        bfl.e();
        bfl.k();
        bfl.c(1.0f, 1.0f, 1.0f, 1.0f);
        bfl.F();
    }
    
    public biu d() {
        return this.b;
    }
    
    static {
        a = new jy("textures/misc/shadow.png");
    }
}
