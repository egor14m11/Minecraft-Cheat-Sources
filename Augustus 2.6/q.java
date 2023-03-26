import java.util.Iterator;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import net.minecraft.server.MinecraftServer;
import java.util.regex.Pattern;

// 
// Decompiled by Procyon v0.5.36
// 

public class q extends i
{
    public static final Pattern a;
    
    @Override
    public String c() {
        return "ban-ip";
    }
    
    @Override
    public int a() {
        return 3;
    }
    
    @Override
    public boolean a(final m \u2603) {
        return MinecraftServer.N().ap().i().b() && super.a(\u2603);
    }
    
    @Override
    public String c(final m \u2603) {
        return "commands.banip.usage";
    }
    
    @Override
    public void a(final m \u2603, final String[] \u2603) throws bz {
        if (\u2603.length < 1 || \u2603[0].length() <= 1) {
            throw new cf("commands.banip.usage", new Object[0]);
        }
        final eu eu = (\u2603.length >= 2) ? i.a(\u2603, \u2603, 1) : null;
        final Matcher matcher = q.a.matcher(\u2603[0]);
        if (matcher.matches()) {
            this.a(\u2603, \u2603[0], (eu == null) ? null : eu.c());
        }
        else {
            final lf a = MinecraftServer.N().ap().a(\u2603[0]);
            if (a == null) {
                throw new cd("commands.banip.invalid", new Object[0]);
            }
            this.a(\u2603, a.w(), (eu == null) ? null : eu.c());
        }
    }
    
    @Override
    public List<String> a(final m \u2603, final String[] \u2603, final cj \u2603) {
        if (\u2603.length == 1) {
            return i.a(\u2603, MinecraftServer.N().K());
        }
        return null;
    }
    
    protected void a(final m \u2603, final String \u2603, final String \u2603) {
        final lv \u26032 = new lv(\u2603, null, \u2603.e_(), null, \u2603);
        ((mb<K, lv>)MinecraftServer.N().ap().i()).a(\u26032);
        final List<lf> b = MinecraftServer.N().ap().b(\u2603);
        final String[] \u26033 = new String[b.size()];
        int n = 0;
        for (final lf lf : b) {
            lf.a.c("You have been IP banned.");
            \u26033[n++] = lf.e_();
        }
        if (b.isEmpty()) {
            i.a(\u2603, this, "commands.banip.success", \u2603);
        }
        else {
            i.a(\u2603, this, "commands.banip.success.players", \u2603, i.a((Object[])\u26033));
        }
    }
    
    static {
        a = Pattern.compile("^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])$");
    }
}
