// 
// Decompiled by Procyon v0.5.36
// 

public class bkp implements blb<bet>
{
    private final bln a;
    
    public bkp(final bln \u2603) {
        this.a = \u2603;
    }
    
    @Override
    public void a(final bet \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603) {
        if (!\u2603.a() || \u2603.ax() || !\u2603.a(wo.a) || \u2603.k() == null) {
            return;
        }
        bfl.c(1.0f, 1.0f, 1.0f, 1.0f);
        this.a.a(\u2603.k());
        bfl.E();
        bfl.b(0.0f, 0.0f, 0.125f);
        final double n = \u2603.bq + (\u2603.bt - \u2603.bq) * \u2603 - (\u2603.p + (\u2603.s - \u2603.p) * \u2603);
        final double n2 = \u2603.br + (\u2603.bu - \u2603.br) * \u2603 - (\u2603.q + (\u2603.t - \u2603.q) * \u2603);
        final double n3 = \u2603.bs + (\u2603.bv - \u2603.bs) * \u2603 - (\u2603.r + (\u2603.u - \u2603.r) * \u2603);
        final float n4 = \u2603.aJ + (\u2603.aI - \u2603.aJ) * \u2603;
        final double n5 = ns.a(n4 * 3.1415927f / 180.0f);
        final double n6 = -ns.b(n4 * 3.1415927f / 180.0f);
        float a = (float)n2 * 10.0f;
        a = ns.a(a, -6.0f, 32.0f);
        float n7 = (float)(n * n5 + n3 * n6) * 100.0f;
        final float n8 = (float)(n * n6 - n3 * n5) * 100.0f;
        if (n7 < 0.0f) {
            n7 = 0.0f;
        }
        final float n9 = \u2603.bn + (\u2603.bo - \u2603.bn) * \u2603;
        a += ns.a((\u2603.L + (\u2603.M - \u2603.L) * \u2603) * 6.0f) * 32.0f * n9;
        if (\u2603.av()) {
            a += 25.0f;
        }
        bfl.b(6.0f + n7 / 2.0f + a, 1.0f, 0.0f, 0.0f);
        bfl.b(n8 / 2.0f, 0.0f, 0.0f, 1.0f);
        bfl.b(-n8 / 2.0f, 0.0f, 1.0f, 0.0f);
        bfl.b(180.0f, 0.0f, 1.0f, 0.0f);
        this.a.g().c(0.0625f);
        bfl.F();
    }
    
    @Override
    public boolean b() {
        return false;
    }
}
