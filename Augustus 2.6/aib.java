import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public class aib extends afh
{
    public static final amk a;
    
    protected aib() {
        super(arm.b, arn.z);
        this.j(this.M.b().a((amo<Comparable>)aib.a, false));
        this.a(true);
        this.a(yz.b);
    }
    
    @Override
    public alz a(final alz \u2603, final adq \u2603, final cj \u2603) {
        final afh c = \u2603.p(\u2603.a()).c();
        return \u2603.a((amo<Comparable>)aib.a, c == afi.aJ || c == afi.aH);
    }
    
    @Override
    public void b(final adm \u2603, final cj \u2603, final alz \u2603, final Random \u2603) {
        if (\u2603.D) {
            return;
        }
        if (\u2603.l(\u2603.a()) < 4 && \u2603.p(\u2603.a()).c().p() > 2) {
            \u2603.a(\u2603, afi.d.Q().a(agf.a, agf.a.a));
            return;
        }
        if (\u2603.l(\u2603.a()) >= 9) {
            for (int i = 0; i < 4; ++i) {
                final cj a = \u2603.a(\u2603.nextInt(3) - 1, \u2603.nextInt(5) - 3, \u2603.nextInt(3) - 1);
                final alz p = \u2603.p(a);
                final afh c = \u2603.p(a.a()).c();
                if (p.c() == afi.d && p.b(agf.a) == agf.a.a && \u2603.l(a.a()) >= 4 && c.p() <= 2) {
                    \u2603.a(a, this.Q());
                }
            }
        }
    }
    
    @Override
    public void c(final adm \u2603, final cj \u2603, final alz \u2603, final Random \u2603) {
        super.c(\u2603, \u2603, \u2603, \u2603);
        if (\u2603.nextInt(10) == 0) {
            \u2603.a(cy.w, \u2603.n() + \u2603.nextFloat(), \u2603.o() + 1.1f, \u2603.p() + \u2603.nextFloat(), 0.0, 0.0, 0.0, new int[0]);
        }
    }
    
    @Override
    public zw a(final alz \u2603, final Random \u2603, final int \u2603) {
        return afi.d.a(afi.d.Q().a(agf.a, agf.a.a), \u2603, \u2603);
    }
    
    @Override
    public int c(final alz \u2603) {
        return 0;
    }
    
    @Override
    protected ama e() {
        return new ama(this, new amo[] { aib.a });
    }
    
    static {
        a = amk.a("snowy");
    }
}
