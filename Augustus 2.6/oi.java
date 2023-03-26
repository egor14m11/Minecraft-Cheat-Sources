import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public class oi
{
    private static final Random a;
    
    public static void a(final adm \u2603, final cj \u2603, final og \u2603) {
        a(\u2603, \u2603.n(), \u2603.o(), \u2603.p(), \u2603);
    }
    
    public static void a(final adm \u2603, final pk \u2603, final og \u2603) {
        a(\u2603, \u2603.s, \u2603.t, \u2603.u, \u2603);
    }
    
    private static void a(final adm \u2603, final double \u2603, final double \u2603, final double \u2603, final og \u2603) {
        for (int i = 0; i < \u2603.o_(); ++i) {
            final zx a = \u2603.a(i);
            if (a != null) {
                a(\u2603, \u2603, \u2603, \u2603, a);
            }
        }
    }
    
    private static void a(final adm \u2603, final double \u2603, final double \u2603, final double \u2603, final zx \u2603) {
        final float n = oi.a.nextFloat() * 0.8f + 0.1f;
        final float n2 = oi.a.nextFloat() * 0.8f + 0.1f;
        final float n3 = oi.a.nextFloat() * 0.8f + 0.1f;
        while (\u2603.b > 0) {
            int b = oi.a.nextInt(21) + 10;
            if (b > \u2603.b) {
                b = \u2603.b;
            }
            \u2603.b -= b;
            final uz \u26032 = new uz(\u2603, \u2603 + n, \u2603 + n2, \u2603 + n3, new zx(\u2603.b(), b, \u2603.i()));
            if (\u2603.n()) {
                \u26032.l().d((dn)\u2603.o().b());
            }
            final float n4 = 0.05f;
            \u26032.v = oi.a.nextGaussian() * n4;
            \u26032.w = oi.a.nextGaussian() * n4 + 0.20000000298023224;
            \u26032.x = oi.a.nextGaussian() * n4;
            \u2603.d(\u26032);
        }
    }
    
    static {
        a = new Random();
    }
}
