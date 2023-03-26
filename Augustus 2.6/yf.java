// 
// Decompiled by Procyon v0.5.36
// 

public class yf extends yg
{
    private final xp a;
    private final wn b;
    private int c;
    
    public yf(final wn \u2603, final xp \u2603, final og \u2603, final int \u2603, final int \u2603, final int \u2603) {
        super(\u2603, \u2603, \u2603, \u2603);
        this.b = \u2603;
        this.a = \u2603;
    }
    
    @Override
    public boolean a(final zx \u2603) {
        return false;
    }
    
    @Override
    public zx a(final int \u2603) {
        if (this.e()) {
            this.c += Math.min(\u2603, this.d().b);
        }
        return super.a(\u2603);
    }
    
    @Override
    protected void a(final zx \u2603, final int \u2603) {
        this.c += \u2603;
        this.c(\u2603);
    }
    
    @Override
    protected void c(final zx \u2603) {
        if (this.c > 0) {
            \u2603.a(this.b.o, this.b, this.c);
        }
        this.c = 0;
        if (\u2603.b() == zw.a(afi.ai)) {
            this.b.b(mr.h);
        }
        if (\u2603.b() instanceof aag) {
            this.b.b(mr.i);
        }
        if (\u2603.b() == zw.a(afi.al)) {
            this.b.b(mr.j);
        }
        if (\u2603.b() instanceof zv) {
            this.b.b(mr.l);
        }
        if (\u2603.b() == zy.P) {
            this.b.b(mr.m);
        }
        if (\u2603.b() == zy.aZ) {
            this.b.b(mr.n);
        }
        if (\u2603.b() instanceof aag && ((aag)\u2603.b()).g() != zw.a.a) {
            this.b.b(mr.o);
        }
        if (\u2603.b() instanceof aay) {
            this.b.b(mr.r);
        }
        if (\u2603.b() == zw.a(afi.bC)) {
            this.b.b(mr.E);
        }
        if (\u2603.b() == zw.a(afi.X)) {
            this.b.b(mr.G);
        }
        if (\u2603.b() == zy.ao && \u2603.i() == 1) {
            this.b.b(mr.M);
        }
    }
    
    @Override
    public void a(final wn \u2603, final zx \u2603) {
        this.c(\u2603);
        final zx[] b = abt.a().b(this.a, \u2603.o);
        for (int i = 0; i < b.length; ++i) {
            final zx a = this.a.a(i);
            final zx \u26032 = b[i];
            if (a != null) {
                this.a.a(i, 1);
            }
            if (\u26032 != null) {
                if (this.a.a(i) == null) {
                    this.a.a(i, \u26032);
                }
                else if (!this.b.bi.a(\u26032)) {
                    this.b.a(\u26032, false);
                }
            }
        }
    }
}
