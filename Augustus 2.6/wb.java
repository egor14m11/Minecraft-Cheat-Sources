// 
// Decompiled by Procyon v0.5.36
// 

public class wb extends ps implements vq
{
    public float a;
    public float b;
    public float c;
    private boolean bk;
    
    public wb(final adm \u2603) {
        super(\u2603);
        this.f = new d(this);
        this.i.a(1, new b(this));
        this.i.a(2, new a(this));
        this.i.a(3, new e(this));
        this.i.a(5, new c(this));
        this.bi.a(1, new so(this));
        this.bi.a(3, new sn(this, ty.class));
    }
    
    @Override
    protected void h() {
        super.h();
        this.ac.a(16, (Byte)1);
    }
    
    protected void a(final int \u2603) {
        this.ac.b(16, (byte)\u2603);
        this.a(0.51000005f * \u2603, 0.51000005f * \u2603);
        this.b(this.s, this.t, this.u);
        this.a(vy.a).a((double)(\u2603 * \u2603));
        this.a(vy.d).a(0.2f + 0.1f * \u2603);
        this.i(this.bu());
        this.b_ = \u2603;
    }
    
    public int cm() {
        return this.ac.a(16);
    }
    
    @Override
    public void b(final dn \u2603) {
        super.b(\u2603);
        \u2603.a("Size", this.cm() - 1);
        \u2603.a("wasOnGround", this.bk);
    }
    
    @Override
    public void a(final dn \u2603) {
        super.a(\u2603);
        int f = \u2603.f("Size");
        if (f < 0) {
            f = 0;
        }
        this.a(f + 1);
        this.bk = \u2603.n("wasOnGround");
    }
    
    protected cy n() {
        return cy.H;
    }
    
    protected String ck() {
        return "mob.slime." + ((this.cm() > 1) ? "big" : "small");
    }
    
    @Override
    public void t_() {
        if (!this.o.D && this.o.aa() == oj.a && this.cm() > 0) {
            this.I = true;
        }
        this.b += (this.a - this.b) * 0.5f;
        this.c = this.b;
        super.t_();
        if (this.C && !this.bk) {
            for (int cm = this.cm(), i = 0; i < cm * 8; ++i) {
                final float n = this.V.nextFloat() * 3.1415927f * 2.0f;
                final float n2 = this.V.nextFloat() * 0.5f + 0.5f;
                final float n3 = ns.a(n) * cm * 0.5f * n2;
                final float n4 = ns.b(n) * cm * 0.5f * n2;
                this.o.a(this.n(), this.s + n3, this.aR().b, this.u + n4, 0.0, 0.0, 0.0, new int[0]);
            }
            if (this.cl()) {
                this.a(this.ck(), this.bB(), ((this.V.nextFloat() - this.V.nextFloat()) * 0.2f + 1.0f) / 0.8f);
            }
            this.a = -0.5f;
        }
        else if (!this.C && this.bk) {
            this.a = 1.0f;
        }
        this.bk = this.C;
        this.ch();
    }
    
    protected void ch() {
        this.a *= 0.6f;
    }
    
    protected int cg() {
        return this.V.nextInt(20) + 10;
    }
    
    protected wb cf() {
        return new wb(this.o);
    }
    
    @Override
    public void i(final int \u2603) {
        if (\u2603 == 16) {
            final int cm = this.cm();
            this.a(0.51000005f * cm, 0.51000005f * cm);
            this.y = this.aK;
            this.aI = this.aK;
            if (this.V() && this.V.nextInt(20) == 0) {
                this.X();
            }
        }
        super.i(\u2603);
    }
    
    @Override
    public void J() {
        final int cm = this.cm();
        if (!this.o.D && cm > 1 && this.bn() <= 0.0f) {
            for (int n = 2 + this.V.nextInt(3), i = 0; i < n; ++i) {
                final float n2 = (i % 2 - 0.5f) * cm / 4.0f;
                final float n3 = (i / 2 - 0.5f) * cm / 4.0f;
                final wb cf = this.cf();
                if (this.l_()) {
                    cf.a(this.aM());
                }
                if (this.bZ()) {
                    cf.bX();
                }
                cf.a(cm / 2);
                cf.b(this.s + n2, this.t + 0.5, this.u + n3, this.V.nextFloat() * 360.0f, 0.0f);
                this.o.d(cf);
            }
        }
        super.J();
    }
    
    @Override
    public void i(final pk \u2603) {
        super.i(\u2603);
        if (\u2603 instanceof ty && this.ci()) {
            this.e((pr)\u2603);
        }
    }
    
    @Override
    public void d(final wn \u2603) {
        if (this.ci()) {
            this.e((pr)\u2603);
        }
    }
    
    protected void e(final pr \u2603) {
        final int cm = this.cm();
        if (this.t(\u2603) && this.h(\u2603) < 0.6 * cm * (0.6 * cm) && \u2603.a(ow.a(this), (float)this.cj())) {
            this.a("mob.attack", 1.0f, (this.V.nextFloat() - this.V.nextFloat()) * 0.2f + 1.0f);
            this.a(this, \u2603);
        }
    }
    
    @Override
    public float aS() {
        return 0.625f * this.K;
    }
    
    protected boolean ci() {
        return this.cm() > 1;
    }
    
    protected int cj() {
        return this.cm();
    }
    
    @Override
    protected String bo() {
        return "mob.slime." + ((this.cm() > 1) ? "big" : "small");
    }
    
    @Override
    protected String bp() {
        return "mob.slime." + ((this.cm() > 1) ? "big" : "small");
    }
    
    @Override
    protected zw A() {
        if (this.cm() == 1) {
            return zy.aM;
        }
        return null;
    }
    
    @Override
    public boolean bR() {
        final cj cj = new cj(ns.c(this.s), 0, ns.c(this.u));
        final amy f = this.o.f(cj);
        if (this.o.P().u() == adr.c && this.V.nextInt(4) != 1) {
            return false;
        }
        if (this.o.aa() != oj.a) {
            final ady b = this.o.b(cj);
            if (b == ady.v && this.t > 50.0 && this.t < 70.0 && this.V.nextFloat() < 0.5f && this.V.nextFloat() < this.o.y() && this.o.l(new cj(this)) <= this.V.nextInt(8)) {
                return super.bR();
            }
            if (this.V.nextInt(10) == 0 && f.a(987234911L).nextInt(10) == 0 && this.t < 40.0) {
                return super.bR();
            }
        }
        return false;
    }
    
    @Override
    protected float bB() {
        return 0.4f * this.cm();
    }
    
    @Override
    public int bQ() {
        return 0;
    }
    
    protected boolean cn() {
        return this.cm() > 0;
    }
    
    protected boolean cl() {
        return this.cm() > 2;
    }
    
    @Override
    protected void bF() {
        this.w = 0.41999998688697815;
        this.ai = true;
    }
    
    @Override
    public pu a(final ok \u2603, final pu \u2603) {
        int nextInt = this.V.nextInt(3);
        if (nextInt < 2 && this.V.nextFloat() < 0.5f * \u2603.c()) {
            ++nextInt;
        }
        final int \u26032 = 1 << nextInt;
        this.a(\u26032);
        return super.a(\u2603, \u2603);
    }
    
    static class d extends qq
    {
        private float g;
        private int h;
        private wb i;
        private boolean j;
        
        public d(final wb \u2603) {
            super(\u2603);
            this.i = \u2603;
        }
        
        public void a(final float \u2603, final boolean \u2603) {
            this.g = \u2603;
            this.j = \u2603;
        }
        
        public void a(final double \u2603) {
            this.e = \u2603;
            this.f = true;
        }
        
        @Override
        public void c() {
            this.a.y = this.a(this.a.y, this.g, 30.0f);
            this.a.aK = this.a.y;
            this.a.aI = this.a.y;
            if (!this.f) {
                this.a.n(0.0f);
                return;
            }
            this.f = false;
            if (this.a.C) {
                this.a.k((float)(this.e * this.a.a(vy.d).e()));
                if (this.h-- <= 0) {
                    this.h = this.i.cg();
                    if (this.j) {
                        this.h /= 3;
                    }
                    this.i.r().a();
                    if (this.i.cn()) {
                        this.i.a(this.i.ck(), this.i.bB(), ((this.i.bc().nextFloat() - this.i.bc().nextFloat()) * 0.2f + 1.0f) * 0.8f);
                    }
                }
                else {
                    final wb i = this.i;
                    final wb j = this.i;
                    final float n = 0.0f;
                    j.ba = n;
                    i.aZ = n;
                    this.a.k(0.0f);
                }
            }
            else {
                this.a.k((float)(this.e * this.a.a(vy.d).e()));
            }
        }
    }
    
    static class a extends rd
    {
        private wb a;
        private int b;
        
        public a(final wb \u2603) {
            this.a = \u2603;
            this.a(2);
        }
        
        @Override
        public boolean a() {
            final pr u = this.a.u();
            return u != null && u.ai() && (!(u instanceof wn) || !((wn)u).bA.a);
        }
        
        @Override
        public void c() {
            this.b = 300;
            super.c();
        }
        
        @Override
        public boolean b() {
            final pr u = this.a.u();
            return u != null && u.ai() && (!(u instanceof wn) || !((wn)u).bA.a) && --this.b > 0;
        }
        
        @Override
        public void e() {
            this.a.a(this.a.u(), 10.0f, 10.0f);
            ((d)this.a.q()).a(this.a.y, this.a.ci());
        }
    }
    
    static class e extends rd
    {
        private wb a;
        private float b;
        private int c;
        
        public e(final wb \u2603) {
            this.a = \u2603;
            this.a(2);
        }
        
        @Override
        public boolean a() {
            return this.a.u() == null && (this.a.C || this.a.V() || this.a.ab());
        }
        
        @Override
        public void e() {
            final int c = this.c - 1;
            this.c = c;
            if (c <= 0) {
                this.c = 40 + this.a.bc().nextInt(60);
                this.b = (float)this.a.bc().nextInt(360);
            }
            ((d)this.a.q()).a(this.b, false);
        }
    }
    
    static class b extends rd
    {
        private wb a;
        
        public b(final wb \u2603) {
            this.a = \u2603;
            this.a(5);
            ((sv)\u2603.s()).d(true);
        }
        
        @Override
        public boolean a() {
            return this.a.V() || this.a.ab();
        }
        
        @Override
        public void e() {
            if (this.a.bc().nextFloat() < 0.8f) {
                this.a.r().a();
            }
            ((d)this.a.q()).a(1.2);
        }
    }
    
    static class c extends rd
    {
        private wb a;
        
        public c(final wb \u2603) {
            this.a = \u2603;
            this.a(5);
        }
        
        @Override
        public boolean a() {
            return true;
        }
        
        @Override
        public void e() {
            ((d)this.a.q()).a(1.0);
        }
    }
}
