// 
// Decompiled by Procyon v0.5.36
// 

public class bjy extends bjo<wb>
{
    private static final jy a;
    
    public bjy(final biu \u2603, final bbo \u2603, final float \u2603) {
        super(\u2603, \u2603, \u2603);
        ((bjl<pr>)this).a(new bld(this));
    }
    
    @Override
    public void a(final wb \u2603, final double \u2603, final double \u2603, final double \u2603, final float \u2603, final float \u2603) {
        this.c = 0.25f * \u2603.cm();
        super.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
    }
    
    @Override
    protected void a(final wb \u2603, final float \u2603) {
        final float n = (float)\u2603.cm();
        final float n2 = (\u2603.c + (\u2603.b - \u2603.c) * \u2603) / (n * 0.5f + 1.0f);
        final float n3 = 1.0f / (n2 + 1.0f);
        bfl.a(n3 * n, 1.0f / n3 * n, n3 * n);
    }
    
    @Override
    protected jy a(final wb \u2603) {
        return bjy.a;
    }
    
    static {
        a = new jy("textures/entity/slime/slime.png");
    }
}
