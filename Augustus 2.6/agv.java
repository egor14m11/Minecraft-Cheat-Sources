import java.util.Random;
import com.google.common.collect.Maps;
import java.util.Map;

// 
// Decompiled by Procyon v0.5.36
// 

public class agv extends afh
{
    public static final amn a;
    public static final amk b;
    public static final amk N;
    public static final amk O;
    public static final amk P;
    public static final amk Q;
    public static final amk R;
    public static final amn S;
    private final Map<afh, Integer> T;
    private final Map<afh, Integer> U;
    
    @Override
    public alz a(final alz \u2603, final adq \u2603, final cj \u2603) {
        final int n = \u2603.n();
        final int o = \u2603.o();
        final int p = \u2603.p();
        if (adm.a(\u2603, \u2603.b()) || afi.ab.e(\u2603, \u2603.b())) {
            return this.Q();
        }
        final boolean b = (n + o + p & 0x1) == 0x1;
        final boolean b2 = (n / 2 + o / 2 + p / 2 & 0x1) == 0x1;
        int i = 0;
        if (this.e(\u2603, \u2603.a())) {
            i = (b ? 1 : 2);
        }
        return \u2603.a((amo<Comparable>)agv.O, this.e(\u2603, \u2603.c())).a((amo<Comparable>)agv.P, this.e(\u2603, \u2603.f())).a((amo<Comparable>)agv.Q, this.e(\u2603, \u2603.d())).a((amo<Comparable>)agv.R, this.e(\u2603, \u2603.e())).a((amo<Comparable>)agv.S, i).a((amo<Comparable>)agv.b, b2).a((amo<Comparable>)agv.N, b);
    }
    
    protected agv() {
        super(arm.o);
        this.T = (Map<afh, Integer>)Maps.newIdentityHashMap();
        this.U = (Map<afh, Integer>)Maps.newIdentityHashMap();
        this.j(this.M.b().a((amo<Comparable>)agv.a, 0).a((amo<Comparable>)agv.b, false).a((amo<Comparable>)agv.N, false).a((amo<Comparable>)agv.O, false).a((amo<Comparable>)agv.P, false).a((amo<Comparable>)agv.Q, false).a((amo<Comparable>)agv.R, false).a((amo<Comparable>)agv.S, 0));
        this.a(true);
    }
    
    public static void l() {
        afi.ab.a(afi.f, 5, 20);
        afi.ab.a(afi.bL, 5, 20);
        afi.ab.a(afi.bM, 5, 20);
        afi.ab.a(afi.bo, 5, 20);
        afi.ab.a(afi.bp, 5, 20);
        afi.ab.a(afi.bq, 5, 20);
        afi.ab.a(afi.br, 5, 20);
        afi.ab.a(afi.bs, 5, 20);
        afi.ab.a(afi.bt, 5, 20);
        afi.ab.a(afi.aO, 5, 20);
        afi.ab.a(afi.aP, 5, 20);
        afi.ab.a(afi.aQ, 5, 20);
        afi.ab.a(afi.aR, 5, 20);
        afi.ab.a(afi.aS, 5, 20);
        afi.ab.a(afi.aT, 5, 20);
        afi.ab.a(afi.ad, 5, 20);
        afi.ab.a(afi.bV, 5, 20);
        afi.ab.a(afi.bU, 5, 20);
        afi.ab.a(afi.bW, 5, 20);
        afi.ab.a(afi.r, 5, 5);
        afi.ab.a(afi.s, 5, 5);
        afi.ab.a(afi.t, 30, 60);
        afi.ab.a(afi.u, 30, 60);
        afi.ab.a(afi.X, 30, 20);
        afi.ab.a(afi.W, 15, 100);
        afi.ab.a(afi.H, 60, 100);
        afi.ab.a(afi.cF, 60, 100);
        afi.ab.a(afi.N, 60, 100);
        afi.ab.a(afi.O, 60, 100);
        afi.ab.a(afi.I, 60, 100);
        afi.ab.a(afi.L, 30, 60);
        afi.ab.a(afi.bn, 15, 100);
        afi.ab.a(afi.cA, 5, 5);
        afi.ab.a(afi.cx, 60, 20);
        afi.ab.a(afi.cy, 60, 20);
    }
    
    public void a(final afh \u2603, final int \u2603, final int \u2603) {
        this.T.put(\u2603, \u2603);
        this.U.put(\u2603, \u2603);
    }
    
    @Override
    public aug a(final adm \u2603, final cj \u2603, final alz \u2603) {
        return null;
    }
    
    @Override
    public boolean c() {
        return false;
    }
    
    @Override
    public boolean d() {
        return false;
    }
    
    @Override
    public int a(final Random \u2603) {
        return 0;
    }
    
    @Override
    public int a(final adm \u2603) {
        return 30;
    }
    
    @Override
    public void b(final adm \u2603, final cj \u2603, alz \u2603, final Random \u2603) {
        if (!\u2603.Q().b("doFireTick")) {
            return;
        }
        if (!this.d(\u2603, \u2603)) {
            \u2603.g(\u2603);
        }
        final afh c = \u2603.p(\u2603.b()).c();
        boolean b = c == afi.aV;
        if (\u2603.t instanceof anp && c == afi.h) {
            b = true;
        }
        if (!b && \u2603.S() && this.e(\u2603, \u2603)) {
            \u2603.g(\u2603);
            return;
        }
        final int intValue = \u2603.b((amo<Integer>)agv.a);
        if (intValue < 15) {
            \u2603 = \u2603.a((amo<Comparable>)agv.a, intValue + \u2603.nextInt(3) / 2);
            \u2603.a(\u2603, \u2603, 4);
        }
        \u2603.a(\u2603, this, this.a(\u2603) + \u2603.nextInt(10));
        if (!b) {
            if (!this.f(\u2603, \u2603)) {
                if (!adm.a(\u2603, \u2603.b()) || intValue > 3) {
                    \u2603.g(\u2603);
                }
                return;
            }
            if (!this.e((adq)\u2603, \u2603.b()) && intValue == 15 && \u2603.nextInt(4) == 0) {
                \u2603.g(\u2603);
                return;
            }
        }
        final boolean d = \u2603.D(\u2603);
        int n = 0;
        if (d) {
            n = -50;
        }
        this.a(\u2603, \u2603.f(), 300 + n, \u2603, intValue);
        this.a(\u2603, \u2603.e(), 300 + n, \u2603, intValue);
        this.a(\u2603, \u2603.b(), 250 + n, \u2603, intValue);
        this.a(\u2603, \u2603.a(), 250 + n, \u2603, intValue);
        this.a(\u2603, \u2603.c(), 300 + n, \u2603, intValue);
        this.a(\u2603, \u2603.d(), 300 + n, \u2603, intValue);
        for (int i = -1; i <= 1; ++i) {
            for (int j = -1; j <= 1; ++j) {
                for (int k = -1; k <= 4; ++k) {
                    if (i != 0 || k != 0 || j != 0) {
                        int bound = 100;
                        if (k > 1) {
                            bound += (k - 1) * 100;
                        }
                        final cj a = \u2603.a(i, k, j);
                        final int m = this.m(\u2603, a);
                        if (m > 0) {
                            int n2 = (m + 40 + \u2603.aa().a() * 7) / (intValue + 30);
                            if (d) {
                                n2 /= 2;
                            }
                            if (n2 > 0 && \u2603.nextInt(bound) <= n2) {
                                if (!\u2603.S() || !this.e(\u2603, a)) {
                                    int l = intValue + \u2603.nextInt(5) / 4;
                                    if (l > 15) {
                                        l = 15;
                                    }
                                    \u2603.a(a, \u2603.a((amo<Comparable>)agv.a, l), 3);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
    protected boolean e(final adm \u2603, final cj \u2603) {
        return \u2603.C(\u2603) || \u2603.C(\u2603.e()) || \u2603.C(\u2603.f()) || \u2603.C(\u2603.c()) || \u2603.C(\u2603.d());
    }
    
    @Override
    public boolean N() {
        return false;
    }
    
    private int c(final afh \u2603) {
        final Integer n = this.U.get(\u2603);
        return (n == null) ? 0 : n;
    }
    
    private int d(final afh \u2603) {
        final Integer n = this.T.get(\u2603);
        return (n == null) ? 0 : n;
    }
    
    private void a(final adm \u2603, final cj \u2603, final int \u2603, final Random \u2603, final int \u2603) {
        final int c = this.c(\u2603.p(\u2603).c());
        if (\u2603.nextInt(\u2603) < c) {
            final alz p = \u2603.p(\u2603);
            if (\u2603.nextInt(\u2603 + 10) < 5 && !\u2603.C(\u2603)) {
                int i = \u2603 + \u2603.nextInt(5) / 4;
                if (i > 15) {
                    i = 15;
                }
                \u2603.a(\u2603, this.Q().a((amo<Comparable>)agv.a, i), 3);
            }
            else {
                \u2603.g(\u2603);
            }
            if (p.c() == afi.W) {
                afi.W.d(\u2603, \u2603, p.a((amo<Comparable>)ake.a, true));
            }
        }
    }
    
    private boolean f(final adm \u2603, final cj \u2603) {
        for (final cq \u26032 : cq.values()) {
            if (this.e((adq)\u2603, \u2603.a(\u26032))) {
                return true;
            }
        }
        return false;
    }
    
    private int m(final adm \u2603, final cj \u2603) {
        if (!\u2603.d(\u2603)) {
            return 0;
        }
        int max = 0;
        for (final cq \u26032 : cq.values()) {
            max = Math.max(this.d(\u2603.p(\u2603.a(\u26032)).c()), max);
        }
        return max;
    }
    
    @Override
    public boolean A() {
        return false;
    }
    
    public boolean e(final adq \u2603, final cj \u2603) {
        return this.d(\u2603.p(\u2603).c()) > 0;
    }
    
    @Override
    public boolean d(final adm \u2603, final cj \u2603) {
        return adm.a(\u2603, \u2603.b()) || this.f(\u2603, \u2603);
    }
    
    @Override
    public void a(final adm \u2603, final cj \u2603, final alz \u2603, final afh \u2603) {
        if (!adm.a(\u2603, \u2603.b()) && !this.f(\u2603, \u2603)) {
            \u2603.g(\u2603);
        }
    }
    
    @Override
    public void c(final adm \u2603, final cj \u2603, final alz \u2603) {
        if (\u2603.t.q() <= 0 && afi.aY.e(\u2603, \u2603)) {
            return;
        }
        if (!adm.a(\u2603, \u2603.b()) && !this.f(\u2603, \u2603)) {
            \u2603.g(\u2603);
            return;
        }
        \u2603.a(\u2603, this, this.a(\u2603) + \u2603.s.nextInt(10));
    }
    
    @Override
    public void c(final adm \u2603, final cj \u2603, final alz \u2603, final Random \u2603) {
        if (\u2603.nextInt(24) == 0) {
            \u2603.a(\u2603.n() + 0.5f, \u2603.o() + 0.5f, \u2603.p() + 0.5f, "fire.fire", 1.0f + \u2603.nextFloat(), \u2603.nextFloat() * 0.7f + 0.3f, false);
        }
        if (adm.a(\u2603, \u2603.b()) || afi.ab.e((adq)\u2603, \u2603.b())) {
            for (int i = 0; i < 3; ++i) {
                final double n = \u2603.n() + \u2603.nextDouble();
                final double n2 = \u2603.o() + \u2603.nextDouble() * 0.5 + 0.5;
                final double n3 = \u2603.p() + \u2603.nextDouble();
                \u2603.a(cy.m, n, n2, n3, 0.0, 0.0, 0.0, new int[0]);
            }
        }
        else {
            if (afi.ab.e((adq)\u2603, \u2603.e())) {
                for (int i = 0; i < 2; ++i) {
                    final double n = \u2603.n() + \u2603.nextDouble() * 0.10000000149011612;
                    final double n2 = \u2603.o() + \u2603.nextDouble();
                    final double n3 = \u2603.p() + \u2603.nextDouble();
                    \u2603.a(cy.m, n, n2, n3, 0.0, 0.0, 0.0, new int[0]);
                }
            }
            if (afi.ab.e((adq)\u2603, \u2603.f())) {
                for (int i = 0; i < 2; ++i) {
                    final double n = \u2603.n() + 1 - \u2603.nextDouble() * 0.10000000149011612;
                    final double n2 = \u2603.o() + \u2603.nextDouble();
                    final double n3 = \u2603.p() + \u2603.nextDouble();
                    \u2603.a(cy.m, n, n2, n3, 0.0, 0.0, 0.0, new int[0]);
                }
            }
            if (afi.ab.e((adq)\u2603, \u2603.c())) {
                for (int i = 0; i < 2; ++i) {
                    final double n = \u2603.n() + \u2603.nextDouble();
                    final double n2 = \u2603.o() + \u2603.nextDouble();
                    final double n3 = \u2603.p() + \u2603.nextDouble() * 0.10000000149011612;
                    \u2603.a(cy.m, n, n2, n3, 0.0, 0.0, 0.0, new int[0]);
                }
            }
            if (afi.ab.e((adq)\u2603, \u2603.d())) {
                for (int i = 0; i < 2; ++i) {
                    final double n = \u2603.n() + \u2603.nextDouble();
                    final double n2 = \u2603.o() + \u2603.nextDouble();
                    final double n3 = \u2603.p() + 1 - \u2603.nextDouble() * 0.10000000149011612;
                    \u2603.a(cy.m, n, n2, n3, 0.0, 0.0, 0.0, new int[0]);
                }
            }
            if (afi.ab.e((adq)\u2603, \u2603.a())) {
                for (int i = 0; i < 2; ++i) {
                    final double n = \u2603.n() + \u2603.nextDouble();
                    final double n2 = \u2603.o() + 1 - \u2603.nextDouble() * 0.10000000149011612;
                    final double n3 = \u2603.p() + \u2603.nextDouble();
                    \u2603.a(cy.m, n, n2, n3, 0.0, 0.0, 0.0, new int[0]);
                }
            }
        }
    }
    
    @Override
    public arn g(final alz \u2603) {
        return arn.f;
    }
    
    @Override
    public adf m() {
        return adf.c;
    }
    
    @Override
    public alz a(final int \u2603) {
        return this.Q().a((amo<Comparable>)agv.a, \u2603);
    }
    
    @Override
    public int c(final alz \u2603) {
        return \u2603.b((amo<Integer>)agv.a);
    }
    
    @Override
    protected ama e() {
        return new ama(this, new amo[] { agv.a, agv.O, agv.P, agv.Q, agv.R, agv.S, agv.b, agv.N });
    }
    
    static {
        a = amn.a("age", 0, 15);
        b = amk.a("flip");
        N = amk.a("alt");
        O = amk.a("north");
        P = amk.a("east");
        Q = amk.a("south");
        R = amk.a("west");
        S = amn.a("upper", 0, 2);
    }
}
