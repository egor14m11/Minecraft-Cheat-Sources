// 
// Decompiled by Procyon v0.5.36
// 

public class bjr extends biv<uq>
{
    private static final jy a;
    
    public bjr(final biu \u2603) {
        super(\u2603);
    }
    
    @Override
    public void a(final uq \u2603, final double \u2603, final double \u2603, final double \u2603, final float \u2603, final float \u2603) {
        bfl.E();
        bfl.b(\u2603, \u2603, \u2603);
        bfl.b(180.0f - \u2603, 0.0f, 1.0f, 0.0f);
        bfl.B();
        this.c(\u2603);
        final uq.a c = \u2603.c;
        final float n = 0.0625f;
        bfl.a(n, n, n);
        this.a(\u2603, c.C, c.D, c.E, c.F);
        bfl.C();
        bfl.F();
        super.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
    }
    
    @Override
    protected jy a(final uq \u2603) {
        return bjr.a;
    }
    
    private void a(final uq \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603) {
        final float n = -\u2603 / 2.0f;
        final float n2 = -\u2603 / 2.0f;
        final float n3 = 0.5f;
        final float n4 = 0.75f;
        final float n5 = 0.8125f;
        final float n6 = 0.0f;
        final float n7 = 0.0625f;
        final float n8 = 0.75f;
        final float n9 = 0.8125f;
        final float n10 = 0.001953125f;
        final float n11 = 0.001953125f;
        final float n12 = 0.7519531f;
        final float n13 = 0.7519531f;
        final float n14 = 0.0f;
        final float n15 = 0.0625f;
        for (int i = 0; i < \u2603 / 16; ++i) {
            for (int j = 0; j < \u2603 / 16; ++j) {
                final float n16 = n + (i + 1) * 16;
                final float n17 = n + i * 16;
                final float n18 = n2 + (j + 1) * 16;
                final float n19 = n2 + j * 16;
                this.a(\u2603, (n16 + n17) / 2.0f, (n18 + n19) / 2.0f);
                final float n20 = (\u2603 + \u2603 - i * 16) / 256.0f;
                final float n21 = (\u2603 + \u2603 - (i + 1) * 16) / 256.0f;
                final float n22 = (\u2603 + \u2603 - j * 16) / 256.0f;
                final float n23 = (\u2603 + \u2603 - (j + 1) * 16) / 256.0f;
                final bfx a = bfx.a();
                final bfd c = a.c();
                c.a(7, bms.j);
                c.b(n16, n19, (double)(-n3)).a(n21, n22).c(0.0f, 0.0f, -1.0f).d();
                c.b(n17, n19, (double)(-n3)).a(n20, n22).c(0.0f, 0.0f, -1.0f).d();
                c.b(n17, n18, (double)(-n3)).a(n20, n23).c(0.0f, 0.0f, -1.0f).d();
                c.b(n16, n18, (double)(-n3)).a(n21, n23).c(0.0f, 0.0f, -1.0f).d();
                c.b(n16, n18, (double)n3).a(n4, n6).c(0.0f, 0.0f, 1.0f).d();
                c.b(n17, n18, (double)n3).a(n5, n6).c(0.0f, 0.0f, 1.0f).d();
                c.b(n17, n19, (double)n3).a(n5, n7).c(0.0f, 0.0f, 1.0f).d();
                c.b(n16, n19, (double)n3).a(n4, n7).c(0.0f, 0.0f, 1.0f).d();
                c.b(n16, n18, (double)(-n3)).a(n8, n10).c(0.0f, 1.0f, 0.0f).d();
                c.b(n17, n18, (double)(-n3)).a(n9, n10).c(0.0f, 1.0f, 0.0f).d();
                c.b(n17, n18, (double)n3).a(n9, n11).c(0.0f, 1.0f, 0.0f).d();
                c.b(n16, n18, (double)n3).a(n8, n11).c(0.0f, 1.0f, 0.0f).d();
                c.b(n16, n19, (double)n3).a(n8, n10).c(0.0f, -1.0f, 0.0f).d();
                c.b(n17, n19, (double)n3).a(n9, n10).c(0.0f, -1.0f, 0.0f).d();
                c.b(n17, n19, (double)(-n3)).a(n9, n11).c(0.0f, -1.0f, 0.0f).d();
                c.b(n16, n19, (double)(-n3)).a(n8, n11).c(0.0f, -1.0f, 0.0f).d();
                c.b(n16, n18, (double)n3).a(n13, n14).c(-1.0f, 0.0f, 0.0f).d();
                c.b(n16, n19, (double)n3).a(n13, n15).c(-1.0f, 0.0f, 0.0f).d();
                c.b(n16, n19, (double)(-n3)).a(n12, n15).c(-1.0f, 0.0f, 0.0f).d();
                c.b(n16, n18, (double)(-n3)).a(n12, n14).c(-1.0f, 0.0f, 0.0f).d();
                c.b(n17, n18, (double)(-n3)).a(n13, n14).c(1.0f, 0.0f, 0.0f).d();
                c.b(n17, n19, (double)(-n3)).a(n13, n15).c(1.0f, 0.0f, 0.0f).d();
                c.b(n17, n19, (double)n3).a(n12, n15).c(1.0f, 0.0f, 0.0f).d();
                c.b(n17, n18, (double)n3).a(n12, n14).c(1.0f, 0.0f, 0.0f).d();
                a.b();
            }
        }
    }
    
    private void a(final uq \u2603, final float \u2603, final float \u2603) {
        int \u26032 = ns.c(\u2603.s);
        final int c = ns.c(\u2603.t + \u2603 / 16.0f);
        int \u26033 = ns.c(\u2603.u);
        final cq b = \u2603.b;
        if (b == cq.c) {
            \u26032 = ns.c(\u2603.s + \u2603 / 16.0f);
        }
        if (b == cq.e) {
            \u26033 = ns.c(\u2603.u - \u2603 / 16.0f);
        }
        if (b == cq.d) {
            \u26032 = ns.c(\u2603.s - \u2603 / 16.0f);
        }
        if (b == cq.f) {
            \u26033 = ns.c(\u2603.u + \u2603 / 16.0f);
        }
        final int b2 = this.b.b.b(new cj(\u26032, c, \u26033), 0);
        final int n = b2 % 65536;
        final int n2 = b2 / 65536;
        bqs.a(bqs.r, (float)n, (float)n2);
        bfl.c(1.0f, 1.0f, 1.0f);
    }
    
    static {
        a = new jy("textures/painting/paintings_kristoffer_zetterstrand.png");
    }
}
