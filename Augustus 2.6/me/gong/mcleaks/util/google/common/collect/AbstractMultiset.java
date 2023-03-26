// 
// Decompiled by Procyon v0.5.36
// 

package me.gong.mcleaks.util.google.common.collect;

import java.util.Collection;
import me.gong.mcleaks.util.google.errorprone.annotations.CanIgnoreReturnValue;
import me.gong.mcleaks.util.google.common.base.Objects;
import java.util.Iterator;
import javax.annotation.Nullable;
import java.util.Set;
import me.gong.mcleaks.util.google.common.annotations.GwtCompatible;
import java.util.AbstractCollection;

@GwtCompatible
abstract class AbstractMultiset<E> extends AbstractCollection<E> implements Multiset<E>
{
    private transient Set<E> elementSet;
    private transient Set<Entry<E>> entrySet;
    
    @Override
    public int size() {
        return Multisets.sizeImpl(this);
    }
    
    @Override
    public boolean isEmpty() {
        return this.entrySet().isEmpty();
    }
    
    @Override
    public boolean contains(@Nullable final Object element) {
        return this.count(element) > 0;
    }
    
    @Override
    public Iterator<E> iterator() {
        return Multisets.iteratorImpl((Multiset<E>)this);
    }
    
    @Override
    public int count(@Nullable final Object element) {
        for (final Entry<E> entry : this.entrySet()) {
            if (Objects.equal(entry.getElement(), element)) {
                return entry.getCount();
            }
        }
        return 0;
    }
    
    @CanIgnoreReturnValue
    @Override
    public boolean add(@Nullable final E element) {
        this.add(element, 1);
        return true;
    }
    
    @CanIgnoreReturnValue
    @Override
    public int add(@Nullable final E element, final int occurrences) {
        throw new UnsupportedOperationException();
    }
    
    @CanIgnoreReturnValue
    @Override
    public boolean remove(@Nullable final Object element) {
        return this.remove(element, 1) > 0;
    }
    
    @CanIgnoreReturnValue
    @Override
    public int remove(@Nullable final Object element, final int occurrences) {
        throw new UnsupportedOperationException();
    }
    
    @CanIgnoreReturnValue
    @Override
    public int setCount(@Nullable final E element, final int count) {
        return Multisets.setCountImpl(this, element, count);
    }
    
    @CanIgnoreReturnValue
    @Override
    public boolean setCount(@Nullable final E element, final int oldCount, final int newCount) {
        return Multisets.setCountImpl(this, element, oldCount, newCount);
    }
    
    @CanIgnoreReturnValue
    @Override
    public boolean addAll(final Collection<? extends E> elementsToAdd) {
        return Multisets.addAllImpl((Multiset<Object>)this, elementsToAdd);
    }
    
    @CanIgnoreReturnValue
    @Override
    public boolean removeAll(final Collection<?> elementsToRemove) {
        return Multisets.removeAllImpl(this, elementsToRemove);
    }
    
    @CanIgnoreReturnValue
    @Override
    public boolean retainAll(final Collection<?> elementsToRetain) {
        return Multisets.retainAllImpl(this, elementsToRetain);
    }
    
    @Override
    public void clear() {
        Iterators.clear(this.entryIterator());
    }
    
    @Override
    public Set<E> elementSet() {
        Set<E> result = this.elementSet;
        if (result == null) {
            result = (this.elementSet = this.createElementSet());
        }
        return result;
    }
    
    Set<E> createElementSet() {
        return new ElementSet();
    }
    
    abstract Iterator<Entry<E>> entryIterator();
    
    abstract int distinctElements();
    
    @Override
    public Set<Entry<E>> entrySet() {
        Set<Entry<E>> result = this.entrySet;
        if (result == null) {
            result = (this.entrySet = this.createEntrySet());
        }
        return result;
    }
    
    Set<Entry<E>> createEntrySet() {
        return (Set<Entry<E>>)new EntrySet();
    }
    
    @Override
    public boolean equals(@Nullable final Object object) {
        return Multisets.equalsImpl(this, object);
    }
    
    @Override
    public int hashCode() {
        return this.entrySet().hashCode();
    }
    
    @Override
    public String toString() {
        return this.entrySet().toString();
    }
    
    class ElementSet extends Multisets.ElementSet<E>
    {
        @Override
        Multiset<E> multiset() {
            return (Multiset<E>)AbstractMultiset.this;
        }
    }
    
    class EntrySet extends Multisets.EntrySet<E>
    {
        @Override
        Multiset<E> multiset() {
            return (Multiset<E>)AbstractMultiset.this;
        }
        
        @Override
        public Iterator<Entry<E>> iterator() {
            return AbstractMultiset.this.entryIterator();
        }
        
        @Override
        public int size() {
            return AbstractMultiset.this.distinctElements();
        }
    }
}
