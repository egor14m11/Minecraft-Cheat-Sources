import com.google.common.collect.Maps;
import net.minecraft.server.MinecraftServer;
import java.util.Collection;
import java.util.List;
import java.util.Map;

// 
// Decompiled by Procyon v0.5.36
// 

public class ax extends i
{
    private static final Map<String, Integer> a;
    
    @Override
    public String c() {
        return "replaceitem";
    }
    
    @Override
    public int a() {
        return 2;
    }
    
    @Override
    public String c(final m \u2603) {
        return "commands.replaceitem.usage";
    }
    
    @Override
    public void a(final m \u2603, final String[] \u2603) throws bz {
        if (\u2603.length < 1) {
            throw new cf("commands.replaceitem.usage", new Object[0]);
        }
        boolean b;
        if (\u2603[0].equals("entity")) {
            b = false;
        }
        else {
            if (!\u2603[0].equals("block")) {
                throw new cf("commands.replaceitem.usage", new Object[0]);
            }
            b = true;
        }
        int \u26032;
        if (b) {
            if (\u2603.length < 6) {
                throw new cf("commands.replaceitem.block.usage", new Object[0]);
            }
            \u26032 = 4;
        }
        else {
            if (\u2603.length < 4) {
                throw new cf("commands.replaceitem.entity.usage", new Object[0]);
            }
            \u26032 = 2;
        }
        final int e = this.e(\u2603[\u26032++]);
        zw f;
        try {
            f = i.f(\u2603, \u2603[\u26032]);
        }
        catch (cb cb) {
            if (afh.b(\u2603[\u26032]) != afi.a) {
                throw cb;
            }
            f = null;
        }
        ++\u26032;
        final int i = (\u2603.length > \u26032) ? i.a(\u2603[\u26032++], 1, 64) : 1;
        final int \u26033 = (\u2603.length > \u26032) ? i.a(\u2603[\u26032++]) : 0;
        zx \u26034 = new zx(f, i, \u26033);
        if (\u2603.length > \u26032) {
            final String c = i.a(\u2603, \u2603, \u26032).c();
            try {
                \u26034.d(ed.a(c));
            }
            catch (ec ec) {
                throw new bz("commands.replaceitem.tagError", new Object[] { ec.getMessage() });
            }
        }
        if (\u26034.b() == null) {
            \u26034 = null;
        }
        if (b) {
            \u2603.a(n.a.d, 0);
            final cj a = i.a(\u2603, \u2603, 1, false);
            final adm e2 = \u2603.e();
            final akw s = e2.s(a);
            if (s == null || !(s instanceof og)) {
                throw new bz("commands.replaceitem.noContainer", new Object[] { a.n(), a.o(), a.p() });
            }
            final og og = (og)s;
            if (e >= 0 && e < og.o_()) {
                og.a(e, \u26034);
            }
        }
        else {
            final pk b2 = i.b(\u2603, \u2603[1]);
            \u2603.a(n.a.d, 0);
            if (b2 instanceof wn) {
                ((wn)b2).bj.b();
            }
            if (!b2.d(e, \u26034)) {
                throw new bz("commands.replaceitem.failed", new Object[] { e, i, (\u26034 == null) ? "Air" : \u26034.C() });
            }
            if (b2 instanceof wn) {
                ((wn)b2).bj.b();
            }
        }
        \u2603.a(n.a.d, i);
        i.a(\u2603, this, "commands.replaceitem.success", e, i, (\u26034 == null) ? "Air" : \u26034.C());
    }
    
    private int e(final String \u2603) throws bz {
        if (!ax.a.containsKey(\u2603)) {
            throw new bz("commands.generic.parameter.invalid", new Object[] { \u2603 });
        }
        return ax.a.get(\u2603);
    }
    
    @Override
    public List<String> a(final m \u2603, final String[] \u2603, final cj \u2603) {
        if (\u2603.length == 1) {
            return i.a(\u2603, "entity", "block");
        }
        if (\u2603.length == 2 && \u2603[0].equals("entity")) {
            return i.a(\u2603, this.d());
        }
        if (\u2603.length >= 2 && \u2603.length <= 4 && \u2603[0].equals("block")) {
            return i.a(\u2603, 1, \u2603);
        }
        if ((\u2603.length == 3 && \u2603[0].equals("entity")) || (\u2603.length == 5 && \u2603[0].equals("block"))) {
            return i.a(\u2603, ax.a.keySet());
        }
        if ((\u2603.length == 4 && \u2603[0].equals("entity")) || (\u2603.length == 6 && \u2603[0].equals("block"))) {
            return i.a(\u2603, zw.e.c());
        }
        return null;
    }
    
    protected String[] d() {
        return MinecraftServer.N().K();
    }
    
    @Override
    public boolean b(final String[] \u2603, final int \u2603) {
        return \u2603.length > 0 && \u2603[0].equals("entity") && \u2603 == 1;
    }
    
    static {
        a = Maps.newHashMap();
        for (int i = 0; i < 54; ++i) {
            ax.a.put("slot.container." + i, i);
        }
        for (int i = 0; i < 9; ++i) {
            ax.a.put("slot.hotbar." + i, i);
        }
        for (int i = 0; i < 27; ++i) {
            ax.a.put("slot.inventory." + i, 9 + i);
        }
        for (int i = 0; i < 27; ++i) {
            ax.a.put("slot.enderchest." + i, 200 + i);
        }
        for (int i = 0; i < 8; ++i) {
            ax.a.put("slot.villager." + i, 300 + i);
        }
        for (int i = 0; i < 15; ++i) {
            ax.a.put("slot.horse." + i, 500 + i);
        }
        ax.a.put("slot.weapon", 99);
        ax.a.put("slot.armor.head", 103);
        ax.a.put("slot.armor.chest", 102);
        ax.a.put("slot.armor.legs", 101);
        ax.a.put("slot.armor.feet", 100);
        ax.a.put("slot.horse.saddle", 400);
        ax.a.put("slot.horse.armor", 401);
        ax.a.put("slot.horse.chest", 499);
    }
}
