// 
// Decompiled by Procyon v0.5.36
// 

public class zu extends zw
{
    private final Class<? extends un> a;
    
    public zu(final Class<? extends un> \u2603) {
        this.a = \u2603;
        this.a(yz.c);
    }
    
    @Override
    public boolean a(final zx \u2603, final wn \u2603, final adm \u2603, final cj \u2603, final cq \u2603, final float \u2603, final float \u2603, final float \u2603) {
        if (\u2603 == cq.a) {
            return false;
        }
        if (\u2603 == cq.b) {
            return false;
        }
        final cj a = \u2603.a(\u2603);
        if (!\u2603.a(a, \u2603, \u2603)) {
            return false;
        }
        final un a2 = this.a(\u2603, a, \u2603);
        if (a2 != null && a2.j()) {
            if (!\u2603.D) {
                \u2603.d(a2);
            }
            --\u2603.b;
        }
        return true;
    }
    
    private un a(final adm \u2603, final cj \u2603, final cq \u2603) {
        if (this.a == uq.class) {
            return new uq(\u2603, \u2603, \u2603);
        }
        if (this.a == uo.class) {
            return new uo(\u2603, \u2603, \u2603);
        }
        return null;
    }
}
