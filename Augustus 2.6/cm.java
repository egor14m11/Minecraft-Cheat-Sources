import java.util.NoSuchElementException;
import com.google.common.collect.UnmodifiableIterator;
import java.util.Collections;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import com.google.common.collect.Lists;
import com.google.common.base.Function;
import com.google.common.collect.Iterables;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class cm
{
    public static <T> Iterable<T[]> a(final Class<T> \u2603, final Iterable<? extends Iterable<? extends T>> \u2603) {
        return new b<T>((Class)\u2603, (Iterable[])b((Class<? super Iterable>)Iterable.class, (Iterable<? extends Iterable>)\u2603));
    }
    
    public static <T> Iterable<List<T>> a(final Iterable<? extends Iterable<? extends T>> \u2603) {
        return (Iterable<List<T>>)b(a(Object.class, \u2603));
    }
    
    private static <T> Iterable<List<T>> b(final Iterable<Object[]> \u2603) {
        return Iterables.transform(\u2603, (Function<? super Object[], ? extends List<T>>)new a());
    }
    
    private static <T> T[] b(final Class<? super T> \u2603, final Iterable<? extends T> \u2603) {
        final List<T> arrayList = (List<T>)Lists.newArrayList();
        for (final T next : \u2603) {
            arrayList.add(next);
        }
        return arrayList.toArray(b(\u2603, arrayList.size()));
    }
    
    private static <T> T[] b(final Class<? super T> \u2603, final int \u2603) {
        return (T[])Array.newInstance(\u2603, \u2603);
    }
    
    static class a<T> implements Function<Object[], List<T>>
    {
        private a() {
        }
        
        public List<T> a(final Object[] \u2603) {
            return Arrays.asList((T[])\u2603);
        }
    }
    
    static class b<T> implements Iterable<T[]>
    {
        private final Class<T> a;
        private final Iterable<? extends T>[] b;
        
        private b(final Class<T> \u2603, final Iterable<? extends T>[] \u2603) {
            this.a = \u2603;
            this.b = \u2603;
        }
        
        @Override
        public Iterator<T[]> iterator() {
            if (this.b.length <= 0) {
                return Collections.singletonList(b(this.a, 0)).iterator();
            }
            return (Iterator<T[]>)new a((Class)this.a, (Iterable[])this.b);
        }
        
        static class a<T> extends UnmodifiableIterator<T[]>
        {
            private int a;
            private final Iterable<? extends T>[] b;
            private final Iterator<? extends T>[] c;
            private final T[] d;
            
            private a(final Class<T> \u2603, final Iterable<? extends T>[] \u2603) {
                this.a = -2;
                this.b = \u2603;
                this.c = (Iterator<? extends T>[])b(Iterator.class, this.b.length);
                for (int i = 0; i < this.b.length; ++i) {
                    this.c[i] = \u2603[i].iterator();
                }
                this.d = (T[])b(\u2603, this.c.length);
            }
            
            private void b() {
                this.a = -1;
                Arrays.fill(this.c, null);
                Arrays.fill(this.d, null);
            }
            
            @Override
            public boolean hasNext() {
                if (this.a == -2) {
                    this.a = 0;
                    for (final Iterator<? extends T> iterator : this.c) {
                        if (!iterator.hasNext()) {
                            this.b();
                            break;
                        }
                    }
                    return true;
                }
                if (this.a >= this.c.length) {
                    this.a = this.c.length - 1;
                    while (this.a >= 0) {
                        Iterator<? extends T> iterator2 = this.c[this.a];
                        if (iterator2.hasNext()) {
                            break;
                        }
                        if (this.a == 0) {
                            this.b();
                            break;
                        }
                        iterator2 = this.b[this.a].iterator();
                        this.c[this.a] = iterator2;
                        if (!iterator2.hasNext()) {
                            this.b();
                            break;
                        }
                        --this.a;
                    }
                }
                return this.a >= 0;
            }
            
            public T[] a() {
                if (!this.hasNext()) {
                    throw new NoSuchElementException();
                }
                while (this.a < this.c.length) {
                    this.d[this.a] = (T)this.c[this.a].next();
                    ++this.a;
                }
                return this.d.clone();
            }
        }
    }
}
