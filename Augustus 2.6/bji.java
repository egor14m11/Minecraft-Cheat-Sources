// 
// Decompiled by Procyon v0.5.36
// 

public class bji extends bjo<vu>
{
    private static final jy a;
    
    public bji(final biu \u2603) {
        super(\u2603, new bbl(), 0.25f);
    }
    
    @Override
    protected jy a(final vu \u2603) {
        return bji.a;
    }
    
    @Override
    protected void a(final vu \u2603, final float \u2603) {
        final int cm = \u2603.cm();
        final float n = (\u2603.c + (\u2603.b - \u2603.c) * \u2603) / (cm * 0.5f + 1.0f);
        final float n2 = 1.0f / (n + 1.0f);
        final float n3 = (float)cm;
        bfl.a(n2 * n3, 1.0f / n2 * n3, n2 * n3);
    }
    
    static {
        a = new jy("textures/entity/slime/magmacube.png");
    }
}
