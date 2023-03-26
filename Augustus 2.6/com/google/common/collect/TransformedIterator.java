// 
// Decompiled by Procyon v0.5.36
// 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.annotations.GwtCompatible;
import java.util.Iterator;

@ElementTypesAreNonnullByDefault
@GwtCompatible
abstract class TransformedIterator<F, T> implements Iterator<T>
{
    final Iterator<? extends F> backingIterator;
    
    TransformedIterator(final Iterator<? extends F> backingIterator) {
        this.backingIterator = Preconditions.checkNotNull(backingIterator);
    }
    
    @ParametricNullness
    abstract T transform(@ParametricNullness final F p0);
    
    @Override
    public final boolean hasNext() {
        return this.backingIterator.hasNext();
    }
    
    @ParametricNullness
    @Override
    public final T next() {
        return this.transform(this.backingIterator.next());
    }
    
    @Override
    public final void remove() {
        this.backingIterator.remove();
    }
}
