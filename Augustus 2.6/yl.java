import com.google.common.collect.Sets;
import java.util.Set;

// 
// Decompiled by Procyon v0.5.36
// 

public class yl extends za
{
    private static final Set<afh> c;
    
    protected yl(final a \u2603) {
        super(3.0f, \u2603, yl.c);
    }
    
    @Override
    public float a(final zx \u2603, final afh \u2603) {
        if (\u2603.t() == arm.d || \u2603.t() == arm.k || \u2603.t() == arm.l) {
            return this.a;
        }
        return super.a(\u2603, \u2603);
    }
    
    static {
        c = Sets.newHashSet(afi.f, afi.X, afi.r, afi.s, afi.ae, afi.aU, afi.aZ, afi.bk, afi.au);
    }
}
