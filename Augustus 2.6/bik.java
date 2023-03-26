// 
// Decompiled by Procyon v0.5.36
// 

public class bik extends biv<ux>
{
    private static final jy e;
    protected bbo a;
    
    public bik(final biu \u2603) {
        super(\u2603);
        this.a = new bax();
        this.c = 0.5f;
    }
    
    @Override
    public void a(final ux \u2603, final double \u2603, final double \u2603, final double \u2603, final float \u2603, final float \u2603) {
        bfl.E();
        bfl.b((float)\u2603, (float)\u2603 + 0.25f, (float)\u2603);
        bfl.b(180.0f - \u2603, 0.0f, 1.0f, 0.0f);
        final float \u26032 = \u2603.l() - \u2603;
        float n = \u2603.j() - \u2603;
        if (n < 0.0f) {
            n = 0.0f;
        }
        if (\u26032 > 0.0f) {
            bfl.b(ns.a(\u26032) * \u26032 * n / 10.0f * \u2603.m(), 1.0f, 0.0f, 0.0f);
        }
        final float n2 = 0.75f;
        bfl.a(n2, n2, n2);
        bfl.a(1.0f / n2, 1.0f / n2, 1.0f / n2);
        this.c(\u2603);
        bfl.a(-1.0f, -1.0f, 1.0f);
        this.a.a(\u2603, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f, 0.0625f);
        bfl.F();
        super.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
    }
    
    @Override
    protected jy a(final ux \u2603) {
        return bik.e;
    }
    
    static {
        e = new jy("textures/entity/boat.png");
    }
}
