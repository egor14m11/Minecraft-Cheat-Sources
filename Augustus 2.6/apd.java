import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public class apd extends aot
{
    @Override
    public boolean b(final adm \u2603, final Random \u2603, final cj \u2603) {
        if (!\u2603.d(\u2603)) {
            return false;
        }
        if (\u2603.p(\u2603.a()).c() != afi.aV) {
            return false;
        }
        \u2603.a(\u2603, afi.aX.Q(), 2);
        for (int i = 0; i < 1500; ++i) {
            final cj a = \u2603.a(\u2603.nextInt(8) - \u2603.nextInt(8), -\u2603.nextInt(12), \u2603.nextInt(8) - \u2603.nextInt(8));
            if (\u2603.p(a).c().t() == arm.a) {
                int n = 0;
                for (final cq \u26032 : cq.values()) {
                    if (\u2603.p(a.a(\u26032)).c() == afi.aX) {
                        ++n;
                    }
                    if (n > 1) {
                        break;
                    }
                }
                if (n == 1) {
                    \u2603.a(a, afi.aX.Q(), 2);
                }
            }
        }
        return true;
    }
}
