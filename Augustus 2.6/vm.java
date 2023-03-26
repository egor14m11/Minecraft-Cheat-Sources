// 
// Decompiled by Procyon v0.5.36
// 

public class vm extends wc
{
    public vm(final adm \u2603) {
        super(\u2603);
        this.a(0.7f, 0.5f);
    }
    
    @Override
    protected void aX() {
        super.aX();
        this.a(vy.a).a(12.0);
    }
    
    @Override
    public boolean r(final pk \u2603) {
        if (super.r(\u2603)) {
            if (\u2603 instanceof pr) {
                int n = 0;
                if (this.o.aa() == oj.c) {
                    n = 7;
                }
                else if (this.o.aa() == oj.d) {
                    n = 15;
                }
                if (n > 0) {
                    ((pr)\u2603).c(new pf(pe.u.H, n * 20, 0));
                }
            }
            return true;
        }
        return false;
    }
    
    @Override
    public pu a(final ok \u2603, final pu \u2603) {
        return \u2603;
    }
    
    @Override
    public float aS() {
        return 0.45f;
    }
}
