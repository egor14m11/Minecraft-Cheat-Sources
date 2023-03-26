import net.minecraft.server.MinecraftServer;
import java.util.Collection;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class aj extends i
{
    @Override
    public String c() {
        return "give";
    }
    
    @Override
    public int a() {
        return 2;
    }
    
    @Override
    public String c(final m \u2603) {
        return "commands.give.usage";
    }
    
    @Override
    public void a(final m \u2603, final String[] \u2603) throws bz {
        if (\u2603.length < 2) {
            throw new cf("commands.give.usage", new Object[0]);
        }
        final wn a = i.a(\u2603, \u2603[0]);
        final zw f = i.f(\u2603, \u2603[1]);
        final int n = (\u2603.length >= 3) ? i.a(\u2603[2], 1, 64) : 1;
        final int \u26032 = (\u2603.length >= 4) ? i.a(\u2603[3]) : 0;
        final zx \u26033 = new zx(f, n, \u26032);
        if (\u2603.length >= 5) {
            final String c = i.a(\u2603, \u2603, 4).c();
            try {
                \u26033.d(ed.a(c));
            }
            catch (ec ec) {
                throw new bz("commands.give.tagError", new Object[] { ec.getMessage() });
            }
        }
        final boolean a2 = a.bi.a(\u26033);
        if (a2) {
            a.o.a((pk)a, "random.pop", 0.2f, ((a.bc().nextFloat() - a.bc().nextFloat()) * 0.7f + 1.0f) * 2.0f);
            a.bj.b();
        }
        if (!a2 || \u26033.b > 0) {
            \u2603.a(n.a.d, n - \u26033.b);
            final uz uz = a.a(\u26033, false);
            if (uz != null) {
                uz.q();
                uz.b(a.e_());
            }
        }
        else {
            \u26033.b = 1;
            \u2603.a(n.a.d, n);
            final uz uz = a.a(\u26033, false);
            if (uz != null) {
                uz.v();
            }
        }
        i.a(\u2603, this, "commands.give.success", \u26033.C(), n, a.e_());
    }
    
    @Override
    public List<String> a(final m \u2603, final String[] \u2603, final cj \u2603) {
        if (\u2603.length == 1) {
            return i.a(\u2603, this.d());
        }
        if (\u2603.length == 2) {
            return i.a(\u2603, zw.e.c());
        }
        return null;
    }
    
    protected String[] d() {
        return MinecraftServer.N().K();
    }
    
    @Override
    public boolean b(final String[] \u2603, final int \u2603) {
        return \u2603 == 0;
    }
}
