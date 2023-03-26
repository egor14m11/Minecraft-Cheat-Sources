import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public class aja extends afh
{
    private final boolean a;
    
    public aja(final boolean \u2603) {
        super(arm.e);
        if (\u2603) {
            this.a(true);
        }
        this.a = \u2603;
    }
    
    @Override
    public int a(final adm \u2603) {
        return 30;
    }
    
    @Override
    public void a(final adm \u2603, final cj \u2603, final wn \u2603) {
        this.e(\u2603, \u2603);
        super.a(\u2603, \u2603, \u2603);
    }
    
    @Override
    public void a(final adm \u2603, final cj \u2603, final pk \u2603) {
        this.e(\u2603, \u2603);
        super.a(\u2603, \u2603, \u2603);
    }
    
    @Override
    public boolean a(final adm \u2603, final cj \u2603, final alz \u2603, final wn \u2603, final cq \u2603, final float \u2603, final float \u2603, final float \u2603) {
        this.e(\u2603, \u2603);
        return super.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
    }
    
    private void e(final adm \u2603, final cj \u2603) {
        this.f(\u2603, \u2603);
        if (this == afi.aC) {
            \u2603.a(\u2603, afi.aD.Q());
        }
    }
    
    @Override
    public void b(final adm \u2603, final cj \u2603, final alz \u2603, final Random \u2603) {
        if (this == afi.aD) {
            \u2603.a(\u2603, afi.aC.Q());
        }
    }
    
    @Override
    public zw a(final alz \u2603, final Random \u2603, final int \u2603) {
        return zy.aC;
    }
    
    @Override
    public int a(final int \u2603, final Random \u2603) {
        return this.a(\u2603) + \u2603.nextInt(\u2603 + 1);
    }
    
    @Override
    public int a(final Random \u2603) {
        return 4 + \u2603.nextInt(2);
    }
    
    @Override
    public void a(final adm \u2603, final cj \u2603, final alz \u2603, final float \u2603, final int \u2603) {
        super.a(\u2603, \u2603, \u2603, \u2603, \u2603);
        if (this.a(\u2603, \u2603.s, \u2603) != zw.a(this)) {
            final int \u26032 = 1 + \u2603.s.nextInt(5);
            this.b(\u2603, \u2603, \u26032);
        }
    }
    
    @Override
    public void c(final adm \u2603, final cj \u2603, final alz \u2603, final Random \u2603) {
        if (this.a) {
            this.f(\u2603, \u2603);
        }
    }
    
    private void f(final adm \u2603, final cj \u2603) {
        final Random s = \u2603.s;
        final double n = 0.0625;
        for (int i = 0; i < 6; ++i) {
            double \u26032 = \u2603.n() + s.nextFloat();
            double \u26033 = \u2603.o() + s.nextFloat();
            double \u26034 = \u2603.p() + s.nextFloat();
            if (i == 0 && !\u2603.p(\u2603.a()).c().c()) {
                \u26033 = \u2603.o() + n + 1.0;
            }
            if (i == 1 && !\u2603.p(\u2603.b()).c().c()) {
                \u26033 = \u2603.o() - n;
            }
            if (i == 2 && !\u2603.p(\u2603.d()).c().c()) {
                \u26034 = \u2603.p() + n + 1.0;
            }
            if (i == 3 && !\u2603.p(\u2603.c()).c().c()) {
                \u26034 = \u2603.p() - n;
            }
            if (i == 4 && !\u2603.p(\u2603.f()).c().c()) {
                \u26032 = \u2603.n() + n + 1.0;
            }
            if (i == 5 && !\u2603.p(\u2603.e()).c().c()) {
                \u26032 = \u2603.n() - n;
            }
            if (\u26032 < \u2603.n() || \u26032 > \u2603.n() + 1 || \u26033 < 0.0 || \u26033 > \u2603.o() + 1 || \u26034 < \u2603.p() || \u26034 > \u2603.p() + 1) {
                \u2603.a(cy.E, \u26032, \u26033, \u26034, 0.0, 0.0, 0.0, new int[0]);
            }
        }
    }
    
    @Override
    protected zx i(final alz \u2603) {
        return new zx(afi.aC);
    }
}
