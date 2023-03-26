import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public class apm extends aot
{
    @Override
    public boolean b(final adm \u2603, final Random \u2603, final cj \u2603) {
        for (int i = 0; i < 20; ++i) {
            final cj a = \u2603.a(\u2603.nextInt(4) - \u2603.nextInt(4), 0, \u2603.nextInt(4) - \u2603.nextInt(4));
            if (\u2603.d(a)) {
                final cj b = a.b();
                if (\u2603.p(b.e()).c().t() == arm.h || \u2603.p(b.f()).c().t() == arm.h || \u2603.p(b.c()).c().t() == arm.h || \u2603.p(b.d()).c().t() == arm.h) {
                    for (int n = 2 + \u2603.nextInt(\u2603.nextInt(3) + 1), j = 0; j < n; ++j) {
                        if (afi.aM.e(\u2603, a)) {
                            \u2603.a(a.b(j), afi.aM.Q(), 2);
                        }
                    }
                }
            }
        }
        return true;
    }
}
