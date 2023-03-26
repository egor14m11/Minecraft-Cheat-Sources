import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public class agj extends afh
{
    public agj() {
        super(arm.D, arn.E);
        this.a(0.0625f, 0.0f, 0.0625f, 0.9375f, 1.0f, 0.9375f);
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
        this.e(\u2603, \u2603);
    }
    
    private void e(final adm \u2603, final cj \u2603) {
        if (!agr.e(\u2603, \u2603.b()) || \u2603.o() < 0) {
            return;
        }
        final int n = 32;
        if (agr.N || !\u2603.a(\u2603.a(-n, -n, -n), \u2603.a(n, n, n))) {
            \u2603.g(\u2603);
            cj b;
            for (b = \u2603; agr.e(\u2603, b) && b.o() > 0; b = b.b()) {}
            if (b.o() > 0) {
                \u2603.a(b, this.Q(), 2);
            }
        }
        else {
            \u2603.d(new uy(\u2603, \u2603.n() + 0.5f, \u2603.o(), \u2603.p() + 0.5f, this.Q()));
        }
    }
    
    @Override
    public boolean a(final adm \u2603, final cj \u2603, final alz \u2603, final wn \u2603, final cq \u2603, final float \u2603, final float \u2603, final float \u2603) {
        this.f(\u2603, \u2603);
        return true;
    }
    
    @Override
    public void a(final adm \u2603, final cj \u2603, final wn \u2603) {
        this.f(\u2603, \u2603);
    }
    
    private void f(final adm \u2603, final cj \u2603) {
        final alz p = \u2603.p(\u2603);
        if (p.c() != this) {
            return;
        }
        for (int i = 0; i < 1000; ++i) {
            final cj a = \u2603.a(\u2603.s.nextInt(16) - \u2603.s.nextInt(16), \u2603.s.nextInt(8) - \u2603.s.nextInt(8), \u2603.s.nextInt(16) - \u2603.s.nextInt(16));
            if (\u2603.p(a).c().J == arm.a) {
                if (\u2603.D) {
                    for (int j = 0; j < 128; ++j) {
                        final double nextDouble = \u2603.s.nextDouble();
                        final float n = (\u2603.s.nextFloat() - 0.5f) * 0.2f;
                        final float n2 = (\u2603.s.nextFloat() - 0.5f) * 0.2f;
                        final float n3 = (\u2603.s.nextFloat() - 0.5f) * 0.2f;
                        final double \u26032 = a.n() + (\u2603.n() - a.n()) * nextDouble + (\u2603.s.nextDouble() - 0.5) * 1.0 + 0.5;
                        final double \u26033 = a.o() + (\u2603.o() - a.o()) * nextDouble + \u2603.s.nextDouble() * 1.0 - 0.5;
                        final double \u26034 = a.p() + (\u2603.p() - a.p()) * nextDouble + (\u2603.s.nextDouble() - 0.5) * 1.0 + 0.5;
                        \u2603.a(cy.y, \u26032, \u26033, \u26034, n, n2, n3, new int[0]);
                    }
                }
                else {
                    \u2603.a(a, p, 2);
                    \u2603.g(\u2603);
                }
                return;
            }
        }
    }
    
    @Override
    public int a(final adm \u2603) {
        return 5;
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
    public boolean a(final adq \u2603, final cj \u2603, final cq \u2603) {
        return true;
    }
    
    @Override
    public zw c(final adm \u2603, final cj \u2603) {
        return null;
    }
}
