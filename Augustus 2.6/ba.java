import net.minecraft.server.MinecraftServer;

// 
// Decompiled by Procyon v0.5.36
// 

public class ba extends i
{
    @Override
    public String c() {
        return "save-on";
    }
    
    @Override
    public String c(final m \u2603) {
        return "commands.save-on.usage";
    }
    
    @Override
    public void a(final m \u2603, final String[] \u2603) throws bz {
        final MinecraftServer n = MinecraftServer.N();
        boolean b = false;
        for (int i = 0; i < n.d.length; ++i) {
            if (n.d[i] != null) {
                final le le = n.d[i];
                if (le.c) {
                    le.c = false;
                    b = true;
                }
            }
        }
        if (b) {
            i.a(\u2603, this, "commands.save.enabled", new Object[0]);
            return;
        }
        throw new bz("commands.save-on.alreadyOn", new Object[0]);
    }
}
