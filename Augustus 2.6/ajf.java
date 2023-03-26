import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public class ajf extends agd
{
    public static final amk a;
    public static final amn b;
    
    protected ajf(final boolean \u2603) {
        super(\u2603);
        this.j(this.M.b().a((amo<Comparable>)ajf.O, cq.c).a((amo<Comparable>)ajf.b, 1).a((amo<Comparable>)ajf.a, false));
    }
    
    @Override
    public String f() {
        return di.a("item.diode.name");
    }
    
    @Override
    public alz a(final alz \u2603, final adq \u2603, final cj \u2603) {
        return \u2603.a((amo<Comparable>)ajf.a, this.b(\u2603, \u2603, \u2603));
    }
    
    @Override
    public boolean a(final adm \u2603, final cj \u2603, final alz \u2603, final wn \u2603, final cq \u2603, final float \u2603, final float \u2603, final float \u2603) {
        if (!\u2603.bA.e) {
            return false;
        }
        \u2603.a(\u2603, \u2603.a((amo<Comparable>)ajf.b), 3);
        return true;
    }
    
    @Override
    protected int d(final alz \u2603) {
        return \u2603.b((amo<Integer>)ajf.b) * 2;
    }
    
    @Override
    protected alz e(final alz \u2603) {
        final Integer n = \u2603.b((amo<Integer>)ajf.b);
        final Boolean b = \u2603.b((amo<Boolean>)ajf.a);
        final cq cq = \u2603.b((amo<cq>)ajf.O);
        return afi.bc.Q().a((amo<Comparable>)ajf.O, cq).a((amo<Comparable>)ajf.b, n).a((amo<Comparable>)ajf.a, b);
    }
    
    @Override
    protected alz k(final alz \u2603) {
        final Integer n = \u2603.b((amo<Integer>)ajf.b);
        final Boolean b = \u2603.b((amo<Boolean>)ajf.a);
        final cq cq = \u2603.b((amo<cq>)ajf.O);
        return afi.bb.Q().a((amo<Comparable>)ajf.O, cq).a((amo<Comparable>)ajf.b, n).a((amo<Comparable>)ajf.a, b);
    }
    
    @Override
    public zw a(final alz \u2603, final Random \u2603, final int \u2603) {
        return zy.bb;
    }
    
    @Override
    public zw c(final adm \u2603, final cj \u2603) {
        return zy.bb;
    }
    
    @Override
    public boolean b(final adq \u2603, final cj \u2603, final alz \u2603) {
        return this.c(\u2603, \u2603, \u2603) > 0;
    }
    
    @Override
    protected boolean c(final afh \u2603) {
        return agd.d(\u2603);
    }
    
    @Override
    public void c(final adm \u2603, final cj \u2603, final alz \u2603, final Random \u2603) {
        if (!this.N) {
            return;
        }
        final cq cq = \u2603.b((amo<cq>)ajf.O);
        final double n = \u2603.n() + 0.5f + (\u2603.nextFloat() - 0.5f) * 0.2;
        final double \u26032 = \u2603.o() + 0.4f + (\u2603.nextFloat() - 0.5f) * 0.2;
        final double n2 = \u2603.p() + 0.5f + (\u2603.nextFloat() - 0.5f) * 0.2;
        float n3 = -5.0f;
        if (\u2603.nextBoolean()) {
            n3 = (float)(\u2603.b((amo<Integer>)ajf.b) * 2 - 1);
        }
        n3 /= 16.0f;
        final double n4 = n3 * cq.g();
        final double n5 = n3 * cq.i();
        \u2603.a(cy.E, n + n4, \u26032, n2 + n5, 0.0, 0.0, 0.0, new int[0]);
    }
    
    @Override
    public void b(final adm \u2603, final cj \u2603, final alz \u2603) {
        super.b(\u2603, \u2603, \u2603);
        this.h(\u2603, \u2603, \u2603);
    }
    
    @Override
    public alz a(final int \u2603) {
        return this.Q().a((amo<Comparable>)ajf.O, cq.b(\u2603)).a((amo<Comparable>)ajf.a, false).a((amo<Comparable>)ajf.b, 1 + (\u2603 >> 2));
    }
    
    @Override
    public int c(final alz \u2603) {
        int n = 0;
        n |= \u2603.b((amo<cq>)ajf.O).b();
        n |= \u2603.b((amo<Integer>)ajf.b) - 1 << 2;
        return n;
    }
    
    @Override
    protected ama e() {
        return new ama(this, new amo[] { ajf.O, ajf.b, ajf.a });
    }
    
    static {
        a = amk.a("locked");
        b = amn.a("delay", 1, 4);
    }
}
