// 
// Decompiled by Procyon v0.5.36
// 

public class bkj extends bjo<uk>
{
    private static final jy a;
    private static final jy e;
    
    public bkj(final biu \u2603) {
        super(\u2603, new bcl(0.0f), 1.0f);
        ((bjl<pr>)this).a(new blj(this));
    }
    
    @Override
    public void a(final uk \u2603, final double \u2603, final double \u2603, final double \u2603, final float \u2603, final float \u2603) {
        bfc.a(\u2603, true);
        super.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
    }
    
    @Override
    protected jy a(final uk \u2603) {
        final int cl = \u2603.cl();
        if (cl <= 0 || (cl <= 80 && cl / 5 % 2 == 1)) {
            return bkj.e;
        }
        return bkj.a;
    }
    
    @Override
    protected void a(final uk \u2603, final float \u2603) {
        float n = 2.0f;
        final int cl = \u2603.cl();
        if (cl > 0) {
            n -= (cl - \u2603) / 220.0f * 0.5f;
        }
        bfl.a(n, n, n);
    }
    
    static {
        a = new jy("textures/entity/wither/wither_invulnerable.png");
        e = new jy("textures/entity/wither/wither.png");
    }
}
