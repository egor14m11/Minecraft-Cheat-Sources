import java.util.Calendar;
import java.util.List;
import com.google.common.base.Predicate;
import java.util.UUID;

// 
// Decompiled by Procyon v0.5.36
// 

public class we extends vv
{
    protected static final qb a;
    private static final UUID b;
    private static final qd c;
    private final qu bm;
    private int bn;
    private boolean bo;
    private float bp;
    private float bq;
    
    public we(final adm \u2603) {
        super(\u2603);
        this.bm = new qu(this);
        this.bo = false;
        this.bp = -1.0f;
        ((sv)this.s()).b(true);
        this.i.a(0, new ra(this));
        this.i.a(2, new rl(this, wn.class, 1.0, false));
        this.i.a(5, new rp(this, 1.0));
        this.i.a(7, new rz(this, 1.0));
        this.i.a(8, new ri(this, wn.class, 8.0f));
        this.i.a(8, new ry(this));
        this.n();
        this.a(0.6f, 1.95f);
    }
    
    protected void n() {
        this.i.a(4, new rl(this, wi.class, 1.0, true));
        this.i.a(4, new rl(this, ty.class, 1.0, true));
        this.i.a(6, new rn(this, 1.0, false));
        this.bi.a(1, new sm(this, true, new Class[] { vw.class }));
        this.bi.a(2, new sp<Object>(this, wn.class, true));
        this.bi.a(2, new sp<Object>(this, wi.class, false));
        this.bi.a(2, new sp<Object>(this, ty.class, true));
    }
    
    @Override
    protected void aX() {
        super.aX();
        this.a(vy.b).a(35.0);
        this.a(vy.d).a(0.23000000417232513);
        this.a(vy.e).a(3.0);
        this.by().b(we.a).a(this.V.nextDouble() * 0.10000000149011612);
    }
    
    @Override
    protected void h() {
        super.h();
        this.H().a(12, (Byte)0);
        this.H().a(13, (Byte)0);
        this.H().a(14, (Byte)0);
    }
    
    @Override
    public int br() {
        int n = super.br() + 2;
        if (n > 20) {
            n = 20;
        }
        return n;
    }
    
    public boolean cn() {
        return this.bo;
    }
    
    public void a(final boolean \u2603) {
        if (this.bo != \u2603) {
            this.bo = \u2603;
            if (\u2603) {
                this.i.a(1, this.bm);
            }
            else {
                this.i.a(this.bm);
            }
        }
    }
    
    @Override
    public boolean j_() {
        return this.H().a(12) == 1;
    }
    
    @Override
    protected int b(final wn \u2603) {
        if (this.j_()) {
            this.b_ *= (int)2.5f;
        }
        return super.b(\u2603);
    }
    
    public void l(final boolean \u2603) {
        this.H().b(12, (byte)(\u2603 ? 1 : 0));
        if (this.o != null && !this.o.D) {
            final qc a = this.a(vy.d);
            a.c(we.c);
            if (\u2603) {
                a.b(we.c);
            }
        }
        this.n(\u2603);
    }
    
    public boolean co() {
        return this.H().a(13) == 1;
    }
    
    public void m(final boolean \u2603) {
        this.H().b(13, (byte)(\u2603 ? 1 : 0));
    }
    
    @Override
    public void m() {
        if (this.o.w() && !this.o.D && !this.j_()) {
            final float c = this.c(1.0f);
            final cj \u2603 = new cj(this.s, (double)Math.round(this.t), this.u);
            if (c > 0.5f && this.V.nextFloat() * 30.0f < (c - 0.4f) * 2.0f && this.o.i(\u2603)) {
                boolean b = true;
                final zx p = this.p(4);
                if (p != null) {
                    if (p.e()) {
                        p.b(p.h() + this.V.nextInt(2));
                        if (p.h() >= p.j()) {
                            this.b(p);
                            this.c(4, null);
                        }
                    }
                    b = false;
                }
                if (b) {
                    this.e(8);
                }
            }
        }
        if (this.au() && this.u() != null && this.m instanceof tn) {
            ((ps)this.m).s().a(this.s().j(), 1.5);
        }
        super.m();
    }
    
    @Override
    public boolean a(final ow \u2603, final float \u2603) {
        if (super.a(\u2603, \u2603)) {
            pr u = this.u();
            if (u == null && \u2603.j() instanceof pr) {
                u = (pr)\u2603.j();
            }
            if (u != null && this.o.aa() == oj.d && this.V.nextFloat() < this.a(we.a).e()) {
                final int c = ns.c(this.s);
                final int c2 = ns.c(this.t);
                final int c3 = ns.c(this.u);
                final we we = new we(this.o);
                for (int i = 0; i < 50; ++i) {
                    final int n = c + ns.a(this.V, 7, 40) * ns.a(this.V, -1, 1);
                    final int \u26032 = c2 + ns.a(this.V, 7, 40) * ns.a(this.V, -1, 1);
                    final int n2 = c3 + ns.a(this.V, 7, 40) * ns.a(this.V, -1, 1);
                    if (adm.a(this.o, new cj(n, \u26032 - 1, n2)) && this.o.l(new cj(n, \u26032, n2)) < 10) {
                        we.b(n, \u26032, n2);
                        if (!this.o.b(n, \u26032, n2, 7.0) && this.o.a(we.aR(), we) && this.o.a(we, we.aR()).isEmpty() && !this.o.d(we.aR())) {
                            this.o.d(we);
                            we.d(u);
                            we.a(this.o.E(new cj(we)), null);
                            this.a(we.a).b(new qd("Zombie reinforcement caller charge", -0.05000000074505806, 0));
                            we.a(we.a).b(new qd("Zombie reinforcement callee charge", -0.05000000074505806, 0));
                            break;
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }
    
    @Override
    public void t_() {
        if (!this.o.D && this.cp()) {
            final int cr = this.cr();
            this.bn -= cr;
            if (this.bn <= 0) {
                this.cq();
            }
        }
        super.t_();
    }
    
    @Override
    public boolean r(final pk \u2603) {
        final boolean r = super.r(\u2603);
        if (r) {
            final int a = this.o.aa().a();
            if (this.bA() == null && this.at() && this.V.nextFloat() < a * 0.3f) {
                \u2603.e(2 * a);
            }
        }
        return r;
    }
    
    @Override
    protected String z() {
        return "mob.zombie.say";
    }
    
    @Override
    protected String bo() {
        return "mob.zombie.hurt";
    }
    
    @Override
    protected String bp() {
        return "mob.zombie.death";
    }
    
    @Override
    protected void a(final cj \u2603, final afh \u2603) {
        this.a("mob.zombie.step", 0.15f, 1.0f);
    }
    
    @Override
    protected zw A() {
        return zy.bt;
    }
    
    @Override
    public pw bz() {
        return pw.b;
    }
    
    @Override
    protected void bq() {
        switch (this.V.nextInt(3)) {
            case 0: {
                this.a(zy.j, 1);
                break;
            }
            case 1: {
                this.a(zy.bR, 1);
                break;
            }
            case 2: {
                this.a(zy.bS, 1);
                break;
            }
        }
    }
    
    @Override
    protected void a(final ok \u2603) {
        super.a(\u2603);
        if (this.V.nextFloat() < ((this.o.aa() == oj.d) ? 0.05f : 0.01f)) {
            final int nextInt = this.V.nextInt(3);
            if (nextInt == 0) {
                this.c(0, new zx(zy.l));
            }
            else {
                this.c(0, new zx(zy.a));
            }
        }
    }
    
    @Override
    public void b(final dn \u2603) {
        super.b(\u2603);
        if (this.j_()) {
            \u2603.a("IsBaby", true);
        }
        if (this.co()) {
            \u2603.a("IsVillager", true);
        }
        \u2603.a("ConversionTime", this.cp() ? this.bn : -1);
        \u2603.a("CanBreakDoors", this.cn());
    }
    
    @Override
    public void a(final dn \u2603) {
        super.a(\u2603);
        if (\u2603.n("IsBaby")) {
            this.l(true);
        }
        if (\u2603.n("IsVillager")) {
            this.m(true);
        }
        if (\u2603.b("ConversionTime", 99) && \u2603.f("ConversionTime") > -1) {
            this.a(\u2603.f("ConversionTime"));
        }
        this.a(\u2603.n("CanBreakDoors"));
    }
    
    @Override
    public void a(final pr \u2603) {
        super.a(\u2603);
        if ((this.o.aa() == oj.c || this.o.aa() == oj.d) && \u2603 instanceof wi) {
            if (this.o.aa() != oj.d && this.V.nextBoolean()) {
                return;
            }
            final ps ps = (ps)\u2603;
            final we we = new we(this.o);
            we.m(\u2603);
            this.o.e(\u2603);
            we.a(this.o.E(new cj(we)), null);
            we.m(true);
            if (\u2603.j_()) {
                we.l(true);
            }
            we.k(ps.ce());
            if (ps.l_()) {
                we.a(ps.aM());
                we.g(ps.aN());
            }
            this.o.d(we);
            this.o.a(null, 1016, new cj((int)this.s, (int)this.t, (int)this.u), 0);
        }
    }
    
    @Override
    public float aS() {
        float n = 1.74f;
        if (this.j_()) {
            n -= (float)0.81;
        }
        return n;
    }
    
    @Override
    protected boolean a(final zx \u2603) {
        return (\u2603.b() != zy.aP || !this.j_() || !this.au()) && super.a(\u2603);
    }
    
    @Override
    public pu a(final ok \u2603, pu \u2603) {
        \u2603 = super.a(\u2603, \u2603);
        final float c = \u2603.c();
        this.j(this.V.nextFloat() < 0.55f * c);
        if (\u2603 == null) {
            \u2603 = new a(this.o.s.nextFloat() < 0.05f, this.o.s.nextFloat() < 0.05f);
        }
        if (\u2603 instanceof a) {
            final a a = (a)\u2603;
            if (a.b) {
                this.m(true);
            }
            if (a.a) {
                this.l(true);
                if (this.o.s.nextFloat() < 0.05) {
                    final List<tn> a2 = this.o.a((Class<? extends tn>)tn.class, this.aR().b(5.0, 3.0, 5.0), (Predicate<? super tn>)po.b);
                    if (!a2.isEmpty()) {
                        final tn \u26032 = a2.get(0);
                        \u26032.l(true);
                        this.a((pk)\u26032);
                    }
                }
                else if (this.o.s.nextFloat() < 0.05) {
                    final tn tn = new tn(this.o);
                    tn.b(this.s, this.t, this.u, this.y, 0.0f);
                    tn.a(\u2603, null);
                    tn.l(true);
                    this.o.d(tn);
                    this.a((pk)tn);
                }
            }
        }
        this.a(this.V.nextFloat() < c * 0.1f);
        this.a(\u2603);
        this.b(\u2603);
        if (this.p(4) == null) {
            final Calendar y = this.o.Y();
            if (y.get(2) + 1 == 10 && y.get(5) == 31 && this.V.nextFloat() < 0.25f) {
                this.c(4, new zx((this.V.nextFloat() < 0.1f) ? afi.aZ : afi.aU));
                this.bj[4] = 0.0f;
            }
        }
        this.a(vy.c).b(new qd("Random spawn bonus", this.V.nextDouble() * 0.05000000074505806, 0));
        final double \u26033 = this.V.nextDouble() * 1.5 * c;
        if (\u26033 > 1.0) {
            this.a(vy.b).b(new qd("Random zombie-spawn bonus", \u26033, 2));
        }
        if (this.V.nextFloat() < c * 0.05f) {
            this.a(we.a).b(new qd("Leader zombie bonus", this.V.nextDouble() * 0.25 + 0.5, 0));
            this.a(vy.a).b(new qd("Leader zombie bonus", this.V.nextDouble() * 3.0 + 1.0, 2));
            this.a(true);
        }
        return \u2603;
    }
    
    public boolean a(final wn \u2603) {
        final zx bz = \u2603.bZ();
        if (bz != null && bz.b() == zy.ao && bz.i() == 0 && this.co() && this.a(pe.t)) {
            if (!\u2603.bA.d) {
                final zx zx = bz;
                --zx.b;
            }
            if (bz.b <= 0) {
                \u2603.bi.a(\u2603.bi.c, null);
            }
            if (!this.o.D) {
                this.a(this.V.nextInt(2401) + 3600);
            }
            return true;
        }
        return false;
    }
    
    protected void a(final int \u2603) {
        this.bn = \u2603;
        this.H().b(14, (Byte)1);
        this.m(pe.t.H);
        this.c(new pf(pe.g.H, \u2603, Math.min(this.o.aa().a() - 1, 0)));
        this.o.a(this, (byte)16);
    }
    
    @Override
    public void a(final byte \u2603) {
        if (\u2603 == 16) {
            if (!this.R()) {
                this.o.a(this.s + 0.5, this.t + 0.5, this.u + 0.5, "mob.zombie.remedy", 1.0f + this.V.nextFloat(), this.V.nextFloat() * 0.7f + 0.3f, false);
            }
        }
        else {
            super.a(\u2603);
        }
    }
    
    @Override
    protected boolean C() {
        return !this.cp();
    }
    
    public boolean cp() {
        return this.H().a(14) == 1;
    }
    
    protected void cq() {
        final wi wi = new wi(this.o);
        wi.m(this);
        wi.a(this.o.E(new cj(wi)), null);
        wi.cp();
        if (this.j_()) {
            wi.b(-24000);
        }
        this.o.e(this);
        wi.k(this.ce());
        if (this.l_()) {
            wi.a(this.aM());
            wi.g(this.aN());
        }
        this.o.d(wi);
        wi.c(new pf(pe.k.H, 200, 0));
        this.o.a(null, 1017, new cj((int)this.s, (int)this.t, (int)this.u), 0);
    }
    
    protected int cr() {
        int n = 1;
        if (this.V.nextFloat() < 0.01f) {
            int n2 = 0;
            final cj.a a = new cj.a();
            for (int \u2603 = (int)this.s - 4; \u2603 < (int)this.s + 4 && n2 < 14; ++\u2603) {
                for (int \u26032 = (int)this.t - 4; \u26032 < (int)this.t + 4 && n2 < 14; ++\u26032) {
                    for (int \u26033 = (int)this.u - 4; \u26033 < (int)this.u + 4 && n2 < 14; ++\u26033) {
                        final afh c = this.o.p(a.c(\u2603, \u26032, \u26033)).c();
                        if (c == afi.bi || c == afi.C) {
                            if (this.V.nextFloat() < 0.3f) {
                                ++n;
                            }
                            ++n2;
                        }
                    }
                }
            }
        }
        return n;
    }
    
    public void n(final boolean \u2603) {
        this.a(\u2603 ? 0.5f : 1.0f);
    }
    
    @Override
    protected final void a(final float \u2603, final float \u2603) {
        final boolean b = this.bp > 0.0f && this.bq > 0.0f;
        this.bp = \u2603;
        this.bq = \u2603;
        if (!b) {
            this.a(1.0f);
        }
    }
    
    protected final void a(final float \u2603) {
        super.a(this.bp * \u2603, this.bq * \u2603);
    }
    
    @Override
    public double am() {
        return this.j_() ? 0.0 : -0.35;
    }
    
    @Override
    public void a(final ow \u2603) {
        super.a(\u2603);
        if (\u2603.j() instanceof vn && !(this instanceof vw) && ((vn)\u2603.j()).n() && ((vn)\u2603.j()).cp()) {
            ((vn)\u2603.j()).cq();
            this.a(new zx(zy.bX, 1, 2), 0.0f);
        }
    }
    
    static {
        a = new qj(null, "zombie.spawnReinforcements", 0.0, 0.0, 1.0).a("Spawn Reinforcements Chance");
        b = UUID.fromString("B9766B59-9566-4402-BC1F-2EE2A276D836");
        c = new qd(we.b, "Baby speed boost", 0.5, 1);
    }
    
    class a implements pu
    {
        public boolean a;
        public boolean b;
        
        private a(final boolean \u2603, final boolean \u2603) {
            this.a = false;
            this.b = false;
            this.a = \u2603;
            this.b = \u2603;
        }
    }
}
