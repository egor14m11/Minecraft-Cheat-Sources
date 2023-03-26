// 
// Decompiled by Procyon v0.5.36
// 

public class bim extends bjo<tn>
{
    private static final jy a;
    
    public bim(final biu \u2603, final bbo \u2603, final float \u2603) {
        super(\u2603, \u2603, \u2603);
    }
    
    @Override
    protected jy a(final tn \u2603) {
        return bim.a;
    }
    
    protected float a(final tn \u2603, final float \u2603) {
        final float \u26032 = \u2603.bq + (\u2603.bm - \u2603.bq) * \u2603;
        final float n = \u2603.bp + (\u2603.bo - \u2603.bp) * \u2603;
        return (ns.a(\u26032) + 1.0f) * n;
    }
    
    static {
        a = new jy("textures/entity/chicken.png");
    }
}
