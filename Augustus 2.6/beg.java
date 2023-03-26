// 
// Decompiled by Procyon v0.5.36
// 

public class beg extends beb
{
    float a;
    
    protected beg(final adm \u2603, final double \u2603, final double \u2603, final double \u2603, final float \u2603, final float \u2603, final float \u2603) {
        this(\u2603, \u2603, \u2603, \u2603, 1.0f, \u2603, \u2603, \u2603);
    }
    
    protected beg(final adm \u2603, final double \u2603, final double \u2603, final double \u2603, final float \u2603, float \u2603, final float \u2603, final float \u2603) {
        super(\u2603, \u2603, \u2603, \u2603, 0.0, 0.0, 0.0);
        this.v *= 0.10000000149011612;
        this.w *= 0.10000000149011612;
        this.x *= 0.10000000149011612;
        if (\u2603 == 0.0f) {
            \u2603 = 1.0f;
        }
        final float n = (float)Math.random() * 0.4f + 0.6f;
        this.ar = ((float)(Math.random() * 0.20000000298023224) + 0.8f) * \u2603 * n;
        this.as = ((float)(Math.random() * 0.20000000298023224) + 0.8f) * \u2603 * n;
        this.at = ((float)(Math.random() * 0.20000000298023224) + 0.8f) * \u2603 * n;
        this.h *= 0.75f;
        this.h *= \u2603;
        this.a = this.h;
        this.g = (int)(8.0 / (Math.random() * 0.8 + 0.2));
        this.g *= (int)\u2603;
        this.T = false;
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
        this.k(7 - this.f * 8 / this.g);
        this.d(this.v, this.w, this.x);
        if (this.t == this.q) {
            this.v *= 1.1;
            this.x *= 1.1;
        }
        this.v *= 0.9599999785423279;
        this.w *= 0.9599999785423279;
        this.x *= 0.9599999785423279;
        if (this.C) {
            this.v *= 0.699999988079071;
            this.x *= 0.699999988079071;
        }
    }
    
    public static class a implements bed
    {
        @Override
        public beb a(final int \u2603, final adm \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final int... \u2603) {
            return new beg(\u2603, \u2603, \u2603, \u2603, (float)\u2603, (float)\u2603, (float)\u2603);
        }
    }
}
