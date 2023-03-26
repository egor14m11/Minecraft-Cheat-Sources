import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public class apb extends aot
{
    @Override
    public boolean b(final adm \u2603, final Random \u2603, cj \u2603) {
        while (\u2603.d(\u2603) && \u2603.o() > 2) {
            \u2603 = \u2603.b();
        }
        if (\u2603.p(\u2603).c() != afi.aJ) {
            return false;
        }
        \u2603 = \u2603.b(\u2603.nextInt(4));
        final int n = \u2603.nextInt(4) + 7;
        final int n2 = n / 4 + \u2603.nextInt(2);
        if (n2 > 1 && \u2603.nextInt(60) == 0) {
            \u2603 = \u2603.b(10 + \u2603.nextInt(30));
        }
        for (int i = 0; i < n; ++i) {
            final float \u26032 = (1.0f - i / (float)n) * n2;
            for (int j = ns.f(\u26032), k = -j; k <= j; ++k) {
                final float n3 = ns.a(k) - 0.25f;
                for (int l = -j; l <= j; ++l) {
                    final float n4 = ns.a(l) - 0.25f;
                    if ((k == 0 && l == 0) || n3 * n3 + n4 * n4 <= \u26032 * \u26032) {
                        if ((k != -j && k != j && l != -j && l != j) || \u2603.nextFloat() <= 0.75f) {
                            afh afh = \u2603.p(\u2603.a(k, i, l)).c();
                            if (afh.t() == arm.a || afh == afi.d || afh == afi.aJ || afh == afi.aI) {
                                this.a(\u2603, \u2603.a(k, i, l), afi.cB.Q());
                            }
                            if (i != 0 && j > 1) {
                                afh = \u2603.p(\u2603.a(k, -i, l)).c();
                                if (afh.t() == arm.a || afh == afi.d || afh == afi.aJ || afh == afi.aI) {
                                    this.a(\u2603, \u2603.a(k, -i, l), afi.cB.Q());
                                }
                            }
                        }
                    }
                }
            }
        }
        int i = n2 - 1;
        if (i < 0) {
            i = 0;
        }
        else if (i > 1) {
            i = 1;
        }
        for (int n5 = -i; n5 <= i; ++n5) {
            for (int j = -i; j <= i; ++j) {
                cj cj = \u2603.a(n5, -1, j);
                int n6 = 50;
                if (Math.abs(n5) == 1 && Math.abs(j) == 1) {
                    n6 = \u2603.nextInt(5);
                }
                while (cj.o() > 50) {
                    final afh c = \u2603.p(cj).c();
                    if (c.t() != arm.a && c != afi.d && c != afi.aJ && c != afi.aI && c != afi.cB) {
                        break;
                    }
                    this.a(\u2603, cj, afi.cB.Q());
                    cj = cj.b();
                    if (--n6 > 0) {
                        continue;
                    }
                    cj = cj.c(\u2603.nextInt(5) + 1);
                    n6 = \u2603.nextInt(5);
                }
            }
        }
        return true;
    }
}
