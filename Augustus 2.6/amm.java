import com.google.common.collect.Collections2;
import com.google.common.collect.Lists;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import java.util.Iterator;
import com.google.common.collect.Maps;
import java.util.Collection;
import java.util.Map;
import com.google.common.collect.ImmutableSet;

// 
// Decompiled by Procyon v0.5.36
// 

public class amm<T extends Enum> extends amj<T>
{
    private final ImmutableSet<T> a;
    private final Map<String, T> b;
    
    protected amm(final String \u2603, final Class<T> \u2603, final Collection<T> \u2603) {
        super(\u2603, \u2603);
        this.b = (Map<String, T>)Maps.newHashMap();
        this.a = ImmutableSet.copyOf((Collection<? extends T>)\u2603);
        for (final T t : \u2603) {
            final String l = ((nw)t).l();
            if (this.b.containsKey(l)) {
                throw new IllegalArgumentException("Multiple values have the same name '" + l + "'");
            }
            this.b.put(l, t);
        }
    }
    
    @Override
    public Collection<T> c() {
        return this.a;
    }
    
    @Override
    public String a(final T \u2603) {
        return ((nw)\u2603).l();
    }
    
    public static <T extends java.lang.Enum> amm<T> a(final String \u2603, final Class<T> \u2603) {
        return a(\u2603, \u2603, Predicates.alwaysTrue());
    }
    
    public static <T extends java.lang.Enum> amm<T> a(final String \u2603, final Class<T> \u2603, final Predicate<T> \u2603) {
        return a(\u2603, \u2603, (Collection<T>)Collections2.filter((Collection<T>)Lists.newArrayList(\u2603.getEnumConstants()), (Predicate<? super T>)\u2603));
    }
    
    public static <T extends java.lang.Enum> amm<T> a(final String \u2603, final Class<T> \u2603, final T... \u2603) {
        return a(\u2603, \u2603, Lists.newArrayList(\u2603));
    }
    
    public static <T extends java.lang.Enum> amm<T> a(final String \u2603, final Class<T> \u2603, final Collection<T> \u2603) {
        return new amm<T>(\u2603, \u2603, \u2603);
    }
}
