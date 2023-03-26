import net.minecraft.server.MinecraftServer;
import java.util.Collection;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class ab extends i
{
    @Override
    public String c() {
        return "enchant";
    }
    
    @Override
    public int a() {
        return 2;
    }
    
    @Override
    public String c(final m \u2603) {
        return "commands.enchant.usage";
    }
    
    @Override
    public void a(final m \u2603, final String[] \u2603) throws bz {
        if (\u2603.length < 2) {
            throw new cf("commands.enchant.usage", new Object[0]);
        }
        final wn a = i.a(\u2603, \u2603[0]);
        \u2603.a(n.a.d, 0);
        int n;
        try {
            n = i.a(\u2603[1], 0);
        }
        catch (cb cb) {
            final aci b = aci.b(\u2603[1]);
            if (b == null) {
                throw cb;
            }
            n = b.B;
        }
        int a2 = 1;
        final zx bz = a.bZ();
        if (bz == null) {
            throw new bz("commands.enchant.noItem", new Object[0]);
        }
        final aci c = aci.c(n);
        if (c == null) {
            throw new cb("commands.enchant.notFound", new Object[] { n });
        }
        if (!c.a(bz)) {
            throw new bz("commands.enchant.cantEnchant", new Object[0]);
        }
        if (\u2603.length >= 3) {
            a2 = i.a(\u2603[2], c.e(), c.b());
        }
        if (bz.n()) {
            final du p = bz.p();
            if (p != null) {
                for (int i = 0; i < p.c(); ++i) {
                    final int e = p.b(i).e("id");
                    if (aci.c(e) != null) {
                        final aci c2 = aci.c(e);
                        if (!c2.a(c)) {
                            throw new bz("commands.enchant.cantCombine", new Object[] { c.d(a2), c2.d(p.b(i).e("lvl")) });
                        }
                    }
                }
            }
        }
        bz.a(c, a2);
        i.a(\u2603, this, "commands.enchant.success", new Object[0]);
        \u2603.a(n.a.d, 1);
    }
    
    @Override
    public List<String> a(final m \u2603, final String[] \u2603, final cj \u2603) {
        if (\u2603.length == 1) {
            return i.a(\u2603, this.d());
        }
        if (\u2603.length == 2) {
            return i.a(\u2603, aci.c());
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
