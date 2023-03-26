import java.util.Iterator;
import com.google.common.collect.HashBiMap;
import com.google.common.collect.BiMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.5.36
// 

public class cx<K, V> extends dd<K, V> implements cs<V>
{
    protected final ct<V> a;
    protected final Map<V, K> b;
    
    public cx() {
        this.a = new ct<V>();
        this.b = (Map<V, K>)((BiMap)this.c).inverse();
    }
    
    public void a(final int \u2603, final K \u2603, final V \u2603) {
        this.a.a(\u2603, \u2603);
        this.a(\u2603, \u2603);
    }
    
    @Override
    protected Map<K, V> b() {
        return (Map<K, V>)HashBiMap.create();
    }
    
    @Override
    public V a(final K \u2603) {
        return super.a(\u2603);
    }
    
    public K c(final V \u2603) {
        return this.b.get(\u2603);
    }
    
    @Override
    public boolean d(final K \u2603) {
        return super.d(\u2603);
    }
    
    public int b(final V \u2603) {
        return this.a.b(\u2603);
    }
    
    public V a(final int \u2603) {
        return this.a.a(\u2603);
    }
    
    @Override
    public Iterator<V> iterator() {
        return this.a.iterator();
    }
}
