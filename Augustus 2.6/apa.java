import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public class apa extends aot
{
    private afh a;
    private int b;
    
    public apa(final int \u2603) {
        this.a = afi.cB;
        this.b = \u2603;
    }
    
    @Override
    public boolean b(final adm \u2603, final Random \u2603, cj \u2603) {
        while (\u2603.d(\u2603) && \u2603.o() > 2) {
            \u2603 = \u2603.b();
        }
        if (\u2603.p(\u2603).c() != afi.aJ) {
            return false;
        }
        final int n = \u2603.nextInt(this.b - 2) + 2;
        final int n2 = 1;
        for (int i = \u2603.n() - n; i <= \u2603.n() + n; ++i) {
            for (int j = \u2603.p() - n; j <= \u2603.p() + n; ++j) {
                final int n3 = i - \u2603.n();
                final int n4 = j - \u2603.p();
                if (n3 * n3 + n4 * n4 <= n * n) {
                    for (int k = \u2603.o() - n2; k <= \u2603.o() + n2; ++k) {
                        final cj cj = new cj(i, k, j);
                        final afh c = \u2603.p(cj).c();
                        if (c == afi.d || c == afi.aJ || c == afi.aI) {
                            \u2603.a(cj, this.a.Q(), 2);
                        }
                    }
                }
            }
        }
        return true;
    }
}
