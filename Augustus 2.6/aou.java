import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public class aou extends aot
{
    private agw a;
    private alz b;
    
    public aou(final agw \u2603, final agw.a \u2603) {
        this.a(\u2603, \u2603);
    }
    
    public void a(final agw \u2603, final agw.a \u2603) {
        this.a = \u2603;
        this.b = \u2603.Q().a(\u2603.n(), \u2603);
    }
    
    @Override
    public boolean b(final adm \u2603, final Random \u2603, final cj \u2603) {
        for (int i = 0; i < 64; ++i) {
            final cj a = \u2603.a(\u2603.nextInt(8) - \u2603.nextInt(8), \u2603.nextInt(4) - \u2603.nextInt(4), \u2603.nextInt(8) - \u2603.nextInt(8));
            if (\u2603.d(a) && (!\u2603.t.o() || a.o() < 255) && this.a.f(\u2603, a, this.b)) {
                \u2603.a(a, this.b, 2);
            }
        }
        return true;
    }
}
