import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class als extends afh
{
    public static final aml a;
    public static final amk b;
    private final boolean N;
    
    public als(final boolean \u2603) {
        super(arm.H);
        this.j(this.M.b().a((amo<Comparable>)als.a, cq.c).a((amo<Comparable>)als.b, false));
        this.N = \u2603;
        this.a(als.i);
        this.c(0.5f);
        this.a(yz.d);
    }
    
    @Override
    public boolean c() {
        return false;
    }
    
    @Override
    public void a(final adm \u2603, final cj \u2603, final alz \u2603, final pr \u2603, final zx \u2603) {
        \u2603.a(\u2603, \u2603.a((amo<Comparable>)als.a, a(\u2603, \u2603, \u2603)), 2);
        if (!\u2603.D) {
            this.e(\u2603, \u2603, \u2603);
        }
    }
    
    @Override
    public void a(final adm \u2603, final cj \u2603, final alz \u2603, final afh \u2603) {
        if (!\u2603.D) {
            this.e(\u2603, \u2603, \u2603);
        }
    }
    
    @Override
    public void c(final adm \u2603, final cj \u2603, final alz \u2603) {
        if (!\u2603.D && \u2603.s(\u2603) == null) {
            this.e(\u2603, \u2603, \u2603);
        }
    }
    
    @Override
    public alz a(final adm \u2603, final cj \u2603, final cq \u2603, final float \u2603, final float \u2603, final float \u2603, final int \u2603, final pr \u2603) {
        return this.Q().a((amo<Comparable>)als.a, a(\u2603, \u2603, \u2603)).a((amo<Comparable>)als.b, false);
    }
    
    private void e(final adm \u2603, final cj \u2603, final alz \u2603) {
        final cq cq = \u2603.b((amo<cq>)als.a);
        final boolean a = this.a(\u2603, \u2603, cq);
        if (a && !\u2603.b((amo<Boolean>)als.b)) {
            if (new alw(\u2603, \u2603, cq, true).a()) {
                \u2603.c(\u2603, this, 0, cq.a());
            }
        }
        else if (!a && \u2603.b((amo<Boolean>)als.b)) {
            \u2603.a(\u2603, \u2603.a((amo<Comparable>)als.b, false), 2);
            \u2603.c(\u2603, this, 1, cq.a());
        }
    }
    
    private boolean a(final adm \u2603, final cj \u2603, final cq \u2603) {
        for (final cq cq : cq.values()) {
            if (cq != \u2603 && \u2603.b(\u2603.a(cq), cq)) {
                return true;
            }
        }
        if (\u2603.b(\u2603, cq.a)) {
            return true;
        }
        final cj a = \u2603.a();
        for (final cq cq2 : cq.values()) {
            if (cq2 != cq.a && \u2603.b(a.a(cq2), cq2)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public boolean a(final adm \u2603, final cj \u2603, final alz \u2603, final int \u2603, final int \u2603) {
        final cq cq = \u2603.b((amo<cq>)als.a);
        if (!\u2603.D) {
            final boolean a = this.a(\u2603, \u2603, cq);
            if (a && \u2603 == 1) {
                \u2603.a(\u2603, \u2603.a((amo<Comparable>)als.b, true), 2);
                return false;
            }
            if (!a && \u2603 == 0) {
                return false;
            }
        }
        if (\u2603 == 0) {
            if (!this.a(\u2603, \u2603, cq, true)) {
                return false;
            }
            \u2603.a(\u2603, \u2603.a((amo<Comparable>)als.b, true), 2);
            \u2603.a(\u2603.n() + 0.5, \u2603.o() + 0.5, \u2603.p() + 0.5, "tile.piston.out", 0.5f, \u2603.s.nextFloat() * 0.25f + 0.6f);
        }
        else if (\u2603 == 1) {
            final akw s = \u2603.s(\u2603.a(cq));
            if (s instanceof alu) {
                ((alu)s).h();
            }
            \u2603.a(\u2603, afi.M.Q().a((amo<Comparable>)alv.a, cq).a(alv.b, this.N ? alt.a.b : alt.a.a), 3);
            \u2603.a(\u2603, alv.a(this.a(\u2603), cq, false, true));
            if (this.N) {
                final cj a2 = \u2603.a(cq.g() * 2, cq.h() * 2, cq.i() * 2);
                final afh c = \u2603.p(a2).c();
                boolean b = false;
                if (c == afi.M) {
                    final akw s2 = \u2603.s(a2);
                    if (s2 instanceof alu) {
                        final alu alu = (alu)s2;
                        if (alu.e() == cq && alu.d()) {
                            alu.h();
                            b = true;
                        }
                    }
                }
                if (!b && c.t() != arm.a && a(c, \u2603, a2, cq.d(), false) && (c.k() == 0 || c == afi.J || c == afi.F)) {
                    this.a(\u2603, \u2603, cq, false);
                }
            }
            else {
                \u2603.g(\u2603.a(cq));
            }
            \u2603.a(\u2603.n() + 0.5, \u2603.o() + 0.5, \u2603.p() + 0.5, "tile.piston.in", 0.5f, \u2603.s.nextFloat() * 0.15f + 0.6f);
        }
        return true;
    }
    
    @Override
    public void a(final adq \u2603, final cj \u2603) {
        final alz p = \u2603.p(\u2603);
        if (p.c() == this && p.b((amo<Boolean>)als.b)) {
            final float n = 0.25f;
            final cq cq = p.b((amo<cq>)als.a);
            if (cq != null) {
                switch (als$1.a[cq.ordinal()]) {
                    case 1: {
                        this.a(0.0f, 0.25f, 0.0f, 1.0f, 1.0f, 1.0f);
                        break;
                    }
                    case 2: {
                        this.a(0.0f, 0.0f, 0.0f, 1.0f, 0.75f, 1.0f);
                        break;
                    }
                    case 3: {
                        this.a(0.0f, 0.0f, 0.25f, 1.0f, 1.0f, 1.0f);
                        break;
                    }
                    case 4: {
                        this.a(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.75f);
                        break;
                    }
                    case 5: {
                        this.a(0.25f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
                        break;
                    }
                    case 6: {
                        this.a(0.0f, 0.0f, 0.0f, 0.75f, 1.0f, 1.0f);
                        break;
                    }
                }
            }
        }
        else {
            this.a(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
        }
    }
    
    @Override
    public void j() {
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
    }
    
    @Override
    public void a(final adm \u2603, final cj \u2603, final alz \u2603, final aug \u2603, final List<aug> \u2603, final pk \u2603) {
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
        super.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
    }
    
    @Override
    public aug a(final adm \u2603, final cj \u2603, final alz \u2603) {
        this.a((adq)\u2603, \u2603);
        return super.a(\u2603, \u2603, \u2603);
    }
    
    @Override
    public boolean d() {
        return false;
    }
    
    public static cq b(final int \u2603) {
        final int \u26032 = \u2603 & 0x7;
        if (\u26032 > 5) {
            return null;
        }
        return cq.a(\u26032);
    }
    
    public static cq a(final adm \u2603, final cj \u2603, final pr \u2603) {
        if (ns.e((float)\u2603.s - \u2603.n()) < 2.0f && ns.e((float)\u2603.u - \u2603.p()) < 2.0f) {
            final double n = \u2603.t + \u2603.aS();
            if (n - \u2603.o() > 2.0) {
                return cq.b;
            }
            if (\u2603.o() - n > 0.0) {
                return cq.a;
            }
        }
        return \u2603.aP().d();
    }
    
    public static boolean a(final afh \u2603, final adm \u2603, final cj \u2603, final cq \u2603, final boolean \u2603) {
        if (\u2603 == afi.Z) {
            return false;
        }
        if (!\u2603.af().a(\u2603)) {
            return false;
        }
        if (\u2603.o() < 0 || (\u2603 == cq.a && \u2603.o() == 0)) {
            return false;
        }
        if (\u2603.o() > \u2603.U() - 1 || (\u2603 == cq.b && \u2603.o() == \u2603.U() - 1)) {
            return false;
        }
        if (\u2603 == afi.J || \u2603 == afi.F) {
            if (\u2603.p(\u2603).b((amo<Boolean>)als.b)) {
                return false;
            }
        }
        else {
            if (\u2603.g(\u2603, \u2603) == -1.0f) {
                return false;
            }
            if (\u2603.k() == 2) {
                return false;
            }
            if (\u2603.k() == 1) {
                return \u2603;
            }
        }
        return !(\u2603 instanceof agq);
    }
    
    private boolean a(final adm \u2603, final cj \u2603, final cq \u2603, final boolean \u2603) {
        if (!\u2603) {
            \u2603.g(\u2603.a(\u2603));
        }
        final alw alw = new alw(\u2603, \u2603, \u2603, \u2603);
        final List<cj> c = alw.c();
        final List<cj> d = alw.d();
        if (!alw.a()) {
            return false;
        }
        int n = c.size() + d.size();
        final afh[] array = new afh[n];
        final cq \u26032 = \u2603 ? \u2603 : \u2603.d();
        for (int i = d.size() - 1; i >= 0; --i) {
            final cj a = d.get(i);
            final afh c2 = \u2603.p(a).c();
            c2.b(\u2603, a, \u2603.p(a), 0);
            \u2603.g(a);
            array[--n] = c2;
        }
        for (int i = c.size() - 1; i >= 0; --i) {
            cj a = c.get(i);
            final alz \u26033 = \u2603.p(a);
            final afh c3 = \u26033.c();
            final int c4 = c3.c(\u26033);
            \u2603.g(a);
            a = a.a(\u26032);
            \u2603.a(a, afi.M.Q().a((amo<Comparable>)als.a, \u2603), 4);
            \u2603.a(a, alv.a(\u26033, \u2603, \u2603, false));
            array[--n] = c3;
        }
        final cj a2 = \u2603.a(\u2603);
        if (\u2603) {
            final alt.a a3 = this.N ? alt.a.b : alt.a.a;
            final alz \u26033 = afi.K.Q().a((amo<Comparable>)alt.a, \u2603).a(alt.b, a3);
            final alz a4 = afi.M.Q().a((amo<Comparable>)alv.a, \u2603).a(alv.b, this.N ? alt.a.b : alt.a.a);
            \u2603.a(a2, a4, 4);
            \u2603.a(a2, alv.a(\u26033, \u2603, true, false));
        }
        for (int j = d.size() - 1; j >= 0; --j) {
            \u2603.c(d.get(j), array[n++]);
        }
        for (int j = c.size() - 1; j >= 0; --j) {
            \u2603.c(c.get(j), array[n++]);
        }
        if (\u2603) {
            \u2603.c(a2, afi.K);
            \u2603.c(\u2603, this);
        }
        return true;
    }
    
    @Override
    public alz b(final alz \u2603) {
        return this.Q().a((amo<Comparable>)als.a, cq.b);
    }
    
    @Override
    public alz a(final int \u2603) {
        return this.Q().a((amo<Comparable>)als.a, b(\u2603)).a((amo<Comparable>)als.b, (\u2603 & 0x8) > 0);
    }
    
    @Override
    public int c(final alz \u2603) {
        int n = 0;
        n |= \u2603.b((amo<cq>)als.a).a();
        if (\u2603.b((amo<Boolean>)als.b)) {
            n |= 0x8;
        }
        return n;
    }
    
    @Override
    protected ama e() {
        return new ama(this, new amo[] { als.a, als.b });
    }
    
    static {
        a = aml.a("facing");
        b = amk.a("extended");
    }
}
