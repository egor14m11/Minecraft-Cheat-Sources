import java.util.Iterator;

// 
// Decompiled by Procyon v0.5.36
// 

public class aea
{
    private static final a a;
    private static final a b;
    private static final a c;
    
    private static int a(final adq \u2603, final cj \u2603, final a \u2603) {
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        for (final cj.a a : cj.b(\u2603.a(-1, 0, -1), \u2603.a(1, 0, 1))) {
            final int a2 = \u2603.a(\u2603.b(a), a);
            n += (a2 & 0xFF0000) >> 16;
            n2 += (a2 & 0xFF00) >> 8;
            n3 += (a2 & 0xFF);
        }
        return (n / 9 & 0xFF) << 16 | (n2 / 9 & 0xFF) << 8 | (n3 / 9 & 0xFF);
    }
    
    public static int a(final adq \u2603, final cj \u2603) {
        return a(\u2603, \u2603, aea.a);
    }
    
    public static int b(final adq \u2603, final cj \u2603) {
        return a(\u2603, \u2603, aea.b);
    }
    
    public static int c(final adq \u2603, final cj \u2603) {
        return a(\u2603, \u2603, aea.c);
    }
    
    static {
        a = new a() {
            @Override
            public int a(final ady \u2603, final cj \u2603) {
                return \u2603.b(\u2603);
            }
        };
        b = new a() {
            @Override
            public int a(final ady \u2603, final cj \u2603) {
                return \u2603.c(\u2603);
            }
        };
        c = new a() {
            @Override
            public int a(final ady \u2603, final cj \u2603) {
                return \u2603.ar;
            }
        };
    }
    
    interface a
    {
        int a(final ady p0, final cj p1);
    }
}
