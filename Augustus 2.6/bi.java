import net.minecraft.server.MinecraftServer;

// 
// Decompiled by Procyon v0.5.36
// 

public class bi extends i
{
    @Override
    public boolean a(final m \u2603) {
        return MinecraftServer.N().T() || super.a(\u2603);
    }
    
    @Override
    public String c() {
        return "seed";
    }
    
    @Override
    public int a() {
        return 2;
    }
    
    @Override
    public String c(final m \u2603) {
        return "commands.seed.usage";
    }
    
    @Override
    public void a(final m \u2603, final String[] \u2603) throws bz {
        final adm adm = (\u2603 instanceof wn) ? ((wn)\u2603).o : MinecraftServer.N().a(0);
        \u2603.a(new fb("commands.seed.success", new Object[] { adm.J() }));
    }
}
