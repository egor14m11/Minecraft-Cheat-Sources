import org.apache.logging.log4j.LogManager;
import java.util.Iterator;
import java.util.Collections;
import com.google.common.collect.Maps;
import com.google.common.collect.Lists;
import java.util.Map;
import java.util.List;
import org.apache.logging.log4j.Logger;

// 
// Decompiled by Procyon v0.5.36
// 

public class nt
{
    private static final Logger b;
    private final List<String> c;
    private final List<Long> d;
    public boolean a;
    private String e;
    private final Map<String, Long> f;
    
    public nt() {
        this.c = (List<String>)Lists.newArrayList();
        this.d = (List<Long>)Lists.newArrayList();
        this.e = "";
        this.f = (Map<String, Long>)Maps.newHashMap();
    }
    
    public void a() {
        this.f.clear();
        this.e = "";
        this.c.clear();
    }
    
    public void a(final String \u2603) {
        if (!this.a) {
            return;
        }
        if (this.e.length() > 0) {
            this.e += ".";
        }
        this.e += \u2603;
        this.c.add(this.e);
        this.d.add(System.nanoTime());
    }
    
    public void b() {
        if (!this.a) {
            return;
        }
        final long nanoTime = System.nanoTime();
        final long longValue = this.d.remove(this.d.size() - 1);
        this.c.remove(this.c.size() - 1);
        final long l = nanoTime - longValue;
        if (this.f.containsKey(this.e)) {
            this.f.put(this.e, this.f.get(this.e) + l);
        }
        else {
            this.f.put(this.e, l);
        }
        if (l > 100000000L) {
            nt.b.warn("Something's taking too long! '" + this.e + "' took aprox " + l / 1000000.0 + " ms");
        }
        this.e = (this.c.isEmpty() ? "" : this.c.get(this.c.size() - 1));
    }
    
    public List<a> b(String \u2603) {
        if (!this.a) {
            return null;
        }
        final String \u26032 = \u2603;
        long n = this.f.containsKey("root") ? this.f.get("root") : 0L;
        final long n2 = this.f.containsKey(\u2603) ? this.f.get(\u2603) : -1L;
        final List<a> arrayList = (List<a>)Lists.newArrayList();
        if (\u2603.length() > 0) {
            \u2603 += ".";
        }
        long n3 = 0L;
        for (final String s : this.f.keySet()) {
            if (s.length() > \u2603.length() && s.startsWith(\u2603) && s.indexOf(".", \u2603.length() + 1) < 0) {
                n3 += this.f.get(s);
            }
        }
        final float n4 = (float)n3;
        if (n3 < n2) {
            n3 = n2;
        }
        if (n < n3) {
            n = n3;
        }
        for (final String s2 : this.f.keySet()) {
            if (s2.length() > \u2603.length() && s2.startsWith(\u2603) && s2.indexOf(".", \u2603.length() + 1) < 0) {
                final long longValue = this.f.get(s2);
                final double \u26033 = longValue * 100.0 / n3;
                final double \u26034 = longValue * 100.0 / n;
                final String substring = s2.substring(\u2603.length());
                arrayList.add(new a(substring, \u26033, \u26034));
            }
        }
        for (final String s2 : this.f.keySet()) {
            this.f.put(s2, this.f.get(s2) * 999L / 1000L);
        }
        if (n3 > n4) {
            arrayList.add(new a("unspecified", (n3 - n4) * 100.0 / n3, (n3 - n4) * 100.0 / n));
        }
        Collections.sort(arrayList);
        arrayList.add(0, new a(\u26032, 100.0, n3 * 100.0 / n));
        return arrayList;
    }
    
    public void c(final String \u2603) {
        this.b();
        this.a(\u2603);
    }
    
    public String c() {
        return (this.c.size() == 0) ? "[UNKNOWN]" : this.c.get(this.c.size() - 1);
    }
    
    static {
        b = LogManager.getLogger();
    }
    
    public static final class a implements Comparable<a>
    {
        public double a;
        public double b;
        public String c;
        
        public a(final String \u2603, final double \u2603, final double \u2603) {
            this.c = \u2603;
            this.a = \u2603;
            this.b = \u2603;
        }
        
        public int a(final a \u2603) {
            if (\u2603.a < this.a) {
                return -1;
            }
            if (\u2603.a > this.a) {
                return 1;
            }
            return \u2603.c.compareTo(this.c);
        }
        
        public int a() {
            return (this.c.hashCode() & 0xAAAAAA) + 4473924;
        }
    }
}
