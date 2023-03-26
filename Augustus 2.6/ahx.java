import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public class ahx extends afh
{
    protected ahx() {
        super(arm.C, arn.u);
        this.a(yz.b);
    }
    
    @Override
    public zw a(final alz \u2603, final Random \u2603, final int \u2603) {
        return zy.bf;
    }
    
    @Override
    public int a(final Random \u2603) {
        return 3 + \u2603.nextInt(5);
    }
    
    @Override
    public int a(final int \u2603, final Random \u2603) {
        return Math.min(9, this.a(\u2603) + \u2603.nextInt(1 + \u2603));
    }
}
