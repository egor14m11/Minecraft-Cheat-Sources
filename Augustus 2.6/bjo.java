// 
// Decompiled by Procyon v0.5.36
// 

public abstract class bjo<T extends ps> extends bjl<T>
{
    public bjo(final biu \u2603, final bbo \u2603, final float \u2603) {
        super(\u2603, \u2603, \u2603);
    }
    
    @Override
    protected boolean b(final T \u2603) {
        return super.a(\u2603) && (\u2603.aO() || (\u2603.l_() && \u2603 == this.b.d));
    }
    
    @Override
    public boolean a(final T \u2603, final bia \u2603, final double \u2603, final double \u2603, final double \u2603) {
        if (super.a(\u2603, \u2603, \u2603, \u2603, \u2603)) {
            return true;
        }
        if (\u2603.cc() && \u2603.cd() != null) {
            final pk cd = \u2603.cd();
            return \u2603.a(cd.aR());
        }
        return false;
    }
    
    @Override
    public void a(final T \u2603, final double \u2603, final double \u2603, final double \u2603, final float \u2603, final float \u2603) {
        super.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        this.b(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
    }
    
    public void a(final T \u2603, final float \u2603) {
        final int b = \u2603.b(\u2603);
        final int n = b % 65536;
        final int n2 = b / 65536;
        bqs.a(bqs.r, n / 1.0f, n2 / 1.0f);
    }
    
    private double a(final double \u2603, final double \u2603, final double \u2603) {
        return \u2603 + (\u2603 - \u2603) * \u2603;
    }
    
    protected void b(final T \u2603, double \u2603, double \u2603, double \u2603, final float \u2603, final float \u2603) {
        final pk cd = \u2603.cd();
        if (cd != null) {
            \u2603 -= (1.6 - \u2603.K) * 0.5;
            final bfx a = bfx.a();
            final bfd c = a.c();
            final double n = this.a(cd.A, cd.y, (double)(\u2603 * 0.5f)) * 0.01745329238474369;
            final double n2 = this.a(cd.B, cd.z, (double)(\u2603 * 0.5f)) * 0.01745329238474369;
            double cos = Math.cos(n);
            double sin = Math.sin(n);
            double sin2 = Math.sin(n2);
            if (cd instanceof un) {
                cos = 0.0;
                sin = 0.0;
                sin2 = -1.0;
            }
            final double cos2 = Math.cos(n2);
            final double n3 = this.a(cd.p, cd.s, \u2603) - cos * 0.7 - sin * 0.5 * cos2;
            final double n4 = this.a(cd.q + cd.aS() * 0.7, cd.t + cd.aS() * 0.7, \u2603) - sin2 * 0.5 - 0.25;
            final double n5 = this.a(cd.r, cd.u, \u2603) - sin * 0.7 + cos * 0.5 * cos2;
            final double n6 = this.a(\u2603.aJ, \u2603.aI, (double)\u2603) * 0.01745329238474369 + 1.5707963267948966;
            cos = Math.cos(n6) * \u2603.J * 0.4;
            sin = Math.sin(n6) * \u2603.J * 0.4;
            final double n7 = this.a(\u2603.p, \u2603.s, \u2603) + cos;
            final double a2 = this.a(\u2603.q, \u2603.t, \u2603);
            final double n8 = this.a(\u2603.r, \u2603.u, \u2603) + sin;
            \u2603 += cos;
            \u2603 += sin;
            final double n9 = (float)(n3 - n7);
            final double n10 = (float)(n4 - a2);
            final double n11 = (float)(n5 - n8);
            bfl.x();
            bfl.f();
            bfl.p();
            final int n12 = 24;
            final double n13 = 0.025;
            c.a(5, bms.f);
            for (int i = 0; i <= 24; ++i) {
                float n14 = 0.5f;
                float n15 = 0.4f;
                float n16 = 0.3f;
                if (i % 2 == 0) {
                    n14 *= 0.7f;
                    n15 *= 0.7f;
                    n16 *= 0.7f;
                }
                final float n17 = i / 24.0f;
                c.b(\u2603 + n9 * n17 + 0.0, \u2603 + n10 * (n17 * n17 + n17) * 0.5 + ((24.0f - i) / 18.0f + 0.125f), \u2603 + n11 * n17).a(n14, n15, n16, 1.0f).d();
                c.b(\u2603 + n9 * n17 + 0.025, \u2603 + n10 * (n17 * n17 + n17) * 0.5 + ((24.0f - i) / 18.0f + 0.125f) + 0.025, \u2603 + n11 * n17).a(n14, n15, n16, 1.0f).d();
            }
            a.b();
            c.a(5, bms.f);
            for (int i = 0; i <= 24; ++i) {
                float n14 = 0.5f;
                float n15 = 0.4f;
                float n16 = 0.3f;
                if (i % 2 == 0) {
                    n14 *= 0.7f;
                    n15 *= 0.7f;
                    n16 *= 0.7f;
                }
                final float n17 = i / 24.0f;
                c.b(\u2603 + n9 * n17 + 0.0, \u2603 + n10 * (n17 * n17 + n17) * 0.5 + ((24.0f - i) / 18.0f + 0.125f) + 0.025, \u2603 + n11 * n17).a(n14, n15, n16, 1.0f).d();
                c.b(\u2603 + n9 * n17 + 0.025, \u2603 + n10 * (n17 * n17 + n17) * 0.5 + ((24.0f - i) / 18.0f + 0.125f), \u2603 + n11 * n17 + 0.025).a(n14, n15, n16, 1.0f).d();
            }
            a.b();
            bfl.e();
            bfl.w();
            bfl.o();
        }
    }
}
