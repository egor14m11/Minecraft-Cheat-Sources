// 
// Decompiled by Procyon v0.5.36
// 

public class uf extends pk
{
    public int a;
    public int b;
    
    public uf(final adm \u2603) {
        super(\u2603);
        this.k = true;
        this.a(2.0f, 2.0f);
        this.b = 5;
        this.a = this.V.nextInt(100000);
    }
    
    public uf(final adm \u2603, final double \u2603, final double \u2603, final double \u2603) {
        this(\u2603);
        this.b(\u2603, \u2603, \u2603);
    }
    
    @Override
    protected boolean s_() {
        return false;
    }
    
    @Override
    protected void h() {
        this.ac.a(8, Integer.valueOf(this.b));
    }
    
    @Override
    public void t_() {
        this.p = this.s;
        this.q = this.t;
        this.r = this.u;
        ++this.a;
        this.ac.b(8, this.b);
        final int c = ns.c(this.s);
        final int c2 = ns.c(this.t);
        final int c3 = ns.c(this.u);
        if (this.o.t instanceof anp && this.o.p(new cj(c, c2, c3)).c() != afi.ab) {
            this.o.a(new cj(c, c2, c3), afi.ab.Q());
        }
    }
    
    @Override
    protected void b(final dn \u2603) {
    }
    
    @Override
    protected void a(final dn \u2603) {
    }
    
    @Override
    public boolean ad() {
        return true;
    }
    
    @Override
    public boolean a(final ow \u2603, final float \u2603) {
        if (this.b(\u2603)) {
            return false;
        }
        if (!this.I && !this.o.D) {
            this.b = 0;
            if (this.b <= 0) {
                this.J();
                if (!this.o.D) {
                    this.o.a(null, this.s, this.t, this.u, 6.0f, true);
                }
            }
        }
        return true;
    }
}
