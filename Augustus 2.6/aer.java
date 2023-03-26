import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public class aer extends ady
{
    private static final app aD;
    
    protected aer(final int \u2603) {
        super(\u2603);
        this.au.add(new c(tp.class, 1, 2, 6));
        this.as.A = 1;
        this.as.B = 4;
        this.as.C = 20;
    }
    
    @Override
    public aoh a(final Random \u2603) {
        if (\u2603.nextInt(5) > 0) {
            return aer.aD;
        }
        return this.aA;
    }
    
    @Override
    protected ady d(final int \u2603) {
        final ady ady = new a(\u2603, this);
        ady.ap = (this.ap + 1.0f) * 0.5f;
        ady.an = this.an * 0.5f + 0.3f;
        ady.ao = this.ao * 0.5f + 1.2f;
        return ady;
    }
    
    @Override
    public void a(final adm \u2603, final Random \u2603, final cj \u2603) {
        aer.ag.a(agi.b.c);
        for (int i = 0; i < 7; ++i) {
            final int n = \u2603.nextInt(16) + 8;
            final int n2 = \u2603.nextInt(16) + 8;
            final int nextInt = \u2603.nextInt(\u2603.m(\u2603.a(n, 0, n2)).o() + 32);
            aer.ag.b(\u2603, \u2603, \u2603.a(n, nextInt, n2));
        }
        super.a(\u2603, \u2603, \u2603);
    }
    
    static {
        aD = new app(false);
    }
    
    public static class a extends aem
    {
        public a(final int \u2603, final ady \u2603) {
            super(\u2603, \u2603);
            this.as.A = 2;
            this.as.B = 2;
            this.as.C = 5;
        }
        
        @Override
        public void a(final adm \u2603, final Random \u2603, final ans \u2603, final int \u2603, final int \u2603, final double \u2603) {
            this.ak = afi.c.Q();
            this.al = afi.d.Q();
            if (\u2603 > 1.75) {
                this.ak = afi.b.Q();
                this.al = afi.b.Q();
            }
            else if (\u2603 > -0.5) {
                this.ak = afi.d.Q().a(agf.a, agf.a.b);
            }
            this.b(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        }
        
        @Override
        public void a(final adm \u2603, final Random \u2603, final cj \u2603) {
            this.as.a(\u2603, \u2603, this, \u2603);
        }
    }
}
