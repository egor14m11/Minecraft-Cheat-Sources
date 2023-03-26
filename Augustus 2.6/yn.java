// 
// Decompiled by Procyon v0.5.36
// 

public class yn extends zw
{
    public yn() {
        this.a(yz.c);
    }
    
    @Override
    public boolean a(final zx \u2603, final wn \u2603, final adm \u2603, cj \u2603, final cq \u2603, final float \u2603, final float \u2603, final float \u2603) {
        if (\u2603.D) {
            return true;
        }
        if (\u2603 != cq.b) {
            return false;
        }
        final alz p = \u2603.p(\u2603);
        final afh c = p.c();
        final boolean a = c.a(\u2603, \u2603);
        if (!a) {
            \u2603 = \u2603.a();
        }
        final int \u26032 = ns.c(\u2603.y * 4.0f / 360.0f + 0.5) & 0x3;
        final cq b = cq.b(\u26032);
        final cj a2 = \u2603.a(b);
        if (!\u2603.a(\u2603, \u2603, \u2603) || !\u2603.a(a2, \u2603, \u2603)) {
            return false;
        }
        final boolean a3 = \u2603.p(a2).c().a(\u2603, a2);
        final boolean b2 = a || \u2603.d(\u2603);
        final boolean b3 = a3 || \u2603.d(a2);
        if (b2 && b3 && adm.a(\u2603, \u2603.b()) && adm.a(\u2603, a2.b())) {
            final alz a4 = afi.C.Q().a((amo<Comparable>)afg.b, false).a((amo<Comparable>)afg.O, b).a(afg.a, afg.a.b);
            if (\u2603.a(\u2603, a4, 3)) {
                final alz a5 = a4.a(afg.a, afg.a.a);
                \u2603.a(a2, a5, 3);
            }
            --\u2603.b;
            return true;
        }
        return false;
    }
}
