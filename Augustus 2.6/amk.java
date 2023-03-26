import java.util.Collection;
import com.google.common.collect.ImmutableSet;

// 
// Decompiled by Procyon v0.5.36
// 

public class amk extends amj<Boolean>
{
    private final ImmutableSet<Boolean> a;
    
    protected amk(final String \u2603) {
        super(\u2603, Boolean.class);
        this.a = ImmutableSet.of(true, false);
    }
    
    @Override
    public Collection<Boolean> c() {
        return this.a;
    }
    
    public static amk a(final String \u2603) {
        return new amk(\u2603);
    }
    
    @Override
    public String a(final Boolean \u2603) {
        return \u2603.toString();
    }
}
