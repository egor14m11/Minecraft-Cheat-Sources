import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public class arb extends arh
{
    private int[] d;
    public double a;
    public double b;
    public double c;
    private static final double[] e;
    private static final double[] f;
    private static final double[] g;
    private static final double[] h;
    private static final double[] i;
    
    public arb() {
        this(new Random());
    }
    
    public arb(final Random \u2603) {
        this.d = new int[512];
        this.a = \u2603.nextDouble() * 256.0;
        this.b = \u2603.nextDouble() * 256.0;
        this.c = \u2603.nextDouble() * 256.0;
        for (int i = 0; i < 256; ++i) {
            this.d[i] = i;
        }
        for (int i = 0; i < 256; ++i) {
            final int n = \u2603.nextInt(256 - i) + i;
            final int n2 = this.d[i];
            this.d[i] = this.d[n];
            this.d[n] = n2;
            this.d[i + 256] = this.d[i];
        }
    }
    
    public final double b(final double \u2603, final double \u2603, final double \u2603) {
        return \u2603 + \u2603 * (\u2603 - \u2603);
    }
    
    public final double a(final int \u2603, final double \u2603, final double \u2603) {
        final int n = \u2603 & 0xF;
        return arb.h[n] * \u2603 + arb.i[n] * \u2603;
    }
    
    public final double a(final int \u2603, final double \u2603, final double \u2603, final double \u2603) {
        final int n = \u2603 & 0xF;
        return arb.e[n] * \u2603 + arb.f[n] * \u2603 + arb.g[n] * \u2603;
    }
    
    public void a(final double[] \u2603, final double \u2603, final double \u2603, final double \u2603, final int \u2603, final int \u2603, final int \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603) {
        if (\u2603 == 1) {
            int n = 0;
            int n2 = 0;
            int n3 = 0;
            int n4 = 0;
            double b = 0.0;
            double b2 = 0.0;
            int n5 = 0;
            final double n6 = 1.0 / \u2603;
            for (int i = 0; i < \u2603; ++i) {
                double b3 = \u2603 + i * \u2603 + this.a;
                int n7 = (int)b3;
                if (b3 < n7) {
                    --n7;
                }
                final int n8 = n7 & 0xFF;
                b3 -= n7;
                final double b4 = b3 * b3 * b3 * (b3 * (b3 * 6.0 - 15.0) + 10.0);
                for (int j = 0; j < \u2603; ++j) {
                    double n9 = \u2603 + j * \u2603 + this.c;
                    int n10 = (int)n9;
                    if (n9 < n10) {
                        --n10;
                    }
                    final int n11 = n10 & 0xFF;
                    n9 -= n10;
                    final double \u26032 = n9 * n9 * n9 * (n9 * (n9 * 6.0 - 15.0) + 10.0);
                    n = this.d[n8] + 0;
                    n2 = this.d[n] + n11;
                    n3 = this.d[n8 + 1] + 0;
                    n4 = this.d[n3] + n11;
                    b = this.b(b4, this.a(this.d[n2], b3, n9), this.a(this.d[n4], b3 - 1.0, 0.0, n9));
                    b2 = this.b(b4, this.a(this.d[n2 + 1], b3, 0.0, n9 - 1.0), this.a(this.d[n4 + 1], b3 - 1.0, 0.0, n9 - 1.0));
                    final double b5 = this.b(\u26032, b, b2);
                    final int n12 = n5++;
                    \u2603[n12] += b5 * n6;
                }
            }
            return;
        }
        int n = 0;
        final double n13 = 1.0 / \u2603;
        int n4 = -1;
        int n14 = 0;
        int n15 = 0;
        int n16 = 0;
        int n17 = 0;
        int n5 = 0;
        int n18 = 0;
        double b6 = 0.0;
        double b3 = 0.0;
        double b7 = 0.0;
        double b4 = 0.0;
        for (int j = 0; j < \u2603; ++j) {
            double n9 = \u2603 + j * \u2603 + this.a;
            int n10 = (int)n9;
            if (n9 < n10) {
                --n10;
            }
            final int n11 = n10 & 0xFF;
            n9 -= n10;
            final double \u26032 = n9 * n9 * n9 * (n9 * (n9 * 6.0 - 15.0) + 10.0);
            for (int k = 0; k < \u2603; ++k) {
                double n19 = \u2603 + k * \u2603 + this.c;
                int n20 = (int)n19;
                if (n19 < n20) {
                    --n20;
                }
                final int n21 = n20 & 0xFF;
                n19 -= n20;
                final double \u26033 = n19 * n19 * n19 * (n19 * (n19 * 6.0 - 15.0) + 10.0);
                for (int l = 0; l < \u2603; ++l) {
                    double n22 = \u2603 + l * \u2603 + this.b;
                    int n23 = (int)n22;
                    if (n22 < n23) {
                        --n23;
                    }
                    final int n24 = n23 & 0xFF;
                    n22 -= n23;
                    final double n25 = n22 * n22 * n22 * (n22 * (n22 * 6.0 - 15.0) + 10.0);
                    if (l == 0 || n24 != n4) {
                        n4 = n24;
                        n14 = this.d[n11] + n24;
                        n15 = this.d[n14] + n21;
                        n16 = this.d[n14 + 1] + n21;
                        n17 = this.d[n11 + 1] + n24;
                        n5 = this.d[n17] + n21;
                        n18 = this.d[n17 + 1] + n21;
                        b6 = this.b(\u26032, this.a(this.d[n15], n9, n22, n19), this.a(this.d[n5], n9 - 1.0, n22, n19));
                        b3 = this.b(\u26032, this.a(this.d[n16], n9, n22 - 1.0, n19), this.a(this.d[n18], n9 - 1.0, n22 - 1.0, n19));
                        b7 = this.b(\u26032, this.a(this.d[n15 + 1], n9, n22, n19 - 1.0), this.a(this.d[n5 + 1], n9 - 1.0, n22, n19 - 1.0));
                        b4 = this.b(\u26032, this.a(this.d[n16 + 1], n9, n22 - 1.0, n19 - 1.0), this.a(this.d[n18 + 1], n9 - 1.0, n22 - 1.0, n19 - 1.0));
                    }
                    final double b8 = this.b(n25, b6, b3);
                    final double b9 = this.b(n25, b7, b4);
                    final double b10 = this.b(\u26033, b8, b9);
                    final int n26 = n++;
                    \u2603[n26] += b10 * n13;
                }
            }
        }
    }
    
    static {
        e = new double[] { 1.0, -1.0, 1.0, -1.0, 1.0, -1.0, 1.0, -1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, -1.0, 0.0 };
        f = new double[] { 1.0, 1.0, -1.0, -1.0, 0.0, 0.0, 0.0, 0.0, 1.0, -1.0, 1.0, -1.0, 1.0, -1.0, 1.0, -1.0 };
        g = new double[] { 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, -1.0, -1.0, 1.0, 1.0, -1.0, -1.0, 0.0, 1.0, 0.0, -1.0 };
        h = new double[] { 1.0, -1.0, 1.0, -1.0, 1.0, -1.0, 1.0, -1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, -1.0, 0.0 };
        i = new double[] { 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, -1.0, -1.0, 1.0, 1.0, -1.0, -1.0, 0.0, 1.0, 0.0, -1.0 };
    }
}
