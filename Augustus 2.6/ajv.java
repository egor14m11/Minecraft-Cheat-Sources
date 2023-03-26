// 
// Decompiled by Procyon v0.5.36
// 

public class ajv extends ajl
{
    public static final amn a;
    
    public ajv() {
        this.j(this.M.b().a((amo<Comparable>)ajv.a, 0));
    }
    
    @Override
    public void a(final adm \u2603, final cj \u2603, final alz \u2603, final afh \u2603) {
        if (!\u2603.p(\u2603.b()).c().t().a()) {
            this.b(\u2603, \u2603, \u2603, 0);
            \u2603.g(\u2603);
        }
        super.a(\u2603, \u2603, \u2603, \u2603);
    }
    
    @Override
    public alz a(final int \u2603) {
        return this.Q().a((amo<Comparable>)ajv.a, \u2603);
    }
    
    @Override
    public int c(final alz \u2603) {
        return \u2603.b((amo<Integer>)ajv.a);
    }
    
    @Override
    protected ama e() {
        return new ama(this, new amo[] { ajv.a });
    }
    
    static {
        a = amn.a("rotation", 0, 15);
    }
}
