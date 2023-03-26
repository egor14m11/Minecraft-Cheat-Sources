import org.apache.logging.log4j.LogManager;
import com.google.common.collect.Sets;
import java.util.SortedSet;
import com.google.common.collect.Lists;
import java.util.Iterator;
import java.io.IOException;
import java.util.List;
import com.google.common.collect.Maps;
import java.util.Map;
import org.apache.logging.log4j.Logger;

// 
// Decompiled by Procyon v0.5.36
// 

public class bns implements bnj
{
    private static final Logger b;
    private final bny c;
    private String d;
    protected static final bnt a;
    private Map<String, bnr> e;
    
    public bns(final bny \u2603, final String \u2603) {
        this.e = (Map<String, bnr>)Maps.newHashMap();
        this.c = \u2603;
        this.d = \u2603;
        bnq.a(bns.a);
    }
    
    public void a(final List<bnk> \u2603) {
        this.e.clear();
        for (final bnk bnk : \u2603) {
            try {
                final bog bog = bnk.a(this.c, "language");
                if (bog == null) {
                    continue;
                }
                for (final bnr bnr : bog.a()) {
                    if (!this.e.containsKey(bnr.a())) {
                        this.e.put(bnr.a(), bnr);
                    }
                }
            }
            catch (RuntimeException throwable) {
                bns.b.warn("Unable to parse metadata section of resourcepack: " + bnk.b(), throwable);
            }
            catch (IOException throwable2) {
                bns.b.warn("Unable to parse metadata section of resourcepack: " + bnk.b(), throwable2);
            }
        }
    }
    
    @Override
    public void a(final bni \u2603) {
        final List<String> arrayList = Lists.newArrayList("en_US");
        if (!"en_US".equals(this.d)) {
            arrayList.add(this.d);
        }
        bns.a.a(\u2603, arrayList);
        dj.a(bns.a.a);
    }
    
    public boolean a() {
        return bns.a.a();
    }
    
    public boolean b() {
        return this.c() != null && this.c().b();
    }
    
    public void a(final bnr \u2603) {
        this.d = \u2603.a();
    }
    
    public bnr c() {
        return this.e.containsKey(this.d) ? this.e.get(this.d) : this.e.get("en_US");
    }
    
    public SortedSet<bnr> d() {
        return (SortedSet<bnr>)Sets.newTreeSet((Iterable<? extends Comparable>)this.e.values());
    }
    
    static {
        b = LogManager.getLogger();
        a = new bnt();
    }
}
