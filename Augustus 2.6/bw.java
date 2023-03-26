import java.util.List;
import com.mojang.authlib.GameProfile;
import net.minecraft.server.MinecraftServer;

// 
// Decompiled by Procyon v0.5.36
// 

public class bw extends i
{
    @Override
    public String c() {
        return "whitelist";
    }
    
    @Override
    public int a() {
        return 3;
    }
    
    @Override
    public String c(final m \u2603) {
        return "commands.whitelist.usage";
    }
    
    @Override
    public void a(final m \u2603, final String[] \u2603) throws bz {
        if (\u2603.length < 1) {
            throw new cf("commands.whitelist.usage", new Object[0]);
        }
        final MinecraftServer n = MinecraftServer.N();
        if (\u2603[0].equals("on")) {
            n.ap().a(true);
            i.a(\u2603, this, "commands.whitelist.enabled", new Object[0]);
        }
        else if (\u2603[0].equals("off")) {
            n.ap().a(false);
            i.a(\u2603, this, "commands.whitelist.disabled", new Object[0]);
        }
        else if (\u2603[0].equals("list")) {
            \u2603.a(new fb("commands.whitelist.list", new Object[] { n.ap().l().length, n.ap().q().length }));
            final String[] l = n.ap().l();
            \u2603.a(new fa(i.a((Object[])l)));
        }
        else if (\u2603[0].equals("add")) {
            if (\u2603.length < 2) {
                throw new cf("commands.whitelist.add.usage", new Object[0]);
            }
            final GameProfile gameProfile = n.aF().a(\u2603[1]);
            if (gameProfile == null) {
                throw new bz("commands.whitelist.add.failed", new Object[] { \u2603[1] });
            }
            n.ap().d(gameProfile);
            i.a(\u2603, this, "commands.whitelist.add.success", \u2603[1]);
        }
        else if (\u2603[0].equals("remove")) {
            if (\u2603.length < 2) {
                throw new cf("commands.whitelist.remove.usage", new Object[0]);
            }
            final GameProfile gameProfile = n.ap().k().a(\u2603[1]);
            if (gameProfile == null) {
                throw new bz("commands.whitelist.remove.failed", new Object[] { \u2603[1] });
            }
            n.ap().c(gameProfile);
            i.a(\u2603, this, "commands.whitelist.remove.success", \u2603[1]);
        }
        else if (\u2603[0].equals("reload")) {
            n.ap().a();
            i.a(\u2603, this, "commands.whitelist.reloaded", new Object[0]);
        }
    }
    
    @Override
    public List<String> a(final m \u2603, final String[] \u2603, final cj \u2603) {
        if (\u2603.length == 1) {
            return i.a(\u2603, "on", "off", "list", "add", "remove", "reload");
        }
        if (\u2603.length == 2) {
            if (\u2603[0].equals("remove")) {
                return i.a(\u2603, MinecraftServer.N().ap().l());
            }
            if (\u2603[0].equals("add")) {
                return i.a(\u2603, MinecraftServer.N().aF().a());
            }
        }
        return null;
    }
}
