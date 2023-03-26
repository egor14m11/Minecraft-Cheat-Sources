import org.apache.logging.log4j.LogManager;
import java.util.Iterator;
import java.util.Collections;
import java.util.Set;
import org.apache.commons.lang3.Validate;
import com.google.common.collect.Maps;
import java.util.Map;
import org.apache.logging.log4j.Logger;

// 
// Decompiled by Procyon v0.5.36
// 

public class dd<K, V> implements db<K, V>
{
    private static final Logger a;
    protected final Map<K, V> c;
    
    public dd() {
        this.c = this.b();
    }
    
    protected Map<K, V> b() {
        return (Map<K, V>)Maps.newHashMap();
    }
    
    @Override
    public V a(final K \u2603) {
        return this.c.get(\u2603);
    }
    
    @Override
    public void a(final K \u2603, final V \u2603) {
        Validate.notNull(\u2603);
        Validate.notNull(\u2603);
        if (this.c.containsKey(\u2603)) {
            dd.a.debug("Adding duplicate key '" + \u2603 + "' to registry");
        }
        this.c.put(\u2603, \u2603);
    }
    
    public Set<K> c() {
        return Collections.unmodifiableSet((Set<? extends K>)this.c.keySet());
    }
    
    public boolean d(final K \u2603) {
        return this.c.containsKey(\u2603);
    }
    
    @Override
    public Iterator<V> iterator() {
        return this.c.values().iterator();
    }
    
    static {
        a = LogManager.getLogger();
    }
}
