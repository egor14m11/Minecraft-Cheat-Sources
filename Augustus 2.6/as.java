import java.util.List;
import java.util.regex.Matcher;
import net.minecraft.server.MinecraftServer;

// 
// Decompiled by Procyon v0.5.36
// 

public class as extends i
{
    @Override
    public String c() {
        return "pardon-ip";
    }
    
    @Override
    public int a() {
        return 3;
    }
    
    @Override
    public boolean a(final m \u2603) {
        return MinecraftServer.N().ap().i().b() && super.a(\u2603);
    }
    
    @Override
    public String c(final m \u2603) {
        return "commands.unbanip.usage";
    }
    
    @Override
    public void a(final m \u2603, final String[] \u2603) throws bz {
        if (\u2603.length != 1 || \u2603[0].length() <= 1) {
            throw new cf("commands.unbanip.usage", new Object[0]);
        }
        final Matcher matcher = q.a.matcher(\u2603[0]);
        if (matcher.matches()) {
            ((mb<String, V>)MinecraftServer.N().ap().i()).c(\u2603[0]);
            i.a(\u2603, this, "commands.unbanip.success", \u2603[0]);
            return;
        }
        throw new cc("commands.unbanip.invalid", new Object[0]);
    }
    
    @Override
    public List<String> a(final m \u2603, final String[] \u2603, final cj \u2603) {
        if (\u2603.length == 1) {
            return i.a(\u2603, MinecraftServer.N().ap().i().a());
        }
        return null;
    }
}
