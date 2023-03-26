import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public class aoq extends aot
{
    @Override
    public boolean b(final adm \u2603, final Random \u2603, cj \u2603) {
        afh c;
        while (((c = \u2603.p(\u2603).c()).t() == arm.a || c.t() == arm.j) && \u2603.o() > 0) {
            \u2603 = \u2603.b();
        }
        for (int i = 0; i < 4; ++i) {
            final cj a = \u2603.a(\u2603.nextInt(8) - \u2603.nextInt(8), \u2603.nextInt(4) - \u2603.nextInt(4), \u2603.nextInt(8) - \u2603.nextInt(8));
            if (\u2603.d(a) && afi.I.f(\u2603, a, afi.I.Q())) {
                \u2603.a(a, afi.I.Q(), 2);
            }
        }
        return true;
    }
}
