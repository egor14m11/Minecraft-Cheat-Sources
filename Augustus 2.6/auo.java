import java.util.Iterator;
import java.util.Comparator;
import java.util.Collections;
import java.util.Collection;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;

// 
// Decompiled by Procyon v0.5.36
// 

public class auo
{
    private final Map<String, auk> a;
    private final Map<auu, List<auk>> b;
    private final Map<String, Map<auk, aum>> c;
    private final auk[] d;
    private final Map<String, aul> e;
    private final Map<String, aul> f;
    private static String[] g;
    
    public auo() {
        this.a = (Map<String, auk>)Maps.newHashMap();
        this.b = (Map<auu, List<auk>>)Maps.newHashMap();
        this.c = (Map<String, Map<auk, aum>>)Maps.newHashMap();
        this.d = new auk[19];
        this.e = (Map<String, aul>)Maps.newHashMap();
        this.f = (Map<String, aul>)Maps.newHashMap();
    }
    
    public auk b(final String \u2603) {
        return this.a.get(\u2603);
    }
    
    public auk a(final String \u2603, final auu \u2603) {
        if (\u2603.length() > 16) {
            throw new IllegalArgumentException("The objective name '" + \u2603 + "' is too long!");
        }
        auk b = this.b(\u2603);
        if (b != null) {
            throw new IllegalArgumentException("An objective with the name '" + \u2603 + "' already exists!");
        }
        b = new auk(this, \u2603, \u2603);
        List<auk> arrayList = this.b.get(\u2603);
        if (arrayList == null) {
            arrayList = (List<auk>)Lists.newArrayList();
            this.b.put(\u2603, arrayList);
        }
        arrayList.add(b);
        this.a.put(\u2603, b);
        this.a(b);
        return b;
    }
    
    public Collection<auk> a(final auu \u2603) {
        final Collection<auk> elements = this.b.get(\u2603);
        return (Collection<auk>)((elements == null) ? Lists.newArrayList() : Lists.newArrayList((Iterable<?>)elements));
    }
    
    public boolean b(final String \u2603, final auk \u2603) {
        final Map<auk, aum> map = this.c.get(\u2603);
        if (map == null) {
            return false;
        }
        final aum aum = map.get(\u2603);
        return aum != null;
    }
    
    public aum c(final String \u2603, final auk \u2603) {
        if (\u2603.length() > 40) {
            throw new IllegalArgumentException("The player name '" + \u2603 + "' is too long!");
        }
        Map<auk, aum> hashMap = this.c.get(\u2603);
        if (hashMap == null) {
            hashMap = (Map<auk, aum>)Maps.newHashMap();
            this.c.put(\u2603, hashMap);
        }
        aum aum = hashMap.get(\u2603);
        if (aum == null) {
            aum = new aum(this, \u2603, \u2603);
            hashMap.put(\u2603, aum);
        }
        return aum;
    }
    
    public Collection<aum> i(final auk \u2603) {
        final List<aum> arrayList = (List<aum>)Lists.newArrayList();
        for (final Map<auk, aum> map : this.c.values()) {
            final aum aum = map.get(\u2603);
            if (aum != null) {
                arrayList.add(aum);
            }
        }
        Collections.sort(arrayList, aum.a);
        return arrayList;
    }
    
    public Collection<auk> c() {
        return this.a.values();
    }
    
    public Collection<String> d() {
        return this.c.keySet();
    }
    
    public void d(final String \u2603, final auk \u2603) {
        if (\u2603 == null) {
            final Map<auk, aum> map = this.c.remove(\u2603);
            if (map != null) {
                this.a(\u2603);
            }
        }
        else {
            final Map<auk, aum> map = this.c.get(\u2603);
            if (map != null) {
                final aum aum = map.remove(\u2603);
                if (map.size() < 1) {
                    final Map<auk, aum> map2 = this.c.remove(\u2603);
                    if (map2 != null) {
                        this.a(\u2603);
                    }
                }
                else if (aum != null) {
                    this.a(\u2603, \u2603);
                }
            }
        }
    }
    
    public Collection<aum> e() {
        final Collection<Map<auk, aum>> values = this.c.values();
        final List<aum> arrayList = (List<aum>)Lists.newArrayList();
        for (final Map<auk, aum> map : values) {
            arrayList.addAll(map.values());
        }
        return arrayList;
    }
    
    public Map<auk, aum> c(final String \u2603) {
        Map<auk, aum> hashMap = this.c.get(\u2603);
        if (hashMap == null) {
            hashMap = (Map<auk, aum>)Maps.newHashMap();
        }
        return hashMap;
    }
    
    public void k(final auk \u2603) {
        this.a.remove(\u2603.b());
        for (int i = 0; i < 19; ++i) {
            if (this.a(i) == \u2603) {
                this.a(i, null);
            }
        }
        final List<auk> list = this.b.get(\u2603.c());
        if (list != null) {
            list.remove(\u2603);
        }
        for (final Map<auk, aum> map : this.c.values()) {
            map.remove(\u2603);
        }
        this.c(\u2603);
    }
    
    public void a(final int \u2603, final auk \u2603) {
        this.d[\u2603] = \u2603;
    }
    
    public auk a(final int \u2603) {
        return this.d[\u2603];
    }
    
    public aul d(final String \u2603) {
        return this.e.get(\u2603);
    }
    
    public aul e(final String \u2603) {
        if (\u2603.length() > 16) {
            throw new IllegalArgumentException("The team name '" + \u2603 + "' is too long!");
        }
        aul d = this.d(\u2603);
        if (d != null) {
            throw new IllegalArgumentException("A team with the name '" + \u2603 + "' already exists!");
        }
        d = new aul(this, \u2603);
        this.e.put(\u2603, d);
        this.a(d);
        return d;
    }
    
    public void d(final aul \u2603) {
        this.e.remove(\u2603.b());
        for (final String s : \u2603.d()) {
            this.f.remove(s);
        }
        this.c(\u2603);
    }
    
    public boolean a(final String \u2603, final String \u2603) {
        if (\u2603.length() > 40) {
            throw new IllegalArgumentException("The player name '" + \u2603 + "' is too long!");
        }
        if (!this.e.containsKey(\u2603)) {
            return false;
        }
        final aul d = this.d(\u2603);
        if (this.h(\u2603) != null) {
            this.f(\u2603);
        }
        this.f.put(\u2603, d);
        d.d().add(\u2603);
        return true;
    }
    
    public boolean f(final String \u2603) {
        final aul h = this.h(\u2603);
        if (h != null) {
            this.a(\u2603, h);
            return true;
        }
        return false;
    }
    
    public void a(final String \u2603, final aul \u2603) {
        if (this.h(\u2603) != \u2603) {
            throw new IllegalStateException("Player is either on another team or not on any team. Cannot remove from team '" + \u2603.b() + "'.");
        }
        this.f.remove(\u2603);
        \u2603.d().remove(\u2603);
    }
    
    public Collection<String> f() {
        return this.e.keySet();
    }
    
    public Collection<aul> g() {
        return this.e.values();
    }
    
    public aul h(final String \u2603) {
        return this.f.get(\u2603);
    }
    
    public void a(final auk \u2603) {
    }
    
    public void b(final auk \u2603) {
    }
    
    public void c(final auk \u2603) {
    }
    
    public void a(final aum \u2603) {
    }
    
    public void a(final String \u2603) {
    }
    
    public void a(final String \u2603, final auk \u2603) {
    }
    
    public void a(final aul \u2603) {
    }
    
    public void b(final aul \u2603) {
    }
    
    public void c(final aul \u2603) {
    }
    
    public static String b(final int \u2603) {
        switch (\u2603) {
            case 0: {
                return "list";
            }
            case 1: {
                return "sidebar";
            }
            case 2: {
                return "belowName";
            }
            default: {
                if (\u2603 >= 3 && \u2603 <= 18) {
                    final a a = a.a(\u2603 - 3);
                    if (a != null && a != a.v) {
                        return "sidebar.team." + a.e();
                    }
                }
                return null;
            }
        }
    }
    
    public static int i(final String \u2603) {
        if (\u2603.equalsIgnoreCase("list")) {
            return 0;
        }
        if (\u2603.equalsIgnoreCase("sidebar")) {
            return 1;
        }
        if (\u2603.equalsIgnoreCase("belowName")) {
            return 2;
        }
        if (\u2603.startsWith("sidebar.team.")) {
            final String substring = \u2603.substring("sidebar.team.".length());
            final a b = a.b(substring);
            if (b != null && b.b() >= 0) {
                return b.b() + 3;
            }
        }
        return -1;
    }
    
    public static String[] h() {
        if (auo.g == null) {
            auo.g = new String[19];
            for (int i = 0; i < 19; ++i) {
                auo.g[i] = b(i);
            }
        }
        return auo.g;
    }
    
    public void a(final pk \u2603) {
        if (\u2603 == null || \u2603 instanceof wn || \u2603.ai()) {
            return;
        }
        final String string = \u2603.aK().toString();
        this.d(string, null);
        this.f(string);
    }
    
    static {
        auo.g = null;
    }
}
