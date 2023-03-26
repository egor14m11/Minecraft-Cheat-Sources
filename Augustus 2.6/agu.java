// 
// Decompiled by Procyon v0.5.36
// 

public class agu extends age
{
    public static final amk a;
    public static final amk b;
    public static final amk N;
    
    public agu(final aio.a \u2603) {
        super(arm.d, \u2603.c());
        this.j(this.M.b().a((amo<Comparable>)agu.a, false).a((amo<Comparable>)agu.b, false).a((amo<Comparable>)agu.N, false));
        this.a(yz.d);
    }
    
    @Override
    public alz a(alz \u2603, final adq \u2603, final cj \u2603) {
        final cq.a k = \u2603.b((amo<cq>)agu.O).k();
        if ((k == cq.a.c && (\u2603.p(\u2603.e()).c() == afi.bZ || \u2603.p(\u2603.f()).c() == afi.bZ)) || (k == cq.a.a && (\u2603.p(\u2603.c()).c() == afi.bZ || \u2603.p(\u2603.d()).c() == afi.bZ))) {
            \u2603 = \u2603.a((amo<Comparable>)agu.N, true);
        }
        return \u2603;
    }
    
    @Override
    public boolean d(final adm \u2603, final cj \u2603) {
        return \u2603.p(\u2603.b()).c().t().a() && super.d(\u2603, \u2603);
    }
    
    @Override
    public aug a(final adm \u2603, final cj \u2603, final alz \u2603) {
        if (\u2603.b((amo<Boolean>)agu.a)) {
            return null;
        }
        final cq.a k = \u2603.b((amo<cq>)agu.O).k();
        if (k == cq.a.c) {
            return new aug(\u2603.n(), \u2603.o(), \u2603.p() + 0.375f, \u2603.n() + 1, \u2603.o() + 1.5f, \u2603.p() + 0.625f);
        }
        return new aug(\u2603.n() + 0.375f, \u2603.o(), \u2603.p(), \u2603.n() + 0.625f, \u2603.o() + 1.5f, \u2603.p() + 1);
    }
    
    @Override
    public void a(final adq \u2603, final cj \u2603) {
        final cq.a k = \u2603.p(\u2603).b((amo<cq>)agu.O).k();
        if (k == cq.a.c) {
            this.a(0.0f, 0.0f, 0.375f, 1.0f, 1.0f, 0.625f);
        }
        else {
            this.a(0.375f, 0.0f, 0.0f, 0.625f, 1.0f, 1.0f);
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
    public boolean b(final adq \u2603, final cj \u2603) {
        return \u2603.p(\u2603).b((amo<Boolean>)agu.a);
    }
    
    @Override
    public alz a(final adm \u2603, final cj \u2603, final cq \u2603, final float \u2603, final float \u2603, final float \u2603, final int \u2603, final pr \u2603) {
        return this.Q().a((amo<Comparable>)agu.O, \u2603.aP()).a((amo<Comparable>)agu.a, false).a((amo<Comparable>)agu.b, false).a((amo<Comparable>)agu.N, false);
    }
    
    @Override
    public boolean a(final adm \u2603, final cj \u2603, alz \u2603, final wn \u2603, final cq \u2603, final float \u2603, final float \u2603, final float \u2603) {
        if (\u2603.b((amo<Boolean>)agu.a)) {
            \u2603 = \u2603.a((amo<Comparable>)agu.a, false);
            \u2603.a(\u2603, \u2603, 2);
        }
        else {
            final cq a = cq.a(\u2603.y);
            if (\u2603.b((amo<Comparable>)agu.O) == a.d()) {
                \u2603 = \u2603.a((amo<Comparable>)agu.O, a);
            }
            \u2603 = \u2603.a((amo<Comparable>)agu.a, true);
            \u2603.a(\u2603, \u2603, 2);
        }
        \u2603.a(\u2603, ((boolean)\u2603.b((amo<Boolean>)agu.a)) ? 1003 : 1006, \u2603, 0);
        return true;
    }
    
    @Override
    public void a(final adm \u2603, final cj \u2603, final alz \u2603, final afh \u2603) {
        if (\u2603.D) {
            return;
        }
        final boolean z = \u2603.z(\u2603);
        if (z || \u2603.i()) {
            if (z && !\u2603.b((amo<Boolean>)agu.a) && !\u2603.b((amo<Boolean>)agu.b)) {
                \u2603.a(\u2603, \u2603.a((amo<Comparable>)agu.a, true).a((amo<Comparable>)agu.b, true), 2);
                \u2603.a(null, 1003, \u2603, 0);
            }
            else if (!z && \u2603.b((amo<Boolean>)agu.a) && \u2603.b((amo<Boolean>)agu.b)) {
                \u2603.a(\u2603, \u2603.a((amo<Comparable>)agu.a, false).a((amo<Comparable>)agu.b, false), 2);
                \u2603.a(null, 1006, \u2603, 0);
            }
            else if (z != \u2603.b((amo<Boolean>)agu.b)) {
                \u2603.a(\u2603, \u2603.a((amo<Comparable>)agu.b, z), 2);
            }
        }
    }
    
    @Override
    public boolean a(final adq \u2603, final cj \u2603, final cq \u2603) {
        return true;
    }
    
    @Override
    public alz a(final int \u2603) {
        return this.Q().a((amo<Comparable>)agu.O, cq.b(\u2603)).a((amo<Comparable>)agu.a, (\u2603 & 0x4) != 0x0).a((amo<Comparable>)agu.b, (\u2603 & 0x8) != 0x0);
    }
    
    @Override
    public int c(final alz \u2603) {
        int n = 0;
        n |= \u2603.b((amo<cq>)agu.O).b();
        if (\u2603.b((amo<Boolean>)agu.b)) {
            n |= 0x8;
        }
        if (\u2603.b((amo<Boolean>)agu.a)) {
            n |= 0x4;
        }
        return n;
    }
    
    @Override
    protected ama e() {
        return new ama(this, new amo[] { agu.O, agu.a, agu.b, agu.N });
    }
    
    static {
        a = amk.a("open");
        b = amk.a("powered");
        N = amk.a("in_wall");
    }
}
