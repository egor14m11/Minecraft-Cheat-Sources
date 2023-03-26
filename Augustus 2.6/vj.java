// 
// Decompiled by Procyon v0.5.36
// 

public class vj extends pk
{
    public int a;
    private pr b;
    
    public vj(final adm \u2603) {
        super(\u2603);
        this.k = true;
        this.a(0.98f, 0.98f);
    }
    
    public vj(final adm \u2603, final double \u2603, final double \u2603, final double \u2603, final pr \u2603) {
        this(\u2603);
        this.b(\u2603, \u2603, \u2603);
        final float n = (float)(Math.random() * 3.1415927410125732 * 2.0);
        this.v = -(float)Math.sin(n) * 0.02f;
        this.w = 0.20000000298023224;
        this.x = -(float)Math.cos(n) * 0.02f;
        this.a = 80;
        this.p = \u2603;
        this.q = \u2603;
        this.r = \u2603;
        this.b = \u2603;
    }
    
    @Override
    protected void h() {
    }
    
    @Override
    protected boolean s_() {
        return false;
    }
    
    @Override
    public boolean ad() {
        return !this.I;
    }
    
    @Override
    public void t_() {
        this.p = this.s;
        this.q = this.t;
        this.r = this.u;
        this.w -= 0.03999999910593033;
        this.d(this.v, this.w, this.x);
        this.v *= 0.9800000190734863;
        this.w *= 0.9800000190734863;
        this.x *= 0.9800000190734863;
        if (this.C) {
            this.v *= 0.699999988079071;
            this.x *= 0.699999988079071;
            this.w *= -0.5;
        }
        if (this.a-- <= 0) {
            this.J();
            if (!this.o.D) {
                this.l();
            }
        }
        else {
            this.W();
            this.o.a(cy.l, this.s, this.t + 0.5, this.u, 0.0, 0.0, 0.0, new int[0]);
        }
    }
    
    private void l() {
        final float \u2603 = 4.0f;
        this.o.a(this, this.s, this.t + this.K / 16.0f, this.u, \u2603, true);
    }
    
    @Override
    protected void b(final dn \u2603) {
        \u2603.a("Fuse", (byte)this.a);
    }
    
    @Override
    protected void a(final dn \u2603) {
        this.a = \u2603.d("Fuse");
    }
    
    public pr j() {
        return this.b;
    }
    
    @Override
    public float aS() {
        return 0.0f;
    }
}
