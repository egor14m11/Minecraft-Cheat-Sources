import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class wq extends pk implements wv
{
    private int d;
    private int e;
    private int f;
    private afh g;
    private int h;
    private boolean i;
    public int a;
    public int b;
    public pk c;
    private int ar;
    private int as;
    private double at;
    private int au;
    
    public wq(final adm \u2603) {
        super(\u2603);
        this.d = -1;
        this.e = -1;
        this.f = -1;
        this.at = 2.0;
        this.j = 10.0;
        this.a(0.5f, 0.5f);
    }
    
    public wq(final adm \u2603, final double \u2603, final double \u2603, final double \u2603) {
        super(\u2603);
        this.d = -1;
        this.e = -1;
        this.f = -1;
        this.at = 2.0;
        this.j = 10.0;
        this.a(0.5f, 0.5f);
        this.b(\u2603, \u2603, \u2603);
    }
    
    public wq(final adm \u2603, final pr \u2603, final pr \u2603, final float \u2603, final float \u2603) {
        super(\u2603);
        this.d = -1;
        this.e = -1;
        this.f = -1;
        this.at = 2.0;
        this.j = 10.0;
        this.c = \u2603;
        if (\u2603 instanceof wn) {
            this.a = 1;
        }
        this.t = \u2603.t + \u2603.aS() - 0.10000000149011612;
        final double n = \u2603.s - \u2603.s;
        final double \u26032 = \u2603.aR().b + \u2603.K / 3.0f - this.t;
        final double n2 = \u2603.u - \u2603.u;
        final double \u26033 = ns.a(n * n + n2 * n2);
        if (\u26033 < 1.0E-7) {
            return;
        }
        final float \u26034 = (float)(ns.b(n2, n) * 180.0 / 3.1415927410125732) - 90.0f;
        final float \u26035 = (float)(-(ns.b(\u26032, \u26033) * 180.0 / 3.1415927410125732));
        final double n3 = n / \u26033;
        final double n4 = n2 / \u26033;
        this.b(\u2603.s + n3, this.t, \u2603.u + n4, \u26034, \u26035);
        final float n5 = (float)(\u26033 * 0.20000000298023224);
        this.c(n, \u26032 + n5, n2, \u2603, \u2603);
    }
    
    public wq(final adm \u2603, final pr \u2603, final float \u2603) {
        super(\u2603);
        this.d = -1;
        this.e = -1;
        this.f = -1;
        this.at = 2.0;
        this.j = 10.0;
        this.c = \u2603;
        if (\u2603 instanceof wn) {
            this.a = 1;
        }
        this.a(0.5f, 0.5f);
        this.b(\u2603.s, \u2603.t + \u2603.aS(), \u2603.u, \u2603.y, \u2603.z);
        this.s -= ns.b(this.y / 180.0f * 3.1415927f) * 0.16f;
        this.t -= 0.10000000149011612;
        this.u -= ns.a(this.y / 180.0f * 3.1415927f) * 0.16f;
        this.b(this.s, this.t, this.u);
        this.v = -ns.a(this.y / 180.0f * 3.1415927f) * ns.b(this.z / 180.0f * 3.1415927f);
        this.x = ns.b(this.y / 180.0f * 3.1415927f) * ns.b(this.z / 180.0f * 3.1415927f);
        this.w = -ns.a(this.z / 180.0f * 3.1415927f);
        this.c(this.v, this.w, this.x, \u2603 * 1.5f, 1.0f);
    }
    
    @Override
    protected void h() {
        this.ac.a(16, (Byte)0);
    }
    
    @Override
    public void c(double \u2603, double \u2603, double \u2603, final float \u2603, final float \u2603) {
        final float a = ns.a(\u2603 * \u2603 + \u2603 * \u2603 + \u2603 * \u2603);
        \u2603 /= a;
        \u2603 /= a;
        \u2603 /= a;
        \u2603 += this.V.nextGaussian() * (this.V.nextBoolean() ? -1 : 1) * 0.007499999832361937 * \u2603;
        \u2603 += this.V.nextGaussian() * (this.V.nextBoolean() ? -1 : 1) * 0.007499999832361937 * \u2603;
        \u2603 += this.V.nextGaussian() * (this.V.nextBoolean() ? -1 : 1) * 0.007499999832361937 * \u2603;
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
        this.ar = 0;
    }
    
    @Override
    public void a(final double \u2603, final double \u2603, final double \u2603, final float \u2603, final float \u2603, final int \u2603, final boolean \u2603) {
        this.b(\u2603, \u2603, \u2603);
        this.b(\u2603, \u2603);
    }
    
    @Override
    public void i(final double \u2603, final double \u2603, final double \u2603) {
        this.v = \u2603;
        this.w = \u2603;
        this.x = \u2603;
        if (this.B == 0.0f && this.A == 0.0f) {
            final float a = ns.a(\u2603 * \u2603 + \u2603 * \u2603);
            final float n = (float)(ns.b(\u2603, \u2603) * 180.0 / 3.1415927410125732);
            this.y = n;
            this.A = n;
            final float n2 = (float)(ns.b(\u2603, a) * 180.0 / 3.1415927410125732);
            this.z = n2;
            this.B = n2;
            this.B = this.z;
            this.A = this.y;
            this.b(this.s, this.t, this.u, this.y, this.z);
            this.ar = 0;
        }
    }
    
    @Override
    public void t_() {
        super.t_();
        if (this.B == 0.0f && this.A == 0.0f) {
            final float a = ns.a(this.v * this.v + this.x * this.x);
            final float n = (float)(ns.b(this.v, this.x) * 180.0 / 3.1415927410125732);
            this.y = n;
            this.A = n;
            final float n2 = (float)(ns.b(this.w, a) * 180.0 / 3.1415927410125732);
            this.z = n2;
            this.B = n2;
        }
        final cj \u2603 = new cj(this.d, this.e, this.f);
        final alz p = this.o.p(\u2603);
        final afh c = p.c();
        if (c.t() != arm.a) {
            c.a((adq)this.o, \u2603);
            final aug a2 = c.a(this.o, \u2603, p);
            if (a2 != null && a2.a(new aui(this.s, this.t, this.u))) {
                this.i = true;
            }
        }
        if (this.b > 0) {
            --this.b;
        }
        if (this.i) {
            final int c2 = c.c(p);
            if (c != this.g || c2 != this.h) {
                this.i = false;
                this.v *= this.V.nextFloat() * 0.2f;
                this.w *= this.V.nextFloat() * 0.2f;
                this.x *= this.V.nextFloat() * 0.2f;
                this.ar = 0;
                this.as = 0;
            }
            else {
                ++this.ar;
                if (this.ar >= 1200) {
                    this.J();
                }
            }
            return;
        }
        ++this.as;
        aui aui = new aui(this.s, this.t, this.u);
        aui aui2 = new aui(this.s + this.v, this.t + this.w, this.u + this.x);
        auh a3 = this.o.a(aui, aui2, false, true, false);
        aui = new aui(this.s, this.t, this.u);
        aui2 = new aui(this.s + this.v, this.t + this.w, this.u + this.x);
        if (a3 != null) {
            aui2 = new aui(a3.c.a, a3.c.b, a3.c.c);
        }
        pk \u26032 = null;
        final List<pk> b = this.o.b(this, this.aR().a(this.v, this.w, this.x).b(1.0, 1.0, 1.0));
        double n3 = 0.0;
        for (int i = 0; i < b.size(); ++i) {
            final pk pk = b.get(i);
            if (pk.ad()) {
                if (pk != this.c || this.as >= 5) {
                    final float a4 = 0.3f;
                    final aug b2 = pk.aR().b(a4, a4, a4);
                    final auh a5 = b2.a(aui, aui2);
                    if (a5 != null) {
                        final double g = aui.g(a5.c);
                        if (g < n3 || n3 == 0.0) {
                            \u26032 = pk;
                            n3 = g;
                        }
                    }
                }
            }
        }
        if (\u26032 != null) {
            a3 = new auh(\u26032);
        }
        if (a3 != null && a3.d != null && a3.d instanceof wn) {
            final wn \u26033 = (wn)a3.d;
            if (\u26033.bA.a || (this.c instanceof wn && !((wn)this.c).a(\u26033))) {
                a3 = null;
            }
        }
        if (a3 != null) {
            if (a3.d != null) {
                final float n4 = ns.a(this.v * this.v + this.w * this.w + this.x * this.x);
                int f = ns.f(n4 * this.at);
                if (this.l()) {
                    f += this.V.nextInt(f / 2 + 2);
                }
                ow \u26034;
                if (this.c == null) {
                    \u26034 = ow.a(this, this);
                }
                else {
                    \u26034 = ow.a(this, this.c);
                }
                if (this.at() && !(a3.d instanceof vo)) {
                    a3.d.e(5);
                }
                if (a3.d.a(\u26034, (float)f)) {
                    if (a3.d instanceof pr) {
                        final pr pr = (pr)a3.d;
                        if (!this.o.D) {
                            pr.o(pr.bv() + 1);
                        }
                        if (this.au > 0) {
                            final float a6 = ns.a(this.v * this.v + this.x * this.x);
                            if (a6 > 0.0f) {
                                a3.d.g(this.v * this.au * 0.6000000238418579 / a6, 0.1, this.x * this.au * 0.6000000238418579 / a6);
                            }
                        }
                        if (this.c instanceof pr) {
                            ack.a(pr, this.c);
                            ack.b((pr)this.c, pr);
                        }
                        if (this.c != null && a3.d != this.c && a3.d instanceof wn && this.c instanceof lf) {
                            ((lf)this.c).a.a(new gm(6, 0.0f));
                        }
                    }
                    this.a("random.bowhit", 1.0f, 1.2f / (this.V.nextFloat() * 0.2f + 0.9f));
                    if (!(a3.d instanceof vo)) {
                        this.J();
                    }
                }
                else {
                    this.v *= -0.10000000149011612;
                    this.w *= -0.10000000149011612;
                    this.x *= -0.10000000149011612;
                    this.y += 180.0f;
                    this.A += 180.0f;
                    this.as = 0;
                }
            }
            else {
                final cj a7 = a3.a();
                this.d = a7.n();
                this.e = a7.o();
                this.f = a7.p();
                final alz p2 = this.o.p(a7);
                this.g = p2.c();
                this.h = this.g.c(p2);
                this.v = (float)(a3.c.a - this.s);
                this.w = (float)(a3.c.b - this.t);
                this.x = (float)(a3.c.c - this.u);
                final float a4 = ns.a(this.v * this.v + this.w * this.w + this.x * this.x);
                this.s -= this.v / a4 * 0.05000000074505806;
                this.t -= this.w / a4 * 0.05000000074505806;
                this.u -= this.x / a4 * 0.05000000074505806;
                this.a("random.bowhit", 1.0f, 1.2f / (this.V.nextFloat() * 0.2f + 0.9f));
                this.i = true;
                this.b = 7;
                this.a(false);
                if (this.g.t() != arm.a) {
                    this.g.a(this.o, a7, p2, this);
                }
            }
        }
        if (this.l()) {
            for (int i = 0; i < 4; ++i) {
                this.o.a(cy.j, this.s + this.v * i / 4.0, this.t + this.w * i / 4.0, this.u + this.x * i / 4.0, -this.v, -this.w + 0.2, -this.x, new int[0]);
            }
        }
        this.s += this.v;
        this.t += this.w;
        this.u += this.x;
        final float n4 = ns.a(this.v * this.v + this.x * this.x);
        this.y = (float)(ns.b(this.v, this.x) * 180.0 / 3.1415927410125732);
        this.z = (float)(ns.b(this.w, n4) * 180.0 / 3.1415927410125732);
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
        float n5 = 0.99f;
        final float a4 = 0.05f;
        if (this.V()) {
            for (int j = 0; j < 4; ++j) {
                final float a6 = 0.25f;
                this.o.a(cy.e, this.s - this.v * a6, this.t - this.w * a6, this.u - this.x * a6, this.v, this.w, this.x, new int[0]);
            }
            n5 = 0.6f;
        }
        if (this.U()) {
            this.N();
        }
        this.v *= n5;
        this.w *= n5;
        this.x *= n5;
        this.w -= a4;
        this.b(this.s, this.t, this.u);
        this.Q();
    }
    
    public void b(final dn \u2603) {
        \u2603.a("xTile", (short)this.d);
        \u2603.a("yTile", (short)this.e);
        \u2603.a("zTile", (short)this.f);
        \u2603.a("life", (short)this.ar);
        final jy jy = afh.c.c(this.g);
        \u2603.a("inTile", (jy == null) ? "" : jy.toString());
        \u2603.a("inData", (byte)this.h);
        \u2603.a("shake", (byte)this.b);
        \u2603.a("inGround", (byte)(this.i ? 1 : 0));
        \u2603.a("pickup", (byte)this.a);
        \u2603.a("damage", this.at);
    }
    
    public void a(final dn \u2603) {
        this.d = \u2603.e("xTile");
        this.e = \u2603.e("yTile");
        this.f = \u2603.e("zTile");
        this.ar = \u2603.e("life");
        if (\u2603.b("inTile", 8)) {
            this.g = afh.b(\u2603.j("inTile"));
        }
        else {
            this.g = afh.c(\u2603.d("inTile") & 0xFF);
        }
        this.h = (\u2603.d("inData") & 0xFF);
        this.b = (\u2603.d("shake") & 0xFF);
        this.i = (\u2603.d("inGround") == 1);
        if (\u2603.b("damage", 99)) {
            this.at = \u2603.i("damage");
        }
        if (\u2603.b("pickup", 99)) {
            this.a = \u2603.d("pickup");
        }
        else if (\u2603.b("player", 99)) {
            this.a = (\u2603.n("player") ? 1 : 0);
        }
    }
    
    @Override
    public void d(final wn \u2603) {
        if (this.o.D || !this.i || this.b > 0) {
            return;
        }
        boolean b = this.a == 1 || (this.a == 2 && \u2603.bA.d);
        if (this.a == 1 && !\u2603.bi.a(new zx(zy.g, 1))) {
            b = false;
        }
        if (b) {
            this.a("random.pop", 0.2f, ((this.V.nextFloat() - this.V.nextFloat()) * 0.7f + 1.0f) * 2.0f);
            \u2603.a(this, 1);
            this.J();
        }
    }
    
    @Override
    protected boolean s_() {
        return false;
    }
    
    public void b(final double \u2603) {
        this.at = \u2603;
    }
    
    public double j() {
        return this.at;
    }
    
    public void a(final int \u2603) {
        this.au = \u2603;
    }
    
    @Override
    public boolean aD() {
        return false;
    }
    
    @Override
    public float aS() {
        return 0.0f;
    }
    
    public void a(final boolean \u2603) {
        final byte a = this.ac.a(16);
        if (\u2603) {
            this.ac.b(16, (byte)(a | 0x1));
        }
        else {
            this.ac.b(16, (byte)(a & 0xFFFFFFFE));
        }
    }
    
    public boolean l() {
        final byte a = this.ac.a(16);
        return (a & 0x1) != 0x0;
    }
}
