import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public class aoz extends aot
{
    private afh a;
    
    public aoz(final afh \u2603) {
        super(true);
        this.a = \u2603;
    }
    
    public aoz() {
        super(false);
    }
    
    @Override
    public boolean b(final adm \u2603, final Random \u2603, final cj \u2603) {
        if (this.a == null) {
            this.a = (\u2603.nextBoolean() ? afi.bg : afi.bh);
        }
        final int n = \u2603.nextInt(3) + 4;
        boolean b = true;
        if (\u2603.o() < 1 || \u2603.o() + n + 1 >= 256) {
            return false;
        }
        for (int i = \u2603.o(); i <= \u2603.o() + 1 + n; ++i) {
            int n2 = 3;
            if (i <= \u2603.o() + 3) {
                n2 = 0;
            }
            final cj.a a = new cj.a();
            for (int \u26032 = \u2603.n() - n2; \u26032 <= \u2603.n() + n2 && b; ++\u26032) {
                for (int \u26033 = \u2603.p() - n2; \u26033 <= \u2603.p() + n2 && b; ++\u26033) {
                    if (i >= 0 && i < 256) {
                        final afh c = \u2603.p(a.c(\u26032, i, \u26033)).c();
                        if (c.t() != arm.a && c.t() != arm.j) {
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
        final afh c2 = \u2603.p(\u2603.b()).c();
        if (c2 != afi.d && c2 != afi.c && c2 != afi.bw) {
            return false;
        }
        int n2 = \u2603.o() + n;
        if (this.a == afi.bh) {
            n2 = \u2603.o() + n - 3;
        }
        for (int j = n2; j <= \u2603.o() + n; ++j) {
            int \u26032 = 1;
            if (j < \u2603.o() + n) {
                ++\u26032;
            }
            if (this.a == afi.bg) {
                \u26032 = 3;
            }
            final int \u26033 = \u2603.n() - \u26032;
            final int n3 = \u2603.n() + \u26032;
            final int n4 = \u2603.p() - \u26032;
            final int n5 = \u2603.p() + \u26032;
            for (int k = \u26033; k <= n3; ++k) {
                for (int l = n4; l <= n5; ++l) {
                    int \u26034 = 5;
                    if (k == \u26033) {
                        --\u26034;
                    }
                    else if (k == n3) {
                        ++\u26034;
                    }
                    if (l == n4) {
                        \u26034 -= 3;
                    }
                    else if (l == n5) {
                        \u26034 += 3;
                    }
                    aho.a a2 = aho.a.a(\u26034);
                    if (this.a == afi.bg || j < \u2603.o() + n) {
                        if (k == \u26033 || k == n3) {
                            if (l == n4) {
                                continue;
                            }
                            if (l == n5) {
                                continue;
                            }
                        }
                        if (k == \u2603.n() - (\u26032 - 1) && l == n4) {
                            a2 = aho.a.a;
                        }
                        if (k == \u26033 && l == \u2603.p() - (\u26032 - 1)) {
                            a2 = aho.a.a;
                        }
                        if (k == \u2603.n() + (\u26032 - 1) && l == n4) {
                            a2 = aho.a.c;
                        }
                        if (k == n3 && l == \u2603.p() - (\u26032 - 1)) {
                            a2 = aho.a.c;
                        }
                        if (k == \u2603.n() - (\u26032 - 1) && l == n5) {
                            a2 = aho.a.g;
                        }
                        if (k == \u26033 && l == \u2603.p() + (\u26032 - 1)) {
                            a2 = aho.a.g;
                        }
                        if (k == \u2603.n() + (\u26032 - 1) && l == n5) {
                            a2 = aho.a.i;
                        }
                        if (k == n3 && l == \u2603.p() + (\u26032 - 1)) {
                            a2 = aho.a.i;
                        }
                    }
                    if (a2 == aho.a.e && j < \u2603.o() + n) {
                        a2 = aho.a.k;
                    }
                    if (\u2603.o() >= \u2603.o() + n - 1 || a2 != aho.a.k) {
                        final cj cj = new cj(k, j, l);
                        if (!\u2603.p(cj).c().o()) {
                            this.a(\u2603, cj, this.a.Q().a(aho.a, a2));
                        }
                    }
                }
            }
        }
        for (int j = 0; j < n; ++j) {
            final afh c3 = \u2603.p(\u2603.b(j)).c();
            if (!c3.o()) {
                this.a(\u2603, \u2603.b(j), this.a.Q().a(aho.a, aho.a.j));
            }
        }
        return true;
    }
}
