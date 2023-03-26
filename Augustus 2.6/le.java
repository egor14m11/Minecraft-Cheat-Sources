import java.util.ArrayList;
import org.apache.logging.log4j.LogManager;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Random;
import com.google.common.base.Predicate;
import java.util.Iterator;
import java.util.Collection;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.List;
import java.util.UUID;
import java.util.Map;
import java.util.TreeSet;
import java.util.Set;
import net.minecraft.server.MinecraftServer;
import org.apache.logging.log4j.Logger;

// 
// Decompiled by Procyon v0.5.36
// 

public class le extends adm implements od
{
    private static final Logger a;
    private final MinecraftServer I;
    private final la J;
    private final lc K;
    private final Set<adw> L;
    private final TreeSet<adw> M;
    private final Map<UUID, pk> N;
    public ld b;
    public boolean c;
    private boolean O;
    private int P;
    private final adu Q;
    private final adt R;
    protected final tg d;
    private a[] S;
    private int T;
    private static final List<ob> U;
    private List<adw> V;
    
    public le(final MinecraftServer \u2603, final atp \u2603, final ato \u2603, final int \u2603, final nt \u2603) {
        super(\u2603, \u2603, anm.a(\u2603), \u2603, false);
        this.L = (Set<adw>)Sets.newHashSet();
        this.M = new TreeSet<adw>();
        this.N = (Map<UUID, pk>)Maps.newHashMap();
        this.R = new adt();
        this.d = new tg(this);
        this.S = new a[] { new a(), new a() };
        this.V = (List<adw>)Lists.newArrayList();
        this.I = \u2603;
        this.J = new la(this);
        this.K = new lc(this);
        this.t.a(this);
        this.v = this.k();
        this.Q = new adu(this);
        this.B();
        this.C();
        this.af().a(\u2603.aI());
    }
    
    @Override
    public adm b() {
        this.z = new aua(this.w);
        final String a = th.a(this.t);
        final th a2 = (th)this.z.a(th.class, a);
        if (a2 == null) {
            this.A = new th(this);
            this.z.a(a, this.A);
        }
        else {
            (this.A = a2).a(this);
        }
        this.C = new kk(this.I);
        aup aup = (aup)this.z.a(aup.class, "scoreboard");
        if (aup == null) {
            aup = new aup();
            this.z.a("scoreboard", aup);
        }
        aup.a(this.C);
        ((kk)this.C).a(aup);
        this.af().c(this.x.C(), this.x.D());
        this.af().c(this.x.I());
        this.af().b(this.x.H());
        this.af().c(this.x.J());
        this.af().b(this.x.K());
        if (this.x.F() > 0L) {
            this.af().a(this.x.E(), this.x.G(), this.x.F());
        }
        else {
            this.af().a(this.x.E());
        }
        return this;
    }
    
    @Override
    public void c() {
        super.c();
        if (this.P().t() && this.aa() != oj.d) {
            this.P().a(oj.d);
        }
        this.t.m().b();
        if (this.f()) {
            if (this.Q().b("doDaylightCycle")) {
                final long n = this.x.g() + 24000L;
                this.x.c(n - n % 24000L);
            }
            this.e();
        }
        this.B.a("mobSpawner");
        if (this.Q().b("doMobSpawning") && this.x.u() != adr.g) {
            this.R.a(this, this.F, this.G, this.x.f() % 400L == 0L);
        }
        this.B.c("chunkSource");
        this.v.d();
        final int a = this.a(1.0f);
        if (a != this.ab()) {
            this.c(a);
        }
        this.x.b(this.x.f() + 1L);
        if (this.Q().b("doDaylightCycle")) {
            this.x.c(this.x.g() + 1L);
        }
        this.B.c("tickPending");
        this.a(false);
        this.B.c("tickBlocks");
        this.h();
        this.B.c("chunkMap");
        this.K.b();
        this.B.c("village");
        this.A.a();
        this.d.a();
        this.B.c("portalForcer");
        this.Q.a(this.K());
        this.B.b();
        this.ak();
    }
    
    public ady.c a(final pt \u2603, final cj \u2603) {
        final List<ady.c> a = this.N().a(\u2603, \u2603);
        if (a == null || a.isEmpty()) {
            return null;
        }
        return oa.a(this.s, a);
    }
    
    public boolean a(final pt \u2603, final ady.c \u2603, final cj \u2603) {
        final List<ady.c> a = this.N().a(\u2603, \u2603);
        return a != null && !a.isEmpty() && a.contains(\u2603);
    }
    
    @Override
    public void d() {
        this.O = false;
        if (!this.j.isEmpty()) {
            int n = 0;
            int n2 = 0;
            for (final wn wn : this.j) {
                if (wn.v()) {
                    ++n;
                }
                else {
                    if (!wn.bJ()) {
                        continue;
                    }
                    ++n2;
                }
            }
            this.O = (n2 > 0 && n2 >= this.j.size() - n);
        }
    }
    
    protected void e() {
        this.O = false;
        for (final wn wn : this.j) {
            if (wn.bJ()) {
                wn.a(false, false, true);
            }
        }
        this.ag();
    }
    
    private void ag() {
        this.x.g(0);
        this.x.b(false);
        this.x.f(0);
        this.x.a(false);
    }
    
    public boolean f() {
        if (this.O && !this.D) {
            for (final wn wn : this.j) {
                if (wn.v() || !wn.cf()) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    
    @Override
    public void g() {
        if (this.x.d() <= 0) {
            this.x.b(this.F() + 1);
        }
        int c = this.x.c();
        int e = this.x.e();
        int n = 0;
        while (this.c(new cj(c, 0, e)).t() == arm.a) {
            c += this.s.nextInt(8) - this.s.nextInt(8);
            e += this.s.nextInt(8) - this.s.nextInt(8);
            if (++n == 10000) {
                break;
            }
        }
        this.x.a(c);
        this.x.c(e);
    }
    
    @Override
    protected void h() {
        super.h();
        if (this.x.u() == adr.g) {
            for (final adg adg : this.E) {
                this.a(adg.a, adg.b).b(false);
            }
            return;
        }
        int n = 0;
        int n2 = 0;
        for (final adg adg2 : this.E) {
            final int \u2603 = adg2.a * 16;
            final int \u26032 = adg2.b * 16;
            this.B.a("getChunk");
            final amy a = this.a(adg2.a, adg2.b);
            this.a(\u2603, \u26032, a);
            this.B.c("tickChunk");
            a.b(false);
            this.B.c("thunder");
            if (this.s.nextInt(100000) == 0 && this.S() && this.R()) {
                this.m = this.m * 3 + 1013904223;
                final int c = this.m >> 2;
                final cj \u26033 = this.a(new cj(\u2603 + (c & 0xF), 0, \u26032 + (c >> 8 & 0xF)));
                if (this.C(\u26033)) {
                    this.c(new uv(this, \u26033.n(), \u26033.o(), \u26033.p()));
                }
            }
            this.B.c("iceandsnow");
            if (this.s.nextInt(16) == 0) {
                this.m = this.m * 3 + 1013904223;
                final int c = this.m >> 2;
                final cj \u26033 = this.q(new cj(\u2603 + (c & 0xF), 0, \u26032 + (c >> 8 & 0xF)));
                final cj b = \u26033.b();
                if (this.w(b)) {
                    this.a(b, afi.aI.Q());
                }
                if (this.S() && this.f(\u26033, true)) {
                    this.a(\u26033, afi.aH.Q());
                }
                if (this.S() && this.b(b).e()) {
                    this.p(b).c().k(this, b);
                }
            }
            this.B.c("tickBlocks");
            final int c = this.Q().c("randomTickSpeed");
            if (c > 0) {
                for (final amz amz : a.h()) {
                    if (amz != null && amz.b()) {
                        for (int j = 0; j < c; ++j) {
                            this.m = this.m * 3 + 1013904223;
                            final int n3 = this.m >> 2;
                            final int \u26034 = n3 & 0xF;
                            final int \u26035 = n3 >> 8 & 0xF;
                            final int \u26036 = n3 >> 16 & 0xF;
                            ++n2;
                            final alz a2 = amz.a(\u26034, \u26036, \u26035);
                            final afh c2 = a2.c();
                            if (c2.y()) {
                                ++n;
                                c2.a(this, new cj(\u26034 + \u2603, \u26036 + amz.d(), \u26035 + \u26032), a2, this.s);
                            }
                        }
                    }
                }
            }
            this.B.b();
        }
    }
    
    protected cj a(final cj \u2603) {
        final cj q = this.q(\u2603);
        final aug b = new aug(q, new cj(q.n(), this.U(), q.p())).b(3.0, 3.0, 3.0);
        final List<pr> a = this.a((Class<? extends pr>)pr.class, b, (Predicate<? super pr>)new Predicate<pr>() {
            public boolean a(final pr \u2603) {
                return \u2603 != null && \u2603.ai() && le.this.i(\u2603.c());
            }
        });
        if (!a.isEmpty()) {
            return a.get(this.s.nextInt(a.size())).c();
        }
        return q;
    }
    
    @Override
    public boolean a(final cj \u2603, final afh \u2603) {
        final adw adw = new adw(\u2603, \u2603);
        return this.V.contains(adw);
    }
    
    @Override
    public void a(final cj \u2603, final afh \u2603, final int \u2603) {
        this.a(\u2603, \u2603, \u2603, 0);
    }
    
    @Override
    public void a(final cj \u2603, final afh \u2603, int \u2603, final int \u2603) {
        final adw e = new adw(\u2603, \u2603);
        int n = 0;
        if (this.e && \u2603.t() != arm.a) {
            if (\u2603.N()) {
                n = 8;
                if (this.a(e.a.a(-n, -n, -n), e.a.a(n, n, n))) {
                    final alz p = this.p(e.a);
                    if (p.c().t() != arm.a && p.c() == e.a()) {
                        p.c().b(this, e.a, p, this.s);
                    }
                }
                return;
            }
            \u2603 = 1;
        }
        if (this.a(\u2603.a(-n, -n, -n), \u2603.a(n, n, n))) {
            if (\u2603.t() != arm.a) {
                e.a(\u2603 + this.x.f());
                e.a(\u2603);
            }
            if (!this.L.contains(e)) {
                this.L.add(e);
                this.M.add(e);
            }
        }
    }
    
    @Override
    public void b(final cj \u2603, final afh \u2603, final int \u2603, final int \u2603) {
        final adw e = new adw(\u2603, \u2603);
        e.a(\u2603);
        if (\u2603.t() != arm.a) {
            e.a(\u2603 + this.x.f());
        }
        if (!this.L.contains(e)) {
            this.L.add(e);
            this.M.add(e);
        }
    }
    
    @Override
    public void i() {
        if (this.j.isEmpty()) {
            if (this.P++ >= 1200) {
                return;
            }
        }
        else {
            this.j();
        }
        super.i();
    }
    
    public void j() {
        this.P = 0;
    }
    
    @Override
    public boolean a(final boolean \u2603) {
        if (this.x.u() == adr.g) {
            return false;
        }
        int size = this.M.size();
        if (size != this.L.size()) {
            throw new IllegalStateException("TickNextTick list out of synch");
        }
        if (size > 1000) {
            size = 1000;
        }
        this.B.a("cleaning");
        for (int i = 0; i < size; ++i) {
            final adw o = this.M.first();
            if (!\u2603 && o.b > this.x.f()) {
                break;
            }
            this.M.remove(o);
            this.L.remove(o);
            this.V.add(o);
        }
        this.B.b();
        this.B.a("ticking");
        final Iterator<adw> iterator = this.V.iterator();
        while (iterator.hasNext()) {
            final adw o = iterator.next();
            iterator.remove();
            final int n = 0;
            if (this.a(o.a.a(-n, -n, -n), o.a.a(n, n, n))) {
                final alz p = this.p(o.a);
                if (p.c().t() == arm.a || !afh.a(p.c(), o.a())) {
                    continue;
                }
                try {
                    p.c().b(this, o.a, p, this.s);
                }
                catch (Throwable \u26032) {
                    final b a = b.a(\u26032, "Exception while ticking a block");
                    final c a2 = a.a("Block being ticked");
                    c.a(a2, o.a, p);
                    throw new e(a);
                }
            }
            else {
                this.a(o.a, o.a(), 0);
            }
        }
        this.B.b();
        this.V.clear();
        return !this.M.isEmpty();
    }
    
    @Override
    public List<adw> a(final amy \u2603, final boolean \u2603) {
        final adg j = \u2603.j();
        final int \u26032 = (j.a << 4) - 2;
        final int \u26033 = \u26032 + 16 + 2;
        final int \u26034 = (j.b << 4) - 2;
        final int \u26035 = \u26034 + 16 + 2;
        return this.a(new aqe(\u26032, 0, \u26034, \u26033, 256, \u26035), \u2603);
    }
    
    @Override
    public List<adw> a(final aqe \u2603, final boolean \u2603) {
        List<adw> arrayList = null;
        for (int i = 0; i < 2; ++i) {
            Iterator<adw> iterator;
            if (i == 0) {
                iterator = this.M.iterator();
            }
            else {
                iterator = this.V.iterator();
            }
            while (iterator.hasNext()) {
                final adw adw = iterator.next();
                final cj a = adw.a;
                if (a.n() >= \u2603.a && a.n() < \u2603.d && a.p() >= \u2603.c && a.p() < \u2603.f) {
                    if (\u2603) {
                        this.L.remove(adw);
                        iterator.remove();
                    }
                    if (arrayList == null) {
                        arrayList = (List<adw>)Lists.newArrayList();
                    }
                    arrayList.add(adw);
                }
            }
        }
        return arrayList;
    }
    
    @Override
    public void a(final pk \u2603, final boolean \u2603) {
        if (!this.ai() && (\u2603 instanceof tm || \u2603 instanceof tz)) {
            \u2603.J();
        }
        if (!this.ah() && \u2603 instanceof wh) {
            \u2603.J();
        }
        super.a(\u2603, \u2603);
    }
    
    private boolean ah() {
        return this.I.ah();
    }
    
    private boolean ai() {
        return this.I.ag();
    }
    
    @Override
    protected amv k() {
        final and a = this.w.a(this.t);
        return this.b = new ld(this, a, this.t.c());
    }
    
    public List<akw> a(final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603) {
        final List<akw> arrayList = (List<akw>)Lists.newArrayList();
        for (int i = 0; i < this.h.size(); ++i) {
            final akw akw = this.h.get(i);
            final cj v = akw.v();
            if (v.n() >= \u2603 && v.o() >= \u2603 && v.p() >= \u2603 && v.n() < \u2603 && v.o() < \u2603 && v.p() < \u2603) {
                arrayList.add(akw);
            }
        }
        return arrayList;
    }
    
    @Override
    public boolean a(final wn \u2603, final cj \u2603) {
        return !this.I.a((adm)this, \u2603, \u2603) && this.af().a(\u2603);
    }
    
    @Override
    public void a(final adp \u2603) {
        if (!this.x.w()) {
            try {
                this.b(\u2603);
                if (this.x.u() == adr.g) {
                    this.aj();
                }
                super.a(\u2603);
            }
            catch (Throwable \u26032) {
                final b a = b.a(\u26032, "Exception initializing level");
                try {
                    this.a(a);
                }
                catch (Throwable t) {}
                throw new e(a);
            }
            this.x.d(true);
        }
    }
    
    private void aj() {
        this.x.f(false);
        this.x.c(true);
        this.x.b(false);
        this.x.a(false);
        this.x.i(1000000000);
        this.x.c(6000L);
        this.x.a(adp.a.e);
        this.x.g(false);
        this.x.a(oj.a);
        this.x.e(true);
        this.Q().a("doDaylightCycle", "false");
    }
    
    private void b(final adp \u2603) {
        if (!this.t.e()) {
            this.x.a(cj.a.b(this.t.i()));
            return;
        }
        if (this.x.u() == adr.g) {
            this.x.a(cj.a.a());
            return;
        }
        this.y = true;
        final aec m = this.t.m();
        final List<ady> a = m.a();
        final Random \u26032 = new Random(this.J());
        final cj a2 = m.a(0, 0, 256, a, \u26032);
        int n = 0;
        final int i = this.t.i();
        int p = 0;
        if (a2 != null) {
            n = a2.n();
            p = a2.p();
        }
        else {
            le.a.warn("Unable to find spawn biome");
        }
        int n2 = 0;
        while (!this.t.a(n, p)) {
            n += \u26032.nextInt(64) - \u26032.nextInt(64);
            p += \u26032.nextInt(64) - \u26032.nextInt(64);
            if (++n2 == 1000) {
                break;
            }
        }
        this.x.a(new cj(n, i, p));
        this.y = false;
        if (\u2603.c()) {
            this.l();
        }
    }
    
    protected void l() {
        final aol aol = new aol(le.U, 10);
        for (int i = 0; i < 10; ++i) {
            final int \u2603 = this.x.c() + this.s.nextInt(6) - this.s.nextInt(6);
            final int \u26032 = this.x.e() + this.s.nextInt(6) - this.s.nextInt(6);
            final cj a = this.r(new cj(\u2603, 0, \u26032)).a();
            if (aol.b(this, this.s, a)) {
                break;
            }
        }
    }
    
    public cj m() {
        return this.t.h();
    }
    
    public void a(final boolean \u2603, final nu \u2603) throws adn {
        if (!this.v.e()) {
            return;
        }
        if (\u2603 != null) {
            \u2603.a("Saving level");
        }
        this.a();
        if (\u2603 != null) {
            \u2603.c("Saving chunks");
        }
        this.v.a(\u2603, \u2603);
        final List<amy> arrayList = (List<amy>)Lists.newArrayList((Iterable<?>)this.b.a());
        for (final amy amy : arrayList) {
            if (amy == null) {
                continue;
            }
            if (this.K.a(amy.a, amy.b)) {
                continue;
            }
            this.b.b(amy.a, amy.b);
        }
    }
    
    public void n() {
        if (!this.v.e()) {
            return;
        }
        this.v.c();
    }
    
    protected void a() throws adn {
        this.I();
        this.x.a(this.af().h());
        this.x.d(this.af().f());
        this.x.c(this.af().g());
        this.x.e(this.af().m());
        this.x.f(this.af().n());
        this.x.j(this.af().q());
        this.x.k(this.af().p());
        this.x.b(this.af().j());
        this.x.e(this.af().i());
        this.w.a(this.x, this.I.ap().t());
        this.z.a();
    }
    
    @Override
    protected void a(final pk \u2603) {
        super.a(\u2603);
        this.l.a(\u2603.F(), \u2603);
        this.N.put(\u2603.aK(), \u2603);
        final pk[] ab = \u2603.aB();
        if (ab != null) {
            for (int i = 0; i < ab.length; ++i) {
                this.l.a(ab[i].F(), ab[i]);
            }
        }
    }
    
    @Override
    protected void b(final pk \u2603) {
        super.b(\u2603);
        this.l.d(\u2603.F());
        this.N.remove(\u2603.aK());
        final pk[] ab = \u2603.aB();
        if (ab != null) {
            for (int i = 0; i < ab.length; ++i) {
                this.l.d(ab[i].F());
            }
        }
    }
    
    @Override
    public boolean c(final pk \u2603) {
        if (super.c(\u2603)) {
            this.I.ap().a(\u2603.s, \u2603.t, \u2603.u, 512.0, this.t.q(), new fm(\u2603));
            return true;
        }
        return false;
    }
    
    @Override
    public void a(final pk \u2603, final byte \u2603) {
        this.s().b(\u2603, new gi(\u2603, \u2603));
    }
    
    @Override
    public adi a(final pk \u2603, final double \u2603, final double \u2603, final double \u2603, final float \u2603, final boolean \u2603, final boolean \u2603) {
        final adi adi = new adi(this, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        adi.a();
        adi.a(false);
        if (!\u2603) {
            adi.d();
        }
        for (final wn wn : this.j) {
            if (wn.e(\u2603, \u2603, \u2603) < 4096.0) {
                ((lf)wn).a.a(new gk(\u2603, \u2603, \u2603, \u2603, adi.e(), adi.b().get(wn)));
            }
        }
        return adi;
    }
    
    @Override
    public void c(final cj \u2603, final afh \u2603, final int \u2603, final int \u2603) {
        final ade ade = new ade(\u2603, \u2603, \u2603, \u2603);
        for (final ade ade2 : this.S[this.T]) {
            if (ade2.equals(ade)) {
                return;
            }
        }
        this.S[this.T].add(ade);
    }
    
    private void ak() {
        while (!this.S[this.T].isEmpty()) {
            final int t = this.T;
            this.T ^= 0x1;
            for (final ade \u2603 : this.S[t]) {
                if (this.a(\u2603)) {
                    this.I.ap().a(\u2603.a().n(), \u2603.a().o(), \u2603.a().p(), 64.0, this.t.q(), new fu(\u2603.a(), \u2603.d(), \u2603.b(), \u2603.c()));
                }
            }
            this.S[t].clear();
        }
    }
    
    private boolean a(final ade \u2603) {
        final alz p = this.p(\u2603.a());
        return p.c() == \u2603.d() && p.c().a(this, \u2603.a(), p, \u2603.b(), \u2603.c());
    }
    
    public void o() {
        this.w.a();
    }
    
    @Override
    protected void p() {
        final boolean s = this.S();
        super.p();
        if (this.o != this.p) {
            this.I.ap().a(new gm(7, this.p), this.t.q());
        }
        if (this.q != this.r) {
            this.I.ap().a(new gm(8, this.r), this.t.q());
        }
        if (s != this.S()) {
            if (s) {
                this.I.ap().a(new gm(2, 0.0f));
            }
            else {
                this.I.ap().a(new gm(1, 0.0f));
            }
            this.I.ap().a(new gm(7, this.p));
            this.I.ap().a(new gm(8, this.r));
        }
    }
    
    @Override
    protected int q() {
        return this.I.ap().s();
    }
    
    public MinecraftServer r() {
        return this.I;
    }
    
    public la s() {
        return this.J;
    }
    
    public lc t() {
        return this.K;
    }
    
    public adu u() {
        return this.Q;
    }
    
    public void a(final cy \u2603, final double \u2603, final double \u2603, final double \u2603, final int \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final int... \u2603) {
        this.a(\u2603, false, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
    }
    
    public void a(final cy \u2603, final boolean \u2603, final double \u2603, final double \u2603, final double \u2603, final int \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final int... \u2603) {
        final ff \u26032 = new gr(\u2603, \u2603, (float)\u2603, (float)\u2603, (float)\u2603, (float)\u2603, (float)\u2603, (float)\u2603, (float)\u2603, \u2603, \u2603);
        for (int i = 0; i < this.j.size(); ++i) {
            final lf lf = this.j.get(i);
            final cj c = lf.c();
            final double c2 = c.c(\u2603, \u2603, \u2603);
            if (c2 <= 256.0 || (\u2603 && c2 <= 65536.0)) {
                lf.a.a(\u26032);
            }
        }
    }
    
    public pk a(final UUID \u2603) {
        return this.N.get(\u2603);
    }
    
    @Override
    public ListenableFuture<Object> a(final Runnable \u2603) {
        return (ListenableFuture<Object>)this.I.a(\u2603);
    }
    
    @Override
    public boolean aJ() {
        return this.I.aJ();
    }
    
    static {
        a = LogManager.getLogger();
        U = Lists.newArrayList(new ob(zy.y, 0, 1, 3, 10), new ob(zw.a(afi.f), 0, 1, 3, 10), new ob(zw.a(afi.r), 0, 1, 3, 10), new ob(zy.t, 0, 1, 1, 3), new ob(zy.p, 0, 1, 1, 5), new ob(zy.s, 0, 1, 1, 3), new ob(zy.o, 0, 1, 1, 5), new ob(zy.e, 0, 2, 3, 5), new ob(zy.P, 0, 2, 3, 3), new ob(zw.a(afi.s), 0, 1, 3, 10));
    }
    
    static class a extends ArrayList<ade>
    {
        private a() {
        }
    }
}
