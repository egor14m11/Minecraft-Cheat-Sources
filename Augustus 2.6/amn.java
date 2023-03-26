import java.util.Set;
import java.util.Collection;
import com.google.common.collect.Sets;
import com.google.common.collect.ImmutableSet;

// 
// Decompiled by Procyon v0.5.36
// 

public class amn extends amj<Integer>
{
    private final ImmutableSet<Integer> a;
    
    protected amn(final String \u2603, final int \u2603, final int \u2603) {
        super(\u2603, Integer.class);
        if (\u2603 < 0) {
            throw new IllegalArgumentException("Min value of " + \u2603 + " must be 0 or greater");
        }
        if (\u2603 <= \u2603) {
            throw new IllegalArgumentException("Max value of " + \u2603 + " must be greater than min (" + \u2603 + ")");
        }
        final Set<Integer> hashSet = (Set<Integer>)Sets.newHashSet();
        for (int i = \u2603; i <= \u2603; ++i) {
            hashSet.add(i);
        }
        this.a = ImmutableSet.copyOf((Collection<? extends Integer>)hashSet);
    }
    
    @Override
    public Collection<Integer> c() {
        return this.a;
    }
    
    @Override
    public boolean equals(final Object \u2603) {
        if (this == \u2603) {
            return true;
        }
        if (\u2603 == null || this.getClass() != \u2603.getClass()) {
            return false;
        }
        if (!super.equals(\u2603)) {
            return false;
        }
        final amn amn = (amn)\u2603;
        return this.a.equals(amn.a);
    }
    
    @Override
    public int hashCode() {
        int hashCode = super.hashCode();
        hashCode = 31 * hashCode + this.a.hashCode();
        return hashCode;
    }
    
    public static amn a(final String \u2603, final int \u2603, final int \u2603) {
        return new amn(\u2603, \u2603, \u2603);
    }
    
    @Override
    public String a(final Integer \u2603) {
        return \u2603.toString();
    }
}
