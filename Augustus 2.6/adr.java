// 
// Decompiled by Procyon v0.5.36
// 

public class adr
{
    public static final adr[] a;
    public static final adr b;
    public static final adr c;
    public static final adr d;
    public static final adr e;
    public static final adr f;
    public static final adr g;
    public static final adr h;
    private final int i;
    private final String j;
    private final int k;
    private boolean l;
    private boolean m;
    private boolean n;
    
    private adr(final int \u2603, final String \u2603) {
        this(\u2603, \u2603, 0);
    }
    
    private adr(final int \u2603, final String \u2603, final int \u2603) {
        this.j = \u2603;
        this.k = \u2603;
        this.l = true;
        this.i = \u2603;
        adr.a[\u2603] = this;
    }
    
    public String a() {
        return this.j;
    }
    
    public String b() {
        return "generator." + this.j;
    }
    
    public String c() {
        return this.b() + ".info";
    }
    
    public int d() {
        return this.k;
    }
    
    public adr a(final int \u2603) {
        if (this == adr.b && \u2603 == 0) {
            return adr.h;
        }
        return this;
    }
    
    private adr a(final boolean \u2603) {
        this.l = \u2603;
        return this;
    }
    
    public boolean e() {
        return this.l;
    }
    
    private adr i() {
        this.m = true;
        return this;
    }
    
    public boolean f() {
        return this.m;
    }
    
    public static adr a(final String \u2603) {
        for (int i = 0; i < adr.a.length; ++i) {
            if (adr.a[i] != null && adr.a[i].j.equalsIgnoreCase(\u2603)) {
                return adr.a[i];
            }
        }
        return null;
    }
    
    public int g() {
        return this.i;
    }
    
    public boolean h() {
        return this.n;
    }
    
    private adr j() {
        this.n = true;
        return this;
    }
    
    static {
        a = new adr[16];
        b = new adr(0, "default", 1).i();
        c = new adr(1, "flat");
        d = new adr(2, "largeBiomes");
        e = new adr(3, "amplified").j();
        f = new adr(4, "customized");
        g = new adr(5, "debug_all_block_states");
        h = new adr(8, "default_1_1", 0).a(false);
    }
}
