import net.minecraft.server.MinecraftServer;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class bh extends i
{
    @Override
    public String c() {
        return "spawnpoint";
    }
    
    @Override
    public int a() {
        return 2;
    }
    
    @Override
    public String c(final m \u2603) {
        return "commands.spawnpoint.usage";
    }
    
    @Override
    public void a(final m \u2603, final String[] \u2603) throws bz {
        if (\u2603.length > 1 && \u2603.length < 4) {
            throw new cf("commands.spawnpoint.usage", new Object[0]);
        }
        final lf lf = (\u2603.length > 0) ? i.a(\u2603, \u2603[0]) : i.b(\u2603);
        final cj \u26032 = (\u2603.length > 3) ? i.a(\u2603, \u2603, 1, true) : lf.c();
        if (lf.o != null) {
            lf.a(\u26032, true);
            i.a(\u2603, this, "commands.spawnpoint.success", lf.e_(), \u26032.n(), \u26032.o(), \u26032.p());
        }
    }
    
    @Override
    public List<String> a(final m \u2603, final String[] \u2603, final cj \u2603) {
        if (\u2603.length == 1) {
            return i.a(\u2603, MinecraftServer.N().K());
        }
        if (\u2603.length > 1 && \u2603.length <= 4) {
            return i.a(\u2603, 1, \u2603);
        }
        return null;
    }
    
    @Override
    public boolean b(final String[] \u2603, final int \u2603) {
        return \u2603 == 0;
    }
}
