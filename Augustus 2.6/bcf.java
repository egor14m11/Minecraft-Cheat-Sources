// 
// Decompiled by Procyon v0.5.36
// 

public class bcf extends bbo
{
    bct a;
    bct[] b;
    
    public bcf() {
        this.b = new bct[8];
        final int n = -16;
        (this.a = new bct(this, 0, 0)).a(-6.0f, -8.0f, -6.0f, 12, 16, 12);
        final bct a = this.a;
        a.d += 24 + n;
        for (int i = 0; i < this.b.length; ++i) {
            this.b[i] = new bct(this, 48, 0);
            double n2 = i * 3.141592653589793 * 2.0 / this.b.length;
            final float c = (float)Math.cos(n2) * 5.0f;
            final float e = (float)Math.sin(n2) * 5.0f;
            this.b[i].a(-1.0f, 0.0f, -1.0f, 2, 18, 2);
            this.b[i].c = c;
            this.b[i].e = e;
            this.b[i].d = (float)(31 + n);
            n2 = i * 3.141592653589793 * -2.0 / this.b.length + 1.5707963267948966;
            this.b[i].g = (float)n2;
        }
    }
    
    @Override
    public void a(final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final pk \u2603) {
        for (final bct bct : this.b) {
            bct.f = \u2603;
        }
    }
    
    @Override
    public void a(final pk \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603) {
        this.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        this.a.a(\u2603);
        for (int i = 0; i < this.b.length; ++i) {
            this.b[i].a(\u2603);
        }
    }
}
