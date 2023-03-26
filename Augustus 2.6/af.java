import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import com.google.common.collect.Lists;

// 
// Decompiled by Procyon v0.5.36
// 

public class af extends i
{
    @Override
    public String c() {
        return "fill";
    }
    
    @Override
    public int a() {
        return 2;
    }
    
    @Override
    public String c(final m \u2603) {
        return "commands.fill.usage";
    }
    
    @Override
    public void a(final m \u2603, final String[] \u2603) throws bz {
        if (\u2603.length < 7) {
            throw new cf("commands.fill.usage", new Object[0]);
        }
        \u2603.a(n.a.b, 0);
        final cj a = i.a(\u2603, \u2603, 0, false);
        final cj a2 = i.a(\u2603, \u2603, 3, false);
        final afh g = i.g(\u2603, \u2603[6]);
        int a3 = 0;
        if (\u2603.length >= 8) {
            a3 = i.a(\u2603[7], 0, 15);
        }
        final cj cj = new cj(Math.min(a.n(), a2.n()), Math.min(a.o(), a2.o()), Math.min(a.p(), a2.p()));
        final cj cj2 = new cj(Math.max(a.n(), a2.n()), Math.max(a.o(), a2.o()), Math.max(a.p(), a2.p()));
        int n = (cj2.n() - cj.n() + 1) * (cj2.o() - cj.o() + 1) * (cj2.p() - cj.p() + 1);
        if (n > 32768) {
            throw new bz("commands.fill.tooManyBlocks", new Object[] { n, 32768 });
        }
        if (cj.o() < 0 || cj2.o() >= 256) {
            throw new bz("commands.fill.outOfWorld", new Object[0]);
        }
        final adm e = \u2603.e();
        for (int i = cj.p(); i < cj2.p() + 16; i += 16) {
            for (int j = cj.n(); j < cj2.n() + 16; j += 16) {
                if (!e.e(new cj(j, cj2.o() - cj.o(), i))) {
                    throw new bz("commands.fill.outOfWorld", new Object[0]);
                }
            }
        }
        dn a4 = new dn();
        boolean b = false;
        if (\u2603.length >= 10 && g.z()) {
            final String c = i.a(\u2603, \u2603, 9).c();
            try {
                a4 = ed.a(c);
                b = true;
            }
            catch (ec ec) {
                throw new bz("commands.fill.tagError", new Object[] { ec.getMessage() });
            }
        }
        final List<cj> arrayList = (List<cj>)Lists.newArrayList();
        n = 0;
        for (int k = cj.p(); k <= cj2.p(); ++k) {
            for (int l = cj.o(); l <= cj2.o(); ++l) {
                for (int n2 = cj.n(); n2 <= cj2.n(); ++n2) {
                    final cj \u26032 = new cj(n2, l, k);
                    if (\u2603.length >= 9) {
                        if (\u2603[8].equals("outline") || \u2603[8].equals("hollow")) {
                            if (n2 != cj.n() && n2 != cj2.n() && l != cj.o() && l != cj2.o() && k != cj.p() && k != cj2.p()) {
                                if (\u2603[8].equals("hollow")) {
                                    e.a(\u26032, afi.a.Q(), 2);
                                    arrayList.add(\u26032);
                                }
                                continue;
                            }
                        }
                        else if (\u2603[8].equals("destroy")) {
                            e.b(\u26032, true);
                        }
                        else if (\u2603[8].equals("keep")) {
                            if (!e.d(\u26032)) {
                                continue;
                            }
                        }
                        else if (\u2603[8].equals("replace") && !g.z()) {
                            if (\u2603.length > 9) {
                                final afh g2 = i.g(\u2603, \u2603[9]);
                                if (e.p(\u26032).c() != g2) {
                                    continue;
                                }
                            }
                            if (\u2603.length > 10) {
                                final int a5 = i.a(\u2603[10]);
                                final alz alz = e.p(\u26032);
                                if (alz.c().c(alz) != a5) {
                                    continue;
                                }
                            }
                        }
                    }
                    final akw s = e.s(\u26032);
                    if (s != null) {
                        if (s instanceof og) {
                            ((og)s).l();
                        }
                        e.a(\u26032, afi.cv.Q(), (g == afi.cv) ? 2 : 4);
                    }
                    final alz alz = g.a(a3);
                    if (e.a(\u26032, alz, 2)) {
                        arrayList.add(\u26032);
                        ++n;
                        if (b) {
                            final akw s2 = e.s(\u26032);
                            if (s2 != null) {
                                a4.a("x", \u26032.n());
                                a4.a("y", \u26032.o());
                                a4.a("z", \u26032.p());
                                s2.a(a4);
                            }
                        }
                    }
                }
            }
        }
        for (final cj cj3 : arrayList) {
            final afh c2 = e.p(cj3).c();
            e.b(cj3, c2);
        }
        if (n <= 0) {
            throw new bz("commands.fill.failed", new Object[0]);
        }
        \u2603.a(n.a.b, n);
        i.a(\u2603, this, "commands.fill.success", n);
    }
    
    @Override
    public List<String> a(final m \u2603, final String[] \u2603, final cj \u2603) {
        if (\u2603.length > 0 && \u2603.length <= 3) {
            return i.a(\u2603, 0, \u2603);
        }
        if (\u2603.length > 3 && \u2603.length <= 6) {
            return i.a(\u2603, 3, \u2603);
        }
        if (\u2603.length == 7) {
            return i.a(\u2603, afh.c.c());
        }
        if (\u2603.length == 9) {
            return i.a(\u2603, "replace", "destroy", "keep", "hollow", "outline");
        }
        if (\u2603.length == 10 && "replace".equals(\u2603[8])) {
            return i.a(\u2603, afh.c.c());
        }
        return null;
    }
}
