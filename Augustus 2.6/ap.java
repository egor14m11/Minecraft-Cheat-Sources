import net.minecraft.server.MinecraftServer;
import java.util.Arrays;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class ap extends i
{
    @Override
    public List<String> b() {
        return Arrays.asList("w", "msg");
    }
    
    @Override
    public String c() {
        return "tell";
    }
    
    @Override
    public int a() {
        return 0;
    }
    
    @Override
    public String c(final m \u2603) {
        return "commands.message.usage";
    }
    
    @Override
    public void a(final m \u2603, final String[] \u2603) throws bz {
        if (\u2603.length < 2) {
            throw new cf("commands.message.usage", new Object[0]);
        }
        final wn a = i.a(\u2603, \u2603[0]);
        if (a == \u2603) {
            throw new cd("commands.message.sameTarget", new Object[0]);
        }
        final eu b = i.b(\u2603, \u2603, 1, !(\u2603 instanceof wn));
        final fb \u26032 = new fb("commands.message.display.incoming", new Object[] { \u2603.f_(), b.f() });
        final fb fb = new fb("commands.message.display.outgoing", new Object[] { a.f_(), b.f() });
        \u26032.b().a(a.h).b(true);
        fb.b().a(a.h).b(true);
        a.a(\u26032);
        \u2603.a(fb);
    }
    
    @Override
    public List<String> a(final m \u2603, final String[] \u2603, final cj \u2603) {
        return i.a(\u2603, MinecraftServer.N().K());
    }
    
    @Override
    public boolean b(final String[] \u2603, final int \u2603) {
        return \u2603 == 0;
    }
}
