import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public class apf extends apg
{
    private static final alz e;
    private static final alz f;
    private static final alz g;
    private boolean h;
    
    public apf(final boolean \u2603, final boolean \u2603) {
        super(\u2603, 13, 15, apf.e, apf.f);
        this.h = \u2603;
    }
    
    @Override
    public boolean b(final adm \u2603, final Random \u2603, final cj \u2603) {
        final int a = this.a(\u2603);
        if (!this.a(\u2603, \u2603, \u2603, a)) {
            return false;
        }
        this.a(\u2603, \u2603.n(), \u2603.p(), \u2603.o() + a, 0, \u2603);
        for (int i = 0; i < a; ++i) {
            afh afh = \u2603.p(\u2603.b(i)).c();
            if (afh.t() == arm.a || afh.t() == arm.j) {
                this.a(\u2603, \u2603.b(i), this.b);
            }
            if (i < a - 1) {
                afh = \u2603.p(\u2603.a(1, i, 0)).c();
                if (afh.t() == arm.a || afh.t() == arm.j) {
                    this.a(\u2603, \u2603.a(1, i, 0), this.b);
                }
                afh = \u2603.p(\u2603.a(1, i, 1)).c();
                if (afh.t() == arm.a || afh.t() == arm.j) {
                    this.a(\u2603, \u2603.a(1, i, 1), this.b);
                }
                afh = \u2603.p(\u2603.a(0, i, 1)).c();
                if (afh.t() == arm.a || afh.t() == arm.j) {
                    this.a(\u2603, \u2603.a(0, i, 1), this.b);
                }
            }
        }
        return true;
    }
    
    private void a(final adm \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final Random \u2603) {
        final int n = \u2603.nextInt(5) + (this.h ? this.a : 3);
        int n2 = 0;
        for (int i = \u2603 - n; i <= \u2603; ++i) {
            final int n3 = \u2603 - i;
            final int n4 = \u2603 + ns.d(n3 / (float)n * 3.5f);
            this.a(\u2603, new cj(\u2603, i, \u2603), n4 + ((n3 > 0 && n4 == n2 && (i & 0x1) == 0x0) ? 1 : 0));
            n2 = n4;
        }
    }
    
    @Override
    public void a(final adm \u2603, final Random \u2603, final cj \u2603) {
        this.b(\u2603, \u2603.e().c());
        this.b(\u2603, \u2603.g(2).c());
        this.b(\u2603, \u2603.e().e(2));
        this.b(\u2603, \u2603.g(2).e(2));
        for (int i = 0; i < 5; ++i) {
            final int nextInt = \u2603.nextInt(64);
            final int n = nextInt % 8;
            final int n2 = nextInt / 8;
            if (n == 0 || n == 7 || n2 == 0 || n2 == 7) {
                this.b(\u2603, \u2603.a(-3 + n, 0, -3 + n2));
            }
        }
    }
    
    private void b(final adm \u2603, final cj \u2603) {
        for (int i = -2; i <= 2; ++i) {
            for (int j = -2; j <= 2; ++j) {
                if (Math.abs(i) != 2 || Math.abs(j) != 2) {
                    this.c(\u2603, \u2603.a(i, 0, j));
                }
            }
        }
    }
    
    private void c(final adm \u2603, final cj \u2603) {
        for (int i = 2; i >= -3; --i) {
            final cj b = \u2603.b(i);
            final afh c = \u2603.p(b).c();
            if (c == afi.c || c == afi.d) {
                this.a(\u2603, b, apf.g);
                break;
            }
            if (c.t() != arm.a && i < 0) {
                break;
            }
        }
    }
    
    static {
        e = afi.r.Q().a(ail.b, aio.a.b);
        f = afi.t.Q().a(aik.Q, aio.a.b).a((amo<Comparable>)ahs.b, false);
        g = afi.d.Q().a(agf.a, agf.a.c);
    }
}
