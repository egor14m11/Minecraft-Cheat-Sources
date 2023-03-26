// 
// Decompiled by Procyon v0.5.36
// 

public class aau extends yo
{
    private final ahh b;
    private final ahh c;
    
    public aau(final afh \u2603, final ahh \u2603, final ahh \u2603) {
        super(\u2603);
        this.b = \u2603;
        this.c = \u2603;
        this.d(0);
        this.a(true);
    }
    
    @Override
    public int a(final int \u2603) {
        return \u2603;
    }
    
    @Override
    public String e_(final zx \u2603) {
        return this.b.b(\u2603.i());
    }
    
    @Override
    public boolean a(final zx \u2603, final wn \u2603, final adm \u2603, final cj \u2603, final cq \u2603, final float \u2603, final float \u2603, final float \u2603) {
        if (\u2603.b == 0) {
            return false;
        }
        if (!\u2603.a(\u2603.a(\u2603), \u2603, \u2603)) {
            return false;
        }
        final Object a = this.b.a(\u2603);
        final alz p = \u2603.p(\u2603);
        if (p.c() == this.b) {
            final amo n = this.b.n();
            final Comparable b = p.b((amo<Comparable>)n);
            final ahh.a a2 = p.b(ahh.a);
            if (((\u2603 == cq.b && a2 == ahh.a.b) || (\u2603 == cq.a && a2 == ahh.a.a)) && b == a) {
                final alz a3 = this.c.Q().a((amo<Comparable>)n, b);
                if (\u2603.b(this.c.a(\u2603, \u2603, a3)) && \u2603.a(\u2603, a3, 3)) {
                    \u2603.a(\u2603.n() + 0.5f, \u2603.o() + 0.5f, \u2603.p() + 0.5f, this.c.H.b(), (this.c.H.d() + 1.0f) / 2.0f, this.c.H.e() * 0.8f);
                    --\u2603.b;
                }
                return true;
            }
        }
        return this.a(\u2603, \u2603, \u2603.a(\u2603), a) || super.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
    }
    
    @Override
    public boolean a(final adm \u2603, cj \u2603, final cq \u2603, final wn \u2603, final zx \u2603) {
        final cj \u26032 = \u2603;
        final amo n = this.b.n();
        final Object a = this.b.a(\u2603);
        final alz p = \u2603.p(\u2603);
        if (p.c() == this.b) {
            final boolean b = p.b(ahh.a) == ahh.a.a;
            if (((\u2603 == cq.b && !b) || (\u2603 == cq.a && b)) && a == p.b((amo<Comparable>)n)) {
                return true;
            }
        }
        \u2603 = \u2603.a(\u2603);
        final alz p2 = \u2603.p(\u2603);
        return (p2.c() == this.b && a == p2.b((amo<Comparable>)n)) || super.a(\u2603, \u26032, \u2603, \u2603, \u2603);
    }
    
    private boolean a(final zx \u2603, final adm \u2603, final cj \u2603, final Object \u2603) {
        final alz p = \u2603.p(\u2603);
        if (p.c() == this.b) {
            final Comparable b = (Comparable)p.b(this.b.n());
            if (b == \u2603) {
                final alz a = this.c.Q().a(this.b.n(), b);
                if (\u2603.b(this.c.a(\u2603, \u2603, a)) && \u2603.a(\u2603, a, 3)) {
                    \u2603.a(\u2603.n() + 0.5f, \u2603.o() + 0.5f, \u2603.p() + 0.5f, this.c.H.b(), (this.c.H.d() + 1.0f) / 2.0f, this.c.H.e() * 0.8f);
                    --\u2603.b;
                }
                return true;
            }
        }
        return false;
    }
}
