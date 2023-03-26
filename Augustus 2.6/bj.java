import java.util.Map;
import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.Set;
import com.google.common.collect.Sets;
import java.util.Random;
import java.util.List;
import net.minecraft.server.MinecraftServer;
import java.util.Collection;
import com.google.common.collect.Lists;

// 
// Decompiled by Procyon v0.5.36
// 

public class bj extends i
{
    @Override
    public String c() {
        return "spreadplayers";
    }
    
    @Override
    public int a() {
        return 2;
    }
    
    @Override
    public String c(final m \u2603) {
        return "commands.spreadplayers.usage";
    }
    
    @Override
    public void a(final m \u2603, final String[] \u2603) throws bz {
        if (\u2603.length < 6) {
            throw new cf("commands.spreadplayers.usage", new Object[0]);
        }
        int i = 0;
        final cj c = \u2603.c();
        final double b = i.b(c.n(), \u2603[i++], true);
        final double b2 = i.b(c.p(), \u2603[i++], true);
        final double a = i.a(\u2603[i++], 0.0);
        final double a2 = i.a(\u2603[i++], a + 1.0);
        final boolean d = i.d(\u2603[i++]);
        final List<pk> arrayList = (List<pk>)Lists.newArrayList();
        while (i < \u2603.length) {
            final String \u26032 = \u2603[i++];
            if (o.b(\u26032)) {
                final List<pk> b3 = o.b(\u2603, \u26032, (Class<? extends pk>)pk.class);
                if (b3.size() == 0) {
                    throw new ca();
                }
                arrayList.addAll(b3);
            }
            else {
                final wn a3 = MinecraftServer.N().ap().a(\u26032);
                if (a3 == null) {
                    throw new cd();
                }
                arrayList.add(a3);
            }
        }
        \u2603.a(n.a.c, arrayList.size());
        if (arrayList.isEmpty()) {
            throw new ca();
        }
        \u2603.a(new fb("commands.spreadplayers.spreading." + (d ? "teams" : "players"), new Object[] { arrayList.size(), a2, b, b2, a }));
        this.a(\u2603, arrayList, new a(b, b2), a, a2, arrayList.get(0).o, d);
    }
    
    private void a(final m \u2603, final List<pk> \u2603, final a \u2603, final double \u2603, final double \u2603, final adm \u2603, final boolean \u2603) throws bz {
        final Random random = new Random();
        final double n = \u2603.a - \u2603;
        final double n2 = \u2603.b - \u2603;
        final double n3 = \u2603.a + \u2603;
        final double n4 = \u2603.b + \u2603;
        final a[] a = this.a(random, \u2603 ? this.b(\u2603) : \u2603.size(), n, n2, n3, n4);
        final int a2 = this.a(\u2603, \u2603, \u2603, random, n, n2, n3, n4, a, \u2603);
        final double a3 = this.a(\u2603, \u2603, a, \u2603);
        i.a(\u2603, this, "commands.spreadplayers.success." + (\u2603 ? "teams" : "players"), a.length, \u2603.a, \u2603.b);
        if (a.length > 1) {
            \u2603.a(new fb("commands.spreadplayers.info." + (\u2603 ? "teams" : "players"), new Object[] { String.format("%.2f", a3), a2 }));
        }
    }
    
    private int b(final List<pk> \u2603) {
        final Set<auq> hashSet = (Set<auq>)Sets.newHashSet();
        for (final pk pk : \u2603) {
            if (pk instanceof wn) {
                hashSet.add(((wn)pk).bO());
            }
            else {
                hashSet.add(null);
            }
        }
        return hashSet.size();
    }
    
    private int a(final a \u2603, final double \u2603, final adm \u2603, final Random \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final a[] \u2603, final boolean \u2603) throws bz {
        boolean b = true;
        double min = 3.4028234663852886E38;
        int n;
        for (n = 0; n < 10000 && b; ++n) {
            b = false;
            min = 3.4028234663852886E38;
            for (int i = 0; i < \u2603.length; ++i) {
                final a a = \u2603[i];
                int j = 0;
                final a \u26032 = new a();
                for (int k = 0; k < \u2603.length; ++k) {
                    if (i != k) {
                        final a \u26033 = \u2603[k];
                        final double a2 = a.a(\u26033);
                        min = Math.min(a2, min);
                        if (a2 < \u2603) {
                            ++j;
                            final a a3 = \u26032;
                            a3.a += \u26033.a - a.a;
                            final a a4 = \u26032;
                            a4.b += \u26033.b - a.b;
                        }
                    }
                }
                if (j > 0) {
                    final a a5 = \u26032;
                    a5.a /= j;
                    final a a6 = \u26032;
                    a6.b /= j;
                    final double n2 = \u26032.b();
                    if (n2 > 0.0) {
                        \u26032.a();
                        a.b(\u26032);
                    }
                    else {
                        a.a(\u2603, \u2603, \u2603, \u2603, \u2603);
                    }
                    b = true;
                }
                if (a.a(\u2603, \u2603, \u2603, \u2603)) {
                    b = true;
                }
            }
            if (!b) {
                for (final a \u26032 : \u2603) {
                    if (!\u26032.b(\u2603)) {
                        \u26032.a(\u2603, \u2603, \u2603, \u2603, \u2603);
                        b = true;
                    }
                }
            }
        }
        if (n >= 10000) {
            throw new bz("commands.spreadplayers.failure." + (\u2603 ? "teams" : "players"), new Object[] { \u2603.length, \u2603.a, \u2603.b, String.format("%.2f", min) });
        }
        return n;
    }
    
    private double a(final List<pk> \u2603, final adm \u2603, final a[] \u2603, final boolean \u2603) {
        double n = 0.0;
        int n2 = 0;
        final Map<auq, a> hashMap = (Map<auq, a>)Maps.newHashMap();
        for (int i = 0; i < \u2603.size(); ++i) {
            final pk pk = \u2603.get(i);
            a a;
            if (\u2603) {
                final auq auq = (pk instanceof wn) ? ((wn)pk).bO() : null;
                if (!hashMap.containsKey(auq)) {
                    hashMap.put(auq, \u2603[n2++]);
                }
                a = hashMap.get(auq);
            }
            else {
                a = \u2603[n2++];
            }
            pk.a(ns.c(a.a) + 0.5f, a.a(\u2603), ns.c(a.b) + 0.5);
            double min = Double.MAX_VALUE;
            for (int j = 0; j < \u2603.length; ++j) {
                if (a != \u2603[j]) {
                    final double a2 = a.a(\u2603[j]);
                    min = Math.min(a2, min);
                }
            }
            n += min;
        }
        n /= \u2603.size();
        return n;
    }
    
    private a[] a(final Random \u2603, final int \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603) {
        final a[] array = new a[\u2603];
        for (int i = 0; i < array.length; ++i) {
            final a a = new a();
            a.a(\u2603, \u2603, \u2603, \u2603, \u2603);
            array[i] = a;
        }
        return array;
    }
    
    @Override
    public List<String> a(final m \u2603, final String[] \u2603, final cj \u2603) {
        if (\u2603.length >= 1 && \u2603.length <= 2) {
            return i.b(\u2603, 0, \u2603);
        }
        return null;
    }
    
    static class a
    {
        double a;
        double b;
        
        a() {
        }
        
        a(final double \u2603, final double \u2603) {
            this.a = \u2603;
            this.b = \u2603;
        }
        
        double a(final a \u2603) {
            final double n = this.a - \u2603.a;
            final double n2 = this.b - \u2603.b;
            return Math.sqrt(n * n + n2 * n2);
        }
        
        void a() {
            final double n = this.b();
            this.a /= n;
            this.b /= n;
        }
        
        float b() {
            return ns.a(this.a * this.a + this.b * this.b);
        }
        
        public void b(final a \u2603) {
            this.a -= \u2603.a;
            this.b -= \u2603.b;
        }
        
        public boolean a(final double \u2603, final double \u2603, final double \u2603, final double \u2603) {
            boolean b = false;
            if (this.a < \u2603) {
                this.a = \u2603;
                b = true;
            }
            else if (this.a > \u2603) {
                this.a = \u2603;
                b = true;
            }
            if (this.b < \u2603) {
                this.b = \u2603;
                b = true;
            }
            else if (this.b > \u2603) {
                this.b = \u2603;
                b = true;
            }
            return b;
        }
        
        public int a(final adm \u2603) {
            cj b = new cj(this.a, 256.0, this.b);
            while (b.o() > 0) {
                b = b.b();
                if (\u2603.p(b).c().t() != arm.a) {
                    return b.o() + 1;
                }
            }
            return 257;
        }
        
        public boolean b(final adm \u2603) {
            cj b = new cj(this.a, 256.0, this.b);
            while (b.o() > 0) {
                b = b.b();
                final arm t = \u2603.p(b).c().t();
                if (t != arm.a) {
                    return !t.d() && t != arm.o;
                }
            }
            return false;
        }
        
        public void a(final Random \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603) {
            this.a = ns.a(\u2603, \u2603, \u2603);
            this.b = ns.a(\u2603, \u2603, \u2603);
        }
    }
}
