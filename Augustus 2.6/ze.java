import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class ze extends zw
{
    public static final int[] a;
    
    public ze() {
        this.a(true);
        this.d(0);
        this.a(yz.l);
    }
    
    @Override
    public String e_(final zx \u2603) {
        final int i = \u2603.i();
        return super.a() + "." + zd.a(i).d();
    }
    
    @Override
    public boolean a(final zx \u2603, final wn \u2603, final adm \u2603, cj \u2603, final cq \u2603, final float \u2603, final float \u2603, final float \u2603) {
        if (!\u2603.a(\u2603.a(\u2603), \u2603, \u2603)) {
            return false;
        }
        final zd a = zd.a(\u2603.i());
        if (a == zd.a) {
            if (a(\u2603, \u2603, \u2603)) {
                if (!\u2603.D) {
                    \u2603.b(2005, \u2603, 0);
                }
                return true;
            }
        }
        else if (a == zd.m) {
            final alz p = \u2603.p(\u2603);
            final afh c = p.c();
            if (c == afi.r && p.b(aio.a) == aio.a.d) {
                if (\u2603 == cq.a) {
                    return false;
                }
                if (\u2603 == cq.b) {
                    return false;
                }
                \u2603 = \u2603.a(\u2603);
                if (\u2603.d(\u2603)) {
                    final alz a2 = afi.bN.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, 0, \u2603);
                    \u2603.a(\u2603, a2, 2);
                    if (!\u2603.bA.d) {
                        --\u2603.b;
                    }
                }
                return true;
            }
        }
        return false;
    }
    
    public static boolean a(final zx \u2603, final adm \u2603, final cj \u2603) {
        final alz p = \u2603.p(\u2603);
        if (p.c() instanceof afj) {
            final afj afj = (afj)p.c();
            if (afj.a(\u2603, \u2603, p, \u2603.D)) {
                if (!\u2603.D) {
                    if (afj.a(\u2603, \u2603.s, \u2603, p)) {
                        afj.b(\u2603, \u2603.s, \u2603, p);
                    }
                    --\u2603.b;
                }
                return true;
            }
        }
        return false;
    }
    
    public static void a(final adm \u2603, final cj \u2603, int \u2603) {
        if (\u2603 == 0) {
            \u2603 = 15;
        }
        final afh c = \u2603.p(\u2603).c();
        if (c.t() == arm.a) {
            return;
        }
        c.a((adq)\u2603, \u2603);
        for (int i = 0; i < \u2603; ++i) {
            final double \u26032 = ze.g.nextGaussian() * 0.02;
            final double \u26033 = ze.g.nextGaussian() * 0.02;
            final double \u26034 = ze.g.nextGaussian() * 0.02;
            \u2603.a(cy.v, \u2603.n() + ze.g.nextFloat(), \u2603.o() + ze.g.nextFloat() * c.E(), \u2603.p() + ze.g.nextFloat(), \u26032, \u26033, \u26034, new int[0]);
        }
    }
    
    @Override
    public boolean a(final zx \u2603, final wn \u2603, final pr \u2603) {
        if (\u2603 instanceof tv) {
            final tv tv = (tv)\u2603;
            final zd a = zd.a(\u2603.i());
            if (!tv.cm() && tv.cl() != a) {
                tv.b(a);
                --\u2603.b;
            }
            return true;
        }
        return false;
    }
    
    @Override
    public void a(final zw \u2603, final yz \u2603, final List<zx> \u2603) {
        for (int i = 0; i < 16; ++i) {
            \u2603.add(new zx(\u2603, 1, i));
        }
    }
    
    static {
        a = new int[] { 1973019, 11743532, 3887386, 5320730, 2437522, 8073150, 2651799, 11250603, 4408131, 14188952, 4312372, 14602026, 6719955, 12801229, 15435844, 15790320 };
    }
}
