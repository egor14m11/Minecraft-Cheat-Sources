import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public class aow extends aot
{
    @Override
    public boolean b(final adm \u2603, final Random \u2603, final cj \u2603) {
        for (int i = 0; i < 64; ++i) {
            final cj a = \u2603.a(\u2603.nextInt(8) - \u2603.nextInt(8), \u2603.nextInt(4) - \u2603.nextInt(4), \u2603.nextInt(8) - \u2603.nextInt(8));
            if (\u2603.d(a)) {
                if (\u2603.p(a.b()).c() == afi.aV) {
                    \u2603.a(a, afi.ab.Q(), 2);
                }
            }
        }
        return true;
    }
}
