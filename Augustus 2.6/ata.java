// 
// Decompiled by Procyon v0.5.36
// 

public class ata extends asw
{
    private boolean f;
    private boolean g;
    private boolean h;
    private boolean i;
    private boolean j;
    
    @Override
    public void a(final adq \u2603, final pk \u2603) {
        super.a(\u2603, \u2603);
        this.j = this.h;
    }
    
    @Override
    public void a() {
        super.a();
        this.h = this.j;
    }
    
    @Override
    public asv a(final pk \u2603) {
        int c;
        if (this.i && \u2603.V()) {
            c = (int)\u2603.aR().b;
            final cj.a a = new cj.a(ns.c(\u2603.s), c, ns.c(\u2603.u));
            for (afh afh = this.a.p(a).c(); afh == afi.i || afh == afi.j; afh = this.a.p(a).c()) {
                ++c;
                a.c(ns.c(\u2603.s), c, ns.c(\u2603.u));
            }
            this.h = false;
        }
        else {
            c = ns.c(\u2603.aR().b + 0.5);
        }
        return this.a(ns.c(\u2603.aR().a), c, ns.c(\u2603.aR().c));
    }
    
    @Override
    public asv a(final pk \u2603, final double \u2603, final double \u2603, final double \u2603) {
        return this.a(ns.c(\u2603 - \u2603.J / 2.0f), ns.c(\u2603), ns.c(\u2603 - \u2603.J / 2.0f));
    }
    
    @Override
    public int a(final asv[] \u2603, final pk \u2603, final asv \u2603, final asv \u2603, final float \u2603) {
        int n = 0;
        int n2 = 0;
        if (this.a(\u2603, \u2603.a, \u2603.b + 1, \u2603.c) == 1) {
            n2 = 1;
        }
        final asv a = this.a(\u2603, \u2603.a, \u2603.b, \u2603.c + 1, n2);
        final asv a2 = this.a(\u2603, \u2603.a - 1, \u2603.b, \u2603.c, n2);
        final asv a3 = this.a(\u2603, \u2603.a + 1, \u2603.b, \u2603.c, n2);
        final asv a4 = this.a(\u2603, \u2603.a, \u2603.b, \u2603.c - 1, n2);
        if (a != null && !a.i && a.a(\u2603) < \u2603) {
            \u2603[n++] = a;
        }
        if (a2 != null && !a2.i && a2.a(\u2603) < \u2603) {
            \u2603[n++] = a2;
        }
        if (a3 != null && !a3.i && a3.a(\u2603) < \u2603) {
            \u2603[n++] = a3;
        }
        if (a4 != null && !a4.i && a4.a(\u2603) < \u2603) {
            \u2603[n++] = a4;
        }
        return n;
    }
    
    private asv a(final pk \u2603, final int \u2603, int \u2603, final int \u2603, final int \u2603) {
        asv asv = null;
        final int a = this.a(\u2603, \u2603, \u2603, \u2603);
        if (a == 2) {
            return this.a(\u2603, \u2603, \u2603);
        }
        if (a == 1) {
            asv = this.a(\u2603, \u2603, \u2603);
        }
        if (asv == null && \u2603 > 0 && a != -3 && a != -4 && this.a(\u2603, \u2603, \u2603 + \u2603, \u2603) == 1) {
            asv = this.a(\u2603, \u2603 + \u2603, \u2603);
            \u2603 += \u2603;
        }
        if (asv != null) {
            int n = 0;
            int a2 = 0;
            while (\u2603 > 0) {
                a2 = this.a(\u2603, \u2603, \u2603 - 1, \u2603);
                if (this.h && a2 == -1) {
                    return null;
                }
                if (a2 != 1) {
                    break;
                }
                if (n++ >= \u2603.aE()) {
                    return null;
                }
                if (--\u2603 <= 0) {
                    return null;
                }
                asv = this.a(\u2603, \u2603, \u2603);
            }
            if (a2 == -2) {
                return null;
            }
        }
        return asv;
    }
    
    private int a(final pk \u2603, final int \u2603, final int \u2603, final int \u2603) {
        return a(this.a, \u2603, \u2603, \u2603, \u2603, this.c, this.d, this.e, this.h, this.g, this.f);
    }
    
    public static int a(final adq \u2603, final pk \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final boolean \u2603, final boolean \u2603, final boolean \u2603) {
        boolean b = false;
        final cj \u26032 = new cj(\u2603);
        final cj.a a = new cj.a();
        for (int i = \u2603; i < \u2603 + \u2603; ++i) {
            for (int j = \u2603; j < \u2603 + \u2603; ++j) {
                for (int k = \u2603; k < \u2603 + \u2603; ++k) {
                    a.c(i, j, k);
                    final afh c = \u2603.p(a).c();
                    if (c.t() != arm.a) {
                        if (c == afi.bd || c == afi.cw) {
                            b = true;
                        }
                        else if (c == afi.i || c == afi.j) {
                            if (\u2603) {
                                return -1;
                            }
                            b = true;
                        }
                        else if (!\u2603 && c instanceof agh && c.t() == arm.d) {
                            return 0;
                        }
                        if (\u2603.o.p(a).c() instanceof afe) {
                            if (!(\u2603.o.p(\u26032).c() instanceof afe)) {
                                if (!(\u2603.o.p(\u26032.b()).c() instanceof afe)) {
                                    return -3;
                                }
                            }
                        }
                        else if (!c.b(\u2603, a)) {
                            if (!\u2603 || !(c instanceof agh) || c.t() != arm.d) {
                                if (c instanceof agt || c instanceof agu || c instanceof akl) {
                                    return -3;
                                }
                                if (c == afi.bd || c == afi.cw) {
                                    return -4;
                                }
                                final arm t = c.t();
                                if (t != arm.i) {
                                    return 0;
                                }
                                if (!\u2603.ab()) {
                                    return -2;
                                }
                            }
                        }
                    }
                }
            }
        }
        return b ? 2 : 1;
    }
    
    public void a(final boolean \u2603) {
        this.f = \u2603;
    }
    
    public void b(final boolean \u2603) {
        this.g = \u2603;
    }
    
    public void c(final boolean \u2603) {
        this.h = \u2603;
    }
    
    public void d(final boolean \u2603) {
        this.i = \u2603;
    }
    
    public boolean b() {
        return this.f;
    }
    
    public boolean d() {
        return this.i;
    }
    
    public boolean e() {
        return this.h;
    }
}
