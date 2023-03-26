// 
// Decompiled by Procyon v0.5.36
// 

public class bdr extends beb
{
    private float a;
    
    protected bdr(final adm \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603) {
        super(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        this.v = this.v * 0.009999999776482582 + \u2603;
        this.w = this.w * 0.009999999776482582 + \u2603;
        this.x = this.x * 0.009999999776482582 + \u2603;
        this.s += (this.V.nextFloat() - this.V.nextFloat()) * 0.05f;
        this.t += (this.V.nextFloat() - this.V.nextFloat()) * 0.05f;
        this.u += (this.V.nextFloat() - this.V.nextFloat()) * 0.05f;
        this.a = this.h;
        final float ar = 1.0f;
        this.at = ar;
        this.as = ar;
        this.ar = ar;
        this.g = (int)(8.0 / (Math.random() * 0.8 + 0.2)) + 4;
        this.T = true;
        this.k(48);
    }
    
    @Override
    public void a(final bfd \u2603, final pk \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603) {
        final float n = (this.f + \u2603) / this.g;
        this.h = this.a * (1.0f - n * n * 0.5f);
        super.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
    }
    
    @Override
    public int b(final float \u2603) {
        float a = (this.f + \u2603) / this.g;
        a = ns.a(a, 0.0f, 1.0f);
        final int b = super.b(\u2603);
        int n = b & 0xFF;
        final int n2 = b >> 16 & 0xFF;
        n += (int)(a * 15.0f * 16.0f);
        if (n > 240) {
            n = 240;
        }
        return n | n2 << 16;
    }
    
    @Override
    public float c(final float \u2603) {
        float a = (this.f + \u2603) / this.g;
        a = ns.a(a, 0.0f, 1.0f);
        final float c = super.c(\u2603);
        return c * a + (1.0f - a);
    }
    
    @Override
    public void t_() {
        this.p = this.s;
        this.q = this.t;
        this.r = this.u;
        if (this.f++ >= this.g) {
            this.J();
        }
        this.d(this.v, this.w, this.x);
        this.v *= 0.9599999785423279;
        this.w *= 0.9599999785423279;
        this.x *= 0.9599999785423279;
        if (this.C) {
            this.v *= 0.699999988079071;
            this.x *= 0.699999988079071;
        }
    }
    
    public static class a implements bed
    {
        @Override
        public beb a(final int \u2603, final adm \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final int... \u2603) {
            return new bdr(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        }
    }
}
