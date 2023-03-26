import java.util.List;
import java.util.Iterator;
import net.minecraft.server.MinecraftServer;

// 
// Decompiled by Procyon v0.5.36
// 

public class ai extends i
{
    @Override
    public String c() {
        return "gamerule";
    }
    
    @Override
    public int a() {
        return 2;
    }
    
    @Override
    public String c(final m \u2603) {
        return "commands.gamerule.usage";
    }
    
    @Override
    public void a(final m \u2603, final String[] \u2603) throws bz {
        final adk d = this.d();
        final String \u26032 = (\u2603.length > 0) ? \u2603[0] : "";
        final String \u26033 = (\u2603.length > 1) ? i.a(\u2603, 1) : "";
        switch (\u2603.length) {
            case 1: {
                if (d.e(\u26032)) {
                    final String a = d.a(\u26032);
                    \u2603.a(new fa(\u26032).a(" = ").a(a));
                    \u2603.a(n.a.e, d.c(\u26032));
                    break;
                }
                throw new bz("commands.gamerule.norule", new Object[] { \u26032 });
            }
            case 0: {
                \u2603.a(new fa(i.a((Object[])d.b())));
                break;
            }
            default: {
                if (d.a(\u26032, adk.b.b) && !"true".equals(\u26033) && !"false".equals(\u26033)) {
                    throw new bz("commands.generic.boolean.invalid", new Object[] { \u26033 });
                }
                d.a(\u26032, \u26033);
                a(d, \u26032);
                i.a(\u2603, this, "commands.gamerule.success", new Object[0]);
                break;
            }
        }
    }
    
    public static void a(final adk \u2603, final String \u2603) {
        if ("reducedDebugInfo".equals(\u2603)) {
            final byte \u26032 = (byte)(\u2603.b(\u2603) ? 22 : 23);
            for (final lf \u26033 : MinecraftServer.N().ap().v()) {
                \u26033.a.a(new gi(\u26033, \u26032));
            }
        }
    }
    
    @Override
    public List<String> a(final m \u2603, final String[] \u2603, final cj \u2603) {
        if (\u2603.length == 1) {
            return i.a(\u2603, this.d().b());
        }
        if (\u2603.length == 2) {
            final adk d = this.d();
            if (d.a(\u2603[0], adk.b.b)) {
                return i.a(\u2603, "true", "false");
            }
        }
        return null;
    }
    
    private adk d() {
        return MinecraftServer.N().a(0).Q();
    }
}
