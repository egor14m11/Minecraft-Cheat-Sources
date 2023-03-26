// 
// Decompiled by Procyon v0.5.36
// 

public class sx extends sv
{
    private cj f;
    
    public sx(final ps \u2603, final adm \u2603) {
        super(\u2603, \u2603);
    }
    
    @Override
    public asx a(final cj \u2603) {
        this.f = \u2603;
        return super.a(\u2603);
    }
    
    @Override
    public asx a(final pk \u2603) {
        this.f = new cj(\u2603);
        return super.a(\u2603);
    }
    
    @Override
    public boolean a(final pk \u2603, final double \u2603) {
        final asx a = this.a(\u2603);
        if (a != null) {
            return this.a(a, \u2603);
        }
        this.f = new cj(\u2603);
        this.e = \u2603;
        return true;
    }
    
    @Override
    public void k() {
        if (this.m()) {
            if (this.f != null) {
                final double n = this.b.J * this.b.J;
                if (this.b.c(this.f) < n || (this.b.t > this.f.o() && this.b.c(new cj(this.f.n(), ns.c(this.b.t), this.f.p())) < n)) {
                    this.f = null;
                }
                else {
                    this.b.q().a(this.f.n(), this.f.o(), this.f.p(), this.e);
                }
            }
            return;
        }
        super.k();
    }
}
