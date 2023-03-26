// 
// Decompiled by Procyon v0.5.36
// 

public class biz extends biv<ur>
{
    private static final jy a;
    
    public biz(final biu \u2603) {
        super(\u2603);
    }
    
    @Override
    public void a(final ur \u2603, final double \u2603, final double \u2603, final double \u2603, final float \u2603, final float \u2603) {
        bfl.E();
        bfl.b((float)\u2603, (float)\u2603, (float)\u2603);
        bfl.B();
        bfl.a(0.5f, 0.5f, 0.5f);
        this.c(\u2603);
        final bfx a = bfx.a();
        final bfd c = a.c();
        final int n = 1;
        final int n2 = 2;
        final float n3 = 0.0625f;
        final float n4 = 0.125f;
        final float n5 = 0.125f;
        final float n6 = 0.1875f;
        final float n7 = 1.0f;
        final float n8 = 0.5f;
        final float n9 = 0.5f;
        bfl.b(180.0f - this.b.e, 0.0f, 1.0f, 0.0f);
        bfl.b(-this.b.f, 1.0f, 0.0f, 0.0f);
        c.a(7, bms.j);
        c.b(-0.5, -0.5, 0.0).a(0.0625, 0.1875).c(0.0f, 1.0f, 0.0f).d();
        c.b(0.5, -0.5, 0.0).a(0.125, 0.1875).c(0.0f, 1.0f, 0.0f).d();
        c.b(0.5, 0.5, 0.0).a(0.125, 0.125).c(0.0f, 1.0f, 0.0f).d();
        c.b(-0.5, 0.5, 0.0).a(0.0625, 0.125).c(0.0f, 1.0f, 0.0f).d();
        a.b();
        bfl.C();
        bfl.F();
        if (\u2603.b != null) {
            final float l = \u2603.b.l(\u2603);
            final float a2 = ns.a(ns.c(l) * 3.1415927f);
            aui aui = new aui(-0.36, 0.03, 0.35);
            aui = aui.a(-(\u2603.b.B + (\u2603.b.z - \u2603.b.B) * \u2603) * 3.1415927f / 180.0f);
            aui = aui.b(-(\u2603.b.A + (\u2603.b.y - \u2603.b.A) * \u2603) * 3.1415927f / 180.0f);
            aui = aui.b(a2 * 0.5f);
            aui = aui.a(-a2 * 0.7f);
            double n10 = \u2603.b.p + (\u2603.b.s - \u2603.b.p) * \u2603 + aui.a;
            double n11 = \u2603.b.q + (\u2603.b.t - \u2603.b.q) * \u2603 + aui.b;
            double n12 = \u2603.b.r + (\u2603.b.u - \u2603.b.r) * \u2603 + aui.c;
            double n13 = \u2603.b.aS();
            if ((this.b.g != null && this.b.g.aA > 0) || \u2603.b != ave.A().h) {
                final float n14 = (\u2603.b.aJ + (\u2603.b.aI - \u2603.b.aJ) * \u2603) * 3.1415927f / 180.0f;
                final double n15 = ns.a(n14);
                final double n16 = ns.b(n14);
                final double n17 = 0.35;
                final double n18 = 0.8;
                n10 = \u2603.b.p + (\u2603.b.s - \u2603.b.p) * \u2603 - n16 * 0.35 - n15 * 0.8;
                n11 = \u2603.b.q + n13 + (\u2603.b.t - \u2603.b.q) * \u2603 - 0.45;
                n12 = \u2603.b.r + (\u2603.b.u - \u2603.b.r) * \u2603 - n15 * 0.35 + n16 * 0.8;
                n13 = (\u2603.b.av() ? -0.1875 : 0.0);
            }
            final double n19 = \u2603.p + (\u2603.s - \u2603.p) * \u2603;
            final double n20 = \u2603.q + (\u2603.t - \u2603.q) * \u2603 + 0.25;
            final double n21 = \u2603.r + (\u2603.u - \u2603.r) * \u2603;
            final double n22 = (float)(n10 - n19);
            final double n23 = (float)(n11 - n20) + n13;
            final double n24 = (float)(n12 - n21);
            bfl.x();
            bfl.f();
            c.a(3, bms.f);
            final int n25 = 16;
            for (int i = 0; i <= 16; ++i) {
                final float n26 = i / 16.0f;
                c.b(\u2603 + n22 * n26, \u2603 + n23 * (n26 * n26 + n26) * 0.5 + 0.25, \u2603 + n24 * n26).b(0, 0, 0, 255).d();
            }
            a.b();
            bfl.e();
            bfl.w();
            super.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        }
    }
    
    @Override
    protected jy a(final ur \u2603) {
        return biz.a;
    }
    
    static {
        a = new jy("textures/particle/particles.png");
    }
}
