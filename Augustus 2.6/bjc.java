import org.lwjgl.opengl.GL11;

// 
// Decompiled by Procyon v0.5.36
// 

public class bjc extends bjo<vt>
{
    private static final jy e;
    private static final jy j;
    private static final jy k;
    int a;
    
    public bjc(final biu \u2603) {
        super(\u2603, new bbg(), 0.5f);
        this.a = ((bbg)this.f).a();
    }
    
    @Override
    public boolean a(final vt \u2603, final bia \u2603, final double \u2603, final double \u2603, final double \u2603) {
        if (super.a(\u2603, \u2603, \u2603, \u2603, \u2603)) {
            return true;
        }
        if (\u2603.cp()) {
            final pr cq = \u2603.cq();
            if (cq != null) {
                final aui a = this.a(cq, cq.K * 0.5, 1.0f);
                final aui a2 = this.a(\u2603, (double)\u2603.aS(), 1.0f);
                if (\u2603.a(aug.a(a2.a, a2.b, a2.c, a.a, a.b, a.c))) {
                    return true;
                }
            }
        }
        return false;
    }
    
    private aui a(final pr \u2603, final double \u2603, final float \u2603) {
        final double \u26032 = \u2603.P + (\u2603.s - \u2603.P) * \u2603;
        final double \u26033 = \u2603 + \u2603.Q + (\u2603.t - \u2603.Q) * \u2603;
        final double \u26034 = \u2603.R + (\u2603.u - \u2603.R) * \u2603;
        return new aui(\u26032, \u26033, \u26034);
    }
    
    @Override
    public void a(final vt \u2603, final double \u2603, final double \u2603, final double \u2603, final float \u2603, final float \u2603) {
        if (this.a != ((bbg)this.f).a()) {
            this.f = new bbg();
            this.a = ((bbg)this.f).a();
        }
        super.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        final pr cq = \u2603.cq();
        if (cq != null) {
            final float q = \u2603.q(\u2603);
            final bfx a = bfx.a();
            final bfd c = a.c();
            this.a(bjc.k);
            GL11.glTexParameterf(3553, 10242, 10497.0f);
            GL11.glTexParameterf(3553, 10243, 10497.0f);
            bfl.f();
            bfl.p();
            bfl.k();
            bfl.a(true);
            final float n = 240.0f;
            bqs.a(bqs.r, n, n);
            bfl.a(770, 1, 1, 0);
            final float n2 = \u2603.o.K() + \u2603;
            final float n3 = n2 * 0.5f % 1.0f;
            final float as = \u2603.aS();
            bfl.E();
            bfl.b((float)\u2603, (float)\u2603 + as, (float)\u2603);
            final aui a2 = this.a(cq, cq.K * 0.5, \u2603);
            final aui a3 = this.a(\u2603, (double)as, \u2603);
            aui aui = a2.d(a3);
            final double n4 = aui.b() + 1.0;
            aui = aui.a();
            final float n5 = (float)Math.acos(aui.b);
            final float n6 = (float)Math.atan2(aui.c, aui.a);
            bfl.b((1.5707964f + -n6) * 57.295776f, 0.0f, 1.0f, 0.0f);
            bfl.b(n5 * 57.295776f, 1.0f, 0.0f, 0.0f);
            final int n7 = 1;
            final double n8 = n2 * 0.05 * (1.0 - (n7 & 0x1) * 2.5);
            c.a(7, bms.i);
            final float n9 = q * q;
            final int n10 = 64 + (int)(n9 * 240.0f);
            final int n11 = 32 + (int)(n9 * 192.0f);
            final int n12 = 128 - (int)(n9 * 64.0f);
            final double n13 = n7 * 0.2;
            final double n14 = n13 * 1.41;
            final double \u26032 = 0.0 + Math.cos(n8 + 2.356194490192345) * n14;
            final double \u26033 = 0.0 + Math.sin(n8 + 2.356194490192345) * n14;
            final double \u26034 = 0.0 + Math.cos(n8 + 0.7853981633974483) * n14;
            final double \u26035 = 0.0 + Math.sin(n8 + 0.7853981633974483) * n14;
            final double \u26036 = 0.0 + Math.cos(n8 + 3.9269908169872414) * n14;
            final double \u26037 = 0.0 + Math.sin(n8 + 3.9269908169872414) * n14;
            final double \u26038 = 0.0 + Math.cos(n8 + 5.497787143782138) * n14;
            final double \u26039 = 0.0 + Math.sin(n8 + 5.497787143782138) * n14;
            final double n15 = 0.0 + Math.cos(n8 + 3.141592653589793) * n13;
            final double n16 = 0.0 + Math.sin(n8 + 3.141592653589793) * n13;
            final double n17 = 0.0 + Math.cos(n8 + 0.0) * n13;
            final double n18 = 0.0 + Math.sin(n8 + 0.0) * n13;
            final double n19 = 0.0 + Math.cos(n8 + 1.5707963267948966) * n13;
            final double n20 = 0.0 + Math.sin(n8 + 1.5707963267948966) * n13;
            final double n21 = 0.0 + Math.cos(n8 + 4.71238898038469) * n13;
            final double n22 = 0.0 + Math.sin(n8 + 4.71238898038469) * n13;
            final double n23 = n4;
            final double n24 = 0.0;
            final double n25 = 0.4999;
            final double n26 = -1.0f + n3;
            final double n27 = n4 * (0.5 / n13) + n26;
            c.b(n15, n23, n16).a(0.4999, n27).b(n10, n11, n12, 255).d();
            c.b(n15, 0.0, n16).a(0.4999, n26).b(n10, n11, n12, 255).d();
            c.b(n17, 0.0, n18).a(0.0, n26).b(n10, n11, n12, 255).d();
            c.b(n17, n23, n18).a(0.0, n27).b(n10, n11, n12, 255).d();
            c.b(n19, n23, n20).a(0.4999, n27).b(n10, n11, n12, 255).d();
            c.b(n19, 0.0, n20).a(0.4999, n26).b(n10, n11, n12, 255).d();
            c.b(n21, 0.0, n22).a(0.0, n26).b(n10, n11, n12, 255).d();
            c.b(n21, n23, n22).a(0.0, n27).b(n10, n11, n12, 255).d();
            double n28 = 0.0;
            if (\u2603.W % 2 == 0) {
                n28 = 0.5;
            }
            c.b(\u26032, n23, \u26033).a(0.5, n28 + 0.5).b(n10, n11, n12, 255).d();
            c.b(\u26034, n23, \u26035).a(1.0, n28 + 0.5).b(n10, n11, n12, 255).d();
            c.b(\u26038, n23, \u26039).a(1.0, n28).b(n10, n11, n12, 255).d();
            c.b(\u26036, n23, \u26037).a(0.5, n28).b(n10, n11, n12, 255).d();
            a.b();
            bfl.F();
        }
    }
    
    @Override
    protected void a(final vt \u2603, final float \u2603) {
        if (\u2603.cn()) {
            bfl.a(2.35f, 2.35f, 2.35f);
        }
    }
    
    @Override
    protected jy a(final vt \u2603) {
        return \u2603.cn() ? bjc.j : bjc.e;
    }
    
    static {
        e = new jy("textures/entity/guardian.png");
        j = new jy("textures/entity/guardian_elder.png");
        k = new jy("textures/entity/guardian_beam.png");
    }
}
