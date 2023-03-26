// 
// Decompiled by Procyon v0.5.36
// 

public class ow
{
    public static ow a;
    public static ow b;
    public static ow c;
    public static ow d;
    public static ow e;
    public static ow f;
    public static ow g;
    public static ow h;
    public static ow i;
    public static ow j;
    public static ow k;
    public static ow l;
    public static ow m;
    public static ow n;
    public static ow o;
    private boolean q;
    private boolean r;
    private boolean s;
    private float t;
    private boolean u;
    private boolean v;
    private boolean w;
    private boolean x;
    private boolean y;
    public String p;
    
    public static ow a(final pr \u2603) {
        return new ox("mob", \u2603);
    }
    
    public static ow a(final wn \u2603) {
        return new ox("player", \u2603);
    }
    
    public static ow a(final wq \u2603, final pk \u2603) {
        return new oy("arrow", \u2603, \u2603).b();
    }
    
    public static ow a(final ws \u2603, final pk \u2603) {
        if (\u2603 == null) {
            return new oy("onFire", \u2603, \u2603).n().b();
        }
        return new oy("fireball", \u2603, \u2603).n().b();
    }
    
    public static ow a(final pk \u2603, final pk \u2603) {
        return new oy("thrown", \u2603, \u2603).b();
    }
    
    public static ow b(final pk \u2603, final pk \u2603) {
        return new oy("indirectMagic", \u2603, \u2603).k().t();
    }
    
    public static ow a(final pk \u2603) {
        return new ox("thorns", \u2603).v().t();
    }
    
    public static ow a(final adi \u2603) {
        if (\u2603 != null && \u2603.c() != null) {
            return new ox("explosion.player", \u2603.c()).q().d();
        }
        return new ow("explosion").q().d();
    }
    
    public boolean a() {
        return this.v;
    }
    
    public ow b() {
        this.v = true;
        return this;
    }
    
    public boolean c() {
        return this.y;
    }
    
    public ow d() {
        this.y = true;
        return this;
    }
    
    public boolean e() {
        return this.q;
    }
    
    public float f() {
        return this.t;
    }
    
    public boolean g() {
        return this.r;
    }
    
    public boolean h() {
        return this.s;
    }
    
    protected ow(final String \u2603) {
        this.t = 0.3f;
        this.p = \u2603;
    }
    
    public pk i() {
        return this.j();
    }
    
    public pk j() {
        return null;
    }
    
    protected ow k() {
        this.q = true;
        this.t = 0.0f;
        return this;
    }
    
    protected ow l() {
        this.r = true;
        return this;
    }
    
    protected ow m() {
        this.s = true;
        this.t = 0.0f;
        return this;
    }
    
    protected ow n() {
        this.u = true;
        return this;
    }
    
    public eu b(final pr \u2603) {
        final pr bt = \u2603.bt();
        final String string = "death.attack." + this.p;
        final String string2 = string + ".player";
        if (bt != null && di.c(string2)) {
            return new fb(string2, new Object[] { \u2603.f_(), bt.f_() });
        }
        return new fb(string, new Object[] { \u2603.f_() });
    }
    
    public boolean o() {
        return this.u;
    }
    
    public String p() {
        return this.p;
    }
    
    public ow q() {
        this.w = true;
        return this;
    }
    
    public boolean r() {
        return this.w;
    }
    
    public boolean s() {
        return this.x;
    }
    
    public ow t() {
        this.x = true;
        return this;
    }
    
    public boolean u() {
        final pk j = this.j();
        return j instanceof wn && ((wn)j).bA.d;
    }
    
    static {
        ow.a = new ow("inFire").n();
        ow.b = new ow("lightningBolt");
        ow.c = new ow("onFire").k().n();
        ow.d = new ow("lava").n();
        ow.e = new ow("inWall").k();
        ow.f = new ow("drown").k();
        ow.g = new ow("starve").k().m();
        ow.h = new ow("cactus");
        ow.i = new ow("fall").k();
        ow.j = new ow("outOfWorld").k().l();
        ow.k = new ow("generic").k();
        ow.l = new ow("magic").k().t();
        ow.m = new ow("wither").k();
        ow.n = new ow("anvil");
        ow.o = new ow("fallingBlock");
    }
}
