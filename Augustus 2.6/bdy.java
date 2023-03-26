// 
// Decompiled by Procyon v0.5.36
// 

public class bdy extends beb
{
    private float a;
    
    protected bdy(final adm \u2603, final double \u2603, final double \u2603, final double \u2603) {
        super(\u2603, \u2603, \u2603, \u2603, 0.0, 0.0, 0.0);
        this.v *= 0.800000011920929;
        this.w *= 0.800000011920929;
        this.x *= 0.800000011920929;
        this.w = this.V.nextFloat() * 0.4f + 0.05f;
        final float ar = 1.0f;
        this.at = ar;
        this.as = ar;
        this.ar = ar;
        this.h *= this.V.nextFloat() * 2.0f + 0.2f;
        this.a = this.h;
        this.g = (int)(16.0 / (Math.random() * 0.8 + 0.2));
        this.T = false;
        this.k(49);
    }
    
    @Override
    public int b(final float \u2603) {
        float a = (this.f + \u2603) / this.g;
        a = ns.a(a, 0.0f, 1.0f);
        final int b = super.b(\u2603);
        final int n = 240;
        final int n2 = b >> 16 & 0xFF;
        return n | n2 << 16;
    }
    
    @Override
    public float c(final float \u2603) {
        return 1.0f;
    }
    
    @Override
    public void a(final bfd \u2603, final pk \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603) {
        final float n = (this.f + \u2603) / this.g;
        this.h = this.a * (1.0f - n * n);
        super.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
    }
    
    @Override
    public void t_() {
        this.p = this.s;
        this.q = this.t;
        this.r = this.u;
        if (this.f++ >= this.g) {
            this.J();
        }
        final float n = this.f / (float)this.g;
        if (this.V.nextFloat() > n) {
            this.o.a(cy.l, this.s, this.t, this.u, this.v, this.w, this.x, new int[0]);
        }
        this.w -= 0.03;
        this.d(this.v, this.w, this.x);
        this.v *= 0.9990000128746033;
        this.w *= 0.9990000128746033;
        this.x *= 0.9990000128746033;
        if (this.C) {
            this.v *= 0.699999988079071;
            this.x *= 0.699999988079071;
        }
    }
    
    public static class a implements bed
    {
        @Override
        public beb a(final int \u2603, final adm \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final int... \u2603) {
            return new bdy(\u2603, \u2603, \u2603, \u2603);
        }
    }
}
