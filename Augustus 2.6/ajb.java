import java.util.EnumSet;
import java.util.Random;
import java.util.Iterator;
import java.util.List;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.Set;

// 
// Decompiled by Procyon v0.5.36
// 

public class ajb extends afh
{
    public static final amm<a> a;
    public static final amm<a> b;
    public static final amm<a> N;
    public static final amm<a> O;
    public static final amn P;
    private boolean Q;
    private final Set<cj> R;
    
    public ajb() {
        super(arm.q);
        this.Q = true;
        this.R = (Set<cj>)Sets.newHashSet();
        this.j(this.M.b().a(ajb.a, ajb.a.c).a(ajb.b, ajb.a.c).a(ajb.N, ajb.a.c).a(ajb.O, ajb.a.c).a((amo<Comparable>)ajb.P, 0));
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 0.0625f, 1.0f);
    }
    
    @Override
    public alz a(alz \u2603, final adq \u2603, final cj \u2603) {
        \u2603 = \u2603.a(ajb.O, this.c(\u2603, \u2603, cq.e));
        \u2603 = \u2603.a(ajb.b, this.c(\u2603, \u2603, cq.f));
        \u2603 = \u2603.a(ajb.a, this.c(\u2603, \u2603, cq.c));
        \u2603 = \u2603.a(ajb.N, this.c(\u2603, \u2603, cq.d));
        return \u2603;
    }
    
    private a c(final adq \u2603, final cj \u2603, final cq \u2603) {
        final cj a = \u2603.a(\u2603);
        final afh c = \u2603.p(\u2603.a(\u2603)).c();
        if (a(\u2603.p(a), \u2603) || (!c.u() && d(\u2603.p(a.b())))) {
            return ajb.a.b;
        }
        final afh c2 = \u2603.p(\u2603.a()).c();
        if (!c2.u() && c.u() && d(\u2603.p(a.a()))) {
            return ajb.a.a;
        }
        return ajb.a.c;
    }
    
    @Override
    public aug a(final adm \u2603, final cj \u2603, final alz \u2603) {
        return null;
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
    public int a(final adq \u2603, final cj \u2603, final int \u2603) {
        final alz p = \u2603.p(\u2603);
        if (p.c() != this) {
            return super.a(\u2603, \u2603, \u2603);
        }
        return this.b(p.b((amo<Integer>)ajb.P));
    }
    
    @Override
    public boolean d(final adm \u2603, final cj \u2603) {
        return adm.a(\u2603, \u2603.b()) || \u2603.p(\u2603.b()).c() == afi.aX;
    }
    
    private alz e(final adm \u2603, final cj \u2603, alz \u2603) {
        \u2603 = this.a(\u2603, \u2603, \u2603, \u2603);
        final List<cj> arrayList = (List<cj>)Lists.newArrayList((Iterable<?>)this.R);
        this.R.clear();
        for (final cj \u26032 : arrayList) {
            \u2603.c(\u26032, this);
        }
        return \u2603;
    }
    
    private alz a(final adm \u2603, final cj \u2603, final cj \u2603, alz \u2603) {
        final alz alz = \u2603;
        final int intValue = alz.b((amo<Integer>)ajb.P);
        int a = 0;
        a = this.a(\u2603, \u2603, a);
        this.Q = false;
        final int a2 = \u2603.A(\u2603);
        this.Q = true;
        if (a2 > 0 && a2 > a - 1) {
            a = a2;
        }
        int \u26032 = 0;
        for (final cq \u26033 : cq.c.a) {
            final cj a3 = \u2603.a(\u26033);
            final boolean b = a3.n() != \u2603.n() || a3.p() != \u2603.p();
            if (b) {
                \u26032 = this.a(\u2603, a3, \u26032);
            }
            if (\u2603.p(a3).c().v() && !\u2603.p(\u2603.a()).c().v()) {
                if (!b || \u2603.o() < \u2603.o()) {
                    continue;
                }
                \u26032 = this.a(\u2603, a3.a(), \u26032);
            }
            else {
                if (\u2603.p(a3).c().v() || !b || \u2603.o() > \u2603.o()) {
                    continue;
                }
                \u26032 = this.a(\u2603, a3.b(), \u26032);
            }
        }
        if (\u26032 > a) {
            a = \u26032 - 1;
        }
        else if (a > 0) {
            --a;
        }
        else {
            a = 0;
        }
        if (a2 > a - 1) {
            a = a2;
        }
        if (intValue != a) {
            \u2603 = \u2603.a((amo<Comparable>)ajb.P, a);
            if (\u2603.p(\u2603) == alz) {
                \u2603.a(\u2603, \u2603, 2);
            }
            this.R.add(\u2603);
            for (final cq \u26034 : cq.values()) {
                this.R.add(\u2603.a(\u26034));
            }
        }
        return \u2603;
    }
    
    private void e(final adm \u2603, final cj \u2603) {
        if (\u2603.p(\u2603).c() != this) {
            return;
        }
        \u2603.c(\u2603, this);
        for (final cq \u26032 : cq.values()) {
            \u2603.c(\u2603.a(\u26032), this);
        }
    }
    
    @Override
    public void c(final adm \u2603, final cj \u2603, final alz \u2603) {
        if (\u2603.D) {
            return;
        }
        this.e(\u2603, \u2603, \u2603);
        for (final cq \u26032 : cq.c.b) {
            \u2603.c(\u2603.a(\u26032), this);
        }
        for (final cq \u26032 : cq.c.a) {
            this.e(\u2603, \u2603.a(\u26032));
        }
        for (final cq \u26032 : cq.c.a) {
            final cj a = \u2603.a(\u26032);
            if (\u2603.p(a).c().v()) {
                this.e(\u2603, a.a());
            }
            else {
                this.e(\u2603, a.b());
            }
        }
    }
    
    @Override
    public void b(final adm \u2603, final cj \u2603, final alz \u2603) {
        super.b(\u2603, \u2603, \u2603);
        if (\u2603.D) {
            return;
        }
        for (final cq \u26032 : cq.values()) {
            \u2603.c(\u2603.a(\u26032), this);
        }
        this.e(\u2603, \u2603, \u2603);
        for (final cq cq : cq.c.a) {
            this.e(\u2603, \u2603.a(cq));
        }
        for (final cq cq : cq.c.a) {
            final cj a = \u2603.a(cq);
            if (\u2603.p(a).c().v()) {
                this.e(\u2603, a.a());
            }
            else {
                this.e(\u2603, a.b());
            }
        }
    }
    
    private int a(final adm \u2603, final cj \u2603, final int \u2603) {
        if (\u2603.p(\u2603).c() != this) {
            return \u2603;
        }
        final int intValue = \u2603.p(\u2603).b((amo<Integer>)ajb.P);
        if (intValue > \u2603) {
            return intValue;
        }
        return \u2603;
    }
    
    @Override
    public void a(final adm \u2603, final cj \u2603, final alz \u2603, final afh \u2603) {
        if (\u2603.D) {
            return;
        }
        if (this.d(\u2603, \u2603)) {
            this.e(\u2603, \u2603, \u2603);
        }
        else {
            this.b(\u2603, \u2603, \u2603, 0);
            \u2603.g(\u2603);
        }
    }
    
    @Override
    public zw a(final alz \u2603, final Random \u2603, final int \u2603) {
        return zy.aC;
    }
    
    @Override
    public int b(final adq \u2603, final cj \u2603, final alz \u2603, final cq \u2603) {
        if (!this.Q) {
            return 0;
        }
        return this.a(\u2603, \u2603, \u2603, \u2603);
    }
    
    @Override
    public int a(final adq \u2603, final cj \u2603, final alz \u2603, final cq \u2603) {
        if (!this.Q) {
            return 0;
        }
        final int intValue = \u2603.b((amo<Integer>)ajb.P);
        if (intValue == 0) {
            return 0;
        }
        if (\u2603 == cq.b) {
            return intValue;
        }
        final EnumSet<cq> none = EnumSet.noneOf(cq.class);
        for (final cq cq : cq.c.a) {
            if (this.d(\u2603, \u2603, cq)) {
                none.add(cq);
            }
        }
        if (\u2603.k().c() && none.isEmpty()) {
            return intValue;
        }
        if (none.contains(\u2603) && !none.contains(\u2603.f()) && !none.contains(\u2603.e())) {
            return intValue;
        }
        return 0;
    }
    
    private boolean d(final adq \u2603, final cj \u2603, final cq \u2603) {
        final cj a = \u2603.a(\u2603);
        final alz p = \u2603.p(a);
        final afh c = p.c();
        final boolean v = c.v();
        final boolean v2 = \u2603.p(\u2603.a()).c().v();
        return (!v2 && v && e(\u2603, a.a())) || a(p, \u2603) || (c == afi.bc && p.b((amo<Comparable>)agd.O) == \u2603) || (!v && e(\u2603, a.b()));
    }
    
    protected static boolean e(final adq \u2603, final cj \u2603) {
        return d(\u2603.p(\u2603));
    }
    
    protected static boolean d(final alz \u2603) {
        return a(\u2603, null);
    }
    
    protected static boolean a(final alz \u2603, final cq \u2603) {
        final afh c = \u2603.c();
        if (c == afi.af) {
            return true;
        }
        if (afi.bb.e(c)) {
            final cq cq = \u2603.b((amo<cq>)ajf.O);
            return cq == \u2603 || cq.d() == \u2603;
        }
        return c.i() && \u2603 != null;
    }
    
    @Override
    public boolean i() {
        return this.Q;
    }
    
    private int b(final int \u2603) {
        final float n = \u2603 / 15.0f;
        float n2 = n * 0.6f + 0.4f;
        if (\u2603 == 0) {
            n2 = 0.3f;
        }
        float n3 = n * n * 0.7f - 0.5f;
        float n4 = n * n * 0.6f - 0.7f;
        if (n3 < 0.0f) {
            n3 = 0.0f;
        }
        if (n4 < 0.0f) {
            n4 = 0.0f;
        }
        final int a = ns.a((int)(n2 * 255.0f), 0, 255);
        final int a2 = ns.a((int)(n3 * 255.0f), 0, 255);
        final int a3 = ns.a((int)(n4 * 255.0f), 0, 255);
        return 0xFF000000 | a << 16 | a2 << 8 | a3;
    }
    
    @Override
    public void c(final adm \u2603, final cj \u2603, final alz \u2603, final Random \u2603) {
        final int intValue = \u2603.b((amo<Integer>)ajb.P);
        if (intValue == 0) {
            return;
        }
        final double \u26032 = \u2603.n() + 0.5 + (\u2603.nextFloat() - 0.5) * 0.2;
        final double \u26033 = \u2603.o() + 0.0625f;
        final double \u26034 = \u2603.p() + 0.5 + (\u2603.nextFloat() - 0.5) * 0.2;
        final float n = intValue / 15.0f;
        final float n2 = n * 0.6f + 0.4f;
        final float max = Math.max(0.0f, n * n * 0.7f - 0.5f);
        final float max2 = Math.max(0.0f, n * n * 0.6f - 0.7f);
        \u2603.a(cy.E, \u26032, \u26033, \u26034, n2, max, max2, new int[0]);
    }
    
    @Override
    public zw c(final adm \u2603, final cj \u2603) {
        return zy.aC;
    }
    
    @Override
    public adf m() {
        return adf.c;
    }
    
    @Override
    public alz a(final int \u2603) {
        return this.Q().a((amo<Comparable>)ajb.P, \u2603);
    }
    
    @Override
    public int c(final alz \u2603) {
        return \u2603.b((amo<Integer>)ajb.P);
    }
    
    @Override
    protected ama e() {
        return new ama(this, new amo[] { ajb.a, ajb.b, ajb.N, ajb.O, ajb.P });
    }
    
    static {
        a = amm.a("north", a.class);
        b = amm.a("east", a.class);
        N = amm.a("south", a.class);
        O = amm.a("west", a.class);
        P = amn.a("power", 0, 15);
    }
    
    enum a implements nw
    {
        a("up"), 
        b("side"), 
        c("none");
        
        private final String d;
        
        private a(final String \u2603) {
            this.d = \u2603;
        }
        
        @Override
        public String toString() {
            return this.l();
        }
        
        @Override
        public String l() {
            return this.d;
        }
    }
}
