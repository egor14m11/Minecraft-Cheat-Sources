import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public class agr extends afh
{
    public static boolean N;
    
    public agr() {
        super(arm.p);
        this.a(yz.b);
    }
    
    public agr(final arm \u2603) {
        super(\u2603);
    }
    
    @Override
    public void c(final adm \u2603, final cj \u2603, final alz \u2603) {
        \u2603.a(\u2603, this, this.a(\u2603));
    }
    
    @Override
    public void a(final adm \u2603, final cj \u2603, final alz \u2603, final afh \u2603) {
        \u2603.a(\u2603, this, this.a(\u2603));
    }
    
    @Override
    public void b(final adm \u2603, final cj \u2603, final alz \u2603, final Random \u2603) {
        if (!\u2603.D) {
            this.f(\u2603, \u2603);
        }
    }
    
    private void f(final adm \u2603, final cj \u2603) {
        if (!e(\u2603, \u2603.b()) || \u2603.o() < 0) {
            return;
        }
        final int n = 32;
        if (agr.N || !\u2603.a(\u2603.a(-n, -n, -n), \u2603.a(n, n, n))) {
            \u2603.g(\u2603);
            cj \u26032;
            for (\u26032 = \u2603.b(); e(\u2603, \u26032) && \u26032.o() > 0; \u26032 = \u26032.b()) {}
            if (\u26032.o() > 0) {
                \u2603.a(\u26032.a(), this.Q());
            }
        }
        else if (!\u2603.D) {
            final uy uy = new uy(\u2603, \u2603.n() + 0.5, \u2603.o(), \u2603.p() + 0.5, \u2603.p(\u2603));
            this.a(uy);
            \u2603.d(uy);
        }
    }
    
    protected void a(final uy \u2603) {
    }
    
    @Override
    public int a(final adm \u2603) {
        return 2;
    }
    
    public static boolean e(final adm \u2603, final cj \u2603) {
        final afh c = \u2603.p(\u2603).c();
        final arm j = c.J;
        return c == afi.ab || j == arm.a || j == arm.h || j == arm.i;
    }
    
    public void a_(final adm \u2603, final cj \u2603) {
    }
}
