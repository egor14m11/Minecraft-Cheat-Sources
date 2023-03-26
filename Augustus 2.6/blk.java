// 
// Decompiled by Procyon v0.5.36
// 

public class blk implements blb<ua>
{
    private static final jy a;
    private final bkl b;
    
    public blk(final bkl \u2603) {
        this.b = \u2603;
    }
    
    @Override
    public void a(final ua \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603) {
        if (!\u2603.cl() || \u2603.ax()) {
            return;
        }
        this.b.a(blk.a);
        final zd b = zd.b(\u2603.cw().a());
        final float[] a = tv.a(b);
        bfl.c(a[0], a[1], a[2]);
        this.b.b().a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
    }
    
    @Override
    public boolean b() {
        return true;
    }
    
    static {
        a = new jy("textures/entity/wolf/wolf_collar.png");
    }
}
