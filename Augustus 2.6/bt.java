import net.minecraft.server.MinecraftServer;

// 
// Decompiled by Procyon v0.5.36
// 

public class bt extends i
{
    @Override
    public String c() {
        return "toggledownfall";
    }
    
    @Override
    public int a() {
        return 2;
    }
    
    @Override
    public String c(final m \u2603) {
        return "commands.downfall.usage";
    }
    
    @Override
    public void a(final m \u2603, final String[] \u2603) throws bz {
        this.d();
        i.a(\u2603, this, "commands.downfall.success", new Object[0]);
    }
    
    protected void d() {
        final ato p = MinecraftServer.N().d[0].P();
        p.b(!p.p());
    }
}
