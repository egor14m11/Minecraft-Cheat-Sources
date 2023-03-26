import com.google.common.collect.Lists;
import org.apache.logging.log4j.LogManager;
import java.util.Iterator;
import java.util.Random;
import java.util.List;
import org.apache.logging.log4j.Logger;

// 
// Decompiled by Procyon v0.5.36
// 

public class api extends aot
{
    private static final Logger a;
    private static final String[] b;
    private static final List<ob> c;
    
    @Override
    public boolean b(final adm \u2603, final Random \u2603, final cj \u2603) {
        final int n = 3;
        final int n2 = \u2603.nextInt(2) + 2;
        final int n3 = -n2 - 1;
        final int n4 = n2 + 1;
        final int n5 = -1;
        final int n6 = 4;
        final int n7 = \u2603.nextInt(2) + 2;
        final int n8 = -n7 - 1;
        final int n9 = n7 + 1;
        int n10 = 0;
        for (int i = n3; i <= n4; ++i) {
            for (int j = -1; j <= 4; ++j) {
                for (int k = n8; k <= n9; ++k) {
                    final cj \u26032 = \u2603.a(i, j, k);
                    final arm t = \u2603.p(\u26032).c().t();
                    final boolean a = t.a();
                    if (j == -1 && !a) {
                        return false;
                    }
                    if (j == 4 && !a) {
                        return false;
                    }
                    if ((i == n3 || i == n4 || k == n8 || k == n9) && j == 0 && \u2603.d(\u26032) && \u2603.d(\u26032.a())) {
                        ++n10;
                    }
                }
            }
        }
        if (n10 < 1 || n10 > 5) {
            return false;
        }
        for (int i = n3; i <= n4; ++i) {
            for (int j = 3; j >= -1; --j) {
                for (int k = n8; k <= n9; ++k) {
                    final cj \u26032 = \u2603.a(i, j, k);
                    if (i == n3 || j == -1 || k == n8 || i == n4 || j == 4 || k == n9) {
                        if (\u26032.o() >= 0 && !\u2603.p(\u26032.b()).c().t().a()) {
                            \u2603.g(\u26032);
                        }
                        else if (\u2603.p(\u26032).c().t().a() && \u2603.p(\u26032).c() != afi.ae) {
                            if (j == -1 && \u2603.nextInt(4) != 0) {
                                \u2603.a(\u26032, afi.Y.Q(), 2);
                            }
                            else {
                                \u2603.a(\u26032, afi.e.Q(), 2);
                            }
                        }
                    }
                    else if (\u2603.p(\u26032).c() != afi.ae) {
                        \u2603.g(\u26032);
                    }
                }
            }
        }
        for (int i = 0; i < 2; ++i) {
            for (int j = 0; j < 3; ++j) {
                final int k = \u2603.n() + \u2603.nextInt(n2 * 2 + 1) - n2;
                final int o = \u2603.o();
                final int \u26033 = \u2603.p() + \u2603.nextInt(n7 * 2 + 1) - n7;
                final cj cj = new cj(k, o, \u26033);
                if (\u2603.d(cj)) {
                    int n11 = 0;
                    for (final cq \u26034 : cq.c.a) {
                        if (\u2603.p(cj.a(\u26034)).c().t().a()) {
                            ++n11;
                        }
                    }
                    if (n11 == 1) {
                        \u2603.a(cj, afi.ae.f(\u2603, cj, afi.ae.Q()), 2);
                        final List<ob> a2 = ob.a(api.c, zy.cd.b(\u2603));
                        final akw s = \u2603.s(cj);
                        if (s instanceof aky) {
                            ob.a(\u2603, a2, (og)s, 8);
                            break;
                        }
                        break;
                    }
                }
            }
        }
        \u2603.a(\u2603, afi.ac.Q(), 2);
        final akw s2 = \u2603.s(\u2603);
        if (s2 instanceof all) {
            ((all)s2).b().a(this.a(\u2603));
        }
        else {
            api.a.error("Failed to fetch mob spawner entity at (" + \u2603.n() + ", " + \u2603.o() + ", " + \u2603.p() + ")");
        }
        return true;
    }
    
    private String a(final Random \u2603) {
        return api.b[\u2603.nextInt(api.b.length)];
    }
    
    static {
        a = LogManager.getLogger();
        b = new String[] { "Skeleton", "Zombie", "Zombie", "Spider" };
        c = Lists.newArrayList(new ob(zy.aA, 0, 1, 1, 10), new ob(zy.j, 0, 1, 4, 10), new ob(zy.P, 0, 1, 1, 10), new ob(zy.O, 0, 1, 4, 10), new ob(zy.H, 0, 1, 4, 10), new ob(zy.F, 0, 1, 4, 10), new ob(zy.aw, 0, 1, 1, 10), new ob(zy.ao, 0, 1, 1, 1), new ob(zy.aC, 0, 1, 4, 10), new ob(zy.cq, 0, 1, 1, 4), new ob(zy.cr, 0, 1, 1, 4), new ob(zy.co, 0, 1, 1, 10), new ob(zy.cl, 0, 1, 1, 2), new ob(zy.ck, 0, 1, 1, 5), new ob(zy.cm, 0, 1, 1, 1));
    }
}
