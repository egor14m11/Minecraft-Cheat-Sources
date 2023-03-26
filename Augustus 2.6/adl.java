// 
// Decompiled by Procyon v0.5.36
// 

public class adl
{
    private static int[] a;
    
    public static void a(final int[] \u2603) {
        adl.a = \u2603;
    }
    
    public static int a(final double \u2603, double \u2603) {
        \u2603 *= \u2603;
        final int n = (int)((1.0 - \u2603) * 255.0);
        final int n2 = (int)((1.0 - \u2603) * 255.0);
        final int n3 = n2 << 8 | n;
        if (n3 > adl.a.length) {
            return -65281;
        }
        return adl.a[n3];
    }
    
    static {
        adl.a = new int[65536];
    }
}
