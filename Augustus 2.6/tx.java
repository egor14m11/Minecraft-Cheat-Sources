// 
// Decompiled by Procyon v0.5.36
// 

public class tx extends tz
{
    public float a;
    public float b;
    public float c;
    public float bk;
    public float bl;
    public float bm;
    public float bn;
    public float bo;
    private float bp;
    private float bq;
    private float br;
    private float bs;
    private float bt;
    private float bu;
    
    public tx(final adm \u2603) {
        super(\u2603);
        this.a(0.95f, 0.95f);
        this.V.setSeed(1 + this.F());
        this.bq = 1.0f / (this.V.nextFloat() + 1.0f) * 0.2f;
        this.i.a(0, new a(this));
    }
    
    @Override
    protected void aX() {
        super.aX();
        this.a(vy.a).a(10.0);
    }
    
    @Override
    public float aS() {
        return this.K * 0.5f;
    }
    
    @Override
    protected String z() {
        return null;
    }
    
    @Override
    protected String bo() {
        return null;
    }
    
    @Override
    protected String bp() {
        return null;
    }
    
    @Override
    protected float bB() {
        return 0.4f;
    }
    
    @Override
    protected zw A() {
        return null;
    }
    
    @Override
    protected boolean s_() {
        return false;
    }
    
    @Override
    protected void b(final boolean \u2603, final int \u2603) {
        for (int n = this.V.nextInt(3 + \u2603) + 1, i = 0; i < n; ++i) {
            this.a(new zx(zy.aW, 1, zd.p.b()), 0.0f);
        }
    }
    
    @Override
    public boolean V() {
        return this.o.a(this.aR().b(0.0, -0.6000000238418579, 0.0), arm.h, this);
    }
    
    @Override
    public void m() {
        super.m();
        this.b = this.a;
        this.bk = this.c;
        this.bm = this.bl;
        this.bo = this.bn;
        this.bl += this.bq;
        if (this.bl > 6.283185307179586) {
            if (this.o.D) {
                this.bl = 6.2831855f;
            }
            else {
                this.bl -= (float)6.283185307179586;
                if (this.V.nextInt(10) == 0) {
                    this.bq = 1.0f / (this.V.nextFloat() + 1.0f) * 0.2f;
                }
                this.o.a(this, (byte)19);
            }
        }
        if (this.Y) {
            if (this.bl < 3.1415927f) {
                final float a = this.bl / 3.1415927f;
                this.bn = ns.a(a * a * 3.1415927f) * 3.1415927f * 0.25f;
                if (a > 0.75) {
                    this.bp = 1.0f;
                    this.br = 1.0f;
                }
                else {
                    this.br *= 0.8f;
                }
            }
            else {
                this.bn = 0.0f;
                this.bp *= 0.9f;
                this.br *= 0.99f;
            }
            if (!this.o.D) {
                this.v = this.bs * this.bp;
                this.w = this.bt * this.bp;
                this.x = this.bu * this.bp;
            }
            final float a = ns.a(this.v * this.v + this.x * this.x);
            this.aI += (-(float)ns.b(this.v, this.x) * 180.0f / 3.1415927f - this.aI) * 0.1f;
            this.y = this.aI;
            this.c += (float)(3.141592653589793 * this.br * 1.5);
            this.a += (-(float)ns.b(a, this.w) * 180.0f / 3.1415927f - this.a) * 0.1f;
        }
        else {
            this.bn = ns.e(ns.a(this.bl)) * 3.1415927f * 0.25f;
            if (!this.o.D) {
                this.v = 0.0;
                this.w -= 0.08;
                this.w *= 0.9800000190734863;
                this.x = 0.0;
            }
            this.a += (float)((-90.0f - this.a) * 0.02);
        }
    }
    
    @Override
    public void g(final float \u2603, final float \u2603) {
        this.d(this.v, this.w, this.x);
    }
    
    @Override
    public boolean bR() {
        return this.t > 45.0 && this.t < this.o.F() && super.bR();
    }
    
    @Override
    public void a(final byte \u2603) {
        if (\u2603 == 19) {
            this.bl = 0.0f;
        }
        else {
            super.a(\u2603);
        }
    }
    
    public void b(final float \u2603, final float \u2603, final float \u2603) {
        this.bs = \u2603;
        this.bt = \u2603;
        this.bu = \u2603;
    }
    
    public boolean n() {
        return this.bs != 0.0f || this.bt != 0.0f || this.bu != 0.0f;
    }
    
    static class a extends rd
    {
        private tx a;
        
        public a(final tx \u2603) {
            this.a = \u2603;
        }
        
        @Override
        public boolean a() {
            return true;
        }
        
        @Override
        public void e() {
            final int bh = this.a.bh();
            if (bh > 100) {
                this.a.b(0.0f, 0.0f, 0.0f);
            }
            else if (this.a.bc().nextInt(50) == 0 || !this.a.Y || !this.a.n()) {
                final float n = this.a.bc().nextFloat() * 3.1415927f * 2.0f;
                final float \u2603 = ns.b(n) * 0.2f;
                final float \u26032 = -0.1f + this.a.bc().nextFloat() * 0.2f;
                final float \u26033 = ns.a(n) * 0.2f;
                this.a.b(\u2603, \u26032, \u26033);
            }
        }
    }
}
