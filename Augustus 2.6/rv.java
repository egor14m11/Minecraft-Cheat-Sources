// 
// Decompiled by Procyon v0.5.36
// 

public class rv extends rd
{
    private py b;
    protected double a;
    private double c;
    private double d;
    private double e;
    
    public rv(final py \u2603, final double \u2603) {
        this.b = \u2603;
        this.a = \u2603;
        this.a(1);
    }
    
    @Override
    public boolean a() {
        if (this.b.bd() == null && !this.b.at()) {
            return false;
        }
        final aui a = tc.a(this.b, 5, 4);
        if (a == null) {
            return false;
        }
        this.c = a.a;
        this.d = a.b;
        this.e = a.c;
        return true;
    }
    
    @Override
    public void c() {
        this.b.s().a(this.c, this.d, this.e, this.a);
    }
    
    @Override
    public boolean b() {
        return !this.b.s().m();
    }
}
