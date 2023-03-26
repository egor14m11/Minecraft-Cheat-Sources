import com.google.common.base.Predicate;
import java.util.Random;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.5.36
// 

public class akf extends afh
{
    public static final aml a;
    
    protected akf() {
        super(arm.q);
        this.j(this.M.b().a((amo<Comparable>)akf.a, cq.b));
        this.a(true);
        this.a(yz.c);
    }
    
    @Override
    public aug a(final adm \u2603, final cj \u2603, final alz \u2603) {
        return null;
    }
    
    @Override
    public boolean c() {
        return false;
    }
    
    @Override
    public boolean d() {
        return false;
    }
    
    private boolean e(final adm \u2603, final cj \u2603) {
        if (adm.a(\u2603, \u2603)) {
            return true;
        }
        final afh c = \u2603.p(\u2603).c();
        return c instanceof agt || c == afi.w || c == afi.bZ || c == afi.cG;
    }
    
    @Override
    public boolean d(final adm \u2603, final cj \u2603) {
        for (final cq \u26032 : akf.a.c()) {
            if (this.a(\u2603, \u2603, \u26032)) {
                return true;
            }
        }
        return false;
    }
    
    private boolean a(final adm \u2603, final cj \u2603, final cq \u2603) {
        final cj a = \u2603.a(\u2603.d());
        final boolean c = \u2603.k().c();
        return (c && \u2603.d(a, true)) || (\u2603.equals(cq.b) && this.e(\u2603, a));
    }
    
    @Override
    public alz a(final adm \u2603, final cj \u2603, final cq \u2603, final float \u2603, final float \u2603, final float \u2603, final int \u2603, final pr \u2603) {
        if (this.a(\u2603, \u2603, \u2603)) {
            return this.Q().a((amo<Comparable>)akf.a, \u2603);
        }
        for (final cq cq : cq.c.a) {
            if (\u2603.d(\u2603.a(cq.d()), true)) {
                return this.Q().a((amo<Comparable>)akf.a, cq);
            }
        }
        return this.Q();
    }
    
    @Override
    public void c(final adm \u2603, final cj \u2603, final alz \u2603) {
        this.f(\u2603, \u2603, \u2603);
    }
    
    @Override
    public void a(final adm \u2603, final cj \u2603, final alz \u2603, final afh \u2603) {
        this.e(\u2603, \u2603, \u2603);
    }
    
    protected boolean e(final adm \u2603, final cj \u2603, final alz \u2603) {
        if (!this.f(\u2603, \u2603, \u2603)) {
            return true;
        }
        final cq cq = \u2603.b((amo<cq>)akf.a);
        final cq.a k = cq.k();
        final cq d = cq.d();
        boolean b = false;
        if (k.c() && !\u2603.d(\u2603.a(d), true)) {
            b = true;
        }
        else if (k.b() && !this.e(\u2603, \u2603.a(d))) {
            b = true;
        }
        if (b) {
            this.b(\u2603, \u2603, \u2603, 0);
            \u2603.g(\u2603);
            return true;
        }
        return false;
    }
    
    protected boolean f(final adm \u2603, final cj \u2603, final alz \u2603) {
        if (\u2603.c() == this && this.a(\u2603, \u2603, \u2603.b((amo<cq>)akf.a))) {
            return true;
        }
        if (\u2603.p(\u2603).c() == this) {
            this.b(\u2603, \u2603, \u2603, 0);
            \u2603.g(\u2603);
        }
        return false;
    }
    
    @Override
    public auh a(final adm \u2603, final cj \u2603, final aui \u2603, final aui \u2603) {
        final cq cq = \u2603.p(\u2603).b((amo<cq>)akf.a);
        float n = 0.15f;
        if (cq == cq.f) {
            this.a(0.0f, 0.2f, 0.5f - n, n * 2.0f, 0.8f, 0.5f + n);
        }
        else if (cq == cq.e) {
            this.a(1.0f - n * 2.0f, 0.2f, 0.5f - n, 1.0f, 0.8f, 0.5f + n);
        }
        else if (cq == cq.d) {
            this.a(0.5f - n, 0.2f, 0.0f, 0.5f + n, 0.8f, n * 2.0f);
        }
        else if (cq == cq.c) {
            this.a(0.5f - n, 0.2f, 1.0f - n * 2.0f, 0.5f + n, 0.8f, 1.0f);
        }
        else {
            n = 0.1f;
            this.a(0.5f - n, 0.0f, 0.5f - n, 0.5f + n, 0.6f, 0.5f + n);
        }
        return super.a(\u2603, \u2603, \u2603, \u2603);
    }
    
    @Override
    public void c(final adm \u2603, final cj \u2603, final alz \u2603, final Random \u2603) {
        final cq cq = \u2603.b((amo<cq>)akf.a);
        final double n = \u2603.n() + 0.5;
        final double n2 = \u2603.o() + 0.7;
        final double n3 = \u2603.p() + 0.5;
        final double n4 = 0.22;
        final double n5 = 0.27;
        if (cq.k().c()) {
            final cq d = cq.d();
            \u2603.a(cy.l, n + n5 * d.g(), n2 + n4, n3 + n5 * d.i(), 0.0, 0.0, 0.0, new int[0]);
            \u2603.a(cy.A, n + n5 * d.g(), n2 + n4, n3 + n5 * d.i(), 0.0, 0.0, 0.0, new int[0]);
        }
        else {
            \u2603.a(cy.l, n, n2, n3, 0.0, 0.0, 0.0, new int[0]);
            \u2603.a(cy.A, n, n2, n3, 0.0, 0.0, 0.0, new int[0]);
        }
    }
    
    @Override
    public adf m() {
        return adf.c;
    }
    
    @Override
    public alz a(final int \u2603) {
        alz alz = this.Q();
        switch (\u2603) {
            case 1: {
                alz = alz.a((amo<Comparable>)akf.a, cq.f);
                break;
            }
            case 2: {
                alz = alz.a((amo<Comparable>)akf.a, cq.e);
                break;
            }
            case 3: {
                alz = alz.a((amo<Comparable>)akf.a, cq.d);
                break;
            }
            case 4: {
                alz = alz.a((amo<Comparable>)akf.a, cq.c);
                break;
            }
            default: {
                alz = alz.a((amo<Comparable>)akf.a, cq.b);
                break;
            }
        }
        return alz;
    }
    
    @Override
    public int c(final alz \u2603) {
        int n = 0;
        switch (akf$2.a[\u2603.b((amo<cq>)akf.a).ordinal()]) {
            case 1: {
                n |= 0x1;
                break;
            }
            case 2: {
                n |= 0x2;
                break;
            }
            case 3: {
                n |= 0x3;
                break;
            }
            case 4: {
                n |= 0x4;
                break;
            }
            default: {
                n |= 0x5;
                break;
            }
        }
        return n;
    }
    
    @Override
    protected ama e() {
        return new ama(this, new amo[] { akf.a });
    }
    
    static {
        a = aml.a("facing", new Predicate<cq>() {
            public boolean a(final cq \u2603) {
                return \u2603 != cq.a;
            }
        });
    }
}
