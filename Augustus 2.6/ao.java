import net.minecraft.server.MinecraftServer;

// 
// Decompiled by Procyon v0.5.36
// 

public class ao extends i
{
    @Override
    public String c() {
        return "list";
    }
    
    @Override
    public int a() {
        return 0;
    }
    
    @Override
    public String c(final m \u2603) {
        return "commands.players.usage";
    }
    
    @Override
    public void a(final m \u2603, final String[] \u2603) throws bz {
        final int i = MinecraftServer.N().I();
        \u2603.a(new fb("commands.players.list", new Object[] { i, MinecraftServer.N().J() }));
        \u2603.a(new fa(MinecraftServer.N().ap().b(\u2603.length > 0 && "uuids".equalsIgnoreCase(\u2603[0]))));
        \u2603.a(n.a.e, i);
    }
}
