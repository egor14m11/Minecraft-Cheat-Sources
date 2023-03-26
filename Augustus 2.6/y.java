import java.util.Iterator;
import net.minecraft.server.MinecraftServer;

// 
// Decompiled by Procyon v0.5.36
// 

public class y extends ah
{
    @Override
    public String c() {
        return "defaultgamemode";
    }
    
    @Override
    public String c(final m \u2603) {
        return "commands.defaultgamemode.usage";
    }
    
    @Override
    public void a(final m \u2603, final String[] \u2603) throws bz {
        if (\u2603.length <= 0) {
            throw new cf("commands.defaultgamemode.usage", new Object[0]);
        }
        final adp.a h = this.h(\u2603, \u2603[0]);
        this.a(h);
        i.a(\u2603, this, "commands.defaultgamemode.success", new fb("gameMode." + h.b(), new Object[0]));
    }
    
    protected void a(final adp.a \u2603) {
        final MinecraftServer n = MinecraftServer.N();
        n.a(\u2603);
        if (n.ax()) {
            for (final lf lf : MinecraftServer.N().ap().v()) {
                lf.a(\u2603);
                lf.O = 0.0f;
            }
        }
    }
}
