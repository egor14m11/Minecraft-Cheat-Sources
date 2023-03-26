// 
// Decompiled by Procyon v0.5.36
// 

package com.google.common.collect;

import com.google.common.base.Objects;
import javax.annotation.CheckForNull;
import com.google.common.annotations.GwtCompatible;
import java.util.Map;

@ElementTypesAreNonnullByDefault
@GwtCompatible
abstract class AbstractMapEntry<K, V> implements Map.Entry<K, V>
{
    @ParametricNullness
    @Override
    public abstract K getKey();
    
    @ParametricNullness
    @Override
    public abstract V getValue();
    
    @ParametricNullness
    @Override
    public V setValue(@ParametricNullness final V value) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public boolean equals(@CheckForNull final Object object) {
        if (object instanceof Map.Entry) {
            final Map.Entry<?, ?> that = (Map.Entry<?, ?>)object;
            return Objects.equal(this.getKey(), that.getKey()) && Objects.equal(this.getValue(), that.getValue());
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final K k = this.getKey();
        final V v = this.getValue();
        return ((k == null) ? 0 : k.hashCode()) ^ ((v == null) ? 0 : v.hashCode());
    }
    
    @Override
    public String toString() {
        final String value = String.valueOf(this.getKey());
        final String value2 = String.valueOf(this.getValue());
        return new StringBuilder(1 + String.valueOf(value).length() + String.valueOf(value2).length()).append(value).append("=").append(value2).toString();
    }
}
