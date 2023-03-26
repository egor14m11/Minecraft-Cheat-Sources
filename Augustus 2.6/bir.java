// 
// Decompiled by Procyon v0.5.36
// 

public class bir extends bjo<ug>
{
    private static final jy e;
    private static final jy j;
    private static final jy k;
    protected bco a;
    
    public bir(final biu \u2603) {
        super(\u2603, new bco(0.0f), 0.5f);
        this.a = (bco)this.f;
        ((bjl<pr>)this).a(new bkv(this));
        ((bjl<pr>)this).a(new bku());
    }
    
    @Override
    protected void a(final ug \u2603, final float \u2603, final float \u2603, final float \u2603) {
        final float n = (float)\u2603.b(7, \u2603)[0];
        final float n2 = (float)(\u2603.b(5, \u2603)[1] - \u2603.b(10, \u2603)[1]);
        bfl.b(-n, 0.0f, 1.0f, 0.0f);
        bfl.b(n2 * 10.0f, 1.0f, 0.0f, 0.0f);
        bfl.b(0.0f, 0.0f, 1.0f);
        if (\u2603.ax > 0) {
            float c = (\u2603.ax + \u2603 - 1.0f) / 20.0f * 1.6f;
            c = ns.c(c);
            if (c > 1.0f) {
                c = 1.0f;
            }
            bfl.b(c * this.b(\u2603), 0.0f, 0.0f, 1.0f);
        }
    }
    
    @Override
    protected void a(final ug \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603) {
        if (\u2603.by > 0) {
            final float \u26032 = \u2603.by / 200.0f;
            bfl.c(515);
            bfl.d();
            bfl.a(516, \u26032);
            this.a(bir.j);
            this.f.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
            bfl.a(516, 0.1f);
            bfl.c(514);
        }
        this.c(\u2603);
        this.f.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        if (\u2603.au > 0) {
            bfl.c(514);
            bfl.x();
            bfl.l();
            bfl.b(770, 771);
            bfl.c(1.0f, 0.0f, 0.0f, 0.5f);
            this.f.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
            bfl.w();
            bfl.k();
            bfl.c(515);
        }
    }
    
    @Override
    public void a(final ug \u2603, final double \u2603, final double \u2603, final double \u2603, final float \u2603, final float \u2603) {
        bfc.a(\u2603, false);
        super.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        if (\u2603.bz != null) {
            this.a(\u2603, \u2603, \u2603, \u2603, \u2603);
        }
    }
    
    protected void a(final ug \u2603, final double \u2603, final double \u2603, final double \u2603, final float \u2603) {
        final float n = \u2603.bz.a + \u2603;
        float n2 = ns.a(n * 0.2f) / 2.0f + 0.5f;
        n2 = (n2 * n2 + n2) * 0.2f;
        final float n3 = (float)(\u2603.bz.s - \u2603.s - (\u2603.p - \u2603.s) * (1.0f - \u2603));
        final float n4 = (float)(n2 + \u2603.bz.t - 1.0 - \u2603.t - (\u2603.q - \u2603.t) * (1.0f - \u2603));
        final float n5 = (float)(\u2603.bz.u - \u2603.u - (\u2603.r - \u2603.u) * (1.0f - \u2603));
        final float c = ns.c(n3 * n3 + n5 * n5);
        final float c2 = ns.c(n3 * n3 + n4 * n4 + n5 * n5);
        bfl.E();
        bfl.b((float)\u2603, (float)\u2603 + 2.0f, (float)\u2603);
        bfl.b((float)(-Math.atan2(n5, n3)) * 180.0f / 3.1415927f - 90.0f, 0.0f, 1.0f, 0.0f);
        bfl.b((float)(-Math.atan2(c, n4)) * 180.0f / 3.1415927f - 90.0f, 1.0f, 0.0f, 0.0f);
        final bfx a = bfx.a();
        final bfd c3 = a.c();
        avc.a();
        bfl.p();
        this.a(bir.e);
        bfl.j(7425);
        final float n6 = 0.0f - (\u2603.W + \u2603) * 0.01f;
        final float n7 = ns.c(n3 * n3 + n4 * n4 + n5 * n5) / 32.0f - (\u2603.W + \u2603) * 0.01f;
        c3.a(5, bms.i);
        final int n8 = 8;
        for (int i = 0; i <= 8; ++i) {
            final float n9 = ns.a(i % 8 * 3.1415927f * 2.0f / 8.0f) * 0.75f;
            final float n10 = ns.b(i % 8 * 3.1415927f * 2.0f / 8.0f) * 0.75f;
            final float n11 = i % 8 * 1.0f / 8.0f;
            c3.b(n9 * 0.2f, n10 * 0.2f, 0.0).a(n11, n7).b(0, 0, 0, 255).d();
            c3.b(n9, n10, (double)c2).a(n11, n6).b(255, 255, 255, 255).d();
        }
        a.b();
        bfl.o();
        bfl.j(7424);
        avc.b();
        bfl.F();
    }
    
    @Override
    protected jy a(final ug \u2603) {
        return bir.k;
    }
    
    static {
        e = new jy("textures/entity/endercrystal/endercrystal_beam.png");
        j = new jy("textures/entity/enderdragon/dragon_exploding.png");
        k = new jy("textures/entity/enderdragon/dragon.png");
    }
}
