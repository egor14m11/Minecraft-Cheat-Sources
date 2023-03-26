import java.util.List;
import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public abstract class akb extends ahh
{
    public static final amk b;
    public static final amm<a> N;
    
    public akb() {
        super(arm.e);
        alz alz = this.M.b();
        if (this.l()) {
            alz = alz.a((amo<Comparable>)akb.b, false);
        }
        else {
            alz = alz.a(akb.a, ahh.a.b);
        }
        this.j(alz.a(akb.N, a.a));
        this.a(yz.b);
    }
    
    @Override
    public zw a(final alz \u2603, final Random \u2603, final int \u2603) {
        return zw.a(afi.U);
    }
    
    @Override
    public zw c(final adm \u2603, final cj \u2603) {
        return zw.a(afi.U);
    }
    
    @Override
    public String b(final int \u2603) {
        return super.a() + "." + a.a(\u2603).d();
    }
    
    @Override
    public amo<?> n() {
        return akb.N;
    }
    
    @Override
    public Object a(final zx \u2603) {
        return a.a(\u2603.i() & 0x7);
    }
    
    @Override
    public void a(final zw \u2603, final yz \u2603, final List<zx> \u2603) {
        if (\u2603 == zw.a(afi.T)) {
            return;
        }
        for (final a a : a.values()) {
            if (a != a.c) {
                \u2603.add(new zx(\u2603, 1, a.a()));
            }
        }
    }
    
    @Override
    public alz a(final int \u2603) {
        alz alz = this.Q().a(akb.N, a.a(\u2603 & 0x7));
        if (this.l()) {
            alz = alz.a((amo<Comparable>)akb.b, (\u2603 & 0x8) != 0x0);
        }
        else {
            alz = alz.a(akb.a, ((\u2603 & 0x8) == 0x0) ? ahh.a.b : ahh.a.a);
        }
        return alz;
    }
    
    @Override
    public int c(final alz \u2603) {
        int n = 0;
        n |= \u2603.b(akb.N).a();
        if (this.l()) {
            if (\u2603.b((amo<Boolean>)akb.b)) {
                n |= 0x8;
            }
        }
        else if (\u2603.b(akb.a) == ahh.a.a) {
            n |= 0x8;
        }
        return n;
    }
    
    @Override
    protected ama e() {
        if (this.l()) {
            return new ama(this, new amo[] { akb.b, akb.N });
        }
        return new ama(this, new amo[] { akb.a, akb.N });
    }
    
    @Override
    public int a(final alz \u2603) {
        return \u2603.b(akb.N).a();
    }
    
    @Override
    public arn g(final alz \u2603) {
        return \u2603.b(akb.N).c();
    }
    
    static {
        b = amk.a("seamless");
        N = amm.a("variant", a.class);
    }
    
    public enum a implements nw
    {
        a(0, arn.m, "stone"), 
        b(1, arn.d, "sandstone", "sand"), 
        c(2, arn.o, "wood_old", "wood"), 
        d(3, arn.m, "cobblestone", "cobble"), 
        e(4, arn.D, "brick"), 
        f(5, arn.m, "stone_brick", "smoothStoneBrick"), 
        g(6, arn.K, "nether_brick", "netherBrick"), 
        h(7, arn.p, "quartz");
        
        private static final a[] i;
        private final int j;
        private final arn k;
        private final String l;
        private final String m;
        
        private a(final int \u2603, final arn \u2603, final String \u2603) {
            this(\u2603, \u2603, \u2603, \u2603);
        }
        
        private a(final int \u2603, final arn \u2603, final String \u2603, final String \u2603) {
            this.j = \u2603;
            this.k = \u2603;
            this.l = \u2603;
            this.m = \u2603;
        }
        
        public int a() {
            return this.j;
        }
        
        public arn c() {
            return this.k;
        }
        
        @Override
        public String toString() {
            return this.l;
        }
        
        public static a a(int \u2603) {
            if (\u2603 < 0 || \u2603 >= a.i.length) {
                \u2603 = 0;
            }
            return a.i[\u2603];
        }
        
        @Override
        public String l() {
            return this.l;
        }
        
        public String d() {
            return this.m;
        }
        
        static {
            i = new a[values().length];
            for (final a a2 : values()) {
                a.i[a2.a()] = a2;
            }
        }
    }
}
