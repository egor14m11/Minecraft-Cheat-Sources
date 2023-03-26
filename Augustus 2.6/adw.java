// 
// Decompiled by Procyon v0.5.36
// 

public class adw implements Comparable<adw>
{
    private static long d;
    private final afh e;
    public final cj a;
    public long b;
    public int c;
    private long f;
    
    public adw(final cj \u2603, final afh \u2603) {
        this.f = adw.d++;
        this.a = \u2603;
        this.e = \u2603;
    }
    
    @Override
    public boolean equals(final Object \u2603) {
        if (\u2603 instanceof adw) {
            final adw adw = (adw)\u2603;
            return this.a.equals(adw.a) && afh.a(this.e, adw.e);
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return this.a.hashCode();
    }
    
    public adw a(final long \u2603) {
        this.b = \u2603;
        return this;
    }
    
    public void a(final int \u2603) {
        this.c = \u2603;
    }
    
    public int a(final adw \u2603) {
        if (this.b < \u2603.b) {
            return -1;
        }
        if (this.b > \u2603.b) {
            return 1;
        }
        if (this.c != \u2603.c) {
            return this.c - \u2603.c;
        }
        if (this.f < \u2603.f) {
            return -1;
        }
        if (this.f > \u2603.f) {
            return 1;
        }
        return 0;
    }
    
    @Override
    public String toString() {
        return afh.a(this.e) + ": " + this.a + ", " + this.b + ", " + this.c + ", " + this.f;
    }
    
    public afh a() {
        return this.e;
    }
}
