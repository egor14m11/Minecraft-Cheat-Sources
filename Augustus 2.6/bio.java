// 
// Decompiled by Procyon v0.5.36
// 

public class bio extends bjo<vn>
{
    private static final jy a;
    
    public bio(final biu \u2603) {
        super(\u2603, new bbc(), 0.5f);
        ((bjl<pr>)this).a(new bkr(this));
    }
    
    @Override
    protected void a(final vn \u2603, final float \u2603) {
        float \u26032 = \u2603.a(\u2603);
        final float n = 1.0f + ns.a(\u26032 * 100.0f) * \u26032 * 0.01f;
        \u26032 = ns.a(\u26032, 0.0f, 1.0f);
        \u26032 *= \u26032;
        \u26032 *= \u26032;
        final float n2 = (1.0f + \u26032 * 0.4f) * n;
        final float \u26033 = (1.0f + \u26032 * 0.1f) / n;
        bfl.a(n2, \u26033, n2);
    }
    
    @Override
    protected int a(final vn \u2603, final float \u2603, final float \u2603) {
        final float a = \u2603.a(\u2603);
        if ((int)(a * 10.0f) % 2 == 0) {
            return 0;
        }
        int a2 = (int)(a * 0.2f * 255.0f);
        a2 = ns.a(a2, 0, 255);
        return a2 << 24 | 0xFFFFFF;
    }
    
    @Override
    protected jy a(final vn \u2603) {
        return bio.a;
    }
    
    static {
        a = new jy("textures/entity/creeper/creeper.png");
    }
}
