// 
// Decompiled by Procyon v0.5.36
// 

public class cl implements ck
{
    private final adm a;
    private final cj b;
    
    public cl(final adm \u2603, final cj \u2603) {
        this.a = \u2603;
        this.b = \u2603;
    }
    
    @Override
    public adm i() {
        return this.a;
    }
    
    @Override
    public double a() {
        return this.b.n() + 0.5;
    }
    
    @Override
    public double b() {
        return this.b.o() + 0.5;
    }
    
    @Override
    public double c() {
        return this.b.p() + 0.5;
    }
    
    @Override
    public cj d() {
        return this.b;
    }
    
    @Override
    public int f() {
        final alz p = this.a.p(this.b);
        return p.c().c(p);
    }
    
    @Override
    public <T extends akw> T h() {
        return (T)this.a.s(this.b);
    }
}
