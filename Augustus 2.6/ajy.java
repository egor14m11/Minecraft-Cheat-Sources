import java.util.List;
import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public class ajy extends afh
{
    public static final amm<a> a;
    
    public ajy() {
        super(arm.e);
        this.j(this.M.b().a(ajy.a, ajy.a.a));
        this.a(yz.b);
    }
    
    @Override
    public String f() {
        return di.a(this.a() + "." + ajy.a.a.d() + ".name");
    }
    
    @Override
    public arn g(final alz \u2603) {
        return \u2603.b(ajy.a).c();
    }
    
    @Override
    public zw a(final alz \u2603, final Random \u2603, final int \u2603) {
        if (\u2603.b(ajy.a) == ajy.a.a) {
            return zw.a(afi.e);
        }
        return zw.a(afi.b);
    }
    
    @Override
    public int a(final alz \u2603) {
        return \u2603.b(ajy.a).a();
    }
    
    @Override
    public void a(final zw \u2603, final yz \u2603, final List<zx> \u2603) {
        for (final a a : ajy.a.values()) {
            \u2603.add(new zx(\u2603, 1, a.a()));
        }
    }
    
    @Override
    public alz a(final int \u2603) {
        return this.Q().a(ajy.a, ajy.a.a(\u2603));
    }
    
    @Override
    public int c(final alz \u2603) {
        return \u2603.b(ajy.a).a();
    }
    
    @Override
    protected ama e() {
        return new ama(this, new amo[] { ajy.a });
    }
    
    static {
        a = amm.a("variant", a.class);
    }
    
    public enum a implements nw
    {
        a(0, arn.m, "stone"), 
        b(1, arn.l, "granite"), 
        c(2, arn.l, "smooth_granite", "graniteSmooth"), 
        d(3, arn.p, "diorite"), 
        e(4, arn.p, "smooth_diorite", "dioriteSmooth"), 
        f(5, arn.m, "andesite"), 
        g(6, arn.m, "smooth_andesite", "andesiteSmooth");
        
        private static final a[] h;
        private final int i;
        private final String j;
        private final String k;
        private final arn l;
        
        private a(final int \u2603, final arn \u2603, final String \u2603) {
            this(\u2603, \u2603, \u2603, \u2603);
        }
        
        private a(final int \u2603, final arn \u2603, final String \u2603, final String \u2603) {
            this.i = \u2603;
            this.j = \u2603;
            this.k = \u2603;
            this.l = \u2603;
        }
        
        public int a() {
            return this.i;
        }
        
        public arn c() {
            return this.l;
        }
        
        @Override
        public String toString() {
            return this.j;
        }
        
        public static a a(int \u2603) {
            if (\u2603 < 0 || \u2603 >= a.h.length) {
                \u2603 = 0;
            }
            return a.h[\u2603];
        }
        
        @Override
        public String l() {
            return this.j;
        }
        
        public String d() {
            return this.k;
        }
        
        static {
            h = new a[values().length];
            for (final a a2 : values()) {
                a.h[a2.a()] = a2;
            }
        }
    }
}
