// 
// Decompiled by Procyon v0.5.36
// 

public class ajq extends afh
{
    public ajq() {
        super(arm.p, arn.B);
        this.a(yz.b);
    }
    
    @Override
    public aug a(final adm \u2603, final cj \u2603, final alz \u2603) {
        final float n = 0.125f;
        return new aug(\u2603.n(), \u2603.o(), \u2603.p(), \u2603.n() + 1, \u2603.o() + 1 - n, \u2603.p() + 1);
    }
    
    @Override
    public void a(final adm \u2603, final cj \u2603, final alz \u2603, final pk \u2603) {
        \u2603.v *= 0.4;
        \u2603.x *= 0.4;
    }
}
