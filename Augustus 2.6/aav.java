// 
// Decompiled by Procyon v0.5.36
// 

public class aav extends yo
{
    public aav(final afh \u2603) {
        super(\u2603);
        this.d(0);
        this.a(true);
    }
    
    @Override
    public boolean a(final zx \u2603, final wn \u2603, final adm \u2603, final cj \u2603, final cq \u2603, final float \u2603, final float \u2603, final float \u2603) {
        if (\u2603.b == 0) {
            return false;
        }
        if (!\u2603.a(\u2603, \u2603, \u2603)) {
            return false;
        }
        alz alz = \u2603.p(\u2603);
        afh afh = alz.c();
        cj a = \u2603;
        if ((\u2603 != cq.b || afh != this.a) && !afh.a(\u2603, \u2603)) {
            a = \u2603.a(\u2603);
            alz = \u2603.p(a);
            afh = alz.c();
        }
        if (afh == this.a) {
            final int intValue = alz.b((amo<Integer>)ajp.a);
            if (intValue <= 7) {
                final alz a2 = alz.a((amo<Comparable>)ajp.a, intValue + 1);
                final aug a3 = this.a.a(\u2603, a, a2);
                if (a3 != null && \u2603.b(a3) && \u2603.a(a, a2, 2)) {
                    \u2603.a(a.n() + 0.5f, a.o() + 0.5f, a.p() + 0.5f, this.a.H.b(), (this.a.H.d() + 1.0f) / 2.0f, this.a.H.e() * 0.8f);
                    --\u2603.b;
                    return true;
                }
            }
        }
        return super.a(\u2603, \u2603, \u2603, a, \u2603, \u2603, \u2603, \u2603);
    }
    
    @Override
    public int a(final int \u2603) {
        return \u2603;
    }
}
