// 
// Decompiled by Procyon v0.5.36
// 

public class qp
{
    private ps a;
    private float b;
    private float c;
    private boolean d;
    private double e;
    private double f;
    private double g;
    
    public qp(final ps \u2603) {
        this.a = \u2603;
    }
    
    public void a(final pk \u2603, final float \u2603, final float \u2603) {
        this.e = \u2603.s;
        if (\u2603 instanceof pr) {
            this.f = \u2603.t + \u2603.aS();
        }
        else {
            this.f = (\u2603.aR().b + \u2603.aR().e) / 2.0;
        }
        this.g = \u2603.u;
        this.b = \u2603;
        this.c = \u2603;
        this.d = true;
    }
    
    public void a(final double \u2603, final double \u2603, final double \u2603, final float \u2603, final float \u2603) {
        this.e = \u2603;
        this.f = \u2603;
        this.g = \u2603;
        this.b = \u2603;
        this.c = \u2603;
        this.d = true;
    }
    
    public void a() {
        this.a.z = 0.0f;
        if (this.d) {
            this.d = false;
            final double \u2603 = this.e - this.a.s;
            final double \u26032 = this.f - (this.a.t + this.a.aS());
            final double \u26033 = this.g - this.a.u;
            final double \u26034 = ns.a(\u2603 * \u2603 + \u26033 * \u26033);
            final float \u26035 = (float)(ns.b(\u26033, \u2603) * 180.0 / 3.1415927410125732) - 90.0f;
            final float \u26036 = (float)(-(ns.b(\u26032, \u26034) * 180.0 / 3.1415927410125732));
            this.a.z = this.a(this.a.z, \u26036, this.c);
            this.a.aK = this.a(this.a.aK, \u26035, this.b);
        }
        else {
            this.a.aK = this.a(this.a.aK, this.a.aI, 10.0f);
        }
        final float g = ns.g(this.a.aK - this.a.aI);
        if (!this.a.s().m()) {
            if (g < -75.0f) {
                this.a.aK = this.a.aI - 75.0f;
            }
            if (g > 75.0f) {
                this.a.aK = this.a.aI + 75.0f;
            }
        }
    }
    
    private float a(final float \u2603, final float \u2603, final float \u2603) {
        float g = ns.g(\u2603 - \u2603);
        if (g > \u2603) {
            g = \u2603;
        }
        if (g < -\u2603) {
            g = -\u2603;
        }
        return \u2603 + g;
    }
    
    public boolean b() {
        return this.d;
    }
    
    public double e() {
        return this.e;
    }
    
    public double f() {
        return this.f;
    }
    
    public double g() {
        return this.g;
    }
}
