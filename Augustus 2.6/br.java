import net.minecraft.server.MinecraftServer;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class br extends i
{
    @Override
    public String c() {
        return "time";
    }
    
    @Override
    public int a() {
        return 2;
    }
    
    @Override
    public String c(final m \u2603) {
        return "commands.time.usage";
    }
    
    @Override
    public void a(final m \u2603, final String[] \u2603) throws bz {
        if (\u2603.length > 1) {
            if (\u2603[0].equals("set")) {
                int n;
                if (\u2603[1].equals("day")) {
                    n = 1000;
                }
                else if (\u2603[1].equals("night")) {
                    n = 13000;
                }
                else {
                    n = i.a(\u2603[1], 0);
                }
                this.a(\u2603, n);
                i.a(\u2603, this, "commands.time.set", n);
                return;
            }
            if (\u2603[0].equals("add")) {
                final int n = i.a(\u2603[1], 0);
                this.b(\u2603, n);
                i.a(\u2603, this, "commands.time.added", n);
                return;
            }
            if (\u2603[0].equals("query")) {
                if (\u2603[1].equals("daytime")) {
                    final int n = (int)(\u2603.e().L() % 2147483647L);
                    \u2603.a(n.a.e, n);
                    i.a(\u2603, this, "commands.time.query", n);
                    return;
                }
                if (\u2603[1].equals("gametime")) {
                    final int n = (int)(\u2603.e().K() % 2147483647L);
                    \u2603.a(n.a.e, n);
                    i.a(\u2603, this, "commands.time.query", n);
                    return;
                }
            }
        }
        throw new cf("commands.time.usage", new Object[0]);
    }
    
    @Override
    public List<String> a(final m \u2603, final String[] \u2603, final cj \u2603) {
        if (\u2603.length == 1) {
            return i.a(\u2603, "set", "add", "query");
        }
        if (\u2603.length == 2 && \u2603[0].equals("set")) {
            return i.a(\u2603, "day", "night");
        }
        if (\u2603.length == 2 && \u2603[0].equals("query")) {
            return i.a(\u2603, "daytime", "gametime");
        }
        return null;
    }
    
    protected void a(final m \u2603, final int \u2603) {
        for (int i = 0; i < MinecraftServer.N().d.length; ++i) {
            MinecraftServer.N().d[i].b((long)\u2603);
        }
    }
    
    protected void b(final m \u2603, final int \u2603) {
        for (int i = 0; i < MinecraftServer.N().d.length; ++i) {
            final le le = MinecraftServer.N().d[i];
            le.b(le.L() + \u2603);
        }
    }
}
