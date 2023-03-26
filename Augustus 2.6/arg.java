import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public class arg
{
    private static int[][] e;
    public static final double a;
    private int[] f;
    public double b;
    public double c;
    public double d;
    private static final double g;
    private static final double h;
    
    public arg() {
        this(new Random());
    }
    
    public arg(final Random \u2603) {
        this.f = new int[512];
        this.b = \u2603.nextDouble() * 256.0;
        this.c = \u2603.nextDouble() * 256.0;
        this.d = \u2603.nextDouble() * 256.0;
        for (int i = 0; i < 256; ++i) {
            this.f[i] = i;
        }
        for (int i = 0; i < 256; ++i) {
            final int n = \u2603.nextInt(256 - i) + i;
            final int n2 = this.f[i];
            this.f[i] = this.f[n];
            this.f[n] = n2;
            this.f[i + 256] = this.f[i];
        }
    }
    
    private static int a(final double \u2603) {
        return (\u2603 > 0.0) ? ((int)\u2603) : ((int)\u2603 - 1);
    }
    
    private static double a(final int[] \u2603, final double \u2603, final double \u2603) {
        return \u2603[0] * \u2603 + \u2603[1] * \u2603;
    }
    
    public double a(final double \u2603, final double \u2603) {
        final double n = 0.5 * (arg.a - 1.0);
        final double n2 = (\u2603 + \u2603) * n;
        final int a = a(\u2603 + n2);
        final int a2 = a(\u2603 + n2);
        final double n3 = (3.0 - arg.a) / 6.0;
        final double n4 = (a + a2) * n3;
        final double n5 = a - n4;
        final double n6 = a2 - n4;
        final double \u26032 = \u2603 - n5;
        final double \u26033 = \u2603 - n6;
        int n7;
        int n8;
        if (\u26032 > \u26033) {
            n7 = 1;
            n8 = 0;
        }
        else {
            n7 = 0;
            n8 = 1;
        }
        final double \u26034 = \u26032 - n7 + n3;
        final double \u26035 = \u26033 - n8 + n3;
        final double \u26036 = \u26032 - 1.0 + 2.0 * n3;
        final double \u26037 = \u26033 - 1.0 + 2.0 * n3;
        final int n9 = a & 0xFF;
        final int n10 = a2 & 0xFF;
        final int n11 = this.f[n9 + this.f[n10]] % 12;
        final int n12 = this.f[n9 + n7 + this.f[n10 + n8]] % 12;
        final int n13 = this.f[n9 + 1 + this.f[n10 + 1]] % 12;
        double n14 = 0.5 - \u26032 * \u26032 - \u26033 * \u26033;
        double n15;
        if (n14 < 0.0) {
            n15 = 0.0;
        }
        else {
            n14 *= n14;
            n15 = n14 * n14 * a(arg.e[n11], \u26032, \u26033);
        }
        double n16 = 0.5 - \u26034 * \u26034 - \u26035 * \u26035;
        double n17;
        if (n16 < 0.0) {
            n17 = 0.0;
        }
        else {
            n16 *= n16;
            n17 = n16 * n16 * a(arg.e[n12], \u26034, \u26035);
        }
        double n18 = 0.5 - \u26036 * \u26036 - \u26037 * \u26037;
        double n19;
        if (n18 < 0.0) {
            n19 = 0.0;
        }
        else {
            n18 *= n18;
            n19 = n18 * n18 * a(arg.e[n13], \u26036, \u26037);
        }
        return 70.0 * (n15 + n17 + n19);
    }
    
    public void a(final double[] \u2603, final double \u2603, final double \u2603, final int \u2603, final int \u2603, final double \u2603, final double \u2603, final double \u2603) {
        int n = 0;
        for (int i = 0; i < \u2603; ++i) {
            final double n2 = (\u2603 + i) * \u2603 + this.c;
            for (int j = 0; j < \u2603; ++j) {
                final double n3 = (\u2603 + j) * \u2603 + this.b;
                final double n4 = (n3 + n2) * arg.g;
                final int a = a(n3 + n4);
                final int a2 = a(n2 + n4);
                final double n5 = (a + a2) * arg.h;
                final double n6 = a - n5;
                final double n7 = a2 - n5;
                final double \u26032 = n3 - n6;
                final double \u26033 = n2 - n7;
                int n8;
                int n9;
                if (\u26032 > \u26033) {
                    n8 = 1;
                    n9 = 0;
                }
                else {
                    n8 = 0;
                    n9 = 1;
                }
                final double \u26034 = \u26032 - n8 + arg.h;
                final double \u26035 = \u26033 - n9 + arg.h;
                final double \u26036 = \u26032 - 1.0 + 2.0 * arg.h;
                final double \u26037 = \u26033 - 1.0 + 2.0 * arg.h;
                final int n10 = a & 0xFF;
                final int n11 = a2 & 0xFF;
                final int n12 = this.f[n10 + this.f[n11]] % 12;
                final int n13 = this.f[n10 + n8 + this.f[n11 + n9]] % 12;
                final int n14 = this.f[n10 + 1 + this.f[n11 + 1]] % 12;
                double n15 = 0.5 - \u26032 * \u26032 - \u26033 * \u26033;
                double n16;
                if (n15 < 0.0) {
                    n16 = 0.0;
                }
                else {
                    n15 *= n15;
                    n16 = n15 * n15 * a(arg.e[n12], \u26032, \u26033);
                }
                double n17 = 0.5 - \u26034 * \u26034 - \u26035 * \u26035;
                double n18;
                if (n17 < 0.0) {
                    n18 = 0.0;
                }
                else {
                    n17 *= n17;
                    n18 = n17 * n17 * a(arg.e[n13], \u26034, \u26035);
                }
                double n19 = 0.5 - \u26036 * \u26036 - \u26037 * \u26037;
                double n20;
                if (n19 < 0.0) {
                    n20 = 0.0;
                }
                else {
                    n19 *= n19;
                    n20 = n19 * n19 * a(arg.e[n14], \u26036, \u26037);
                }
                final int n21 = n++;
                \u2603[n21] += 70.0 * (n16 + n18 + n20) * \u2603;
            }
        }
    }
    
    static {
        arg.e = new int[][] { { 1, 1, 0 }, { -1, 1, 0 }, { 1, -1, 0 }, { -1, -1, 0 }, { 1, 0, 1 }, { -1, 0, 1 }, { 1, 0, -1 }, { -1, 0, -1 }, { 0, 1, 1 }, { 0, -1, 1 }, { 0, 1, -1 }, { 0, -1, -1 } };
        a = Math.sqrt(3.0);
        g = 0.5 * (arg.a - 1.0);
        h = (3.0 - arg.a) / 6.0;
    }
}
