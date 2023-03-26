// 
// Decompiled by Procyon v0.5.36
// 

public class acr extends aci
{
    private static final String[] E;
    private static final int[] F;
    private static final int[] G;
    private static final int[] H;
    public final int a;
    
    public acr(final int \u2603, final jy \u2603, final int \u2603, final int \u2603) {
        super(\u2603, \u2603, \u2603, acj.b);
        this.a = \u2603;
        if (\u2603 == 2) {
            this.C = acj.c;
        }
    }
    
    @Override
    public int a(final int \u2603) {
        return acr.F[this.a] + (\u2603 - 1) * acr.G[this.a];
    }
    
    @Override
    public int b(final int \u2603) {
        return this.a(\u2603) + acr.H[this.a];
    }
    
    @Override
    public int b() {
        return 4;
    }
    
    @Override
    public int a(final int \u2603, final ow \u2603) {
        if (\u2603.g()) {
            return 0;
        }
        final float n = (6 + \u2603 * \u2603) / 3.0f;
        if (this.a == 0) {
            return ns.d(n * 0.75f);
        }
        if (this.a == 1 && \u2603.o()) {
            return ns.d(n * 1.25f);
        }
        if (this.a == 2 && \u2603 == ow.i) {
            return ns.d(n * 2.5f);
        }
        if (this.a == 3 && \u2603.c()) {
            return ns.d(n * 1.5f);
        }
        if (this.a == 4 && \u2603.a()) {
            return ns.d(n * 1.5f);
        }
        return 0;
    }
    
    @Override
    public String a() {
        return "enchantment.protect." + acr.E[this.a];
    }
    
    @Override
    public boolean a(final aci \u2603) {
        if (\u2603 instanceof acr) {
            final acr acr = (acr)\u2603;
            return acr.a != this.a && (this.a == 2 || acr.a == 2);
        }
        return super.a(\u2603);
    }
    
    public static int a(final pk \u2603, int \u2603) {
        final int a = ack.a(aci.d.B, \u2603.as());
        if (a > 0) {
            \u2603 -= ns.d(\u2603 * (a * 0.15f));
        }
        return \u2603;
    }
    
    public static double a(final pk \u2603, double \u2603) {
        final int a = ack.a(aci.f.B, \u2603.as());
        if (a > 0) {
            \u2603 -= ns.c(\u2603 * (a * 0.15f));
        }
        return \u2603;
    }
    
    static {
        E = new String[] { "all", "fire", "fall", "explosion", "projectile" };
        F = new int[] { 1, 10, 5, 5, 3 };
        G = new int[] { 11, 8, 6, 8, 6 };
        H = new int[] { 20, 12, 10, 12, 15 };
    }
}
