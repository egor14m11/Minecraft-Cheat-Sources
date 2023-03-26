// 
// Decompiled by Procyon v0.5.36
// 

public class bdt extends beb
{
    float a;
    
    protected bdt(final adm \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603) {
        this(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603, 2.0f);
    }
    
    protected bdt(final adm \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final float \u2603) {
        super(\u2603, \u2603, \u2603, \u2603, 0.0, 0.0, 0.0);
        this.v *= 0.009999999776482582;
        this.w *= 0.009999999776482582;
        this.x *= 0.009999999776482582;
        this.w += 0.1;
        this.h *= 0.75f;
        this.h *= \u2603;
        this.a = this.h;
        this.g = 16;
        this.T = false;
        this.k(80);
    }
    
    @Override
    public void a(final bfd \u2603, final pk \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603) {
        float a = (this.f + \u2603) / this.g * 32.0f;
        a = ns.a(a, 0.0f, 1.0f);
        this.h = this.a * a;
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
        this.d(this.v, this.w, this.x);
        if (this.t == this.q) {
            this.v *= 1.1;
            this.x *= 1.1;
        }
        this.v *= 0.8600000143051147;
        this.w *= 0.8600000143051147;
        this.x *= 0.8600000143051147;
        if (this.C) {
            this.v *= 0.699999988079071;
            this.x *= 0.699999988079071;
        }
    }
    
    public static class b implements bed
    {
        @Override
        public beb a(final int \u2603, final adm \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final int... \u2603) {
            return new bdt(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        }
    }
    
    public static class a implements bed
    {
        @Override
        public beb a(final int \u2603, final adm \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final int... \u2603) {
            final beb beb = new bdt(\u2603, \u2603, \u2603 + 0.5, \u2603, \u2603, \u2603, \u2603);
            beb.k(81);
            beb.b(1.0f, 1.0f, 1.0f);
            return beb;
        }
    }
}
