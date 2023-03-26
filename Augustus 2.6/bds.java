// 
// Decompiled by Procyon v0.5.36
// 

public class bds extends beb
{
    private static final jy a;
    private int az;
    private int aA;
    private bmj aB;
    
    protected bds(final bmj \u2603, final adm \u2603, final double \u2603, final double \u2603, final double \u2603) {
        super(\u2603, \u2603, \u2603, \u2603, 0.0, 0.0, 0.0);
        this.aB = \u2603;
        final double v = 0.0;
        this.x = v;
        this.w = v;
        this.v = v;
        this.aA = 200;
    }
    
    @Override
    public void a(final bfd \u2603, final pk \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603) {
        float n = (this.az + \u2603) / this.aA;
        n *= n;
        float n2 = 2.0f - n * 2.0f;
        if (n2 > 1.0f) {
            n2 = 1.0f;
        }
        n2 *= 0.2f;
        bfl.f();
        final float n3 = 0.125f;
        final float n4 = (float)(this.s - bds.aw);
        final float n5 = (float)(this.t - bds.ax);
        final float n6 = (float)(this.u - bds.ay);
        final float o = this.o.o(new cj(this));
        this.aB.a(bds.a);
        bfl.l();
        bfl.b(770, 771);
        \u2603.a(7, bms.i);
        \u2603.b(n4 - 0.125f, n5, (double)(n6 + 0.125f)).a(0.0, 1.0).a(o, o, o, n2).d();
        \u2603.b(n4 + 0.125f, n5, (double)(n6 + 0.125f)).a(1.0, 1.0).a(o, o, o, n2).d();
        \u2603.b(n4 + 0.125f, n5, (double)(n6 - 0.125f)).a(1.0, 0.0).a(o, o, o, n2).d();
        \u2603.b(n4 - 0.125f, n5, (double)(n6 - 0.125f)).a(0.0, 0.0).a(o, o, o, n2).d();
        bfx.a().b();
        bfl.k();
        bfl.e();
    }
    
    @Override
    public void t_() {
        ++this.az;
        if (this.az == this.aA) {
            this.J();
        }
    }
    
    @Override
    public int a() {
        return 3;
    }
    
    static {
        a = new jy("textures/particle/footprint.png");
    }
    
    public static class a implements bed
    {
        @Override
        public beb a(final int \u2603, final adm \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final int... \u2603) {
            return new bds(ave.A().P(), \u2603, \u2603, \u2603, \u2603);
        }
    }
}
