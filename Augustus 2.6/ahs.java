import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public abstract class ahs extends akg
{
    public static final amk a;
    public static final amk b;
    int[] N;
    protected int O;
    protected boolean P;
    
    public ahs() {
        super(arm.j, false);
        this.a(true);
        this.a(yz.c);
        this.c(0.2f);
        this.e(1);
        this.a(ahs.h);
    }
    
    @Override
    public int H() {
        return adj.a(0.5, 1.0);
    }
    
    @Override
    public int h(final alz \u2603) {
        return adj.c();
    }
    
    @Override
    public int a(final adq \u2603, final cj \u2603, final int \u2603) {
        return aea.b(\u2603, \u2603);
    }
    
    @Override
    public void b(final adm \u2603, final cj \u2603, final alz \u2603) {
        final int n = 1;
        final int n2 = n + 1;
        final int n3 = \u2603.n();
        final int o = \u2603.o();
        final int p = \u2603.p();
        if (\u2603.a(new cj(n3 - n2, o - n2, p - n2), new cj(n3 + n2, o + n2, p + n2))) {
            for (int i = -n; i <= n; ++i) {
                for (int j = -n; j <= n; ++j) {
                    for (int k = -n; k <= n; ++k) {
                        final cj a = \u2603.a(i, j, k);
                        final alz p2 = \u2603.p(a);
                        if (p2.c().t() == arm.j && !p2.b((amo<Boolean>)ahs.b)) {
                            \u2603.a(a, p2.a((amo<Comparable>)ahs.b, true), 4);
                        }
                    }
                }
            }
        }
    }
    
    @Override
    public void b(final adm \u2603, final cj \u2603, final alz \u2603, final Random \u2603) {
        if (\u2603.D) {
            return;
        }
        if (\u2603.b((amo<Boolean>)ahs.b) && \u2603.b((amo<Boolean>)ahs.a)) {
            final int n = 4;
            final int n2 = n + 1;
            final int n3 = \u2603.n();
            final int o = \u2603.o();
            final int p = \u2603.p();
            final int n4 = 32;
            final int n5 = n4 * n4;
            final int n6 = n4 / 2;
            if (this.N == null) {
                this.N = new int[n4 * n4 * n4];
            }
            if (\u2603.a(new cj(n3 - n2, o - n2, p - n2), new cj(n3 + n2, o + n2, p + n2))) {
                final cj.a a = new cj.a();
                for (int i = -n; i <= n; ++i) {
                    for (int j = -n; j <= n; ++j) {
                        for (int k = -n; k <= n; ++k) {
                            final afh c = \u2603.p(a.c(n3 + i, o + j, p + k)).c();
                            if (c == afi.r || c == afi.s) {
                                this.N[(i + n6) * n5 + (j + n6) * n4 + (k + n6)] = 0;
                            }
                            else if (c.t() == arm.j) {
                                this.N[(i + n6) * n5 + (j + n6) * n4 + (k + n6)] = -2;
                            }
                            else {
                                this.N[(i + n6) * n5 + (j + n6) * n4 + (k + n6)] = -1;
                            }
                        }
                    }
                }
                for (int i = 1; i <= 4; ++i) {
                    for (int j = -n; j <= n; ++j) {
                        for (int k = -n; k <= n; ++k) {
                            for (int l = -n; l <= n; ++l) {
                                if (this.N[(j + n6) * n5 + (k + n6) * n4 + (l + n6)] == i - 1) {
                                    if (this.N[(j + n6 - 1) * n5 + (k + n6) * n4 + (l + n6)] == -2) {
                                        this.N[(j + n6 - 1) * n5 + (k + n6) * n4 + (l + n6)] = i;
                                    }
                                    if (this.N[(j + n6 + 1) * n5 + (k + n6) * n4 + (l + n6)] == -2) {
                                        this.N[(j + n6 + 1) * n5 + (k + n6) * n4 + (l + n6)] = i;
                                    }
                                    if (this.N[(j + n6) * n5 + (k + n6 - 1) * n4 + (l + n6)] == -2) {
                                        this.N[(j + n6) * n5 + (k + n6 - 1) * n4 + (l + n6)] = i;
                                    }
                                    if (this.N[(j + n6) * n5 + (k + n6 + 1) * n4 + (l + n6)] == -2) {
                                        this.N[(j + n6) * n5 + (k + n6 + 1) * n4 + (l + n6)] = i;
                                    }
                                    if (this.N[(j + n6) * n5 + (k + n6) * n4 + (l + n6 - 1)] == -2) {
                                        this.N[(j + n6) * n5 + (k + n6) * n4 + (l + n6 - 1)] = i;
                                    }
                                    if (this.N[(j + n6) * n5 + (k + n6) * n4 + (l + n6 + 1)] == -2) {
                                        this.N[(j + n6) * n5 + (k + n6) * n4 + (l + n6 + 1)] = i;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            final int n7 = this.N[n6 * n5 + n6 * n4 + n6];
            if (n7 >= 0) {
                \u2603.a(\u2603, \u2603.a((amo<Comparable>)ahs.b, false), 4);
            }
            else {
                this.e(\u2603, \u2603);
            }
        }
    }
    
    @Override
    public void c(final adm \u2603, final cj \u2603, final alz \u2603, final Random \u2603) {
        if (\u2603.C(\u2603.a()) && !adm.a(\u2603, \u2603.b()) && \u2603.nextInt(15) == 1) {
            final double \u26032 = \u2603.n() + \u2603.nextFloat();
            final double \u26033 = \u2603.o() - 0.05;
            final double \u26034 = \u2603.p() + \u2603.nextFloat();
            \u2603.a(cy.s, \u26032, \u26033, \u26034, 0.0, 0.0, 0.0, new int[0]);
        }
    }
    
    private void e(final adm \u2603, final cj \u2603) {
        this.b(\u2603, \u2603, \u2603.p(\u2603), 0);
        \u2603.g(\u2603);
    }
    
    @Override
    public int a(final Random \u2603) {
        return (\u2603.nextInt(20) == 0) ? 1 : 0;
    }
    
    @Override
    public zw a(final alz \u2603, final Random \u2603, final int \u2603) {
        return zw.a(afi.g);
    }
    
    @Override
    public void a(final adm \u2603, final cj \u2603, final alz \u2603, final float \u2603, final int \u2603) {
        if (!\u2603.D) {
            int d = this.d(\u2603);
            if (\u2603 > 0) {
                d -= 2 << \u2603;
                if (d < 10) {
                    d = 10;
                }
            }
            if (\u2603.s.nextInt(d) == 0) {
                final zw a = this.a(\u2603, \u2603.s, \u2603);
                afh.a(\u2603, \u2603, new zx(a, 1, this.a(\u2603)));
            }
            d = 200;
            if (\u2603 > 0) {
                d -= 10 << \u2603;
                if (d < 40) {
                    d = 40;
                }
            }
            this.a(\u2603, \u2603, \u2603, d);
        }
    }
    
    protected void a(final adm \u2603, final cj \u2603, final alz \u2603, final int \u2603) {
    }
    
    protected int d(final alz \u2603) {
        return 20;
    }
    
    @Override
    public boolean c() {
        return !this.R;
    }
    
    public void b(final boolean \u2603) {
        this.P = \u2603;
        this.R = \u2603;
        this.O = (\u2603 ? 0 : 1);
    }
    
    @Override
    public adf m() {
        return this.P ? adf.b : adf.a;
    }
    
    @Override
    public boolean w() {
        return false;
    }
    
    public abstract aio.a b(final int p0);
    
    static {
        a = amk.a("decayable");
        b = amk.a("check_decay");
    }
}
