import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public class apx extends aot
{
    @Override
    public boolean b(final adm \u2603, final Random \u2603, final cj \u2603) {
        for (int i = 0; i < 10; ++i) {
            final int \u26032 = \u2603.n() + \u2603.nextInt(8) - \u2603.nextInt(8);
            final int \u26033 = \u2603.o() + \u2603.nextInt(4) - \u2603.nextInt(4);
            final int \u26034 = \u2603.p() + \u2603.nextInt(8) - \u2603.nextInt(8);
            if (\u2603.d(new cj(\u26032, \u26033, \u26034)) && afi.bx.d(\u2603, new cj(\u26032, \u26033, \u26034))) {
                \u2603.a(new cj(\u26032, \u26033, \u26034), afi.bx.Q(), 2);
            }
        }
        return true;
    }
}
