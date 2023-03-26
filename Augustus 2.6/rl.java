// 
// Decompiled by Procyon v0.5.36
// 

public class rl extends rd
{
    adm a;
    protected py b;
    int c;
    double d;
    boolean e;
    asx f;
    Class<? extends pk> g;
    private int h;
    private double i;
    private double j;
    private double k;
    
    public rl(final py \u2603, final Class<? extends pk> \u2603, final double \u2603, final boolean \u2603) {
        this(\u2603, \u2603, \u2603);
        this.g = \u2603;
    }
    
    public rl(final py \u2603, final double \u2603, final boolean \u2603) {
        this.b = \u2603;
        this.a = \u2603.o;
        this.d = \u2603;
        this.e = \u2603;
        this.a(3);
    }
    
    @Override
    public boolean a() {
        final pr u = this.b.u();
        if (u == null) {
            return false;
        }
        if (!u.ai()) {
            return false;
        }
        if (this.g != null && !this.g.isAssignableFrom(u.getClass())) {
            return false;
        }
        this.f = this.b.s().a(u);
        return this.f != null;
    }
    
    @Override
    public boolean b() {
        final pr u = this.b.u();
        if (u == null) {
            return false;
        }
        if (!u.ai()) {
            return false;
        }
        if (!this.e) {
            return !this.b.s().m();
        }
        return this.b.e(new cj(u));
    }
    
    @Override
    public void c() {
        this.b.s().a(this.f, this.d);
        this.h = 0;
    }
    
    @Override
    public void d() {
        this.b.s().n();
    }
    
    @Override
    public void e() {
        final pr u = this.b.u();
        this.b.p().a(u, 30.0f, 30.0f);
        final double e = this.b.e(u.s, u.aR().b, u.u);
        final double a = this.a(u);
        --this.h;
        if ((this.e || this.b.t().a(u)) && this.h <= 0 && ((this.i == 0.0 && this.j == 0.0 && this.k == 0.0) || u.e(this.i, this.j, this.k) >= 1.0 || this.b.bc().nextFloat() < 0.05f)) {
            this.i = u.s;
            this.j = u.aR().b;
            this.k = u.u;
            this.h = 4 + this.b.bc().nextInt(7);
            if (e > 1024.0) {
                this.h += 10;
            }
            else if (e > 256.0) {
                this.h += 5;
            }
            if (!this.b.s().a(u, this.d)) {
                this.h += 15;
            }
        }
        this.c = Math.max(this.c - 1, 0);
        if (e <= a && this.c <= 0) {
            this.c = 20;
            if (this.b.bA() != null) {
                this.b.bw();
            }
            this.b.r(u);
        }
    }
    
    protected double a(final pr \u2603) {
        return this.b.J * 2.0f * (this.b.J * 2.0f) + \u2603.J;
    }
}
