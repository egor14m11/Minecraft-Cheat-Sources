import net.minecraft.server.MinecraftServer;
import java.util.List;
import java.util.Set;
import java.util.EnumSet;

// 
// Decompiled by Procyon v0.5.36
// 

public class bn extends i
{
    @Override
    public String c() {
        return "tp";
    }
    
    @Override
    public int a() {
        return 2;
    }
    
    @Override
    public String c(final m \u2603) {
        return "commands.tp.usage";
    }
    
    @Override
    public void a(final m \u2603, final String[] \u2603) throws bz {
        if (\u2603.length < 1) {
            throw new cf("commands.tp.usage", new Object[0]);
        }
        int n = 0;
        pk pk;
        if (\u2603.length == 2 || \u2603.length == 4 || \u2603.length == 6) {
            pk = i.b(\u2603, \u2603[0]);
            n = 1;
        }
        else {
            pk = i.b(\u2603);
        }
        if (\u2603.length == 1 || \u2603.length == 2) {
            final pk b = i.b(\u2603, \u2603[\u2603.length - 1]);
            if (b.o != pk.o) {
                throw new bz("commands.tp.notSameDimension", new Object[0]);
            }
            pk.a((pk)null);
            if (pk instanceof lf) {
                ((lf)pk).a.a(b.s, b.t, b.u, b.y, b.z);
            }
            else {
                pk.b(b.s, b.t, b.u, b.y, b.z);
            }
            i.a(\u2603, this, "commands.tp.success", pk.e_(), b.e_());
        }
        else {
            if (\u2603.length < n + 3) {
                throw new cf("commands.tp.usage", new Object[0]);
            }
            if (pk.o == null) {
                return;
            }
            int n2 = n;
            final a a = i.a(pk.s, \u2603[n2++], true);
            final a a2 = i.a(pk.t, \u2603[n2++], 0, 0, false);
            final a a3 = i.a(pk.u, \u2603[n2++], true);
            final a a4 = i.a(pk.y, (\u2603.length > n2) ? \u2603[n2++] : "~", false);
            final a a5 = i.a(pk.z, (\u2603.length > n2) ? \u2603[n2] : "~", false);
            if (pk instanceof lf) {
                final Set<fi.a> none = EnumSet.noneOf(fi.a.class);
                if (a.c()) {
                    none.add(fi.a.a);
                }
                if (a2.c()) {
                    none.add(fi.a.b);
                }
                if (a3.c()) {
                    none.add(fi.a.c);
                }
                if (a5.c()) {
                    none.add(fi.a.e);
                }
                if (a4.c()) {
                    none.add(fi.a.d);
                }
                float n3 = (float)a4.b();
                if (!a4.c()) {
                    n3 = ns.g(n3);
                }
                float n4 = (float)a5.b();
                if (!a5.c()) {
                    n4 = ns.g(n4);
                }
                if (n4 > 90.0f || n4 < -90.0f) {
                    n4 = ns.g(180.0f - n4);
                    n3 = ns.g(n3 + 180.0f);
                }
                pk.a((pk)null);
                ((lf)pk).a.a(a.b(), a2.b(), a3.b(), n3, n4, none);
                pk.f(n3);
            }
            else {
                float g = (float)ns.g(a4.a());
                float n3 = (float)ns.g(a5.a());
                if (n3 > 90.0f || n3 < -90.0f) {
                    n3 = ns.g(180.0f - n3);
                    g = ns.g(g + 180.0f);
                }
                pk.b(a.a(), a2.a(), a3.a(), g, n3);
                pk.f(g);
            }
            i.a(\u2603, this, "commands.tp.success.coordinates", pk.e_(), a.a(), a2.a(), a3.a());
        }
    }
    
    @Override
    public List<String> a(final m \u2603, final String[] \u2603, final cj \u2603) {
        if (\u2603.length == 1 || \u2603.length == 2) {
            return i.a(\u2603, MinecraftServer.N().K());
        }
        return null;
    }
    
    @Override
    public boolean b(final String[] \u2603, final int \u2603) {
        return \u2603 == 0;
    }
}
