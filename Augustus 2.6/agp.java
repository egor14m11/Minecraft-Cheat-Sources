import com.google.common.base.Predicate;
import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public class agp extends afc
{
    public static final aml a;
    
    protected agp() {
        super(arm.e);
        this.j(this.M.b().a((amo<Comparable>)agp.a, cq.c));
        this.a(yz.c);
        this.a(0.0625f, 0.0f, 0.0625f, 0.9375f, 0.875f, 0.9375f);
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
        return 2;
    }
    
    @Override
    public zw a(final alz \u2603, final Random \u2603, final int \u2603) {
        return zw.a(afi.Z);
    }
    
    @Override
    public int a(final Random \u2603) {
        return 8;
    }
    
    @Override
    protected boolean I() {
        return true;
    }
    
    @Override
    public alz a(final adm \u2603, final cj \u2603, final cq \u2603, final float \u2603, final float \u2603, final float \u2603, final int \u2603, final pr \u2603) {
        return this.Q().a((amo<Comparable>)agp.a, \u2603.aP().d());
    }
    
    @Override
    public void a(final adm \u2603, final cj \u2603, final alz \u2603, final pr \u2603, final zx \u2603) {
        \u2603.a(\u2603, \u2603.a((amo<Comparable>)agp.a, \u2603.aP().d()), 2);
    }
    
    @Override
    public boolean a(final adm \u2603, final cj \u2603, final alz \u2603, final wn \u2603, final cq \u2603, final float \u2603, final float \u2603, final float \u2603) {
        final yd co = \u2603.co();
        final akw s = \u2603.s(\u2603);
        if (co == null || !(s instanceof alf)) {
            return true;
        }
        if (\u2603.p(\u2603.a()).c().v()) {
            return true;
        }
        if (\u2603.D) {
            return true;
        }
        co.a((alf)s);
        \u2603.a(co);
        \u2603.b(na.V);
        return true;
    }
    
    @Override
    public akw a(final adm \u2603, final int \u2603) {
        return new alf();
    }
    
    @Override
    public void c(final adm \u2603, final cj \u2603, final alz \u2603, final Random \u2603) {
        for (int i = 0; i < 3; ++i) {
            final int n = \u2603.nextInt(2) * 2 - 1;
            final int n2 = \u2603.nextInt(2) * 2 - 1;
            final double \u26032 = \u2603.n() + 0.5 + 0.25 * n;
            final double \u26033 = \u2603.o() + \u2603.nextFloat();
            final double \u26034 = \u2603.p() + 0.5 + 0.25 * n2;
            final double \u26035 = \u2603.nextFloat() * n;
            final double \u26036 = (\u2603.nextFloat() - 0.5) * 0.125;
            final double \u26037 = \u2603.nextFloat() * n2;
            \u2603.a(cy.y, \u26032, \u26033, \u26034, \u26035, \u26036, \u26037, new int[0]);
        }
    }
    
    @Override
    public alz a(final int \u2603) {
        cq cq = cq.a(\u2603);
        if (cq.k() == cq.a.b) {
            cq = cq.c;
        }
        return this.Q().a((amo<Comparable>)agp.a, cq);
    }
    
    @Override
    public int c(final alz \u2603) {
        return \u2603.b((amo<cq>)agp.a).a();
    }
    
    @Override
    protected ama e() {
        return new ama(this, new amo[] { agp.a });
    }
    
    static {
        a = aml.a("facing", cq.c.a);
    }
}
