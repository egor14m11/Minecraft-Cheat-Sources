// 
// Decompiled by Procyon v0.5.36
// 

package com.google.common.collect;

import java.io.Serializable;
import java.util.function.BiConsumer;
import java.util.function.Function;
import javax.annotation.CheckForNull;
import java.util.Spliterator;
import java.util.Iterator;
import com.google.common.base.Preconditions;
import java.util.Map;
import java.util.EnumMap;
import com.google.common.annotations.GwtCompatible;

@ElementTypesAreNonnullByDefault
@GwtCompatible(serializable = true, emulated = true)
final class ImmutableEnumMap<K extends Enum<K>, V> extends IteratorBasedImmutableMap<K, V>
{
    private final transient EnumMap<K, V> delegate;
    
    static <K extends Enum<K>, V> ImmutableMap<K, V> asImmutable(final EnumMap<K, V> map) {
        switch (map.size()) {
            case 0: {
                return ImmutableMap.of();
            }
            case 1: {
                final Map.Entry<K, V> entry = Iterables.getOnlyElement(map.entrySet());
                return ImmutableMap.of((K)entry.getKey(), entry.getValue());
            }
            default: {
                return new ImmutableEnumMap<K, V>(map);
            }
        }
    }
    
    private ImmutableEnumMap(final EnumMap<K, V> delegate) {
        this.delegate = delegate;
        Preconditions.checkArgument(!delegate.isEmpty());
    }
    
    @Override
    UnmodifiableIterator<K> keyIterator() {
        return Iterators.unmodifiableIterator((Iterator<? extends K>)this.delegate.keySet().iterator());
    }
    
    @Override
    Spliterator<K> keySpliterator() {
        return this.delegate.keySet().spliterator();
    }
    
    @Override
    public int size() {
        return this.delegate.size();
    }
    
    @Override
    public boolean containsKey(@CheckForNull final Object key) {
        return this.delegate.containsKey(key);
    }
    
    @CheckForNull
    @Override
    public V get(@CheckForNull final Object key) {
        return this.delegate.get(key);
    }
    
    @Override
    public boolean equals(@CheckForNull Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof ImmutableEnumMap) {
            object = ((ImmutableEnumMap)object).delegate;
        }
        return this.delegate.equals(object);
    }
    
    @Override
    UnmodifiableIterator<Map.Entry<K, V>> entryIterator() {
        return Maps.unmodifiableEntryIterator(this.delegate.entrySet().iterator());
    }
    
    @Override
    Spliterator<Map.Entry<K, V>> entrySpliterator() {
        return CollectSpliterators.map(this.delegate.entrySet().spliterator(), (Function<? super Map.Entry<K, V>, ? extends Map.Entry<K, V>>)Maps::unmodifiableEntry);
    }
    
    @Override
    public void forEach(final BiConsumer<? super K, ? super V> action) {
        this.delegate.forEach(action);
    }
    
    @Override
    boolean isPartialView() {
        return false;
    }
    
    @Override
    Object writeReplace() {
        return new EnumSerializedForm((EnumMap<Enum, Object>)this.delegate);
    }
    
    private static class EnumSerializedForm<K extends Enum<K>, V> implements Serializable
    {
        final EnumMap<K, V> delegate;
        private static final long serialVersionUID = 0L;
        
        EnumSerializedForm(final EnumMap<K, V> delegate) {
            this.delegate = delegate;
        }
        
        Object readResolve() {
            return new ImmutableEnumMap(this.delegate, null);
        }
    }
}
