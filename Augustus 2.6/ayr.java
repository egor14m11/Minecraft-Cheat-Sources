// 
// Decompiled by Procyon v0.5.36
// 

public class ayr extends ayl
{
    private static final jy u;
    private og v;
    private og w;
    private int x;
    
    public ayr(final og \u2603, final og \u2603) {
        super(new xo(\u2603, \u2603, ave.A().h));
        this.v = \u2603;
        this.w = \u2603;
        this.p = false;
        final int n = 222;
        final int n2 = n - 108;
        this.x = \u2603.o_() / 9;
        this.g = n2 + this.x * 18;
    }
    
    @Override
    protected void b(final int \u2603, final int \u2603) {
        this.q.a(this.w.f_().c(), 8, 6, 4210752);
        this.q.a(this.v.f_().c(), 8, this.g - 96 + 2, 4210752);
    }
    
    @Override
    protected void a(final float \u2603, final int \u2603, final int \u2603) {
        bfl.c(1.0f, 1.0f, 1.0f, 1.0f);
        this.j.P().a(ayr.u);
        final int n = (this.l - this.f) / 2;
        final int \u26032 = (this.m - this.g) / 2;
        this.b(n, \u26032, 0, 0, this.f, this.x * 18 + 17);
        this.b(n, \u26032 + this.x * 18 + 17, 0, 126, this.f, 96);
    }
    
    static {
        u = new jy("textures/gui/container/generic_54.png");
    }
}
