import java.util.List;
import com.google.common.base.Predicate;
import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public class anw implements amv
{
    private final adm h;
    private final boolean i;
    private final Random j;
    private double[] k;
    private double[] l;
    private double[] m;
    private double[] n;
    private final arc o;
    private final arc p;
    private final arc q;
    private final arc r;
    private final arc s;
    public final arc a;
    public final arc b;
    private final aow t;
    private final apd u;
    private final aox v;
    private final aot w;
    private final aoy x;
    private final aoy y;
    private final aom z;
    private final aom A;
    private final aqi B;
    private final any C;
    double[] c;
    double[] d;
    double[] e;
    double[] f;
    double[] g;
    
    public anw(final adm \u2603, final boolean \u2603, final long \u2603) {
        this.k = new double[256];
        this.l = new double[256];
        this.m = new double[256];
        this.t = new aow();
        this.u = new apd();
        this.v = new aox();
        this.w = new apj(afi.co.Q(), 14, amg.a(afi.aV));
        this.x = new aoy(afi.k, true);
        this.y = new aoy(afi.k, false);
        this.z = new aom(afi.P);
        this.A = new aom(afi.Q);
        this.B = new aqi();
        this.C = new anz();
        this.h = \u2603;
        this.i = \u2603;
        this.j = new Random(\u2603);
        this.o = new arc(this.j, 16);
        this.p = new arc(this.j, 16);
        this.q = new arc(this.j, 8);
        this.r = new arc(this.j, 4);
        this.s = new arc(this.j, 4);
        this.a = new arc(this.j, 10);
        this.b = new arc(this.j, 16);
        \u2603.b(63);
    }
    
    public void a(final int \u2603, final int \u2603, final ans \u2603) {
        final int n = 4;
        final int n2 = this.h.F() / 2 + 1;
        final int \u26032 = n + 1;
        final int \u26033 = 17;
        final int \u26034 = n + 1;
        this.n = this.a(this.n, \u2603 * n, 0, \u2603 * n, \u26032, \u26033, \u26034);
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                for (int k = 0; k < 16; ++k) {
                    final double n3 = 0.125;
                    double n4 = this.n[((i + 0) * \u26034 + (j + 0)) * \u26033 + (k + 0)];
                    double n5 = this.n[((i + 0) * \u26034 + (j + 1)) * \u26033 + (k + 0)];
                    double n6 = this.n[((i + 1) * \u26034 + (j + 0)) * \u26033 + (k + 0)];
                    double n7 = this.n[((i + 1) * \u26034 + (j + 1)) * \u26033 + (k + 0)];
                    final double n8 = (this.n[((i + 0) * \u26034 + (j + 0)) * \u26033 + (k + 1)] - n4) * n3;
                    final double n9 = (this.n[((i + 0) * \u26034 + (j + 1)) * \u26033 + (k + 1)] - n5) * n3;
                    final double n10 = (this.n[((i + 1) * \u26034 + (j + 0)) * \u26033 + (k + 1)] - n6) * n3;
                    final double n11 = (this.n[((i + 1) * \u26034 + (j + 1)) * \u26033 + (k + 1)] - n7) * n3;
                    for (int l = 0; l < 8; ++l) {
                        final double n12 = 0.25;
                        double n13 = n4;
                        double n14 = n5;
                        final double n15 = (n6 - n4) * n12;
                        final double n16 = (n7 - n5) * n12;
                        for (int n17 = 0; n17 < 4; ++n17) {
                            final double n18 = 0.25;
                            double n19 = n13;
                            final double n20 = (n14 - n13) * n18;
                            for (int n21 = 0; n21 < 4; ++n21) {
                                alz \u26035 = null;
                                if (k * 8 + l < n2) {
                                    \u26035 = afi.l.Q();
                                }
                                if (n19 > 0.0) {
                                    \u26035 = afi.aV.Q();
                                }
                                final int \u26036 = n17 + i * 4;
                                final int \u26037 = l + k * 8;
                                final int \u26038 = n21 + j * 4;
                                \u2603.a(\u26036, \u26037, \u26038, \u26035);
                                n19 += n20;
                            }
                            n13 += n15;
                            n14 += n16;
                        }
                        n4 += n8;
                        n5 += n9;
                        n6 += n10;
                        n7 += n11;
                    }
                }
            }
        }
    }
    
    public void b(final int \u2603, final int \u2603, final ans \u2603) {
        final int n = this.h.F() + 1;
        final double n2 = 0.03125;
        this.k = this.r.a(this.k, \u2603 * 16, \u2603 * 16, 0, 16, 16, 1, n2, n2, 1.0);
        this.l = this.r.a(this.l, \u2603 * 16, 109, \u2603 * 16, 16, 1, 16, n2, 1.0, n2);
        this.m = this.s.a(this.m, \u2603 * 16, \u2603 * 16, 0, 16, 16, 1, n2 * 2.0, n2 * 2.0, n2 * 2.0);
        for (int i = 0; i < 16; ++i) {
            for (int j = 0; j < 16; ++j) {
                final boolean b = this.k[i + j * 16] + this.j.nextDouble() * 0.2 > 0.0;
                final boolean b2 = this.l[i + j * 16] + this.j.nextDouble() * 0.2 > 0.0;
                final int n3 = (int)(this.m[i + j * 16] / 3.0 + 3.0 + this.j.nextDouble() * 0.25);
                int n4 = -1;
                alz \u26032 = afi.aV.Q();
                alz alz = afi.aV.Q();
                for (int k = 127; k >= 0; --k) {
                    if (k >= 127 - this.j.nextInt(5) || k <= this.j.nextInt(5)) {
                        \u2603.a(j, k, i, afi.h.Q());
                    }
                    else {
                        final alz a = \u2603.a(j, k, i);
                        if (a.c() == null || a.c().t() == arm.a) {
                            n4 = -1;
                        }
                        else if (a.c() == afi.aV) {
                            if (n4 == -1) {
                                if (n3 <= 0) {
                                    \u26032 = null;
                                    alz = afi.aV.Q();
                                }
                                else if (k >= n - 4 && k <= n + 1) {
                                    \u26032 = afi.aV.Q();
                                    alz = afi.aV.Q();
                                    if (b2) {
                                        \u26032 = afi.n.Q();
                                        alz = afi.aV.Q();
                                    }
                                    if (b) {
                                        \u26032 = afi.aW.Q();
                                        alz = afi.aW.Q();
                                    }
                                }
                                if (k < n && (\u26032 == null || \u26032.c().t() == arm.a)) {
                                    \u26032 = afi.l.Q();
                                }
                                n4 = n3;
                                if (k >= n - 1) {
                                    \u2603.a(j, k, i, \u26032);
                                }
                                else {
                                    \u2603.a(j, k, i, alz);
                                }
                            }
                            else if (n4 > 0) {
                                --n4;
                                \u2603.a(j, k, i, alz);
                            }
                        }
                    }
                }
            }
        }
    }
    
    @Override
    public amy d(final int \u2603, final int \u2603) {
        this.j.setSeed(\u2603 * 341873128712L + \u2603 * 132897987541L);
        final ans \u26032 = new ans();
        this.a(\u2603, \u2603, \u26032);
        this.b(\u2603, \u2603, \u26032);
        this.C.a(this, this.h, \u2603, \u2603, \u26032);
        if (this.i) {
            this.B.a(this, this.h, \u2603, \u2603, \u26032);
        }
        final amy amy = new amy(this.h, \u26032, \u2603, \u2603);
        final ady[] b = this.h.v().b(null, \u2603 * 16, \u2603 * 16, 16, 16);
        final byte[] k = amy.k();
        for (int i = 0; i < k.length; ++i) {
            k[i] = (byte)b[i].az;
        }
        amy.l();
        return amy;
    }
    
    private double[] a(double[] \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603) {
        if (\u2603 == null) {
            \u2603 = new double[\u2603 * \u2603 * \u2603];
        }
        final double n = 684.412;
        final double n2 = 2053.236;
        this.f = this.a.a(this.f, \u2603, \u2603, \u2603, \u2603, 1, \u2603, 1.0, 0.0, 1.0);
        this.g = this.b.a(this.g, \u2603, \u2603, \u2603, \u2603, 1, \u2603, 100.0, 0.0, 100.0);
        this.c = this.q.a(this.c, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603, n / 80.0, n2 / 60.0, n / 80.0);
        this.d = this.o.a(this.d, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603, n, n2, n);
        this.e = this.p.a(this.e, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603, n, n2, n);
        int n3 = 0;
        final double[] array = new double[\u2603];
        for (int i = 0; i < \u2603; ++i) {
            array[i] = Math.cos(i * 3.141592653589793 * 6.0 / \u2603) * 2.0;
            double n4 = i;
            if (i > \u2603 / 2) {
                n4 = \u2603 - 1 - i;
            }
            if (n4 < 4.0) {
                n4 = 4.0 - n4;
                final double[] array2 = array;
                final int n5 = i;
                array2[n5] -= n4 * n4 * n4 * 10.0;
            }
        }
        for (int i = 0; i < \u2603; ++i) {
            for (int j = 0; j < \u2603; ++j) {
                final double n6 = 0.0;
                for (int k = 0; k < \u2603; ++k) {
                    double n7 = 0.0;
                    final double n8 = array[k];
                    final double n9 = this.d[n3] / 512.0;
                    final double n10 = this.e[n3] / 512.0;
                    final double n11 = (this.c[n3] / 10.0 + 1.0) / 2.0;
                    if (n11 < 0.0) {
                        n7 = n9;
                    }
                    else if (n11 > 1.0) {
                        n7 = n10;
                    }
                    else {
                        n7 = n9 + (n10 - n9) * n11;
                    }
                    n7 -= n8;
                    if (k > \u2603 - 4) {
                        final double a = (k - (\u2603 - 4)) / 3.0f;
                        n7 = n7 * (1.0 - a) + -10.0 * a;
                    }
                    if (k < n6) {
                        double a = (n6 - k) / 4.0;
                        a = ns.a(a, 0.0, 1.0);
                        n7 = n7 * (1.0 - a) + -10.0 * a;
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
        final cj cj = new cj(\u2603 * 16, 0, \u2603 * 16);
        final adg \u26032 = new adg(\u2603, \u2603);
        this.B.a(this.h, this.j, \u26032);
        for (int i = 0; i < 8; ++i) {
            this.y.b(this.h, this.j, cj.a(this.j.nextInt(16) + 8, this.j.nextInt(120) + 4, this.j.nextInt(16) + 8));
        }
        for (int i = 0; i < this.j.nextInt(this.j.nextInt(10) + 1) + 1; ++i) {
            this.t.b(this.h, this.j, cj.a(this.j.nextInt(16) + 8, this.j.nextInt(120) + 4, this.j.nextInt(16) + 8));
        }
        for (int i = 0; i < this.j.nextInt(this.j.nextInt(10) + 1); ++i) {
            this.u.b(this.h, this.j, cj.a(this.j.nextInt(16) + 8, this.j.nextInt(120) + 4, this.j.nextInt(16) + 8));
        }
        for (int i = 0; i < 10; ++i) {
            this.v.b(this.h, this.j, cj.a(this.j.nextInt(16) + 8, this.j.nextInt(128), this.j.nextInt(16) + 8));
        }
        if (this.j.nextBoolean()) {
            this.z.b(this.h, this.j, cj.a(this.j.nextInt(16) + 8, this.j.nextInt(128), this.j.nextInt(16) + 8));
        }
        if (this.j.nextBoolean()) {
            this.A.b(this.h, this.j, cj.a(this.j.nextInt(16) + 8, this.j.nextInt(128), this.j.nextInt(16) + 8));
        }
        for (int i = 0; i < 16; ++i) {
            this.w.b(this.h, this.j, cj.a(this.j.nextInt(16), this.j.nextInt(108) + 10, this.j.nextInt(16)));
        }
        for (int i = 0; i < 16; ++i) {
            this.x.b(this.h, this.j, cj.a(this.j.nextInt(16), this.j.nextInt(108) + 10, this.j.nextInt(16)));
        }
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
        return "HellRandomLevelSource";
    }
    
    @Override
    public List<ady.c> a(final pt \u2603, final cj \u2603) {
        if (\u2603 == pt.a) {
            if (this.B.b(\u2603)) {
                return this.B.b();
            }
            if (this.B.a(this.h, \u2603) && this.h.p(\u2603.b()).c() == afi.by) {
                return this.B.b();
            }
        }
        final ady b = this.h.b(\u2603);
        return b.a(\u2603);
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
        this.B.a(this, this.h, \u2603, \u2603, null);
    }
    
    @Override
    public amy a(final cj \u2603) {
        return this.d(\u2603.n() >> 4, \u2603.p() >> 4);
    }
}
