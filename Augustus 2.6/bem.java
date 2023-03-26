// 
// Decompiled by Procyon v0.5.36
// 

public class bem extends beb
{
    protected bem(final adm \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603) {
        super(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        final float at = this.V.nextFloat() * 0.1f + 0.2f;
        this.ar = at;
        this.as = at;
        this.at = at;
        this.k(0);
        this.a(0.02f, 0.02f);
        this.h *= this.V.nextFloat() * 0.6f + 0.5f;
        this.v *= 0.019999999552965164;
        this.w *= 0.019999999552965164;
        this.x *= 0.019999999552965164;
        this.g = (int)(20.0 / (Math.random() * 0.8 + 0.2));
        this.T = true;
    }
    
    @Override
    public void t_() {
        this.p = this.s;
        this.q = this.t;
        this.r = this.u;
        this.d(this.v, this.w, this.x);
        this.v *= 0.99;
        this.w *= 0.99;
        this.x *= 0.99;
        if (this.g-- <= 0) {
            this.J();
        }
    }
    
    public static class b implements bed
    {
        @Override
        public beb a(final int \u2603, final adm \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final int... \u2603) {
            return new bem(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        }
    }
    
    public static class a implements bed
    {
        @Override
        public beb a(final int \u2603, final adm \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final int... \u2603) {
            final beb beb = new bem(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
            beb.k(82);
            beb.b(1.0f, 1.0f, 1.0f);
            return beb;
        }
    }
}
