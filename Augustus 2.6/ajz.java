import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class ajz extends afh
{
    public static final amm<a> a;
    public static final int b;
    public static final int N;
    public static final int O;
    public static final int P;
    
    public ajz() {
        super(arm.e);
        this.j(this.M.b().a(ajz.a, ajz.a.a));
        this.a(yz.b);
    }
    
    @Override
    public int a(final alz \u2603) {
        return \u2603.b(ajz.a).a();
    }
    
    @Override
    public void a(final zw \u2603, final yz \u2603, final List<zx> \u2603) {
        for (final a a : ajz.a.values()) {
            \u2603.add(new zx(\u2603, 1, a.a()));
        }
    }
    
    @Override
    public alz a(final int \u2603) {
        return this.Q().a(ajz.a, ajz.a.a(\u2603));
    }
    
    @Override
    public int c(final alz \u2603) {
        return \u2603.b(ajz.a).a();
    }
    
    @Override
    protected ama e() {
        return new ama(this, new amo[] { ajz.a });
    }
    
    static {
        a = amm.a("variant", a.class);
        b = ajz.a.a.a();
        N = ajz.a.b.a();
        O = ajz.a.c.a();
        P = ajz.a.d.a();
    }
    
    public enum a implements nw
    {
        a(0, "stonebrick", "default"), 
        b(1, "mossy_stonebrick", "mossy"), 
        c(2, "cracked_stonebrick", "cracked"), 
        d(3, "chiseled_stonebrick", "chiseled");
        
        private static final a[] e;
        private final int f;
        private final String g;
        private final String h;
        
        private a(final int \u2603, final String \u2603, final String \u2603) {
            this.f = \u2603;
            this.g = \u2603;
            this.h = \u2603;
        }
        
        public int a() {
            return this.f;
        }
        
        @Override
        public String toString() {
            return this.g;
        }
        
        public static a a(int \u2603) {
            if (\u2603 < 0 || \u2603 >= a.e.length) {
                \u2603 = 0;
            }
            return a.e[\u2603];
        }
        
        @Override
        public String l() {
            return this.g;
        }
        
        public String c() {
            return this.h;
        }
        
        static {
            e = new a[values().length];
            for (final a a2 : values()) {
                a.e[a2.a()] = a2;
            }
        }
    }
}
