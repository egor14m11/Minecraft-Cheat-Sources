// 
// Decompiled by Procyon v0.5.36
// 

public class avl
{
    float a;
    private double f;
    public int b;
    public float c;
    public float d;
    public float e;
    private long g;
    private long h;
    private long i;
    private double j;
    
    public avl(final float \u2603) {
        this.d = 1.0f;
        this.j = 1.0;
        this.a = \u2603;
        this.g = ave.J();
        this.h = System.nanoTime() / 1000000L;
    }
    
    public void a() {
        final long j = ave.J();
        final long n = j - this.g;
        final long n2 = System.nanoTime() / 1000000L;
        final double n3 = n2 / 1000.0;
        if (n > 1000L || n < 0L) {
            this.f = n3;
        }
        else {
            this.i += n;
            if (this.i > 1000L) {
                final long n4 = n2 - this.h;
                final double n5 = this.i / (double)n4;
                this.j += (n5 - this.j) * 0.20000000298023224;
                this.h = n2;
                this.i = 0L;
            }
            if (this.i < 0L) {
                this.h = n2;
            }
        }
        this.g = j;
        double a = (n3 - this.f) * this.j;
        this.f = n3;
        a = ns.a(a, 0.0, 1.0);
        this.e += (float)(a * this.d * this.a);
        this.b = (int)this.e;
        this.e -= this.b;
        if (this.b > 10) {
            this.b = 10;
        }
        this.c = this.e;
    }
}
