// 
// Decompiled by Procyon v0.5.36
// 

public class rr extends rd
{
    adm a;
    ps b;
    pr c;
    int d;
    
    public rr(final ps \u2603) {
        this.b = \u2603;
        this.a = \u2603.o;
        this.a(3);
    }
    
    @Override
    public boolean a() {
        final pr u = this.b.u();
        if (u == null) {
            return false;
        }
        this.c = u;
        return true;
    }
    
    @Override
    public boolean b() {
        return this.c.ai() && this.b.h(this.c) <= 225.0 && (!this.b.s().m() || this.a());
    }
    
    @Override
    public void d() {
        this.c = null;
        this.b.s().n();
    }
    
    @Override
    public void e() {
        this.b.p().a(this.c, 30.0f, 30.0f);
        final double n = this.b.J * 2.0f * (this.b.J * 2.0f);
        final double e = this.b.e(this.c.s, this.c.aR().b, this.c.u);
        double \u2603 = 0.8;
        if (e > n && e < 16.0) {
            \u2603 = 1.33;
        }
        else if (e < 225.0) {
            \u2603 = 0.6;
        }
        this.b.s().a(this.c, \u2603);
        this.d = Math.max(this.d - 1, 0);
        if (e > n) {
            return;
        }
        if (this.d > 0) {
            return;
        }
        this.d = 20;
        this.b.r(this.c);
    }
}
