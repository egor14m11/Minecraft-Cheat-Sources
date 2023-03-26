import java.util.List;
import com.google.common.base.Predicate;
import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public class afx extends agd implements agq
{
    public static final amk a;
    public static final amm<a> b;
    
    public afx(final boolean \u2603) {
        super(\u2603);
        this.j(this.M.b().a((amo<Comparable>)afx.O, cq.c).a((amo<Comparable>)afx.a, false).a(afx.b, afx.a.a));
        this.A = true;
    }
    
    @Override
    public String f() {
        return di.a("item.comparator.name");
    }
    
    @Override
    public zw a(final alz \u2603, final Random \u2603, final int \u2603) {
        return zy.ce;
    }
    
    @Override
    public zw c(final adm \u2603, final cj \u2603) {
        return zy.ce;
    }
    
    @Override
    protected int d(final alz \u2603) {
        return 2;
    }
    
    @Override
    protected alz e(final alz \u2603) {
        final Boolean b = \u2603.b((amo<Boolean>)afx.a);
        final a a = \u2603.b(afx.b);
        final cq cq = \u2603.b((amo<cq>)afx.O);
        return afi.ck.Q().a((amo<Comparable>)afx.O, cq).a((amo<Comparable>)afx.a, b).a(afx.b, a);
    }
    
    @Override
    protected alz k(final alz \u2603) {
        final Boolean b = \u2603.b((amo<Boolean>)afx.a);
        final a a = \u2603.b(afx.b);
        final cq cq = \u2603.b((amo<cq>)afx.O);
        return afi.cj.Q().a((amo<Comparable>)afx.O, cq).a((amo<Comparable>)afx.a, b).a(afx.b, a);
    }
    
    @Override
    protected boolean l(final alz \u2603) {
        return this.N || \u2603.b((amo<Boolean>)afx.a);
    }
    
    @Override
    protected int a(final adq \u2603, final cj \u2603, final alz \u2603) {
        final akw s = \u2603.s(\u2603);
        if (s instanceof ala) {
            return ((ala)s).b();
        }
        return 0;
    }
    
    private int j(final adm \u2603, final cj \u2603, final alz \u2603) {
        if (\u2603.b(afx.b) == afx.a.b) {
            return Math.max(this.f(\u2603, \u2603, \u2603) - this.c((adq)\u2603, \u2603, \u2603), 0);
        }
        return this.f(\u2603, \u2603, \u2603);
    }
    
    @Override
    protected boolean e(final adm \u2603, final cj \u2603, final alz \u2603) {
        final int f = this.f(\u2603, \u2603, \u2603);
        if (f >= 15) {
            return true;
        }
        if (f == 0) {
            return false;
        }
        final int c = this.c((adq)\u2603, \u2603, \u2603);
        return c == 0 || f >= c;
    }
    
    @Override
    protected int f(final adm \u2603, final cj \u2603, final alz \u2603) {
        int n = super.f(\u2603, \u2603, \u2603);
        final cq \u26032 = \u2603.b((amo<cq>)afx.O);
        cj \u26033 = \u2603.a(\u26032);
        afh afh = \u2603.p(\u26033).c();
        if (afh.O()) {
            n = afh.l(\u2603, \u26033);
        }
        else if (n < 15 && afh.v()) {
            \u26033 = \u26033.a(\u26032);
            afh = \u2603.p(\u26033).c();
            if (afh.O()) {
                n = afh.l(\u2603, \u26033);
            }
            else if (afh.t() == arm.a) {
                final uo a = this.a(\u2603, \u26032, \u26033);
                if (a != null) {
                    n = a.q();
                }
            }
        }
        return n;
    }
    
    private uo a(final adm \u2603, final cq \u2603, final cj \u2603) {
        final List<uo> a = \u2603.a((Class<? extends uo>)uo.class, new aug(\u2603.n(), \u2603.o(), \u2603.p(), \u2603.n() + 1, \u2603.o() + 1, \u2603.p() + 1), (Predicate<? super uo>)new Predicate<pk>() {
            public boolean a(final pk \u2603) {
                return \u2603 != null && \u2603.aP() == \u2603;
            }
        });
        if (a.size() == 1) {
            return a.get(0);
        }
        return null;
    }
    
    @Override
    public boolean a(final adm \u2603, final cj \u2603, alz \u2603, final wn \u2603, final cq \u2603, final float \u2603, final float \u2603, final float \u2603) {
        if (!\u2603.bA.e) {
            return false;
        }
        \u2603 = \u2603.a(afx.b);
        \u2603.a(\u2603.n() + 0.5, \u2603.o() + 0.5, \u2603.p() + 0.5, "random.click", 0.3f, (\u2603.b(afx.b) == afx.a.b) ? 0.55f : 0.5f);
        \u2603.a(\u2603, \u2603, 2);
        this.k(\u2603, \u2603, \u2603);
        return true;
    }
    
    @Override
    protected void g(final adm \u2603, final cj \u2603, final alz \u2603) {
        if (\u2603.a(\u2603, this)) {
            return;
        }
        final int j = this.j(\u2603, \u2603, \u2603);
        final akw s = \u2603.s(\u2603);
        final int n = (s instanceof ala) ? ((ala)s).b() : 0;
        if (j != n || this.l(\u2603) != this.e(\u2603, \u2603, \u2603)) {
            if (this.i(\u2603, \u2603, \u2603)) {
                \u2603.a(\u2603, this, 2, -1);
            }
            else {
                \u2603.a(\u2603, this, 2, 0);
            }
        }
    }
    
    private void k(final adm \u2603, final cj \u2603, final alz \u2603) {
        final int j = this.j(\u2603, \u2603, \u2603);
        final akw s = \u2603.s(\u2603);
        int b = 0;
        if (s instanceof ala) {
            final ala ala = (ala)s;
            b = ala.b();
            ala.a(j);
        }
        if (b != j || \u2603.b(afx.b) == afx.a.a) {
            final boolean e = this.e(\u2603, \u2603, \u2603);
            final boolean l = this.l(\u2603);
            if (l && !e) {
                \u2603.a(\u2603, \u2603.a((amo<Comparable>)afx.a, false), 2);
            }
            else if (!l && e) {
                \u2603.a(\u2603, \u2603.a((amo<Comparable>)afx.a, true), 2);
            }
            this.h(\u2603, \u2603, \u2603);
        }
    }
    
    @Override
    public void b(final adm \u2603, final cj \u2603, final alz \u2603, final Random \u2603) {
        if (this.N) {
            \u2603.a(\u2603, this.k(\u2603).a((amo<Comparable>)afx.a, true), 4);
        }
        this.k(\u2603, \u2603, \u2603);
    }
    
    @Override
    public void c(final adm \u2603, final cj \u2603, final alz \u2603) {
        super.c(\u2603, \u2603, \u2603);
        \u2603.a(\u2603, this.a(\u2603, 0));
    }
    
    @Override
    public void b(final adm \u2603, final cj \u2603, final alz \u2603) {
        super.b(\u2603, \u2603, \u2603);
        \u2603.t(\u2603);
        this.h(\u2603, \u2603, \u2603);
    }
    
    @Override
    public boolean a(final adm \u2603, final cj \u2603, final alz \u2603, final int \u2603, final int \u2603) {
        super.a(\u2603, \u2603, \u2603, \u2603, \u2603);
        final akw s = \u2603.s(\u2603);
        return s != null && s.c(\u2603, \u2603);
    }
    
    @Override
    public akw a(final adm \u2603, final int \u2603) {
        return new ala();
    }
    
    @Override
    public alz a(final int \u2603) {
        return this.Q().a((amo<Comparable>)afx.O, cq.b(\u2603)).a((amo<Comparable>)afx.a, (\u2603 & 0x8) > 0).a(afx.b, ((\u2603 & 0x4) > 0) ? afx.a.b : afx.a.a);
    }
    
    @Override
    public int c(final alz \u2603) {
        int n = 0;
        n |= \u2603.b((amo<cq>)afx.O).b();
        if (\u2603.b((amo<Boolean>)afx.a)) {
            n |= 0x8;
        }
        if (\u2603.b(afx.b) == afx.a.b) {
            n |= 0x4;
        }
        return n;
    }
    
    @Override
    protected ama e() {
        return new ama(this, new amo[] { afx.O, afx.b, afx.a });
    }
    
    @Override
    public alz a(final adm \u2603, final cj \u2603, final cq \u2603, final float \u2603, final float \u2603, final float \u2603, final int \u2603, final pr \u2603) {
        return this.Q().a((amo<Comparable>)afx.O, \u2603.aP().d()).a((amo<Comparable>)afx.a, false).a(afx.b, afx.a.a);
    }
    
    static {
        a = amk.a("powered");
        b = amm.a("mode", a.class);
    }
    
    public enum a implements nw
    {
        a("compare"), 
        b("subtract");
        
        private final String c;
        
        private a(final String \u2603) {
            this.c = \u2603;
        }
        
        @Override
        public String toString() {
            return this.c;
        }
        
        @Override
        public String l() {
            return this.c;
        }
    }
}
