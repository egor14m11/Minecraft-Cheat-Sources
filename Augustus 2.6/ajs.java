import java.util.Random;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class ajs extends ahj
{
    public static final amm<zd> a;
    
    public ajs(final arm \u2603) {
        super(\u2603, false);
        this.j(this.M.b().a(ajs.a, zd.a));
        this.a(yz.b);
    }
    
    @Override
    public int a(final alz \u2603) {
        return \u2603.b(ajs.a).a();
    }
    
    @Override
    public void a(final zw \u2603, final yz \u2603, final List<zx> \u2603) {
        for (final zd zd : zd.values()) {
            \u2603.add(new zx(\u2603, 1, zd.a()));
        }
    }
    
    @Override
    public arn g(final alz \u2603) {
        return \u2603.b(ajs.a).e();
    }
    
    @Override
    public adf m() {
        return adf.d;
    }
    
    @Override
    public int a(final Random \u2603) {
        return 0;
    }
    
    @Override
    protected boolean I() {
        return true;
    }
    
    @Override
    public boolean d() {
        return false;
    }
    
    @Override
    public alz a(final int \u2603) {
        return this.Q().a(ajs.a, zd.b(\u2603));
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
    
    @Override
    public int c(final alz \u2603) {
        return \u2603.b(ajs.a).a();
    }
    
    @Override
    protected ama e() {
        return new ama(this, new amo[] { ajs.a });
    }
    
    static {
        a = amm.a("color", zd.class);
    }
}
