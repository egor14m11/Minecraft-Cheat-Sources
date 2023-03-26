// 
// Decompiled by Procyon v0.5.36
// 

public class ri extends rd
{
    protected ps a;
    protected pk b;
    protected float c;
    private int e;
    private float f;
    protected Class<? extends pk> d;
    
    public ri(final ps \u2603, final Class<? extends pk> \u2603, final float \u2603) {
        this.a = \u2603;
        this.d = \u2603;
        this.c = \u2603;
        this.f = 0.02f;
        this.a(2);
    }
    
    public ri(final ps \u2603, final Class<? extends pk> \u2603, final float \u2603, final float \u2603) {
        this.a = \u2603;
        this.d = \u2603;
        this.c = \u2603;
        this.f = \u2603;
        this.a(2);
    }
    
    @Override
    public boolean a() {
        if (this.a.bc().nextFloat() >= this.f) {
            return false;
        }
        if (this.a.u() != null) {
            this.b = this.a.u();
        }
        if (this.d == wn.class) {
            this.b = this.a.o.a(this.a, (double)this.c);
        }
        else {
            this.b = this.a.o.a((Class<? extends ps>)this.d, this.a.aR().b(this.c, 3.0, this.c), this.a);
        }
        return this.b != null;
    }
    
    @Override
    public boolean b() {
        return this.b.ai() && this.a.h(this.b) <= this.c * this.c && this.e > 0;
    }
    
    @Override
    public void c() {
        this.e = 40 + this.a.bc().nextInt(40);
    }
    
    @Override
    public void d() {
        this.b = null;
    }
    
    @Override
    public void e() {
        this.a.p().a(this.b.s, this.b.t + this.b.aS(), this.b.u, 10.0f, (float)this.a.bQ());
        --this.e;
    }
}
