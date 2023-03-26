// 
// Decompiled by Procyon v0.5.36
// 

public class act extends aci
{
    protected act(final int \u2603, final jy \u2603, final int \u2603) {
        super(\u2603, \u2603, \u2603, acj.h);
        this.c("untouching");
    }
    
    @Override
    public int a(final int \u2603) {
        return 15;
    }
    
    @Override
    public int b(final int \u2603) {
        return super.a(\u2603) + 50;
    }
    
    @Override
    public int b() {
        return 1;
    }
    
    @Override
    public boolean a(final aci \u2603) {
        return super.a(\u2603) && \u2603.B != act.u.B;
    }
    
    @Override
    public boolean a(final zx \u2603) {
        return \u2603.b() == zy.be || super.a(\u2603);
    }
}
