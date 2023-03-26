// 
// Decompiled by Procyon v0.5.36
// 

public class bke extends bjm<vi>
{
    public bke(final biu \u2603) {
        super(\u2603);
    }
    
    @Override
    protected void a(final vi \u2603, final float \u2603, final alz \u2603) {
        final int l = \u2603.l();
        if (l > -1 && l - \u2603 + 1.0f < 10.0f) {
            float a = 1.0f - (l - \u2603 + 1.0f) / 10.0f;
            a = ns.a(a, 0.0f, 1.0f);
            a *= a;
            a *= a;
            final float n = 1.0f + a * 0.3f;
            bfl.a(n, n, n);
        }
        super.a(\u2603, \u2603, \u2603);
        if (l > -1 && l / 5 % 2 == 0) {
            final bgd ae = ave.A().ae();
            bfl.x();
            bfl.f();
            bfl.l();
            bfl.b(770, 772);
            bfl.c(1.0f, 1.0f, 1.0f, (1.0f - (l - \u2603 + 1.0f) / 100.0f) * 0.8f);
            bfl.E();
            ae.a(afi.W.Q(), 1.0f);
            bfl.F();
            bfl.c(1.0f, 1.0f, 1.0f, 1.0f);
            bfl.k();
            bfl.e();
            bfl.w();
        }
    }
}
