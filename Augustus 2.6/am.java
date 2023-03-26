import net.minecraft.server.MinecraftServer;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class am extends i
{
    @Override
    public String c() {
        return "kill";
    }
    
    @Override
    public int a() {
        return 2;
    }
    
    @Override
    public String c(final m \u2603) {
        return "commands.kill.usage";
    }
    
    @Override
    public void a(final m \u2603, final String[] \u2603) throws bz {
        if (\u2603.length == 0) {
            final wn b = i.b(\u2603);
            b.G();
            i.a(\u2603, this, "commands.kill.successful", b.f_());
            return;
        }
        final pk b2 = i.b(\u2603, \u2603[0]);
        b2.G();
        i.a(\u2603, this, "commands.kill.successful", b2.f_());
    }
    
    @Override
    public boolean b(final String[] \u2603, final int \u2603) {
        return \u2603 == 0;
    }
    
    @Override
    public List<String> a(final m \u2603, final String[] \u2603, final cj \u2603) {
        if (\u2603.length == 1) {
            return i.a(\u2603, MinecraftServer.N().K());
        }
        return null;
    }
}
