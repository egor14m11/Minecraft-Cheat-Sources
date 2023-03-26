// 
// Decompiled by Procyon v0.5.36
// 

public class te
{
    private final cj a;
    private final cj b;
    private final cq c;
    private int d;
    private boolean e;
    private int f;
    
    public te(final cj \u2603, final int \u2603, final int \u2603, final int \u2603) {
        this(\u2603, a(\u2603, \u2603), \u2603);
    }
    
    private static cq a(final int \u2603, final int \u2603) {
        if (\u2603 < 0) {
            return cq.e;
        }
        if (\u2603 > 0) {
            return cq.f;
        }
        if (\u2603 < 0) {
            return cq.c;
        }
        return cq.d;
    }
    
    public te(final cj \u2603, final cq \u2603, final int \u2603) {
        this.a = \u2603;
        this.c = \u2603;
        this.b = \u2603.a(\u2603, 2);
        this.d = \u2603;
    }
    
    public int b(final int \u2603, final int \u2603, final int \u2603) {
        return (int)this.a.c(\u2603, \u2603, \u2603);
    }
    
    public int a(final cj \u2603) {
        return (int)\u2603.i(this.d());
    }
    
    public int b(final cj \u2603) {
        return (int)this.b.i(\u2603);
    }
    
    public boolean c(final cj \u2603) {
        final int n = \u2603.n() - this.a.n();
        final int n2 = \u2603.p() - this.a.o();
        return n * this.c.g() + n2 * this.c.i() >= 0;
    }
    
    public void a() {
        this.f = 0;
    }
    
    public void b() {
        ++this.f;
    }
    
    public int c() {
        return this.f;
    }
    
    public cj d() {
        return this.a;
    }
    
    public cj e() {
        return this.b;
    }
    
    public int f() {
        return this.c.g() * 2;
    }
    
    public int g() {
        return this.c.i() * 2;
    }
    
    public int h() {
        return this.d;
    }
    
    public void a(final int \u2603) {
        this.d = \u2603;
    }
    
    public boolean i() {
        return this.e;
    }
    
    public void a(final boolean \u2603) {
        this.e = \u2603;
    }
}
