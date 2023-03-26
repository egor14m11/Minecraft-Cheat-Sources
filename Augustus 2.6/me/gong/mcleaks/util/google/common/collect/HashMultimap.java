// 
// Decompiled by Procyon v0.5.36
// 

package me.gong.mcleaks.util.google.common.collect;

import java.util.function.BiConsumer;
import me.gong.mcleaks.util.google.errorprone.annotations.CanIgnoreReturnValue;
import javax.annotation.Nullable;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Set;
import me.gong.mcleaks.util.google.common.base.Preconditions;
import java.util.Collection;
import java.util.Map;
import java.util.HashMap;
import me.gong.mcleaks.util.google.common.annotations.GwtIncompatible;
import me.gong.mcleaks.util.google.common.annotations.VisibleForTesting;
import me.gong.mcleaks.util.google.common.annotations.GwtCompatible;

@GwtCompatible(serializable = true, emulated = true)
public final class HashMultimap<K, V> extends AbstractSetMultimap<K, V>
{
    private static final int DEFAULT_VALUES_PER_KEY = 2;
    @VisibleForTesting
    transient int expectedValuesPerKey;
    @GwtIncompatible
    private static final long serialVersionUID = 0L;
    
    public static <K, V> HashMultimap<K, V> create() {
        return new HashMultimap<K, V>();
    }
    
    public static <K, V> HashMultimap<K, V> create(final int expectedKeys, final int expectedValuesPerKey) {
        return new HashMultimap<K, V>(expectedKeys, expectedValuesPerKey);
    }
    
    public static <K, V> HashMultimap<K, V> create(final Multimap<? extends K, ? extends V> multimap) {
        return new HashMultimap<K, V>(multimap);
    }
    
    private HashMultimap() {
        super(new HashMap());
        this.expectedValuesPerKey = 2;
    }
    
    private HashMultimap(final int expectedKeys, final int expectedValuesPerKey) {
        super((Map<Object, Collection<Object>>)Maps.newHashMapWithExpectedSize(expectedKeys));
        this.expectedValuesPerKey = 2;
        Preconditions.checkArgument(expectedValuesPerKey >= 0);
        this.expectedValuesPerKey = expectedValuesPerKey;
    }
    
    private HashMultimap(final Multimap<? extends K, ? extends V> multimap) {
        super((Map<Object, Collection<Object>>)Maps.newHashMapWithExpectedSize(multimap.keySet().size()));
        this.expectedValuesPerKey = 2;
        this.putAll(multimap);
    }
    
    @Override
    Set<V> createCollection() {
        return (Set<V>)Sets.newHashSetWithExpectedSize(this.expectedValuesPerKey);
    }
    
    @GwtIncompatible
    private void writeObject(final ObjectOutputStream stream) throws IOException {
        stream.defaultWriteObject();
        Serialization.writeMultimap((Multimap<Object, Object>)this, stream);
    }
    
    @GwtIncompatible
    private void readObject(final ObjectInputStream stream) throws IOException, ClassNotFoundException {
        stream.defaultReadObject();
        this.expectedValuesPerKey = 2;
        final int distinctKeys = Serialization.readCount(stream);
        final Map<K, Collection<V>> map = (Map<K, Collection<V>>)Maps.newHashMap();
        this.setMap(map);
        Serialization.populateMultimap((Multimap<Object, Object>)this, stream, distinctKeys);
    }
}
