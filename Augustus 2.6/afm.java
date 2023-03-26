import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public class afm extends afh
{
    protected afm() {
        this(arm.k);
    }
    
    protected afm(final arm \u2603) {
        this(\u2603, \u2603.r());
    }
    
    protected afm(final arm \u2603, final arn \u2603) {
        super(\u2603, \u2603);
        this.a(true);
        final float n = 0.2f;
        this.a(0.5f - n, 0.0f, 0.5f - n, 0.5f + n, n * 3.0f, 0.5f + n);
        this.a(yz.c);
    }
    
    @Override
    public boolean d(final adm \u2603, final cj \u2603) {
        return super.d(\u2603, \u2603) && this.c(\u2603.p(\u2603.b()).c());
    }
    
    protected boolean c(final afh \u2603) {
        return \u2603 == afi.c || \u2603 == afi.d || \u2603 == afi.ak;
    }
    
    @Override
    public void a(final adm \u2603, final cj \u2603, final alz \u2603, final afh \u2603) {
        super.a(\u2603, \u2603, \u2603, \u2603);
        this.e(\u2603, \u2603, \u2603);
    }
    
    @Override
    public void b(final adm \u2603, final cj \u2603, final alz \u2603, final Random \u2603) {
        this.e(\u2603, \u2603, \u2603);
    }
    
    protected void e(final adm \u2603, final cj \u2603, final alz \u2603) {
        if (!this.f(\u2603, \u2603, \u2603)) {
            this.b(\u2603, \u2603, \u2603, 0);
            \u2603.a(\u2603, afi.a.Q(), 3);
        }
    }
    
    public boolean f(final adm \u2603, final cj \u2603, final alz \u2603) {
        return this.c(\u2603.p(\u2603.b()).c());
    }
    
    @Override
    public aug a(final adm \u2603, final cj \u2603, final alz \u2603) {
        return null;
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
    public adf m() {
        return adf.c;
    }
}
