// 
// Decompiled by Procyon v0.5.36
// 

public class zr extends zw
{
    public zr() {
        this.h = 1;
        this.d(64);
        this.a(yz.i);
    }
    
    @Override
    public boolean a(final zx \u2603, final wn \u2603, final adm \u2603, cj \u2603, final cq \u2603, final float \u2603, final float \u2603, final float \u2603) {
        \u2603 = \u2603.a(\u2603);
        if (!\u2603.a(\u2603, \u2603, \u2603)) {
            return false;
        }
        if (\u2603.p(\u2603).c().t() == arm.a) {
            \u2603.a(\u2603.n() + 0.5, \u2603.o() + 0.5, \u2603.p() + 0.5, "fire.ignite", 1.0f, zr.g.nextFloat() * 0.4f + 0.8f);
            \u2603.a(\u2603, afi.ab.Q());
        }
        \u2603.a(1, \u2603);
        return true;
    }
}
