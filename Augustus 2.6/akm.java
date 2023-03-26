import com.google.common.base.Predicate;

// 
// Decompiled by Procyon v0.5.36
// 

public class akm extends ajl
{
    public static final aml a;
    
    public akm() {
        this.j(this.M.b().a((amo<Comparable>)akm.a, cq.c));
    }
    
    @Override
    public void a(final adq \u2603, final cj \u2603) {
        final cq cq = \u2603.p(\u2603).b((amo<cq>)akm.a);
        final float n = 0.28125f;
        final float n2 = 0.78125f;
        final float n3 = 0.0f;
        final float n4 = 1.0f;
        final float n5 = 0.125f;
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
        switch (akm$1.a[cq.ordinal()]) {
            case 1: {
                this.a(n3, n, 1.0f - n5, n4, n2, 1.0f);
                break;
            }
            case 2: {
                this.a(n3, n, 0.0f, n4, n2, n5);
                break;
            }
            case 3: {
                this.a(1.0f - n5, n, n3, 1.0f, n2, n4);
                break;
            }
            case 4: {
                this.a(0.0f, n, n3, n5, n2, n4);
                break;
            }
        }
    }
    
    @Override
    public void a(final adm \u2603, final cj \u2603, final alz \u2603, final afh \u2603) {
        final cq cq = \u2603.b((amo<cq>)akm.a);
        if (!\u2603.p(\u2603.a(cq.d())).c().t().a()) {
            this.b(\u2603, \u2603, \u2603, 0);
            \u2603.g(\u2603);
        }
        super.a(\u2603, \u2603, \u2603, \u2603);
    }
    
    @Override
    public alz a(final int \u2603) {
        cq cq = cq.a(\u2603);
        if (cq.k() == cq.a.b) {
            cq = cq.c;
        }
        return this.Q().a((amo<Comparable>)akm.a, cq);
    }
    
    @Override
    public int c(final alz \u2603) {
        return \u2603.b((amo<cq>)akm.a).a();
    }
    
    @Override
    protected ama e() {
        return new ama(this, new amo[] { akm.a });
    }
    
    static {
        a = aml.a("facing", cq.c.a);
    }
}
