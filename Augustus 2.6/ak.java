import java.util.Set;
import java.util.Collections;
import net.minecraft.server.MinecraftServer;
import java.util.Map;
import java.util.Arrays;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class ak extends i
{
    @Override
    public String c() {
        return "help";
    }
    
    @Override
    public int a() {
        return 0;
    }
    
    @Override
    public String c(final m \u2603) {
        return "commands.help.usage";
    }
    
    @Override
    public List<String> b() {
        return Arrays.asList("?");
    }
    
    @Override
    public void a(final m \u2603, final String[] \u2603) throws bz {
        final List<k> d = this.d(\u2603);
        final int n = 7;
        final int n2 = (d.size() - 1) / 7;
        int n3 = 0;
        try {
            n3 = ((\u2603.length == 0) ? 0 : (i.a(\u2603[0], 1, n2 + 1) - 1));
        }
        catch (cb cb) {
            final Map<String, k> d2 = this.d();
            final k k = d2.get(\u2603[0]);
            if (k != null) {
                throw new cf(k.c(\u2603), new Object[0]);
            }
            if (ns.a(\u2603[0], -1) != -1) {
                throw cb;
            }
            throw new ce();
        }
        final int min = Math.min((n3 + 1) * 7, d.size());
        final fb fb = new fb("commands.help.header", new Object[] { n3 + 1, n2 + 1 });
        fb.b().a(a.c);
        \u2603.a(fb);
        for (int i = n3 * 7; i < min; ++i) {
            final k j = d.get(i);
            final fb fb2 = new fb(j.c(\u2603), new Object[0]);
            fb2.b().a(new et(et.a.e, "/" + j.c() + " "));
            \u2603.a(fb2);
        }
        if (n3 == 0 && \u2603 instanceof wn) {
            final fb fb3 = new fb("commands.help.footer", new Object[0]);
            fb3.b().a(a.k);
            \u2603.a(fb3);
        }
    }
    
    protected List<k> d(final m \u2603) {
        final List<k> a = MinecraftServer.N().P().a(\u2603);
        Collections.sort(a);
        return a;
    }
    
    protected Map<String, k> d() {
        return MinecraftServer.N().P().a();
    }
    
    @Override
    public List<String> a(final m \u2603, final String[] \u2603, final cj \u2603) {
        if (\u2603.length == 1) {
            final Set<String> keySet = this.d().keySet();
            return i.a(\u2603, (String[])keySet.toArray(new String[keySet.size()]));
        }
        return null;
    }
}
