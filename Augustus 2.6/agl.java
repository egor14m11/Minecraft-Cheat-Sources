import java.util.EnumSet;
import java.util.Set;
import java.util.Iterator;
import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public class agl extends ahv
{
    int a;
    
    protected agl(final arm \u2603) {
        super(\u2603);
    }
    
    private void f(final adm \u2603, final cj \u2603, final alz \u2603) {
        \u2603.a(\u2603, ahv.b(this.J).Q().a((amo<Comparable>)agl.b, (Comparable)\u2603.b((amo<V>)agl.b)), 2);
    }
    
    @Override
    public void b(final adm \u2603, final cj \u2603, alz \u2603, final Random \u2603) {
        int intValue = \u2603.b((amo<Integer>)agl.b);
        int n = 1;
        if (this.J == arm.i && !\u2603.t.n()) {
            n = 2;
        }
        int a = this.a(\u2603);
        if (intValue > 0) {
            int a2 = -100;
            this.a = 0;
            for (final cq \u26032 : cq.c.a) {
                a2 = this.a(\u2603, \u2603.a(\u26032), a2);
            }
            int n2 = a2 + n;
            if (n2 >= 8 || a2 < 0) {
                n2 = -1;
            }
            if (this.e((adq)\u2603, \u2603.a()) >= 0) {
                final int e = this.e((adq)\u2603, \u2603.a());
                if (e >= 8) {
                    n2 = e;
                }
                else {
                    n2 = e + 8;
                }
            }
            if (this.a >= 2 && this.J == arm.h) {
                final alz p = \u2603.p(\u2603.b());
                if (p.c().t().a()) {
                    n2 = 0;
                }
                else if (p.c().t() == this.J && p.b((amo<Integer>)agl.b) == 0) {
                    n2 = 0;
                }
            }
            if (this.J == arm.i && intValue < 8 && n2 < 8 && n2 > intValue && \u2603.nextInt(4) != 0) {
                a *= 4;
            }
            if (n2 == intValue) {
                this.f(\u2603, \u2603, \u2603);
            }
            else {
                intValue = n2;
                if (intValue < 0) {
                    \u2603.g(\u2603);
                }
                else {
                    \u2603 = \u2603.a((amo<Comparable>)agl.b, intValue);
                    \u2603.a(\u2603, \u2603, 2);
                    \u2603.a(\u2603, this, a);
                    \u2603.c(\u2603, this);
                }
            }
        }
        else {
            this.f(\u2603, \u2603, \u2603);
        }
        final alz p2 = \u2603.p(\u2603.b());
        if (this.h(\u2603, \u2603.b(), p2)) {
            if (this.J == arm.i && \u2603.p(\u2603.b()).c().t() == arm.h) {
                \u2603.a(\u2603.b(), afi.b.Q());
                this.e(\u2603, \u2603.b());
                return;
            }
            if (intValue >= 8) {
                this.a(\u2603, \u2603.b(), p2, intValue);
            }
            else {
                this.a(\u2603, \u2603.b(), p2, intValue + 8);
            }
        }
        else if (intValue >= 0 && (intValue == 0 || this.g(\u2603, \u2603.b(), p2))) {
            final Set<cq> f = this.f(\u2603, \u2603);
            int e = intValue + n;
            if (intValue >= 8) {
                e = 1;
            }
            if (e >= 8) {
                return;
            }
            for (final cq cq : f) {
                this.a(\u2603, \u2603.a(cq), \u2603.p(\u2603.a(cq)), e);
            }
        }
    }
    
    private void a(final adm \u2603, final cj \u2603, final alz \u2603, final int \u2603) {
        if (this.h(\u2603, \u2603, \u2603)) {
            if (\u2603.c() != afi.a) {
                if (this.J == arm.i) {
                    this.e(\u2603, \u2603);
                }
                else {
                    \u2603.c().b(\u2603, \u2603, \u2603, 0);
                }
            }
            \u2603.a(\u2603, this.Q().a((amo<Comparable>)agl.b, \u2603), 3);
        }
    }
    
    private int a(final adm \u2603, final cj \u2603, final int \u2603, final cq \u2603) {
        int n = 1000;
        for (final cq \u26032 : cq.c.a) {
            if (\u26032 == \u2603) {
                continue;
            }
            final cj a = \u2603.a(\u26032);
            final alz p = \u2603.p(a);
            if (this.g(\u2603, a, p) || (p.c().t() == this.J && p.b((amo<Integer>)agl.b) <= 0)) {
                continue;
            }
            if (!this.g(\u2603, a.b(), p)) {
                return \u2603;
            }
            if (\u2603 >= 4) {
                continue;
            }
            final int a2 = this.a(\u2603, a, \u2603 + 1, \u26032.d());
            if (a2 >= n) {
                continue;
            }
            n = a2;
        }
        return n;
    }
    
    private Set<cq> f(final adm \u2603, final cj \u2603) {
        int n = 1000;
        final Set<cq> none = EnumSet.noneOf(cq.class);
        for (final cq \u26032 : cq.c.a) {
            final cj a = \u2603.a(\u26032);
            final alz p = \u2603.p(a);
            if (!this.g(\u2603, a, p) && (p.c().t() != this.J || p.b((amo<Integer>)agl.b) > 0)) {
                int a2;
                if (this.g(\u2603, a.b(), \u2603.p(a.b()))) {
                    a2 = this.a(\u2603, a, 1, \u26032.d());
                }
                else {
                    a2 = 0;
                }
                if (a2 < n) {
                    none.clear();
                }
                if (a2 > n) {
                    continue;
                }
                none.add(\u26032);
                n = a2;
            }
        }
        return none;
    }
    
    private boolean g(final adm \u2603, final cj \u2603, final alz \u2603) {
        final afh c = \u2603.p(\u2603).c();
        return c instanceof agh || c == afi.an || c == afi.au || c == afi.aM || c.J == arm.E || c.J.c();
    }
    
    protected int a(final adm \u2603, final cj \u2603, final int \u2603) {
        int e = this.e((adq)\u2603, \u2603);
        if (e < 0) {
            return \u2603;
        }
        if (e == 0) {
            ++this.a;
        }
        if (e >= 8) {
            e = 0;
        }
        return (\u2603 < 0 || e < \u2603) ? e : \u2603;
    }
    
    private boolean h(final adm \u2603, final cj \u2603, final alz \u2603) {
        final arm t = \u2603.c().t();
        return t != this.J && t != arm.i && !this.g(\u2603, \u2603, \u2603);
    }
    
    @Override
    public void c(final adm \u2603, final cj \u2603, final alz \u2603) {
        if (!this.e(\u2603, \u2603, \u2603)) {
            \u2603.a(\u2603, this, this.a(\u2603));
        }
    }
}
