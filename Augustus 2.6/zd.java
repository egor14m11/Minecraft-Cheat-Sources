// 
// Decompiled by Procyon v0.5.36
// 

public enum zd implements nw
{
    a(0, 15, "white", "white", arn.j, a.p), 
    b(1, 14, "orange", "orange", arn.q, a.g), 
    c(2, 13, "magenta", "magenta", arn.r, a.l), 
    d(3, 12, "light_blue", "lightBlue", arn.s, a.j), 
    e(4, 11, "yellow", "yellow", arn.t, a.o), 
    f(5, 10, "lime", "lime", arn.u, a.k), 
    g(6, 9, "pink", "pink", arn.v, a.n), 
    h(7, 8, "gray", "gray", arn.w, a.i), 
    i(8, 7, "silver", "silver", arn.x, a.h), 
    j(9, 6, "cyan", "cyan", arn.y, a.d), 
    k(10, 5, "purple", "purple", arn.z, a.f), 
    l(11, 4, "blue", "blue", arn.A, a.b), 
    m(12, 3, "brown", "brown", arn.B, a.g), 
    n(13, 2, "green", "green", arn.C, a.c), 
    o(14, 1, "red", "red", arn.D, a.e), 
    p(15, 0, "black", "black", arn.E, a.a);
    
    private static final zd[] q;
    private static final zd[] r;
    private final int s;
    private final int t;
    private final String u;
    private final String v;
    private final arn w;
    private final a x;
    
    private zd(final int \u2603, final int \u2603, final String \u2603, final String \u2603, final arn \u2603, final a \u2603) {
        this.s = \u2603;
        this.t = \u2603;
        this.u = \u2603;
        this.v = \u2603;
        this.w = \u2603;
        this.x = \u2603;
    }
    
    public int a() {
        return this.s;
    }
    
    public int b() {
        return this.t;
    }
    
    public String d() {
        return this.v;
    }
    
    public arn e() {
        return this.w;
    }
    
    public static zd a(int \u2603) {
        if (\u2603 < 0 || \u2603 >= zd.r.length) {
            \u2603 = 0;
        }
        return zd.r[\u2603];
    }
    
    public static zd b(int \u2603) {
        if (\u2603 < 0 || \u2603 >= zd.q.length) {
            \u2603 = 0;
        }
        return zd.q[\u2603];
    }
    
    @Override
    public String toString() {
        return this.v;
    }
    
    @Override
    public String l() {
        return this.u;
    }
    
    static {
        q = new zd[values().length];
        r = new zd[values().length];
        for (final zd zd : values()) {
            zd.q[zd.a()] = zd;
            zd.r[zd.b()] = zd;
        }
    }
}
