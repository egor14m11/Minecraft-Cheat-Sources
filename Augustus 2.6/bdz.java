// 
// Decompiled by Procyon v0.5.36
// 

public class bdz extends beb
{
    private pr a;
    
    protected bdz(final adm \u2603, final double \u2603, final double \u2603, final double \u2603) {
        super(\u2603, \u2603, \u2603, \u2603, 0.0, 0.0, 0.0);
        final float ar = 1.0f;
        this.at = ar;
        this.as = ar;
        this.ar = ar;
        final double v = 0.0;
        this.x = v;
        this.w = v;
        this.v = v;
        this.i = 0.0f;
        this.g = 30;
    }
    
    @Override
    public int a() {
        return 3;
    }
    
    @Override
    public void t_() {
        super.t_();
        if (this.a == null) {
            final vt a = new vt(this.o);
            a.co();
            this.a = a;
        }
    }
    
    @Override
    public void a(final bfd \u2603, final pk \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603) {
        if (this.a == null) {
            return;
        }
        final biu af = ave.A().af();
        af.a(beb.aw, beb.ax, beb.ay);
        final float n = 0.42553192f;
        final float n2 = (this.f + \u2603) / this.g;
        bfl.a(true);
        bfl.l();
        bfl.j();
        bfl.b(770, 771);
        final float n3 = 240.0f;
        bqs.a(bqs.r, n3, n3);
        bfl.E();
        final float \u26032 = 0.05f + 0.5f * ns.a(n2 * 3.1415927f);
        bfl.c(1.0f, 1.0f, 1.0f, \u26032);
        bfl.b(0.0f, 1.8f, 0.0f);
        bfl.b(180.0f - \u2603.y, 0.0f, 1.0f, 0.0f);
        bfl.b(60.0f - 150.0f * n2 - \u2603.z, 1.0f, 0.0f, 0.0f);
        bfl.b(0.0f, -0.4f, -1.5f);
        bfl.a(n, n, n);
        final pr a = this.a;
        final pr a2 = this.a;
        final float n4 = 0.0f;
        a2.A = n4;
        a.y = n4;
        final pr a3 = this.a;
        final pr a4 = this.a;
        final float n5 = 0.0f;
        a4.aL = n5;
        a3.aK = n5;
        af.a(this.a, 0.0, 0.0, 0.0, 0.0f, \u2603);
        bfl.F();
        bfl.j();
    }
    
    public static class a implements bed
    {
        @Override
        public beb a(final int \u2603, final adm \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final int... \u2603) {
            return new bdz(\u2603, \u2603, \u2603, \u2603);
        }
    }
}
