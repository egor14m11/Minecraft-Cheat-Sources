import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class ux extends pk
{
    private boolean a;
    private double b;
    private int c;
    private double d;
    private double e;
    private double f;
    private double g;
    private double h;
    private double i;
    private double ar;
    private double as;
    
    public ux(final adm \u2603) {
        super(\u2603);
        this.a = true;
        this.b = 0.07;
        this.k = true;
        this.a(1.5f, 0.6f);
    }
    
    @Override
    protected boolean s_() {
        return false;
    }
    
    @Override
    protected void h() {
        this.ac.a(17, new Integer(0));
        this.ac.a(18, new Integer(1));
        this.ac.a(19, new Float(0.0f));
    }
    
    @Override
    public aug j(final pk \u2603) {
        return \u2603.aR();
    }
    
    @Override
    public aug S() {
        return this.aR();
    }
    
    @Override
    public boolean ae() {
        return true;
    }
    
    public ux(final adm \u2603, final double \u2603, final double \u2603, final double \u2603) {
        this(\u2603);
        this.b(\u2603, \u2603, \u2603);
        this.v = 0.0;
        this.w = 0.0;
        this.x = 0.0;
        this.p = \u2603;
        this.q = \u2603;
        this.r = \u2603;
    }
    
    @Override
    public double an() {
        return -0.3;
    }
    
    @Override
    public boolean a(final ow \u2603, final float \u2603) {
        if (this.b(\u2603)) {
            return false;
        }
        if (this.o.D || this.I) {
            return true;
        }
        if (this.l != null && this.l == \u2603.j() && \u2603 instanceof oy) {
            return false;
        }
        this.b(-this.m());
        this.a(10);
        this.a(this.j() + \u2603 * 10.0f);
        this.ac();
        final boolean b = \u2603.j() instanceof wn && ((wn)\u2603.j()).bA.d;
        if (b || this.j() > 40.0f) {
            if (this.l != null) {
                this.l.a(this);
            }
            if (!b && this.o.Q().b("doEntityDrops")) {
                this.a(zy.aE, 1, 0.0f);
            }
            this.J();
        }
        return true;
    }
    
    @Override
    public void ar() {
        this.b(-this.m());
        this.a(10);
        this.a(this.j() * 11.0f);
    }
    
    @Override
    public boolean ad() {
        return !this.I;
    }
    
    @Override
    public void a(final double \u2603, final double \u2603, final double \u2603, final float \u2603, final float \u2603, final int \u2603, final boolean \u2603) {
        if (\u2603 && this.l != null) {
            this.s = \u2603;
            this.p = \u2603;
            this.t = \u2603;
            this.q = \u2603;
            this.u = \u2603;
            this.r = \u2603;
            this.y = \u2603;
            this.z = \u2603;
            this.c = 0;
            this.b(\u2603, \u2603, \u2603);
            final double n = 0.0;
            this.i = n;
            this.v = n;
            final double n2 = 0.0;
            this.ar = n2;
            this.w = n2;
            final double n3 = 0.0;
            this.as = n3;
            this.x = n3;
            return;
        }
        if (this.a) {
            this.c = \u2603 + 5;
        }
        else {
            final double n4 = \u2603 - this.s;
            final double n5 = \u2603 - this.t;
            final double n6 = \u2603 - this.u;
            final double n7 = n4 * n4 + n5 * n5 + n6 * n6;
            if (n7 <= 1.0) {
                return;
            }
            this.c = 3;
        }
        this.d = \u2603;
        this.e = \u2603;
        this.f = \u2603;
        this.g = \u2603;
        this.h = \u2603;
        this.v = this.i;
        this.w = this.ar;
        this.x = this.as;
    }
    
    @Override
    public void i(final double \u2603, final double \u2603, final double \u2603) {
        this.v = \u2603;
        this.i = \u2603;
        this.w = \u2603;
        this.ar = \u2603;
        this.x = \u2603;
        this.as = \u2603;
    }
    
    @Override
    public void t_() {
        super.t_();
        if (this.l() > 0) {
            this.a(this.l() - 1);
        }
        if (this.j() > 0.0f) {
            this.a(this.j() - 1.0f);
        }
        this.p = this.s;
        this.q = this.t;
        this.r = this.u;
        final int n = 5;
        double n2 = 0.0;
        for (int i = 0; i < n; ++i) {
            final double \u2603 = this.aR().b + (this.aR().e - this.aR().b) * (i + 0) / n - 0.125;
            final double \u26032 = this.aR().b + (this.aR().e - this.aR().b) * (i + 1) / n - 0.125;
            final aug \u26033 = new aug(this.aR().a, \u2603, this.aR().c, this.aR().d, \u26032, this.aR().f);
            if (this.o.b(\u26033, arm.h)) {
                n2 += 1.0 / n;
            }
        }
        final double sqrt = Math.sqrt(this.v * this.v + this.x * this.x);
        if (sqrt > 0.2975) {
            final double n3 = Math.cos(this.y * 3.141592653589793 / 180.0);
            final double sin = Math.sin(this.y * 3.141592653589793 / 180.0);
            for (int c = 0; c < 1.0 + sqrt * 60.0; ++c) {
                final double n4 = this.V.nextFloat() * 2.0f - 1.0f;
                final double n5 = (this.V.nextInt(2) * 2 - 1) * 0.7;
                if (this.V.nextBoolean()) {
                    final double n6 = this.s - n3 * n4 * 0.8 + sin * n5;
                    final double n7 = this.u - sin * n4 * 0.8 - n3 * n5;
                    this.o.a(cy.f, n6, this.t - 0.125, n7, this.v, this.w, this.x, new int[0]);
                }
                else {
                    final double n6 = this.s + n3 + sin * n4 * 0.7;
                    final double n7 = this.u + sin - n3 * n4 * 0.7;
                    this.o.a(cy.f, n6, this.t - 0.125, n7, this.v, this.w, this.x, new int[0]);
                }
            }
        }
        if (this.o.D && this.a) {
            if (this.c > 0) {
                final double n3 = this.s + (this.d - this.s) / this.c;
                final double sin = this.t + (this.e - this.t) / this.c;
                final double \u26034 = this.u + (this.f - this.u) / this.c;
                final double g = ns.g(this.g - this.y);
                this.y += (float)(g / this.c);
                this.z += (float)((this.h - this.z) / this.c);
                --this.c;
                this.b(n3, sin, \u26034);
                this.b(this.y, this.z);
            }
            else {
                final double n3 = this.s + this.v;
                final double sin = this.t + this.w;
                final double \u26034 = this.u + this.x;
                this.b(n3, sin, \u26034);
                if (this.C) {
                    this.v *= 0.5;
                    this.w *= 0.5;
                    this.x *= 0.5;
                }
                this.v *= 0.9900000095367432;
                this.w *= 0.949999988079071;
                this.x *= 0.9900000095367432;
            }
            return;
        }
        if (n2 < 1.0) {
            final double n3 = n2 * 2.0 - 1.0;
            this.w += 0.03999999910593033 * n3;
        }
        else {
            if (this.w < 0.0) {
                this.w /= 2.0;
            }
            this.w += 0.007000000216066837;
        }
        if (this.l instanceof pr) {
            final pr pr = (pr)this.l;
            final float n8 = this.l.y + -pr.aZ * 90.0f;
            this.v += -Math.sin(n8 * 3.1415927f / 180.0f) * this.b * pr.ba * 0.05000000074505806;
            this.x += Math.cos(n8 * 3.1415927f / 180.0f) * this.b * pr.ba * 0.05000000074505806;
        }
        double n3 = Math.sqrt(this.v * this.v + this.x * this.x);
        if (n3 > 0.35) {
            final double sin = 0.35 / n3;
            this.v *= sin;
            this.x *= sin;
            n3 = 0.35;
        }
        if (n3 > sqrt && this.b < 0.35) {
            this.b += (0.35 - this.b) / 35.0;
            if (this.b > 0.35) {
                this.b = 0.35;
            }
        }
        else {
            this.b -= (this.b - 0.07) / 35.0;
            if (this.b < 0.07) {
                this.b = 0.07;
            }
        }
        for (int j = 0; j < 4; ++j) {
            final int c2 = ns.c(this.s + (j % 2 - 0.5) * 0.8);
            final int c = ns.c(this.u + (j / 2 - 0.5) * 0.8);
            for (int k = 0; k < 2; ++k) {
                final int \u26035 = ns.c(this.t) + k;
                final cj \u26036 = new cj(c2, \u26035, c);
                final afh c3 = this.o.p(\u26036).c();
                if (c3 == afi.aH) {
                    this.o.g(\u26036);
                    this.D = false;
                }
                else if (c3 == afi.bx) {
                    this.o.b(\u26036, true);
                    this.D = false;
                }
            }
        }
        if (this.C) {
            this.v *= 0.5;
            this.w *= 0.5;
            this.x *= 0.5;
        }
        this.d(this.v, this.w, this.x);
        if (this.D && sqrt > 0.2975) {
            if (!this.o.D && !this.I) {
                this.J();
                if (this.o.Q().b("doEntityDrops")) {
                    for (int j = 0; j < 3; ++j) {
                        this.a(zw.a(afi.f), 1, 0.0f);
                    }
                    for (int j = 0; j < 2; ++j) {
                        this.a(zy.y, 1, 0.0f);
                    }
                }
            }
        }
        else {
            this.v *= 0.9900000095367432;
            this.w *= 0.949999988079071;
            this.x *= 0.9900000095367432;
        }
        this.z = 0.0f;
        double sin = this.y;
        final double \u26034 = this.p - this.s;
        final double g = this.r - this.u;
        if (\u26034 * \u26034 + g * g > 0.001) {
            sin = (float)(ns.b(g, \u26034) * 180.0 / 3.141592653589793);
        }
        double g2 = ns.g(sin - this.y);
        if (g2 > 20.0) {
            g2 = 20.0;
        }
        if (g2 < -20.0) {
            g2 = -20.0;
        }
        this.b(this.y += (float)g2, this.z);
        if (this.o.D) {
            return;
        }
        final List<pk> b = this.o.b(this, this.aR().b(0.20000000298023224, 0.0, 0.20000000298023224));
        if (b != null && !b.isEmpty()) {
            for (int l = 0; l < b.size(); ++l) {
                final pk pk = b.get(l);
                if (pk != this.l && pk.ae() && pk instanceof ux) {
                    pk.i(this);
                }
            }
        }
        if (this.l != null && this.l.I) {
            this.l = null;
        }
    }
    
    @Override
    public void al() {
        if (this.l == null) {
            return;
        }
        final double n = Math.cos(this.y * 3.141592653589793 / 180.0) * 0.4;
        final double n2 = Math.sin(this.y * 3.141592653589793 / 180.0) * 0.4;
        this.l.b(this.s + n, this.t + this.an() + this.l.am(), this.u + n2);
    }
    
    @Override
    protected void b(final dn \u2603) {
    }
    
    @Override
    protected void a(final dn \u2603) {
    }
    
    @Override
    public boolean e(final wn \u2603) {
        if (this.l != null && this.l instanceof wn && this.l != \u2603) {
            return true;
        }
        if (!this.o.D) {
            \u2603.a(this);
        }
        return true;
    }
    
    @Override
    protected void a(final double \u2603, final boolean \u2603, final afh \u2603, final cj \u2603) {
        if (\u2603) {
            if (this.O > 3.0f) {
                this.e(this.O, 1.0f);
                if (!this.o.D && !this.I) {
                    this.J();
                    if (this.o.Q().b("doEntityDrops")) {
                        for (int i = 0; i < 3; ++i) {
                            this.a(zw.a(afi.f), 1, 0.0f);
                        }
                        for (int i = 0; i < 2; ++i) {
                            this.a(zy.y, 1, 0.0f);
                        }
                    }
                }
                this.O = 0.0f;
            }
        }
        else if (this.o.p(new cj(this).b()).c().t() != arm.h && \u2603 < 0.0) {
            this.O -= (float)\u2603;
        }
    }
    
    public void a(final float \u2603) {
        this.ac.b(19, \u2603);
    }
    
    public float j() {
        return this.ac.d(19);
    }
    
    public void a(final int \u2603) {
        this.ac.b(17, \u2603);
    }
    
    public int l() {
        return this.ac.c(17);
    }
    
    public void b(final int \u2603) {
        this.ac.b(18, \u2603);
    }
    
    public int m() {
        return this.ac.c(18);
    }
    
    public void a(final boolean \u2603) {
        this.a = \u2603;
    }
}
