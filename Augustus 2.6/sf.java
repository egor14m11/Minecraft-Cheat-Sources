// 
// Decompiled by Procyon v0.5.36
// 

public class sf extends rd
{
    vn a;
    pr b;
    
    public sf(final vn \u2603) {
        this.a = \u2603;
        this.a(1);
    }
    
    @Override
    public boolean a() {
        final pr u = this.a.u();
        return this.a.cm() > 0 || (u != null && this.a.h(u) < 9.0);
    }
    
    @Override
    public void c() {
        this.a.s().n();
        this.b = this.a.u();
    }
    
    @Override
    public void d() {
        this.b = null;
    }
    
    @Override
    public void e() {
        if (this.b == null) {
            this.a.a(-1);
            return;
        }
        if (this.a.h(this.b) > 49.0) {
            this.a.a(-1);
            return;
        }
        if (!this.a.t().a(this.b)) {
            this.a.a(-1);
            return;
        }
        this.a.a(1);
    }
}
