import java.util.concurrent.Callable;
import net.minecraft.server.MinecraftServer;

// 
// Decompiled by Procyon v0.5.36
// 

public class ato
{
    public static final oj a;
    private long b;
    private adr c;
    private String d;
    private int e;
    private int f;
    private int g;
    private long h;
    private long i;
    private long j;
    private long k;
    private dn l;
    private int m;
    private String n;
    private int o;
    private int p;
    private boolean q;
    private int r;
    private boolean s;
    private int t;
    private adp.a u;
    private boolean v;
    private boolean w;
    private boolean x;
    private boolean y;
    private oj z;
    private boolean A;
    private double B;
    private double C;
    private double D;
    private long E;
    private double F;
    private double G;
    private double H;
    private int I;
    private int J;
    private adk K;
    
    protected ato() {
        this.c = adr.b;
        this.d = "";
        this.B = 0.0;
        this.C = 0.0;
        this.D = 6.0E7;
        this.E = 0L;
        this.F = 0.0;
        this.G = 5.0;
        this.H = 0.2;
        this.I = 5;
        this.J = 15;
        this.K = new adk();
    }
    
    public ato(final dn \u2603) {
        this.c = adr.b;
        this.d = "";
        this.B = 0.0;
        this.C = 0.0;
        this.D = 6.0E7;
        this.E = 0L;
        this.F = 0.0;
        this.G = 5.0;
        this.H = 0.2;
        this.I = 5;
        this.J = 15;
        this.K = new adk();
        this.b = \u2603.g("RandomSeed");
        if (\u2603.b("generatorName", 8)) {
            final String j = \u2603.j("generatorName");
            this.c = adr.a(j);
            if (this.c == null) {
                this.c = adr.b;
            }
            else if (this.c.f()) {
                int f = 0;
                if (\u2603.b("generatorVersion", 99)) {
                    f = \u2603.f("generatorVersion");
                }
                this.c = this.c.a(f);
            }
            if (\u2603.b("generatorOptions", 8)) {
                this.d = \u2603.j("generatorOptions");
            }
        }
        this.u = adp.a.a(\u2603.f("GameType"));
        if (\u2603.b("MapFeatures", 99)) {
            this.v = \u2603.n("MapFeatures");
        }
        else {
            this.v = true;
        }
        this.e = \u2603.f("SpawnX");
        this.f = \u2603.f("SpawnY");
        this.g = \u2603.f("SpawnZ");
        this.h = \u2603.g("Time");
        if (\u2603.b("DayTime", 99)) {
            this.i = \u2603.g("DayTime");
        }
        else {
            this.i = this.h;
        }
        this.j = \u2603.g("LastPlayed");
        this.k = \u2603.g("SizeOnDisk");
        this.n = \u2603.j("LevelName");
        this.o = \u2603.f("version");
        this.p = \u2603.f("clearWeatherTime");
        this.r = \u2603.f("rainTime");
        this.q = \u2603.n("raining");
        this.t = \u2603.f("thunderTime");
        this.s = \u2603.n("thundering");
        this.w = \u2603.n("hardcore");
        if (\u2603.b("initialized", 99)) {
            this.y = \u2603.n("initialized");
        }
        else {
            this.y = true;
        }
        if (\u2603.b("allowCommands", 99)) {
            this.x = \u2603.n("allowCommands");
        }
        else {
            this.x = (this.u == adp.a.c);
        }
        if (\u2603.b("Player", 10)) {
            this.l = \u2603.m("Player");
            this.m = this.l.f("Dimension");
        }
        if (\u2603.b("GameRules", 10)) {
            this.K.a(\u2603.m("GameRules"));
        }
        if (\u2603.b("Difficulty", 99)) {
            this.z = oj.a(\u2603.d("Difficulty"));
        }
        if (\u2603.b("DifficultyLocked", 1)) {
            this.A = \u2603.n("DifficultyLocked");
        }
        if (\u2603.b("BorderCenterX", 99)) {
            this.B = \u2603.i("BorderCenterX");
        }
        if (\u2603.b("BorderCenterZ", 99)) {
            this.C = \u2603.i("BorderCenterZ");
        }
        if (\u2603.b("BorderSize", 99)) {
            this.D = \u2603.i("BorderSize");
        }
        if (\u2603.b("BorderSizeLerpTime", 99)) {
            this.E = \u2603.g("BorderSizeLerpTime");
        }
        if (\u2603.b("BorderSizeLerpTarget", 99)) {
            this.F = \u2603.i("BorderSizeLerpTarget");
        }
        if (\u2603.b("BorderSafeZone", 99)) {
            this.G = \u2603.i("BorderSafeZone");
        }
        if (\u2603.b("BorderDamagePerBlock", 99)) {
            this.H = \u2603.i("BorderDamagePerBlock");
        }
        if (\u2603.b("BorderWarningBlocks", 99)) {
            this.I = \u2603.f("BorderWarningBlocks");
        }
        if (\u2603.b("BorderWarningTime", 99)) {
            this.J = \u2603.f("BorderWarningTime");
        }
    }
    
    public ato(final adp \u2603, final String \u2603) {
        this.c = adr.b;
        this.d = "";
        this.B = 0.0;
        this.C = 0.0;
        this.D = 6.0E7;
        this.E = 0L;
        this.F = 0.0;
        this.G = 5.0;
        this.H = 0.2;
        this.I = 5;
        this.J = 15;
        this.K = new adk();
        this.a(\u2603);
        this.n = \u2603;
        this.z = ato.a;
        this.y = false;
    }
    
    public void a(final adp \u2603) {
        this.b = \u2603.d();
        this.u = \u2603.e();
        this.v = \u2603.g();
        this.w = \u2603.f();
        this.c = \u2603.h();
        this.d = \u2603.j();
        this.x = \u2603.i();
    }
    
    public ato(final ato \u2603) {
        this.c = adr.b;
        this.d = "";
        this.B = 0.0;
        this.C = 0.0;
        this.D = 6.0E7;
        this.E = 0L;
        this.F = 0.0;
        this.G = 5.0;
        this.H = 0.2;
        this.I = 5;
        this.J = 15;
        this.K = new adk();
        this.b = \u2603.b;
        this.c = \u2603.c;
        this.d = \u2603.d;
        this.u = \u2603.u;
        this.v = \u2603.v;
        this.e = \u2603.e;
        this.f = \u2603.f;
        this.g = \u2603.g;
        this.h = \u2603.h;
        this.i = \u2603.i;
        this.j = \u2603.j;
        this.k = \u2603.k;
        this.l = \u2603.l;
        this.m = \u2603.m;
        this.n = \u2603.n;
        this.o = \u2603.o;
        this.r = \u2603.r;
        this.q = \u2603.q;
        this.t = \u2603.t;
        this.s = \u2603.s;
        this.w = \u2603.w;
        this.x = \u2603.x;
        this.y = \u2603.y;
        this.K = \u2603.K;
        this.z = \u2603.z;
        this.A = \u2603.A;
        this.B = \u2603.B;
        this.C = \u2603.C;
        this.D = \u2603.D;
        this.E = \u2603.E;
        this.F = \u2603.F;
        this.G = \u2603.G;
        this.H = \u2603.H;
        this.J = \u2603.J;
        this.I = \u2603.I;
    }
    
    public dn a() {
        final dn \u2603 = new dn();
        this.a(\u2603, this.l);
        return \u2603;
    }
    
    public dn a(final dn \u2603) {
        final dn \u26032 = new dn();
        this.a(\u26032, \u2603);
        return \u26032;
    }
    
    private void a(final dn \u2603, final dn \u2603) {
        \u2603.a("RandomSeed", this.b);
        \u2603.a("generatorName", this.c.a());
        \u2603.a("generatorVersion", this.c.d());
        \u2603.a("generatorOptions", this.d);
        \u2603.a("GameType", this.u.a());
        \u2603.a("MapFeatures", this.v);
        \u2603.a("SpawnX", this.e);
        \u2603.a("SpawnY", this.f);
        \u2603.a("SpawnZ", this.g);
        \u2603.a("Time", this.h);
        \u2603.a("DayTime", this.i);
        \u2603.a("SizeOnDisk", this.k);
        \u2603.a("LastPlayed", MinecraftServer.az());
        \u2603.a("LevelName", this.n);
        \u2603.a("version", this.o);
        \u2603.a("clearWeatherTime", this.p);
        \u2603.a("rainTime", this.r);
        \u2603.a("raining", this.q);
        \u2603.a("thunderTime", this.t);
        \u2603.a("thundering", this.s);
        \u2603.a("hardcore", this.w);
        \u2603.a("allowCommands", this.x);
        \u2603.a("initialized", this.y);
        \u2603.a("BorderCenterX", this.B);
        \u2603.a("BorderCenterZ", this.C);
        \u2603.a("BorderSize", this.D);
        \u2603.a("BorderSizeLerpTime", this.E);
        \u2603.a("BorderSafeZone", this.G);
        \u2603.a("BorderDamagePerBlock", this.H);
        \u2603.a("BorderSizeLerpTarget", this.F);
        \u2603.a("BorderWarningBlocks", (double)this.I);
        \u2603.a("BorderWarningTime", (double)this.J);
        if (this.z != null) {
            \u2603.a("Difficulty", (byte)this.z.a());
        }
        \u2603.a("DifficultyLocked", this.A);
        \u2603.a("GameRules", this.K.a());
        if (\u2603 != null) {
            \u2603.a("Player", \u2603);
        }
    }
    
    public long b() {
        return this.b;
    }
    
    public int c() {
        return this.e;
    }
    
    public int d() {
        return this.f;
    }
    
    public int e() {
        return this.g;
    }
    
    public long f() {
        return this.h;
    }
    
    public long g() {
        return this.i;
    }
    
    public long h() {
        return this.k;
    }
    
    public dn i() {
        return this.l;
    }
    
    public void a(final int \u2603) {
        this.e = \u2603;
    }
    
    public void b(final int \u2603) {
        this.f = \u2603;
    }
    
    public void c(final int \u2603) {
        this.g = \u2603;
    }
    
    public void b(final long \u2603) {
        this.h = \u2603;
    }
    
    public void c(final long \u2603) {
        this.i = \u2603;
    }
    
    public void a(final cj \u2603) {
        this.e = \u2603.n();
        this.f = \u2603.o();
        this.g = \u2603.p();
    }
    
    public String k() {
        return this.n;
    }
    
    public void a(final String \u2603) {
        this.n = \u2603;
    }
    
    public int l() {
        return this.o;
    }
    
    public void e(final int \u2603) {
        this.o = \u2603;
    }
    
    public long m() {
        return this.j;
    }
    
    public int A() {
        return this.p;
    }
    
    public void i(final int \u2603) {
        this.p = \u2603;
    }
    
    public boolean n() {
        return this.s;
    }
    
    public void a(final boolean \u2603) {
        this.s = \u2603;
    }
    
    public int o() {
        return this.t;
    }
    
    public void f(final int \u2603) {
        this.t = \u2603;
    }
    
    public boolean p() {
        return this.q;
    }
    
    public void b(final boolean \u2603) {
        this.q = \u2603;
    }
    
    public int q() {
        return this.r;
    }
    
    public void g(final int \u2603) {
        this.r = \u2603;
    }
    
    public adp.a r() {
        return this.u;
    }
    
    public boolean s() {
        return this.v;
    }
    
    public void f(final boolean \u2603) {
        this.v = \u2603;
    }
    
    public void a(final adp.a \u2603) {
        this.u = \u2603;
    }
    
    public boolean t() {
        return this.w;
    }
    
    public void g(final boolean \u2603) {
        this.w = \u2603;
    }
    
    public adr u() {
        return this.c;
    }
    
    public void a(final adr \u2603) {
        this.c = \u2603;
    }
    
    public String B() {
        return this.d;
    }
    
    public boolean v() {
        return this.x;
    }
    
    public void c(final boolean \u2603) {
        this.x = \u2603;
    }
    
    public boolean w() {
        return this.y;
    }
    
    public void d(final boolean \u2603) {
        this.y = \u2603;
    }
    
    public adk x() {
        return this.K;
    }
    
    public double C() {
        return this.B;
    }
    
    public double D() {
        return this.C;
    }
    
    public double E() {
        return this.D;
    }
    
    public void a(final double \u2603) {
        this.D = \u2603;
    }
    
    public long F() {
        return this.E;
    }
    
    public void e(final long \u2603) {
        this.E = \u2603;
    }
    
    public double G() {
        return this.F;
    }
    
    public void b(final double \u2603) {
        this.F = \u2603;
    }
    
    public void c(final double \u2603) {
        this.C = \u2603;
    }
    
    public void d(final double \u2603) {
        this.B = \u2603;
    }
    
    public double H() {
        return this.G;
    }
    
    public void e(final double \u2603) {
        this.G = \u2603;
    }
    
    public double I() {
        return this.H;
    }
    
    public void f(final double \u2603) {
        this.H = \u2603;
    }
    
    public int J() {
        return this.I;
    }
    
    public int K() {
        return this.J;
    }
    
    public void j(final int \u2603) {
        this.I = \u2603;
    }
    
    public void k(final int \u2603) {
        this.J = \u2603;
    }
    
    public oj y() {
        return this.z;
    }
    
    public void a(final oj \u2603) {
        this.z = \u2603;
    }
    
    public boolean z() {
        return this.A;
    }
    
    public void e(final boolean \u2603) {
        this.A = \u2603;
    }
    
    public void a(final c \u2603) {
        \u2603.a("Level seed", new Callable<String>() {
            public String a() throws Exception {
                return String.valueOf(ato.this.b());
            }
        });
        \u2603.a("Level generator", new Callable<String>() {
            public String a() throws Exception {
                return String.format("ID %02d - %s, ver %d. Features enabled: %b", ato.this.c.g(), ato.this.c.a(), ato.this.c.d(), ato.this.v);
            }
        });
        \u2603.a("Level generator options", new Callable<String>() {
            public String a() throws Exception {
                return ato.this.d;
            }
        });
        \u2603.a("Level spawn location", new Callable<String>() {
            public String a() throws Exception {
                return c.a(ato.this.e, ato.this.f, ato.this.g);
            }
        });
        \u2603.a("Level time", new Callable<String>() {
            public String a() throws Exception {
                return String.format("%d game time, %d day time", ato.this.h, ato.this.i);
            }
        });
        \u2603.a("Level dimension", new Callable<String>() {
            public String a() throws Exception {
                return String.valueOf(ato.this.m);
            }
        });
        \u2603.a("Level storage version", new Callable<String>() {
            public String a() throws Exception {
                String s = "Unknown?";
                try {
                    switch (ato.this.o) {
                        case 19133: {
                            s = "Anvil";
                            break;
                        }
                        case 19132: {
                            s = "McRegion";
                            break;
                        }
                    }
                }
                catch (Throwable t) {}
                return String.format("0x%05X - %s", ato.this.o, s);
            }
        });
        \u2603.a("Level weather", new Callable<String>() {
            public String a() throws Exception {
                return String.format("Rain time: %d (now: %b), thunder time: %d (now: %b)", ato.this.r, ato.this.q, ato.this.t, ato.this.s);
            }
        });
        \u2603.a("Level game mode", new Callable<String>() {
            public String a() throws Exception {
                return String.format("Game mode: %s (ID %d). Hardcore: %b. Cheats: %b", ato.this.u.b(), ato.this.u.a(), ato.this.w, ato.this.x);
            }
        });
    }
    
    static {
        a = oj.c;
    }
}
