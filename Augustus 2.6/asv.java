// 
// Decompiled by Procyon v0.5.36
// 

public class asv
{
    public final int a;
    public final int b;
    public final int c;
    private final int j;
    int d;
    float e;
    float f;
    float g;
    asv h;
    public boolean i;
    
    public asv(final int \u2603, final int \u2603, final int \u2603) {
        this.d = -1;
        this.a = \u2603;
        this.b = \u2603;
        this.c = \u2603;
        this.j = a(\u2603, \u2603, \u2603);
    }
    
    public static int a(final int \u2603, final int \u2603, final int \u2603) {
        return (\u2603 & 0xFF) | (\u2603 & 0x7FFF) << 8 | (\u2603 & 0x7FFF) << 24 | ((\u2603 < 0) ? Integer.MIN_VALUE : 0) | ((\u2603 < 0) ? 32768 : 0);
    }
    
    public float a(final asv \u2603) {
        final float n = (float)(\u2603.a - this.a);
        final float n2 = (float)(\u2603.b - this.b);
        final float n3 = (float)(\u2603.c - this.c);
        return ns.c(n * n + n2 * n2 + n3 * n3);
    }
    
    public float b(final asv \u2603) {
        final float n = (float)(\u2603.a - this.a);
        final float n2 = (float)(\u2603.b - this.b);
        final float n3 = (float)(\u2603.c - this.c);
        return n * n + n2 * n2 + n3 * n3;
    }
    
    @Override
    public boolean equals(final Object \u2603) {
        if (\u2603 instanceof asv) {
            final asv asv = (asv)\u2603;
            return this.j == asv.j && this.a == asv.a && this.b == asv.b && this.c == asv.c;
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return this.j;
    }
    
    public boolean a() {
        return this.d >= 0;
    }
    
    @Override
    public String toString() {
        return this.a + ", " + this.b + ", " + this.c;
    }
}
