import java.util.Iterator;
import com.google.common.collect.Lists;
import net.minecraft.server.MinecraftServer;
import java.util.Collection;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class bk extends i
{
    @Override
    public String c() {
        return "stats";
    }
    
    @Override
    public int a() {
        return 2;
    }
    
    @Override
    public String c(final m \u2603) {
        return "commands.stats.usage";
    }
    
    @Override
    public void a(final m \u2603, final String[] \u2603) throws bz {
        if (\u2603.length < 1) {
            throw new cf("commands.stats.usage", new Object[0]);
        }
        boolean b;
        if (\u2603[0].equals("entity")) {
            b = false;
        }
        else {
            if (!\u2603[0].equals("block")) {
                throw new cf("commands.stats.usage", new Object[0]);
            }
            b = true;
        }
        int n;
        if (b) {
            if (\u2603.length < 5) {
                throw new cf("commands.stats.block.usage", new Object[0]);
            }
            n = 4;
        }
        else {
            if (\u2603.length < 3) {
                throw new cf("commands.stats.entity.usage", new Object[0]);
            }
            n = 2;
        }
        final String s = \u2603[n++];
        if ("set".equals(s)) {
            if (\u2603.length < n + 3) {
                if (n == 5) {
                    throw new cf("commands.stats.block.set.usage", new Object[0]);
                }
                throw new cf("commands.stats.entity.set.usage", new Object[0]);
            }
        }
        else {
            if (!"clear".equals(s)) {
                throw new cf("commands.stats.usage", new Object[0]);
            }
            if (\u2603.length < n + 1) {
                if (n == 5) {
                    throw new cf("commands.stats.block.clear.usage", new Object[0]);
                }
                throw new cf("commands.stats.entity.clear.usage", new Object[0]);
            }
        }
        final n.a a = n.a.a(\u2603[n++]);
        if (a == null) {
            throw new bz("commands.stats.failed", new Object[0]);
        }
        final adm e = \u2603.e();
        n n2;
        if (b) {
            final cj cj = i.a(\u2603, \u2603, 1, false);
            final akw akw = e.s(cj);
            if (akw == null) {
                throw new bz("commands.stats.noCompatibleBlock", new Object[] { cj.n(), cj.o(), cj.p() });
            }
            if (akw instanceof akz) {
                n2 = ((akz)akw).c();
            }
            else {
                if (!(akw instanceof aln)) {
                    throw new bz("commands.stats.noCompatibleBlock", new Object[] { cj.n(), cj.o(), cj.p() });
                }
                n2 = ((aln)akw).d();
            }
        }
        else {
            final pk b2 = i.b(\u2603, \u2603[1]);
            n2 = b2.aU();
        }
        if ("set".equals(s)) {
            final String \u26032 = \u2603[n++];
            final String \u26033 = \u2603[n];
            if (\u26032.length() == 0 || \u26033.length() == 0) {
                throw new bz("commands.stats.failed", new Object[0]);
            }
            n.a(n2, a, \u26032, \u26033);
            i.a(\u2603, this, "commands.stats.success", a.b(), \u26033, \u26032);
        }
        else if ("clear".equals(s)) {
            n.a(n2, a, null, null);
            i.a(\u2603, this, "commands.stats.cleared", a.b());
        }
        if (b) {
            final cj cj = i.a(\u2603, \u2603, 1, false);
            final akw akw = e.s(cj);
            akw.p_();
        }
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
            return i.a(\u2603, "set", "clear");
        }
        if ((\u2603.length == 4 && \u2603[0].equals("entity")) || (\u2603.length == 6 && \u2603[0].equals("block"))) {
            return i.a(\u2603, n.a.c());
        }
        if ((\u2603.length == 6 && \u2603[0].equals("entity")) || (\u2603.length == 8 && \u2603[0].equals("block"))) {
            return i.a(\u2603, this.e());
        }
        return null;
    }
    
    protected String[] d() {
        return MinecraftServer.N().K();
    }
    
    protected List<String> e() {
        final Collection<auk> c = MinecraftServer.N().a(0).Z().c();
        final List<String> arrayList = (List<String>)Lists.newArrayList();
        for (final auk auk : c) {
            if (!auk.c().b()) {
                arrayList.add(auk.b());
            }
        }
        return arrayList;
    }
    
    @Override
    public boolean b(final String[] \u2603, final int \u2603) {
        return \u2603.length > 0 && \u2603[0].equals("entity") && \u2603 == 1;
    }
}
