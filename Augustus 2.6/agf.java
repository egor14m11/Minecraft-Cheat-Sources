import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class agf extends afh
{
    public static final amm<a> a;
    public static final amk b;
    
    protected agf() {
        super(arm.c);
        this.j(this.M.b().a(agf.a, agf.a.a).a((amo<Comparable>)agf.b, false));
        this.a(yz.b);
    }
    
    @Override
    public arn g(final alz \u2603) {
        return \u2603.b(agf.a).d();
    }
    
    @Override
    public alz a(alz \u2603, final adq \u2603, final cj \u2603) {
        if (\u2603.b(agf.a) == agf.a.c) {
            final afh c = \u2603.p(\u2603.a()).c();
            \u2603 = \u2603.a((amo<Comparable>)agf.b, c == afi.aJ || c == afi.aH);
        }
        return \u2603;
    }
    
    @Override
    public void a(final zw \u2603, final yz \u2603, final List<zx> \u2603) {
        \u2603.add(new zx(this, 1, agf.a.a.a()));
        \u2603.add(new zx(this, 1, agf.a.b.a()));
        \u2603.add(new zx(this, 1, agf.a.c.a()));
    }
    
    @Override
    public int j(final adm \u2603, final cj \u2603) {
        final alz p = \u2603.p(\u2603);
        if (p.c() != this) {
            return 0;
        }
        return p.b(agf.a).a();
    }
    
    @Override
    public alz a(final int \u2603) {
        return this.Q().a(agf.a, agf.a.a(\u2603));
    }
    
    @Override
    public int c(final alz \u2603) {
        return \u2603.b(agf.a).a();
    }
    
    @Override
    protected ama e() {
        return new ama(this, new amo[] { agf.a, agf.b });
    }
    
    @Override
    public int a(final alz \u2603) {
        a a = \u2603.b(agf.a);
        if (a == agf.a.c) {
            a = agf.a.a;
        }
        return a.a();
    }
    
    static {
        a = amm.a("variant", a.class);
        b = amk.a("snowy");
    }
    
    public enum a implements nw
    {
        a(0, "dirt", "default", arn.l), 
        b(1, "coarse_dirt", "coarse", arn.l), 
        c(2, "podzol", arn.J);
        
        private static final a[] d;
        private final int e;
        private final String f;
        private final String g;
        private final arn h;
        
        private a(final int \u2603, final String \u2603, final arn \u2603) {
            this(\u2603, \u2603, \u2603, \u2603);
        }
        
        private a(final int \u2603, final String \u2603, final String \u2603, final arn \u2603) {
            this.e = \u2603;
            this.f = \u2603;
            this.g = \u2603;
            this.h = \u2603;
        }
        
        public int a() {
            return this.e;
        }
        
        public String c() {
            return this.g;
        }
        
        public arn d() {
            return this.h;
        }
        
        @Override
        public String toString() {
            return this.f;
        }
        
        public static a a(int \u2603) {
            if (\u2603 < 0 || \u2603 >= a.d.length) {
                \u2603 = 0;
            }
            return a.d[\u2603];
        }
        
        @Override
        public String l() {
            return this.f;
        }
        
        static {
            d = new a[values().length];
            for (final a a2 : values()) {
                a.d[a2.a()] = a2;
            }
        }
    }
}
