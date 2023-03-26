import net.minecraft.server.MinecraftServer;

// 
// Decompiled by Procyon v0.5.36
// 

public class bg extends i
{
    @Override
    public String c() {
        return "setidletimeout";
    }
    
    @Override
    public int a() {
        return 3;
    }
    
    @Override
    public String c(final m \u2603) {
        return "commands.setidletimeout.usage";
    }
    
    @Override
    public void a(final m \u2603, final String[] \u2603) throws bz {
        if (\u2603.length != 1) {
            throw new cf("commands.setidletimeout.usage", new Object[0]);
        }
        final int a = i.a(\u2603[0], 0);
        MinecraftServer.N().d(a);
        i.a(\u2603, this, "commands.setidletimeout.success", a);
    }
}
