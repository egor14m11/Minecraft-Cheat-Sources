// 
// Decompiled by Procyon v0.5.36
// 

public class bel extends beb
{
    protected bel(final adm \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603) {
        super(\u2603, \u2603, \u2603 - 0.125, \u2603, \u2603, \u2603, \u2603);
        this.ar = 0.4f;
        this.as = 0.4f;
        this.at = 0.7f;
        this.k(0);
        this.a(0.01f, 0.01f);
        this.h *= this.V.nextFloat() * 0.6f + 0.2f;
        this.v = \u2603 * 0.0;
        this.w = \u2603 * 0.0;
        this.x = \u2603 * 0.0;
        this.g = (int)(16.0 / (Math.random() * 0.8 + 0.2));
    }
    
    @Override
    public void t_() {
        this.p = this.s;
        this.q = this.t;
        this.r = this.u;
        this.d(this.v, this.w, this.x);
        if (this.o.p(new cj(this)).c().t() != arm.h) {
            this.J();
        }
        if (this.g-- <= 0) {
            this.J();
        }
    }
    
    public static class a implements bed
    {
        @Override
        public beb a(final int \u2603, final adm \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final int... \u2603) {
            return new bel(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        }
    }
}
