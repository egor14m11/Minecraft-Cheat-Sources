// 
// Decompiled by Procyon v0.5.36
// 

public class vp extends vv
{
    private int a;
    private boolean b;
    
    public vp(final adm \u2603) {
        super(\u2603);
        this.a = 0;
        this.b = false;
        this.b_ = 3;
        this.a(0.4f, 0.3f);
        this.i.a(1, new ra(this));
        this.i.a(2, new rl(this, wn.class, 1.0, false));
        this.i.a(3, new rz(this, 1.0));
        this.i.a(7, new ri(this, wn.class, 8.0f));
        this.i.a(8, new ry(this));
        this.bi.a(1, new sm(this, true, new Class[0]));
        this.bi.a(2, new sp<Object>(this, wn.class, true));
    }
    
    @Override
    public float aS() {
        return 0.1f;
    }
    
    @Override
    protected void aX() {
        super.aX();
        this.a(vy.a).a(8.0);
        this.a(vy.d).a(0.25);
        this.a(vy.e).a(2.0);
    }
    
    @Override
    protected boolean s_() {
        return false;
    }
    
    @Override
    protected String z() {
        return "mob.silverfish.say";
    }
    
    @Override
    protected String bo() {
        return "mob.silverfish.hit";
    }
    
    @Override
    protected String bp() {
        return "mob.silverfish.kill";
    }
    
    @Override
    protected void a(final cj \u2603, final afh \u2603) {
        this.a("mob.silverfish.step", 0.15f, 1.0f);
    }
    
    @Override
    protected zw A() {
        return null;
    }
    
    @Override
    public void a(final dn \u2603) {
        super.a(\u2603);
        this.a = \u2603.f("Lifetime");
        this.b = \u2603.n("PlayerSpawned");
    }
    
    @Override
    public void b(final dn \u2603) {
        super.b(\u2603);
        \u2603.a("Lifetime", this.a);
        \u2603.a("PlayerSpawned", this.b);
    }
    
    @Override
    public void t_() {
        this.aI = this.y;
        super.t_();
    }
    
    public boolean n() {
        return this.b;
    }
    
    public void a(final boolean \u2603) {
        this.b = \u2603;
    }
    
    @Override
    public void m() {
        super.m();
        if (this.o.D) {
            for (int i = 0; i < 2; ++i) {
                this.o.a(cy.y, this.s + (this.V.nextDouble() - 0.5) * this.J, this.t + this.V.nextDouble() * this.K, this.u + (this.V.nextDouble() - 0.5) * this.J, (this.V.nextDouble() - 0.5) * 2.0, -this.V.nextDouble(), (this.V.nextDouble() - 0.5) * 2.0, new int[0]);
            }
        }
        else {
            if (!this.bZ()) {
                ++this.a;
            }
            if (this.a >= 2400) {
                this.J();
            }
        }
    }
    
    @Override
    protected boolean n_() {
        return true;
    }
    
    @Override
    public boolean bR() {
        if (super.bR()) {
            final wn a = this.o.a(this, 5.0);
            return a == null;
        }
        return false;
    }
    
    @Override
    public pw bz() {
        return pw.c;
    }
}
