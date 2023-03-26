// 
// Decompiled by Procyon v0.5.36
// 

public class ayz extends ayl
{
    private static final jy u;
    private final wm v;
    private og w;
    
    public ayz(final wm \u2603, final og \u2603) {
        super(new xu(\u2603, \u2603));
        this.v = \u2603;
        this.w = \u2603;
    }
    
    @Override
    protected void b(final int \u2603, final int \u2603) {
        final String c = this.w.f_().c();
        this.q.a(c, this.f / 2 - this.q.a(c) / 2, 6, 4210752);
        this.q.a(this.v.f_().c(), 8, this.g - 96 + 2, 4210752);
    }
    
    @Override
    protected void a(final float \u2603, final int \u2603, final int \u2603) {
        bfl.c(1.0f, 1.0f, 1.0f, 1.0f);
        this.j.P().a(ayz.u);
        final int \u26032 = (this.l - this.f) / 2;
        final int \u26033 = (this.m - this.g) / 2;
        this.b(\u26032, \u26033, 0, 0, this.f, this.g);
        if (alh.a(this.w)) {
            final int n = this.i(13);
            this.b(\u26032 + 56, \u26033 + 36 + 12 - n, 176, 12 - n, 14, n + 1);
        }
        final int n = this.h(24);
        this.b(\u26032 + 79, \u26033 + 34, 176, 14, n + 1, 16);
    }
    
    private int h(final int \u2603) {
        final int a_ = this.w.a_(2);
        final int a_2 = this.w.a_(3);
        if (a_2 == 0 || a_ == 0) {
            return 0;
        }
        return a_ * \u2603 / a_2;
    }
    
    private int i(final int \u2603) {
        int a_ = this.w.a_(1);
        if (a_ == 0) {
            a_ = 200;
        }
        return this.w.a_(0) * \u2603 / a_;
    }
    
    static {
        u = new jy("textures/gui/container/furnace.png");
    }
}
