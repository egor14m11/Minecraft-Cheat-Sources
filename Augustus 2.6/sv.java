import java.util.Iterator;

// 
// Decompiled by Procyon v0.5.36
// 

public class sv extends sw
{
    protected ata a;
    private boolean f;
    
    public sv(final ps \u2603, final adm \u2603) {
        super(\u2603, \u2603);
    }
    
    @Override
    protected asy a() {
        (this.a = new ata()).a(true);
        return new asy(this.a);
    }
    
    @Override
    protected boolean b() {
        return this.b.C || (this.h() && this.o()) || (this.b.au() && this.b instanceof we && this.b.m instanceof tn);
    }
    
    @Override
    protected aui c() {
        return new aui(this.b.s, this.p(), this.b.u);
    }
    
    private int p() {
        if (!this.b.V() || !this.h()) {
            return (int)(this.b.aR().b + 0.5);
        }
        int n = (int)this.b.aR().b;
        afh afh = this.c.p(new cj(ns.c(this.b.s), n, ns.c(this.b.u))).c();
        int n2 = 0;
        while (afh == afi.i || afh == afi.j) {
            ++n;
            afh = this.c.p(new cj(ns.c(this.b.s), n, ns.c(this.b.u))).c();
            if (++n2 > 16) {
                return (int)this.b.aR().b;
            }
        }
        return n;
    }
    
    @Override
    protected void d() {
        super.d();
        if (this.f) {
            if (this.c.i(new cj(ns.c(this.b.s), (int)(this.b.aR().b + 0.5), ns.c(this.b.u)))) {
                return;
            }
            for (int i = 0; i < this.d.d(); ++i) {
                final asv a = this.d.a(i);
                if (this.c.i(new cj(a.a, a.b, a.c))) {
                    this.d.b(i - 1);
                    return;
                }
            }
        }
    }
    
    @Override
    protected boolean a(final aui \u2603, final aui \u2603, int \u2603, final int \u2603, int \u2603) {
        int c = ns.c(\u2603.a);
        int c2 = ns.c(\u2603.c);
        double \u26032 = \u2603.a - \u2603.a;
        double \u26033 = \u2603.c - \u2603.c;
        final double a = \u26032 * \u26032 + \u26033 * \u26033;
        if (a < 1.0E-8) {
            return false;
        }
        final double n = 1.0 / Math.sqrt(a);
        \u26032 *= n;
        \u26033 *= n;
        \u2603 += 2;
        \u2603 += 2;
        if (!this.a(c, (int)\u2603.b, c2, \u2603, \u2603, \u2603, \u2603, \u26032, \u26033)) {
            return false;
        }
        \u2603 -= 2;
        \u2603 -= 2;
        final double n2 = 1.0 / Math.abs(\u26032);
        final double n3 = 1.0 / Math.abs(\u26033);
        double n4 = c * 1 - \u2603.a;
        double n5 = c2 * 1 - \u2603.c;
        if (\u26032 >= 0.0) {
            ++n4;
        }
        if (\u26033 >= 0.0) {
            ++n5;
        }
        n4 /= \u26032;
        n5 /= \u26033;
        final int n6 = (\u26032 < 0.0) ? -1 : 1;
        final int n7 = (\u26033 < 0.0) ? -1 : 1;
        final int c3 = ns.c(\u2603.a);
        final int c4 = ns.c(\u2603.c);
        int n8 = c3 - c;
        int n9 = c4 - c2;
        while (n8 * n6 > 0 || n9 * n7 > 0) {
            if (n4 < n5) {
                n4 += n2;
                c += n6;
                n8 = c3 - c;
            }
            else {
                n5 += n3;
                c2 += n7;
                n9 = c4 - c2;
            }
            if (!this.a(c, (int)\u2603.b, c2, \u2603, \u2603, \u2603, \u2603, \u26032, \u26033)) {
                return false;
            }
        }
        return true;
    }
    
    private boolean a(final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final aui \u2603, final double \u2603, final double \u2603) {
        final int \u26032 = \u2603 - \u2603 / 2;
        final int \u26033 = \u2603 - \u2603 / 2;
        if (!this.b(\u26032, \u2603, \u26033, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603)) {
            return false;
        }
        for (int i = \u26032; i < \u26032 + \u2603; ++i) {
            for (int j = \u26033; j < \u26033 + \u2603; ++j) {
                final double n = i + 0.5 - \u2603.a;
                final double n2 = j + 0.5 - \u2603.c;
                if (n * \u2603 + n2 * \u2603 >= 0.0) {
                    final afh c = this.c.p(new cj(i, \u2603 - 1, j)).c();
                    final arm t = c.t();
                    if (t == arm.a) {
                        return false;
                    }
                    if (t == arm.h && !this.b.V()) {
                        return false;
                    }
                    if (t == arm.i) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
    
    private boolean b(final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final aui \u2603, final double \u2603, final double \u2603) {
        for (final cj cj : cj.a(new cj(\u2603, \u2603, \u2603), new cj(\u2603 + \u2603 - 1, \u2603 + \u2603 - 1, \u2603 + \u2603 - 1))) {
            final double n = cj.n() + 0.5 - \u2603.a;
            final double n2 = cj.p() + 0.5 - \u2603.c;
            if (n * \u2603 + n2 * \u2603 < 0.0) {
                continue;
            }
            final afh c = this.c.p(cj).c();
            if (!c.b((adq)this.c, cj)) {
                return false;
            }
        }
        return true;
    }
    
    public void a(final boolean \u2603) {
        this.a.c(\u2603);
    }
    
    public boolean e() {
        return this.a.e();
    }
    
    public void b(final boolean \u2603) {
        this.a.b(\u2603);
    }
    
    public void c(final boolean \u2603) {
        this.a.a(\u2603);
    }
    
    public boolean g() {
        return this.a.b();
    }
    
    public void d(final boolean \u2603) {
        this.a.d(\u2603);
    }
    
    public boolean h() {
        return this.a.d();
    }
    
    public void e(final boolean \u2603) {
        this.f = \u2603;
    }
}
