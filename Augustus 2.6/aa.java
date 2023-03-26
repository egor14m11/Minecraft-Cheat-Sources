import java.util.List;
import net.minecraft.server.MinecraftServer;

// 
// Decompiled by Procyon v0.5.36
// 

public class aa extends i
{
    @Override
    public String c() {
        return "me";
    }
    
    @Override
    public int a() {
        return 0;
    }
    
    @Override
    public String c(final m \u2603) {
        return "commands.me.usage";
    }
    
    @Override
    public void a(final m \u2603, final String[] \u2603) throws bz {
        if (\u2603.length <= 0) {
            throw new cf("commands.me.usage", new Object[0]);
        }
        final eu b = i.b(\u2603, \u2603, 0, !(\u2603 instanceof wn));
        MinecraftServer.N().ap().a(new fb("chat.type.emote", new Object[] { \u2603.f_(), b }));
    }
    
    @Override
    public List<String> a(final m \u2603, final String[] \u2603, final cj \u2603) {
        return i.a(\u2603, MinecraftServer.N().K());
    }
}
