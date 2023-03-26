// 
// Decompiled by Procyon v0.5.36
// 

public class rp extends rd
{
    private py a;
    private double b;
    private double c;
    private double d;
    private double e;
    
    public rp(final py \u2603, final double \u2603) {
        this.a = \u2603;
        this.e = \u2603;
        this.a(1);
    }
    
    @Override
    public boolean a() {
        if (this.a.cg()) {
            return false;
        }
        final cj ch = this.a.ch();
        final aui a = tc.a(this.a, 16, 7, new aui(ch.n(), ch.o(), ch.p()));
        if (a == null) {
            return false;
        }
        this.b = a.a;
        this.c = a.b;
        this.d = a.c;
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
}
