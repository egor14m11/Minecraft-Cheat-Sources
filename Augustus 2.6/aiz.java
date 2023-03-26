import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class aiz extends afh
{
    public static final amm<a> a;
    
    public aiz() {
        super(arm.e, ajh.a.b.c());
        this.j(this.M.b().a(aiz.a, aiz.a.a));
        this.a(yz.b);
    }
    
    @Override
    public int a(final alz \u2603) {
        return \u2603.b(aiz.a).a();
    }
    
    @Override
    public void a(final zw \u2603, final yz \u2603, final List<zx> \u2603) {
        for (final a a : aiz.a.values()) {
            \u2603.add(new zx(\u2603, 1, a.a()));
        }
    }
    
    @Override
    public alz a(final int \u2603) {
        return this.Q().a(aiz.a, aiz.a.a(\u2603));
    }
    
    @Override
    public int c(final alz \u2603) {
        return \u2603.b(aiz.a).a();
    }
    
    @Override
    protected ama e() {
        return new ama(this, new amo[] { aiz.a });
    }
    
    static {
        a = amm.a("type", a.class);
    }
    
    public enum a implements nw
    {
        a(0, "red_sandstone", "default"), 
        b(1, "chiseled_red_sandstone", "chiseled"), 
        c(2, "smooth_red_sandstone", "smooth");
        
        private static final a[] d;
        private final int e;
        private final String f;
        private final String g;
        
        private a(final int \u2603, final String \u2603, final String \u2603) {
            this.e = \u2603;
            this.f = \u2603;
            this.g = \u2603;
        }
        
        public int a() {
            return this.e;
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
        
        public String c() {
            return this.g;
        }
        
        static {
            d = new a[values().length];
            for (final a a2 : values()) {
                a.d[a2.a()] = a2;
            }
        }
    }
}
