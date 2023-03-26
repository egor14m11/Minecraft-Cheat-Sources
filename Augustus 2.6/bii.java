// 
// Decompiled by Procyon v0.5.36
// 

public class bii extends bjo<tk>
{
    private static final jy a;
    
    public bii(final biu \u2603) {
        super(\u2603, new bav(), 0.25f);
    }
    
    @Override
    protected jy a(final tk \u2603) {
        return bii.a;
    }
    
    @Override
    protected void a(final tk \u2603, final float \u2603) {
        bfl.a(0.35f, 0.35f, 0.35f);
    }
    
    @Override
    protected void a(final tk \u2603, final float \u2603, final float \u2603, final float \u2603) {
        if (!\u2603.n()) {
            bfl.b(0.0f, ns.b(\u2603 * 0.3f) * 0.1f, 0.0f);
        }
        else {
            bfl.b(0.0f, -0.1f, 0.0f);
        }
        super.a(\u2603, \u2603, \u2603, \u2603);
    }
    
    static {
        a = new jy("textures/entity/bat.png");
    }
}
