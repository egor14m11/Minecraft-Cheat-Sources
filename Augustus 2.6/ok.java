// 
// Decompiled by Procyon v0.5.36
// 

public class ok
{
    private final oj a;
    private final float b;
    
    public ok(final oj \u2603, final long \u2603, final long \u2603, final float \u2603) {
        this.a = \u2603;
        this.b = this.a(\u2603, \u2603, \u2603, \u2603);
    }
    
    public float b() {
        return this.b;
    }
    
    public float c() {
        if (this.b < 2.0f) {
            return 0.0f;
        }
        if (this.b > 4.0f) {
            return 1.0f;
        }
        return (this.b - 2.0f) / 2.0f;
    }
    
    private float a(final oj \u2603, final long \u2603, final long \u2603, final float \u2603) {
        if (\u2603 == oj.a) {
            return 0.0f;
        }
        final boolean b = \u2603 == oj.d;
        float n = 0.75f;
        final float \u26032 = ns.a((\u2603 - 72000.0f) / 1440000.0f, 0.0f, 1.0f) * 0.25f;
        n += \u26032;
        float n2 = 0.0f;
        n2 += ns.a(\u2603 / 3600000.0f, 0.0f, 1.0f) * (b ? 1.0f : 0.75f);
        n2 += ns.a(\u2603 * 0.25f, 0.0f, \u26032);
        if (\u2603 == oj.b) {
            n2 *= 0.5f;
        }
        n += n2;
        return \u2603.a() * n;
    }
}
