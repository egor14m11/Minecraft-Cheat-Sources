// 
// Decompiled by Procyon v0.5.36
// 

public class sh extends rd
{
    private py a;
    private double b;
    private double c;
    private double d;
    private double e;
    private double f;
    private double g;
    private wn h;
    private int i;
    private boolean j;
    private zw k;
    private boolean l;
    private boolean m;
    
    public sh(final py \u2603, final double \u2603, final zw \u2603, final boolean \u2603) {
        this.a = \u2603;
        this.b = \u2603;
        this.k = \u2603;
        this.l = \u2603;
        this.a(3);
        if (!(\u2603.s() instanceof sv)) {
            throw new IllegalArgumentException("Unsupported mob type for TemptGoal");
        }
    }
    
    @Override
    public boolean a() {
        if (this.i > 0) {
            --this.i;
            return false;
        }
        this.h = this.a.o.a(this.a, 10.0);
        if (this.h == null) {
            return false;
        }
        final zx bz = this.h.bZ();
        return bz != null && bz.b() == this.k;
    }
    
    @Override
    public boolean b() {
        if (this.l) {
            if (this.a.h(this.h) < 36.0) {
                if (this.h.e(this.c, this.d, this.e) > 0.010000000000000002) {
                    return false;
                }
                if (Math.abs(this.h.z - this.f) > 5.0 || Math.abs(this.h.y - this.g) > 5.0) {
                    return false;
                }
            }
            else {
                this.c = this.h.s;
                this.d = this.h.t;
                this.e = this.h.u;
            }
            this.f = this.h.z;
            this.g = this.h.y;
        }
        return this.a();
    }
    
    @Override
    public void c() {
        this.c = this.h.s;
        this.d = this.h.t;
        this.e = this.h.u;
        this.j = true;
        this.m = ((sv)this.a.s()).e();
        ((sv)this.a.s()).a(false);
    }
    
    @Override
    public void d() {
        this.h = null;
        this.a.s().n();
        this.i = 100;
        this.j = false;
        ((sv)this.a.s()).a(this.m);
    }
    
    @Override
    public void e() {
        this.a.p().a(this.h, 30.0f, (float)this.a.bQ());
        if (this.a.h(this.h) < 6.25) {
            this.a.s().n();
        }
        else {
            this.a.s().a(this.h, this.b);
        }
    }
    
    public boolean f() {
        return this.j;
    }
}
