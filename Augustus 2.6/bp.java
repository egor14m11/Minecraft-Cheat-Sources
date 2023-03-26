import java.util.Collection;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class bp extends i
{
    @Override
    public String c() {
        return "testforblock";
    }
    
    @Override
    public int a() {
        return 2;
    }
    
    @Override
    public String c(final m \u2603) {
        return "commands.testforblock.usage";
    }
    
    @Override
    public void a(final m \u2603, final String[] \u2603) throws bz {
        if (\u2603.length < 4) {
            throw new cf("commands.testforblock.usage", new Object[0]);
        }
        \u2603.a(n.a.b, 0);
        final cj a = i.a(\u2603, \u2603, 0, false);
        final afh b = afh.b(\u2603[3]);
        if (b == null) {
            throw new cb("commands.setblock.notFound", new Object[] { \u2603[3] });
        }
        int a2 = -1;
        if (\u2603.length >= 5) {
            a2 = i.a(\u2603[4], -1, 15);
        }
        final adm e = \u2603.e();
        if (!e.e(a)) {
            throw new bz("commands.testforblock.outOfWorld", new Object[0]);
        }
        dn a3 = new dn();
        boolean b2 = false;
        if (\u2603.length >= 6 && b.z()) {
            final String c = i.a(\u2603, \u2603, 5).c();
            try {
                a3 = ed.a(c);
                b2 = true;
            }
            catch (ec ec) {
                throw new bz("commands.setblock.tagError", new Object[] { ec.getMessage() });
            }
        }
        final alz p = e.p(a);
        final afh c2 = p.c();
        if (c2 != b) {
            throw new bz("commands.testforblock.failed.tile", new Object[] { a.n(), a.o(), a.p(), c2.f(), b.f() });
        }
        if (a2 > -1) {
            final int c3 = p.c().c(p);
            if (c3 != a2) {
                throw new bz("commands.testforblock.failed.data", new Object[] { a.n(), a.o(), a.p(), c3, a2 });
            }
        }
        if (b2) {
            final akw s = e.s(a);
            if (s == null) {
                throw new bz("commands.testforblock.failed.tileEntity", new Object[] { a.n(), a.o(), a.p() });
            }
            final dn dn = new dn();
            s.b(dn);
            if (!dy.a(a3, dn, true)) {
                throw new bz("commands.testforblock.failed.nbt", new Object[] { a.n(), a.o(), a.p() });
            }
        }
        \u2603.a(n.a.b, 1);
        i.a(\u2603, this, "commands.testforblock.success", a.n(), a.o(), a.p());
    }
    
    @Override
    public List<String> a(final m \u2603, final String[] \u2603, final cj \u2603) {
        if (\u2603.length > 0 && \u2603.length <= 3) {
            return i.a(\u2603, 0, \u2603);
        }
        if (\u2603.length == 4) {
            return i.a(\u2603, afh.c.c());
        }
        return null;
    }
}
