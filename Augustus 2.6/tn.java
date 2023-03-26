// 
// Decompiled by Procyon v0.5.36
// 

public class tn extends tm
{
    public float bm;
    public float bo;
    public float bp;
    public float bq;
    public float br;
    public int bs;
    public boolean bt;
    
    public tn(final adm \u2603) {
        super(\u2603);
        this.br = 1.0f;
        this.a(0.4f, 0.7f);
        this.bs = this.V.nextInt(6000) + 6000;
        this.i.a(0, new ra(this));
        this.i.a(1, new rv(this, 1.4));
        this.i.a(2, new qv(this, 1.0));
        this.i.a(3, new sh(this, 1.0, zy.N, false));
        this.i.a(4, new rc(this, 1.1));
        this.i.a(5, new rz(this, 1.0));
        this.i.a(6, new ri(this, wn.class, 6.0f));
        this.i.a(7, new ry(this));
    }
    
    @Override
    public float aS() {
        return this.K;
    }
    
    @Override
    protected void aX() {
        super.aX();
        this.a(vy.a).a(4.0);
        this.a(vy.d).a(0.25);
    }
    
    @Override
    public void m() {
        super.m();
        this.bq = this.bm;
        this.bp = this.bo;
        this.bo += (float)((this.C ? -1 : 4) * 0.3);
        this.bo = ns.a(this.bo, 0.0f, 1.0f);
        if (!this.C && this.br < 1.0f) {
            this.br = 1.0f;
        }
        this.br *= (float)0.9;
        if (!this.C && this.w < 0.0) {
            this.w *= 0.6;
        }
        this.bm += this.br * 2.0f;
        if (!this.o.D && !this.j_() && !this.cl() && --this.bs <= 0) {
            this.a("mob.chicken.plop", 1.0f, (this.V.nextFloat() - this.V.nextFloat()) * 0.2f + 1.0f);
            this.a(zy.aP, 1);
            this.bs = this.V.nextInt(6000) + 6000;
        }
    }
    
    @Override
    public void e(final float \u2603, final float \u2603) {
    }
    
    @Override
    protected String z() {
        return "mob.chicken.say";
    }
    
    @Override
    protected String bo() {
        return "mob.chicken.hurt";
    }
    
    @Override
    protected String bp() {
        return "mob.chicken.hurt";
    }
    
    @Override
    protected void a(final cj \u2603, final afh \u2603) {
        this.a("mob.chicken.step", 0.15f, 1.0f);
    }
    
    @Override
    protected zw A() {
        return zy.G;
    }
    
    @Override
    protected void b(final boolean \u2603, final int \u2603) {
        for (int n = this.V.nextInt(3) + this.V.nextInt(1 + \u2603), i = 0; i < n; ++i) {
            this.a(zy.G, 1);
        }
        if (this.at()) {
            this.a(zy.bl, 1);
        }
        else {
            this.a(zy.bk, 1);
        }
    }
    
    public tn b(final ph \u2603) {
        return new tn(this.o);
    }
    
    @Override
    public boolean d(final zx \u2603) {
        return \u2603 != null && \u2603.b() == zy.N;
    }
    
    @Override
    public void a(final dn \u2603) {
        super.a(\u2603);
        this.bt = \u2603.n("IsChickenJockey");
        if (\u2603.c("EggLayTime")) {
            this.bs = \u2603.f("EggLayTime");
        }
    }
    
    @Override
    protected int b(final wn \u2603) {
        if (this.cl()) {
            return 10;
        }
        return super.b(\u2603);
    }
    
    @Override
    public void b(final dn \u2603) {
        super.b(\u2603);
        \u2603.a("IsChickenJockey", this.bt);
        \u2603.a("EggLayTime", this.bs);
    }
    
    @Override
    protected boolean C() {
        return this.cl() && this.l == null;
    }
    
    @Override
    public void al() {
        super.al();
        final float a = ns.a(this.aI * 3.1415927f / 180.0f);
        final float b = ns.b(this.aI * 3.1415927f / 180.0f);
        final float n = 0.1f;
        final float n2 = 0.0f;
        this.l.b(this.s + n * a, this.t + this.K * 0.5f + this.l.am() + n2, this.u - n * b);
        if (this.l instanceof pr) {
            ((pr)this.l).aI = this.aI;
        }
    }
    
    public boolean cl() {
        return this.bt;
    }
    
    public void l(final boolean \u2603) {
        this.bt = \u2603;
    }
}
