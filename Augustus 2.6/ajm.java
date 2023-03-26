import java.util.Iterator;
import java.util.Random;
import com.google.common.base.Predicate;

// 
// Decompiled by Procyon v0.5.36
// 

public class ajm extends afc
{
    public static final aml a;
    public static final amk b;
    private static final Predicate<amc> N;
    private amd O;
    private amd P;
    
    protected ajm() {
        super(arm.q);
        this.j(this.M.b().a((amo<Comparable>)ajm.a, cq.c).a((amo<Comparable>)ajm.b, false));
        this.a(0.25f, 0.0f, 0.25f, 0.75f, 0.5f, 0.75f);
    }
    
    @Override
    public String f() {
        return di.a("tile.skull.skeleton.name");
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
    public void a(final adq \u2603, final cj \u2603) {
        switch (ajm$2.a[\u2603.p(\u2603).b((amo<cq>)ajm.a).ordinal()]) {
            default: {
                this.a(0.25f, 0.0f, 0.25f, 0.75f, 0.5f, 0.75f);
                break;
            }
            case 2: {
                this.a(0.25f, 0.25f, 0.5f, 0.75f, 0.75f, 1.0f);
                break;
            }
            case 3: {
                this.a(0.25f, 0.25f, 0.0f, 0.75f, 0.75f, 0.5f);
                break;
            }
            case 4: {
                this.a(0.5f, 0.25f, 0.25f, 1.0f, 0.75f, 0.75f);
                break;
            }
            case 5: {
                this.a(0.0f, 0.25f, 0.25f, 0.5f, 0.75f, 0.75f);
                break;
            }
        }
    }
    
    @Override
    public aug a(final adm \u2603, final cj \u2603, final alz \u2603) {
        this.a((adq)\u2603, \u2603);
        return super.a(\u2603, \u2603, \u2603);
    }
    
    @Override
    public alz a(final adm \u2603, final cj \u2603, final cq \u2603, final float \u2603, final float \u2603, final float \u2603, final int \u2603, final pr \u2603) {
        return this.Q().a((amo<Comparable>)ajm.a, \u2603.aP()).a((amo<Comparable>)ajm.b, false);
    }
    
    @Override
    public akw a(final adm \u2603, final int \u2603) {
        return new alo();
    }
    
    @Override
    public zw c(final adm \u2603, final cj \u2603) {
        return zy.bX;
    }
    
    @Override
    public int j(final adm \u2603, final cj \u2603) {
        final akw s = \u2603.s(\u2603);
        if (s instanceof alo) {
            return ((alo)s).c();
        }
        return super.j(\u2603, \u2603);
    }
    
    @Override
    public void a(final adm \u2603, final cj \u2603, final alz \u2603, final float \u2603, final int \u2603) {
    }
    
    @Override
    public void a(final adm \u2603, final cj \u2603, alz \u2603, final wn \u2603) {
        if (\u2603.bA.d) {
            \u2603 = \u2603.a((amo<Comparable>)ajm.b, true);
            \u2603.a(\u2603, \u2603, 4);
        }
        super.a(\u2603, \u2603, \u2603, \u2603);
    }
    
    @Override
    public void b(final adm \u2603, final cj \u2603, final alz \u2603) {
        if (\u2603.D) {
            return;
        }
        if (!\u2603.b((amo<Boolean>)ajm.b)) {
            final akw s = \u2603.s(\u2603);
            if (s instanceof alo) {
                final alo alo = (alo)s;
                final zx \u26032 = new zx(zy.bX, 1, this.j(\u2603, \u2603));
                if (alo.c() == 3 && alo.b() != null) {
                    \u26032.d(new dn());
                    final dn dn = new dn();
                    dy.a(dn, alo.b());
                    \u26032.o().a("SkullOwner", dn);
                }
                afh.a(\u2603, \u2603, \u26032);
            }
        }
        super.b(\u2603, \u2603, \u2603);
    }
    
    @Override
    public zw a(final alz \u2603, final Random \u2603, final int \u2603) {
        return zy.bX;
    }
    
    public boolean b(final adm \u2603, final cj \u2603, final zx \u2603) {
        return \u2603.i() == 1 && \u2603.o() >= 2 && \u2603.aa() != oj.a && !\u2603.D && this.l().a(\u2603, \u2603) != null;
    }
    
    public void a(final adm \u2603, final cj \u2603, final alo \u2603) {
        if (\u2603.c() != 1 || \u2603.o() < 2 || \u2603.aa() == oj.a || \u2603.D) {
            return;
        }
        final amd n = this.n();
        final amd.b a = n.a(\u2603, \u2603);
        if (a == null) {
            return;
        }
        for (int i = 0; i < 3; ++i) {
            final amc a2 = a.a(i, 0, 0);
            \u2603.a(a2.d(), a2.a().a((amo<Comparable>)ajm.b, true), 2);
        }
        for (int i = 0; i < n.c(); ++i) {
            for (int j = 0; j < n.b(); ++j) {
                final amc a3 = a.a(i, j, 0);
                \u2603.a(a3.d(), afi.a.Q(), 2);
            }
        }
        final cj d = a.a(1, 0, 0).d();
        final uk \u26032 = new uk(\u2603);
        final cj d2 = a.a(1, 2, 0).d();
        \u26032.b(d2.n() + 0.5, d2.o() + 0.55, d2.p() + 0.5, (a.b().k() == cq.a.a) ? 0.0f : 90.0f, 0.0f);
        \u26032.aI = ((a.b().k() == cq.a.a) ? 0.0f : 90.0f);
        \u26032.n();
        for (final wn wn : \u2603.a((Class<? extends pk>)wn.class, \u26032.aR().b(50.0, 50.0, 50.0))) {
            wn.b(mr.I);
        }
        \u2603.d(\u26032);
        for (int k = 0; k < 120; ++k) {
            \u2603.a(cy.F, d.n() + \u2603.s.nextDouble(), d.o() - 2 + \u2603.s.nextDouble() * 3.9, d.p() + \u2603.s.nextDouble(), 0.0, 0.0, 0.0, new int[0]);
        }
        for (int k = 0; k < n.c(); ++k) {
            for (int l = 0; l < n.b(); ++l) {
                final amc a4 = a.a(k, l, 0);
                \u2603.b(a4.d(), afi.a);
            }
        }
    }
    
    @Override
    public alz a(final int \u2603) {
        return this.Q().a((amo<Comparable>)ajm.a, cq.a(\u2603 & 0x7)).a((amo<Comparable>)ajm.b, (\u2603 & 0x8) > 0);
    }
    
    @Override
    public int c(final alz \u2603) {
        int n = 0;
        n |= \u2603.b((amo<cq>)ajm.a).a();
        if (\u2603.b((amo<Boolean>)ajm.b)) {
            n |= 0x8;
        }
        return n;
    }
    
    @Override
    protected ama e() {
        return new ama(this, new amo[] { ajm.a, ajm.b });
    }
    
    protected amd l() {
        if (this.O == null) {
            this.O = ame.a().a("   ", "###", "~#~").a('#', amc.a(amh.a(afi.aW))).a('~', amc.a(amh.a(afi.a))).b();
        }
        return this.O;
    }
    
    protected amd n() {
        if (this.P == null) {
            this.P = ame.a().a("^^^", "###", "~#~").a('#', amc.a(amh.a(afi.aW))).a('^', ajm.N).a('~', amc.a(amh.a(afi.a))).b();
        }
        return this.P;
    }
    
    static {
        a = aml.a("facing");
        b = amk.a("nodrop");
        N = new Predicate<amc>() {
            public boolean a(final amc \u2603) {
                return \u2603.a() != null && \u2603.a().c() == afi.ce && \u2603.b() instanceof alo && ((alo)\u2603.b()).c() == 1;
            }
        };
    }
}
