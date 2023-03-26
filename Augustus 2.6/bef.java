// 
// Decompiled by Procyon v0.5.36
// 

public class bef extends beb
{
    private float a;
    private double az;
    private double aA;
    private double aB;
    
    protected bef(final adm \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603) {
        super(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        this.v = \u2603;
        this.w = \u2603;
        this.x = \u2603;
        this.s = \u2603;
        this.az = \u2603;
        this.t = \u2603;
        this.aA = \u2603;
        this.u = \u2603;
        this.aB = \u2603;
        final float n = this.V.nextFloat() * 0.6f + 0.4f;
        final float n2 = this.V.nextFloat() * 0.2f + 0.5f;
        this.h = n2;
        this.a = n2;
        final float ar = 1.0f * n;
        this.at = ar;
        this.as = ar;
        this.ar = ar;
        this.as *= 0.3f;
        this.ar *= 0.9f;
        this.g = (int)(Math.random() * 10.0) + 40;
        this.T = true;
        this.k((int)(Math.random() * 8.0));
    }
    
    @Override
    public void a(final bfd \u2603, final pk \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603) {
        float n = (this.f + \u2603) / this.g;
        n = 1.0f - n;
        n *= n;
        n = 1.0f - n;
        this.h = this.a * n;
        super.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
    }
    
    @Override
    public int b(final float \u2603) {
        final int b = super.b(\u2603);
        float n = this.f / (float)this.g;
        n *= n;
        n *= n;
        final int n2 = b & 0xFF;
        int n3 = b >> 16 & 0xFF;
        n3 += (int)(n * 15.0f * 16.0f);
        if (n3 > 240) {
            n3 = 240;
        }
        return n2 | n3 << 16;
    }
    
    @Override
    public float c(final float \u2603) {
        final float c = super.c(\u2603);
        float n = this.f / (float)this.g;
        n *= n * n * n;
        return c * (1.0f - n) + n;
    }
    
    @Override
    public void t_() {
        this.p = this.s;
        this.q = this.t;
        this.r = this.u;
        final float n2;
        float n = n2 = this.f / (float)this.g;
        n = -n + n * n * 2.0f;
        n = 1.0f - n;
        this.s = this.az + this.v * n;
        this.t = this.aA + this.w * n + (1.0f - n2);
        this.u = this.aB + this.x * n;
        if (this.f++ >= this.g) {
            this.J();
        }
    }
    
    public static class a implements bed
    {
        @Override
        public beb a(final int \u2603, final adm \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final int... \u2603) {
            return new bef(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        }
    }
}
