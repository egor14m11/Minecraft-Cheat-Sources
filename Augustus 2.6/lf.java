import org.apache.logging.log4j.LogManager;
import io.netty.buffer.Unpooled;
import java.util.Set;
import com.google.common.collect.Sets;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Collection;
import com.google.common.collect.Lists;
import com.mojang.authlib.GameProfile;
import java.util.List;
import net.minecraft.server.MinecraftServer;
import org.apache.logging.log4j.Logger;

// 
// Decompiled by Procyon v0.5.36
// 

public class lf extends wn implements xn
{
    private static final Logger bH;
    private String bI;
    public lm a;
    public final MinecraftServer b;
    public final lg c;
    public double d;
    public double e;
    public final List<adg> f;
    private final List<Integer> bJ;
    private final mv bK;
    private float bL;
    private float bM;
    private int bN;
    private boolean bO;
    private int bP;
    private int bQ;
    private b bR;
    private boolean bS;
    private long bT;
    private pk bU;
    private int bV;
    public boolean g;
    public int h;
    public boolean i;
    
    public lf(final MinecraftServer \u2603, final le \u2603, final GameProfile \u2603, final lg \u2603) {
        super(\u2603, \u2603);
        this.bI = "en_US";
        this.f = (List<adg>)Lists.newLinkedList();
        this.bJ = (List<Integer>)Lists.newLinkedList();
        this.bL = Float.MIN_VALUE;
        this.bM = -1.0E8f;
        this.bN = -99999999;
        this.bO = true;
        this.bP = -99999999;
        this.bQ = 60;
        this.bS = true;
        this.bT = System.currentTimeMillis();
        this.bU = null;
        \u2603.b = this;
        this.c = \u2603;
        cj \u26032 = \u2603.M();
        if (!\u2603.t.o() && \u2603.P().r() != adp.a.d) {
            int max = Math.max(5, \u2603.aw() - 6);
            final int c = ns.c(\u2603.af().b(\u26032.n(), \u26032.p()));
            if (c < max) {
                max = c;
            }
            if (c <= 1) {
                max = 1;
            }
            \u26032 = \u2603.r(\u26032.a(this.V.nextInt(max * 2) - max, 0, this.V.nextInt(max * 2) - max));
        }
        this.b = \u2603;
        this.bK = \u2603.ap().a((wn)this);
        this.a(\u26032, this.S = 0.0f, 0.0f);
        while (!\u2603.a(this, this.aR()).isEmpty() && this.t < 255.0) {
            this.b(this.s, this.t + 1.0, this.u);
        }
    }
    
    @Override
    public void a(final dn \u2603) {
        super.a(\u2603);
        if (\u2603.b("playerGameType", 99)) {
            if (MinecraftServer.N().ax()) {
                this.c.a(MinecraftServer.N().m());
            }
            else {
                this.c.a(adp.a.a(\u2603.f("playerGameType")));
            }
        }
    }
    
    @Override
    public void b(final dn \u2603) {
        super.b(\u2603);
        \u2603.a("playerGameType", this.c.b().a());
    }
    
    @Override
    public void a(final int \u2603) {
        super.a(\u2603);
        this.bP = -1;
    }
    
    @Override
    public void b(final int \u2603) {
        super.b(\u2603);
        this.bP = -1;
    }
    
    public void g_() {
        this.bk.a((xn)this);
    }
    
    @Override
    public void h_() {
        super.h_();
        this.a.a(new gy(this.bs(), gy.a.a));
    }
    
    @Override
    public void j() {
        super.j();
        this.a.a(new gy(this.bs(), gy.a.b));
    }
    
    @Override
    public void t_() {
        this.c.a();
        --this.bQ;
        if (this.Z > 0) {
            --this.Z;
        }
        this.bk.b();
        if (!this.o.D && !this.bk.a((wn)this)) {
            this.n();
            this.bk = this.bj;
        }
        while (!this.bJ.isEmpty()) {
            final int min = Math.min(this.bJ.size(), Integer.MAX_VALUE);
            final int[] \u2603 = new int[min];
            final Iterator<Integer> iterator = this.bJ.iterator();
            int n = 0;
            while (iterator.hasNext() && n < min) {
                \u2603[n++] = iterator.next();
                iterator.remove();
            }
            this.a.a(new hb(\u2603));
        }
        if (!this.f.isEmpty()) {
            final List<amy> arrayList = (List<amy>)Lists.newArrayList();
            final Iterator<adg> iterator2 = this.f.iterator();
            final List<akw> arrayList2 = (List<akw>)Lists.newArrayList();
            while (iterator2.hasNext() && arrayList.size() < 10) {
                final adg adg = iterator2.next();
                if (adg != null) {
                    if (!this.o.e(new cj(adg.a << 4, 0, adg.b << 4))) {
                        continue;
                    }
                    final amy a = this.o.a(adg.a, adg.b);
                    if (!a.i()) {
                        continue;
                    }
                    arrayList.add(a);
                    arrayList2.addAll(((le)this.o).a(adg.a * 16, 0, adg.b * 16, adg.a * 16 + 16, 256, adg.b * 16 + 16));
                    iterator2.remove();
                }
                else {
                    iterator2.remove();
                }
            }
            if (!arrayList.isEmpty()) {
                if (arrayList.size() == 1) {
                    this.a.a(new go(arrayList.get(0), true, 65535));
                }
                else {
                    this.a.a(new gp(arrayList));
                }
                for (final akw \u26032 : arrayList2) {
                    this.a(\u26032);
                }
                for (final amy a : arrayList) {
                    this.u().s().a(this, a);
                }
            }
        }
        final pk c = this.C();
        if (c != this) {
            if (!c.ai()) {
                this.e((pk)this);
            }
            else {
                this.a(c.s, c.t, c.u, c.y, c.z);
                this.b.ap().d(this);
                if (this.av()) {
                    this.e((pk)this);
                }
            }
        }
    }
    
    public void l() {
        try {
            super.t_();
            for (int i = 0; i < this.bi.o_(); ++i) {
                final zx a = this.bi.a(i);
                if (a != null && a.b().f()) {
                    final ff c = ((yy)a.b()).c(a, this.o, this);
                    if (c != null) {
                        this.a.a(c);
                    }
                }
            }
            if (this.bn() != this.bM || this.bN != this.bl.a() || this.bl.e() == 0.0f != this.bO) {
                this.a.a(new hp(this.bn(), this.bl.a(), this.bl.e()));
                this.bM = this.bn();
                this.bN = this.bl.a();
                this.bO = (this.bl.e() == 0.0f);
            }
            if (this.bn() + this.bN() != this.bL) {
                this.bL = this.bn() + this.bN();
                final Collection<auk> a2 = this.cp().a(auu.g);
                for (final auk \u2603 : a2) {
                    this.cp().c(this.e_(), \u2603).a(Arrays.asList(this));
                }
            }
            if (this.bC != this.bP) {
                this.bP = this.bC;
                this.a.a(new ho(this.bD, this.bC, this.bB));
            }
            if (this.W % 20 * 5 == 0 && !this.A().a(mr.L)) {
                this.i_();
            }
        }
        catch (Throwable \u26032) {
            final b a3 = b.a(\u26032, "Ticking player");
            final c a4 = a3.a("Player being ticked");
            this.a(a4);
            throw new e(a3);
        }
    }
    
    protected void i_() {
        final ady b = this.o.b(new cj(ns.c(this.s), 0, ns.c(this.u)));
        final String ah = b.ah;
        nc nc = this.A().b((mw)mr.L);
        if (nc == null) {
            nc = this.A().a(mr.L, new nc());
        }
        nc.add(ah);
        if (this.A().b(mr.L) && nc.size() >= ady.n.size()) {
            final Set<ady> hashSet = (Set<ady>)Sets.newHashSet((Iterable<?>)ady.n);
            for (final String anObject : nc) {
                final Iterator<ady> iterator2 = hashSet.iterator();
                while (iterator2.hasNext()) {
                    final ady ady = iterator2.next();
                    if (ady.ah.equals(anObject)) {
                        iterator2.remove();
                    }
                }
                if (hashSet.isEmpty()) {
                    break;
                }
            }
            if (hashSet.isEmpty()) {
                this.b(mr.L);
            }
        }
    }
    
    @Override
    public void a(final ow \u2603) {
        if (this.o.Q().b("showDeathMessages")) {
            final auq bo = this.bO();
            if (bo == null || bo.j() == auq.a.a) {
                this.b.ap().a(this.bs().b());
            }
            else if (bo.j() == auq.a.c) {
                this.b.ap().a(this, this.bs().b());
            }
            else if (bo.j() == auq.a.d) {
                this.b.ap().b(this, this.bs().b());
            }
        }
        if (!this.o.Q().b("keepInventory")) {
            this.bi.n();
        }
        final Collection<auk> a = this.o.Z().a(auu.d);
        for (final auk \u26032 : a) {
            final aum c = this.cp().c(this.e_(), \u26032);
            c.a();
        }
        final pr bt = this.bt();
        if (bt != null) {
            final pm.a a2 = pm.a.get(pm.a(bt));
            if (a2 != null) {
                this.b(a2.e);
            }
            bt.b(this, this.aW);
        }
        this.b(na.y);
        this.a(na.h);
        this.bs().g();
    }
    
    @Override
    public boolean a(final ow \u2603, final float \u2603) {
        if (this.b(\u2603)) {
            return false;
        }
        final boolean b = this.b.ae() && this.cr() && "fall".equals(\u2603.p);
        if (!b && this.bQ > 0 && \u2603 != ow.j) {
            return false;
        }
        if (\u2603 instanceof ox) {
            final pk j = \u2603.j();
            if (j instanceof wn && !this.a((wn)j)) {
                return false;
            }
            if (j instanceof wq) {
                final wq wq = (wq)j;
                if (wq.c instanceof wn && !this.a((wn)wq.c)) {
                    return false;
                }
            }
        }
        return super.a(\u2603, \u2603);
    }
    
    @Override
    public boolean a(final wn \u2603) {
        return this.cr() && super.a(\u2603);
    }
    
    private boolean cr() {
        return this.b.aj();
    }
    
    @Override
    public void c(int \u2603) {
        if (this.am == 1 && \u2603 == 1) {
            this.b(mr.D);
            this.o.e(this);
            this.i = true;
            this.a.a(new gm(4, 0.0f));
        }
        else {
            if (this.am == 0 && \u2603 == 1) {
                this.b(mr.C);
                final cj m = this.b.a(\u2603).m();
                if (m != null) {
                    this.a.a(m.n(), m.o(), m.p(), 0.0f, 0.0f);
                }
                \u2603 = 1;
            }
            else {
                this.b(mr.y);
            }
            this.b.ap().a(this, \u2603);
            this.bP = -1;
            this.bM = -1.0f;
            this.bN = -1;
        }
    }
    
    @Override
    public boolean a(final lf \u2603) {
        if (\u2603.v()) {
            return this.C() == this;
        }
        return !this.v() && super.a(\u2603);
    }
    
    private void a(final akw \u2603) {
        if (\u2603 != null) {
            final ff y_ = \u2603.y_();
            if (y_ != null) {
                this.a.a(y_);
            }
        }
    }
    
    @Override
    public void a(final pk \u2603, final int \u2603) {
        super.a(\u2603, \u2603);
        this.bk.b();
    }
    
    @Override
    public a a(final cj \u2603) {
        final a a = super.a(\u2603);
        if (a == wn.a.a) {
            final ff ff = new ha(this, \u2603);
            this.u().s().a(this, ff);
            this.a.a(this.s, this.t, this.u, this.y, this.z);
            this.a.a(ff);
        }
        return a;
    }
    
    @Override
    public void a(final boolean \u2603, final boolean \u2603, final boolean \u2603) {
        if (this.bJ()) {
            this.u().s().b(this, new fq(this, 2));
        }
        super.a(\u2603, \u2603, \u2603);
        if (this.a != null) {
            this.a.a(this.s, this.t, this.u, this.y, this.z);
        }
    }
    
    @Override
    public void a(final pk \u2603) {
        final pk m = this.m;
        super.a(\u2603);
        if (\u2603 != m) {
            this.a.a(new hl(0, this, this.m));
            this.a.a(this.s, this.t, this.u, this.y, this.z);
        }
    }
    
    @Override
    protected void a(final double \u2603, final boolean \u2603, final afh \u2603, final cj \u2603) {
    }
    
    public void a(final double \u2603, final boolean \u2603) {
        final int c = ns.c(this.s);
        final int c2 = ns.c(this.t - 0.20000000298023224);
        final int c3 = ns.c(this.u);
        cj b = new cj(c, c2, c3);
        afh \u26032 = this.o.p(b).c();
        if (\u26032.t() == arm.a) {
            final afh c4 = this.o.p(b.b()).c();
            if (c4 instanceof agt || c4 instanceof akl || c4 instanceof agu) {
                b = b.b();
                \u26032 = this.o.p(b).c();
            }
        }
        super.a(\u2603, \u2603, \u26032, b);
    }
    
    @Override
    public void a(final aln \u2603) {
        \u2603.a(this);
        this.a.a(new gw(\u2603.v()));
    }
    
    private void cs() {
        this.bV = this.bV % 100 + 1;
    }
    
    @Override
    public void a(final ol \u2603) {
        this.cs();
        this.a.a(new gc(this.bV, \u2603.k(), \u2603.f_()));
        this.bk = \u2603.a(this.bi, this);
        this.bk.d = this.bV;
        this.bk.a((xn)this);
    }
    
    @Override
    public void a(final og \u2603) {
        if (this.bk != this.bj) {
            this.n();
        }
        if (\u2603 instanceof oo) {
            final oo oo = (oo)\u2603;
            if (oo.r_() && !this.a(oo.i()) && !this.v()) {
                this.a.a(new fy(new fb("container.isLocked", new Object[] { \u2603.f_() }), (byte)2));
                this.a.a(new gs("random.door_close", this.s, this.t, this.u, 1.0f, 1.0f));
                return;
            }
        }
        this.cs();
        if (\u2603 instanceof ol) {
            this.a.a(new gc(this.bV, ((ol)\u2603).k(), \u2603.f_(), \u2603.o_()));
            this.bk = ((ol)\u2603).a(this.bi, this);
        }
        else {
            this.a.a(new gc(this.bV, "minecraft:container", \u2603.f_(), \u2603.o_()));
            this.bk = new xo(this.bi, \u2603, this);
        }
        this.bk.d = this.bV;
        this.bk.a((xn)this);
    }
    
    @Override
    public void a(final acy \u2603) {
        this.cs();
        this.bk = new yb(this.bi, \u2603, this.o);
        this.bk.d = this.bV;
        this.bk.a((xn)this);
        final og e = ((yb)this.bk).e();
        final eu f_ = \u2603.f_();
        this.a.a(new gc(this.bV, "minecraft:villager", f_, e.o_()));
        final ada b_ = \u2603.b_(this);
        if (b_ != null) {
            final em em = new em(Unpooled.buffer());
            em.writeInt(this.bV);
            b_.a(em);
            this.a.a(new gg("MC|TrList", em));
        }
    }
    
    @Override
    public void a(final tp \u2603, final og \u2603) {
        if (this.bk != this.bj) {
            this.n();
        }
        this.cs();
        this.a.a(new gc(this.bV, "EntityHorse", \u2603.f_(), \u2603.o_(), \u2603.F()));
        this.bk = new xx(this.bi, \u2603, \u2603, this);
        this.bk.d = this.bV;
        this.bk.a((xn)this);
    }
    
    @Override
    public void a(final zx \u2603) {
        final zw b = \u2603.b();
        if (b == zy.bN) {
            this.a.a(new gg("MC|BOpen", new em(Unpooled.buffer())));
        }
    }
    
    @Override
    public void a(final xi \u2603, final int \u2603, final zx \u2603) {
        if (\u2603.a(\u2603) instanceof yf) {
            return;
        }
        if (this.g) {
            return;
        }
        this.a.a(new gf(\u2603.d, \u2603, \u2603));
    }
    
    public void a(final xi \u2603) {
        this.a(\u2603, \u2603.a());
    }
    
    @Override
    public void a(final xi \u2603, final List<zx> \u2603) {
        this.a.a(new gd(\u2603.d, \u2603));
        this.a.a(new gf(-1, -1, this.bi.p()));
    }
    
    @Override
    public void a(final xi \u2603, final int \u2603, final int \u2603) {
        this.a.a(new ge(\u2603.d, \u2603, \u2603));
    }
    
    @Override
    public void a(final xi \u2603, final og \u2603) {
        for (int i = 0; i < \u2603.g(); ++i) {
            this.a.a(new ge(\u2603.d, i, \u2603.a_(i)));
        }
    }
    
    public void n() {
        this.a.a(new gb(this.bk.d));
        this.p();
    }
    
    public void o() {
        if (this.g) {
            return;
        }
        this.a.a(new gf(-1, -1, this.bi.p()));
    }
    
    public void p() {
        this.bk.b((wn)this);
        this.bk = this.bj;
    }
    
    public void a(final float \u2603, final float \u2603, final boolean \u2603, final boolean \u2603) {
        if (this.m != null) {
            if (\u2603 >= -1.0f && \u2603 <= 1.0f) {
                this.aZ = \u2603;
            }
            if (\u2603 >= -1.0f && \u2603 <= 1.0f) {
                this.ba = \u2603;
            }
            this.aY = \u2603;
            this.c(\u2603);
        }
    }
    
    @Override
    public void a(final mw \u2603, final int \u2603) {
        if (\u2603 == null) {
            return;
        }
        this.bK.b(this, \u2603, \u2603);
        for (final auk \u26032 : this.cp().a(\u2603.k())) {
            this.cp().c(this.e_(), \u26032).a(\u2603);
        }
        if (this.bK.e()) {
            this.bK.a(this);
        }
    }
    
    @Override
    public void a(final mw \u2603) {
        if (\u2603 == null) {
            return;
        }
        this.bK.a(this, \u2603, 0);
        for (final auk \u26032 : this.cp().a(\u2603.k())) {
            this.cp().c(this.e_(), \u26032).c(0);
        }
        if (this.bK.e()) {
            this.bK.a(this);
        }
    }
    
    public void q() {
        if (this.l != null) {
            this.l.a((pk)this);
        }
        if (this.bw) {
            this.a(true, false, false);
        }
    }
    
    public void r() {
        this.bM = -1.0E8f;
    }
    
    @Override
    public void b(final eu \u2603) {
        this.a.a(new fy(\u2603));
    }
    
    @Override
    protected void s() {
        this.a.a(new gi(this, (byte)9));
        super.s();
    }
    
    @Override
    public void a(final zx \u2603, final int \u2603) {
        super.a(\u2603, \u2603);
        if (\u2603 != null && \u2603.b() != null && \u2603.b().e(\u2603) == aba.b) {
            this.u().s().b(this, new fq(this, 3));
        }
    }
    
    @Override
    public void a(final wn \u2603, final boolean \u2603) {
        super.a(\u2603, \u2603);
        this.bP = -1;
        this.bM = -1.0f;
        this.bN = -1;
        this.bJ.addAll(((lf)\u2603).bJ);
    }
    
    @Override
    protected void a(final pf \u2603) {
        super.a(\u2603);
        this.a.a(new ib(this.F(), \u2603));
    }
    
    @Override
    protected void a(final pf \u2603, final boolean \u2603) {
        super.a(\u2603, \u2603);
        this.a.a(new ib(this.F(), \u2603));
    }
    
    @Override
    protected void b(final pf \u2603) {
        super.b(\u2603);
        this.a.a(new hc(this.F(), \u2603));
    }
    
    @Override
    public void a(final double \u2603, final double \u2603, final double \u2603) {
        this.a.a(\u2603, \u2603, \u2603, this.y, this.z);
    }
    
    @Override
    public void b(final pk \u2603) {
        this.u().s().b(this, new fq(\u2603, 4));
    }
    
    @Override
    public void c(final pk \u2603) {
        this.u().s().b(this, new fq(\u2603, 5));
    }
    
    @Override
    public void t() {
        if (this.a == null) {
            return;
        }
        this.a.a(new gx(this.bA));
        this.B();
    }
    
    public le u() {
        return (le)this.o;
    }
    
    @Override
    public void a(final adp.a \u2603) {
        this.c.a(\u2603);
        this.a.a(new gm(3, (float)\u2603.a()));
        if (\u2603 == adp.a.e) {
            this.a((pk)null);
        }
        else {
            this.e((pk)this);
        }
        this.t();
        this.bP();
    }
    
    @Override
    public boolean v() {
        return this.c.b() == adp.a.e;
    }
    
    @Override
    public void a(final eu \u2603) {
        this.a.a(new fy(\u2603));
    }
    
    @Override
    public boolean a(final int \u2603, final String \u2603) {
        if ("seed".equals(\u2603) && !this.b.ae()) {
            return true;
        }
        if ("tell".equals(\u2603) || "help".equals(\u2603) || "me".equals(\u2603) || "trigger".equals(\u2603)) {
            return true;
        }
        if (!this.b.ap().h(this.cd())) {
            return false;
        }
        final lz lz = this.b.ap().m().b(this.cd());
        if (lz != null) {
            return lz.a() >= \u2603;
        }
        return this.b.p() >= \u2603;
    }
    
    public String w() {
        String s = this.a.a.b().toString();
        s = s.substring(s.indexOf("/") + 1);
        s = s.substring(0, s.indexOf(":"));
        return s;
    }
    
    public void a(final ih \u2603) {
        this.bI = \u2603.a();
        this.bR = \u2603.c();
        this.bS = \u2603.d();
        this.H().b(10, (byte)\u2603.e());
    }
    
    public b y() {
        return this.bR;
    }
    
    public void a(final String \u2603, final String \u2603) {
        this.a.a(new hd(\u2603, \u2603));
    }
    
    @Override
    public cj c() {
        return new cj(this.s, this.t + 0.5, this.u);
    }
    
    public void z() {
        this.bT = MinecraftServer.az();
    }
    
    public mv A() {
        return this.bK;
    }
    
    public void d(final pk \u2603) {
        if (\u2603 instanceof wn) {
            this.a.a(new hb(new int[] { \u2603.F() }));
        }
        else {
            this.bJ.add(\u2603.F());
        }
    }
    
    @Override
    protected void B() {
        if (this.v()) {
            this.bj();
            this.e(true);
        }
        else {
            super.B();
        }
        this.u().s().a(this);
    }
    
    public pk C() {
        return (this.bU == null) ? this : this.bU;
    }
    
    public void e(final pk \u2603) {
        final pk c = this.C();
        this.bU = ((\u2603 == null) ? this : \u2603);
        if (c != this.bU) {
            this.a.a(new hh(this.bU));
            this.a(this.bU.s, this.bU.t, this.bU.u);
        }
    }
    
    @Override
    public void f(final pk \u2603) {
        if (this.c.b() == adp.a.e) {
            this.e(\u2603);
        }
        else {
            super.f(\u2603);
        }
    }
    
    public long D() {
        return this.bT;
    }
    
    public eu E() {
        return null;
    }
    
    static {
        bH = LogManager.getLogger();
    }
}
