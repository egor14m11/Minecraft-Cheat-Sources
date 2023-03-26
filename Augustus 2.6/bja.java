// 
// Decompiled by Procyon v0.5.36
// 

public class bja extends bjo<vr>
{
    private static final jy a;
    private static final jy e;
    
    public bja(final biu \u2603) {
        super(\u2603, new bbf(), 0.5f);
    }
    
    @Override
    protected jy a(final vr \u2603) {
        if (\u2603.n()) {
            return bja.e;
        }
        return bja.a;
    }
    
    @Override
    protected void a(final vr \u2603, final float \u2603) {
        final float n = 1.0f;
        final float \u26032 = (8.0f + n) / 2.0f;
        final float n2 = (8.0f + 1.0f / n) / 2.0f;
        bfl.a(n2, \u26032, n2);
        bfl.c(1.0f, 1.0f, 1.0f, 1.0f);
    }
    
    static {
        a = new jy("textures/entity/ghast/ghast.png");
        e = new jy("textures/entity/ghast/ghast_shooting.png");
    }
}
