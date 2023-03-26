import java.util.List;
import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public class aoa implements amv
{
    private Random h;
    private arc i;
    private arc j;
    private arc k;
    private ard l;
    public arc a;
    public arc b;
    public arc c;
    private adm m;
    private final boolean n;
    private adr o;
    private final double[] p;
    private final float[] q;
    private ant r;
    private afh s;
    private double[] t;
    private any u;
    private aqo v;
    private aqv w;
    private aqf x;
    private aqm y;
    private any z;
    private aqk A;
    private ady[] B;
    double[] d;
    double[] e;
    double[] f;
    double[] g;
    
    public aoa(final adm \u2603, final long \u2603, final boolean \u2603, final String \u2603) {
        this.s = afi.j;
        this.t = new double[256];
        this.u = new anx();
        this.v = new aqo();
        this.w = new aqv();
        this.x = new aqf();
        this.y = new aqm();
        this.z = new anr();
        this.A = new aqk();
        this.m = \u2603;
        this.n = \u2603;
        this.o = \u2603.P().u();
        this.h = new Random(\u2603);
        this.i = new arc(this.h, 16);
        this.j = new arc(this.h, 16);
        this.k = new arc(this.h, 8);
        this.l = new ard(this.h, 4);
        this.a = new arc(this.h, 10);
        this.b = new arc(this.h, 16);
        this.c = new arc(this.h, 8);
        this.p = new double[825];
        this.q = new float[25];
        for (int i = -2; i <= 2; ++i) {
            for (int j = -2; j <= 2; ++j) {
                final float n = 10.0f / ns.c(i * i + j * j + 0.2f);
                this.q[i + 2 + (j + 2) * 5] = n;
            }
        }
        if (\u2603 != null) {
            this.r = ant.a.a(\u2603).b();
            this.s = (this.r.E ? afi.l : afi.j);
            \u2603.b(this.r.q);
        }
    }
    
    public void a(final int \u2603, final int \u2603, final ans \u2603) {
        this.B = this.m.v().a(this.B, \u2603 * 4 - 2, \u2603 * 4 - 2, 10, 10);
        this.a(\u2603 * 4, 0, \u2603 * 4);
        for (int i = 0; i < 4; ++i) {
            final int n = i * 5;
            final int n2 = (i + 1) * 5;
            for (int j = 0; j < 4; ++j) {
                final int n3 = (n + j) * 33;
                final int n4 = (n + j + 1) * 33;
                final int n5 = (n2 + j) * 33;
                final int n6 = (n2 + j + 1) * 33;
                for (int k = 0; k < 32; ++k) {
                    final double n7 = 0.125;
                    double n8 = this.p[n3 + k];
                    double n9 = this.p[n4 + k];
                    double n10 = this.p[n5 + k];
                    double n11 = this.p[n6 + k];
                    final double n12 = (this.p[n3 + k + 1] - n8) * n7;
                    final double n13 = (this.p[n4 + k + 1] - n9) * n7;
                    final double n14 = (this.p[n5 + k + 1] - n10) * n7;
                    final double n15 = (this.p[n6 + k + 1] - n11) * n7;
                    for (int l = 0; l < 8; ++l) {
                        final double n16 = 0.25;
                        double n17 = n8;
                        double n18 = n9;
                        final double n19 = (n10 - n8) * n16;
                        final double n20 = (n11 - n9) * n16;
                        for (int n21 = 0; n21 < 4; ++n21) {
                            final double n22 = 0.25;
                            double n23 = n17;
                            final double n24 = (n18 - n17) * n22;
                            n23 -= n24;
                            for (int n25 = 0; n25 < 4; ++n25) {
                                if ((n23 += n24) > 0.0) {
                                    \u2603.a(i * 4 + n21, k * 8 + l, j * 4 + n25, afi.b.Q());
                                }
                                else if (k * 8 + l < this.r.q) {
                                    \u2603.a(i * 4 + n21, k * 8 + l, j * 4 + n25, this.s.Q());
                                }
                            }
                            n17 += n19;
                            n18 += n20;
                        }
                        n8 += n12;
                        n9 += n13;
                        n10 += n14;
                        n11 += n15;
                    }
                }
            }
        }
    }
    
    public void a(final int \u2603, final int \u2603, final ans \u2603, final ady[] \u2603) {
        final double n = 0.03125;
        this.t = this.l.a(this.t, \u2603 * 16, \u2603 * 16, 16, 16, n * 2.0, n * 2.0, 1.0);
        for (int i = 0; i < 16; ++i) {
            for (int j = 0; j < 16; ++j) {
                final ady ady = \u2603[j + i * 16];
                ady.a(this.m, this.h, \u2603, \u2603 * 16 + i, \u2603 * 16 + j, this.t[j + i * 16]);
            }
        }
    }
    
    @Override
    public amy d(final int \u2603, final int \u2603) {
        this.h.setSeed(\u2603 * 341873128712L + \u2603 * 132897987541L);
        final ans ans = new ans();
        this.a(\u2603, \u2603, ans);
        this.a(\u2603, \u2603, ans, this.B = this.m.v().b(this.B, \u2603 * 16, \u2603 * 16, 16, 16));
        if (this.r.r) {
            this.u.a(this, this.m, \u2603, \u2603, ans);
        }
        if (this.r.z) {
            this.z.a(this, this.m, \u2603, \u2603, ans);
        }
        if (this.r.w && this.n) {
            this.x.a(this, this.m, \u2603, \u2603, ans);
        }
        if (this.r.v && this.n) {
            this.w.a(this, this.m, \u2603, \u2603, ans);
        }
        if (this.r.u && this.n) {
            this.v.a(this, this.m, \u2603, \u2603, ans);
        }
        if (this.r.x && this.n) {
            this.y.a(this, this.m, \u2603, \u2603, ans);
        }
        if (this.r.y && this.n) {
            this.A.a(this, this.m, \u2603, \u2603, ans);
        }
        final amy amy = new amy(this.m, ans, \u2603, \u2603);
        final byte[] k = amy.k();
        for (int i = 0; i < k.length; ++i) {
            k[i] = (byte)this.B[i].az;
        }
        amy.b();
        return amy;
    }
    
    private void a(int \u2603, final int \u2603, int \u2603) {
        this.g = this.b.a(this.g, \u2603, \u2603, 5, 5, this.r.e, this.r.f, this.r.g);
        final float a = this.r.a;
        final float b = this.r.b;
        this.d = this.k.a(this.d, \u2603, \u2603, \u2603, 5, 33, 5, a / this.r.h, b / this.r.i, a / this.r.j);
        this.e = this.i.a(this.e, \u2603, \u2603, \u2603, 5, 33, 5, a, b, a);
        this.f = this.j.a(this.f, \u2603, \u2603, \u2603, 5, 33, 5, a, b, a);
        \u2603 = (\u2603 = 0);
        int n = 0;
        int n2 = 0;
        for (int i = 0; i < 5; ++i) {
            for (int j = 0; j < 5; ++j) {
                float n3 = 0.0f;
                float n4 = 0.0f;
                float n5 = 0.0f;
                final int n6 = 2;
                final ady ady = this.B[i + 2 + (j + 2) * 10];
                for (int k = -n6; k <= n6; ++k) {
                    for (int l = -n6; l <= n6; ++l) {
                        final ady ady2 = this.B[i + k + 2 + (j + l + 2) * 10];
                        float n7 = this.r.n + ady2.an * this.r.m;
                        float n8 = this.r.p + ady2.ao * this.r.o;
                        if (this.o == adr.e && n7 > 0.0f) {
                            n7 = 1.0f + n7 * 2.0f;
                            n8 = 1.0f + n8 * 4.0f;
                        }
                        float n9 = this.q[k + 2 + (l + 2) * 5] / (n7 + 2.0f);
                        if (ady2.an > ady.an) {
                            n9 /= 2.0f;
                        }
                        n3 += n8 * n9;
                        n4 += n7 * n9;
                        n5 += n9;
                    }
                }
                n3 /= n5;
                n4 /= n5;
                n3 = n3 * 0.9f + 0.1f;
                n4 = (n4 * 4.0f - 1.0f) / 8.0f;
                double n10 = this.g[n2] / 8000.0;
                if (n10 < 0.0) {
                    n10 = -n10 * 0.3;
                }
                n10 = n10 * 3.0 - 2.0;
                if (n10 < 0.0) {
                    n10 /= 2.0;
                    if (n10 < -1.0) {
                        n10 = -1.0;
                    }
                    n10 /= 1.4;
                    n10 /= 2.0;
                }
                else {
                    if (n10 > 1.0) {
                        n10 = 1.0;
                    }
                    n10 /= 8.0;
                }
                ++n2;
                double n11 = n4;
                final double n12 = n3;
                n11 += n10 * 0.2;
                n11 = n11 * this.r.k / 8.0;
                final double n13 = this.r.k + n11 * 4.0;
                for (int n14 = 0; n14 < 33; ++n14) {
                    double n15 = (n14 - n13) * this.r.l * 128.0 / 256.0 / n12;
                    if (n15 < 0.0) {
                        n15 *= 4.0;
                    }
                    final double \u26032 = this.e[n] / this.r.d;
                    final double \u26033 = this.f[n] / this.r.c;
                    final double \u26034 = (this.d[n] / 10.0 + 1.0) / 2.0;
                    double n16 = ns.b(\u26032, \u26033, \u26034) - n15;
                    if (n14 > 29) {
                        final double n17 = (n14 - 29) / 3.0f;
                        n16 = n16 * (1.0 - n17) + -10.0 * n17;
                    }
                    this.p[n] = n16;
                    ++n;
                }
            }
        }
    }
    
    @Override
    public boolean a(final int \u2603, final int \u2603) {
        return true;
    }
    
    @Override
    public void a(final amv \u2603, final int \u2603, final int \u2603) {
        agr.N = true;
        final int n = \u2603 * 16;
        final int n2 = \u2603 * 16;
        cj a = new cj(n, 0, n2);
        final ady b = this.m.b(a.a(16, 0, 16));
        this.h.setSeed(this.m.J());
        final long n3 = this.h.nextLong() / 2L * 2L + 1L;
        final long n4 = this.h.nextLong() / 2L * 2L + 1L;
        this.h.setSeed(\u2603 * n3 + \u2603 * n4 ^ this.m.J());
        boolean a2 = false;
        final adg \u26032 = new adg(\u2603, \u2603);
        if (this.r.w && this.n) {
            this.x.a(this.m, this.h, \u26032);
        }
        if (this.r.v && this.n) {
            a2 = this.w.a(this.m, this.h, \u26032);
        }
        if (this.r.u && this.n) {
            this.v.a(this.m, this.h, \u26032);
        }
        if (this.r.x && this.n) {
            this.y.a(this.m, this.h, \u26032);
        }
        if (this.r.y && this.n) {
            this.A.a(this.m, this.h, \u26032);
        }
        if (b != ady.r && b != ady.G && this.r.A && !a2 && this.h.nextInt(this.r.B) == 0) {
            final int i = this.h.nextInt(16) + 8;
            final int j = this.h.nextInt(256);
            final int nextInt = this.h.nextInt(16) + 8;
            new apc(afi.j).b(this.m, this.h, a.a(i, j, nextInt));
        }
        if (!a2 && this.h.nextInt(this.r.D / 10) == 0 && this.r.C) {
            final int i = this.h.nextInt(16) + 8;
            final int j = this.h.nextInt(this.h.nextInt(248) + 8);
            final int nextInt = this.h.nextInt(16) + 8;
            if (j < this.m.F() || this.h.nextInt(this.r.D / 8) == 0) {
                new apc(afi.l).b(this.m, this.h, a.a(i, j, nextInt));
            }
        }
        if (this.r.s) {
            for (int i = 0; i < this.r.t; ++i) {
                final int j = this.h.nextInt(16) + 8;
                final int nextInt = this.h.nextInt(256);
                final int \u26033 = this.h.nextInt(16) + 8;
                new api().b(this.m, this.h, a.a(j, nextInt, \u26033));
            }
        }
        b.a(this.m, this.h, new cj(n, 0, n2));
        adt.a(this.m, b, n + 8, n2 + 8, 16, 16, this.h);
        a = a.a(8, 0, 8);
        for (int i = 0; i < 16; ++i) {
            for (int j = 0; j < 16; ++j) {
                final cj q = this.m.q(a.a(i, 0, j));
                final cj b2 = q.b();
                if (this.m.v(b2)) {
                    this.m.a(b2, afi.aI.Q(), 2);
                }
                if (this.m.f(q, true)) {
                    this.m.a(q, afi.aH.Q(), 2);
                }
            }
        }
        agr.N = false;
    }
    
    @Override
    public boolean a(final amv \u2603, final amy \u2603, final int \u2603, final int \u2603) {
        boolean b = false;
        if (this.r.y && this.n && \u2603.w() < 3600L) {
            b |= this.A.a(this.m, this.h, new adg(\u2603, \u2603));
        }
        return b;
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
        final ady b = this.m.b(\u2603);
        if (this.n) {
            if (\u2603 == pt.a && this.y.a(\u2603)) {
                return this.y.b();
            }
            if (\u2603 == pt.a && this.r.y && this.A.a(this.m, \u2603)) {
                return this.A.b();
            }
        }
        return b.a(\u2603);
    }
    
    @Override
    public cj a(final adm \u2603, final String \u2603, final cj \u2603) {
        if ("Stronghold".equals(\u2603) && this.v != null) {
            return this.v.b(\u2603, \u2603);
        }
        return null;
    }
    
    @Override
    public int g() {
        return 0;
    }
    
    @Override
    public void a(final amy \u2603, final int \u2603, final int \u2603) {
        if (this.r.w && this.n) {
            this.x.a(this, this.m, \u2603, \u2603, null);
        }
        if (this.r.v && this.n) {
            this.w.a(this, this.m, \u2603, \u2603, null);
        }
        if (this.r.u && this.n) {
            this.v.a(this, this.m, \u2603, \u2603, null);
        }
        if (this.r.x && this.n) {
            this.y.a(this, this.m, \u2603, \u2603, null);
        }
        if (this.r.y && this.n) {
            this.A.a(this, this.m, \u2603, \u2603, null);
        }
    }
    
    @Override
    public amy a(final cj \u2603) {
        return this.d(\u2603.n() >> 4, \u2603.p() >> 4);
    }
}
