// 
// Decompiled by Procyon v0.5.36
// 

public class bkg extends bjo<ty>
{
    private static final jy a;
    
    public bkg(final biu \u2603) {
        super(\u2603, new bch(), 0.5f);
        ((bjl<pr>)this).a(new blh(this));
    }
    
    @Override
    protected jy a(final ty \u2603) {
        return bkg.a;
    }
    
    @Override
    protected void a(final ty \u2603, final float \u2603, final float \u2603, final float \u2603) {
        super.a(\u2603, \u2603, \u2603, \u2603);
        if (\u2603.aB < 0.01) {
            return;
        }
        final float n = 13.0f;
        final float n2 = \u2603.aC - \u2603.aB * (1.0f - \u2603) + 6.0f;
        final float n3 = (Math.abs(n2 % n - n * 0.5f) - n * 0.25f) / (n * 0.25f);
        bfl.b(6.5f * n3, 0.0f, 0.0f, 1.0f);
    }
    
    static {
        a = new jy("textures/entity/iron_golem.png");
    }
}
