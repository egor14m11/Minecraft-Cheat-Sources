import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class v extends i
{
    @Override
    public String c() {
        return "testforblocks";
    }
    
    @Override
    public int a() {
        return 2;
    }
    
    @Override
    public String c(final m \u2603) {
        return "commands.compare.usage";
    }
    
    @Override
    public void a(final m \u2603, final String[] \u2603) throws bz {
        if (\u2603.length < 9) {
            throw new cf("commands.compare.usage", new Object[0]);
        }
        \u2603.a(n.a.b, 0);
        final cj a = i.a(\u2603, \u2603, 0, false);
        final cj a2 = i.a(\u2603, \u2603, 3, false);
        final cj a3 = i.a(\u2603, \u2603, 6, false);
        final aqe \u26032 = new aqe(a, a2);
        final aqe \u26033 = new aqe(a3, a3.a(\u26032.b()));
        int n = \u26032.c() * \u26032.d() * \u26032.e();
        if (n > 524288) {
            throw new bz("commands.compare.tooManyBlocks", new Object[] { n, 524288 });
        }
        if (\u26032.b < 0 || \u26032.e >= 256 || \u26033.b < 0 || \u26033.e >= 256) {
            throw new bz("commands.compare.outOfWorld", new Object[0]);
        }
        final adm e = \u2603.e();
        if (!e.a(\u26032) || !e.a(\u26033)) {
            throw new bz("commands.compare.outOfWorld", new Object[0]);
        }
        boolean b = false;
        if (\u2603.length > 9 && \u2603[9].equals("masked")) {
            b = true;
        }
        n = 0;
        final cj cj = new cj(\u26033.a - \u26032.a, \u26033.b - \u26032.b, \u26033.c - \u26032.c);
        final cj.a a4 = new cj.a();
        final cj.a a5 = new cj.a();
        for (int i = \u26032.c; i <= \u26032.f; ++i) {
            for (int j = \u26032.b; j <= \u26032.e; ++j) {
                for (int k = \u26032.a; k <= \u26032.d; ++k) {
                    a4.c(k, j, i);
                    a5.c(k + cj.n(), j + cj.o(), i + cj.p());
                    boolean b2 = false;
                    final alz p = e.p(a4);
                    if (!b || p.c() != afi.a) {
                        if (p == e.p(a5)) {
                            final akw s = e.s(a4);
                            final akw s2 = e.s(a5);
                            if (s != null && s2 != null) {
                                final dn \u26034 = new dn();
                                s.b(\u26034);
                                \u26034.o("x");
                                \u26034.o("y");
                                \u26034.o("z");
                                final dn dn = new dn();
                                s2.b(dn);
                                dn.o("x");
                                dn.o("y");
                                dn.o("z");
                                if (!\u26034.equals(dn)) {
                                    b2 = true;
                                }
                            }
                            else if (s != null) {
                                b2 = true;
                            }
                        }
                        else {
                            b2 = true;
                        }
                        ++n;
                        if (b2) {
                            throw new bz("commands.compare.failed", new Object[0]);
                        }
                    }
                }
            }
        }
        \u2603.a(n.a.b, n);
        i.a(\u2603, this, "commands.compare.success", n);
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
            return i.a(\u2603, "masked", "all");
        }
        return null;
    }
}
