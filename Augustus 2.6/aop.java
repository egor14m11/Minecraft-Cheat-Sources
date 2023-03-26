import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public class aop extends aot
{
    private afh a;
    private int b;
    
    public aop(final int \u2603) {
        this.a = afi.aL;
        this.b = \u2603;
    }
    
    @Override
    public boolean b(final adm \u2603, final Random \u2603, final cj \u2603) {
        if (\u2603.p(\u2603).c().t() != arm.h) {
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
                        if (c == afi.d || c == afi.aL) {
                            \u2603.a(cj, this.a.Q(), 2);
                        }
                    }
                }
            }
        }
        return true;
    }
}
