import java.util.List;
import net.minecraft.server.MinecraftServer;

// 
// Decompiled by Procyon v0.5.36
// 

public class bf extends i
{
    @Override
    public String c() {
        return "setworldspawn";
    }
    
    @Override
    public int a() {
        return 2;
    }
    
    @Override
    public String c(final m \u2603) {
        return "commands.setworldspawn.usage";
    }
    
    @Override
    public void a(final m \u2603, final String[] \u2603) throws bz {
        cj cj;
        if (\u2603.length == 0) {
            cj = i.b(\u2603).c();
        }
        else {
            if (\u2603.length != 3 || \u2603.e() == null) {
                throw new cf("commands.setworldspawn.usage", new Object[0]);
            }
            cj = i.a(\u2603, \u2603, 0, true);
        }
        \u2603.e().B(cj);
        MinecraftServer.N().ap().a(new ht(cj));
        i.a(\u2603, this, "commands.setworldspawn.success", cj.n(), cj.o(), cj.p());
    }
    
    @Override
    public List<String> a(final m \u2603, final String[] \u2603, final cj \u2603) {
        if (\u2603.length > 0 && \u2603.length <= 3) {
            return i.a(\u2603, 0, \u2603);
        }
        return null;
    }
}
