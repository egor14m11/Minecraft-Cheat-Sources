import java.util.Random;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.5.36
// 

public class akk extends afh
{
    public static final amk a;
    public static final amk b;
    public static final amk N;
    public static final amk O;
    public static final amk P;
    public static final amk[] Q;
    
    public akk() {
        super(arm.l);
        this.j(this.M.b().a((amo<Comparable>)akk.a, false).a((amo<Comparable>)akk.b, false).a((amo<Comparable>)akk.N, false).a((amo<Comparable>)akk.O, false).a((amo<Comparable>)akk.P, false));
        this.a(true);
        this.a(yz.c);
    }
    
    @Override
    public alz a(final alz \u2603, final adq \u2603, final cj \u2603) {
        return \u2603.a((amo<Comparable>)akk.a, \u2603.p(\u2603.a()).c().u());
    }
    
    @Override
    public void j() {
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
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
    public boolean a(final adm \u2603, final cj \u2603) {
        return true;
    }
    
    @Override
    public void a(final adq \u2603, final cj \u2603) {
        final float n = 0.0625f;
        float min = 1.0f;
        float min2 = 1.0f;
        float min3 = 1.0f;
        float max = 0.0f;
        float \u26032 = 0.0f;
        float max2 = 0.0f;
        boolean b = false;
        if (\u2603.p(\u2603).b((amo<Boolean>)akk.P)) {
            max = Math.max(max, 0.0625f);
            min = 0.0f;
            min2 = 0.0f;
            \u26032 = 1.0f;
            min3 = 0.0f;
            max2 = 1.0f;
            b = true;
        }
        if (\u2603.p(\u2603).b((amo<Boolean>)akk.N)) {
            min = Math.min(min, 0.9375f);
            max = 1.0f;
            min2 = 0.0f;
            \u26032 = 1.0f;
            min3 = 0.0f;
            max2 = 1.0f;
            b = true;
        }
        if (\u2603.p(\u2603).b((amo<Boolean>)akk.b)) {
            max2 = Math.max(max2, 0.0625f);
            min3 = 0.0f;
            min = 0.0f;
            max = 1.0f;
            min2 = 0.0f;
            \u26032 = 1.0f;
            b = true;
        }
        if (\u2603.p(\u2603).b((amo<Boolean>)akk.O)) {
            min3 = Math.min(min3, 0.9375f);
            max2 = 1.0f;
            min = 0.0f;
            max = 1.0f;
            min2 = 0.0f;
            \u26032 = 1.0f;
            b = true;
        }
        if (!b && this.c(\u2603.p(\u2603.a()).c())) {
            min2 = Math.min(min2, 0.9375f);
            \u26032 = 1.0f;
            min = 0.0f;
            max = 1.0f;
            min3 = 0.0f;
            max2 = 1.0f;
        }
        this.a(min, min2, min3, max, \u26032, max2);
    }
    
    @Override
    public aug a(final adm \u2603, final cj \u2603, final alz \u2603) {
        return null;
    }
    
    @Override
    public boolean b(final adm \u2603, final cj \u2603, final cq \u2603) {
        switch (akk$1.a[\u2603.ordinal()]) {
            default: {
                return false;
            }
            case 1: {
                return this.c(\u2603.p(\u2603.a()).c());
            }
            case 2:
            case 3:
            case 4:
            case 5: {
                return this.c(\u2603.p(\u2603.a(\u2603.d())).c());
            }
        }
    }
    
    private boolean c(final afh \u2603) {
        return \u2603.d() && \u2603.J.c();
    }
    
    private boolean e(final adm \u2603, final cj \u2603, alz \u2603) {
        final alz alz = \u2603;
        for (final cq cq : cq.c.a) {
            final amk a = a(cq);
            if (\u2603.b((amo<Boolean>)a) && !this.c(\u2603.p(\u2603.a(cq)).c())) {
                final alz p = \u2603.p(\u2603.a());
                if (p.c() == this && p.b((amo<Boolean>)a)) {
                    continue;
                }
                \u2603 = \u2603.a((amo<Comparable>)a, false);
            }
        }
        if (d(\u2603) == 0) {
            return false;
        }
        if (alz != \u2603) {
            \u2603.a(\u2603, \u2603, 2);
        }
        return true;
    }
    
    @Override
    public int H() {
        return adj.c();
    }
    
    @Override
    public int h(final alz \u2603) {
        return adj.c();
    }
    
    @Override
    public int a(final adq \u2603, final cj \u2603, final int \u2603) {
        return \u2603.b(\u2603).c(\u2603);
    }
    
    @Override
    public void a(final adm \u2603, final cj \u2603, final alz \u2603, final afh \u2603) {
        if (!\u2603.D && !this.e(\u2603, \u2603, \u2603)) {
            this.b(\u2603, \u2603, \u2603, 0);
            \u2603.g(\u2603);
        }
    }
    
    @Override
    public void b(final adm \u2603, final cj \u2603, final alz \u2603, final Random \u2603) {
        if (\u2603.D) {
            return;
        }
        if (\u2603.s.nextInt(4) != 0) {
            return;
        }
        final int n = 4;
        int n2 = 5;
        boolean b = false;
    Label_0117:
        for (int i = -n; i <= n; ++i) {
            for (int j = -n; j <= n; ++j) {
                for (int k = -1; k <= 1; ++k) {
                    if (\u2603.p(\u2603.a(i, k, j)).c() == this && --n2 <= 0) {
                        b = true;
                        break Label_0117;
                    }
                }
            }
        }
        final cq a = cq.a(\u2603);
        final cj a2 = \u2603.a();
        if (a == cq.b && \u2603.o() < 255 && \u2603.d(a2)) {
            if (b) {
                return;
            }
            alz a3 = \u2603;
            for (final cq e : cq.c.a) {
                if (\u2603.nextBoolean() || !this.c(\u2603.p(a2.a(e)).c())) {
                    a3 = a3.a((amo<Comparable>)a(e), false);
                }
            }
            if (a3.b((amo<Boolean>)akk.b) || a3.b((amo<Boolean>)akk.N) || a3.b((amo<Boolean>)akk.O) || a3.b((amo<Boolean>)akk.P)) {
                \u2603.a(a2, a3, 2);
            }
        }
        else {
            if (!a.k().c() || \u2603.b((amo<Boolean>)a(a))) {
                if (\u2603.o() > 1) {
                    final cj \u26032 = \u2603.b();
                    final alz p = \u2603.p(\u26032);
                    final afh c = p.c();
                    if (c.J == arm.a) {
                        alz alz = \u2603;
                        for (final cq cq : cq.c.a) {
                            if (\u2603.nextBoolean()) {
                                alz = alz.a((amo<Comparable>)a(cq), false);
                            }
                        }
                        if (alz.b((amo<Boolean>)akk.b) || alz.b((amo<Boolean>)akk.N) || alz.b((amo<Boolean>)akk.O) || alz.b((amo<Boolean>)akk.P)) {
                            \u2603.a(\u26032, alz, 2);
                        }
                    }
                    else if (c == this) {
                        alz alz = p;
                        for (final cq cq : cq.c.a) {
                            final amk a4 = a(cq);
                            if (\u2603.nextBoolean() && \u2603.b((amo<Boolean>)a4)) {
                                alz = alz.a((amo<Comparable>)a4, true);
                            }
                        }
                        if (alz.b((amo<Boolean>)akk.b) || alz.b((amo<Boolean>)akk.N) || alz.b((amo<Boolean>)akk.O) || alz.b((amo<Boolean>)akk.P)) {
                            \u2603.a(\u26032, alz, 2);
                        }
                    }
                }
                return;
            }
            if (b) {
                return;
            }
            final cj \u26032 = \u2603.a(a);
            final afh c2 = \u2603.p(\u26032).c();
            if (c2.J == arm.a) {
                final cq e = a.e();
                final cq f = a.f();
                final boolean booleanValue = \u2603.b((amo<Boolean>)a(e));
                final boolean booleanValue2 = \u2603.b((amo<Boolean>)a(f));
                final cj a5 = \u26032.a(e);
                final cj a6 = \u26032.a(f);
                if (booleanValue && this.c(\u2603.p(a5).c())) {
                    \u2603.a(\u26032, this.Q().a((amo<Comparable>)a(e), true), 2);
                }
                else if (booleanValue2 && this.c(\u2603.p(a6).c())) {
                    \u2603.a(\u26032, this.Q().a((amo<Comparable>)a(f), true), 2);
                }
                else if (booleanValue && \u2603.d(a5) && this.c(\u2603.p(\u2603.a(e)).c())) {
                    \u2603.a(a5, this.Q().a((amo<Comparable>)a(a.d()), true), 2);
                }
                else if (booleanValue2 && \u2603.d(a6) && this.c(\u2603.p(\u2603.a(f)).c())) {
                    \u2603.a(a6, this.Q().a((amo<Comparable>)a(a.d()), true), 2);
                }
                else if (this.c(\u2603.p(\u26032.a()).c())) {
                    \u2603.a(\u26032, this.Q(), 2);
                }
            }
            else if (c2.J.k() && c2.d()) {
                \u2603.a(\u2603, \u2603.a((amo<Comparable>)a(a), true), 2);
            }
        }
    }
    
    @Override
    public alz a(final adm \u2603, final cj \u2603, final cq \u2603, final float \u2603, final float \u2603, final float \u2603, final int \u2603, final pr \u2603) {
        final alz a = this.Q().a((amo<Comparable>)akk.a, false).a((amo<Comparable>)akk.b, false).a((amo<Comparable>)akk.N, false).a((amo<Comparable>)akk.O, false).a((amo<Comparable>)akk.P, false);
        if (\u2603.k().c()) {
            return a.a((amo<Comparable>)a(\u2603.d()), true);
        }
        return a;
    }
    
    @Override
    public zw a(final alz \u2603, final Random \u2603, final int \u2603) {
        return null;
    }
    
    @Override
    public int a(final Random \u2603) {
        return 0;
    }
    
    @Override
    public void a(final adm \u2603, final wn \u2603, final cj \u2603, final alz \u2603, final akw \u2603) {
        if (!\u2603.D && \u2603.bZ() != null && \u2603.bZ().b() == zy.be) {
            \u2603.b(na.ab[afh.a(this)]);
            afh.a(\u2603, \u2603, new zx(afi.bn, 1, 0));
        }
        else {
            super.a(\u2603, \u2603, \u2603, \u2603, \u2603);
        }
    }
    
    @Override
    public adf m() {
        return adf.c;
    }
    
    @Override
    public alz a(final int \u2603) {
        return this.Q().a((amo<Comparable>)akk.O, (\u2603 & 0x1) > 0).a((amo<Comparable>)akk.P, (\u2603 & 0x2) > 0).a((amo<Comparable>)akk.b, (\u2603 & 0x4) > 0).a((amo<Comparable>)akk.N, (\u2603 & 0x8) > 0);
    }
    
    @Override
    public int c(final alz \u2603) {
        int n = 0;
        if (\u2603.b((amo<Boolean>)akk.O)) {
            n |= 0x1;
        }
        if (\u2603.b((amo<Boolean>)akk.P)) {
            n |= 0x2;
        }
        if (\u2603.b((amo<Boolean>)akk.b)) {
            n |= 0x4;
        }
        if (\u2603.b((amo<Boolean>)akk.N)) {
            n |= 0x8;
        }
        return n;
    }
    
    @Override
    protected ama e() {
        return new ama(this, new amo[] { akk.a, akk.b, akk.N, akk.O, akk.P });
    }
    
    public static amk a(final cq \u2603) {
        switch (akk$1.a[\u2603.ordinal()]) {
            case 1: {
                return akk.a;
            }
            case 2: {
                return akk.b;
            }
            case 3: {
                return akk.O;
            }
            case 5: {
                return akk.P;
            }
            case 4: {
                return akk.N;
            }
            default: {
                throw new IllegalArgumentException(\u2603 + " is an invalid choice");
            }
        }
    }
    
    public static int d(final alz \u2603) {
        int n = 0;
        for (final amk amk : akk.Q) {
            if (\u2603.b((amo<Boolean>)amk)) {
                ++n;
            }
        }
        return n;
    }
    
    static {
        a = amk.a("up");
        b = amk.a("north");
        N = amk.a("east");
        O = amk.a("south");
        P = amk.a("west");
        Q = new amk[] { akk.a, akk.b, akk.O, akk.P, akk.N };
    }
}
