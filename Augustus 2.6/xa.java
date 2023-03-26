// 
// Decompiled by Procyon v0.5.36
// 

public class xa extends wy
{
    private pr c;
    
    public xa(final adm \u2603) {
        super(\u2603);
    }
    
    public xa(final adm \u2603, final pr \u2603) {
        super(\u2603, \u2603);
        this.c = \u2603;
    }
    
    public xa(final adm \u2603, final double \u2603, final double \u2603, final double \u2603) {
        super(\u2603, \u2603, \u2603, \u2603);
    }
    
    @Override
    protected void a(final auh \u2603) {
        final pr n = this.n();
        if (\u2603.d != null) {
            if (\u2603.d == this.c) {
                return;
            }
            \u2603.d.a(ow.a(this, n), 0.0f);
        }
        for (int i = 0; i < 32; ++i) {
            this.o.a(cy.y, this.s, this.t + this.V.nextDouble() * 2.0, this.u, this.V.nextGaussian(), 0.0, this.V.nextGaussian(), new int[0]);
        }
        if (!this.o.D) {
            if (n instanceof lf) {
                final lf lf = (lf)n;
                if (lf.a.a().g() && lf.o == this.o && !lf.bJ()) {
                    if (this.V.nextFloat() < 0.05f && this.o.Q().b("doMobSpawning")) {
                        final vp \u26032 = new vp(this.o);
                        \u26032.a(true);
                        \u26032.b(n.s, n.t, n.u, n.y, n.z);
                        this.o.d(\u26032);
                    }
                    if (n.au()) {
                        n.a((pk)null);
                    }
                    n.a(this.s, this.t, this.u);
                    n.O = 0.0f;
                    n.a(ow.i, 5.0f);
                }
            }
            else if (n != null) {
                n.a(this.s, this.t, this.u);
                n.O = 0.0f;
            }
            this.J();
        }
    }
    
    @Override
    public void t_() {
        final pr n = this.n();
        if (n != null && n instanceof wn && !n.ai()) {
            this.J();
        }
        else {
            super.t_();
        }
    }
}
