import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class yq extends zw
{
    public yq() {
        this.h = 1;
        this.a(yz.e);
    }
    
    @Override
    public zx a(final zx \u2603, final adm \u2603, final wn \u2603) {
        final float \u26032 = 1.0f;
        final float n = \u2603.B + (\u2603.z - \u2603.B) * \u26032;
        final float n2 = \u2603.A + (\u2603.y - \u2603.A) * \u26032;
        final double \u26033 = \u2603.p + (\u2603.s - \u2603.p) * \u26032;
        final double \u26034 = \u2603.q + (\u2603.t - \u2603.q) * \u26032 + \u2603.aS();
        final double \u26035 = \u2603.r + (\u2603.u - \u2603.r) * \u26032;
        final aui aui = new aui(\u26033, \u26034, \u26035);
        final float b = ns.b(-n2 * 0.017453292f - 3.1415927f);
        final float a = ns.a(-n2 * 0.017453292f - 3.1415927f);
        final float n3 = -ns.b(-n * 0.017453292f);
        final float a2 = ns.a(-n * 0.017453292f);
        final float n4 = a * n3;
        final float n5 = a2;
        final float n6 = b * n3;
        final double n7 = 5.0;
        final aui b2 = aui.b(n4 * n7, n5 * n7, n6 * n7);
        final auh a3 = \u2603.a(aui, b2, true);
        if (a3 == null) {
            return \u2603;
        }
        final aui d = \u2603.d(\u26032);
        boolean b3 = false;
        final float n8 = 1.0f;
        final List<pk> b4 = \u2603.b(\u2603, \u2603.aR().a(d.a * n7, d.b * n7, d.c * n7).b(n8, n8, n8));
        for (int i = 0; i < b4.size(); ++i) {
            final pk pk = b4.get(i);
            if (pk.ad()) {
                final float ao = pk.ao();
                final aug b5 = pk.aR().b(ao, ao, ao);
                if (b5.a(aui)) {
                    b3 = true;
                }
            }
        }
        if (b3) {
            return \u2603;
        }
        if (a3.a == auh.a.b) {
            cj \u26036 = a3.a();
            if (\u2603.p(\u26036).c() == afi.aH) {
                \u26036 = \u26036.b();
            }
            final ux ux = new ux(\u2603, \u26036.n() + 0.5f, \u26036.o() + 1.0f, \u26036.p() + 0.5f);
            ux.y = (float)(((ns.c(\u2603.y * 4.0f / 360.0f + 0.5) & 0x3) - 1) * 90);
            if (!\u2603.a(ux, ux.aR().b(-0.1, -0.1, -0.1)).isEmpty()) {
                return \u2603;
            }
            if (!\u2603.D) {
                \u2603.d(ux);
            }
            if (!\u2603.bA.d) {
                --\u2603.b;
            }
            \u2603.b(na.ad[zw.b(this)]);
        }
        return \u2603;
    }
}
