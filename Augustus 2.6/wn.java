import net.minecraft.server.MinecraftServer;
import com.google.common.base.Charsets;
import java.util.UUID;
import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.Collection;
import java.util.List;
import com.mojang.authlib.GameProfile;

// 
// Decompiled by Procyon v0.5.36
// 

public abstract class wn extends pr
{
    public wm bi;
    private yd a;
    public xi bj;
    public xi bk;
    protected xg bl;
    protected int bm;
    public float bn;
    public float bo;
    public int bp;
    public double bq;
    public double br;
    public double bs;
    public double bt;
    public double bu;
    public double bv;
    protected boolean bw;
    public cj bx;
    private int b;
    public float by;
    public float bZ;
    public float bz;
    private cj c;
    private boolean d;
    private cj e;
    public wl bA;
    public int bB;
    public int bC;
    public float bD;
    private int f;
    private zx g;
    private int h;
    protected float bE;
    protected float bF;
    private int i;
    private final GameProfile bH;
    private boolean bI;
    public ur bG;
    
    public wn(final adm \u2603, final GameProfile \u2603) {
        super(\u2603);
        this.bi = new wm(this);
        this.a = new yd();
        this.bl = new xg();
        this.bA = new wl();
        this.bE = 0.1f;
        this.bF = 0.02f;
        this.bI = false;
        this.aq = a(\u2603);
        this.bH = \u2603;
        this.bj = new xy(this.bi, !\u2603.D, this);
        this.bk = this.bj;
        final cj m = \u2603.M();
        this.b(m.n() + 0.5, m.o() + 1, m.p() + 0.5, 0.0f, 0.0f);
        this.aV = 180.0f;
        this.X = 20;
    }
    
    @Override
    protected void aX() {
        super.aX();
        this.by().b(vy.e).a(1.0);
        this.a(vy.d).a(0.10000000149011612);
    }
    
    @Override
    protected void h() {
        super.h();
        this.ac.a(16, (Byte)0);
        this.ac.a(17, 0.0f);
        this.ac.a(18, Integer.valueOf(0));
        this.ac.a(10, (Byte)0);
    }
    
    public zx bQ() {
        return this.g;
    }
    
    public int bR() {
        return this.h;
    }
    
    public boolean bS() {
        return this.g != null;
    }
    
    public int bT() {
        if (this.bS()) {
            return this.g.l() - this.h;
        }
        return 0;
    }
    
    public void bU() {
        if (this.g != null) {
            this.g.b(this.o, this, this.h);
        }
        this.bV();
    }
    
    public void bV() {
        this.g = null;
        this.h = 0;
        if (!this.o.D) {
            this.f(false);
        }
    }
    
    public boolean bW() {
        return this.bS() && this.g.b().e(this.g) == aba.d;
    }
    
    @Override
    public void t_() {
        this.T = this.v();
        if (this.v()) {
            this.C = false;
        }
        if (this.g != null) {
            final zx h = this.bi.h();
            if (h == this.g) {
                if (this.h <= 25 && this.h % 4 == 0) {
                    this.b(h, 5);
                }
                if (--this.h == 0 && !this.o.D) {
                    this.s();
                }
            }
            else {
                this.bV();
            }
        }
        if (this.bp > 0) {
            --this.bp;
        }
        if (this.bJ()) {
            ++this.b;
            if (this.b > 100) {
                this.b = 100;
            }
            if (!this.o.D) {
                if (!this.p()) {
                    this.a(true, true, false);
                }
                else if (this.o.w()) {
                    this.a(false, true, true);
                }
            }
        }
        else if (this.b > 0) {
            ++this.b;
            if (this.b >= 110) {
                this.b = 0;
            }
        }
        super.t_();
        if (!this.o.D && this.bk != null && !this.bk.a(this)) {
            this.n();
            this.bk = this.bj;
        }
        if (this.at() && this.bA.a) {
            this.N();
        }
        this.bq = this.bt;
        this.br = this.bu;
        this.bs = this.bv;
        final double n = this.s - this.bt;
        final double n2 = this.t - this.bu;
        final double n3 = this.u - this.bv;
        final double n4 = 10.0;
        if (n > n4) {
            final double s = this.s;
            this.bt = s;
            this.bq = s;
        }
        if (n3 > n4) {
            final double u = this.u;
            this.bv = u;
            this.bs = u;
        }
        if (n2 > n4) {
            final double t = this.t;
            this.bu = t;
            this.br = t;
        }
        if (n < -n4) {
            final double s2 = this.s;
            this.bt = s2;
            this.bq = s2;
        }
        if (n3 < -n4) {
            final double u2 = this.u;
            this.bv = u2;
            this.bs = u2;
        }
        if (n2 < -n4) {
            final double t2 = this.t;
            this.bu = t2;
            this.br = t2;
        }
        this.bt += n * 0.25;
        this.bv += n3 * 0.25;
        this.bu += n2 * 0.25;
        if (this.m == null) {
            this.e = null;
        }
        if (!this.o.D) {
            this.bl.a(this);
            this.b(na.g);
            if (this.ai()) {
                this.b(na.h);
            }
        }
        final int n5 = 29999999;
        final double a = ns.a(this.s, -2.9999999E7, 2.9999999E7);
        final double a2 = ns.a(this.u, -2.9999999E7, 2.9999999E7);
        if (a != this.s || a2 != this.u) {
            this.b(a, this.t, a2);
        }
    }
    
    @Override
    public int L() {
        return this.bA.a ? 0 : 80;
    }
    
    @Override
    protected String P() {
        return "game.player.swim";
    }
    
    @Override
    protected String aa() {
        return "game.player.swim.splash";
    }
    
    @Override
    public int aq() {
        return 10;
    }
    
    @Override
    public void a(final String \u2603, final float \u2603, final float \u2603) {
        this.o.a(this, \u2603, \u2603, \u2603);
    }
    
    protected void b(final zx \u2603, final int \u2603) {
        if (\u2603.m() == aba.c) {
            this.a("random.drink", 0.5f, this.o.s.nextFloat() * 0.1f + 0.9f);
        }
        if (\u2603.m() == aba.b) {
            for (int i = 0; i < \u2603; ++i) {
                aui aui = new aui((this.V.nextFloat() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0);
                aui = aui.a(-this.z * 3.1415927f / 180.0f);
                aui = aui.b(-this.y * 3.1415927f / 180.0f);
                final double \u26032 = -this.V.nextFloat() * 0.6 - 0.3;
                aui aui2 = new aui((this.V.nextFloat() - 0.5) * 0.3, \u26032, 0.6);
                aui2 = aui2.a(-this.z * 3.1415927f / 180.0f);
                aui2 = aui2.b(-this.y * 3.1415927f / 180.0f);
                aui2 = aui2.b(this.s, this.t + this.aS(), this.u);
                if (\u2603.f()) {
                    this.o.a(cy.K, aui2.a, aui2.b, aui2.c, aui.a, aui.b + 0.05, aui.c, zw.b(\u2603.b()), \u2603.i());
                }
                else {
                    this.o.a(cy.K, aui2.a, aui2.b, aui2.c, aui.a, aui.b + 0.05, aui.c, zw.b(\u2603.b()));
                }
            }
            this.a("random.eat", 0.5f + 0.5f * this.V.nextInt(2), (this.V.nextFloat() - this.V.nextFloat()) * 0.2f + 1.0f);
        }
    }
    
    protected void s() {
        if (this.g != null) {
            this.b(this.g, 16);
            final int b = this.g.b;
            final zx b2 = this.g.b(this.o, this);
            if (b2 != this.g || (b2 != null && b2.b != b)) {
                this.bi.a[this.bi.c] = b2;
                if (b2.b == 0) {
                    this.bi.a[this.bi.c] = null;
                }
            }
            this.bV();
        }
    }
    
    @Override
    public void a(final byte \u2603) {
        if (\u2603 == 9) {
            this.s();
        }
        else if (\u2603 == 23) {
            this.bI = false;
        }
        else if (\u2603 == 22) {
            this.bI = true;
        }
        else {
            super.a(\u2603);
        }
    }
    
    @Override
    protected boolean bD() {
        return this.bn() <= 0.0f || this.bJ();
    }
    
    protected void n() {
        this.bk = this.bj;
    }
    
    @Override
    public void ak() {
        if (!this.o.D && this.av()) {
            this.a((pk)null);
            this.c(false);
            return;
        }
        final double s = this.s;
        final double t = this.t;
        final double u = this.u;
        final float y = this.y;
        final float z = this.z;
        super.ak();
        this.bn = this.bo;
        this.bo = 0.0f;
        this.l(this.s - s, this.t - t, this.u - u);
        if (this.m instanceof tt) {
            this.z = z;
            this.y = y;
            this.aI = ((tt)this.m).aI;
        }
    }
    
    public void I() {
        this.a(0.6f, 1.8f);
        super.I();
        this.i(this.bu());
        this.ax = 0;
    }
    
    @Override
    protected void bK() {
        super.bK();
        this.bx();
        this.aK = this.y;
    }
    
    @Override
    public void m() {
        if (this.bm > 0) {
            --this.bm;
        }
        if (this.o.aa() == oj.a && this.o.Q().b("naturalRegeneration")) {
            if (this.bn() < this.bu() && this.W % 20 == 0) {
                this.h(1.0f);
            }
            if (this.bl.c() && this.W % 10 == 0) {
                this.bl.a(this.bl.a() + 1);
            }
        }
        this.bi.k();
        this.bn = this.bo;
        super.m();
        final qc a = this.a(vy.d);
        if (!this.o.D) {
            a.a(this.bA.b());
        }
        this.aM = this.bF;
        if (this.aw()) {
            this.aM += (float)(this.bF * 0.3);
        }
        this.k((float)a.e());
        float a2 = ns.a(this.v * this.v + this.x * this.x);
        float n = (float)(Math.atan(-this.w * 0.20000000298023224) * 15.0);
        if (a2 > 0.1f) {
            a2 = 0.1f;
        }
        if (!this.C || this.bn() <= 0.0f) {
            a2 = 0.0f;
        }
        if (this.C || this.bn() <= 0.0f) {
            n = 0.0f;
        }
        this.bo += (a2 - this.bo) * 0.4f;
        this.aF += (n - this.aF) * 0.8f;
        if (this.bn() > 0.0f && !this.v()) {
            aug \u2603 = null;
            if (this.m != null && !this.m.I) {
                \u2603 = this.aR().a(this.m.aR()).b(1.0, 0.0, 1.0);
            }
            else {
                \u2603 = this.aR().b(1.0, 0.5, 1.0);
            }
            final List<pk> b = this.o.b(this, \u2603);
            for (int i = 0; i < b.size(); ++i) {
                final pk \u26032 = b.get(i);
                if (!\u26032.I) {
                    this.d(\u26032);
                }
            }
        }
    }
    
    private void d(final pk \u2603) {
        \u2603.d(this);
    }
    
    public int bX() {
        return this.ac.c(18);
    }
    
    public void r(final int \u2603) {
        this.ac.b(18, \u2603);
    }
    
    public void s(final int \u2603) {
        final int bx = this.bX();
        this.ac.b(18, bx + \u2603);
    }
    
    @Override
    public void a(final ow \u2603) {
        super.a(\u2603);
        this.a(0.2f, 0.2f);
        this.b(this.s, this.t, this.u);
        this.w = 0.10000000149011612;
        if (this.e_().equals("Notch")) {
            this.a(new zx(zy.e, 1), true, false);
        }
        if (!this.o.Q().b("keepInventory")) {
            this.bi.n();
        }
        if (\u2603 != null) {
            this.v = -ns.b((this.aw + this.y) * 3.1415927f / 180.0f) * 0.1f;
            this.x = -ns.a((this.aw + this.y) * 3.1415927f / 180.0f) * 0.1f;
        }
        else {
            final double n = 0.0;
            this.x = n;
            this.v = n;
        }
        this.b(na.y);
        this.a(na.h);
    }
    
    @Override
    protected String bo() {
        return "game.player.hurt";
    }
    
    @Override
    protected String bp() {
        return "game.player.die";
    }
    
    @Override
    public void b(final pk \u2603, final int \u2603) {
        this.s(\u2603);
        final Collection<auk> a = this.cp().a(auu.f);
        if (\u2603 instanceof wn) {
            this.b(na.B);
            a.addAll(this.cp().a(auu.e));
            a.addAll(this.e(\u2603));
        }
        else {
            this.b(na.z);
        }
        for (final auk \u26032 : a) {
            final aum c = this.cp().c(this.e_(), \u26032);
            c.a();
        }
    }
    
    private Collection<auk> e(final pk \u2603) {
        final aul h = this.cp().h(this.e_());
        if (h != null) {
            final int b = h.l().b();
            if (b >= 0 && b < auu.i.length) {
                for (final auk \u26032 : this.cp().a(auu.i[b])) {
                    final aum c = this.cp().c(\u2603.e_(), \u26032);
                    c.a();
                }
            }
        }
        final aul h2 = this.cp().h(\u2603.e_());
        if (h2 != null) {
            final int b2 = h2.l().b();
            if (b2 >= 0 && b2 < auu.h.length) {
                return this.cp().a(auu.h[b2]);
            }
        }
        return (Collection<auk>)Lists.newArrayList();
    }
    
    public uz a(final boolean \u2603) {
        return this.a(this.bi.a(this.bi.c, (\u2603 && this.bi.h() != null) ? this.bi.h().b : 1), false, true);
    }
    
    public uz a(final zx \u2603, final boolean \u2603) {
        return this.a(\u2603, false, false);
    }
    
    public uz a(final zx \u2603, final boolean \u2603, final boolean \u2603) {
        if (\u2603 == null) {
            return null;
        }
        if (\u2603.b == 0) {
            return null;
        }
        final double \u26032 = this.t - 0.30000001192092896 + this.aS();
        final uz \u26033 = new uz(this.o, this.s, \u26032, this.u, \u2603);
        \u26033.a(40);
        if (\u2603) {
            \u26033.c(this.e_());
        }
        if (\u2603) {
            final float n = this.V.nextFloat() * 0.5f;
            final float n2 = this.V.nextFloat() * 3.1415927f * 2.0f;
            \u26033.v = -ns.a(n2) * n;
            \u26033.x = ns.b(n2) * n;
            \u26033.w = 0.20000000298023224;
        }
        else {
            float n = 0.3f;
            \u26033.v = -ns.a(this.y / 180.0f * 3.1415927f) * ns.b(this.z / 180.0f * 3.1415927f) * n;
            \u26033.x = ns.b(this.y / 180.0f * 3.1415927f) * ns.b(this.z / 180.0f * 3.1415927f) * n;
            \u26033.w = -ns.a(this.z / 180.0f * 3.1415927f) * n + 0.1f;
            final float n2 = this.V.nextFloat() * 3.1415927f * 2.0f;
            n = 0.02f * this.V.nextFloat();
            final uz uz = \u26033;
            uz.v += Math.cos(n2) * n;
            final uz uz2 = \u26033;
            uz2.w += (this.V.nextFloat() - this.V.nextFloat()) * 0.1f;
            final uz uz3 = \u26033;
            uz3.x += Math.sin(n2) * n;
        }
        this.a(\u26033);
        if (\u2603) {
            this.b(na.v);
        }
        return \u26033;
    }
    
    protected void a(final uz \u2603) {
        this.o.d(\u2603);
    }
    
    public float a(final afh \u2603) {
        float a = this.bi.a(\u2603);
        if (a > 1.0f) {
            final int c = ack.c(this);
            final zx h = this.bi.h();
            if (c > 0 && h != null) {
                a += c * c + 1;
            }
        }
        if (this.a(pe.e)) {
            a *= 1.0f + (this.b(pe.e).c() + 1) * 0.2f;
        }
        if (this.a(pe.f)) {
            float n = 1.0f;
            switch (this.b(pe.f).c()) {
                case 0: {
                    n = 0.3f;
                    break;
                }
                case 1: {
                    n = 0.09f;
                    break;
                }
                case 2: {
                    n = 0.0027f;
                    break;
                }
                default: {
                    n = 8.1E-4f;
                    break;
                }
            }
            a *= n;
        }
        if (this.a(arm.h) && !ack.j(this)) {
            a /= 5.0f;
        }
        if (!this.C) {
            a /= 5.0f;
        }
        return a;
    }
    
    public boolean b(final afh \u2603) {
        return this.bi.b(\u2603);
    }
    
    @Override
    public void a(final dn \u2603) {
        super.a(\u2603);
        this.aq = a(this.bH);
        final du c = \u2603.c("Inventory", 10);
        this.bi.b(c);
        this.bi.c = \u2603.f("SelectedItemSlot");
        this.bw = \u2603.n("Sleeping");
        this.b = \u2603.e("SleepTimer");
        this.bD = \u2603.h("XpP");
        this.bB = \u2603.f("XpLevel");
        this.bC = \u2603.f("XpTotal");
        this.f = \u2603.f("XpSeed");
        if (this.f == 0) {
            this.f = this.V.nextInt();
        }
        this.r(\u2603.f("Score"));
        if (this.bw) {
            this.bx = new cj(this);
            this.a(true, true, false);
        }
        if (\u2603.b("SpawnX", 99) && \u2603.b("SpawnY", 99) && \u2603.b("SpawnZ", 99)) {
            this.c = new cj(\u2603.f("SpawnX"), \u2603.f("SpawnY"), \u2603.f("SpawnZ"));
            this.d = \u2603.n("SpawnForced");
        }
        this.bl.a(\u2603);
        this.bA.b(\u2603);
        if (\u2603.b("EnderItems", 9)) {
            final du c2 = \u2603.c("EnderItems", 10);
            this.a.a(c2);
        }
    }
    
    @Override
    public void b(final dn \u2603) {
        super.b(\u2603);
        \u2603.a("Inventory", this.bi.a(new du()));
        \u2603.a("SelectedItemSlot", this.bi.c);
        \u2603.a("Sleeping", this.bw);
        \u2603.a("SleepTimer", (short)this.b);
        \u2603.a("XpP", this.bD);
        \u2603.a("XpLevel", this.bB);
        \u2603.a("XpTotal", this.bC);
        \u2603.a("XpSeed", this.f);
        \u2603.a("Score", this.bX());
        if (this.c != null) {
            \u2603.a("SpawnX", this.c.n());
            \u2603.a("SpawnY", this.c.o());
            \u2603.a("SpawnZ", this.c.p());
            \u2603.a("SpawnForced", this.d);
        }
        this.bl.b(\u2603);
        this.bA.a(\u2603);
        \u2603.a("EnderItems", this.a.h());
        final zx h = this.bi.h();
        if (h != null && h.b() != null) {
            \u2603.a("SelectedItem", h.b(new dn()));
        }
    }
    
    @Override
    public boolean a(final ow \u2603, float \u2603) {
        if (this.b(\u2603)) {
            return false;
        }
        if (this.bA.a && !\u2603.g()) {
            return false;
        }
        this.aQ = 0;
        if (this.bn() <= 0.0f) {
            return false;
        }
        if (this.bJ() && !this.o.D) {
            this.a(true, true, false);
        }
        if (\u2603.r()) {
            if (this.o.aa() == oj.a) {
                \u2603 = 0.0f;
            }
            if (this.o.aa() == oj.b) {
                \u2603 = \u2603 / 2.0f + 1.0f;
            }
            if (this.o.aa() == oj.d) {
                \u2603 = \u2603 * 3.0f / 2.0f;
            }
        }
        if (\u2603 == 0.0f) {
            return false;
        }
        pk pk = \u2603.j();
        if (pk instanceof wq && ((wq)pk).c != null) {
            pk = ((wq)pk).c;
        }
        return super.a(\u2603, \u2603);
    }
    
    public boolean a(final wn \u2603) {
        final auq bo = this.bO();
        final auq bo2 = \u2603.bO();
        return bo == null || !bo.a(bo2) || bo.g();
    }
    
    @Override
    protected void j(final float \u2603) {
        this.bi.a(\u2603);
    }
    
    @Override
    public int br() {
        return this.bi.m();
    }
    
    public float bY() {
        int n = 0;
        for (final zx zx : this.bi.b) {
            if (zx != null) {
                ++n;
            }
        }
        return n / (float)this.bi.b.length;
    }
    
    @Override
    protected void d(final ow \u2603, float \u2603) {
        if (this.b(\u2603)) {
            return;
        }
        if (!\u2603.e() && this.bW() && \u2603 > 0.0f) {
            \u2603 = (1.0f + \u2603) * 0.5f;
        }
        \u2603 = this.b(\u2603, \u2603);
        final float c;
        \u2603 = (c = this.c(\u2603, \u2603));
        \u2603 = Math.max(\u2603 - this.bN(), 0.0f);
        this.m(this.bN() - (c - \u2603));
        if (\u2603 == 0.0f) {
            return;
        }
        this.a(\u2603.f());
        final float bn = this.bn();
        this.i(this.bn() - \u2603);
        this.bs().a(\u2603, bn, \u2603);
        if (\u2603 < 3.4028235E37f) {
            this.a(na.x, Math.round(\u2603 * 10.0f));
        }
    }
    
    public void a(final aln \u2603) {
    }
    
    public void a(final adc \u2603) {
    }
    
    public void a(final acy \u2603) {
    }
    
    public void a(final og \u2603) {
    }
    
    public void a(final tp \u2603, final og \u2603) {
    }
    
    public void a(final ol \u2603) {
    }
    
    public void a(final zx \u2603) {
    }
    
    public boolean u(final pk \u2603) {
        if (this.v()) {
            if (\u2603 instanceof og) {
                this.a((og)\u2603);
            }
            return false;
        }
        zx bz = this.bZ();
        final zx zx = (bz != null) ? bz.k() : null;
        if (\u2603.e(this)) {
            if (bz != null && bz == this.bZ()) {
                if (bz.b <= 0 && !this.bA.d) {
                    this.ca();
                }
                else if (bz.b < zx.b && this.bA.d) {
                    bz.b = zx.b;
                }
            }
            return true;
        }
        if (bz != null && \u2603 instanceof pr) {
            if (this.bA.d) {
                bz = zx;
            }
            if (bz.a(this, (pr)\u2603)) {
                if (bz.b <= 0 && !this.bA.d) {
                    this.ca();
                }
                return true;
            }
        }
        return false;
    }
    
    public zx bZ() {
        return this.bi.h();
    }
    
    public void ca() {
        this.bi.a(this.bi.c, null);
    }
    
    @Override
    public double am() {
        return -0.35;
    }
    
    public void f(final pk \u2603) {
        if (!\u2603.aD()) {
            return;
        }
        if (\u2603.l(this)) {
            return;
        }
        float \u26032 = (float)this.a(vy.e).e();
        int n = 0;
        float n2 = 0.0f;
        if (\u2603 instanceof pr) {
            n2 = ack.a(this.bA(), ((pr)\u2603).bz());
        }
        else {
            n2 = ack.a(this.bA(), pw.a);
        }
        n += ack.a(this);
        if (this.aw()) {
            ++n;
        }
        if (\u26032 > 0.0f || n2 > 0.0f) {
            final boolean b = this.O > 0.0f && !this.C && !this.k_() && !this.V() && !this.a(pe.q) && this.m == null && \u2603 instanceof pr;
            if (b && \u26032 > 0.0f) {
                \u26032 *= 1.5f;
            }
            \u26032 += n2;
            boolean b2 = false;
            final int b3 = ack.b(this);
            if (\u2603 instanceof pr && b3 > 0 && !\u2603.at()) {
                b2 = true;
                \u2603.e(1);
            }
            final double v = \u2603.v;
            final double w = \u2603.w;
            final double x = \u2603.x;
            final boolean a = \u2603.a(ow.a(this), \u26032);
            if (a) {
                if (n > 0) {
                    \u2603.g(-ns.a(this.y * 3.1415927f / 180.0f) * n * 0.5f, 0.1, ns.b(this.y * 3.1415927f / 180.0f) * n * 0.5f);
                    this.v *= 0.6;
                    this.x *= 0.6;
                    this.d(false);
                }
                if (\u2603 instanceof lf && \u2603.G) {
                    ((lf)\u2603).a.a(new hm(\u2603));
                    \u2603.G = false;
                    \u2603.v = v;
                    \u2603.w = w;
                    \u2603.x = x;
                }
                if (b) {
                    this.b(\u2603);
                }
                if (n2 > 0.0f) {
                    this.c(\u2603);
                }
                if (\u26032 >= 18.0f) {
                    this.b(mr.F);
                }
                this.p(\u2603);
                if (\u2603 instanceof pr) {
                    ack.a((pr)\u2603, this);
                }
                ack.b(this, \u2603);
                final zx bz = this.bZ();
                pk pk = \u2603;
                if (\u2603 instanceof ue) {
                    final ud a2 = ((ue)\u2603).a;
                    if (a2 instanceof pr) {
                        pk = (pr)a2;
                    }
                }
                if (bz != null && pk instanceof pr) {
                    bz.a((pr)pk, this);
                    if (bz.b <= 0) {
                        this.ca();
                    }
                }
                if (\u2603 instanceof pr) {
                    this.a(na.w, Math.round(\u26032 * 10.0f));
                    if (b3 > 0) {
                        \u2603.e(b3 * 4);
                    }
                }
                this.a(0.3f);
            }
            else if (b2) {
                \u2603.N();
            }
        }
    }
    
    public void b(final pk \u2603) {
    }
    
    public void c(final pk \u2603) {
    }
    
    public void cb() {
    }
    
    @Override
    public void J() {
        super.J();
        this.bj.b(this);
        if (this.bk != null) {
            this.bk.b(this);
        }
    }
    
    @Override
    public boolean aj() {
        return !this.bw && super.aj();
    }
    
    public boolean cc() {
        return false;
    }
    
    public GameProfile cd() {
        return this.bH;
    }
    
    public a a(final cj \u2603) {
        if (!this.o.D) {
            if (this.bJ() || !this.ai()) {
                return wn.a.e;
            }
            if (!this.o.t.d()) {
                return wn.a.b;
            }
            if (this.o.w()) {
                return wn.a.c;
            }
            if (Math.abs(this.s - \u2603.n()) > 3.0 || Math.abs(this.t - \u2603.o()) > 2.0 || Math.abs(this.u - \u2603.p()) > 3.0) {
                return wn.a.d;
            }
            final double n = 8.0;
            final double n2 = 5.0;
            final List<vv> a = this.o.a((Class<? extends vv>)vv.class, new aug(\u2603.n() - n, \u2603.o() - n2, \u2603.p() - n, \u2603.n() + n, \u2603.o() + n2, \u2603.p() + n));
            if (!a.isEmpty()) {
                return wn.a.f;
            }
        }
        if (this.au()) {
            this.a((pk)null);
        }
        this.a(0.2f, 0.2f);
        if (this.o.e(\u2603)) {
            final cq \u26032 = this.o.p(\u2603).b((amo<cq>)age.O);
            float n3 = 0.5f;
            float n4 = 0.5f;
            switch (wn$1.a[\u26032.ordinal()]) {
                case 1: {
                    n4 = 0.9f;
                    break;
                }
                case 2: {
                    n4 = 0.1f;
                    break;
                }
                case 3: {
                    n3 = 0.1f;
                    break;
                }
                case 4: {
                    n3 = 0.9f;
                    break;
                }
            }
            this.a(\u26032);
            this.b(\u2603.n() + n3, \u2603.o() + 0.6875f, \u2603.p() + n4);
        }
        else {
            this.b(\u2603.n() + 0.5f, \u2603.o() + 0.6875f, \u2603.p() + 0.5f);
        }
        this.bw = true;
        this.b = 0;
        this.bx = \u2603;
        final double v = 0.0;
        this.w = v;
        this.x = v;
        this.v = v;
        if (!this.o.D) {
            this.o.d();
        }
        return wn.a.a;
    }
    
    private void a(final cq \u2603) {
        this.by = 0.0f;
        this.bz = 0.0f;
        switch (wn$1.a[\u2603.ordinal()]) {
            case 1: {
                this.bz = -1.8f;
                break;
            }
            case 2: {
                this.bz = 1.8f;
                break;
            }
            case 3: {
                this.by = 1.8f;
                break;
            }
            case 4: {
                this.by = -1.8f;
                break;
            }
        }
    }
    
    public void a(final boolean \u2603, final boolean \u2603, final boolean \u2603) {
        this.a(0.6f, 1.8f);
        final alz p = this.o.p(this.bx);
        if (this.bx != null && p.c() == afi.C) {
            this.o.a(this.bx, p.a((amo<Comparable>)afg.b, false), 4);
            cj cj = afg.a(this.o, this.bx, 0);
            if (cj == null) {
                cj = this.bx.a();
            }
            this.b(cj.n() + 0.5f, cj.o() + 0.1f, cj.p() + 0.5f);
        }
        this.bw = false;
        if (!this.o.D && \u2603) {
            this.o.d();
        }
        this.b = (\u2603 ? 0 : 100);
        if (\u2603) {
            this.a(this.bx, false);
        }
    }
    
    private boolean p() {
        return this.o.p(this.bx).c() == afi.C;
    }
    
    public static cj a(final adm \u2603, final cj \u2603, final boolean \u2603) {
        final afh c = \u2603.p(\u2603).c();
        if (c == afi.C) {
            return afg.a(\u2603, \u2603, 0);
        }
        if (!\u2603) {
            return null;
        }
        final boolean g = c.g();
        final boolean g2 = \u2603.p(\u2603.a()).c().g();
        if (g && g2) {
            return \u2603;
        }
        return null;
    }
    
    public float ce() {
        if (this.bx != null) {
            final cq cq = this.o.p(this.bx).b((amo<cq>)age.O);
            switch (wn$1.a[cq.ordinal()]) {
                case 1: {
                    return 90.0f;
                }
                case 3: {
                    return 0.0f;
                }
                case 2: {
                    return 270.0f;
                }
                case 4: {
                    return 180.0f;
                }
            }
        }
        return 0.0f;
    }
    
    @Override
    public boolean bJ() {
        return this.bw;
    }
    
    public boolean cf() {
        return this.bw && this.b >= 100;
    }
    
    public int cg() {
        return this.b;
    }
    
    public void b(final eu \u2603) {
    }
    
    public cj ch() {
        return this.c;
    }
    
    public boolean ci() {
        return this.d;
    }
    
    public void a(final cj \u2603, final boolean \u2603) {
        if (\u2603 != null) {
            this.c = \u2603;
            this.d = \u2603;
        }
        else {
            this.c = null;
            this.d = false;
        }
    }
    
    public void b(final mw \u2603) {
        this.a(\u2603, 1);
    }
    
    public void a(final mw \u2603, final int \u2603) {
    }
    
    public void a(final mw \u2603) {
    }
    
    public void bF() {
        super.bF();
        this.b(na.u);
        if (this.aw()) {
            this.a(0.8f);
        }
        else {
            this.a(0.2f);
        }
    }
    
    @Override
    public void g(final float \u2603, final float \u2603) {
        final double s = this.s;
        final double t = this.t;
        final double u = this.u;
        if (this.bA.b && this.m == null) {
            final double w = this.w;
            final float am = this.aM;
            this.aM = this.bA.a() * (this.aw() ? 2 : 1);
            super.g(\u2603, \u2603);
            this.w = w * 0.6;
            this.aM = am;
        }
        else {
            super.g(\u2603, \u2603);
        }
        this.k(this.s - s, this.t - t, this.u - u);
    }
    
    @Override
    public float bI() {
        return (float)this.a(vy.d).e();
    }
    
    public void k(final double \u2603, final double \u2603, final double \u2603) {
        if (this.m != null) {
            return;
        }
        if (this.a(arm.h)) {
            final int n = Math.round(ns.a(\u2603 * \u2603 + \u2603 * \u2603 + \u2603 * \u2603) * 100.0f);
            if (n > 0) {
                this.a(na.p, n);
                this.a(0.015f * n * 0.01f);
            }
        }
        else if (this.V()) {
            final int n = Math.round(ns.a(\u2603 * \u2603 + \u2603 * \u2603) * 100.0f);
            if (n > 0) {
                this.a(na.l, n);
                this.a(0.015f * n * 0.01f);
            }
        }
        else if (this.k_()) {
            if (\u2603 > 0.0) {
                this.a(na.n, (int)Math.round(\u2603 * 100.0));
            }
        }
        else if (this.C) {
            final int n = Math.round(ns.a(\u2603 * \u2603 + \u2603 * \u2603) * 100.0f);
            if (n > 0) {
                this.a(na.i, n);
                if (this.aw()) {
                    this.a(na.k, n);
                    this.a(0.099999994f * n * 0.01f);
                }
                else {
                    if (this.av()) {
                        this.a(na.j, n);
                    }
                    this.a(0.01f * n * 0.01f);
                }
            }
        }
        else {
            final int n = Math.round(ns.a(\u2603 * \u2603 + \u2603 * \u2603) * 100.0f);
            if (n > 25) {
                this.a(na.o, n);
            }
        }
    }
    
    private void l(final double \u2603, final double \u2603, final double \u2603) {
        if (this.m != null) {
            final int round = Math.round(ns.a(\u2603 * \u2603 + \u2603 * \u2603 + \u2603 * \u2603) * 100.0f);
            if (round > 0) {
                if (this.m instanceof va) {
                    this.a(na.q, round);
                    if (this.e == null) {
                        this.e = new cj(this);
                    }
                    else if (this.e.c(ns.c(this.s), ns.c(this.t), ns.c(this.u)) >= 1000000.0) {
                        this.b(mr.q);
                    }
                }
                else if (this.m instanceof ux) {
                    this.a(na.r, round);
                }
                else if (this.m instanceof tt) {
                    this.a(na.s, round);
                }
                else if (this.m instanceof tp) {
                    this.a(na.t, round);
                }
            }
        }
    }
    
    @Override
    public void e(final float \u2603, final float \u2603) {
        if (this.bA.c) {
            return;
        }
        if (\u2603 >= 2.0f) {
            this.a(na.m, (int)Math.round(\u2603 * 100.0));
        }
        super.e(\u2603, \u2603);
    }
    
    @Override
    protected void X() {
        if (!this.v()) {
            super.X();
        }
    }
    
    @Override
    protected String n(final int \u2603) {
        if (\u2603 > 4) {
            return "game.player.hurt.fall.big";
        }
        return "game.player.hurt.fall.small";
    }
    
    @Override
    public void a(final pr \u2603) {
        if (\u2603 instanceof vq) {
            this.b(mr.s);
        }
        final pm.a a = pm.a.get(pm.a(\u2603));
        if (a != null) {
            this.b(a.d);
        }
    }
    
    @Override
    public void aA() {
        if (!this.bA.b) {
            super.aA();
        }
    }
    
    @Override
    public zx q(final int \u2603) {
        return this.bi.e(\u2603);
    }
    
    public void u(int \u2603) {
        this.s(\u2603);
        final int n = Integer.MAX_VALUE - this.bC;
        if (\u2603 > n) {
            \u2603 = n;
        }
        this.bD += \u2603 / (float)this.ck();
        this.bC += \u2603;
        while (this.bD >= 1.0f) {
            this.bD = (this.bD - 1.0f) * this.ck();
            this.a(1);
            this.bD /= this.ck();
        }
    }
    
    public int cj() {
        return this.f;
    }
    
    public void b(final int \u2603) {
        this.bB -= \u2603;
        if (this.bB < 0) {
            this.bB = 0;
            this.bD = 0.0f;
            this.bC = 0;
        }
        this.f = this.V.nextInt();
    }
    
    public void a(final int \u2603) {
        this.bB += \u2603;
        if (this.bB < 0) {
            this.bB = 0;
            this.bD = 0.0f;
            this.bC = 0;
        }
        if (\u2603 > 0 && this.bB % 5 == 0 && this.i < this.W - 100.0f) {
            final float n = (this.bB > 30) ? 1.0f : (this.bB / 30.0f);
            this.o.a((pk)this, "random.levelup", n * 0.75f, 1.0f);
            this.i = this.W;
        }
    }
    
    public int ck() {
        if (this.bB >= 30) {
            return 112 + (this.bB - 30) * 9;
        }
        if (this.bB >= 15) {
            return 37 + (this.bB - 15) * 5;
        }
        return 7 + this.bB * 2;
    }
    
    public void a(final float \u2603) {
        if (this.bA.a) {
            return;
        }
        if (!this.o.D) {
            this.bl.a(\u2603);
        }
    }
    
    public xg cl() {
        return this.bl;
    }
    
    public boolean j(final boolean \u2603) {
        return (\u2603 || this.bl.c()) && !this.bA.a;
    }
    
    public boolean cm() {
        return this.bn() > 0.0f && this.bn() < this.bu();
    }
    
    public void a(final zx \u2603, final int \u2603) {
        if (\u2603 == this.g) {
            return;
        }
        this.g = \u2603;
        this.h = \u2603;
        if (!this.o.D) {
            this.f(true);
        }
    }
    
    public boolean cn() {
        return this.bA.e;
    }
    
    public boolean a(final cj \u2603, final cq \u2603, final zx \u2603) {
        if (this.bA.e) {
            return true;
        }
        if (\u2603 == null) {
            return false;
        }
        final cj a = \u2603.a(\u2603.d());
        final afh c = this.o.p(a).c();
        return \u2603.d(c) || \u2603.x();
    }
    
    @Override
    protected int b(final wn \u2603) {
        if (this.o.Q().b("keepInventory")) {
            return 0;
        }
        final int n = this.bB * 7;
        if (n > 100) {
            return 100;
        }
        return n;
    }
    
    @Override
    protected boolean bb() {
        return true;
    }
    
    @Override
    public boolean aO() {
        return true;
    }
    
    public void a(final wn \u2603, final boolean \u2603) {
        if (\u2603) {
            this.bi.b(\u2603.bi);
            this.i(\u2603.bn());
            this.bl = \u2603.bl;
            this.bB = \u2603.bB;
            this.bC = \u2603.bC;
            this.bD = \u2603.bD;
            this.r(\u2603.bX());
            this.an = \u2603.an;
            this.ao = \u2603.ao;
            this.ap = \u2603.ap;
        }
        else if (this.o.Q().b("keepInventory")) {
            this.bi.b(\u2603.bi);
            this.bB = \u2603.bB;
            this.bC = \u2603.bC;
            this.bD = \u2603.bD;
            this.r(\u2603.bX());
        }
        this.f = \u2603.f;
        this.a = \u2603.a;
        this.H().b(10, \u2603.H().a(10));
    }
    
    @Override
    protected boolean s_() {
        return !this.bA.b;
    }
    
    public void t() {
    }
    
    public void a(final adp.a \u2603) {
    }
    
    @Override
    public String e_() {
        return this.bH.getName();
    }
    
    public yd co() {
        return this.a;
    }
    
    @Override
    public zx p(final int \u2603) {
        if (\u2603 == 0) {
            return this.bi.h();
        }
        return this.bi.b[\u2603 - 1];
    }
    
    @Override
    public zx bA() {
        return this.bi.h();
    }
    
    @Override
    public void c(final int \u2603, final zx \u2603) {
        this.bi.b[\u2603] = \u2603;
    }
    
    @Override
    public boolean f(final wn \u2603) {
        if (!this.ax()) {
            return false;
        }
        if (\u2603.v()) {
            return false;
        }
        final auq bo = this.bO();
        return bo == null || \u2603 == null || \u2603.bO() != bo || !bo.h();
    }
    
    public abstract boolean v();
    
    @Override
    public zx[] as() {
        return this.bi.b;
    }
    
    @Override
    public boolean aL() {
        return !this.bA.b;
    }
    
    public auo cp() {
        return this.o.Z();
    }
    
    @Override
    public auq bO() {
        return this.cp().h(this.e_());
    }
    
    @Override
    public eu f_() {
        final eu eu = new fa(aul.a(this.bO(), this.e_()));
        eu.b().a(new et(et.a.e, "/msg " + this.e_() + " "));
        eu.b().a(this.aQ());
        eu.b().a(this.e_());
        return eu;
    }
    
    @Override
    public float aS() {
        float n = 1.62f;
        if (this.bJ()) {
            n = 0.2f;
        }
        if (this.av()) {
            n -= 0.08f;
        }
        return n;
    }
    
    @Override
    public void m(float \u2603) {
        if (\u2603 < 0.0f) {
            \u2603 = 0.0f;
        }
        this.H().b(17, \u2603);
    }
    
    @Override
    public float bN() {
        return this.H().d(17);
    }
    
    public static UUID a(final GameProfile \u2603) {
        UUID uuid = \u2603.getId();
        if (uuid == null) {
            uuid = b(\u2603.getName());
        }
        return uuid;
    }
    
    public static UUID b(final String \u2603) {
        return UUID.nameUUIDFromBytes(("OfflinePlayer:" + \u2603).getBytes(Charsets.UTF_8));
    }
    
    public boolean a(final on \u2603) {
        if (\u2603.a()) {
            return true;
        }
        final zx bz = this.bZ();
        return bz != null && bz.s() && bz.q().equals(\u2603.b());
    }
    
    public boolean a(final wo \u2603) {
        return (this.H().a(10) & \u2603.a()) == \u2603.a();
    }
    
    @Override
    public boolean u_() {
        return MinecraftServer.N().d[0].Q().b("sendCommandFeedback");
    }
    
    @Override
    public boolean d(final int \u2603, final zx \u2603) {
        if (\u2603 >= 0 && \u2603 < this.bi.a.length) {
            this.bi.a(\u2603, \u2603);
            return true;
        }
        final int n = \u2603 - 100;
        if (n >= 0 && n < this.bi.b.length) {
            final int \u26032 = n + 1;
            if (\u2603 != null && \u2603.b() != null) {
                if (\u2603.b() instanceof yj) {
                    if (ps.c(\u2603) != \u26032) {
                        return false;
                    }
                }
                else if (\u26032 != 4 || (\u2603.b() != zy.bX && !(\u2603.b() instanceof yo))) {
                    return false;
                }
            }
            this.bi.a(n + this.bi.a.length, \u2603);
            return true;
        }
        final int \u26032 = \u2603 - 200;
        if (\u26032 >= 0 && \u26032 < this.a.o_()) {
            this.a.a(\u26032, \u2603);
            return true;
        }
        return false;
    }
    
    public boolean cq() {
        return this.bI;
    }
    
    public void k(final boolean \u2603) {
        this.bI = \u2603;
    }
    
    public enum b
    {
        a(0, "options.chat.visibility.full"), 
        b(1, "options.chat.visibility.system"), 
        c(2, "options.chat.visibility.hidden");
        
        private static final b[] d;
        private final int e;
        private final String f;
        
        private b(final int \u2603, final String \u2603) {
            this.e = \u2603;
            this.f = \u2603;
        }
        
        public int a() {
            return this.e;
        }
        
        public static b a(final int \u2603) {
            return b.d[\u2603 % b.d.length];
        }
        
        public String b() {
            return this.f;
        }
        
        static {
            d = new b[values().length];
            for (final b b2 : values()) {
                b.d[b2.e] = b2;
            }
        }
    }
    
    public enum a
    {
        a, 
        b, 
        c, 
        d, 
        e, 
        f;
    }
}
