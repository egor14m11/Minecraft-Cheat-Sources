import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public class apc extends aot
{
    private afh a;
    
    public apc(final afh \u2603) {
        this.a = \u2603;
    }
    
    @Override
    public boolean b(final adm \u2603, final Random \u2603, cj \u2603) {
        for (\u2603 = \u2603.a(-8, 0, -8); \u2603.o() > 5 && \u2603.d(\u2603); \u2603 = \u2603.b()) {}
        if (\u2603.o() <= 4) {
            return false;
        }
        \u2603 = \u2603.c(4);
        final boolean[] array = new boolean[2048];
        for (int n = \u2603.nextInt(4) + 4, i = 0; i < n; ++i) {
            final double n2 = \u2603.nextDouble() * 6.0 + 3.0;
            final double n3 = \u2603.nextDouble() * 4.0 + 2.0;
            final double n4 = \u2603.nextDouble() * 6.0 + 3.0;
            final double n5 = \u2603.nextDouble() * (16.0 - n2 - 2.0) + 1.0 + n2 / 2.0;
            final double n6 = \u2603.nextDouble() * (8.0 - n3 - 4.0) + 2.0 + n3 / 2.0;
            final double n7 = \u2603.nextDouble() * (16.0 - n4 - 2.0) + 1.0 + n4 / 2.0;
            for (int j = 1; j < 15; ++j) {
                for (int k = 1; k < 15; ++k) {
                    for (int l = 1; l < 7; ++l) {
                        final double n8 = (j - n5) / (n2 / 2.0);
                        final double n9 = (l - n6) / (n3 / 2.0);
                        final double n10 = (k - n7) / (n4 / 2.0);
                        final double n11 = n8 * n8 + n9 * n9 + n10 * n10;
                        if (n11 < 1.0) {
                            array[(j * 16 + k) * 8 + l] = true;
                        }
                    }
                }
            }
        }
        for (int i = 0; i < 16; ++i) {
            for (int \u26032 = 0; \u26032 < 16; ++\u26032) {
                for (int n12 = 0; n12 < 8; ++n12) {
                    final boolean b = !array[(i * 16 + \u26032) * 8 + n12] && ((i < 15 && array[((i + 1) * 16 + \u26032) * 8 + n12]) || (i > 0 && array[((i - 1) * 16 + \u26032) * 8 + n12]) || (\u26032 < 15 && array[(i * 16 + (\u26032 + 1)) * 8 + n12]) || (\u26032 > 0 && array[(i * 16 + (\u26032 - 1)) * 8 + n12]) || (n12 < 7 && array[(i * 16 + \u26032) * 8 + (n12 + 1)]) || (n12 > 0 && array[(i * 16 + \u26032) * 8 + (n12 - 1)]));
                    if (b) {
                        final arm t = \u2603.p(\u2603.a(i, n12, \u26032)).c().t();
                        if (n12 >= 4 && t.d()) {
                            return false;
                        }
                        if (n12 < 4 && !t.a() && \u2603.p(\u2603.a(i, n12, \u26032)).c() != this.a) {
                            return false;
                        }
                    }
                }
            }
        }
        for (int i = 0; i < 16; ++i) {
            for (int \u26032 = 0; \u26032 < 16; ++\u26032) {
                for (int n12 = 0; n12 < 8; ++n12) {
                    if (array[(i * 16 + \u26032) * 8 + n12]) {
                        \u2603.a(\u2603.a(i, n12, \u26032), (n12 >= 4) ? afi.a.Q() : this.a.Q(), 2);
                    }
                }
            }
        }
        for (int i = 0; i < 16; ++i) {
            for (int \u26032 = 0; \u26032 < 16; ++\u26032) {
                for (int n12 = 4; n12 < 8; ++n12) {
                    if (array[(i * 16 + \u26032) * 8 + n12]) {
                        final cj a = \u2603.a(i, n12 - 1, \u26032);
                        if (\u2603.p(a).c() == afi.d && \u2603.b(ads.a, \u2603.a(i, n12, \u26032)) > 0) {
                            final ady b2 = \u2603.b(a);
                            if (b2.ak.c() == afi.bw) {
                                \u2603.a(a, afi.bw.Q(), 2);
                            }
                            else {
                                \u2603.a(a, afi.c.Q(), 2);
                            }
                        }
                    }
                }
            }
        }
        if (this.a.t() == arm.i) {
            for (int i = 0; i < 16; ++i) {
                for (int \u26032 = 0; \u26032 < 16; ++\u26032) {
                    for (int n12 = 0; n12 < 8; ++n12) {
                        final boolean b = !array[(i * 16 + \u26032) * 8 + n12] && ((i < 15 && array[((i + 1) * 16 + \u26032) * 8 + n12]) || (i > 0 && array[((i - 1) * 16 + \u26032) * 8 + n12]) || (\u26032 < 15 && array[(i * 16 + (\u26032 + 1)) * 8 + n12]) || (\u26032 > 0 && array[(i * 16 + (\u26032 - 1)) * 8 + n12]) || (n12 < 7 && array[(i * 16 + \u26032) * 8 + (n12 + 1)]) || (n12 > 0 && array[(i * 16 + \u26032) * 8 + (n12 - 1)]));
                        if (b && (n12 < 4 || \u2603.nextInt(2) != 0) && \u2603.p(\u2603.a(i, n12, \u26032)).c().t().a()) {
                            \u2603.a(\u2603.a(i, n12, \u26032), afi.b.Q(), 2);
                        }
                    }
                }
            }
        }
        if (this.a.t() == arm.h) {
            for (int i = 0; i < 16; ++i) {
                for (int \u26032 = 0; \u26032 < 16; ++\u26032) {
                    final int n12 = 4;
                    if (\u2603.v(\u2603.a(i, n12, \u26032))) {
                        \u2603.a(\u2603.a(i, n12, \u26032), afi.aI.Q(), 2);
                    }
                }
            }
        }
        return true;
    }
}
