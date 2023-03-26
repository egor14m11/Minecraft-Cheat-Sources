import com.google.common.collect.Collections2;
import com.google.common.collect.Lists;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import java.util.Collection;

// 
// Decompiled by Procyon v0.5.36
// 

public class aml extends amm<cq>
{
    protected aml(final String \u2603, final Collection<cq> \u2603) {
        super(\u2603, cq.class, \u2603);
    }
    
    public static aml a(final String \u2603) {
        return a(\u2603, Predicates.alwaysTrue());
    }
    
    public static aml a(final String \u2603, final Predicate<cq> \u2603) {
        return a(\u2603, Collections2.filter(Lists.newArrayList(cq.values()), \u2603));
    }
    
    public static aml a(final String \u2603, final Collection<cq> \u2603) {
        return new aml(\u2603, \u2603);
    }
}
