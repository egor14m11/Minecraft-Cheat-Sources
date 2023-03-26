import java.util.Iterator;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class aax extends zw
{
    public aax() {
        this.a(true);
        this.a(yz.f);
    }
    
    @Override
    public String a(final zx \u2603) {
        String str = ("" + di.a(this.a() + ".name")).trim();
        final String b = pm.b(\u2603.i());
        if (b != null) {
            str = str + " " + di.a("entity." + b + ".name");
        }
        return str;
    }
    
    @Override
    public int a(final zx \u2603, final int \u2603) {
        final pm.a a = pm.a.get(\u2603.i());
        if (a == null) {
            return 16777215;
        }
        if (\u2603 == 0) {
            return a.b;
        }
        return a.c;
    }
    
    @Override
    public boolean a(final zx \u2603, final wn \u2603, final adm \u2603, cj \u2603, final cq \u2603, final float \u2603, final float \u2603, final float \u2603) {
        if (\u2603.D) {
            return true;
        }
        if (!\u2603.a(\u2603.a(\u2603), \u2603, \u2603)) {
            return false;
        }
        final alz p = \u2603.p(\u2603);
        if (p.c() == afi.ac) {
            final akw s = \u2603.s(\u2603);
            if (s instanceof all) {
                final add b = ((all)s).b();
                b.a(pm.b(\u2603.i()));
                s.p_();
                \u2603.h(\u2603);
                if (!\u2603.bA.d) {
                    --\u2603.b;
                }
                return true;
            }
        }
        \u2603 = \u2603.a(\u2603);
        double n = 0.0;
        if (\u2603 == cq.b && p instanceof agt) {
            n = 0.5;
        }
        final pk a = a(\u2603, \u2603.i(), \u2603.n() + 0.5, \u2603.o() + n, \u2603.p() + 0.5);
        if (a != null) {
            if (a instanceof pr && \u2603.s()) {
                a.a(\u2603.q());
            }
            if (!\u2603.bA.d) {
                --\u2603.b;
            }
        }
        return true;
    }
    
    @Override
    public zx a(final zx \u2603, final adm \u2603, final wn \u2603) {
        if (\u2603.D) {
            return \u2603;
        }
        final auh a = this.a(\u2603, \u2603, true);
        if (a == null) {
            return \u2603;
        }
        if (a.a == auh.a.b) {
            final cj a2 = a.a();
            if (!\u2603.a(\u2603, a2)) {
                return \u2603;
            }
            if (!\u2603.a(a2, a.b, \u2603)) {
                return \u2603;
            }
            if (\u2603.p(a2).c() instanceof ahv) {
                final pk a3 = a(\u2603, \u2603.i(), a2.n() + 0.5, a2.o() + 0.5, a2.p() + 0.5);
                if (a3 != null) {
                    if (a3 instanceof pr && \u2603.s()) {
                        ((ps)a3).a(\u2603.q());
                    }
                    if (!\u2603.bA.d) {
                        --\u2603.b;
                    }
                    \u2603.b(na.ad[zw.b(this)]);
                }
            }
        }
        return \u2603;
    }
    
    public static pk a(final adm \u2603, final int \u2603, final double \u2603, final double \u2603, final double \u2603) {
        if (!pm.a.containsKey(\u2603)) {
            return null;
        }
        pk a = null;
        for (int i = 0; i < 1; ++i) {
            a = pm.a(\u2603, \u2603);
            if (a instanceof pr) {
                final ps \u26032 = (ps)a;
                a.b(\u2603, \u2603, \u2603, ns.g(\u2603.s.nextFloat() * 360.0f), 0.0f);
                \u26032.aK = \u26032.y;
                \u26032.aI = \u26032.y;
                \u26032.a(\u2603.E(new cj(\u26032)), null);
                \u2603.d(a);
                \u26032.x();
            }
        }
        return a;
    }
    
    @Override
    public void a(final zw \u2603, final yz \u2603, final List<zx> \u2603) {
        for (final pm.a a : pm.a.values()) {
            \u2603.add(new zx(\u2603, 1, a.a));
        }
    }
}
