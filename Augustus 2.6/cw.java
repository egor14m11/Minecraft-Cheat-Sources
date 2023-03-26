import java.util.Iterator;
import java.util.NoSuchElementException;
import com.google.common.collect.Maps;
import java.util.Map;

// 
// Decompiled by Procyon v0.5.36
// 

public class cw
{
    public static <K, V> Map<K, V> b(final Iterable<K> \u2603, final Iterable<V> \u2603) {
        return a(\u2603, \u2603, (Map<K, V>)Maps.newLinkedHashMap());
    }
    
    public static <K, V> Map<K, V> a(final Iterable<K> \u2603, final Iterable<V> \u2603, final Map<K, V> \u2603) {
        final Iterator<V> iterator = \u2603.iterator();
        for (final K next : \u2603) {
            \u2603.put(next, iterator.next());
        }
        if (iterator.hasNext()) {
            throw new NoSuchElementException();
        }
        return \u2603;
    }
}
