import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public class arc extends arh
{
    private arb[] a;
    private int b;
    
    public arc(final Random \u2603, final int \u2603) {
        this.b = \u2603;
        this.a = new arb[\u2603];
        for (int i = 0; i < \u2603; ++i) {
            this.a[i] = new arb(\u2603);
        }
    }
    
    public double[] a(double[] \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final double \u2603, final double \u2603, final double \u2603) {
        if (\u2603 == null) {
            \u2603 = new double[\u2603 * \u2603 * \u2603];
        }
        else {
            for (int i = 0; i < \u2603.length; ++i) {
                \u2603[i] = 0.0;
            }
        }
        double \u26032 = 1.0;
        for (int j = 0; j < this.b; ++j) {
            double n = \u2603 * \u26032 * \u2603;
            final double \u26033 = \u2603 * \u26032 * \u2603;
            double n2 = \u2603 * \u26032 * \u2603;
            long d = ns.d(n);
            long d2 = ns.d(n2);
            n -= d;
            n2 -= d2;
            d %= 16777216L;
            d2 %= 16777216L;
            n += d;
            n2 += d2;
            this.a[j].a(\u2603, n, \u26033, n2, \u2603, \u2603, \u2603, \u2603 * \u26032, \u2603 * \u26032, \u2603 * \u26032, \u26032);
            \u26032 /= 2.0;
        }
        return \u2603;
    }
    
    public double[] a(final double[] \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final double \u2603, final double \u2603, final double \u2603) {
        return this.a(\u2603, \u2603, 10, \u2603, \u2603, 1, \u2603, \u2603, 1.0, \u2603);
    }
}
