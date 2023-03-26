import com.google.common.collect.Multimap;
import com.google.common.collect.HashMultimap;
import java.util.Iterator;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;

// 
// Decompiled by Procyon v0.5.36
// 

public class aai extends zw
{
    private Map<Integer, List<pf>> a;
    private static final Map<List<pf>, Integer> b;
    
    public aai() {
        this.a = (Map<Integer, List<pf>>)Maps.newHashMap();
        this.c(1);
        this.a(true);
        this.d(0);
        this.a(yz.k);
    }
    
    public List<pf> h(final zx \u2603) {
        if (!\u2603.n() || !\u2603.o().b("CustomPotionEffects", 9)) {
            List<pf> list = this.a.get(\u2603.i());
            if (list == null) {
                list = abe.b(\u2603.i(), false);
                this.a.put(\u2603.i(), list);
            }
            return list;
        }
        List<pf> list = (List<pf>)Lists.newArrayList();
        final du c = \u2603.o().c("CustomPotionEffects", 10);
        for (int i = 0; i < c.c(); ++i) {
            final dn b = c.b(i);
            final pf b2 = pf.b(b);
            if (b2 != null) {
                list.add(b2);
            }
        }
        return list;
    }
    
    public List<pf> e(final int \u2603) {
        List<pf> b = this.a.get(\u2603);
        if (b == null) {
            b = abe.b(\u2603, false);
            this.a.put(\u2603, b);
        }
        return b;
    }
    
    @Override
    public zx b(final zx \u2603, final adm \u2603, final wn \u2603) {
        if (!\u2603.bA.d) {
            --\u2603.b;
        }
        if (!\u2603.D) {
            final List<pf> h = this.h(\u2603);
            if (h != null) {
                for (final pf \u26032 : h) {
                    \u2603.c(new pf(\u26032));
                }
            }
        }
        \u2603.b(na.ad[zw.b(this)]);
        if (!\u2603.bA.d) {
            if (\u2603.b <= 0) {
                return new zx(zy.bA);
            }
            \u2603.bi.a(new zx(zy.bA));
        }
        return \u2603;
    }
    
    @Override
    public int d(final zx \u2603) {
        return 32;
    }
    
    @Override
    public aba e(final zx \u2603) {
        return aba.c;
    }
    
    @Override
    public zx a(final zx \u2603, final adm \u2603, final wn \u2603) {
        if (f(\u2603.i())) {
            if (!\u2603.bA.d) {
                --\u2603.b;
            }
            \u2603.a((pk)\u2603, "random.bow", 0.5f, 0.4f / (aai.g.nextFloat() * 0.4f + 0.8f));
            if (!\u2603.D) {
                \u2603.d(new xc(\u2603, \u2603, \u2603));
            }
            \u2603.b(na.ad[zw.b(this)]);
            return \u2603;
        }
        \u2603.a(\u2603, this.d(\u2603));
        return \u2603;
    }
    
    public static boolean f(final int \u2603) {
        return (\u2603 & 0x4000) != 0x0;
    }
    
    public int g(final int \u2603) {
        return abe.a(\u2603, false);
    }
    
    @Override
    public int a(final zx \u2603, final int \u2603) {
        if (\u2603 > 0) {
            return 16777215;
        }
        return this.g(\u2603.i());
    }
    
    public boolean h(final int \u2603) {
        final List<pf> e = this.e(\u2603);
        if (e == null || e.isEmpty()) {
            return false;
        }
        for (final pf pf : e) {
            if (pe.a[pf.a()].b()) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public String a(final zx \u2603) {
        if (\u2603.i() == 0) {
            return di.a("item.emptyPotion.name").trim();
        }
        String string = "";
        if (f(\u2603.i())) {
            string = di.a("potion.prefix.grenade").trim() + " ";
        }
        final List<pf> h = zy.bz.h(\u2603);
        if (h != null && !h.isEmpty()) {
            String \u26032 = h.get(0).g();
            \u26032 += ".postfix";
            return string + di.a(\u26032).trim();
        }
        String \u26032 = abe.c(\u2603.i());
        return di.a(\u26032).trim() + " " + super.a(\u2603);
    }
    
    @Override
    public void a(final zx \u2603, final wn \u2603, final List<String> \u2603, final boolean \u2603) {
        if (\u2603.i() == 0) {
            return;
        }
        final List<pf> h = zy.bz.h(\u2603);
        final Multimap<String, qd> create = (Multimap<String, qd>)HashMultimap.create();
        if (h != null && !h.isEmpty()) {
            for (final pf \u26032 : h) {
                String s = di.a(\u26032.g()).trim();
                final pe pe = pe.a[\u26032.a()];
                final Map<qb, qd> l = pe.l();
                if (l != null && l.size() > 0) {
                    for (final Map.Entry<qb, qd> entry : l.entrySet()) {
                        final qd \u26033 = entry.getValue();
                        final qd qd = new qd(\u26033.b(), pe.a(\u26032.c(), \u26033), \u26033.c());
                        create.put(entry.getKey().a(), qd);
                    }
                }
                if (\u26032.c() > 0) {
                    s = s + " " + di.a("potion.potency." + \u26032.c()).trim();
                }
                if (\u26032.b() > 20) {
                    s = s + " (" + pe.a(\u26032) + ")";
                }
                if (pe.g()) {
                    \u2603.add(a.m + s);
                }
                else {
                    \u2603.add(a.h + s);
                }
            }
        }
        else {
            final String trim = di.a("potion.empty").trim();
            \u2603.add(a.h + trim);
        }
        if (!create.isEmpty()) {
            \u2603.add("");
            \u2603.add(a.f + di.a("potion.effects.whenDrank"));
            for (final Map.Entry<String, qd> entry2 : create.entries()) {
                final qd qd2 = entry2.getValue();
                final double d = qd2.d();
                double d2;
                if (qd2.c() == 1 || qd2.c() == 2) {
                    d2 = qd2.d() * 100.0;
                }
                else {
                    d2 = qd2.d();
                }
                if (d > 0.0) {
                    \u2603.add(a.j + di.a("attribute.modifier.plus." + qd2.c(), zx.a.format(d2), di.a("attribute.name." + entry2.getKey())));
                }
                else {
                    if (d >= 0.0) {
                        continue;
                    }
                    d2 *= -1.0;
                    \u2603.add(a.m + di.a("attribute.modifier.take." + qd2.c(), zx.a.format(d2), di.a("attribute.name." + entry2.getKey())));
                }
            }
        }
    }
    
    @Override
    public boolean f(final zx \u2603) {
        final List<pf> h = this.h(\u2603);
        return h != null && !h.isEmpty();
    }
    
    @Override
    public void a(final zw \u2603, final yz \u2603, final List<zx> \u2603) {
        super.a(\u2603, \u2603, \u2603);
        if (aai.b.isEmpty()) {
            for (int i = 0; i <= 15; ++i) {
                for (int j = 0; j <= 1; ++j) {
                    int n = i;
                    if (j == 0) {
                        n |= 0x2000;
                    }
                    else {
                        n |= 0x4000;
                    }
                    for (int k = 0; k <= 2; ++k) {
                        int n2 = n;
                        if (k != 0) {
                            if (k == 1) {
                                n2 |= 0x20;
                            }
                            else if (k == 2) {
                                n2 |= 0x40;
                            }
                        }
                        final List<pf> b = abe.b(n2, false);
                        if (b != null && !b.isEmpty()) {
                            aai.b.put(b, n2);
                        }
                    }
                }
            }
        }
        for (final int j : aai.b.values()) {
            \u2603.add(new zx(\u2603, 1, j));
        }
    }
    
    static {
        b = Maps.newLinkedHashMap();
    }
}
