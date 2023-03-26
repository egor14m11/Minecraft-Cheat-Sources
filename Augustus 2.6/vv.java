// 
// Decompiled by Procyon v0.5.36
// 

public abstract class vv extends py implements vq
{
    public vv(final adm \u2603) {
        super(\u2603);
        this.b_ = 5;
    }
    
    @Override
    public void m() {
        this.bx();
        final float c = this.c(1.0f);
        if (c > 0.5f) {
            this.aQ += 2;
        }
        super.m();
    }
    
    @Override
    public void t_() {
        super.t_();
        if (!this.o.D && this.o.aa() == oj.a) {
            this.J();
        }
    }
    
    @Override
    protected String P() {
        return "game.hostile.swim";
    }
    
    @Override
    protected String aa() {
        return "game.hostile.swim.splash";
    }
    
    @Override
    public boolean a(final ow \u2603, final float \u2603) {
        if (this.b(\u2603)) {
            return false;
        }
        if (super.a(\u2603, \u2603)) {
            final pk j = \u2603.j();
            return (this.l != j && this.m != j) || true;
        }
        return false;
    }
    
    @Override
    protected String bo() {
        return "game.hostile.hurt";
    }
    
    @Override
    protected String bp() {
        return "game.hostile.die";
    }
    
    @Override
    protected String n(final int \u2603) {
        if (\u2603 > 4) {
            return "game.hostile.hurt.fall.big";
        }
        return "game.hostile.hurt.fall.small";
    }
    
    @Override
    public boolean r(final pk \u2603) {
        float \u26032 = (float)this.a(vy.e).e();
        int n = 0;
        if (\u2603 instanceof pr) {
            \u26032 += ack.a(this.bA(), ((pr)\u2603).bz());
            n += ack.a(this);
        }
        final boolean a = \u2603.a(ow.a(this), \u26032);
        if (a) {
            if (n > 0) {
                \u2603.g(-ns.a(this.y * 3.1415927f / 180.0f) * n * 0.5f, 0.1, ns.b(this.y * 3.1415927f / 180.0f) * n * 0.5f);
                this.v *= 0.6;
                this.x *= 0.6;
            }
            final int b = ack.b(this);
            if (b > 0) {
                \u2603.e(b * 4);
            }
            this.a(this, \u2603);
        }
        return a;
    }
    
    @Override
    public float a(final cj \u2603) {
        return 0.5f - this.o.o(\u2603);
    }
    
    protected boolean n_() {
        final cj \u2603 = new cj(this.s, this.aR().b, this.u);
        if (this.o.b(ads.a, \u2603) > this.V.nextInt(32)) {
            return false;
        }
        int n = this.o.l(\u2603);
        if (this.o.R()) {
            final int ab = this.o.ab();
            this.o.c(10);
            n = this.o.l(\u2603);
            this.o.c(ab);
        }
        return n <= this.V.nextInt(8);
    }
    
    @Override
    public boolean bR() {
        return this.o.aa() != oj.a && this.n_() && super.bR();
    }
    
    @Override
    protected void aX() {
        super.aX();
        this.by().b(vy.e);
    }
    
    @Override
    protected boolean ba() {
        return true;
    }
}
