import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public class app extends aoh
{
    private static final alz a;
    private static final alz b;
    
    public app(final boolean \u2603) {
        super(\u2603);
    }
    
    @Override
    public boolean b(final adm \u2603, final Random \u2603, final cj \u2603) {
        final int n = \u2603.nextInt(3) + \u2603.nextInt(3) + 5;
        boolean b = true;
        if (\u2603.o() < 1 || \u2603.o() + n + 1 > 256) {
            return false;
        }
        for (int i = \u2603.o(); i <= \u2603.o() + 1 + n; ++i) {
            int n2 = 1;
            if (i == \u2603.o()) {
                n2 = 0;
            }
            if (i >= \u2603.o() + 1 + n - 2) {
                n2 = 2;
            }
            final cj.a a = new cj.a();
            for (int \u26032 = \u2603.n() - n2; \u26032 <= \u2603.n() + n2 && b; ++\u26032) {
                for (int \u26033 = \u2603.p() - n2; \u26033 <= \u2603.p() + n2 && b; ++\u26033) {
                    if (i >= 0 && i < 256) {
                        if (!this.a(\u2603.p(a.c(\u26032, i, \u26033)).c())) {
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
        if ((c != afi.c && c != afi.d) || \u2603.o() >= 256 - n - 1) {
            return false;
        }
        this.a(\u2603, \u2603.b());
        final cq a2 = cq.c.a.a(\u2603);
        final int n3 = n - \u2603.nextInt(4) - 1;
        int \u26032 = 3 - \u2603.nextInt(3);
        int \u26033 = \u2603.n();
        int n4 = \u2603.p();
        int n5 = 0;
        for (int j = 0; j < n; ++j) {
            final int k = \u2603.o() + j;
            if (j >= n3 && \u26032 > 0) {
                \u26033 += a2.g();
                n4 += a2.i();
                --\u26032;
            }
            final cj cj = new cj(\u26033, k, n4);
            final arm t = \u2603.p(cj).c().t();
            if (t == arm.a || t == arm.j) {
                this.b(\u2603, cj);
                n5 = k;
            }
        }
        cj a3 = new cj(\u26033, n5, n4);
        for (int k = -3; k <= 3; ++k) {
            for (int l = -3; l <= 3; ++l) {
                if (Math.abs(k) != 3 || Math.abs(l) != 3) {
                    this.c(\u2603, a3.a(k, 0, l));
                }
            }
        }
        a3 = a3.a();
        for (int k = -1; k <= 1; ++k) {
            for (int l = -1; l <= 1; ++l) {
                this.c(\u2603, a3.a(k, 0, l));
            }
        }
        this.c(\u2603, a3.g(2));
        this.c(\u2603, a3.f(2));
        this.c(\u2603, a3.e(2));
        this.c(\u2603, a3.d(2));
        \u26033 = \u2603.n();
        n4 = \u2603.p();
        final cq a4 = cq.c.a.a(\u2603);
        if (a4 != a2) {
            final int k = n3 - \u2603.nextInt(2) - 1;
            int l = 1 + \u2603.nextInt(3);
            n5 = 0;
            for (int n6 = k; n6 < n && l > 0; ++n6, --l) {
                if (n6 >= 1) {
                    final int n7 = \u2603.o() + n6;
                    \u26033 += a4.g();
                    n4 += a4.i();
                    final cj cj2 = new cj(\u26033, n7, n4);
                    final arm t2 = \u2603.p(cj2).c().t();
                    if (t2 == arm.a || t2 == arm.j) {
                        this.b(\u2603, cj2);
                        n5 = n7;
                    }
                }
            }
            if (n5 > 0) {
                cj a5 = new cj(\u26033, n5, n4);
                for (int n7 = -2; n7 <= 2; ++n7) {
                    for (int \u26034 = -2; \u26034 <= 2; ++\u26034) {
                        if (Math.abs(n7) != 2 || Math.abs(\u26034) != 2) {
                            this.c(\u2603, a5.a(n7, 0, \u26034));
                        }
                    }
                }
                a5 = a5.a();
                for (int n7 = -1; n7 <= 1; ++n7) {
                    for (int \u26034 = -1; \u26034 <= 1; ++\u26034) {
                        this.c(\u2603, a5.a(n7, 0, \u26034));
                    }
                }
            }
        }
        return true;
    }
    
    private void b(final adm \u2603, final cj \u2603) {
        this.a(\u2603, \u2603, app.a);
    }
    
    private void c(final adm \u2603, final cj \u2603) {
        final arm t = \u2603.p(\u2603).c().t();
        if (t == arm.a || t == arm.j) {
            this.a(\u2603, \u2603, app.b);
        }
    }
    
    static {
        a = afi.s.Q().a(aig.b, aio.a.e);
        b = afi.u.Q().a(aif.Q, aio.a.e).a((amo<Comparable>)ahs.b, false);
    }
}
