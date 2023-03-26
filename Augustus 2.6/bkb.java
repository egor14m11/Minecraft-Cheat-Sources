// 
// Decompiled by Procyon v0.5.36
// 

public class bkb extends bjo<tx>
{
    private static final jy a;
    
    public bkb(final biu \u2603, final bbo \u2603, final float \u2603) {
        super(\u2603, \u2603, \u2603);
    }
    
    @Override
    protected jy a(final tx \u2603) {
        return bkb.a;
    }
    
    @Override
    protected void a(final tx \u2603, final float \u2603, final float \u2603, final float \u2603) {
        final float \u26032 = \u2603.b + (\u2603.a - \u2603.b) * \u2603;
        final float \u26033 = \u2603.bk + (\u2603.c - \u2603.bk) * \u2603;
        bfl.b(0.0f, 0.5f, 0.0f);
        bfl.b(180.0f - \u2603, 0.0f, 1.0f, 0.0f);
        bfl.b(\u26032, 1.0f, 0.0f, 0.0f);
        bfl.b(\u26033, 0.0f, 1.0f, 0.0f);
        bfl.b(0.0f, -1.2f, 0.0f);
    }
    
    protected float a(final tx \u2603, final float \u2603) {
        return \u2603.bo + (\u2603.bn - \u2603.bo) * \u2603;
    }
    
    static {
        a = new jy("textures/entity/squid.png");
    }
}
