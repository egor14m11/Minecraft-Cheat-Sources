// 
// Decompiled by Procyon v0.5.36
// 

public class vu extends wb
{
    public vu(final adm \u2603) {
        super(\u2603);
        this.ab = true;
    }
    
    @Override
    protected void aX() {
        super.aX();
        this.a(vy.d).a(0.20000000298023224);
    }
    
    @Override
    public boolean bR() {
        return this.o.aa() != oj.a;
    }
    
    @Override
    public boolean bS() {
        return this.o.a(this.aR(), this) && this.o.a(this, this.aR()).isEmpty() && !this.o.d(this.aR());
    }
    
    @Override
    public int br() {
        return this.cm() * 3;
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
    protected cy n() {
        return cy.A;
    }
    
    @Override
    protected wb cf() {
        return new vu(this.o);
    }
    
    @Override
    protected zw A() {
        return zy.bE;
    }
    
    @Override
    protected void b(final boolean \u2603, final int \u2603) {
        final zw a = this.A();
        if (a != null && this.cm() > 1) {
            int n = this.V.nextInt(4) - 2;
            if (\u2603 > 0) {
                n += this.V.nextInt(\u2603 + 1);
            }
            for (int i = 0; i < n; ++i) {
                this.a(a, 1);
            }
        }
    }
    
    @Override
    public boolean at() {
        return false;
    }
    
    @Override
    protected int cg() {
        return super.cg() * 4;
    }
    
    @Override
    protected void ch() {
        this.a *= 0.9f;
    }
    
    @Override
    protected void bF() {
        this.w = 0.42f + this.cm() * 0.1f;
        this.ai = true;
    }
    
    @Override
    protected void bH() {
        this.w = 0.22f + this.cm() * 0.05f;
        this.ai = true;
    }
    
    @Override
    public void e(final float \u2603, final float \u2603) {
    }
    
    @Override
    protected boolean ci() {
        return true;
    }
    
    @Override
    protected int cj() {
        return super.cj() + 2;
    }
    
    @Override
    protected String ck() {
        if (this.cm() > 1) {
            return "mob.magmacube.big";
        }
        return "mob.magmacube.small";
    }
    
    @Override
    protected boolean cl() {
        return true;
    }
}
