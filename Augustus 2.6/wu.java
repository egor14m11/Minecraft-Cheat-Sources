// 
// Decompiled by Procyon v0.5.36
// 

public class wu extends ws
{
    public int e;
    
    public wu(final adm \u2603) {
        super(\u2603);
        this.e = 1;
    }
    
    public wu(final adm \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603) {
        super(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        this.e = 1;
    }
    
    public wu(final adm \u2603, final pr \u2603, final double \u2603, final double \u2603, final double \u2603) {
        super(\u2603, \u2603, \u2603, \u2603, \u2603);
        this.e = 1;
    }
    
    @Override
    protected void a(final auh \u2603) {
        if (!this.o.D) {
            if (\u2603.d != null) {
                \u2603.d.a(ow.a(this, this.a), 6.0f);
                this.a(this.a, \u2603.d);
            }
            final boolean b = this.o.Q().b("mobGriefing");
            this.o.a(null, this.s, this.t, this.u, (float)this.e, b, b);
            this.J();
        }
    }
    
    @Override
    public void b(final dn \u2603) {
        super.b(\u2603);
        \u2603.a("ExplosionPower", this.e);
    }
    
    @Override
    public void a(final dn \u2603) {
        super.a(\u2603);
        if (\u2603.b("ExplosionPower", 99)) {
            this.e = \u2603.f("ExplosionPower");
        }
    }
}
