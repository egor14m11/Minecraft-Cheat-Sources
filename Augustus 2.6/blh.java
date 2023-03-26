// 
// Decompiled by Procyon v0.5.36
// 

public class blh implements blb<ty>
{
    private final bkg a;
    
    public blh(final bkg \u2603) {
        this.a = \u2603;
    }
    
    @Override
    public void a(final ty \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603) {
        if (\u2603.cm() == 0) {
            return;
        }
        final bgd ae = ave.A().ae();
        bfl.B();
        bfl.E();
        bfl.b(5.0f + 180.0f * ((bch)this.a.b()).c.f / 3.1415927f, 1.0f, 0.0f, 0.0f);
        bfl.b(90.0f, 1.0f, 0.0f, 0.0f);
        bfl.b(-0.9375f, -0.625f, -0.9375f);
        final float n = 0.5f;
        bfl.a(n, -n, n);
        final int b = \u2603.b(\u2603);
        final int n2 = b % 65536;
        final int n3 = b / 65536;
        bqs.a(bqs.r, n2 / 1.0f, n3 / 1.0f);
        bfl.c(1.0f, 1.0f, 1.0f, 1.0f);
        this.a.a(bmh.g);
        ae.a(afi.O.Q(), 1.0f);
        bfl.F();
        bfl.C();
    }
    
    @Override
    public boolean b() {
        return false;
    }
}
