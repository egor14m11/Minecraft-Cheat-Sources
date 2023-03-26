import net.minecraft.server.MinecraftServer;

// 
// Decompiled by Procyon v0.5.36
// 

public class bl extends i
{
    @Override
    public String c() {
        return "stop";
    }
    
    @Override
    public String c(final m \u2603) {
        return "commands.stop.usage";
    }
    
    @Override
    public void a(final m \u2603, final String[] \u2603) throws bz {
        if (MinecraftServer.N().d != null) {
            i.a(\u2603, this, "commands.stop.start", new Object[0]);
        }
        MinecraftServer.N().w();
    }
}
