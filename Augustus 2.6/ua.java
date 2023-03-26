import com.google.common.base.Predicate;

// 
// Decompiled by Procyon v0.5.36
// 

public class ua extends qa
{
    private float bo;
    private float bp;
    private boolean bq;
    private boolean br;
    private float bs;
    private float bt;
    
    public ua(final adm \u2603) {
        super(\u2603);
        this.a(0.6f, 0.8f);
        ((sv)this.s()).a(true);
        this.i.a(1, new ra(this));
        this.i.a(2, this.bm);
        this.i.a(3, new rh(this, 0.4f));
        this.i.a(4, new rl(this, 1.0, true));
        this.i.a(5, new rb(this, 1.0, 10.0f, 2.0f));
        this.i.a(6, new qv(this, 1.0));
        this.i.a(7, new rz(this, 1.0));
        this.i.a(8, new qt(this, 8.0f));
        this.i.a(9, new ri(this, wn.class, 8.0f));
        this.i.a(9, new ry(this));
        this.bi.a(1, new sr(this));
        this.bi.a(2, new ss(this));
        this.bi.a(3, new sm(this, true, new Class[0]));
        this.bi.a(4, new sq<Object>(this, tm.class, false, new Predicate<pk>() {
            public boolean a(final pk \u2603) {
                return \u2603 instanceof tv || \u2603 instanceof tu;
            }
        }));
        this.bi.a(5, new sp<Object>(this, wa.class, false));
        this.m(false);
    }
    
    @Override
    protected void aX() {
        super.aX();
        this.a(vy.d).a(0.30000001192092896);
        if (this.cl()) {
            this.a(vy.a).a(20.0);
        }
        else {
            this.a(vy.a).a(8.0);
        }
        this.by().b(vy.e);
        this.a(vy.e).a(2.0);
    }
    
    @Override
    public void d(final pr \u2603) {
        super.d(\u2603);
        if (\u2603 == null) {
            this.o(false);
        }
        else if (!this.cl()) {
            this.o(true);
        }
    }
    
    @Override
    protected void E() {
        this.ac.b(18, this.bn());
    }
    
    @Override
    protected void h() {
        super.h();
        this.ac.a(18, new Float(this.bn()));
        this.ac.a(19, new Byte((byte)0));
        this.ac.a(20, new Byte((byte)zd.o.a()));
    }
    
    @Override
    protected void a(final cj \u2603, final afh \u2603) {
        this.a("mob.wolf.step", 0.15f, 1.0f);
    }
    
    @Override
    public void b(final dn \u2603) {
        super.b(\u2603);
        \u2603.a("Angry", this.cv());
        \u2603.a("CollarColor", (byte)this.cw().b());
    }
    
    @Override
    public void a(final dn \u2603) {
        super.a(\u2603);
        this.o(\u2603.n("Angry"));
        if (\u2603.b("CollarColor", 99)) {
            this.a(zd.a(\u2603.d("CollarColor")));
        }
    }
    
    @Override
    protected String z() {
        if (this.cv()) {
            return "mob.wolf.growl";
        }
        if (this.V.nextInt(3) != 0) {
            return "mob.wolf.bark";
        }
        if (this.cl() && this.ac.d(18) < 10.0f) {
            return "mob.wolf.whine";
        }
        return "mob.wolf.panting";
    }
    
    @Override
    protected String bo() {
        return "mob.wolf.hurt";
    }
    
    @Override
    protected String bp() {
        return "mob.wolf.death";
    }
    
    @Override
    protected float bB() {
        return 0.4f;
    }
    
    @Override
    protected zw A() {
        return zw.b(-1);
    }
    
    @Override
    public void m() {
        super.m();
        if (!this.o.D && this.bq && !this.br && !this.cf() && this.C) {
            this.br = true;
            this.bs = 0.0f;
            this.bt = 0.0f;
            this.o.a(this, (byte)8);
        }
        if (!this.o.D && this.u() == null && this.cv()) {
            this.o(false);
        }
    }
    
    @Override
    public void t_() {
        super.t_();
        this.bp = this.bo;
        if (this.cx()) {
            this.bo += (1.0f - this.bo) * 0.4f;
        }
        else {
            this.bo += (0.0f - this.bo) * 0.4f;
        }
        if (this.U()) {
            this.bq = true;
            this.br = false;
            this.bs = 0.0f;
            this.bt = 0.0f;
        }
        else if ((this.bq || this.br) && this.br) {
            if (this.bs == 0.0f) {
                this.a("mob.wolf.shake", this.bB(), (this.V.nextFloat() - this.V.nextFloat()) * 0.2f + 1.0f);
            }
            this.bt = this.bs;
            this.bs += 0.05f;
            if (this.bt >= 2.0f) {
                this.bq = false;
                this.br = false;
                this.bt = 0.0f;
                this.bs = 0.0f;
            }
            if (this.bs > 0.4f) {
                final float n = (float)this.aR().b;
                for (int n2 = (int)(ns.a((this.bs - 0.4f) * 3.1415927f) * 7.0f), i = 0; i < n2; ++i) {
                    final float n3 = (this.V.nextFloat() * 2.0f - 1.0f) * this.J * 0.5f;
                    final float n4 = (this.V.nextFloat() * 2.0f - 1.0f) * this.J * 0.5f;
                    this.o.a(cy.f, this.s + n3, n + 0.8f, this.u + n4, this.v, this.w, this.x, new int[0]);
                }
            }
        }
    }
    
    public boolean ct() {
        return this.bq;
    }
    
    public float p(final float \u2603) {
        return 0.75f + (this.bt + (this.bs - this.bt) * \u2603) / 2.0f * 0.25f;
    }
    
    public float i(final float \u2603, final float \u2603) {
        float n = (this.bt + (this.bs - this.bt) * \u2603 + \u2603) / 1.8f;
        if (n < 0.0f) {
            n = 0.0f;
        }
        else if (n > 1.0f) {
            n = 1.0f;
        }
        return ns.a(n * 3.1415927f) * ns.a(n * 3.1415927f * 11.0f) * 0.15f * 3.1415927f;
    }
    
    public float q(final float \u2603) {
        return (this.bp + (this.bo - this.bp) * \u2603) * 0.15f * 3.1415927f;
    }
    
    @Override
    public float aS() {
        return this.K * 0.8f;
    }
    
    @Override
    public int bQ() {
        if (this.cn()) {
            return 20;
        }
        return super.bQ();
    }
    
    @Override
    public boolean a(final ow \u2603, float \u2603) {
        if (this.b(\u2603)) {
            return false;
        }
        final pk j = \u2603.j();
        this.bm.a(false);
        if (j != null && !(j instanceof wn) && !(j instanceof wq)) {
            \u2603 = (\u2603 + 1.0f) / 2.0f;
        }
        return super.a(\u2603, \u2603);
    }
    
    @Override
    public boolean r(final pk \u2603) {
        final boolean a = \u2603.a(ow.a(this), (float)(int)this.a(vy.e).e());
        if (a) {
            this.a(this, \u2603);
        }
        return a;
    }
    
    @Override
    public void m(final boolean \u2603) {
        super.m(\u2603);
        if (\u2603) {
            this.a(vy.a).a(20.0);
        }
        else {
            this.a(vy.a).a(8.0);
        }
        this.a(vy.e).a(4.0);
    }
    
    @Override
    public boolean a(final wn \u2603) {
        final zx h = \u2603.bi.h();
        if (this.cl()) {
            if (h != null) {
                if (h.b() instanceof zs) {
                    final zs zs = (zs)h.b();
                    if (zs.g() && this.ac.d(18) < 20.0f) {
                        if (!\u2603.bA.d) {
                            final zx zx = h;
                            --zx.b;
                        }
                        this.h((float)zs.h(h));
                        if (h.b <= 0) {
                            \u2603.bi.a(\u2603.bi.c, null);
                        }
                        return true;
                    }
                }
                else if (h.b() == zy.aW) {
                    final zd a = zd.a(h.i());
                    if (a != this.cw()) {
                        this.a(a);
                        if (!\u2603.bA.d) {
                            final zx zx2 = h;
                            if (--zx2.b <= 0) {
                                \u2603.bi.a(\u2603.bi.c, null);
                            }
                        }
                        return true;
                    }
                }
            }
            if (this.e((pr)\u2603) && !this.o.D && !this.d(h)) {
                this.bm.a(!this.cn());
                this.aY = false;
                this.h.n();
                this.d((pr)null);
            }
        }
        else if (h != null && h.b() == zy.aX && !this.cv()) {
            if (!\u2603.bA.d) {
                final zx zx3 = h;
                --zx3.b;
            }
            if (h.b <= 0) {
                \u2603.bi.a(\u2603.bi.c, null);
            }
            if (!this.o.D) {
                if (this.V.nextInt(3) == 0) {
                    this.m(true);
                    this.h.n();
                    this.d((pr)null);
                    this.bm.a(true);
                    this.i(20.0f);
                    this.b(\u2603.aK().toString());
                    this.l(true);
                    this.o.a(this, (byte)7);
                }
                else {
                    this.l(false);
                    this.o.a(this, (byte)6);
                }
            }
            return true;
        }
        return super.a(\u2603);
    }
    
    @Override
    public void a(final byte \u2603) {
        if (\u2603 == 8) {
            this.br = true;
            this.bs = 0.0f;
            this.bt = 0.0f;
        }
        else {
            super.a(\u2603);
        }
    }
    
    public float cu() {
        if (this.cv()) {
            return 1.5393804f;
        }
        if (this.cl()) {
            return (0.55f - (20.0f - this.ac.d(18)) * 0.02f) * 3.1415927f;
        }
        return 0.62831855f;
    }
    
    @Override
    public boolean d(final zx \u2603) {
        return \u2603 != null && \u2603.b() instanceof zs && ((zs)\u2603.b()).g();
    }
    
    @Override
    public int bV() {
        return 8;
    }
    
    public boolean cv() {
        return (this.ac.a(16) & 0x2) != 0x0;
    }
    
    public void o(final boolean \u2603) {
        final byte a = this.ac.a(16);
        if (\u2603) {
            this.ac.b(16, (byte)(a | 0x2));
        }
        else {
            this.ac.b(16, (byte)(a & 0xFFFFFFFD));
        }
    }
    
    public zd cw() {
        return zd.a(this.ac.a(20) & 0xF);
    }
    
    public void a(final zd \u2603) {
        this.ac.b(20, (byte)(\u2603.b() & 0xF));
    }
    
    public ua b(final ph \u2603) {
        final ua ua = new ua(this.o);
        final String b = this.b();
        if (b != null && b.trim().length() > 0) {
            ua.b(b);
            ua.m(true);
        }
        return ua;
    }
    
    public void p(final boolean \u2603) {
        if (\u2603) {
            this.ac.b(19, (Byte)1);
        }
        else {
            this.ac.b(19, (Byte)0);
        }
    }
    
    @Override
    public boolean a(final tm \u2603) {
        if (\u2603 == this) {
            return false;
        }
        if (!this.cl()) {
            return false;
        }
        if (!(\u2603 instanceof ua)) {
            return false;
        }
        final ua ua = (ua)\u2603;
        return ua.cl() && !ua.cn() && this.cr() && ua.cr();
    }
    
    public boolean cx() {
        return this.ac.a(19) == 1;
    }
    
    @Override
    protected boolean C() {
        return !this.cl() && this.W > 2400;
    }
    
    @Override
    public boolean a(final pr \u2603, final pr \u2603) {
        if (\u2603 instanceof vn || \u2603 instanceof vr) {
            return false;
        }
        if (\u2603 instanceof ua) {
            final ua ua = (ua)\u2603;
            if (ua.cl() && ua.co() == \u2603) {
                return false;
            }
        }
        return (!(\u2603 instanceof wn) || !(\u2603 instanceof wn) || ((wn)\u2603).a((wn)\u2603)) && (!(\u2603 instanceof tp) || !((tp)\u2603).co());
    }
    
    @Override
    public boolean cb() {
        return !this.cv() && super.cb();
    }
}
