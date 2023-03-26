// 
// Decompiled by Procyon v0.5.36
// 

public class wx extends wy
{
    public wx(final adm \u2603) {
        super(\u2603);
    }
    
    public wx(final adm \u2603, final pr \u2603) {
        super(\u2603, \u2603);
    }
    
    public wx(final adm \u2603, final double \u2603, final double \u2603, final double \u2603) {
        super(\u2603, \u2603, \u2603, \u2603);
    }
    
    @Override
    protected void a(final auh \u2603) {
        if (\u2603.d != null) {
            int i = 0;
            if (\u2603.d instanceof vl) {
                i = 3;
            }
            \u2603.d.a(ow.a(this, this.n()), (float)i);
        }
        for (int i = 0; i < 8; ++i) {
            this.o.a(cy.F, this.s, this.t, this.u, 0.0, 0.0, 0.0, new int[0]);
        }
        if (!this.o.D) {
            this.J();
        }
    }
}
