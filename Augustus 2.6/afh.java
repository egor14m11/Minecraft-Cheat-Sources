import java.util.Iterator;
import java.util.Random;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class afh
{
    private static final jy a;
    public static final co<jy, afh> c;
    public static final ct<alz> d;
    private yz b;
    public static final b e;
    public static final b f;
    public static final b g;
    public static final b h;
    public static final b i;
    public static final b j;
    public static final b k;
    public static final b l;
    public static final b m;
    public static final b n;
    public static final b o;
    public static final b p;
    public static final b q;
    protected boolean r;
    protected int s;
    protected boolean t;
    protected int u;
    protected boolean v;
    protected float w;
    protected float x;
    protected boolean y;
    protected boolean z;
    protected boolean A;
    protected double B;
    protected double C;
    protected double D;
    protected double E;
    protected double F;
    protected double G;
    public b H;
    public float I;
    protected final arm J;
    protected final arn K;
    public float L;
    protected final ama M;
    private alz N;
    private String O;
    
    public static int a(final afh \u2603) {
        return afh.c.b(\u2603);
    }
    
    public static int f(final alz \u2603) {
        final afh c = \u2603.c();
        return a(c) + (c.c(\u2603) << 12);
    }
    
    public static afh c(final int \u2603) {
        return afh.c.a(\u2603);
    }
    
    public static alz d(final int \u2603) {
        final int \u26032 = \u2603 & 0xFFF;
        final int \u26033 = \u2603 >> 12 & 0xF;
        return c(\u26032).a(\u26033);
    }
    
    public static afh a(final zw \u2603) {
        if (\u2603 instanceof yo) {
            return ((yo)\u2603).d();
        }
        return null;
    }
    
    public static afh b(final String \u2603) {
        final jy jy = new jy(\u2603);
        if (afh.c.d(jy)) {
            return afh.c.a(jy);
        }
        try {
            return afh.c.a(Integer.parseInt(\u2603));
        }
        catch (NumberFormatException ex) {
            return null;
        }
    }
    
    public boolean o() {
        return this.r;
    }
    
    public int p() {
        return this.s;
    }
    
    public boolean q() {
        return this.t;
    }
    
    public int r() {
        return this.u;
    }
    
    public boolean s() {
        return this.v;
    }
    
    public arm t() {
        return this.J;
    }
    
    public arn g(final alz \u2603) {
        return this.K;
    }
    
    public alz a(final int \u2603) {
        return this.Q();
    }
    
    public int c(final alz \u2603) {
        if (\u2603 == null || \u2603.a().isEmpty()) {
            return 0;
        }
        throw new IllegalArgumentException("Don't know how to convert " + \u2603 + " back into data...");
    }
    
    public alz a(final alz \u2603, final adq \u2603, final cj \u2603) {
        return \u2603;
    }
    
    public afh(final arm \u2603, final arn \u2603) {
        this.y = true;
        this.H = afh.e;
        this.I = 1.0f;
        this.L = 0.6f;
        this.J = \u2603;
        this.K = \u2603;
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
        this.r = this.c();
        this.s = (this.c() ? 255 : 0);
        this.t = !\u2603.b();
        this.M = this.e();
        this.j(this.M.b());
    }
    
    protected afh(final arm \u2603) {
        this(\u2603, \u2603.r());
    }
    
    protected afh a(final b \u2603) {
        this.H = \u2603;
        return this;
    }
    
    protected afh e(final int \u2603) {
        this.s = \u2603;
        return this;
    }
    
    protected afh a(final float \u2603) {
        this.u = (int)(15.0f * \u2603);
        return this;
    }
    
    protected afh b(final float \u2603) {
        this.x = \u2603 * 3.0f;
        return this;
    }
    
    public boolean u() {
        return this.J.c() && this.d();
    }
    
    public boolean v() {
        return this.J.k() && this.d() && !this.i();
    }
    
    public boolean w() {
        return this.J.c() && this.d();
    }
    
    public boolean d() {
        return true;
    }
    
    public boolean b(final adq \u2603, final cj \u2603) {
        return !this.J.c();
    }
    
    public int b() {
        return 3;
    }
    
    public boolean a(final adm \u2603, final cj \u2603) {
        return false;
    }
    
    protected afh c(final float \u2603) {
        this.w = \u2603;
        if (this.x < \u2603 * 5.0f) {
            this.x = \u2603 * 5.0f;
        }
        return this;
    }
    
    protected afh x() {
        this.c(-1.0f);
        return this;
    }
    
    public float g(final adm \u2603, final cj \u2603) {
        return this.w;
    }
    
    protected afh a(final boolean \u2603) {
        this.z = \u2603;
        return this;
    }
    
    public boolean y() {
        return this.z;
    }
    
    public boolean z() {
        return this.A;
    }
    
    protected final void a(final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603) {
        this.B = \u2603;
        this.C = \u2603;
        this.D = \u2603;
        this.E = \u2603;
        this.F = \u2603;
        this.G = \u2603;
    }
    
    public int c(final adq \u2603, cj \u2603) {
        afh afh = \u2603.p(\u2603).c();
        final int b = \u2603.b(\u2603, afh.r());
        if (b == 0 && afh instanceof ahh) {
            \u2603 = \u2603.b();
            afh = \u2603.p(\u2603).c();
            return \u2603.b(\u2603, afh.r());
        }
        return b;
    }
    
    public boolean a(final adq \u2603, final cj \u2603, final cq \u2603) {
        return (\u2603 == cq.a && this.C > 0.0) || (\u2603 == cq.b && this.F < 1.0) || (\u2603 == cq.c && this.D > 0.0) || (\u2603 == cq.d && this.G < 1.0) || (\u2603 == cq.e && this.B > 0.0) || (\u2603 == cq.f && this.E < 1.0) || !\u2603.p(\u2603).c().c();
    }
    
    public boolean b(final adq \u2603, final cj \u2603, final cq \u2603) {
        return \u2603.p(\u2603).c().t().a();
    }
    
    public aug b(final adm \u2603, final cj \u2603) {
        return new aug(\u2603.n() + this.B, \u2603.o() + this.C, \u2603.p() + this.D, \u2603.n() + this.E, \u2603.o() + this.F, \u2603.p() + this.G);
    }
    
    public void a(final adm \u2603, final cj \u2603, final alz \u2603, final aug \u2603, final List<aug> \u2603, final pk \u2603) {
        final aug a = this.a(\u2603, \u2603, \u2603);
        if (a != null && \u2603.b(a)) {
            \u2603.add(a);
        }
    }
    
    public aug a(final adm \u2603, final cj \u2603, final alz \u2603) {
        return new aug(\u2603.n() + this.B, \u2603.o() + this.C, \u2603.p() + this.D, \u2603.n() + this.E, \u2603.o() + this.F, \u2603.p() + this.G);
    }
    
    public boolean c() {
        return true;
    }
    
    public boolean a(final alz \u2603, final boolean \u2603) {
        return this.A();
    }
    
    public boolean A() {
        return true;
    }
    
    public void a(final adm \u2603, final cj \u2603, final alz \u2603, final Random \u2603) {
        this.b(\u2603, \u2603, \u2603, \u2603);
    }
    
    public void b(final adm \u2603, final cj \u2603, final alz \u2603, final Random \u2603) {
    }
    
    public void c(final adm \u2603, final cj \u2603, final alz \u2603, final Random \u2603) {
    }
    
    public void d(final adm \u2603, final cj \u2603, final alz \u2603) {
    }
    
    public void a(final adm \u2603, final cj \u2603, final alz \u2603, final afh \u2603) {
    }
    
    public int a(final adm \u2603) {
        return 10;
    }
    
    public void c(final adm \u2603, final cj \u2603, final alz \u2603) {
    }
    
    public void b(final adm \u2603, final cj \u2603, final alz \u2603) {
    }
    
    public int a(final Random \u2603) {
        return 1;
    }
    
    public zw a(final alz \u2603, final Random \u2603, final int \u2603) {
        return zw.a(this);
    }
    
    public float a(final wn \u2603, final adm \u2603, final cj \u2603) {
        final float g = this.g(\u2603, \u2603);
        if (g < 0.0f) {
            return 0.0f;
        }
        if (!\u2603.b(this)) {
            return \u2603.a(this) / g / 100.0f;
        }
        return \u2603.a(this) / g / 30.0f;
    }
    
    public final void b(final adm \u2603, final cj \u2603, final alz \u2603, final int \u2603) {
        this.a(\u2603, \u2603, \u2603, 1.0f, \u2603);
    }
    
    public void a(final adm \u2603, final cj \u2603, final alz \u2603, final float \u2603, final int \u2603) {
        if (\u2603.D) {
            return;
        }
        for (int a = this.a(\u2603, \u2603.s), i = 0; i < a; ++i) {
            if (\u2603.s.nextFloat() <= \u2603) {
                final zw a2 = this.a(\u2603, \u2603.s, \u2603);
                if (a2 != null) {
                    a(\u2603, \u2603, new zx(a2, 1, this.a(\u2603)));
                }
            }
        }
    }
    
    public static void a(final adm \u2603, final cj \u2603, final zx \u2603) {
        if (\u2603.D || !\u2603.Q().b("doTileDrops")) {
            return;
        }
        final float n = 0.5f;
        final double n2 = \u2603.s.nextFloat() * n + (1.0f - n) * 0.5;
        final double n3 = \u2603.s.nextFloat() * n + (1.0f - n) * 0.5;
        final double n4 = \u2603.s.nextFloat() * n + (1.0f - n) * 0.5;
        final uz \u26032 = new uz(\u2603, \u2603.n() + n2, \u2603.o() + n3, \u2603.p() + n4, \u2603);
        \u26032.p();
        \u2603.d(\u26032);
    }
    
    protected void b(final adm \u2603, final cj \u2603, int \u2603) {
        if (!\u2603.D) {
            while (\u2603 > 0) {
                final int a = pp.a(\u2603);
                \u2603 -= a;
                \u2603.d(new pp(\u2603, \u2603.n() + 0.5, \u2603.o() + 0.5, \u2603.p() + 0.5, a));
            }
        }
    }
    
    public int a(final alz \u2603) {
        return 0;
    }
    
    public float a(final pk \u2603) {
        return this.x / 5.0f;
    }
    
    public auh a(final adm \u2603, final cj \u2603, aui \u2603, aui \u2603) {
        this.a((adq)\u2603, \u2603);
        \u2603 = \u2603.b(-\u2603.n(), -\u2603.o(), -\u2603.p());
        \u2603 = \u2603.b(-\u2603.n(), -\u2603.o(), -\u2603.p());
        aui a = \u2603.a(\u2603, this.B);
        aui a2 = \u2603.a(\u2603, this.E);
        aui b = \u2603.b(\u2603, this.C);
        aui b2 = \u2603.b(\u2603, this.F);
        aui c = \u2603.c(\u2603, this.D);
        aui c2 = \u2603.c(\u2603, this.G);
        if (!this.a(a)) {
            a = null;
        }
        if (!this.a(a2)) {
            a2 = null;
        }
        if (!this.b(b)) {
            b = null;
        }
        if (!this.b(b2)) {
            b2 = null;
        }
        if (!this.c(c)) {
            c = null;
        }
        if (!this.c(c2)) {
            c2 = null;
        }
        aui aui = null;
        if (a != null && (aui == null || \u2603.g(a) < \u2603.g(aui))) {
            aui = a;
        }
        if (a2 != null && (aui == null || \u2603.g(a2) < \u2603.g(aui))) {
            aui = a2;
        }
        if (b != null && (aui == null || \u2603.g(b) < \u2603.g(aui))) {
            aui = b;
        }
        if (b2 != null && (aui == null || \u2603.g(b2) < \u2603.g(aui))) {
            aui = b2;
        }
        if (c != null && (aui == null || \u2603.g(c) < \u2603.g(aui))) {
            aui = c;
        }
        if (c2 != null && (aui == null || \u2603.g(c2) < \u2603.g(aui))) {
            aui = c2;
        }
        if (aui == null) {
            return null;
        }
        cq \u26032 = null;
        if (aui == a) {
            \u26032 = cq.e;
        }
        if (aui == a2) {
            \u26032 = cq.f;
        }
        if (aui == b) {
            \u26032 = cq.a;
        }
        if (aui == b2) {
            \u26032 = cq.b;
        }
        if (aui == c) {
            \u26032 = cq.c;
        }
        if (aui == c2) {
            \u26032 = cq.d;
        }
        return new auh(aui.b(\u2603.n(), \u2603.o(), \u2603.p()), \u26032, \u2603);
    }
    
    private boolean a(final aui \u2603) {
        return \u2603 != null && \u2603.b >= this.C && \u2603.b <= this.F && \u2603.c >= this.D && \u2603.c <= this.G;
    }
    
    private boolean b(final aui \u2603) {
        return \u2603 != null && \u2603.a >= this.B && \u2603.a <= this.E && \u2603.c >= this.D && \u2603.c <= this.G;
    }
    
    private boolean c(final aui \u2603) {
        return \u2603 != null && \u2603.a >= this.B && \u2603.a <= this.E && \u2603.b >= this.C && \u2603.b <= this.F;
    }
    
    public void a(final adm \u2603, final cj \u2603, final adi \u2603) {
    }
    
    public adf m() {
        return adf.a;
    }
    
    public boolean a(final adm \u2603, final cj \u2603, final cq \u2603, final zx \u2603) {
        return this.b(\u2603, \u2603, \u2603);
    }
    
    public boolean b(final adm \u2603, final cj \u2603, final cq \u2603) {
        return this.d(\u2603, \u2603);
    }
    
    public boolean d(final adm \u2603, final cj \u2603) {
        return \u2603.p(\u2603).c().J.j();
    }
    
    public boolean a(final adm \u2603, final cj \u2603, final alz \u2603, final wn \u2603, final cq \u2603, final float \u2603, final float \u2603, final float \u2603) {
        return false;
    }
    
    public void a(final adm \u2603, final cj \u2603, final pk \u2603) {
    }
    
    public alz a(final adm \u2603, final cj \u2603, final cq \u2603, final float \u2603, final float \u2603, final float \u2603, final int \u2603, final pr \u2603) {
        return this.a(\u2603);
    }
    
    public void a(final adm \u2603, final cj \u2603, final wn \u2603) {
    }
    
    public aui a(final adm \u2603, final cj \u2603, final pk \u2603, final aui \u2603) {
        return \u2603;
    }
    
    public void a(final adq \u2603, final cj \u2603) {
    }
    
    public final double B() {
        return this.B;
    }
    
    public final double C() {
        return this.E;
    }
    
    public final double D() {
        return this.C;
    }
    
    public final double E() {
        return this.F;
    }
    
    public final double F() {
        return this.D;
    }
    
    public final double G() {
        return this.G;
    }
    
    public int H() {
        return 16777215;
    }
    
    public int h(final alz \u2603) {
        return 16777215;
    }
    
    public int a(final adq \u2603, final cj \u2603, final int \u2603) {
        return 16777215;
    }
    
    public final int d(final adq \u2603, final cj \u2603) {
        return this.a(\u2603, \u2603, 0);
    }
    
    public int a(final adq \u2603, final cj \u2603, final alz \u2603, final cq \u2603) {
        return 0;
    }
    
    public boolean i() {
        return false;
    }
    
    public void a(final adm \u2603, final cj \u2603, final alz \u2603, final pk \u2603) {
    }
    
    public int b(final adq \u2603, final cj \u2603, final alz \u2603, final cq \u2603) {
        return 0;
    }
    
    public void j() {
    }
    
    public void a(final adm \u2603, final wn \u2603, final cj \u2603, final alz \u2603, final akw \u2603) {
        \u2603.b(na.ab[a(this)]);
        \u2603.a(0.025f);
        if (this.I() && ack.e(\u2603)) {
            final zx i = this.i(\u2603);
            if (i != null) {
                a(\u2603, \u2603, i);
            }
        }
        else {
            final int f = ack.f(\u2603);
            this.b(\u2603, \u2603, \u2603, f);
        }
    }
    
    protected boolean I() {
        return this.d() && !this.A;
    }
    
    protected zx i(final alz \u2603) {
        int c = 0;
        final zw a = zw.a(this);
        if (a != null && a.k()) {
            c = this.c(\u2603);
        }
        return new zx(a, 1, c);
    }
    
    public int a(final int \u2603, final Random \u2603) {
        return this.a(\u2603);
    }
    
    public void a(final adm \u2603, final cj \u2603, final alz \u2603, final pr \u2603, final zx \u2603) {
    }
    
    public boolean g() {
        return !this.J.a() && !this.J.d();
    }
    
    public afh c(final String \u2603) {
        this.O = \u2603;
        return this;
    }
    
    public String f() {
        return di.a(this.a() + ".name");
    }
    
    public String a() {
        return "tile." + this.O;
    }
    
    public boolean a(final adm \u2603, final cj \u2603, final alz \u2603, final int \u2603, final int \u2603) {
        return false;
    }
    
    public boolean J() {
        return this.y;
    }
    
    protected afh K() {
        this.y = false;
        return this;
    }
    
    public int k() {
        return this.J.m();
    }
    
    public float h() {
        return this.u() ? 0.2f : 1.0f;
    }
    
    public void a(final adm \u2603, final cj \u2603, final pk \u2603, final float \u2603) {
        \u2603.e(\u2603, 1.0f);
    }
    
    public void a(final adm \u2603, final pk \u2603) {
        \u2603.w = 0.0;
    }
    
    public zw c(final adm \u2603, final cj \u2603) {
        return zw.a(this);
    }
    
    public int j(final adm \u2603, final cj \u2603) {
        return this.a(\u2603.p(\u2603));
    }
    
    public void a(final zw \u2603, final yz \u2603, final List<zx> \u2603) {
        \u2603.add(new zx(\u2603, 1, 0));
    }
    
    public yz L() {
        return this.b;
    }
    
    public afh a(final yz \u2603) {
        this.b = \u2603;
        return this;
    }
    
    public void a(final adm \u2603, final cj \u2603, final alz \u2603, final wn \u2603) {
    }
    
    public void k(final adm \u2603, final cj \u2603) {
    }
    
    public boolean M() {
        return false;
    }
    
    public boolean N() {
        return true;
    }
    
    public boolean a(final adi \u2603) {
        return true;
    }
    
    public boolean b(final afh \u2603) {
        return this == \u2603;
    }
    
    public static boolean a(final afh \u2603, final afh \u2603) {
        return \u2603 != null && \u2603 != null && (\u2603 == \u2603 || \u2603.b(\u2603));
    }
    
    public boolean O() {
        return false;
    }
    
    public int l(final adm \u2603, final cj \u2603) {
        return 0;
    }
    
    public alz b(final alz \u2603) {
        return \u2603;
    }
    
    protected ama e() {
        return new ama(this, new amo[0]);
    }
    
    public ama P() {
        return this.M;
    }
    
    protected final void j(final alz \u2603) {
        this.N = \u2603;
    }
    
    public final alz Q() {
        return this.N;
    }
    
    public a R() {
        return afh.a.a;
    }
    
    @Override
    public String toString() {
        return "Block{" + afh.c.c(this) + "}";
    }
    
    public static void S() {
        a(0, afh.a, new aey().c("air"));
        a(1, "stone", new ajy().c(1.5f).b(10.0f).a(afh.i).c("stone"));
        a(2, "grass", new ahe().c(0.6f).a(afh.h).c("grass"));
        a(3, "dirt", new agf().c(0.5f).a(afh.g).c("dirt"));
        final afh a = new afh(arm.e).c(2.0f).b(10.0f).a(afh.i).c("stonebrick").a(yz.b);
        a(4, "cobblestone", a);
        final afh c = new aio().c(2.0f).b(5.0f).a(afh.f).c("wood");
        a(5, "planks", c);
        a(6, "sapling", new ajj().c(0.0f).a(afh.h).c("sapling"));
        a(7, "bedrock", new afh(arm.e).x().b(6000000.0f).a(afh.i).c("bedrock").K().a(yz.b));
        a(8, "flowing_water", new agl(arm.h).c(100.0f).e(3).c("water").K());
        a(9, "water", new ajw(arm.h).c(100.0f).e(3).c("water").K());
        a(10, "flowing_lava", new agl(arm.i).c(100.0f).a(1.0f).c("lava").K());
        a(11, "lava", new ajw(arm.i).c(100.0f).a(1.0f).c("lava").K());
        a(12, "sand", new ajh().c(0.5f).a(afh.m).c("sand"));
        a(13, "gravel", new ahf().c(0.6f).a(afh.g).c("gravel"));
        a(14, "gold_ore", new aim().c(3.0f).b(5.0f).a(afh.i).c("oreGold"));
        a(15, "iron_ore", new aim().c(3.0f).b(5.0f).a(afh.i).c("oreIron"));
        a(16, "coal_ore", new aim().c(3.0f).b(5.0f).a(afh.i).c("oreCoal"));
        a(17, "log", new ail().c("log"));
        a(18, "leaves", new aik().c("leaves"));
        a(19, "sponge", new ajr().c(0.6f).a(afh.h).c("sponge"));
        a(20, "glass", new ahc(arm.s, false).c(0.3f).a(afh.k).c("glass"));
        a(21, "lapis_ore", new aim().c(3.0f).b(5.0f).a(afh.i).c("oreLapis"));
        a(22, "lapis_block", new afh(arm.f, arn.H).c(3.0f).b(5.0f).a(afh.i).c("blockLapis").a(yz.b));
        a(23, "dispenser", new agg().c(3.5f).a(afh.i).c("dispenser"));
        final afh c2 = new aji().a(afh.i).c(0.8f).c("sandStone");
        a(24, "sandstone", c2);
        a(25, "noteblock", new aii().c(0.8f).c("musicBlock"));
        a(26, "bed", new afg().a(afh.f).c(0.2f).c("bed").K());
        a(27, "golden_rail", new ais().c(0.7f).a(afh.j).c("goldenRail"));
        a(28, "detector_rail", new agc().c(0.7f).a(afh.j).c("detectorRail"));
        a(29, "sticky_piston", new als(true).c("pistonStickyBase"));
        a(30, "web", new ako().e(1).c(4.0f).c("web"));
        a(31, "tallgrass", new akc().c(0.0f).a(afh.h).c("tallgrass"));
        a(32, "deadbush", new agb().c(0.0f).a(afh.h).c("deadbush"));
        a(33, "piston", new als(false).c("pistonBase"));
        a(34, "piston_head", new alt().c("pistonBase"));
        a(35, "wool", new afv(arm.n).c(0.8f).a(afh.l).c("cloth"));
        a(36, "piston_extension", new alv());
        a(37, "yellow_flower", new akt().c(0.0f).a(afh.h).c("flower1"));
        a(38, "red_flower", new aiy().c(0.0f).a(afh.h).c("flower2"));
        final afh c3 = new aia().c(0.0f).a(afh.h).a(0.125f).c("mushroom");
        a(39, "brown_mushroom", c3);
        final afh c4 = new aia().c(0.0f).a(afh.h).c("mushroom");
        a(40, "red_mushroom", c4);
        a(41, "gold_block", new afh(arm.f, arn.F).c(3.0f).b(10.0f).a(afh.j).c("blockGold").a(yz.b));
        a(42, "iron_block", new afh(arm.f, arn.h).c(5.0f).b(10.0f).a(afh.j).c("blockIron").a(yz.b));
        a(43, "double_stone_slab", new agz().c(2.0f).b(10.0f).a(afh.i).c("stoneSlab"));
        a(44, "stone_slab", new ahi().c(2.0f).b(10.0f).a(afh.i).c("stoneSlab"));
        final afh a2 = new afh(arm.e, arn.D).c(2.0f).b(10.0f).a(afh.i).c("brick").a(yz.b);
        a(45, "brick_block", a2);
        a(46, "tnt", new ake().c(0.0f).a(afh.h).c("tnt"));
        a(47, "bookshelf", new afk().c(1.5f).a(afh.f).c("bookshelf"));
        a(48, "mossy_cobblestone", new afh(arm.e).c(2.0f).b(10.0f).a(afh.i).c("stoneMoss").a(yz.b));
        a(49, "obsidian", new aij().c(50.0f).b(2000.0f).a(afh.i).c("obsidian"));
        a(50, "torch", new akf().c(0.0f).a(0.9375f).a(afh.f).c("torch"));
        a(51, "fire", new agv().c(0.0f).a(1.0f).a(afh.l).c("fire").K());
        a(52, "mob_spawner", new ahy().c(5.0f).a(afh.j).c("mobSpawner").K());
        a(53, "oak_stairs", new aju(c.Q().a(aio.a, aio.a.a)).c("stairsWood"));
        a(54, "chest", new afs(0).c(2.5f).a(afh.f).c("chest"));
        a(55, "redstone_wire", new ajb().c(0.0f).a(afh.e).c("redstoneDust").K());
        a(56, "diamond_ore", new aim().c(3.0f).b(5.0f).a(afh.i).c("oreDiamond"));
        a(57, "diamond_block", new afh(arm.f, arn.G).c(5.0f).b(10.0f).a(afh.j).c("blockDiamond").a(yz.b));
        a(58, "crafting_table", new afy().c(2.5f).a(afh.f).c("workbench"));
        a(59, "wheat", new afz().c("crops"));
        final afh c5 = new ags().c(0.6f).a(afh.g).c("farmland");
        a(60, "farmland", c5);
        a(61, "furnace", new ahb(false).c(3.5f).a(afh.i).c("furnace").a(yz.c));
        a(62, "lit_furnace", new ahb(true).c(3.5f).a(afh.i).a(0.875f).c("furnace"));
        a(63, "standing_sign", new ajv().c(1.0f).a(afh.f).c("sign").K());
        a(64, "wooden_door", new agh(arm.d).c(3.0f).a(afh.f).c("doorOak").K());
        a(65, "ladder", new ahr().c(0.4f).a(afh.o).c("ladder"));
        a(66, "rail", new aix().c(0.7f).a(afh.j).c("rail"));
        a(67, "stone_stairs", new aju(a.Q()).c("stairsStone"));
        a(68, "wall_sign", new akm().c(1.0f).a(afh.f).c("sign").K());
        a(69, "lever", new ahu().c(0.5f).a(afh.f).c("lever"));
        a(70, "stone_pressure_plate", new ait(arm.e, ait.a.b).c(0.5f).a(afh.i).c("pressurePlateStone"));
        a(71, "iron_door", new agh(arm.f).c(5.0f).a(afh.j).c("doorIron").K());
        a(72, "wooden_pressure_plate", new ait(arm.d, ait.a.a).c(0.5f).a(afh.f).c("pressurePlateWood"));
        a(73, "redstone_ore", new aja(false).c(3.0f).b(5.0f).a(afh.i).c("oreRedstone").a(yz.b));
        a(74, "lit_redstone_ore", new aja(true).a(0.625f).c(3.0f).b(5.0f).a(afh.i).c("oreRedstone"));
        a(75, "unlit_redstone_torch", new ajd(false).c(0.0f).a(afh.f).c("notGate"));
        a(76, "redstone_torch", new ajd(true).c(0.0f).a(0.5f).a(afh.f).c("notGate").a(yz.d));
        a(77, "stone_button", new aka().c(0.5f).a(afh.i).c("button"));
        a(78, "snow_layer", new ajp().c(0.1f).a(afh.n).c("snow").e(0));
        a(79, "ice", new ahp().c(0.5f).e(3).a(afh.k).c("ice"));
        a(80, "snow", new ajo().c(0.2f).a(afh.n).c("snow"));
        a(81, "cactus", new afo().c(0.4f).a(afh.l).c("cactus"));
        a(82, "clay", new aft().c(0.6f).a(afh.g).c("clay"));
        a(83, "reeds", new aje().c(0.0f).a(afh.h).c("reeds").K());
        a(84, "jukebox", new ahq().c(2.0f).b(10.0f).a(afh.i).c("jukebox"));
        a(85, "fence", new agt(arm.d, aio.a.a.c()).c(2.0f).b(5.0f).a(afh.f).c("fence"));
        final afh c6 = new aiv().c(1.0f).a(afh.f).c("pumpkin");
        a(86, "pumpkin", c6);
        a(87, "netherrack", new aie().c(0.4f).a(afh.i).c("hellrock"));
        a(88, "soul_sand", new ajq().c(0.5f).a(afh.m).c("hellsand"));
        a(89, "glowstone", new ahd(arm.s).c(0.3f).a(afh.k).a(1.0f).c("lightgem"));
        a(90, "portal", new aip().c(-1.0f).a(afh.k).a(0.75f).c("portal"));
        a(91, "lit_pumpkin", new aiv().c(1.0f).a(afh.f).a(1.0f).c("litpumpkin"));
        a(92, "cake", new afp().c(0.5f).a(afh.l).c("cake").K());
        a(93, "unpowered_repeater", new ajf(false).c(0.0f).a(afh.f).c("diode").K());
        a(94, "powered_repeater", new ajf(true).c(0.0f).a(afh.f).c("diode").K());
        a(95, "stained_glass", new ajs(arm.s).c(0.3f).a(afh.k).c("stainedGlass"));
        a(96, "trapdoor", new akh(arm.d).c(3.0f).a(afh.f).c("trapdoor").K());
        a(97, "monster_egg", new ahz().c(0.75f).c("monsterStoneEgg"));
        final afh c7 = new ajz().c(1.5f).b(10.0f).a(afh.i).c("stonebricksmooth");
        a(98, "stonebrick", c7);
        a(99, "brown_mushroom_block", new aho(arm.d, arn.l, c3).c(0.2f).a(afh.f).c("mushroom"));
        a(100, "red_mushroom_block", new aho(arm.d, arn.D, c4).c(0.2f).a(afh.f).c("mushroom"));
        a(101, "iron_bars", new akd(arm.f, true).c(5.0f).b(10.0f).a(afh.j).c("fenceIron"));
        a(102, "glass_pane", new akd(arm.s, false).c(0.3f).a(afh.k).c("thinGlass"));
        final afh c8 = new ahx().c(1.0f).a(afh.f).c("melon");
        a(103, "melon_block", c8);
        a(104, "pumpkin_stem", new ajx(c6).c(0.0f).a(afh.f).c("pumpkinStem"));
        a(105, "melon_stem", new ajx(c8).c(0.0f).a(afh.f).c("pumpkinStem"));
        a(106, "vine", new akk().c(0.2f).a(afh.h).c("vine"));
        a(107, "fence_gate", new agu(aio.a.a).c(2.0f).b(5.0f).a(afh.f).c("fenceGate"));
        a(108, "brick_stairs", new aju(a2.Q()).c("stairsBrick"));
        a(109, "stone_brick_stairs", new aju(c7.Q().a(ajz.a, ajz.a.a)).c("stairsStoneBrickSmooth"));
        a(110, "mycelium", new aib().c(0.6f).a(afh.h).c("mycel"));
        a(111, "waterlily", new akn().c(0.0f).a(afh.h).c("waterlily"));
        final afh a3 = new aic().c(2.0f).b(10.0f).a(afh.i).c("netherBrick").a(yz.b);
        a(112, "nether_brick", a3);
        a(113, "nether_brick_fence", new agt(arm.e, arn.K).c(2.0f).b(10.0f).a(afh.i).c("netherFence"));
        a(114, "nether_brick_stairs", new aju(a3.Q()).c("stairsNetherBrick"));
        a(115, "nether_wart", new aid().c("netherStalk"));
        a(116, "enchanting_table", new agm().c(5.0f).b(2000.0f).c("enchantmentTable"));
        a(117, "brewing_stand", new afl().c(0.5f).a(0.125f).c("brewingStand"));
        a(118, "cauldron", new afr().c(2.0f).c("cauldron"));
        a(119, "end_portal", new agn(arm.E).c(-1.0f).b(6000000.0f));
        a(120, "end_portal_frame", new ago().a(afh.k).a(0.125f).c(-1.0f).c("endPortalFrame").b(6000000.0f).a(yz.c));
        a(121, "end_stone", new afh(arm.e, arn.d).c(3.0f).b(15.0f).a(afh.i).c("whiteStone").a(yz.b));
        a(122, "dragon_egg", new agj().c(3.0f).b(15.0f).a(afh.i).a(0.125f).c("dragonEgg"));
        a(123, "redstone_lamp", new ajc(false).c(0.3f).a(afh.k).c("redstoneLight").a(yz.d));
        a(124, "lit_redstone_lamp", new ajc(true).c(0.3f).a(afh.k).c("redstoneLight"));
        a(125, "double_wooden_slab", new aha().c(2.0f).b(5.0f).a(afh.f).c("woodSlab"));
        a(126, "wooden_slab", new ahk().c(2.0f).b(5.0f).a(afh.f).c("woodSlab"));
        a(127, "cocoa", new afu().c(0.2f).b(5.0f).a(afh.f).c("cocoa"));
        a(128, "sandstone_stairs", new aju(c2.Q().a(aji.a, aji.a.c)).c("stairsSandStone"));
        a(129, "emerald_ore", new aim().c(3.0f).b(5.0f).a(afh.i).c("oreEmerald"));
        a(130, "ender_chest", new agp().c(22.5f).b(1000.0f).a(afh.i).c("enderChest").a(0.5f));
        a(131, "tripwire_hook", new akj().c("tripWireSource"));
        a(132, "tripwire", new aki().c("tripWire"));
        a(133, "emerald_block", new afh(arm.f, arn.I).c(5.0f).b(10.0f).a(afh.j).c("blockEmerald").a(yz.b));
        a(134, "spruce_stairs", new aju(c.Q().a(aio.a, aio.a.b)).c("stairsWoodSpruce"));
        a(135, "birch_stairs", new aju(c.Q().a(aio.a, aio.a.c)).c("stairsWoodBirch"));
        a(136, "jungle_stairs", new aju(c.Q().a(aio.a, aio.a.d)).c("stairsWoodJungle"));
        a(137, "command_block", new afw().x().b(6000000.0f).c("commandBlock"));
        a(138, "beacon", new aff().c("beacon").a(1.0f));
        a(139, "cobblestone_wall", new akl(a).c("cobbleWall"));
        a(140, "flower_pot", new agx().c(0.0f).a(afh.e).c("flowerPot"));
        a(141, "carrots", new afq().c("carrots"));
        a(142, "potatoes", new aiq().c("potatoes"));
        a(143, "wooden_button", new akq().c(0.5f).a(afh.f).c("button"));
        a(144, "skull", new ajm().c(1.0f).a(afh.i).c("skull"));
        a(145, "anvil", new aez().c(5.0f).a(afh.p).b(2000.0f).c("anvil"));
        a(146, "trapped_chest", new afs(1).c(2.5f).a(afh.f).c("chestTrap"));
        a(147, "light_weighted_pressure_plate", new akp(arm.f, 15, arn.F).c(0.5f).a(afh.f).c("weightedPlate_light"));
        a(148, "heavy_weighted_pressure_plate", new akp(arm.f, 150).c(0.5f).a(afh.f).c("weightedPlate_heavy"));
        a(149, "unpowered_comparator", new afx(false).c(0.0f).a(afh.f).c("comparator").K());
        a(150, "powered_comparator", new afx(true).c(0.0f).a(0.625f).a(afh.f).c("comparator").K());
        a(151, "daylight_detector", new aga(false));
        a(152, "redstone_block", new air(arm.f, arn.f).c(5.0f).b(10.0f).a(afh.j).c("blockRedstone").a(yz.d));
        a(153, "quartz_ore", new aim(arn.K).c(3.0f).b(5.0f).a(afh.i).c("netherquartz"));
        a(154, "hopper", new ahn().c(3.0f).b(8.0f).a(afh.j).c("hopper"));
        final afh c9 = new aiw().a(afh.i).c(0.8f).c("quartzBlock");
        a(155, "quartz_block", c9);
        a(156, "quartz_stairs", new aju(c9.Q().a(aiw.a, aiw.a.a)).c("stairsQuartz"));
        a(157, "activator_rail", new ais().c(0.7f).a(afh.j).c("activatorRail"));
        a(158, "dropper", new agk().c(3.5f).a(afh.i).c("dropper"));
        a(159, "stained_hardened_clay", new afv(arm.e).c(1.25f).b(7.0f).a(afh.i).c("clayHardenedStained"));
        a(160, "stained_glass_pane", new ajt().c(0.3f).a(afh.k).c("thinStainedGlass"));
        a(161, "leaves2", new aif().c("leaves"));
        a(162, "log2", new aig().c("log"));
        a(163, "acacia_stairs", new aju(c.Q().a(aio.a, aio.a.e)).c("stairsWoodAcacia"));
        a(164, "dark_oak_stairs", new aju(c.Q().a(aio.a, aio.a.f)).c("stairsWoodDarkOak"));
        a(165, "slime", new ajn().c("slime").a(afh.q));
        a(166, "barrier", new afb().c("barrier"));
        a(167, "iron_trapdoor", new akh(arm.f).c(5.0f).a(afh.j).c("ironTrapdoor").K());
        a(168, "prismarine", new aiu().c(1.5f).b(10.0f).a(afh.i).c("prismarine"));
        a(169, "sea_lantern", new ajk(arm.s).c(0.3f).a(afh.k).a(1.0f).c("seaLantern"));
        a(170, "hay_block", new ahm().c(0.5f).a(afh.h).c("hayBlock").a(yz.b));
        a(171, "carpet", new aks().c(0.1f).a(afh.l).c("woolCarpet").e(0));
        a(172, "hardened_clay", new ahl().c(1.25f).b(7.0f).a(afh.i).c("clayHardened"));
        a(173, "coal_block", new afh(arm.e, arn.E).c(5.0f).b(10.0f).a(afh.i).c("blockCoal").a(yz.b));
        a(174, "packed_ice", new ain().c(0.5f).a(afh.k).c("icePacked"));
        a(175, "double_plant", new agi());
        a(176, "standing_banner", new afa.a().c(1.0f).a(afh.f).c("banner").K());
        a(177, "wall_banner", new afa.b().c(1.0f).a(afh.f).c("banner").K());
        a(178, "daylight_detector_inverted", new aga(true));
        final afh c10 = new aiz().a(afh.i).c(0.8f).c("redSandStone");
        a(179, "red_sandstone", c10);
        a(180, "red_sandstone_stairs", new aju(c10.Q().a(aiz.a, aiz.a.c)).c("stairsRedSandStone"));
        a(181, "double_stone_slab2", new agy().c(2.0f).b(10.0f).a(afh.i).c("stoneSlab2"));
        a(182, "stone_slab2", new ahg().c(2.0f).b(10.0f).a(afh.i).c("stoneSlab2"));
        a(183, "spruce_fence_gate", new agu(aio.a.b).c(2.0f).b(5.0f).a(afh.f).c("spruceFenceGate"));
        a(184, "birch_fence_gate", new agu(aio.a.c).c(2.0f).b(5.0f).a(afh.f).c("birchFenceGate"));
        a(185, "jungle_fence_gate", new agu(aio.a.d).c(2.0f).b(5.0f).a(afh.f).c("jungleFenceGate"));
        a(186, "dark_oak_fence_gate", new agu(aio.a.f).c(2.0f).b(5.0f).a(afh.f).c("darkOakFenceGate"));
        a(187, "acacia_fence_gate", new agu(aio.a.e).c(2.0f).b(5.0f).a(afh.f).c("acaciaFenceGate"));
        a(188, "spruce_fence", new agt(arm.d, aio.a.b.c()).c(2.0f).b(5.0f).a(afh.f).c("spruceFence"));
        a(189, "birch_fence", new agt(arm.d, aio.a.c.c()).c(2.0f).b(5.0f).a(afh.f).c("birchFence"));
        a(190, "jungle_fence", new agt(arm.d, aio.a.d.c()).c(2.0f).b(5.0f).a(afh.f).c("jungleFence"));
        a(191, "dark_oak_fence", new agt(arm.d, aio.a.f.c()).c(2.0f).b(5.0f).a(afh.f).c("darkOakFence"));
        a(192, "acacia_fence", new agt(arm.d, aio.a.e.c()).c(2.0f).b(5.0f).a(afh.f).c("acaciaFence"));
        a(193, "spruce_door", new agh(arm.d).c(3.0f).a(afh.f).c("doorSpruce").K());
        a(194, "birch_door", new agh(arm.d).c(3.0f).a(afh.f).c("doorBirch").K());
        a(195, "jungle_door", new agh(arm.d).c(3.0f).a(afh.f).c("doorJungle").K());
        a(196, "acacia_door", new agh(arm.d).c(3.0f).a(afh.f).c("doorAcacia").K());
        a(197, "dark_oak_door", new agh(arm.d).c(3.0f).a(afh.f).c("doorDarkOak").K());
        afh.c.a();
        for (final afh \u2603 : afh.c) {
            if (\u2603.J == arm.a) {
                \u2603.v = false;
            }
            else {
                boolean v = false;
                final boolean b = \u2603 instanceof aju;
                final boolean b2 = \u2603 instanceof ahh;
                final boolean b3 = \u2603 == c5;
                final boolean t = \u2603.t;
                final boolean b4 = \u2603.s == 0;
                if (b || b2 || b3 || t || b4) {
                    v = true;
                }
                \u2603.v = v;
            }
        }
        for (final afh \u2603 : afh.c) {
            for (final alz alz : \u2603.P().a()) {
                final int \u26032 = afh.c.b(\u2603) << 4 | \u2603.c(alz);
                afh.d.a(alz, \u26032);
            }
        }
    }
    
    private static void a(final int \u2603, final jy \u2603, final afh \u2603) {
        afh.c.a(\u2603, \u2603, \u2603);
    }
    
    private static void a(final int \u2603, final String \u2603, final afh \u2603) {
        a(\u2603, new jy(\u2603), \u2603);
    }
    
    static {
        a = new jy("air");
        c = new co<jy, afh>(afh.a);
        d = new ct<alz>();
        e = new b("stone", 1.0f, 1.0f);
        f = new b("wood", 1.0f, 1.0f);
        g = new b("gravel", 1.0f, 1.0f);
        h = new b("grass", 1.0f, 1.0f);
        i = new b("stone", 1.0f, 1.0f);
        j = new b("stone", 1.0f, 1.5f);
        k = new b("stone", 1.0f, 1.0f) {
            @Override
            public String a() {
                return "dig.glass";
            }
            
            @Override
            public String b() {
                return "step.stone";
            }
        };
        l = new b("cloth", 1.0f, 1.0f);
        m = new b("sand", 1.0f, 1.0f);
        n = new b("snow", 1.0f, 1.0f);
        o = new b("ladder", 1.0f, 1.0f) {
            @Override
            public String a() {
                return "dig.wood";
            }
        };
        p = new b("anvil", 0.3f, 1.0f) {
            @Override
            public String a() {
                return "dig.stone";
            }
            
            @Override
            public String b() {
                return "random.anvil_land";
            }
        };
        q = new b("slime", 1.0f, 1.0f) {
            @Override
            public String a() {
                return "mob.slime.big";
            }
            
            @Override
            public String b() {
                return "mob.slime.big";
            }
            
            @Override
            public String c() {
                return "mob.slime.small";
            }
        };
    }
    
    public static class b
    {
        public final String a;
        public final float b;
        public final float c;
        
        public b(final String \u2603, final float \u2603, final float \u2603) {
            this.a = \u2603;
            this.b = \u2603;
            this.c = \u2603;
        }
        
        public float d() {
            return this.b;
        }
        
        public float e() {
            return this.c;
        }
        
        public String a() {
            return "dig." + this.a;
        }
        
        public String c() {
            return "step." + this.a;
        }
        
        public String b() {
            return this.a();
        }
    }
    
    public enum a
    {
        a, 
        b, 
        c;
    }
}
