import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public class aps extends aoh
{
    private static final alz a;
    private static final alz b;
    
    public aps(final boolean \u2603) {
        super(\u2603);
    }
    
    @Override
    public boolean b(final adm \u2603, final Random \u2603, final cj \u2603) {
        final int n = \u2603.nextInt(4) + 6;
        final int n2 = 1 + \u2603.nextInt(2);
        final int n3 = n - n2;
        final int n4 = 2 + \u2603.nextInt(2);
        boolean b = true;
        if (\u2603.o() < 1 || \u2603.o() + n + 1 > 256) {
            return false;
        }
        for (int o = \u2603.o(); o <= \u2603.o() + 1 + n && b; ++o) {
            int nextInt = 1;
            if (o - \u2603.o() < n2) {
                nextInt = 0;
            }
            else {
                nextInt = n4;
            }
            final cj.a a = new cj.a();
            for (int \u26032 = \u2603.n() - nextInt; \u26032 <= \u2603.n() + nextInt && b; ++\u26032) {
                for (int i = \u2603.p() - nextInt; i <= \u2603.p() + nextInt && b; ++i) {
                    if (o >= 0 && o < 256) {
                        final afh c = \u2603.p(a.c(\u26032, o, i)).c();
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
        if ((c2 != afi.c && c2 != afi.d && c2 != afi.ak) || \u2603.o() >= 256 - n - 1) {
            return false;
        }
        this.a(\u2603, \u2603.b());
        int nextInt = \u2603.nextInt(2);
        int n5 = 1;
        int \u26032 = 0;
        for (int i = 0; i <= n3; ++i) {
            final int j = \u2603.o() + n - i;
            for (int k = \u2603.n() - nextInt; k <= \u2603.n() + nextInt; ++k) {
                final int a2 = k - \u2603.n();
                for (int l = \u2603.p() - nextInt; l <= \u2603.p() + nextInt; ++l) {
                    final int a3 = l - \u2603.p();
                    if (Math.abs(a2) != nextInt || Math.abs(a3) != nextInt || nextInt <= 0) {
                        final cj cj = new cj(k, j, l);
                        if (!\u2603.p(cj).c().o()) {
                            this.a(\u2603, cj, aps.b);
                        }
                    }
                }
            }
            if (nextInt >= n5) {
                nextInt = \u26032;
                \u26032 = 1;
                if (++n5 > n4) {
                    n5 = n4;
                }
            }
            else {
                ++nextInt;
            }
        }
        int i;
        for (i = \u2603.nextInt(3), int j = 0; j < n - i; ++j) {
            final afh c3 = \u2603.p(\u2603.b(j)).c();
            if (c3.t() == arm.a || c3.t() == arm.j) {
                this.a(\u2603, \u2603.b(j), aps.a);
            }
        }
        return true;
    }
    
    static {
        a = afi.r.Q().a(ail.b, aio.a.b);
        b = afi.t.Q().a(aik.Q, aio.a.b).a((amo<Comparable>)ahs.b, false);
    }
}
