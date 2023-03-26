// 
// Decompiled by Procyon v0.5.36
// 

public class bkf extends biv<vj>
{
    public bkf(final biu \u2603) {
        super(\u2603);
        this.c = 0.5f;
    }
    
    @Override
    public void a(final vj \u2603, final double \u2603, final double \u2603, final double \u2603, final float \u2603, final float \u2603) {
        final bgd ae = ave.A().ae();
        bfl.E();
        bfl.b((float)\u2603, (float)\u2603 + 0.5f, (float)\u2603);
        if (\u2603.a - \u2603 + 1.0f < 10.0f) {
            float a = 1.0f - (\u2603.a - \u2603 + 1.0f) / 10.0f;
            a = ns.a(a, 0.0f, 1.0f);
            a *= a;
            a *= a;
            final float n = 1.0f + a * 0.3f;
            bfl.a(n, n, n);
        }
        float a = (1.0f - (\u2603.a - \u2603 + 1.0f) / 100.0f) * 0.8f;
        this.c(\u2603);
        bfl.b(-0.5f, -0.5f, 0.5f);
        ae.a(afi.W.Q(), \u2603.c(\u2603));
        bfl.b(0.0f, 0.0f, 1.0f);
        if (\u2603.a / 5 % 2 == 0) {
            bfl.x();
            bfl.f();
            bfl.l();
            bfl.b(770, 772);
            bfl.c(1.0f, 1.0f, 1.0f, a);
            bfl.a(-3.0f, -3.0f);
            bfl.q();
            ae.a(afi.W.Q(), 1.0f);
            bfl.a(0.0f, 0.0f);
            bfl.r();
            bfl.c(1.0f, 1.0f, 1.0f, 1.0f);
            bfl.k();
            bfl.e();
            bfl.w();
        }
        bfl.F();
        super.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
    }
    
    @Override
    protected jy a(final vj \u2603) {
        return bmh.g;
    }
}
