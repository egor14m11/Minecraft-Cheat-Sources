// 
// Decompiled by Procyon v0.5.36
// 

package me.gong.mcleaks.util.google.common.collect;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Comparator;
import java.util.Set;
import javax.annotation.Nullable;
import me.gong.mcleaks.util.google.common.annotations.GwtIncompatible;
import java.util.NoSuchElementException;
import me.gong.mcleaks.util.google.common.annotations.GwtCompatible;

@GwtCompatible(emulated = true)
final class EmptyContiguousSet<C extends Comparable> extends ContiguousSet<C>
{
    EmptyContiguousSet(final DiscreteDomain<C> domain) {
        super(domain);
    }
    
    @Override
    public C first() {
        throw new NoSuchElementException();
    }
    
    @Override
    public C last() {
        throw new NoSuchElementException();
    }
    
    @Override
    public int size() {
        return 0;
    }
    
    @Override
    public ContiguousSet<C> intersection(final ContiguousSet<C> other) {
        return this;
    }
    
    @Override
    public Range<C> range() {
        throw new NoSuchElementException();
    }
    
    @Override
    public Range<C> range(final BoundType lowerBoundType, final BoundType upperBoundType) {
        throw new NoSuchElementException();
    }
    
    @Override
    ContiguousSet<C> headSetImpl(final C toElement, final boolean inclusive) {
        return this;
    }
    
    @Override
    ContiguousSet<C> subSetImpl(final C fromElement, final boolean fromInclusive, final C toElement, final boolean toInclusive) {
        return this;
    }
    
    @Override
    ContiguousSet<C> tailSetImpl(final C fromElement, final boolean fromInclusive) {
        return this;
    }
    
    @Override
    public boolean contains(final Object object) {
        return false;
    }
    
    @GwtIncompatible
    @Override
    int indexOf(final Object target) {
        return -1;
    }
    
    @Override
    public UnmodifiableIterator<C> iterator() {
        return Iterators.emptyIterator();
    }
    
    @GwtIncompatible
    @Override
    public UnmodifiableIterator<C> descendingIterator() {
        return Iterators.emptyIterator();
    }
    
    @Override
    boolean isPartialView() {
        return false;
    }
    
    @Override
    public boolean isEmpty() {
        return true;
    }
    
    @Override
    public ImmutableList<C> asList() {
        return ImmutableList.of();
    }
    
    @Override
    public String toString() {
        return "[]";
    }
    
    @Override
    public boolean equals(@Nullable final Object object) {
        if (object instanceof Set) {
            final Set<?> that = (Set<?>)object;
            return that.isEmpty();
        }
        return false;
    }
    
    @GwtIncompatible
    @Override
    boolean isHashCodeFast() {
        return true;
    }
    
    @Override
    public int hashCode() {
        return 0;
    }
    
    @GwtIncompatible
    @Override
    Object writeReplace() {
        return new SerializedForm((DiscreteDomain)this.domain);
    }
    
    @GwtIncompatible
    @Override
    ImmutableSortedSet<C> createDescendingSet() {
        return (ImmutableSortedSet<C>)ImmutableSortedSet.emptySet(Ordering.natural().reverse());
    }
    
    @GwtIncompatible
    private static final class SerializedForm<C extends Comparable> implements Serializable
    {
        private final DiscreteDomain<C> domain;
        private static final long serialVersionUID = 0L;
        
        private SerializedForm(final DiscreteDomain<C> domain) {
            this.domain = domain;
        }
        
        private Object readResolve() {
            return new EmptyContiguousSet((DiscreteDomain<Comparable>)this.domain);
        }
    }
}
