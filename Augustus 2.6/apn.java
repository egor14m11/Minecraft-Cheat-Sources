import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public class apn extends aoh
{
    private static final alz a;
    private static final alz b;
    
    public apn(final boolean \u2603) {
        super(\u2603);
    }
    
    @Override
    public boolean b(final adm \u2603, final Random \u2603, final cj \u2603) {
        final int \u26032 = \u2603.nextInt(3) + \u2603.nextInt(2) + 6;
        final int n = \u2603.n();
        final int o = \u2603.o();
        final int p = \u2603.p();
        if (o < 1 || o + \u26032 + 1 >= 256) {
            return false;
        }
        final cj b = \u2603.b();
        final afh c = \u2603.p(b).c();
        if (c != afi.c && c != afi.d) {
            return false;
        }
        if (!this.a(\u2603, \u2603, \u26032)) {
            return false;
        }
        this.a(\u2603, b);
        this.a(\u2603, b.f());
        this.a(\u2603, b.d());
        this.a(\u2603, b.d().f());
        final cq a = cq.c.a.a(\u2603);
        final int n2 = \u26032 - \u2603.nextInt(4);
        int n3 = 2 - \u2603.nextInt(3);
        int \u26033 = n;
        int \u26034 = p;
        final int n4 = o + \u26032 - 1;
        for (int i = 0; i < \u26032; ++i) {
            if (i >= n2 && n3 > 0) {
                \u26033 += a.g();
                \u26034 += a.i();
                --n3;
            }
            final int j = o + i;
            final cj cj = new cj(\u26033, j, \u26034);
            final arm t = \u2603.p(cj).c().t();
            if (t == arm.a || t == arm.j) {
                this.b(\u2603, cj);
                this.b(\u2603, cj.f());
                this.b(\u2603, cj.d());
                this.b(\u2603, cj.f().d());
            }
        }
        for (int i = -2; i <= 0; ++i) {
            for (int j = -2; j <= 0; ++j) {
                int n5 = -1;
                this.a(\u2603, \u26033 + i, n4 + n5, \u26034 + j);
                this.a(\u2603, 1 + \u26033 - i, n4 + n5, \u26034 + j);
                this.a(\u2603, \u26033 + i, n4 + n5, 1 + \u26034 - j);
                this.a(\u2603, 1 + \u26033 - i, n4 + n5, 1 + \u26034 - j);
                if (i > -2 || j > -1) {
                    if (i != -1 || j != -2) {
                        n5 = 1;
                        this.a(\u2603, \u26033 + i, n4 + n5, \u26034 + j);
                        this.a(\u2603, 1 + \u26033 - i, n4 + n5, \u26034 + j);
                        this.a(\u2603, \u26033 + i, n4 + n5, 1 + \u26034 - j);
                        this.a(\u2603, 1 + \u26033 - i, n4 + n5, 1 + \u26034 - j);
                    }
                }
            }
        }
        if (\u2603.nextBoolean()) {
            this.a(\u2603, \u26033, n4 + 2, \u26034);
            this.a(\u2603, \u26033 + 1, n4 + 2, \u26034);
            this.a(\u2603, \u26033 + 1, n4 + 2, \u26034 + 1);
            this.a(\u2603, \u26033, n4 + 2, \u26034 + 1);
        }
        for (int i = -3; i <= 4; ++i) {
            for (int j = -3; j <= 4; ++j) {
                if ((i != -3 || j != -3) && (i != -3 || j != 4) && (i != 4 || j != -3)) {
                    if (i != 4 || j != 4) {
                        if (Math.abs(i) < 3 || Math.abs(j) < 3) {
                            this.a(\u2603, \u26033 + i, n4, \u26034 + j);
                        }
                    }
                }
            }
        }
        for (int i = -1; i <= 2; ++i) {
            for (int j = -1; j <= 2; ++j) {
                if (i < 0 || i > 1 || j < 0 || j > 1) {
                    if (\u2603.nextInt(3) <= 0) {
                        for (int n5 = \u2603.nextInt(3) + 2, k = 0; k < n5; ++k) {
                            this.b(\u2603, new cj(n + i, n4 - k - 1, p + j));
                        }
                        for (int k = -1; k <= 1; ++k) {
                            for (int l = -1; l <= 1; ++l) {
                                this.a(\u2603, \u26033 + i + k, n4, \u26034 + j + l);
                            }
                        }
                        for (int k = -2; k <= 2; ++k) {
                            for (int l = -2; l <= 2; ++l) {
                                if (Math.abs(k) != 2 || Math.abs(l) != 2) {
                                    this.a(\u2603, \u26033 + i + k, n4 - 1, \u26034 + j + l);
                                }
                            }
                        }
                    }
                }
            }
        }
        return true;
    }
    
    private boolean a(final adm \u2603, final cj \u2603, final int \u2603) {
        final int n = \u2603.n();
        final int o = \u2603.o();
        final int p = \u2603.p();
        final cj.a a = new cj.a();
        for (int i = 0; i <= \u2603 + 1; ++i) {
            int n2 = 1;
            if (i == 0) {
                n2 = 0;
            }
            if (i >= \u2603 - 1) {
                n2 = 2;
            }
            for (int j = -n2; j <= n2; ++j) {
                for (int k = -n2; k <= n2; ++k) {
                    if (!this.a(\u2603.p(a.c(n + j, o + i, p + k)).c())) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
    
    private void b(final adm \u2603, final cj \u2603) {
        if (this.a(\u2603.p(\u2603).c())) {
            this.a(\u2603, \u2603, apn.a);
        }
    }
    
    private void a(final adm \u2603, final int \u2603, final int \u2603, final int \u2603) {
        final cj cj = new cj(\u2603, \u2603, \u2603);
        final afh c = \u2603.p(cj).c();
        if (c.t() == arm.a) {
            this.a(\u2603, cj, apn.b);
        }
    }
    
    static {
        a = afi.s.Q().a(aig.b, aio.a.f);
        b = afi.u.Q().a(aif.Q, aio.a.f).a((amo<Comparable>)ahs.b, false);
    }
}
