import com.google.common.base.Predicate;
import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public class ahb extends afc
{
    public static final aml a;
    private final boolean b;
    private static boolean N;
    
    protected ahb(final boolean \u2603) {
        super(arm.e);
        this.j(this.M.b().a((amo<Comparable>)ahb.a, cq.c));
        this.b = \u2603;
    }
    
    @Override
    public zw a(final alz \u2603, final Random \u2603, final int \u2603) {
        return zw.a(afi.al);
    }
    
    @Override
    public void c(final adm \u2603, final cj \u2603, final alz \u2603) {
        this.e(\u2603, \u2603, \u2603);
    }
    
    private void e(final adm \u2603, final cj \u2603, final alz \u2603) {
        if (\u2603.D) {
            return;
        }
        final afh c = \u2603.p(\u2603.c()).c();
        final afh c2 = \u2603.p(\u2603.d()).c();
        final afh c3 = \u2603.p(\u2603.e()).c();
        final afh c4 = \u2603.p(\u2603.f()).c();
        cq cq = \u2603.b((amo<cq>)ahb.a);
        if (cq == cq.c && c.o() && !c2.o()) {
            cq = cq.d;
        }
        else if (cq == cq.d && c2.o() && !c.o()) {
            cq = cq.c;
        }
        else if (cq == cq.e && c3.o() && !c4.o()) {
            cq = cq.f;
        }
        else if (cq == cq.f && c4.o() && !c3.o()) {
            cq = cq.e;
        }
        \u2603.a(\u2603, \u2603.a((amo<Comparable>)ahb.a, cq), 2);
    }
    
    @Override
    public void c(final adm \u2603, final cj \u2603, final alz \u2603, final Random \u2603) {
        if (!this.b) {
            return;
        }
        final cq cq = \u2603.b((amo<cq>)ahb.a);
        final double n = \u2603.n() + 0.5;
        final double n2 = \u2603.o() + \u2603.nextDouble() * 6.0 / 16.0;
        final double n3 = \u2603.p() + 0.5;
        final double n4 = 0.52;
        final double n5 = \u2603.nextDouble() * 0.6 - 0.3;
        switch (ahb$1.a[cq.ordinal()]) {
            case 1: {
                \u2603.a(cy.l, n - n4, n2, n3 + n5, 0.0, 0.0, 0.0, new int[0]);
                \u2603.a(cy.A, n - n4, n2, n3 + n5, 0.0, 0.0, 0.0, new int[0]);
                break;
            }
            case 2: {
                \u2603.a(cy.l, n + n4, n2, n3 + n5, 0.0, 0.0, 0.0, new int[0]);
                \u2603.a(cy.A, n + n4, n2, n3 + n5, 0.0, 0.0, 0.0, new int[0]);
                break;
            }
            case 3: {
                \u2603.a(cy.l, n + n5, n2, n3 - n4, 0.0, 0.0, 0.0, new int[0]);
                \u2603.a(cy.A, n + n5, n2, n3 - n4, 0.0, 0.0, 0.0, new int[0]);
                break;
            }
            case 4: {
                \u2603.a(cy.l, n + n5, n2, n3 + n4, 0.0, 0.0, 0.0, new int[0]);
                \u2603.a(cy.A, n + n5, n2, n3 + n4, 0.0, 0.0, 0.0, new int[0]);
                break;
            }
        }
    }
    
    @Override
    public boolean a(final adm \u2603, final cj \u2603, final alz \u2603, final wn \u2603, final cq \u2603, final float \u2603, final float \u2603, final float \u2603) {
        if (\u2603.D) {
            return true;
        }
        final akw s = \u2603.s(\u2603);
        if (s instanceof alh) {
            \u2603.a((og)s);
            \u2603.b(na.Y);
        }
        return true;
    }
    
    public static void a(final boolean \u2603, final adm \u2603, final cj \u2603) {
        final alz p = \u2603.p(\u2603);
        final akw s = \u2603.s(\u2603);
        ahb.N = true;
        if (\u2603) {
            \u2603.a(\u2603, afi.am.Q().a((amo<Comparable>)ahb.a, (Comparable)p.b((amo<V>)ahb.a)), 3);
            \u2603.a(\u2603, afi.am.Q().a((amo<Comparable>)ahb.a, (Comparable)p.b((amo<V>)ahb.a)), 3);
        }
        else {
            \u2603.a(\u2603, afi.al.Q().a((amo<Comparable>)ahb.a, (Comparable)p.b((amo<V>)ahb.a)), 3);
            \u2603.a(\u2603, afi.al.Q().a((amo<Comparable>)ahb.a, (Comparable)p.b((amo<V>)ahb.a)), 3);
        }
        ahb.N = false;
        if (s != null) {
            s.D();
            \u2603.a(\u2603, s);
        }
    }
    
    @Override
    public akw a(final adm \u2603, final int \u2603) {
        return new alh();
    }
    
    @Override
    public alz a(final adm \u2603, final cj \u2603, final cq \u2603, final float \u2603, final float \u2603, final float \u2603, final int \u2603, final pr \u2603) {
        return this.Q().a((amo<Comparable>)ahb.a, \u2603.aP().d());
    }
    
    @Override
    public void a(final adm \u2603, final cj \u2603, final alz \u2603, final pr \u2603, final zx \u2603) {
        \u2603.a(\u2603, \u2603.a((amo<Comparable>)ahb.a, \u2603.aP().d()), 2);
        if (\u2603.s()) {
            final akw s = \u2603.s(\u2603);
            if (s instanceof alh) {
                ((alh)s).a(\u2603.q());
            }
        }
    }
    
    @Override
    public void b(final adm \u2603, final cj \u2603, final alz \u2603) {
        if (!ahb.N) {
            final akw s = \u2603.s(\u2603);
            if (s instanceof alh) {
                oi.a(\u2603, \u2603, (og)s);
                \u2603.e(\u2603, this);
            }
        }
        super.b(\u2603, \u2603, \u2603);
    }
    
    @Override
    public boolean O() {
        return true;
    }
    
    @Override
    public int l(final adm \u2603, final cj \u2603) {
        return xi.a(\u2603.s(\u2603));
    }
    
    @Override
    public zw c(final adm \u2603, final cj \u2603) {
        return zw.a(afi.al);
    }
    
    @Override
    public int b() {
        return 3;
    }
    
    @Override
    public alz b(final alz \u2603) {
        return this.Q().a((amo<Comparable>)ahb.a, cq.d);
    }
    
    @Override
    public alz a(final int \u2603) {
        cq cq = cq.a(\u2603);
        if (cq.k() == cq.a.b) {
            cq = cq.c;
        }
        return this.Q().a((amo<Comparable>)ahb.a, cq);
    }
    
    @Override
    public int c(final alz \u2603) {
        return \u2603.b((amo<cq>)ahb.a).a();
    }
    
    @Override
    protected ama e() {
        return new ama(this, new amo[] { ahb.a });
    }
    
    static {
        a = aml.a("facing", cq.c.a);
    }
}
