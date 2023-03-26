import org.lwjgl.opengl.GL11;

// 
// Decompiled by Procyon v0.5.36
// 

public class bih extends biv<wq>
{
    private static final jy a;
    
    public bih(final biu \u2603) {
        super(\u2603);
    }
    
    @Override
    public void a(final wq \u2603, final double \u2603, final double \u2603, final double \u2603, final float \u2603, final float \u2603) {
        this.c(\u2603);
        bfl.c(1.0f, 1.0f, 1.0f, 1.0f);
        bfl.E();
        bfl.b((float)\u2603, (float)\u2603, (float)\u2603);
        bfl.b(\u2603.A + (\u2603.y - \u2603.A) * \u2603 - 90.0f, 0.0f, 1.0f, 0.0f);
        bfl.b(\u2603.B + (\u2603.z - \u2603.B) * \u2603, 0.0f, 0.0f, 1.0f);
        final bfx a = bfx.a();
        final bfd c = a.c();
        final int n = 0;
        final float n2 = 0.0f;
        final float n3 = 0.5f;
        final float n4 = (0 + n * 10) / 32.0f;
        final float n5 = (5 + n * 10) / 32.0f;
        final float n6 = 0.0f;
        final float n7 = 0.15625f;
        final float n8 = (5 + n * 10) / 32.0f;
        final float n9 = (10 + n * 10) / 32.0f;
        final float n10 = 0.05625f;
        bfl.B();
        final float n11 = \u2603.b - \u2603;
        if (n11 > 0.0f) {
            final float \u26032 = -ns.a(n11 * 3.0f) * n11;
            bfl.b(\u26032, 0.0f, 0.0f, 1.0f);
        }
        bfl.b(45.0f, 1.0f, 0.0f, 0.0f);
        bfl.a(n10, n10, n10);
        bfl.b(-4.0f, 0.0f, 0.0f);
        GL11.glNormal3f(n10, 0.0f, 0.0f);
        c.a(7, bms.g);
        c.b(-7.0, -2.0, -2.0).a(n6, n8).d();
        c.b(-7.0, -2.0, 2.0).a(n7, n8).d();
        c.b(-7.0, 2.0, 2.0).a(n7, n9).d();
        c.b(-7.0, 2.0, -2.0).a(n6, n9).d();
        a.b();
        GL11.glNormal3f(-n10, 0.0f, 0.0f);
        c.a(7, bms.g);
        c.b(-7.0, 2.0, -2.0).a(n6, n8).d();
        c.b(-7.0, 2.0, 2.0).a(n7, n8).d();
        c.b(-7.0, -2.0, 2.0).a(n7, n9).d();
        c.b(-7.0, -2.0, -2.0).a(n6, n9).d();
        a.b();
        for (int i = 0; i < 4; ++i) {
            bfl.b(90.0f, 1.0f, 0.0f, 0.0f);
            GL11.glNormal3f(0.0f, 0.0f, n10);
            c.a(7, bms.g);
            c.b(-8.0, -2.0, 0.0).a(n2, n4).d();
            c.b(8.0, -2.0, 0.0).a(n3, n4).d();
            c.b(8.0, 2.0, 0.0).a(n3, n5).d();
            c.b(-8.0, 2.0, 0.0).a(n2, n5).d();
            a.b();
        }
        bfl.C();
        bfl.F();
        super.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
    }
    
    @Override
    protected jy a(final wq \u2603) {
        return bih.a;
    }
    
    static {
        a = new jy("textures/entity/arrow.png");
    }
}
