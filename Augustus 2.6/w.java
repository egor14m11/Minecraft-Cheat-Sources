import java.util.List;
import com.mojang.authlib.GameProfile;
import net.minecraft.server.MinecraftServer;

// 
// Decompiled by Procyon v0.5.36
// 

public class w extends i
{
    @Override
    public String c() {
        return "deop";
    }
    
    @Override
    public int a() {
        return 3;
    }
    
    @Override
    public String c(final m \u2603) {
        return "commands.deop.usage";
    }
    
    @Override
    public void a(final m \u2603, final String[] \u2603) throws bz {
        if (\u2603.length != 1 || \u2603[0].length() <= 0) {
            throw new cf("commands.deop.usage", new Object[0]);
        }
        final MinecraftServer n = MinecraftServer.N();
        final GameProfile a = n.ap().m().a(\u2603[0]);
        if (a == null) {
            throw new bz("commands.deop.failed", new Object[] { \u2603[0] });
        }
        n.ap().b(a);
        i.a(\u2603, this, "commands.deop.success", \u2603[0]);
    }
    
    @Override
    public List<String> a(final m \u2603, final String[] \u2603, final cj \u2603) {
        if (\u2603.length == 1) {
            return i.a(\u2603, MinecraftServer.N().ap().n());
        }
        return null;
    }
}
