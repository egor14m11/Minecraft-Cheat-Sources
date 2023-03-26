import java.util.Collection;
import java.util.List;
import net.minecraft.server.MinecraftServer;

// 
// Decompiled by Procyon v0.5.36
// 

public class ad extends i
{
    @Override
    public String c() {
        return "execute";
    }
    
    @Override
    public int a() {
        return 2;
    }
    
    @Override
    public String c(final m \u2603) {
        return "commands.execute.usage";
    }
    
    @Override
    public void a(final m \u2603, final String[] \u2603) throws bz {
        if (\u2603.length < 5) {
            throw new cf("commands.execute.usage", new Object[0]);
        }
        final pk a = i.a(\u2603, \u2603[0], (Class<? extends pk>)pk.class);
        final double b = i.b(a.s, \u2603[1], false);
        final double b2 = i.b(a.t, \u2603[2], false);
        final double b3 = i.b(a.u, \u2603[3], false);
        final cj cj = new cj(b, b2, b3);
        int \u26032 = 4;
        if ("detect".equals(\u2603[4]) && \u2603.length > 10) {
            final adm e = a.e();
            final double b4 = i.b(b, \u2603[5], false);
            final double b5 = i.b(b2, \u2603[6], false);
            final double b6 = i.b(b3, \u2603[7], false);
            final afh g = i.g(\u2603, \u2603[8]);
            final int a2 = i.a(\u2603[9], -1, 15);
            final cj \u26033 = new cj(b4, b5, b6);
            final alz p = e.p(\u26033);
            if (p.c() != g || (a2 >= 0 && p.c().c(p) != a2)) {
                throw new bz("commands.execute.failed", new Object[] { "detect", a.e_() });
            }
            \u26032 = 10;
        }
        final String a3 = i.a(\u2603, \u26032);
        final m m = \u2603;
        final m i = new m() {
            @Override
            public String e_() {
                return a.e_();
            }
            
            @Override
            public eu f_() {
                return a.f_();
            }
            
            @Override
            public void a(final eu \u2603) {
                m.a(\u2603);
            }
            
            @Override
            public boolean a(final int \u2603, final String \u2603) {
                return m.a(\u2603, \u2603);
            }
            
            @Override
            public cj c() {
                return cj;
            }
            
            @Override
            public aui d() {
                return new aui(b, b2, b3);
            }
            
            @Override
            public adm e() {
                return a.o;
            }
            
            @Override
            public pk f() {
                return a;
            }
            
            @Override
            public boolean u_() {
                final MinecraftServer n = MinecraftServer.N();
                return n == null || n.d[0].Q().b("commandBlockOutput");
            }
            
            @Override
            public void a(final n.a \u2603, final int \u2603) {
                a.a(\u2603, \u2603);
            }
        };
        final l p2 = MinecraftServer.N().P();
        try {
            final int a4 = p2.a(i, a3);
            if (a4 < 1) {
                throw new bz("commands.execute.allInvocationsFailed", new Object[] { a3 });
            }
        }
        catch (Throwable t) {
            throw new bz("commands.execute.failed", new Object[] { a3, a.e_() });
        }
    }
    
    @Override
    public List<String> a(final m \u2603, final String[] \u2603, final cj \u2603) {
        if (\u2603.length == 1) {
            return i.a(\u2603, MinecraftServer.N().K());
        }
        if (\u2603.length > 1 && \u2603.length <= 4) {
            return i.a(\u2603, 1, \u2603);
        }
        if (\u2603.length > 5 && \u2603.length <= 8 && "detect".equals(\u2603[4])) {
            return i.a(\u2603, 5, \u2603);
        }
        if (\u2603.length == 9 && "detect".equals(\u2603[4])) {
            return i.a(\u2603, afh.c.c());
        }
        return null;
    }
    
    @Override
    public boolean b(final String[] \u2603, final int \u2603) {
        return \u2603 == 0;
    }
}
