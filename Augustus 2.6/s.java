import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class s extends i
{
    @Override
    public String c() {
        return "blockdata";
    }
    
    @Override
    public int a() {
        return 2;
    }
    
    @Override
    public String c(final m \u2603) {
        return "commands.blockdata.usage";
    }
    
    @Override
    public void a(final m \u2603, final String[] \u2603) throws bz {
        if (\u2603.length < 4) {
            throw new cf("commands.blockdata.usage", new Object[0]);
        }
        \u2603.a(n.a.b, 0);
        final cj a = i.a(\u2603, \u2603, 0, false);
        final adm e = \u2603.e();
        if (!e.e(a)) {
            throw new bz("commands.blockdata.outOfWorld", new Object[0]);
        }
        final akw s = e.s(a);
        if (s == null) {
            throw new bz("commands.blockdata.notValid", new Object[0]);
        }
        final dn dn = new dn();
        s.b(dn);
        final dn \u26032 = (dn)dn.b();
        dn a2;
        try {
            a2 = ed.a(i.a(\u2603, \u2603, 3).c());
        }
        catch (ec ec) {
            throw new bz("commands.blockdata.tagError", new Object[] { ec.getMessage() });
        }
        dn.a(a2);
        dn.a("x", a.n());
        dn.a("y", a.o());
        dn.a("z", a.p());
        if (dn.equals(\u26032)) {
            throw new bz("commands.blockdata.failed", new Object[] { dn.toString() });
        }
        s.a(dn);
        s.p_();
        e.h(a);
        \u2603.a(n.a.b, 1);
        i.a(\u2603, this, "commands.blockdata.success", dn.toString());
    }
    
    @Override
    public List<String> a(final m \u2603, final String[] \u2603, final cj \u2603) {
        if (\u2603.length > 0 && \u2603.length <= 3) {
            return i.a(\u2603, 0, \u2603);
        }
        return null;
    }
}
