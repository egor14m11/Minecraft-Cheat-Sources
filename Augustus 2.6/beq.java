// 
// Decompiled by Procyon v0.5.36
// 

public class beq extends beb
{
    protected beq(final adm \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603) {
        super(\u2603, \u2603, \u2603, \u2603, 0.0, 0.0, 0.0);
        this.v *= 0.30000001192092896;
        this.w = Math.random() * 0.20000000298023224 + 0.10000000149011612;
        this.x *= 0.30000001192092896;
        this.ar = 1.0f;
        this.as = 1.0f;
        this.at = 1.0f;
        this.k(19);
        this.a(0.01f, 0.01f);
        this.g = (int)(8.0 / (Math.random() * 0.8 + 0.2));
        this.i = 0.0f;
        this.v = \u2603;
        this.w = \u2603;
        this.x = \u2603;
    }
    
    @Override
    public void t_() {
        this.p = this.s;
        this.q = this.t;
        this.r = this.u;
        this.w -= this.i;
        this.d(this.v, this.w, this.x);
        this.v *= 0.9800000190734863;
        this.w *= 0.9800000190734863;
        this.x *= 0.9800000190734863;
        final int n = 60 - this.g;
        final float n2 = n * 0.001f;
        this.a(n2, n2);
        this.k(19 + n % 4);
        if (this.g-- <= 0) {
            this.J();
        }
    }
    
    public static class a implements bed
    {
        @Override
        public beb a(final int \u2603, final adm \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final int... \u2603) {
            return new beq(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        }
    }
}
