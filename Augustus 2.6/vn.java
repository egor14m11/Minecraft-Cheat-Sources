// 
// Decompiled by Procyon v0.5.36
// 

public class vn extends vv
{
    private int a;
    private int b;
    private int c;
    private int bm;
    private int bn;
    
    public vn(final adm \u2603) {
        super(\u2603);
        this.c = 30;
        this.bm = 3;
        this.bn = 0;
        this.i.a(1, new ra(this));
        this.i.a(2, new sf(this));
        this.i.a(3, new qs<Object>(this, ts.class, 6.0f, 1.0, 1.2));
        this.i.a(4, new rl(this, 1.0, false));
        this.i.a(5, new rz(this, 0.8));
        this.i.a(6, new ri(this, wn.class, 8.0f));
        this.i.a(6, new ry(this));
        this.bi.a(1, new sp<Object>(this, wn.class, true));
        this.bi.a(2, new sm(this, false, new Class[0]));
    }
    
    @Override
    protected void aX() {
        super.aX();
        this.a(vy.d).a(0.25);
    }
    
    @Override
    public int aE() {
        if (this.u() == null) {
            return 3;
        }
        return 3 + (int)(this.bn() - 1.0f);
    }
    
    @Override
    public void e(final float \u2603, final float \u2603) {
        super.e(\u2603, \u2603);
        this.b += (int)(\u2603 * 1.5f);
        if (this.b > this.c - 5) {
            this.b = this.c - 5;
        }
    }
    
    @Override
    protected void h() {
        super.h();
        this.ac.a(16, (Byte)(-1));
        this.ac.a(17, (Byte)0);
        this.ac.a(18, (Byte)0);
    }
    
    @Override
    public void b(final dn \u2603) {
        super.b(\u2603);
        if (this.ac.a(17) == 1) {
            \u2603.a("powered", true);
        }
        \u2603.a("Fuse", (short)this.c);
        \u2603.a("ExplosionRadius", (byte)this.bm);
        \u2603.a("ignited", this.cn());
    }
    
    @Override
    public void a(final dn \u2603) {
        super.a(\u2603);
        this.ac.b(17, (byte)(\u2603.n("powered") ? 1 : 0));
        if (\u2603.b("Fuse", 99)) {
            this.c = \u2603.e("Fuse");
        }
        if (\u2603.b("ExplosionRadius", 99)) {
            this.bm = \u2603.d("ExplosionRadius");
        }
        if (\u2603.n("ignited")) {
            this.co();
        }
    }
    
    @Override
    public void t_() {
        if (this.ai()) {
            this.a = this.b;
            if (this.cn()) {
                this.a(1);
            }
            final int cm = this.cm();
            if (cm > 0 && this.b == 0) {
                this.a("creeper.primed", 1.0f, 0.5f);
            }
            this.b += cm;
            if (this.b < 0) {
                this.b = 0;
            }
            if (this.b >= this.c) {
                this.b = this.c;
                this.cr();
            }
        }
        super.t_();
    }
    
    @Override
    protected String bo() {
        return "mob.creeper.say";
    }
    
    @Override
    protected String bp() {
        return "mob.creeper.death";
    }
    
    @Override
    public void a(final ow \u2603) {
        super.a(\u2603);
        if (\u2603.j() instanceof wa) {
            final int b = zw.b(zy.cq);
            final int b2 = zw.b(zy.cB);
            final int \u26032 = b + this.V.nextInt(b2 - b + 1);
            this.a(zw.b(\u26032), 1);
        }
        else if (\u2603.j() instanceof vn && \u2603.j() != this && ((vn)\u2603.j()).n() && ((vn)\u2603.j()).cp()) {
            ((vn)\u2603.j()).cq();
            this.a(new zx(zy.bX, 1, 4), 0.0f);
        }
    }
    
    @Override
    public boolean r(final pk \u2603) {
        return true;
    }
    
    public boolean n() {
        return this.ac.a(17) == 1;
    }
    
    public float a(final float \u2603) {
        return (this.a + (this.b - this.a) * \u2603) / (this.c - 2);
    }
    
    @Override
    protected zw A() {
        return zy.H;
    }
    
    public int cm() {
        return this.ac.a(16);
    }
    
    public void a(final int \u2603) {
        this.ac.b(16, (byte)\u2603);
    }
    
    @Override
    public void a(final uv \u2603) {
        super.a(\u2603);
        this.ac.b(17, (Byte)1);
    }
    
    @Override
    protected boolean a(final wn \u2603) {
        final zx h = \u2603.bi.h();
        if (h != null && h.b() == zy.d) {
            this.o.a(this.s + 0.5, this.t + 0.5, this.u + 0.5, "fire.ignite", 1.0f, this.V.nextFloat() * 0.4f + 0.8f);
            \u2603.bw();
            if (!this.o.D) {
                this.co();
                h.a(1, \u2603);
                return true;
            }
        }
        return super.a(\u2603);
    }
    
    private void cr() {
        if (!this.o.D) {
            final boolean b = this.o.Q().b("mobGriefing");
            final float n = this.n() ? 2.0f : 1.0f;
            this.o.a(this, this.s, this.t, this.u, this.bm * n, b);
            this.J();
        }
    }
    
    public boolean cn() {
        return this.ac.a(18) != 0;
    }
    
    public void co() {
        this.ac.b(18, (Byte)1);
    }
    
    public boolean cp() {
        return this.bn < 1 && this.o.Q().b("doMobLoot");
    }
    
    public void cq() {
        ++this.bn;
    }
}
