import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public class apw extends aot
{
    @Override
    public boolean b(final adm \u2603, final Random \u2603, cj \u2603) {
        while (\u2603.o() < 128) {
            if (\u2603.d(\u2603)) {
                for (final cq \u26032 : cq.c.a.a()) {
                    if (afi.bn.b(\u2603, \u2603, \u26032)) {
                        final alz a2 = afi.bn.Q().a((amo<Comparable>)akk.b, \u26032 == cq.c).a((amo<Comparable>)akk.N, \u26032 == cq.f).a((amo<Comparable>)akk.O, \u26032 == cq.d).a((amo<Comparable>)akk.P, \u26032 == cq.e);
                        \u2603.a(\u2603, a2, 2);
                        break;
                    }
                }
            }
            else {
                \u2603 = \u2603.a(\u2603.nextInt(4) - \u2603.nextInt(4), 0, \u2603.nextInt(4) - \u2603.nextInt(4));
            }
            \u2603 = \u2603.a();
        }
        return true;
    }
}
