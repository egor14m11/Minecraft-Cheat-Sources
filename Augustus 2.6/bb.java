import java.util.List;
import net.minecraft.server.MinecraftServer;

// 
// Decompiled by Procyon v0.5.36
// 

public class bb extends i
{
    @Override
    public String c() {
        return "say";
    }
    
    @Override
    public int a() {
        return 1;
    }
    
    @Override
    public String c(final m \u2603) {
        return "commands.say.usage";
    }
    
    @Override
    public void a(final m \u2603, final String[] \u2603) throws bz {
        if (\u2603.length <= 0 || \u2603[0].length() <= 0) {
            throw new cf("commands.say.usage", new Object[0]);
        }
        final eu b = i.b(\u2603, \u2603, 0, true);
        MinecraftServer.N().ap().a(new fb("chat.type.announcement", new Object[] { \u2603.f_(), b }));
    }
    
    @Override
    public List<String> a(final m \u2603, final String[] \u2603, final cj \u2603) {
        if (\u2603.length >= 1) {
            return i.a(\u2603, MinecraftServer.N().K());
        }
        return null;
    }
}
