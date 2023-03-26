import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public class aeb
{
    protected adm a;
    protected Random b;
    protected cj c;
    protected ant d;
    protected aot e;
    protected aot f;
    protected aot g;
    protected aot h;
    protected aot i;
    protected aot j;
    protected aot k;
    protected aot l;
    protected aot m;
    protected aot n;
    protected aot o;
    protected aot p;
    protected aot q;
    protected aot r;
    protected aou s;
    protected aot t;
    protected aot u;
    protected aot v;
    protected aot w;
    protected aot x;
    protected aot y;
    protected int z;
    protected int A;
    protected int B;
    protected int C;
    protected int D;
    protected int E;
    protected int F;
    protected int G;
    protected int H;
    protected int I;
    protected int J;
    protected int K;
    public boolean L;
    
    public aeb() {
        this.e = new aop(4);
        this.f = new apo(afi.m, 7);
        this.g = new apo(afi.n, 6);
        this.s = new aou(afi.N, agw.a.a);
        this.t = new aom(afi.P);
        this.u = new aom(afi.Q);
        this.v = new aoz();
        this.w = new apm();
        this.x = new aon();
        this.y = new apx();
        this.B = 2;
        this.C = 1;
        this.H = 1;
        this.I = 3;
        this.J = 1;
        this.L = true;
    }
    
    public void a(final adm \u2603, final Random \u2603, final ady \u2603, final cj \u2603) {
        if (this.a != null) {
            throw new RuntimeException("Already decorating");
        }
        this.a = \u2603;
        final String b = \u2603.P().B();
        if (b != null) {
            this.d = ant.a.a(b).b();
        }
        else {
            this.d = ant.a.a("").b();
        }
        this.b = \u2603;
        this.c = \u2603;
        this.h = new apj(afi.d.Q(), this.d.I);
        this.i = new apj(afi.n.Q(), this.d.M);
        this.j = new apj(afi.b.Q().a(ajy.a, ajy.a.b), this.d.Q);
        this.k = new apj(afi.b.Q().a(ajy.a, ajy.a.d), this.d.U);
        this.l = new apj(afi.b.Q().a(ajy.a, ajy.a.f), this.d.Y);
        this.m = new apj(afi.q.Q(), this.d.ac);
        this.n = new apj(afi.p.Q(), this.d.ag);
        this.o = new apj(afi.o.Q(), this.d.ak);
        this.p = new apj(afi.aC.Q(), this.d.ao);
        this.q = new apj(afi.ag.Q(), this.d.as);
        this.r = new apj(afi.x.Q(), this.d.aw);
        this.a(\u2603);
        this.a = null;
        this.b = null;
    }
    
    protected void a(final ady \u2603) {
        this.a();
        for (int i = 0; i < this.I; ++i) {
            final int j = this.b.nextInt(16) + 8;
            final int n = this.b.nextInt(16) + 8;
            this.f.b(this.a, this.b, this.a.r(this.c.a(j, 0, n)));
        }
        for (int i = 0; i < this.J; ++i) {
            final int j = this.b.nextInt(16) + 8;
            final int n = this.b.nextInt(16) + 8;
            this.e.b(this.a, this.b, this.a.r(this.c.a(j, 0, n)));
        }
        for (int i = 0; i < this.H; ++i) {
            final int j = this.b.nextInt(16) + 8;
            final int n = this.b.nextInt(16) + 8;
            this.g.b(this.a, this.b, this.a.r(this.c.a(j, 0, n)));
        }
        int i = this.A;
        if (this.b.nextInt(10) == 0) {
            ++i;
        }
        for (int j = 0; j < i; ++j) {
            final int n = this.b.nextInt(16) + 8;
            final int n2 = this.b.nextInt(16) + 8;
            final aoh a = \u2603.a(this.b);
            a.e();
            final cj cj = this.a.m(this.c.a(n, 0, n2));
            if (a.b(this.a, this.b, cj)) {
                a.a(this.a, this.b, cj);
            }
        }
        for (int j = 0; j < this.K; ++j) {
            final int n = this.b.nextInt(16) + 8;
            final int n2 = this.b.nextInt(16) + 8;
            this.v.b(this.a, this.b, this.a.m(this.c.a(n, 0, n2)));
        }
        for (int j = 0; j < this.B; ++j) {
            final int n = this.b.nextInt(16) + 8;
            final int n2 = this.b.nextInt(16) + 8;
            final int \u26032 = this.a.m(this.c.a(n, 0, n2)).o() + 32;
            if (\u26032 > 0) {
                final int \u26033 = this.b.nextInt(\u26032);
                final cj \u26034 = this.c.a(n, \u26033, n2);
                final agw.a a2 = \u2603.a(this.b, \u26034);
                final agw a3 = a2.a().a();
                if (a3.t() != arm.a) {
                    this.s.a(a3, a2);
                    this.s.b(this.a, this.b, \u26034);
                }
            }
        }
        for (int j = 0; j < this.C; ++j) {
            final int n = this.b.nextInt(16) + 8;
            final int n2 = this.b.nextInt(16) + 8;
            final int \u26032 = this.a.m(this.c.a(n, 0, n2)).o() * 2;
            if (\u26032 > 0) {
                final int \u26033 = this.b.nextInt(\u26032);
                \u2603.b(this.b).b(this.a, this.b, this.c.a(n, \u26033, n2));
            }
        }
        for (int j = 0; j < this.D; ++j) {
            final int n = this.b.nextInt(16) + 8;
            final int n2 = this.b.nextInt(16) + 8;
            final int \u26032 = this.a.m(this.c.a(n, 0, n2)).o() * 2;
            if (\u26032 > 0) {
                final int \u26033 = this.b.nextInt(\u26032);
                new aoq().b(this.a, this.b, this.c.a(n, \u26033, n2));
            }
        }
        for (int j = 0; j < this.z; ++j) {
            final int n = this.b.nextInt(16) + 8;
            final int n2 = this.b.nextInt(16) + 8;
            final int \u26032 = this.a.m(this.c.a(n, 0, n2)).o() * 2;
            if (\u26032 > 0) {
                final int \u26033 = this.b.nextInt(\u26032);
                cj \u26034;
                cj b;
                for (\u26034 = this.c.a(n, \u26033, n2); \u26034.o() > 0; \u26034 = b) {
                    b = \u26034.b();
                    if (!this.a.d(b)) {
                        break;
                    }
                }
                this.y.b(this.a, this.b, \u26034);
            }
        }
        for (int j = 0; j < this.E; ++j) {
            if (this.b.nextInt(4) == 0) {
                final int n = this.b.nextInt(16) + 8;
                final int n2 = this.b.nextInt(16) + 8;
                final cj m = this.a.m(this.c.a(n, 0, n2));
                this.t.b(this.a, this.b, m);
            }
            if (this.b.nextInt(8) == 0) {
                final int n = this.b.nextInt(16) + 8;
                final int n2 = this.b.nextInt(16) + 8;
                final int \u26032 = this.a.m(this.c.a(n, 0, n2)).o() * 2;
                if (\u26032 > 0) {
                    final int \u26033 = this.b.nextInt(\u26032);
                    final cj \u26034 = this.c.a(n, \u26033, n2);
                    this.u.b(this.a, this.b, \u26034);
                }
            }
        }
        if (this.b.nextInt(4) == 0) {
            final int j = this.b.nextInt(16) + 8;
            final int n = this.b.nextInt(16) + 8;
            final int n2 = this.a.m(this.c.a(j, 0, n)).o() * 2;
            if (n2 > 0) {
                final int \u26032 = this.b.nextInt(n2);
                this.t.b(this.a, this.b, this.c.a(j, \u26032, n));
            }
        }
        if (this.b.nextInt(8) == 0) {
            final int j = this.b.nextInt(16) + 8;
            final int n = this.b.nextInt(16) + 8;
            final int n2 = this.a.m(this.c.a(j, 0, n)).o() * 2;
            if (n2 > 0) {
                final int \u26032 = this.b.nextInt(n2);
                this.u.b(this.a, this.b, this.c.a(j, \u26032, n));
            }
        }
        for (int j = 0; j < this.F; ++j) {
            final int n = this.b.nextInt(16) + 8;
            final int n2 = this.b.nextInt(16) + 8;
            final int \u26032 = this.a.m(this.c.a(n, 0, n2)).o() * 2;
            if (\u26032 > 0) {
                final int \u26033 = this.b.nextInt(\u26032);
                this.w.b(this.a, this.b, this.c.a(n, \u26033, n2));
            }
        }
        for (int j = 0; j < 10; ++j) {
            final int n = this.b.nextInt(16) + 8;
            final int n2 = this.b.nextInt(16) + 8;
            final int \u26032 = this.a.m(this.c.a(n, 0, n2)).o() * 2;
            if (\u26032 > 0) {
                final int \u26033 = this.b.nextInt(\u26032);
                this.w.b(this.a, this.b, this.c.a(n, \u26033, n2));
            }
        }
        if (this.b.nextInt(32) == 0) {
            final int j = this.b.nextInt(16) + 8;
            final int n = this.b.nextInt(16) + 8;
            final int n2 = this.a.m(this.c.a(j, 0, n)).o() * 2;
            if (n2 > 0) {
                final int \u26032 = this.b.nextInt(n2);
                new apl().b(this.a, this.b, this.c.a(j, \u26032, n));
            }
        }
        for (int j = 0; j < this.G; ++j) {
            final int n = this.b.nextInt(16) + 8;
            final int n2 = this.b.nextInt(16) + 8;
            final int \u26032 = this.a.m(this.c.a(n, 0, n2)).o() * 2;
            if (\u26032 > 0) {
                final int \u26033 = this.b.nextInt(\u26032);
                this.x.b(this.a, this.b, this.c.a(n, \u26033, n2));
            }
        }
        if (this.L) {
            for (int j = 0; j < 50; ++j) {
                final int n = this.b.nextInt(16) + 8;
                final int n2 = this.b.nextInt(16) + 8;
                final int \u26032 = this.b.nextInt(248) + 8;
                if (\u26032 > 0) {
                    final int \u26033 = this.b.nextInt(\u26032);
                    final cj \u26034 = this.c.a(n, \u26033, n2);
                    new apr(afi.i).b(this.a, this.b, \u26034);
                }
            }
            for (int j = 0; j < 20; ++j) {
                final int n = this.b.nextInt(16) + 8;
                final int n2 = this.b.nextInt(16) + 8;
                final int \u26032 = this.b.nextInt(this.b.nextInt(this.b.nextInt(240) + 8) + 8);
                final cj cj = this.c.a(n, \u26032, n2);
                new apr(afi.k).b(this.a, this.b, cj);
            }
        }
    }
    
    protected void a(final int \u2603, final aot \u2603, int \u2603, int \u2603) {
        if (\u2603 < \u2603) {
            final int i = \u2603;
            \u2603 = \u2603;
            \u2603 = i;
        }
        else if (\u2603 == \u2603) {
            if (\u2603 < 255) {
                ++\u2603;
            }
            else {
                --\u2603;
            }
        }
        for (int i = 0; i < \u2603; ++i) {
            final cj a = this.c.a(this.b.nextInt(16), this.b.nextInt(\u2603 - \u2603) + \u2603, this.b.nextInt(16));
            \u2603.b(this.a, this.b, a);
        }
    }
    
    protected void b(final int \u2603, final aot \u2603, final int \u2603, final int \u2603) {
        for (int i = 0; i < \u2603; ++i) {
            final cj a = this.c.a(this.b.nextInt(16), this.b.nextInt(\u2603) + this.b.nextInt(\u2603) + \u2603 - \u2603, this.b.nextInt(16));
            \u2603.b(this.a, this.b, a);
        }
    }
    
    protected void a() {
        this.a(this.d.J, this.h, this.d.K, this.d.L);
        this.a(this.d.N, this.i, this.d.O, this.d.P);
        this.a(this.d.V, this.k, this.d.W, this.d.X);
        this.a(this.d.R, this.j, this.d.S, this.d.T);
        this.a(this.d.Z, this.l, this.d.aa, this.d.ab);
        this.a(this.d.ad, this.m, this.d.ae, this.d.af);
        this.a(this.d.ah, this.n, this.d.ai, this.d.aj);
        this.a(this.d.al, this.o, this.d.am, this.d.an);
        this.a(this.d.ap, this.p, this.d.aq, this.d.ar);
        this.a(this.d.at, this.q, this.d.au, this.d.av);
        this.b(this.d.ax, this.r, this.d.ay, this.d.az);
    }
}
