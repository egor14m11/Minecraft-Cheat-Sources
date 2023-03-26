// 
// Decompiled by Procyon v0.5.36
// 

public class qq
{
    protected ps a;
    protected double b;
    protected double c;
    protected double d;
    protected double e;
    protected boolean f;
    
    public qq(final ps \u2603) {
        this.a = \u2603;
        this.b = \u2603.s;
        this.c = \u2603.t;
        this.d = \u2603.u;
    }
    
    public boolean a() {
        return this.f;
    }
    
    public double b() {
        return this.e;
    }
    
    public void a(final double \u2603, final double \u2603, final double \u2603, final double \u2603) {
        this.b = \u2603;
        this.c = \u2603;
        this.d = \u2603;
        this.e = \u2603;
        this.f = true;
    }
    
    public void c() {
        this.a.n(0.0f);
        if (!this.f) {
            return;
        }
        this.f = false;
        final int c = ns.c(this.a.aR().b + 0.5);
        final double \u2603 = this.b - this.a.s;
        final double \u26032 = this.d - this.a.u;
        final double n = this.c - c;
        final double n2 = \u2603 * \u2603 + n * n + \u26032 * \u26032;
        if (n2 < 2.500000277905201E-7) {
            return;
        }
        final float \u26033 = (float)(ns.b(\u26032, \u2603) * 180.0 / 3.1415927410125732) - 90.0f;
        this.a.y = this.a(this.a.y, \u26033, 30.0f);
        this.a.k((float)(this.e * this.a.a(vy.d).e()));
        if (n > 0.0 && \u2603 * \u2603 + \u26032 * \u26032 < 1.0) {
            this.a.r().a();
        }
    }
    
    protected float a(final float \u2603, final float \u2603, final float \u2603) {
        float g = ns.g(\u2603 - \u2603);
        if (g > \u2603) {
            g = \u2603;
        }
        if (g < -\u2603) {
            g = -\u2603;
        }
        float n = \u2603 + g;
        if (n < 0.0f) {
            n += 360.0f;
        }
        else if (n > 360.0f) {
            n -= 360.0f;
        }
        return n;
    }
    
    public double d() {
        return this.b;
    }
    
    public double e() {
        return this.c;
    }
    
    public double f() {
        return this.d;
    }
}
