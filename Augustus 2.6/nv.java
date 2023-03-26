// 
// Decompiled by Procyon v0.5.36
// 

public class nv
{
    private float a;
    private float b;
    private float c;
    
    public float a(float \u2603, final float \u2603) {
        this.a += \u2603;
        \u2603 *= this.a - this.b;
        this.c += (\u2603 - this.c) * 0.5f;
        if ((\u2603 > 0.0f && \u2603 > this.c) || (\u2603 < 0.0f && \u2603 < this.c)) {
            \u2603 = this.c;
        }
        this.b += \u2603;
        return \u2603;
    }
    
    public void a() {
        this.a = 0.0f;
        this.b = 0.0f;
        this.c = 0.0f;
    }
}
