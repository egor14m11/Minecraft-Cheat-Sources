// 
// Decompiled by Procyon v0.5.36
// 

package me.gong.mcleaks.util.google.common.collect;

import me.gong.mcleaks.util.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Serializable;
import java.util.function.Consumer;
import java.util.Spliterator;
import javax.annotation.Nullable;
import java.util.Iterator;
import java.util.EnumSet;
import java.util.Collection;
import me.gong.mcleaks.util.google.common.annotations.VisibleForTesting;
import me.gong.mcleaks.util.google.common.base.Preconditions;
import java.util.Arrays;
import me.gong.mcleaks.util.google.common.annotations.Beta;
import java.util.stream.Collector;
import me.gong.mcleaks.util.google.j2objc.annotations.RetainedWith;
import me.gong.mcleaks.util.google.errorprone.annotations.concurrent.LazyInit;
import me.gong.mcleaks.util.google.common.annotations.GwtCompatible;
import java.util.Set;

@GwtCompatible(serializable = true, emulated = true)
public abstract class ImmutableSet<E> extends ImmutableCollection<E> implements Set<E>
{
    static final int SPLITERATOR_CHARACTERISTICS = 1297;
    static final int MAX_TABLE_SIZE = 1073741824;
    private static final double DESIRED_LOAD_FACTOR = 0.7;
    private static final int CUTOFF = 751619276;
    @LazyInit
    @RetainedWith
    private transient ImmutableList<E> asList;
    
    @Beta
    public static <E> Collector<E, ?, ImmutableSet<E>> toImmutableSet() {
        return CollectCollectors.toImmutableSet();
    }
    
    public static <E> ImmutableSet<E> of() {
        return (ImmutableSet<E>)RegularImmutableSet.EMPTY;
    }
    
    public static <E> ImmutableSet<E> of(final E element) {
        return new SingletonImmutableSet<E>(element);
    }
    
    public static <E> ImmutableSet<E> of(final E e1, final E e2) {
        return construct(2, e1, e2);
    }
    
    public static <E> ImmutableSet<E> of(final E e1, final E e2, final E e3) {
        return construct(3, e1, e2, e3);
    }
    
    public static <E> ImmutableSet<E> of(final E e1, final E e2, final E e3, final E e4) {
        return construct(4, e1, e2, e3, e4);
    }
    
    public static <E> ImmutableSet<E> of(final E e1, final E e2, final E e3, final E e4, final E e5) {
        return construct(5, e1, e2, e3, e4, e5);
    }
    
    @SafeVarargs
    public static <E> ImmutableSet<E> of(final E e1, final E e2, final E e3, final E e4, final E e5, final E e6, final E... others) {
        final int paramCount = 6;
        final Object[] elements = new Object[6 + others.length];
        elements[0] = e1;
        elements[1] = e2;
        elements[2] = e3;
        elements[3] = e4;
        elements[4] = e5;
        elements[5] = e6;
        System.arraycopy(others, 0, elements, 6, others.length);
        return construct(elements.length, elements);
    }
    
    private static <E> ImmutableSet<E> construct(final int n, final Object... elements) {
        switch (n) {
            case 0: {
                return of();
            }
            case 1: {
                final E elem = (E)elements[0];
                return of(elem);
            }
            default: {
                final int tableSize = chooseTableSize(n);
                final Object[] table = new Object[tableSize];
                final int mask = tableSize - 1;
                int hashCode = 0;
                int uniques = 0;
                for (int i = 0; i < n; ++i) {
                    final Object element = ObjectArrays.checkElementNotNull(elements[i], i);
                    final int hash = element.hashCode();
                    int j = Hashing.smear(hash);
                    while (true) {
                        final int index = j & mask;
                        final Object value = table[index];
                        if (value == null) {
                            table[index] = (elements[uniques++] = element);
                            hashCode += hash;
                            break;
                        }
                        if (value.equals(element)) {
                            break;
                        }
                        ++j;
                    }
                }
                Arrays.fill(elements, uniques, n, null);
                if (uniques == 1) {
                    final E element2 = (E)elements[0];
                    return new SingletonImmutableSet<E>(element2, hashCode);
                }
                if (tableSize != chooseTableSize(uniques)) {
                    return (ImmutableSet<E>)construct(uniques, elements);
                }
                final Object[] uniqueElements = (uniques < elements.length) ? Arrays.copyOf(elements, uniques) : elements;
                return new RegularImmutableSet<E>(uniqueElements, hashCode, table, mask);
            }
        }
    }
    
    @VisibleForTesting
    static int chooseTableSize(final int setSize) {
        if (setSize < 751619276) {
            int tableSize;
            for (tableSize = Integer.highestOneBit(setSize - 1) << 1; tableSize * 0.7 < setSize; tableSize <<= 1) {}
            return tableSize;
        }
        Preconditions.checkArgument(setSize < 1073741824, (Object)"collection too large");
        return 1073741824;
    }
    
    public static <E> ImmutableSet<E> copyOf(final Collection<? extends E> elements) {
        if (elements instanceof ImmutableSet && !(elements instanceof ImmutableSortedSet)) {
            final ImmutableSet<E> set = (ImmutableSet<E>)(ImmutableSet)elements;
            if (!set.isPartialView()) {
                return set;
            }
        }
        else if (elements instanceof EnumSet) {
            return (ImmutableSet<E>)copyOfEnumSet((EnumSet)elements);
        }
        final Object[] array = elements.toArray();
        return construct(array.length, array);
    }
    
    public static <E> ImmutableSet<E> copyOf(final Iterable<? extends E> elements) {
        return (elements instanceof Collection) ? copyOf((Collection<? extends E>)(Collection)elements) : copyOf(elements.iterator());
    }
    
    public static <E> ImmutableSet<E> copyOf(final Iterator<? extends E> elements) {
        if (!elements.hasNext()) {
            return of();
        }
        final E first = (E)elements.next();
        if (!elements.hasNext()) {
            return of(first);
        }
        return new Builder<E>().add(first).addAll(elements).build();
    }
    
    public static <E> ImmutableSet<E> copyOf(final E[] elements) {
        switch (elements.length) {
            case 0: {
                return of();
            }
            case 1: {
                return of(elements[0]);
            }
            default: {
                return construct(elements.length, (Object[])elements.clone());
            }
        }
    }
    
    private static ImmutableSet copyOfEnumSet(final EnumSet enumSet) {
        return ImmutableEnumSet.asImmutable(EnumSet.copyOf((EnumSet<Enum>)enumSet));
    }
    
    ImmutableSet() {
    }
    
    boolean isHashCodeFast() {
        return false;
    }
    
    @Override
    public boolean equals(@Nullable final Object object) {
        return object == this || ((!(object instanceof ImmutableSet) || !this.isHashCodeFast() || !((ImmutableSet)object).isHashCodeFast() || this.hashCode() == object.hashCode()) && Sets.equalsImpl(this, object));
    }
    
    @Override
    public int hashCode() {
        return Sets.hashCodeImpl(this);
    }
    
    @Override
    public abstract UnmodifiableIterator<E> iterator();
    
    @Override
    public ImmutableList<E> asList() {
        final ImmutableList<E> result = this.asList;
        return (result == null) ? (this.asList = this.createAsList()) : result;
    }
    
    ImmutableList<E> createAsList() {
        return new RegularImmutableAsList<E>(this, this.toArray());
    }
    
    @Override
    Object writeReplace() {
        return new SerializedForm(this.toArray());
    }
    
    public static <E> Builder<E> builder() {
        return new Builder<E>();
    }
    
    abstract static class Indexed<E> extends ImmutableSet<E>
    {
        abstract E get(final int p0);
        
        @Override
        public UnmodifiableIterator<E> iterator() {
            return this.asList().iterator();
        }
        
        @Override
        public Spliterator<E> spliterator() {
            return CollectSpliterators.indexed(this.size(), 1297, this::get);
        }
        
        @Override
        public void forEach(final Consumer<? super E> consumer) {
            Preconditions.checkNotNull(consumer);
            for (int n = this.size(), i = 0; i < n; ++i) {
                consumer.accept(this.get(i));
            }
        }
        
        @Override
        ImmutableList<E> createAsList() {
            return new ImmutableAsList<E>() {
                @Override
                public E get(final int index) {
                    return Indexed.this.get(index);
                }
                
                @Override
                Indexed<E> delegateCollection() {
                    return Indexed.this;
                }
            };
        }
    }
    
    private static class SerializedForm implements Serializable
    {
        final Object[] elements;
        private static final long serialVersionUID = 0L;
        
        SerializedForm(final Object[] elements) {
            this.elements = elements;
        }
        
        Object readResolve() {
            return ImmutableSet.copyOf(this.elements);
        }
    }
    
    public static class Builder<E> extends ArrayBasedBuilder<E>
    {
        public Builder() {
            this(4);
        }
        
        Builder(final int capacity) {
            super(capacity);
        }
        
        @CanIgnoreReturnValue
        @Override
        public Builder<E> add(final E element) {
            super.add(element);
            return this;
        }
        
        @CanIgnoreReturnValue
        @Override
        public Builder<E> add(final E... elements) {
            super.add(elements);
            return this;
        }
        
        @CanIgnoreReturnValue
        @Override
        public Builder<E> addAll(final Iterable<? extends E> elements) {
            super.addAll(elements);
            return this;
        }
        
        @CanIgnoreReturnValue
        @Override
        public Builder<E> addAll(final Iterator<? extends E> elements) {
            super.addAll(elements);
            return this;
        }
        
        @CanIgnoreReturnValue
        @Override
        Builder<E> combine(final ArrayBasedBuilder<E> builder) {
            super.combine(builder);
            return this;
        }
        
        @Override
        public ImmutableSet<E> build() {
            final ImmutableSet<E> result = (ImmutableSet<E>)construct(this.size, this.contents);
            this.size = result.size();
            return result;
        }
    }
}
