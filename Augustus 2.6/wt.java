// 
// Decompiled by Procyon v0.5.36
// 

public class wt extends pk
{
    private int a;
    private int b;
    
    public wt(final adm \u2603) {
        super(\u2603);
        this.a(0.25f, 0.25f);
    }
    
    @Override
    protected void h() {
        this.ac.a(8, 5);
    }
    
    @Override
    public boolean a(final double \u2603) {
        return \u2603 < 4096.0;
    }
    
    public wt(final adm \u2603, final double \u2603, final double \u2603, final double \u2603, final zx \u2603) {
        super(\u2603);
        this.a = 0;
        this.a(0.25f, 0.25f);
        this.b(\u2603, \u2603, \u2603);
        int n = 1;
        if (\u2603 != null && \u2603.n()) {
            this.ac.b(8, \u2603);
            final dn o = \u2603.o();
            final dn m = o.m("Fireworks");
            if (m != null) {
                n += m.d("Flight");
            }
        }
        this.v = this.V.nextGaussian() * 0.001;
        this.x = this.V.nextGaussian() * 0.001;
        this.w = 0.05;
        this.b = 10 * n + this.V.nextInt(6) + this.V.nextInt(7);
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
        this.v *= 1.15;
        this.x *= 1.15;
        this.w += 0.04;
        this.d(this.v, this.w, this.x);
        final float a = ns.a(this.v * this.v + this.x * this.x);
        this.y = (float)(ns.b(this.v, this.x) * 180.0 / 3.1415927410125732);
        this.z = (float)(ns.b(this.w, a) * 180.0 / 3.1415927410125732);
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
        if (this.a == 0 && !this.R()) {
            this.o.a(this, "fireworks.launch", 3.0f, 1.0f);
        }
        ++this.a;
        if (this.o.D && this.a % 2 < 2) {
            this.o.a(cy.d, this.s, this.t - 0.3, this.u, this.V.nextGaussian() * 0.05, -this.w * 0.5, this.V.nextGaussian() * 0.05, new int[0]);
        }
        if (!this.o.D && this.a > this.b) {
            this.o.a(this, (byte)17);
            this.J();
        }
    }
    
    @Override
    public void a(final byte \u2603) {
        if (\u2603 == 17 && this.o.D) {
            final zx f = this.ac.f(8);
            dn m = null;
            if (f != null && f.n()) {
                m = f.o().m("Fireworks");
            }
            this.o.a(this.s, this.t, this.u, this.v, this.w, this.x, m);
        }
        super.a(\u2603);
    }
    
    public void b(final dn \u2603) {
        \u2603.a("Life", this.a);
        \u2603.a("LifeTime", this.b);
        final zx f = this.ac.f(8);
        if (f != null) {
            final dn dn = new dn();
            f.b(dn);
            \u2603.a("FireworksItem", dn);
        }
    }
    
    public void a(final dn \u2603) {
        this.a = \u2603.f("Life");
        this.b = \u2603.f("LifeTime");
        final dn m = \u2603.m("FireworksItem");
        if (m != null) {
            final zx a = zx.a(m);
            if (a != null) {
                this.ac.b(8, a);
            }
        }
    }
    
    @Override
    public float c(final float \u2603) {
        return super.c(\u2603);
    }
    
    @Override
    public int b(final float \u2603) {
        return super.b(\u2603);
    }
    
    @Override
    public boolean aD() {
        return false;
    }
}
