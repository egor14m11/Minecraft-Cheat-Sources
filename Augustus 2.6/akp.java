// 
// Decompiled by Procyon v0.5.36
// 

public class akp extends afd
{
    public static final amn a;
    private final int b;
    
    protected akp(final arm \u2603, final int \u2603) {
        this(\u2603, \u2603, \u2603.r());
    }
    
    protected akp(final arm \u2603, final int \u2603, final arn \u2603) {
        super(\u2603, \u2603);
        this.j(this.M.b().a((amo<Comparable>)akp.a, 0));
        this.b = \u2603;
    }
    
    @Override
    protected int f(final adm \u2603, final cj \u2603) {
        final int min = Math.min(\u2603.a((Class<? extends pk>)pk.class, this.a(\u2603)).size(), this.b);
        if (min > 0) {
            final float n = Math.min(this.b, min) / (float)this.b;
            return ns.f(n * 15.0f);
        }
        return 0;
    }
    
    @Override
    protected int e(final alz \u2603) {
        return \u2603.b((amo<Integer>)akp.a);
    }
    
    @Override
    protected alz a(final alz \u2603, final int \u2603) {
        return \u2603.a((amo<Comparable>)akp.a, \u2603);
    }
    
    @Override
    public int a(final adm \u2603) {
        return 10;
    }
    
    @Override
    public alz a(final int \u2603) {
        return this.Q().a((amo<Comparable>)akp.a, \u2603);
    }
    
    @Override
    public int c(final alz \u2603) {
        return \u2603.b((amo<Integer>)akp.a);
    }
    
    @Override
    protected ama e() {
        return new ama(this, new amo[] { akp.a });
    }
    
    static {
        a = amn.a("power", 0, 15);
    }
}
