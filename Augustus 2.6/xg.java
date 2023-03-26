// 
// Decompiled by Procyon v0.5.36
// 

public class xg
{
    private int a;
    private float b;
    private float c;
    private int d;
    private int e;
    
    public xg() {
        this.a = 20;
        this.e = 20;
        this.b = 5.0f;
    }
    
    public void a(final int \u2603, final float \u2603) {
        this.a = Math.min(\u2603 + this.a, 20);
        this.b = Math.min(this.b + \u2603 * \u2603 * 2.0f, (float)this.a);
    }
    
    public void a(final zs \u2603, final zx \u2603) {
        this.a(\u2603.h(\u2603), \u2603.i(\u2603));
    }
    
    public void a(final wn \u2603) {
        final oj aa = \u2603.o.aa();
        this.e = this.a;
        if (this.c > 4.0f) {
            this.c -= 4.0f;
            if (this.b > 0.0f) {
                this.b = Math.max(this.b - 1.0f, 0.0f);
            }
            else if (aa != oj.a) {
                this.a = Math.max(this.a - 1, 0);
            }
        }
        if (\u2603.o.Q().b("naturalRegeneration") && this.a >= 18 && \u2603.cm()) {
            ++this.d;
            if (this.d >= 80) {
                \u2603.h(1.0f);
                this.a(3.0f);
                this.d = 0;
            }
        }
        else if (this.a <= 0) {
            ++this.d;
            if (this.d >= 80) {
                if (\u2603.bn() > 10.0f || aa == oj.d || (\u2603.bn() > 1.0f && aa == oj.c)) {
                    \u2603.a(ow.g, 1.0f);
                }
                this.d = 0;
            }
        }
        else {
            this.d = 0;
        }
    }
    
    public void a(final dn \u2603) {
        if (\u2603.b("foodLevel", 99)) {
            this.a = \u2603.f("foodLevel");
            this.d = \u2603.f("foodTickTimer");
            this.b = \u2603.h("foodSaturationLevel");
            this.c = \u2603.h("foodExhaustionLevel");
        }
    }
    
    public void b(final dn \u2603) {
        \u2603.a("foodLevel", this.a);
        \u2603.a("foodTickTimer", this.d);
        \u2603.a("foodSaturationLevel", this.b);
        \u2603.a("foodExhaustionLevel", this.c);
    }
    
    public int a() {
        return this.a;
    }
    
    public int b() {
        return this.e;
    }
    
    public boolean c() {
        return this.a < 20;
    }
    
    public void a(final float \u2603) {
        this.c = Math.min(this.c + \u2603, 40.0f);
    }
    
    public float e() {
        return this.b;
    }
    
    public void a(final int \u2603) {
        this.a = \u2603;
    }
    
    public void b(final float \u2603) {
        this.b = \u2603;
    }
}
