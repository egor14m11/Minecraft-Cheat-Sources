// 
// Decompiled by Procyon v0.5.36
// 

public class aza extends ayl
{
    private static final jy u;
    private og v;
    private og w;
    
    public aza(final wm \u2603, final og \u2603) {
        super(new xw(\u2603, \u2603, ave.A().h));
        this.v = \u2603;
        this.w = \u2603;
        this.p = false;
        this.g = 133;
    }
    
    @Override
    protected void b(final int \u2603, final int \u2603) {
        this.q.a(this.w.f_().c(), 8, 6, 4210752);
        this.q.a(this.v.f_().c(), 8, this.g - 96 + 2, 4210752);
    }
    
    @Override
    protected void a(final float \u2603, final int \u2603, final int \u2603) {
        bfl.c(1.0f, 1.0f, 1.0f, 1.0f);
        this.j.P().a(aza.u);
        final int \u26032 = (this.l - this.f) / 2;
        final int \u26033 = (this.m - this.g) / 2;
        this.b(\u26032, \u26033, 0, 0, this.f, this.g);
    }
    
    static {
        u = new jy("textures/gui/container/hopper.png");
    }
}
