import com.google.common.base.Predicate;
import java.util.Random;
import com.google.common.base.Objects;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.5.36
// 

public class akj extends afh
{
    public static final aml a;
    public static final amk b;
    public static final amk N;
    public static final amk O;
    
    public akj() {
        super(arm.q);
        this.j(this.M.b().a((amo<Comparable>)akj.a, cq.c).a((amo<Comparable>)akj.b, false).a((amo<Comparable>)akj.N, false).a((amo<Comparable>)akj.O, false));
        this.a(yz.d);
        this.a(true);
    }
    
    @Override
    public alz a(final alz \u2603, final adq \u2603, final cj \u2603) {
        return \u2603.a((amo<Comparable>)akj.O, !adm.a(\u2603, \u2603.b()));
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
    public boolean b(final adm \u2603, final cj \u2603, final cq \u2603) {
        return \u2603.k().c() && \u2603.p(\u2603.a(\u2603.d())).c().v();
    }
    
    @Override
    public boolean d(final adm \u2603, final cj \u2603) {
        for (final cq \u26032 : cq.c.a) {
            if (\u2603.p(\u2603.a(\u26032)).c().v()) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public alz a(final adm \u2603, final cj \u2603, final cq \u2603, final float \u2603, final float \u2603, final float \u2603, final int \u2603, final pr \u2603) {
        alz alz = this.Q().a((amo<Comparable>)akj.b, false).a((amo<Comparable>)akj.N, false).a((amo<Comparable>)akj.O, false);
        if (\u2603.k().c()) {
            alz = alz.a((amo<Comparable>)akj.a, \u2603);
        }
        return alz;
    }
    
    @Override
    public void a(final adm \u2603, final cj \u2603, final alz \u2603, final pr \u2603, final zx \u2603) {
        this.a(\u2603, \u2603, \u2603, false, false, -1, null);
    }
    
    @Override
    public void a(final adm \u2603, final cj \u2603, final alz \u2603, final afh \u2603) {
        if (\u2603 == this) {
            return;
        }
        if (this.e(\u2603, \u2603, \u2603)) {
            final cq cq = \u2603.b((amo<cq>)akj.a);
            if (!\u2603.p(\u2603.a(cq.d())).c().v()) {
                this.b(\u2603, \u2603, \u2603, 0);
                \u2603.g(\u2603);
            }
        }
    }
    
    public void a(final adm \u2603, final cj \u2603, final alz \u2603, final boolean \u2603, final boolean \u2603, final int \u2603, final alz \u2603) {
        final cq cq = \u2603.b((amo<cq>)akj.a);
        final boolean booleanValue = \u2603.b((amo<Boolean>)akj.N);
        final boolean booleanValue2 = \u2603.b((amo<Boolean>)akj.b);
        final boolean b = !adm.a(\u2603, \u2603.b());
        boolean b2 = !\u2603;
        boolean \u26032 = false;
        int \u26033 = 0;
        final alz[] array = new alz[42];
        int i = 1;
        while (i < 42) {
            final cj cj = \u2603.a(cq, i);
            alz p = \u2603.p(cj);
            if (p.c() == afi.bR) {
                if (p.b((amo<Comparable>)akj.a) == cq.d()) {
                    \u26033 = i;
                    break;
                }
                break;
            }
            else {
                if (p.c() == afi.bS || i == \u2603) {
                    if (i == \u2603) {
                        p = (alz)Objects.firstNonNull((Object)\u2603, (Object)p);
                    }
                    final boolean b3 = !p.b((amo<Boolean>)aki.O);
                    final boolean booleanValue3 = p.b((amo<Boolean>)aki.a);
                    final boolean booleanValue4 = p.b((amo<Boolean>)aki.b);
                    b2 &= (booleanValue4 == b);
                    \u26032 |= (b3 && booleanValue3);
                    array[i] = p;
                    if (i == \u2603) {
                        \u2603.a(\u2603, this, this.a(\u2603));
                        b2 &= b3;
                    }
                }
                else {
                    array[i] = null;
                    b2 = false;
                }
                ++i;
            }
        }
        b2 &= (\u26033 > 1);
        \u26032 &= b2;
        final alz a = this.Q().a((amo<Comparable>)akj.N, b2).a((amo<Comparable>)akj.b, \u26032);
        if (\u26033 > 0) {
            final cj cj = \u2603.a(cq, \u26033);
            final cq d = cq.d();
            \u2603.a(cj, a.a((amo<Comparable>)akj.a, d), 3);
            this.a(\u2603, cj, d);
            this.a(\u2603, cj, b2, \u26032, booleanValue, booleanValue2);
        }
        this.a(\u2603, \u2603, b2, \u26032, booleanValue, booleanValue2);
        if (!\u2603) {
            \u2603.a(\u2603, a.a((amo<Comparable>)akj.a, cq), 3);
            if (\u2603) {
                this.a(\u2603, \u2603, cq);
            }
        }
        if (booleanValue != b2) {
            for (int j = 1; j < \u26033; ++j) {
                final cj a2 = \u2603.a(cq, j);
                final alz alz = array[j];
                if (alz != null) {
                    if (\u2603.p(a2).c() != afi.a) {
                        \u2603.a(a2, alz.a((amo<Comparable>)akj.N, b2), 3);
                    }
                }
            }
        }
    }
    
    @Override
    public void a(final adm \u2603, final cj \u2603, final alz \u2603, final Random \u2603) {
    }
    
    @Override
    public void b(final adm \u2603, final cj \u2603, final alz \u2603, final Random \u2603) {
        this.a(\u2603, \u2603, \u2603, false, true, -1, null);
    }
    
    private void a(final adm \u2603, final cj \u2603, final boolean \u2603, final boolean \u2603, final boolean \u2603, final boolean \u2603) {
        if (\u2603 && !\u2603) {
            \u2603.a(\u2603.n() + 0.5, \u2603.o() + 0.1, \u2603.p() + 0.5, "random.click", 0.4f, 0.6f);
        }
        else if (!\u2603 && \u2603) {
            \u2603.a(\u2603.n() + 0.5, \u2603.o() + 0.1, \u2603.p() + 0.5, "random.click", 0.4f, 0.5f);
        }
        else if (\u2603 && !\u2603) {
            \u2603.a(\u2603.n() + 0.5, \u2603.o() + 0.1, \u2603.p() + 0.5, "random.click", 0.4f, 0.7f);
        }
        else if (!\u2603 && \u2603) {
            \u2603.a(\u2603.n() + 0.5, \u2603.o() + 0.1, \u2603.p() + 0.5, "random.bowhit", 0.4f, 1.2f / (\u2603.s.nextFloat() * 0.2f + 0.9f));
        }
    }
    
    private void a(final adm \u2603, final cj \u2603, final cq \u2603) {
        \u2603.c(\u2603, this);
        \u2603.c(\u2603.a(\u2603.d()), this);
    }
    
    private boolean e(final adm \u2603, final cj \u2603, final alz \u2603) {
        if (!this.d(\u2603, \u2603)) {
            this.b(\u2603, \u2603, \u2603, 0);
            \u2603.g(\u2603);
            return false;
        }
        return true;
    }
    
    @Override
    public void a(final adq \u2603, final cj \u2603) {
        final float n = 0.1875f;
        switch (akj$1.a[\u2603.p(\u2603).b((amo<cq>)akj.a).ordinal()]) {
            case 1: {
                this.a(0.0f, 0.2f, 0.5f - n, n * 2.0f, 0.8f, 0.5f + n);
                break;
            }
            case 2: {
                this.a(1.0f - n * 2.0f, 0.2f, 0.5f - n, 1.0f, 0.8f, 0.5f + n);
                break;
            }
            case 3: {
                this.a(0.5f - n, 0.2f, 0.0f, 0.5f + n, 0.8f, n * 2.0f);
                break;
            }
            case 4: {
                this.a(0.5f - n, 0.2f, 1.0f - n * 2.0f, 0.5f + n, 0.8f, 1.0f);
                break;
            }
        }
    }
    
    @Override
    public void b(final adm \u2603, final cj \u2603, final alz \u2603) {
        final boolean booleanValue = \u2603.b((amo<Boolean>)akj.N);
        final boolean booleanValue2 = \u2603.b((amo<Boolean>)akj.b);
        if (booleanValue || booleanValue2) {
            this.a(\u2603, \u2603, \u2603, true, false, -1, null);
        }
        if (booleanValue2) {
            \u2603.c(\u2603, this);
            \u2603.c(\u2603.a(\u2603.b((amo<cq>)akj.a).d()), this);
        }
        super.b(\u2603, \u2603, \u2603);
    }
    
    @Override
    public int a(final adq \u2603, final cj \u2603, final alz \u2603, final cq \u2603) {
        return \u2603.b((amo<Boolean>)akj.b) ? 15 : 0;
    }
    
    @Override
    public int b(final adq \u2603, final cj \u2603, final alz \u2603, final cq \u2603) {
        if (!\u2603.b((amo<Boolean>)akj.b)) {
            return 0;
        }
        if (\u2603.b((amo<Comparable>)akj.a) == \u2603) {
            return 15;
        }
        return 0;
    }
    
    @Override
    public boolean i() {
        return true;
    }
    
    @Override
    public adf m() {
        return adf.b;
    }
    
    @Override
    public alz a(final int \u2603) {
        return this.Q().a((amo<Comparable>)akj.a, cq.b(\u2603 & 0x3)).a((amo<Comparable>)akj.b, (\u2603 & 0x8) > 0).a((amo<Comparable>)akj.N, (\u2603 & 0x4) > 0);
    }
    
    @Override
    public int c(final alz \u2603) {
        int n = 0;
        n |= \u2603.b((amo<cq>)akj.a).b();
        if (\u2603.b((amo<Boolean>)akj.b)) {
            n |= 0x8;
        }
        if (\u2603.b((amo<Boolean>)akj.N)) {
            n |= 0x4;
        }
        return n;
    }
    
    @Override
    protected ama e() {
        return new ama(this, new amo[] { akj.a, akj.b, akj.N, akj.O });
    }
    
    static {
        a = aml.a("facing", cq.c.a);
        b = amk.a("powered");
        N = amk.a("attached");
        O = amk.a("suspended");
    }
}
