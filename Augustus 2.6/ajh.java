import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class ajh extends agr
{
    public static final amm<a> a;
    
    public ajh() {
        this.j(this.M.b().a(ajh.a, ajh.a.a));
    }
    
    @Override
    public int a(final alz \u2603) {
        return \u2603.b(ajh.a).a();
    }
    
    @Override
    public void a(final zw \u2603, final yz \u2603, final List<zx> \u2603) {
        for (final a a : ajh.a.values()) {
            \u2603.add(new zx(\u2603, 1, a.a()));
        }
    }
    
    @Override
    public arn g(final alz \u2603) {
        return \u2603.b(ajh.a).c();
    }
    
    @Override
    public alz a(final int \u2603) {
        return this.Q().a(ajh.a, ajh.a.a(\u2603));
    }
    
    @Override
    public int c(final alz \u2603) {
        return \u2603.b(ajh.a).a();
    }
    
    @Override
    protected ama e() {
        return new ama(this, new amo[] { ajh.a });
    }
    
    static {
        a = amm.a("variant", a.class);
    }
    
    public enum a implements nw
    {
        a(0, "sand", "default", arn.d), 
        b(1, "red_sand", "red", arn.q);
        
        private static final a[] c;
        private final int d;
        private final String e;
        private final arn f;
        private final String g;
        
        private a(final int \u2603, final String \u2603, final String \u2603, final arn \u2603) {
            this.d = \u2603;
            this.e = \u2603;
            this.f = \u2603;
            this.g = \u2603;
        }
        
        public int a() {
            return this.d;
        }
        
        @Override
        public String toString() {
            return this.e;
        }
        
        public arn c() {
            return this.f;
        }
        
        public static a a(int \u2603) {
            if (\u2603 < 0 || \u2603 >= a.c.length) {
                \u2603 = 0;
            }
            return a.c[\u2603];
        }
        
        @Override
        public String l() {
            return this.e;
        }
        
        public String d() {
            return this.g;
        }
        
        static {
            c = new a[values().length];
            for (final a a2 : values()) {
                a.c[a2.a()] = a2;
            }
        }
    }
}
