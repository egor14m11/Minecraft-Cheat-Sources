import com.google.common.base.Predicate;
import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public class agh extends afh
{
    public static final aml a;
    public static final amk b;
    public static final amm<b> N;
    public static final amk O;
    public static final amm<a> P;
    
    protected agh(final arm \u2603) {
        super(\u2603);
        this.j(this.M.b().a((amo<Comparable>)agh.a, cq.c).a((amo<Comparable>)agh.b, false).a(agh.N, agh.b.a).a((amo<Comparable>)agh.O, false).a(agh.P, agh.a.b));
    }
    
    @Override
    public String f() {
        return di.a((this.a() + ".name").replaceAll("tile", "item"));
    }
    
    @Override
    public boolean c() {
        return false;
    }
    
    @Override
    public boolean b(final adq \u2603, final cj \u2603) {
        return g(e(\u2603, \u2603));
    }
    
    @Override
    public boolean d() {
        return false;
    }
    
    @Override
    public aug b(final adm \u2603, final cj \u2603) {
        this.a((adq)\u2603, \u2603);
        return super.b(\u2603, \u2603);
    }
    
    @Override
    public aug a(final adm \u2603, final cj \u2603, final alz \u2603) {
        this.a((adq)\u2603, \u2603);
        return super.a(\u2603, \u2603, \u2603);
    }
    
    @Override
    public void a(final adq \u2603, final cj \u2603) {
        this.k(e(\u2603, \u2603));
    }
    
    private void k(final int \u2603) {
        final float n = 0.1875f;
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 2.0f, 1.0f);
        final cq f = f(\u2603);
        final boolean g = g(\u2603);
        final boolean j = j(\u2603);
        if (g) {
            if (f == cq.f) {
                if (!j) {
                    this.a(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, n);
                }
                else {
                    this.a(0.0f, 0.0f, 1.0f - n, 1.0f, 1.0f, 1.0f);
                }
            }
            else if (f == cq.d) {
                if (!j) {
                    this.a(1.0f - n, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
                }
                else {
                    this.a(0.0f, 0.0f, 0.0f, n, 1.0f, 1.0f);
                }
            }
            else if (f == cq.e) {
                if (!j) {
                    this.a(0.0f, 0.0f, 1.0f - n, 1.0f, 1.0f, 1.0f);
                }
                else {
                    this.a(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, n);
                }
            }
            else if (f == cq.c) {
                if (!j) {
                    this.a(0.0f, 0.0f, 0.0f, n, 1.0f, 1.0f);
                }
                else {
                    this.a(1.0f - n, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
                }
            }
        }
        else if (f == cq.f) {
            this.a(0.0f, 0.0f, 0.0f, n, 1.0f, 1.0f);
        }
        else if (f == cq.d) {
            this.a(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, n);
        }
        else if (f == cq.e) {
            this.a(1.0f - n, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
        }
        else if (f == cq.c) {
            this.a(0.0f, 0.0f, 1.0f - n, 1.0f, 1.0f, 1.0f);
        }
    }
    
    @Override
    public boolean a(final adm \u2603, final cj \u2603, alz \u2603, final wn \u2603, final cq \u2603, final float \u2603, final float \u2603, final float \u2603) {
        if (this.J == arm.f) {
            return true;
        }
        final cj cj = (\u2603.b(agh.P) == agh.a.b) ? \u2603 : \u2603.b();
        final alz alz = \u2603.equals(cj) ? \u2603 : \u2603.p(cj);
        if (alz.c() != this) {
            return false;
        }
        \u2603 = alz.a((amo<Comparable>)agh.b);
        \u2603.a(cj, \u2603, 2);
        \u2603.b(cj, \u2603);
        \u2603.a(\u2603, ((boolean)\u2603.b((amo<Boolean>)agh.b)) ? 1003 : 1006, \u2603, 0);
        return true;
    }
    
    public void a(final adm \u2603, final cj \u2603, final boolean \u2603) {
        final alz p = \u2603.p(\u2603);
        if (p.c() != this) {
            return;
        }
        final cj \u26032 = (p.b(agh.P) == agh.a.b) ? \u2603 : \u2603.b();
        final alz alz = (\u2603 == \u26032) ? p : \u2603.p(\u26032);
        if (alz.c() == this && alz.b((amo<Boolean>)agh.b) != \u2603) {
            \u2603.a(\u26032, alz.a((amo<Comparable>)agh.b, \u2603), 2);
            \u2603.b(\u26032, \u2603);
            \u2603.a(null, \u2603 ? 1003 : 1006, \u2603, 0);
        }
    }
    
    @Override
    public void a(final adm \u2603, final cj \u2603, final alz \u2603, final afh \u2603) {
        if (\u2603.b(agh.P) == agh.a.a) {
            final cj b = \u2603.b();
            final alz p = \u2603.p(b);
            if (p.c() != this) {
                \u2603.g(\u2603);
            }
            else if (\u2603 != this) {
                this.a(\u2603, b, p, \u2603);
            }
        }
        else {
            boolean b2 = false;
            final cj a = \u2603.a();
            final alz p2 = \u2603.p(a);
            if (p2.c() != this) {
                \u2603.g(\u2603);
                b2 = true;
            }
            if (!adm.a(\u2603, \u2603.b())) {
                \u2603.g(\u2603);
                b2 = true;
                if (p2.c() == this) {
                    \u2603.g(a);
                }
            }
            if (b2) {
                if (!\u2603.D) {
                    this.b(\u2603, \u2603, \u2603, 0);
                }
            }
            else {
                final boolean b3 = \u2603.z(\u2603) || \u2603.z(a);
                if ((b3 || \u2603.i()) && \u2603 != this && b3 != p2.b((amo<Boolean>)agh.O)) {
                    \u2603.a(a, p2.a((amo<Comparable>)agh.O, b3), 2);
                    if (b3 != \u2603.b((amo<Boolean>)agh.b)) {
                        \u2603.a(\u2603, \u2603.a((amo<Comparable>)agh.b, b3), 2);
                        \u2603.b(\u2603, \u2603);
                        \u2603.a(null, b3 ? 1003 : 1006, \u2603, 0);
                    }
                }
            }
        }
    }
    
    @Override
    public zw a(final alz \u2603, final Random \u2603, final int \u2603) {
        if (\u2603.b(agh.P) == agh.a.a) {
            return null;
        }
        return this.l();
    }
    
    @Override
    public auh a(final adm \u2603, final cj \u2603, final aui \u2603, final aui \u2603) {
        this.a((adq)\u2603, \u2603);
        return super.a(\u2603, \u2603, \u2603, \u2603);
    }
    
    @Override
    public boolean d(final adm \u2603, final cj \u2603) {
        return \u2603.o() < 255 && adm.a(\u2603, \u2603.b()) && super.d(\u2603, \u2603) && super.d(\u2603, \u2603.a());
    }
    
    @Override
    public int k() {
        return 1;
    }
    
    public static int e(final adq \u2603, final cj \u2603) {
        final alz p = \u2603.p(\u2603);
        final int c = p.c().c(p);
        final boolean i = i(c);
        final alz p2 = \u2603.p(\u2603.b());
        final int c2 = p2.c().c(p2);
        final int \u26032 = i ? c2 : c;
        final alz p3 = \u2603.p(\u2603.a());
        final int c3 = p3.c().c(p3);
        final int n = i ? c : c3;
        final boolean b = (n & 0x1) != 0x0;
        final boolean b2 = (n & 0x2) != 0x0;
        return b(\u26032) | (i ? 8 : 0) | (b ? 16 : 0) | (b2 ? 32 : 0);
    }
    
    @Override
    public zw c(final adm \u2603, final cj \u2603) {
        return this.l();
    }
    
    private zw l() {
        if (this == afi.aA) {
            return zy.aB;
        }
        if (this == afi.ap) {
            return zy.ar;
        }
        if (this == afi.aq) {
            return zy.as;
        }
        if (this == afi.ar) {
            return zy.at;
        }
        if (this == afi.as) {
            return zy.au;
        }
        if (this == afi.at) {
            return zy.av;
        }
        return zy.aq;
    }
    
    @Override
    public void a(final adm \u2603, final cj \u2603, final alz \u2603, final wn \u2603) {
        final cj b = \u2603.b();
        if (\u2603.bA.d && \u2603.b(agh.P) == agh.a.a && \u2603.p(b).c() == this) {
            \u2603.g(b);
        }
    }
    
    @Override
    public adf m() {
        return adf.c;
    }
    
    @Override
    public alz a(alz \u2603, final adq \u2603, final cj \u2603) {
        if (\u2603.b(agh.P) == agh.a.b) {
            final alz alz = \u2603.p(\u2603.a());
            if (alz.c() == this) {
                \u2603 = \u2603.a(agh.N, (Comparable)alz.b((amo<V>)agh.N)).a((amo<Comparable>)agh.O, (Comparable)alz.b((amo<V>)agh.O));
            }
        }
        else {
            final alz alz = \u2603.p(\u2603.b());
            if (alz.c() == this) {
                \u2603 = \u2603.a((amo<Comparable>)agh.a, (Comparable)alz.b((amo<V>)agh.a)).a((amo<Comparable>)agh.b, (Comparable)alz.b((amo<V>)agh.b));
            }
        }
        return \u2603;
    }
    
    @Override
    public alz a(final int \u2603) {
        if ((\u2603 & 0x8) > 0) {
            return this.Q().a(agh.P, agh.a.a).a(agh.N, ((\u2603 & 0x1) > 0) ? agh.b.b : agh.b.a).a((amo<Comparable>)agh.O, (\u2603 & 0x2) > 0);
        }
        return this.Q().a(agh.P, agh.a.b).a((amo<Comparable>)agh.a, cq.b(\u2603 & 0x3).f()).a((amo<Comparable>)agh.b, (\u2603 & 0x4) > 0);
    }
    
    @Override
    public int c(final alz \u2603) {
        int n = 0;
        if (\u2603.b(agh.P) == agh.a.a) {
            n |= 0x8;
            if (\u2603.b(agh.N) == agh.b.b) {
                n |= 0x1;
            }
            if (\u2603.b((amo<Boolean>)agh.O)) {
                n |= 0x2;
            }
        }
        else {
            n |= \u2603.b((amo<cq>)agh.a).e().b();
            if (\u2603.b((amo<Boolean>)agh.b)) {
                n |= 0x4;
            }
        }
        return n;
    }
    
    protected static int b(final int \u2603) {
        return \u2603 & 0x7;
    }
    
    public static boolean f(final adq \u2603, final cj \u2603) {
        return g(e(\u2603, \u2603));
    }
    
    public static cq h(final adq \u2603, final cj \u2603) {
        return f(e(\u2603, \u2603));
    }
    
    public static cq f(final int \u2603) {
        return cq.b(\u2603 & 0x3).f();
    }
    
    protected static boolean g(final int \u2603) {
        return (\u2603 & 0x4) != 0x0;
    }
    
    protected static boolean i(final int \u2603) {
        return (\u2603 & 0x8) != 0x0;
    }
    
    protected static boolean j(final int \u2603) {
        return (\u2603 & 0x10) != 0x0;
    }
    
    @Override
    protected ama e() {
        return new ama(this, new amo[] { agh.P, agh.a, agh.b, agh.N, agh.O });
    }
    
    static {
        a = aml.a("facing", cq.c.a);
        b = amk.a("open");
        N = amm.a("hinge", b.class);
        O = amk.a("powered");
        P = amm.a("half", a.class);
    }
    
    public enum a implements nw
    {
        a, 
        b;
        
        @Override
        public String toString() {
            return this.l();
        }
        
        @Override
        public String l() {
            return (this == a.a) ? "upper" : "lower";
        }
    }
    
    public enum b implements nw
    {
        a, 
        b;
        
        @Override
        public String toString() {
            return this.l();
        }
        
        @Override
        public String l() {
            return (this == b.a) ? "left" : "right";
        }
    }
}
