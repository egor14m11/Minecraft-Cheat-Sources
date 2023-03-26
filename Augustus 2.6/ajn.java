// 
// Decompiled by Procyon v0.5.36
// 

public class ajn extends ahj
{
    public ajn() {
        super(arm.B, false, arn.c);
        this.a(yz.c);
        this.L = 0.8f;
    }
    
    @Override
    public adf m() {
        return adf.d;
    }
    
    @Override
    public void a(final adm \u2603, final cj \u2603, final pk \u2603, final float \u2603) {
        if (\u2603.av()) {
            super.a(\u2603, \u2603, \u2603, \u2603);
        }
        else {
            \u2603.e(\u2603, 0.0f);
        }
    }
    
    @Override
    public void a(final adm \u2603, final pk \u2603) {
        if (\u2603.av()) {
            super.a(\u2603, \u2603);
        }
        else if (\u2603.w < 0.0) {
            \u2603.w = -\u2603.w;
        }
    }
    
    @Override
    public void a(final adm \u2603, final cj \u2603, final pk \u2603) {
        if (Math.abs(\u2603.w) < 0.1 && !\u2603.av()) {
            final double n = 0.4 + Math.abs(\u2603.w) * 0.2;
            \u2603.v *= n;
            \u2603.x *= n;
        }
        super.a(\u2603, \u2603, \u2603);
    }
}
