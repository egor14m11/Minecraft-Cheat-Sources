// 
// Decompiled by Procyon v0.5.36
// 

public class yv extends zw
{
    private afh a;
    
    public yv(final afh \u2603) {
        this.h = 1;
        this.a = \u2603;
        this.a(yz.f);
    }
    
    @Override
    public zx a(final zx \u2603, final adm \u2603, final wn \u2603) {
        final boolean \u26032 = this.a == afi.a;
        final auh a = this.a(\u2603, \u2603, \u26032);
        if (a == null) {
            return \u2603;
        }
        if (a.a == auh.a.b) {
            final cj a2 = a.a();
            if (!\u2603.a(\u2603, a2)) {
                return \u2603;
            }
            if (\u26032) {
                if (!\u2603.a(a2.a(a.b), a.b, \u2603)) {
                    return \u2603;
                }
                final alz p = \u2603.p(a2);
                final arm t = p.c().t();
                if (t == arm.h && p.b((amo<Integer>)ahv.b) == 0) {
                    \u2603.g(a2);
                    \u2603.b(na.ad[zw.b(this)]);
                    return this.a(\u2603, \u2603, zy.ax);
                }
                if (t == arm.i && p.b((amo<Integer>)ahv.b) == 0) {
                    \u2603.g(a2);
                    \u2603.b(na.ad[zw.b(this)]);
                    return this.a(\u2603, \u2603, zy.ay);
                }
            }
            else {
                if (this.a == afi.a) {
                    return new zx(zy.aw);
                }
                final cj a3 = a2.a(a.b);
                if (!\u2603.a(a3, a.b, \u2603)) {
                    return \u2603;
                }
                if (this.a(\u2603, a3) && !\u2603.bA.d) {
                    \u2603.b(na.ad[zw.b(this)]);
                    return new zx(zy.aw);
                }
            }
        }
        return \u2603;
    }
    
    private zx a(final zx \u2603, final wn \u2603, final zw \u2603) {
        if (\u2603.bA.d) {
            return \u2603;
        }
        if (--\u2603.b <= 0) {
            return new zx(\u2603);
        }
        if (!\u2603.bi.a(new zx(\u2603))) {
            \u2603.a(new zx(\u2603, 1, 0), false);
        }
        return \u2603;
    }
    
    public boolean a(final adm \u2603, final cj \u2603) {
        if (this.a == afi.a) {
            return false;
        }
        final arm t = \u2603.p(\u2603).c().t();
        final boolean b = !t.a();
        if (\u2603.d(\u2603) || b) {
            if (\u2603.t.n() && this.a == afi.i) {
                final int n = \u2603.n();
                final int o = \u2603.o();
                final int p = \u2603.p();
                \u2603.a(n + 0.5f, o + 0.5f, p + 0.5f, "random.fizz", 0.5f, 2.6f + (\u2603.s.nextFloat() - \u2603.s.nextFloat()) * 0.8f);
                for (int i = 0; i < 8; ++i) {
                    \u2603.a(cy.m, n + Math.random(), o + Math.random(), p + Math.random(), 0.0, 0.0, 0.0, new int[0]);
                }
            }
            else {
                if (!\u2603.D && b && !t.d()) {
                    \u2603.b(\u2603, true);
                }
                \u2603.a(\u2603, this.a.Q(), 3);
            }
            return true;
        }
        return false;
    }
}
