import java.util.Collection;
import java.util.Set;
import java.util.Iterator;
import com.google.common.collect.Maps;
import java.util.Map;

// 
// Decompiled by Procyon v0.5.36
// 

public class nk<V> implements Map<String, V>
{
    private final Map<String, V> a;
    
    public nk() {
        this.a = (Map<String, V>)Maps.newLinkedHashMap();
    }
    
    @Override
    public int size() {
        return this.a.size();
    }
    
    @Override
    public boolean isEmpty() {
        return this.a.isEmpty();
    }
    
    @Override
    public boolean containsKey(final Object \u2603) {
        return this.a.containsKey(\u2603.toString().toLowerCase());
    }
    
    @Override
    public boolean containsValue(final Object \u2603) {
        return this.a.containsKey(\u2603);
    }
    
    @Override
    public V get(final Object \u2603) {
        return this.a.get(\u2603.toString().toLowerCase());
    }
    
    public V a(final String \u2603, final V \u2603) {
        return this.a.put(\u2603.toLowerCase(), \u2603);
    }
    
    @Override
    public V remove(final Object \u2603) {
        return this.a.remove(\u2603.toString().toLowerCase());
    }
    
    @Override
    public void putAll(final Map<? extends String, ? extends V> \u2603) {
        for (final Entry<? extends String, ? extends V> entry : \u2603.entrySet()) {
            this.a((String)entry.getKey(), entry.getValue());
        }
    }
    
    @Override
    public void clear() {
        this.a.clear();
    }
    
    @Override
    public Set<String> keySet() {
        return this.a.keySet();
    }
    
    @Override
    public Collection<V> values() {
        return this.a.values();
    }
    
    @Override
    public Set<Entry<String, V>> entrySet() {
        return this.a.entrySet();
    }
}
