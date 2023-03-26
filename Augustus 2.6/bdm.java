// 
// Decompiled by Procyon v0.5.36
// 

public class bdm extends beb
{
    float a;
    
    protected bdm(final adm \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603) {
        this(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603, 1.0f);
    }
    
    protected bdm(final adm \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final float \u2603) {
        super(\u2603, \u2603, \u2603, \u2603, 0.0, 0.0, 0.0);
        this.v *= 0.10000000149011612;
        this.w *= 0.10000000149011612;
        this.x *= 0.10000000149011612;
        this.v += \u2603 * 0.4;
        this.w += \u2603 * 0.4;
        this.x += \u2603 * 0.4;
        final float ar = (float)(Math.random() * 0.30000001192092896 + 0.6000000238418579);
        this.at = ar;
        this.as = ar;
        this.ar = ar;
        this.h *= 0.75f;
        this.h *= \u2603;
        this.a = this.h;
        this.g = (int)(6.0 / (Math.random() * 0.8 + 0.6));
        this.g *= (int)\u2603;
        this.T = false;
        this.k(65);
        this.t_();
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
        this.as *= (float)0.96;
        this.at *= (float)0.9;
        this.v *= 0.699999988079071;
        this.w *= 0.699999988079071;
        this.x *= 0.699999988079071;
        this.w -= 0.019999999552965164;
        if (this.C) {
            this.v *= 0.699999988079071;
            this.x *= 0.699999988079071;
        }
    }
    
    public static class b implements bed
    {
        @Override
        public beb a(final int \u2603, final adm \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final int... \u2603) {
            return new bdm(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        }
    }
    
    public static class a implements bed
    {
        @Override
        public beb a(final int \u2603, final adm \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final int... \u2603) {
            final beb beb = new bdm(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
            beb.b(beb.b() * 0.3f, beb.g() * 0.8f, beb.i());
            beb.k();
            return beb;
        }
    }
}
