import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class akn extends afm
{
    protected akn() {
        final float n = 0.5f;
        final float \u2603 = 0.015625f;
        this.a(0.5f - n, 0.0f, 0.5f - n, 0.5f + n, \u2603, 0.5f + n);
        this.a(yz.c);
    }
    
    @Override
    public void a(final adm \u2603, final cj \u2603, final alz \u2603, final aug \u2603, final List<aug> \u2603, final pk \u2603) {
        if (\u2603 == null || !(\u2603 instanceof ux)) {
            super.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        }
    }
    
    @Override
    public aug a(final adm \u2603, final cj \u2603, final alz \u2603) {
        return new aug(\u2603.n() + this.B, \u2603.o() + this.C, \u2603.p() + this.D, \u2603.n() + this.E, \u2603.o() + this.F, \u2603.p() + this.G);
    }
    
    @Override
    public int H() {
        return 7455580;
    }
    
    @Override
    public int h(final alz \u2603) {
        return 7455580;
    }
    
    @Override
    public int a(final adq \u2603, final cj \u2603, final int \u2603) {
        return 2129968;
    }
    
    @Override
    protected boolean c(final afh \u2603) {
        return \u2603 == afi.j;
    }
    
    @Override
    public boolean f(final adm \u2603, final cj \u2603, final alz \u2603) {
        if (\u2603.o() < 0 || \u2603.o() >= 256) {
            return false;
        }
        final alz p = \u2603.p(\u2603.b());
        return p.c().t() == arm.h && p.b((amo<Integer>)ahv.b) == 0;
    }
    
    @Override
    public int c(final alz \u2603) {
        return 0;
    }
}
