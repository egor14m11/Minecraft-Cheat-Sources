// 
// Decompiled by Procyon v0.5.36
// 

public class azb extends ayl
{
    private static final jy u;
    private og v;
    private og w;
    private tp x;
    private float y;
    private float z;
    
    public azb(final og \u2603, final og \u2603, final tp \u2603) {
        super(new xx(\u2603, \u2603, \u2603, ave.A().h));
        this.v = \u2603;
        this.w = \u2603;
        this.x = \u2603;
        this.p = false;
    }
    
    @Override
    protected void b(final int \u2603, final int \u2603) {
        this.q.a(this.w.f_().c(), 8, 6, 4210752);
        this.q.a(this.v.f_().c(), 8, this.g - 96 + 2, 4210752);
    }
    
    @Override
    protected void a(final float \u2603, final int \u2603, final int \u2603) {
        bfl.c(1.0f, 1.0f, 1.0f, 1.0f);
        this.j.P().a(azb.u);
        final int \u26032 = (this.l - this.f) / 2;
        final int \u26033 = (this.m - this.g) / 2;
        this.b(\u26032, \u26033, 0, 0, this.f, this.g);
        if (this.x.cw()) {
            this.b(\u26032 + 79, \u26033 + 17, 0, this.g, 90, 54);
        }
        if (this.x.cO()) {
            this.b(\u26032 + 7, \u26033 + 35, 0, this.g + 54, 18, 18);
        }
        azc.a(\u26032 + 51, \u26033 + 60, 17, \u26032 + 51 - this.y, \u26033 + 75 - 50 - this.z, this.x);
    }
    
    @Override
    public void a(final int \u2603, final int \u2603, final float \u2603) {
        this.y = (float)\u2603;
        this.z = (float)\u2603;
        super.a(\u2603, \u2603, \u2603);
    }
    
    static {
        u = new jy("textures/gui/container/horse.png");
    }
}
