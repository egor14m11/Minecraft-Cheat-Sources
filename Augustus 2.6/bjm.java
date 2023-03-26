// 
// Decompiled by Procyon v0.5.36
// 

public class bjm<T extends va> extends biv<T>
{
    private static final jy e;
    protected bbo a;
    
    public bjm(final biu \u2603) {
        super(\u2603);
        this.a = new bbn();
        this.c = 0.5f;
    }
    
    @Override
    public void a(final T \u2603, double \u2603, double \u2603, double \u2603, float \u2603, final float \u2603) {
        bfl.E();
        this.c(\u2603);
        long n = \u2603.F() * 493286711L;
        n = n * n * 4392167121L + n * 98761L;
        final float \u26032 = (((n >> 16 & 0x7L) + 0.5f) / 8.0f - 0.5f) * 0.004f;
        final float \u26033 = (((n >> 20 & 0x7L) + 0.5f) / 8.0f - 0.5f) * 0.004f;
        final float \u26034 = (((n >> 24 & 0x7L) + 0.5f) / 8.0f - 0.5f) * 0.004f;
        bfl.b(\u26032, \u26033, \u26034);
        final double \u26035 = \u2603.P + (\u2603.s - \u2603.P) * \u2603;
        final double \u26036 = \u2603.Q + (\u2603.t - \u2603.Q) * \u2603;
        final double \u26037 = \u2603.R + (\u2603.u - \u2603.R) * \u2603;
        final double \u26038 = 0.30000001192092896;
        final aui k = \u2603.k(\u26035, \u26036, \u26037);
        float n2 = \u2603.B + (\u2603.z - \u2603.B) * \u2603;
        if (k != null) {
            aui a = \u2603.a(\u26035, \u26036, \u26037, \u26038);
            aui a2 = \u2603.a(\u26035, \u26036, \u26037, -\u26038);
            if (a == null) {
                a = k;
            }
            if (a2 == null) {
                a2 = k;
            }
            \u2603 += k.a - \u26035;
            \u2603 += (a.b + a2.b) / 2.0 - \u26036;
            \u2603 += k.c - \u26037;
            aui aui = a2.b(-a.a, -a.b, -a.c);
            if (aui.b() != 0.0) {
                aui = aui.a();
                \u2603 = (float)(Math.atan2(aui.c, aui.a) * 180.0 / 3.141592653589793);
                n2 = (float)(Math.atan(aui.b) * 73.0);
            }
        }
        bfl.b((float)\u2603, (float)\u2603 + 0.375f, (float)\u2603);
        bfl.b(180.0f - \u2603, 0.0f, 1.0f, 0.0f);
        bfl.b(-n2, 0.0f, 0.0f, 1.0f);
        final float \u26039 = \u2603.q() - \u2603;
        float n3 = \u2603.p() - \u2603;
        if (n3 < 0.0f) {
            n3 = 0.0f;
        }
        if (\u26039 > 0.0f) {
            bfl.b(ns.a(\u26039) * \u26039 * n3 / 10.0f * \u2603.r(), 1.0f, 0.0f, 0.0f);
        }
        final int v = \u2603.v();
        final alz t = \u2603.t();
        if (t.c().b() != -1) {
            bfl.E();
            this.a(bmh.g);
            final float n4 = 0.75f;
            bfl.a(n4, n4, n4);
            bfl.b(-0.5f, (v - 8) / 16.0f, 0.5f);
            this.a(\u2603, \u2603, t);
            bfl.F();
            bfl.c(1.0f, 1.0f, 1.0f, 1.0f);
            this.c(\u2603);
        }
        bfl.a(-1.0f, -1.0f, 1.0f);
        this.a.a(\u2603, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f, 0.0625f);
        bfl.F();
        super.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
    }
    
    @Override
    protected jy a(final T \u2603) {
        return bjm.e;
    }
    
    protected void a(final T \u2603, final float \u2603, final alz \u2603) {
        bfl.E();
        ave.A().ae().a(\u2603, \u2603.c(\u2603));
        bfl.F();
    }
    
    static {
        e = new jy("textures/entity/minecart.png");
    }
}
