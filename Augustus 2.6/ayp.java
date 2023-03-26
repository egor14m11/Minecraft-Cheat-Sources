// 
// Decompiled by Procyon v0.5.36
// 

public class ayp extends ayl
{
    private static final jy u;
    private final wm v;
    private og w;
    
    public ayp(final wm \u2603, final og \u2603) {
        super(new xm(\u2603, \u2603));
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
        this.j.P().a(ayp.u);
        final int \u26032 = (this.l - this.f) / 2;
        final int \u26033 = (this.m - this.g) / 2;
        this.b(\u26032, \u26033, 0, 0, this.f, this.g);
        final int a_ = this.w.a_(0);
        if (a_ > 0) {
            int n = (int)(28.0f * (1.0f - a_ / 400.0f));
            if (n > 0) {
                this.b(\u26032 + 97, \u26033 + 16, 176, 0, 9, n);
            }
            final int n2 = a_ / 2 % 7;
            switch (n2) {
                case 6: {
                    n = 0;
                    break;
                }
                case 5: {
                    n = 6;
                    break;
                }
                case 4: {
                    n = 11;
                    break;
                }
                case 3: {
                    n = 16;
                    break;
                }
                case 2: {
                    n = 20;
                    break;
                }
                case 1: {
                    n = 24;
                    break;
                }
                case 0: {
                    n = 29;
                    break;
                }
            }
            if (n > 0) {
                this.b(\u26032 + 65, \u26033 + 14 + 29 - n, 185, 29 - n, 12, n);
            }
        }
    }
    
    static {
        u = new jy("textures/gui/container/brewing_stand.png");
    }
}
