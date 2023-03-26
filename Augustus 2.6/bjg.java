import org.lwjgl.opengl.GL11;

// 
// Decompiled by Procyon v0.5.36
// 

public class bjg extends biv<uo>
{
    private static final jy a;
    private final ave e;
    private final bov f;
    private final bov g;
    private bjh h;
    
    public bjg(final biu \u2603, final bjh \u2603) {
        super(\u2603);
        this.e = ave.A();
        this.f = new bov("item_frame", "normal");
        this.g = new bov("item_frame", "map");
        this.h = \u2603;
    }
    
    @Override
    public void a(final uo \u2603, final double \u2603, final double \u2603, final double \u2603, final float \u2603, final float \u2603) {
        bfl.E();
        final cj n = \u2603.n();
        final double n2 = n.n() - \u2603.s + \u2603;
        final double n3 = n.o() - \u2603.t + \u2603;
        final double n4 = n.p() - \u2603.u + \u2603;
        bfl.b(n2 + 0.5, n3 + 0.5, n4 + 0.5);
        bfl.b(180.0f - \u2603.y, 0.0f, 1.0f, 0.0f);
        this.b.a.a(bmh.g);
        final bgd ae = this.e.ae();
        final bou b = ae.a().b();
        boq \u26032;
        if (\u2603.o() != null && \u2603.o().b() == zy.bd) {
            \u26032 = b.a(this.g);
        }
        else {
            \u26032 = b.a(this.f);
        }
        bfl.E();
        bfl.b(-0.5f, -0.5f, -0.5f);
        ae.b().a(\u26032, 1.0f, 1.0f, 1.0f, 1.0f);
        bfl.F();
        bfl.b(0.0f, 0.0f, 0.4375f);
        this.b(\u2603);
        bfl.F();
        this.a(\u2603, \u2603 + \u2603.b.g() * 0.3f, \u2603 - 0.25, \u2603 + \u2603.b.i() * 0.3f);
    }
    
    @Override
    protected jy a(final uo \u2603) {
        return null;
    }
    
    private void b(final uo \u2603) {
        final zx o = \u2603.o();
        if (o == null) {
            return;
        }
        final uz uz = new uz(\u2603.o, 0.0, 0.0, 0.0, o);
        final zw b = uz.l().b();
        uz.l().b = 1;
        uz.a = 0.0f;
        bfl.E();
        bfl.f();
        int p = \u2603.p();
        if (b == zy.bd) {
            p = p % 4 * 2;
        }
        bfl.b(p * 360.0f / 8.0f, 0.0f, 0.0f, 1.0f);
        if (b == zy.bd) {
            this.b.a.a(bjg.a);
            bfl.b(180.0f, 0.0f, 0.0f, 1.0f);
            final float n = 0.0078125f;
            bfl.a(n, n, n);
            bfl.b(-64.0f, -64.0f, 0.0f);
            final atg a = zy.bd.a(uz.l(), \u2603.o);
            bfl.b(0.0f, 0.0f, -1.0f);
            if (a != null) {
                this.e.o.k().a(a, true);
            }
        }
        else {
            bmi a2 = null;
            if (b == zy.aQ) {
                a2 = this.e.T().a(bmp.l);
                this.e.P().a(bmh.g);
                if (a2 instanceof bmp) {
                    final bmp bmp = (bmp)a2;
                    final double j = bmp.j;
                    final double k = bmp.k;
                    bmp.j = 0.0;
                    bmp.k = 0.0;
                    bmp.a(\u2603.o, \u2603.s, \u2603.u, ns.g((float)(180 + \u2603.b.b() * 90)), false, true);
                    bmp.j = j;
                    bmp.k = k;
                }
                else {
                    a2 = null;
                }
            }
            bfl.a(0.5f, 0.5f, 0.5f);
            if (!this.h.a(uz.l()) || b instanceof aat) {
                bfl.b(180.0f, 0.0f, 1.0f, 0.0f);
            }
            bfl.a();
            avc.b();
            this.h.a(uz.l(), bgr.b.g);
            avc.a();
            bfl.b();
            if (a2 != null && a2.k() > 0) {
                a2.j();
            }
        }
        bfl.e();
        bfl.F();
    }
    
    @Override
    protected void a(final uo \u2603, final double \u2603, final double \u2603, final double \u2603) {
        if (ave.v() && \u2603.o() != null && \u2603.o().s() && this.b.d == \u2603) {
            final float n = 1.6f;
            final float \u26032 = 0.016666668f * n;
            final double h = \u2603.h(this.b.c);
            final float n2 = \u2603.av() ? 32.0f : 64.0f;
            if (h < n2 * n2) {
                final String q = \u2603.o().q();
                if (\u2603.av()) {
                    final avn c = this.c();
                    bfl.E();
                    bfl.b((float)\u2603 + 0.0f, (float)\u2603 + \u2603.K + 0.5f, (float)\u2603);
                    GL11.glNormal3f(0.0f, 1.0f, 0.0f);
                    bfl.b(-this.b.e, 0.0f, 1.0f, 0.0f);
                    bfl.b(this.b.f, 1.0f, 0.0f, 0.0f);
                    bfl.a(-\u26032, -\u26032, \u26032);
                    bfl.f();
                    bfl.b(0.0f, 0.25f / \u26032, 0.0f);
                    bfl.a(false);
                    bfl.l();
                    bfl.b(770, 771);
                    final bfx a = bfx.a();
                    final bfd c2 = a.c();
                    final int n3 = c.a(q) / 2;
                    bfl.x();
                    c2.a(7, bms.f);
                    c2.b(-n3 - 1, -1.0, 0.0).a(0.0f, 0.0f, 0.0f, 0.25f).d();
                    c2.b(-n3 - 1, 8.0, 0.0).a(0.0f, 0.0f, 0.0f, 0.25f).d();
                    c2.b(n3 + 1, 8.0, 0.0).a(0.0f, 0.0f, 0.0f, 0.25f).d();
                    c2.b(n3 + 1, -1.0, 0.0).a(0.0f, 0.0f, 0.0f, 0.25f).d();
                    a.b();
                    bfl.w();
                    bfl.a(true);
                    c.a(q, -c.a(q) / 2, 0, 553648127);
                    bfl.e();
                    bfl.k();
                    bfl.c(1.0f, 1.0f, 1.0f, 1.0f);
                    bfl.F();
                }
                else {
                    this.a(\u2603, q, \u2603, \u2603, \u2603, 64);
                }
            }
        }
    }
    
    static {
        a = new jy("textures/map/map_background.png");
    }
}
