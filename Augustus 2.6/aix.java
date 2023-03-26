// 
// Decompiled by Procyon v0.5.36
// 

public class aix extends afe
{
    public static final amm<b> b;
    
    protected aix() {
        super(false);
        this.j(this.M.b().a(aix.b, afe.b.a));
    }
    
    @Override
    protected void b(final adm \u2603, final cj \u2603, final alz \u2603, final afh \u2603) {
        if (\u2603.i() && new a(\u2603, \u2603, \u2603).a() == 3) {
            this.a(\u2603, \u2603, \u2603, false);
        }
    }
    
    @Override
    public amo<b> n() {
        return aix.b;
    }
    
    @Override
    public alz a(final int \u2603) {
        return this.Q().a(aix.b, afe.b.a(\u2603));
    }
    
    @Override
    public int c(final alz \u2603) {
        return \u2603.b(aix.b).a();
    }
    
    @Override
    protected ama e() {
        return new ama(this, new amo[] { aix.b });
    }
    
    static {
        b = amm.a("shape", b.class);
    }
}
