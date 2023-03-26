// 
// Decompiled by Procyon v0.5.36
// 

public class aao extends zw
{
    private afh a;
    private afh b;
    
    public aao(final afh \u2603, final afh \u2603) {
        this.a = \u2603;
        this.b = \u2603;
        this.a(yz.l);
    }
    
    @Override
    public boolean a(final zx \u2603, final wn \u2603, final adm \u2603, final cj \u2603, final cq \u2603, final float \u2603, final float \u2603, final float \u2603) {
        if (\u2603 != cq.b) {
            return false;
        }
        if (!\u2603.a(\u2603.a(\u2603), \u2603, \u2603)) {
            return false;
        }
        if (\u2603.p(\u2603).c() == this.b && \u2603.d(\u2603.a())) {
            \u2603.a(\u2603.a(), this.a.Q());
            --\u2603.b;
            return true;
        }
        return false;
    }
}
