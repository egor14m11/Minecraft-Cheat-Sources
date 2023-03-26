import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public class aee extends ady
{
    private aot aD;
    private aps aE;
    private int aF;
    private int aG;
    private int aH;
    private int aI;
    
    protected aee(final int \u2603, final boolean \u2603) {
        super(\u2603);
        this.aD = new apj(afi.be.Q().a(ahz.a, ahz.a.a), 9);
        this.aE = new aps(false);
        this.aF = 0;
        this.aG = 1;
        this.aH = 2;
        this.aI = this.aF;
        if (\u2603) {
            this.as.A = 3;
            this.aI = this.aG;
        }
    }
    
    @Override
    public aoh a(final Random \u2603) {
        if (\u2603.nextInt(3) > 0) {
            return this.aE;
        }
        return super.a(\u2603);
    }
    
    @Override
    public void a(final adm \u2603, final Random \u2603, final cj \u2603) {
        super.a(\u2603, \u2603, \u2603);
        for (int i = 3 + \u2603.nextInt(6), j = 0; j < i; ++j) {
            final int n = \u2603.nextInt(16);
            final int nextInt = \u2603.nextInt(28) + 4;
            final int nextInt2 = \u2603.nextInt(16);
            final cj a = \u2603.a(n, nextInt, nextInt2);
            if (\u2603.p(a).c() == afi.b) {
                \u2603.a(a, afi.bP.Q(), 2);
            }
        }
        for (int i = 0; i < 7; ++i) {
            final int j = \u2603.nextInt(16);
            final int n = \u2603.nextInt(64);
            final int nextInt = \u2603.nextInt(16);
            this.aD.b(\u2603, \u2603, \u2603.a(j, n, nextInt));
        }
    }
    
    @Override
    public void a(final adm \u2603, final Random \u2603, final ans \u2603, final int \u2603, final int \u2603, final double \u2603) {
        this.ak = afi.c.Q();
        this.al = afi.d.Q();
        if ((\u2603 < -1.0 || \u2603 > 2.0) && this.aI == this.aH) {
            this.ak = afi.n.Q();
            this.al = afi.n.Q();
        }
        else if (\u2603 > 1.0 && this.aI != this.aG) {
            this.ak = afi.b.Q();
            this.al = afi.b.Q();
        }
        this.b(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
    }
    
    private aee b(final ady \u2603) {
        this.aI = this.aH;
        this.a(\u2603.ai, true);
        this.a(\u2603.ah + " M");
        this.a(new a(\u2603.an, \u2603.ao));
        this.a(\u2603.ap, \u2603.aq);
        return this;
    }
    
    @Override
    protected ady d(final int \u2603) {
        return new aee(\u2603, false).b(this);
    }
}
