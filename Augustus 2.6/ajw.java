import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public class ajw extends ahv
{
    protected ajw(final arm \u2603) {
        super(\u2603);
        this.a(false);
        if (\u2603 == arm.i) {
            this.a(true);
        }
    }
    
    @Override
    public void a(final adm \u2603, final cj \u2603, final alz \u2603, final afh \u2603) {
        if (!this.e(\u2603, \u2603, \u2603)) {
            this.f(\u2603, \u2603, \u2603);
        }
    }
    
    private void f(final adm \u2603, final cj \u2603, final alz \u2603) {
        final agl a = ahv.a(this.J);
        \u2603.a(\u2603, a.Q().a((amo<Comparable>)ajw.b, (Comparable)\u2603.b((amo<V>)ajw.b)), 2);
        \u2603.a(\u2603, a, this.a(\u2603));
    }
    
    @Override
    public void b(final adm \u2603, final cj \u2603, final alz \u2603, final Random \u2603) {
        if (this.J != arm.i) {
            return;
        }
        if (!\u2603.Q().b("doFireTick")) {
            return;
        }
        final int nextInt = \u2603.nextInt(3);
        if (nextInt > 0) {
            cj a = \u2603;
            for (int i = 0; i < nextInt; ++i) {
                a = a.a(\u2603.nextInt(3) - 1, 1, \u2603.nextInt(3) - 1);
                final afh c = \u2603.p(a).c();
                if (c.J == arm.a) {
                    if (this.f(\u2603, a)) {
                        \u2603.a(a, afi.ab.Q());
                        return;
                    }
                }
                else if (c.J.c()) {
                    return;
                }
            }
        }
        else {
            for (int j = 0; j < 3; ++j) {
                final cj a2 = \u2603.a(\u2603.nextInt(3) - 1, 0, \u2603.nextInt(3) - 1);
                if (\u2603.d(a2.a()) && this.m(\u2603, a2)) {
                    \u2603.a(a2.a(), afi.ab.Q());
                }
            }
        }
    }
    
    protected boolean f(final adm \u2603, final cj \u2603) {
        for (final cq \u26032 : cq.values()) {
            if (this.m(\u2603, \u2603.a(\u26032))) {
                return true;
            }
        }
        return false;
    }
    
    private boolean m(final adm \u2603, final cj \u2603) {
        return \u2603.p(\u2603).c().t().h();
    }
}
