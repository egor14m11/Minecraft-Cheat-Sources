import net.minecraft.server.MinecraftServer;
import java.util.UUID;
import com.google.common.base.Predicate;
import java.util.Iterator;
import java.util.Collection;
import java.util.concurrent.Callable;
import com.google.common.collect.Sets;
import com.google.common.collect.Lists;
import java.util.Set;
import java.util.Calendar;
import java.util.Random;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public abstract class adm implements adq
{
    private int a;
    protected boolean e;
    public final List<pk> f;
    protected final List<pk> g;
    public final List<akw> h;
    public final List<akw> i;
    private final List<akw> b;
    private final List<akw> c;
    public final List<wn> j;
    public final List<pk> k;
    protected final nm<pk> l;
    private long d;
    private int I;
    protected int m;
    protected final int n = 1013904223;
    protected float o;
    protected float p;
    protected float q;
    protected float r;
    private int J;
    public final Random s;
    public final anm t;
    protected List<ado> u;
    protected amv v;
    protected final atp w;
    protected ato x;
    protected boolean y;
    protected aua z;
    protected th A;
    public final nt B;
    private final Calendar K;
    protected auo C;
    public final boolean D;
    protected Set<adg> E;
    private int L;
    protected boolean F;
    protected boolean G;
    private boolean M;
    private final ams N;
    int[] H;
    
    protected adm(final atp \u2603, final ato \u2603, final anm \u2603, final nt \u2603, final boolean \u2603) {
        this.a = 63;
        this.f = (List<pk>)Lists.newArrayList();
        this.g = (List<pk>)Lists.newArrayList();
        this.h = (List<akw>)Lists.newArrayList();
        this.i = (List<akw>)Lists.newArrayList();
        this.b = (List<akw>)Lists.newArrayList();
        this.c = (List<akw>)Lists.newArrayList();
        this.j = (List<wn>)Lists.newArrayList();
        this.k = (List<pk>)Lists.newArrayList();
        this.l = new nm<pk>();
        this.d = 16777215L;
        this.m = new Random().nextInt();
        this.s = new Random();
        this.u = (List<ado>)Lists.newArrayList();
        this.K = Calendar.getInstance();
        this.C = new auo();
        this.E = (Set<adg>)Sets.newHashSet();
        this.L = this.s.nextInt(12000);
        this.F = true;
        this.G = true;
        this.H = new int[32768];
        this.w = \u2603;
        this.B = \u2603;
        this.x = \u2603;
        this.t = \u2603;
        this.D = \u2603;
        this.N = \u2603.r();
    }
    
    public adm b() {
        return this;
    }
    
    @Override
    public ady b(final cj \u2603) {
        if (this.e(\u2603)) {
            final amy f = this.f(\u2603);
            try {
                return f.a(\u2603, this.t.m());
            }
            catch (Throwable \u26032) {
                final b a = b.a(\u26032, "Getting biome");
                final c a2 = a.a("Coordinates of biome request");
                a2.a("Location", new Callable<String>() {
                    public String a() throws Exception {
                        return c.a(\u2603);
                    }
                });
                throw new e(a);
            }
        }
        return this.t.m().a(\u2603, ady.q);
    }
    
    public aec v() {
        return this.t.m();
    }
    
    protected abstract amv k();
    
    public void a(final adp \u2603) {
        this.x.d(true);
    }
    
    public void g() {
        this.B(new cj(8, 64, 8));
    }
    
    public afh c(final cj \u2603) {
        cj a;
        for (a = new cj(\u2603.n(), this.F(), \u2603.p()); !this.d(a.a()); a = a.a()) {}
        return this.p(a).c();
    }
    
    private boolean a(final cj \u2603) {
        return \u2603.n() >= -30000000 && \u2603.p() >= -30000000 && \u2603.n() < 30000000 && \u2603.p() < 30000000 && \u2603.o() >= 0 && \u2603.o() < 256;
    }
    
    @Override
    public boolean d(final cj \u2603) {
        return this.p(\u2603).c().t() == arm.a;
    }
    
    public boolean e(final cj \u2603) {
        return this.a(\u2603, true);
    }
    
    public boolean a(final cj \u2603, final boolean \u2603) {
        return this.a(\u2603) && this.a(\u2603.n() >> 4, \u2603.p() >> 4, \u2603);
    }
    
    public boolean a(final cj \u2603, final int \u2603) {
        return this.a(\u2603, \u2603, true);
    }
    
    public boolean a(final cj \u2603, final int \u2603, final boolean \u2603) {
        return this.a(\u2603.n() - \u2603, \u2603.o() - \u2603, \u2603.p() - \u2603, \u2603.n() + \u2603, \u2603.o() + \u2603, \u2603.p() + \u2603, \u2603);
    }
    
    public boolean a(final cj \u2603, final cj \u2603) {
        return this.a(\u2603, \u2603, true);
    }
    
    public boolean a(final cj \u2603, final cj \u2603, final boolean \u2603) {
        return this.a(\u2603.n(), \u2603.o(), \u2603.p(), \u2603.n(), \u2603.o(), \u2603.p(), \u2603);
    }
    
    public boolean a(final aqe \u2603) {
        return this.b(\u2603, true);
    }
    
    public boolean b(final aqe \u2603, final boolean \u2603) {
        return this.a(\u2603.a, \u2603.b, \u2603.c, \u2603.d, \u2603.e, \u2603.f, \u2603);
    }
    
    private boolean a(int \u2603, final int \u2603, int \u2603, int \u2603, final int \u2603, int \u2603, final boolean \u2603) {
        if (\u2603 < 0 || \u2603 >= 256) {
            return false;
        }
        \u2603 >>= 4;
        \u2603 >>= 4;
        \u2603 >>= 4;
        \u2603 >>= 4;
        for (int i = \u2603; i <= \u2603; ++i) {
            for (int j = \u2603; j <= \u2603; ++j) {
                if (!this.a(i, j, \u2603)) {
                    return false;
                }
            }
        }
        return true;
    }
    
    protected boolean a(final int \u2603, final int \u2603, final boolean \u2603) {
        return this.v.a(\u2603, \u2603) && (\u2603 || !this.v.d(\u2603, \u2603).f());
    }
    
    public amy f(final cj \u2603) {
        return this.a(\u2603.n() >> 4, \u2603.p() >> 4);
    }
    
    public amy a(final int \u2603, final int \u2603) {
        return this.v.d(\u2603, \u2603);
    }
    
    public boolean a(final cj \u2603, final alz \u2603, final int \u2603) {
        if (!this.a(\u2603)) {
            return false;
        }
        if (!this.D && this.x.u() == adr.g) {
            return false;
        }
        final amy f = this.f(\u2603);
        final afh c = \u2603.c();
        final alz a = f.a(\u2603, \u2603);
        if (a != null) {
            final afh c2 = a.c();
            if (c.p() != c2.p() || c.r() != c2.r()) {
                this.B.a("checkLight");
                this.x(\u2603);
                this.B.b();
            }
            if ((\u2603 & 0x2) != 0x0 && (!this.D || (\u2603 & 0x4) == 0x0) && f.i()) {
                this.h(\u2603);
            }
            if (!this.D && (\u2603 & 0x1) != 0x0) {
                this.b(\u2603, a.c());
                if (c.O()) {
                    this.e(\u2603, c);
                }
            }
            return true;
        }
        return false;
    }
    
    public boolean g(final cj \u2603) {
        return this.a(\u2603, afi.a.Q(), 3);
    }
    
    public boolean b(final cj \u2603, final boolean \u2603) {
        final alz p = this.p(\u2603);
        final afh c = p.c();
        if (c.t() == arm.a) {
            return false;
        }
        this.b(2001, \u2603, afh.f(p));
        if (\u2603) {
            c.b(this, \u2603, p, 0);
        }
        return this.a(\u2603, afi.a.Q(), 3);
    }
    
    public boolean a(final cj \u2603, final alz \u2603) {
        return this.a(\u2603, \u2603, 3);
    }
    
    public void h(final cj \u2603) {
        for (int i = 0; i < this.u.size(); ++i) {
            this.u.get(i).a(\u2603);
        }
    }
    
    public void b(final cj \u2603, final afh \u2603) {
        if (this.x.u() != adr.g) {
            this.c(\u2603, \u2603);
        }
    }
    
    public void a(final int \u2603, final int \u2603, int \u2603, int \u2603) {
        if (\u2603 > \u2603) {
            final int i = \u2603;
            \u2603 = \u2603;
            \u2603 = i;
        }
        if (!this.t.o()) {
            for (int i = \u2603; i <= \u2603; ++i) {
                this.c(ads.a, new cj(\u2603, i, \u2603));
            }
        }
        this.b(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
    }
    
    public void b(final cj \u2603, final cj \u2603) {
        this.b(\u2603.n(), \u2603.o(), \u2603.p(), \u2603.n(), \u2603.o(), \u2603.p());
    }
    
    public void b(final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603) {
        for (int i = 0; i < this.u.size(); ++i) {
            this.u.get(i).a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        }
    }
    
    public void c(final cj \u2603, final afh \u2603) {
        this.d(\u2603.e(), \u2603);
        this.d(\u2603.f(), \u2603);
        this.d(\u2603.b(), \u2603);
        this.d(\u2603.a(), \u2603);
        this.d(\u2603.c(), \u2603);
        this.d(\u2603.d(), \u2603);
    }
    
    public void a(final cj \u2603, final afh \u2603, final cq \u2603) {
        if (\u2603 != cq.e) {
            this.d(\u2603.e(), \u2603);
        }
        if (\u2603 != cq.f) {
            this.d(\u2603.f(), \u2603);
        }
        if (\u2603 != cq.a) {
            this.d(\u2603.b(), \u2603);
        }
        if (\u2603 != cq.b) {
            this.d(\u2603.a(), \u2603);
        }
        if (\u2603 != cq.c) {
            this.d(\u2603.c(), \u2603);
        }
        if (\u2603 != cq.d) {
            this.d(\u2603.d(), \u2603);
        }
    }
    
    public void d(final cj \u2603, final afh \u2603) {
        if (this.D) {
            return;
        }
        final alz p = this.p(\u2603);
        try {
            p.c().a(this, \u2603, p, \u2603);
        }
        catch (Throwable \u26032) {
            final b a = b.a(\u26032, "Exception while updating neighbours");
            final c a2 = a.a("Block being updated");
            a2.a("Source block type", new Callable<String>() {
                public String a() throws Exception {
                    try {
                        return String.format("ID #%d (%s // %s)", afh.a(\u2603), \u2603.a(), \u2603.getClass().getCanonicalName());
                    }
                    catch (Throwable t) {
                        return "ID #" + afh.a(\u2603);
                    }
                }
            });
            c.a(a2, \u2603, p);
            throw new e(a);
        }
    }
    
    public boolean a(final cj \u2603, final afh \u2603) {
        return false;
    }
    
    public boolean i(final cj \u2603) {
        return this.f(\u2603).d(\u2603);
    }
    
    public boolean j(final cj \u2603) {
        if (\u2603.o() >= this.F()) {
            return this.i(\u2603);
        }
        cj cj = new cj(\u2603.n(), this.F(), \u2603.p());
        if (!this.i(cj)) {
            return false;
        }
        for (cj = cj.b(); cj.o() > \u2603.o(); cj = cj.b()) {
            final afh c = this.p(cj).c();
            if (c.p() > 0 && !c.t().d()) {
                return false;
            }
        }
        return true;
    }
    
    public int k(cj \u2603) {
        if (\u2603.o() < 0) {
            return 0;
        }
        if (\u2603.o() >= 256) {
            \u2603 = new cj(\u2603.n(), 255, \u2603.p());
        }
        return this.f(\u2603).a(\u2603, 0);
    }
    
    public int l(final cj \u2603) {
        return this.c(\u2603, true);
    }
    
    public int c(cj \u2603, final boolean \u2603) {
        if (\u2603.n() < -30000000 || \u2603.p() < -30000000 || \u2603.n() >= 30000000 || \u2603.p() >= 30000000) {
            return 15;
        }
        if (\u2603 && this.p(\u2603).c().s()) {
            int c = this.c(\u2603.a(), false);
            final int c2 = this.c(\u2603.f(), false);
            final int c3 = this.c(\u2603.e(), false);
            final int c4 = this.c(\u2603.d(), false);
            final int c5 = this.c(\u2603.c(), false);
            if (c2 > c) {
                c = c2;
            }
            if (c3 > c) {
                c = c3;
            }
            if (c4 > c) {
                c = c4;
            }
            if (c5 > c) {
                c = c5;
            }
            return c;
        }
        if (\u2603.o() < 0) {
            return 0;
        }
        if (\u2603.o() >= 256) {
            \u2603 = new cj(\u2603.n(), 255, \u2603.p());
        }
        final amy f = this.f(\u2603);
        return f.a(\u2603, this.I);
    }
    
    public cj m(final cj \u2603) {
        int b;
        if (\u2603.n() < -30000000 || \u2603.p() < -30000000 || \u2603.n() >= 30000000 || \u2603.p() >= 30000000) {
            b = this.F() + 1;
        }
        else if (this.a(\u2603.n() >> 4, \u2603.p() >> 4, true)) {
            b = this.a(\u2603.n() >> 4, \u2603.p() >> 4).b(\u2603.n() & 0xF, \u2603.p() & 0xF);
        }
        else {
            b = 0;
        }
        return new cj(\u2603.n(), b, \u2603.p());
    }
    
    public int b(final int \u2603, final int \u2603) {
        if (\u2603 < -30000000 || \u2603 < -30000000 || \u2603 >= 30000000 || \u2603 >= 30000000) {
            return this.F() + 1;
        }
        if (!this.a(\u2603 >> 4, \u2603 >> 4, true)) {
            return 0;
        }
        final amy a = this.a(\u2603 >> 4, \u2603 >> 4);
        return a.v();
    }
    
    public int a(final ads \u2603, cj \u2603) {
        if (this.t.o() && \u2603 == ads.a) {
            return 0;
        }
        if (\u2603.o() < 0) {
            \u2603 = new cj(\u2603.n(), 0, \u2603.p());
        }
        if (!this.a(\u2603)) {
            return \u2603.c;
        }
        if (!this.e(\u2603)) {
            return \u2603.c;
        }
        if (this.p(\u2603).c().s()) {
            int b = this.b(\u2603, \u2603.a());
            final int b2 = this.b(\u2603, \u2603.f());
            final int b3 = this.b(\u2603, \u2603.e());
            final int b4 = this.b(\u2603, \u2603.d());
            final int b5 = this.b(\u2603, \u2603.c());
            if (b2 > b) {
                b = b2;
            }
            if (b3 > b) {
                b = b3;
            }
            if (b4 > b) {
                b = b4;
            }
            if (b5 > b) {
                b = b5;
            }
            return b;
        }
        final amy f = this.f(\u2603);
        return f.a(\u2603, \u2603);
    }
    
    public int b(final ads \u2603, cj \u2603) {
        if (\u2603.o() < 0) {
            \u2603 = new cj(\u2603.n(), 0, \u2603.p());
        }
        if (!this.a(\u2603)) {
            return \u2603.c;
        }
        if (!this.e(\u2603)) {
            return \u2603.c;
        }
        final amy f = this.f(\u2603);
        return f.a(\u2603, \u2603);
    }
    
    public void a(final ads \u2603, final cj \u2603, final int \u2603) {
        if (!this.a(\u2603)) {
            return;
        }
        if (!this.e(\u2603)) {
            return;
        }
        final amy f = this.f(\u2603);
        f.a(\u2603, \u2603, \u2603);
        this.n(\u2603);
    }
    
    public void n(final cj \u2603) {
        for (int i = 0; i < this.u.size(); ++i) {
            this.u.get(i).b(\u2603);
        }
    }
    
    @Override
    public int b(final cj \u2603, final int \u2603) {
        final int a = this.a(ads.a, \u2603);
        int a2 = this.a(ads.b, \u2603);
        if (a2 < \u2603) {
            a2 = \u2603;
        }
        return a << 20 | a2 << 4;
    }
    
    public float o(final cj \u2603) {
        return this.t.p()[this.l(\u2603)];
    }
    
    @Override
    public alz p(final cj \u2603) {
        if (!this.a(\u2603)) {
            return afi.a.Q();
        }
        final amy f = this.f(\u2603);
        return f.g(\u2603);
    }
    
    public boolean w() {
        return this.I < 4;
    }
    
    public auh a(final aui \u2603, final aui \u2603) {
        return this.a(\u2603, \u2603, false, false, false);
    }
    
    public auh a(final aui \u2603, final aui \u2603, final boolean \u2603) {
        return this.a(\u2603, \u2603, \u2603, false, false);
    }
    
    public auh a(aui \u2603, final aui \u2603, final boolean \u2603, final boolean \u2603, final boolean \u2603) {
        if (Double.isNaN(\u2603.a) || Double.isNaN(\u2603.b) || Double.isNaN(\u2603.c)) {
            return null;
        }
        if (Double.isNaN(\u2603.a) || Double.isNaN(\u2603.b) || Double.isNaN(\u2603.c)) {
            return null;
        }
        final int c = ns.c(\u2603.a);
        final int c2 = ns.c(\u2603.b);
        final int c3 = ns.c(\u2603.c);
        int c4 = ns.c(\u2603.a);
        int c5 = ns.c(\u2603.b);
        int c6 = ns.c(\u2603.c);
        cj \u26032 = new cj(c4, c5, c6);
        final alz p = this.p(\u26032);
        final afh c7 = p.c();
        if (!\u2603 || c7.a(this, \u26032, p) != null) {
            if (c7.a(p, \u2603)) {
                final auh a = c7.a(this, \u26032, \u2603, \u2603);
                if (a != null) {
                    return a;
                }
            }
        }
        auh auh = null;
        int n = 200;
        while (n-- >= 0) {
            if (Double.isNaN(\u2603.a) || Double.isNaN(\u2603.b) || Double.isNaN(\u2603.c)) {
                return null;
            }
            if (c4 == c && c5 == c2 && c6 == c3) {
                return \u2603 ? auh : null;
            }
            boolean b = true;
            boolean b2 = true;
            boolean b3 = true;
            double \u26033 = 999.0;
            double \u26034 = 999.0;
            double \u26035 = 999.0;
            if (c > c4) {
                \u26033 = c4 + 1.0;
            }
            else if (c < c4) {
                \u26033 = c4 + 0.0;
            }
            else {
                b = false;
            }
            if (c2 > c5) {
                \u26034 = c5 + 1.0;
            }
            else if (c2 < c5) {
                \u26034 = c5 + 0.0;
            }
            else {
                b2 = false;
            }
            if (c3 > c6) {
                \u26035 = c6 + 1.0;
            }
            else if (c3 < c6) {
                \u26035 = c6 + 0.0;
            }
            else {
                b3 = false;
            }
            double n2 = 999.0;
            double n3 = 999.0;
            double n4 = 999.0;
            final double n5 = \u2603.a - \u2603.a;
            final double n6 = \u2603.b - \u2603.b;
            final double n7 = \u2603.c - \u2603.c;
            if (b) {
                n2 = (\u26033 - \u2603.a) / n5;
            }
            if (b2) {
                n3 = (\u26034 - \u2603.b) / n6;
            }
            if (b3) {
                n4 = (\u26035 - \u2603.c) / n7;
            }
            if (n2 == -0.0) {
                n2 = -1.0E-4;
            }
            if (n3 == -0.0) {
                n3 = -1.0E-4;
            }
            if (n4 == -0.0) {
                n4 = -1.0E-4;
            }
            cq \u26036;
            if (n2 < n3 && n2 < n4) {
                \u26036 = ((c > c4) ? cq.e : cq.f);
                \u2603 = new aui(\u26033, \u2603.b + n6 * n2, \u2603.c + n7 * n2);
            }
            else if (n3 < n4) {
                \u26036 = ((c2 > c5) ? cq.a : cq.b);
                \u2603 = new aui(\u2603.a + n5 * n3, \u26034, \u2603.c + n7 * n3);
            }
            else {
                \u26036 = ((c3 > c6) ? cq.c : cq.d);
                \u2603 = new aui(\u2603.a + n5 * n4, \u2603.b + n6 * n4, \u26035);
            }
            c4 = ns.c(\u2603.a) - ((\u26036 == cq.f) ? 1 : 0);
            c5 = ns.c(\u2603.b) - ((\u26036 == cq.b) ? 1 : 0);
            c6 = ns.c(\u2603.c) - ((\u26036 == cq.d) ? 1 : 0);
            \u26032 = new cj(c4, c5, c6);
            final alz p2 = this.p(\u26032);
            final afh c8 = p2.c();
            if (\u2603 && c8.a(this, \u26032, p2) == null) {
                continue;
            }
            if (c8.a(p2, \u2603)) {
                final auh a2 = c8.a(this, \u26032, \u2603, \u2603);
                if (a2 != null) {
                    return a2;
                }
                continue;
            }
            else {
                auh = new auh(auh.a.a, \u2603, \u26036, \u26032);
            }
        }
        return \u2603 ? auh : null;
    }
    
    public void a(final pk \u2603, final String \u2603, final float \u2603, final float \u2603) {
        for (int i = 0; i < this.u.size(); ++i) {
            this.u.get(i).a(\u2603, \u2603.s, \u2603.t, \u2603.u, \u2603, \u2603);
        }
    }
    
    public void a(final wn \u2603, final String \u2603, final float \u2603, final float \u2603) {
        for (int i = 0; i < this.u.size(); ++i) {
            this.u.get(i).a(\u2603, \u2603, \u2603.s, \u2603.t, \u2603.u, \u2603, \u2603);
        }
    }
    
    public void a(final double \u2603, final double \u2603, final double \u2603, final String \u2603, final float \u2603, final float \u2603) {
        for (int i = 0; i < this.u.size(); ++i) {
            this.u.get(i).a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        }
    }
    
    public void a(final double \u2603, final double \u2603, final double \u2603, final String \u2603, final float \u2603, final float \u2603, final boolean \u2603) {
    }
    
    public void a(final cj \u2603, final String \u2603) {
        for (int i = 0; i < this.u.size(); ++i) {
            this.u.get(i).a(\u2603, \u2603);
        }
    }
    
    public void a(final cy \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final int... \u2603) {
        this.a(\u2603.c(), \u2603.e(), \u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
    }
    
    public void a(final cy \u2603, final boolean \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final int... \u2603) {
        this.a(\u2603.c(), \u2603.e() | \u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
    }
    
    private void a(final int \u2603, final boolean \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final int... \u2603) {
        for (int i = 0; i < this.u.size(); ++i) {
            this.u.get(i).a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        }
    }
    
    public boolean c(final pk \u2603) {
        this.k.add(\u2603);
        return true;
    }
    
    public boolean d(final pk \u2603) {
        final int c = ns.c(\u2603.s / 16.0);
        final int c2 = ns.c(\u2603.u / 16.0);
        boolean n = \u2603.n;
        if (\u2603 instanceof wn) {
            n = true;
        }
        if (n || this.a(c, c2, true)) {
            if (\u2603 instanceof wn) {
                final wn wn = (wn)\u2603;
                this.j.add(wn);
                this.d();
            }
            this.a(c, c2).a(\u2603);
            this.f.add(\u2603);
            this.a(\u2603);
            return true;
        }
        return false;
    }
    
    protected void a(final pk \u2603) {
        for (int i = 0; i < this.u.size(); ++i) {
            this.u.get(i).a(\u2603);
        }
    }
    
    protected void b(final pk \u2603) {
        for (int i = 0; i < this.u.size(); ++i) {
            this.u.get(i).b(\u2603);
        }
    }
    
    public void e(final pk \u2603) {
        if (\u2603.l != null) {
            \u2603.l.a((pk)null);
        }
        if (\u2603.m != null) {
            \u2603.a((pk)null);
        }
        \u2603.J();
        if (\u2603 instanceof wn) {
            this.j.remove(\u2603);
            this.d();
            this.b(\u2603);
        }
    }
    
    public void f(final pk \u2603) {
        \u2603.J();
        if (\u2603 instanceof wn) {
            this.j.remove(\u2603);
            this.d();
        }
        final int ae = \u2603.ae;
        final int ag = \u2603.ag;
        if (\u2603.ad && this.a(ae, ag, true)) {
            this.a(ae, ag).b(\u2603);
        }
        this.f.remove(\u2603);
        this.b(\u2603);
    }
    
    public void a(final ado \u2603) {
        this.u.add(\u2603);
    }
    
    public void b(final ado \u2603) {
        this.u.remove(\u2603);
    }
    
    public List<aug> a(final pk \u2603, final aug \u2603) {
        final List<aug> arrayList = (List<aug>)Lists.newArrayList();
        final int c = ns.c(\u2603.a);
        final int c2 = ns.c(\u2603.d + 1.0);
        final int c3 = ns.c(\u2603.b);
        final int c4 = ns.c(\u2603.e + 1.0);
        final int c5 = ns.c(\u2603.c);
        final int c6 = ns.c(\u2603.f + 1.0);
        final ams af = this.af();
        final boolean at = \u2603.aT();
        final boolean a = this.a(af, \u2603);
        final alz q = afi.b.Q();
        final cj.a \u26032 = new cj.a();
        for (int i = c; i < c2; ++i) {
            for (int j = c5; j < c6; ++j) {
                if (this.e(\u26032.c(i, 64, j))) {
                    for (int k = c3 - 1; k < c4; ++k) {
                        \u26032.c(i, k, j);
                        if (at && a) {
                            \u2603.h(false);
                        }
                        else if (!at && !a) {
                            \u2603.h(true);
                        }
                        alz p = q;
                        if (af.a(\u26032) || !a) {
                            p = this.p(\u26032);
                        }
                        p.c().a(this, \u26032, p, \u2603, arrayList, \u2603);
                    }
                }
            }
        }
        final double n = 0.25;
        final List<pk> b = this.b(\u2603, \u2603.b(n, n, n));
        for (int l = 0; l < b.size(); ++l) {
            if (\u2603.l != b) {
                if (\u2603.m != b) {
                    aug aug = b.get(l).S();
                    if (aug != null && aug.b(\u2603)) {
                        arrayList.add(aug);
                    }
                    aug = \u2603.j(b.get(l));
                    if (aug != null && aug.b(\u2603)) {
                        arrayList.add(aug);
                    }
                }
            }
        }
        return arrayList;
    }
    
    public boolean a(final ams \u2603, final pk \u2603) {
        double b = \u2603.b();
        double c = \u2603.c();
        double d = \u2603.d();
        double e = \u2603.e();
        if (\u2603.aT()) {
            ++b;
            ++c;
            --d;
            --e;
        }
        else {
            --b;
            --c;
            ++d;
            ++e;
        }
        return \u2603.s > b && \u2603.s < d && \u2603.u > c && \u2603.u < e;
    }
    
    public List<aug> a(final aug \u2603) {
        final List<aug> arrayList = (List<aug>)Lists.newArrayList();
        final int c = ns.c(\u2603.a);
        final int c2 = ns.c(\u2603.d + 1.0);
        final int c3 = ns.c(\u2603.b);
        final int c4 = ns.c(\u2603.e + 1.0);
        final int c5 = ns.c(\u2603.c);
        final int c6 = ns.c(\u2603.f + 1.0);
        final cj.a a = new cj.a();
        for (int i = c; i < c2; ++i) {
            for (int j = c5; j < c6; ++j) {
                if (this.e(a.c(i, 64, j))) {
                    for (int k = c3 - 1; k < c4; ++k) {
                        a.c(i, k, j);
                        alz \u26032;
                        if (i < -30000000 || i >= 30000000 || j < -30000000 || j >= 30000000) {
                            \u26032 = afi.h.Q();
                        }
                        else {
                            \u26032 = this.p(a);
                        }
                        \u26032.c().a(this, a, \u26032, \u2603, arrayList, null);
                    }
                }
            }
        }
        return arrayList;
    }
    
    public int a(final float \u2603) {
        final float c = this.c(\u2603);
        float a = 1.0f - (ns.b(c * 3.1415927f * 2.0f) * 2.0f + 0.5f);
        a = ns.a(a, 0.0f, 1.0f);
        a = 1.0f - a;
        a *= (float)(1.0 - this.j(\u2603) * 5.0f / 16.0);
        a *= (float)(1.0 - this.h(\u2603) * 5.0f / 16.0);
        a = 1.0f - a;
        return (int)(a * 11.0f);
    }
    
    public float b(final float \u2603) {
        final float c = this.c(\u2603);
        float a = 1.0f - (ns.b(c * 3.1415927f * 2.0f) * 2.0f + 0.2f);
        a = ns.a(a, 0.0f, 1.0f);
        a = 1.0f - a;
        a *= (float)(1.0 - this.j(\u2603) * 5.0f / 16.0);
        a *= (float)(1.0 - this.h(\u2603) * 5.0f / 16.0);
        return a * 0.8f + 0.2f;
    }
    
    public aui a(final pk \u2603, final float \u2603) {
        final float c = this.c(\u2603);
        float a = ns.b(c * 3.1415927f * 2.0f) * 2.0f + 0.5f;
        a = ns.a(a, 0.0f, 1.0f);
        final int c2 = ns.c(\u2603.s);
        final int c3 = ns.c(\u2603.t);
        final int c4 = ns.c(\u2603.u);
        final cj cj = new cj(c2, c3, c4);
        final ady b = this.b(cj);
        final float a2 = b.a(cj);
        final int a3 = b.a(a2);
        float n = (a3 >> 16 & 0xFF) / 255.0f;
        float n2 = (a3 >> 8 & 0xFF) / 255.0f;
        float n3 = (a3 & 0xFF) / 255.0f;
        n *= a;
        n2 *= a;
        n3 *= a;
        final float j = this.j(\u2603);
        if (j > 0.0f) {
            final float h = (n * 0.3f + n2 * 0.59f + n3 * 0.11f) * 0.6f;
            final float n4 = 1.0f - j * 0.75f;
            n = n * n4 + h * (1.0f - n4);
            n2 = n2 * n4 + h * (1.0f - n4);
            n3 = n3 * n4 + h * (1.0f - n4);
        }
        final float h = this.h(\u2603);
        if (h > 0.0f) {
            final float n4 = (n * 0.3f + n2 * 0.59f + n3 * 0.11f) * 0.2f;
            final float n5 = 1.0f - h * 0.75f;
            n = n * n5 + n4 * (1.0f - n5);
            n2 = n2 * n5 + n4 * (1.0f - n5);
            n3 = n3 * n5 + n4 * (1.0f - n5);
        }
        if (this.J > 0) {
            float n4 = this.J - \u2603;
            if (n4 > 1.0f) {
                n4 = 1.0f;
            }
            n4 *= 0.45f;
            n = n * (1.0f - n4) + 0.8f * n4;
            n2 = n2 * (1.0f - n4) + 0.8f * n4;
            n3 = n3 * (1.0f - n4) + 1.0f * n4;
        }
        return new aui(n, n2, n3);
    }
    
    public float c(final float \u2603) {
        return this.t.a(this.x.g(), \u2603);
    }
    
    public int x() {
        return this.t.a(this.x.g());
    }
    
    public float y() {
        return anm.a[this.t.a(this.x.g())];
    }
    
    public float d(final float \u2603) {
        final float c = this.c(\u2603);
        return c * 3.1415927f * 2.0f;
    }
    
    public aui e(final float \u2603) {
        final float c = this.c(\u2603);
        float a = ns.b(c * 3.1415927f * 2.0f) * 2.0f + 0.5f;
        a = ns.a(a, 0.0f, 1.0f);
        float n = (this.d >> 16 & 0xFFL) / 255.0f;
        float n2 = (this.d >> 8 & 0xFFL) / 255.0f;
        float n3 = (this.d & 0xFFL) / 255.0f;
        final float j = this.j(\u2603);
        if (j > 0.0f) {
            final float h = (n * 0.3f + n2 * 0.59f + n3 * 0.11f) * 0.6f;
            final float n4 = 1.0f - j * 0.95f;
            n = n * n4 + h * (1.0f - n4);
            n2 = n2 * n4 + h * (1.0f - n4);
            n3 = n3 * n4 + h * (1.0f - n4);
        }
        n *= a * 0.9f + 0.1f;
        n2 *= a * 0.9f + 0.1f;
        n3 *= a * 0.85f + 0.15f;
        final float h = this.h(\u2603);
        if (h > 0.0f) {
            final float n4 = (n * 0.3f + n2 * 0.59f + n3 * 0.11f) * 0.2f;
            final float n5 = 1.0f - h * 0.95f;
            n = n * n5 + n4 * (1.0f - n5);
            n2 = n2 * n5 + n4 * (1.0f - n5);
            n3 = n3 * n5 + n4 * (1.0f - n5);
        }
        return new aui(n, n2, n3);
    }
    
    public aui f(final float \u2603) {
        final float c = this.c(\u2603);
        return this.t.b(c, \u2603);
    }
    
    public cj q(final cj \u2603) {
        return this.f(\u2603).h(\u2603);
    }
    
    public cj r(final cj \u2603) {
        final amy f = this.f(\u2603);
        cj cj;
        cj b;
        for (cj = new cj(\u2603.n(), f.g() + 16, \u2603.p()); cj.o() >= 0; cj = b) {
            b = cj.b();
            final arm t = f.a(b).t();
            if (t.c() && t != arm.j) {
                break;
            }
        }
        return cj;
    }
    
    public float g(final float \u2603) {
        final float c = this.c(\u2603);
        float a = 1.0f - (ns.b(c * 3.1415927f * 2.0f) * 2.0f + 0.25f);
        a = ns.a(a, 0.0f, 1.0f);
        return a * a * 0.5f;
    }
    
    public void a(final cj \u2603, final afh \u2603, final int \u2603) {
    }
    
    public void a(final cj \u2603, final afh \u2603, final int \u2603, final int \u2603) {
    }
    
    public void b(final cj \u2603, final afh \u2603, final int \u2603, final int \u2603) {
    }
    
    public void i() {
        this.B.a("entities");
        this.B.a("global");
        for (int i = 0; i < this.k.size(); ++i) {
            final pk pk = this.k.get(i);
            try {
                final pk pk2 = pk;
                ++pk2.W;
                pk.t_();
            }
            catch (Throwable t) {
                final b b = b.a(t, "Ticking entity");
                final c c = b.a("Entity being ticked");
                if (pk == null) {
                    c.a("Entity", "~~NULL~~");
                }
                else {
                    pk.a(c);
                }
                throw new e(b);
            }
            if (pk.I) {
                this.k.remove(i--);
            }
        }
        this.B.c("remove");
        this.f.removeAll(this.g);
        for (int i = 0; i < this.g.size(); ++i) {
            final pk pk = this.g.get(i);
            final int n = pk.ae;
            final int n2 = pk.ag;
            if (pk.ad && this.a(n, n2, true)) {
                this.a(n, n2).b(pk);
            }
        }
        for (int i = 0; i < this.g.size(); ++i) {
            this.b(this.g.get(i));
        }
        this.g.clear();
        this.B.c("regular");
        for (int i = 0; i < this.f.size(); ++i) {
            final pk pk = this.f.get(i);
            if (pk.m != null) {
                if (!pk.m.I && pk.m.l == pk) {
                    continue;
                }
                pk.m.l = null;
                pk.m = null;
            }
            this.B.a("tick");
            if (!pk.I) {
                try {
                    this.g(pk);
                }
                catch (Throwable t) {
                    final b b = b.a(t, "Ticking entity");
                    final c c = b.a("Entity being ticked");
                    pk.a(c);
                    throw new e(b);
                }
            }
            this.B.b();
            this.B.a("remove");
            if (pk.I) {
                final int n = pk.ae;
                final int n2 = pk.ag;
                if (pk.ad && this.a(n, n2, true)) {
                    this.a(n, n2).b(pk);
                }
                this.f.remove(i--);
                this.b(pk);
            }
            this.B.b();
        }
        this.B.c("blockEntities");
        this.M = true;
        final Iterator<akw> iterator = this.i.iterator();
        while (iterator.hasNext()) {
            final akw akw = iterator.next();
            if (!akw.x() && akw.t()) {
                final cj v = akw.v();
                if (this.e(v) && this.N.a(v)) {
                    try {
                        ((km)akw).c();
                    }
                    catch (Throwable \u2603) {
                        final b a = b.a(\u2603, "Ticking block entity");
                        final c a2 = a.a("Block entity being ticked");
                        akw.a(a2);
                        throw new e(a);
                    }
                }
            }
            if (akw.x()) {
                iterator.remove();
                this.h.remove(akw);
                if (!this.e(akw.v())) {
                    continue;
                }
                this.f(akw.v()).e(akw.v());
            }
        }
        this.M = false;
        if (!this.c.isEmpty()) {
            this.i.removeAll(this.c);
            this.h.removeAll(this.c);
            this.c.clear();
        }
        this.B.c("pendingBlockEntities");
        if (!this.b.isEmpty()) {
            for (int j = 0; j < this.b.size(); ++j) {
                final akw akw2 = this.b.get(j);
                if (!akw2.x()) {
                    if (!this.h.contains(akw2)) {
                        this.a(akw2);
                    }
                    if (this.e(akw2.v())) {
                        this.f(akw2.v()).a(akw2.v(), akw2);
                    }
                    this.h(akw2.v());
                }
            }
            this.b.clear();
        }
        this.B.b();
        this.B.b();
    }
    
    public boolean a(final akw \u2603) {
        final boolean add = this.h.add(\u2603);
        if (add && \u2603 instanceof km) {
            this.i.add(\u2603);
        }
        return add;
    }
    
    public void a(final Collection<akw> \u2603) {
        if (this.M) {
            this.b.addAll(\u2603);
        }
        else {
            for (final akw akw : \u2603) {
                this.h.add(akw);
                if (akw instanceof km) {
                    this.i.add(akw);
                }
            }
        }
    }
    
    public void g(final pk \u2603) {
        this.a(\u2603, true);
    }
    
    public void a(final pk \u2603, final boolean \u2603) {
        final int c = ns.c(\u2603.s);
        final int c2 = ns.c(\u2603.u);
        final int n = 32;
        if (\u2603 && !this.a(c - n, 0, c2 - n, c + n, 0, c2 + n, true)) {
            return;
        }
        \u2603.P = \u2603.s;
        \u2603.Q = \u2603.t;
        \u2603.R = \u2603.u;
        \u2603.A = \u2603.y;
        \u2603.B = \u2603.z;
        if (\u2603 && \u2603.ad) {
            ++\u2603.W;
            if (\u2603.m != null) {
                \u2603.ak();
            }
            else {
                \u2603.t_();
            }
        }
        this.B.a("chunkCheck");
        if (Double.isNaN(\u2603.s) || Double.isInfinite(\u2603.s)) {
            \u2603.s = \u2603.P;
        }
        if (Double.isNaN(\u2603.t) || Double.isInfinite(\u2603.t)) {
            \u2603.t = \u2603.Q;
        }
        if (Double.isNaN(\u2603.u) || Double.isInfinite(\u2603.u)) {
            \u2603.u = \u2603.R;
        }
        if (Double.isNaN(\u2603.z) || Double.isInfinite(\u2603.z)) {
            \u2603.z = \u2603.B;
        }
        if (Double.isNaN(\u2603.y) || Double.isInfinite(\u2603.y)) {
            \u2603.y = \u2603.A;
        }
        final int c3 = ns.c(\u2603.s / 16.0);
        final int c4 = ns.c(\u2603.t / 16.0);
        final int c5 = ns.c(\u2603.u / 16.0);
        if (!\u2603.ad || \u2603.ae != c3 || \u2603.af != c4 || \u2603.ag != c5) {
            if (\u2603.ad && this.a(\u2603.ae, \u2603.ag, true)) {
                this.a(\u2603.ae, \u2603.ag).a(\u2603, \u2603.af);
            }
            if (this.a(c3, c5, true)) {
                \u2603.ad = true;
                this.a(c3, c5).a(\u2603);
            }
            else {
                \u2603.ad = false;
            }
        }
        this.B.b();
        if (\u2603 && \u2603.ad && \u2603.l != null) {
            if (\u2603.l.I || \u2603.l.m != \u2603) {
                \u2603.l.m = null;
                \u2603.l = null;
            }
            else {
                this.g(\u2603.l);
            }
        }
    }
    
    public boolean b(final aug \u2603) {
        return this.a(\u2603, (pk)null);
    }
    
    public boolean a(final aug \u2603, final pk \u2603) {
        final List<pk> b = this.b(null, \u2603);
        for (int i = 0; i < b.size(); ++i) {
            final pk pk = b.get(i);
            if (!pk.I && pk.k && pk != \u2603 && (\u2603 == null || (\u2603.m != pk && \u2603.l != pk))) {
                return false;
            }
        }
        return true;
    }
    
    public boolean c(final aug \u2603) {
        final int c = ns.c(\u2603.a);
        final int c2 = ns.c(\u2603.d);
        final int c3 = ns.c(\u2603.b);
        final int c4 = ns.c(\u2603.e);
        final int c5 = ns.c(\u2603.c);
        final int c6 = ns.c(\u2603.f);
        final cj.a a = new cj.a();
        for (int i = c; i <= c2; ++i) {
            for (int j = c3; j <= c4; ++j) {
                for (int k = c5; k <= c6; ++k) {
                    final afh c7 = this.p(a.c(i, j, k)).c();
                    if (c7.t() != arm.a) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    public boolean d(final aug \u2603) {
        final int c = ns.c(\u2603.a);
        final int c2 = ns.c(\u2603.d);
        final int c3 = ns.c(\u2603.b);
        final int c4 = ns.c(\u2603.e);
        final int c5 = ns.c(\u2603.c);
        final int c6 = ns.c(\u2603.f);
        final cj.a a = new cj.a();
        for (int i = c; i <= c2; ++i) {
            for (int j = c3; j <= c4; ++j) {
                for (int k = c5; k <= c6; ++k) {
                    final afh c7 = this.p(a.c(i, j, k)).c();
                    if (c7.t().d()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    public boolean e(final aug \u2603) {
        final int c = ns.c(\u2603.a);
        final int c2 = ns.c(\u2603.d + 1.0);
        final int c3 = ns.c(\u2603.b);
        final int c4 = ns.c(\u2603.e + 1.0);
        final int c5 = ns.c(\u2603.c);
        final int c6 = ns.c(\u2603.f + 1.0);
        if (this.a(c, c3, c5, c2, c4, c6, true)) {
            final cj.a a = new cj.a();
            for (int i = c; i < c2; ++i) {
                for (int j = c3; j < c4; ++j) {
                    for (int k = c5; k < c6; ++k) {
                        final afh c7 = this.p(a.c(i, j, k)).c();
                        if (c7 == afi.ab || c7 == afi.k || c7 == afi.l) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
    
    public boolean a(final aug \u2603, final arm \u2603, final pk \u2603) {
        final int c = ns.c(\u2603.a);
        final int c2 = ns.c(\u2603.d + 1.0);
        final int c3 = ns.c(\u2603.b);
        final int c4 = ns.c(\u2603.e + 1.0);
        final int c5 = ns.c(\u2603.c);
        final int c6 = ns.c(\u2603.f + 1.0);
        if (!this.a(c, c3, c5, c2, c4, c6, true)) {
            return false;
        }
        boolean b = false;
        aui \u26032 = new aui(0.0, 0.0, 0.0);
        final cj.a a = new cj.a();
        for (int i = c; i < c2; ++i) {
            for (int j = c3; j < c4; ++j) {
                for (int k = c5; k < c6; ++k) {
                    a.c(i, j, k);
                    final alz p = this.p(a);
                    final afh c7 = p.c();
                    if (c7.t() == \u2603) {
                        final double n = j + 1 - ahv.b(p.b((amo<Integer>)ahv.b));
                        if (c4 >= n) {
                            b = true;
                            \u26032 = c7.a(this, a, \u2603, \u26032);
                        }
                    }
                }
            }
        }
        if (\u26032.b() > 0.0 && \u2603.aL()) {
            \u26032 = \u26032.a();
            final double n2 = 0.014;
            \u2603.v += \u26032.a * n2;
            \u2603.w += \u26032.b * n2;
            \u2603.x += \u26032.c * n2;
        }
        return b;
    }
    
    public boolean a(final aug \u2603, final arm \u2603) {
        final int c = ns.c(\u2603.a);
        final int c2 = ns.c(\u2603.d + 1.0);
        final int c3 = ns.c(\u2603.b);
        final int c4 = ns.c(\u2603.e + 1.0);
        final int c5 = ns.c(\u2603.c);
        final int c6 = ns.c(\u2603.f + 1.0);
        final cj.a a = new cj.a();
        for (int i = c; i < c2; ++i) {
            for (int j = c3; j < c4; ++j) {
                for (int k = c5; k < c6; ++k) {
                    if (this.p(a.c(i, j, k)).c().t() == \u2603) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    public boolean b(final aug \u2603, final arm \u2603) {
        final int c = ns.c(\u2603.a);
        final int c2 = ns.c(\u2603.d + 1.0);
        final int c3 = ns.c(\u2603.b);
        final int c4 = ns.c(\u2603.e + 1.0);
        final int c5 = ns.c(\u2603.c);
        final int c6 = ns.c(\u2603.f + 1.0);
        final cj.a a = new cj.a();
        for (int i = c; i < c2; ++i) {
            for (int j = c3; j < c4; ++j) {
                for (int k = c5; k < c6; ++k) {
                    final alz p = this.p(a.c(i, j, k));
                    final afh c7 = p.c();
                    if (c7.t() == \u2603) {
                        final int intValue = p.b((amo<Integer>)ahv.b);
                        double n = j + 1;
                        if (intValue < 8) {
                            n = j + 1 - intValue / 8.0;
                        }
                        if (n >= \u2603.b) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
    
    public adi a(final pk \u2603, final double \u2603, final double \u2603, final double \u2603, final float \u2603, final boolean \u2603) {
        return this.a(\u2603, \u2603, \u2603, \u2603, \u2603, false, \u2603);
    }
    
    public adi a(final pk \u2603, final double \u2603, final double \u2603, final double \u2603, final float \u2603, final boolean \u2603, final boolean \u2603) {
        final adi adi = new adi(this, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        adi.a();
        adi.a(true);
        return adi;
    }
    
    public float a(final aui \u2603, final aug \u2603) {
        final double n = 1.0 / ((\u2603.d - \u2603.a) * 2.0 + 1.0);
        final double n2 = 1.0 / ((\u2603.e - \u2603.b) * 2.0 + 1.0);
        final double n3 = 1.0 / ((\u2603.f - \u2603.c) * 2.0 + 1.0);
        final double n4 = (1.0 - Math.floor(1.0 / n) * n) / 2.0;
        final double n5 = (1.0 - Math.floor(1.0 / n3) * n3) / 2.0;
        if (n < 0.0 || n2 < 0.0 || n3 < 0.0) {
            return 0.0f;
        }
        int n6 = 0;
        int n7 = 0;
        for (float n8 = 0.0f; n8 <= 1.0f; n8 += (float)n) {
            for (float n9 = 0.0f; n9 <= 1.0f; n9 += (float)n2) {
                for (float n10 = 0.0f; n10 <= 1.0f; n10 += (float)n3) {
                    final double n11 = \u2603.a + (\u2603.d - \u2603.a) * n8;
                    final double \u26032 = \u2603.b + (\u2603.e - \u2603.b) * n9;
                    final double n12 = \u2603.c + (\u2603.f - \u2603.c) * n10;
                    if (this.a(new aui(n11 + n4, \u26032, n12 + n5), \u2603) == null) {
                        ++n6;
                    }
                    ++n7;
                }
            }
        }
        return n6 / (float)n7;
    }
    
    public boolean a(final wn \u2603, cj \u2603, final cq \u2603) {
        \u2603 = \u2603.a(\u2603);
        if (this.p(\u2603).c() == afi.ab) {
            this.a(\u2603, 1004, \u2603, 0);
            this.g(\u2603);
            return true;
        }
        return false;
    }
    
    public String z() {
        return "All: " + this.f.size();
    }
    
    public String A() {
        return this.v.f();
    }
    
    @Override
    public akw s(final cj \u2603) {
        if (!this.a(\u2603)) {
            return null;
        }
        akw a = null;
        if (this.M) {
            for (int i = 0; i < this.b.size(); ++i) {
                final akw akw = this.b.get(i);
                if (!akw.x() && akw.v().equals(\u2603)) {
                    a = akw;
                    break;
                }
            }
        }
        if (a == null) {
            a = this.f(\u2603).a(\u2603, amy.a.a);
        }
        if (a == null) {
            for (int i = 0; i < this.b.size(); ++i) {
                final akw akw = this.b.get(i);
                if (!akw.x() && akw.v().equals(\u2603)) {
                    a = akw;
                    break;
                }
            }
        }
        return a;
    }
    
    public void a(final cj \u2603, final akw \u2603) {
        if (\u2603 != null && !\u2603.x()) {
            if (this.M) {
                \u2603.a(\u2603);
                final Iterator<akw> iterator = this.b.iterator();
                while (iterator.hasNext()) {
                    final akw akw = iterator.next();
                    if (akw.v().equals(\u2603)) {
                        akw.y();
                        iterator.remove();
                    }
                }
                this.b.add(\u2603);
            }
            else {
                this.a(\u2603);
                this.f(\u2603).a(\u2603, \u2603);
            }
        }
    }
    
    public void t(final cj \u2603) {
        final akw s = this.s(\u2603);
        if (s != null && this.M) {
            s.y();
            this.b.remove(s);
        }
        else {
            if (s != null) {
                this.b.remove(s);
                this.h.remove(s);
                this.i.remove(s);
            }
            this.f(\u2603).e(\u2603);
        }
    }
    
    public void b(final akw \u2603) {
        this.c.add(\u2603);
    }
    
    public boolean u(final cj \u2603) {
        final alz p = this.p(\u2603);
        final aug a = p.c().a(this, \u2603, p);
        return a != null && a.a() >= 1.0;
    }
    
    public static boolean a(final adq \u2603, final cj \u2603) {
        final alz p = \u2603.p(\u2603);
        final afh c = p.c();
        if (c.t().k() && c.d()) {
            return true;
        }
        if (c instanceof aju) {
            return p.b(aju.b) == aju.a.a;
        }
        if (c instanceof ahh) {
            return p.b(ahh.a) == ahh.a.a;
        }
        return c instanceof ahn || (c instanceof ajp && p.b((amo<Integer>)ajp.a) == 7);
    }
    
    public boolean d(final cj \u2603, final boolean \u2603) {
        if (!this.a(\u2603)) {
            return \u2603;
        }
        final amy a = this.v.a(\u2603);
        if (a.f()) {
            return \u2603;
        }
        final afh c = this.p(\u2603).c();
        return c.t().k() && c.d();
    }
    
    public void B() {
        final int a = this.a(1.0f);
        if (a != this.I) {
            this.I = a;
        }
    }
    
    public void a(final boolean \u2603, final boolean \u2603) {
        this.F = \u2603;
        this.G = \u2603;
    }
    
    public void c() {
        this.p();
    }
    
    protected void C() {
        if (this.x.p()) {
            this.p = 1.0f;
            if (this.x.n()) {
                this.r = 1.0f;
            }
        }
    }
    
    protected void p() {
        if (this.t.o()) {
            return;
        }
        if (this.D) {
            return;
        }
        int a = this.x.A();
        if (a > 0) {
            --a;
            this.x.i(a);
            this.x.f(this.x.n() ? 1 : 2);
            this.x.g(this.x.p() ? 1 : 2);
        }
        int o = this.x.o();
        if (o <= 0) {
            if (this.x.n()) {
                this.x.f(this.s.nextInt(12000) + 3600);
            }
            else {
                this.x.f(this.s.nextInt(168000) + 12000);
            }
        }
        else {
            --o;
            this.x.f(o);
            if (o <= 0) {
                this.x.a(!this.x.n());
            }
        }
        this.q = this.r;
        if (this.x.n()) {
            this.r += (float)0.01;
        }
        else {
            this.r -= (float)0.01;
        }
        this.r = ns.a(this.r, 0.0f, 1.0f);
        int q = this.x.q();
        if (q <= 0) {
            if (this.x.p()) {
                this.x.g(this.s.nextInt(12000) + 12000);
            }
            else {
                this.x.g(this.s.nextInt(168000) + 12000);
            }
        }
        else {
            --q;
            this.x.g(q);
            if (q <= 0) {
                this.x.b(!this.x.p());
            }
        }
        this.o = this.p;
        if (this.x.p()) {
            this.p += (float)0.01;
        }
        else {
            this.p -= (float)0.01;
        }
        this.p = ns.a(this.p, 0.0f, 1.0f);
    }
    
    protected void D() {
        this.E.clear();
        this.B.a("buildList");
        for (int i = 0; i < this.j.size(); ++i) {
            final wn wn = this.j.get(i);
            final int c = ns.c(wn.s / 16.0);
            final int c2 = ns.c(wn.u / 16.0);
            for (int q = this.q(), j = -q; j <= q; ++j) {
                for (int k = -q; k <= q; ++k) {
                    this.E.add(new adg(j + c, k + c2));
                }
            }
        }
        this.B.b();
        if (this.L > 0) {
            --this.L;
        }
        this.B.a("playerCheckLight");
        if (!this.j.isEmpty()) {
            final int i = this.s.nextInt(this.j.size());
            final wn wn = this.j.get(i);
            final int c = ns.c(wn.s) + this.s.nextInt(11) - 5;
            final int c2 = ns.c(wn.t) + this.s.nextInt(11) - 5;
            final int q = ns.c(wn.u) + this.s.nextInt(11) - 5;
            this.x(new cj(c, c2, q));
        }
        this.B.b();
    }
    
    protected abstract int q();
    
    protected void a(final int \u2603, final int \u2603, final amy \u2603) {
        this.B.c("moodSound");
        if (this.L == 0 && !this.D) {
            this.m = this.m * 3 + 1013904223;
            final int n = this.m >> 2;
            int \u26032 = n & 0xF;
            int \u26033 = n >> 8 & 0xF;
            final int \u26034 = n >> 16 & 0xFF;
            final cj \u26035 = new cj(\u26032, \u26034, \u26033);
            final afh a = \u2603.a(\u26035);
            \u26032 += \u2603;
            \u26033 += \u2603;
            if (a.t() == arm.a && this.k(\u26035) <= this.s.nextInt(8) && this.b(ads.a, \u26035) <= 0) {
                final wn a2 = this.a(\u26032 + 0.5, \u26034 + 0.5, \u26033 + 0.5, 8.0);
                if (a2 != null && a2.e(\u26032 + 0.5, \u26034 + 0.5, \u26033 + 0.5) > 4.0) {
                    this.a(\u26032 + 0.5, \u26034 + 0.5, \u26033 + 0.5, "ambient.cave.cave", 0.7f, 0.8f + this.s.nextFloat() * 0.2f);
                    this.L = this.s.nextInt(12000) + 6000;
                }
            }
        }
        this.B.c("checkLight");
        \u2603.m();
    }
    
    protected void h() {
        this.D();
    }
    
    public void a(final afh \u2603, final cj \u2603, final Random \u2603) {
        this.e = true;
        \u2603.b(this, \u2603, this.p(\u2603), \u2603);
        this.e = false;
    }
    
    public boolean v(final cj \u2603) {
        return this.e(\u2603, false);
    }
    
    public boolean w(final cj \u2603) {
        return this.e(\u2603, true);
    }
    
    public boolean e(final cj \u2603, final boolean \u2603) {
        final ady b = this.b(\u2603);
        final float a = b.a(\u2603);
        if (a > 0.15f) {
            return false;
        }
        if (\u2603.o() >= 0 && \u2603.o() < 256 && this.b(ads.b, \u2603) < 10) {
            final alz p = this.p(\u2603);
            final afh c = p.c();
            if ((c == afi.j || c == afi.i) && p.b((amo<Integer>)ahv.b) == 0) {
                if (!\u2603) {
                    return true;
                }
                final boolean b2 = this.F(\u2603.e()) && this.F(\u2603.f()) && this.F(\u2603.c()) && this.F(\u2603.d());
                if (!b2) {
                    return true;
                }
            }
        }
        return false;
    }
    
    private boolean F(final cj \u2603) {
        return this.p(\u2603).c().t() == arm.h;
    }
    
    public boolean f(final cj \u2603, final boolean \u2603) {
        final ady b = this.b(\u2603);
        final float a = b.a(\u2603);
        if (a > 0.15f) {
            return false;
        }
        if (!\u2603) {
            return true;
        }
        if (\u2603.o() >= 0 && \u2603.o() < 256 && this.b(ads.b, \u2603) < 10) {
            final afh c = this.p(\u2603).c();
            if (c.t() == arm.a && afi.aH.d(this, \u2603)) {
                return true;
            }
        }
        return false;
    }
    
    public boolean x(final cj \u2603) {
        boolean b = false;
        if (!this.t.o()) {
            b |= this.c(ads.a, \u2603);
        }
        b |= this.c(ads.b, \u2603);
        return b;
    }
    
    private int a(final cj \u2603, final ads \u2603) {
        if (\u2603 == ads.a && this.i(\u2603)) {
            return 15;
        }
        final afh c = this.p(\u2603).c();
        int n = (\u2603 == ads.a) ? 0 : c.r();
        int p = c.p();
        if (p >= 15 && c.r() > 0) {
            p = 1;
        }
        if (p < 1) {
            p = 1;
        }
        if (p >= 15) {
            return 0;
        }
        if (n >= 14) {
            return n;
        }
        for (final cq \u26032 : cq.values()) {
            final cj a = \u2603.a(\u26032);
            final int n2 = this.b(\u2603, a) - p;
            if (n2 > n) {
                n = n2;
            }
            if (n >= 14) {
                return n;
            }
        }
        return n;
    }
    
    public boolean c(final ads \u2603, final cj \u2603) {
        if (!this.a(\u2603, 17, false)) {
            return false;
        }
        int i = 0;
        int n = 0;
        this.B.a("getBrightness");
        final int b = this.b(\u2603, \u2603);
        final int a = this.a(\u2603, \u2603);
        final int n2 = \u2603.n();
        final int o = \u2603.o();
        final int p = \u2603.p();
        if (a > b) {
            this.H[n++] = 133152;
        }
        else if (a < b) {
            this.H[n++] = (0x20820 | b << 18);
            while (i < n) {
                final int n3 = this.H[i++];
                final int n4 = (n3 & 0x3F) - 32 + n2;
                final int n5 = (n3 >> 6 & 0x3F) - 32 + o;
                final int n6 = (n3 >> 12 & 0x3F) - 32 + p;
                final int n7 = n3 >> 18 & 0xF;
                final cj cj = new cj(n4, n5, n6);
                int \u26032 = this.b(\u2603, cj);
                if (\u26032 == n7) {
                    this.a(\u2603, cj, 0);
                    if (n7 <= 0) {
                        continue;
                    }
                    final int n8 = ns.a(n4 - n2);
                    final int n9 = ns.a(n5 - o);
                    final int n10 = ns.a(n6 - p);
                    if (n8 + n9 + n10 >= 17) {
                        continue;
                    }
                    final cj.a a2 = new cj.a();
                    for (final cq cq : cq.values()) {
                        final int \u26033 = n4 + cq.g();
                        final int \u26034 = n5 + cq.h();
                        final int \u26035 = n6 + cq.i();
                        a2.c(\u26033, \u26034, \u26035);
                        final int max = Math.max(1, this.p(a2).c().p());
                        \u26032 = this.b(\u2603, a2);
                        if (\u26032 == n7 - max && n < this.H.length) {
                            this.H[n++] = (\u26033 - n2 + 32 | \u26034 - o + 32 << 6 | \u26035 - p + 32 << 12 | n7 - max << 18);
                        }
                    }
                }
            }
            i = 0;
        }
        this.B.b();
        this.B.a("checkedPosition < toCheckCount");
        while (i < n) {
            final int n3 = this.H[i++];
            final int n4 = (n3 & 0x3F) - 32 + n2;
            final int n5 = (n3 >> 6 & 0x3F) - 32 + o;
            final int n6 = (n3 >> 12 & 0x3F) - 32 + p;
            final cj \u26036 = new cj(n4, n5, n6);
            final int b2 = this.b(\u2603, \u26036);
            final int \u26032 = this.a(\u26036, \u2603);
            if (\u26032 != b2) {
                this.a(\u2603, \u26036, \u26032);
                if (\u26032 <= b2) {
                    continue;
                }
                final int n8 = Math.abs(n4 - n2);
                final int n9 = Math.abs(n5 - o);
                final int n10 = Math.abs(n6 - p);
                final boolean b3 = n < this.H.length - 6;
                if (n8 + n9 + n10 >= 17 || !b3) {
                    continue;
                }
                if (this.b(\u2603, \u26036.e()) < \u26032) {
                    this.H[n++] = n4 - 1 - n2 + 32 + (n5 - o + 32 << 6) + (n6 - p + 32 << 12);
                }
                if (this.b(\u2603, \u26036.f()) < \u26032) {
                    this.H[n++] = n4 + 1 - n2 + 32 + (n5 - o + 32 << 6) + (n6 - p + 32 << 12);
                }
                if (this.b(\u2603, \u26036.b()) < \u26032) {
                    this.H[n++] = n4 - n2 + 32 + (n5 - 1 - o + 32 << 6) + (n6 - p + 32 << 12);
                }
                if (this.b(\u2603, \u26036.a()) < \u26032) {
                    this.H[n++] = n4 - n2 + 32 + (n5 + 1 - o + 32 << 6) + (n6 - p + 32 << 12);
                }
                if (this.b(\u2603, \u26036.c()) < \u26032) {
                    this.H[n++] = n4 - n2 + 32 + (n5 - o + 32 << 6) + (n6 - 1 - p + 32 << 12);
                }
                if (this.b(\u2603, \u26036.d()) >= \u26032) {
                    continue;
                }
                this.H[n++] = n4 - n2 + 32 + (n5 - o + 32 << 6) + (n6 + 1 - p + 32 << 12);
            }
        }
        this.B.b();
        return true;
    }
    
    public boolean a(final boolean \u2603) {
        return false;
    }
    
    public List<adw> a(final amy \u2603, final boolean \u2603) {
        return null;
    }
    
    public List<adw> a(final aqe \u2603, final boolean \u2603) {
        return null;
    }
    
    public List<pk> b(final pk \u2603, final aug \u2603) {
        return this.a(\u2603, \u2603, po.d);
    }
    
    public List<pk> a(final pk \u2603, final aug \u2603, final Predicate<? super pk> \u2603) {
        final List<pk> arrayList = (List<pk>)Lists.newArrayList();
        final int c = ns.c((\u2603.a - 2.0) / 16.0);
        final int c2 = ns.c((\u2603.d + 2.0) / 16.0);
        final int c3 = ns.c((\u2603.c - 2.0) / 16.0);
        final int c4 = ns.c((\u2603.f + 2.0) / 16.0);
        for (int i = c; i <= c2; ++i) {
            for (int j = c3; j <= c4; ++j) {
                if (this.a(i, j, true)) {
                    this.a(i, j).a(\u2603, \u2603, arrayList, \u2603);
                }
            }
        }
        return arrayList;
    }
    
    public <T extends pk> List<T> a(final Class<? extends T> \u2603, final Predicate<? super T> \u2603) {
        final List<T> arrayList = (List<T>)Lists.newArrayList();
        for (final pk pk : this.f) {
            if (\u2603.isAssignableFrom(pk.getClass()) && \u2603.apply((Object)pk)) {
                arrayList.add((T)pk);
            }
        }
        return arrayList;
    }
    
    public <T extends pk> List<T> b(final Class<? extends T> \u2603, final Predicate<? super T> \u2603) {
        final List<T> arrayList = (List<T>)Lists.newArrayList();
        for (final pk pk : this.j) {
            if (\u2603.isAssignableFrom(pk.getClass()) && \u2603.apply((Object)pk)) {
                arrayList.add((T)pk);
            }
        }
        return arrayList;
    }
    
    public <T extends pk> List<T> a(final Class<? extends T> \u2603, final aug \u2603) {
        return this.a(\u2603, \u2603, (Predicate<? super T>)po.d);
    }
    
    public <T extends pk> List<T> a(final Class<? extends T> \u2603, final aug \u2603, final Predicate<? super T> \u2603) {
        final int c = ns.c((\u2603.a - 2.0) / 16.0);
        final int c2 = ns.c((\u2603.d + 2.0) / 16.0);
        final int c3 = ns.c((\u2603.c - 2.0) / 16.0);
        final int c4 = ns.c((\u2603.f + 2.0) / 16.0);
        final List<T> arrayList = (List<T>)Lists.newArrayList();
        for (int i = c; i <= c2; ++i) {
            for (int j = c3; j <= c4; ++j) {
                if (this.a(i, j, true)) {
                    this.a(i, j).a(\u2603, \u2603, arrayList, \u2603);
                }
            }
        }
        return arrayList;
    }
    
    public <T extends pk> T a(final Class<? extends T> \u2603, final aug \u2603, final T \u2603) {
        final List<T> a = this.a(\u2603, \u2603);
        T t = null;
        double n = Double.MAX_VALUE;
        for (int i = 0; i < a.size(); ++i) {
            final T \u26032 = a.get(i);
            if (\u26032 != \u2603) {
                if (po.d.apply(\u26032)) {
                    final double h = \u2603.h(\u26032);
                    if (h <= n) {
                        t = \u26032;
                        n = h;
                    }
                }
            }
        }
        return t;
    }
    
    public pk a(final int \u2603) {
        return this.l.a(\u2603);
    }
    
    public List<pk> E() {
        return this.f;
    }
    
    public void b(final cj \u2603, final akw \u2603) {
        if (this.e(\u2603)) {
            this.f(\u2603).e();
        }
    }
    
    public int a(final Class<?> \u2603) {
        int n = 0;
        for (final pk pk : this.f) {
            if (pk instanceof ps && ((ps)pk).bZ()) {
                continue;
            }
            if (!\u2603.isAssignableFrom(pk.getClass())) {
                continue;
            }
            ++n;
        }
        return n;
    }
    
    public void b(final Collection<pk> \u2603) {
        this.f.addAll(\u2603);
        for (final pk \u26032 : \u2603) {
            this.a(\u26032);
        }
    }
    
    public void c(final Collection<pk> \u2603) {
        this.g.addAll(\u2603);
    }
    
    public boolean a(final afh \u2603, final cj \u2603, final boolean \u2603, final cq \u2603, final pk \u2603, final zx \u2603) {
        final afh c = this.p(\u2603).c();
        final aug \u26032 = \u2603 ? null : \u2603.a(this, \u2603, \u2603.Q());
        return (\u26032 == null || this.a(\u26032, \u2603)) && ((c.t() == arm.q && \u2603 == afi.cf) || (c.t().j() && \u2603.a(this, \u2603, \u2603, \u2603)));
    }
    
    public int F() {
        return this.a;
    }
    
    public void b(final int \u2603) {
        this.a = \u2603;
    }
    
    @Override
    public int a(final cj \u2603, final cq \u2603) {
        final alz p = this.p(\u2603);
        return p.c().b(this, \u2603, p, \u2603);
    }
    
    @Override
    public adr G() {
        return this.x.u();
    }
    
    public int y(final cj \u2603) {
        int n = 0;
        n = Math.max(n, this.a(\u2603.b(), cq.a));
        if (n >= 15) {
            return n;
        }
        n = Math.max(n, this.a(\u2603.a(), cq.b));
        if (n >= 15) {
            return n;
        }
        n = Math.max(n, this.a(\u2603.c(), cq.c));
        if (n >= 15) {
            return n;
        }
        n = Math.max(n, this.a(\u2603.d(), cq.d));
        if (n >= 15) {
            return n;
        }
        n = Math.max(n, this.a(\u2603.e(), cq.e));
        if (n >= 15) {
            return n;
        }
        n = Math.max(n, this.a(\u2603.f(), cq.f));
        if (n >= 15) {
            return n;
        }
        return n;
    }
    
    public boolean b(final cj \u2603, final cq \u2603) {
        return this.c(\u2603, \u2603) > 0;
    }
    
    public int c(final cj \u2603, final cq \u2603) {
        final alz p = this.p(\u2603);
        final afh c = p.c();
        if (c.v()) {
            return this.y(\u2603);
        }
        return c.a(this, \u2603, p, \u2603);
    }
    
    public boolean z(final cj \u2603) {
        return this.c(\u2603.b(), cq.a) > 0 || this.c(\u2603.a(), cq.b) > 0 || this.c(\u2603.c(), cq.c) > 0 || this.c(\u2603.d(), cq.d) > 0 || this.c(\u2603.e(), cq.e) > 0 || this.c(\u2603.f(), cq.f) > 0;
    }
    
    public int A(final cj \u2603) {
        int n = 0;
        for (final cq cq : cq.values()) {
            final int c = this.c(\u2603.a(cq), cq);
            if (c >= 15) {
                return 15;
            }
            if (c > n) {
                n = c;
            }
        }
        return n;
    }
    
    public wn a(final pk \u2603, final double \u2603) {
        return this.a(\u2603.s, \u2603.t, \u2603.u, \u2603);
    }
    
    public wn a(final double \u2603, final double \u2603, final double \u2603, final double \u2603) {
        double n = -1.0;
        wn wn = null;
        for (int i = 0; i < this.j.size(); ++i) {
            final wn wn2 = this.j.get(i);
            if (po.d.apply(wn2)) {
                final double e = wn2.e(\u2603, \u2603, \u2603);
                if ((\u2603 < 0.0 || e < \u2603 * \u2603) && (n == -1.0 || e < n)) {
                    n = e;
                    wn = wn2;
                }
            }
        }
        return wn;
    }
    
    public boolean b(final double \u2603, final double \u2603, final double \u2603, final double \u2603) {
        for (int i = 0; i < this.j.size(); ++i) {
            final wn wn = this.j.get(i);
            if (po.d.apply(wn)) {
                final double e = wn.e(\u2603, \u2603, \u2603);
                if (\u2603 < 0.0 || e < \u2603 * \u2603) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public wn a(final String \u2603) {
        for (int i = 0; i < this.j.size(); ++i) {
            final wn wn = this.j.get(i);
            if (\u2603.equals(wn.e_())) {
                return wn;
            }
        }
        return null;
    }
    
    public wn b(final UUID \u2603) {
        for (int i = 0; i < this.j.size(); ++i) {
            final wn wn = this.j.get(i);
            if (\u2603.equals(wn.aK())) {
                return wn;
            }
        }
        return null;
    }
    
    public void H() {
    }
    
    public void I() throws adn {
        this.w.c();
    }
    
    public void a(final long \u2603) {
        this.x.b(\u2603);
    }
    
    public long J() {
        return this.x.b();
    }
    
    public long K() {
        return this.x.f();
    }
    
    public long L() {
        return this.x.g();
    }
    
    public void b(final long \u2603) {
        this.x.c(\u2603);
    }
    
    public cj M() {
        cj m = new cj(this.x.c(), this.x.d(), this.x.e());
        if (!this.af().a(m)) {
            m = this.m(new cj(this.af().f(), 0.0, this.af().g()));
        }
        return m;
    }
    
    public void B(final cj \u2603) {
        this.x.a(\u2603);
    }
    
    public void h(final pk \u2603) {
        final int c = ns.c(\u2603.s / 16.0);
        final int c2 = ns.c(\u2603.u / 16.0);
        for (int n = 2, i = c - n; i <= c + n; ++i) {
            for (int j = c2 - n; j <= c2 + n; ++j) {
                this.a(i, j);
            }
        }
        if (!this.f.contains(\u2603)) {
            this.f.add(\u2603);
        }
    }
    
    public boolean a(final wn \u2603, final cj \u2603) {
        return true;
    }
    
    public void a(final pk \u2603, final byte \u2603) {
    }
    
    public amv N() {
        return this.v;
    }
    
    public void c(final cj \u2603, final afh \u2603, final int \u2603, final int \u2603) {
        \u2603.a(this, \u2603, this.p(\u2603), \u2603, \u2603);
    }
    
    public atp O() {
        return this.w;
    }
    
    public ato P() {
        return this.x;
    }
    
    public adk Q() {
        return this.x.x();
    }
    
    public void d() {
    }
    
    public float h(final float \u2603) {
        return (this.q + (this.r - this.q) * \u2603) * this.j(\u2603);
    }
    
    public void i(final float \u2603) {
        this.q = \u2603;
        this.r = \u2603;
    }
    
    public float j(final float \u2603) {
        return this.o + (this.p - this.o) * \u2603;
    }
    
    public void k(final float \u2603) {
        this.o = \u2603;
        this.p = \u2603;
    }
    
    public boolean R() {
        return this.h(1.0f) > 0.9;
    }
    
    public boolean S() {
        return this.j(1.0f) > 0.2;
    }
    
    public boolean C(final cj \u2603) {
        if (!this.S()) {
            return false;
        }
        if (!this.i(\u2603)) {
            return false;
        }
        if (this.q(\u2603).o() > \u2603.o()) {
            return false;
        }
        final ady b = this.b(\u2603);
        return !b.d() && !this.f(\u2603, false) && b.e();
    }
    
    public boolean D(final cj \u2603) {
        final ady b = this.b(\u2603);
        return b.f();
    }
    
    public aua T() {
        return this.z;
    }
    
    public void a(final String \u2603, final ate \u2603) {
        this.z.a(\u2603, \u2603);
    }
    
    public ate a(final Class<? extends ate> \u2603, final String \u2603) {
        return this.z.a(\u2603, \u2603);
    }
    
    public int b(final String \u2603) {
        return this.z.a(\u2603);
    }
    
    public void a(final int \u2603, final cj \u2603, final int \u2603) {
        for (int i = 0; i < this.u.size(); ++i) {
            this.u.get(i).a(\u2603, \u2603, \u2603);
        }
    }
    
    public void b(final int \u2603, final cj \u2603, final int \u2603) {
        this.a(null, \u2603, \u2603, \u2603);
    }
    
    public void a(final wn \u2603, final int \u2603, final cj \u2603, final int \u2603) {
        try {
            for (int i = 0; i < this.u.size(); ++i) {
                this.u.get(i).a(\u2603, \u2603, \u2603, \u2603);
            }
        }
        catch (Throwable \u26032) {
            final b a = b.a(\u26032, "Playing level event");
            final c a2 = a.a("Level event being played");
            a2.a("Block coordinates", c.a(\u2603));
            a2.a("Event source", \u2603);
            a2.a("Event type", \u2603);
            a2.a("Event data", \u2603);
            throw new e(a);
        }
    }
    
    public int U() {
        return 256;
    }
    
    public int V() {
        return this.t.o() ? 128 : 256;
    }
    
    public Random a(final int \u2603, final int \u2603, final int \u2603) {
        final long seed = \u2603 * 341873128712L + \u2603 * 132897987541L + this.P().b() + \u2603;
        this.s.setSeed(seed);
        return this.s;
    }
    
    public cj a(final String \u2603, final cj \u2603) {
        return this.N().a(this, \u2603, \u2603);
    }
    
    @Override
    public boolean W() {
        return false;
    }
    
    public double X() {
        if (this.x.u() == adr.c) {
            return 0.0;
        }
        return 63.0;
    }
    
    public c a(final b \u2603) {
        final c a = \u2603.a("Affected level", 1);
        a.a("Level name", (this.x == null) ? "????" : this.x.k());
        a.a("All players", new Callable<String>() {
            public String a() {
                return adm.this.j.size() + " total; " + adm.this.j.toString();
            }
        });
        a.a("Chunk stats", new Callable<String>() {
            public String a() {
                return adm.this.v.f();
            }
        });
        try {
            this.x.a(a);
        }
        catch (Throwable \u26032) {
            a.a("Level Data Unobtainable", \u26032);
        }
        return a;
    }
    
    public void c(final int \u2603, final cj \u2603, final int \u2603) {
        for (int i = 0; i < this.u.size(); ++i) {
            final ado ado = this.u.get(i);
            ado.b(\u2603, \u2603, \u2603);
        }
    }
    
    public Calendar Y() {
        if (this.K() % 600L == 0L) {
            this.K.setTimeInMillis(MinecraftServer.az());
        }
        return this.K;
    }
    
    public void a(final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final dn \u2603) {
    }
    
    public auo Z() {
        return this.C;
    }
    
    public void e(final cj \u2603, final afh \u2603) {
        for (final cq cq : cq.c.a) {
            cj \u26032 = \u2603.a(cq);
            if (this.e(\u26032)) {
                alz alz = this.p(\u26032);
                if (afi.cj.e(alz.c())) {
                    alz.c().a(this, \u26032, alz, \u2603);
                }
                else {
                    if (!alz.c().v()) {
                        continue;
                    }
                    \u26032 = \u26032.a(cq);
                    alz = this.p(\u26032);
                    if (!afi.cj.e(alz.c())) {
                        continue;
                    }
                    alz.c().a(this, \u26032, alz, \u2603);
                }
            }
        }
    }
    
    public ok E(final cj \u2603) {
        long w = 0L;
        float y = 0.0f;
        if (this.e(\u2603)) {
            y = this.y();
            w = this.f(\u2603).w();
        }
        return new ok(this.aa(), this.L(), w, y);
    }
    
    public oj aa() {
        return this.P().y();
    }
    
    public int ab() {
        return this.I;
    }
    
    public void c(final int \u2603) {
        this.I = \u2603;
    }
    
    public int ac() {
        return this.J;
    }
    
    public void d(final int \u2603) {
        this.J = \u2603;
    }
    
    public boolean ad() {
        return this.y;
    }
    
    public th ae() {
        return this.A;
    }
    
    public ams af() {
        return this.N;
    }
    
    public boolean c(final int \u2603, final int \u2603) {
        final cj m = this.M();
        final int n = \u2603 * 16 + 8 - m.n();
        final int n2 = \u2603 * 16 + 8 - m.p();
        final int n3 = 128;
        return n >= -n3 && n <= n3 && n2 >= -n3 && n2 <= n3;
    }
}
