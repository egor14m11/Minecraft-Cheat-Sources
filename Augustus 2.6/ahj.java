// 
// Decompiled by Procyon v0.5.36
// 

public class ahj extends afh
{
    private boolean a;
    
    protected ahj(final arm \u2603, final boolean \u2603) {
        this(\u2603, \u2603, \u2603.r());
    }
    
    protected ahj(final arm \u2603, final boolean \u2603, final arn \u2603) {
        super(\u2603, \u2603);
        this.a = \u2603;
    }
    
    @Override
    public boolean c() {
        return false;
    }
    
    @Override
    public boolean a(final adq \u2603, final cj \u2603, final cq \u2603) {
        final alz p = \u2603.p(\u2603);
        final afh c = p.c();
        if (this == afi.w || this == afi.cG) {
            if (\u2603.p(\u2603.a(\u2603.d())) != p) {
                return true;
            }
            if (c == this) {
                return false;
            }
        }
        return (this.a || c != this) && super.a(\u2603, \u2603, \u2603);
    }
}
