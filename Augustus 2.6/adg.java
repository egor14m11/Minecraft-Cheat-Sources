// 
// Decompiled by Procyon v0.5.36
// 

public class adg
{
    public final int a;
    public final int b;
    
    public adg(final int \u2603, final int \u2603) {
        this.a = \u2603;
        this.b = \u2603;
    }
    
    public static long a(final int \u2603, final int \u2603) {
        return ((long)\u2603 & 0xFFFFFFFFL) | ((long)\u2603 & 0xFFFFFFFFL) << 32;
    }
    
    @Override
    public int hashCode() {
        final int n = 1664525 * this.a + 1013904223;
        final int n2 = 1664525 * (this.b ^ 0xDEADBEEF) + 1013904223;
        return n ^ n2;
    }
    
    @Override
    public boolean equals(final Object \u2603) {
        if (this == \u2603) {
            return true;
        }
        if (\u2603 instanceof adg) {
            final adg adg = (adg)\u2603;
            return this.a == adg.a && this.b == adg.b;
        }
        return false;
    }
    
    public int a() {
        return (this.a << 4) + 8;
    }
    
    public int b() {
        return (this.b << 4) + 8;
    }
    
    public int c() {
        return this.a << 4;
    }
    
    public int d() {
        return this.b << 4;
    }
    
    public int e() {
        return (this.a << 4) + 15;
    }
    
    public int f() {
        return (this.b << 4) + 15;
    }
    
    public cj a(final int \u2603, final int \u2603, final int \u2603) {
        return new cj((this.a << 4) + \u2603, \u2603, (this.b << 4) + \u2603);
    }
    
    public cj a(final int \u2603) {
        return new cj(this.a(), \u2603, this.b());
    }
    
    @Override
    public String toString() {
        return "[" + this.a + ", " + this.b + "]";
    }
}
