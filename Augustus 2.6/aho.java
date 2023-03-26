import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public class aho extends afh
{
    public static final amm<a> a;
    private final afh b;
    
    public aho(final arm \u2603, final arn \u2603, final afh \u2603) {
        super(\u2603, \u2603);
        this.j(this.M.b().a(aho.a, aho.a.l));
        this.b = \u2603;
    }
    
    @Override
    public int a(final Random \u2603) {
        return Math.max(0, \u2603.nextInt(10) - 7);
    }
    
    @Override
    public arn g(final alz \u2603) {
        switch (aho$1.a[\u2603.b(aho.a).ordinal()]) {
            case 1: {
                return arn.e;
            }
            case 2: {
                return arn.d;
            }
            case 3: {
                return arn.d;
            }
            default: {
                return super.g(\u2603);
            }
        }
    }
    
    @Override
    public zw a(final alz \u2603, final Random \u2603, final int \u2603) {
        return zw.a(this.b);
    }
    
    @Override
    public zw c(final adm \u2603, final cj \u2603) {
        return zw.a(this.b);
    }
    
    @Override
    public alz a(final adm \u2603, final cj \u2603, final cq \u2603, final float \u2603, final float \u2603, final float \u2603, final int \u2603, final pr \u2603) {
        return this.Q();
    }
    
    @Override
    public alz a(final int \u2603) {
        return this.Q().a(aho.a, aho.a.a(\u2603));
    }
    
    @Override
    public int c(final alz \u2603) {
        return \u2603.b(aho.a).a();
    }
    
    @Override
    protected ama e() {
        return new ama(this, new amo[] { aho.a });
    }
    
    static {
        a = amm.a("variant", a.class);
    }
    
    public enum a implements nw
    {
        a(1, "north_west"), 
        b(2, "north"), 
        c(3, "north_east"), 
        d(4, "west"), 
        e(5, "center"), 
        f(6, "east"), 
        g(7, "south_west"), 
        h(8, "south"), 
        i(9, "south_east"), 
        j(10, "stem"), 
        k(0, "all_inside"), 
        l(14, "all_outside"), 
        m(15, "all_stem");
        
        private static final a[] n;
        private final int o;
        private final String p;
        
        private a(final int \u2603, final String \u2603) {
            this.o = \u2603;
            this.p = \u2603;
        }
        
        public int a() {
            return this.o;
        }
        
        @Override
        public String toString() {
            return this.p;
        }
        
        public static a a(int \u2603) {
            if (\u2603 < 0 || \u2603 >= a.n.length) {
                \u2603 = 0;
            }
            final a a = aho.a.n[\u2603];
            return (a == null) ? aho.a.n[0] : a;
        }
        
        @Override
        public String l() {
            return this.p;
        }
        
        static {
            n = new a[16];
            for (final a a2 : values()) {
                a.n[a2.a()] = a2;
            }
        }
    }
}
