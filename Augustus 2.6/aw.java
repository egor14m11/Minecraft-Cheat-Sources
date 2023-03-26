import net.minecraft.server.MinecraftServer;

// 
// Decompiled by Procyon v0.5.36
// 

public class aw extends i
{
    @Override
    public String c() {
        return "publish";
    }
    
    @Override
    public String c(final m \u2603) {
        return "commands.publish.usage";
    }
    
    @Override
    public void a(final m \u2603, final String[] \u2603) throws bz {
        final String a = MinecraftServer.N().a(adp.a.b, false);
        if (a != null) {
            i.a(\u2603, this, "commands.publish.started", a);
        }
        else {
            i.a(\u2603, this, "commands.publish.failed", new Object[0]);
        }
    }
}
