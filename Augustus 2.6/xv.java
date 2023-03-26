// 
// Decompiled by Procyon v0.5.36
// 

public class xv extends yg
{
    private wn a;
    private int b;
    
    public xv(final wn \u2603, final og \u2603, final int \u2603, final int \u2603, final int \u2603) {
        super(\u2603, \u2603, \u2603, \u2603);
        this.a = \u2603;
    }
    
    @Override
    public boolean a(final zx \u2603) {
        return false;
    }
    
    @Override
    public zx a(final int \u2603) {
        if (this.e()) {
            this.b += Math.min(\u2603, this.d().b);
        }
        return super.a(\u2603);
    }
    
    @Override
    public void a(final wn \u2603, final zx \u2603) {
        this.c(\u2603);
        super.a(\u2603, \u2603);
    }
    
    @Override
    protected void a(final zx \u2603, final int \u2603) {
        this.b += \u2603;
        this.c(\u2603);
    }
    
    @Override
    protected void c(final zx \u2603) {
        \u2603.a(this.a.o, this.a, this.b);
        if (!this.a.o.D) {
            int i = this.b;
            final float b = abo.a().b(\u2603);
            if (b == 0.0f) {
                i = 0;
            }
            else if (b < 1.0f) {
                int \u26032 = ns.d(i * b);
                if (\u26032 < ns.f(i * b) && Math.random() < i * b - \u26032) {
                    ++\u26032;
                }
                i = \u26032;
            }
            while (i > 0) {
                final int \u26032 = pp.a(i);
                i -= \u26032;
                this.a.o.d(new pp(this.a.o, this.a.s, this.a.t + 0.5, this.a.u + 0.5, \u26032));
            }
        }
        this.b = 0;
        if (\u2603.b() == zy.j) {
            this.a.b(mr.k);
        }
        if (\u2603.b() == zy.aV) {
            this.a.b(mr.p);
        }
    }
}
