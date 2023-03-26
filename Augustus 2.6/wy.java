import java.util.UUID;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public abstract class wy extends pk implements wv
{
    private int c;
    private int d;
    private int e;
    private afh f;
    protected boolean a;
    public int b;
    private pr g;
    private String h;
    private int i;
    private int ar;
    
    public wy(final adm \u2603) {
        super(\u2603);
        this.c = -1;
        this.d = -1;
        this.e = -1;
        this.a(0.25f, 0.25f);
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
    
    public wy(final adm \u2603, final pr \u2603) {
        super(\u2603);
        this.c = -1;
        this.d = -1;
        this.e = -1;
        this.g = \u2603;
        this.a(0.25f, 0.25f);
        this.b(\u2603.s, \u2603.t + \u2603.aS(), \u2603.u, \u2603.y, \u2603.z);
        this.s -= ns.b(this.y / 180.0f * 3.1415927f) * 0.16f;
        this.t -= 0.10000000149011612;
        this.u -= ns.a(this.y / 180.0f * 3.1415927f) * 0.16f;
        this.b(this.s, this.t, this.u);
        final float n = 0.4f;
        this.v = -ns.a(this.y / 180.0f * 3.1415927f) * ns.b(this.z / 180.0f * 3.1415927f) * n;
        this.x = ns.b(this.y / 180.0f * 3.1415927f) * ns.b(this.z / 180.0f * 3.1415927f) * n;
        this.w = -ns.a((this.z + this.l()) / 180.0f * 3.1415927f) * n;
        this.c(this.v, this.w, this.x, this.j(), 1.0f);
    }
    
    public wy(final adm \u2603, final double \u2603, final double \u2603, final double \u2603) {
        super(\u2603);
        this.c = -1;
        this.d = -1;
        this.e = -1;
        this.i = 0;
        this.a(0.25f, 0.25f);
        this.b(\u2603, \u2603, \u2603);
    }
    
    protected float j() {
        return 1.5f;
    }
    
    protected float l() {
        return 0.0f;
    }
    
    @Override
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
        this.i = 0;
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
        }
    }
    
    @Override
    public void t_() {
        this.P = this.s;
        this.Q = this.t;
        this.R = this.u;
        super.t_();
        if (this.b > 0) {
            --this.b;
        }
        if (this.a) {
            if (this.o.p(new cj(this.c, this.d, this.e)).c() == this.f) {
                ++this.i;
                if (this.i == 1200) {
                    this.J();
                }
                return;
            }
            this.a = false;
            this.v *= this.V.nextFloat() * 0.2f;
            this.w *= this.V.nextFloat() * 0.2f;
            this.x *= this.V.nextFloat() * 0.2f;
            this.i = 0;
            this.ar = 0;
        }
        else {
            ++this.ar;
        }
        aui aui = new aui(this.s, this.t, this.u);
        aui aui2 = new aui(this.s + this.v, this.t + this.w, this.u + this.x);
        auh a = this.o.a(aui, aui2);
        aui = new aui(this.s, this.t, this.u);
        aui2 = new aui(this.s + this.v, this.t + this.w, this.u + this.x);
        if (a != null) {
            aui2 = new aui(a.c.a, a.c.b, a.c.c);
        }
        if (!this.o.D) {
            pk \u2603 = null;
            final List<pk> b = this.o.b(this, this.aR().a(this.v, this.w, this.x).b(1.0, 1.0, 1.0));
            double n = 0.0;
            final pr n2 = this.n();
            for (int i = 0; i < b.size(); ++i) {
                final pk pk = b.get(i);
                if (pk.ad()) {
                    if (pk != n2 || this.ar >= 5) {
                        final float n3 = 0.3f;
                        final aug b2 = pk.aR().b(n3, n3, n3);
                        final auh a2 = b2.a(aui, aui2);
                        if (a2 != null) {
                            final double g = aui.g(a2.c);
                            if (g < n || n == 0.0) {
                                \u2603 = pk;
                                n = g;
                            }
                        }
                    }
                }
            }
            if (\u2603 != null) {
                a = new auh(\u2603);
            }
        }
        if (a != null) {
            if (a.a == auh.a.b && this.o.p(a.a()).c() == afi.aY) {
                this.d(a.a());
            }
            else {
                this.a(a);
            }
        }
        this.s += this.v;
        this.t += this.w;
        this.u += this.x;
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
        float n4 = 0.99f;
        final float m = this.m();
        if (this.V()) {
            for (int j = 0; j < 4; ++j) {
                final float n5 = 0.25f;
                this.o.a(cy.e, this.s - this.v * n5, this.t - this.w * n5, this.u - this.x * n5, this.v, this.w, this.x, new int[0]);
            }
            n4 = 0.8f;
        }
        this.v *= n4;
        this.w *= n4;
        this.x *= n4;
        this.w -= m;
        this.b(this.s, this.t, this.u);
    }
    
    protected float m() {
        return 0.03f;
    }
    
    protected abstract void a(final auh p0);
    
    public void b(final dn \u2603) {
        \u2603.a("xTile", (short)this.c);
        \u2603.a("yTile", (short)this.d);
        \u2603.a("zTile", (short)this.e);
        final jy jy = afh.c.c(this.f);
        \u2603.a("inTile", (jy == null) ? "" : jy.toString());
        \u2603.a("shake", (byte)this.b);
        \u2603.a("inGround", (byte)(this.a ? 1 : 0));
        if ((this.h == null || this.h.length() == 0) && this.g instanceof wn) {
            this.h = this.g.e_();
        }
        \u2603.a("ownerName", (this.h == null) ? "" : this.h);
    }
    
    public void a(final dn \u2603) {
        this.c = \u2603.e("xTile");
        this.d = \u2603.e("yTile");
        this.e = \u2603.e("zTile");
        if (\u2603.b("inTile", 8)) {
            this.f = afh.b(\u2603.j("inTile"));
        }
        else {
            this.f = afh.c(\u2603.d("inTile") & 0xFF);
        }
        this.b = (\u2603.d("shake") & 0xFF);
        this.a = (\u2603.d("inGround") == 1);
        this.g = null;
        this.h = \u2603.j("ownerName");
        if (this.h != null && this.h.length() == 0) {
            this.h = null;
        }
        this.g = this.n();
    }
    
    public pr n() {
        if (this.g == null && this.h != null && this.h.length() > 0) {
            this.g = this.o.a(this.h);
            if (this.g == null && this.o instanceof le) {
                try {
                    final pk a = ((le)this.o).a(UUID.fromString(this.h));
                    if (a instanceof pr) {
                        this.g = (pr)a;
                    }
                }
                catch (Throwable t) {
                    this.g = null;
                }
            }
        }
        return this.g;
    }
}
