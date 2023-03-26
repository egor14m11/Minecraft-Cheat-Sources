import com.google.common.base.Objects;

// 
// Decompiled by Procyon v0.5.36
// 

public abstract class amj<T extends Comparable<T>> implements amo<T>
{
    private final Class<T> a;
    private final String b;
    
    protected amj(final String \u2603, final Class<T> \u2603) {
        this.a = \u2603;
        this.b = \u2603;
    }
    
    @Override
    public String a() {
        return this.b;
    }
    
    @Override
    public Class<T> b() {
        return this.a;
    }
    
    @Override
    public String toString() {
        return Objects.toStringHelper((Object)this).add("name", (Object)this.b).add("clazz", (Object)this.a).add("values", (Object)this.c()).toString();
    }
    
    @Override
    public boolean equals(final Object \u2603) {
        if (this == \u2603) {
            return true;
        }
        if (\u2603 == null || this.getClass() != \u2603.getClass()) {
            return false;
        }
        final amj amj = (amj)\u2603;
        return this.a.equals(amj.a) && this.b.equals(amj.b);
    }
    
    @Override
    public int hashCode() {
        return 31 * this.a.hashCode() + this.b.hashCode();
    }
}
