import java.util.UUID;
import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public class ns
{
    public static final float a;
    private static final float[] b;
    private static final int[] c;
    private static final double d;
    private static final double[] e;
    private static final double[] f;
    
    public static float a(final float \u2603) {
        return ns.b[(int)(\u2603 * 10430.378f) & 0xFFFF];
    }
    
    public static float b(final float \u2603) {
        return ns.b[(int)(\u2603 * 10430.378f + 16384.0f) & 0xFFFF];
    }
    
    public static float c(final float \u2603) {
        return (float)Math.sqrt(\u2603);
    }
    
    public static float a(final double \u2603) {
        return (float)Math.sqrt(\u2603);
    }
    
    public static int d(final float \u2603) {
        final int n = (int)\u2603;
        return (\u2603 < n) ? (n - 1) : n;
    }
    
    public static int b(final double \u2603) {
        return (int)(\u2603 + 1024.0) - 1024;
    }
    
    public static int c(final double \u2603) {
        final int n = (int)\u2603;
        return (\u2603 < n) ? (n - 1) : n;
    }
    
    public static long d(final double \u2603) {
        final long n = (long)\u2603;
        return (\u2603 < n) ? (n - 1L) : n;
    }
    
    public static int e(final double \u2603) {
        return (int)((\u2603 >= 0.0) ? \u2603 : (-\u2603 + 1.0));
    }
    
    public static float e(final float \u2603) {
        return (\u2603 >= 0.0f) ? \u2603 : (-\u2603);
    }
    
    public static int a(final int \u2603) {
        return (\u2603 >= 0) ? \u2603 : (-\u2603);
    }
    
    public static int f(final float \u2603) {
        final int n = (int)\u2603;
        return (\u2603 > n) ? (n + 1) : n;
    }
    
    public static int f(final double \u2603) {
        final int n = (int)\u2603;
        return (\u2603 > n) ? (n + 1) : n;
    }
    
    public static int a(final int \u2603, final int \u2603, final int \u2603) {
        if (\u2603 < \u2603) {
            return \u2603;
        }
        if (\u2603 > \u2603) {
            return \u2603;
        }
        return \u2603;
    }
    
    public static float a(final float \u2603, final float \u2603, final float \u2603) {
        if (\u2603 < \u2603) {
            return \u2603;
        }
        if (\u2603 > \u2603) {
            return \u2603;
        }
        return \u2603;
    }
    
    public static double a(final double \u2603, final double \u2603, final double \u2603) {
        if (\u2603 < \u2603) {
            return \u2603;
        }
        if (\u2603 > \u2603) {
            return \u2603;
        }
        return \u2603;
    }
    
    public static double b(final double \u2603, final double \u2603, final double \u2603) {
        if (\u2603 < 0.0) {
            return \u2603;
        }
        if (\u2603 > 1.0) {
            return \u2603;
        }
        return \u2603 + (\u2603 - \u2603) * \u2603;
    }
    
    public static double a(double \u2603, double \u2603) {
        if (\u2603 < 0.0) {
            \u2603 = -\u2603;
        }
        if (\u2603 < 0.0) {
            \u2603 = -\u2603;
        }
        return (\u2603 > \u2603) ? \u2603 : \u2603;
    }
    
    public static int a(final int \u2603, final int \u2603) {
        if (\u2603 < 0) {
            return -((-\u2603 - 1) / \u2603) - 1;
        }
        return \u2603 / \u2603;
    }
    
    public static int a(final Random \u2603, final int \u2603, final int \u2603) {
        if (\u2603 >= \u2603) {
            return \u2603;
        }
        return \u2603.nextInt(\u2603 - \u2603 + 1) + \u2603;
    }
    
    public static float a(final Random \u2603, final float \u2603, final float \u2603) {
        if (\u2603 >= \u2603) {
            return \u2603;
        }
        return \u2603.nextFloat() * (\u2603 - \u2603) + \u2603;
    }
    
    public static double a(final Random \u2603, final double \u2603, final double \u2603) {
        if (\u2603 >= \u2603) {
            return \u2603;
        }
        return \u2603.nextDouble() * (\u2603 - \u2603) + \u2603;
    }
    
    public static double a(final long[] \u2603) {
        long n = 0L;
        for (final long n2 : \u2603) {
            n += n2;
        }
        return n / (double)\u2603.length;
    }
    
    public static boolean a(final float \u2603, final float \u2603) {
        return e(\u2603 - \u2603) < 1.0E-5f;
    }
    
    public static int b(final int \u2603, final int \u2603) {
        return (\u2603 % \u2603 + \u2603) % \u2603;
    }
    
    public static float g(float \u2603) {
        \u2603 %= 360.0f;
        if (\u2603 >= 180.0f) {
            \u2603 -= 360.0f;
        }
        if (\u2603 < -180.0f) {
            \u2603 += 360.0f;
        }
        return \u2603;
    }
    
    public static double g(double \u2603) {
        \u2603 %= 360.0;
        if (\u2603 >= 180.0) {
            \u2603 -= 360.0;
        }
        if (\u2603 < -180.0) {
            \u2603 += 360.0;
        }
        return \u2603;
    }
    
    public static int a(final String \u2603, final int \u2603) {
        try {
            return Integer.parseInt(\u2603);
        }
        catch (Throwable t) {
            return \u2603;
        }
    }
    
    public static int a(final String \u2603, final int \u2603, final int \u2603) {
        return Math.max(\u2603, a(\u2603, \u2603));
    }
    
    public static double a(final String \u2603, final double \u2603) {
        try {
            return Double.parseDouble(\u2603);
        }
        catch (Throwable t) {
            return \u2603;
        }
    }
    
    public static double a(final String \u2603, final double \u2603, final double \u2603) {
        return Math.max(\u2603, a(\u2603, \u2603));
    }
    
    public static int b(final int \u2603) {
        int n = \u2603 - 1;
        n |= n >> 1;
        n |= n >> 2;
        n |= n >> 4;
        n |= n >> 8;
        n |= n >> 16;
        return n + 1;
    }
    
    private static boolean d(final int \u2603) {
        return \u2603 != 0 && (\u2603 & \u2603 - 1) == 0x0;
    }
    
    private static int e(int \u2603) {
        \u2603 = (d(\u2603) ? \u2603 : b(\u2603));
        return ns.c[(int)(\u2603 * 125613361L >> 27) & 0x1F];
    }
    
    public static int c(final int \u2603) {
        return e(\u2603) - (d(\u2603) ? 0 : 1);
    }
    
    public static int c(final int \u2603, int \u2603) {
        if (\u2603 == 0) {
            return 0;
        }
        if (\u2603 == 0) {
            return \u2603;
        }
        if (\u2603 < 0) {
            \u2603 *= -1;
        }
        final int n = \u2603 % \u2603;
        if (n == 0) {
            return \u2603;
        }
        return \u2603 + \u2603 - n;
    }
    
    public static int b(final float \u2603, final float \u2603, final float \u2603) {
        return b(d(\u2603 * 255.0f), d(\u2603 * 255.0f), d(\u2603 * 255.0f));
    }
    
    public static int b(final int \u2603, final int \u2603, final int \u2603) {
        int n = \u2603;
        n = (n << 8) + \u2603;
        n = (n << 8) + \u2603;
        return n;
    }
    
    public static int d(final int \u2603, final int \u2603) {
        final int n = (\u2603 & 0xFF0000) >> 16;
        final int n2 = (\u2603 & 0xFF0000) >> 16;
        final int n3 = (\u2603 & 0xFF00) >> 8;
        final int n4 = (\u2603 & 0xFF00) >> 8;
        final int n5 = (\u2603 & 0xFF) >> 0;
        final int n6 = (\u2603 & 0xFF) >> 0;
        final int n7 = (int)(n * (float)n2 / 255.0f);
        final int n8 = (int)(n3 * (float)n4 / 255.0f);
        final int n9 = (int)(n5 * (float)n6 / 255.0f);
        return (\u2603 & 0xFF000000) | n7 << 16 | n8 << 8 | n9;
    }
    
    public static double h(final double \u2603) {
        return \u2603 - Math.floor(\u2603);
    }
    
    public static long a(final df \u2603) {
        return c(\u2603.n(), \u2603.o(), \u2603.p());
    }
    
    public static long c(final int \u2603, final int \u2603, final int \u2603) {
        long n = (long)(\u2603 * 3129871) ^ \u2603 * 116129781L ^ (long)\u2603;
        n = n * n * 42317861L + n * 11L;
        return n;
    }
    
    public static UUID a(final Random \u2603) {
        final long mostSigBits = (\u2603.nextLong() & 0xFFFFFFFFFFFF0FFFL) | 0x4000L;
        final long leastSigBits = (\u2603.nextLong() & 0x3FFFFFFFFFFFFFFFL) | Long.MIN_VALUE;
        return new UUID(mostSigBits, leastSigBits);
    }
    
    public static double c(final double \u2603, final double \u2603, final double \u2603) {
        return (\u2603 - \u2603) / (\u2603 - \u2603);
    }
    
    public static double b(double \u2603, double \u2603) {
        final double n = \u2603 * \u2603 + \u2603 * \u2603;
        if (Double.isNaN(n)) {
            return Double.NaN;
        }
        final boolean b = \u2603 < 0.0;
        if (b) {
            \u2603 = -\u2603;
        }
        final boolean b2 = \u2603 < 0.0;
        if (b2) {
            \u2603 = -\u2603;
        }
        final boolean b3 = \u2603 > \u2603;
        if (b3) {
            final double i = \u2603;
            \u2603 = \u2603;
            \u2603 = i;
        }
        final double i = i(n);
        \u2603 *= i;
        \u2603 *= i;
        final double n2 = ns.d + \u2603;
        final int n3 = (int)Double.doubleToRawLongBits(n2);
        final double n4 = ns.e[n3];
        final double n5 = ns.f[n3];
        final double n6 = n2 - ns.d;
        final double n7 = \u2603 * n5 - \u2603 * n6;
        final double n8 = (6.0 + n7 * n7) * n7 * 0.16666666666666666;
        double n9 = n4 + n8;
        if (b3) {
            n9 = 1.5707963267948966 - n9;
        }
        if (b2) {
            n9 = 3.141592653589793 - n9;
        }
        if (b) {
            n9 = -n9;
        }
        return n9;
    }
    
    public static double i(double \u2603) {
        final double n = 0.5 * \u2603;
        long doubleToRawLongBits = Double.doubleToRawLongBits(\u2603);
        doubleToRawLongBits = 6910469410427058090L - (doubleToRawLongBits >> 1);
        \u2603 = Double.longBitsToDouble(doubleToRawLongBits);
        \u2603 *= 1.5 - n * \u2603 * \u2603;
        return \u2603;
    }
    
    public static int c(final float \u2603, final float \u2603, final float \u2603) {
        final int n = (int)(\u2603 * 6.0f) % 6;
        final float n2 = \u2603 * 6.0f - n;
        final float n3 = \u2603 * (1.0f - \u2603);
        final float n4 = \u2603 * (1.0f - n2 * \u2603);
        final float n5 = \u2603 * (1.0f - (1.0f - n2) * \u2603);
        float n6 = 0.0f;
        float n7 = 0.0f;
        float n8 = 0.0f;
        switch (n) {
            case 0: {
                n6 = \u2603;
                n7 = n5;
                n8 = n3;
                break;
            }
            case 1: {
                n6 = n4;
                n7 = \u2603;
                n8 = n3;
                break;
            }
            case 2: {
                n6 = n3;
                n7 = \u2603;
                n8 = n5;
                break;
            }
            case 3: {
                n6 = n3;
                n7 = n4;
                n8 = \u2603;
                break;
            }
            case 4: {
                n6 = n5;
                n7 = n3;
                n8 = \u2603;
                break;
            }
            case 5: {
                n6 = \u2603;
                n7 = n3;
                n8 = n4;
                break;
            }
            default: {
                throw new RuntimeException("Something went wrong when converting from HSV to RGB. Input was " + \u2603 + ", " + \u2603 + ", " + \u2603);
            }
        }
        final int a = a((int)(n6 * 255.0f), 0, 255);
        final int a2 = a((int)(n7 * 255.0f), 0, 255);
        final int a3 = a((int)(n8 * 255.0f), 0, 255);
        return a << 16 | a2 << 8 | a3;
    }
    
    static {
        a = c(2.0f);
        b = new float[65536];
        for (int i = 0; i < 65536; ++i) {
            ns.b[i] = (float)Math.sin(i * 3.141592653589793 * 2.0 / 65536.0);
        }
        c = new int[] { 0, 1, 28, 2, 29, 14, 24, 3, 30, 22, 20, 15, 25, 17, 4, 8, 31, 27, 13, 23, 21, 19, 16, 7, 26, 12, 18, 6, 11, 5, 10, 9 };
        d = Double.longBitsToDouble(4805340802404319232L);
        e = new double[257];
        f = new double[257];
        for (int i = 0; i < 257; ++i) {
            final double a2 = i / 256.0;
            final double asin = Math.asin(a2);
            ns.f[i] = Math.cos(asin);
            ns.e[i] = asin;
        }
    }
}
