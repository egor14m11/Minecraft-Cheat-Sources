import java.util.List;
import net.minecraft.server.MinecraftServer;
import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public class bv extends i
{
    @Override
    public String c() {
        return "weather";
    }
    
    @Override
    public int a() {
        return 2;
    }
    
    @Override
    public String c(final m \u2603) {
        return "commands.weather.usage";
    }
    
    @Override
    public void a(final m \u2603, final String[] \u2603) throws bz {
        if (\u2603.length < 1 || \u2603.length > 2) {
            throw new cf("commands.weather.usage", new Object[0]);
        }
        int \u26032 = (300 + new Random().nextInt(600)) * 20;
        if (\u2603.length >= 2) {
            \u26032 = i.a(\u2603[1], 1, 1000000) * 20;
        }
        final adm adm = MinecraftServer.N().d[0];
        final ato p = adm.P();
        if ("clear".equalsIgnoreCase(\u2603[0])) {
            p.i(\u26032);
            p.g(0);
            p.f(0);
            p.b(false);
            p.a(false);
            i.a(\u2603, this, "commands.weather.clear", new Object[0]);
        }
        else if ("rain".equalsIgnoreCase(\u2603[0])) {
            p.i(0);
            p.g(\u26032);
            p.f(\u26032);
            p.b(true);
            p.a(false);
            i.a(\u2603, this, "commands.weather.rain", new Object[0]);
        }
        else {
            if (!"thunder".equalsIgnoreCase(\u2603[0])) {
                throw new cf("commands.weather.usage", new Object[0]);
            }
            p.i(0);
            p.g(\u26032);
            p.f(\u26032);
            p.b(true);
            p.a(true);
            i.a(\u2603, this, "commands.weather.thunder", new Object[0]);
        }
    }
    
    @Override
    public List<String> a(final m \u2603, final String[] \u2603, final cj \u2603) {
        if (\u2603.length == 1) {
            return i.a(\u2603, "clear", "rain", "thunder");
        }
        return null;
    }
}
