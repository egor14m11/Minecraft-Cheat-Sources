// 
// Decompiled by Procyon v0.5.36
// 

public class bdk extends beb
{
    protected bdk(final adm \u2603, final double \u2603, final double \u2603, final double \u2603, final zw \u2603) {
        this(\u2603, \u2603, \u2603, \u2603, \u2603, 0);
    }
    
    protected bdk(final adm \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final zw \u2603, final int \u2603) {
        this(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        this.v *= 0.10000000149011612;
        this.w *= 0.10000000149011612;
        this.x *= 0.10000000149011612;
        this.v += \u2603;
        this.w += \u2603;
        this.x += \u2603;
    }
    
    protected bdk(final adm \u2603, final double \u2603, final double \u2603, final double \u2603, final zw \u2603, final int \u2603) {
        super(\u2603, \u2603, \u2603, \u2603, 0.0, 0.0, 0.0);
        this.a(ave.A().ag().a().a(\u2603, \u2603));
        final float ar = 1.0f;
        this.at = ar;
        this.as = ar;
        this.ar = ar;
        this.i = afi.aJ.I;
        this.h /= 2.0f;
    }
    
    @Override
    public int a() {
        return 1;
    }
    
    @Override
    public void a(final bfd \u2603, final pk \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603) {
        float a = (this.b + this.d / 4.0f) / 16.0f;
        float a2 = a + 0.015609375f;
        float b = (this.c + this.e / 4.0f) / 16.0f;
        float b2 = b + 0.015609375f;
        final float n = 0.1f * this.h;
        if (this.av != null) {
            a = this.av.a(this.d / 4.0f * 16.0f);
            a2 = this.av.a((this.d + 1.0f) / 4.0f * 16.0f);
            b = this.av.b(this.e / 4.0f * 16.0f);
            b2 = this.av.b((this.e + 1.0f) / 4.0f * 16.0f);
        }
        final float n2 = (float)(this.p + (this.s - this.p) * \u2603 - bdk.aw);
        final float n3 = (float)(this.q + (this.t - this.q) * \u2603 - bdk.ax);
        final float n4 = (float)(this.r + (this.u - this.r) * \u2603 - bdk.ay);
        final int b3 = this.b(\u2603);
        final int n5 = b3 >> 16 & 0xFFFF;
        final int n6 = b3 & 0xFFFF;
        \u2603.b(n2 - \u2603 * n - \u2603 * n, n3 - \u2603 * n, (double)(n4 - \u2603 * n - \u2603 * n)).a(a, b2).a(this.ar, this.as, this.at, 1.0f).a(n5, n6).d();
        \u2603.b(n2 - \u2603 * n + \u2603 * n, n3 + \u2603 * n, (double)(n4 - \u2603 * n + \u2603 * n)).a(a, b).a(this.ar, this.as, this.at, 1.0f).a(n5, n6).d();
        \u2603.b(n2 + \u2603 * n + \u2603 * n, n3 + \u2603 * n, (double)(n4 + \u2603 * n + \u2603 * n)).a(a2, b).a(this.ar, this.as, this.at, 1.0f).a(n5, n6).d();
        \u2603.b(n2 + \u2603 * n - \u2603 * n, n3 - \u2603 * n, (double)(n4 + \u2603 * n - \u2603 * n)).a(a2, b2).a(this.ar, this.as, this.at, 1.0f).a(n5, n6).d();
    }
    
    public static class a implements bed
    {
        @Override
        public beb a(final int \u2603, final adm \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final int... \u2603) {
            final int \u26032 = (\u2603.length > 1) ? \u2603[1] : 0;
            return new bdk(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603, zw.b(\u2603[0]), \u26032);
        }
    }
    
    public static class b implements bed
    {
        @Override
        public beb a(final int \u2603, final adm \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final int... \u2603) {
            return new bdk(\u2603, \u2603, \u2603, \u2603, zy.aM);
        }
    }
    
    public static class c implements bed
    {
        @Override
        public beb a(final int \u2603, final adm \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final int... \u2603) {
            return new bdk(\u2603, \u2603, \u2603, \u2603, zy.aD);
        }
    }
}
