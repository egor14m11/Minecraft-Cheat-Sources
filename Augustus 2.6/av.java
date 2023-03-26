import net.minecraft.server.MinecraftServer;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class av extends i
{
    @Override
    public String c() {
        return "playsound";
    }
    
    @Override
    public int a() {
        return 2;
    }
    
    @Override
    public String c(final m \u2603) {
        return "commands.playsound.usage";
    }
    
    @Override
    public void a(final m \u2603, final String[] \u2603) throws bz {
        if (\u2603.length < 2) {
            throw new cf(this.c(\u2603), new Object[0]);
        }
        int n = 0;
        final String \u26032 = \u2603[n++];
        final lf a = i.a(\u2603, \u2603[n++]);
        final aui d = \u2603.d();
        double \u26033 = d.a;
        if (\u2603.length > n) {
            \u26033 = i.b(\u26033, \u2603[n++], true);
        }
        double \u26034 = d.b;
        if (\u2603.length > n) {
            \u26034 = i.b(\u26034, \u2603[n++], 0, 0, false);
        }
        double \u26035 = d.c;
        if (\u2603.length > n) {
            \u26035 = i.b(\u26035, \u2603[n++], true);
        }
        double a2 = 1.0;
        if (\u2603.length > n) {
            a2 = i.a(\u2603[n++], 0.0, 3.4028234663852886E38);
        }
        double a3 = 1.0;
        if (\u2603.length > n) {
            a3 = i.a(\u2603[n++], 0.0, 2.0);
        }
        double a4 = 0.0;
        if (\u2603.length > n) {
            a4 = i.a(\u2603[n], 0.0, 1.0);
        }
        final double n2 = (a2 > 1.0) ? (a2 * 16.0) : 16.0;
        final double f = a.f(\u26033, \u26034, \u26035);
        if (f > n2) {
            if (a4 <= 0.0) {
                throw new bz("commands.playsound.playerTooFar", new Object[] { a.e_() });
            }
            final double n3 = \u26033 - a.s;
            final double n4 = \u26034 - a.t;
            final double n5 = \u26035 - a.u;
            final double sqrt = Math.sqrt(n3 * n3 + n4 * n4 + n5 * n5);
            if (sqrt > 0.0) {
                \u26033 = a.s + n3 / sqrt * 2.0;
                \u26034 = a.t + n4 / sqrt * 2.0;
                \u26035 = a.u + n5 / sqrt * 2.0;
            }
            a2 = a4;
        }
        a.a.a(new gs(\u26032, \u26033, \u26034, \u26035, (float)a2, (float)a3));
        i.a(\u2603, this, "commands.playsound.success", \u26032, a.e_());
    }
    
    @Override
    public List<String> a(final m \u2603, final String[] \u2603, final cj \u2603) {
        if (\u2603.length == 2) {
            return i.a(\u2603, MinecraftServer.N().K());
        }
        if (\u2603.length > 2 && \u2603.length <= 5) {
            return i.a(\u2603, 2, \u2603);
        }
        return null;
    }
    
    @Override
    public boolean b(final String[] \u2603, final int \u2603) {
        return \u2603 == 1;
    }
}
