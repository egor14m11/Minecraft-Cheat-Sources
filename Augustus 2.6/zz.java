import java.util.Iterator;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class zz extends zw
{
    public zz() {
        this.a(yz.i);
    }
    
    @Override
    public boolean a(final zx \u2603, final wn \u2603, final adm \u2603, final cj \u2603, final cq \u2603, final float \u2603, final float \u2603, final float \u2603) {
        final afh c = \u2603.p(\u2603).c();
        if (!(c instanceof agt)) {
            return false;
        }
        if (\u2603.D) {
            return true;
        }
        a(\u2603, \u2603, \u2603);
        return true;
    }
    
    public static boolean a(final wn \u2603, final adm \u2603, final cj \u2603) {
        up \u26032 = up.b(\u2603, \u2603);
        boolean b = false;
        final double n = 7.0;
        final int n2 = \u2603.n();
        final int o = \u2603.o();
        final int p = \u2603.p();
        final List<ps> a = \u2603.a((Class<? extends ps>)ps.class, new aug(n2 - n, o - n, p - n, n2 + n, o + n, p + n));
        for (final ps ps : a) {
            if (ps.cc() && ps.cd() == \u2603) {
                if (\u26032 == null) {
                    \u26032 = up.a(\u2603, \u2603);
                }
                ps.a(\u26032, true);
                b = true;
            }
        }
        return b;
    }
}
