import java.util.Iterator;
import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public class apv extends aoh
{
    private static final alz a;
    private static final alz b;
    private final int c;
    private final boolean d;
    private final alz e;
    private final alz f;
    
    public apv(final boolean \u2603) {
        this(\u2603, 4, apv.a, apv.b, false);
    }
    
    public apv(final boolean \u2603, final int \u2603, final alz \u2603, final alz \u2603, final boolean \u2603) {
        super(\u2603);
        this.c = \u2603;
        this.e = \u2603;
        this.f = \u2603;
        this.d = \u2603;
    }
    
    @Override
    public boolean b(final adm \u2603, final Random \u2603, final cj \u2603) {
        final int n = \u2603.nextInt(3) + this.c;
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
            for (int j = \u2603.n() - n2; j <= \u2603.n() + n2 && b; ++j) {
                for (int \u26032 = \u2603.p() - n2; \u26032 <= \u2603.p() + n2 && b; ++\u26032) {
                    if (i >= 0 && i < 256) {
                        if (!this.a(\u2603.p(a.c(j, i, \u26032)).c())) {
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
        int n2 = 3;
        final int n3 = 0;
        for (int j = \u2603.o() - n2 + n; j <= \u2603.o() + n; ++j) {
            final int \u26032 = j - (\u2603.o() + n);
            for (int n4 = n3 + 1 - \u26032 / 2, k = \u2603.n() - n4; k <= \u2603.n() + n4; ++k) {
                final int l = k - \u2603.n();
                for (int n5 = \u2603.p() - n4; n5 <= \u2603.p() + n4; ++n5) {
                    final int a2 = n5 - \u2603.p();
                    if (Math.abs(l) == n4 && Math.abs(a2) == n4) {
                        if (\u2603.nextInt(2) == 0) {
                            continue;
                        }
                        if (\u26032 == 0) {
                            continue;
                        }
                    }
                    final cj f = new cj(k, j, n5);
                    final afh c2 = \u2603.p(f).c();
                    if (c2.t() == arm.a || c2.t() == arm.j || c2.t() == arm.l) {
                        this.a(\u2603, f, this.f);
                    }
                }
            }
        }
        for (int j = 0; j < n; ++j) {
            final afh c3 = \u2603.p(\u2603.b(j)).c();
            if (c3.t() == arm.a || c3.t() == arm.j || c3.t() == arm.l) {
                this.a(\u2603, \u2603.b(j), this.e);
                if (this.d && j > 0) {
                    if (\u2603.nextInt(3) > 0 && \u2603.d(\u2603.a(-1, j, 0))) {
                        this.a(\u2603, \u2603.a(-1, j, 0), akk.N);
                    }
                    if (\u2603.nextInt(3) > 0 && \u2603.d(\u2603.a(1, j, 0))) {
                        this.a(\u2603, \u2603.a(1, j, 0), akk.P);
                    }
                    if (\u2603.nextInt(3) > 0 && \u2603.d(\u2603.a(0, j, -1))) {
                        this.a(\u2603, \u2603.a(0, j, -1), akk.O);
                    }
                    if (\u2603.nextInt(3) > 0 && \u2603.d(\u2603.a(0, j, 1))) {
                        this.a(\u2603, \u2603.a(0, j, 1), akk.b);
                    }
                }
            }
        }
        if (this.d) {
            for (int j = \u2603.o() - 3 + n; j <= \u2603.o() + n; ++j) {
                final int \u26032 = j - (\u2603.o() + n);
                final int n4 = 2 - \u26032 / 2;
                final cj.a \u26033 = new cj.a();
                for (int l = \u2603.n() - n4; l <= \u2603.n() + n4; ++l) {
                    for (int n5 = \u2603.p() - n4; n5 <= \u2603.p() + n4; ++n5) {
                        \u26033.c(l, j, n5);
                        if (\u2603.p(\u26033).c().t() == arm.j) {
                            final cj e = \u26033.e();
                            final cj f = \u26033.f();
                            final cj c4 = \u26033.c();
                            final cj d = \u26033.d();
                            if (\u2603.nextInt(4) == 0 && \u2603.p(e).c().t() == arm.a) {
                                this.b(\u2603, e, akk.N);
                            }
                            if (\u2603.nextInt(4) == 0 && \u2603.p(f).c().t() == arm.a) {
                                this.b(\u2603, f, akk.P);
                            }
                            if (\u2603.nextInt(4) == 0 && \u2603.p(c4).c().t() == arm.a) {
                                this.b(\u2603, c4, akk.O);
                            }
                            if (\u2603.nextInt(4) == 0 && \u2603.p(d).c().t() == arm.a) {
                                this.b(\u2603, d, akk.b);
                            }
                        }
                    }
                }
            }
            if (\u2603.nextInt(5) == 0 && n > 5) {
                for (int j = 0; j < 2; ++j) {
                    for (final cq \u26034 : cq.c.a) {
                        if (\u2603.nextInt(4 - j) == 0) {
                            final cq d2 = \u26034.d();
                            this.a(\u2603, \u2603.nextInt(3), \u2603.a(d2.g(), n - 5 + j, d2.i()), \u26034);
                        }
                    }
                }
            }
        }
        return true;
    }
    
    private void a(final adm \u2603, final int \u2603, final cj \u2603, final cq \u2603) {
        this.a(\u2603, \u2603, afi.bN.Q().a((amo<Comparable>)afu.a, \u2603).a((amo<Comparable>)afu.O, \u2603));
    }
    
    private void a(final adm \u2603, final cj \u2603, final amk \u2603) {
        this.a(\u2603, \u2603, afi.bn.Q().a((amo<Comparable>)\u2603, true));
    }
    
    private void b(final adm \u2603, cj \u2603, final amk \u2603) {
        this.a(\u2603, \u2603, \u2603);
        int n;
        for (n = 4, \u2603 = \u2603.b(); \u2603.p(\u2603).c().t() == arm.a && n > 0; \u2603 = \u2603.b(), --n) {
            this.a(\u2603, \u2603, \u2603);
        }
    }
    
    static {
        a = afi.r.Q().a(ail.b, aio.a.a);
        b = afi.t.Q().a(aik.Q, aio.a.a).a((amo<Comparable>)ahs.b, false);
    }
}
