// 
// Decompiled by Procyon v0.5.36
// 

public class bkv implements blb<ug>
{
    private static final jy a;
    private final bir b;
    
    public bkv(final bir \u2603) {
        this.b = \u2603;
    }
    
    @Override
    public void a(final ug \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603) {
        this.b.a(bkv.a);
        bfl.l();
        bfl.c();
        bfl.b(1, 1);
        bfl.f();
        bfl.c(514);
        final int n = 61680;
        final int n2 = n % 65536;
        final int n3 = n / 65536;
        bqs.a(bqs.r, n2 / 1.0f, n3 / 1.0f);
        bfl.e();
        bfl.c(1.0f, 1.0f, 1.0f, 1.0f);
        this.b.b().a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        this.b.a(\u2603, \u2603);
        bfl.k();
        bfl.d();
        bfl.c(515);
    }
    
    @Override
    public boolean b() {
        return false;
    }
    
    static {
        a = new jy("textures/entity/enderdragon/dragon_eyes.png");
    }
}
