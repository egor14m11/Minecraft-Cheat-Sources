import net.minecraft.server.MinecraftServer;

// 
// Decompiled by Procyon v0.5.36
// 

public class ay extends i
{
    @Override
    public String c() {
        return "save-all";
    }
    
    @Override
    public String c(final m \u2603) {
        return "commands.save.usage";
    }
    
    @Override
    public void a(final m \u2603, final String[] \u2603) throws bz {
        final MinecraftServer n = MinecraftServer.N();
        \u2603.a(new fb("commands.save.start", new Object[0]));
        if (n.ap() != null) {
            n.ap().j();
        }
        try {
            for (int i = 0; i < n.d.length; ++i) {
                if (n.d[i] != null) {
                    final le le = n.d[i];
                    final boolean b = le.c;
                    le.c = false;
                    le.a(true, null);
                    le.c = b;
                }
            }
            if (\u2603.length > 0 && "flush".equals(\u2603[0])) {
                \u2603.a(new fb("commands.save.flushStart", new Object[0]));
                for (int i = 0; i < n.d.length; ++i) {
                    if (n.d[i] != null) {
                        final le le = n.d[i];
                        final boolean b = le.c;
                        le.c = false;
                        le.n();
                        le.c = b;
                    }
                }
                \u2603.a(new fb("commands.save.flushEnd", new Object[0]));
            }
        }
        catch (adn adn) {
            i.a(\u2603, this, "commands.save.failed", adn.getMessage());
            return;
        }
        i.a(\u2603, this, "commands.save.success", new Object[0]);
    }
}
