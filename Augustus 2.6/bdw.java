// 
// Decompiled by Procyon v0.5.36
// 

public class bdw extends beb
{
    private pk a;
    private pk az;
    private int aA;
    private int aB;
    private float aC;
    private biu aD;
    
    public bdw(final adm \u2603, final pk \u2603, final pk \u2603, final float \u2603) {
        super(\u2603, \u2603.s, \u2603.t, \u2603.u, \u2603.v, \u2603.w, \u2603.x);
        this.aD = ave.A().af();
        this.a = \u2603;
        this.az = \u2603;
        this.aB = 3;
        this.aC = \u2603;
    }
    
    @Override
    public void a(final bfd \u2603, final pk \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603) {
        float n = (this.aA + \u2603) / this.aB;
        n *= n;
        final double s = this.a.s;
        final double t = this.a.t;
        final double u = this.a.u;
        final double n2 = this.az.P + (this.az.s - this.az.P) * \u2603;
        final double n3 = this.az.Q + (this.az.t - this.az.Q) * \u2603 + this.aC;
        final double n4 = this.az.R + (this.az.u - this.az.R) * \u2603;
        double n5 = s + (n2 - s) * n;
        double n6 = t + (n3 - t) * n;
        double n7 = u + (n4 - u) * n;
        final int b = this.b(\u2603);
        final int n8 = b % 65536;
        final int n9 = b / 65536;
        bqs.a(bqs.r, n8 / 1.0f, n9 / 1.0f);
        bfl.c(1.0f, 1.0f, 1.0f, 1.0f);
        n5 -= bdw.aw;
        n6 -= bdw.ax;
        n7 -= bdw.ay;
        this.aD.a(this.a, (float)n5, (float)n6, (float)n7, this.a.y, \u2603);
    }
    
    @Override
    public void t_() {
        ++this.aA;
        if (this.aA == this.aB) {
            this.J();
        }
    }
    
    @Override
    public int a() {
        return 3;
    }
}
