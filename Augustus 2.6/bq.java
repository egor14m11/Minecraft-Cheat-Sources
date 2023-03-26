import net.minecraft.server.MinecraftServer;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class bq extends i
{
    @Override
    public String c() {
        return "testfor";
    }
    
    @Override
    public int a() {
        return 2;
    }
    
    @Override
    public String c(final m \u2603) {
        return "commands.testfor.usage";
    }
    
    @Override
    public void a(final m \u2603, final String[] \u2603) throws bz {
        if (\u2603.length < 1) {
            throw new cf("commands.testfor.usage", new Object[0]);
        }
        final pk b = i.b(\u2603, \u2603[0]);
        dn a = null;
        if (\u2603.length >= 2) {
            try {
                a = ed.a(i.a(\u2603, 1));
            }
            catch (ec ec) {
                throw new bz("commands.testfor.tagError", new Object[] { ec.getMessage() });
            }
        }
        if (a != null) {
            final dn dn = new dn();
            b.e(dn);
            if (!dy.a(a, dn, true)) {
                throw new bz("commands.testfor.failure", new Object[] { b.e_() });
            }
        }
        i.a(\u2603, this, "commands.testfor.success", b.e_());
    }
    
    @Override
    public boolean b(final String[] \u2603, final int \u2603) {
        return \u2603 == 0;
    }
    
    @Override
    public List<String> a(final m \u2603, final String[] \u2603, final cj \u2603) {
        if (\u2603.length == 1) {
            return i.a(\u2603, MinecraftServer.N().K());
        }
        return null;
    }
}
