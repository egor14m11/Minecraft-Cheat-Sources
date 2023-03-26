// 
// Decompiled by Procyon v0.5.36
// 

public class rh extends rd
{
    ps a;
    pr b;
    float c;
    
    public rh(final ps \u2603, final float \u2603) {
        this.a = \u2603;
        this.c = \u2603;
        this.a(5);
    }
    
    @Override
    public boolean a() {
        this.b = this.a.u();
        if (this.b == null) {
            return false;
        }
        final double h = this.a.h(this.b);
        return h >= 4.0 && h <= 16.0 && this.a.C && this.a.bc().nextInt(5) == 0;
    }
    
    @Override
    public boolean b() {
        return !this.a.C;
    }
    
    @Override
    public void c() {
        final double n = this.b.s - this.a.s;
        final double n2 = this.b.u - this.a.u;
        final float a = ns.a(n * n + n2 * n2);
        final ps a2 = this.a;
        a2.v += n / a * 0.5 * 0.800000011920929 + this.a.v * 0.20000000298023224;
        final ps a3 = this.a;
        a3.x += n2 / a * 0.5 * 0.800000011920929 + this.a.x * 0.20000000298023224;
        this.a.w = this.c;
    }
}
