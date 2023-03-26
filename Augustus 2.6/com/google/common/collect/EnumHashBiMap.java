// 
// Decompiled by Procyon v0.5.36
// 

package com.google.common.collect;

import java.util.function.BiFunction;
import java.util.Set;
import java.util.HashMap;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import javax.annotation.CheckForNull;
import com.google.common.base.Preconditions;
import java.util.EnumMap;
import java.util.Map;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.GwtCompatible;

@ElementTypesAreNonnullByDefault
@GwtCompatible(emulated = true)
public final class EnumHashBiMap<K extends Enum<K>, V> extends AbstractBiMap<K, V>
{
    private transient Class<K> keyType;
    @GwtIncompatible
    private static final long serialVersionUID = 0L;
    
    public static <K extends Enum<K>, V> EnumHashBiMap<K, V> create(final Class<K> keyType) {
        return new EnumHashBiMap<K, V>(keyType);
    }
    
    public static <K extends Enum<K>, V> EnumHashBiMap<K, V> create(final Map<K, ? extends V> map) {
        final EnumHashBiMap<K, V> bimap = create((Class<K>)EnumBiMap.inferKeyType((Map<K, ?>)map));
        bimap.putAll((Map)map);
        return bimap;
    }
    
    private EnumHashBiMap(final Class<K> keyType) {
        super(new EnumMap<Object, Object>((Class<Object>)keyType), Maps.newHashMapWithExpectedSize(keyType.getEnumConstants().length));
        this.keyType = keyType;
    }
    
    @Override
    K checkKey(final K key) {
        return Preconditions.checkNotNull(key);
    }
    
    @CheckForNull
    @CanIgnoreReturnValue
    @Override
    public V put(final K key, @ParametricNullness final V value) {
        return super.put(key, value);
    }
    
    @CheckForNull
    @CanIgnoreReturnValue
    @Override
    public V forcePut(final K key, @ParametricNullness final V value) {
        return super.forcePut(key, value);
    }
    
    public Class<K> keyType() {
        return this.keyType;
    }
    
    @GwtIncompatible
    private void writeObject(final ObjectOutputStream stream) throws IOException {
        stream.defaultWriteObject();
        stream.writeObject(this.keyType);
        Serialization.writeMap((Map<Object, Object>)this, stream);
    }
    
    @GwtIncompatible
    private void readObject(final ObjectInputStream stream) throws IOException, ClassNotFoundException {
        stream.defaultReadObject();
        this.keyType = (Class<K>)stream.readObject();
        this.setDelegates(new EnumMap<K, V>(this.keyType), new HashMap<V, K>(this.keyType.getEnumConstants().length * 3 / 2));
        Serialization.populateMap((Map<Object, Object>)this, stream);
    }
}
