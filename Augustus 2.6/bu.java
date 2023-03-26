import java.util.Iterator;
import com.google.common.collect.Lists;
import java.util.List;
import net.minecraft.server.MinecraftServer;

// 
// Decompiled by Procyon v0.5.36
// 

public class bu extends i
{
    @Override
    public String c() {
        return "trigger";
    }
    
    @Override
    public int a() {
        return 0;
    }
    
    @Override
    public String c(final m \u2603) {
        return "commands.trigger.usage";
    }
    
    @Override
    public void a(final m \u2603, final String[] \u2603) throws bz {
        if (\u2603.length < 3) {
            throw new cf("commands.trigger.usage", new Object[0]);
        }
        lf lf;
        if (\u2603 instanceof lf) {
            lf = (lf)\u2603;
        }
        else {
            final pk f = \u2603.f();
            if (!(f instanceof lf)) {
                throw new bz("commands.trigger.invalidPlayer", new Object[0]);
            }
            lf = (lf)f;
        }
        final auo z = MinecraftServer.N().a(0).Z();
        final auk b = z.b(\u2603[0]);
        if (b == null || b.c() != auu.c) {
            throw new bz("commands.trigger.invalidObjective", new Object[] { \u2603[0] });
        }
        final int a = i.a(\u2603[2]);
        if (!z.b(lf.e_(), b)) {
            throw new bz("commands.trigger.invalidObjective", new Object[] { \u2603[0] });
        }
        final aum c = z.c(lf.e_(), b);
        if (c.g()) {
            throw new bz("commands.trigger.disabled", new Object[] { \u2603[0] });
        }
        if ("set".equals(\u2603[1])) {
            c.c(a);
        }
        else {
            if (!"add".equals(\u2603[1])) {
                throw new bz("commands.trigger.invalidMode", new Object[] { \u2603[1] });
            }
            c.a(a);
        }
        c.a(true);
        if (lf.c.d()) {
            i.a(\u2603, this, "commands.trigger.success", \u2603[0], \u2603[1], \u2603[2]);
        }
    }
    
    @Override
    public List<String> a(final m \u2603, final String[] \u2603, final cj \u2603) {
        if (\u2603.length == 1) {
            final auo z = MinecraftServer.N().a(0).Z();
            final List<String> arrayList = (List<String>)Lists.newArrayList();
            for (final auk auk : z.c()) {
                if (auk.c() == auu.c) {
                    arrayList.add(auk.b());
                }
            }
            return i.a(\u2603, (String[])arrayList.toArray(new String[arrayList.size()]));
        }
        if (\u2603.length == 2) {
            return i.a(\u2603, "add", "set");
        }
        return null;
    }
}
