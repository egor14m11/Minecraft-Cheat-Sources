import com.google.common.base.Predicate;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.5.36
// 

public class ahr extends afh
{
    public static final aml a;
    
    protected ahr() {
        super(arm.q);
        this.j(this.M.b().a((amo<Comparable>)ahr.a, cq.c));
        this.a(yz.c);
    }
    
    @Override
    public aug a(final adm \u2603, final cj \u2603, final alz \u2603) {
        this.a((adq)\u2603, \u2603);
        return super.a(\u2603, \u2603, \u2603);
    }
    
    @Override
    public aug b(final adm \u2603, final cj \u2603) {
        this.a((adq)\u2603, \u2603);
        return super.b(\u2603, \u2603);
    }
    
    @Override
    public void a(final adq \u2603, final cj \u2603) {
        final alz p = \u2603.p(\u2603);
        if (p.c() != this) {
            return;
        }
        final float n = 0.125f;
        switch (ahr$1.a[p.b((amo<cq>)ahr.a).ordinal()]) {
            case 1: {
                this.a(0.0f, 0.0f, 1.0f - n, 1.0f, 1.0f, 1.0f);
                break;
            }
            case 2: {
                this.a(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, n);
                break;
            }
            case 3: {
                this.a(1.0f - n, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
                break;
            }
            default: {
                this.a(0.0f, 0.0f, 0.0f, n, 1.0f, 1.0f);
                break;
            }
        }
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
    public boolean d(final adm \u2603, final cj \u2603) {
        return \u2603.p(\u2603.e()).c().v() || \u2603.p(\u2603.f()).c().v() || \u2603.p(\u2603.c()).c().v() || \u2603.p(\u2603.d()).c().v();
    }
    
    @Override
    public alz a(final adm \u2603, final cj \u2603, final cq \u2603, final float \u2603, final float \u2603, final float \u2603, final int \u2603, final pr \u2603) {
        if (\u2603.k().c() && this.a(\u2603, \u2603, \u2603)) {
            return this.Q().a((amo<Comparable>)ahr.a, \u2603);
        }
        for (final cq \u26032 : cq.c.a) {
            if (this.a(\u2603, \u2603, \u26032)) {
                return this.Q().a((amo<Comparable>)ahr.a, \u26032);
            }
        }
        return this.Q();
    }
    
    @Override
    public void a(final adm \u2603, final cj \u2603, final alz \u2603, final afh \u2603) {
        final cq \u26032 = \u2603.b((amo<cq>)ahr.a);
        if (!this.a(\u2603, \u2603, \u26032)) {
            this.b(\u2603, \u2603, \u2603, 0);
            \u2603.g(\u2603);
        }
        super.a(\u2603, \u2603, \u2603, \u2603);
    }
    
    protected boolean a(final adm \u2603, final cj \u2603, final cq \u2603) {
        return \u2603.p(\u2603.a(\u2603.d())).c().v();
    }
    
    @Override
    public adf m() {
        return adf.c;
    }
    
    @Override
    public alz a(final int \u2603) {
        cq cq = cq.a(\u2603);
        if (cq.k() == cq.a.b) {
            cq = cq.c;
        }
        return this.Q().a((amo<Comparable>)ahr.a, cq);
    }
    
    @Override
    public int c(final alz \u2603) {
        return \u2603.b((amo<cq>)ahr.a).a();
    }
    
    @Override
    protected ama e() {
        return new ama(this, new amo[] { ahr.a });
    }
    
    static {
        a = aml.a("facing", cq.c.a);
    }
}
