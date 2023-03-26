// 
// Decompiled by Procyon v0.5.36
// 

public class rm extends rd
{
    private py a;
    private te b;
    private int c;
    private int d;
    
    public rm(final py \u2603) {
        this.c = -1;
        this.d = -1;
        this.a = \u2603;
        this.a(1);
    }
    
    @Override
    public boolean a() {
        final cj \u2603 = new cj(this.a);
        if ((this.a.o.w() && (!this.a.o.S() || this.a.o.b(\u2603).e())) || this.a.o.t.o()) {
            return false;
        }
        if (this.a.bc().nextInt(50) != 0) {
            return false;
        }
        if (this.c != -1 && this.a.e(this.c, this.a.t, this.d) < 4.0) {
            return false;
        }
        final tf a = this.a.o.ae().a(\u2603, 14);
        if (a == null) {
            return false;
        }
        this.b = a.c(\u2603);
        return this.b != null;
    }
    
    @Override
    public boolean b() {
        return !this.a.s().m();
    }
    
    @Override
    public void c() {
        this.c = -1;
        final cj e = this.b.e();
        final int n = e.n();
        final int o = e.o();
        final int p = e.p();
        if (this.a.b(e) > 256.0) {
            final aui a = tc.a(this.a, 14, 3, new aui(n + 0.5, o, p + 0.5));
            if (a != null) {
                this.a.s().a(a.a, a.b, a.c, 1.0);
            }
        }
        else {
            this.a.s().a(n + 0.5, o, p + 0.5, 1.0);
        }
    }
    
    @Override
    public void d() {
        this.c = this.b.e().n();
        this.d = this.b.e().p();
        this.b = null;
    }
}
