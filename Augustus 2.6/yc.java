// 
// Decompiled by Procyon v0.5.36
// 

public class yc extends yg
{
    private final ya a;
    private wn b;
    private int c;
    private final acy h;
    
    public yc(final wn \u2603, final acy \u2603, final ya \u2603, final int \u2603, final int \u2603, final int \u2603) {
        super(\u2603, \u2603, \u2603, \u2603);
        this.b = \u2603;
        this.h = \u2603;
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
        \u2603.a(this.b.o, this.b, this.c);
        this.c = 0;
    }
    
    @Override
    public void a(final wn \u2603, final zx \u2603) {
        this.c(\u2603);
        final acz i = this.a.i();
        if (i != null) {
            zx a = this.a.a(0);
            zx a2 = this.a.a(1);
            if (this.a(i, a, a2) || this.a(i, a2, a)) {
                this.h.a(i);
                \u2603.b(na.G);
                if (a != null && a.b <= 0) {
                    a = null;
                }
                if (a2 != null && a2.b <= 0) {
                    a2 = null;
                }
                this.a.a(0, a);
                this.a.a(1, a2);
            }
        }
    }
    
    private boolean a(final acz \u2603, final zx \u2603, final zx \u2603) {
        final zx a = \u2603.a();
        final zx b = \u2603.b();
        if (\u2603 != null && \u2603.b() == a.b()) {
            if (b != null && \u2603 != null && b.b() == \u2603.b()) {
                \u2603.b -= a.b;
                \u2603.b -= b.b;
                return true;
            }
            if (b == null && \u2603 == null) {
                \u2603.b -= a.b;
                return true;
            }
        }
        return false;
    }
}
