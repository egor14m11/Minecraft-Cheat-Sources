// 
// Decompiled by Procyon v0.5.36
// 

public class sy extends sw
{
    public sy(final ps \u2603, final adm \u2603) {
        super(\u2603, \u2603);
    }
    
    @Override
    protected asy a() {
        return new asy(new asz());
    }
    
    @Override
    protected boolean b() {
        return this.o();
    }
    
    @Override
    protected aui c() {
        return new aui(this.b.s, this.b.t + this.b.K * 0.5, this.b.u);
    }
    
    @Override
    protected void l() {
        final aui c = this.c();
        final float n = this.b.J * this.b.J;
        final int n2 = 6;
        if (c.g(this.d.a(this.b, this.d.e())) < n) {
            this.d.a();
        }
        for (int i = Math.min(this.d.e() + n2, this.d.d() - 1); i > this.d.e(); --i) {
            final aui a = this.d.a(this.b, i);
            if (a.g(c) <= 36.0) {
                if (this.a(c, a, 0, 0, 0)) {
                    this.d.c(i);
                    break;
                }
            }
        }
        this.a(c);
    }
    
    @Override
    protected void d() {
        super.d();
    }
    
    @Override
    protected boolean a(final aui \u2603, final aui \u2603, final int \u2603, final int \u2603, final int \u2603) {
        final auh a = this.c.a(\u2603, new aui(\u2603.a, \u2603.b + this.b.K * 0.5, \u2603.c), false, true, false);
        return a == null || a.a == auh.a.a;
    }
}
