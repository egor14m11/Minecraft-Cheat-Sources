import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public class apl extends aot
{
    @Override
    public boolean b(final adm \u2603, final Random \u2603, final cj \u2603) {
        for (int i = 0; i < 64; ++i) {
            final cj a = \u2603.a(\u2603.nextInt(8) - \u2603.nextInt(8), \u2603.nextInt(4) - \u2603.nextInt(4), \u2603.nextInt(8) - \u2603.nextInt(8));
            if (\u2603.d(a) && \u2603.p(a.b()).c() == afi.c && afi.aU.d(\u2603, a)) {
                \u2603.a(a, afi.aU.Q().a((amo<Comparable>)aiv.O, cq.c.a.a(\u2603)), 2);
            }
        }
        return true;
    }
}
