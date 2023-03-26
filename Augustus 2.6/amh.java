import java.util.Iterator;
import com.google.common.collect.Maps;
import java.util.Map;
import com.google.common.base.Predicate;

// 
// Decompiled by Procyon v0.5.36
// 

public class amh implements Predicate<alz>
{
    private final ama a;
    private final Map<amo, Predicate> b;
    
    private amh(final ama \u2603) {
        this.b = (Map<amo, Predicate>)Maps.newHashMap();
        this.a = \u2603;
    }
    
    public static amh a(final afh \u2603) {
        return new amh(\u2603.P());
    }
    
    public boolean a(final alz \u2603) {
        if (\u2603 == null || !\u2603.c().equals(this.a.c())) {
            return false;
        }
        for (final Map.Entry<amo, Predicate> entry : this.b.entrySet()) {
            final Object b = \u2603.b(entry.getKey());
            if (!entry.getValue().apply(b)) {
                return false;
            }
        }
        return true;
    }
    
    public <V extends Comparable<V>> amh a(final amo<V> \u2603, final Predicate<? extends V> \u2603) {
        if (!this.a.d().contains(\u2603)) {
            throw new IllegalArgumentException(this.a + " cannot support property " + \u2603);
        }
        this.b.put(\u2603, \u2603);
        return this;
    }
}
