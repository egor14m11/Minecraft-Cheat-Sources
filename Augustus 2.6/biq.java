// 
// Decompiled by Procyon v0.5.36
// 

public class biq extends biv<uf>
{
    private static final jy a;
    private bbo e;
    
    public biq(final biu \u2603) {
        super(\u2603);
        this.e = new bcp(0.0f, true);
        this.c = 0.5f;
    }
    
    @Override
    public void a(final uf \u2603, final double \u2603, final double \u2603, final double \u2603, final float \u2603, final float \u2603) {
        final float n = \u2603.a + \u2603;
        bfl.E();
        bfl.b((float)\u2603, (float)\u2603, (float)\u2603);
        this.a(biq.a);
        float n2 = ns.a(n * 0.2f) / 2.0f + 0.5f;
        n2 += n2 * n2;
        this.e.a(\u2603, 0.0f, n * 3.0f, n2 * 0.2f, 0.0f, 0.0f, 0.0625f);
        bfl.F();
        super.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
    }
    
    @Override
    protected jy a(final uf \u2603) {
        return biq.a;
    }
    
    static {
        a = new jy("textures/entity/endercrystal/endercrystal.png");
    }
}
