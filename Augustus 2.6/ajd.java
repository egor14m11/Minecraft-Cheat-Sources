import com.google.common.collect.Maps;
import java.util.Random;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Map;

// 
// Decompiled by Procyon v0.5.36
// 

public class ajd extends akf
{
    private static Map<adm, List<a>> b;
    private final boolean N;
    
    private boolean a(final adm \u2603, final cj \u2603, final boolean \u2603) {
        if (!ajd.b.containsKey(\u2603)) {
            ajd.b.put(\u2603, (List<a>)Lists.newArrayList());
        }
        final List<a> list = ajd.b.get(\u2603);
        if (\u2603) {
            list.add(new a(\u2603, \u2603.K()));
        }
        int n = 0;
        for (int i = 0; i < list.size(); ++i) {
            final a a = list.get(i);
            if (a.a.equals(\u2603) && ++n >= 8) {
                return true;
            }
        }
        return false;
    }
    
    protected ajd(final boolean \u2603) {
        this.N = \u2603;
        this.a(true);
        this.a((yz)null);
    }
    
    @Override
    public int a(final adm \u2603) {
        return 2;
    }
    
    @Override
    public void c(final adm \u2603, final cj \u2603, final alz \u2603) {
        if (this.N) {
            for (final cq \u26032 : cq.values()) {
                \u2603.c(\u2603.a(\u26032), this);
            }
        }
    }
    
    @Override
    public void b(final adm \u2603, final cj \u2603, final alz \u2603) {
        if (this.N) {
            for (final cq \u26032 : cq.values()) {
                \u2603.c(\u2603.a(\u26032), this);
            }
        }
    }
    
    @Override
    public int a(final adq \u2603, final cj \u2603, final alz \u2603, final cq \u2603) {
        if (this.N && \u2603.b((amo<Comparable>)ajd.a) != \u2603) {
            return 15;
        }
        return 0;
    }
    
    private boolean g(final adm \u2603, final cj \u2603, final alz \u2603) {
        final cq d = \u2603.b((amo<cq>)ajd.a).d();
        return \u2603.b(\u2603.a(d), d);
    }
    
    @Override
    public void a(final adm \u2603, final cj \u2603, final alz \u2603, final Random \u2603) {
    }
    
    @Override
    public void b(final adm \u2603, final cj \u2603, final alz \u2603, final Random \u2603) {
        final boolean g = this.g(\u2603, \u2603, \u2603);
        final List<a> list = ajd.b.get(\u2603);
        while (list != null && !list.isEmpty() && \u2603.K() - list.get(0).b > 60L) {
            list.remove(0);
        }
        if (this.N) {
            if (g) {
                \u2603.a(\u2603, afi.aE.Q().a((amo<Comparable>)ajd.a, (Comparable)\u2603.b((amo<V>)ajd.a)), 3);
                if (this.a(\u2603, \u2603, true)) {
                    \u2603.a(\u2603.n() + 0.5f, \u2603.o() + 0.5f, \u2603.p() + 0.5f, "random.fizz", 0.5f, 2.6f + (\u2603.s.nextFloat() - \u2603.s.nextFloat()) * 0.8f);
                    for (int i = 0; i < 5; ++i) {
                        final double \u26032 = \u2603.n() + \u2603.nextDouble() * 0.6 + 0.2;
                        final double \u26033 = \u2603.o() + \u2603.nextDouble() * 0.6 + 0.2;
                        final double \u26034 = \u2603.p() + \u2603.nextDouble() * 0.6 + 0.2;
                        \u2603.a(cy.l, \u26032, \u26033, \u26034, 0.0, 0.0, 0.0, new int[0]);
                    }
                    \u2603.a(\u2603, \u2603.p(\u2603).c(), 160);
                }
            }
        }
        else if (!g && !this.a(\u2603, \u2603, false)) {
            \u2603.a(\u2603, afi.aF.Q().a((amo<Comparable>)ajd.a, (Comparable)\u2603.b((amo<V>)ajd.a)), 3);
        }
    }
    
    @Override
    public void a(final adm \u2603, final cj \u2603, final alz \u2603, final afh \u2603) {
        if (this.e(\u2603, \u2603, \u2603)) {
            return;
        }
        if (this.N == this.g(\u2603, \u2603, \u2603)) {
            \u2603.a(\u2603, this, this.a(\u2603));
        }
    }
    
    @Override
    public int b(final adq \u2603, final cj \u2603, final alz \u2603, final cq \u2603) {
        if (\u2603 == cq.a) {
            return this.a(\u2603, \u2603, \u2603, \u2603);
        }
        return 0;
    }
    
    @Override
    public zw a(final alz \u2603, final Random \u2603, final int \u2603) {
        return zw.a(afi.aF);
    }
    
    @Override
    public boolean i() {
        return true;
    }
    
    @Override
    public void c(final adm \u2603, final cj \u2603, final alz \u2603, final Random \u2603) {
        if (!this.N) {
            return;
        }
        double \u26032 = \u2603.n() + 0.5 + (\u2603.nextDouble() - 0.5) * 0.2;
        double \u26033 = \u2603.o() + 0.7 + (\u2603.nextDouble() - 0.5) * 0.2;
        double \u26034 = \u2603.p() + 0.5 + (\u2603.nextDouble() - 0.5) * 0.2;
        final cq cq = \u2603.b((amo<cq>)ajd.a);
        if (cq.k().c()) {
            final cq d = cq.d();
            final double n = 0.27;
            \u26032 += 0.27 * d.g();
            \u26033 += 0.22;
            \u26034 += 0.27 * d.i();
        }
        \u2603.a(cy.E, \u26032, \u26033, \u26034, 0.0, 0.0, 0.0, new int[0]);
    }
    
    @Override
    public zw c(final adm \u2603, final cj \u2603) {
        return zw.a(afi.aF);
    }
    
    @Override
    public boolean b(final afh \u2603) {
        return \u2603 == afi.aE || \u2603 == afi.aF;
    }
    
    static {
        ajd.b = (Map<adm, List<a>>)Maps.newHashMap();
    }
    
    static class a
    {
        cj a;
        long b;
        
        public a(final cj \u2603, final long \u2603) {
            this.a = \u2603;
            this.b = \u2603;
        }
    }
}
