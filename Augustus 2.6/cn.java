// 
// Decompiled by Procyon v0.5.36
// 

public class cn implements cr
{
    @Override
    public final zx a(final ck \u2603, final zx \u2603) {
        final zx b = this.b(\u2603, \u2603);
        this.a(\u2603);
        this.a(\u2603, agg.b(\u2603.f()));
        return b;
    }
    
    protected zx b(final ck \u2603, final zx \u2603) {
        final cq b = agg.b(\u2603.f());
        final cz a = agg.a(\u2603);
        final zx a2 = \u2603.a(1);
        a(\u2603.i(), a2, 6, b, a);
        return \u2603;
    }
    
    public static void a(final adm \u2603, final zx \u2603, final int \u2603, final cq \u2603, final cz \u2603) {
        final double a = \u2603.a();
        double b = \u2603.b();
        final double c = \u2603.c();
        if (\u2603.k() == cq.a.b) {
            b -= 0.125;
        }
        else {
            b -= 0.15625;
        }
        final uz \u26032 = new uz(\u2603, a, b, c, \u2603);
        final double n = \u2603.s.nextDouble() * 0.1 + 0.2;
        \u26032.v = \u2603.g() * n;
        \u26032.w = 0.20000000298023224;
        \u26032.x = \u2603.i() * n;
        final uz uz = \u26032;
        uz.v += \u2603.s.nextGaussian() * 0.007499999832361937 * \u2603;
        final uz uz2 = \u26032;
        uz2.w += \u2603.s.nextGaussian() * 0.007499999832361937 * \u2603;
        final uz uz3 = \u26032;
        uz3.x += \u2603.s.nextGaussian() * 0.007499999832361937 * \u2603;
        \u2603.d(\u26032);
    }
    
    protected void a(final ck \u2603) {
        \u2603.i().b(1000, \u2603.d(), 0);
    }
    
    protected void a(final ck \u2603, final cq \u2603) {
        \u2603.i().b(2000, \u2603.d(), this.a(\u2603));
    }
    
    private int a(final cq \u2603) {
        return \u2603.g() + 1 + (\u2603.i() + 1) * 3;
    }
}
