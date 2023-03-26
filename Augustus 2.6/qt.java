// 
// Decompiled by Procyon v0.5.36
// 

public class qt extends rd
{
    private ua a;
    private wn b;
    private adm c;
    private float d;
    private int e;
    
    public qt(final ua \u2603, final float \u2603) {
        this.a = \u2603;
        this.c = \u2603.o;
        this.d = \u2603;
        this.a(2);
    }
    
    @Override
    public boolean a() {
        this.b = this.c.a(this.a, (double)this.d);
        return this.b != null && this.a(this.b);
    }
    
    @Override
    public boolean b() {
        return this.b.ai() && this.a.h(this.b) <= this.d * this.d && this.e > 0 && this.a(this.b);
    }
    
    @Override
    public void c() {
        this.a.p(true);
        this.e = 40 + this.a.bc().nextInt(40);
    }
    
    @Override
    public void d() {
        this.a.p(false);
        this.b = null;
    }
    
    @Override
    public void e() {
        this.a.p().a(this.b.s, this.b.t + this.b.aS(), this.b.u, 10.0f, (float)this.a.bQ());
        --this.e;
    }
    
    private boolean a(final wn \u2603) {
        final zx h = \u2603.bi.h();
        return h != null && ((!this.a.cl() && h.b() == zy.aX) || this.a.d(h));
    }
}
