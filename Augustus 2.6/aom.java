import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public class aom extends aot
{
    private afm a;
    
    public aom(final afm \u2603) {
        this.a = \u2603;
    }
    
    @Override
    public boolean b(final adm \u2603, final Random \u2603, final cj \u2603) {
        for (int i = 0; i < 64; ++i) {
            final cj a = \u2603.a(\u2603.nextInt(8) - \u2603.nextInt(8), \u2603.nextInt(4) - \u2603.nextInt(4), \u2603.nextInt(8) - \u2603.nextInt(8));
            if (\u2603.d(a) && (!\u2603.t.o() || a.o() < 255) && this.a.f(\u2603, a, this.a.Q())) {
                \u2603.a(a, this.a.Q(), 2);
            }
        }
        return true;
    }
}
