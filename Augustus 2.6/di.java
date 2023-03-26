// 
// Decompiled by Procyon v0.5.36
// 

public class di
{
    private static dj a;
    private static dj b;
    
    public static String a(final String \u2603) {
        return di.a.a(\u2603);
    }
    
    public static String a(final String \u2603, final Object... \u2603) {
        return di.a.a(\u2603, \u2603);
    }
    
    public static String b(final String \u2603) {
        return di.b.a(\u2603);
    }
    
    public static boolean c(final String \u2603) {
        return di.a.b(\u2603);
    }
    
    public static long a() {
        return di.a.c();
    }
    
    static {
        di.a = dj.a();
        di.b = new dj();
    }
}
