// 
// Decompiled by Procyon v0.5.36
// 

public class rq extends rd
{
    private py a;
    private pr b;
    private double c;
    private double d;
    private double e;
    private double f;
    private float g;
    
    public rq(final py \u2603, final double \u2603, final float \u2603) {
        this.a = \u2603;
        this.f = \u2603;
        this.g = \u2603;
        this.a(1);
    }
    
    @Override
    public boolean a() {
        this.b = this.a.u();
        if (this.b == null) {
            return false;
        }
        if (this.b.h(this.a) > this.g * this.g) {
            return false;
        }
        final aui a = tc.a(this.a, 16, 7, new aui(this.b.s, this.b.t, this.b.u));
        if (a == null) {
            return false;
        }
        this.c = a.a;
        this.d = a.b;
        this.e = a.c;
        return true;
    }
    
    @Override
    public boolean b() {
        return !this.a.s().m() && this.b.ai() && this.b.h(this.a) < this.g * this.g;
    }
    
    @Override
    public void d() {
        this.b = null;
    }
    
    @Override
    public void c() {
        this.a.s().a(this.c, this.d, this.e, this.f);
    }
}
