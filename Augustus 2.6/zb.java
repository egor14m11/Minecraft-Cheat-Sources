// 
// Decompiled by Procyon v0.5.36
// 

public class zb extends zw
{
    private afh a;
    
    public zb(final afh \u2603) {
        this.a = \u2603;
        this.a(yz.d);
    }
    
    @Override
    public boolean a(final zx \u2603, final wn \u2603, final adm \u2603, cj \u2603, final cq \u2603, final float \u2603, final float \u2603, final float \u2603) {
        if (\u2603 != cq.b) {
            return false;
        }
        final alz p = \u2603.p(\u2603);
        final afh c = p.c();
        if (!c.a(\u2603, \u2603)) {
            \u2603 = \u2603.a(\u2603);
        }
        if (!\u2603.a(\u2603, \u2603, \u2603)) {
            return false;
        }
        if (!this.a.d(\u2603, \u2603)) {
            return false;
        }
        a(\u2603, \u2603, cq.a(\u2603.y), this.a);
        --\u2603.b;
        return true;
    }
    
    public static void a(final adm \u2603, final cj \u2603, final cq \u2603, final afh \u2603) {
        final cj a = \u2603.a(\u2603.e());
        final cj a2 = \u2603.a(\u2603.f());
        final int n = (\u2603.p(a2).c().v() + \u2603.p(a2.a()).c().v()) ? 1 : 0;
        final int n2 = (\u2603.p(a).c().v() + \u2603.p(a.a()).c().v()) ? 1 : 0;
        final boolean b = \u2603.p(a2).c() == \u2603 || \u2603.p(a2.a()).c() == \u2603;
        final boolean b2 = \u2603.p(a).c() == \u2603 || \u2603.p(a.a()).c() == \u2603;
        boolean b3 = false;
        if ((b && !b2) || n2 > n) {
            b3 = true;
        }
        final cj a3 = \u2603.a();
        final alz a4 = \u2603.Q().a((amo<Comparable>)agh.a, \u2603).a(agh.N, b3 ? agh.b.b : agh.b.a);
        \u2603.a(\u2603, a4.a(agh.P, agh.a.b), 2);
        \u2603.a(a3, a4.a(agh.P, agh.a.a), 2);
        \u2603.c(\u2603, \u2603);
        \u2603.c(a3, \u2603);
    }
}
