// 
// Decompiled by Procyon v0.5.36
// 

public class bdp extends beb
{
    protected bdp(final adm \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603) {
        super(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        this.v = \u2603 + (Math.random() * 2.0 - 1.0) * 0.05000000074505806;
        this.w = \u2603 + (Math.random() * 2.0 - 1.0) * 0.05000000074505806;
        this.x = \u2603 + (Math.random() * 2.0 - 1.0) * 0.05000000074505806;
        final float ar = this.V.nextFloat() * 0.3f + 0.7f;
        this.at = ar;
        this.as = ar;
        this.ar = ar;
        this.h = this.V.nextFloat() * this.V.nextFloat() * 6.0f + 1.0f;
        this.g = (int)(16.0 / (this.V.nextFloat() * 0.8 + 0.2)) + 2;
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
        this.w += 0.004;
        this.d(this.v, this.w, this.x);
        this.v *= 0.8999999761581421;
        this.w *= 0.8999999761581421;
        this.x *= 0.8999999761581421;
        if (this.C) {
            this.v *= 0.699999988079071;
            this.x *= 0.699999988079071;
        }
    }
    
    public static class a implements bed
    {
        @Override
        public beb a(final int \u2603, final adm \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final int... \u2603) {
            return new bdp(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        }
    }
}
