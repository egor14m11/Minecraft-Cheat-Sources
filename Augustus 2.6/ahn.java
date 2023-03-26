import com.google.common.base.Predicate;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class ahn extends afc
{
    public static final aml a;
    public static final amk b;
    
    public ahn() {
        super(arm.f, arn.m);
        this.j(this.M.b().a((amo<Comparable>)ahn.a, cq.a).a((amo<Comparable>)ahn.b, true));
        this.a(yz.d);
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
    }
    
    @Override
    public void a(final adq \u2603, final cj \u2603) {
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
    }
    
    @Override
    public void a(final adm \u2603, final cj \u2603, final alz \u2603, final aug \u2603, final List<aug> \u2603, final pk \u2603) {
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 0.625f, 1.0f);
        super.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        final float n = 0.125f;
        this.a(0.0f, 0.0f, 0.0f, n, 1.0f, 1.0f);
        super.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, n);
        super.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        this.a(1.0f - n, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
        super.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        this.a(0.0f, 0.0f, 1.0f - n, 1.0f, 1.0f, 1.0f);
        super.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
    }
    
    @Override
    public alz a(final adm \u2603, final cj \u2603, final cq \u2603, final float \u2603, final float \u2603, final float \u2603, final int \u2603, final pr \u2603) {
        cq cq = \u2603.d();
        if (cq == cq.b) {
            cq = cq.a;
        }
        return this.Q().a((amo<Comparable>)ahn.a, cq).a((amo<Comparable>)ahn.b, true);
    }
    
    @Override
    public akw a(final adm \u2603, final int \u2603) {
        return new alj();
    }
    
    @Override
    public void a(final adm \u2603, final cj \u2603, final alz \u2603, final pr \u2603, final zx \u2603) {
        super.a(\u2603, \u2603, \u2603, \u2603, \u2603);
        if (\u2603.s()) {
            final akw s = \u2603.s(\u2603);
            if (s instanceof alj) {
                ((alj)s).a(\u2603.q());
            }
        }
    }
    
    @Override
    public void c(final adm \u2603, final cj \u2603, final alz \u2603) {
        this.e(\u2603, \u2603, \u2603);
    }
    
    @Override
    public boolean a(final adm \u2603, final cj \u2603, final alz \u2603, final wn \u2603, final cq \u2603, final float \u2603, final float \u2603, final float \u2603) {
        if (\u2603.D) {
            return true;
        }
        final akw s = \u2603.s(\u2603);
        if (s instanceof alj) {
            \u2603.a((og)s);
            \u2603.b(na.P);
        }
        return true;
    }
    
    @Override
    public void a(final adm \u2603, final cj \u2603, final alz \u2603, final afh \u2603) {
        this.e(\u2603, \u2603, \u2603);
    }
    
    private void e(final adm \u2603, final cj \u2603, final alz \u2603) {
        final boolean b = !\u2603.z(\u2603);
        if (b != \u2603.b((amo<Boolean>)ahn.b)) {
            \u2603.a(\u2603, \u2603.a((amo<Comparable>)ahn.b, b), 4);
        }
    }
    
    @Override
    public void b(final adm \u2603, final cj \u2603, final alz \u2603) {
        final akw s = \u2603.s(\u2603);
        if (s instanceof alj) {
            oi.a(\u2603, \u2603, (og)s);
            \u2603.e(\u2603, this);
        }
        super.b(\u2603, \u2603, \u2603);
    }
    
    @Override
    public int b() {
        return 3;
    }
    
    @Override
    public boolean d() {
        return false;
    }
    
    @Override
    public boolean c() {
        return false;
    }
    
    @Override
    public boolean a(final adq \u2603, final cj \u2603, final cq \u2603) {
        return true;
    }
    
    public static cq b(final int \u2603) {
        return cq.a(\u2603 & 0x7);
    }
    
    public static boolean f(final int \u2603) {
        return (\u2603 & 0x8) != 0x8;
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
    public adf m() {
        return adf.b;
    }
    
    @Override
    public alz a(final int \u2603) {
        return this.Q().a((amo<Comparable>)ahn.a, b(\u2603)).a((amo<Comparable>)ahn.b, f(\u2603));
    }
    
    @Override
    public int c(final alz \u2603) {
        int n = 0;
        n |= \u2603.b((amo<cq>)ahn.a).a();
        if (!\u2603.b((amo<Boolean>)ahn.b)) {
            n |= 0x8;
        }
        return n;
    }
    
    @Override
    protected ama e() {
        return new ama(this, new amo[] { ahn.a, ahn.b });
    }
    
    static {
        a = aml.a("facing", new Predicate<cq>() {
            public boolean a(final cq \u2603) {
                return \u2603 != cq.b;
            }
        });
        b = amk.a("enabled");
    }
}
