import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public class afp extends afh
{
    public static final amn a;
    
    protected afp() {
        super(arm.F);
        this.j(this.M.b().a((amo<Comparable>)afp.a, 0));
        this.a(true);
    }
    
    @Override
    public void a(final adq \u2603, final cj \u2603) {
        final float \u26032 = 0.0625f;
        final float \u26033 = (1 + \u2603.p(\u2603).b((amo<Integer>)afp.a) * 2) / 16.0f;
        final float \u26034 = 0.5f;
        this.a(\u26033, 0.0f, \u26032, 1.0f - \u26032, \u26034, 1.0f - \u26032);
    }
    
    @Override
    public void j() {
        final float n = 0.0625f;
        final float \u2603 = 0.5f;
        this.a(n, 0.0f, n, 1.0f - n, \u2603, 1.0f - n);
    }
    
    @Override
    public aug a(final adm \u2603, final cj \u2603, final alz \u2603) {
        final float n = 0.0625f;
        final float n2 = (1 + \u2603.b((amo<Integer>)afp.a) * 2) / 16.0f;
        final float n3 = 0.5f;
        return new aug(\u2603.n() + n2, \u2603.o(), \u2603.p() + n, \u2603.n() + 1 - n, \u2603.o() + n3, \u2603.p() + 1 - n);
    }
    
    @Override
    public aug b(final adm \u2603, final cj \u2603) {
        return this.a(\u2603, \u2603, \u2603.p(\u2603));
    }
    
    @Override
    public boolean d() {
        return false;
    }
    
    @Override
    public boolean c() {
        return false;
    }
    
    @Override
    public boolean a(final adm \u2603, final cj \u2603, final alz \u2603, final wn \u2603, final cq \u2603, final float \u2603, final float \u2603, final float \u2603) {
        this.b(\u2603, \u2603, \u2603, \u2603);
        return true;
    }
    
    @Override
    public void a(final adm \u2603, final cj \u2603, final wn \u2603) {
        this.b(\u2603, \u2603, \u2603.p(\u2603), \u2603);
    }
    
    private void b(final adm \u2603, final cj \u2603, final alz \u2603, final wn \u2603) {
        if (!\u2603.j(false)) {
            return;
        }
        \u2603.b(na.H);
        \u2603.cl().a(2, 0.1f);
        final int intValue = \u2603.b((amo<Integer>)afp.a);
        if (intValue < 6) {
            \u2603.a(\u2603, \u2603.a((amo<Comparable>)afp.a, intValue + 1), 3);
        }
        else {
            \u2603.g(\u2603);
        }
    }
    
    @Override
    public boolean d(final adm \u2603, final cj \u2603) {
        return super.d(\u2603, \u2603) && this.e(\u2603, \u2603);
    }
    
    @Override
    public void a(final adm \u2603, final cj \u2603, final alz \u2603, final afh \u2603) {
        if (!this.e(\u2603, \u2603)) {
            \u2603.g(\u2603);
        }
    }
    
    private boolean e(final adm \u2603, final cj \u2603) {
        return \u2603.p(\u2603.b()).c().t().a();
    }
    
    @Override
    public int a(final Random \u2603) {
        return 0;
    }
    
    @Override
    public zw a(final alz \u2603, final Random \u2603, final int \u2603) {
        return null;
    }
    
    @Override
    public zw c(final adm \u2603, final cj \u2603) {
        return zy.aZ;
    }
    
    @Override
    public adf m() {
        return adf.c;
    }
    
    @Override
    public alz a(final int \u2603) {
        return this.Q().a((amo<Comparable>)afp.a, \u2603);
    }
    
    @Override
    public int c(final alz \u2603) {
        return \u2603.b((amo<Integer>)afp.a);
    }
    
    @Override
    protected ama e() {
        return new ama(this, new amo[] { afp.a });
    }
    
    @Override
    public int l(final adm \u2603, final cj \u2603) {
        return (7 - \u2603.p(\u2603).b((amo<Integer>)afp.a)) * 2;
    }
    
    @Override
    public boolean O() {
        return true;
    }
    
    static {
        a = amn.a("bites", 0, 6);
    }
}
