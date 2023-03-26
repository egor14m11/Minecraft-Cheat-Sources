import java.util.Random;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class agn extends afc
{
    protected agn(final arm \u2603) {
        super(\u2603);
        this.a(1.0f);
    }
    
    @Override
    public akw a(final adm \u2603, final int \u2603) {
        return new alp();
    }
    
    @Override
    public void a(final adq \u2603, final cj \u2603) {
        final float \u26032 = 0.0625f;
        this.a(0.0f, 0.0f, 0.0f, 1.0f, \u26032, 1.0f);
    }
    
    @Override
    public boolean a(final adq \u2603, final cj \u2603, final cq \u2603) {
        return \u2603 == cq.a && super.a(\u2603, \u2603, \u2603);
    }
    
    @Override
    public void a(final adm \u2603, final cj \u2603, final alz \u2603, final aug \u2603, final List<aug> \u2603, final pk \u2603) {
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
    public int a(final Random \u2603) {
        return 0;
    }
    
    @Override
    public void a(final adm \u2603, final cj \u2603, final alz \u2603, final pk \u2603) {
        if (\u2603.m == null && \u2603.l == null && !\u2603.D) {
            \u2603.c(1);
        }
    }
    
    @Override
    public void c(final adm \u2603, final cj \u2603, final alz \u2603, final Random \u2603) {
        final double \u26032 = \u2603.n() + \u2603.nextFloat();
        final double \u26033 = \u2603.o() + 0.8f;
        final double \u26034 = \u2603.p() + \u2603.nextFloat();
        final double \u26035 = 0.0;
        final double \u26036 = 0.0;
        final double \u26037 = 0.0;
        \u2603.a(cy.l, \u26032, \u26033, \u26034, \u26035, \u26036, \u26037, new int[0]);
    }
    
    @Override
    public zw c(final adm \u2603, final cj \u2603) {
        return null;
    }
    
    @Override
    public arn g(final alz \u2603) {
        return arn.E;
    }
}
