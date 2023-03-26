// 
// Decompiled by Procyon v0.5.36
// 

public class adj
{
    private static int[] a;
    
    public static void a(final int[] \u2603) {
        adj.a = \u2603;
    }
    
    public static int a(final double \u2603, double \u2603) {
        \u2603 *= \u2603;
        final int n = (int)((1.0 - \u2603) * 255.0);
        final int n2 = (int)((1.0 - \u2603) * 255.0);
        return adj.a[n2 << 8 | n];
    }
    
    public static int a() {
        return 6396257;
    }
    
    public static int b() {
        return 8431445;
    }
    
    public static int c() {
        return 4764952;
    }
    
    static {
        adj.a = new int[65536];
    }
}
