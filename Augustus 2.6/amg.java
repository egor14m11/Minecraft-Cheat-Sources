import com.google.common.base.Predicate;

// 
// Decompiled by Procyon v0.5.36
// 

public class amg implements Predicate<alz>
{
    private final afh a;
    
    private amg(final afh \u2603) {
        this.a = \u2603;
    }
    
    public static amg a(final afh \u2603) {
        return new amg(\u2603);
    }
    
    public boolean a(final alz \u2603) {
        return \u2603 != null && \u2603.c() == this.a;
    }
}
