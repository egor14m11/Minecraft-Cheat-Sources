import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public class ard extends arh
{
    private arg[] a;
    private int b;
    
    public ard(final Random \u2603, final int \u2603) {
        this.b = \u2603;
        this.a = new arg[\u2603];
        for (int i = 0; i < \u2603; ++i) {
            this.a[i] = new arg(\u2603);
        }
    }
    
    public double a(final double \u2603, final double \u2603) {
        double n = 0.0;
        double n2 = 1.0;
        for (int i = 0; i < this.b; ++i) {
            n += this.a[i].a(\u2603 * n2, \u2603 * n2) / n2;
            n2 /= 2.0;
        }
        return n;
    }
    
    public double[] a(final double[] \u2603, final double \u2603, final double \u2603, final int \u2603, final int \u2603, final double \u2603, final double \u2603, final double \u2603) {
        return this.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603, 0.5);
    }
    
    public double[] a(double[] \u2603, final double \u2603, final double \u2603, final int \u2603, final int \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603) {
        if (\u2603 == null || \u2603.length < \u2603 * \u2603) {
            \u2603 = new double[\u2603 * \u2603];
        }
        else {
            for (int i = 0; i < \u2603.length; ++i) {
                \u2603[i] = 0.0;
            }
        }
        double n = 1.0;
        double n2 = 1.0;
        for (int j = 0; j < this.b; ++j) {
            this.a[j].a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603 * n2 * n, \u2603 * n2 * n, 0.55 / n);
            n2 *= \u2603;
            n *= \u2603;
        }
        return \u2603;
    }
}
