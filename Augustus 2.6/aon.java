import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public class aon extends aot
{
    @Override
    public boolean b(final adm \u2603, final Random \u2603, final cj \u2603) {
        for (int i = 0; i < 10; ++i) {
            final cj a = \u2603.a(\u2603.nextInt(8) - \u2603.nextInt(8), \u2603.nextInt(4) - \u2603.nextInt(4), \u2603.nextInt(8) - \u2603.nextInt(8));
            if (\u2603.d(a)) {
                for (int n = 1 + \u2603.nextInt(\u2603.nextInt(3) + 1), j = 0; j < n; ++j) {
                    if (afi.aK.e(\u2603, a)) {
                        \u2603.a(a.b(j), afi.aK.Q(), 2);
                    }
                }
            }
        }
        return true;
    }
}
