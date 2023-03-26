import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public class aid extends afm
{
    public static final amn a;
    
    protected aid() {
        super(arm.k, arn.D);
        this.j(this.M.b().a((amo<Comparable>)aid.a, 0));
        this.a(true);
        final float n = 0.5f;
        this.a(0.5f - n, 0.0f, 0.5f - n, 0.5f + n, 0.25f, 0.5f + n);
        this.a((yz)null);
    }
    
    @Override
    protected boolean c(final afh \u2603) {
        return \u2603 == afi.aW;
    }
    
    @Override
    public boolean f(final adm \u2603, final cj \u2603, final alz \u2603) {
        return this.c(\u2603.p(\u2603.b()).c());
    }
    
    @Override
    public void b(final adm \u2603, final cj \u2603, alz \u2603, final Random \u2603) {
        final int intValue = \u2603.b((amo<Integer>)aid.a);
        if (intValue < 3 && \u2603.nextInt(10) == 0) {
            \u2603 = \u2603.a((amo<Comparable>)aid.a, intValue + 1);
            \u2603.a(\u2603, \u2603, 2);
        }
        super.b(\u2603, \u2603, \u2603, \u2603);
    }
    
    @Override
    public void a(final adm \u2603, final cj \u2603, final alz \u2603, final float \u2603, final int \u2603) {
        if (\u2603.D) {
            return;
        }
        int n = 1;
        if (\u2603.b((amo<Integer>)aid.a) >= 3) {
            n = 2 + \u2603.s.nextInt(3);
            if (\u2603 > 0) {
                n += \u2603.s.nextInt(\u2603 + 1);
            }
        }
        for (int i = 0; i < n; ++i) {
            afh.a(\u2603, \u2603, new zx(zy.by));
        }
    }
    
    @Override
    public zw a(final alz \u2603, final Random \u2603, final int \u2603) {
        return null;
    }
    
    @Override
    public int a(final Random \u2603) {
        return 0;
    }
    
    @Override
    public zw c(final adm \u2603, final cj \u2603) {
        return zy.by;
    }
    
    @Override
    public alz a(final int \u2603) {
        return this.Q().a((amo<Comparable>)aid.a, \u2603);
    }
    
    @Override
    public int c(final alz \u2603) {
        return \u2603.b((amo<Integer>)aid.a);
    }
    
    @Override
    protected ama e() {
        return new ama(this, new amo[] { aid.a });
    }
    
    static {
        a = amn.a("age", 0, 3);
    }
}
