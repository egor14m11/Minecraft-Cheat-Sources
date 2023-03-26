import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public class apu extends aot
{
    private final alz a;
    
    public apu(final akc.a \u2603) {
        this.a = afi.H.Q().a(akc.a, \u2603);
    }
    
    @Override
    public boolean b(final adm \u2603, final Random \u2603, cj \u2603) {
        afh c;
        while (((c = \u2603.p(\u2603).c()).t() == arm.a || c.t() == arm.j) && \u2603.o() > 0) {
            \u2603 = \u2603.b();
        }
        for (int i = 0; i < 128; ++i) {
            final cj a = \u2603.a(\u2603.nextInt(8) - \u2603.nextInt(8), \u2603.nextInt(4) - \u2603.nextInt(4), \u2603.nextInt(8) - \u2603.nextInt(8));
            if (\u2603.d(a) && afi.H.f(\u2603, a, this.a)) {
                \u2603.a(a, this.a, 2);
            }
        }
        return true;
    }
}
