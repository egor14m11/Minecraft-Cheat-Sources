// 
// Decompiled by Procyon v0.5.36
// 

public class bdl extends beb
{
    protected bdl(final adm \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603) {
        super(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        this.ar = 1.0f;
        this.as = 1.0f;
        this.at = 1.0f;
        this.k(32);
        this.a(0.02f, 0.02f);
        this.h *= this.V.nextFloat() * 0.6f + 0.2f;
        this.v = \u2603 * 0.20000000298023224 + (Math.random() * 2.0 - 1.0) * 0.019999999552965164;
        this.w = \u2603 * 0.20000000298023224 + (Math.random() * 2.0 - 1.0) * 0.019999999552965164;
        this.x = \u2603 * 0.20000000298023224 + (Math.random() * 2.0 - 1.0) * 0.019999999552965164;
        this.g = (int)(8.0 / (Math.random() * 0.8 + 0.2));
    }
    
    @Override
    public void t_() {
        this.p = this.s;
        this.q = this.t;
        this.r = this.u;
        this.w += 0.002;
        this.d(this.v, this.w, this.x);
        this.v *= 0.8500000238418579;
        this.w *= 0.8500000238418579;
        this.x *= 0.8500000238418579;
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
            return new bdl(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        }
    }
}
