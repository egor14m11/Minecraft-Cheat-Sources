// 
// Decompiled by Procyon v0.5.36
// 

package com.google.common.collect;

import com.google.common.base.Predicates;
import com.google.common.base.Predicate;
import java.util.function.Function;
import java.util.Spliterators;
import java.util.Objects;
import java.util.Collection;
import java.util.Spliterator;
import java.util.LinkedHashMap;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.common.base.Preconditions;
import java.util.Iterator;
import javax.annotation.CheckForNull;
import java.util.Set;
import com.google.common.base.Supplier;
import java.util.Map;
import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;

@ElementTypesAreNonnullByDefault
@GwtCompatible
class StandardTable<R, C, V> extends AbstractTable<R, C, V> implements Serializable
{
    @GwtTransient
    final Map<R, Map<C, V>> backingMap;
    @GwtTransient
    final Supplier<? extends Map<C, V>> factory;
    @CheckForNull
    private transient Set<C> columnKeySet;
    @CheckForNull
    private transient Map<R, Map<C, V>> rowMap;
    @CheckForNull
    private transient ColumnMap columnMap;
    private static final long serialVersionUID = 0L;
    
    StandardTable(final Map<R, Map<C, V>> backingMap, final Supplier<? extends Map<C, V>> factory) {
        this.backingMap = backingMap;
        this.factory = factory;
    }
    
    @Override
    public boolean contains(@CheckForNull final Object rowKey, @CheckForNull final Object columnKey) {
        return rowKey != null && columnKey != null && super.contains(rowKey, columnKey);
    }
    
    @Override
    public boolean containsColumn(@CheckForNull final Object columnKey) {
        if (columnKey == null) {
            return false;
        }
        for (final Map<C, V> map : this.backingMap.values()) {
            if (Maps.safeContainsKey(map, columnKey)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public boolean containsRow(@CheckForNull final Object rowKey) {
        return rowKey != null && Maps.safeContainsKey(this.backingMap, rowKey);
    }
    
    @Override
    public boolean containsValue(@CheckForNull final Object value) {
        return value != null && super.containsValue(value);
    }
    
    @CheckForNull
    @Override
    public V get(@CheckForNull final Object rowKey, @CheckForNull final Object columnKey) {
        return (rowKey == null || columnKey == null) ? null : super.get(rowKey, columnKey);
    }
    
    @Override
    public boolean isEmpty() {
        return this.backingMap.isEmpty();
    }
    
    @Override
    public int size() {
        int size = 0;
        for (final Map<C, V> map : this.backingMap.values()) {
            size += map.size();
        }
        return size;
    }
    
    @Override
    public void clear() {
        this.backingMap.clear();
    }
    
    private Map<C, V> getOrCreate(final R rowKey) {
        Map<C, V> map = this.backingMap.get(rowKey);
        if (map == null) {
            map = (Map<C, V>)this.factory.get();
            this.backingMap.put(rowKey, map);
        }
        return map;
    }
    
    @CheckForNull
    @CanIgnoreReturnValue
    @Override
    public V put(final R rowKey, final C columnKey, final V value) {
        Preconditions.checkNotNull(rowKey);
        Preconditions.checkNotNull(columnKey);
        Preconditions.checkNotNull(value);
        return this.getOrCreate(rowKey).put(columnKey, value);
    }
    
    @CheckForNull
    @CanIgnoreReturnValue
    @Override
    public V remove(@CheckForNull final Object rowKey, @CheckForNull final Object columnKey) {
        if (rowKey == null || columnKey == null) {
            return null;
        }
        final Map<C, V> map = Maps.safeGet(this.backingMap, rowKey);
        if (map == null) {
            return null;
        }
        final V value = map.remove(columnKey);
        if (map.isEmpty()) {
            this.backingMap.remove(rowKey);
        }
        return value;
    }
    
    @CanIgnoreReturnValue
    private Map<R, V> removeColumn(@CheckForNull final Object column) {
        final Map<R, V> output = new LinkedHashMap<R, V>();
        final Iterator<Map.Entry<R, Map<C, V>>> iterator = this.backingMap.entrySet().iterator();
        while (iterator.hasNext()) {
            final Map.Entry<R, Map<C, V>> entry = iterator.next();
            final V value = entry.getValue().remove(column);
            if (value != null) {
                output.put(entry.getKey(), value);
                if (!entry.getValue().isEmpty()) {
                    continue;
                }
                iterator.remove();
            }
        }
        return output;
    }
    
    private boolean containsMapping(@CheckForNull final Object rowKey, @CheckForNull final Object columnKey, @CheckForNull final Object value) {
        return value != null && value.equals(this.get(rowKey, columnKey));
    }
    
    private boolean removeMapping(@CheckForNull final Object rowKey, @CheckForNull final Object columnKey, @CheckForNull final Object value) {
        if (this.containsMapping(rowKey, columnKey, value)) {
            this.remove(rowKey, columnKey);
            return true;
        }
        return false;
    }
    
    @Override
    public Set<Table.Cell<R, C, V>> cellSet() {
        return super.cellSet();
    }
    
    @Override
    Iterator<Table.Cell<R, C, V>> cellIterator() {
        return new CellIterator();
    }
    
    @Override
    Spliterator<Table.Cell<R, C, V>> cellSpliterator() {
        return CollectSpliterators.flatMap(this.backingMap.entrySet().spliterator(), rowEntry -> CollectSpliterators.map((Spliterator<Object>)rowEntry.getValue().entrySet().spliterator(), columnEntry -> Tables.immutableCell(rowEntry.getKey(), (Object)columnEntry.getKey(), columnEntry.getValue())), 65, this.size());
    }
    
    @Override
    public Map<C, V> row(final R rowKey) {
        return new Row(rowKey);
    }
    
    @Override
    public Map<R, V> column(final C columnKey) {
        return new Column(columnKey);
    }
    
    @Override
    public Set<R> rowKeySet() {
        return this.rowMap().keySet();
    }
    
    @Override
    public Set<C> columnKeySet() {
        final Set<C> result = this.columnKeySet;
        return (result == null) ? (this.columnKeySet = new ColumnKeySet()) : result;
    }
    
    Iterator<C> createColumnKeyIterator() {
        return new ColumnKeyIterator();
    }
    
    @Override
    public Collection<V> values() {
        return super.values();
    }
    
    @Override
    public Map<R, Map<C, V>> rowMap() {
        final Map<R, Map<C, V>> result = this.rowMap;
        return (result == null) ? (this.rowMap = this.createRowMap()) : result;
    }
    
    Map<R, Map<C, V>> createRowMap() {
        return new RowMap();
    }
    
    @Override
    public Map<C, Map<R, V>> columnMap() {
        final ColumnMap result = this.columnMap;
        return (result == null) ? (this.columnMap = new ColumnMap()) : result;
    }
    
    private abstract class TableSet<T> extends Sets.ImprovedAbstractSet<T>
    {
        @Override
        public boolean isEmpty() {
            return StandardTable.this.backingMap.isEmpty();
        }
        
        @Override
        public void clear() {
            StandardTable.this.backingMap.clear();
        }
    }
    
    private class CellIterator implements Iterator<Table.Cell<R, C, V>>
    {
        final Iterator<Map.Entry<R, Map<C, V>>> rowIterator;
        @CheckForNull
        Map.Entry<R, Map<C, V>> rowEntry;
        Iterator<Map.Entry<C, V>> columnIterator;
        
        private CellIterator() {
            this.rowIterator = StandardTable.this.backingMap.entrySet().iterator();
            this.columnIterator = Iterators.emptyModifiableIterator();
        }
        
        @Override
        public boolean hasNext() {
            return this.rowIterator.hasNext() || this.columnIterator.hasNext();
        }
        
        @Override
        public Table.Cell<R, C, V> next() {
            if (!this.columnIterator.hasNext()) {
                this.rowEntry = this.rowIterator.next();
                this.columnIterator = this.rowEntry.getValue().entrySet().iterator();
            }
            Objects.requireNonNull(this.rowEntry);
            final Map.Entry<C, V> columnEntry = this.columnIterator.next();
            return Tables.immutableCell(this.rowEntry.getKey(), columnEntry.getKey(), columnEntry.getValue());
        }
        
        @Override
        public void remove() {
            this.columnIterator.remove();
            if (Objects.requireNonNull(this.rowEntry).getValue().isEmpty()) {
                this.rowIterator.remove();
                this.rowEntry = null;
            }
        }
    }
    
    class Row extends Maps.IteratorBasedAbstractMap<C, V>
    {
        final R rowKey;
        @CheckForNull
        Map<C, V> backingRowMap;
        
        Row(final R rowKey) {
            this.rowKey = Preconditions.checkNotNull(rowKey);
        }
        
        final void updateBackingRowMapField() {
            if (this.backingRowMap == null || (this.backingRowMap.isEmpty() && StandardTable.this.backingMap.containsKey(this.rowKey))) {
                this.backingRowMap = this.computeBackingRowMap();
            }
        }
        
        @CheckForNull
        Map<C, V> computeBackingRowMap() {
            return StandardTable.this.backingMap.get(this.rowKey);
        }
        
        void maintainEmptyInvariant() {
            this.updateBackingRowMapField();
            if (this.backingRowMap != null && this.backingRowMap.isEmpty()) {
                StandardTable.this.backingMap.remove(this.rowKey);
                this.backingRowMap = null;
            }
        }
        
        @Override
        public boolean containsKey(@CheckForNull final Object key) {
            this.updateBackingRowMapField();
            return key != null && this.backingRowMap != null && Maps.safeContainsKey(this.backingRowMap, key);
        }
        
        @CheckForNull
        @Override
        public V get(@CheckForNull final Object key) {
            this.updateBackingRowMapField();
            return (key != null && this.backingRowMap != null) ? Maps.safeGet(this.backingRowMap, key) : null;
        }
        
        @CheckForNull
        @Override
        public V put(final C key, final V value) {
            Preconditions.checkNotNull(key);
            Preconditions.checkNotNull(value);
            if (this.backingRowMap != null && !this.backingRowMap.isEmpty()) {
                return this.backingRowMap.put(key, value);
            }
            return StandardTable.this.put(this.rowKey, key, value);
        }
        
        @CheckForNull
        @Override
        public V remove(@CheckForNull final Object key) {
            this.updateBackingRowMapField();
            if (this.backingRowMap == null) {
                return null;
            }
            final V result = Maps.safeRemove(this.backingRowMap, key);
            this.maintainEmptyInvariant();
            return result;
        }
        
        @Override
        public void clear() {
            this.updateBackingRowMapField();
            if (this.backingRowMap != null) {
                this.backingRowMap.clear();
            }
            this.maintainEmptyInvariant();
        }
        
        @Override
        public int size() {
            this.updateBackingRowMapField();
            return (this.backingRowMap == null) ? 0 : this.backingRowMap.size();
        }
        
        @Override
        Iterator<Map.Entry<C, V>> entryIterator() {
            this.updateBackingRowMapField();
            if (this.backingRowMap == null) {
                return Iterators.emptyModifiableIterator();
            }
            final Iterator<Map.Entry<C, V>> iterator = this.backingRowMap.entrySet().iterator();
            return new Iterator<Map.Entry<C, V>>() {
                @Override
                public boolean hasNext() {
                    return iterator.hasNext();
                }
                
                @Override
                public Map.Entry<C, V> next() {
                    return Row.this.wrapEntry(iterator.next());
                }
                
                @Override
                public void remove() {
                    iterator.remove();
                    Row.this.maintainEmptyInvariant();
                }
            };
        }
        
        @Override
        Spliterator<Map.Entry<C, V>> entrySpliterator() {
            this.updateBackingRowMapField();
            if (this.backingRowMap == null) {
                return Spliterators.emptySpliterator();
            }
            return CollectSpliterators.map(this.backingRowMap.entrySet().spliterator(), (Function<? super Map.Entry<C, V>, ? extends Map.Entry<C, V>>)this::wrapEntry);
        }
        
        Map.Entry<C, V> wrapEntry(final Map.Entry<C, V> entry) {
            return new ForwardingMapEntry<C, V>(this) {
                @Override
                protected Map.Entry<C, V> delegate() {
                    return entry;
                }
                
                @Override
                public V setValue(final V value) {
                    return super.setValue(Preconditions.checkNotNull(value));
                }
                
                @Override
                public boolean equals(@CheckForNull final Object object) {
                    return this.standardEquals(object);
                }
            };
        }
    }
    
    private class Column extends Maps.ViewCachingAbstractMap<R, V>
    {
        final C columnKey;
        
        Column(final C columnKey) {
            this.columnKey = Preconditions.checkNotNull(columnKey);
        }
        
        @CheckForNull
        @Override
        public V put(final R key, final V value) {
            return StandardTable.this.put(key, this.columnKey, value);
        }
        
        @CheckForNull
        @Override
        public V get(@CheckForNull final Object key) {
            return StandardTable.this.get(key, this.columnKey);
        }
        
        @Override
        public boolean containsKey(@CheckForNull final Object key) {
            return StandardTable.this.contains(key, this.columnKey);
        }
        
        @CheckForNull
        @Override
        public V remove(@CheckForNull final Object key) {
            return StandardTable.this.remove(key, this.columnKey);
        }
        
        @CanIgnoreReturnValue
        boolean removeFromColumnIf(final Predicate<? super Map.Entry<R, V>> predicate) {
            boolean changed = false;
            final Iterator<Map.Entry<R, Map<C, V>>> iterator = StandardTable.this.backingMap.entrySet().iterator();
            while (iterator.hasNext()) {
                final Map.Entry<R, Map<C, V>> entry = iterator.next();
                final Map<C, V> map = entry.getValue();
                final V value = map.get(this.columnKey);
                if (value != null && predicate.apply(Maps.immutableEntry(entry.getKey(), value))) {
                    map.remove(this.columnKey);
                    changed = true;
                    if (!map.isEmpty()) {
                        continue;
                    }
                    iterator.remove();
                }
            }
            return changed;
        }
        
        @Override
        Set<Map.Entry<R, V>> createEntrySet() {
            return new EntrySet();
        }
        
        @Override
        Set<R> createKeySet() {
            return (Set<R>)new KeySet();
        }
        
        @Override
        Collection<V> createValues() {
            return (Collection<V>)new Values();
        }
        
        private class EntrySet extends Sets.ImprovedAbstractSet<Map.Entry<R, V>>
        {
            @Override
            public Iterator<Map.Entry<R, V>> iterator() {
                return new EntrySetIterator();
            }
            
            @Override
            public int size() {
                int size = 0;
                for (final Map<C, V> map : StandardTable.this.backingMap.values()) {
                    if (map.containsKey(Column.this.columnKey)) {
                        ++size;
                    }
                }
                return size;
            }
            
            @Override
            public boolean isEmpty() {
                return !StandardTable.this.containsColumn(Column.this.columnKey);
            }
            
            @Override
            public void clear() {
                Column.this.removeFromColumnIf(Predicates.alwaysTrue());
            }
            
            @Override
            public boolean contains(@CheckForNull final Object o) {
                if (o instanceof Map.Entry) {
                    final Map.Entry<?, ?> entry = (Map.Entry<?, ?>)o;
                    return StandardTable.this.containsMapping(entry.getKey(), Column.this.columnKey, entry.getValue());
                }
                return false;
            }
            
            @Override
            public boolean remove(@CheckForNull final Object obj) {
                if (obj instanceof Map.Entry) {
                    final Map.Entry<?, ?> entry = (Map.Entry<?, ?>)obj;
                    return StandardTable.this.removeMapping(entry.getKey(), Column.this.columnKey, entry.getValue());
                }
                return false;
            }
            
            @Override
            public boolean retainAll(final Collection<?> c) {
                return Column.this.removeFromColumnIf(Predicates.not(Predicates.in((Collection<? extends Map.Entry<R, V>>)c)));
            }
        }
        
        private class EntrySetIterator extends AbstractIterator<Map.Entry<R, V>>
        {
            final Iterator<Map.Entry<R, Map<C, V>>> iterator;
            
            private EntrySetIterator() {
                this.iterator = StandardTable.this.backingMap.entrySet().iterator();
            }
            
            @CheckForNull
            @Override
            protected Map.Entry<R, V> computeNext() {
                while (this.iterator.hasNext()) {
                    final Map.Entry<R, Map<C, V>> entry = this.iterator.next();
                    if (entry.getValue().containsKey(Column.this.columnKey)) {
                        class EntryImpl extends AbstractMapEntry<R, V>
                        {
                            @Override
                            public R getKey() {
                                return entry.getKey();
                            }
                            
                            @Override
                            public V getValue() {
                                return entry.getValue().get(Column.this.columnKey);
                            }
                            
                            @Override
                            public V setValue(final V value) {
                                return NullnessCasts.uncheckedCastNullableTToT((V)entry.getValue().put(Column.this.columnKey, (T)Preconditions.checkNotNull(value)));
                            }
                        }
                        return new EntryImpl();
                    }
                }
                return this.endOfData();
            }
        }
        
        private class KeySet extends Maps.KeySet<R, V>
        {
            KeySet() {
                super(Column.this);
            }
            
            @Override
            public boolean contains(@CheckForNull final Object obj) {
                return StandardTable.this.contains(obj, Column.this.columnKey);
            }
            
            @Override
            public boolean remove(@CheckForNull final Object obj) {
                return StandardTable.this.remove(obj, Column.this.columnKey) != null;
            }
            
            @Override
            public boolean retainAll(final Collection<?> c) {
                return Column.this.removeFromColumnIf((Predicate<? super Map.Entry<R, V>>)Maps.keyPredicateOnEntries(Predicates.not(Predicates.in((Collection<? extends K>)c))));
            }
        }
        
        private class Values extends Maps.Values<R, V>
        {
            Values() {
                super(Column.this);
            }
            
            @Override
            public boolean remove(@CheckForNull final Object obj) {
                return obj != null && Column.this.removeFromColumnIf((Predicate<? super Map.Entry<R, V>>)Maps.valuePredicateOnEntries(Predicates.equalTo(obj)));
            }
            
            @Override
            public boolean removeAll(final Collection<?> c) {
                return Column.this.removeFromColumnIf((Predicate<? super Map.Entry<R, V>>)Maps.valuePredicateOnEntries(Predicates.in(c)));
            }
            
            @Override
            public boolean retainAll(final Collection<?> c) {
                return Column.this.removeFromColumnIf((Predicate<? super Map.Entry<R, V>>)Maps.valuePredicateOnEntries(Predicates.not(Predicates.in((Collection<? extends V>)c))));
            }
        }
    }
    
    private class ColumnKeySet extends TableSet<C>
    {
        @Override
        public Iterator<C> iterator() {
            return StandardTable.this.createColumnKeyIterator();
        }
        
        @Override
        public int size() {
            return Iterators.size(this.iterator());
        }
        
        @Override
        public boolean remove(@CheckForNull final Object obj) {
            if (obj == null) {
                return false;
            }
            boolean changed = false;
            final Iterator<Map<C, V>> iterator = StandardTable.this.backingMap.values().iterator();
            while (iterator.hasNext()) {
                final Map<C, V> map = iterator.next();
                if (map.keySet().remove(obj)) {
                    changed = true;
                    if (!map.isEmpty()) {
                        continue;
                    }
                    iterator.remove();
                }
            }
            return changed;
        }
        
        @Override
        public boolean removeAll(final Collection<?> c) {
            Preconditions.checkNotNull(c);
            boolean changed = false;
            final Iterator<Map<C, V>> iterator = StandardTable.this.backingMap.values().iterator();
            while (iterator.hasNext()) {
                final Map<C, V> map = iterator.next();
                if (Iterators.removeAll(map.keySet().iterator(), c)) {
                    changed = true;
                    if (!map.isEmpty()) {
                        continue;
                    }
                    iterator.remove();
                }
            }
            return changed;
        }
        
        @Override
        public boolean retainAll(final Collection<?> c) {
            Preconditions.checkNotNull(c);
            boolean changed = false;
            final Iterator<Map<C, V>> iterator = StandardTable.this.backingMap.values().iterator();
            while (iterator.hasNext()) {
                final Map<C, V> map = iterator.next();
                if (map.keySet().retainAll(c)) {
                    changed = true;
                    if (!map.isEmpty()) {
                        continue;
                    }
                    iterator.remove();
                }
            }
            return changed;
        }
        
        @Override
        public boolean contains(@CheckForNull final Object obj) {
            return StandardTable.this.containsColumn(obj);
        }
    }
    
    private class ColumnKeyIterator extends AbstractIterator<C>
    {
        final Map<C, V> seen;
        final Iterator<Map<C, V>> mapIterator;
        Iterator<Map.Entry<C, V>> entryIterator;
        
        private ColumnKeyIterator() {
            this.seen = (Map<C, V>)StandardTable.this.factory.get();
            this.mapIterator = StandardTable.this.backingMap.values().iterator();
            this.entryIterator = (Iterator<Map.Entry<C, V>>)Iterators.emptyIterator();
        }
        
        @CheckForNull
        @Override
        protected C computeNext() {
            while (true) {
                if (this.entryIterator.hasNext()) {
                    final Map.Entry<C, V> entry = this.entryIterator.next();
                    if (!this.seen.containsKey(entry.getKey())) {
                        this.seen.put(entry.getKey(), entry.getValue());
                        return entry.getKey();
                    }
                    continue;
                }
                else {
                    if (!this.mapIterator.hasNext()) {
                        return this.endOfData();
                    }
                    this.entryIterator = this.mapIterator.next().entrySet().iterator();
                }
            }
        }
    }
    
    class RowMap extends Maps.ViewCachingAbstractMap<R, Map<C, V>>
    {
        @Override
        public boolean containsKey(@CheckForNull final Object key) {
            return StandardTable.this.containsRow(key);
        }
        
        @CheckForNull
        @Override
        public Map<C, V> get(@CheckForNull final Object key) {
            return StandardTable.this.containsRow(key) ? StandardTable.this.row(Objects.requireNonNull(key)) : null;
        }
        
        @CheckForNull
        @Override
        public Map<C, V> remove(@CheckForNull final Object key) {
            return (key == null) ? null : StandardTable.this.backingMap.remove(key);
        }
        
        protected Set<Map.Entry<R, Map<C, V>>> createEntrySet() {
            return new EntrySet();
        }
        
        class EntrySet extends TableSet<Map.Entry<R, Map<C, V>>>
        {
            @Override
            public Iterator<Map.Entry<R, Map<C, V>>> iterator() {
                return Maps.asMapEntryIterator(StandardTable.this.backingMap.keySet(), (com.google.common.base.Function<? super R, Map<C, V>>)new com.google.common.base.Function<R, Map<C, V>>() {
                    @Override
                    public Map<C, V> apply(final R rowKey) {
                        return StandardTable.this.row(rowKey);
                    }
                });
            }
            
            @Override
            public int size() {
                return StandardTable.this.backingMap.size();
            }
            
            @Override
            public boolean contains(@CheckForNull final Object obj) {
                if (obj instanceof Map.Entry) {
                    final Map.Entry<?, ?> entry = (Map.Entry<?, ?>)obj;
                    return entry.getKey() != null && entry.getValue() instanceof Map && Collections2.safeContains(StandardTable.this.backingMap.entrySet(), entry);
                }
                return false;
            }
            
            @Override
            public boolean remove(@CheckForNull final Object obj) {
                if (obj instanceof Map.Entry) {
                    final Map.Entry<?, ?> entry = (Map.Entry<?, ?>)obj;
                    return entry.getKey() != null && entry.getValue() instanceof Map && StandardTable.this.backingMap.entrySet().remove(entry);
                }
                return false;
            }
        }
    }
    
    private class ColumnMap extends Maps.ViewCachingAbstractMap<C, Map<R, V>>
    {
        @CheckForNull
        @Override
        public Map<R, V> get(@CheckForNull final Object key) {
            return StandardTable.this.containsColumn(key) ? StandardTable.this.column(Objects.requireNonNull(key)) : null;
        }
        
        @Override
        public boolean containsKey(@CheckForNull final Object key) {
            return StandardTable.this.containsColumn(key);
        }
        
        @CheckForNull
        @Override
        public Map<R, V> remove(@CheckForNull final Object key) {
            return (Map<R, V>)(StandardTable.this.containsColumn(key) ? StandardTable.this.removeColumn(key) : null);
        }
        
        public Set<Map.Entry<C, Map<R, V>>> createEntrySet() {
            return new ColumnMapEntrySet();
        }
        
        @Override
        public Set<C> keySet() {
            return StandardTable.this.columnKeySet();
        }
        
        @Override
        Collection<Map<R, V>> createValues() {
            return (Collection<Map<R, V>>)new ColumnMapValues();
        }
        
        class ColumnMapEntrySet extends TableSet<Map.Entry<C, Map<R, V>>>
        {
            @Override
            public Iterator<Map.Entry<C, Map<R, V>>> iterator() {
                return Maps.asMapEntryIterator(StandardTable.this.columnKeySet(), (com.google.common.base.Function<? super C, Map<R, V>>)new com.google.common.base.Function<C, Map<R, V>>() {
                    @Override
                    public Map<R, V> apply(final C columnKey) {
                        return StandardTable.this.column(columnKey);
                    }
                });
            }
            
            @Override
            public int size() {
                return StandardTable.this.columnKeySet().size();
            }
            
            @Override
            public boolean contains(@CheckForNull final Object obj) {
                if (obj instanceof Map.Entry) {
                    final Map.Entry<?, ?> entry = (Map.Entry<?, ?>)obj;
                    if (StandardTable.this.containsColumn(entry.getKey())) {
                        return Objects.requireNonNull(ColumnMap.this.get(entry.getKey())).equals(entry.getValue());
                    }
                }
                return false;
            }
            
            @Override
            public boolean remove(@CheckForNull final Object obj) {
                if (this.contains(obj) && obj instanceof Map.Entry) {
                    final Map.Entry<?, ?> entry = (Map.Entry<?, ?>)obj;
                    StandardTable.this.removeColumn(entry.getKey());
                    return true;
                }
                return false;
            }
            
            @Override
            public boolean removeAll(final Collection<?> c) {
                Preconditions.checkNotNull(c);
                return Sets.removeAllImpl(this, c.iterator());
            }
            
            @Override
            public boolean retainAll(final Collection<?> c) {
                Preconditions.checkNotNull(c);
                boolean changed = false;
                for (final C columnKey : Lists.newArrayList((Iterator<? extends C>)StandardTable.this.columnKeySet().iterator())) {
                    if (!c.contains(Maps.immutableEntry(columnKey, StandardTable.this.column(columnKey)))) {
                        StandardTable.this.removeColumn(columnKey);
                        changed = true;
                    }
                }
                return changed;
            }
        }
        
        private class ColumnMapValues extends Maps.Values<C, Map<R, V>>
        {
            ColumnMapValues() {
                super(ColumnMap.this);
            }
            
            @Override
            public boolean remove(@CheckForNull final Object obj) {
                for (final Map.Entry<C, Map<R, V>> entry : ColumnMap.this.entrySet()) {
                    if (entry.getValue().equals(obj)) {
                        StandardTable.this.removeColumn(entry.getKey());
                        return true;
                    }
                }
                return false;
            }
            
            @Override
            public boolean removeAll(final Collection<?> c) {
                Preconditions.checkNotNull(c);
                boolean changed = false;
                for (final C columnKey : Lists.newArrayList((Iterator<? extends C>)StandardTable.this.columnKeySet().iterator())) {
                    if (c.contains(StandardTable.this.column(columnKey))) {
                        StandardTable.this.removeColumn(columnKey);
                        changed = true;
                    }
                }
                return changed;
            }
            
            @Override
            public boolean retainAll(final Collection<?> c) {
                Preconditions.checkNotNull(c);
                boolean changed = false;
                for (final C columnKey : Lists.newArrayList((Iterator<? extends C>)StandardTable.this.columnKeySet().iterator())) {
                    if (!c.contains(StandardTable.this.column(columnKey))) {
                        StandardTable.this.removeColumn(columnKey);
                        changed = true;
                    }
                }
                return changed;
            }
        }
    }
}
