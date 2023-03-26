import java.util.List;
import java.util.Collection;
import java.util.Random;
import java.util.Iterator;
import com.google.common.collect.Sets;
import java.util.Set;

// 
// Decompiled by Procyon v0.5.36
// 

public final class adt
{
    private static final int a;
    private final Set<adg> b;
    
    public adt() {
        this.b = (Set<adg>)Sets.newHashSet();
    }
    
    public int a(final le \u2603, final boolean \u2603, final boolean \u2603, final boolean \u2603) {
        if (!\u2603 && !\u2603) {
            return 0;
        }
        this.b.clear();
        int n = 0;
        for (final wn wn : \u2603.j) {
            if (!wn.v()) {
                final int c = ns.c(wn.s / 16.0);
                final int n2 = ns.c(wn.u / 16.0);
                for (int i = 8, j = -i; j <= i; ++j) {
                    for (int k = -i; k <= i; ++k) {
                        final boolean b = j == -i || j == i || k == -i || k == i;
                        final adg \u26032 = new adg(j + c, k + n2);
                        if (!this.b.contains(\u26032)) {
                            ++n;
                            if (!b && \u2603.af().a(\u26032)) {
                                this.b.add(\u26032);
                            }
                        }
                    }
                }
            }
        }
        int n3 = 0;
        final cj m = \u2603.M();
        final pt[] values = pt.values();
        final int n2 = values.length;
    Label_0364_Outer:
        for (final pt pt : values) {
            if (!pt.d() || \u2603) {
                if (pt.d() || \u2603) {
                    if (!pt.e() || \u2603) {
                        final int k = \u2603.a(pt.a());
                        final int n4 = pt.b() * n / adt.a;
                        if (k <= n4) {
                        Label_0364:
                            while (true) {
                                for (final adg adg : this.b) {
                                    final cj a = a(\u2603, adg.a, adg.b);
                                    final int n5 = a.n();
                                    final int o = a.o();
                                    final int p = a.p();
                                    final afh c2 = \u2603.p(a).c();
                                    if (c2.v()) {
                                        continue Label_0364_Outer;
                                    }
                                    int n6 = 0;
                                    for (int l = 0; l < 3; ++l) {
                                        int \u26033 = n5;
                                        int \u26034 = o;
                                        int \u26035 = p;
                                        final int n7 = 6;
                                        ady.c a2 = null;
                                        pu a3 = null;
                                        for (int n8 = 0; n8 < 4; ++n8) {
                                            \u26033 += \u2603.s.nextInt(n7) - \u2603.s.nextInt(n7);
                                            \u26034 += \u2603.s.nextInt(1) - \u2603.s.nextInt(1);
                                            \u26035 += \u2603.s.nextInt(n7) - \u2603.s.nextInt(n7);
                                            final cj \u26036 = new cj(\u26033, \u26034, \u26035);
                                            final float n9 = \u26033 + 0.5f;
                                            final float n10 = \u26035 + 0.5f;
                                            if (!\u2603.b(n9, \u26034, n10, 24.0)) {
                                                if (m.c(n9, \u26034, n10) >= 576.0) {
                                                    if (a2 == null) {
                                                        a2 = \u2603.a(pt, \u26036);
                                                        if (a2 == null) {
                                                            break;
                                                        }
                                                    }
                                                    if (\u2603.a(pt, a2, \u26036)) {
                                                        if (a(pv.a(a2.b), \u2603, \u26036)) {
                                                            ps ps;
                                                            try {
                                                                ps = (ps)a2.b.getConstructor(adm.class).newInstance(\u2603);
                                                            }
                                                            catch (Exception ex) {
                                                                ex.printStackTrace();
                                                                return n3;
                                                            }
                                                            ps.b(n9, \u26034, n10, \u2603.s.nextFloat() * 360.0f, 0.0f);
                                                            if (ps.bR() && ps.bS()) {
                                                                a3 = ps.a(\u2603.E(new cj(ps)), a3);
                                                                if (ps.bS()) {
                                                                    ++n6;
                                                                    \u2603.d(ps);
                                                                }
                                                                if (n6 >= ps.bV()) {
                                                                    continue Label_0364;
                                                                }
                                                            }
                                                            n3 += n6;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                break;
                            }
                        }
                    }
                }
            }
        }
        return n3;
    }
    
    protected static cj a(final adm \u2603, final int \u2603, final int \u2603) {
        final amy a = \u2603.a(\u2603, \u2603);
        final int n = \u2603 * 16 + \u2603.s.nextInt(16);
        final int n2 = \u2603 * 16 + \u2603.s.nextInt(16);
        final int c = ns.c(a.f(new cj(n, 0, n2)) + 1, 16);
        final int nextInt = \u2603.s.nextInt((c > 0) ? c : (a.g() + 16 - 1));
        return new cj(n, nextInt, n2);
    }
    
    public static boolean a(final ps.a \u2603, final adm \u2603, final cj \u2603) {
        if (!\u2603.af().a(\u2603)) {
            return false;
        }
        final afh c = \u2603.p(\u2603).c();
        if (\u2603 == ps.a.c) {
            return c.t().d() && \u2603.p(\u2603.b()).c().t().d() && !\u2603.p(\u2603.a()).c().v();
        }
        final cj b = \u2603.b();
        if (!adm.a(\u2603, b)) {
            return false;
        }
        final afh c2 = \u2603.p(b).c();
        final boolean b2 = c2 != afi.h && c2 != afi.cv;
        return b2 && !c.v() && !c.t().d() && !\u2603.p(\u2603.a()).c().v();
    }
    
    public static void a(final adm \u2603, final ady \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final Random \u2603) {
        final List<ady.c> a = \u2603.a(pt.b);
        if (a.isEmpty()) {
            return;
        }
        while (\u2603.nextFloat() < \u2603.g()) {
            final ady.c c = oa.a(\u2603.s, a);
            final int n = c.c + \u2603.nextInt(1 + c.d - c.c);
            pu a2 = null;
            int \u26032 = \u2603 + \u2603.nextInt(\u2603);
            int \u26033 = \u2603 + \u2603.nextInt(\u2603);
            final int n2 = \u26032;
            final int n3 = \u26033;
            for (int i = 0; i < n; ++i) {
                boolean b = false;
                for (int n4 = 0; !b && n4 < 4; ++n4) {
                    final cj r = \u2603.r(new cj(\u26032, 0, \u26033));
                    if (a(ps.a.a, \u2603, r)) {
                        ps ps;
                        try {
                            ps = (ps)c.b.getConstructor(adm.class).newInstance(\u2603);
                        }
                        catch (Exception ex) {
                            ex.printStackTrace();
                            continue;
                        }
                        ps.b(\u26032 + 0.5f, r.o(), \u26033 + 0.5f, \u2603.nextFloat() * 360.0f, 0.0f);
                        \u2603.d(ps);
                        a2 = ps.a(\u2603.E(new cj(ps)), a2);
                        b = true;
                    }
                    for (\u26032 += \u2603.nextInt(5) - \u2603.nextInt(5), \u26033 += \u2603.nextInt(5) - \u2603.nextInt(5); \u26032 < \u2603 || \u26032 >= \u2603 + \u2603 || \u26033 < \u2603 || \u26033 >= \u2603 + \u2603; \u26032 = n2 + \u2603.nextInt(5) - \u2603.nextInt(5), \u26033 = n3 + \u2603.nextInt(5) - \u2603.nextInt(5)) {}
                }
            }
        }
    }
    
    static {
        a = (int)Math.pow(17.0, 2.0);
    }
}
