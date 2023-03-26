import java.util.Random;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class yk extends zw
{
    public yk() {
        this.a(yz.c);
    }
    
    @Override
    public boolean a(final zx \u2603, final wn \u2603, final adm \u2603, final cj \u2603, final cq \u2603, final float \u2603, final float \u2603, final float \u2603) {
        if (\u2603 == cq.a) {
            return false;
        }
        final boolean a = \u2603.p(\u2603).c().a(\u2603, \u2603);
        final cj \u26032 = a ? \u2603 : \u2603.a(\u2603);
        if (!\u2603.a(\u26032, \u2603, \u2603)) {
            return false;
        }
        final cj a2 = \u26032.a();
        boolean b = !\u2603.d(\u26032) && !\u2603.p(\u26032).c().a(\u2603, \u26032);
        b |= (!\u2603.d(a2) && !\u2603.p(a2).c().a(\u2603, a2));
        if (b) {
            return false;
        }
        final double \u26033 = \u26032.n();
        final double \u26034 = \u26032.o();
        final double \u26035 = \u26032.p();
        final List<pk> b2 = \u2603.b(null, aug.a(\u26033, \u26034, \u26035, \u26033 + 1.0, \u26034 + 2.0, \u26035 + 1.0));
        if (b2.size() > 0) {
            return false;
        }
        if (!\u2603.D) {
            \u2603.g(\u26032);
            \u2603.g(a2);
            final um um = new um(\u2603, \u26033 + 0.5, \u26034, \u26035 + 0.5);
            final float \u26036 = ns.d((ns.g(\u2603.y - 180.0f) + 22.5f) / 45.0f) * 45.0f;
            um.b(\u26033 + 0.5, \u26034, \u26035 + 0.5, \u26036, 0.0f);
            this.a(um, \u2603.s);
            final dn o = \u2603.o();
            if (o != null && o.b("EntityTag", 10)) {
                final dn dn = new dn();
                um.d(dn);
                dn.a(o.m("EntityTag"));
                um.f(dn);
            }
            \u2603.d(um);
        }
        --\u2603.b;
        return true;
    }
    
    private void a(final um \u2603, final Random \u2603) {
        dc dc = \u2603.t();
        float n = \u2603.nextFloat() * 5.0f;
        final float n2 = \u2603.nextFloat() * 20.0f - 10.0f;
        dc dc2 = new dc(dc.b() + n, dc.c() + n2, dc.d());
        \u2603.a(dc2);
        dc = \u2603.u();
        n = \u2603.nextFloat() * 10.0f - 5.0f;
        dc2 = new dc(dc.b(), dc.c() + n, dc.d());
        \u2603.b(dc2);
    }
}
