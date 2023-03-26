// 
// Decompiled by Procyon v0.5.36
// 

public class ach extends aci
{
    protected ach(final int \u2603, final jy \u2603, final int \u2603) {
        super(\u2603, \u2603, \u2603, acj.h);
        this.c("digging");
    }
    
    @Override
    public int a(final int \u2603) {
        return 1 + 10 * (\u2603 - 1);
    }
    
    @Override
    public int b(final int \u2603) {
        return super.a(\u2603) + 50;
    }
    
    @Override
    public int b() {
        return 5;
    }
    
    @Override
    public boolean a(final zx \u2603) {
        return \u2603.b() == zy.be || super.a(\u2603);
    }
}
