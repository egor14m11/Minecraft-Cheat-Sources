// 
// Decompiled by Procyon v0.5.36
// 

public class se extends rd
{
    private qa a;
    private boolean b;
    
    public se(final qa \u2603) {
        this.a = \u2603;
        this.a(5);
    }
    
    @Override
    public boolean a() {
        if (!this.a.cl()) {
            return false;
        }
        if (this.a.V()) {
            return false;
        }
        if (!this.a.C) {
            return false;
        }
        final pr co = this.a.co();
        return co == null || ((this.a.h(co) >= 144.0 || co.bd() == null) && this.b);
    }
    
    @Override
    public void c() {
        this.a.s().n();
        this.a.n(true);
    }
    
    @Override
    public void d() {
        this.a.n(false);
    }
    
    public void a(final boolean \u2603) {
        this.b = \u2603;
    }
}
