import java.util.List;
import net.minecraft.server.MinecraftServer;

// 
// Decompiled by Procyon v0.5.36
// 

public class al extends i
{
    @Override
    public String c() {
        return "kick";
    }
    
    @Override
    public int a() {
        return 3;
    }
    
    @Override
    public String c(final m \u2603) {
        return "commands.kick.usage";
    }
    
    @Override
    public void a(final m \u2603, final String[] \u2603) throws bz {
        if (\u2603.length <= 0 || \u2603[0].length() <= 1) {
            throw new cf("commands.kick.usage", new Object[0]);
        }
        final lf a = MinecraftServer.N().ap().a(\u2603[0]);
        String c = "Kicked by an operator.";
        boolean b = false;
        if (a == null) {
            throw new cd();
        }
        if (\u2603.length >= 2) {
            c = i.a(\u2603, \u2603, 1).c();
            b = true;
        }
        a.a.c(c);
        if (b) {
            i.a(\u2603, this, "commands.kick.success.reason", a.e_(), c);
        }
        else {
            i.a(\u2603, this, "commands.kick.success", a.e_());
        }
    }
    
    @Override
    public List<String> a(final m \u2603, final String[] \u2603, final cj \u2603) {
        if (\u2603.length >= 1) {
            return i.a(\u2603, MinecraftServer.N().K());
        }
        return null;
    }
}
