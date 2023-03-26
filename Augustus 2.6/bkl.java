// 
// Decompiled by Procyon v0.5.36
// 

public class bkl extends bjo<ua>
{
    private static final jy a;
    private static final jy e;
    private static final jy j;
    
    public bkl(final biu \u2603, final bbo \u2603, final float \u2603) {
        super(\u2603, \u2603, \u2603);
        ((bjl<pr>)this).a(new blk(this));
    }
    
    protected float a(final ua \u2603, final float \u2603) {
        return \u2603.cu();
    }
    
    @Override
    public void a(final ua \u2603, final double \u2603, final double \u2603, final double \u2603, final float \u2603, final float \u2603) {
        if (\u2603.ct()) {
            final float n = \u2603.c(\u2603) * \u2603.p(\u2603);
            bfl.c(n, n, n);
        }
        super.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
    }
    
    @Override
    protected jy a(final ua \u2603) {
        if (\u2603.cl()) {
            return bkl.e;
        }
        if (\u2603.cv()) {
            return bkl.j;
        }
        return bkl.a;
    }
    
    static {
        a = new jy("textures/entity/wolf/wolf.png");
        e = new jy("textures/entity/wolf/wolf_tame.png");
        j = new jy("textures/entity/wolf/wolf_angry.png");
    }
}
