// 
// Decompiled by Procyon v0.5.36
// 

package com.google.common.collect;

import java.util.Map;
import com.google.common.base.Preconditions;
import com.google.common.annotations.Beta;
import java.util.NoSuchElementException;
import javax.annotation.CheckForNull;
import java.util.Comparator;
import com.google.common.annotations.GwtCompatible;
import java.util.SortedMap;

@ElementTypesAreNonnullByDefault
@GwtCompatible
public abstract class ForwardingSortedMap<K, V> extends ForwardingMap<K, V> implements SortedMap<K, V>
{
    protected ForwardingSortedMap() {
    }
    
    @Override
    protected abstract SortedMap<K, V> delegate();
    
    @CheckForNull
    @Override
    public Comparator<? super K> comparator() {
        return this.delegate().comparator();
    }
    
    @ParametricNullness
    @Override
    public K firstKey() {
        return this.delegate().firstKey();
    }
    
    @Override
    public SortedMap<K, V> headMap(@ParametricNullness final K toKey) {
        return this.delegate().headMap(toKey);
    }
    
    @ParametricNullness
    @Override
    public K lastKey() {
        return this.delegate().lastKey();
    }
    
    @Override
    public SortedMap<K, V> subMap(@ParametricNullness final K fromKey, @ParametricNullness final K toKey) {
        return this.delegate().subMap(fromKey, toKey);
    }
    
    @Override
    public SortedMap<K, V> tailMap(@ParametricNullness final K fromKey) {
        return this.delegate().tailMap(fromKey);
    }
    
    static int unsafeCompare(@CheckForNull final Comparator<?> comparator, @CheckForNull final Object o1, @CheckForNull final Object o2) {
        if (comparator == null) {
            return ((Comparable)o1).compareTo(o2);
        }
        return comparator.compare(o1, o2);
    }
    
    @Beta
    @Override
    protected boolean standardContainsKey(@CheckForNull final Object key) {
        try {
            final SortedMap<Object, V> self = (SortedMap<Object, V>)this;
            final Object ceilingKey = self.tailMap(key).firstKey();
            return unsafeCompare(this.comparator(), ceilingKey, key) == 0;
        }
        catch (ClassCastException | NoSuchElementException | NullPointerException ex2) {
            final RuntimeException ex;
            final RuntimeException e = ex;
            return false;
        }
    }
    
    @Beta
    protected SortedMap<K, V> standardSubMap(final K fromKey, final K toKey) {
        Preconditions.checkArgument(unsafeCompare(this.comparator(), fromKey, toKey) <= 0, (Object)"fromKey must be <= toKey");
        return this.tailMap(fromKey).headMap(toKey);
    }
    
    @Beta
    protected class StandardKeySet extends Maps.SortedKeySet<K, V>
    {
        public StandardKeySet(final ForwardingSortedMap this$0) {
            super(this$0);
        }
    }
}
