// 
// Decompiled by Procyon v0.5.36
// 

public class vi extends va
{
    private int a;
    
    public vi(final adm \u2603) {
        super(\u2603);
        this.a = -1;
    }
    
    public vi(final adm \u2603, final double \u2603, final double \u2603, final double \u2603) {
        super(\u2603, \u2603, \u2603, \u2603);
        this.a = -1;
    }
    
    @Override
    public a s() {
        return va.a.d;
    }
    
    @Override
    public alz u() {
        return afi.W.Q();
    }
    
    @Override
    public void t_() {
        super.t_();
        if (this.a > 0) {
            --this.a;
            this.o.a(cy.l, this.s, this.t + 0.5, this.u, 0.0, 0.0, 0.0, new int[0]);
        }
        else if (this.a == 0) {
            this.b(this.v * this.v + this.x * this.x);
        }
        if (this.D) {
            final double \u2603 = this.v * this.v + this.x * this.x;
            if (\u2603 >= 0.009999999776482582) {
                this.b(\u2603);
            }
        }
    }
    
    @Override
    public boolean a(final ow \u2603, final float \u2603) {
        final pk i = \u2603.i();
        if (i instanceof wq) {
            final wq wq = (wq)i;
            if (wq.at()) {
                this.b(wq.v * wq.v + wq.w * wq.w + wq.x * wq.x);
            }
        }
        return super.a(\u2603, \u2603);
    }
    
    @Override
    public void a(final ow \u2603) {
        super.a(\u2603);
        final double \u26032 = this.v * this.v + this.x * this.x;
        if (!\u2603.c() && this.o.Q().b("doEntityDrops")) {
            this.a(new zx(afi.W, 1), 0.0f);
        }
        if (\u2603.o() || \u2603.c() || \u26032 >= 0.009999999776482582) {
            this.b(\u26032);
        }
    }
    
    protected void b(final double \u2603) {
        if (!this.o.D) {
            double sqrt = Math.sqrt(\u2603);
            if (sqrt > 5.0) {
                sqrt = 5.0;
            }
            this.o.a(this, this.s, this.t, this.u, (float)(4.0 + this.V.nextDouble() * 1.5 * sqrt), true);
            this.J();
        }
    }
    
    @Override
    public void e(final float \u2603, final float \u2603) {
        if (\u2603 >= 3.0f) {
            final float n = \u2603 / 10.0f;
            this.b((double)(n * n));
        }
        super.e(\u2603, \u2603);
    }
    
    @Override
    public void a(final int \u2603, final int \u2603, final int \u2603, final boolean \u2603) {
        if (\u2603 && this.a < 0) {
            this.j();
        }
    }
    
    @Override
    public void a(final byte \u2603) {
        if (\u2603 == 10) {
            this.j();
        }
        else {
            super.a(\u2603);
        }
    }
    
    public void j() {
        this.a = 80;
        if (!this.o.D) {
            this.o.a(this, (byte)10);
            if (!this.R()) {
                this.o.a(this, "game.tnt.primed", 1.0f, 1.0f);
            }
        }
    }
    
    public int l() {
        return this.a;
    }
    
    public boolean y() {
        return this.a > -1;
    }
    
    @Override
    public float a(final adi \u2603, final adm \u2603, final cj \u2603, final alz \u2603) {
        if (this.y() && (afe.d(\u2603) || afe.e(\u2603, \u2603.a()))) {
            return 0.0f;
        }
        return super.a(\u2603, \u2603, \u2603, \u2603);
    }
    
    @Override
    public boolean a(final adi \u2603, final adm \u2603, final cj \u2603, final alz \u2603, final float \u2603) {
        return (!this.y() || (!afe.d(\u2603) && !afe.e(\u2603, \u2603.a()))) && super.a(\u2603, \u2603, \u2603, \u2603, \u2603);
    }
    
    @Override
    protected void a(final dn \u2603) {
        super.a(\u2603);
        if (\u2603.b("TNTFuse", 99)) {
            this.a = \u2603.f("TNTFuse");
        }
    }
    
    @Override
    protected void b(final dn \u2603) {
        super.b(\u2603);
        \u2603.a("TNTFuse", this.a);
    }
}
