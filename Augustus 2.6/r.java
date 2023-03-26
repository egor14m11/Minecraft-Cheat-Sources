import java.util.List;
import com.mojang.authlib.GameProfile;
import java.util.Date;
import net.minecraft.server.MinecraftServer;

// 
// Decompiled by Procyon v0.5.36
// 

public class r extends i
{
    @Override
    public String c() {
        return "ban";
    }
    
    @Override
    public int a() {
        return 3;
    }
    
    @Override
    public String c(final m \u2603) {
        return "commands.ban.usage";
    }
    
    @Override
    public boolean a(final m \u2603) {
        return MinecraftServer.N().ap().h().b() && super.a(\u2603);
    }
    
    @Override
    public void a(final m \u2603, final String[] \u2603) throws bz {
        if (\u2603.length < 1 || \u2603[0].length() <= 0) {
            throw new cf("commands.ban.usage", new Object[0]);
        }
        final MinecraftServer n = MinecraftServer.N();
        final GameProfile a = n.aF().a(\u2603[0]);
        if (a == null) {
            throw new bz("commands.ban.failed", new Object[] { \u2603[0] });
        }
        String c = null;
        if (\u2603.length >= 2) {
            c = i.a(\u2603, \u2603, 1).c();
        }
        final md \u26032 = new md(a, null, \u2603.e_(), null, c);
        ((mb<K, md>)n.ap().h()).a(\u26032);
        final lf a2 = n.ap().a(\u2603[0]);
        if (a2 != null) {
            a2.a.c("You are banned from this server.");
        }
        i.a(\u2603, this, "commands.ban.success", \u2603[0]);
    }
    
    @Override
    public List<String> a(final m \u2603, final String[] \u2603, final cj \u2603) {
        if (\u2603.length >= 1) {
            return i.a(\u2603, MinecraftServer.N().K());
        }
        return null;
    }
}
