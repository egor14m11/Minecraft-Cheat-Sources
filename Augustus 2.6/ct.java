import com.google.common.collect.Iterators;
import com.google.common.base.Predicates;
import java.util.Iterator;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.IdentityHashMap;

// 
// Decompiled by Procyon v0.5.36
// 

public class ct<T> implements cs<T>
{
    private final IdentityHashMap<T, Integer> a;
    private final List<T> b;
    
    public ct() {
        this.a = new IdentityHashMap<T, Integer>(512);
        this.b = (List<T>)Lists.newArrayList();
    }
    
    public void a(final T \u2603, final int \u2603) {
        this.a.put(\u2603, \u2603);
        while (this.b.size() <= \u2603) {
            this.b.add(null);
        }
        this.b.set(\u2603, \u2603);
    }
    
    public int b(final T \u2603) {
        final Integer n = this.a.get(\u2603);
        return (n == null) ? -1 : n;
    }
    
    public final T a(final int \u2603) {
        if (\u2603 >= 0 && \u2603 < this.b.size()) {
            return this.b.get(\u2603);
        }
        return null;
    }
    
    @Override
    public Iterator<T> iterator() {
        return Iterators.filter(this.b.iterator(), Predicates.notNull());
    }
}
