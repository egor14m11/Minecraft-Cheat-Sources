import org.apache.logging.log4j.LogManager;
import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import com.google.common.collect.Sets;
import com.google.common.collect.Maps;
import java.util.Set;
import java.util.Map;
import org.apache.logging.log4j.Logger;

// 
// Decompiled by Procyon v0.5.36
// 

public class j implements l
{
    private static final Logger a;
    private final Map<String, k> b;
    private final Set<k> c;
    
    public j() {
        this.b = (Map<String, k>)Maps.newHashMap();
        this.c = (Set<k>)Sets.newHashSet();
    }
    
    @Override
    public int a(final m \u2603, String \u2603) {
        \u2603 = \u2603.trim();
        if (\u2603.startsWith("/")) {
            \u2603 = \u2603.substring(1);
        }
        String[] array = \u2603.split(" ");
        final String s = array[0];
        array = a(array);
        final k \u26032 = this.b.get(s);
        final int a = this.a(\u26032, array);
        int n = 0;
        if (\u26032 == null) {
            final fb fb = new fb("commands.generic.notFound", new Object[0]);
            fb.b().a(a.m);
            \u2603.a(fb);
        }
        else if (\u26032.a(\u2603)) {
            if (a > -1) {
                final List<pk> b = o.b(\u2603, array[a], (Class<? extends pk>)pk.class);
                final String s2 = array[a];
                \u2603.a(n.a.c, b.size());
                for (final pk pk : b) {
                    array[a] = pk.aK().toString();
                    if (this.a(\u2603, array, \u26032, \u2603)) {
                        ++n;
                    }
                }
                array[a] = s2;
            }
            else {
                \u2603.a(n.a.c, 1);
                if (this.a(\u2603, array, \u26032, \u2603)) {
                    ++n;
                }
            }
        }
        else {
            final fb fb = new fb("commands.generic.permission", new Object[0]);
            fb.b().a(a.m);
            \u2603.a(fb);
        }
        \u2603.a(n.a.a, n);
        return n;
    }
    
    protected boolean a(final m \u2603, final String[] \u2603, final k \u2603, final String \u2603) {
        try {
            \u2603.a(\u2603, \u2603);
            return true;
        }
        catch (cf cf) {
            final fb fb = new fb("commands.generic.usage", new Object[] { new fb(cf.getMessage(), cf.a()) });
            fb.b().a(a.m);
            \u2603.a(fb);
        }
        catch (bz bz) {
            final fb fb = new fb(bz.getMessage(), bz.a());
            fb.b().a(a.m);
            \u2603.a(fb);
        }
        catch (Throwable t) {
            final fb fb = new fb("commands.generic.exception", new Object[0]);
            fb.b().a(a.m);
            \u2603.a(fb);
            j.a.warn("Couldn't process command: '" + \u2603 + "'");
        }
        return false;
    }
    
    public k a(final k \u2603) {
        this.b.put(\u2603.c(), \u2603);
        this.c.add(\u2603);
        for (final String anObject : \u2603.b()) {
            final k k = this.b.get(anObject);
            if (k != null && k.c().equals(anObject)) {
                continue;
            }
            this.b.put(anObject, \u2603);
        }
        return \u2603;
    }
    
    private static String[] a(final String[] \u2603) {
        final String[] array = new String[\u2603.length - 1];
        System.arraycopy(\u2603, 1, array, 0, \u2603.length - 1);
        return array;
    }
    
    @Override
    public List<String> a(final m \u2603, final String \u2603, final cj \u2603) {
        final String[] split = \u2603.split(" ", -1);
        final String \u26032 = split[0];
        if (split.length == 1) {
            final List<String> arrayList = (List<String>)Lists.newArrayList();
            for (final Map.Entry<String, k> entry : this.b.entrySet()) {
                if (i.a(\u26032, entry.getKey()) && entry.getValue().a(\u2603)) {
                    arrayList.add(entry.getKey());
                }
            }
            return arrayList;
        }
        if (split.length > 1) {
            final k k = this.b.get(\u26032);
            if (k != null && k.a(\u2603)) {
                return k.a(\u2603, a(split), \u2603);
            }
        }
        return null;
    }
    
    @Override
    public List<k> a(final m \u2603) {
        final List<k> arrayList = (List<k>)Lists.newArrayList();
        for (final k k : this.c) {
            if (k.a(\u2603)) {
                arrayList.add(k);
            }
        }
        return arrayList;
    }
    
    @Override
    public Map<String, k> a() {
        return this.b;
    }
    
    private int a(final k \u2603, final String[] \u2603) {
        if (\u2603 == null) {
            return -1;
        }
        for (int i = 0; i < \u2603.length; ++i) {
            if (\u2603.b(\u2603, i) && o.a(\u2603[i])) {
                return i;
            }
        }
        return -1;
    }
    
    static {
        a = LogManager.getLogger();
    }
}
