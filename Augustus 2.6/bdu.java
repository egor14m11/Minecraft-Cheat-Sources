// 
// Decompiled by Procyon v0.5.36
// 

public class bdu extends beb
{
    private static final jy a;
    private static final bmu az;
    private int aA;
    private int aB;
    private bmj aC;
    private float aD;
    
    protected bdu(final bmj \u2603, final adm \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603) {
        super(\u2603, \u2603, \u2603, \u2603, 0.0, 0.0, 0.0);
        this.aC = \u2603;
        this.aB = 6 + this.V.nextInt(4);
        final float ar = this.V.nextFloat() * 0.6f + 0.4f;
        this.at = ar;
        this.as = ar;
        this.ar = ar;
        this.aD = 1.0f - (float)\u2603 * 0.5f;
    }
    
    @Override
    public void a(final bfd \u2603, final pk \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603) {
        final int n = (int)((this.aA + \u2603) * 15.0f / this.aB);
        if (n > 15) {
            return;
        }
        this.aC.a(bdu.a);
        final float n2 = n % 4 / 4.0f;
        final float n3 = n2 + 0.24975f;
        final float n4 = n / 4 / 4.0f;
        final float n5 = n4 + 0.24975f;
        final float n6 = 2.0f * this.aD;
        final float n7 = (float)(this.p + (this.s - this.p) * \u2603 - bdu.aw);
        final float n8 = (float)(this.q + (this.t - this.q) * \u2603 - bdu.ax);
        final float n9 = (float)(this.r + (this.u - this.r) * \u2603 - bdu.ay);
        bfl.c(1.0f, 1.0f, 1.0f, 1.0f);
        bfl.f();
        avc.a();
        \u2603.a(7, bdu.az);
        \u2603.b(n7 - \u2603 * n6 - \u2603 * n6, n8 - \u2603 * n6, (double)(n9 - \u2603 * n6 - \u2603 * n6)).a(n3, n5).a(this.ar, this.as, this.at, 1.0f).a(0, 240).c(0.0f, 1.0f, 0.0f).d();
        \u2603.b(n7 - \u2603 * n6 + \u2603 * n6, n8 + \u2603 * n6, (double)(n9 - \u2603 * n6 + \u2603 * n6)).a(n3, n4).a(this.ar, this.as, this.at, 1.0f).a(0, 240).c(0.0f, 1.0f, 0.0f).d();
        \u2603.b(n7 + \u2603 * n6 + \u2603 * n6, n8 + \u2603 * n6, (double)(n9 + \u2603 * n6 + \u2603 * n6)).a(n2, n4).a(this.ar, this.as, this.at, 1.0f).a(0, 240).c(0.0f, 1.0f, 0.0f).d();
        \u2603.b(n7 + \u2603 * n6 - \u2603 * n6, n8 - \u2603 * n6, (double)(n9 + \u2603 * n6 - \u2603 * n6)).a(n2, n5).a(this.ar, this.as, this.at, 1.0f).a(0, 240).c(0.0f, 1.0f, 0.0f).d();
        bfx.a().b();
        bfl.e();
    }
    
    @Override
    public int b(final float \u2603) {
        return 61680;
    }
    
    @Override
    public void t_() {
        this.p = this.s;
        this.q = this.t;
        this.r = this.u;
        ++this.aA;
        if (this.aA == this.aB) {
            this.J();
        }
    }
    
    @Override
    public int a() {
        return 3;
    }
    
    static {
        a = new jy("textures/entity/explosion.png");
        az = new bmu().a(bms.m).a(bms.o).a(bms.n).a(bms.p).a(bms.q).a(bms.r);
    }
    
    public static class a implements bed
    {
        @Override
        public beb a(final int \u2603, final adm \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final int... \u2603) {
            return new bdu(ave.A().P(), \u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        }
    }
}
