// 
// Decompiled by Procyon v0.5.36
// 

public class bkw implements blb<vo>
{
    private static final jy a;
    private final bis b;
    
    public bkw(final bis \u2603) {
        this.b = \u2603;
    }
    
    @Override
    public void a(final vo \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603) {
        this.b.a(bkw.a);
        bfl.l();
        bfl.c();
        bfl.b(1, 1);
        bfl.f();
        bfl.a(!\u2603.ax());
        final int n = 61680;
        final int n2 = n % 65536;
        final int n3 = n / 65536;
        bqs.a(bqs.r, n2 / 1.0f, n3 / 1.0f);
        bfl.e();
        bfl.c(1.0f, 1.0f, 1.0f, 1.0f);
        this.b.b().a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        this.b.a(\u2603, \u2603);
        bfl.a(true);
        bfl.k();
        bfl.d();
    }
    
    @Override
    public boolean b() {
        return false;
    }
    
    static {
        a = new jy("textures/entity/enderman/enderman_eyes.png");
    }
}
