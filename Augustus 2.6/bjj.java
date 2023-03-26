// 
// Decompiled by Procyon v0.5.36
// 

public class bjj extends biv<up>
{
    private static final jy a;
    private bbm e;
    
    public bjj(final biu \u2603) {
        super(\u2603);
        this.e = new bbm();
    }
    
    @Override
    public void a(final up \u2603, final double \u2603, final double \u2603, final double \u2603, final float \u2603, final float \u2603) {
        bfl.E();
        bfl.p();
        bfl.b((float)\u2603, (float)\u2603, (float)\u2603);
        final float \u26032 = 0.0625f;
        bfl.B();
        bfl.a(-1.0f, -1.0f, 1.0f);
        bfl.d();
        this.c(\u2603);
        this.e.a(\u2603, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, \u26032);
        bfl.F();
        super.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
    }
    
    @Override
    protected jy a(final up \u2603) {
        return bjj.a;
    }
    
    static {
        a = new jy("textures/entity/lead_knot.png");
    }
}
