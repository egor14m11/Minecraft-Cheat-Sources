import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public class aov extends apv
{
    private final alz a;
    private final alz b;
    
    public aov(final alz \u2603, final alz \u2603) {
        super(false);
        this.b = \u2603;
        this.a = \u2603;
    }
    
    @Override
    public boolean b(final adm \u2603, final Random \u2603, cj \u2603) {
        afh c;
        while (((c = \u2603.p(\u2603).c()).t() == arm.a || c.t() == arm.j) && \u2603.o() > 0) {
            \u2603 = \u2603.b();
        }
        final afh c2 = \u2603.p(\u2603).c();
        if (c2 == afi.d || c2 == afi.c) {
            \u2603 = \u2603.a();
            this.a(\u2603, \u2603, this.b);
            for (int i = \u2603.o(); i <= \u2603.o() + 2; ++i) {
                final int n = i - \u2603.o();
                for (int n2 = 2 - n, j = \u2603.n() - n2; j <= \u2603.n() + n2; ++j) {
                    final int a = j - \u2603.n();
                    for (int k = \u2603.p() - n2; k <= \u2603.p() + n2; ++k) {
                        final int a2 = k - \u2603.p();
                        if (Math.abs(a) != n2 || Math.abs(a2) != n2 || \u2603.nextInt(2) != 0) {
                            final cj cj = new cj(j, i, k);
                            if (!\u2603.p(cj).c().o()) {
                                this.a(\u2603, cj, this.a);
                            }
                        }
                    }
                }
            }
        }
        return true;
    }
}
