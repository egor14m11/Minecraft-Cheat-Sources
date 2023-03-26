// 
// Decompiled by Procyon v0.5.36
// 

public class tu extends tm
{
    private c<ua> bm;
    private int bo;
    private int bp;
    private boolean bq;
    private boolean br;
    private int bs;
    private b bt;
    private int bu;
    private wn bv;
    
    public tu(final adm \u2603) {
        super(\u2603);
        this.bo = 0;
        this.bp = 0;
        this.bq = false;
        this.br = false;
        this.bs = 0;
        this.bt = b.b;
        this.bu = 0;
        this.bv = null;
        this.a(0.6f, 0.7f);
        this.g = new e(this);
        this.f = new f(this);
        ((sv)this.s()).a(true);
        this.h.a(2.5f);
        this.i.a(1, new ra(this));
        this.i.a(1, new g(this, 1.33));
        this.i.a(2, new sh(this, 1.0, zy.bR, false));
        this.i.a(2, new sh(this, 1.0, zy.bW, false));
        this.i.a(2, new sh(this, 1.0, zw.a(afi.N), false));
        this.i.a(3, new qv(this, 0.8));
        this.i.a(5, new h(this));
        this.i.a(5, new rz(this, 0.6));
        this.i.a(11, new ri(this, wn.class, 10.0f));
        this.bm = new c<ua>(this, ua.class, 16.0f, 1.33, 1.33);
        this.i.a(4, this.bm);
        this.b(0.0);
    }
    
    @Override
    protected float bE() {
        if (this.f.a() && this.f.e() > this.t + 0.5) {
            return 0.5f;
        }
        return this.bt.b();
    }
    
    public void a(final b \u2603) {
        this.bt = \u2603;
    }
    
    public float p(final float \u2603) {
        if (this.bp == 0) {
            return 0.0f;
        }
        return (this.bo + \u2603) / this.bp;
    }
    
    public void b(final double \u2603) {
        this.s().a(\u2603);
        this.f.a(this.f.d(), this.f.e(), this.f.f(), \u2603);
    }
    
    public void a(final boolean \u2603, final b \u2603) {
        super.i(\u2603);
        if (!\u2603) {
            if (this.bt == b.e) {
                this.bt = b.b;
            }
        }
        else {
            this.b(1.5 * \u2603.a());
            this.a(this.cm(), this.bB(), ((this.V.nextFloat() - this.V.nextFloat()) * 0.2f + 1.0f) * 0.8f);
        }
        this.bq = \u2603;
    }
    
    public void b(final b \u2603) {
        this.a(true, \u2603);
        this.bp = \u2603.d();
        this.bo = 0;
    }
    
    public boolean cl() {
        return this.bq;
    }
    
    @Override
    protected void h() {
        super.h();
        this.ac.a(18, (Byte)0);
    }
    
    public void E() {
        if (this.f.b() > 0.8) {
            this.a(b.d);
        }
        else if (this.bt != b.e) {
            this.a(b.b);
        }
        if (this.bs > 0) {
            --this.bs;
        }
        if (this.bu > 0) {
            this.bu -= this.V.nextInt(3);
            if (this.bu < 0) {
                this.bu = 0;
            }
        }
        if (this.C) {
            if (!this.br) {
                this.a(false, b.a);
                this.cw();
            }
            if (this.cn() == 99 && this.bs == 0) {
                final pr u = this.u();
                if (u != null && this.h(u) < 16.0) {
                    this.a(u.s, u.u);
                    this.f.a(u.s, u.t, u.u, this.f.b());
                    this.b(b.e);
                    this.br = true;
                }
            }
            final e e = (e)this.g;
            if (!e.c()) {
                if (this.f.a() && this.bs == 0) {
                    final asx j = this.h.j();
                    aui a = new aui(this.f.d(), this.f.e(), this.f.f());
                    if (j != null && j.e() < j.d()) {
                        a = j.a(this);
                    }
                    this.a(a.a, a.c);
                    this.b(this.bt);
                }
            }
            else if (!e.d()) {
                this.ct();
            }
        }
        this.br = this.C;
    }
    
    @Override
    public void Y() {
    }
    
    private void a(final double \u2603, final double \u2603) {
        this.y = (float)(ns.b(\u2603 - this.u, \u2603 - this.s) * 180.0 / 3.1415927410125732) - 90.0f;
    }
    
    private void ct() {
        ((e)this.g).a(true);
    }
    
    private void cu() {
        ((e)this.g).a(false);
    }
    
    private void cv() {
        this.bs = this.co();
    }
    
    private void cw() {
        this.cv();
        this.cu();
    }
    
    @Override
    public void m() {
        super.m();
        if (this.bo != this.bp) {
            if (this.bo == 0 && !this.o.D) {
                this.o.a(this, (byte)1);
            }
            ++this.bo;
        }
        else if (this.bp != 0) {
            this.bo = 0;
            this.bp = 0;
        }
    }
    
    @Override
    protected void aX() {
        super.aX();
        this.a(vy.a).a(10.0);
        this.a(vy.d).a(0.30000001192092896);
    }
    
    @Override
    public void b(final dn \u2603) {
        super.b(\u2603);
        \u2603.a("RabbitType", this.cn());
        \u2603.a("MoreCarrotTicks", this.bu);
    }
    
    @Override
    public void a(final dn \u2603) {
        super.a(\u2603);
        this.r(\u2603.f("RabbitType"));
        this.bu = \u2603.f("MoreCarrotTicks");
    }
    
    protected String cm() {
        return "mob.rabbit.hop";
    }
    
    @Override
    protected String z() {
        return "mob.rabbit.idle";
    }
    
    @Override
    protected String bo() {
        return "mob.rabbit.hurt";
    }
    
    @Override
    protected String bp() {
        return "mob.rabbit.death";
    }
    
    @Override
    public boolean r(final pk \u2603) {
        if (this.cn() == 99) {
            this.a("mob.attack", 1.0f, (this.V.nextFloat() - this.V.nextFloat()) * 0.2f + 1.0f);
            return \u2603.a(ow.a(this), 8.0f);
        }
        return \u2603.a(ow.a(this), 3.0f);
    }
    
    @Override
    public int br() {
        if (this.cn() == 99) {
            return 8;
        }
        return super.br();
    }
    
    @Override
    public boolean a(final ow \u2603, final float \u2603) {
        return !this.b(\u2603) && super.a(\u2603, \u2603);
    }
    
    @Override
    protected void bq() {
        this.a(new zx(zy.br, 1), 0.0f);
    }
    
    @Override
    protected void b(final boolean \u2603, final int \u2603) {
        for (int nextInt = this.V.nextInt(2) + this.V.nextInt(1 + \u2603), i = 0; i < nextInt; ++i) {
            this.a(zy.bs, 1);
        }
        for (int nextInt = this.V.nextInt(2), i = 0; i < nextInt; ++i) {
            if (this.at()) {
                this.a(zy.bp, 1);
            }
            else {
                this.a(zy.bo, 1);
            }
        }
    }
    
    private boolean a(final zw \u2603) {
        return \u2603 == zy.bR || \u2603 == zy.bW || \u2603 == zw.a(afi.N);
    }
    
    public tu b(final ph \u2603) {
        final tu tu = new tu(this.o);
        if (\u2603 instanceof tu) {
            tu.r(this.V.nextBoolean() ? this.cn() : ((tu)\u2603).cn());
        }
        return tu;
    }
    
    @Override
    public boolean d(final zx \u2603) {
        return \u2603 != null && this.a(\u2603.b());
    }
    
    public int cn() {
        return this.ac.a(18);
    }
    
    public void r(final int \u2603) {
        if (\u2603 == 99) {
            this.i.a(this.bm);
            this.i.a(4, new a(this));
            this.bi.a(1, new sm(this, false, new Class[0]));
            this.bi.a(2, new sp<Object>(this, wn.class, true));
            this.bi.a(2, new sp<Object>(this, ua.class, true));
            if (!this.l_()) {
                this.a(di.a("entity.KillerBunny.name"));
            }
        }
        this.ac.b(18, (byte)\u2603);
    }
    
    @Override
    public pu a(final ok \u2603, pu \u2603) {
        \u2603 = super.a(\u2603, \u2603);
        int n = this.V.nextInt(6);
        boolean b = false;
        if (\u2603 instanceof d) {
            n = ((d)\u2603).a;
            b = true;
        }
        else {
            \u2603 = new d(n);
        }
        this.r(n);
        if (b) {
            this.b(-24000);
        }
        return \u2603;
    }
    
    private boolean cx() {
        return this.bu == 0;
    }
    
    protected int co() {
        return this.bt.c();
    }
    
    protected void cp() {
        this.o.a(cy.M, this.s + this.V.nextFloat() * this.J * 2.0f - this.J, this.t + 0.5 + this.V.nextFloat() * this.K, this.u + this.V.nextFloat() * this.J * 2.0f - this.J, 0.0, 0.0, 0.0, afh.f(afi.cb.a(7)));
        this.bu = 100;
    }
    
    @Override
    public void a(final byte \u2603) {
        if (\u2603 == 1) {
            this.Z();
            this.bp = 10;
            this.bo = 0;
        }
        else {
            super.a(\u2603);
        }
    }
    
    public static class d implements pu
    {
        public int a;
        
        public d(final int \u2603) {
            this.a = \u2603;
        }
    }
    
    public class e extends qo
    {
        private tu c;
        private boolean d;
        
        public e(final tu \u2603) {
            super(\u2603);
            this.d = false;
            this.c = \u2603;
        }
        
        public boolean c() {
            return this.a;
        }
        
        public boolean d() {
            return this.d;
        }
        
        public void a(final boolean \u2603) {
            this.d = \u2603;
        }
        
        @Override
        public void b() {
            if (this.a) {
                this.c.b(tu.b.c);
                this.a = false;
            }
        }
    }
    
    static class f extends qq
    {
        private tu g;
        
        public f(final tu \u2603) {
            super(\u2603);
            this.g = \u2603;
        }
        
        @Override
        public void c() {
            if (this.g.C && !this.g.cl()) {
                this.g.b(0.0);
            }
            super.c();
        }
    }
    
    static class c<T extends pk> extends qs<T>
    {
        private tu c;
        
        public c(final tu \u2603, final Class<T> \u2603, final float \u2603, final double \u2603, final double \u2603) {
            super(\u2603, \u2603, \u2603, \u2603, \u2603);
            this.c = \u2603;
        }
        
        @Override
        public void e() {
            super.e();
        }
    }
    
    static class h extends ro
    {
        private final tu c;
        private boolean d;
        private boolean e;
        
        public h(final tu \u2603) {
            super(\u2603, 0.699999988079071, 16);
            this.e = false;
            this.c = \u2603;
        }
        
        @Override
        public boolean a() {
            if (this.a <= 0) {
                if (!this.c.o.Q().b("mobGriefing")) {
                    return false;
                }
                this.e = false;
                this.d = this.c.cx();
            }
            return super.a();
        }
        
        @Override
        public boolean b() {
            return this.e && super.b();
        }
        
        @Override
        public void c() {
            super.c();
        }
        
        @Override
        public void d() {
            super.d();
        }
        
        @Override
        public void e() {
            super.e();
            this.c.p().a(this.b.n() + 0.5, this.b.o() + 1, this.b.p() + 0.5, 10.0f, (float)this.c.bQ());
            if (this.f()) {
                final adm o = this.c.o;
                final cj a = this.b.a();
                final alz p = o.p(a);
                final afh c = p.c();
                if (this.e && c instanceof afq && p.b((amo<Integer>)afq.a) == 7) {
                    o.a(a, afi.a.Q(), 2);
                    o.b(a, true);
                    this.c.cp();
                }
                this.e = false;
                this.a = 10;
            }
        }
        
        @Override
        protected boolean a(final adm \u2603, cj \u2603) {
            afh afh = \u2603.p(\u2603).c();
            if (afh == afi.ak) {
                \u2603 = \u2603.a();
                final alz p = \u2603.p(\u2603);
                afh = p.c();
                if (afh instanceof afq && p.b((amo<Integer>)afq.a) == 7 && this.d && !this.e) {
                    return this.e = true;
                }
            }
            return false;
        }
    }
    
    static class g extends rv
    {
        private tu b;
        
        public g(final tu \u2603, final double \u2603) {
            super(\u2603, \u2603);
            this.b = \u2603;
        }
        
        @Override
        public void e() {
            super.e();
            this.b.b(this.a);
        }
    }
    
    static class a extends rl
    {
        public a(final tu \u2603) {
            super(\u2603, pr.class, 1.4, true);
        }
        
        @Override
        protected double a(final pr \u2603) {
            return 4.0f + \u2603.J;
        }
    }
    
    enum b
    {
        a(0.0f, 0.0f, 30, 1), 
        b(0.8f, 0.2f, 20, 10), 
        c(1.0f, 0.45f, 14, 14), 
        d(1.75f, 0.4f, 1, 8), 
        e(2.0f, 0.7f, 7, 8);
        
        private final float f;
        private final float g;
        private final int h;
        private final int i;
        
        private b(final float \u2603, final float \u2603, final int \u2603, final int \u2603) {
            this.f = \u2603;
            this.g = \u2603;
            this.h = \u2603;
            this.i = \u2603;
        }
        
        public float a() {
            return this.f;
        }
        
        public float b() {
            return this.g;
        }
        
        public int c() {
            return this.h;
        }
        
        public int d() {
            return this.i;
        }
    }
}
