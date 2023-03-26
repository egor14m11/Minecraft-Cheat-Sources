// 
// Decompiled by Procyon v0.5.36
// 

public class ana
{
    public final byte[] a;
    private final int b;
    private final int c;
    
    public ana(final byte[] \u2603, final int \u2603) {
        this.a = \u2603;
        this.b = \u2603;
        this.c = \u2603 + 4;
    }
    
    public int a(final int \u2603, final int \u2603, final int \u2603) {
        final int n = \u2603 << this.c | \u2603 << this.b | \u2603;
        final int n2 = n >> 1;
        final int n3 = n & 0x1;
        if (n3 == 0) {
            return this.a[n2] & 0xF;
        }
        return this.a[n2] >> 4 & 0xF;
    }
}
