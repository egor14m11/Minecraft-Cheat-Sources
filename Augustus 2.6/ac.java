// 
// Decompiled by Procyon v0.5.36
// 

public class ac extends i
{
    @Override
    public String c() {
        return "entitydata";
    }
    
    @Override
    public int a() {
        return 2;
    }
    
    @Override
    public String c(final m \u2603) {
        return "commands.entitydata.usage";
    }
    
    @Override
    public void a(final m \u2603, final String[] \u2603) throws bz {
        if (\u2603.length < 2) {
            throw new cf("commands.entitydata.usage", new Object[0]);
        }
        final pk b = i.b(\u2603, \u2603[0]);
        if (b instanceof wn) {
            throw new bz("commands.entitydata.noPlayers", new Object[] { b.f_() });
        }
        final dn dn = new dn();
        b.e(dn);
        final dn \u26032 = (dn)dn.b();
        dn a;
        try {
            a = ed.a(i.a(\u2603, \u2603, 1).c());
        }
        catch (ec ec) {
            throw new bz("commands.entitydata.tagError", new Object[] { ec.getMessage() });
        }
        a.o("UUIDMost");
        a.o("UUIDLeast");
        dn.a(a);
        if (dn.equals(\u26032)) {
            throw new bz("commands.entitydata.failed", new Object[] { dn.toString() });
        }
        b.f(dn);
        i.a(\u2603, this, "commands.entitydata.success", dn.toString());
    }
    
    @Override
    public boolean b(final String[] \u2603, final int \u2603) {
        return \u2603 == 0;
    }
}
