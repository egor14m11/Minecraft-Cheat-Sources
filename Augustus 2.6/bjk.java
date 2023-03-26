import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public class bjk extends biv<uv>
{
    public bjk(final biu \u2603) {
        super(\u2603);
    }
    
    @Override
    public void a(final uv \u2603, final double \u2603, final double \u2603, final double \u2603, final float \u2603, final float \u2603) {
        final bfx a = bfx.a();
        final bfd c = a.c();
        bfl.x();
        bfl.f();
        bfl.l();
        bfl.b(770, 1);
        final double[] array = new double[8];
        final double[] array2 = new double[8];
        double n = 0.0;
        double n2 = 0.0;
        final Random random = new Random(\u2603.a);
        for (int i = 7; i >= 0; --i) {
            array[i] = n;
            array2[i] = n2;
            n += random.nextInt(11) - 5;
            n2 += random.nextInt(11) - 5;
        }
        for (int j = 0; j < 4; ++j) {
            final Random random2 = new Random(\u2603.a);
            for (int k = 0; k < 3; ++k) {
                int n3 = 7;
                int n4 = 0;
                if (k > 0) {
                    n3 = 7 - k;
                }
                if (k > 0) {
                    n4 = n3 - 2;
                }
                double n5 = array[n3] - n;
                double n6 = array2[n3] - n2;
                for (int l = n3; l >= n4; --l) {
                    final double n7 = n5;
                    final double n8 = n6;
                    if (k == 0) {
                        n5 += random2.nextInt(11) - 5;
                        n6 += random2.nextInt(11) - 5;
                    }
                    else {
                        n5 += random2.nextInt(31) - 15;
                        n6 += random2.nextInt(31) - 15;
                    }
                    c.a(5, bms.f);
                    final float n9 = 0.5f;
                    final float n10 = 0.45f;
                    final float n11 = 0.45f;
                    final float n12 = 0.5f;
                    double n13 = 0.1 + j * 0.2;
                    if (k == 0) {
                        n13 *= l * 0.1 + 1.0;
                    }
                    double n14 = 0.1 + j * 0.2;
                    if (k == 0) {
                        n14 *= (l - 1) * 0.1 + 1.0;
                    }
                    for (int n15 = 0; n15 < 5; ++n15) {
                        double n16 = \u2603 + 0.5 - n13;
                        double n17 = \u2603 + 0.5 - n13;
                        if (n15 == 1 || n15 == 2) {
                            n16 += n13 * 2.0;
                        }
                        if (n15 == 2 || n15 == 3) {
                            n17 += n13 * 2.0;
                        }
                        double n18 = \u2603 + 0.5 - n14;
                        double n19 = \u2603 + 0.5 - n14;
                        if (n15 == 1 || n15 == 2) {
                            n18 += n14 * 2.0;
                        }
                        if (n15 == 2 || n15 == 3) {
                            n19 += n14 * 2.0;
                        }
                        c.b(n18 + n5, \u2603 + l * 16, n19 + n6).a(0.45f, 0.45f, 0.5f, 0.3f).d();
                        c.b(n16 + n7, \u2603 + (l + 1) * 16, n17 + n8).a(0.45f, 0.45f, 0.5f, 0.3f).d();
                    }
                    a.b();
                }
            }
        }
        bfl.k();
        bfl.e();
        bfl.w();
    }
    
    @Override
    protected jy a(final uv \u2603) {
        return null;
    }
}
