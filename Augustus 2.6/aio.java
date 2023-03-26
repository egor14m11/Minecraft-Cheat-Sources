import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class aio extends afh
{
    public static final amm<a> a;
    
    public aio() {
        super(arm.d);
        this.j(this.M.b().a(aio.a, aio.a.a));
        this.a(yz.b);
    }
    
    @Override
    public int a(final alz \u2603) {
        return \u2603.b(aio.a).a();
    }
    
    @Override
    public void a(final zw \u2603, final yz \u2603, final List<zx> \u2603) {
        for (final a a : aio.a.values()) {
            \u2603.add(new zx(\u2603, 1, a.a()));
        }
    }
    
    @Override
    public alz a(final int \u2603) {
        return this.Q().a(aio.a, aio.a.a(\u2603));
    }
    
    @Override
    public arn g(final alz \u2603) {
        return \u2603.b(aio.a).c();
    }
    
    @Override
    public int c(final alz \u2603) {
        return \u2603.b(aio.a).a();
    }
    
    @Override
    protected ama e() {
        return new ama(this, new amo[] { aio.a });
    }
    
    static {
        a = amm.a("variant", a.class);
    }
    
    public enum a implements nw
    {
        a(0, "oak", arn.o), 
        b(1, "spruce", arn.J), 
        c(2, "birch", arn.d), 
        d(3, "jungle", arn.l), 
        e(4, "acacia", arn.q), 
        f(5, "dark_oak", "big_oak", arn.B);
        
        private static final a[] g;
        private final int h;
        private final String i;
        private final String j;
        private final arn k;
        
        private a(final int \u2603, final String \u2603, final arn \u2603) {
            this(\u2603, \u2603, \u2603, \u2603);
        }
        
        private a(final int \u2603, final String \u2603, final String \u2603, final arn \u2603) {
            this.h = \u2603;
            this.i = \u2603;
            this.j = \u2603;
            this.k = \u2603;
        }
        
        public int a() {
            return this.h;
        }
        
        public arn c() {
            return this.k;
        }
        
        @Override
        public String toString() {
            return this.i;
        }
        
        public static a a(int \u2603) {
            if (\u2603 < 0 || \u2603 >= a.g.length) {
                \u2603 = 0;
            }
            return a.g[\u2603];
        }
        
        @Override
        public String l() {
            return this.i;
        }
        
        public String d() {
            return this.j;
        }
        
        static {
            g = new a[values().length];
            for (final a a2 : values()) {
                a.g[a2.a()] = a2;
            }
        }
    }
}
