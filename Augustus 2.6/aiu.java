import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class aiu extends afh
{
    public static final amm<a> a;
    public static final int b;
    public static final int N;
    public static final int O;
    
    public aiu() {
        super(arm.e);
        this.j(this.M.b().a(aiu.a, aiu.a.a));
        this.a(yz.b);
    }
    
    @Override
    public String f() {
        return di.a(this.a() + "." + aiu.a.a.c() + ".name");
    }
    
    @Override
    public arn g(final alz \u2603) {
        if (\u2603.b(aiu.a) == aiu.a.a) {
            return arn.y;
        }
        return arn.G;
    }
    
    @Override
    public int a(final alz \u2603) {
        return \u2603.b(aiu.a).a();
    }
    
    @Override
    public int c(final alz \u2603) {
        return \u2603.b(aiu.a).a();
    }
    
    @Override
    protected ama e() {
        return new ama(this, new amo[] { aiu.a });
    }
    
    @Override
    public alz a(final int \u2603) {
        return this.Q().a(aiu.a, aiu.a.a(\u2603));
    }
    
    @Override
    public void a(final zw \u2603, final yz \u2603, final List<zx> \u2603) {
        \u2603.add(new zx(\u2603, 1, aiu.b));
        \u2603.add(new zx(\u2603, 1, aiu.N));
        \u2603.add(new zx(\u2603, 1, aiu.O));
    }
    
    static {
        a = amm.a("variant", a.class);
        b = aiu.a.a.a();
        N = aiu.a.b.a();
        O = aiu.a.c.a();
    }
    
    public enum a implements nw
    {
        a(0, "prismarine", "rough"), 
        b(1, "prismarine_bricks", "bricks"), 
        c(2, "dark_prismarine", "dark");
        
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
