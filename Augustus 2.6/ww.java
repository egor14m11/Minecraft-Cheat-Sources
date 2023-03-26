// 
// Decompiled by Procyon v0.5.36
// 

public class ww extends ws
{
    public ww(final adm \u2603) {
        super(\u2603);
        this.a(0.3125f, 0.3125f);
    }
    
    public ww(final adm \u2603, final pr \u2603, final double \u2603, final double \u2603, final double \u2603) {
        super(\u2603, \u2603, \u2603, \u2603, \u2603);
        this.a(0.3125f, 0.3125f);
    }
    
    public ww(final adm \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603) {
        super(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        this.a(0.3125f, 0.3125f);
    }
    
    @Override
    protected void a(final auh \u2603) {
        if (!this.o.D) {
            if (\u2603.d != null) {
                final boolean b = \u2603.d.a(ow.a(this, this.a), 5.0f);
                if (b) {
                    this.a(this.a, \u2603.d);
                    if (!\u2603.d.T()) {
                        \u2603.d.e(5);
                    }
                }
            }
            else {
                boolean b = true;
                if (this.a != null && this.a instanceof ps) {
                    b = this.o.Q().b("mobGriefing");
                }
                if (b) {
                    final cj a = \u2603.a().a(\u2603.b);
                    if (this.o.d(a)) {
                        this.o.a(a, afi.ab.Q());
                    }
                }
            }
            this.J();
        }
    }
    
    @Override
    public boolean ad() {
        return false;
    }
    
    @Override
    public boolean a(final ow \u2603, final float \u2603) {
        return false;
    }
}
