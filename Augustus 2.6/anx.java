import com.google.common.base.Objects;
import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public class anx extends any
{
    protected void a(final long \u2603, final int \u2603, final int \u2603, final ans \u2603, final double \u2603, final double \u2603, final double \u2603) {
        this.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603, 1.0f + this.b.nextFloat() * 6.0f, 0.0f, 0.0f, -1, -1, 0.5);
    }
    
    protected void a(final long \u2603, final int \u2603, final int \u2603, final ans \u2603, double \u2603, double \u2603, double \u2603, final float \u2603, float \u2603, float \u2603, int \u2603, int \u2603, double \u2603) {
        final double n = \u2603 * 16 + 8;
        final double n2 = \u2603 * 16 + 8;
        float n3 = 0.0f;
        float n4 = 0.0f;
        final Random random = new Random(\u2603);
        if (\u2603 <= 0) {
            final int n5 = this.a * 16 - 16;
            \u2603 = n5 - random.nextInt(n5 / 4);
        }
        boolean b = false;
        if (\u2603 == -1) {
            \u2603 /= 2;
            b = true;
        }
        final int n6 = random.nextInt(\u2603 / 2) + \u2603 / 4;
        final boolean b2 = random.nextInt(6) == 0;
        while (\u2603 < \u2603) {
            final double n7 = 1.5 + ns.a(\u2603 * 3.1415927f / \u2603) * \u2603 * 1.0f;
            final double n8 = n7 * \u2603;
            final float b3 = ns.b(\u2603);
            final float a = ns.a(\u2603);
            \u2603 += ns.b(\u2603) * b3;
            \u2603 += a;
            \u2603 += ns.a(\u2603) * b3;
            if (b2) {
                \u2603 *= 0.92f;
            }
            else {
                \u2603 *= 0.7f;
            }
            \u2603 += n4 * 0.1f;
            \u2603 += n3 * 0.1f;
            n4 *= 0.9f;
            n3 *= 0.75f;
            n4 += (random.nextFloat() - random.nextFloat()) * random.nextFloat() * 2.0f;
            n3 += (random.nextFloat() - random.nextFloat()) * random.nextFloat() * 4.0f;
            if (!b && \u2603 == n6 && \u2603 > 1.0f && \u2603 > 0) {
                this.a(random.nextLong(), \u2603, \u2603, \u2603, \u2603, \u2603, \u2603, random.nextFloat() * 0.5f + 0.5f, \u2603 - 1.5707964f, \u2603 / 3.0f, \u2603, \u2603, 1.0);
                this.a(random.nextLong(), \u2603, \u2603, \u2603, \u2603, \u2603, \u2603, random.nextFloat() * 0.5f + 0.5f, \u2603 + 1.5707964f, \u2603 / 3.0f, \u2603, \u2603, 1.0);
                return;
            }
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
                        boolean b4 = false;
                        for (int \u26032 = n13; !b4 && \u26032 < n14; ++\u26032) {
                            for (int i = n17; !b4 && i < n18; ++i) {
                                for (int \u26033 = n16 + 1; !b4 && \u26033 >= n15 - 1; --\u26033) {
                                    if (\u26033 >= 0) {
                                        if (\u26033 < 256) {
                                            final alz a2 = \u2603.a(\u26032, \u26033, i);
                                            if (a2.c() == afi.i || a2.c() == afi.j) {
                                                b4 = true;
                                            }
                                            if (\u26033 != n15 - 1 && \u26032 != n13 && \u26032 != n14 - 1 && i != n17 && i != n18 - 1) {
                                                \u26033 = n15;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        if (!b4) {
                            final cj.a \u26034 = new cj.a();
                            for (int i = n13; i < n14; ++i) {
                                final double n19 = (i + \u2603 * 16 + 0.5 - \u2603) / n7;
                                for (int j = n17; j < n18; ++j) {
                                    final double n20 = (j + \u2603 * 16 + 0.5 - \u2603) / n7;
                                    boolean b5 = false;
                                    if (n19 * n19 + n20 * n20 < 1.0) {
                                        for (int k = n16; k > n15; --k) {
                                            final double n21 = (k - 1 + 0.5 - \u2603) / n8;
                                            if (n21 > -0.7 && n19 * n19 + n21 * n21 + n20 * n20 < 1.0) {
                                                final alz a3 = \u2603.a(i, k, j);
                                                final alz \u26035 = (alz)Objects.firstNonNull((Object)\u2603.a(i, k + 1, j), (Object)afi.a.Q());
                                                if (a3.c() == afi.c || a3.c() == afi.bw) {
                                                    b5 = true;
                                                }
                                                if (this.a(a3, \u26035)) {
                                                    if (k - 1 < 10) {
                                                        \u2603.a(i, k, j, afi.l.Q());
                                                    }
                                                    else {
                                                        \u2603.a(i, k, j, afi.a.Q());
                                                        if (\u26035.c() == afi.m) {
                                                            \u2603.a(i, k + 1, j, (\u26035.b(ajh.a) == ajh.a.b) ? afi.cM.Q() : afi.A.Q());
                                                        }
                                                        if (b5 && \u2603.a(i, k - 1, j).c() == afi.d) {
                                                            \u26034.c(i + \u2603 * 16, 0, j + \u2603 * 16);
                                                            \u2603.a(i, k - 1, j, this.c.b(\u26034).ak.c().Q());
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
    
    protected boolean a(final alz \u2603, final alz \u2603) {
        return \u2603.c() == afi.b || \u2603.c() == afi.d || \u2603.c() == afi.c || \u2603.c() == afi.cz || \u2603.c() == afi.cu || \u2603.c() == afi.A || \u2603.c() == afi.cM || \u2603.c() == afi.bw || \u2603.c() == afi.aH || ((\u2603.c() == afi.m || \u2603.c() == afi.n) && \u2603.c().t() != arm.h);
    }
    
    @Override
    protected void a(final adm \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final ans \u2603) {
        int nextInt = this.b.nextInt(this.b.nextInt(this.b.nextInt(15) + 1) + 1);
        if (this.b.nextInt(7) != 0) {
            nextInt = 0;
        }
        for (int i = 0; i < nextInt; ++i) {
            final double n = \u2603 * 16 + this.b.nextInt(16);
            final double n2 = this.b.nextInt(this.b.nextInt(120) + 8);
            final double n3 = \u2603 * 16 + this.b.nextInt(16);
            int n4 = 1;
            if (this.b.nextInt(4) == 0) {
                this.a(this.b.nextLong(), \u2603, \u2603, \u2603, n, n2, n3);
                n4 += this.b.nextInt(4);
            }
            for (int j = 0; j < n4; ++j) {
                final float \u26032 = this.b.nextFloat() * 3.1415927f * 2.0f;
                final float \u26033 = (this.b.nextFloat() - 0.5f) * 2.0f / 8.0f;
                float \u26034 = this.b.nextFloat() * 2.0f + this.b.nextFloat();
                if (this.b.nextInt(10) == 0) {
                    \u26034 *= this.b.nextFloat() * this.b.nextFloat() * 3.0f + 1.0f;
                }
                this.a(this.b.nextLong(), \u2603, \u2603, \u2603, n, n2, n3, \u26034, \u26032, \u26033, 0, 0, 1.0);
            }
        }
    }
}
