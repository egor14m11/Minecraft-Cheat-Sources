import net.minecraft.server.MinecraftServer;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class ah extends i
{
    @Override
    public String c() {
        return "gamemode";
    }
    
    @Override
    public int a() {
        return 2;
    }
    
    @Override
    public String c(final m \u2603) {
        return "commands.gamemode.usage";
    }
    
    @Override
    public void a(final m \u2603, final String[] \u2603) throws bz {
        if (\u2603.length <= 0) {
            throw new cf("commands.gamemode.usage", new Object[0]);
        }
        final adp.a h = this.h(\u2603, \u2603[0]);
        final wn wn = (\u2603.length >= 2) ? i.a(\u2603, \u2603[1]) : i.b(\u2603);
        wn.a(h);
        wn.O = 0.0f;
        if (\u2603.e().Q().b("sendCommandFeedback")) {
            wn.a(new fb("gameMode.changed", new Object[0]));
        }
        final eu eu = new fb("gameMode." + h.b(), new Object[0]);
        if (wn != \u2603) {
            i.a(\u2603, this, 1, "commands.gamemode.success.other", wn.e_(), eu);
        }
        else {
            i.a(\u2603, this, 1, "commands.gamemode.success.self", eu);
        }
    }
    
    protected adp.a h(final m \u2603, final String \u2603) throws cb {
        if (\u2603.equalsIgnoreCase(adp.a.b.b()) || \u2603.equalsIgnoreCase("s")) {
            return adp.a.b;
        }
        if (\u2603.equalsIgnoreCase(adp.a.c.b()) || \u2603.equalsIgnoreCase("c")) {
            return adp.a.c;
        }
        if (\u2603.equalsIgnoreCase(adp.a.d.b()) || \u2603.equalsIgnoreCase("a")) {
            return adp.a.d;
        }
        if (\u2603.equalsIgnoreCase(adp.a.e.b()) || \u2603.equalsIgnoreCase("sp")) {
            return adp.a.e;
        }
        return adp.a(i.a(\u2603, 0, adp.a.values().length - 2));
    }
    
    @Override
    public List<String> a(final m \u2603, final String[] \u2603, final cj \u2603) {
        if (\u2603.length == 1) {
            return i.a(\u2603, "survival", "creative", "adventure", "spectator");
        }
        if (\u2603.length == 2) {
            return i.a(\u2603, this.d());
        }
        return null;
    }
    
    protected String[] d() {
        return MinecraftServer.N().K();
    }
    
    @Override
    public boolean b(final String[] \u2603, final int \u2603) {
        return \u2603 == 1;
    }
}
