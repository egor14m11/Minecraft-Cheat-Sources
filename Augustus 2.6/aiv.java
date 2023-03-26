import com.google.common.base.Predicate;

// 
// Decompiled by Procyon v0.5.36
// 

public class aiv extends age
{
    private amd a;
    private amd b;
    private amd N;
    private amd P;
    private static final Predicate<alz> Q;
    
    protected aiv() {
        super(arm.C, arn.q);
        this.j(this.M.b().a((amo<Comparable>)aiv.O, cq.c));
        this.a(true);
        this.a(yz.b);
    }
    
    @Override
    public void c(final adm \u2603, final cj \u2603, final alz \u2603) {
        super.c(\u2603, \u2603, \u2603);
        this.f(\u2603, \u2603);
    }
    
    public boolean e(final adm \u2603, final cj \u2603) {
        return this.l().a(\u2603, \u2603) != null || this.T().a(\u2603, \u2603) != null;
    }
    
    private void f(final adm \u2603, final cj \u2603) {
        amd.b b;
        if ((b = this.n().a(\u2603, \u2603)) != null) {
            for (int i = 0; i < this.n().b(); ++i) {
                final amc a = b.a(0, i, 0);
                \u2603.a(a.d(), afi.a.Q(), 2);
            }
            final tw \u26032 = new tw(\u2603);
            final cj d = b.a(0, 2, 0).d();
            \u26032.b(d.n() + 0.5, d.o() + 0.05, d.p() + 0.5, 0.0f, 0.0f);
            \u2603.d(\u26032);
            for (int j = 0; j < 120; ++j) {
                \u2603.a(cy.G, d.n() + \u2603.s.nextDouble(), d.o() + \u2603.s.nextDouble() * 2.5, d.p() + \u2603.s.nextDouble(), 0.0, 0.0, 0.0, new int[0]);
            }
            for (int j = 0; j < this.n().b(); ++j) {
                final amc a2 = b.a(0, j, 0);
                \u2603.b(a2.d(), afi.a);
            }
        }
        else if ((b = this.U().a(\u2603, \u2603)) != null) {
            for (int i = 0; i < this.U().c(); ++i) {
                for (int k = 0; k < this.U().b(); ++k) {
                    \u2603.a(b.a(i, k, 0).d(), afi.a.Q(), 2);
                }
            }
            final cj d2 = b.a(1, 2, 0).d();
            final ty \u26033 = new ty(\u2603);
            \u26033.l(true);
            \u26033.b(d2.n() + 0.5, d2.o() + 0.05, d2.p() + 0.5, 0.0f, 0.0f);
            \u2603.d(\u26033);
            for (int j = 0; j < 120; ++j) {
                \u2603.a(cy.F, d2.n() + \u2603.s.nextDouble(), d2.o() + \u2603.s.nextDouble() * 3.9, d2.p() + \u2603.s.nextDouble(), 0.0, 0.0, 0.0, new int[0]);
            }
            for (int j = 0; j < this.U().c(); ++j) {
                for (int l = 0; l < this.U().b(); ++l) {
                    final amc a3 = b.a(j, l, 0);
                    \u2603.b(a3.d(), afi.a);
                }
            }
        }
    }
    
    @Override
    public boolean d(final adm \u2603, final cj \u2603) {
        return \u2603.p(\u2603).c().J.j() && adm.a(\u2603, \u2603.b());
    }
    
    @Override
    public alz a(final adm \u2603, final cj \u2603, final cq \u2603, final float \u2603, final float \u2603, final float \u2603, final int \u2603, final pr \u2603) {
        return this.Q().a((amo<Comparable>)aiv.O, \u2603.aP().d());
    }
    
    @Override
    public alz a(final int \u2603) {
        return this.Q().a((amo<Comparable>)aiv.O, cq.b(\u2603));
    }
    
    @Override
    public int c(final alz \u2603) {
        return \u2603.b((amo<cq>)aiv.O).b();
    }
    
    @Override
    protected ama e() {
        return new ama(this, new amo[] { aiv.O });
    }
    
    protected amd l() {
        if (this.a == null) {
            this.a = ame.a().a(" ", "#", "#").a('#', amc.a(amh.a(afi.aJ))).b();
        }
        return this.a;
    }
    
    protected amd n() {
        if (this.b == null) {
            this.b = ame.a().a("^", "#", "#").a('^', amc.a(aiv.Q)).a('#', amc.a(amh.a(afi.aJ))).b();
        }
        return this.b;
    }
    
    protected amd T() {
        if (this.N == null) {
            this.N = ame.a().a("~ ~", "###", "~#~").a('#', amc.a(amh.a(afi.S))).a('~', amc.a(amh.a(afi.a))).b();
        }
        return this.N;
    }
    
    protected amd U() {
        if (this.P == null) {
            this.P = ame.a().a("~^~", "###", "~#~").a('^', amc.a(aiv.Q)).a('#', amc.a(amh.a(afi.S))).a('~', amc.a(amh.a(afi.a))).b();
        }
        return this.P;
    }
    
    static {
        Q = new Predicate<alz>() {
            public boolean a(final alz \u2603) {
                return \u2603 != null && (\u2603.c() == afi.aU || \u2603.c() == afi.aZ);
            }
        };
    }
}
