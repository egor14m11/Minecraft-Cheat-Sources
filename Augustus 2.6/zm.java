// 
// Decompiled by Procyon v0.5.36
// 

public class zm extends zw
{
    public zm() {
        this.a(yz.f);
    }
    
    @Override
    public boolean a(final zx \u2603, final wn \u2603, final adm \u2603, cj \u2603, final cq \u2603, final float \u2603, final float \u2603, final float \u2603) {
        if (\u2603.D) {
            return true;
        }
        \u2603 = \u2603.a(\u2603);
        if (!\u2603.a(\u2603, \u2603, \u2603)) {
            return false;
        }
        if (\u2603.p(\u2603).c().t() == arm.a) {
            \u2603.a(\u2603.n() + 0.5, \u2603.o() + 0.5, \u2603.p() + 0.5, "item.fireCharge.use", 1.0f, (zm.g.nextFloat() - zm.g.nextFloat()) * 0.2f + 1.0f);
            \u2603.a(\u2603, afi.ab.Q());
        }
        if (!\u2603.bA.d) {
            --\u2603.b;
        }
        return true;
    }
}
