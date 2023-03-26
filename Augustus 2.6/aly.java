import com.google.common.collect.Iterables;
import java.util.Iterator;
import java.util.Collection;
import java.util.Map;
import com.google.common.base.Function;
import com.google.common.base.Joiner;

// 
// Decompiled by Procyon v0.5.36
// 

public abstract class aly implements alz
{
    private static final Joiner a;
    private static final Function<Map.Entry<amo, Comparable>, String> b;
    
    @Override
    public <T extends Comparable<T>> alz a(final amo<T> \u2603) {
        return this.a(\u2603, (Comparable)a((Collection<V>)\u2603.c(), (V)this.b((amo<T>)\u2603)));
    }
    
    protected static <T> T a(final Collection<T> \u2603, final T \u2603) {
        final Iterator<T> iterator = \u2603.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals(\u2603)) {
                if (iterator.hasNext()) {
                    return iterator.next();
                }
                return \u2603.iterator().next();
            }
        }
        return iterator.next();
    }
    
    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append(afh.c.c(this.c()));
        if (!this.b().isEmpty()) {
            builder.append("[");
            aly.a.appendTo(builder, Iterables.transform((Iterable<Map.Entry<amo, Comparable>>)this.b().entrySet(), (Function<? super Map.Entry<amo, Comparable>, ?>)aly.b));
            builder.append("]");
        }
        return builder.toString();
    }
    
    static {
        a = Joiner.on(',');
        b = new Function<Map.Entry<amo, Comparable>, String>() {
            public String a(final Map.Entry<amo, Comparable> \u2603) {
                if (\u2603 == null) {
                    return "<NULL>";
                }
                final amo amo = \u2603.getKey();
                return amo.a() + "=" + amo.a(\u2603.getValue());
            }
        };
    }
}
