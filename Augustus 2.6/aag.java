import com.google.common.collect.Sets;
import java.util.Set;

// 
// Decompiled by Procyon v0.5.36
// 

public class aag extends za
{
    private static final Set<afh> c;
    
    protected aag(final a \u2603) {
        super(2.0f, \u2603, aag.c);
    }
    
    @Override
    public boolean b(final afh \u2603) {
        if (\u2603 == afi.Z) {
            return this.b.d() == 3;
        }
        if (\u2603 == afi.ah || \u2603 == afi.ag) {
            return this.b.d() >= 2;
        }
        if (\u2603 == afi.bP || \u2603 == afi.bT) {
            return this.b.d() >= 2;
        }
        if (\u2603 == afi.R || \u2603 == afi.o) {
            return this.b.d() >= 2;
        }
        if (\u2603 == afi.S || \u2603 == afi.p) {
            return this.b.d() >= 1;
        }
        if (\u2603 == afi.y || \u2603 == afi.x) {
            return this.b.d() >= 1;
        }
        if (\u2603 == afi.aC || \u2603 == afi.aD) {
            return this.b.d() >= 2;
        }
        return \u2603.t() == arm.e || \u2603.t() == arm.f || \u2603.t() == arm.g;
    }
    
    @Override
    public float a(final zx \u2603, final afh \u2603) {
        if (\u2603.t() == arm.f || \u2603.t() == arm.g || \u2603.t() == arm.e) {
            return this.a;
        }
        return super.a(\u2603, \u2603);
    }
    
    static {
        c = Sets.newHashSet(afi.cs, afi.q, afi.e, afi.E, afi.ah, afi.ag, afi.T, afi.D, afi.R, afi.o, afi.aI, afi.S, afi.p, afi.y, afi.x, afi.aD, afi.Y, afi.aV, afi.cB, afi.av, afi.aC, afi.A, afi.cM, afi.b, afi.U);
    }
}
