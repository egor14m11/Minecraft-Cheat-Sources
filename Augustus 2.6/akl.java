import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class akl extends afh
{
    public static final amk a;
    public static final amk b;
    public static final amk N;
    public static final amk O;
    public static final amk P;
    public static final amm<a> Q;
    
    public akl(final afh \u2603) {
        super(\u2603.J);
        this.j(this.M.b().a((amo<Comparable>)akl.a, false).a((amo<Comparable>)akl.b, false).a((amo<Comparable>)akl.N, false).a((amo<Comparable>)akl.O, false).a((amo<Comparable>)akl.P, false).a(akl.Q, akl.a.a));
        this.c(\u2603.w);
        this.b(\u2603.x / 3.0f);
        this.a(\u2603.H);
        this.a(yz.b);
    }
    
    @Override
    public String f() {
        return di.a(this.a() + "." + akl.a.a.c() + ".name");
    }
    
    @Override
    public boolean d() {
        return false;
    }
    
    @Override
    public boolean b(final adq \u2603, final cj \u2603) {
        return false;
    }
    
    @Override
    public boolean c() {
        return false;
    }
    
    @Override
    public void a(final adq \u2603, final cj \u2603) {
        final boolean e = this.e(\u2603, \u2603.c());
        final boolean e2 = this.e(\u2603, \u2603.d());
        final boolean e3 = this.e(\u2603, \u2603.e());
        final boolean e4 = this.e(\u2603, \u2603.f());
        float \u26032 = 0.25f;
        float \u26033 = 0.75f;
        float \u26034 = 0.25f;
        float \u26035 = 0.75f;
        float \u26036 = 1.0f;
        if (e) {
            \u26034 = 0.0f;
        }
        if (e2) {
            \u26035 = 1.0f;
        }
        if (e3) {
            \u26032 = 0.0f;
        }
        if (e4) {
            \u26033 = 1.0f;
        }
        if (e && e2 && !e3 && !e4) {
            \u26036 = 0.8125f;
            \u26032 = 0.3125f;
            \u26033 = 0.6875f;
        }
        else if (!e && !e2 && e3 && e4) {
            \u26036 = 0.8125f;
            \u26034 = 0.3125f;
            \u26035 = 0.6875f;
        }
        this.a(\u26032, 0.0f, \u26034, \u26033, \u26036, \u26035);
    }
    
    @Override
    public aug a(final adm \u2603, final cj \u2603, final alz \u2603) {
        this.a((adq)\u2603, \u2603);
        this.F = 1.5;
        return super.a(\u2603, \u2603, \u2603);
    }
    
    public boolean e(final adq \u2603, final cj \u2603) {
        final afh c = \u2603.p(\u2603).c();
        return c != afi.cv && (c == this || c instanceof agu || (c.J.k() && c.d() && c.J != arm.C));
    }
    
    @Override
    public void a(final zw \u2603, final yz \u2603, final List<zx> \u2603) {
        for (final a a : akl.a.values()) {
            \u2603.add(new zx(\u2603, 1, a.a()));
        }
    }
    
    @Override
    public int a(final alz \u2603) {
        return \u2603.b(akl.Q).a();
    }
    
    @Override
    public boolean a(final adq \u2603, final cj \u2603, final cq \u2603) {
        return \u2603 != cq.a || super.a(\u2603, \u2603, \u2603);
    }
    
    @Override
    public alz a(final int \u2603) {
        return this.Q().a(akl.Q, akl.a.a(\u2603));
    }
    
    @Override
    public int c(final alz \u2603) {
        return \u2603.b(akl.Q).a();
    }
    
    @Override
    public alz a(final alz \u2603, final adq \u2603, final cj \u2603) {
        return \u2603.a((amo<Comparable>)akl.a, !\u2603.d(\u2603.a())).a((amo<Comparable>)akl.b, this.e(\u2603, \u2603.c())).a((amo<Comparable>)akl.N, this.e(\u2603, \u2603.f())).a((amo<Comparable>)akl.O, this.e(\u2603, \u2603.d())).a((amo<Comparable>)akl.P, this.e(\u2603, \u2603.e()));
    }
    
    @Override
    protected ama e() {
        return new ama(this, new amo[] { akl.a, akl.b, akl.N, akl.P, akl.O, akl.Q });
    }
    
    static {
        a = amk.a("up");
        b = amk.a("north");
        N = amk.a("east");
        O = amk.a("south");
        P = amk.a("west");
        Q = amm.a("variant", a.class);
    }
    
    public enum a implements nw
    {
        a(0, "cobblestone", "normal"), 
        b(1, "mossy_cobblestone", "mossy");
        
        private static final a[] c;
        private final int d;
        private final String e;
        private String f;
        
        private a(final int \u2603, final String \u2603, final String \u2603) {
            this.d = \u2603;
            this.e = \u2603;
            this.f = \u2603;
        }
        
        public int a() {
            return this.d;
        }
        
        @Override
        public String toString() {
            return this.e;
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
        
        public String c() {
            return this.f;
        }
        
        static {
            c = new a[values().length];
            for (final a a2 : values()) {
                a.c[a2.a()] = a2;
            }
        }
    }
}
