// 
// Decompiled by Procyon v0.5.36
// 

public class wz extends wy
{
    public wz(final adm \u2603) {
        super(\u2603);
    }
    
    public wz(final adm \u2603, final pr \u2603) {
        super(\u2603, \u2603);
    }
    
    public wz(final adm \u2603, final double \u2603, final double \u2603, final double \u2603) {
        super(\u2603, \u2603, \u2603, \u2603);
    }
    
    @Override
    protected void a(final auh \u2603) {
        if (\u2603.d != null) {
            \u2603.d.a(ow.a(this, this.n()), 0.0f);
        }
        if (!this.o.D && this.V.nextInt(8) == 0) {
            int n = 1;
            if (this.V.nextInt(32) == 0) {
                n = 4;
            }
            for (int i = 0; i < n; ++i) {
                final tn \u26032 = new tn(this.o);
                \u26032.b(-24000);
                \u26032.b(this.s, this.t, this.u, this.y, 0.0f);
                this.o.d(\u26032);
            }
        }
        final double n2 = 0.08;
        for (int j = 0; j < 8; ++j) {
            this.o.a(cy.K, this.s, this.t, this.u, (this.V.nextFloat() - 0.5) * 0.08, (this.V.nextFloat() - 0.5) * 0.08, (this.V.nextFloat() - 0.5) * 0.08, zw.b(zy.aP));
        }
        if (!this.o.D) {
            this.J();
        }
    }
}
