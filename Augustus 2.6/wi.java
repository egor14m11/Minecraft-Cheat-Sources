import java.util.Random;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.5.36
// 

public class wi extends ph implements acy, wh
{
    private int bn;
    private boolean bo;
    private boolean bp;
    tf bm;
    private wn bq;
    private ada br;
    private int bs;
    private boolean bt;
    private boolean bu;
    private int bv;
    private String bw;
    private int bx;
    private int by;
    private boolean bz;
    private boolean bA;
    private oq bB;
    private static final f[][][][] bC;
    
    public wi(final adm \u2603) {
        this(\u2603, 0);
    }
    
    public wi(final adm \u2603, final int \u2603) {
        super(\u2603);
        this.bB = new oq("Items", false, 8);
        this.r(\u2603);
        this.a(0.6f, 1.8f);
        ((sv)this.s()).b(true);
        ((sv)this.s()).a(true);
        this.i.a(0, new ra(this));
        this.i.a(1, new qs<Object>(this, we.class, 8.0f, 0.6, 0.6));
        this.i.a(1, new si(this));
        this.i.a(1, new rj(this));
        this.i.a(2, new rm(this));
        this.i.a(3, new sb(this));
        this.i.a(4, new ru(this, true));
        this.i.a(5, new rp(this, 0.6));
        this.i.a(6, new rk(this));
        this.i.a(7, new sg(this));
        this.i.a(9, new rg(this, wn.class, 3.0f, 1.0f));
        this.i.a(9, new sj(this));
        this.i.a(9, new rz(this, 0.6));
        this.i.a(10, new ri(this, ps.class, 8.0f));
        this.j(true);
    }
    
    private void cv() {
        if (this.bA) {
            return;
        }
        this.bA = true;
        if (this.j_()) {
            this.i.a(8, new rw(this, 0.32));
        }
        else if (this.cl() == 0) {
            this.i.a(6, new rf(this, 0.6));
        }
    }
    
    @Override
    protected void n() {
        if (this.cl() == 0) {
            this.i.a(8, new rf(this, 0.6));
        }
        super.n();
    }
    
    @Override
    protected void aX() {
        super.aX();
        this.a(vy.d).a(0.5);
    }
    
    @Override
    protected void E() {
        final int bn = this.bn - 1;
        this.bn = bn;
        if (bn <= 0) {
            final cj cj = new cj(this);
            this.o.ae().a(cj);
            this.bn = 70 + this.V.nextInt(50);
            this.bm = this.o.ae().a(cj, 32);
            if (this.bm == null) {
                this.cj();
            }
            else {
                final cj a = this.bm.a();
                this.a(a, (int)(this.bm.b() * 1.0f));
                if (this.bz) {
                    this.bz = false;
                    this.bm.b(5);
                }
            }
        }
        if (!this.co() && this.bs > 0) {
            --this.bs;
            if (this.bs <= 0) {
                if (this.bt) {
                    for (final acz acz : this.br) {
                        if (acz.h()) {
                            acz.a(this.V.nextInt(6) + this.V.nextInt(6) + 2);
                        }
                    }
                    this.cw();
                    this.bt = false;
                    if (this.bm != null && this.bw != null) {
                        this.o.a(this, (byte)14);
                        this.bm.a(this.bw, 1);
                    }
                }
                this.c(new pf(pe.l.H, 200, 0));
            }
        }
        super.E();
    }
    
    @Override
    public boolean a(final wn \u2603) {
        final zx h = \u2603.bi.h();
        final boolean b = h != null && h.b() == zy.bJ;
        if (!b && this.ai() && !this.co() && !this.j_()) {
            if (!this.o.D && (this.br == null || this.br.size() > 0)) {
                this.a_(\u2603);
                \u2603.a((acy)this);
            }
            \u2603.b(na.F);
            return true;
        }
        return super.a(\u2603);
    }
    
    @Override
    protected void h() {
        super.h();
        this.ac.a(16, Integer.valueOf(0));
    }
    
    @Override
    public void b(final dn \u2603) {
        super.b(\u2603);
        \u2603.a("Profession", this.cl());
        \u2603.a("Riches", this.bv);
        \u2603.a("Career", this.bx);
        \u2603.a("CareerLevel", this.by);
        \u2603.a("Willing", this.bu);
        if (this.br != null) {
            \u2603.a("Offers", this.br.a());
        }
        final du \u26032 = new du();
        for (int i = 0; i < this.bB.o_(); ++i) {
            final zx a = this.bB.a(i);
            if (a != null) {
                \u26032.a(a.b(new dn()));
            }
        }
        \u2603.a("Inventory", \u26032);
    }
    
    @Override
    public void a(final dn \u2603) {
        super.a(\u2603);
        this.r(\u2603.f("Profession"));
        this.bv = \u2603.f("Riches");
        this.bx = \u2603.f("Career");
        this.by = \u2603.f("CareerLevel");
        this.bu = \u2603.n("Willing");
        if (\u2603.b("Offers", 10)) {
            final dn m = \u2603.m("Offers");
            this.br = new ada(m);
        }
        final du c = \u2603.c("Inventory", 10);
        for (int i = 0; i < c.c(); ++i) {
            final zx a = zx.a(c.b(i));
            if (a != null) {
                this.bB.a(a);
            }
        }
        this.j(true);
        this.cv();
    }
    
    @Override
    protected boolean C() {
        return false;
    }
    
    @Override
    protected String z() {
        if (this.co()) {
            return "mob.villager.haggle";
        }
        return "mob.villager.idle";
    }
    
    @Override
    protected String bo() {
        return "mob.villager.hit";
    }
    
    @Override
    protected String bp() {
        return "mob.villager.death";
    }
    
    public void r(final int \u2603) {
        this.ac.b(16, \u2603);
    }
    
    public int cl() {
        return Math.max(this.ac.c(16) % 5, 0);
    }
    
    public boolean cm() {
        return this.bo;
    }
    
    public void l(final boolean \u2603) {
        this.bo = \u2603;
    }
    
    public void m(final boolean \u2603) {
        this.bp = \u2603;
    }
    
    public boolean cn() {
        return this.bp;
    }
    
    @Override
    public void b(final pr \u2603) {
        super.b(\u2603);
        if (this.bm != null && \u2603 != null) {
            this.bm.a(\u2603);
            if (\u2603 instanceof wn) {
                int \u26032 = -1;
                if (this.j_()) {
                    \u26032 = -3;
                }
                this.bm.a(\u2603.e_(), \u26032);
                if (this.ai()) {
                    this.o.a(this, (byte)13);
                }
            }
        }
    }
    
    @Override
    public void a(final ow \u2603) {
        if (this.bm != null) {
            final pk j = \u2603.j();
            if (j != null) {
                if (j instanceof wn) {
                    this.bm.a(j.e_(), -2);
                }
                else if (j instanceof vq) {
                    this.bm.h();
                }
            }
            else {
                final wn a = this.o.a(this, 16.0);
                if (a != null) {
                    this.bm.h();
                }
            }
        }
        super.a(\u2603);
    }
    
    @Override
    public void a_(final wn \u2603) {
        this.bq = \u2603;
    }
    
    @Override
    public wn v_() {
        return this.bq;
    }
    
    public boolean co() {
        return this.bq != null;
    }
    
    public boolean n(final boolean \u2603) {
        if (!this.bu && \u2603 && this.cr()) {
            boolean b = false;
            for (int i = 0; i < this.bB.o_(); ++i) {
                final zx a = this.bB.a(i);
                if (a != null) {
                    if (a.b() == zy.P && a.b >= 3) {
                        b = true;
                        this.bB.a(i, 3);
                    }
                    else if ((a.b() == zy.bS || a.b() == zy.bR) && a.b >= 12) {
                        b = true;
                        this.bB.a(i, 12);
                    }
                }
                if (b) {
                    this.o.a(this, (byte)18);
                    this.bu = true;
                    break;
                }
            }
        }
        return this.bu;
    }
    
    public void o(final boolean \u2603) {
        this.bu = \u2603;
    }
    
    @Override
    public void a(final acz \u2603) {
        \u2603.g();
        this.a_ = -this.w();
        this.a("mob.villager.yes", this.bB(), this.bC());
        int \u26032 = 3 + this.V.nextInt(4);
        if (\u2603.e() == 1 || this.V.nextInt(5) == 0) {
            this.bs = 40;
            this.bt = true;
            this.bu = true;
            if (this.bq != null) {
                this.bw = this.bq.e_();
            }
            else {
                this.bw = null;
            }
            \u26032 += 5;
        }
        if (\u2603.a().b() == zy.bO) {
            this.bv += \u2603.a().b;
        }
        if (\u2603.j()) {
            this.o.d(new pp(this.o, this.s, this.t + 0.5, this.u, \u26032));
        }
    }
    
    @Override
    public void a_(final zx \u2603) {
        if (!this.o.D && this.a_ > -this.w() + 20) {
            this.a_ = -this.w();
            if (\u2603 != null) {
                this.a("mob.villager.yes", this.bB(), this.bC());
            }
            else {
                this.a("mob.villager.no", this.bB(), this.bC());
            }
        }
    }
    
    @Override
    public ada b_(final wn \u2603) {
        if (this.br == null) {
            this.cw();
        }
        return this.br;
    }
    
    private void cw() {
        final f[][][] array = wi.bC[this.cl()];
        if (this.bx == 0 || this.by == 0) {
            this.bx = this.V.nextInt(array.length) + 1;
            this.by = 1;
        }
        else {
            ++this.by;
        }
        if (this.br == null) {
            this.br = new ada();
        }
        final int n = this.bx - 1;
        final int n2 = this.by - 1;
        final f[][] array2 = array[n];
        if (n2 >= 0 && n2 < array2.length) {
            final f[] array4;
            final f[] array3 = array4 = array2[n2];
            for (final f f : array4) {
                f.a(this.br, this.V);
            }
        }
    }
    
    @Override
    public void a(final ada \u2603) {
    }
    
    @Override
    public eu f_() {
        final String am = this.aM();
        if (am != null && am.length() > 0) {
            final fa fa = new fa(am);
            fa.b().a(this.aQ());
            fa.b().a(this.aK().toString());
            return fa;
        }
        if (this.br == null) {
            this.cw();
        }
        String str = null;
        switch (this.cl()) {
            case 0: {
                if (this.bx == 1) {
                    str = "farmer";
                    break;
                }
                if (this.bx == 2) {
                    str = "fisherman";
                    break;
                }
                if (this.bx == 3) {
                    str = "shepherd";
                    break;
                }
                if (this.bx == 4) {
                    str = "fletcher";
                    break;
                }
                break;
            }
            case 1: {
                str = "librarian";
                break;
            }
            case 2: {
                str = "cleric";
                break;
            }
            case 3: {
                if (this.bx == 1) {
                    str = "armor";
                    break;
                }
                if (this.bx == 2) {
                    str = "weapon";
                    break;
                }
                if (this.bx == 3) {
                    str = "tool";
                    break;
                }
                break;
            }
            case 4: {
                if (this.bx == 1) {
                    str = "butcher";
                    break;
                }
                if (this.bx == 2) {
                    str = "leather";
                    break;
                }
                break;
            }
        }
        if (str != null) {
            final fb fb = new fb("entity.Villager." + str, new Object[0]);
            fb.b().a(this.aQ());
            fb.b().a(this.aK().toString());
            return fb;
        }
        return super.f_();
    }
    
    @Override
    public float aS() {
        float n = 1.62f;
        if (this.j_()) {
            n -= (float)0.81;
        }
        return n;
    }
    
    @Override
    public void a(final byte \u2603) {
        if (\u2603 == 12) {
            this.a(cy.I);
        }
        else if (\u2603 == 13) {
            this.a(cy.u);
        }
        else if (\u2603 == 14) {
            this.a(cy.v);
        }
        else {
            super.a(\u2603);
        }
    }
    
    private void a(final cy \u2603) {
        for (int i = 0; i < 5; ++i) {
            final double \u26032 = this.V.nextGaussian() * 0.02;
            final double \u26033 = this.V.nextGaussian() * 0.02;
            final double \u26034 = this.V.nextGaussian() * 0.02;
            this.o.a(\u2603, this.s + this.V.nextFloat() * this.J * 2.0f - this.J, this.t + 1.0 + this.V.nextFloat() * this.K, this.u + this.V.nextFloat() * this.J * 2.0f - this.J, \u26032, \u26033, \u26034, new int[0]);
        }
    }
    
    @Override
    public pu a(final ok \u2603, pu \u2603) {
        \u2603 = super.a(\u2603, \u2603);
        this.r(this.o.s.nextInt(5));
        this.cv();
        return \u2603;
    }
    
    public void cp() {
        this.bz = true;
    }
    
    public wi b(final ph \u2603) {
        final wi \u26032 = new wi(this.o);
        \u26032.a(this.o.E(new cj(\u26032)), null);
        return \u26032;
    }
    
    @Override
    public boolean cb() {
        return false;
    }
    
    @Override
    public void a(final uv \u2603) {
        if (this.o.D || this.I) {
            return;
        }
        final wd wd = new wd(this.o);
        wd.b(this.s, this.t, this.u, this.y, this.z);
        wd.a(this.o.E(new cj(wd)), null);
        wd.k(this.ce());
        if (this.l_()) {
            wd.a(this.aM());
            wd.g(this.aN());
        }
        this.o.d(wd);
        this.J();
    }
    
    public oq cq() {
        return this.bB;
    }
    
    @Override
    protected void a(final uz \u2603) {
        final zx l = \u2603.l();
        final zw b = l.b();
        if (this.a(b)) {
            final zx a = this.bB.a(l);
            if (a == null) {
                \u2603.J();
            }
            else {
                l.b = a.b;
            }
        }
    }
    
    private boolean a(final zw \u2603) {
        return \u2603 == zy.P || \u2603 == zy.bS || \u2603 == zy.bR || \u2603 == zy.O || \u2603 == zy.N;
    }
    
    public boolean cr() {
        return this.s(1);
    }
    
    public boolean cs() {
        return this.s(2);
    }
    
    public boolean ct() {
        final boolean b = this.cl() == 0;
        if (b) {
            return !this.s(5);
        }
        return !this.s(1);
    }
    
    private boolean s(final int \u2603) {
        final boolean b = this.cl() == 0;
        for (int i = 0; i < this.bB.o_(); ++i) {
            final zx a = this.bB.a(i);
            if (a != null) {
                if ((a.b() == zy.P && a.b >= 3 * \u2603) || (a.b() == zy.bS && a.b >= 12 * \u2603) || (a.b() == zy.bR && a.b >= 12 * \u2603)) {
                    return true;
                }
                if (b && a.b() == zy.O && a.b >= 9 * \u2603) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public boolean cu() {
        for (int i = 0; i < this.bB.o_(); ++i) {
            final zx a = this.bB.a(i);
            if (a != null && (a.b() == zy.N || a.b() == zy.bS || a.b() == zy.bR)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public boolean d(final int \u2603, final zx \u2603) {
        if (super.d(\u2603, \u2603)) {
            return true;
        }
        final int \u26032 = \u2603 - 300;
        if (\u26032 >= 0 && \u26032 < this.bB.o_()) {
            this.bB.a(\u26032, \u2603);
            return true;
        }
        return false;
    }
    
    static {
        bC = new f[][][][] { { { { new a(zy.O, new g(18, 22)), new a(zy.bS, new g(15, 19)), new a(zy.bR, new g(15, 19)), new e(zy.P, new g(-4, -2)) }, { new a(zw.a(afi.aU), new g(8, 13)), new e(zy.ca, new g(-3, -2)) }, { new a(zw.a(afi.bk), new g(7, 12)), new e(zy.e, new g(-5, -7)) }, { new e(zy.bc, new g(-6, -10)), new e(zy.aZ, new g(1, 1)) } }, { { new a(zy.F, new g(15, 20)), new a(zy.h, new g(16, 24)), new d(zy.aU, new g(6, 6), zy.aV, new g(6, 6)) }, { new c(zy.aR, new g(7, 8)) } }, { { new a(zw.a(afi.L), new g(16, 22)), new e(zy.be, new g(3, 4)) }, { new e(new zx(zw.a(afi.L), 1, 0), new g(1, 2)), new e(new zx(zw.a(afi.L), 1, 1), new g(1, 2)), new e(new zx(zw.a(afi.L), 1, 2), new g(1, 2)), new e(new zx(zw.a(afi.L), 1, 3), new g(1, 2)), new e(new zx(zw.a(afi.L), 1, 4), new g(1, 2)), new e(new zx(zw.a(afi.L), 1, 5), new g(1, 2)), new e(new zx(zw.a(afi.L), 1, 6), new g(1, 2)), new e(new zx(zw.a(afi.L), 1, 7), new g(1, 2)), new e(new zx(zw.a(afi.L), 1, 8), new g(1, 2)), new e(new zx(zw.a(afi.L), 1, 9), new g(1, 2)), new e(new zx(zw.a(afi.L), 1, 10), new g(1, 2)), new e(new zx(zw.a(afi.L), 1, 11), new g(1, 2)), new e(new zx(zw.a(afi.L), 1, 12), new g(1, 2)), new e(new zx(zw.a(afi.L), 1, 13), new g(1, 2)), new e(new zx(zw.a(afi.L), 1, 14), new g(1, 2)), new e(new zx(zw.a(afi.L), 1, 15), new g(1, 2)) } }, { { new a(zy.F, new g(15, 20)), new e(zy.g, new g(-12, -8)) }, { new e(zy.f, new g(2, 3)), new d(zw.a(afi.n), new g(10, 10), zy.ak, new g(6, 10)) } } }, { { { new a(zy.aK, new g(24, 36)), new b() }, { new a(zy.aL, new g(8, 10)), new e(zy.aQ, new g(10, 12)), new e(zw.a(afi.X), new g(3, 4)) }, { new a(zy.bN, new g(2, 2)), new e(zy.aS, new g(10, 12)), new e(zw.a(afi.w), new g(-5, -3)) }, { new b() }, { new b() }, { new e(zy.co, new g(20, 22)) } } }, { { { new a(zy.bt, new g(36, 40)), new a(zy.k, new g(8, 10)) }, { new e(zy.aC, new g(-4, -1)), new e(new zx(zy.aW, 1, zd.l.b()), new g(-2, -1)) }, { new e(zy.bH, new g(7, 11)), new e(zw.a(afi.aX), new g(-3, -1)) }, { new e(zy.bK, new g(3, 11)) } } }, { { { new a(zy.h, new g(16, 24)), new e(zy.Y, new g(4, 6)) }, { new a(zy.j, new g(7, 9)), new e(zy.Z, new g(10, 14)) }, { new a(zy.i, new g(3, 4)), new c(zy.ad, new g(16, 19)) }, { new e(zy.X, new g(5, 7)), new e(zy.W, new g(9, 11)), new e(zy.U, new g(5, 7)), new e(zy.V, new g(11, 15)) } }, { { new a(zy.h, new g(16, 24)), new e(zy.c, new g(6, 8)) }, { new a(zy.j, new g(7, 9)), new c(zy.l, new g(9, 10)) }, { new a(zy.i, new g(3, 4)), new c(zy.u, new g(12, 15)), new c(zy.x, new g(9, 12)) } }, { { new a(zy.h, new g(16, 24)), new c(zy.a, new g(5, 7)) }, { new a(zy.j, new g(7, 9)), new c(zy.b, new g(9, 11)) }, { new a(zy.i, new g(3, 4)), new c(zy.w, new g(12, 15)) } } }, { { { new a(zy.al, new g(14, 18)), new a(zy.bk, new g(14, 18)) }, { new a(zy.h, new g(16, 24)), new e(zy.am, new g(-7, -5)), new e(zy.bl, new g(-8, -6)) } }, { { new a(zy.aF, new g(9, 12)), new e(zy.S, new g(2, 4)) }, { new c(zy.R, new g(7, 12)) }, { new e(zy.aA, new g(8, 10)) } } } };
    }
    
    static class g extends nz<Integer, Integer>
    {
        public g(final int \u2603, final int \u2603) {
            super(\u2603, \u2603);
        }
        
        public int a(final Random \u2603) {
            if (((nz<Integer, B>)this).a() >= ((nz<A, Integer>)this).b()) {
                return ((nz<Integer, B>)this).a();
            }
            return ((nz<Integer, B>)this).a() + \u2603.nextInt(((nz<A, Integer>)this).b() - ((nz<Integer, B>)this).a() + 1);
        }
    }
    
    static class a implements f
    {
        public zw a;
        public g b;
        
        public a(final zw \u2603, final g \u2603) {
            this.a = \u2603;
            this.b = \u2603;
        }
        
        @Override
        public void a(final ada \u2603, final Random \u2603) {
            int a = 1;
            if (this.b != null) {
                a = this.b.a(\u2603);
            }
            \u2603.add(new acz(new zx(this.a, a, 0), zy.bO));
        }
    }
    
    static class e implements f
    {
        public zx a;
        public g b;
        
        public e(final zw \u2603, final g \u2603) {
            this.a = new zx(\u2603);
            this.b = \u2603;
        }
        
        public e(final zx \u2603, final g \u2603) {
            this.a = \u2603;
            this.b = \u2603;
        }
        
        @Override
        public void a(final ada \u2603, final Random \u2603) {
            int a = 1;
            if (this.b != null) {
                a = this.b.a(\u2603);
            }
            zx \u26032;
            zx \u26033;
            if (a < 0) {
                \u26032 = new zx(zy.bO, 1, 0);
                \u26033 = new zx(this.a.b(), -a, this.a.i());
            }
            else {
                \u26032 = new zx(zy.bO, a, 0);
                \u26033 = new zx(this.a.b(), 1, this.a.i());
            }
            \u2603.add(new acz(\u26032, \u26033));
        }
    }
    
    static class c implements f
    {
        public zx a;
        public g b;
        
        public c(final zw \u2603, final g \u2603) {
            this.a = new zx(\u2603);
            this.b = \u2603;
        }
        
        @Override
        public void a(final ada \u2603, final Random \u2603) {
            int a = 1;
            if (this.b != null) {
                a = this.b.a(\u2603);
            }
            final zx \u26032 = new zx(zy.bO, a, 0);
            zx a2 = new zx(this.a.b(), 1, this.a.i());
            a2 = ack.a(\u2603, a2, 5 + \u2603.nextInt(15));
            \u2603.add(new acz(\u26032, a2));
        }
    }
    
    static class b implements f
    {
        public b() {
        }
        
        @Override
        public void a(final ada \u2603, final Random \u2603) {
            final aci \u26032 = aci.b[\u2603.nextInt(aci.b.length)];
            final int a = ns.a(\u2603, \u26032.e(), \u26032.b());
            final zx a2 = zy.cd.a(new acl(\u26032, a));
            int \u26033 = 2 + \u2603.nextInt(5 + a * 10) + 3 * a;
            if (\u26033 > 64) {
                \u26033 = 64;
            }
            \u2603.add(new acz(new zx(zy.aL), new zx(zy.bO, \u26033), a2));
        }
    }
    
    static class d implements f
    {
        public zx a;
        public g b;
        public zx c;
        public g d;
        
        public d(final zw \u2603, final g \u2603, final zw \u2603, final g \u2603) {
            this.a = new zx(\u2603);
            this.b = \u2603;
            this.c = new zx(\u2603);
            this.d = \u2603;
        }
        
        @Override
        public void a(final ada \u2603, final Random \u2603) {
            int a = 1;
            if (this.b != null) {
                a = this.b.a(\u2603);
            }
            int a2 = 1;
            if (this.d != null) {
                a2 = this.d.a(\u2603);
            }
            \u2603.add(new acz(new zx(this.a.b(), a, this.a.i()), new zx(zy.bO), new zx(this.c.b(), a2, this.c.i())));
        }
    }
    
    interface f
    {
        void a(final ada p0, final Random p1);
    }
}
