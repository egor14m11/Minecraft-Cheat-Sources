import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Collection;
import com.google.common.collect.Lists;

// 
// Decompiled by Procyon v0.5.36
// 

public class u extends i
{
    @Override
    public String c() {
        return "clone";
    }
    
    @Override
    public int a() {
        return 2;
    }
    
    @Override
    public String c(final m \u2603) {
        return "commands.clone.usage";
    }
    
    @Override
    public void a(final m \u2603, final String[] \u2603) throws bz {
        if (\u2603.length < 9) {
            throw new cf("commands.clone.usage", new Object[0]);
        }
        \u2603.a(n.a.b, 0);
        final cj a = i.a(\u2603, \u2603, 0, false);
        final cj a2 = i.a(\u2603, \u2603, 3, false);
        final cj a3 = i.a(\u2603, \u2603, 6, false);
        final aqe aqe = new aqe(a, a2);
        final aqe aqe2 = new aqe(a3, a3.a(aqe.b()));
        int n = aqe.c() * aqe.d() * aqe.e();
        if (n > 32768) {
            throw new bz("commands.clone.tooManyBlocks", new Object[] { n, 32768 });
        }
        boolean b = false;
        afh g = null;
        int a4 = -1;
        if ((\u2603.length < 11 || (!\u2603[10].equals("force") && !\u2603[10].equals("move"))) && aqe.a(aqe2)) {
            throw new bz("commands.clone.noOverlap", new Object[0]);
        }
        if (\u2603.length >= 11 && \u2603[10].equals("move")) {
            b = true;
        }
        if (aqe.b < 0 || aqe.e >= 256 || aqe2.b < 0 || aqe2.e >= 256) {
            throw new bz("commands.clone.outOfWorld", new Object[0]);
        }
        final adm e = \u2603.e();
        if (!e.a(aqe) || !e.a(aqe2)) {
            throw new bz("commands.clone.outOfWorld", new Object[0]);
        }
        boolean b2 = false;
        if (\u2603.length >= 10) {
            if (\u2603[9].equals("masked")) {
                b2 = true;
            }
            else if (\u2603[9].equals("filtered")) {
                if (\u2603.length < 12) {
                    throw new cf("commands.clone.usage", new Object[0]);
                }
                g = i.g(\u2603, \u2603[11]);
                if (\u2603.length >= 13) {
                    a4 = i.a(\u2603[12], 0, 15);
                }
            }
        }
        final List<a> arrayList = (List<a>)Lists.newArrayList();
        final List<a> arrayList2 = (List<a>)Lists.newArrayList();
        final List<a> arrayList3 = (List<a>)Lists.newArrayList();
        final LinkedList<cj> linkedList = Lists.newLinkedList();
        final cj cj = new cj(aqe2.a - aqe.a, aqe2.b - aqe.b, aqe2.c - aqe.c);
        for (int i = aqe.c; i <= aqe.f; ++i) {
            for (int j = aqe.b; j <= aqe.e; ++j) {
                for (int k = aqe.a; k <= aqe.d; ++k) {
                    final cj e2 = new cj(k, j, i);
                    final cj a5 = e2.a(cj);
                    final alz p = e.p(e2);
                    if (!b2 || p.c() != afi.a) {
                        if (g != null) {
                            if (p.c() != g) {
                                continue;
                            }
                            if (a4 >= 0 && p.c().c(p) != a4) {
                                continue;
                            }
                        }
                        final akw s = e.s(e2);
                        if (s != null) {
                            final dn dn = new dn();
                            s.b(dn);
                            arrayList2.add(new a(a5, p, dn));
                            linkedList.addLast(e2);
                        }
                        else if (p.c().o() || p.c().d()) {
                            arrayList.add(new a(a5, p, null));
                            linkedList.addLast(e2);
                        }
                        else {
                            arrayList3.add(new a(a5, p, null));
                            linkedList.addFirst(e2);
                        }
                    }
                }
            }
        }
        if (b) {
            for (final cj \u26032 : linkedList) {
                final akw s2 = e.s(\u26032);
                if (s2 instanceof og) {
                    ((og)s2).l();
                }
                e.a(\u26032, afi.cv.Q(), 2);
            }
            for (final cj \u26032 : linkedList) {
                e.a(\u26032, afi.a.Q(), 3);
            }
        }
        final List<a> arrayList4 = (List<a>)Lists.newArrayList();
        arrayList4.addAll(arrayList);
        arrayList4.addAll(arrayList2);
        arrayList4.addAll(arrayList3);
        final List<a> reverse = Lists.reverse(arrayList4);
        for (final a a6 : reverse) {
            final akw akw = e.s(a6.a);
            if (akw instanceof og) {
                ((og)akw).l();
            }
            e.a(a6.a, afi.cv.Q(), 2);
        }
        n = 0;
        for (final a a6 : arrayList4) {
            if (e.a(a6.a, a6.b, 2)) {
                ++n;
            }
        }
        for (final a a6 : arrayList2) {
            final akw akw = e.s(a6.a);
            if (a6.c != null && akw != null) {
                a6.c.a("x", a6.a.n());
                a6.c.a("y", a6.a.o());
                a6.c.a("z", a6.a.p());
                akw.a(a6.c);
                akw.p_();
            }
            e.a(a6.a, a6.b, 2);
        }
        for (final a a6 : reverse) {
            e.b(a6.a, a6.b.c());
        }
        final List<adw> a7 = e.a(aqe, false);
        if (a7 != null) {
            for (final adw adw : a7) {
                if (aqe.b(adw.a)) {
                    final cj a8 = adw.a.a(cj);
                    e.b(a8, adw.a(), (int)(adw.b - e.P().f()), adw.c);
                }
            }
        }
        if (n <= 0) {
            throw new bz("commands.clone.failed", new Object[0]);
        }
        \u2603.a(n.a.b, n);
        i.a(\u2603, this, "commands.clone.success", n);
    }
    
    @Override
    public List<String> a(final m \u2603, final String[] \u2603, final cj \u2603) {
        if (\u2603.length > 0 && \u2603.length <= 3) {
            return i.a(\u2603, 0, \u2603);
        }
        if (\u2603.length > 3 && \u2603.length <= 6) {
            return i.a(\u2603, 3, \u2603);
        }
        if (\u2603.length > 6 && \u2603.length <= 9) {
            return i.a(\u2603, 6, \u2603);
        }
        if (\u2603.length == 10) {
            return i.a(\u2603, "replace", "masked", "filtered");
        }
        if (\u2603.length == 11) {
            return i.a(\u2603, "normal", "force", "move");
        }
        if (\u2603.length == 12 && "filtered".equals(\u2603[9])) {
            return i.a(\u2603, afh.c.c());
        }
        return null;
    }
    
    static class a
    {
        public final cj a;
        public final alz b;
        public final dn c;
        
        public a(final cj \u2603, final alz \u2603, final dn \u2603) {
            this.a = \u2603;
            this.b = \u2603;
            this.c = \u2603;
        }
    }
}
