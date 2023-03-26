import net.minecraft.server.MinecraftServer;
import java.util.Collection;
import java.util.List;
import java.util.Iterator;
import com.google.common.collect.Iterators;
import com.google.common.base.Predicate;
import com.google.common.collect.Lists;

// 
// Decompiled by Procyon v0.5.36
// 

public class p extends i
{
    @Override
    public String c() {
        return "achievement";
    }
    
    @Override
    public int a() {
        return 2;
    }
    
    @Override
    public String c(final m \u2603) {
        return "commands.achievement.usage";
    }
    
    @Override
    public void a(final m \u2603, final String[] \u2603) throws bz {
        if (\u2603.length < 2) {
            throw new cf("commands.achievement.usage", new Object[0]);
        }
        final mw a = na.a(\u2603[1]);
        if (a == null && !\u2603[1].equals("*")) {
            throw new bz("commands.achievement.unknownAchievement", new Object[] { \u2603[1] });
        }
        final lf lf = (\u2603.length >= 3) ? i.a(\u2603, \u2603[2]) : i.b(\u2603);
        final boolean equalsIgnoreCase = \u2603[0].equalsIgnoreCase("give");
        final boolean equalsIgnoreCase2 = \u2603[0].equalsIgnoreCase("take");
        if (!equalsIgnoreCase && !equalsIgnoreCase2) {
            return;
        }
        if (a == null) {
            if (equalsIgnoreCase) {
                for (final mq mq : mr.e) {
                    lf.b(mq);
                }
                i.a(\u2603, this, "commands.achievement.give.success.all", lf.e_());
            }
            else if (equalsIgnoreCase2) {
                for (final mq mq : Lists.reverse(mr.e)) {
                    lf.a(mq);
                }
                i.a(\u2603, this, "commands.achievement.take.success.all", lf.e_());
            }
            return;
        }
        if (a instanceof mq) {
            mq c = (mq)a;
            if (equalsIgnoreCase) {
                if (lf.A().a(c)) {
                    throw new bz("commands.achievement.alreadyHave", new Object[] { lf.e_(), a.j() });
                }
                final List<mq> list = (List<mq>)Lists.newArrayList();
                while (c.c != null && !lf.A().a(c.c)) {
                    list.add(c.c);
                    c = c.c;
                }
                for (final mq \u26032 : Lists.reverse(list)) {
                    lf.b(\u26032);
                }
            }
            else if (equalsIgnoreCase2) {
                if (!lf.A().a(c)) {
                    throw new bz("commands.achievement.dontHave", new Object[] { lf.e_(), a.j() });
                }
                final List<mq> list = (List<mq>)Lists.newArrayList((Iterator<?>)Iterators.filter(mr.e.iterator(), new Predicate<mq>() {
                    public boolean a(final mq \u2603) {
                        return lf.A().a(\u2603) && \u2603 != a;
                    }
                }));
                final List<mq> arrayList = (List<mq>)Lists.newArrayList((Iterable<?>)list);
                for (mq mq2 : list) {
                    final mq \u26033 = mq2;
                    boolean b = false;
                    while (mq2 != null) {
                        if (mq2 == a) {
                            b = true;
                        }
                        mq2 = mq2.c;
                    }
                    if (b) {
                        continue;
                    }
                    for (mq2 = \u26033; mq2 != null; mq2 = mq2.c) {
                        arrayList.remove(\u26033);
                    }
                }
                final Iterator iterator3 = arrayList.iterator();
                while (iterator3.hasNext()) {
                    final mq \u26033 = iterator3.next();
                    lf.a(\u26033);
                }
            }
        }
        if (equalsIgnoreCase) {
            lf.b(a);
            i.a(\u2603, this, "commands.achievement.give.success.one", lf.e_(), a.j());
        }
        else if (equalsIgnoreCase2) {
            lf.a(a);
            i.a(\u2603, this, "commands.achievement.take.success.one", a.j(), lf.e_());
        }
    }
    
    @Override
    public List<String> a(final m \u2603, final String[] \u2603, final cj \u2603) {
        if (\u2603.length == 1) {
            return i.a(\u2603, "give", "take");
        }
        if (\u2603.length == 2) {
            final List<String> arrayList = (List<String>)Lists.newArrayList();
            for (final mw mw : na.b) {
                arrayList.add(mw.e);
            }
            return i.a(\u2603, arrayList);
        }
        if (\u2603.length == 3) {
            return i.a(\u2603, MinecraftServer.N().K());
        }
        return null;
    }
    
    @Override
    public boolean b(final String[] \u2603, final int \u2603) {
        return \u2603 == 2;
    }
}
