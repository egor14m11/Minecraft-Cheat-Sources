import java.util.Random;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class aol extends aot
{
    private final List<ob> a;
    private final int b;
    
    public aol(final List<ob> \u2603, final int \u2603) {
        this.a = \u2603;
        this.b = \u2603;
    }
    
    @Override
    public boolean b(final adm \u2603, final Random \u2603, cj \u2603) {
        afh c;
        while (((c = \u2603.p(\u2603).c()).t() == arm.a || c.t() == arm.j) && \u2603.o() > 1) {
            \u2603 = \u2603.b();
        }
        if (\u2603.o() < 1) {
            return false;
        }
        \u2603 = \u2603.a();
        for (int i = 0; i < 4; ++i) {
            final cj a = \u2603.a(\u2603.nextInt(4) - \u2603.nextInt(4), \u2603.nextInt(3) - \u2603.nextInt(3), \u2603.nextInt(4) - \u2603.nextInt(4));
            if (\u2603.d(a) && adm.a(\u2603, a.b())) {
                \u2603.a(a, afi.ae.Q(), 2);
                final akw s = \u2603.s(a);
                if (s instanceof aky) {
                    ob.a(\u2603, this.a, (og)s, this.b);
                }
                final cj f = a.f();
                final cj e = a.e();
                final cj c2 = a.c();
                final cj d = a.d();
                if (\u2603.d(e) && adm.a(\u2603, e.b())) {
                    \u2603.a(e, afi.aa.Q(), 2);
                }
                if (\u2603.d(f) && adm.a(\u2603, f.b())) {
                    \u2603.a(f, afi.aa.Q(), 2);
                }
                if (\u2603.d(c2) && adm.a(\u2603, c2.b())) {
                    \u2603.a(c2, afi.aa.Q(), 2);
                }
                if (\u2603.d(d) && adm.a(\u2603, d.b())) {
                    \u2603.a(d, afi.aa.Q(), 2);
                }
                return true;
            }
        }
        return false;
    }
}
