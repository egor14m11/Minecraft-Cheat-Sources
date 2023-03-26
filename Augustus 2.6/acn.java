// 
// Decompiled by Procyon v0.5.36
// 

public class acn extends aci
{
    protected acn(final int \u2603, final jy \u2603, final int \u2603, final acj \u2603) {
        super(\u2603, \u2603, \u2603, \u2603);
        this.c("fishingSpeed");
    }
    
    @Override
    public int a(final int \u2603) {
        return 15 + (\u2603 - 1) * 9;
    }
    
    @Override
    public int b(final int \u2603) {
        return super.a(\u2603) + 50;
    }
    
    @Override
    public int b() {
        return 3;
    }
}
