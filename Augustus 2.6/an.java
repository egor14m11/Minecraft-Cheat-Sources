import java.util.List;
import net.minecraft.server.MinecraftServer;

// 
// Decompiled by Procyon v0.5.36
// 

public class an extends i
{
    @Override
    public String c() {
        return "banlist";
    }
    
    @Override
    public int a() {
        return 3;
    }
    
    @Override
    public boolean a(final m \u2603) {
        return (MinecraftServer.N().ap().i().b() || MinecraftServer.N().ap().h().b()) && super.a(\u2603);
    }
    
    @Override
    public String c(final m \u2603) {
        return "commands.banlist.usage";
    }
    
    @Override
    public void a(final m \u2603, final String[] \u2603) throws bz {
        if (\u2603.length >= 1 && \u2603[0].equalsIgnoreCase("ips")) {
            \u2603.a(new fb("commands.banlist.ips", new Object[] { MinecraftServer.N().ap().i().a().length }));
            \u2603.a(new fa(i.a((Object[])MinecraftServer.N().ap().i().a())));
        }
        else {
            \u2603.a(new fb("commands.banlist.players", new Object[] { MinecraftServer.N().ap().h().a().length }));
            \u2603.a(new fa(i.a((Object[])MinecraftServer.N().ap().h().a())));
        }
    }
    
    @Override
    public List<String> a(final m \u2603, final String[] \u2603, final cj \u2603) {
        if (\u2603.length == 1) {
            return i.a(\u2603, "players", "ips");
        }
        return null;
    }
}
