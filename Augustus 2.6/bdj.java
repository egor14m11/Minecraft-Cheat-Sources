// 
// Decompiled by Procyon v0.5.36
// 

public class bdj extends beb
{
    protected bdj(final adm \u2603, final double \u2603, final double \u2603, final double \u2603, final zw \u2603) {
        super(\u2603, \u2603, \u2603, \u2603, 0.0, 0.0, 0.0);
        this.a(ave.A().ag().a().a(\u2603));
        final float ar = 1.0f;
        this.at = ar;
        this.as = ar;
        this.ar = ar;
        final double v = 0.0;
        this.x = v;
        this.w = v;
        this.v = v;
        this.i = 0.0f;
        this.g = 80;
    }
    
    @Override
    public int a() {
        return 1;
    }
    
    @Override
    public void a(final bfd \u2603, final pk \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603) {
        final float e = this.av.e();
        final float f = this.av.f();
        final float g = this.av.g();
        final float h = this.av.h();
        final float n = 0.5f;
        final float n2 = (float)(this.p + (this.s - this.p) * \u2603 - bdj.aw);
        final float n3 = (float)(this.q + (this.t - this.q) * \u2603 - bdj.ax);
        final float n4 = (float)(this.r + (this.u - this.r) * \u2603 - bdj.ay);
        final int b = this.b(\u2603);
        final int n5 = b >> 16 & 0xFFFF;
        final int n6 = b & 0xFFFF;
        \u2603.b(n2 - \u2603 * 0.5f - \u2603 * 0.5f, n3 - \u2603 * 0.5f, (double)(n4 - \u2603 * 0.5f - \u2603 * 0.5f)).a(f, h).a(this.ar, this.as, this.at, 1.0f).a(n5, n6).d();
        \u2603.b(n2 - \u2603 * 0.5f + \u2603 * 0.5f, n3 + \u2603 * 0.5f, (double)(n4 - \u2603 * 0.5f + \u2603 * 0.5f)).a(f, g).a(this.ar, this.as, this.at, 1.0f).a(n5, n6).d();
        \u2603.b(n2 + \u2603 * 0.5f + \u2603 * 0.5f, n3 + \u2603 * 0.5f, (double)(n4 + \u2603 * 0.5f + \u2603 * 0.5f)).a(e, g).a(this.ar, this.as, this.at, 1.0f).a(n5, n6).d();
        \u2603.b(n2 + \u2603 * 0.5f - \u2603 * 0.5f, n3 - \u2603 * 0.5f, (double)(n4 + \u2603 * 0.5f - \u2603 * 0.5f)).a(e, h).a(this.ar, this.as, this.at, 1.0f).a(n5, n6).d();
    }
    
    public static class a implements bed
    {
        @Override
        public beb a(final int \u2603, final adm \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final int... \u2603) {
            return new bdj(\u2603, \u2603, \u2603, \u2603, zw.a(afi.cv));
        }
    }
}
