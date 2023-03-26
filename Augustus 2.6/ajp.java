import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public class ajp extends afh
{
    public static final amn a;
    
    protected ajp() {
        super(arm.y);
        this.j(this.M.b().a((amo<Comparable>)ajp.a, 1));
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 0.125f, 1.0f);
        this.a(true);
        this.a(yz.c);
        this.j();
    }
    
    @Override
    public boolean b(final adq \u2603, final cj \u2603) {
        return \u2603.p(\u2603).b((amo<Integer>)ajp.a) < 5;
    }
    
    @Override
    public aug a(final adm \u2603, final cj \u2603, final alz \u2603) {
        final int n = \u2603.b((amo<Integer>)ajp.a) - 1;
        final float n2 = 0.125f;
        return new aug(\u2603.n() + this.B, \u2603.o() + this.C, \u2603.p() + this.D, \u2603.n() + this.E, \u2603.o() + n * n2, \u2603.p() + this.G);
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
        final alz p = \u2603.p(\u2603);
        this.b(p.b((amo<Integer>)ajp.a));
    }
    
    protected void b(final int \u2603) {
        this.a(0.0f, 0.0f, 0.0f, 1.0f, \u2603 / 8.0f, 1.0f);
    }
    
    @Override
    public boolean d(final adm \u2603, final cj \u2603) {
        final alz p = \u2603.p(\u2603.b());
        final afh c = p.c();
        return c != afi.aI && c != afi.cB && (c.t() == arm.j || (c == this && p.b((amo<Integer>)ajp.a) >= 7) || (c.c() && c.J.c()));
    }
    
    @Override
    public void a(final adm \u2603, final cj \u2603, final alz \u2603, final afh \u2603) {
        this.e(\u2603, \u2603, \u2603);
    }
    
    private boolean e(final adm \u2603, final cj \u2603, final alz \u2603) {
        if (!this.d(\u2603, \u2603)) {
            this.b(\u2603, \u2603, \u2603, 0);
            \u2603.g(\u2603);
            return false;
        }
        return true;
    }
    
    @Override
    public void a(final adm \u2603, final wn \u2603, final cj \u2603, final alz \u2603, final akw \u2603) {
        afh.a(\u2603, \u2603, new zx(zy.aD, \u2603.b((amo<Integer>)ajp.a) + 1, 0));
        \u2603.g(\u2603);
        \u2603.b(na.ab[afh.a(this)]);
    }
    
    @Override
    public zw a(final alz \u2603, final Random \u2603, final int \u2603) {
        return zy.aD;
    }
    
    @Override
    public int a(final Random \u2603) {
        return 0;
    }
    
    @Override
    public void b(final adm \u2603, final cj \u2603, final alz \u2603, final Random \u2603) {
        if (\u2603.b(ads.b, \u2603) > 11) {
            this.b(\u2603, \u2603, \u2603.p(\u2603), 0);
            \u2603.g(\u2603);
        }
    }
    
    @Override
    public boolean a(final adq \u2603, final cj \u2603, final cq \u2603) {
        return \u2603 == cq.b || super.a(\u2603, \u2603, \u2603);
    }
    
    @Override
    public alz a(final int \u2603) {
        return this.Q().a((amo<Comparable>)ajp.a, (\u2603 & 0x7) + 1);
    }
    
    @Override
    public boolean a(final adm \u2603, final cj \u2603) {
        return \u2603.p(\u2603).b((amo<Integer>)ajp.a) == 1;
    }
    
    @Override
    public int c(final alz \u2603) {
        return \u2603.b((amo<Integer>)ajp.a) - 1;
    }
    
    @Override
    protected ama e() {
        return new ama(this, new amo[] { ajp.a });
    }
    
    static {
        a = amn.a("layers", 1, 8);
    }
}
