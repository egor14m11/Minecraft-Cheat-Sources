// 
// Decompiled by Procyon v0.5.36
// 

public class avp
{
    public static final jy b;
    public static final jy c;
    public static final jy d;
    protected float e;
    
    protected void a(int \u2603, int \u2603, final int \u2603, final int \u2603) {
        if (\u2603 < \u2603) {
            final int n = \u2603;
            \u2603 = \u2603;
            \u2603 = n;
        }
        a(\u2603, \u2603, \u2603 + 1, \u2603 + 1, \u2603);
    }
    
    protected void b(final int \u2603, int \u2603, int \u2603, final int \u2603) {
        if (\u2603 < \u2603) {
            final int n = \u2603;
            \u2603 = \u2603;
            \u2603 = n;
        }
        a(\u2603, \u2603 + 1, \u2603 + 1, \u2603, \u2603);
    }
    
    public static void a(int \u2603, int \u2603, int \u2603, int \u2603, final int \u2603) {
        if (\u2603 < \u2603) {
            final int n = \u2603;
            \u2603 = \u2603;
            \u2603 = n;
        }
        if (\u2603 < \u2603) {
            final int n = \u2603;
            \u2603 = \u2603;
            \u2603 = n;
        }
        final float \u26032 = (\u2603 >> 24 & 0xFF) / 255.0f;
        final float \u26033 = (\u2603 >> 16 & 0xFF) / 255.0f;
        final float \u26034 = (\u2603 >> 8 & 0xFF) / 255.0f;
        final float \u26035 = (\u2603 & 0xFF) / 255.0f;
        final bfx a = bfx.a();
        final bfd c = a.c();
        bfl.l();
        bfl.x();
        bfl.a(770, 771, 1, 0);
        bfl.c(\u26033, \u26034, \u26035, \u26032);
        c.a(7, bms.e);
        c.b(\u2603, \u2603, 0.0).d();
        c.b(\u2603, \u2603, 0.0).d();
        c.b(\u2603, \u2603, 0.0).d();
        c.b(\u2603, \u2603, 0.0).d();
        a.b();
        bfl.w();
        bfl.k();
    }
    
    protected void a(final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603) {
        final float n = (\u2603 >> 24 & 0xFF) / 255.0f;
        final float n2 = (\u2603 >> 16 & 0xFF) / 255.0f;
        final float n3 = (\u2603 >> 8 & 0xFF) / 255.0f;
        final float n4 = (\u2603 & 0xFF) / 255.0f;
        final float n5 = (\u2603 >> 24 & 0xFF) / 255.0f;
        final float n6 = (\u2603 >> 16 & 0xFF) / 255.0f;
        final float n7 = (\u2603 >> 8 & 0xFF) / 255.0f;
        final float n8 = (\u2603 & 0xFF) / 255.0f;
        bfl.x();
        bfl.l();
        bfl.c();
        bfl.a(770, 771, 1, 0);
        bfl.j(7425);
        final bfx a = bfx.a();
        final bfd c = a.c();
        c.a(7, bms.f);
        c.b(\u2603, \u2603, (double)this.e).a(n2, n3, n4, n).d();
        c.b(\u2603, \u2603, (double)this.e).a(n2, n3, n4, n).d();
        c.b(\u2603, \u2603, (double)this.e).a(n6, n7, n8, n5).d();
        c.b(\u2603, \u2603, (double)this.e).a(n6, n7, n8, n5).d();
        a.b();
        bfl.j(7424);
        bfl.k();
        bfl.d();
        bfl.w();
    }
    
    public void a(final avn \u2603, final String \u2603, final int \u2603, final int \u2603, final int \u2603) {
        \u2603.a(\u2603, (float)(\u2603 - \u2603.a(\u2603) / 2), (float)\u2603, \u2603);
    }
    
    public void c(final avn \u2603, final String \u2603, final int \u2603, final int \u2603, final int \u2603) {
        \u2603.a(\u2603, (float)\u2603, (float)\u2603, \u2603);
    }
    
    public void b(final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603) {
        final float n = 0.00390625f;
        final float n2 = 0.00390625f;
        final bfx a = bfx.a();
        final bfd c = a.c();
        c.a(7, bms.g);
        c.b(\u2603 + 0, \u2603 + \u2603, (double)this.e).a((\u2603 + 0) * n, (\u2603 + \u2603) * n2).d();
        c.b(\u2603 + \u2603, \u2603 + \u2603, (double)this.e).a((\u2603 + \u2603) * n, (\u2603 + \u2603) * n2).d();
        c.b(\u2603 + \u2603, \u2603 + 0, (double)this.e).a((\u2603 + \u2603) * n, (\u2603 + 0) * n2).d();
        c.b(\u2603 + 0, \u2603 + 0, (double)this.e).a((\u2603 + 0) * n, (\u2603 + 0) * n2).d();
        a.b();
    }
    
    public void a(final float \u2603, final float \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603) {
        final float n = 0.00390625f;
        final float n2 = 0.00390625f;
        final bfx a = bfx.a();
        final bfd c = a.c();
        c.a(7, bms.g);
        c.b(\u2603 + 0.0f, \u2603 + \u2603, (double)this.e).a((\u2603 + 0) * n, (\u2603 + \u2603) * n2).d();
        c.b(\u2603 + \u2603, \u2603 + \u2603, (double)this.e).a((\u2603 + \u2603) * n, (\u2603 + \u2603) * n2).d();
        c.b(\u2603 + \u2603, \u2603 + 0.0f, (double)this.e).a((\u2603 + \u2603) * n, (\u2603 + 0) * n2).d();
        c.b(\u2603 + 0.0f, \u2603 + 0.0f, (double)this.e).a((\u2603 + 0) * n, (\u2603 + 0) * n2).d();
        a.b();
    }
    
    public void a(final int \u2603, final int \u2603, final bmi \u2603, final int \u2603, final int \u2603) {
        final bfx a = bfx.a();
        final bfd c = a.c();
        c.a(7, bms.g);
        c.b(\u2603 + 0, \u2603 + \u2603, (double)this.e).a(\u2603.e(), \u2603.h()).d();
        c.b(\u2603 + \u2603, \u2603 + \u2603, (double)this.e).a(\u2603.f(), \u2603.h()).d();
        c.b(\u2603 + \u2603, \u2603 + 0, (double)this.e).a(\u2603.f(), \u2603.g()).d();
        c.b(\u2603 + 0, \u2603 + 0, (double)this.e).a(\u2603.e(), \u2603.g()).d();
        a.b();
    }
    
    public static void a(final int \u2603, final int \u2603, final float \u2603, final float \u2603, final int \u2603, final int \u2603, final float \u2603, final float \u2603) {
        final float n = 1.0f / \u2603;
        final float n2 = 1.0f / \u2603;
        final bfx a = bfx.a();
        final bfd c = a.c();
        c.a(7, bms.g);
        c.b(\u2603, \u2603 + \u2603, 0.0).a(\u2603 * n, (\u2603 + \u2603) * n2).d();
        c.b(\u2603 + \u2603, \u2603 + \u2603, 0.0).a((\u2603 + \u2603) * n, (\u2603 + \u2603) * n2).d();
        c.b(\u2603 + \u2603, \u2603, 0.0).a((\u2603 + \u2603) * n, \u2603 * n2).d();
        c.b(\u2603, \u2603, 0.0).a(\u2603 * n, \u2603 * n2).d();
        a.b();
    }
    
    public static void a(final int \u2603, final int \u2603, final float \u2603, final float \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final float \u2603, final float \u2603) {
        final float n = 1.0f / \u2603;
        final float n2 = 1.0f / \u2603;
        final bfx a = bfx.a();
        final bfd c = a.c();
        c.a(7, bms.g);
        c.b(\u2603, \u2603 + \u2603, 0.0).a(\u2603 * n, (\u2603 + \u2603) * n2).d();
        c.b(\u2603 + \u2603, \u2603 + \u2603, 0.0).a((\u2603 + \u2603) * n, (\u2603 + \u2603) * n2).d();
        c.b(\u2603 + \u2603, \u2603, 0.0).a((\u2603 + \u2603) * n, \u2603 * n2).d();
        c.b(\u2603, \u2603, 0.0).a(\u2603 * n, \u2603 * n2).d();
        a.b();
    }
    
    static {
        b = new jy("textures/gui/options_background.png");
        c = new jy("textures/gui/container/stats_icons.png");
        d = new jy("textures/gui/icons.png");
    }
}
