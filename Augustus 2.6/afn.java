import java.util.List;
import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public abstract class afn extends afh
{
    public static final aml a;
    public static final amk b;
    private final boolean N;
    
    protected afn(final boolean \u2603) {
        super(arm.q);
        this.j(this.M.b().a((amo<Comparable>)afn.a, cq.c).a((amo<Comparable>)afn.b, false));
        this.a(true);
        this.a(yz.d);
        this.N = \u2603;
    }
    
    @Override
    public aug a(final adm \u2603, final cj \u2603, final alz \u2603) {
        return null;
    }
    
    @Override
    public int a(final adm \u2603) {
        return this.N ? 30 : 20;
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
    public boolean b(final adm \u2603, final cj \u2603, final cq \u2603) {
        return a(\u2603, \u2603, \u2603.d());
    }
    
    @Override
    public boolean d(final adm \u2603, final cj \u2603) {
        for (final cq \u26032 : cq.values()) {
            if (a(\u2603, \u2603, \u26032)) {
                return true;
            }
        }
        return false;
    }
    
    protected static boolean a(final adm \u2603, final cj \u2603, final cq \u2603) {
        final cj a = \u2603.a(\u2603);
        if (\u2603 == cq.a) {
            return adm.a(\u2603, a);
        }
        return \u2603.p(a).c().v();
    }
    
    @Override
    public alz a(final adm \u2603, final cj \u2603, final cq \u2603, final float \u2603, final float \u2603, final float \u2603, final int \u2603, final pr \u2603) {
        if (a(\u2603, \u2603, \u2603.d())) {
            return this.Q().a((amo<Comparable>)afn.a, \u2603).a((amo<Comparable>)afn.b, false);
        }
        return this.Q().a((amo<Comparable>)afn.a, cq.a).a((amo<Comparable>)afn.b, false);
    }
    
    @Override
    public void a(final adm \u2603, final cj \u2603, final alz \u2603, final afh \u2603) {
        if (this.e(\u2603, \u2603, \u2603) && !a(\u2603, \u2603, \u2603.b((amo<cq>)afn.a).d())) {
            this.b(\u2603, \u2603, \u2603, 0);
            \u2603.g(\u2603);
        }
    }
    
    private boolean e(final adm \u2603, final cj \u2603, final alz \u2603) {
        if (this.d(\u2603, \u2603)) {
            return true;
        }
        this.b(\u2603, \u2603, \u2603, 0);
        \u2603.g(\u2603);
        return false;
    }
    
    @Override
    public void a(final adq \u2603, final cj \u2603) {
        this.d(\u2603.p(\u2603));
    }
    
    private void d(final alz \u2603) {
        final cq cq = \u2603.b((amo<cq>)afn.a);
        final boolean booleanValue = \u2603.b((amo<Boolean>)afn.b);
        final float n = 0.25f;
        final float n2 = 0.375f;
        final float n3 = (booleanValue ? 1 : 2) / 16.0f;
        final float n4 = 0.125f;
        final float n5 = 0.1875f;
        switch (afn$1.a[cq.ordinal()]) {
            case 1: {
                this.a(0.0f, 0.375f, 0.3125f, n3, 0.625f, 0.6875f);
                break;
            }
            case 2: {
                this.a(1.0f - n3, 0.375f, 0.3125f, 1.0f, 0.625f, 0.6875f);
                break;
            }
            case 3: {
                this.a(0.3125f, 0.375f, 0.0f, 0.6875f, 0.625f, n3);
                break;
            }
            case 4: {
                this.a(0.3125f, 0.375f, 1.0f - n3, 0.6875f, 0.625f, 1.0f);
                break;
            }
            case 5: {
                this.a(0.3125f, 0.0f, 0.375f, 0.6875f, 0.0f + n3, 0.625f);
                break;
            }
            case 6: {
                this.a(0.3125f, 1.0f - n3, 0.375f, 0.6875f, 1.0f, 0.625f);
                break;
            }
        }
    }
    
    @Override
    public boolean a(final adm \u2603, final cj \u2603, final alz \u2603, final wn \u2603, final cq \u2603, final float \u2603, final float \u2603, final float \u2603) {
        if (\u2603.b((amo<Boolean>)afn.b)) {
            return true;
        }
        \u2603.a(\u2603, \u2603.a((amo<Comparable>)afn.b, true), 3);
        \u2603.b(\u2603, \u2603);
        \u2603.a(\u2603.n() + 0.5, \u2603.o() + 0.5, \u2603.p() + 0.5, "random.click", 0.3f, 0.6f);
        this.c(\u2603, \u2603, \u2603.b((amo<cq>)afn.a));
        \u2603.a(\u2603, this, this.a(\u2603));
        return true;
    }
    
    @Override
    public void b(final adm \u2603, final cj \u2603, final alz \u2603) {
        if (\u2603.b((amo<Boolean>)afn.b)) {
            this.c(\u2603, \u2603, \u2603.b((amo<cq>)afn.a));
        }
        super.b(\u2603, \u2603, \u2603);
    }
    
    @Override
    public int a(final adq \u2603, final cj \u2603, final alz \u2603, final cq \u2603) {
        return \u2603.b((amo<Boolean>)afn.b) ? 15 : 0;
    }
    
    @Override
    public int b(final adq \u2603, final cj \u2603, final alz \u2603, final cq \u2603) {
        if (!\u2603.b((amo<Boolean>)afn.b)) {
            return 0;
        }
        if (\u2603.b((amo<Comparable>)afn.a) == \u2603) {
            return 15;
        }
        return 0;
    }
    
    @Override
    public boolean i() {
        return true;
    }
    
    @Override
    public void a(final adm \u2603, final cj \u2603, final alz \u2603, final Random \u2603) {
    }
    
    @Override
    public void b(final adm \u2603, final cj \u2603, final alz \u2603, final Random \u2603) {
        if (\u2603.D) {
            return;
        }
        if (!\u2603.b((amo<Boolean>)afn.b)) {
            return;
        }
        if (this.N) {
            this.f(\u2603, \u2603, \u2603);
        }
        else {
            \u2603.a(\u2603, \u2603.a((amo<Comparable>)afn.b, false));
            this.c(\u2603, \u2603, \u2603.b((amo<cq>)afn.a));
            \u2603.a(\u2603.n() + 0.5, \u2603.o() + 0.5, \u2603.p() + 0.5, "random.click", 0.3f, 0.5f);
            \u2603.b(\u2603, \u2603);
        }
    }
    
    @Override
    public void j() {
        final float n = 0.1875f;
        final float n2 = 0.125f;
        final float n3 = 0.125f;
        this.a(0.5f - n, 0.5f - n2, 0.5f - n3, 0.5f + n, 0.5f + n2, 0.5f + n3);
    }
    
    @Override
    public void a(final adm \u2603, final cj \u2603, final alz \u2603, final pk \u2603) {
        if (\u2603.D) {
            return;
        }
        if (!this.N) {
            return;
        }
        if (\u2603.b((amo<Boolean>)afn.b)) {
            return;
        }
        this.f(\u2603, \u2603, \u2603);
    }
    
    private void f(final adm \u2603, final cj \u2603, final alz \u2603) {
        this.d(\u2603);
        final List<? extends pk> a = \u2603.a((Class<? extends pk>)wq.class, new aug(\u2603.n() + this.B, \u2603.o() + this.C, \u2603.p() + this.D, \u2603.n() + this.E, \u2603.o() + this.F, \u2603.p() + this.G));
        final boolean b = !a.isEmpty();
        final boolean booleanValue = \u2603.b((amo<Boolean>)afn.b);
        if (b && !booleanValue) {
            \u2603.a(\u2603, \u2603.a((amo<Comparable>)afn.b, true));
            this.c(\u2603, \u2603, \u2603.b((amo<cq>)afn.a));
            \u2603.b(\u2603, \u2603);
            \u2603.a(\u2603.n() + 0.5, \u2603.o() + 0.5, \u2603.p() + 0.5, "random.click", 0.3f, 0.6f);
        }
        if (!b && booleanValue) {
            \u2603.a(\u2603, \u2603.a((amo<Comparable>)afn.b, false));
            this.c(\u2603, \u2603, \u2603.b((amo<cq>)afn.a));
            \u2603.b(\u2603, \u2603);
            \u2603.a(\u2603.n() + 0.5, \u2603.o() + 0.5, \u2603.p() + 0.5, "random.click", 0.3f, 0.5f);
        }
        if (b) {
            \u2603.a(\u2603, this, this.a(\u2603));
        }
    }
    
    private void c(final adm \u2603, final cj \u2603, final cq \u2603) {
        \u2603.c(\u2603, this);
        \u2603.c(\u2603.a(\u2603.d()), this);
    }
    
    @Override
    public alz a(final int \u2603) {
        cq cq = null;
        switch (\u2603 & 0x7) {
            case 0: {
                cq = cq.a;
                break;
            }
            case 1: {
                cq = cq.f;
                break;
            }
            case 2: {
                cq = cq.e;
                break;
            }
            case 3: {
                cq = cq.d;
                break;
            }
            case 4: {
                cq = cq.c;
                break;
            }
            default: {
                cq = cq.b;
                break;
            }
        }
        return this.Q().a((amo<Comparable>)afn.a, cq).a((amo<Comparable>)afn.b, (\u2603 & 0x8) > 0);
    }
    
    @Override
    public int c(final alz \u2603) {
        int n = 0;
        switch (afn$1.a[\u2603.b((amo<cq>)afn.a).ordinal()]) {
            case 6: {
                n = 0;
                break;
            }
            case 1: {
                n = 1;
                break;
            }
            case 2: {
                n = 2;
                break;
            }
            case 3: {
                n = 3;
                break;
            }
            case 4: {
                n = 4;
                break;
            }
            default: {
                n = 5;
                break;
            }
        }
        if (\u2603.b((amo<Boolean>)afn.b)) {
            n |= 0x8;
        }
        return n;
    }
    
    @Override
    protected ama e() {
        return new ama(this, new amo[] { afn.a, afn.b });
    }
    
    static {
        a = aml.a("facing");
        b = amk.a("powered");
    }
}
