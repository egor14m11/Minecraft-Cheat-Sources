// 
// Decompiled by Procyon v0.5.36
// 

public enum bfj
{
    a(new b[] { new b(a.f, a.e, a.a), new b(a.f, a.e, a.d), new b(a.c, a.e, a.d), new b(a.c, a.e, a.a) }), 
    b(new b[] { new b(a.f, a.b, a.d), new b(a.f, a.b, a.a), new b(a.c, a.b, a.a), new b(a.c, a.b, a.d) }), 
    c(new b[] { new b(a.c, a.b, a.d), new b(a.c, a.e, a.d), new b(a.f, a.e, a.d), new b(a.f, a.b, a.d) }), 
    d(new b[] { new b(a.f, a.b, a.a), new b(a.f, a.e, a.a), new b(a.c, a.e, a.a), new b(a.c, a.b, a.a) }), 
    e(new b[] { new b(a.f, a.b, a.d), new b(a.f, a.e, a.d), new b(a.f, a.e, a.a), new b(a.f, a.b, a.a) }), 
    f(new b[] { new b(a.c, a.b, a.a), new b(a.c, a.e, a.a), new b(a.c, a.e, a.d), new b(a.c, a.b, a.d) });
    
    private static final bfj[] g;
    private final b[] h;
    
    public static bfj a(final cq \u2603) {
        return bfj.g[\u2603.a()];
    }
    
    private bfj(final b[] \u2603) {
        this.h = \u2603;
    }
    
    public b a(final int \u2603) {
        return this.h[\u2603];
    }
    
    static {
        (g = new bfj[6])[a.e] = bfj.a;
        bfj.g[a.b] = bfj.b;
        bfj.g[a.d] = bfj.c;
        bfj.g[a.a] = bfj.d;
        bfj.g[a.f] = bfj.e;
        bfj.g[a.c] = bfj.f;
    }
    
    public static final class a
    {
        public static final int a;
        public static final int b;
        public static final int c;
        public static final int d;
        public static final int e;
        public static final int f;
        
        static {
            a = cq.d.a();
            b = cq.b.a();
            c = cq.f.a();
            d = cq.c.a();
            e = cq.a.a();
            f = cq.e.a();
        }
    }
    
    public static class b
    {
        public final int a;
        public final int b;
        public final int c;
        
        private b(final int \u2603, final int \u2603, final int \u2603) {
            this.a = \u2603;
            this.b = \u2603;
            this.c = \u2603;
        }
    }
}
