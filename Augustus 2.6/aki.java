import java.util.Iterator;
import java.util.List;
import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public class aki extends afh
{
    public static final amk a;
    public static final amk b;
    public static final amk N;
    public static final amk O;
    public static final amk P;
    public static final amk Q;
    public static final amk R;
    public static final amk S;
    
    public aki() {
        super(arm.q);
        this.j(this.M.b().a((amo<Comparable>)aki.a, false).a((amo<Comparable>)aki.b, false).a((amo<Comparable>)aki.N, false).a((amo<Comparable>)aki.O, false).a((amo<Comparable>)aki.P, false).a((amo<Comparable>)aki.Q, false).a((amo<Comparable>)aki.R, false).a((amo<Comparable>)aki.S, false));
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 0.15625f, 1.0f);
        this.a(true);
    }
    
    @Override
    public alz a(final alz \u2603, final adq \u2603, final cj \u2603) {
        return \u2603.a((amo<Comparable>)aki.P, c(\u2603, \u2603, \u2603, cq.c)).a((amo<Comparable>)aki.Q, c(\u2603, \u2603, \u2603, cq.f)).a((amo<Comparable>)aki.R, c(\u2603, \u2603, \u2603, cq.d)).a((amo<Comparable>)aki.S, c(\u2603, \u2603, \u2603, cq.e));
    }
    
    @Override
    public aug a(final adm \u2603, final cj \u2603, final alz \u2603) {
        return null;
    }
    
    @Override
    public boolean c() {
        return false;
    }
    
    @Override
    public boolean d() {
        return false;
    }
    
    @Override
    public adf m() {
        return adf.d;
    }
    
    @Override
    public zw a(final alz \u2603, final Random \u2603, final int \u2603) {
        return zy.F;
    }
    
    @Override
    public zw c(final adm \u2603, final cj \u2603) {
        return zy.F;
    }
    
    @Override
    public void a(final adm \u2603, final cj \u2603, final alz \u2603, final afh \u2603) {
        final boolean booleanValue = \u2603.b((amo<Boolean>)aki.b);
        final boolean b = !adm.a(\u2603, \u2603.b());
        if (booleanValue != b) {
            this.b(\u2603, \u2603, \u2603, 0);
            \u2603.g(\u2603);
        }
    }
    
    @Override
    public void a(final adq \u2603, final cj \u2603) {
        final alz p = \u2603.p(\u2603);
        final boolean booleanValue = p.b((amo<Boolean>)aki.N);
        final boolean booleanValue2 = p.b((amo<Boolean>)aki.b);
        if (!booleanValue2) {
            this.a(0.0f, 0.0f, 0.0f, 1.0f, 0.09375f, 1.0f);
        }
        else if (!booleanValue) {
            this.a(0.0f, 0.0f, 0.0f, 1.0f, 0.5f, 1.0f);
        }
        else {
            this.a(0.0f, 0.0625f, 0.0f, 1.0f, 0.15625f, 1.0f);
        }
    }
    
    @Override
    public void c(final adm \u2603, final cj \u2603, alz \u2603) {
        \u2603 = \u2603.a((amo<Comparable>)aki.b, !adm.a(\u2603, \u2603.b()));
        \u2603.a(\u2603, \u2603, 3);
        this.e(\u2603, \u2603, \u2603);
    }
    
    @Override
    public void b(final adm \u2603, final cj \u2603, final alz \u2603) {
        this.e(\u2603, \u2603, \u2603.a((amo<Comparable>)aki.a, true));
    }
    
    @Override
    public void a(final adm \u2603, final cj \u2603, final alz \u2603, final wn \u2603) {
        if (\u2603.D) {
            return;
        }
        if (\u2603.bZ() != null && \u2603.bZ().b() == zy.be) {
            \u2603.a(\u2603, \u2603.a((amo<Comparable>)aki.O, true), 4);
        }
    }
    
    private void e(final adm \u2603, final cj \u2603, final alz \u2603) {
        for (final cq \u26032 : new cq[] { cq.d, cq.e }) {
            int j = 1;
            while (j < 42) {
                final cj a = \u2603.a(\u26032, j);
                final alz p = \u2603.p(a);
                if (p.c() == afi.bR) {
                    if (p.b((amo<Comparable>)akj.a) == \u26032.d()) {
                        afi.bR.a(\u2603, a, p, false, true, j, \u2603);
                        break;
                    }
                    break;
                }
                else {
                    if (p.c() != afi.bS) {
                        break;
                    }
                    ++j;
                }
            }
        }
    }
    
    @Override
    public void a(final adm \u2603, final cj \u2603, final alz \u2603, final pk \u2603) {
        if (\u2603.D) {
            return;
        }
        if (\u2603.b((amo<Boolean>)aki.a)) {
            return;
        }
        this.e(\u2603, \u2603);
    }
    
    @Override
    public void a(final adm \u2603, final cj \u2603, final alz \u2603, final Random \u2603) {
    }
    
    @Override
    public void b(final adm \u2603, final cj \u2603, final alz \u2603, final Random \u2603) {
        if (\u2603.D) {
            return;
        }
        if (!\u2603.p(\u2603).b((amo<Boolean>)aki.a)) {
            return;
        }
        this.e(\u2603, \u2603);
    }
    
    private void e(final adm \u2603, final cj \u2603) {
        alz alz = \u2603.p(\u2603);
        final boolean booleanValue = alz.b((amo<Boolean>)aki.a);
        boolean b = false;
        final List<? extends pk> b2 = \u2603.b(null, new aug(\u2603.n() + this.B, \u2603.o() + this.C, \u2603.p() + this.D, \u2603.n() + this.E, \u2603.o() + this.F, \u2603.p() + this.G));
        if (!b2.isEmpty()) {
            for (final pk pk : b2) {
                if (!pk.aI()) {
                    b = true;
                    break;
                }
            }
        }
        if (b != booleanValue) {
            alz = alz.a((amo<Comparable>)aki.a, b);
            \u2603.a(\u2603, alz, 3);
            this.e(\u2603, \u2603, alz);
        }
        if (b) {
            \u2603.a(\u2603, this, this.a(\u2603));
        }
    }
    
    public static boolean c(final adq \u2603, final cj \u2603, final alz \u2603, final cq \u2603) {
        final cj a = \u2603.a(\u2603);
        final alz p = \u2603.p(a);
        final afh c = p.c();
        if (c == afi.bR) {
            final cq d = \u2603.d();
            return p.b((amo<Comparable>)akj.a) == d;
        }
        if (c == afi.bS) {
            final boolean booleanValue = \u2603.b((amo<Boolean>)aki.b);
            final boolean booleanValue2 = p.b((amo<Boolean>)aki.b);
            return booleanValue == booleanValue2;
        }
        return false;
    }
    
    @Override
    public alz a(final int \u2603) {
        return this.Q().a((amo<Comparable>)aki.a, (\u2603 & 0x1) > 0).a((amo<Comparable>)aki.b, (\u2603 & 0x2) > 0).a((amo<Comparable>)aki.N, (\u2603 & 0x4) > 0).a((amo<Comparable>)aki.O, (\u2603 & 0x8) > 0);
    }
    
    @Override
    public int c(final alz \u2603) {
        int n = 0;
        if (\u2603.b((amo<Boolean>)aki.a)) {
            n |= 0x1;
        }
        if (\u2603.b((amo<Boolean>)aki.b)) {
            n |= 0x2;
        }
        if (\u2603.b((amo<Boolean>)aki.N)) {
            n |= 0x4;
        }
        if (\u2603.b((amo<Boolean>)aki.O)) {
            n |= 0x8;
        }
        return n;
    }
    
    @Override
    protected ama e() {
        return new ama(this, new amo[] { aki.a, aki.b, aki.N, aki.O, aki.P, aki.Q, aki.S, aki.R });
    }
    
    static {
        a = amk.a("powered");
        b = amk.a("suspended");
        N = amk.a("attached");
        O = amk.a("disarmed");
        P = amk.a("north");
        Q = amk.a("east");
        R = amk.a("south");
        S = amk.a("west");
    }
}
