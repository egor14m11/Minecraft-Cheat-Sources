// 
// Decompiled by Procyon v0.5.36
// 

public class aff extends afc
{
    public aff() {
        super(arm.s, arn.G);
        this.c(3.0f);
        this.a(yz.f);
    }
    
    @Override
    public akw a(final adm \u2603, final int \u2603) {
        return new akv();
    }
    
    @Override
    public boolean a(final adm \u2603, final cj \u2603, final alz \u2603, final wn \u2603, final cq \u2603, final float \u2603, final float \u2603, final float \u2603) {
        if (\u2603.D) {
            return true;
        }
        final akw s = \u2603.s(\u2603);
        if (s instanceof akv) {
            \u2603.a((og)s);
            \u2603.b(na.N);
        }
        return true;
    }
    
    @Override
    public boolean c() {
        return false;
    }
    
    @Override
    public boolean d() {
        return false;
    }
    
    @Override
    public int b() {
        return 3;
    }
    
    @Override
    public void a(final adm \u2603, final cj \u2603, final alz \u2603, final pr \u2603, final zx \u2603) {
        super.a(\u2603, \u2603, \u2603, \u2603, \u2603);
        if (\u2603.s()) {
            final akw s = \u2603.s(\u2603);
            if (s instanceof akv) {
                ((akv)s).a(\u2603.q());
            }
        }
    }
    
    @Override
    public void a(final adm \u2603, final cj \u2603, final alz \u2603, final afh \u2603) {
        final akw s = \u2603.s(\u2603);
        if (s instanceof akv) {
            ((akv)s).m();
            \u2603.c(\u2603, this, 1, 0);
        }
    }
    
    @Override
    public adf m() {
        return adf.c;
    }
    
    public static void f(final adm \u2603, final cj \u2603) {
        nj.a.submit((Runnable)new Runnable() {
            @Override
            public void run() {
                final amy f = \u2603.f(\u2603);
                for (int i = \u2603.o() - 1; i >= 0; --i) {
                    final cj cj = new cj(\u2603.n(), i, \u2603.p());
                    if (!f.d(cj)) {
                        break;
                    }
                    final alz p = \u2603.p(cj);
                    if (p.c() == afi.bY) {
                        ((le)\u2603).a(new Runnable() {
                            @Override
                            public void run() {
                                final akw s = \u2603.s(cj);
                                if (s instanceof akv) {
                                    ((akv)s).m();
                                    \u2603.c(cj, afi.bY, 1, 0);
                                }
                            }
                        });
                    }
                }
            }
        });
    }
}
