// 
// Decompiled by Procyon v0.5.36
// 

public class agk extends agg
{
    private final cr P;
    
    public agk() {
        this.P = new cn();
    }
    
    @Override
    protected cr a(final zx \u2603) {
        return this.P;
    }
    
    @Override
    public akw a(final adm \u2603, final int \u2603) {
        return new ald();
    }
    
    @Override
    protected void f(final adm \u2603, final cj \u2603) {
        final cl cl = new cl(\u2603, \u2603);
        final alc alc = cl.h();
        if (alc == null) {
            return;
        }
        final int m = alc.m();
        if (m < 0) {
            \u2603.b(1001, \u2603, 0);
            return;
        }
        final zx a = alc.a(m);
        if (a == null) {
            return;
        }
        final cq \u26032 = \u2603.p(\u2603).b((amo<cq>)agk.a);
        final cj a2 = \u2603.a(\u26032);
        final og b = alj.b(\u2603, a2.n(), a2.o(), a2.p());
        zx \u26033;
        if (b == null) {
            \u26033 = this.P.a(cl, a);
            if (\u26033 != null && \u26033.b <= 0) {
                \u26033 = null;
            }
        }
        else {
            \u26033 = alj.a(b, a.k().a(1), \u26032.d());
            if (\u26033 == null) {
                final zx k;
                \u26033 = (k = a.k());
                if (--k.b <= 0) {
                    \u26033 = null;
                }
            }
            else {
                \u26033 = a.k();
            }
        }
        alc.a(m, \u26033);
    }
}
