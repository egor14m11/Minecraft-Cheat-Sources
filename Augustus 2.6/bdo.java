// 
// Decompiled by Procyon v0.5.36
// 

public class bdo extends beb
{
    private float a;
    private double az;
    private double aA;
    private double aB;
    
    protected bdo(final adm \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603) {
        super(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        this.v = \u2603;
        this.w = \u2603;
        this.x = \u2603;
        this.az = \u2603;
        this.aA = \u2603;
        this.aB = \u2603;
        final double n = \u2603 + \u2603;
        this.p = n;
        this.s = n;
        final double n2 = \u2603 + \u2603;
        this.q = n2;
        this.t = n2;
        final double n3 = \u2603 + \u2603;
        this.r = n3;
        this.u = n3;
        final float n4 = this.V.nextFloat() * 0.6f + 0.4f;
        final float n5 = this.V.nextFloat() * 0.5f + 0.2f;
        this.h = n5;
        this.a = n5;
        final float ar = 1.0f * n4;
        this.at = ar;
        this.as = ar;
        this.ar = ar;
        this.as *= 0.9f;
        this.ar *= 0.9f;
        this.g = (int)(Math.random() * 10.0) + 30;
        this.T = true;
        this.k((int)(Math.random() * 26.0 + 1.0 + 224.0));
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
        n *= n;
        n *= n;
        return c * (1.0f - n) + n;
    }
    
    @Override
    public void t_() {
        this.p = this.s;
        this.q = this.t;
        this.r = this.u;
        float n = this.f / (float)this.g;
        n = 1.0f - n;
        float n2 = 1.0f - n;
        n2 *= n2;
        n2 *= n2;
        this.s = this.az + this.v * n;
        this.t = this.aA + this.w * n - n2 * 1.2f;
        this.u = this.aB + this.x * n;
        if (this.f++ >= this.g) {
            this.J();
        }
    }
    
    public static class a implements bed
    {
        @Override
        public beb a(final int \u2603, final adm \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final int... \u2603) {
            return new bdo(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        }
    }
}
