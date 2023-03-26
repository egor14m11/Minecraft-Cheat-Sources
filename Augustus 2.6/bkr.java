// 
// Decompiled by Procyon v0.5.36
// 

public class bkr implements blb<vn>
{
    private static final jy a;
    private final bio b;
    private final bbc c;
    
    public bkr(final bio \u2603) {
        this.c = new bbc(2.0f);
        this.b = \u2603;
    }
    
    @Override
    public void a(final vn \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603) {
        if (!\u2603.n()) {
            return;
        }
        final boolean ax = \u2603.ax();
        bfl.a(!ax);
        this.b.a(bkr.a);
        bfl.n(5890);
        bfl.D();
        final float n = \u2603.W + \u2603;
        bfl.b(n * 0.01f, n * 0.01f, 0.0f);
        bfl.n(5888);
        bfl.l();
        final float n2 = 0.5f;
        bfl.c(n2, n2, n2, 1.0f);
        bfl.f();
        bfl.b(1, 1);
        this.c.a(this.b.b());
        this.c.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        bfl.n(5890);
        bfl.D();
        bfl.n(5888);
        bfl.e();
        bfl.k();
        bfl.a(ax);
    }
    
    @Override
    public boolean b() {
        return false;
    }
    
    static {
        a = new jy("textures/entity/creeper/creeper_armor.png");
    }
}
