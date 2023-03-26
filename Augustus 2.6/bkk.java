// 
// Decompiled by Procyon v0.5.36
// 

public class bkk extends biv<xd>
{
    private static final jy a;
    private static final jy e;
    private final bbz f;
    
    public bkk(final biu \u2603) {
        super(\u2603);
        this.f = new bbz();
    }
    
    private float a(final float \u2603, final float \u2603, final float \u2603) {
        float n;
        for (n = \u2603 - \u2603; n < -180.0f; n += 360.0f) {}
        while (n >= 180.0f) {
            n -= 360.0f;
        }
        return \u2603 + \u2603 * n;
    }
    
    @Override
    public void a(final xd \u2603, final double \u2603, final double \u2603, final double \u2603, final float \u2603, final float \u2603) {
        bfl.E();
        bfl.p();
        final float a = this.a(\u2603.A, \u2603.y, \u2603);
        final float \u26032 = \u2603.B + (\u2603.z - \u2603.B) * \u2603;
        bfl.b((float)\u2603, (float)\u2603, (float)\u2603);
        final float \u26033 = 0.0625f;
        bfl.B();
        bfl.a(-1.0f, -1.0f, 1.0f);
        bfl.d();
        this.c(\u2603);
        this.f.a(\u2603, 0.0f, 0.0f, 0.0f, a, \u26032, \u26033);
        bfl.F();
        super.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
    }
    
    @Override
    protected jy a(final xd \u2603) {
        return \u2603.l() ? bkk.a : bkk.e;
    }
    
    static {
        a = new jy("textures/entity/wither/wither_invulnerable.png");
        e = new jy("textures/entity/wither/wither.png");
    }
}
