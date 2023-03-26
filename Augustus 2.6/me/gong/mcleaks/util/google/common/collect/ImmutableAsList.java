// 
// Decompiled by Procyon v0.5.36
// 

package me.gong.mcleaks.util.google.common.collect;

import java.io.Serializable;
import me.gong.mcleaks.util.google.common.annotations.GwtIncompatible;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import me.gong.mcleaks.util.google.common.annotations.GwtCompatible;

@GwtCompatible(serializable = true, emulated = true)
abstract class ImmutableAsList<E> extends ImmutableList<E>
{
    abstract ImmutableCollection<E> delegateCollection();
    
    @Override
    public boolean contains(final Object target) {
        return this.delegateCollection().contains(target);
    }
    
    @Override
    public int size() {
        return this.delegateCollection().size();
    }
    
    @Override
    public boolean isEmpty() {
        return this.delegateCollection().isEmpty();
    }
    
    @Override
    boolean isPartialView() {
        return this.delegateCollection().isPartialView();
    }
    
    @GwtIncompatible
    private void readObject(final ObjectInputStream stream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }
    
    @GwtIncompatible
    @Override
    Object writeReplace() {
        return new SerializedForm(this.delegateCollection());
    }
    
    @GwtIncompatible
    static class SerializedForm implements Serializable
    {
        final ImmutableCollection<?> collection;
        private static final long serialVersionUID = 0L;
        
        SerializedForm(final ImmutableCollection<?> collection) {
            this.collection = collection;
        }
        
        Object readResolve() {
            return this.collection.asList();
        }
    }
}
