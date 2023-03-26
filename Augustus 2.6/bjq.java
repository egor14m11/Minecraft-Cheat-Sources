// 
// Decompiled by Procyon v0.5.36
// 

public class bjq extends bjo<ts>
{
    private static final jy a;
    private static final jy e;
    private static final jy j;
    private static final jy k;
    
    public bjq(final biu \u2603, final bbo \u2603, final float \u2603) {
        super(\u2603, \u2603, \u2603);
    }
    
    @Override
    protected jy a(final ts \u2603) {
        switch (\u2603.ct()) {
            default: {
                return bjq.e;
            }
            case 1: {
                return bjq.a;
            }
            case 2: {
                return bjq.j;
            }
            case 3: {
                return bjq.k;
            }
        }
    }
    
    @Override
    protected void a(final ts \u2603, final float \u2603) {
        super.a(\u2603, \u2603);
        if (\u2603.cl()) {
            bfl.a(0.8f, 0.8f, 0.8f);
        }
    }
    
    static {
        a = new jy("textures/entity/cat/black.png");
        e = new jy("textures/entity/cat/ocelot.png");
        j = new jy("textures/entity/cat/red.png");
        k = new jy("textures/entity/cat/siamese.png");
    }
}
