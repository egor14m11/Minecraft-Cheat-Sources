// 
// Decompiled by Procyon v0.5.36
// 

public class qm
{
    private pr a;
    private int b;
    private float c;
    
    public qm(final pr \u2603) {
        this.a = \u2603;
    }
    
    public void a() {
        final double n = this.a.s - this.a.p;
        final double n2 = this.a.u - this.a.r;
        if (n * n + n2 * n2 > 2.500000277905201E-7) {
            this.a.aI = this.a.y;
            this.a.aK = this.a(this.a.aI, this.a.aK, 75.0f);
            this.c = this.a.aK;
            this.b = 0;
            return;
        }
        float \u2603 = 75.0f;
        if (Math.abs(this.a.aK - this.c) > 15.0f) {
            this.b = 0;
            this.c = this.a.aK;
        }
        else {
            ++this.b;
            final int n3 = 10;
            if (this.b > 10) {
                \u2603 = Math.max(1.0f - (this.b - 10) / 10.0f, 0.0f) * 75.0f;
            }
        }
        this.a.aI = this.a(this.a.aK, this.a.aI, \u2603);
    }
    
    private float a(final float \u2603, final float \u2603, final float \u2603) {
        float g = ns.g(\u2603 - \u2603);
        if (g < -\u2603) {
            g = -\u2603;
        }
        if (g >= \u2603) {
            g = \u2603;
        }
        return \u2603 - g;
    }
}
