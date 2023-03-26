import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public class apk extends aoh
{
    private static final alz a;
    private static final alz b;
    
    public apk() {
        super(false);
    }
    
    @Override
    public boolean b(final adm \u2603, final Random \u2603, final cj \u2603) {
        final int n = \u2603.nextInt(5) + 7;
        final int n2 = n - \u2603.nextInt(2) - 3;
        final int n3 = n - n2;
        final int n4 = 1 + \u2603.nextInt(n3 + 1);
        boolean b = true;
        if (\u2603.o() < 1 || \u2603.o() + n + 1 > 256) {
            return false;
        }
        for (int o = \u2603.o(); o <= \u2603.o() + 1 + n && b; ++o) {
            int n5 = 1;
            if (o - \u2603.o() < n2) {
                n5 = 0;
            }
            else {
                n5 = n4;
            }
            final cj.a a = new cj.a();
            for (int i = \u2603.n() - n5; i <= \u2603.n() + n5 && b; ++i) {
                for (int n6 = \u2603.p() - n5; n6 <= \u2603.p() + n5 && b; ++n6) {
                    if (o >= 0 && o < 256) {
                        if (!this.a(\u2603.p(a.c(i, o, n6)).c())) {
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
        int n5 = 0;
        for (int j = \u2603.o() + n; j >= \u2603.o() + n2; --j) {
            for (int i = \u2603.n() - n5; i <= \u2603.n() + n5; ++i) {
                final int n6 = i - \u2603.n();
                for (int k = \u2603.p() - n5; k <= \u2603.p() + n5; ++k) {
                    final int a2 = k - \u2603.p();
                    if (Math.abs(n6) != n5 || Math.abs(a2) != n5 || n5 <= 0) {
                        final cj cj = new cj(i, j, k);
                        if (!\u2603.p(cj).c().o()) {
                            this.a(\u2603, cj, apk.b);
                        }
                    }
                }
            }
            if (n5 >= 1 && j == \u2603.o() + n2 + 1) {
                --n5;
            }
            else if (n5 < n4) {
                ++n5;
            }
        }
        for (int j = 0; j < n - 1; ++j) {
            final afh c2 = \u2603.p(\u2603.b(j)).c();
            if (c2.t() == arm.a || c2.t() == arm.j) {
                this.a(\u2603, \u2603.b(j), apk.a);
            }
        }
        return true;
    }
    
    static {
        a = afi.r.Q().a(ail.b, aio.a.b);
        b = afi.t.Q().a(aik.Q, aio.a.b).a((amo<Comparable>)ahs.b, false);
    }
}
