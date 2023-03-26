import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class aks extends afh
{
    public static final amm<zd> a;
    
    protected aks() {
        super(arm.r);
        this.j(this.M.b().a(aks.a, zd.a));
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 0.0625f, 1.0f);
        this.a(true);
        this.a(yz.c);
        this.b(0);
    }
    
    @Override
    public arn g(final alz \u2603) {
        return \u2603.b(aks.a).e();
    }
    
    @Override
    public boolean c() {
        return false;
    }
    
    @Override
    public boolean d() {
        return false;
    }
    
    @Override
    public void j() {
        this.b(0);
    }
    
    @Override
    public void a(final adq \u2603, final cj \u2603) {
        this.b(0);
    }
    
    protected void b(final int \u2603) {
        final int n = 0;
        final float \u26032 = 1 * (1 + n) / 16.0f;
        this.a(0.0f, 0.0f, 0.0f, 1.0f, \u26032, 1.0f);
    }
    
    @Override
    public boolean d(final adm \u2603, final cj \u2603) {
        return super.d(\u2603, \u2603) && this.e(\u2603, \u2603);
    }
    
    @Override
    public void a(final adm \u2603, final cj \u2603, final alz \u2603, final afh \u2603) {
        this.e(\u2603, \u2603, \u2603);
    }
    
    private boolean e(final adm \u2603, final cj \u2603, final alz \u2603) {
        if (!this.e(\u2603, \u2603)) {
            this.b(\u2603, \u2603, \u2603, 0);
            \u2603.g(\u2603);
            return false;
        }
        return true;
    }
    
    private boolean e(final adm \u2603, final cj \u2603) {
        return !\u2603.d(\u2603.b());
    }
    
    @Override
    public boolean a(final adq \u2603, final cj \u2603, final cq \u2603) {
        return \u2603 == cq.b || super.a(\u2603, \u2603, \u2603);
    }
    
    @Override
    public int a(final alz \u2603) {
        return \u2603.b(aks.a).a();
    }
    
    @Override
    public void a(final zw \u2603, final yz \u2603, final List<zx> \u2603) {
        for (int i = 0; i < 16; ++i) {
            \u2603.add(new zx(\u2603, 1, i));
        }
    }
    
    @Override
    public alz a(final int \u2603) {
        return this.Q().a(aks.a, zd.b(\u2603));
    }
    
    @Override
    public int c(final alz \u2603) {
        return \u2603.b(aks.a).a();
    }
    
    @Override
    protected ama e() {
        return new ama(this, new amo[] { aks.a });
    }
    
    static {
        a = amm.a("color", zd.class);
    }
}
