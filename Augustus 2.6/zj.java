// 
// Decompiled by Procyon v0.5.36
// 

public class zj extends zw
{
    public zj() {
        this.a(yz.f);
    }
    
    @Override
    public boolean a(final zx \u2603, final wn \u2603, final adm \u2603, final cj \u2603, final cq \u2603, final float \u2603, final float \u2603, final float \u2603) {
        final alz p = \u2603.p(\u2603);
        if (!\u2603.a(\u2603.a(\u2603), \u2603, \u2603) || p.c() != afi.bG || p.b((amo<Boolean>)ago.b)) {
            return false;
        }
        if (\u2603.D) {
            return true;
        }
        \u2603.a(\u2603, p.a((amo<Comparable>)ago.b, true), 2);
        \u2603.e(\u2603, afi.bG);
        --\u2603.b;
        for (int i = 0; i < 16; ++i) {
            final double \u26032 = \u2603.n() + (5.0f + zj.g.nextFloat() * 6.0f) / 16.0f;
            final double \u26033 = \u2603.o() + 0.8125f;
            final double \u26034 = \u2603.p() + (5.0f + zj.g.nextFloat() * 6.0f) / 16.0f;
            final double \u26035 = 0.0;
            final double \u26036 = 0.0;
            final double \u26037 = 0.0;
            \u2603.a(cy.l, \u26032, \u26033, \u26034, \u26035, \u26036, \u26037, new int[0]);
        }
        final cq \u26038 = p.b((amo<cq>)ago.a);
        int n = 0;
        int n2 = 0;
        boolean b = false;
        boolean b2 = true;
        final cq e = \u26038.e();
        for (int j = -2; j <= 2; ++j) {
            final cj a = \u2603.a(e, j);
            final alz p2 = \u2603.p(a);
            if (p2.c() == afi.bG) {
                if (!p2.b((amo<Boolean>)ago.b)) {
                    b2 = false;
                    break;
                }
                n2 = j;
                if (!b) {
                    n = j;
                    b = true;
                }
            }
        }
        if (b2 && n2 == n + 2) {
            cj cj = \u2603.a(\u26038, 4);
            for (int k = n; k <= n2; ++k) {
                final cj a2 = cj.a(e, k);
                final alz p3 = \u2603.p(a2);
                if (p3.c() != afi.bG || !p3.b((amo<Boolean>)ago.b)) {
                    b2 = false;
                    break;
                }
            }
            for (int k = n - 1; k <= n2 + 1; k += 4) {
                cj = \u2603.a(e, k);
                for (int l = 1; l <= 3; ++l) {
                    final cj cj2 = cj.a(\u26038, l);
                    final alz p4 = \u2603.p(cj2);
                    if (p4.c() != afi.bG || !p4.b((amo<Boolean>)ago.b)) {
                        b2 = false;
                        break;
                    }
                }
            }
            if (b2) {
                for (int k = n; k <= n2; ++k) {
                    cj = \u2603.a(e, k);
                    for (int l = 1; l <= 3; ++l) {
                        final cj cj2 = cj.a(\u26038, l);
                        \u2603.a(cj2, afi.bF.Q(), 2);
                    }
                }
            }
        }
        return true;
    }
    
    @Override
    public zx a(final zx \u2603, final adm \u2603, final wn \u2603) {
        final auh a = this.a(\u2603, \u2603, false);
        if (a != null && a.a == auh.a.b && \u2603.p(a.a()).c() == afi.bG) {
            return \u2603;
        }
        if (!\u2603.D) {
            final cj a2 = \u2603.a("Stronghold", new cj(\u2603));
            if (a2 != null) {
                final wr \u26032 = new wr(\u2603, \u2603.s, \u2603.t, \u2603.u);
                \u26032.a(a2);
                \u2603.d(\u26032);
                \u2603.a((pk)\u2603, "random.bow", 0.5f, 0.4f / (zj.g.nextFloat() * 0.4f + 0.8f));
                \u2603.a(null, 1002, new cj(\u2603), 0);
                if (!\u2603.bA.d) {
                    --\u2603.b;
                }
                \u2603.b(na.ad[zw.b(this)]);
            }
        }
        return \u2603;
    }
}
