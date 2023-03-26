import java.util.Iterator;
import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public abstract class ahv extends afh
{
    public static final amn b;
    
    protected ahv(final arm \u2603) {
        super(\u2603);
        this.j(this.M.b().a((amo<Comparable>)ahv.b, 0));
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
        this.a(true);
    }
    
    @Override
    public boolean b(final adq \u2603, final cj \u2603) {
        return this.J != arm.i;
    }
    
    @Override
    public int a(final adq \u2603, final cj \u2603, final int \u2603) {
        if (this.J == arm.h) {
            return aea.c(\u2603, \u2603);
        }
        return 16777215;
    }
    
    public static float b(int \u2603) {
        if (\u2603 >= 8) {
            \u2603 = 0;
        }
        return (\u2603 + 1) / 9.0f;
    }
    
    protected int e(final adq \u2603, final cj \u2603) {
        if (\u2603.p(\u2603).c().t() == this.J) {
            return \u2603.p(\u2603).b((amo<Integer>)ahv.b);
        }
        return -1;
    }
    
    protected int f(final adq \u2603, final cj \u2603) {
        final int e = this.e(\u2603, \u2603);
        return (e >= 8) ? 0 : e;
    }
    
    @Override
    public boolean d() {
        return false;
    }
    
    @Override
    public boolean c() {
        return false;
    }
    
    @Override
    public boolean a(final alz \u2603, final boolean \u2603) {
        return \u2603 && \u2603.b((amo<Integer>)ahv.b) == 0;
    }
    
    @Override
    public boolean b(final adq \u2603, final cj \u2603, final cq \u2603) {
        final arm t = \u2603.p(\u2603).c().t();
        return t != this.J && (\u2603 == cq.b || (t != arm.w && super.b(\u2603, \u2603, \u2603)));
    }
    
    @Override
    public boolean a(final adq \u2603, final cj \u2603, final cq \u2603) {
        return \u2603.p(\u2603).c().t() != this.J && (\u2603 == cq.b || super.a(\u2603, \u2603, \u2603));
    }
    
    public boolean g(final adq \u2603, final cj \u2603) {
        for (int i = -1; i <= 1; ++i) {
            for (int j = -1; j <= 1; ++j) {
                final alz p = \u2603.p(\u2603.a(i, 0, j));
                final afh c = p.c();
                final arm t = c.t();
                if (t != this.J && !c.o()) {
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public aug a(final adm \u2603, final cj \u2603, final alz \u2603) {
        return null;
    }
    
    @Override
    public int b() {
        return 1;
    }
    
    @Override
    public zw a(final alz \u2603, final Random \u2603, final int \u2603) {
        return null;
    }
    
    @Override
    public int a(final Random \u2603) {
        return 0;
    }
    
    protected aui h(final adq \u2603, final cj \u2603) {
        aui aui = new aui(0.0, 0.0, 0.0);
        final int f = this.f(\u2603, \u2603);
        for (final cq cq : cq.c.a) {
            final cj cj = \u2603.a(cq);
            int n = this.f(\u2603, cj);
            if (n < 0) {
                if (\u2603.p(cj).c().t().c()) {
                    continue;
                }
                n = this.f(\u2603, cj.b());
                if (n < 0) {
                    continue;
                }
                final int n2 = n - (f - 8);
                aui = aui.b((cj.n() - \u2603.n()) * n2, (cj.o() - \u2603.o()) * n2, (cj.p() - \u2603.p()) * n2);
            }
            else {
                if (n < 0) {
                    continue;
                }
                final int n2 = n - f;
                aui = aui.b((cj.n() - \u2603.n()) * n2, (cj.o() - \u2603.o()) * n2, (cj.p() - \u2603.p()) * n2);
            }
        }
        if (\u2603.p(\u2603).b((amo<Integer>)ahv.b) >= 8) {
            for (final cq cq : cq.c.a) {
                final cj cj = \u2603.a(cq);
                if (this.b(\u2603, cj, cq) || this.b(\u2603, cj.a(), cq)) {
                    aui = aui.a().b(0.0, -6.0, 0.0);
                    break;
                }
            }
        }
        return aui.a();
    }
    
    @Override
    public aui a(final adm \u2603, final cj \u2603, final pk \u2603, final aui \u2603) {
        return \u2603.e(this.h(\u2603, \u2603));
    }
    
    @Override
    public int a(final adm \u2603) {
        if (this.J == arm.h) {
            return 5;
        }
        if (this.J == arm.i) {
            return \u2603.t.o() ? 10 : 30;
        }
        return 0;
    }
    
    @Override
    public int c(final adq \u2603, final cj \u2603) {
        final int b = \u2603.b(\u2603, 0);
        final int b2 = \u2603.b(\u2603.a(), 0);
        final int n = b & 0xFF;
        final int n2 = b2 & 0xFF;
        final int n3 = b >> 16 & 0xFF;
        final int n4 = b2 >> 16 & 0xFF;
        return ((n > n2) ? n : n2) | ((n3 > n4) ? n3 : n4) << 16;
    }
    
    @Override
    public adf m() {
        return (this.J == arm.h) ? adf.d : adf.a;
    }
    
    @Override
    public void c(final adm \u2603, final cj \u2603, final alz \u2603, final Random \u2603) {
        final double \u26032 = \u2603.n();
        final double \u26033 = \u2603.o();
        final double \u26034 = \u2603.p();
        if (this.J == arm.h) {
            final int intValue = \u2603.b((amo<Integer>)ahv.b);
            if (intValue > 0 && intValue < 8) {
                if (\u2603.nextInt(64) == 0) {
                    \u2603.a(\u26032 + 0.5, \u26033 + 0.5, \u26034 + 0.5, "liquid.water", \u2603.nextFloat() * 0.25f + 0.75f, \u2603.nextFloat() * 1.0f + 0.5f, false);
                }
            }
            else if (\u2603.nextInt(10) == 0) {
                \u2603.a(cy.h, \u26032 + \u2603.nextFloat(), \u26033 + \u2603.nextFloat(), \u26034 + \u2603.nextFloat(), 0.0, 0.0, 0.0, new int[0]);
            }
        }
        if (this.J == arm.i && \u2603.p(\u2603.a()).c().t() == arm.a && !\u2603.p(\u2603.a()).c().c()) {
            if (\u2603.nextInt(100) == 0) {
                final double n = \u26032 + \u2603.nextFloat();
                final double n2 = \u26033 + this.F;
                final double n3 = \u26034 + \u2603.nextFloat();
                \u2603.a(cy.B, n, n2, n3, 0.0, 0.0, 0.0, new int[0]);
                \u2603.a(n, n2, n3, "liquid.lavapop", 0.2f + \u2603.nextFloat() * 0.2f, 0.9f + \u2603.nextFloat() * 0.15f, false);
            }
            if (\u2603.nextInt(200) == 0) {
                \u2603.a(\u26032, \u26033, \u26034, "liquid.lava", 0.2f + \u2603.nextFloat() * 0.2f, 0.9f + \u2603.nextFloat() * 0.15f, false);
            }
        }
        if (\u2603.nextInt(10) == 0 && adm.a(\u2603, \u2603.b())) {
            final arm t = \u2603.p(\u2603.c(2)).c().t();
            if (!t.c() && !t.d()) {
                final double n4 = \u26032 + \u2603.nextFloat();
                final double n5 = \u26033 - 1.05;
                final double n6 = \u26034 + \u2603.nextFloat();
                if (this.J == arm.h) {
                    \u2603.a(cy.s, n4, n5, n6, 0.0, 0.0, 0.0, new int[0]);
                }
                else {
                    \u2603.a(cy.t, n4, n5, n6, 0.0, 0.0, 0.0, new int[0]);
                }
            }
        }
    }
    
    public static double a(final adq \u2603, final cj \u2603, final arm \u2603) {
        final aui h = a(\u2603).h(\u2603, \u2603);
        if (h.a == 0.0 && h.c == 0.0) {
            return -1000.0;
        }
        return ns.b(h.c, h.a) - 1.5707963267948966;
    }
    
    @Override
    public void c(final adm \u2603, final cj \u2603, final alz \u2603) {
        this.e(\u2603, \u2603, \u2603);
    }
    
    @Override
    public void a(final adm \u2603, final cj \u2603, final alz \u2603, final afh \u2603) {
        this.e(\u2603, \u2603, \u2603);
    }
    
    public boolean e(final adm \u2603, final cj \u2603, final alz \u2603) {
        if (this.J == arm.i) {
            boolean b = false;
            for (final cq \u26032 : cq.values()) {
                if (\u26032 != cq.a && \u2603.p(\u2603.a(\u26032)).c().t() == arm.h) {
                    b = true;
                    break;
                }
            }
            if (b) {
                final Integer n = \u2603.b((amo<Integer>)ahv.b);
                if (n == 0) {
                    \u2603.a(\u2603, afi.Z.Q());
                    this.e(\u2603, \u2603);
                    return true;
                }
                if (n <= 4) {
                    \u2603.a(\u2603, afi.e.Q());
                    this.e(\u2603, \u2603);
                    return true;
                }
            }
        }
        return false;
    }
    
    protected void e(final adm \u2603, final cj \u2603) {
        final double n = \u2603.n();
        final double n2 = \u2603.o();
        final double n3 = \u2603.p();
        \u2603.a(n + 0.5, n2 + 0.5, n3 + 0.5, "random.fizz", 0.5f, 2.6f + (\u2603.s.nextFloat() - \u2603.s.nextFloat()) * 0.8f);
        for (int i = 0; i < 8; ++i) {
            \u2603.a(cy.m, n + Math.random(), n2 + 1.2, n3 + Math.random(), 0.0, 0.0, 0.0, new int[0]);
        }
    }
    
    @Override
    public alz a(final int \u2603) {
        return this.Q().a((amo<Comparable>)ahv.b, \u2603);
    }
    
    @Override
    public int c(final alz \u2603) {
        return \u2603.b((amo<Integer>)ahv.b);
    }
    
    @Override
    protected ama e() {
        return new ama(this, new amo[] { ahv.b });
    }
    
    public static agl a(final arm \u2603) {
        if (\u2603 == arm.h) {
            return afi.i;
        }
        if (\u2603 == arm.i) {
            return afi.k;
        }
        throw new IllegalArgumentException("Invalid material");
    }
    
    public static ajw b(final arm \u2603) {
        if (\u2603 == arm.h) {
            return afi.j;
        }
        if (\u2603 == arm.i) {
            return afi.l;
        }
        throw new IllegalArgumentException("Invalid material");
    }
    
    static {
        b = amn.a("level", 0, 15);
    }
}
