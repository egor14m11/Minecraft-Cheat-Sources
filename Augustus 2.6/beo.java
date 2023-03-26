// 
// Decompiled by Procyon v0.5.36
// 

public class beo extends beb
{
    private alz a;
    private cj az;
    
    protected beo(final adm \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final alz \u2603) {
        super(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        this.a = \u2603;
        this.a(ave.A().ae().a().a(\u2603));
        this.i = \u2603.c().I;
        final float ar = 0.6f;
        this.at = ar;
        this.as = ar;
        this.ar = ar;
        this.h /= 2.0f;
    }
    
    public beo a(final cj \u2603) {
        this.az = \u2603;
        if (this.a.c() == afi.c) {
            return this;
        }
        final int d = this.a.c().d((adq)this.o, \u2603);
        this.ar *= (d >> 16 & 0xFF) / 255.0f;
        this.as *= (d >> 8 & 0xFF) / 255.0f;
        this.at *= (d & 0xFF) / 255.0f;
        return this;
    }
    
    public beo l() {
        this.az = new cj(this.s, this.t, this.u);
        final afh c = this.a.c();
        if (c == afi.c) {
            return this;
        }
        final int h = c.h(this.a);
        this.ar *= (h >> 16 & 0xFF) / 255.0f;
        this.as *= (h >> 8 & 0xFF) / 255.0f;
        this.at *= (h & 0xFF) / 255.0f;
        return this;
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
        final float n2 = (float)(this.p + (this.s - this.p) * \u2603 - beo.aw);
        final float n3 = (float)(this.q + (this.t - this.q) * \u2603 - beo.ax);
        final float n4 = (float)(this.r + (this.u - this.r) * \u2603 - beo.ay);
        final int b3 = this.b(\u2603);
        final int n5 = b3 >> 16 & 0xFFFF;
        final int n6 = b3 & 0xFFFF;
        \u2603.b(n2 - \u2603 * n - \u2603 * n, n3 - \u2603 * n, (double)(n4 - \u2603 * n - \u2603 * n)).a(a, b2).a(this.ar, this.as, this.at, 1.0f).a(n5, n6).d();
        \u2603.b(n2 - \u2603 * n + \u2603 * n, n3 + \u2603 * n, (double)(n4 - \u2603 * n + \u2603 * n)).a(a, b).a(this.ar, this.as, this.at, 1.0f).a(n5, n6).d();
        \u2603.b(n2 + \u2603 * n + \u2603 * n, n3 + \u2603 * n, (double)(n4 + \u2603 * n + \u2603 * n)).a(a2, b).a(this.ar, this.as, this.at, 1.0f).a(n5, n6).d();
        \u2603.b(n2 + \u2603 * n - \u2603 * n, n3 - \u2603 * n, (double)(n4 + \u2603 * n - \u2603 * n)).a(a2, b2).a(this.ar, this.as, this.at, 1.0f).a(n5, n6).d();
    }
    
    @Override
    public int b(final float \u2603) {
        final int b = super.b(\u2603);
        int b2 = 0;
        if (this.o.e(this.az)) {
            b2 = this.o.b(this.az, 0);
        }
        return (b == 0) ? b2 : b;
    }
    
    public static class a implements bed
    {
        @Override
        public beb a(final int \u2603, final adm \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final int... \u2603) {
            return new beo(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603, afh.d(\u2603[0])).l();
        }
    }
}
