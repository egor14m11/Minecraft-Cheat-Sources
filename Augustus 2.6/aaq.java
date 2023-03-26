import com.google.common.collect.Sets;
import java.util.Set;

// 
// Decompiled by Procyon v0.5.36
// 

public class aaq extends za
{
    private static final Set<afh> c;
    
    public aaq(final a \u2603) {
        super(1.0f, \u2603, aaq.c);
    }
    
    @Override
    public boolean b(final afh \u2603) {
        return \u2603 == afi.aH || \u2603 == afi.aJ;
    }
    
    static {
        c = Sets.newHashSet(afi.aL, afi.d, afi.ak, afi.c, afi.n, afi.bw, afi.m, afi.aJ, afi.aH, afi.aW);
    }
}
