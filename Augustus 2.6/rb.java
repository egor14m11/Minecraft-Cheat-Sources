// 
// Decompiled by Procyon v0.5.36
// 

public class rb extends rd
{
    private qa d;
    private pr e;
    adm a;
    private double f;
    private sw g;
    private int h;
    float b;
    float c;
    private boolean i;
    
    public rb(final qa \u2603, final double \u2603, final float \u2603, final float \u2603) {
        this.d = \u2603;
        this.a = \u2603.o;
        this.f = \u2603;
        this.g = \u2603.s();
        this.c = \u2603;
        this.b = \u2603;
        this.a(3);
        if (!(\u2603.s() instanceof sv)) {
            throw new IllegalArgumentException("Unsupported mob type for FollowOwnerGoal");
        }
    }
    
    @Override
    public boolean a() {
        final pr co = this.d.co();
        if (co == null) {
            return false;
        }
        if (co instanceof wn && ((wn)co).v()) {
            return false;
        }
        if (this.d.cn()) {
            return false;
        }
        if (this.d.h(co) < this.c * this.c) {
            return false;
        }
        this.e = co;
        return true;
    }
    
    @Override
    public boolean b() {
        return !this.g.m() && this.d.h(this.e) > this.b * this.b && !this.d.cn();
    }
    
    @Override
    public void c() {
        this.h = 0;
        this.i = ((sv)this.d.s()).e();
        ((sv)this.d.s()).a(false);
    }
    
    @Override
    public void d() {
        this.e = null;
        this.g.n();
        ((sv)this.d.s()).a(true);
    }
    
    private boolean a(final cj \u2603) {
        final alz p = this.a.p(\u2603);
        final afh c = p.c();
        return c == afi.a || !c.d();
    }
    
    @Override
    public void e() {
        this.d.p().a(this.e, 10.0f, (float)this.d.bQ());
        if (this.d.cn()) {
            return;
        }
        if (--this.h > 0) {
            return;
        }
        this.h = 10;
        if (this.g.a(this.e, this.f)) {
            return;
        }
        if (this.d.cc()) {
            return;
        }
        if (this.d.h(this.e) < 144.0) {
            return;
        }
        final int n = ns.c(this.e.s) - 2;
        final int n2 = ns.c(this.e.u) - 2;
        final int c = ns.c(this.e.aR().b);
        for (int i = 0; i <= 4; ++i) {
            for (int j = 0; j <= 4; ++j) {
                if (i < 1 || j < 1 || i > 3 || j > 3) {
                    if (adm.a(this.a, new cj(n + i, c - 1, n2 + j)) && this.a(new cj(n + i, c, n2 + j)) && this.a(new cj(n + i, c + 1, n2 + j))) {
                        this.d.b(n + i + 0.5f, c, n2 + j + 0.5f, this.d.y, this.d.z);
                        this.g.n();
                        return;
                    }
                }
            }
        }
    }
}
