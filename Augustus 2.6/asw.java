// 
// Decompiled by Procyon v0.5.36
// 

public abstract class asw
{
    protected adq a;
    protected nm<asv> b;
    protected int c;
    protected int d;
    protected int e;
    
    public asw() {
        this.b = new nm<asv>();
    }
    
    public void a(final adq \u2603, final pk \u2603) {
        this.a = \u2603;
        this.b.c();
        this.c = ns.d(\u2603.J + 1.0f);
        this.d = ns.d(\u2603.K + 1.0f);
        this.e = ns.d(\u2603.J + 1.0f);
    }
    
    public void a() {
    }
    
    protected asv a(final int \u2603, final int \u2603, final int \u2603) {
        final int a = asv.a(\u2603, \u2603, \u2603);
        asv \u26032 = this.b.a(a);
        if (\u26032 == null) {
            \u26032 = new asv(\u2603, \u2603, \u2603);
            this.b.a(a, \u26032);
        }
        return \u26032;
    }
    
    public abstract asv a(final pk p0);
    
    public abstract asv a(final pk p0, final double p1, final double p2, final double p3);
    
    public abstract int a(final asv[] p0, final pk p1, final asv p2, final asv p3, final float p4);
}
