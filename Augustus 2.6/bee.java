// 
// Decompiled by Procyon v0.5.36
// 

public class bee extends beb
{
    float a;
    
    protected bee(final adm \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603) {
        super(\u2603, \u2603, \u2603, \u2603, 0.0, 0.0, 0.0);
        final float n = 2.5f;
        this.v *= 0.10000000149011612;
        this.w *= 0.10000000149011612;
        this.x *= 0.10000000149011612;
        this.v += \u2603;
        this.w += \u2603;
        this.x += \u2603;
        final float ar = 1.0f - (float)(Math.random() * 0.30000001192092896);
        this.at = ar;
        this.as = ar;
        this.ar = ar;
        this.h *= 0.75f;
        this.h *= n;
        this.a = this.h;
        this.g = (int)(8.0 / (Math.random() * 0.8 + 0.3));
        this.g *= (int)n;
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
        this.v *= 0.9599999785423279;
        this.w *= 0.9599999785423279;
        this.x *= 0.9599999785423279;
        final wn a = this.o.a(this, 2.0);
        if (a != null && this.t > a.aR().b) {
            this.t += (a.aR().b - this.t) * 0.2;
            this.w += (a.w - this.w) * 0.2;
            this.b(this.s, this.t, this.u);
        }
        if (this.C) {
            this.v *= 0.699999988079071;
            this.x *= 0.699999988079071;
        }
    }
    
    public static class a implements bed
    {
        @Override
        public beb a(final int \u2603, final adm \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final int... \u2603) {
            return new bee(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        }
    }
}
