// 
// Decompiled by Procyon v0.5.36
// 

public class bki extends bjo<wd>
{
    private static final jy a;
    
    public bki(final biu \u2603) {
        super(\u2603, new bck(0.0f), 0.5f);
        ((bjl<pr>)this).a(new bli(this));
    }
    
    @Override
    public void a(final wd \u2603, final double \u2603, final double \u2603, final double \u2603, final float \u2603, final float \u2603) {
        ((bck)this.f).g = (\u2603.bA() != null);
        super.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
    }
    
    @Override
    protected jy a(final wd \u2603) {
        return bki.a;
    }
    
    @Override
    public void C_() {
        bfl.b(0.0f, 0.1875f, 0.0f);
    }
    
    @Override
    protected void a(final wd \u2603, final float \u2603) {
        final float n = 0.9375f;
        bfl.a(n, n, n);
    }
    
    static {
        a = new jy("textures/entity/witch.png");
    }
}
