// 
// Decompiled by Procyon v0.5.36
// 

public class asz extends asw
{
    @Override
    public void a(final adq \u2603, final pk \u2603) {
        super.a(\u2603, \u2603);
    }
    
    @Override
    public void a() {
        super.a();
    }
    
    @Override
    public asv a(final pk \u2603) {
        return this.a(ns.c(\u2603.aR().a), ns.c(\u2603.aR().b + 0.5), ns.c(\u2603.aR().c));
    }
    
    @Override
    public asv a(final pk \u2603, final double \u2603, final double \u2603, final double \u2603) {
        return this.a(ns.c(\u2603 - \u2603.J / 2.0f), ns.c(\u2603 + 0.5), ns.c(\u2603 - \u2603.J / 2.0f));
    }
    
    @Override
    public int a(final asv[] \u2603, final pk \u2603, final asv \u2603, final asv \u2603, final float \u2603) {
        int n = 0;
        for (final cq cq : cq.values()) {
            final asv a = this.a(\u2603, \u2603.a + cq.g(), \u2603.b + cq.h(), \u2603.c + cq.i());
            if (a != null && !a.i && a.a(\u2603) < \u2603) {
                \u2603[n++] = a;
            }
        }
        return n;
    }
    
    private asv a(final pk \u2603, final int \u2603, final int \u2603, final int \u2603) {
        final int b = this.b(\u2603, \u2603, \u2603, \u2603);
        if (b == -1) {
            return this.a(\u2603, \u2603, \u2603);
        }
        return null;
    }
    
    private int b(final pk \u2603, final int \u2603, final int \u2603, final int \u2603) {
        final cj.a a = new cj.a();
        for (int i = \u2603; i < \u2603 + this.c; ++i) {
            for (int j = \u2603; j < \u2603 + this.d; ++j) {
                for (int k = \u2603; k < \u2603 + this.e; ++k) {
                    final afh c = this.a.p(a.c(i, j, k)).c();
                    if (c.t() != arm.h) {
                        return 0;
                    }
                }
            }
        }
        return -1;
    }
}
