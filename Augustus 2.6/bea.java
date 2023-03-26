// 
// Decompiled by Procyon v0.5.36
// 

public class bea extends beb
{
    float a;
    
    protected bea(final adm \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603) {
        this(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603, 2.0f);
    }
    
    protected bea(final adm \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final float \u2603) {
        super(\u2603, \u2603, \u2603, \u2603, 0.0, 0.0, 0.0);
        this.v *= 0.009999999776482582;
        this.w *= 0.009999999776482582;
        this.x *= 0.009999999776482582;
        this.w += 0.2;
        this.ar = ns.a(((float)\u2603 + 0.0f) * 3.1415927f * 2.0f) * 0.65f + 0.35f;
        this.as = ns.a(((float)\u2603 + 0.33333334f) * 3.1415927f * 2.0f) * 0.65f + 0.35f;
        this.at = ns.a(((float)\u2603 + 0.6666667f) * 3.1415927f * 2.0f) * 0.65f + 0.35f;
        this.h *= 0.75f;
        this.h *= \u2603;
        this.a = this.h;
        this.g = 6;
        this.T = false;
        this.k(64);
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
        this.v *= 0.6600000262260437;
        this.w *= 0.6600000262260437;
        this.x *= 0.6600000262260437;
        if (this.C) {
            this.v *= 0.699999988079071;
            this.x *= 0.699999988079071;
        }
    }
    
    public static class a implements bed
    {
        @Override
        public beb a(final int \u2603, final adm \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final int... \u2603) {
            return new bea(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        }
    }
}
