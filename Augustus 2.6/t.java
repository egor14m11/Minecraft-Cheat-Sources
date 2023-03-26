import net.minecraft.server.MinecraftServer;
import java.util.Collection;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class t extends i
{
    @Override
    public String c() {
        return "clear";
    }
    
    @Override
    public String c(final m \u2603) {
        return "commands.clear.usage";
    }
    
    @Override
    public int a() {
        return 2;
    }
    
    @Override
    public void a(final m \u2603, final String[] \u2603) throws bz {
        final lf lf = (\u2603.length == 0) ? i.b(\u2603) : i.a(\u2603, \u2603[0]);
        final zw \u26032 = (\u2603.length >= 2) ? i.f(\u2603, \u2603[1]) : null;
        final int \u26033 = (\u2603.length >= 3) ? i.a(\u2603[2], -1) : -1;
        final int \u26034 = (\u2603.length >= 4) ? i.a(\u2603[3], -1) : -1;
        dn a = null;
        if (\u2603.length >= 5) {
            try {
                a = ed.a(i.a(\u2603, 4));
            }
            catch (ec ec) {
                throw new bz("commands.clear.tagError", new Object[] { ec.getMessage() });
            }
        }
        if (\u2603.length >= 2 && \u26032 == null) {
            throw new bz("commands.clear.failure", new Object[] { lf.e_() });
        }
        final int a2 = lf.bi.a(\u26032, \u26033, \u26034, a);
        lf.bj.b();
        if (!lf.bA.d) {
            lf.o();
        }
        \u2603.a(n.a.d, a2);
        if (a2 == 0) {
            throw new bz("commands.clear.failure", new Object[] { lf.e_() });
        }
        if (\u26034 == 0) {
            \u2603.a(new fb("commands.clear.testing", new Object[] { lf.e_(), a2 }));
        }
        else {
            i.a(\u2603, this, "commands.clear.success", lf.e_(), a2);
        }
    }
    
    @Override
    public List<String> a(final m \u2603, final String[] \u2603, final cj \u2603) {
        if (\u2603.length == 1) {
            return i.a(\u2603, this.d());
        }
        if (\u2603.length == 2) {
            return i.a(\u2603, zw.e.c());
        }
        return null;
    }
    
    protected String[] d() {
        return MinecraftServer.N().K();
    }
    
    @Override
    public boolean b(final String[] \u2603, final int \u2603) {
        return \u2603 == 0;
    }
}
