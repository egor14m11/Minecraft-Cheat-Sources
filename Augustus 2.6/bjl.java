import org.apache.logging.log4j.LogManager;
import java.util.Iterator;
import org.lwjgl.opengl.GL11;
import com.google.common.collect.Lists;
import java.util.List;
import java.nio.FloatBuffer;
import org.apache.logging.log4j.Logger;

// 
// Decompiled by Procyon v0.5.36
// 

public abstract class bjl<T extends pr> extends biv<T>
{
    private static final Logger a;
    private static final blz e;
    protected bbo f;
    protected FloatBuffer g;
    protected List<blb<T>> h;
    protected boolean i;
    
    public bjl(final biu \u2603, final bbo \u2603, final float \u2603) {
        super(\u2603);
        this.g = avd.h(4);
        this.h = (List<blb<T>>)Lists.newArrayList();
        this.i = false;
        this.f = \u2603;
        this.c = \u2603;
    }
    
    protected <V extends pr, U extends blb<V>> boolean a(final U \u2603) {
        return this.h.add((blb<T>)\u2603);
    }
    
    protected <V extends pr, U extends blb<V>> boolean b(final U \u2603) {
        return this.h.remove(\u2603);
    }
    
    public bbo b() {
        return this.f;
    }
    
    protected float a(final float \u2603, final float \u2603, final float \u2603) {
        float n;
        for (n = \u2603 - \u2603; n < -180.0f; n += 360.0f) {}
        while (n >= 180.0f) {
            n -= 360.0f;
        }
        return \u2603 + \u2603 * n;
    }
    
    public void C_() {
    }
    
    @Override
    public void a(final T \u2603, final double \u2603, final double \u2603, final double \u2603, final float \u2603, final float \u2603) {
        bfl.E();
        bfl.p();
        this.f.p = this.d(\u2603, \u2603);
        this.f.q = \u2603.au();
        this.f.r = \u2603.j_();
        try {
            float \u26032 = this.a(\u2603.aJ, \u2603.aI, \u2603);
            final float a = this.a(\u2603.aL, \u2603.aK, \u2603);
            float \u26033 = a - \u26032;
            if (\u2603.au() && \u2603.m instanceof pr) {
                final pr pr = (pr)\u2603.m;
                \u26032 = this.a(pr.aJ, pr.aI, \u2603);
                \u26033 = a - \u26032;
                float \u26034 = ns.g(\u26033);
                if (\u26034 < -85.0f) {
                    \u26034 = -85.0f;
                }
                if (\u26034 >= 85.0f) {
                    \u26034 = 85.0f;
                }
                \u26032 = a - \u26034;
                if (\u26034 * \u26034 > 2500.0f) {
                    \u26032 += \u26034 * 0.2f;
                }
            }
            final float n = \u2603.B + (\u2603.z - \u2603.B) * \u2603;
            this.a(\u2603, \u2603, \u2603, \u2603);
            float \u26034 = this.b(\u2603, \u2603);
            this.a(\u2603, \u26034, \u26032, \u2603);
            bfl.B();
            bfl.a(-1.0f, -1.0f, 1.0f);
            this.a(\u2603, \u2603);
            final float n2 = 0.0625f;
            bfl.b(0.0f, -1.5078125f, 0.0f);
            float \u26035 = \u2603.aA + (\u2603.aB - \u2603.aA) * \u2603;
            float \u26036 = \u2603.aC - \u2603.aB * (1.0f - \u2603);
            if (\u2603.j_()) {
                \u26036 *= 3.0f;
            }
            if (\u26035 > 1.0f) {
                \u26035 = 1.0f;
            }
            bfl.d();
            this.f.a(\u2603, \u26036, \u26035, \u2603);
            this.f.a(\u26036, \u26035, \u26034, \u26033, n, 0.0625f, \u2603);
            if (this.i) {
                final boolean b = this.c(\u2603);
                this.a(\u2603, \u26036, \u26035, \u26034, \u26033, n, 0.0625f);
                if (b) {
                    this.e();
                }
            }
            else {
                final boolean b = this.c(\u2603, \u2603);
                this.a(\u2603, \u26036, \u26035, \u26034, \u26033, n, 0.0625f);
                if (b) {
                    this.f();
                }
                bfl.a(true);
                if (!(\u2603 instanceof wn) || !((wn)\u2603).v()) {
                    this.a(\u2603, \u26036, \u26035, \u2603, \u26034, \u26033, n, 0.0625f);
                }
            }
            bfl.C();
        }
        catch (Exception throwable) {
            bjl.a.error("Couldn't render entity", throwable);
        }
        bfl.g(bqs.r);
        bfl.w();
        bfl.g(bqs.q);
        bfl.o();
        bfl.F();
        if (!this.i) {
            super.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        }
    }
    
    @Override
    protected boolean c(final T \u2603) {
        int b = 16777215;
        if (\u2603 instanceof wn) {
            final aul aul = (aul)\u2603.bO();
            if (aul != null) {
                final String b2 = avn.b(aul.e());
                if (b2.length() >= 2) {
                    b = this.c().b(b2.charAt(1));
                }
            }
        }
        final float \u26032 = (b >> 16 & 0xFF) / 255.0f;
        final float \u26033 = (b >> 8 & 0xFF) / 255.0f;
        final float \u26034 = (b & 0xFF) / 255.0f;
        bfl.f();
        bfl.g(bqs.q);
        bfl.c(\u26032, \u26033, \u26034, 1.0f);
        bfl.x();
        bfl.g(bqs.r);
        bfl.x();
        bfl.g(bqs.q);
        return true;
    }
    
    protected void e() {
        bfl.e();
        bfl.g(bqs.q);
        bfl.w();
        bfl.g(bqs.r);
        bfl.w();
        bfl.g(bqs.q);
    }
    
    protected void a(final T \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603) {
        final boolean b = !\u2603.ax();
        final boolean b2 = !b && !\u2603.f(ave.A().h);
        if (b || b2) {
            if (!this.c(\u2603)) {
                return;
            }
            if (b2) {
                bfl.E();
                bfl.c(1.0f, 1.0f, 1.0f, 0.15f);
                bfl.a(false);
                bfl.l();
                bfl.b(770, 771);
                bfl.a(516, 0.003921569f);
            }
            this.f.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
            if (b2) {
                bfl.k();
                bfl.a(516, 0.1f);
                bfl.F();
                bfl.a(true);
            }
        }
    }
    
    protected boolean c(final T \u2603, final float \u2603) {
        return this.a(\u2603, \u2603, true);
    }
    
    protected boolean a(final T \u2603, final float \u2603, final boolean \u2603) {
        final float c = \u2603.c(\u2603);
        final int a = this.a(\u2603, c, \u2603);
        final boolean b = (a >> 24 & 0xFF) > 0;
        final boolean b2 = \u2603.au > 0 || \u2603.ax > 0;
        if (!b && !b2) {
            return false;
        }
        if (!b && !\u2603) {
            return false;
        }
        bfl.g(bqs.q);
        bfl.w();
        GL11.glTexEnvi(8960, 8704, bqs.t);
        GL11.glTexEnvi(8960, bqs.y, 8448);
        GL11.glTexEnvi(8960, bqs.z, bqs.q);
        GL11.glTexEnvi(8960, bqs.A, bqs.v);
        GL11.glTexEnvi(8960, bqs.C, 768);
        GL11.glTexEnvi(8960, bqs.D, 768);
        GL11.glTexEnvi(8960, bqs.F, 7681);
        GL11.glTexEnvi(8960, bqs.G, bqs.q);
        GL11.glTexEnvi(8960, bqs.J, 770);
        bfl.g(bqs.r);
        bfl.w();
        GL11.glTexEnvi(8960, 8704, bqs.t);
        GL11.glTexEnvi(8960, bqs.y, bqs.u);
        GL11.glTexEnvi(8960, bqs.z, bqs.w);
        GL11.glTexEnvi(8960, bqs.A, bqs.x);
        GL11.glTexEnvi(8960, bqs.B, bqs.w);
        GL11.glTexEnvi(8960, bqs.C, 768);
        GL11.glTexEnvi(8960, bqs.D, 768);
        GL11.glTexEnvi(8960, bqs.E, 770);
        GL11.glTexEnvi(8960, bqs.F, 7681);
        GL11.glTexEnvi(8960, bqs.G, bqs.x);
        GL11.glTexEnvi(8960, bqs.J, 770);
        this.g.position(0);
        if (b2) {
            this.g.put(1.0f);
            this.g.put(0.0f);
            this.g.put(0.0f);
            this.g.put(0.3f);
        }
        else {
            final float n = (a >> 24 & 0xFF) / 255.0f;
            final float n2 = (a >> 16 & 0xFF) / 255.0f;
            final float n3 = (a >> 8 & 0xFF) / 255.0f;
            final float n4 = (a & 0xFF) / 255.0f;
            this.g.put(n2);
            this.g.put(n3);
            this.g.put(n4);
            this.g.put(1.0f - n);
        }
        this.g.flip();
        GL11.glTexEnv(8960, 8705, this.g);
        bfl.g(bqs.s);
        bfl.w();
        bfl.i(bjl.e.b());
        GL11.glTexEnvi(8960, 8704, bqs.t);
        GL11.glTexEnvi(8960, bqs.y, 8448);
        GL11.glTexEnvi(8960, bqs.z, bqs.x);
        GL11.glTexEnvi(8960, bqs.A, bqs.r);
        GL11.glTexEnvi(8960, bqs.C, 768);
        GL11.glTexEnvi(8960, bqs.D, 768);
        GL11.glTexEnvi(8960, bqs.F, 7681);
        GL11.glTexEnvi(8960, bqs.G, bqs.x);
        GL11.glTexEnvi(8960, bqs.J, 770);
        bfl.g(bqs.q);
        return true;
    }
    
    protected void f() {
        bfl.g(bqs.q);
        bfl.w();
        GL11.glTexEnvi(8960, 8704, bqs.t);
        GL11.glTexEnvi(8960, bqs.y, 8448);
        GL11.glTexEnvi(8960, bqs.z, bqs.q);
        GL11.glTexEnvi(8960, bqs.A, bqs.v);
        GL11.glTexEnvi(8960, bqs.C, 768);
        GL11.glTexEnvi(8960, bqs.D, 768);
        GL11.glTexEnvi(8960, bqs.F, 8448);
        GL11.glTexEnvi(8960, bqs.G, bqs.q);
        GL11.glTexEnvi(8960, bqs.H, bqs.v);
        GL11.glTexEnvi(8960, bqs.J, 770);
        GL11.glTexEnvi(8960, bqs.K, 770);
        bfl.g(bqs.r);
        GL11.glTexEnvi(8960, 8704, bqs.t);
        GL11.glTexEnvi(8960, bqs.y, 8448);
        GL11.glTexEnvi(8960, bqs.C, 768);
        GL11.glTexEnvi(8960, bqs.D, 768);
        GL11.glTexEnvi(8960, bqs.z, 5890);
        GL11.glTexEnvi(8960, bqs.A, bqs.x);
        GL11.glTexEnvi(8960, bqs.F, 8448);
        GL11.glTexEnvi(8960, bqs.J, 770);
        GL11.glTexEnvi(8960, bqs.G, 5890);
        bfl.c(1.0f, 1.0f, 1.0f, 1.0f);
        bfl.g(bqs.s);
        bfl.x();
        bfl.i(0);
        GL11.glTexEnvi(8960, 8704, bqs.t);
        GL11.glTexEnvi(8960, bqs.y, 8448);
        GL11.glTexEnvi(8960, bqs.C, 768);
        GL11.glTexEnvi(8960, bqs.D, 768);
        GL11.glTexEnvi(8960, bqs.z, 5890);
        GL11.glTexEnvi(8960, bqs.A, bqs.x);
        GL11.glTexEnvi(8960, bqs.F, 8448);
        GL11.glTexEnvi(8960, bqs.J, 770);
        GL11.glTexEnvi(8960, bqs.G, 5890);
        bfl.g(bqs.q);
    }
    
    @Override
    protected void a(final T \u2603, final double \u2603, final double \u2603, final double \u2603) {
        bfl.b((float)\u2603, (float)\u2603, (float)\u2603);
    }
    
    protected void a(final T \u2603, final float \u2603, final float \u2603, final float \u2603) {
        bfl.b(180.0f - \u2603, 0.0f, 1.0f, 0.0f);
        if (\u2603.ax > 0) {
            float c = (\u2603.ax + \u2603 - 1.0f) / 20.0f * 1.6f;
            c = ns.c(c);
            if (c > 1.0f) {
                c = 1.0f;
            }
            bfl.b(c * this.b(\u2603), 0.0f, 0.0f, 1.0f);
        }
        else {
            final String a = a.a(\u2603.e_());
            if (a != null && (a.equals("Dinnerbone") || a.equals("Grumm")) && (!(\u2603 instanceof wn) || ((wn)\u2603).a(wo.a))) {
                bfl.b(0.0f, \u2603.K + 0.1f, 0.0f);
                bfl.b(180.0f, 0.0f, 0.0f, 1.0f);
            }
        }
    }
    
    protected float d(final T \u2603, final float \u2603) {
        return \u2603.l(\u2603);
    }
    
    protected float b(final T \u2603, final float \u2603) {
        return \u2603.W + \u2603;
    }
    
    protected void a(final T \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603) {
        for (final blb<T> blb : this.h) {
            final boolean a = this.a(\u2603, \u2603, blb.b());
            blb.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
            if (a) {
                this.f();
            }
        }
    }
    
    protected float b(final T \u2603) {
        return 90.0f;
    }
    
    protected int a(final T \u2603, final float \u2603, final float \u2603) {
        return 0;
    }
    
    protected void a(final T \u2603, final float \u2603) {
    }
    
    public void b(final T \u2603, final double \u2603, final double \u2603, final double \u2603) {
        if (!this.a(\u2603)) {
            return;
        }
        final double h = \u2603.h(this.b.c);
        final float n = \u2603.av() ? 32.0f : 64.0f;
        if (h >= n * n) {
            return;
        }
        final String d = \u2603.f_().d();
        final float n2 = 0.02666667f;
        bfl.a(516, 0.1f);
        if (\u2603.av()) {
            final avn c = this.c();
            bfl.E();
            bfl.b((float)\u2603, (float)\u2603 + \u2603.K + 0.5f - (\u2603.j_() ? (\u2603.K / 2.0f) : 0.0f), (float)\u2603);
            GL11.glNormal3f(0.0f, 1.0f, 0.0f);
            bfl.b(-this.b.e, 0.0f, 1.0f, 0.0f);
            bfl.b(this.b.f, 1.0f, 0.0f, 0.0f);
            bfl.a(-0.02666667f, -0.02666667f, 0.02666667f);
            bfl.b(0.0f, 9.374999f, 0.0f);
            bfl.f();
            bfl.a(false);
            bfl.l();
            bfl.x();
            bfl.a(770, 771, 1, 0);
            final int n3 = c.a(d) / 2;
            final bfx a = bfx.a();
            final bfd c2 = a.c();
            c2.a(7, bms.f);
            c2.b(-n3 - 1, -1.0, 0.0).a(0.0f, 0.0f, 0.0f, 0.25f).d();
            c2.b(-n3 - 1, 8.0, 0.0).a(0.0f, 0.0f, 0.0f, 0.25f).d();
            c2.b(n3 + 1, 8.0, 0.0).a(0.0f, 0.0f, 0.0f, 0.25f).d();
            c2.b(n3 + 1, -1.0, 0.0).a(0.0f, 0.0f, 0.0f, 0.25f).d();
            a.b();
            bfl.w();
            bfl.a(true);
            c.a(d, -c.a(d) / 2, 0, 553648127);
            bfl.e();
            bfl.k();
            bfl.c(1.0f, 1.0f, 1.0f, 1.0f);
            bfl.F();
        }
        else {
            this.a(\u2603, \u2603, \u2603 - (\u2603.j_() ? (\u2603.K / 2.0f) : 0.0), \u2603, d, 0.02666667f, h);
        }
    }
    
    protected boolean a(final T \u2603) {
        final bew h = ave.A().h;
        if (\u2603 instanceof wn && \u2603 != h) {
            final auq bo = \u2603.bO();
            final auq bo2 = h.bO();
            if (bo != null) {
                final auq.a i = bo.i();
                switch (bjl$1.a[i.ordinal()]) {
                    case 1: {
                        return true;
                    }
                    case 2: {
                        return false;
                    }
                    case 3: {
                        return bo2 == null || bo.a(bo2);
                    }
                    case 4: {
                        return bo2 == null || !bo.a(bo2);
                    }
                    default: {
                        return true;
                    }
                }
            }
        }
        return ave.v() && \u2603 != this.b.c && !\u2603.f(h) && \u2603.l == null;
    }
    
    public void a(final boolean \u2603) {
        this.i = \u2603;
    }
    
    static {
        a = LogManager.getLogger();
        e = new blz(16, 16);
        final int[] e2 = bjl.e.e();
        for (int i = 0; i < 256; ++i) {
            e2[i] = -1;
        }
        bjl.e.d();
    }
}
