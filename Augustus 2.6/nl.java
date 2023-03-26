// 
// Decompiled by Procyon v0.5.36
// 

public class nl
{
    private static final Integer[] a;
    
    public static Integer a(final int \u2603) {
        if (\u2603 > 0 && \u2603 < nl.a.length) {
            return nl.a[\u2603];
        }
        return \u2603;
    }
    
    static {
        a = new Integer[65535];
        for (int i = 0, length = nl.a.length; i < length; ++i) {
            nl.a[i] = i;
        }
    }
}
