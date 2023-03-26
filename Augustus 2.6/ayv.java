// 
// Decompiled by Procyon v0.5.36
// 

public class ayv extends ayl
{
    private static final jy v;
    private final wm w;
    public og u;
    
    public ayv(final wm \u2603, final og \u2603) {
        super(new xr(\u2603, \u2603));
        this.w = \u2603;
        this.u = \u2603;
    }
    
    @Override
    protected void b(final int \u2603, final int \u2603) {
        final String c = this.u.f_().c();
        this.q.a(c, this.f / 2 - this.q.a(c) / 2, 6, 4210752);
        this.q.a(this.w.f_().c(), 8, this.g - 96 + 2, 4210752);
    }
    
    @Override
    protected void a(final float \u2603, final int \u2603, final int \u2603) {
        bfl.c(1.0f, 1.0f, 1.0f, 1.0f);
        this.j.P().a(ayv.v);
        final int \u26032 = (this.l - this.f) / 2;
        final int \u26033 = (this.m - this.g) / 2;
        this.b(\u26032, \u26033, 0, 0, this.f, this.g);
    }
    
    static {
        v = new jy("textures/gui/container/dispenser.png");
    }
}
