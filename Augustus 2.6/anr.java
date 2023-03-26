import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public class anr extends any
{
    private float[] d;
    
    public anr() {
        this.d = new float[1024];
    }
    
    protected void a(final long \u2603, final int \u2603, final int \u2603, final ans \u2603, double \u2603, double \u2603, double \u2603, final float \u2603, float \u2603, float \u2603, int \u2603, int \u2603, final double \u2603) {
        final Random random = new Random(\u2603);
        final double n = \u2603 * 16 + 8;
        final double n2 = \u2603 * 16 + 8;
        float n3 = 0.0f;
        float n4 = 0.0f;
        if (\u2603 <= 0) {
            final int n5 = this.a * 16 - 16;
            \u2603 = n5 - random.nextInt(n5 / 4);
        }
        boolean b = false;
        if (\u2603 == -1) {
            \u2603 /= 2;
            b = true;
        }
        float n6 = 1.0f;
        for (int i = 0; i < 256; ++i) {
            if (i == 0 || random.nextInt(3) == 0) {
                n6 = 1.0f + random.nextFloat() * random.nextFloat() * 1.0f;
            }
            this.d[i] = n6 * n6;
        }
        while (\u2603 < \u2603) {
            double n7 = 1.5 + ns.a(\u2603 * 3.1415927f / \u2603) * \u2603 * 1.0f;
            double n8 = n7 * \u2603;
            n7 *= random.nextFloat() * 0.25 + 0.75;
            n8 *= random.nextFloat() * 0.25 + 0.75;
            final float b2 = ns.b(\u2603);
            final float a = ns.a(\u2603);
            \u2603 += ns.b(\u2603) * b2;
            \u2603 += a;
            \u2603 += ns.a(\u2603) * b2;
            \u2603 *= 0.7f;
            \u2603 += n4 * 0.05f;
            \u2603 += n3 * 0.05f;
            n4 *= 0.8f;
            n3 *= 0.5f;
            n4 += (random.nextFloat() - random.nextFloat()) * random.nextFloat() * 2.0f;
            n3 += (random.nextFloat() - random.nextFloat()) * random.nextFloat() * 4.0f;
            if (b || random.nextInt(4) != 0) {
                final double n9 = \u2603 - n;
                final double n10 = \u2603 - n2;
                final double n11 = \u2603 - \u2603;
                final double n12 = \u2603 + 2.0f + 16.0f;
                if (n9 * n9 + n10 * n10 - n11 * n11 > n12 * n12) {
                    return;
                }
                if (\u2603 >= n - 16.0 - n7 * 2.0 && \u2603 >= n2 - 16.0 - n7 * 2.0 && \u2603 <= n + 16.0 + n7 * 2.0) {
                    if (\u2603 <= n2 + 16.0 + n7 * 2.0) {
                        int n13 = ns.c(\u2603 - n7) - \u2603 * 16 - 1;
                        int n14 = ns.c(\u2603 + n7) - \u2603 * 16 + 1;
                        int n15 = ns.c(\u2603 - n8) - 1;
                        int n16 = ns.c(\u2603 + n8) + 1;
                        int n17 = ns.c(\u2603 - n7) - \u2603 * 16 - 1;
                        int n18 = ns.c(\u2603 + n7) - \u2603 * 16 + 1;
                        if (n13 < 0) {
                            n13 = 0;
                        }
                        if (n14 > 16) {
                            n14 = 16;
                        }
                        if (n15 < 1) {
                            n15 = 1;
                        }
                        if (n16 > 248) {
                            n16 = 248;
                        }
                        if (n17 < 0) {
                            n17 = 0;
                        }
                        if (n18 > 16) {
                            n18 = 16;
                        }
                        boolean b3 = false;
                        for (int \u26032 = n13; !b3 && \u26032 < n14; ++\u26032) {
                            for (int j = n17; !b3 && j < n18; ++j) {
                                for (int \u26033 = n16 + 1; !b3 && \u26033 >= n15 - 1; --\u26033) {
                                    if (\u26033 >= 0) {
                                        if (\u26033 < 256) {
                                            final alz a2 = \u2603.a(\u26032, \u26033, j);
                                            if (a2.c() == afi.i || a2.c() == afi.j) {
                                                b3 = true;
                                            }
                                            if (\u26033 != n15 - 1 && \u26032 != n13 && \u26032 != n14 - 1 && j != n17 && j != n18 - 1) {
                                                \u26033 = n15;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        if (!b3) {
                            final cj.a \u26034 = new cj.a();
                            for (int j = n13; j < n14; ++j) {
                                final double n19 = (j + \u2603 * 16 + 0.5 - \u2603) / n7;
                                for (int k = n17; k < n18; ++k) {
                                    final double n20 = (k + \u2603 * 16 + 0.5 - \u2603) / n7;
                                    boolean b4 = false;
                                    if (n19 * n19 + n20 * n20 < 1.0) {
                                        for (int l = n16; l > n15; --l) {
                                            final double n21 = (l - 1 + 0.5 - \u2603) / n8;
                                            if ((n19 * n19 + n20 * n20) * this.d[l - 1] + n21 * n21 / 6.0 < 1.0) {
                                                final alz a3 = \u2603.a(j, l, k);
                                                if (a3.c() == afi.c) {
                                                    b4 = true;
                                                }
                                                if (a3.c() == afi.b || a3.c() == afi.d || a3.c() == afi.c) {
                                                    if (l - 1 < 10) {
                                                        \u2603.a(j, l, k, afi.k.Q());
                                                    }
                                                    else {
                                                        \u2603.a(j, l, k, afi.a.Q());
                                                        if (b4 && \u2603.a(j, l - 1, k).c() == afi.d) {
                                                            \u26034.c(j + \u2603 * 16, 0, k + \u2603 * 16);
                                                            \u2603.a(j, l - 1, k, this.c.b(\u26034).ak);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (b) {
                                break;
                            }
                        }
                    }
                }
            }
            ++\u2603;
        }
    }
    
    @Override
    protected void a(final adm \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final ans \u2603) {
        if (this.b.nextInt(50) != 0) {
            return;
        }
        final double \u26032 = \u2603 * 16 + this.b.nextInt(16);
        final double \u26033 = this.b.nextInt(this.b.nextInt(40) + 8) + 20;
        final double \u26034 = \u2603 * 16 + this.b.nextInt(16);
        for (int n = 1, i = 0; i < n; ++i) {
            final float \u26035 = this.b.nextFloat() * 3.1415927f * 2.0f;
            final float \u26036 = (this.b.nextFloat() - 0.5f) * 2.0f / 8.0f;
            final float \u26037 = (this.b.nextFloat() * 2.0f + this.b.nextFloat()) * 2.0f;
            this.a(this.b.nextLong(), \u2603, \u2603, \u2603, \u26032, \u26033, \u26034, \u26037, \u26035, \u26036, 0, 0, 3.0);
        }
    }
}
