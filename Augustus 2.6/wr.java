// 
// Decompiled by Procyon v0.5.36
// 

public class wr extends pk
{
    private double a;
    private double b;
    private double c;
    private int d;
    private boolean e;
    
    public wr(final adm \u2603) {
        super(\u2603);
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
    
    public wr(final adm \u2603, final double \u2603, final double \u2603, final double \u2603) {
        super(\u2603);
        this.d = 0;
        this.a(0.25f, 0.25f);
        this.b(\u2603, \u2603, \u2603);
    }
    
    public void a(final cj \u2603) {
        final double a = \u2603.n();
        final int o = \u2603.o();
        final double c = \u2603.p();
        final double n = a - this.s;
        final double n2 = c - this.u;
        final float a2 = ns.a(n * n + n2 * n2);
        if (a2 > 12.0f) {
            this.a = this.s + n / a2 * 12.0;
            this.c = this.u + n2 / a2 * 12.0;
            this.b = this.t + 8.0;
        }
        else {
            this.a = a;
            this.b = o;
            this.c = c;
        }
        this.d = 0;
        this.e = (this.V.nextInt(5) > 0);
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
        this.s += this.v;
        this.t += this.w;
        this.u += this.x;
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
        if (!this.o.D) {
            final double \u2603 = this.a - this.s;
            final double \u26032 = this.c - this.u;
            final float n = (float)Math.sqrt(\u2603 * \u2603 + \u26032 * \u26032);
            final float n2 = (float)ns.b(\u26032, \u2603);
            double n3 = a + (n - a) * 0.0025;
            if (n < 1.0f) {
                n3 *= 0.8;
                this.w *= 0.8;
            }
            this.v = Math.cos(n2) * n3;
            this.x = Math.sin(n2) * n3;
            if (this.t < this.b) {
                this.w += (1.0 - this.w) * 0.014999999664723873;
            }
            else {
                this.w += (-1.0 - this.w) * 0.014999999664723873;
            }
        }
        final float n4 = 0.25f;
        if (this.V()) {
            for (int i = 0; i < 4; ++i) {
                this.o.a(cy.e, this.s - this.v * n4, this.t - this.w * n4, this.u - this.x * n4, this.v, this.w, this.x, new int[0]);
            }
        }
        else {
            this.o.a(cy.y, this.s - this.v * n4 + this.V.nextDouble() * 0.6 - 0.3, this.t - this.w * n4 - 0.5, this.u - this.x * n4 + this.V.nextDouble() * 0.6 - 0.3, this.v, this.w, this.x, new int[0]);
        }
        if (!this.o.D) {
            this.b(this.s, this.t, this.u);
            ++this.d;
            if (this.d > 80 && !this.o.D) {
                this.J();
                if (this.e) {
                    this.o.d(new uz(this.o, this.s, this.t, this.u, new zx(zy.bH)));
                }
                else {
                    this.o.b(2003, new cj(this), 0);
                }
            }
        }
    }
    
    public void b(final dn \u2603) {
    }
    
    public void a(final dn \u2603) {
    }
    
    @Override
    public float c(final float \u2603) {
        return 1.0f;
    }
    
    @Override
    public int b(final float \u2603) {
        return 15728880;
    }
    
    @Override
    public boolean aD() {
        return false;
    }
}
