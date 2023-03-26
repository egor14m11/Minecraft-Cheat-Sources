import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public class aos extends aot
{
    private agi.b a;
    
    public void a(final agi.b \u2603) {
        this.a = \u2603;
    }
    
    @Override
    public boolean b(final adm \u2603, final Random \u2603, final cj \u2603) {
        boolean b = false;
        for (int i = 0; i < 64; ++i) {
            final cj a = \u2603.a(\u2603.nextInt(8) - \u2603.nextInt(8), \u2603.nextInt(4) - \u2603.nextInt(4), \u2603.nextInt(8) - \u2603.nextInt(8));
            if (\u2603.d(a) && (!\u2603.t.o() || a.o() < 254) && afi.cF.d(\u2603, a)) {
                afi.cF.a(\u2603, a, this.a, 2);
                b = true;
            }
        }
        return b;
    }
}
