// 
// Decompiled by Procyon v0.5.36
// 

public class aan extends zs
{
    private afh b;
    private afh c;
    
    public aan(final int \u2603, final float \u2603, final afh \u2603, final afh \u2603) {
        super(\u2603, \u2603, false);
        this.b = \u2603;
        this.c = \u2603;
    }
    
    @Override
    public boolean a(final zx \u2603, final wn \u2603, final adm \u2603, final cj \u2603, final cq \u2603, final float \u2603, final float \u2603, final float \u2603) {
        if (\u2603 != cq.b) {
            return false;
        }
        if (!\u2603.a(\u2603.a(\u2603), \u2603, \u2603)) {
            return false;
        }
        if (\u2603.p(\u2603).c() == this.c && \u2603.d(\u2603.a())) {
            \u2603.a(\u2603.a(), this.b.Q());
            --\u2603.b;
            return true;
        }
        return false;
    }
}
