import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public class aoj extends aoh
{
    private static final alz a;
    private static final alz b;
    private boolean c;
    
    public aoj(final boolean \u2603, final boolean \u2603) {
        super(\u2603);
        this.c = \u2603;
    }
    
    @Override
    public boolean b(final adm \u2603, final Random \u2603, final cj \u2603) {
        int n = \u2603.nextInt(3) + 5;
        if (this.c) {
            n += \u2603.nextInt(7);
        }
        boolean b = true;
        if (\u2603.o() < 1 || \u2603.o() + n + 1 > 256) {
            return false;
        }
        for (int i = \u2603.o(); i <= \u2603.o() + 1 + n; ++i) {
            int j = 1;
            if (i == \u2603.o()) {
                j = 0;
            }
            if (i >= \u2603.o() + 1 + n - 2) {
                j = 2;
            }
            final cj.a a = new cj.a();
            for (int \u26032 = \u2603.n() - j; \u26032 <= \u2603.n() + j && b; ++\u26032) {
                for (int k = \u2603.p() - j; k <= \u2603.p() + j && b; ++k) {
                    if (i >= 0 && i < 256) {
                        if (!this.a(\u2603.p(a.c(\u26032, i, k)).c())) {
                            b = false;
                        }
                    }
                    else {
                        b = false;
                    }
                }
            }
        }
        if (!b) {
            return false;
        }
        final afh c = \u2603.p(\u2603.b()).c();
        if ((c != afi.c && c != afi.d && c != afi.ak) || \u2603.o() >= 256 - n - 1) {
            return false;
        }
        this.a(\u2603, \u2603.b());
        for (int j = \u2603.o() - 3 + n; j <= \u2603.o() + n; ++j) {
            final int n2 = j - (\u2603.o() + n);
            for (int \u26032 = 1 - n2 / 2, k = \u2603.n() - \u26032; k <= \u2603.n() + \u26032; ++k) {
                final int a2 = k - \u2603.n();
                for (int l = \u2603.p() - \u26032; l <= \u2603.p() + \u26032; ++l) {
                    final int a3 = l - \u2603.p();
                    if (Math.abs(a2) == \u26032 && Math.abs(a3) == \u26032) {
                        if (\u2603.nextInt(2) == 0) {
                            continue;
                        }
                        if (n2 == 0) {
                            continue;
                        }
                    }
                    final cj cj = new cj(k, j, l);
                    final afh c2 = \u2603.p(cj).c();
                    if (c2.t() == arm.a || c2.t() == arm.j) {
                        this.a(\u2603, cj, aoj.b);
                    }
                }
            }
        }
        for (int j = 0; j < n; ++j) {
            final afh c3 = \u2603.p(\u2603.b(j)).c();
            if (c3.t() == arm.a || c3.t() == arm.j) {
                this.a(\u2603, \u2603.b(j), aoj.a);
            }
        }
        return true;
    }
    
    static {
        a = afi.r.Q().a(ail.b, aio.a.c);
        b = afi.t.Q().a(aik.Q, aio.a.c).a((amo<Comparable>)aik.b, false);
    }
}
