import java.util.Iterator;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public class adu
{
    private final le a;
    private final Random b;
    private final nq<a> c;
    private final List<Long> d;
    
    public adu(final le \u2603) {
        this.c = new nq<a>();
        this.d = (List<Long>)Lists.newArrayList();
        this.a = \u2603;
        this.b = new Random(\u2603.J());
    }
    
    public void a(final pk \u2603, final float \u2603) {
        if (this.a.t.q() == 1) {
            final int c = ns.c(\u2603.s);
            final int n = ns.c(\u2603.t) - 1;
            final int c2 = ns.c(\u2603.u);
            final int n2 = 1;
            final int n3 = 0;
            for (int i = -2; i <= 2; ++i) {
                for (int j = -2; j <= 2; ++j) {
                    for (int k = -1; k < 3; ++k) {
                        final int \u26032 = c + j * n2 + i * n3;
                        final int \u26033 = n + k;
                        final int \u26034 = c2 + j * n3 - i * n2;
                        final boolean b = k < 0;
                        this.a.a(new cj(\u26032, \u26033, \u26034), b ? afi.Z.Q() : afi.a.Q());
                    }
                }
            }
            \u2603.b(c, n, c2, \u2603.y, 0.0f);
            final double v = 0.0;
            \u2603.x = v;
            \u2603.w = v;
            \u2603.v = v;
            return;
        }
        if (this.b(\u2603, \u2603)) {
            return;
        }
        this.a(\u2603);
        this.b(\u2603, \u2603);
    }
    
    public boolean b(final pk \u2603, final float \u2603) {
        final int n = 128;
        double n2 = -1.0;
        final int c = ns.c(\u2603.s);
        final int c2 = ns.c(\u2603.u);
        boolean b = true;
        cj a = cj.a;
        final long a2 = adg.a(c, c2);
        if (this.c.b(a2)) {
            final a a3 = this.c.a(a2);
            n2 = 0.0;
            a = a3;
            a3.c = this.a.K();
            b = false;
        }
        else {
            final cj \u26032 = new cj(\u2603);
            for (int i = -128; i <= 128; ++i) {
                for (int j = -128; j <= 128; ++j) {
                    cj cj;
                    for (cj a4 = \u26032.a(i, this.a.V() - 1 - \u26032.o(), j); a4.o() >= 0; a4 = cj) {
                        cj = a4.b();
                        if (this.a.p(a4).c() == afi.aY) {
                            while (this.a.p(cj = a4.b()).c() == afi.aY) {
                                a4 = cj;
                            }
                            final double k = a4.i(\u26032);
                            if (n2 < 0.0 || k < n2) {
                                n2 = k;
                                a = a4;
                            }
                        }
                    }
                }
            }
        }
        if (n2 >= 0.0) {
            if (b) {
                this.c.a(a2, new a(a, this.a.K()));
                this.d.add(a2);
            }
            double \u26033 = a.n() + 0.5;
            double \u26034 = a.o() + 0.5;
            double \u26035 = a.p() + 0.5;
            final amd.b f = afi.aY.f(this.a, a);
            final boolean b2 = f.b().e().c() == cq.b.b;
            double n3 = (f.b().k() == cq.a.a) ? f.a().p() : ((double)f.a().n());
            \u26034 = f.a().o() + 1 - \u2603.aG().b * f.e();
            if (b2) {
                ++n3;
            }
            if (f.b().k() == cq.a.a) {
                \u26035 = n3 + (1.0 - \u2603.aG().a) * f.d() * f.b().e().c().a();
            }
            else {
                \u26033 = n3 + (1.0 - \u2603.aG().a) * f.d() * f.b().e().c().a();
            }
            float n4 = 0.0f;
            float n5 = 0.0f;
            float n6 = 0.0f;
            float n7 = 0.0f;
            if (f.b().d() == \u2603.aH()) {
                n4 = 1.0f;
                n5 = 1.0f;
            }
            else if (f.b().d() == \u2603.aH().d()) {
                n4 = -1.0f;
                n5 = -1.0f;
            }
            else if (f.b().d() == \u2603.aH().e()) {
                n6 = 1.0f;
                n7 = -1.0f;
            }
            else {
                n6 = -1.0f;
                n7 = 1.0f;
            }
            final double v = \u2603.v;
            final double x = \u2603.x;
            \u2603.v = v * n4 + x * n7;
            \u2603.x = v * n6 + x * n5;
            \u2603.b(\u26033, \u26034, \u26035, \u2603.y = \u2603 - \u2603.aH().d().b() * 90 + f.b().b() * 90, \u2603.z);
            return true;
        }
        return false;
    }
    
    public boolean a(final pk \u2603) {
        final int n = 16;
        double n2 = -1.0;
        final int c = ns.c(\u2603.s);
        final int c2 = ns.c(\u2603.t);
        final int c3 = ns.c(\u2603.u);
        int n3 = c;
        int \u26032 = c2;
        int n4 = c3;
        int n5 = 0;
        final int nextInt = this.b.nextInt(4);
        final cj.a a = new cj.a();
        for (int i = c - n; i <= c + n; ++i) {
            final double n6 = i + 0.5 - \u2603.s;
            for (int j = c3 - n; j <= c3 + n; ++j) {
                final double n7 = j + 0.5 - \u2603.u;
            Label_0464:
                for (int k = this.a.V() - 1; k >= 0; --k) {
                    if (this.a.d(a.c(i, k, j))) {
                        while (k > 0 && this.a.d(a.c(i, k - 1, j))) {
                            --k;
                        }
                        for (int l = nextInt; l < nextInt + 4; ++l) {
                            int n8 = l % 2;
                            int \u26033 = 1 - n8;
                            if (l % 4 >= 2) {
                                n8 = -n8;
                                \u26033 = -\u26033;
                            }
                            for (int \u26034 = 0; \u26034 < 3; ++\u26034) {
                                for (int \u26035 = 0; \u26035 < 4; ++\u26035) {
                                    for (int \u26036 = -1; \u26036 < 4; ++\u26036) {
                                        final int n9 = i + (\u26035 - 1) * n8 + \u26034 * \u26033;
                                        final int n10 = k + \u26036;
                                        final int \u26037 = j + (\u26035 - 1) * \u26033 - \u26034 * n8;
                                        a.c(n9, n10, \u26037);
                                        if (\u26036 < 0 && !this.a.p(a).c().t().a()) {
                                            continue Label_0464;
                                        }
                                        if (\u26036 >= 0 && !this.a.d(a)) {
                                            continue Label_0464;
                                        }
                                    }
                                }
                            }
                            final double n11 = k + 0.5 - \u2603.t;
                            final double n12 = n6 * n6 + n11 * n11 + n7 * n7;
                            if (n2 < 0.0 || n12 < n2) {
                                n2 = n12;
                                n3 = i;
                                \u26032 = k;
                                n4 = j;
                                n5 = l % 4;
                            }
                        }
                    }
                }
            }
        }
        if (n2 < 0.0) {
            for (int i = c - n; i <= c + n; ++i) {
                final double n6 = i + 0.5 - \u2603.s;
                for (int j = c3 - n; j <= c3 + n; ++j) {
                    final double n7 = j + 0.5 - \u2603.u;
                Label_0839:
                    for (int k = this.a.V() - 1; k >= 0; --k) {
                        if (this.a.d(a.c(i, k, j))) {
                            while (k > 0 && this.a.d(a.c(i, k - 1, j))) {
                                --k;
                            }
                            for (int l = nextInt; l < nextInt + 2; ++l) {
                                final int n8 = l % 2;
                                final int \u26033 = 1 - n8;
                                for (int \u26034 = 0; \u26034 < 4; ++\u26034) {
                                    for (int \u26035 = -1; \u26035 < 4; ++\u26035) {
                                        final int \u26036 = i + (\u26034 - 1) * n8;
                                        final int n9 = k + \u26035;
                                        final int n10 = j + (\u26034 - 1) * \u26033;
                                        a.c(\u26036, n9, n10);
                                        if (\u26035 < 0 && !this.a.p(a).c().t().a()) {
                                            continue Label_0839;
                                        }
                                        if (\u26035 >= 0 && !this.a.d(a)) {
                                            continue Label_0839;
                                        }
                                    }
                                }
                                final double n11 = k + 0.5 - \u2603.t;
                                final double n12 = n6 * n6 + n11 * n11 + n7 * n7;
                                if (n2 < 0.0 || n12 < n2) {
                                    n2 = n12;
                                    n3 = i;
                                    \u26032 = k;
                                    n4 = j;
                                    n5 = l % 2;
                                }
                            }
                        }
                    }
                }
            }
        }
        int i = n5;
        final int n13 = n3;
        int a2 = \u26032;
        int j = n4;
        int n14 = i % 2;
        int n15 = 1 - n14;
        if (i % 4 >= 2) {
            n14 = -n14;
            n15 = -n15;
        }
        if (n2 < 0.0) {
            \u26032 = (a2 = ns.a(\u26032, 70, this.a.V() - 10));
            for (int k = -1; k <= 1; ++k) {
                for (int l = 1; l < 3; ++l) {
                    for (int n8 = -1; n8 < 3; ++n8) {
                        final int \u26033 = n13 + (l - 1) * n14 + k * n15;
                        final int \u26034 = a2 + n8;
                        final int \u26035 = j + (l - 1) * n15 - k * n14;
                        final boolean b = n8 < 0;
                        this.a.a(new cj(\u26033, \u26034, \u26035), b ? afi.Z.Q() : afi.a.Q());
                    }
                }
            }
        }
        final alz a3 = afi.aY.Q().a(aip.a, (n14 != 0) ? cq.a.a : cq.a.c);
        for (int l = 0; l < 4; ++l) {
            for (int n8 = 0; n8 < 4; ++n8) {
                for (int \u26033 = -1; \u26033 < 4; ++\u26033) {
                    final int \u26034 = n13 + (n8 - 1) * n14;
                    final int \u26035 = a2 + \u26033;
                    final int \u26036 = j + (n8 - 1) * n15;
                    final boolean b2 = n8 == 0 || n8 == 3 || \u26033 == -1 || \u26033 == 3;
                    this.a.a(new cj(\u26034, \u26035, \u26036), b2 ? afi.Z.Q() : a3, 2);
                }
            }
            for (int n8 = 0; n8 < 4; ++n8) {
                for (int \u26033 = -1; \u26033 < 4; ++\u26033) {
                    final int \u26034 = n13 + (n8 - 1) * n14;
                    final int \u26035 = a2 + \u26033;
                    final int \u26036 = j + (n8 - 1) * n15;
                    final cj cj = new cj(\u26034, \u26035, \u26036);
                    this.a.c(cj, this.a.p(cj).c());
                }
            }
        }
        return true;
    }
    
    public void a(final long \u2603) {
        if (\u2603 % 100L == 0L) {
            final Iterator<Long> iterator = this.d.iterator();
            final long n = \u2603 - 300L;
            while (iterator.hasNext()) {
                final Long n2 = iterator.next();
                final a a = this.c.a(n2);
                if (a == null || a.c < n) {
                    iterator.remove();
                    this.c.d(n2);
                }
            }
        }
    }
    
    public class a extends cj
    {
        public long c;
        
        public a(final cj \u2603, final long \u2603) {
            super(\u2603.n(), \u2603.o(), \u2603.p());
            this.c = \u2603;
        }
    }
}
