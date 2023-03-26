// 
// Decompiled by Procyon v0.5.36
// 

public class aar extends zw
{
    public aar() {
        this.h = 16;
        this.a(yz.c);
    }
    
    @Override
    public boolean a(final zx \u2603, final wn \u2603, final adm \u2603, cj \u2603, final cq \u2603, final float \u2603, final float \u2603, final float \u2603) {
        if (\u2603 == cq.a) {
            return false;
        }
        if (!\u2603.p(\u2603).c().t().a()) {
            return false;
        }
        \u2603 = \u2603.a(\u2603);
        if (!\u2603.a(\u2603, \u2603, \u2603)) {
            return false;
        }
        if (!afi.an.d(\u2603, \u2603)) {
            return false;
        }
        if (\u2603.D) {
            return true;
        }
        if (\u2603 == cq.b) {
            final int i = ns.c((\u2603.y + 180.0f) * 16.0f / 360.0f + 0.5) & 0xF;
            \u2603.a(\u2603, afi.an.Q().a((amo<Comparable>)ajv.a, i), 3);
        }
        else {
            \u2603.a(\u2603, afi.ax.Q().a((amo<Comparable>)akm.a, \u2603), 3);
        }
        --\u2603.b;
        final akw s = \u2603.s(\u2603);
        if (s instanceof aln && !yo.a(\u2603, \u2603, \u2603, \u2603)) {
            \u2603.a((aln)s);
        }
        return true;
    }
}
