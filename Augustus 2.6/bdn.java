// 
// Decompiled by Procyon v0.5.36
// 

public class bdn extends beb
{
    private arm a;
    private int az;
    
    protected bdn(final adm \u2603, final double \u2603, final double \u2603, final double \u2603, final arm \u2603) {
        super(\u2603, \u2603, \u2603, \u2603, 0.0, 0.0, 0.0);
        final double v = 0.0;
        this.x = v;
        this.w = v;
        this.v = v;
        if (\u2603 == arm.h) {
            this.ar = 0.0f;
            this.as = 0.0f;
            this.at = 1.0f;
        }
        else {
            this.ar = 1.0f;
            this.as = 0.0f;
            this.at = 0.0f;
        }
        this.k(113);
        this.a(0.01f, 0.01f);
        this.i = 0.06f;
        this.a = \u2603;
        this.az = 40;
        this.g = (int)(64.0 / (Math.random() * 0.8 + 0.2));
        final double v2 = 0.0;
        this.x = v2;
        this.w = v2;
        this.v = v2;
    }
    
    @Override
    public int b(final float \u2603) {
        if (this.a == arm.h) {
            return super.b(\u2603);
        }
        return 257;
    }
    
    @Override
    public float c(final float \u2603) {
        if (this.a == arm.h) {
            return super.c(\u2603);
        }
        return 1.0f;
    }
    
    @Override
    public void t_() {
        this.p = this.s;
        this.q = this.t;
        this.r = this.u;
        if (this.a == arm.h) {
            this.ar = 0.2f;
            this.as = 0.3f;
            this.at = 1.0f;
        }
        else {
            this.ar = 1.0f;
            this.as = 16.0f / (40 - this.az + 16);
            this.at = 4.0f / (40 - this.az + 8);
        }
        this.w -= this.i;
        if (this.az-- > 0) {
            this.v *= 0.02;
            this.w *= 0.02;
            this.x *= 0.02;
            this.k(113);
        }
        else {
            this.k(112);
        }
        this.d(this.v, this.w, this.x);
        this.v *= 0.9800000190734863;
        this.w *= 0.9800000190734863;
        this.x *= 0.9800000190734863;
        if (this.g-- <= 0) {
            this.J();
        }
        if (this.C) {
            if (this.a == arm.h) {
                this.J();
                this.o.a(cy.f, this.s, this.t, this.u, 0.0, 0.0, 0.0, new int[0]);
            }
            else {
                this.k(114);
            }
            this.v *= 0.699999988079071;
            this.x *= 0.699999988079071;
        }
        final cj \u2603 = new cj(this);
        final alz p = this.o.p(\u2603);
        final arm t = p.c().t();
        if (t.d() || t.a()) {
            double n = 0.0;
            if (p.c() instanceof ahv) {
                n = ahv.b(p.b((amo<Integer>)ahv.b));
            }
            final double n2 = ns.c(this.t) + 1 - n;
            if (this.t < n2) {
                this.J();
            }
        }
    }
    
    public static class b implements bed
    {
        @Override
        public beb a(final int \u2603, final adm \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final int... \u2603) {
            return new bdn(\u2603, \u2603, \u2603, \u2603, arm.h);
        }
    }
    
    public static class a implements bed
    {
        @Override
        public beb a(final int \u2603, final adm \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final int... \u2603) {
            return new bdn(\u2603, \u2603, \u2603, \u2603, arm.i);
        }
    }
}
