import java.util.List;
import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public abstract class aih extends ahh
{
    public static final amk b;
    public static final amm<a> N;
    
    public aih() {
        super(arm.e);
        alz alz = this.M.b();
        if (this.l()) {
            alz = alz.a((amo<Comparable>)aih.b, false);
        }
        else {
            alz = alz.a(aih.a, ahh.a.b);
        }
        this.j(alz.a(aih.N, a.a));
        this.a(yz.b);
    }
    
    @Override
    public String f() {
        return di.a(this.a() + ".red_sandstone.name");
    }
    
    @Override
    public zw a(final alz \u2603, final Random \u2603, final int \u2603) {
        return zw.a(afi.cP);
    }
    
    @Override
    public zw c(final adm \u2603, final cj \u2603) {
        return zw.a(afi.cP);
    }
    
    @Override
    public String b(final int \u2603) {
        return super.a() + "." + a.a(\u2603).d();
    }
    
    @Override
    public amo<?> n() {
        return aih.N;
    }
    
    @Override
    public Object a(final zx \u2603) {
        return a.a(\u2603.i() & 0x7);
    }
    
    @Override
    public void a(final zw \u2603, final yz \u2603, final List<zx> \u2603) {
        if (\u2603 == zw.a(afi.cO)) {
            return;
        }
        for (final a a : a.values()) {
            \u2603.add(new zx(\u2603, 1, a.a()));
        }
    }
    
    @Override
    public alz a(final int \u2603) {
        alz alz = this.Q().a(aih.N, a.a(\u2603 & 0x7));
        if (this.l()) {
            alz = alz.a((amo<Comparable>)aih.b, (\u2603 & 0x8) != 0x0);
        }
        else {
            alz = alz.a(aih.a, ((\u2603 & 0x8) == 0x0) ? ahh.a.b : ahh.a.a);
        }
        return alz;
    }
    
    @Override
    public int c(final alz \u2603) {
        int n = 0;
        n |= \u2603.b(aih.N).a();
        if (this.l()) {
            if (\u2603.b((amo<Boolean>)aih.b)) {
                n |= 0x8;
            }
        }
        else if (\u2603.b(aih.a) == ahh.a.a) {
            n |= 0x8;
        }
        return n;
    }
    
    @Override
    protected ama e() {
        if (this.l()) {
            return new ama(this, new amo[] { aih.b, aih.N });
        }
        return new ama(this, new amo[] { aih.a, aih.N });
    }
    
    @Override
    public arn g(final alz \u2603) {
        return \u2603.b(aih.N).c();
    }
    
    @Override
    public int a(final alz \u2603) {
        return \u2603.b(aih.N).a();
    }
    
    static {
        b = amk.a("seamless");
        N = amm.a("variant", a.class);
    }
    
    public enum a implements nw
    {
        a(0, "red_sandstone", ajh.a.b.c());
        
        private static final a[] b;
        private final int c;
        private final String d;
        private final arn e;
        
        private a(final int \u2603, final String \u2603, final arn \u2603) {
            this.c = \u2603;
            this.d = \u2603;
            this.e = \u2603;
        }
        
        public int a() {
            return this.c;
        }
        
        public arn c() {
            return this.e;
        }
        
        @Override
        public String toString() {
            return this.d;
        }
        
        public static a a(int \u2603) {
            if (\u2603 < 0 || \u2603 >= a.b.length) {
                \u2603 = 0;
            }
            return a.b[\u2603];
        }
        
        @Override
        public String l() {
            return this.d;
        }
        
        public String d() {
            return this.d;
        }
        
        static {
            b = new a[values().length];
            for (final a a2 : values()) {
                a.b[a2.a()] = a2;
            }
        }
    }
}
