import java.util.Iterator;
import java.util.List;
import com.google.common.base.Predicate;

// 
// Decompiled by Procyon v0.5.36
// 

public class tp extends tm implements oh
{
    private static final Predicate<pk> bs;
    private static final qb bt;
    private static final String[] bu;
    private static final String[] bv;
    private static final int[] bw;
    private static final String[] bx;
    private static final String[] by;
    private static final String[] bz;
    private static final String[] bA;
    private int bB;
    private int bC;
    private int bD;
    public int bm;
    public int bo;
    protected boolean bp;
    private xj bE;
    private boolean bF;
    protected int bq;
    protected float br;
    private boolean bG;
    private float bH;
    private float bI;
    private float bJ;
    private float bK;
    private float bL;
    private float bM;
    private int bN;
    private String bO;
    private String[] bP;
    private boolean bQ;
    
    public tp(final adm \u2603) {
        super(\u2603);
        this.bP = new String[3];
        this.bQ = false;
        this.a(1.4f, 1.6f);
        this.o(this.ab = false);
        ((sv)this.s()).a(true);
        this.i.a(0, new ra(this));
        this.i.a(1, new rv(this, 1.2));
        this.i.a(1, new sd(this, 1.2));
        this.i.a(2, new qv(this, 1.0));
        this.i.a(4, new rc(this, 1.0));
        this.i.a(6, new rz(this, 0.7));
        this.i.a(7, new ri(this, wn.class, 6.0f));
        this.i.a(8, new ry(this));
        this.da();
    }
    
    @Override
    protected void h() {
        super.h();
        this.ac.a(16, Integer.valueOf(0));
        this.ac.a(19, (Byte)0);
        this.ac.a(20, Integer.valueOf(0));
        this.ac.a(21, String.valueOf(""));
        this.ac.a(22, Integer.valueOf(0));
    }
    
    public void r(final int \u2603) {
        this.ac.b(19, (byte)\u2603);
        this.dc();
    }
    
    public int cl() {
        return this.ac.a(19);
    }
    
    public void s(final int \u2603) {
        this.ac.b(20, \u2603);
        this.dc();
    }
    
    public int cm() {
        return this.ac.c(20);
    }
    
    @Override
    public String e_() {
        if (this.l_()) {
            return this.aM();
        }
        final int cl = this.cl();
        switch (cl) {
            default: {
                return di.a("entity.horse.name");
            }
            case 1: {
                return di.a("entity.donkey.name");
            }
            case 2: {
                return di.a("entity.mule.name");
            }
            case 4: {
                return di.a("entity.skeletonhorse.name");
            }
            case 3: {
                return di.a("entity.zombiehorse.name");
            }
        }
    }
    
    private boolean w(final int \u2603) {
        return (this.ac.c(16) & \u2603) != 0x0;
    }
    
    private void c(final int \u2603, final boolean \u2603) {
        final int c = this.ac.c(16);
        if (\u2603) {
            this.ac.b(16, c | \u2603);
        }
        else {
            this.ac.b(16, c & ~\u2603);
        }
    }
    
    public boolean cn() {
        return !this.j_();
    }
    
    public boolean co() {
        return this.w(2);
    }
    
    public boolean cp() {
        return this.cn();
    }
    
    public String ct() {
        return this.ac.e(21);
    }
    
    public void b(final String \u2603) {
        this.ac.b(21, \u2603);
    }
    
    public float cu() {
        return 0.5f;
    }
    
    @Override
    public void a(final boolean \u2603) {
        if (\u2603) {
            this.a(this.cu());
        }
        else {
            this.a(1.0f);
        }
    }
    
    public boolean cv() {
        return this.bp;
    }
    
    public void l(final boolean \u2603) {
        this.c(2, \u2603);
    }
    
    public void m(final boolean \u2603) {
        this.bp = \u2603;
    }
    
    @Override
    public boolean cb() {
        return !this.cR() && super.cb();
    }
    
    @Override
    protected void o(final float \u2603) {
        if (\u2603 > 6.0f && this.cy()) {
            this.r(false);
        }
    }
    
    public boolean cw() {
        return this.w(8);
    }
    
    public int cx() {
        return this.ac.c(22);
    }
    
    private int f(final zx \u2603) {
        if (\u2603 == null) {
            return 0;
        }
        final zw b = \u2603.b();
        if (b == zy.ck) {
            return 1;
        }
        if (b == zy.cl) {
            return 2;
        }
        if (b == zy.cm) {
            return 3;
        }
        return 0;
    }
    
    public boolean cy() {
        return this.w(32);
    }
    
    public boolean cz() {
        return this.w(64);
    }
    
    public boolean cA() {
        return this.w(16);
    }
    
    public boolean cB() {
        return this.bF;
    }
    
    public void e(final zx \u2603) {
        this.ac.b(22, this.f(\u2603));
        this.dc();
    }
    
    public void n(final boolean \u2603) {
        this.c(16, \u2603);
    }
    
    public void o(final boolean \u2603) {
        this.c(8, \u2603);
    }
    
    public void p(final boolean \u2603) {
        this.bF = \u2603;
    }
    
    public void q(final boolean \u2603) {
        this.c(4, \u2603);
    }
    
    public int cC() {
        return this.bq;
    }
    
    public void t(final int \u2603) {
        this.bq = \u2603;
    }
    
    public int u(final int \u2603) {
        final int a = ns.a(this.cC() + \u2603, 0, this.cI());
        this.t(a);
        return a;
    }
    
    @Override
    public boolean a(final ow \u2603, final float \u2603) {
        final pk j = \u2603.j();
        return (this.l == null || !this.l.equals(j)) && super.a(\u2603, \u2603);
    }
    
    @Override
    public int br() {
        return tp.bw[this.cx()];
    }
    
    @Override
    public boolean ae() {
        return this.l == null;
    }
    
    public boolean cD() {
        final int c = ns.c(this.s);
        final int c2 = ns.c(this.u);
        this.o.b(new cj(c, 0, c2));
        return true;
    }
    
    public void cE() {
        if (this.o.D || !this.cw()) {
            return;
        }
        this.a(zw.a(afi.ae), 1);
        this.o(false);
    }
    
    private void cY() {
        this.df();
        if (!this.R()) {
            this.o.a(this, "eating", 1.0f, 1.0f + (this.V.nextFloat() - this.V.nextFloat()) * 0.2f);
        }
    }
    
    @Override
    public void e(final float \u2603, final float \u2603) {
        if (\u2603 > 1.0f) {
            this.a("mob.horse.land", 0.4f, 1.0f);
        }
        final int f = ns.f((\u2603 * 0.5f - 3.0f) * \u2603);
        if (f <= 0) {
            return;
        }
        this.a(ow.i, (float)f);
        if (this.l != null) {
            this.l.a(ow.i, (float)f);
        }
        final afh c = this.o.p(new cj(this.s, this.t - 0.2 - this.A, this.u)).c();
        if (c.t() != arm.a && !this.R()) {
            final afh.b h = c.H;
            this.o.a(this, h.c(), h.d() * 0.5f, h.e() * 0.75f);
        }
    }
    
    private int cZ() {
        final int cl = this.cl();
        if (this.cw() && (cl == 1 || cl == 2)) {
            return 17;
        }
        return 2;
    }
    
    private void da() {
        final xj be = this.bE;
        (this.bE = new xj("HorseChest", this.cZ())).a(this.e_());
        if (be != null) {
            be.b(this);
            for (int min = Math.min(be.o_(), this.bE.o_()), i = 0; i < min; ++i) {
                final zx a = be.a(i);
                if (a != null) {
                    this.bE.a(i, a.k());
                }
            }
        }
        this.bE.a(this);
        this.db();
    }
    
    private void db() {
        if (!this.o.D) {
            this.q(this.bE.a(0) != null);
            if (this.cO()) {
                this.e(this.bE.a(1));
            }
        }
    }
    
    @Override
    public void a(final oq \u2603) {
        final int cx = this.cx();
        final boolean cg = this.cG();
        this.db();
        if (this.W > 20) {
            if (cx == 0 && cx != this.cx()) {
                this.a("mob.horse.armor", 0.5f, 1.0f);
            }
            else if (cx != this.cx()) {
                this.a("mob.horse.armor", 0.5f, 1.0f);
            }
            if (!cg && this.cG()) {
                this.a("mob.horse.leather", 0.5f, 1.0f);
            }
        }
    }
    
    @Override
    public boolean bR() {
        this.cD();
        return super.bR();
    }
    
    protected tp a(final pk \u2603, final double \u2603) {
        double n = Double.MAX_VALUE;
        pk pk = null;
        final List<pk> a = this.o.a(\u2603, \u2603.aR().a(\u2603, \u2603, \u2603), tp.bs);
        for (final pk pk2 : a) {
            final double e = pk2.e(\u2603.s, \u2603.t, \u2603.u);
            if (e < n) {
                pk = pk2;
                n = e;
            }
        }
        return (tp)pk;
    }
    
    public double cF() {
        return this.a(tp.bt).e();
    }
    
    @Override
    protected String bp() {
        this.df();
        final int cl = this.cl();
        if (cl == 3) {
            return "mob.horse.zombie.death";
        }
        if (cl == 4) {
            return "mob.horse.skeleton.death";
        }
        if (cl == 1 || cl == 2) {
            return "mob.horse.donkey.death";
        }
        return "mob.horse.death";
    }
    
    @Override
    protected zw A() {
        final boolean b = this.V.nextInt(4) == 0;
        final int cl = this.cl();
        if (cl == 4) {
            return zy.aX;
        }
        if (cl != 3) {
            return zy.aF;
        }
        if (b) {
            return null;
        }
        return zy.bt;
    }
    
    @Override
    protected String bo() {
        this.df();
        if (this.V.nextInt(3) == 0) {
            this.dh();
        }
        final int cl = this.cl();
        if (cl == 3) {
            return "mob.horse.zombie.hit";
        }
        if (cl == 4) {
            return "mob.horse.skeleton.hit";
        }
        if (cl == 1 || cl == 2) {
            return "mob.horse.donkey.hit";
        }
        return "mob.horse.hit";
    }
    
    public boolean cG() {
        return this.w(4);
    }
    
    @Override
    protected String z() {
        this.df();
        if (this.V.nextInt(10) == 0 && !this.bD()) {
            this.dh();
        }
        final int cl = this.cl();
        if (cl == 3) {
            return "mob.horse.zombie.idle";
        }
        if (cl == 4) {
            return "mob.horse.skeleton.idle";
        }
        if (cl == 1 || cl == 2) {
            return "mob.horse.donkey.idle";
        }
        return "mob.horse.idle";
    }
    
    protected String cH() {
        this.df();
        this.dh();
        final int cl = this.cl();
        if (cl == 3 || cl == 4) {
            return null;
        }
        if (cl == 1 || cl == 2) {
            return "mob.horse.donkey.angry";
        }
        return "mob.horse.angry";
    }
    
    @Override
    protected void a(final cj \u2603, final afh \u2603) {
        afh.b b = \u2603.H;
        if (this.o.p(\u2603.a()).c() == afi.aH) {
            b = afi.aH.H;
        }
        if (!\u2603.t().d()) {
            final int cl = this.cl();
            if (this.l != null && cl != 1 && cl != 2) {
                ++this.bN;
                if (this.bN > 5 && this.bN % 3 == 0) {
                    this.a("mob.horse.gallop", b.d() * 0.15f, b.e());
                    if (cl == 0 && this.V.nextInt(10) == 0) {
                        this.a("mob.horse.breathe", b.d() * 0.6f, b.e());
                    }
                }
                else if (this.bN <= 5) {
                    this.a("mob.horse.wood", b.d() * 0.15f, b.e());
                }
            }
            else if (b == afh.f) {
                this.a("mob.horse.wood", b.d() * 0.15f, b.e());
            }
            else {
                this.a("mob.horse.soft", b.d() * 0.15f, b.e());
            }
        }
    }
    
    @Override
    protected void aX() {
        super.aX();
        this.by().b(tp.bt);
        this.a(vy.a).a(53.0);
        this.a(vy.d).a(0.22499999403953552);
    }
    
    @Override
    public int bV() {
        return 6;
    }
    
    public int cI() {
        return 100;
    }
    
    @Override
    protected float bB() {
        return 0.8f;
    }
    
    @Override
    public int w() {
        return 400;
    }
    
    public boolean cJ() {
        return this.cl() == 0 || this.cx() > 0;
    }
    
    private void dc() {
        this.bO = null;
    }
    
    public boolean cK() {
        return this.bQ;
    }
    
    private void dd() {
        this.bO = "horse/";
        this.bP[0] = null;
        this.bP[1] = null;
        this.bP[2] = null;
        final int cl = this.cl();
        final int cm = this.cm();
        if (cl == 0) {
            final int cx = cm & 0xFF;
            final int n = (cm & 0xFF00) >> 8;
            if (cx >= tp.bx.length) {
                this.bQ = false;
                return;
            }
            this.bP[0] = tp.bx[cx];
            this.bO += tp.by[cx];
            if (n >= tp.bz.length) {
                this.bQ = false;
                return;
            }
            this.bP[1] = tp.bz[n];
            this.bO += tp.bA[n];
        }
        else {
            this.bP[0] = "";
            this.bO = this.bO + "_" + cl + "_";
        }
        final int cx = this.cx();
        if (cx >= tp.bu.length) {
            this.bQ = false;
            return;
        }
        this.bP[2] = tp.bu[cx];
        this.bO += tp.bv[cx];
        this.bQ = true;
    }
    
    public String cL() {
        if (this.bO == null) {
            this.dd();
        }
        return this.bO;
    }
    
    public String[] cM() {
        if (this.bO == null) {
            this.dd();
        }
        return this.bP;
    }
    
    public void g(final wn \u2603) {
        if (!this.o.D && (this.l == null || this.l == \u2603) && this.co()) {
            this.bE.a(this.e_());
            \u2603.a(this, this.bE);
        }
    }
    
    @Override
    public boolean a(final wn \u2603) {
        final zx h = \u2603.bi.h();
        if (h != null && h.b() == zy.bJ) {
            return super.a(\u2603);
        }
        if (!this.co() && this.cR()) {
            return false;
        }
        if (this.co() && this.cn() && \u2603.av()) {
            this.g(\u2603);
            return true;
        }
        if (this.cp() && this.l != null) {
            return super.a(\u2603);
        }
        if (h != null) {
            boolean b = false;
            if (this.cO()) {
                int n = -1;
                if (h.b() == zy.ck) {
                    n = 1;
                }
                else if (h.b() == zy.cl) {
                    n = 2;
                }
                else if (h.b() == zy.cm) {
                    n = 3;
                }
                if (n >= 0) {
                    if (!this.co()) {
                        this.cW();
                        return true;
                    }
                    this.g(\u2603);
                    return true;
                }
            }
            if (!b && !this.cR()) {
                float \u26032 = 0.0f;
                int \u26033 = 0;
                int \u26034 = 0;
                if (h.b() == zy.O) {
                    \u26032 = 2.0f;
                    \u26033 = 20;
                    \u26034 = 3;
                }
                else if (h.b() == zy.aY) {
                    \u26032 = 1.0f;
                    \u26033 = 30;
                    \u26034 = 3;
                }
                else if (afh.a(h.b()) == afi.cx) {
                    \u26032 = 20.0f;
                    \u26033 = 180;
                }
                else if (h.b() == zy.e) {
                    \u26032 = 3.0f;
                    \u26033 = 60;
                    \u26034 = 3;
                }
                else if (h.b() == zy.bW) {
                    \u26032 = 4.0f;
                    \u26033 = 60;
                    \u26034 = 5;
                    if (this.co() && this.l() == 0) {
                        b = true;
                        this.c(\u2603);
                    }
                }
                else if (h.b() == zy.ao) {
                    \u26032 = 10.0f;
                    \u26033 = 240;
                    \u26034 = 10;
                    if (this.co() && this.l() == 0) {
                        b = true;
                        this.c(\u2603);
                    }
                }
                if (this.bn() < this.bu() && \u26032 > 0.0f) {
                    this.h(\u26032);
                    b = true;
                }
                if (!this.cn() && \u26033 > 0) {
                    this.a(\u26033);
                    b = true;
                }
                if (\u26034 > 0 && (b || !this.co()) && \u26034 < this.cI()) {
                    b = true;
                    this.u(\u26034);
                }
                if (b) {
                    this.cY();
                }
            }
            if (!this.co() && !b) {
                if (h != null && h.a(\u2603, this)) {
                    return true;
                }
                this.cW();
                return true;
            }
            else {
                if (!b && this.cP() && !this.cw() && h.b() == zw.a(afi.ae)) {
                    this.o(true);
                    this.a("mob.chickenplop", 1.0f, (this.V.nextFloat() - this.V.nextFloat()) * 0.2f + 1.0f);
                    b = true;
                    this.da();
                }
                if (!b && this.cp() && !this.cG() && h.b() == zy.aA) {
                    this.g(\u2603);
                    return true;
                }
                if (b) {
                    if (!\u2603.bA.d) {
                        final zx zx = h;
                        if (--zx.b == 0) {
                            \u2603.bi.a(\u2603.bi.c, null);
                        }
                    }
                    return true;
                }
            }
        }
        if (!this.cp() || this.l != null) {
            return super.a(\u2603);
        }
        if (h != null && h.a(\u2603, this)) {
            return true;
        }
        this.i(\u2603);
        return true;
    }
    
    private void i(final wn \u2603) {
        \u2603.y = this.y;
        \u2603.z = this.z;
        this.r(false);
        this.s(false);
        if (!this.o.D) {
            \u2603.a((pk)this);
        }
    }
    
    public boolean cO() {
        return this.cl() == 0;
    }
    
    public boolean cP() {
        final int cl = this.cl();
        return cl == 2 || cl == 1;
    }
    
    @Override
    protected boolean bD() {
        return (this.l != null && this.cG()) || this.cy() || this.cz();
    }
    
    public boolean cR() {
        final int cl = this.cl();
        return cl == 3 || cl == 4;
    }
    
    public boolean cS() {
        return this.cR() || this.cl() == 2;
    }
    
    @Override
    public boolean d(final zx \u2603) {
        return false;
    }
    
    private void de() {
        this.bm = 1;
    }
    
    @Override
    public void a(final ow \u2603) {
        super.a(\u2603);
        if (!this.o.D) {
            this.cX();
        }
    }
    
    @Override
    public void m() {
        if (this.V.nextInt(200) == 0) {
            this.de();
        }
        super.m();
        if (!this.o.D) {
            if (this.V.nextInt(900) == 0 && this.ax == 0) {
                this.h(1.0f);
            }
            if (!this.cy() && this.l == null && this.V.nextInt(300) == 0 && this.o.p(new cj(ns.c(this.s), ns.c(this.t) - 1, ns.c(this.u))).c() == afi.c) {
                this.r(true);
            }
            if (this.cy() && ++this.bB > 50) {
                this.bB = 0;
                this.r(false);
            }
            if (this.cA() && !this.cn() && !this.cy()) {
                final tp a = this.a(this, 16.0);
                if (a != null && this.h(a) > 4.0) {
                    this.h.a(a);
                }
            }
        }
    }
    
    @Override
    public void t_() {
        super.t_();
        if (this.o.D && this.ac.a()) {
            this.ac.e();
            this.dc();
        }
        if (this.bC > 0 && ++this.bC > 30) {
            this.bC = 0;
            this.c(128, false);
        }
        if (!this.o.D && this.bD > 0 && ++this.bD > 20) {
            this.bD = 0;
            this.s(false);
        }
        if (this.bm > 0 && ++this.bm > 8) {
            this.bm = 0;
        }
        if (this.bo > 0) {
            ++this.bo;
            if (this.bo > 300) {
                this.bo = 0;
            }
        }
        this.bI = this.bH;
        if (this.cy()) {
            this.bH += (1.0f - this.bH) * 0.4f + 0.05f;
            if (this.bH > 1.0f) {
                this.bH = 1.0f;
            }
        }
        else {
            this.bH += (0.0f - this.bH) * 0.4f - 0.05f;
            if (this.bH < 0.0f) {
                this.bH = 0.0f;
            }
        }
        this.bK = this.bJ;
        if (this.cz()) {
            final float n = 0.0f;
            this.bH = n;
            this.bI = n;
            this.bJ += (1.0f - this.bJ) * 0.4f + 0.05f;
            if (this.bJ > 1.0f) {
                this.bJ = 1.0f;
            }
        }
        else {
            this.bG = false;
            this.bJ += (0.8f * this.bJ * this.bJ * this.bJ - this.bJ) * 0.6f - 0.05f;
            if (this.bJ < 0.0f) {
                this.bJ = 0.0f;
            }
        }
        this.bM = this.bL;
        if (this.w(128)) {
            this.bL += (1.0f - this.bL) * 0.7f + 0.05f;
            if (this.bL > 1.0f) {
                this.bL = 1.0f;
            }
        }
        else {
            this.bL += (0.0f - this.bL) * 0.7f - 0.05f;
            if (this.bL < 0.0f) {
                this.bL = 0.0f;
            }
        }
    }
    
    private void df() {
        if (!this.o.D) {
            this.bC = 1;
            this.c(128, true);
        }
    }
    
    private boolean dg() {
        return this.l == null && this.m == null && this.co() && this.cn() && !this.cS() && this.bn() >= this.bu() && this.cr();
    }
    
    @Override
    public void f(final boolean \u2603) {
        this.c(32, \u2603);
    }
    
    public void r(final boolean \u2603) {
        this.f(\u2603);
    }
    
    public void s(final boolean \u2603) {
        if (\u2603) {
            this.r(false);
        }
        this.c(64, \u2603);
    }
    
    private void dh() {
        if (!this.o.D) {
            this.bD = 1;
            this.s(true);
        }
    }
    
    public void cW() {
        this.dh();
        final String ch = this.cH();
        if (ch != null) {
            this.a(ch, this.bB(), this.bC());
        }
    }
    
    public void cX() {
        this.a(this, this.bE);
        this.cE();
    }
    
    private void a(final pk \u2603, final xj \u2603) {
        if (\u2603 == null || this.o.D) {
            return;
        }
        for (int i = 0; i < \u2603.o_(); ++i) {
            final zx a = \u2603.a(i);
            if (a != null) {
                this.a(a, 0.0f);
            }
        }
    }
    
    public boolean h(final wn \u2603) {
        this.b(\u2603.aK().toString());
        this.l(true);
        return true;
    }
    
    @Override
    public void g(float \u2603, float \u2603) {
        if (this.l == null || !(this.l instanceof pr) || !this.cG()) {
            this.S = 0.5f;
            this.aM = 0.02f;
            super.g(\u2603, \u2603);
            return;
        }
        final float y = this.l.y;
        this.y = y;
        this.A = y;
        this.z = this.l.z * 0.5f;
        this.b(this.y, this.z);
        final float y2 = this.y;
        this.aI = y2;
        this.aK = y2;
        \u2603 = ((pr)this.l).aZ * 0.5f;
        \u2603 = ((pr)this.l).ba;
        if (\u2603 <= 0.0f) {
            \u2603 *= 0.25f;
            this.bN = 0;
        }
        if (this.C && this.br == 0.0f && this.cz() && !this.bG) {
            \u2603 = 0.0f;
            \u2603 = 0.0f;
        }
        if (this.br > 0.0f && !this.cv() && this.C) {
            this.w = this.cF() * this.br;
            if (this.a(pe.j)) {
                this.w += (this.b(pe.j).c() + 1) * 0.1f;
            }
            this.m(true);
            this.ai = true;
            if (\u2603 > 0.0f) {
                final float a = ns.a(this.y * 3.1415927f / 180.0f);
                final float b = ns.b(this.y * 3.1415927f / 180.0f);
                this.v += -0.4f * a * this.br;
                this.x += 0.4f * b * this.br;
                this.a("mob.horse.jump", 0.4f, 1.0f);
            }
            this.br = 0.0f;
        }
        this.S = 1.0f;
        this.aM = this.bI() * 0.1f;
        if (!this.o.D) {
            this.k((float)this.a(vy.d).e());
            super.g(\u2603, \u2603);
        }
        if (this.C) {
            this.br = 0.0f;
            this.m(false);
        }
        this.aA = this.aB;
        final double n = this.s - this.p;
        final double n2 = this.u - this.r;
        float n3 = ns.a(n * n + n2 * n2) * 4.0f;
        if (n3 > 1.0f) {
            n3 = 1.0f;
        }
        this.aB += (n3 - this.aB) * 0.4f;
        this.aC += this.aB;
    }
    
    @Override
    public void b(final dn \u2603) {
        super.b(\u2603);
        \u2603.a("EatingHaystack", this.cy());
        \u2603.a("ChestedHorse", this.cw());
        \u2603.a("HasReproduced", this.cB());
        \u2603.a("Bred", this.cA());
        \u2603.a("Type", this.cl());
        \u2603.a("Variant", this.cm());
        \u2603.a("Temper", this.cC());
        \u2603.a("Tame", this.co());
        \u2603.a("OwnerUUID", this.ct());
        if (this.cw()) {
            final du \u26032 = new du();
            for (int i = 2; i < this.bE.o_(); ++i) {
                final zx a = this.bE.a(i);
                if (a != null) {
                    final dn dn = new dn();
                    dn.a("Slot", (byte)i);
                    a.b(dn);
                    \u26032.a(dn);
                }
            }
            \u2603.a("Items", \u26032);
        }
        if (this.bE.a(1) != null) {
            \u2603.a("ArmorItem", this.bE.a(1).b(new dn()));
        }
        if (this.bE.a(0) != null) {
            \u2603.a("SaddleItem", this.bE.a(0).b(new dn()));
        }
    }
    
    @Override
    public void a(final dn \u2603) {
        super.a(\u2603);
        this.r(\u2603.n("EatingHaystack"));
        this.n(\u2603.n("Bred"));
        this.o(\u2603.n("ChestedHorse"));
        this.p(\u2603.n("HasReproduced"));
        this.r(\u2603.f("Type"));
        this.s(\u2603.f("Variant"));
        this.t(\u2603.f("Temper"));
        this.l(\u2603.n("Tame"));
        String \u26032 = "";
        if (\u2603.b("OwnerUUID", 8)) {
            \u26032 = \u2603.j("OwnerUUID");
        }
        else {
            final String j = \u2603.j("Owner");
            \u26032 = lw.a(j);
        }
        if (\u26032.length() > 0) {
            this.b(\u26032);
        }
        final qc a = this.by().a("Speed");
        if (a != null) {
            this.a(vy.d).a(a.b() * 0.25);
        }
        if (this.cw()) {
            final du c = \u2603.c("Items", 10);
            this.da();
            for (int i = 0; i < c.c(); ++i) {
                final dn b = c.b(i);
                final int \u26033 = b.d("Slot") & 0xFF;
                if (\u26033 >= 2 && \u26033 < this.bE.o_()) {
                    this.bE.a(\u26033, zx.a(b));
                }
            }
        }
        if (\u2603.b("ArmorItem", 10)) {
            final zx zx = zx.a(\u2603.m("ArmorItem"));
            if (zx != null && a(zx.b())) {
                this.bE.a(1, zx);
            }
        }
        if (\u2603.b("SaddleItem", 10)) {
            final zx zx = zx.a(\u2603.m("SaddleItem"));
            if (zx != null && zx.b() == zy.aA) {
                this.bE.a(0, zx);
            }
        }
        else if (\u2603.n("Saddle")) {
            this.bE.a(0, new zx(zy.aA));
        }
        this.db();
    }
    
    @Override
    public boolean a(final tm \u2603) {
        if (\u2603 == this) {
            return false;
        }
        if (\u2603.getClass() != this.getClass()) {
            return false;
        }
        final tp tp = (tp)\u2603;
        if (!this.dg() || !tp.dg()) {
            return false;
        }
        final int cl = this.cl();
        final int cl2 = tp.cl();
        return cl == cl2 || (cl == 0 && cl2 == 1) || (cl == 1 && cl2 == 0);
    }
    
    @Override
    public ph a(final ph \u2603) {
        final tp tp = (tp)\u2603;
        final tp tp2 = new tp(this.o);
        final int cl = this.cl();
        final int cl2 = tp.cl();
        int \u26032 = 0;
        if (cl == cl2) {
            \u26032 = cl;
        }
        else if ((cl == 0 && cl2 == 1) || (cl == 1 && cl2 == 0)) {
            \u26032 = 2;
        }
        if (\u26032 == 0) {
            final int nextInt = this.V.nextInt(9);
            int nextInt2;
            if (nextInt < 4) {
                nextInt2 = (this.cm() & 0xFF);
            }
            else if (nextInt < 8) {
                nextInt2 = (tp.cm() & 0xFF);
            }
            else {
                nextInt2 = this.V.nextInt(7);
            }
            final int nextInt3 = this.V.nextInt(5);
            if (nextInt3 < 2) {
                nextInt2 |= (this.cm() & 0xFF00);
            }
            else if (nextInt3 < 4) {
                nextInt2 |= (tp.cm() & 0xFF00);
            }
            else {
                nextInt2 |= (this.V.nextInt(5) << 8 & 0xFF00);
            }
            tp2.s(nextInt2);
        }
        tp2.r(\u26032);
        final double n = this.a(vy.a).b() + \u2603.a(vy.a).b() + this.di();
        tp2.a(vy.a).a(n / 3.0);
        final double n2 = this.a(tp.bt).b() + \u2603.a(tp.bt).b() + this.dj();
        tp2.a(tp.bt).a(n2 / 3.0);
        final double n3 = this.a(vy.d).b() + \u2603.a(vy.d).b() + this.dk();
        tp2.a(vy.d).a(n3 / 3.0);
        return tp2;
    }
    
    @Override
    public pu a(final ok \u2603, pu \u2603) {
        \u2603 = super.a(\u2603, \u2603);
        int a = 0;
        int n = 0;
        if (\u2603 instanceof a) {
            a = ((a)\u2603).a;
            n = ((((a)\u2603).b & 0xFF) | this.V.nextInt(5) << 8);
        }
        else {
            if (this.V.nextInt(10) == 0) {
                a = 1;
            }
            else {
                final int nextInt = this.V.nextInt(7);
                final int nextInt2 = this.V.nextInt(5);
                a = 0;
                n = (nextInt | nextInt2 << 8);
            }
            \u2603 = new a(a, n);
        }
        this.r(a);
        this.s(n);
        if (this.V.nextInt(5) == 0) {
            this.b(-24000);
        }
        if (a == 4 || a == 3) {
            this.a(vy.a).a(15.0);
            this.a(vy.d).a(0.20000000298023224);
        }
        else {
            this.a(vy.a).a(this.di());
            if (a == 0) {
                this.a(vy.d).a(this.dk());
            }
            else {
                this.a(vy.d).a(0.17499999701976776);
            }
        }
        if (a == 2 || a == 1) {
            this.a(tp.bt).a(0.5);
        }
        else {
            this.a(tp.bt).a(this.dj());
        }
        this.i(this.bu());
        return \u2603;
    }
    
    public float p(final float \u2603) {
        return this.bI + (this.bH - this.bI) * \u2603;
    }
    
    public float q(final float \u2603) {
        return this.bK + (this.bJ - this.bK) * \u2603;
    }
    
    public float r(final float \u2603) {
        return this.bM + (this.bL - this.bM) * \u2603;
    }
    
    public void v(int \u2603) {
        if (this.cG()) {
            if (\u2603 < 0) {
                \u2603 = 0;
            }
            else {
                this.bG = true;
                this.dh();
            }
            if (\u2603 >= 90) {
                this.br = 1.0f;
            }
            else {
                this.br = 0.4f + 0.4f * \u2603 / 90.0f;
            }
        }
    }
    
    protected void t(final boolean \u2603) {
        final cy \u26032 = \u2603 ? cy.I : cy.l;
        for (int i = 0; i < 7; ++i) {
            final double \u26033 = this.V.nextGaussian() * 0.02;
            final double \u26034 = this.V.nextGaussian() * 0.02;
            final double \u26035 = this.V.nextGaussian() * 0.02;
            this.o.a(\u26032, this.s + this.V.nextFloat() * this.J * 2.0f - this.J, this.t + 0.5 + this.V.nextFloat() * this.K, this.u + this.V.nextFloat() * this.J * 2.0f - this.J, \u26033, \u26034, \u26035, new int[0]);
        }
    }
    
    @Override
    public void a(final byte \u2603) {
        if (\u2603 == 7) {
            this.t(true);
        }
        else if (\u2603 == 6) {
            this.t(false);
        }
        else {
            super.a(\u2603);
        }
    }
    
    @Override
    public void al() {
        super.al();
        if (this.bK > 0.0f) {
            final float a = ns.a(this.aI * 3.1415927f / 180.0f);
            final float b = ns.b(this.aI * 3.1415927f / 180.0f);
            final float n = 0.7f * this.bK;
            final float n2 = 0.15f * this.bK;
            this.l.b(this.s + n * a, this.t + this.an() + this.l.am() + n2, this.u - n * b);
            if (this.l instanceof pr) {
                ((pr)this.l).aI = this.aI;
            }
        }
    }
    
    private float di() {
        return 15.0f + this.V.nextInt(8) + this.V.nextInt(9);
    }
    
    private double dj() {
        return 0.4000000059604645 + this.V.nextDouble() * 0.2 + this.V.nextDouble() * 0.2 + this.V.nextDouble() * 0.2;
    }
    
    private double dk() {
        return (0.44999998807907104 + this.V.nextDouble() * 0.3 + this.V.nextDouble() * 0.3 + this.V.nextDouble() * 0.3) * 0.25;
    }
    
    public static boolean a(final zw \u2603) {
        return \u2603 == zy.ck || \u2603 == zy.cl || \u2603 == zy.cm;
    }
    
    @Override
    public boolean k_() {
        return false;
    }
    
    @Override
    public float aS() {
        return this.K;
    }
    
    @Override
    public boolean d(final int \u2603, final zx \u2603) {
        if (\u2603 == 499 && this.cP()) {
            if (\u2603 == null && this.cw()) {
                this.o(false);
                this.da();
                return true;
            }
            if (\u2603 != null && \u2603.b() == zw.a(afi.ae) && !this.cw()) {
                this.o(true);
                this.da();
                return true;
            }
        }
        final int \u26032 = \u2603 - 400;
        if (\u26032 >= 0 && \u26032 < 2 && \u26032 < this.bE.o_()) {
            if (\u26032 == 0 && \u2603 != null && \u2603.b() != zy.aA) {
                return false;
            }
            if (\u26032 == 1 && ((\u2603 != null && !a(\u2603.b())) || !this.cO())) {
                return false;
            }
            this.bE.a(\u26032, \u2603);
            this.db();
            return true;
        }
        else {
            final int \u26033 = \u2603 - 500 + 2;
            if (\u26033 >= 2 && \u26033 < this.bE.o_()) {
                this.bE.a(\u26033, \u2603);
                return true;
            }
            return false;
        }
    }
    
    static {
        bs = new Predicate<pk>() {
            public boolean a(final pk \u2603) {
                return \u2603 instanceof tp && ((tp)\u2603).cA();
            }
        };
        bt = new qj(null, "horse.jumpStrength", 0.7, 0.0, 2.0).a("Jump Strength").a(true);
        bu = new String[] { null, "textures/entity/horse/armor/horse_armor_iron.png", "textures/entity/horse/armor/horse_armor_gold.png", "textures/entity/horse/armor/horse_armor_diamond.png" };
        bv = new String[] { "", "meo", "goo", "dio" };
        bw = new int[] { 0, 5, 7, 11 };
        bx = new String[] { "textures/entity/horse/horse_white.png", "textures/entity/horse/horse_creamy.png", "textures/entity/horse/horse_chestnut.png", "textures/entity/horse/horse_brown.png", "textures/entity/horse/horse_black.png", "textures/entity/horse/horse_gray.png", "textures/entity/horse/horse_darkbrown.png" };
        by = new String[] { "hwh", "hcr", "hch", "hbr", "hbl", "hgr", "hdb" };
        bz = new String[] { null, "textures/entity/horse/horse_markings_white.png", "textures/entity/horse/horse_markings_whitefield.png", "textures/entity/horse/horse_markings_whitedots.png", "textures/entity/horse/horse_markings_blackdots.png" };
        bA = new String[] { "", "wo_", "wmo", "wdo", "bdo" };
    }
    
    public static class a implements pu
    {
        public int a;
        public int b;
        
        public a(final int \u2603, final int \u2603) {
            this.a = \u2603;
            this.b = \u2603;
        }
    }
}
