import java.util.List;
import com.google.common.base.Predicates;
import com.google.common.base.Predicate;
import java.util.Collection;
import java.util.Iterator;
import java.util.Random;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.UUID;

// 
// Decompiled by Procyon v0.5.36
// 

public abstract class pr extends pk
{
    private static final UUID a;
    private static final qd b;
    private qf c;
    private final ov f;
    private final Map<Integer, pf> g;
    private final zx[] h;
    public boolean ar;
    public int as;
    public int at;
    public int au;
    public int av;
    public float aw;
    public int ax;
    public float ay;
    public float az;
    public float aA;
    public float aB;
    public float aC;
    public int aD;
    public float aE;
    public float aF;
    public float aG;
    public float aH;
    public float aI;
    public float aJ;
    public float aK;
    public float aL;
    public float aM;
    protected wn aN;
    protected int aO;
    protected boolean aP;
    protected int aQ;
    protected float aR;
    protected float aS;
    protected float aT;
    protected float aU;
    protected float aV;
    protected int aW;
    protected float aX;
    protected boolean aY;
    public float aZ;
    public float ba;
    protected float bb;
    protected int bc;
    protected double bd;
    protected double be;
    protected double bf;
    protected double bg;
    protected double bh;
    private boolean i;
    private pr bi;
    private int bj;
    private pr bk;
    private int bl;
    private float bm;
    private int bn;
    private float bo;
    
    @Override
    public void G() {
        this.a(ow.j, Float.MAX_VALUE);
    }
    
    public pr(final adm \u2603) {
        super(\u2603);
        this.f = new ov(this);
        this.g = (Map<Integer, pf>)Maps.newHashMap();
        this.h = new zx[5];
        this.aD = 20;
        this.aM = 0.02f;
        this.i = true;
        this.aX();
        this.i(this.bu());
        this.k = true;
        this.aH = (float)((Math.random() + 1.0) * 0.009999999776482582);
        this.b(this.s, this.t, this.u);
        this.aG = (float)Math.random() * 12398.0f;
        this.y = (float)(Math.random() * 3.1415927410125732 * 2.0);
        this.aK = this.y;
        this.S = 0.6f;
    }
    
    @Override
    protected void h() {
        this.ac.a(7, Integer.valueOf(0));
        this.ac.a(8, (Byte)0);
        this.ac.a(9, (Byte)0);
        this.ac.a(6, 1.0f);
    }
    
    protected void aX() {
        this.by().b(vy.a);
        this.by().b(vy.c);
        this.by().b(vy.d);
    }
    
    @Override
    protected void a(final double \u2603, final boolean \u2603, final afh \u2603, final cj \u2603) {
        if (!this.V()) {
            this.W();
        }
        if (!this.o.D && this.O > 3.0f && \u2603) {
            final alz p = this.o.p(\u2603);
            final afh c = p.c();
            final float n = (float)ns.f(this.O - 3.0f);
            if (c.t() != arm.a) {
                double n2 = Math.min(0.2f + n / 15.0f, 10.0f);
                if (n2 > 2.5) {
                    n2 = 2.5;
                }
                final int \u26032 = (int)(150.0 * n2);
                ((le)this.o).a(cy.M, this.s, this.t, this.u, \u26032, 0.0, 0.0, 0.0, 0.15000000596046448, afh.f(p));
            }
        }
        super.a(\u2603, \u2603, \u2603, \u2603);
    }
    
    public boolean aY() {
        return false;
    }
    
    @Override
    public void K() {
        this.ay = this.az;
        super.K();
        this.o.B.a("livingEntityBaseTick");
        final boolean b = this instanceof wn;
        if (this.ai()) {
            if (this.aj()) {
                this.a(ow.e, 1.0f);
            }
            else if (b && !this.o.af().a(this.aR())) {
                final double n = this.o.af().a(this) + this.o.af().m();
                if (n < 0.0) {
                    this.a(ow.e, (float)Math.max(1, ns.c(-n * this.o.af().n())));
                }
            }
        }
        if (this.T() || this.o.D) {
            this.N();
        }
        final boolean b2 = b && ((wn)this).bA.a;
        if (this.ai()) {
            if (this.a(arm.h)) {
                if (!this.aY() && !this.k(pe.o.H) && !b2) {
                    this.h(this.j(this.az()));
                    if (this.az() == -20) {
                        this.h(0);
                        for (int i = 0; i < 8; ++i) {
                            final float n2 = this.V.nextFloat() - this.V.nextFloat();
                            final float n3 = this.V.nextFloat() - this.V.nextFloat();
                            final float n4 = this.V.nextFloat() - this.V.nextFloat();
                            this.o.a(cy.e, this.s + n2, this.t + n3, this.u + n4, this.v, this.w, this.x, new int[0]);
                        }
                        this.a(ow.f, 2.0f);
                    }
                }
                if (!this.o.D && this.au() && this.m instanceof pr) {
                    this.a((pk)null);
                }
            }
            else {
                this.h(300);
            }
        }
        if (this.ai() && this.U()) {
            this.N();
        }
        this.aE = this.aF;
        if (this.au > 0) {
            --this.au;
        }
        if (this.Z > 0 && !(this instanceof lf)) {
            --this.Z;
        }
        if (this.bn() <= 0.0f) {
            this.aZ();
        }
        if (this.aO > 0) {
            --this.aO;
        }
        else {
            this.aN = null;
        }
        if (this.bk != null && !this.bk.ai()) {
            this.bk = null;
        }
        if (this.bi != null) {
            if (!this.bi.ai()) {
                this.b((pr)null);
            }
            else if (this.W - this.bj > 100) {
                this.b((pr)null);
            }
        }
        this.bi();
        this.aU = this.aT;
        this.aJ = this.aI;
        this.aL = this.aK;
        this.A = this.y;
        this.B = this.z;
        this.o.B.b();
    }
    
    public boolean j_() {
        return false;
    }
    
    protected void aZ() {
        ++this.ax;
        if (this.ax == 20) {
            if (!this.o.D && (this.aO > 0 || this.bb()) && this.ba() && this.o.Q().b("doMobLoot")) {
                int i = this.b(this.aN);
                while (i > 0) {
                    final int a = pp.a(i);
                    i -= a;
                    this.o.d(new pp(this.o, this.s, this.t, this.u, a));
                }
            }
            this.J();
            for (int i = 0; i < 20; ++i) {
                final double \u2603 = this.V.nextGaussian() * 0.02;
                final double \u26032 = this.V.nextGaussian() * 0.02;
                final double \u26033 = this.V.nextGaussian() * 0.02;
                this.o.a(cy.a, this.s + this.V.nextFloat() * this.J * 2.0f - this.J, this.t + this.V.nextFloat() * this.K, this.u + this.V.nextFloat() * this.J * 2.0f - this.J, \u2603, \u26032, \u26033, new int[0]);
            }
        }
    }
    
    protected boolean ba() {
        return !this.j_();
    }
    
    protected int j(final int \u2603) {
        final int a = ack.a((pk)this);
        if (a > 0 && this.V.nextInt(a + 1) > 0) {
            return \u2603;
        }
        return \u2603 - 1;
    }
    
    protected int b(final wn \u2603) {
        return 0;
    }
    
    protected boolean bb() {
        return false;
    }
    
    public Random bc() {
        return this.V;
    }
    
    public pr bd() {
        return this.bi;
    }
    
    public int be() {
        return this.bj;
    }
    
    public void b(final pr \u2603) {
        this.bi = \u2603;
        this.bj = this.W;
    }
    
    public pr bf() {
        return this.bk;
    }
    
    public int bg() {
        return this.bl;
    }
    
    public void p(final pk \u2603) {
        if (\u2603 instanceof pr) {
            this.bk = (pr)\u2603;
        }
        else {
            this.bk = null;
        }
        this.bl = this.W;
    }
    
    public int bh() {
        return this.aQ;
    }
    
    public void b(final dn \u2603) {
        \u2603.a("HealF", this.bn());
        \u2603.a("Health", (short)Math.ceil(this.bn()));
        \u2603.a("HurtTime", (short)this.au);
        \u2603.a("HurtByTimestamp", this.bj);
        \u2603.a("DeathTime", (short)this.ax);
        \u2603.a("AbsorptionAmount", this.bN());
        for (final zx zx : this.as()) {
            if (zx != null) {
                this.c.a(zx.B());
            }
        }
        \u2603.a("Attributes", vy.a(this.by()));
        for (final zx zx : this.as()) {
            if (zx != null) {
                this.c.b(zx.B());
            }
        }
        if (!this.g.isEmpty()) {
            final du \u26032 = new du();
            for (final pf pf : this.g.values()) {
                \u26032.a(pf.a(new dn()));
            }
            \u2603.a("ActiveEffects", \u26032);
        }
    }
    
    public void a(final dn \u2603) {
        this.m(\u2603.h("AbsorptionAmount"));
        if (\u2603.b("Attributes", 9) && this.o != null && !this.o.D) {
            vy.a(this.by(), \u2603.c("Attributes", 10));
        }
        if (\u2603.b("ActiveEffects", 9)) {
            final du c = \u2603.c("ActiveEffects", 10);
            for (int i = 0; i < c.c(); ++i) {
                final dn b = c.b(i);
                final pf b2 = pf.b(b);
                if (b2 != null) {
                    this.g.put(b2.a(), b2);
                }
            }
        }
        if (\u2603.b("HealF", 99)) {
            this.i(\u2603.h("HealF"));
        }
        else {
            final eb a = \u2603.a("Health");
            if (a == null) {
                this.i(this.bu());
            }
            else if (a.a() == 5) {
                this.i(((dr)a).h());
            }
            else if (a.a() == 2) {
                this.i((float)((dz)a).e());
            }
        }
        this.au = \u2603.e("HurtTime");
        this.ax = \u2603.e("DeathTime");
        this.bj = \u2603.f("HurtByTimestamp");
    }
    
    protected void bi() {
        final Iterator<Integer> iterator = this.g.keySet().iterator();
        while (iterator.hasNext()) {
            final Integer n = iterator.next();
            final pf pf = this.g.get(n);
            if (!pf.a(this)) {
                if (this.o.D) {
                    continue;
                }
                iterator.remove();
                this.b(pf);
            }
            else {
                if (pf.b() % 600 != 0) {
                    continue;
                }
                this.a(pf, false);
            }
        }
        if (this.i) {
            if (!this.o.D) {
                this.B();
            }
            this.i = false;
        }
        final int c = this.ac.c(7);
        final boolean b = this.ac.a(8) > 0;
        if (c > 0) {
            boolean nextBoolean = false;
            if (!this.ax()) {
                nextBoolean = this.V.nextBoolean();
            }
            else {
                nextBoolean = (this.V.nextInt(15) == 0);
            }
            if (b) {
                nextBoolean &= (this.V.nextInt(5) == 0);
            }
            if (nextBoolean && c > 0) {
                final double \u2603 = (c >> 16 & 0xFF) / 255.0;
                final double \u26032 = (c >> 8 & 0xFF) / 255.0;
                final double \u26033 = (c >> 0 & 0xFF) / 255.0;
                this.o.a(b ? cy.q : cy.p, this.s + (this.V.nextDouble() - 0.5) * this.J, this.t + this.V.nextDouble() * this.K, this.u + (this.V.nextDouble() - 0.5) * this.J, \u2603, \u26032, \u26033, new int[0]);
            }
        }
    }
    
    protected void B() {
        if (this.g.isEmpty()) {
            this.bj();
            this.e(false);
        }
        else {
            final int a = abe.a(this.g.values());
            this.ac.b(8, (byte)(abe.b(this.g.values()) ? 1 : 0));
            this.ac.b(7, a);
            this.e(this.k(pe.p.H));
        }
    }
    
    protected void bj() {
        this.ac.b(8, (Byte)0);
        this.ac.b(7, 0);
    }
    
    public void bk() {
        final Iterator<Integer> iterator = this.g.keySet().iterator();
        while (iterator.hasNext()) {
            final Integer n = iterator.next();
            final pf \u2603 = this.g.get(n);
            if (!this.o.D) {
                iterator.remove();
                this.b(\u2603);
            }
        }
    }
    
    public Collection<pf> bl() {
        return this.g.values();
    }
    
    public boolean k(final int \u2603) {
        return this.g.containsKey(\u2603);
    }
    
    public boolean a(final pe \u2603) {
        return this.g.containsKey(\u2603.H);
    }
    
    public pf b(final pe \u2603) {
        return this.g.get(\u2603.H);
    }
    
    public void c(final pf \u2603) {
        if (!this.d(\u2603)) {
            return;
        }
        if (this.g.containsKey(\u2603.a())) {
            this.g.get(\u2603.a()).a(\u2603);
            this.a(this.g.get(\u2603.a()), true);
        }
        else {
            this.g.put(\u2603.a(), \u2603);
            this.a(\u2603);
        }
    }
    
    public boolean d(final pf \u2603) {
        if (this.bz() == pw.b) {
            final int a = \u2603.a();
            if (a == pe.l.H || a == pe.u.H) {
                return false;
            }
        }
        return true;
    }
    
    public boolean bm() {
        return this.bz() == pw.b;
    }
    
    public void l(final int \u2603) {
        this.g.remove(\u2603);
    }
    
    public void m(final int \u2603) {
        final pf \u26032 = this.g.remove(\u2603);
        if (\u26032 != null) {
            this.b(\u26032);
        }
    }
    
    protected void a(final pf \u2603) {
        this.i = true;
        if (!this.o.D) {
            pe.a[\u2603.a()].b(this, this.by(), \u2603.c());
        }
    }
    
    protected void a(final pf \u2603, final boolean \u2603) {
        this.i = true;
        if (\u2603 && !this.o.D) {
            pe.a[\u2603.a()].a(this, this.by(), \u2603.c());
            pe.a[\u2603.a()].b(this, this.by(), \u2603.c());
        }
    }
    
    protected void b(final pf \u2603) {
        this.i = true;
        if (!this.o.D) {
            pe.a[\u2603.a()].a(this, this.by(), \u2603.c());
        }
    }
    
    public void h(final float \u2603) {
        final float bn = this.bn();
        if (bn > 0.0f) {
            this.i(bn + \u2603);
        }
    }
    
    public final float bn() {
        return this.ac.d(6);
    }
    
    public void i(final float \u2603) {
        this.ac.b(6, ns.a(\u2603, 0.0f, this.bu()));
    }
    
    @Override
    public boolean a(final ow \u2603, float \u2603) {
        if (this.b(\u2603)) {
            return false;
        }
        if (this.o.D) {
            return false;
        }
        this.aQ = 0;
        if (this.bn() <= 0.0f) {
            return false;
        }
        if (\u2603.o() && this.a(pe.n)) {
            return false;
        }
        if ((\u2603 == ow.n || \u2603 == ow.o) && this.p(4) != null) {
            this.p(4).a((int)(\u2603 * 4.0f + this.V.nextFloat() * \u2603 * 2.0f), this);
            \u2603 *= 0.75f;
        }
        this.aB = 1.5f;
        boolean b = true;
        if (this.Z > this.aD / 2.0f) {
            if (\u2603 <= this.aX) {
                return false;
            }
            this.d(\u2603, \u2603 - this.aX);
            this.aX = \u2603;
            b = false;
        }
        else {
            this.aX = \u2603;
            this.Z = this.aD;
            this.d(\u2603, \u2603);
            final int n = 10;
            this.av = n;
            this.au = n;
        }
        this.aw = 0.0f;
        final pk j = \u2603.j();
        if (j != null) {
            if (j instanceof pr) {
                this.b((pr)j);
            }
            if (j instanceof wn) {
                this.aO = 100;
                this.aN = (wn)j;
            }
            else if (j instanceof ua) {
                final ua ua = (ua)j;
                if (ua.cl()) {
                    this.aO = 100;
                    this.aN = null;
                }
            }
        }
        if (b) {
            this.o.a(this, (byte)2);
            if (\u2603 != ow.f) {
                this.ac();
            }
            if (j != null) {
                double n2;
                double n3;
                for (n2 = j.s - this.s, n3 = j.u - this.u; n2 * n2 + n3 * n3 < 1.0E-4; n2 = (Math.random() - Math.random()) * 0.01, n3 = (Math.random() - Math.random()) * 0.01) {}
                this.aw = (float)(ns.b(n3, n2) * 180.0 / 3.1415927410125732 - this.y);
                this.a(j, \u2603, n2, n3);
            }
            else {
                this.aw = (float)((int)(Math.random() * 2.0) * 180);
            }
        }
        if (this.bn() <= 0.0f) {
            final String s = this.bp();
            if (b && s != null) {
                this.a(s, this.bB(), this.bC());
            }
            this.a(\u2603);
        }
        else {
            final String s = this.bo();
            if (b && s != null) {
                this.a(s, this.bB(), this.bC());
            }
        }
        return true;
    }
    
    public void b(final zx \u2603) {
        this.a("random.break", 0.8f, 0.8f + this.o.s.nextFloat() * 0.4f);
        for (int i = 0; i < 5; ++i) {
            aui aui = new aui((this.V.nextFloat() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0);
            aui = aui.a(-this.z * 3.1415927f / 180.0f);
            aui = aui.b(-this.y * 3.1415927f / 180.0f);
            final double \u26032 = -this.V.nextFloat() * 0.6 - 0.3;
            aui aui2 = new aui((this.V.nextFloat() - 0.5) * 0.3, \u26032, 0.6);
            aui2 = aui2.a(-this.z * 3.1415927f / 180.0f);
            aui2 = aui2.b(-this.y * 3.1415927f / 180.0f);
            aui2 = aui2.b(this.s, this.t + this.aS(), this.u);
            this.o.a(cy.K, aui2.a, aui2.b, aui2.c, aui.a, aui.b + 0.05, aui.c, zw.b(\u2603.b()));
        }
    }
    
    public void a(final ow \u2603) {
        final pk j = \u2603.j();
        final pr bt = this.bt();
        if (this.aW >= 0 && bt != null) {
            bt.b(this, this.aW);
        }
        if (j != null) {
            j.a(this);
        }
        this.aP = true;
        this.bs().g();
        if (!this.o.D) {
            int i = 0;
            if (j instanceof wn) {
                i = ack.i((pr)j);
            }
            if (this.ba() && this.o.Q().b("doMobLoot")) {
                this.b(this.aO > 0, i);
                this.a(this.aO > 0, i);
                if (this.aO > 0 && this.V.nextFloat() < 0.025f + i * 0.01f) {
                    this.bq();
                }
            }
        }
        this.o.a(this, (byte)3);
    }
    
    protected void a(final boolean \u2603, final int \u2603) {
    }
    
    public void a(final pk \u2603, final float \u2603, final double \u2603, final double \u2603) {
        if (this.V.nextDouble() < this.a(vy.c).e()) {
            return;
        }
        this.ai = true;
        final float a = ns.a(\u2603 * \u2603 + \u2603 * \u2603);
        final float n = 0.4f;
        this.v /= 2.0;
        this.w /= 2.0;
        this.x /= 2.0;
        this.v -= \u2603 / a * n;
        this.w += n;
        this.x -= \u2603 / a * n;
        if (this.w > 0.4000000059604645) {
            this.w = 0.4000000059604645;
        }
    }
    
    protected String bo() {
        return "game.neutral.hurt";
    }
    
    protected String bp() {
        return "game.neutral.die";
    }
    
    protected void bq() {
    }
    
    protected void b(final boolean \u2603, final int \u2603) {
    }
    
    public boolean k_() {
        final int c = ns.c(this.s);
        final int c2 = ns.c(this.aR().b);
        final int c3 = ns.c(this.u);
        final afh c4 = this.o.p(new cj(c, c2, c3)).c();
        return (c4 == afi.au || c4 == afi.bn) && (!(this instanceof wn) || !((wn)this).v());
    }
    
    @Override
    public boolean ai() {
        return !this.I && this.bn() > 0.0f;
    }
    
    @Override
    public void e(final float \u2603, final float \u2603) {
        super.e(\u2603, \u2603);
        final pf b = this.b(pe.j);
        final float n = (b != null) ? ((float)(b.c() + 1)) : 0.0f;
        final int f = ns.f((\u2603 - 3.0f - n) * \u2603);
        if (f > 0) {
            this.a(this.n(f), 1.0f, 1.0f);
            this.a(ow.i, (float)f);
            final int c = ns.c(this.s);
            final int c2 = ns.c(this.t - 0.20000000298023224);
            final int c3 = ns.c(this.u);
            final afh c4 = this.o.p(new cj(c, c2, c3)).c();
            if (c4.t() != arm.a) {
                final afh.b h = c4.H;
                this.a(h.c(), h.d() * 0.5f, h.e() * 0.75f);
            }
        }
    }
    
    protected String n(final int \u2603) {
        if (\u2603 > 4) {
            return "game.neutral.hurt.fall.big";
        }
        return "game.neutral.hurt.fall.small";
    }
    
    @Override
    public void ar() {
        final int n = 10;
        this.av = n;
        this.au = n;
        this.aw = 0.0f;
    }
    
    public int br() {
        int n = 0;
        for (final zx zx : this.as()) {
            if (zx != null && zx.b() instanceof yj) {
                final int c = ((yj)zx.b()).c;
                n += c;
            }
        }
        return n;
    }
    
    protected void j(final float \u2603) {
    }
    
    protected float b(final ow \u2603, float \u2603) {
        if (!\u2603.e()) {
            final int n = 25 - this.br();
            final float n2 = \u2603 * n;
            this.j(\u2603);
            \u2603 = n2 / 25.0f;
        }
        return \u2603;
    }
    
    protected float c(final ow \u2603, float \u2603) {
        if (\u2603.h()) {
            return \u2603;
        }
        if (this.a(pe.m) && \u2603 != ow.j) {
            final int a = (this.b(pe.m).c() + 1) * 5;
            final int n = 25 - a;
            final float n2 = \u2603 * n;
            \u2603 = n2 / 25.0f;
        }
        if (\u2603 <= 0.0f) {
            return 0.0f;
        }
        int a = ack.a(this.as(), \u2603);
        if (a > 20) {
            a = 20;
        }
        if (a > 0 && a <= 20) {
            final int n = 25 - a;
            final float n2 = \u2603 * n;
            \u2603 = n2 / 25.0f;
        }
        return \u2603;
    }
    
    protected void d(final ow \u2603, float \u2603) {
        if (this.b(\u2603)) {
            return;
        }
        \u2603 = this.b(\u2603, \u2603);
        final float c;
        \u2603 = (c = this.c(\u2603, \u2603));
        \u2603 = Math.max(\u2603 - this.bN(), 0.0f);
        this.m(this.bN() - (c - \u2603));
        if (\u2603 == 0.0f) {
            return;
        }
        final float bn = this.bn();
        this.i(bn - \u2603);
        this.bs().a(\u2603, bn, \u2603);
        this.m(this.bN() - \u2603);
    }
    
    public ov bs() {
        return this.f;
    }
    
    public pr bt() {
        if (this.f.c() != null) {
            return this.f.c();
        }
        if (this.aN != null) {
            return this.aN;
        }
        if (this.bi != null) {
            return this.bi;
        }
        return null;
    }
    
    public final float bu() {
        return (float)this.a(vy.a).e();
    }
    
    public final int bv() {
        return this.ac.a(9);
    }
    
    public final void o(final int \u2603) {
        this.ac.b(9, (byte)\u2603);
    }
    
    private int n() {
        if (this.a(pe.e)) {
            return 6 - (1 + this.b(pe.e).c()) * 1;
        }
        if (this.a(pe.f)) {
            return 6 + (1 + this.b(pe.f).c()) * 2;
        }
        return 6;
    }
    
    public void bw() {
        if (!this.ar || this.as >= this.n() / 2 || this.as < 0) {
            this.as = -1;
            this.ar = true;
            if (this.o instanceof le) {
                ((le)this.o).s().a(this, new fq(this, 0));
            }
        }
    }
    
    @Override
    public void a(final byte \u2603) {
        if (\u2603 == 2) {
            this.aB = 1.5f;
            this.Z = this.aD;
            final int n = 10;
            this.av = n;
            this.au = n;
            this.aw = 0.0f;
            final String s = this.bo();
            if (s != null) {
                this.a(this.bo(), this.bB(), (this.V.nextFloat() - this.V.nextFloat()) * 0.2f + 1.0f);
            }
            this.a(ow.k, 0.0f);
        }
        else if (\u2603 == 3) {
            final String s = this.bp();
            if (s != null) {
                this.a(this.bp(), this.bB(), (this.V.nextFloat() - this.V.nextFloat()) * 0.2f + 1.0f);
            }
            this.i(0.0f);
            this.a(ow.k);
        }
        else {
            super.a(\u2603);
        }
    }
    
    @Override
    protected void O() {
        this.a(ow.j, 4.0f);
    }
    
    protected void bx() {
        final int n = this.n();
        if (this.ar) {
            ++this.as;
            if (this.as >= n) {
                this.as = 0;
                this.ar = false;
            }
        }
        else {
            this.as = 0;
        }
        this.az = this.as / (float)n;
    }
    
    public qc a(final qb \u2603) {
        return this.by().a(\u2603);
    }
    
    public qf by() {
        if (this.c == null) {
            this.c = new qi();
        }
        return this.c;
    }
    
    public pw bz() {
        return pw.a;
    }
    
    public abstract zx bA();
    
    public abstract zx p(final int p0);
    
    public abstract zx q(final int p0);
    
    @Override
    public abstract void c(final int p0, final zx p1);
    
    @Override
    public void d(final boolean \u2603) {
        super.d(\u2603);
        final qc a = this.a(vy.d);
        if (a.a(pr.a) != null) {
            a.c(pr.b);
        }
        if (\u2603) {
            a.b(pr.b);
        }
    }
    
    @Override
    public abstract zx[] as();
    
    protected float bB() {
        return 1.0f;
    }
    
    protected float bC() {
        if (this.j_()) {
            return (this.V.nextFloat() - this.V.nextFloat()) * 0.2f + 1.5f;
        }
        return (this.V.nextFloat() - this.V.nextFloat()) * 0.2f + 1.0f;
    }
    
    protected boolean bD() {
        return this.bn() <= 0.0f;
    }
    
    public void q(final pk \u2603) {
        double s = \u2603.s;
        double \u26032 = \u2603.aR().b + \u2603.K;
        double u = \u2603.u;
        for (int n = 1, i = -n; i <= n; ++i) {
            for (int j = -n; j < n; ++j) {
                if (i != 0 || j != 0) {
                    final int \u26033 = (int)(this.s + i);
                    final int \u26034 = (int)(this.u + j);
                    final aug c = this.aR().c(i, 1.0, j);
                    if (this.o.a(c).isEmpty()) {
                        if (adm.a(this.o, new cj(\u26033, (int)this.t, \u26034))) {
                            this.a(this.s + i, this.t + 1.0, this.u + j);
                            return;
                        }
                        if (adm.a(this.o, new cj(\u26033, (int)this.t - 1, \u26034)) || this.o.p(new cj(\u26033, (int)this.t - 1, \u26034)).c().t() == arm.h) {
                            s = this.s + i;
                            \u26032 = this.t + 1.0;
                            u = this.u + j;
                        }
                    }
                }
            }
        }
        this.a(s, \u26032, u);
    }
    
    @Override
    public boolean aO() {
        return false;
    }
    
    protected float bE() {
        return 0.42f;
    }
    
    protected void bF() {
        this.w = this.bE();
        if (this.a(pe.j)) {
            this.w += (this.b(pe.j).c() + 1) * 0.1f;
        }
        if (this.aw()) {
            final float n = this.y * 0.017453292f;
            this.v -= ns.a(n) * 0.2f;
            this.x += ns.b(n) * 0.2f;
        }
        this.ai = true;
    }
    
    protected void bG() {
        this.w += 0.03999999910593033;
    }
    
    protected void bH() {
        this.w += 0.03999999910593033;
    }
    
    public void g(final float \u2603, final float \u2603) {
        if (this.bM()) {
            if (this.V() && (!(this instanceof wn) || !((wn)this).bA.b)) {
                final double n = this.t;
                float am = 0.8f;
                float \u26032 = 0.02f;
                float n2 = (float)ack.b((pk)this);
                if (n2 > 3.0f) {
                    n2 = 3.0f;
                }
                if (!this.C) {
                    n2 *= 0.5f;
                }
                if (n2 > 0.0f) {
                    am += (0.54600006f - am) * n2 / 3.0f;
                    \u26032 += (this.bI() * 1.0f - \u26032) * n2 / 3.0f;
                }
                this.a(\u2603, \u2603, \u26032);
                this.d(this.v, this.w, this.x);
                this.v *= am;
                this.w *= 0.800000011920929;
                this.x *= am;
                this.w -= 0.02;
                if (this.D && this.c(this.v, this.w + 0.6000000238418579 - this.t + n, this.x)) {
                    this.w = 0.30000001192092896;
                }
            }
            else if (this.ab() && (!(this instanceof wn) || !((wn)this).bA.b)) {
                final double n = this.t;
                this.a(\u2603, \u2603, 0.02f);
                this.d(this.v, this.w, this.x);
                this.v *= 0.5;
                this.w *= 0.5;
                this.x *= 0.5;
                this.w -= 0.02;
                if (this.D && this.c(this.v, this.w + 0.6000000238418579 - this.t + n, this.x)) {
                    this.w = 0.30000001192092896;
                }
            }
            else {
                float n3 = 0.91f;
                if (this.C) {
                    n3 = this.o.p(new cj(ns.c(this.s), ns.c(this.aR().b) - 1, ns.c(this.u))).c().L * 0.91f;
                }
                final float n4 = 0.16277136f / (n3 * n3 * n3);
                float am;
                if (this.C) {
                    am = this.bI() * n4;
                }
                else {
                    am = this.aM;
                }
                this.a(\u2603, \u2603, am);
                n3 = 0.91f;
                if (this.C) {
                    n3 = this.o.p(new cj(ns.c(this.s), ns.c(this.aR().b) - 1, ns.c(this.u))).c().L * 0.91f;
                }
                if (this.k_()) {
                    final float \u26032 = 0.15f;
                    this.v = ns.a(this.v, -\u26032, \u26032);
                    this.x = ns.a(this.x, -\u26032, \u26032);
                    this.O = 0.0f;
                    if (this.w < -0.15) {
                        this.w = -0.15;
                    }
                    final boolean b = this.av() && this instanceof wn;
                    if (b && this.w < 0.0) {
                        this.w = 0.0;
                    }
                }
                this.d(this.v, this.w, this.x);
                if (this.D && this.k_()) {
                    this.w = 0.2;
                }
                if (!this.o.D || (this.o.e(new cj((int)this.s, 0, (int)this.u)) && this.o.f(new cj((int)this.s, 0, (int)this.u)).o())) {
                    this.w -= 0.08;
                }
                else if (this.t > 0.0) {
                    this.w = -0.1;
                }
                else {
                    this.w = 0.0;
                }
                this.w *= 0.9800000190734863;
                this.v *= n3;
                this.x *= n3;
            }
        }
        this.aA = this.aB;
        final double n = this.s - this.p;
        final double n5 = this.u - this.r;
        float n2 = ns.a(n * n + n5 * n5) * 4.0f;
        if (n2 > 1.0f) {
            n2 = 1.0f;
        }
        this.aB += (n2 - this.aB) * 0.4f;
        this.aC += this.aB;
    }
    
    public float bI() {
        return this.bm;
    }
    
    public void k(final float \u2603) {
        this.bm = \u2603;
    }
    
    public boolean r(final pk \u2603) {
        this.p(\u2603);
        return false;
    }
    
    public boolean bJ() {
        return false;
    }
    
    @Override
    public void t_() {
        super.t_();
        if (!this.o.D) {
            final int bv = this.bv();
            if (bv > 0) {
                if (this.at <= 0) {
                    this.at = 20 * (30 - bv);
                }
                --this.at;
                if (this.at <= 0) {
                    this.o(bv - 1);
                }
            }
            for (int i = 0; i < 5; ++i) {
                final zx \u2603 = this.h[i];
                final zx p = this.p(i);
                if (!zx.b(p, \u2603)) {
                    ((le)this.o).s().a(this, new hn(this.F(), i, p));
                    if (\u2603 != null) {
                        this.c.a(\u2603.B());
                    }
                    if (p != null) {
                        this.c.b(p.B());
                    }
                    this.h[i] = ((p == null) ? null : p.k());
                }
            }
            if (this.W % 20 == 0) {
                this.bs().g();
            }
        }
        this.m();
        final double \u26032 = this.s - this.p;
        final double \u26033 = this.u - this.r;
        final float n = (float)(\u26032 * \u26032 + \u26033 * \u26033);
        float \u26034 = this.aI;
        float h = 0.0f;
        this.aR = this.aS;
        float n2 = 0.0f;
        if (n > 0.0025000002f) {
            n2 = 1.0f;
            h = (float)Math.sqrt(n) * 3.0f;
            \u26034 = (float)ns.b(\u26033, \u26032) * 180.0f / 3.1415927f - 90.0f;
        }
        if (this.az > 0.0f) {
            \u26034 = this.y;
        }
        if (!this.C) {
            n2 = 0.0f;
        }
        this.aS += (n2 - this.aS) * 0.3f;
        this.o.B.a("headTurn");
        h = this.h(\u26034, h);
        this.o.B.b();
        this.o.B.a("rangeChecks");
        while (this.y - this.A < -180.0f) {
            this.A -= 360.0f;
        }
        while (this.y - this.A >= 180.0f) {
            this.A += 360.0f;
        }
        while (this.aI - this.aJ < -180.0f) {
            this.aJ -= 360.0f;
        }
        while (this.aI - this.aJ >= 180.0f) {
            this.aJ += 360.0f;
        }
        while (this.z - this.B < -180.0f) {
            this.B -= 360.0f;
        }
        while (this.z - this.B >= 180.0f) {
            this.B += 360.0f;
        }
        while (this.aK - this.aL < -180.0f) {
            this.aL -= 360.0f;
        }
        while (this.aK - this.aL >= 180.0f) {
            this.aL += 360.0f;
        }
        this.o.B.b();
        this.aT += h;
    }
    
    protected float h(final float \u2603, float \u2603) {
        final float g = ns.g(\u2603 - this.aI);
        this.aI += g * 0.3f;
        float g2 = ns.g(this.y - this.aI);
        final boolean b = g2 < -90.0f || g2 >= 90.0f;
        if (g2 < -75.0f) {
            g2 = -75.0f;
        }
        if (g2 >= 75.0f) {
            g2 = 75.0f;
        }
        this.aI = this.y - g2;
        if (g2 * g2 > 2500.0f) {
            this.aI += g2 * 0.2f;
        }
        if (b) {
            \u2603 *= -1.0f;
        }
        return \u2603;
    }
    
    public void m() {
        if (this.bn > 0) {
            --this.bn;
        }
        if (this.bc > 0) {
            final double \u2603 = this.s + (this.bd - this.s) / this.bc;
            final double \u26032 = this.t + (this.be - this.t) / this.bc;
            final double \u26033 = this.u + (this.bf - this.u) / this.bc;
            final double g = ns.g(this.bg - this.y);
            this.y += (float)(g / this.bc);
            this.z += (float)((this.bh - this.z) / this.bc);
            --this.bc;
            this.b(\u2603, \u26032, \u26033);
            this.b(this.y, this.z);
        }
        else if (!this.bM()) {
            this.v *= 0.98;
            this.w *= 0.98;
            this.x *= 0.98;
        }
        if (Math.abs(this.v) < 0.005) {
            this.v = 0.0;
        }
        if (Math.abs(this.w) < 0.005) {
            this.w = 0.0;
        }
        if (Math.abs(this.x) < 0.005) {
            this.x = 0.0;
        }
        this.o.B.a("ai");
        if (this.bD()) {
            this.aY = false;
            this.aZ = 0.0f;
            this.ba = 0.0f;
            this.bb = 0.0f;
        }
        else if (this.bM()) {
            this.o.B.a("newAi");
            this.bK();
            this.o.B.b();
        }
        this.o.B.b();
        this.o.B.a("jump");
        if (this.aY) {
            if (this.V()) {
                this.bG();
            }
            else if (this.ab()) {
                this.bH();
            }
            else if (this.C && this.bn == 0) {
                this.bF();
                this.bn = 10;
            }
        }
        else {
            this.bn = 0;
        }
        this.o.B.b();
        this.o.B.a("travel");
        this.aZ *= 0.98f;
        this.ba *= 0.98f;
        this.bb *= 0.9f;
        this.g(this.aZ, this.ba);
        this.o.B.b();
        this.o.B.a("push");
        if (!this.o.D) {
            this.bL();
        }
        this.o.B.b();
    }
    
    protected void bK() {
    }
    
    protected void bL() {
        final List<pk> a = this.o.a(this, this.aR().b(0.20000000298023224, 0.0, 0.20000000298023224), Predicates.and((Predicate<? super pk>)po.d, (Predicate<? super pk>)new Predicate<pk>() {
            public boolean a(final pk \u2603) {
                return \u2603.ae();
            }
        }));
        if (!a.isEmpty()) {
            for (int i = 0; i < a.size(); ++i) {
                final pk \u2603 = a.get(i);
                this.s(\u2603);
            }
        }
    }
    
    protected void s(final pk \u2603) {
        \u2603.i(this);
    }
    
    @Override
    public void a(final pk \u2603) {
        if (this.m != null && \u2603 == null) {
            if (!this.o.D) {
                this.q(this.m);
            }
            if (this.m != null) {
                this.m.l = null;
            }
            this.m = null;
            return;
        }
        super.a(\u2603);
    }
    
    @Override
    public void ak() {
        super.ak();
        this.aR = this.aS;
        this.aS = 0.0f;
        this.O = 0.0f;
    }
    
    @Override
    public void a(final double \u2603, final double \u2603, final double \u2603, final float \u2603, final float \u2603, final int \u2603, final boolean \u2603) {
        this.bd = \u2603;
        this.be = \u2603;
        this.bf = \u2603;
        this.bg = \u2603;
        this.bh = \u2603;
        this.bc = \u2603;
    }
    
    public void i(final boolean \u2603) {
        this.aY = \u2603;
    }
    
    public void a(final pk \u2603, final int \u2603) {
        if (!\u2603.I && !this.o.D) {
            final la s = ((le)this.o).s();
            if (\u2603 instanceof uz) {
                s.a(\u2603, new hy(\u2603.F(), this.F()));
            }
            if (\u2603 instanceof wq) {
                s.a(\u2603, new hy(\u2603.F(), this.F()));
            }
            if (\u2603 instanceof pp) {
                s.a(\u2603, new hy(\u2603.F(), this.F()));
            }
        }
    }
    
    public boolean t(final pk \u2603) {
        return this.o.a(new aui(this.s, this.t + this.aS(), this.u), new aui(\u2603.s, \u2603.t + \u2603.aS(), \u2603.u)) == null;
    }
    
    @Override
    public aui ap() {
        return this.d(1.0f);
    }
    
    @Override
    public aui d(final float \u2603) {
        if (\u2603 == 1.0f) {
            return this.f(this.z, this.aK);
        }
        final float \u26032 = this.B + (this.z - this.B) * \u2603;
        final float \u26033 = this.aL + (this.aK - this.aL) * \u2603;
        return this.f(\u26032, \u26033);
    }
    
    public float l(final float \u2603) {
        float n = this.az - this.ay;
        if (n < 0.0f) {
            ++n;
        }
        return this.ay + n * \u2603;
    }
    
    public boolean bM() {
        return !this.o.D;
    }
    
    @Override
    public boolean ad() {
        return !this.I;
    }
    
    @Override
    public boolean ae() {
        return !this.I;
    }
    
    @Override
    protected void ac() {
        this.G = (this.V.nextDouble() >= this.a(vy.c).e());
    }
    
    @Override
    public float aC() {
        return this.aK;
    }
    
    @Override
    public void f(final float \u2603) {
        this.aK = \u2603;
    }
    
    @Override
    public void g(final float \u2603) {
        this.aI = \u2603;
    }
    
    public float bN() {
        return this.bo;
    }
    
    public void m(float \u2603) {
        if (\u2603 < 0.0f) {
            \u2603 = 0.0f;
        }
        this.bo = \u2603;
    }
    
    public auq bO() {
        return this.o.Z().h(this.aK().toString());
    }
    
    public boolean c(final pr \u2603) {
        return this.a(\u2603.bO());
    }
    
    public boolean a(final auq \u2603) {
        return this.bO() != null && this.bO().a(\u2603);
    }
    
    public void h_() {
    }
    
    public void j() {
    }
    
    protected void bP() {
        this.i = true;
    }
    
    static {
        a = UUID.fromString("662A6B8D-DA3E-4C1C-8813-96EA6097278D");
        b = new qd(pr.a, "Sprinting speed boost", 0.30000001192092896, 2).a(false);
    }
}
