// 
// Decompiled by Procyon v0.5.36
// 

public class ber extends beb
{
    protected ber(final adm \u2603, final double \u2603, final double \u2603, final double \u2603) {
        super(\u2603, \u2603, \u2603, \u2603, 0.0, 0.0, 0.0);
        this.v *= 0.30000001192092896;
        this.w = Math.random() * 0.20000000298023224 + 0.10000000149011612;
        this.x *= 0.30000001192092896;
        this.ar = 1.0f;
        this.as = 1.0f;
        this.at = 1.0f;
        this.k(19 + this.V.nextInt(4));
        this.a(0.01f, 0.01f);
        this.i = 0.06f;
        this.g = (int)(8.0 / (Math.random() * 0.8 + 0.2));
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
        if (this.g-- <= 0) {
            this.J();
        }
        if (this.C) {
            if (Math.random() < 0.5) {
                this.J();
            }
            this.v *= 0.699999988079071;
            this.x *= 0.699999988079071;
        }
        final cj cj = new cj(this);
        final alz p = this.o.p(cj);
        final afh c = p.c();
        c.a((adq)this.o, cj);
        final arm t = p.c().t();
        if (t.d() || t.a()) {
            double e = 0.0;
            if (p.c() instanceof ahv) {
                e = 1.0f - ahv.b(p.b((amo<Integer>)ahv.b));
            }
            else {
                e = c.E();
            }
            final double n = ns.c(this.t) + e;
            if (this.t < n) {
                this.J();
            }
        }
    }
    
    public static class a implements bed
    {
        @Override
        public beb a(final int \u2603, final adm \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final int... \u2603) {
            return new ber(\u2603, \u2603, \u2603, \u2603);
        }
    }
}
