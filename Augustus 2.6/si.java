// 
// Decompiled by Procyon v0.5.36
// 

public class si extends rd
{
    private wi a;
    
    public si(final wi \u2603) {
        this.a = \u2603;
        this.a(5);
    }
    
    @Override
    public boolean a() {
        if (!this.a.ai()) {
            return false;
        }
        if (this.a.V()) {
            return false;
        }
        if (!this.a.C) {
            return false;
        }
        if (this.a.G) {
            return false;
        }
        final wn v_ = this.a.v_();
        return v_ != null && this.a.h(v_) <= 16.0 && v_.bk instanceof xi;
    }
    
    @Override
    public void c() {
        this.a.s().n();
    }
    
    @Override
    public void d() {
        this.a.a_((wn)null);
    }
}
