import java.util.Calendar;

// 
// Decompiled by Procyon v0.5.36
// 

public class wa extends vv implements vx
{
    private sa a;
    private rl b;
    
    public wa(final adm \u2603) {
        super(\u2603);
        this.a = new sa(this, 1.0, 20, 60, 15.0f);
        this.b = new rl(this, wn.class, 1.2, false);
        this.i.a(1, new ra(this));
        this.i.a(2, new sc(this));
        this.i.a(3, new qz(this, 1.0));
        this.i.a(3, new qs<Object>(this, ua.class, 6.0f, 1.0, 1.2));
        this.i.a(4, new rz(this, 1.0));
        this.i.a(6, new ri(this, wn.class, 8.0f));
        this.i.a(6, new ry(this));
        this.bi.a(1, new sm(this, false, new Class[0]));
        this.bi.a(2, new sp<Object>(this, wn.class, true));
        this.bi.a(3, new sp<Object>(this, ty.class, true));
        if (\u2603 != null && !\u2603.D) {
            this.n();
        }
    }
    
    @Override
    protected void aX() {
        super.aX();
        this.a(vy.d).a(0.25);
    }
    
    @Override
    protected void h() {
        super.h();
        this.ac.a(13, new Byte((byte)0));
    }
    
    @Override
    protected String z() {
        return "mob.skeleton.say";
    }
    
    @Override
    protected String bo() {
        return "mob.skeleton.hurt";
    }
    
    @Override
    protected String bp() {
        return "mob.skeleton.death";
    }
    
    @Override
    protected void a(final cj \u2603, final afh \u2603) {
        this.a("mob.skeleton.step", 0.15f, 1.0f);
    }
    
    @Override
    public boolean r(final pk \u2603) {
        if (super.r(\u2603)) {
            if (this.cm() == 1 && \u2603 instanceof pr) {
                ((pr)\u2603).c(new pf(pe.v.H, 200));
            }
            return true;
        }
        return false;
    }
    
    @Override
    public pw bz() {
        return pw.b;
    }
    
    @Override
    public void m() {
        if (this.o.w() && !this.o.D) {
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
        if (this.o.D && this.cm() == 1) {
            this.a(0.72f, 2.535f);
        }
        super.m();
    }
    
    @Override
    public void ak() {
        super.ak();
        if (this.m instanceof py) {
            final py py = (py)this.m;
            this.aI = py.aI;
        }
    }
    
    @Override
    public void a(final ow \u2603) {
        super.a(\u2603);
        if (\u2603.i() instanceof wq && \u2603.j() instanceof wn) {
            final wn wn = (wn)\u2603.j();
            final double n = wn.s - this.s;
            final double n2 = wn.u - this.u;
            if (n * n + n2 * n2 >= 2500.0) {
                wn.b(mr.v);
            }
        }
        else if (\u2603.j() instanceof vn && ((vn)\u2603.j()).n() && ((vn)\u2603.j()).cp()) {
            ((vn)\u2603.j()).cq();
            this.a(new zx(zy.bX, 1, (int)((this.cm() == 1) ? 1 : 0)), 0.0f);
        }
    }
    
    @Override
    protected zw A() {
        return zy.g;
    }
    
    @Override
    protected void b(final boolean \u2603, final int \u2603) {
        if (this.cm() == 1) {
            for (int n = this.V.nextInt(3 + \u2603) - 1, i = 0; i < n; ++i) {
                this.a(zy.h, 1);
            }
        }
        else {
            for (int n = this.V.nextInt(3 + \u2603), i = 0; i < n; ++i) {
                this.a(zy.g, 1);
            }
        }
        for (int n = this.V.nextInt(3 + \u2603), i = 0; i < n; ++i) {
            this.a(zy.aX, 1);
        }
    }
    
    @Override
    protected void bq() {
        if (this.cm() == 1) {
            this.a(new zx(zy.bX, 1, 1), 0.0f);
        }
    }
    
    @Override
    protected void a(final ok \u2603) {
        super.a(\u2603);
        this.c(0, new zx(zy.f));
    }
    
    @Override
    public pu a(final ok \u2603, pu \u2603) {
        \u2603 = super.a(\u2603, \u2603);
        if (this.o.t instanceof ann && this.bc().nextInt(5) > 0) {
            this.i.a(4, this.b);
            this.a(1);
            this.c(0, new zx(zy.q));
            this.a(vy.e).a(4.0);
        }
        else {
            this.i.a(4, this.a);
            this.a(\u2603);
            this.b(\u2603);
        }
        this.j(this.V.nextFloat() < 0.55f * \u2603.c());
        if (this.p(4) == null) {
            final Calendar y = this.o.Y();
            if (y.get(2) + 1 == 10 && y.get(5) == 31 && this.V.nextFloat() < 0.25f) {
                this.c(4, new zx((this.V.nextFloat() < 0.1f) ? afi.aZ : afi.aU));
                this.bj[4] = 0.0f;
            }
        }
        return \u2603;
    }
    
    public void n() {
        this.i.a(this.b);
        this.i.a(this.a);
        final zx ba = this.bA();
        if (ba != null && ba.b() == zy.f) {
            this.i.a(4, this.a);
        }
        else {
            this.i.a(4, this.b);
        }
    }
    
    @Override
    public void a(final pr \u2603, final float \u2603) {
        final wq \u26032 = new wq(this.o, this, \u2603, 1.6f, (float)(14 - this.o.aa().a() * 4));
        final int a = ack.a(aci.v.B, this.bA());
        final int a2 = ack.a(aci.w.B, this.bA());
        \u26032.b(\u2603 * 2.0f + (this.V.nextGaussian() * 0.25 + this.o.aa().a() * 0.11f));
        if (a > 0) {
            \u26032.b(\u26032.j() + a * 0.5 + 0.5);
        }
        if (a2 > 0) {
            \u26032.a(a2);
        }
        if (ack.a(aci.x.B, this.bA()) > 0 || this.cm() == 1) {
            \u26032.e(100);
        }
        this.a("random.bow", 1.0f, 1.0f / (this.bc().nextFloat() * 0.4f + 0.8f));
        this.o.d(\u26032);
    }
    
    public int cm() {
        return this.ac.a(13);
    }
    
    public void a(final int \u2603) {
        this.ac.b(13, (byte)\u2603);
        this.ab = (\u2603 == 1);
        if (\u2603 == 1) {
            this.a(0.72f, 2.535f);
        }
        else {
            this.a(0.6f, 1.95f);
        }
    }
    
    @Override
    public void a(final dn \u2603) {
        super.a(\u2603);
        if (\u2603.b("SkeletonType", 99)) {
            final int d = \u2603.d("SkeletonType");
            this.a(d);
        }
        this.n();
    }
    
    @Override
    public void b(final dn \u2603) {
        super.b(\u2603);
        \u2603.a("SkeletonType", (byte)this.cm());
    }
    
    @Override
    public void c(final int \u2603, final zx \u2603) {
        super.c(\u2603, \u2603);
        if (!this.o.D && \u2603 == 0) {
            this.n();
        }
    }
    
    @Override
    public float aS() {
        if (this.cm() == 1) {
            return super.aS();
        }
        return 1.74f;
    }
    
    @Override
    public double am() {
        return this.j_() ? 0.0 : -0.35;
    }
}
