// 
// Decompiled by Procyon v0.5.36
// 

public class bge
{
    private bmi[] a;
    private bmi[] b;
    
    public bge() {
        this.a = new bmi[2];
        this.b = new bmi[2];
        this.a();
    }
    
    protected void a() {
        final bmh t = ave.A().T();
        this.a[0] = t.a("minecraft:blocks/lava_still");
        this.a[1] = t.a("minecraft:blocks/lava_flow");
        this.b[0] = t.a("minecraft:blocks/water_still");
        this.b[1] = t.a("minecraft:blocks/water_flow");
    }
    
    public boolean a(final adq \u2603, final alz \u2603, final cj \u2603, final bfd \u2603) {
        final ahv ahv = (ahv)\u2603.c();
        ahv.a(\u2603, \u2603);
        final bmi[] array = (ahv.t() == arm.i) ? this.a : this.b;
        final int d = ahv.d(\u2603, \u2603);
        final float n = (d >> 16 & 0xFF) / 255.0f;
        final float n2 = (d >> 8 & 0xFF) / 255.0f;
        final float n3 = (d & 0xFF) / 255.0f;
        final boolean a = ahv.a(\u2603, \u2603.a(), cq.b);
        final boolean a2 = ahv.a(\u2603, \u2603.b(), cq.a);
        final boolean[] array2 = { ahv.a(\u2603, \u2603.c(), cq.c), ahv.a(\u2603, \u2603.d(), cq.d), ahv.a(\u2603, \u2603.e(), cq.e), ahv.a(\u2603, \u2603.f(), cq.f) };
        if (!a && !a2 && !array2[0] && !array2[1] && !array2[2] && !array2[3]) {
            return false;
        }
        boolean b = false;
        final float n4 = 0.5f;
        final float n5 = 1.0f;
        final float n6 = 0.8f;
        final float n7 = 0.6f;
        final arm t = ahv.t();
        float a3 = this.a(\u2603, \u2603, t);
        float a4 = this.a(\u2603, \u2603.d(), t);
        float a5 = this.a(\u2603, \u2603.f().d(), t);
        float a6 = this.a(\u2603, \u2603.f(), t);
        final double n8 = \u2603.n();
        final double n9 = \u2603.o();
        final double n10 = \u2603.p();
        final float n11 = 0.001f;
        if (a) {
            b = true;
            bmi bmi = array[0];
            final float e = (float)ahv.a(\u2603, \u2603, t);
            if (e > -999.0f) {
                bmi = array[1];
            }
            a3 -= n11;
            a4 -= n11;
            a5 -= n11;
            a6 -= n11;
            float n12;
            float n13;
            float n14;
            float n15;
            float n16;
            float b2;
            float a7;
            float b3;
            if (e < -999.0f) {
                n12 = bmi.a(0.0);
                n13 = bmi.b(0.0);
                n14 = n12;
                n15 = bmi.b(16.0);
                n16 = bmi.a(16.0);
                b2 = n15;
                a7 = n16;
                b3 = n13;
            }
            else {
                final float n17 = ns.a(e) * 0.25f;
                final float n18 = ns.b(e) * 0.25f;
                final float n19 = 8.0f;
                n12 = bmi.a(8.0f + (-n18 - n17) * 16.0f);
                n13 = bmi.b(8.0f + (-n18 + n17) * 16.0f);
                n14 = bmi.a(8.0f + (-n18 + n17) * 16.0f);
                n15 = bmi.b(8.0f + (n18 + n17) * 16.0f);
                n16 = bmi.a(8.0f + (n18 + n17) * 16.0f);
                b2 = bmi.b(8.0f + (n18 - n17) * 16.0f);
                a7 = bmi.a(8.0f + (n18 - n17) * 16.0f);
                b3 = bmi.b(8.0f + (-n18 - n17) * 16.0f);
            }
            final int c = ahv.c(\u2603, \u2603);
            final int n20 = c >> 16 & 0xFFFF;
            final int n21 = c & 0xFFFF;
            final float n22 = n5 * n;
            final float n23 = n5 * n2;
            final float a8 = n5 * n3;
            \u2603.b(n8 + 0.0, n9 + a3, n10 + 0.0).a(n22, n23, a8, 1.0f).a(n12, n13).a(n20, n21).d();
            \u2603.b(n8 + 0.0, n9 + a4, n10 + 1.0).a(n22, n23, a8, 1.0f).a(n14, n15).a(n20, n21).d();
            \u2603.b(n8 + 1.0, n9 + a5, n10 + 1.0).a(n22, n23, a8, 1.0f).a(n16, b2).a(n20, n21).d();
            \u2603.b(n8 + 1.0, n9 + a6, n10 + 0.0).a(n22, n23, a8, 1.0f).a(a7, b3).a(n20, n21).d();
            if (ahv.g(\u2603, \u2603.a())) {
                \u2603.b(n8 + 0.0, n9 + a3, n10 + 0.0).a(n22, n23, a8, 1.0f).a(n12, n13).a(n20, n21).d();
                \u2603.b(n8 + 1.0, n9 + a6, n10 + 0.0).a(n22, n23, a8, 1.0f).a(a7, b3).a(n20, n21).d();
                \u2603.b(n8 + 1.0, n9 + a5, n10 + 1.0).a(n22, n23, a8, 1.0f).a(n16, b2).a(n20, n21).d();
                \u2603.b(n8 + 0.0, n9 + a4, n10 + 1.0).a(n22, n23, a8, 1.0f).a(n14, n15).a(n20, n21).d();
            }
        }
        if (a2) {
            final float e = array[0].e();
            final float n12 = array[0].f();
            final float n14 = array[0].g();
            final float n16 = array[0].h();
            final int c2 = ahv.c(\u2603, \u2603.b());
            final int n24 = c2 >> 16 & 0xFFFF;
            final int n25 = c2 & 0xFFFF;
            \u2603.b(n8, n9, n10 + 1.0).a(n4, n4, n4, 1.0f).a(e, n16).a(n24, n25).d();
            \u2603.b(n8, n9, n10).a(n4, n4, n4, 1.0f).a(e, n14).a(n24, n25).d();
            \u2603.b(n8 + 1.0, n9, n10).a(n4, n4, n4, 1.0f).a(n12, n14).a(n24, n25).d();
            \u2603.b(n8 + 1.0, n9, n10 + 1.0).a(n4, n4, n4, 1.0f).a(n12, n16).a(n24, n25).d();
            b = true;
        }
        for (int i = 0; i < 4; ++i) {
            int \u26032 = 0;
            int \u26033 = 0;
            if (i == 0) {
                --\u26033;
            }
            if (i == 1) {
                ++\u26033;
            }
            if (i == 2) {
                --\u26032;
            }
            if (i == 3) {
                ++\u26032;
            }
            final cj a9 = \u2603.a(\u26032, 0, \u26033);
            final bmi bmi = array[1];
            if (array2[i]) {
                float n13;
                float a7;
                double n26;
                double n27;
                double n28;
                double n29;
                if (i == 0) {
                    a7 = a3;
                    n13 = a6;
                    n26 = n8;
                    n27 = n8 + 1.0;
                    n28 = n10 + n11;
                    n29 = n10 + n11;
                }
                else if (i == 1) {
                    a7 = a5;
                    n13 = a4;
                    n26 = n8 + 1.0;
                    n27 = n8;
                    n28 = n10 + 1.0 - n11;
                    n29 = n10 + 1.0 - n11;
                }
                else if (i == 2) {
                    a7 = a4;
                    n13 = a3;
                    n26 = n8 + n11;
                    n27 = n8 + n11;
                    n28 = n10 + 1.0;
                    n29 = n10;
                }
                else {
                    a7 = a6;
                    n13 = a5;
                    n26 = n8 + 1.0 - n11;
                    n27 = n8 + 1.0 - n11;
                    n28 = n10;
                    n29 = n10 + 1.0;
                }
                b = true;
                final float a8 = bmi.a(0.0);
                final float a10 = bmi.a(8.0);
                final float b4 = bmi.b((1.0f - a7) * 16.0f * 0.5f);
                final float b5 = bmi.b((1.0f - n13) * 16.0f * 0.5f);
                final float b6 = bmi.b(8.0);
                final int c3 = ahv.c(\u2603, a9);
                final int n30 = c3 >> 16 & 0xFFFF;
                final int n31 = c3 & 0xFFFF;
                final float n32 = (i < 2) ? n6 : n7;
                final float n33 = n5 * n32 * n;
                final float n34 = n5 * n32 * n2;
                final float n35 = n5 * n32 * n3;
                \u2603.b(n26, n9 + a7, n28).a(n33, n34, n35, 1.0f).a(a8, b4).a(n30, n31).d();
                \u2603.b(n27, n9 + n13, n29).a(n33, n34, n35, 1.0f).a(a10, b5).a(n30, n31).d();
                \u2603.b(n27, n9 + 0.0, n29).a(n33, n34, n35, 1.0f).a(a10, b6).a(n30, n31).d();
                \u2603.b(n26, n9 + 0.0, n28).a(n33, n34, n35, 1.0f).a(a8, b6).a(n30, n31).d();
                \u2603.b(n26, n9 + 0.0, n28).a(n33, n34, n35, 1.0f).a(a8, b6).a(n30, n31).d();
                \u2603.b(n27, n9 + 0.0, n29).a(n33, n34, n35, 1.0f).a(a10, b6).a(n30, n31).d();
                \u2603.b(n27, n9 + n13, n29).a(n33, n34, n35, 1.0f).a(a10, b5).a(n30, n31).d();
                \u2603.b(n26, n9 + a7, n28).a(n33, n34, n35, 1.0f).a(a8, b4).a(n30, n31).d();
            }
        }
        return b;
    }
    
    private float a(final adq \u2603, final cj \u2603, final arm \u2603) {
        int n = 0;
        float n2 = 0.0f;
        for (int i = 0; i < 4; ++i) {
            final cj a = \u2603.a(-(i & 0x1), 0, -(i >> 1 & 0x1));
            if (\u2603.p(a.a()).c().t() == \u2603) {
                return 1.0f;
            }
            final alz p = \u2603.p(a);
            final arm t = p.c().t();
            if (t == \u2603) {
                final int intValue = p.b((amo<Integer>)ahv.b);
                if (intValue >= 8 || intValue == 0) {
                    n2 += ahv.b(intValue) * 10.0f;
                    n += 10;
                }
                n2 += ahv.b(intValue);
                ++n;
            }
            else if (!t.a()) {
                ++n2;
                ++n;
            }
        }
        return 1.0f - n2 / n;
    }
}
