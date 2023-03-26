// 
// Decompiled by Procyon v0.5.36
// 

public abstract class tm extends ph implements pi
{
    protected afh bn;
    private int bm;
    private wn bo;
    
    public tm(final adm \u2603) {
        super(\u2603);
        this.bn = afi.c;
    }
    
    @Override
    protected void E() {
        if (this.l() != 0) {
            this.bm = 0;
        }
        super.E();
    }
    
    @Override
    public void m() {
        super.m();
        if (this.l() != 0) {
            this.bm = 0;
        }
        if (this.bm > 0) {
            --this.bm;
            if (this.bm % 10 == 0) {
                final double \u2603 = this.V.nextGaussian() * 0.02;
                final double \u26032 = this.V.nextGaussian() * 0.02;
                final double \u26033 = this.V.nextGaussian() * 0.02;
                this.o.a(cy.I, this.s + this.V.nextFloat() * this.J * 2.0f - this.J, this.t + 0.5 + this.V.nextFloat() * this.K, this.u + this.V.nextFloat() * this.J * 2.0f - this.J, \u2603, \u26032, \u26033, new int[0]);
            }
        }
    }
    
    @Override
    public boolean a(final ow \u2603, final float \u2603) {
        if (this.b(\u2603)) {
            return false;
        }
        this.bm = 0;
        return super.a(\u2603, \u2603);
    }
    
    @Override
    public float a(final cj \u2603) {
        if (this.o.p(\u2603.b()).c() == afi.c) {
            return 10.0f;
        }
        return this.o.o(\u2603) - 0.5f;
    }
    
    @Override
    public void b(final dn \u2603) {
        super.b(\u2603);
        \u2603.a("InLove", this.bm);
    }
    
    @Override
    public void a(final dn \u2603) {
        super.a(\u2603);
        this.bm = \u2603.f("InLove");
    }
    
    @Override
    public boolean bR() {
        final int c = ns.c(this.s);
        final int c2 = ns.c(this.aR().b);
        final int c3 = ns.c(this.u);
        final cj \u2603 = new cj(c, c2, c3);
        return this.o.p(\u2603.b()).c() == this.bn && this.o.k(\u2603) > 8 && super.bR();
    }
    
    @Override
    public int w() {
        return 120;
    }
    
    @Override
    protected boolean C() {
        return false;
    }
    
    @Override
    protected int b(final wn \u2603) {
        return 1 + this.o.s.nextInt(3);
    }
    
    public boolean d(final zx \u2603) {
        return \u2603 != null && \u2603.b() == zy.O;
    }
    
    @Override
    public boolean a(final wn \u2603) {
        final zx h = \u2603.bi.h();
        if (h != null) {
            if (this.d(h) && this.l() == 0 && this.bm <= 0) {
                this.a(\u2603, h);
                this.c(\u2603);
                return true;
            }
            if (this.j_() && this.d(h)) {
                this.a(\u2603, h);
                this.a((int)(-this.l() / 20 * 0.1f), true);
                return true;
            }
        }
        return super.a(\u2603);
    }
    
    protected void a(final wn \u2603, final zx \u2603) {
        if (!\u2603.bA.d) {
            --\u2603.b;
            if (\u2603.b <= 0) {
                \u2603.bi.a(\u2603.bi.c, null);
            }
        }
    }
    
    public void c(final wn \u2603) {
        this.bm = 600;
        this.bo = \u2603;
        this.o.a(this, (byte)18);
    }
    
    public wn cq() {
        return this.bo;
    }
    
    public boolean cr() {
        return this.bm > 0;
    }
    
    public void cs() {
        this.bm = 0;
    }
    
    public boolean a(final tm \u2603) {
        return \u2603 != this && \u2603.getClass() == this.getClass() && this.cr() && \u2603.cr();
    }
    
    @Override
    public void a(final byte \u2603) {
        if (\u2603 == 18) {
            for (int i = 0; i < 7; ++i) {
                final double \u26032 = this.V.nextGaussian() * 0.02;
                final double \u26033 = this.V.nextGaussian() * 0.02;
                final double \u26034 = this.V.nextGaussian() * 0.02;
                this.o.a(cy.I, this.s + this.V.nextFloat() * this.J * 2.0f - this.J, this.t + 0.5 + this.V.nextFloat() * this.K, this.u + this.V.nextFloat() * this.J * 2.0f - this.J, \u26032, \u26033, \u26034, new int[0]);
            }
        }
        else {
            super.a(\u2603);
        }
    }
}
