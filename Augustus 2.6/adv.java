// 
// Decompiled by Procyon v0.5.36
// 

public class adv implements adq
{
    protected int a;
    protected int b;
    protected amy[][] c;
    protected boolean d;
    protected adm e;
    
    public adv(final adm \u2603, final cj \u2603, final cj \u2603, final int \u2603) {
        this.e = \u2603;
        this.a = \u2603.n() - \u2603 >> 4;
        this.b = \u2603.p() - \u2603 >> 4;
        final int n = \u2603.n() + \u2603 >> 4;
        final int n2 = \u2603.p() + \u2603 >> 4;
        this.c = new amy[n - this.a + 1][n2 - this.b + 1];
        this.d = true;
        for (int i = this.a; i <= n; ++i) {
            for (int j = this.b; j <= n2; ++j) {
                this.c[i - this.a][j - this.b] = \u2603.a(i, j);
            }
        }
        for (int i = \u2603.n() >> 4; i <= \u2603.n() >> 4; ++i) {
            for (int j = \u2603.p() >> 4; j <= \u2603.p() >> 4; ++j) {
                final amy amy = this.c[i - this.a][j - this.b];
                if (amy != null && !amy.c(\u2603.o(), \u2603.o())) {
                    this.d = false;
                }
            }
        }
    }
    
    @Override
    public boolean W() {
        return this.d;
    }
    
    @Override
    public akw s(final cj \u2603) {
        final int n = (\u2603.n() >> 4) - this.a;
        final int n2 = (\u2603.p() >> 4) - this.b;
        return this.c[n][n2].a(\u2603, amy.a.a);
    }
    
    @Override
    public int b(final cj \u2603, final int \u2603) {
        final int a = this.a(ads.a, \u2603);
        int a2 = this.a(ads.b, \u2603);
        if (a2 < \u2603) {
            a2 = \u2603;
        }
        return a << 20 | a2 << 4;
    }
    
    @Override
    public alz p(final cj \u2603) {
        if (\u2603.o() >= 0 && \u2603.o() < 256) {
            final int n = (\u2603.n() >> 4) - this.a;
            final int n2 = (\u2603.p() >> 4) - this.b;
            if (n >= 0 && n < this.c.length && n2 >= 0 && n2 < this.c[n].length) {
                final amy amy = this.c[n][n2];
                if (amy != null) {
                    return amy.g(\u2603);
                }
            }
        }
        return afi.a.Q();
    }
    
    @Override
    public ady b(final cj \u2603) {
        return this.e.b(\u2603);
    }
    
    private int a(final ads \u2603, final cj \u2603) {
        if (\u2603 == ads.a && this.e.t.o()) {
            return 0;
        }
        if (\u2603.o() < 0 || \u2603.o() >= 256) {
            return \u2603.c;
        }
        if (this.p(\u2603).c().s()) {
            int n = 0;
            for (final cq \u26032 : cq.values()) {
                final int b = this.b(\u2603, \u2603.a(\u26032));
                if (b > n) {
                    n = b;
                }
                if (n >= 15) {
                    return n;
                }
            }
            return n;
        }
        int n = (\u2603.n() >> 4) - this.a;
        final int n2 = (\u2603.p() >> 4) - this.b;
        return this.c[n][n2].a(\u2603, \u2603);
    }
    
    @Override
    public boolean d(final cj \u2603) {
        return this.p(\u2603).c().t() == arm.a;
    }
    
    public int b(final ads \u2603, final cj \u2603) {
        if (\u2603.o() < 0 || \u2603.o() >= 256) {
            return \u2603.c;
        }
        final int n = (\u2603.n() >> 4) - this.a;
        final int n2 = (\u2603.p() >> 4) - this.b;
        return this.c[n][n2].a(\u2603, \u2603);
    }
    
    @Override
    public int a(final cj \u2603, final cq \u2603) {
        final alz p = this.p(\u2603);
        return p.c().b(this, \u2603, p, \u2603);
    }
    
    @Override
    public adr G() {
        return this.e.G();
    }
}
