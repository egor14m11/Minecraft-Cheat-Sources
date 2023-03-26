import java.util.Random;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Queue;
import com.google.common.collect.Lists;

// 
// Decompiled by Procyon v0.5.36
// 

public class ajr extends afh
{
    public static final amk a;
    
    protected ajr() {
        super(arm.m);
        this.j(this.M.b().a((amo<Comparable>)ajr.a, false));
        this.a(yz.b);
    }
    
    @Override
    public String f() {
        return di.a(this.a() + ".dry.name");
    }
    
    @Override
    public int a(final alz \u2603) {
        return ((boolean)\u2603.b((amo<Boolean>)ajr.a)) ? 1 : 0;
    }
    
    @Override
    public void c(final adm \u2603, final cj \u2603, final alz \u2603) {
        this.e(\u2603, \u2603, \u2603);
    }
    
    @Override
    public void a(final adm \u2603, final cj \u2603, final alz \u2603, final afh \u2603) {
        this.e(\u2603, \u2603, \u2603);
        super.a(\u2603, \u2603, \u2603, \u2603);
    }
    
    protected void e(final adm \u2603, final cj \u2603, final alz \u2603) {
        if (!\u2603.b((amo<Boolean>)ajr.a) && this.e(\u2603, \u2603)) {
            \u2603.a(\u2603, \u2603.a((amo<Comparable>)ajr.a, true), 2);
            \u2603.b(2001, \u2603, afh.a(afi.j));
        }
    }
    
    private boolean e(final adm \u2603, final cj \u2603) {
        final Queue<nz<cj, Integer>> linkedList = (Queue<nz<cj, Integer>>)Lists.newLinkedList();
        final ArrayList<cj> arrayList = Lists.newArrayList();
        linkedList.add(new nz<cj, Integer>(\u2603, 0));
        int n = 0;
        while (!linkedList.isEmpty()) {
            final nz<cj, Integer> nz = linkedList.poll();
            final cj \u26032 = nz.a();
            final int intValue = nz.b();
            for (final cq \u26033 : cq.values()) {
                final cj a = \u26032.a(\u26033);
                if (\u2603.p(a).c().t() == arm.h) {
                    \u2603.a(a, afi.a.Q(), 2);
                    arrayList.add(a);
                    ++n;
                    if (intValue < 6) {
                        linkedList.add(new nz<cj, Integer>(a, intValue + 1));
                    }
                }
            }
            if (n > 64) {
                break;
            }
        }
        final Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            final cj \u26032 = iterator.next();
            \u2603.c(\u26032, afi.a);
        }
        return n > 0;
    }
    
    @Override
    public void a(final zw \u2603, final yz \u2603, final List<zx> \u2603) {
        \u2603.add(new zx(\u2603, 1, 0));
        \u2603.add(new zx(\u2603, 1, 1));
    }
    
    @Override
    public alz a(final int \u2603) {
        return this.Q().a((amo<Comparable>)ajr.a, (\u2603 & 0x1) == 0x1);
    }
    
    @Override
    public int c(final alz \u2603) {
        return ((boolean)\u2603.b((amo<Boolean>)ajr.a)) ? 1 : 0;
    }
    
    @Override
    protected ama e() {
        return new ama(this, new amo[] { ajr.a });
    }
    
    @Override
    public void c(final adm \u2603, final cj \u2603, final alz \u2603, final Random \u2603) {
        if (!\u2603.b((amo<Boolean>)ajr.a)) {
            return;
        }
        final cq a = cq.a(\u2603);
        if (a == cq.b || adm.a(\u2603, \u2603.a(a))) {
            return;
        }
        double \u26032 = \u2603.n();
        double \u26033 = \u2603.o();
        double \u26034 = \u2603.p();
        if (a == cq.a) {
            \u26033 -= 0.05;
            \u26032 += \u2603.nextDouble();
            \u26034 += \u2603.nextDouble();
        }
        else {
            \u26033 += \u2603.nextDouble() * 0.8;
            if (a.k() == cq.a.a) {
                \u26034 += \u2603.nextDouble();
                if (a == cq.f) {
                    \u26032 += 1.1;
                }
                else {
                    \u26032 += 0.05;
                }
            }
            else {
                \u26032 += \u2603.nextDouble();
                if (a == cq.d) {
                    \u26034 += 1.1;
                }
                else {
                    \u26034 += 0.05;
                }
            }
        }
        \u2603.a(cy.s, \u26032, \u26033, \u26034, 0.0, 0.0, 0.0, new int[0]);
    }
    
    static {
        a = amk.a("wet");
    }
}
