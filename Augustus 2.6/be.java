import java.util.Collection;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class be extends i
{
    @Override
    public String c() {
        return "setblock";
    }
    
    @Override
    public int a() {
        return 2;
    }
    
    @Override
    public String c(final m \u2603) {
        return "commands.setblock.usage";
    }
    
    @Override
    public void a(final m \u2603, final String[] \u2603) throws bz {
        if (\u2603.length < 4) {
            throw new cf("commands.setblock.usage", new Object[0]);
        }
        \u2603.a(n.a.b, 0);
        final cj a = i.a(\u2603, \u2603, 0, false);
        final afh g = i.g(\u2603, \u2603[3]);
        int a2 = 0;
        if (\u2603.length >= 5) {
            a2 = i.a(\u2603[4], 0, 15);
        }
        final adm e = \u2603.e();
        if (!e.e(a)) {
            throw new bz("commands.setblock.outOfWorld", new Object[0]);
        }
        dn a3 = new dn();
        boolean b = false;
        if (\u2603.length >= 7 && g.z()) {
            final String c = i.a(\u2603, \u2603, 6).c();
            try {
                a3 = ed.a(c);
                b = true;
            }
            catch (ec ec) {
                throw new bz("commands.setblock.tagError", new Object[] { ec.getMessage() });
            }
        }
        if (\u2603.length >= 6) {
            if (\u2603[5].equals("destroy")) {
                e.b(a, true);
                if (g == afi.a) {
                    i.a(\u2603, this, "commands.setblock.success", new Object[0]);
                    return;
                }
            }
            else if (\u2603[5].equals("keep") && !e.d(a)) {
                throw new bz("commands.setblock.noChange", new Object[0]);
            }
        }
        final akw s = e.s(a);
        if (s != null) {
            if (s instanceof og) {
                ((og)s).l();
            }
            e.a(a, afi.a.Q(), (g == afi.a) ? 2 : 4);
        }
        final alz a4 = g.a(a2);
        if (!e.a(a, a4, 2)) {
            throw new bz("commands.setblock.noChange", new Object[0]);
        }
        if (b) {
            final akw s2 = e.s(a);
            if (s2 != null) {
                a3.a("x", a.n());
                a3.a("y", a.o());
                a3.a("z", a.p());
                s2.a(a3);
            }
        }
        e.b(a, a4.c());
        \u2603.a(n.a.b, 1);
        i.a(\u2603, this, "commands.setblock.success", new Object[0]);
    }
    
    @Override
    public List<String> a(final m \u2603, final String[] \u2603, final cj \u2603) {
        if (\u2603.length > 0 && \u2603.length <= 3) {
            return i.a(\u2603, 0, \u2603);
        }
        if (\u2603.length == 4) {
            return i.a(\u2603, afh.c.c());
        }
        if (\u2603.length == 6) {
            return i.a(\u2603, "replace", "destroy", "keep");
        }
        return null;
    }
}
