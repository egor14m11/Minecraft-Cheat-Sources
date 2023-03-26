// 
// Decompiled by Procyon v0.5.36
// 

public class rz extends rd
{
    private py a;
    private double b;
    private double c;
    private double d;
    private double e;
    private int f;
    private boolean g;
    
    public rz(final py \u2603, final double \u2603) {
        this(\u2603, \u2603, 120);
    }
    
    public rz(final py \u2603, final double \u2603, final int \u2603) {
        this.a = \u2603;
        this.e = \u2603;
        this.f = \u2603;
        this.a(1);
    }
    
    @Override
    public boolean a() {
        if (!this.g) {
            if (this.a.bh() >= 100) {
                return false;
            }
            if (this.a.bc().nextInt(this.f) != 0) {
                return false;
            }
        }
        final aui a = tc.a(this.a, 10, 7);
        if (a == null) {
            return false;
        }
        this.b = a.a;
        this.c = a.b;
        this.d = a.c;
        this.g = false;
        return true;
    }
    
    @Override
    public boolean b() {
        return !this.a.s().m();
    }
    
    @Override
    public void c() {
        this.a.s().a(this.b, this.c, this.d, this.e);
    }
    
    public void f() {
        this.g = true;
    }
    
    public void b(final int \u2603) {
        this.f = \u2603;
    }
}
