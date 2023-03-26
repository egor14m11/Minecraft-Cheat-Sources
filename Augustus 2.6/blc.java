// 
// Decompiled by Procyon v0.5.36
// 

public class blc implements blb<tv>
{
    private static final jy a;
    private final bjv b;
    private final bbv c;
    
    public blc(final bjv \u2603) {
        this.c = new bbv();
        this.b = \u2603;
    }
    
    @Override
    public void a(final tv \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603) {
        if (\u2603.cm() || \u2603.ax()) {
            return;
        }
        this.b.a(blc.a);
        if (\u2603.l_() && "jeb_".equals(\u2603.aM())) {
            final int n = 25;
            final int n2 = \u2603.W / 25 + \u2603.F();
            final int length = zd.values().length;
            final int \u26032 = n2 % length;
            final int \u26033 = (n2 + 1) % length;
            final float n3 = (\u2603.W % 25 + \u2603) / 25.0f;
            final float[] a = tv.a(zd.b(\u26032));
            final float[] a2 = tv.a(zd.b(\u26033));
            bfl.c(a[0] * (1.0f - n3) + a2[0] * n3, a[1] * (1.0f - n3) + a2[1] * n3, a[2] * (1.0f - n3) + a2[2] * n3);
        }
        else {
            final float[] a3 = tv.a(\u2603.cl());
            bfl.c(a3[0], a3[1], a3[2]);
        }
        this.c.a(this.b.b());
        this.c.a(\u2603, \u2603, \u2603, \u2603);
        this.c.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
    }
    
    @Override
    public boolean b() {
        return true;
    }
    
    static {
        a = new jy("textures/entity/sheep/sheep_fur.png");
    }
}
