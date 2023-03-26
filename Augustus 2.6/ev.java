import java.util.Iterator;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class ev
{
    public static eu a(final m \u2603, final eu \u2603, final pk \u2603) throws bz {
        eu b = null;
        if (\u2603 instanceof ex) {
            final ex ex = (ex)\u2603;
            String \u26032 = ex.g();
            if (o.b(\u26032)) {
                final List<pk> b2 = o.b(\u2603, \u26032, (Class<? extends pk>)pk.class);
                if (b2.size() != 1) {
                    throw new ca();
                }
                \u26032 = b2.get(0).e_();
            }
            b = ((\u2603 != null && \u26032.equals("*")) ? new ex(\u2603.e_(), ex.h()) : new ex(\u26032, ex.h()));
            ((ex)b).b(ex.e());
        }
        else if (\u2603 instanceof ey) {
            final String g = ((ey)\u2603).g();
            b = o.b(\u2603, g);
            if (b == null) {
                b = new fa("");
            }
        }
        else if (\u2603 instanceof fa) {
            b = new fa(((fa)\u2603).g());
        }
        else {
            if (!(\u2603 instanceof fb)) {
                return \u2603;
            }
            final Object[] j = ((fb)\u2603).j();
            for (int i = 0; i < j.length; ++i) {
                final Object o = j[i];
                if (o instanceof eu) {
                    j[i] = a(\u2603, (eu)o, \u2603);
                }
            }
            b = new fb(((fb)\u2603).i(), j);
        }
        final ez b3 = \u2603.b();
        if (b3 != null) {
            b.a(b3.m());
        }
        for (final eu \u26033 : \u2603.a()) {
            b.a(a(\u2603, \u26033, \u2603));
        }
        return b;
    }
}
