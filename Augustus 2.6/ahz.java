import java.util.List;
import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public class ahz extends afh
{
    public static final amm<a> a;
    
    public ahz() {
        super(arm.B);
        this.j(this.M.b().a(ahz.a, ahz.a.a));
        this.c(0.0f);
        this.a(yz.c);
    }
    
    @Override
    public int a(final Random \u2603) {
        return 0;
    }
    
    public static boolean d(final alz \u2603) {
        final afh c = \u2603.c();
        return \u2603 == afi.b.Q().a(ajy.a, ajy.a.a) || c == afi.e || c == afi.bf;
    }
    
    @Override
    protected zx i(final alz \u2603) {
        switch (ahz$1.a[\u2603.b(ahz.a).ordinal()]) {
            case 1: {
                return new zx(afi.e);
            }
            case 2: {
                return new zx(afi.bf);
            }
            case 3: {
                return new zx(afi.bf, 1, ajz.a.b.a());
            }
            case 4: {
                return new zx(afi.bf, 1, ajz.a.c.a());
            }
            case 5: {
                return new zx(afi.bf, 1, ajz.a.d.a());
            }
            default: {
                return new zx(afi.b);
            }
        }
    }
    
    @Override
    public void a(final adm \u2603, final cj \u2603, final alz \u2603, final float \u2603, final int \u2603) {
        if (!\u2603.D && \u2603.Q().b("doTileDrops")) {
            final vz \u26032 = new vz(\u2603);
            \u26032.b(\u2603.n() + 0.5, \u2603.o(), \u2603.p() + 0.5, 0.0f, 0.0f);
            \u2603.d(\u26032);
            \u26032.y();
        }
    }
    
    @Override
    public int j(final adm \u2603, final cj \u2603) {
        final alz p = \u2603.p(\u2603);
        return p.c().c(p);
    }
    
    @Override
    public void a(final zw \u2603, final yz \u2603, final List<zx> \u2603) {
        for (final a a : ahz.a.values()) {
            \u2603.add(new zx(\u2603, 1, a.a()));
        }
    }
    
    @Override
    public alz a(final int \u2603) {
        return this.Q().a(ahz.a, ahz.a.a(\u2603));
    }
    
    @Override
    public int c(final alz \u2603) {
        return \u2603.b(ahz.a).a();
    }
    
    @Override
    protected ama e() {
        return new ama(this, new amo[] { ahz.a });
    }
    
    static {
        a = amm.a("variant", a.class);
    }
    
    public enum a implements nw
    {
        a(0, "stone") {
            @Override
            public alz d() {
                return afi.b.Q().a(ajy.a, ajy.a.a);
            }
        }, 
        b(1, "cobblestone", "cobble") {
            @Override
            public alz d() {
                return afi.e.Q();
            }
        }, 
        c(2, "stone_brick", "brick") {
            @Override
            public alz d() {
                return afi.bf.Q().a(ajz.a, ajz.a.a);
            }
        }, 
        d(3, "mossy_brick", "mossybrick") {
            @Override
            public alz d() {
                return afi.bf.Q().a(ajz.a, ajz.a.b);
            }
        }, 
        e(4, "cracked_brick", "crackedbrick") {
            @Override
            public alz d() {
                return afi.bf.Q().a(ajz.a, ajz.a.c);
            }
        }, 
        f(5, "chiseled_brick", "chiseledbrick") {
            @Override
            public alz d() {
                return afi.bf.Q().a(ajz.a, ajz.a.d);
            }
        };
        
        private static final a[] g;
        private final int h;
        private final String i;
        private final String j;
        
        private a(final int \u2603, final String \u2603) {
            this(\u2603, \u2603, \u2603);
        }
        
        private a(final int \u2603, final String \u2603, final String \u2603) {
            this.h = \u2603;
            this.i = \u2603;
            this.j = \u2603;
        }
        
        public int a() {
            return this.h;
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
        
        public String c() {
            return this.j;
        }
        
        public abstract alz d();
        
        public static a a(final alz \u2603) {
            for (final a a : values()) {
                if (\u2603 == a.d()) {
                    return a;
                }
            }
            return a.a;
        }
        
        static {
            g = new a[values().length];
            for (final a a2 : values()) {
                a.g[a2.a()] = a2;
            }
        }
    }
}
