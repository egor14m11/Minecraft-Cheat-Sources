import java.util.Iterator;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class ait extends afd
{
    public static final amk a;
    private final a b;
    
    protected ait(final arm \u2603, final a \u2603) {
        super(\u2603);
        this.j(this.M.b().a((amo<Comparable>)ait.a, false));
        this.b = \u2603;
    }
    
    @Override
    protected int e(final alz \u2603) {
        return \u2603.b((amo<Boolean>)ait.a) ? 15 : 0;
    }
    
    @Override
    protected alz a(final alz \u2603, final int \u2603) {
        return \u2603.a((amo<Comparable>)ait.a, \u2603 > 0);
    }
    
    @Override
    protected int f(final adm \u2603, final cj \u2603) {
        final aug a = this.a(\u2603);
        List<? extends pk> list = null;
        switch (ait$1.a[this.b.ordinal()]) {
            case 1: {
                list = \u2603.b(null, a);
                break;
            }
            case 2: {
                list = \u2603.a((Class<? extends pk>)pr.class, a);
                break;
            }
            default: {
                return 0;
            }
        }
        if (!list.isEmpty()) {
            for (final pk pk : list) {
                if (!pk.aI()) {
                    return 15;
                }
            }
        }
        return 0;
    }
    
    @Override
    public alz a(final int \u2603) {
        return this.Q().a((amo<Comparable>)ait.a, \u2603 == 1);
    }
    
    @Override
    public int c(final alz \u2603) {
        return ((boolean)\u2603.b((amo<Boolean>)ait.a)) ? 1 : 0;
    }
    
    @Override
    protected ama e() {
        return new ama(this, new amo[] { ait.a });
    }
    
    static {
        a = amk.a("powered");
    }
    
    public enum a
    {
        a, 
        b;
    }
}
