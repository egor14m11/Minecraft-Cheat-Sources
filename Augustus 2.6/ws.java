import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public abstract class ws extends pk
{
    private int e;
    private int f;
    private int g;
    private afh h;
    private boolean i;
    public pr a;
    private int ar;
    private int as;
    public double b;
    public double c;
    public double d;
    
    public ws(final adm \u2603) {
        super(\u2603);
        this.e = -1;
        this.f = -1;
        this.g = -1;
        this.a(1.0f, 1.0f);
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
    
    public ws(final adm \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603) {
        super(\u2603);
        this.e = -1;
        this.f = -1;
        this.g = -1;
        this.a(1.0f, 1.0f);
        this.b(\u2603, \u2603, \u2603, this.y, this.z);
        this.b(\u2603, \u2603, \u2603);
        final double n = ns.a(\u2603 * \u2603 + \u2603 * \u2603 + \u2603 * \u2603);
        this.b = \u2603 / n * 0.1;
        this.c = \u2603 / n * 0.1;
        this.d = \u2603 / n * 0.1;
    }
    
    public ws(final adm \u2603, final pr \u2603, double \u2603, double \u2603, double \u2603) {
        super(\u2603);
        this.e = -1;
        this.f = -1;
        this.g = -1;
        this.a = \u2603;
        this.a(1.0f, 1.0f);
        this.b(\u2603.s, \u2603.t, \u2603.u, \u2603.y, \u2603.z);
        this.b(this.s, this.t, this.u);
        final double v = 0.0;
        this.x = v;
        this.w = v;
        this.v = v;
        \u2603 += this.V.nextGaussian() * 0.4;
        \u2603 += this.V.nextGaussian() * 0.4;
        \u2603 += this.V.nextGaussian() * 0.4;
        final double n = ns.a(\u2603 * \u2603 + \u2603 * \u2603 + \u2603 * \u2603);
        this.b = \u2603 / n * 0.1;
        this.c = \u2603 / n * 0.1;
        this.d = \u2603 / n * 0.1;
    }
    
    @Override
    public void t_() {
        if (!this.o.D && ((this.a != null && this.a.I) || !this.o.e(new cj(this)))) {
            this.J();
            return;
        }
        super.t_();
        this.e(1);
        if (this.i) {
            if (this.o.p(new cj(this.e, this.f, this.g)).c() == this.h) {
                ++this.ar;
                if (this.ar == 600) {
                    this.J();
                }
                return;
            }
            this.i = false;
            this.v *= this.V.nextFloat() * 0.2f;
            this.w *= this.V.nextFloat() * 0.2f;
            this.x *= this.V.nextFloat() * 0.2f;
            this.ar = 0;
            this.as = 0;
        }
        else {
            ++this.as;
        }
        aui aui = new aui(this.s, this.t, this.u);
        aui aui2 = new aui(this.s + this.v, this.t + this.w, this.u + this.x);
        auh a = this.o.a(aui, aui2);
        aui = new aui(this.s, this.t, this.u);
        aui2 = new aui(this.s + this.v, this.t + this.w, this.u + this.x);
        if (a != null) {
            aui2 = new aui(a.c.a, a.c.b, a.c.c);
        }
        pk \u2603 = null;
        final List<pk> b = this.o.b(this, this.aR().a(this.v, this.w, this.x).b(1.0, 1.0, 1.0));
        double n = 0.0;
        for (int i = 0; i < b.size(); ++i) {
            final pk pk = b.get(i);
            if (pk.ad()) {
                if (!pk.k(this.a) || this.as >= 25) {
                    final float n2 = 0.3f;
                    final aug b2 = pk.aR().b(n2, n2, n2);
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
        if (a != null) {
            this.a(a);
        }
        this.s += this.v;
        this.t += this.w;
        this.u += this.x;
        final float a3 = ns.a(this.v * this.v + this.x * this.x);
        this.y = (float)(ns.b(this.x, this.v) * 180.0 / 3.1415927410125732) + 90.0f;
        this.z = (float)(ns.b(a3, this.w) * 180.0 / 3.1415927410125732) - 90.0f;
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
        float j = this.j();
        if (this.V()) {
            for (int k = 0; k < 4; ++k) {
                final float n3 = 0.25f;
                this.o.a(cy.e, this.s - this.v * n3, this.t - this.w * n3, this.u - this.x * n3, this.v, this.w, this.x, new int[0]);
            }
            j = 0.8f;
        }
        this.v += this.b;
        this.w += this.c;
        this.x += this.d;
        this.v *= j;
        this.w *= j;
        this.x *= j;
        this.o.a(cy.l, this.s, this.t + 0.5, this.u, 0.0, 0.0, 0.0, new int[0]);
        this.b(this.s, this.t, this.u);
    }
    
    protected float j() {
        return 0.95f;
    }
    
    protected abstract void a(final auh p0);
    
    public void b(final dn \u2603) {
        \u2603.a("xTile", (short)this.e);
        \u2603.a("yTile", (short)this.f);
        \u2603.a("zTile", (short)this.g);
        final jy jy = afh.c.c(this.h);
        \u2603.a("inTile", (jy == null) ? "" : jy.toString());
        \u2603.a("inGround", (byte)(this.i ? 1 : 0));
        \u2603.a("direction", this.a(new double[] { this.v, this.w, this.x }));
    }
    
    public void a(final dn \u2603) {
        this.e = \u2603.e("xTile");
        this.f = \u2603.e("yTile");
        this.g = \u2603.e("zTile");
        if (\u2603.b("inTile", 8)) {
            this.h = afh.b(\u2603.j("inTile"));
        }
        else {
            this.h = afh.c(\u2603.d("inTile") & 0xFF);
        }
        this.i = (\u2603.d("inGround") == 1);
        if (\u2603.b("direction", 9)) {
            final du c = \u2603.c("direction", 6);
            this.v = c.d(0);
            this.w = c.d(1);
            this.x = c.d(2);
        }
        else {
            this.J();
        }
    }
    
    @Override
    public boolean ad() {
        return true;
    }
    
    @Override
    public float ao() {
        return 1.0f;
    }
    
    @Override
    public boolean a(final ow \u2603, final float \u2603) {
        if (this.b(\u2603)) {
            return false;
        }
        this.ac();
        if (\u2603.j() != null) {
            final aui ap = \u2603.j().ap();
            if (ap != null) {
                this.v = ap.a;
                this.w = ap.b;
                this.x = ap.c;
                this.b = this.v * 0.1;
                this.c = this.w * 0.1;
                this.d = this.x * 0.1;
            }
            if (\u2603.j() instanceof pr) {
                this.a = (pr)\u2603.j();
            }
            return true;
        }
        return false;
    }
    
    @Override
    public float c(final float \u2603) {
        return 1.0f;
    }
    
    @Override
    public int b(final float \u2603) {
        return 15728880;
    }
}
