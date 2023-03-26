import java.util.Arrays;
import java.util.Collection;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class ur extends pk
{
    private static final List<us> d;
    private static final List<us> e;
    private static final List<us> f;
    private int g;
    private int h;
    private int i;
    private afh ar;
    private boolean as;
    public int a;
    public wn b;
    private int at;
    private int au;
    private int av;
    private int aw;
    private int ax;
    private float ay;
    public pk c;
    private int az;
    private double aA;
    private double aB;
    private double aC;
    private double aD;
    private double aE;
    private double aF;
    private double aG;
    private double aH;
    
    public static List<us> j() {
        return ur.f;
    }
    
    public ur(final adm \u2603) {
        super(\u2603);
        this.g = -1;
        this.h = -1;
        this.i = -1;
        this.a(0.25f, 0.25f);
        this.ah = true;
    }
    
    public ur(final adm \u2603, final double \u2603, final double \u2603, final double \u2603, final wn \u2603) {
        this(\u2603);
        this.b(\u2603, \u2603, \u2603);
        this.ah = true;
        this.b = \u2603;
        \u2603.bG = this;
    }
    
    public ur(final adm \u2603, final wn \u2603) {
        super(\u2603);
        this.g = -1;
        this.h = -1;
        this.i = -1;
        this.ah = true;
        this.b = \u2603;
        (this.b.bG = this).a(0.25f, 0.25f);
        this.b(\u2603.s, \u2603.t + \u2603.aS(), \u2603.u, \u2603.y, \u2603.z);
        this.s -= ns.b(this.y / 180.0f * 3.1415927f) * 0.16f;
        this.t -= 0.10000000149011612;
        this.u -= ns.a(this.y / 180.0f * 3.1415927f) * 0.16f;
        this.b(this.s, this.t, this.u);
        final float n = 0.4f;
        this.v = -ns.a(this.y / 180.0f * 3.1415927f) * ns.b(this.z / 180.0f * 3.1415927f) * n;
        this.x = ns.b(this.y / 180.0f * 3.1415927f) * ns.b(this.z / 180.0f * 3.1415927f) * n;
        this.w = -ns.a(this.z / 180.0f * 3.1415927f) * n;
        this.c(this.v, this.w, this.x, 1.5f, 1.0f);
    }
    
    @Override
    protected void h() {
    }
    
    @Override
    public boolean a(final double \u2603) {
        double v = this.aR().a() * 4.0;
        if (Double.isNaN(v)) {
            v = 4.0;
        }
        v *= 64.0;
        return \u2603 < v * v;
    }
    
    public void c(double \u2603, double \u2603, double \u2603, final float \u2603, final float \u2603) {
        final float a = ns.a(\u2603 * \u2603 + \u2603 * \u2603 + \u2603 * \u2603);
        \u2603 /= a;
        \u2603 /= a;
        \u2603 /= a;
        \u2603 += this.V.nextGaussian() * 0.007499999832361937 * \u2603;
        \u2603 += this.V.nextGaussian() * 0.007499999832361937 * \u2603;
        \u2603 += this.V.nextGaussian() * 0.007499999832361937 * \u2603;
        \u2603 *= \u2603;
        \u2603 *= \u2603;
        \u2603 *= \u2603;
        this.v = \u2603;
        this.w = \u2603;
        this.x = \u2603;
        final float a2 = ns.a(\u2603 * \u2603 + \u2603 * \u2603);
        final float n = (float)(ns.b(\u2603, \u2603) * 180.0 / 3.1415927410125732);
        this.y = n;
        this.A = n;
        final float n2 = (float)(ns.b(\u2603, a2) * 180.0 / 3.1415927410125732);
        this.z = n2;
        this.B = n2;
        this.at = 0;
    }
    
    @Override
    public void a(final double \u2603, final double \u2603, final double \u2603, final float \u2603, final float \u2603, final int \u2603, final boolean \u2603) {
        this.aA = \u2603;
        this.aB = \u2603;
        this.aC = \u2603;
        this.aD = \u2603;
        this.aE = \u2603;
        this.az = \u2603;
        this.v = this.aF;
        this.w = this.aG;
        this.x = this.aH;
    }
    
    @Override
    public void i(final double \u2603, final double \u2603, final double \u2603) {
        this.v = \u2603;
        this.aF = \u2603;
        this.w = \u2603;
        this.aG = \u2603;
        this.x = \u2603;
        this.aH = \u2603;
    }
    
    @Override
    public void t_() {
        super.t_();
        if (this.az > 0) {
            final double \u2603 = this.s + (this.aA - this.s) / this.az;
            final double \u26032 = this.t + (this.aB - this.t) / this.az;
            final double \u26033 = this.u + (this.aC - this.u) / this.az;
            final double g = ns.g(this.aD - this.y);
            this.y += (float)(g / this.az);
            this.z += (float)((this.aE - this.z) / this.az);
            --this.az;
            this.b(\u2603, \u26032, \u26033);
            this.b(this.y, this.z);
            return;
        }
        if (!this.o.D) {
            final zx bz = this.b.bZ();
            if (this.b.I || !this.b.ai() || bz == null || bz.b() != zy.aR || this.h(this.b) > 1024.0) {
                this.J();
                this.b.bG = null;
                return;
            }
            if (this.c != null) {
                if (!this.c.I) {
                    this.s = this.c.s;
                    this.t = this.c.aR().b + this.c.K * 0.8;
                    this.u = this.c.u;
                    return;
                }
                this.c = null;
            }
        }
        if (this.a > 0) {
            --this.a;
        }
        if (this.as) {
            if (this.o.p(new cj(this.g, this.h, this.i)).c() == this.ar) {
                ++this.at;
                if (this.at == 1200) {
                    this.J();
                }
                return;
            }
            this.as = false;
            this.v *= this.V.nextFloat() * 0.2f;
            this.w *= this.V.nextFloat() * 0.2f;
            this.x *= this.V.nextFloat() * 0.2f;
            this.at = 0;
            this.au = 0;
        }
        else {
            ++this.au;
        }
        aui aui = new aui(this.s, this.t, this.u);
        aui aui2 = new aui(this.s + this.v, this.t + this.w, this.u + this.x);
        auh a = this.o.a(aui, aui2);
        aui = new aui(this.s, this.t, this.u);
        aui2 = new aui(this.s + this.v, this.t + this.w, this.u + this.x);
        if (a != null) {
            aui2 = new aui(a.c.a, a.c.b, a.c.c);
        }
        pk \u26034 = null;
        final List<pk> b = this.o.b(this, this.aR().a(this.v, this.w, this.x).b(1.0, 1.0, 1.0));
        double n = 0.0;
        for (int i = 0; i < b.size(); ++i) {
            final pk pk = b.get(i);
            if (pk.ad()) {
                if (pk != this.b || this.au >= 5) {
                    final float n2 = 0.3f;
                    final aug b2 = pk.aR().b(n2, n2, n2);
                    final auh a2 = b2.a(aui, aui2);
                    if (a2 != null) {
                        final double g2 = aui.g(a2.c);
                        if (g2 < n || n == 0.0) {
                            \u26034 = pk;
                            n = g2;
                        }
                    }
                }
            }
        }
        if (\u26034 != null) {
            a = new auh(\u26034);
        }
        if (a != null) {
            if (a.d != null) {
                if (a.d.a(ow.a(this, this.b), 0.0f)) {
                    this.c = a.d;
                }
            }
            else {
                this.as = true;
            }
        }
        if (this.as) {
            return;
        }
        this.d(this.v, this.w, this.x);
        final float a3 = ns.a(this.v * this.v + this.x * this.x);
        this.y = (float)(ns.b(this.v, this.x) * 180.0 / 3.1415927410125732);
        this.z = (float)(ns.b(this.w, a3) * 180.0 / 3.1415927410125732);
        while (this.z - this.B < -180.0f) {
            this.B -= 360.0f;
        }
        while (this.z - this.B >= 180.0f) {
            this.B += 360.0f;
        }
        while (this.y - this.A < -180.0f) {
            this.A -= 360.0f;
        }
        while (this.y - this.A >= 180.0f) {
            this.A += 360.0f;
        }
        this.z = this.B + (this.z - this.B) * 0.2f;
        this.y = this.A + (this.y - this.A) * 0.2f;
        float n3 = 0.92f;
        if (this.C || this.D) {
            n3 = 0.5f;
        }
        final int n4 = 5;
        double n5 = 0.0;
        for (int j = 0; j < n4; ++j) {
            final aug ar = this.aR();
            final double n6 = ar.e - ar.b;
            final double \u26035 = ar.b + n6 * j / n4;
            final double \u26036 = ar.b + n6 * (j + 1) / n4;
            final aug \u26037 = new aug(ar.a, \u26035, ar.c, ar.d, \u26036, ar.f);
            if (this.o.b(\u26037, arm.h)) {
                n5 += 1.0 / n4;
            }
        }
        if (!this.o.D && n5 > 0.0) {
            final le le = (le)this.o;
            int n7 = 1;
            final cj a4 = new cj(this).a();
            if (this.V.nextFloat() < 0.25f && this.o.C(a4)) {
                n7 = 2;
            }
            if (this.V.nextFloat() < 0.5f && !this.o.i(a4)) {
                --n7;
            }
            if (this.av > 0) {
                --this.av;
                if (this.av <= 0) {
                    this.aw = 0;
                    this.ax = 0;
                }
            }
            else if (this.ax > 0) {
                this.ax -= n7;
                if (this.ax <= 0) {
                    this.w -= 0.20000000298023224;
                    this.a("random.splash", 0.25f, 1.0f + (this.V.nextFloat() - this.V.nextFloat()) * 0.4f);
                    final float n8 = (float)ns.c(this.aR().b);
                    le.a(cy.e, this.s, n8 + 1.0f, this.u, (int)(1.0f + this.J * 20.0f), this.J, 0.0, this.J, 0.20000000298023224, new int[0]);
                    le.a(cy.g, this.s, n8 + 1.0f, this.u, (int)(1.0f + this.J * 20.0f), this.J, 0.0, this.J, 0.20000000298023224, new int[0]);
                    this.av = ns.a(this.V, 10, 30);
                }
                else {
                    this.ay += (float)(this.V.nextGaussian() * 4.0);
                    final float n8 = this.ay * 0.017453292f;
                    final float a5 = ns.a(n8);
                    final float n9 = ns.b(n8);
                    final double \u26036 = this.s + a5 * this.ax * 0.1f;
                    final double \u26038 = ns.c(this.aR().b) + 1.0f;
                    final double n10 = this.u + n9 * this.ax * 0.1f;
                    final afh afh = le.p(new cj((int)\u26036, (int)\u26038 - 1, (int)n10)).c();
                    if (afh == afi.j || afh == afi.i) {
                        if (this.V.nextFloat() < 0.15f) {
                            le.a(cy.e, \u26036, \u26038 - 0.10000000149011612, n10, 1, a5, 0.1, n9, 0.0, new int[0]);
                        }
                        final float n11 = a5 * 0.04f;
                        final float n12 = n9 * 0.04f;
                        le.a(cy.g, \u26036, \u26038, n10, 0, n12, 0.01, -n11, 1.0, new int[0]);
                        le.a(cy.g, \u26036, \u26038, n10, 0, -n12, 0.01, n11, 1.0, new int[0]);
                    }
                }
            }
            else if (this.aw > 0) {
                this.aw -= n7;
                float n8 = 0.15f;
                if (this.aw < 20) {
                    n8 += (float)((20 - this.aw) * 0.05);
                }
                else if (this.aw < 40) {
                    n8 += (float)((40 - this.aw) * 0.02);
                }
                else if (this.aw < 60) {
                    n8 += (float)((60 - this.aw) * 0.01);
                }
                if (this.V.nextFloat() < n8) {
                    final float a5 = ns.a(this.V, 0.0f, 360.0f) * 0.017453292f;
                    final float n9 = ns.a(this.V, 25.0f, 60.0f);
                    final double \u26036 = this.s + ns.a(a5) * n9 * 0.1f;
                    final double \u26038 = ns.c(this.aR().b) + 1.0f;
                    final double n10 = this.u + ns.b(a5) * n9 * 0.1f;
                    final afh afh = le.p(new cj((int)\u26036, (int)\u26038 - 1, (int)n10)).c();
                    if (afh == afi.j || afh == afi.i) {
                        le.a(cy.f, \u26036, \u26038, n10, 2 + this.V.nextInt(2), 0.10000000149011612, 0.0, 0.10000000149011612, 0.0, new int[0]);
                    }
                }
                if (this.aw <= 0) {
                    this.ay = ns.a(this.V, 0.0f, 360.0f);
                    this.ax = ns.a(this.V, 20, 80);
                }
            }
            else {
                this.aw = ns.a(this.V, 100, 900);
                this.aw -= ack.h(this.b) * 20 * 5;
            }
            if (this.av > 0) {
                this.w -= this.V.nextFloat() * this.V.nextFloat() * this.V.nextFloat() * 0.2;
            }
        }
        final double g2 = n5 * 2.0 - 1.0;
        this.w += 0.03999999910593033 * g2;
        if (n5 > 0.0) {
            n3 *= (float)0.9;
            this.w *= 0.8;
        }
        this.v *= n3;
        this.w *= n3;
        this.x *= n3;
        this.b(this.s, this.t, this.u);
    }
    
    public void b(final dn \u2603) {
        \u2603.a("xTile", (short)this.g);
        \u2603.a("yTile", (short)this.h);
        \u2603.a("zTile", (short)this.i);
        final jy jy = afh.c.c(this.ar);
        \u2603.a("inTile", (jy == null) ? "" : jy.toString());
        \u2603.a("shake", (byte)this.a);
        \u2603.a("inGround", (byte)(this.as ? 1 : 0));
    }
    
    public void a(final dn \u2603) {
        this.g = \u2603.e("xTile");
        this.h = \u2603.e("yTile");
        this.i = \u2603.e("zTile");
        if (\u2603.b("inTile", 8)) {
            this.ar = afh.b(\u2603.j("inTile"));
        }
        else {
            this.ar = afh.c(\u2603.d("inTile") & 0xFF);
        }
        this.a = (\u2603.d("shake") & 0xFF);
        this.as = (\u2603.d("inGround") == 1);
    }
    
    public int l() {
        if (this.o.D) {
            return 0;
        }
        int n = 0;
        if (this.c != null) {
            final double n2 = this.b.s - this.s;
            final double n3 = this.b.t - this.t;
            final double n4 = this.b.u - this.u;
            final double \u2603 = ns.a(n2 * n2 + n3 * n3 + n4 * n4);
            final double n5 = 0.1;
            final pk c = this.c;
            c.v += n2 * n5;
            final pk c2 = this.c;
            c2.w += n3 * n5 + ns.a(\u2603) * 0.08;
            final pk c3 = this.c;
            c3.x += n4 * n5;
            n = 3;
        }
        else if (this.av > 0) {
            final uz \u26032 = new uz(this.o, this.s, this.t, this.u, this.m());
            final double n6 = this.b.s - this.s;
            final double n7 = this.b.t - this.t;
            final double n8 = this.b.u - this.u;
            final double \u26033 = ns.a(n6 * n6 + n7 * n7 + n8 * n8);
            final double n9 = 0.1;
            \u26032.v = n6 * n9;
            \u26032.w = n7 * n9 + ns.a(\u26033) * 0.08;
            \u26032.x = n8 * n9;
            this.o.d(\u26032);
            this.b.o.d(new pp(this.b.o, this.b.s, this.b.t + 0.5, this.b.u + 0.5, this.V.nextInt(6) + 1));
            n = 1;
        }
        if (this.as) {
            n = 2;
        }
        this.J();
        this.b.bG = null;
        return n;
    }
    
    private zx m() {
        float nextFloat = this.o.s.nextFloat();
        final int g = ack.g(this.b);
        final int h = ack.h(this.b);
        float a = 0.1f - g * 0.025f - h * 0.01f;
        float a2 = 0.05f + g * 0.01f - h * 0.01f;
        a = ns.a(a, 0.0f, 1.0f);
        a2 = ns.a(a2, 0.0f, 1.0f);
        if (nextFloat < a) {
            this.b.b(na.D);
            return oa.a(this.V, ur.d).a(this.V);
        }
        nextFloat -= a;
        if (nextFloat < a2) {
            this.b.b(na.E);
            return oa.a(this.V, ur.e).a(this.V);
        }
        nextFloat -= a2;
        this.b.b(na.C);
        return oa.a(this.V, ur.f).a(this.V);
    }
    
    @Override
    public void J() {
        super.J();
        if (this.b != null) {
            this.b.bG = null;
        }
    }
    
    static {
        d = Arrays.asList(new us(new zx(zy.T), 10).a(0.9f), new us(new zx(zy.aF), 10), new us(new zx(zy.aX), 10), new us(new zx(zy.bz), 10), new us(new zx(zy.F), 5), new us(new zx(zy.aR), 2).a(0.9f), new us(new zx(zy.z), 10), new us(new zx(zy.y), 5), new us(new zx(zy.aW, 10, zd.p.b()), 1), new us(new zx(afi.bR), 10), new us(new zx(zy.bt), 10));
        e = Arrays.asList(new us(new zx(afi.bx), 1), new us(new zx(zy.co), 1), new us(new zx(zy.aA), 1), new us(new zx(zy.f), 1).a(0.25f).a(), new us(new zx(zy.aR), 1).a(0.25f).a(), new us(new zx(zy.aL), 1).a());
        f = Arrays.asList(new us(new zx(zy.aU, 1, zp.a.a.a()), 60), new us(new zx(zy.aU, 1, zp.a.b.a()), 25), new us(new zx(zy.aU, 1, zp.a.c.a()), 2), new us(new zx(zy.aU, 1, zp.a.d.a()), 13));
    }
}
