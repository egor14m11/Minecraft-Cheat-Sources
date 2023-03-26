import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public class ajk extends afh
{
    public ajk(final arm \u2603) {
        super(\u2603);
        this.a(yz.b);
    }
    
    @Override
    public int a(final Random \u2603) {
        return 2 + \u2603.nextInt(2);
    }
    
    @Override
    public int a(final int \u2603, final Random \u2603) {
        return ns.a(this.a(\u2603) + \u2603.nextInt(\u2603 + 1), 1, 5);
    }
    
    @Override
    public zw a(final alz \u2603, final Random \u2603, final int \u2603) {
        return zy.cD;
    }
    
    @Override
    public arn g(final alz \u2603) {
        return arn.p;
    }
    
    @Override
    protected boolean I() {
        return true;
    }
}
