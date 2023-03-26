// 
// Decompiled by Procyon v0.5.36
// 

public class biw extends biv<pp>
{
    private static final jy a;
    
    public biw(final biu \u2603) {
        super(\u2603);
        this.c = 0.15f;
        this.d = 0.75f;
    }
    
    @Override
    public void a(final pp \u2603, final double \u2603, final double \u2603, final double \u2603, final float \u2603, final float \u2603) {
        bfl.E();
        bfl.b((float)\u2603, (float)\u2603, (float)\u2603);
        this.c(\u2603);
        final int l = \u2603.l();
        final float n = (l % 4 * 16 + 0) / 64.0f;
        final float n2 = (l % 4 * 16 + 16) / 64.0f;
        final float n3 = (l / 4 * 16 + 0) / 64.0f;
        final float n4 = (l / 4 * 16 + 16) / 64.0f;
        final float n5 = 1.0f;
        final float n6 = 0.5f;
        final float n7 = 0.25f;
        final int b = \u2603.b(\u2603);
        final int n8 = b % 65536;
        int n9 = b / 65536;
        bqs.a(bqs.r, n8 / 1.0f, n9 / 1.0f);
        bfl.c(1.0f, 1.0f, 1.0f, 1.0f);
        final float n10 = 255.0f;
        final float n11 = (\u2603.a + \u2603) / 2.0f;
        n9 = (int)((ns.a(n11 + 0.0f) + 1.0f) * 0.5f * 255.0f);
        final int n12 = 255;
        final int n13 = (int)((ns.a(n11 + 4.1887903f) + 1.0f) * 0.1f * 255.0f);
        bfl.b(180.0f - this.b.e, 0.0f, 1.0f, 0.0f);
        bfl.b(-this.b.f, 1.0f, 0.0f, 0.0f);
        final float n14 = 0.3f;
        bfl.a(0.3f, 0.3f, 0.3f);
        final bfx a = bfx.a();
        final bfd c = a.c();
        c.a(7, bms.l);
        c.b(0.0f - n6, 0.0f - n7, 0.0).a(n, n4).b(n9, 255, n13, 128).c(0.0f, 1.0f, 0.0f).d();
        c.b(n5 - n6, 0.0f - n7, 0.0).a(n2, n4).b(n9, 255, n13, 128).c(0.0f, 1.0f, 0.0f).d();
        c.b(n5 - n6, 1.0f - n7, 0.0).a(n2, n3).b(n9, 255, n13, 128).c(0.0f, 1.0f, 0.0f).d();
        c.b(0.0f - n6, 1.0f - n7, 0.0).a(n, n3).b(n9, 255, n13, 128).c(0.0f, 1.0f, 0.0f).d();
        a.b();
        bfl.k();
        bfl.C();
        bfl.F();
        super.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
    }
    
    @Override
    protected jy a(final pp \u2603) {
        return biw.a;
    }
    
    static {
        a = new jy("textures/entity/experience_orb.png");
    }
}
