import java.util.Collection;
import com.google.common.collect.Collections2;
import com.google.common.collect.Lists;
import com.google.common.base.Predicate;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public abstract class agw extends afm
{
    protected amm<a> a;
    
    protected agw() {
        this.j(this.M.b().a(this.n(), (this.l() == b.b) ? agw.a.b : agw.a.a));
    }
    
    @Override
    public int a(final alz \u2603) {
        return \u2603.b(this.n()).b();
    }
    
    @Override
    public void a(final zw \u2603, final yz \u2603, final List<zx> \u2603) {
        for (final a a2 : agw.a.a(this.l())) {
            \u2603.add(new zx(\u2603, 1, a2.b()));
        }
    }
    
    @Override
    public alz a(final int \u2603) {
        return this.Q().a(this.n(), agw.a.a(this.l(), \u2603));
    }
    
    public abstract b l();
    
    public amo<a> n() {
        if (this.a == null) {
            this.a = amm.a("type", a.class, new Predicate<a>() {
                public boolean a(final a \u2603) {
                    return \u2603.a() == agw.this.l();
                }
            });
        }
        return this.a;
    }
    
    @Override
    public int c(final alz \u2603) {
        return \u2603.b(this.n()).b();
    }
    
    @Override
    protected ama e() {
        return new ama(this, new amo[] { this.n() });
    }
    
    @Override
    public afh.a R() {
        return afh.a.b;
    }
    
    public enum b
    {
        a, 
        b;
        
        public agw a() {
            if (this == b.a) {
                return afi.N;
            }
            return afi.O;
        }
    }
    
    public enum a implements nw
    {
        a(agw.b.a, 0, "dandelion"), 
        b(agw.b.b, 0, "poppy"), 
        c(agw.b.b, 1, "blue_orchid", "blueOrchid"), 
        d(agw.b.b, 2, "allium"), 
        e(agw.b.b, 3, "houstonia"), 
        f(agw.b.b, 4, "red_tulip", "tulipRed"), 
        g(agw.b.b, 5, "orange_tulip", "tulipOrange"), 
        h(agw.b.b, 6, "white_tulip", "tulipWhite"), 
        i(agw.b.b, 7, "pink_tulip", "tulipPink"), 
        j(agw.b.b, 8, "oxeye_daisy", "oxeyeDaisy");
        
        private static final a[][] k;
        private final b l;
        private final int m;
        private final String n;
        private final String o;
        
        private a(final b \u2603, final int \u2603, final String \u2603) {
            this(\u2603, \u2603, \u2603, \u2603);
        }
        
        private a(final b \u2603, final int \u2603, final String \u2603, final String \u2603) {
            this.l = \u2603;
            this.m = \u2603;
            this.n = \u2603;
            this.o = \u2603;
        }
        
        public b a() {
            return this.l;
        }
        
        public int b() {
            return this.m;
        }
        
        public static a a(final b \u2603, int \u2603) {
            final a[] array = a.k[\u2603.ordinal()];
            if (\u2603 < 0 || \u2603 >= array.length) {
                \u2603 = 0;
            }
            return array[\u2603];
        }
        
        public static a[] a(final b \u2603) {
            return a.k[\u2603.ordinal()];
        }
        
        @Override
        public String toString() {
            return this.n;
        }
        
        @Override
        public String l() {
            return this.n;
        }
        
        public String d() {
            return this.o;
        }
        
        static {
            k = new a[agw.b.values().length][];
            for (final b b2 : agw.b.values()) {
                final Collection<a> filter = Collections2.filter(Lists.newArrayList(values()), new Predicate<a>() {
                    public boolean a(final a \u2603) {
                        return \u2603.a() == b2;
                    }
                });
                a.k[b2.ordinal()] = filter.toArray(new a[filter.size()]);
            }
        }
    }
}
