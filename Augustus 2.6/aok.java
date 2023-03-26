import java.util.Iterator;
import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public class aok extends aot
{
    private final afh a;
    private final int b;
    
    public aok(final afh \u2603, final int \u2603) {
        super(false);
        this.a = \u2603;
        this.b = \u2603;
    }
    
    @Override
    public boolean b(final adm \u2603, final Random \u2603, cj \u2603) {
        while (\u2603.o() > 3) {
            if (!\u2603.d(\u2603.b())) {
                final afh c = \u2603.p(\u2603.b()).c();
                if (c == afi.c || c == afi.d) {
                    break;
                }
                if (c == afi.b) {
                    break;
                }
            }
            \u2603 = \u2603.b();
        }
        if (\u2603.o() <= 3) {
            return false;
        }
        for (int b = this.b, n = 0; b >= 0 && n < 3; ++n) {
            final int \u26032 = b + \u2603.nextInt(2);
            final int \u26033 = b + \u2603.nextInt(2);
            final int \u26034 = b + \u2603.nextInt(2);
            final float n2 = (\u26032 + \u26033 + \u26034) * 0.333f + 0.5f;
            for (final cj \u26035 : cj.a(\u2603.a(-\u26032, -\u26033, -\u26034), \u2603.a(\u26032, \u26033, \u26034))) {
                if (\u26035.i(\u2603) <= n2 * n2) {
                    \u2603.a(\u26035, this.a.Q(), 4);
                }
            }
            \u2603 = \u2603.a(-(b + 1) + \u2603.nextInt(2 + b * 2), 0 - \u2603.nextInt(2), -(b + 1) + \u2603.nextInt(2 + b * 2));
        }
        return true;
    }
}
