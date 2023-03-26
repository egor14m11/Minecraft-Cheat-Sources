// 
// Decompiled by Procyon v0.5.36
// 

public class acb extends aci
{
    public acb(final int \u2603, final jy \u2603, final int \u2603) {
        super(\u2603, \u2603, \u2603, acj.k);
        this.c("arrowDamage");
    }
    
    @Override
    public int a(final int \u2603) {
        return 1 + (\u2603 - 1) * 10;
    }
    
    @Override
    public int b(final int \u2603) {
        return this.a(\u2603) + 15;
    }
    
    @Override
    public int b() {
        return 5;
    }
}
