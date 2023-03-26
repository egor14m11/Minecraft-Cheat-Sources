// 
// Decompiled by Procyon v0.5.36
// 

package me.gong.mcleaks.util.google.common.collect;

import java.util.Collection;
import me.gong.mcleaks.util.google.errorprone.annotations.CanIgnoreReturnValue;
import javax.annotation.Nullable;
import java.util.Map;
import java.util.Set;
import me.gong.mcleaks.util.google.common.annotations.GwtCompatible;

@GwtCompatible
public abstract class ForwardingSetMultimap<K, V> extends ForwardingMultimap<K, V> implements SetMultimap<K, V>
{
    @Override
    protected abstract SetMultimap<K, V> delegate();
    
    @Override
    public Set<Map.Entry<K, V>> entries() {
        return this.delegate().entries();
    }
    
    @Override
    public Set<V> get(@Nullable final K key) {
        return this.delegate().get(key);
    }
    
    @CanIgnoreReturnValue
    @Override
    public Set<V> removeAll(@Nullable final Object key) {
        return this.delegate().removeAll(key);
    }
    
    @CanIgnoreReturnValue
    @Override
    public Set<V> replaceValues(final K key, final Iterable<? extends V> values) {
        return this.delegate().replaceValues(key, values);
    }
}
