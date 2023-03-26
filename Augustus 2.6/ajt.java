import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class ajt extends akd
{
    public static final amm<zd> a;
    
    public ajt() {
        super(arm.s, false);
        this.j(this.M.b().a((amo<Comparable>)ajt.b, false).a((amo<Comparable>)ajt.N, false).a((amo<Comparable>)ajt.O, false).a((amo<Comparable>)ajt.P, false).a(ajt.a, zd.a));
        this.a(yz.c);
    }
    
    @Override
    public int a(final alz \u2603) {
        return \u2603.b(ajt.a).a();
    }
    
    @Override
    public void a(final zw \u2603, final yz \u2603, final List<zx> \u2603) {
        for (int i = 0; i < zd.values().length; ++i) {
            \u2603.add(new zx(\u2603, 1, i));
        }
    }
    
    @Override
    public arn g(final alz \u2603) {
        return \u2603.b(ajt.a).e();
    }
    
    @Override
    public adf m() {
        return adf.d;
    }
    
    @Override
    public alz a(final int \u2603) {
        return this.Q().a(ajt.a, zd.b(\u2603));
    }
    
    @Override
    public int c(final alz \u2603) {
        return \u2603.b(ajt.a).a();
    }
    
    @Override
    protected ama e() {
        return new ama(this, new amo[] { ajt.b, ajt.N, ajt.P, ajt.O, ajt.a });
    }
    
    @Override
    public void c(final adm \u2603, final cj \u2603, final alz \u2603) {
        if (!\u2603.D) {
            aff.f(\u2603, \u2603);
        }
    }
    
    @Override
    public void b(final adm \u2603, final cj \u2603, final alz \u2603) {
        if (!\u2603.D) {
            aff.f(\u2603, \u2603);
        }
    }
    
    static {
        a = amm.a("color", zd.class);
    }
}
