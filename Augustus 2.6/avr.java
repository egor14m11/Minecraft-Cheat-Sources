// 
// Decompiled by Procyon v0.5.36
// 

public class avr
{
    private final double a;
    private final double b;
    private int c;
    private int d;
    private int e;
    
    public avr(final ave \u2603) {
        this.c = \u2603.d;
        this.d = \u2603.e;
        this.e = 1;
        final boolean d = \u2603.d();
        int ak = \u2603.t.aK;
        if (ak == 0) {
            ak = 1000;
        }
        while (this.e < ak && this.c / (this.e + 1) >= 320 && this.d / (this.e + 1) >= 240) {
            ++this.e;
        }
        if (d && this.e % 2 != 0 && this.e != 1) {
            --this.e;
        }
        this.a = this.c / (double)this.e;
        this.b = this.d / (double)this.e;
        this.c = ns.f(this.a);
        this.d = ns.f(this.b);
    }
    
    public int a() {
        return this.c;
    }
    
    public int b() {
        return this.d;
    }
    
    public double c() {
        return this.a;
    }
    
    public double d() {
        return this.b;
    }
    
    public int e() {
        return this.e;
    }
}
