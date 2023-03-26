// 
// Decompiled by Procyon v0.5.36
// 

public class alf extends akw implements km
{
    public float a;
    public float f;
    public int g;
    private int h;
    
    @Override
    public void c() {
        if (++this.h % 20 * 4 == 0) {
            this.b.c(this.c, afi.bQ, 1, this.g);
        }
        this.f = this.a;
        final int n = this.c.n();
        final int o = this.c.o();
        final int p = this.c.p();
        final float n2 = 0.1f;
        if (this.g > 0 && this.a == 0.0f) {
            final double \u2603 = n + 0.5;
            final double n3 = p + 0.5;
            this.b.a(\u2603, o + 0.5, n3, "random.chestopen", 0.5f, this.b.s.nextFloat() * 0.1f + 0.9f);
        }
        if ((this.g == 0 && this.a > 0.0f) || (this.g > 0 && this.a < 1.0f)) {
            final float a = this.a;
            if (this.g > 0) {
                this.a += n2;
            }
            else {
                this.a -= n2;
            }
            if (this.a > 1.0f) {
                this.a = 1.0f;
            }
            final float n4 = 0.5f;
            if (this.a < n4 && a >= n4) {
                final double n3 = n + 0.5;
                final double \u26032 = p + 0.5;
                this.b.a(n3, o + 0.5, \u26032, "random.chestclosed", 0.5f, this.b.s.nextFloat() * 0.1f + 0.9f);
            }
            if (this.a < 0.0f) {
                this.a = 0.0f;
            }
        }
    }
    
    @Override
    public boolean c(final int \u2603, final int \u2603) {
        if (\u2603 == 1) {
            this.g = \u2603;
            return true;
        }
        return super.c(\u2603, \u2603);
    }
    
    @Override
    public void y() {
        this.E();
        super.y();
    }
    
    public void b() {
        ++this.g;
        this.b.c(this.c, afi.bQ, 1, this.g);
    }
    
    public void d() {
        --this.g;
        this.b.c(this.c, afi.bQ, 1, this.g);
    }
    
    public boolean a(final wn \u2603) {
        return this.b.s(this.c) == this && \u2603.e(this.c.n() + 0.5, this.c.o() + 0.5, this.c.p() + 0.5) <= 64.0;
    }
}
