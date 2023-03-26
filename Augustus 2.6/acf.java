// 
// Decompiled by Procyon v0.5.36
// 

public class acf extends aci
{
    private static final String[] E;
    private static final int[] F;
    private static final int[] G;
    private static final int[] H;
    public final int a;
    
    public acf(final int \u2603, final jy \u2603, final int \u2603, final int \u2603) {
        super(\u2603, \u2603, \u2603, acj.g);
        this.a = \u2603;
    }
    
    @Override
    public int a(final int \u2603) {
        return acf.F[this.a] + (\u2603 - 1) * acf.G[this.a];
    }
    
    @Override
    public int b(final int \u2603) {
        return this.a(\u2603) + acf.H[this.a];
    }
    
    @Override
    public int b() {
        return 5;
    }
    
    @Override
    public float a(final int \u2603, final pw \u2603) {
        if (this.a == 0) {
            return \u2603 * 1.25f;
        }
        if (this.a == 1 && \u2603 == pw.b) {
            return \u2603 * 2.5f;
        }
        if (this.a == 2 && \u2603 == pw.c) {
            return \u2603 * 2.5f;
        }
        return 0.0f;
    }
    
    @Override
    public String a() {
        return "enchantment.damage." + acf.E[this.a];
    }
    
    @Override
    public boolean a(final aci \u2603) {
        return !(\u2603 instanceof acf);
    }
    
    @Override
    public boolean a(final zx \u2603) {
        return \u2603.b() instanceof yl || super.a(\u2603);
    }
    
    @Override
    public void a(final pr \u2603, final pk \u2603, final int \u2603) {
        if (\u2603 instanceof pr) {
            final pr pr = (pr)\u2603;
            if (this.a == 2 && pr.bz() == pw.c) {
                final int \u26032 = 20 + \u2603.bc().nextInt(10 * \u2603);
                pr.c(new pf(pe.d.H, \u26032, 3));
            }
        }
    }
    
    static {
        E = new String[] { "all", "undead", "arthropods" };
        F = new int[] { 1, 5, 5 };
        G = new int[] { 11, 8, 8 };
        H = new int[] { 20, 20, 20 };
    }
}
