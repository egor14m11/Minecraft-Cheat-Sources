// 
// Decompiled by Procyon v0.5.36
// 

public class nh
{
    private final long[] a;
    private int b;
    private int c;
    private int d;
    
    public nh() {
        this.a = new long[240];
    }
    
    public void a(final long \u2603) {
        this.a[this.d] = \u2603;
        ++this.d;
        if (this.d == 240) {
            this.d = 0;
        }
        if (this.c < 240) {
            this.b = 0;
            ++this.c;
        }
        else {
            this.b = this.b(this.d + 1);
        }
    }
    
    public int a(final long \u2603, final int \u2603) {
        final double n = \u2603 / 1.6666666E7;
        return (int)(n * \u2603);
    }
    
    public int a() {
        return this.b;
    }
    
    public int b() {
        return this.d;
    }
    
    public int b(final int \u2603) {
        return \u2603 % 240;
    }
    
    public long[] c() {
        return this.a;
    }
}
