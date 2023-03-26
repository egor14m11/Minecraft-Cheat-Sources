import com.google.common.collect.Iterators;
import java.util.Iterator;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.AbstractSet;

// 
// Decompiled by Procyon v0.5.36
// 

public class ne<T> extends AbstractSet<T>
{
    private static final Set<Class<?>> a;
    private final Map<Class<?>, List<T>> b;
    private final Set<Class<?>> c;
    private final Class<T> d;
    private final List<T> e;
    
    public ne(final Class<T> \u2603) {
        this.b = (Map<Class<?>, List<T>>)Maps.newHashMap();
        this.c = Sets.newIdentityHashSet();
        this.e = (List<T>)Lists.newArrayList();
        this.d = \u2603;
        this.c.add(\u2603);
        this.b.put((Class<?>)\u2603, (List<?>)this.e);
        for (final Class<?> \u26032 : ne.a) {
            this.a(\u26032);
        }
    }
    
    protected void a(final Class<?> \u2603) {
        ne.a.add(\u2603);
        for (final T next : this.e) {
            if (\u2603.isAssignableFrom(next.getClass())) {
                this.a(next, \u2603);
            }
        }
        this.c.add(\u2603);
    }
    
    protected Class<?> b(final Class<?> \u2603) {
        if (this.d.isAssignableFrom(\u2603)) {
            if (!this.c.contains(\u2603)) {
                this.a(\u2603);
            }
            return \u2603;
        }
        throw new IllegalArgumentException("Don't know how to search for " + \u2603);
    }
    
    @Override
    public boolean add(final T \u2603) {
        for (final Class<?> \u26032 : this.c) {
            if (\u26032.isAssignableFrom(\u2603.getClass())) {
                this.a(\u2603, \u26032);
            }
        }
        return true;
    }
    
    private void a(final T \u2603, final Class<?> \u2603) {
        final List<T> list = this.b.get(\u2603);
        if (list == null) {
            this.b.put(\u2603, Lists.newArrayList(\u2603));
        }
        else {
            list.add(\u2603);
        }
    }
    
    @Override
    public boolean remove(final Object \u2603) {
        final T t = (T)\u2603;
        boolean b = false;
        for (final Class<?> clazz : this.c) {
            if (clazz.isAssignableFrom(t.getClass())) {
                final List<T> list = this.b.get(clazz);
                if (list == null || !list.remove(t)) {
                    continue;
                }
                b = true;
            }
        }
        return b;
    }
    
    @Override
    public boolean contains(final Object \u2603) {
        return Iterators.contains(this.c(\u2603.getClass()).iterator(), \u2603);
    }
    
    public <S> Iterable<S> c(final Class<S> \u2603) {
        return new Iterable<S>() {
            @Override
            public Iterator<S> iterator() {
                final List<T> list = ne.this.b.get(ne.this.b(\u2603));
                if (list == null) {
                    return (Iterator<S>)Iterators.emptyIterator();
                }
                final Iterator<T> iterator = list.iterator();
                return (Iterator<S>)Iterators.filter(iterator, (Class<Object>)\u2603);
            }
        };
    }
    
    @Override
    public Iterator<T> iterator() {
        if (this.e.isEmpty()) {
            return (Iterator<T>)Iterators.emptyIterator();
        }
        return (Iterator<T>)Iterators.unmodifiableIterator((Iterator<?>)this.e.iterator());
    }
    
    @Override
    public int size() {
        return this.e.size();
    }
    
    static {
        a = Sets.newHashSet();
    }
}
