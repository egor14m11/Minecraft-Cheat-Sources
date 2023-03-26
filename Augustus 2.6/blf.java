// 
// Decompiled by Procyon v0.5.36
// 

public class blf implements blb<wc>
{
    private static final jy a;
    private final bka b;
    
    public blf(final bka \u2603) {
        this.b = \u2603;
    }
    
    @Override
    public void a(final wc \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603) {
        this.b.a(blf.a);
        bfl.l();
        bfl.c();
        bfl.b(1, 1);
        if (\u2603.ax()) {
            bfl.a(false);
        }
        else {
            bfl.a(true);
        }
        int b = 61680;
        int n = b % 65536;
        int n2 = b / 65536;
        bqs.a(bqs.r, n / 1.0f, n2 / 1.0f);
        bfl.c(1.0f, 1.0f, 1.0f, 1.0f);
        this.b.b().a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        b = \u2603.b(\u2603);
        n = b % 65536;
        n2 = b / 65536;
        bqs.a(bqs.r, n / 1.0f, n2 / 1.0f);
        this.b.a(\u2603, \u2603);
        bfl.k();
        bfl.d();
    }
    
    @Override
    public boolean b() {
        return false;
    }
    
    static {
        a = new jy("textures/entity/spider_eyes.png");
    }
}
