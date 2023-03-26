import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public class agm extends afc
{
    protected agm() {
        super(arm.e, arn.D);
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 0.75f, 1.0f);
        this.e(0);
        this.a(yz.c);
    }
    
    @Override
    public boolean d() {
        return false;
    }
    
    @Override
    public void c(final adm \u2603, final cj \u2603, final alz \u2603, final Random \u2603) {
        super.c(\u2603, \u2603, \u2603, \u2603);
        for (int i = -2; i <= 2; ++i) {
            for (int j = -2; j <= 2; ++j) {
                if (i > -2 && i < 2 && j == -1) {
                    j = 2;
                }
                if (\u2603.nextInt(16) == 0) {
                    for (int k = 0; k <= 1; ++k) {
                        final cj a = \u2603.a(i, k, j);
                        if (\u2603.p(a).c() == afi.X) {
                            if (!\u2603.d(\u2603.a(i / 2, 0, j / 2))) {
                                break;
                            }
                            \u2603.a(cy.z, \u2603.n() + 0.5, \u2603.o() + 2.0, \u2603.p() + 0.5, i + \u2603.nextFloat() - 0.5, k - \u2603.nextFloat() - 1.0f, j + \u2603.nextFloat() - 0.5, new int[0]);
                        }
                    }
                }
            }
        }
    }
    
    @Override
    public boolean c() {
        return false;
    }
    
    @Override
    public int b() {
        return 3;
    }
    
    @Override
    public akw a(final adm \u2603, final int \u2603) {
        return new ale();
    }
    
    @Override
    public boolean a(final adm \u2603, final cj \u2603, final alz \u2603, final wn \u2603, final cq \u2603, final float \u2603, final float \u2603, final float \u2603) {
        if (\u2603.D) {
            return true;
        }
        final akw s = \u2603.s(\u2603);
        if (s instanceof ale) {
            \u2603.a((ol)s);
        }
        return true;
    }
    
    @Override
    public void a(final adm \u2603, final cj \u2603, final alz \u2603, final pr \u2603, final zx \u2603) {
        super.a(\u2603, \u2603, \u2603, \u2603, \u2603);
        if (\u2603.s()) {
            final akw s = \u2603.s(\u2603);
            if (s instanceof ale) {
                ((ale)s).a(\u2603.q());
            }
        }
    }
}
