import java.util.List;
import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public class aob implements amv
{
    private Random h;
    private arc i;
    private arc j;
    private arc k;
    public arc a;
    public arc b;
    private adm l;
    private double[] m;
    private ady[] n;
    double[] c;
    double[] d;
    double[] e;
    double[] f;
    double[] g;
    
    public aob(final adm \u2603, final long \u2603) {
        this.l = \u2603;
        this.h = new Random(\u2603);
        this.i = new arc(this.h, 16);
        this.j = new arc(this.h, 16);
        this.k = new arc(this.h, 8);
        this.a = new arc(this.h, 10);
        this.b = new arc(this.h, 16);
    }
    
    public void a(final int \u2603, final int \u2603, final ans \u2603) {
        final int n = 2;
        final int \u26032 = n + 1;
        final int \u26033 = 33;
        final int \u26034 = n + 1;
        this.m = this.a(this.m, \u2603 * n, 0, \u2603 * n, \u26032, \u26033, \u26034);
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                for (int k = 0; k < 32; ++k) {
                    final double n2 = 0.25;
                    double n3 = this.m[((i + 0) * \u26034 + j + 0) * \u26033 + k + 0];
                    double n4 = this.m[((i + 0) * \u26034 + j + 1) * \u26033 + k + 0];
                    double n5 = this.m[((i + 1) * \u26034 + j + 0) * \u26033 + k + 0];
                    double n6 = this.m[((i + 1) * \u26034 + j + 1) * \u26033 + k + 0];
                    final double n7 = (this.m[((i + 0) * \u26034 + j + 0) * \u26033 + k + 1] - n3) * n2;
                    final double n8 = (this.m[((i + 0) * \u26034 + j + 1) * \u26033 + k + 1] - n4) * n2;
                    final double n9 = (this.m[((i + 1) * \u26034 + j + 0) * \u26033 + k + 1] - n5) * n2;
                    final double n10 = (this.m[((i + 1) * \u26034 + j + 1) * \u26033 + k + 1] - n6) * n2;
                    for (int l = 0; l < 4; ++l) {
                        final double n11 = 0.125;
                        double n12 = n3;
                        double n13 = n4;
                        final double n14 = (n5 - n3) * n11;
                        final double n15 = (n6 - n4) * n11;
                        for (int n16 = 0; n16 < 8; ++n16) {
                            final double n17 = 0.125;
                            double n18 = n12;
                            final double n19 = (n13 - n12) * n17;
                            for (int n20 = 0; n20 < 8; ++n20) {
                                alz q = null;
                                if (n18 > 0.0) {
                                    q = afi.bH.Q();
                                }
                                final int \u26035 = n16 + i * 8;
                                final int \u26036 = l + k * 4;
                                final int \u26037 = n20 + j * 8;
                                \u2603.a(\u26035, \u26036, \u26037, q);
                                n18 += n19;
                            }
                            n12 += n14;
                            n13 += n15;
                        }
                        n3 += n7;
                        n4 += n8;
                        n5 += n9;
                        n6 += n10;
                    }
                }
            }
        }
    }
    
    public void a(final ans \u2603) {
        for (int i = 0; i < 16; ++i) {
            for (int j = 0; j < 16; ++j) {
                final int n = 1;
                int n2 = -1;
                alz \u26032 = afi.bH.Q();
                alz alz = afi.bH.Q();
                for (int k = 127; k >= 0; --k) {
                    final alz a = \u2603.a(i, k, j);
                    if (a.c().t() == arm.a) {
                        n2 = -1;
                    }
                    else if (a.c() == afi.b) {
                        if (n2 == -1) {
                            if (n <= 0) {
                                \u26032 = afi.a.Q();
                                alz = afi.bH.Q();
                            }
                            n2 = n;
                            if (k >= 0) {
                                \u2603.a(i, k, j, \u26032);
                            }
                            else {
                                \u2603.a(i, k, j, alz);
                            }
                        }
                        else if (n2 > 0) {
                            --n2;
                            \u2603.a(i, k, j, alz);
                        }
                    }
                }
            }
        }
    }
    
    @Override
    public amy d(final int \u2603, final int \u2603) {
        this.h.setSeed(\u2603 * 341873128712L + \u2603 * 132897987541L);
        final ans \u26032 = new ans();
        this.n = this.l.v().b(this.n, \u2603 * 16, \u2603 * 16, 16, 16);
        this.a(\u2603, \u2603, \u26032);
        this.a(\u26032);
        final amy amy = new amy(this.l, \u26032, \u2603, \u2603);
        final byte[] k = amy.k();
        for (int i = 0; i < k.length; ++i) {
            k[i] = (byte)this.n[i].az;
        }
        amy.b();
        return amy;
    }
    
    private double[] a(double[] \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603) {
        if (\u2603 == null) {
            \u2603 = new double[\u2603 * \u2603 * \u2603];
        }
        double n = 684.412;
        final double n2 = 684.412;
        this.f = this.a.a(this.f, \u2603, \u2603, \u2603, \u2603, 1.121, 1.121, 0.5);
        this.g = this.b.a(this.g, \u2603, \u2603, \u2603, \u2603, 200.0, 200.0, 0.5);
        n *= 2.0;
        this.c = this.k.a(this.c, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603, n / 80.0, n2 / 160.0, n / 80.0);
        this.d = this.i.a(this.d, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603, n, n2, n);
        this.e = this.j.a(this.e, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603, n, n2, n);
        int n3 = 0;
        for (int i = 0; i < \u2603; ++i) {
            for (int j = 0; j < \u2603; ++j) {
                final float n4 = (i + \u2603) / 1.0f;
                final float n5 = (j + \u2603) / 1.0f;
                float n6 = 100.0f - ns.c(n4 * n4 + n5 * n5) * 8.0f;
                if (n6 > 80.0f) {
                    n6 = 80.0f;
                }
                if (n6 < -100.0f) {
                    n6 = -100.0f;
                }
                for (int k = 0; k < \u2603; ++k) {
                    double n7 = 0.0;
                    final double n8 = this.d[n3] / 512.0;
                    final double n9 = this.e[n3] / 512.0;
                    final double n10 = (this.c[n3] / 10.0 + 1.0) / 2.0;
                    if (n10 < 0.0) {
                        n7 = n8;
                    }
                    else if (n10 > 1.0) {
                        n7 = n9;
                    }
                    else {
                        n7 = n8 + (n9 - n8) * n10;
                    }
                    n7 -= 8.0;
                    n7 += n6;
                    int n11 = 2;
                    if (k > \u2603 / 2 - n11) {
                        double a = (k - (\u2603 / 2 - n11)) / 64.0f;
                        a = ns.a(a, 0.0, 1.0);
                        n7 = n7 * (1.0 - a) + -3000.0 * a;
                    }
                    n11 = 8;
                    if (k < n11) {
                        final double a = (n11 - k) / (n11 - 1.0f);
                        n7 = n7 * (1.0 - a) + -30.0 * a;
                    }
                    \u2603[n3] = n7;
                    ++n3;
                }
            }
        }
        return \u2603;
    }
    
    @Override
    public boolean a(final int \u2603, final int \u2603) {
        return true;
    }
    
    @Override
    public void a(final amv \u2603, final int \u2603, final int \u2603) {
        agr.N = true;
        final cj \u26032 = new cj(\u2603 * 16, 0, \u2603 * 16);
        this.l.b(\u26032.a(16, 0, 16)).a(this.l, this.l.s, \u26032);
        agr.N = false;
    }
    
    @Override
    public boolean a(final amv \u2603, final amy \u2603, final int \u2603, final int \u2603) {
        return false;
    }
    
    @Override
    public boolean a(final boolean \u2603, final nu \u2603) {
        return true;
    }
    
    @Override
    public void c() {
    }
    
    @Override
    public boolean d() {
        return false;
    }
    
    @Override
    public boolean e() {
        return true;
    }
    
    @Override
    public String f() {
        return "RandomLevelSource";
    }
    
    @Override
    public List<ady.c> a(final pt \u2603, final cj \u2603) {
        return this.l.b(\u2603).a(\u2603);
    }
    
    @Override
    public cj a(final adm \u2603, final String \u2603, final cj \u2603) {
        return null;
    }
    
    @Override
    public int g() {
        return 0;
    }
    
    @Override
    public void a(final amy \u2603, final int \u2603, final int \u2603) {
    }
    
    @Override
    public amy a(final cj \u2603) {
        return this.d(\u2603.n() >> 4, \u2603.p() >> 4);
    }
}
