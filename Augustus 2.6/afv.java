import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class afv extends afh
{
    public static final amm<zd> a;
    
    public afv(final arm \u2603) {
        super(\u2603);
        this.j(this.M.b().a(afv.a, zd.a));
        this.a(yz.b);
    }
    
    @Override
    public int a(final alz \u2603) {
        return \u2603.b(afv.a).a();
    }
    
    @Override
    public void a(final zw \u2603, final yz \u2603, final List<zx> \u2603) {
        for (final zd zd : zd.values()) {
            \u2603.add(new zx(\u2603, 1, zd.a()));
        }
    }
    
    @Override
    public arn g(final alz \u2603) {
        return \u2603.b(afv.a).e();
    }
    
    @Override
    public alz a(final int \u2603) {
        return this.Q().a(afv.a, zd.b(\u2603));
    }
    
    @Override
    public int c(final alz \u2603) {
        return \u2603.b(afv.a).a();
    }
    
    @Override
    protected ama e() {
        return new ama(this, new amo[] { afv.a });
    }
    
    static {
        a = amm.a("color", zd.class);
    }
}
