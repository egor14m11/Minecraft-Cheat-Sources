// 
// Decompiled by Procyon v0.5.36
// 

public class blj implements blb<uk>
{
    private static final jy a;
    private final bkj b;
    private final bcl c;
    
    public blj(final bkj \u2603) {
        this.c = new bcl(0.5f);
        this.b = \u2603;
    }
    
    @Override
    public void a(final uk \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603) {
        if (!\u2603.cm()) {
            return;
        }
        bfl.a(!\u2603.ax());
        this.b.a(blj.a);
        bfl.n(5890);
        bfl.D();
        final float n = \u2603.W + \u2603;
        final float \u26032 = ns.b(n * 0.02f) * 3.0f;
        final float \u26033 = n * 0.01f;
        bfl.b(\u26032, \u26033, 0.0f);
        bfl.n(5888);
        bfl.l();
        final float n2 = 0.5f;
        bfl.c(n2, n2, n2, 1.0f);
        bfl.f();
        bfl.b(1, 1);
        this.c.a(\u2603, \u2603, \u2603, \u2603);
        this.c.a(this.b.b());
        this.c.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        bfl.n(5890);
        bfl.D();
        bfl.n(5888);
        bfl.e();
        bfl.k();
    }
    
    @Override
    public boolean b() {
        return false;
    }
    
    static {
        a = new jy("textures/entity/wither/wither_armor.png");
    }
}
