import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public class apt extends aoh
{
    private static final alz a;
    private static final alz b;
    
    public apt() {
        super(false);
    }
    
    @Override
    public boolean b(final adm \u2603, final Random \u2603, cj \u2603) {
        final int n = \u2603.nextInt(4) + 5;
        while (\u2603.p(\u2603.b()).c().t() == arm.h) {
            \u2603 = \u2603.b();
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
                j = 3;
            }
            final cj.a a = new cj.a();
            for (int \u26032 = \u2603.n() - j; \u26032 <= \u2603.n() + j && b; ++\u26032) {
                for (int k = \u2603.p() - j; k <= \u2603.p() + j && b; ++k) {
                    if (i >= 0 && i < 256) {
                        final afh c = \u2603.p(a.c(\u26032, i, k)).c();
                        if (c.t() != arm.a && c.t() != arm.j) {
                            if (c == afi.j || c == afi.i) {
                                if (i > \u2603.o()) {
                                    b = false;
                                }
                            }
                            else {
                                b = false;
                            }
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
        final afh c2 = \u2603.p(\u2603.b()).c();
        if ((c2 != afi.c && c2 != afi.d) || \u2603.o() >= 256 - n - 1) {
            return false;
        }
        this.a(\u2603, \u2603.b());
        for (int j = \u2603.o() - 3 + n; j <= \u2603.o() + n; ++j) {
            final int n2 = j - (\u2603.o() + n);
            for (int \u26032 = 2 - n2 / 2, k = \u2603.n() - \u26032; k <= \u2603.n() + \u26032; ++k) {
                final int l = k - \u2603.n();
                for (int n3 = \u2603.p() - \u26032; n3 <= \u2603.p() + \u26032; ++n3) {
                    final int a2 = n3 - \u2603.p();
                    if (Math.abs(l) == \u26032 && Math.abs(a2) == \u26032) {
                        if (\u2603.nextInt(2) == 0) {
                            continue;
                        }
                        if (n2 == 0) {
                            continue;
                        }
                    }
                    final cj f = new cj(k, j, n3);
                    if (!\u2603.p(f).c().o()) {
                        this.a(\u2603, f, apt.b);
                    }
                }
            }
        }
        for (int j = 0; j < n; ++j) {
            final afh c3 = \u2603.p(\u2603.b(j)).c();
            if (c3.t() == arm.a || c3.t() == arm.j || c3 == afi.i || c3 == afi.j) {
                this.a(\u2603, \u2603.b(j), apt.a);
            }
        }
        for (int j = \u2603.o() - 3 + n; j <= \u2603.o() + n; ++j) {
            final int n2 = j - (\u2603.o() + n);
            final int \u26032 = 2 - n2 / 2;
            final cj.a \u26033 = new cj.a();
            for (int l = \u2603.n() - \u26032; l <= \u2603.n() + \u26032; ++l) {
                for (int n3 = \u2603.p() - \u26032; n3 <= \u2603.p() + \u26032; ++n3) {
                    \u26033.c(l, j, n3);
                    if (\u2603.p(\u26033).c().t() == arm.j) {
                        final cj e = \u26033.e();
                        final cj f = \u26033.f();
                        final cj c4 = \u26033.c();
                        final cj d = \u26033.d();
                        if (\u2603.nextInt(4) == 0 && \u2603.p(e).c().t() == arm.a) {
                            this.a(\u2603, e, akk.N);
                        }
                        if (\u2603.nextInt(4) == 0 && \u2603.p(f).c().t() == arm.a) {
                            this.a(\u2603, f, akk.P);
                        }
                        if (\u2603.nextInt(4) == 0 && \u2603.p(c4).c().t() == arm.a) {
                            this.a(\u2603, c4, akk.O);
                        }
                        if (\u2603.nextInt(4) == 0 && \u2603.p(d).c().t() == arm.a) {
                            this.a(\u2603, d, akk.b);
                        }
                    }
                }
            }
        }
        return true;
    }
    
    private void a(final adm \u2603, cj \u2603, final amk \u2603) {
        final alz a = afi.bn.Q().a((amo<Comparable>)\u2603, true);
        this.a(\u2603, \u2603, a);
        int n;
        for (n = 4, \u2603 = \u2603.b(); \u2603.p(\u2603).c().t() == arm.a && n > 0; \u2603 = \u2603.b(), --n) {
            this.a(\u2603, \u2603, a);
        }
    }
    
    static {
        a = afi.r.Q().a(ail.b, aio.a.a);
        b = afi.t.Q().a(aik.Q, aio.a.a).a((amo<Comparable>)aik.b, false);
    }
}
