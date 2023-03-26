// 
// Decompiled by Procyon v0.5.36
// 

public abstract class afc extends afh implements agq
{
    protected afc(final arm \u2603) {
        this(\u2603, \u2603.r());
    }
    
    protected afc(final arm \u2603, final arn \u2603) {
        super(\u2603, \u2603);
        this.A = true;
    }
    
    protected boolean a(final adm \u2603, final cj \u2603, final cq \u2603) {
        return \u2603.p(\u2603.a(\u2603)).c().t() == arm.A;
    }
    
    protected boolean e(final adm \u2603, final cj \u2603) {
        return this.a(\u2603, \u2603, cq.c) || this.a(\u2603, \u2603, cq.d) || this.a(\u2603, \u2603, cq.e) || this.a(\u2603, \u2603, cq.f);
    }
    
    @Override
    public int b() {
        return -1;
    }
    
    @Override
    public void b(final adm \u2603, final cj \u2603, final alz \u2603) {
        super.b(\u2603, \u2603, \u2603);
        \u2603.t(\u2603);
    }
    
    @Override
    public boolean a(final adm \u2603, final cj \u2603, final alz \u2603, final int \u2603, final int \u2603) {
        super.a(\u2603, \u2603, \u2603, \u2603, \u2603);
        final akw s = \u2603.s(\u2603);
        return s != null && s.c(\u2603, \u2603);
    }
}
