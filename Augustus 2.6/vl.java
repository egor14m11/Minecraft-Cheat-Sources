// 
// Decompiled by Procyon v0.5.36
// 

public class vl extends vv
{
    private float a;
    private int b;
    
    public vl(final adm \u2603) {
        super(\u2603);
        this.a = 0.5f;
        this.ab = true;
        this.b_ = 10;
        this.i.a(4, new a(this));
        this.i.a(5, new rp(this, 1.0));
        this.i.a(7, new rz(this, 1.0));
        this.i.a(8, new ri(this, wn.class, 8.0f));
        this.i.a(8, new ry(this));
        this.bi.a(1, new sm(this, true, new Class[0]));
        this.bi.a(2, new sp<Object>(this, wn.class, true));
    }
    
    @Override
    protected void aX() {
        super.aX();
        this.a(vy.e).a(6.0);
        this.a(vy.d).a(0.23000000417232513);
        this.a(vy.b).a(48.0);
    }
    
    @Override
    protected void h() {
        super.h();
        this.ac.a(16, new Byte((byte)0));
    }
    
    @Override
    protected String z() {
        return "mob.blaze.breathe";
    }
    
    @Override
    protected String bo() {
        return "mob.blaze.hit";
    }
    
    @Override
    protected String bp() {
        return "mob.blaze.death";
    }
    
    @Override
    public int b(final float \u2603) {
        return 15728880;
    }
    
    @Override
    public float c(final float \u2603) {
        return 1.0f;
    }
    
    @Override
    public void m() {
        if (!this.C && this.w < 0.0) {
            this.w *= 0.6;
        }
        if (this.o.D) {
            if (this.V.nextInt(24) == 0 && !this.R()) {
                this.o.a(this.s + 0.5, this.t + 0.5, this.u + 0.5, "fire.fire", 1.0f + this.V.nextFloat(), this.V.nextFloat() * 0.7f + 0.3f, false);
            }
            for (int i = 0; i < 2; ++i) {
                this.o.a(cy.m, this.s + (this.V.nextDouble() - 0.5) * this.J, this.t + this.V.nextDouble() * this.K, this.u + (this.V.nextDouble() - 0.5) * this.J, 0.0, 0.0, 0.0, new int[0]);
            }
        }
        super.m();
    }
    
    @Override
    protected void E() {
        if (this.U()) {
            this.a(ow.f, 1.0f);
        }
        --this.b;
        if (this.b <= 0) {
            this.b = 100;
            this.a = 0.5f + (float)this.V.nextGaussian() * 3.0f;
        }
        final pr u = this.u();
        if (u != null && u.t + u.aS() > this.t + this.aS() + this.a) {
            this.w += (0.30000001192092896 - this.w) * 0.30000001192092896;
            this.ai = true;
        }
        super.E();
    }
    
    @Override
    public void e(final float \u2603, final float \u2603) {
    }
    
    @Override
    protected zw A() {
        return zy.bv;
    }
    
    @Override
    public boolean at() {
        return this.n();
    }
    
    @Override
    protected void b(final boolean \u2603, final int \u2603) {
        if (\u2603) {
            for (int nextInt = this.V.nextInt(2 + \u2603), i = 0; i < nextInt; ++i) {
                this.a(zy.bv, 1);
            }
        }
    }
    
    public boolean n() {
        return (this.ac.a(16) & 0x1) != 0x0;
    }
    
    public void a(final boolean \u2603) {
        byte a = this.ac.a(16);
        if (\u2603) {
            a |= 0x1;
        }
        else {
            a &= 0xFFFFFFFE;
        }
        this.ac.b(16, a);
    }
    
    @Override
    protected boolean n_() {
        return true;
    }
    
    static class a extends rd
    {
        private vl a;
        private int b;
        private int c;
        
        public a(final vl \u2603) {
            this.a = \u2603;
            this.a(3);
        }
        
        @Override
        public boolean a() {
            final pr u = this.a.u();
            return u != null && u.ai();
        }
        
        @Override
        public void c() {
            this.b = 0;
        }
        
        @Override
        public void d() {
            this.a.a(false);
        }
        
        @Override
        public void e() {
            --this.c;
            final pr u = this.a.u();
            final double h = this.a.h(u);
            if (h < 4.0) {
                if (this.c <= 0) {
                    this.c = 20;
                    this.a.r(u);
                }
                this.a.q().a(u.s, u.t, u.u, 1.0);
            }
            else if (h < 256.0) {
                final double n = u.s - this.a.s;
                final double \u2603 = u.aR().b + u.K / 2.0f - (this.a.t + this.a.K / 2.0f);
                final double n2 = u.u - this.a.u;
                if (this.c <= 0) {
                    ++this.b;
                    if (this.b == 1) {
                        this.c = 60;
                        this.a.a(true);
                    }
                    else if (this.b <= 4) {
                        this.c = 6;
                    }
                    else {
                        this.c = 100;
                        this.b = 0;
                        this.a.a(false);
                    }
                    if (this.b > 1) {
                        final float n3 = ns.c(ns.a(h)) * 0.5f;
                        this.a.o.a(null, 1009, new cj((int)this.a.s, (int)this.a.t, (int)this.a.u), 0);
                        for (int i = 0; i < 1; ++i) {
                            final ww \u26032 = new ww(this.a.o, this.a, n + this.a.bc().nextGaussian() * n3, \u2603, n2 + this.a.bc().nextGaussian() * n3);
                            \u26032.t = this.a.t + this.a.K / 2.0f + 0.5;
                            this.a.o.d(\u26032);
                        }
                    }
                }
                this.a.p().a(u, 10.0f, 10.0f);
            }
            else {
                this.a.s().n();
                this.a.q().a(u.s, u.t, u.u, 1.0);
            }
            super.e();
        }
    }
}
