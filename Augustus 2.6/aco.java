// 
// Decompiled by Procyon v0.5.36
// 

public class aco extends aci
{
    protected aco(final int \u2603, final jy \u2603, final int \u2603) {
        super(\u2603, \u2603, \u2603, acj.g);
        this.c("knockback");
    }
    
    @Override
    public int a(final int \u2603) {
        return 5 + 20 * (\u2603 - 1);
    }
    
    @Override
    public int b(final int \u2603) {
        return super.a(\u2603) + 50;
    }
    
    @Override
    public int b() {
        return 2;
    }
}
