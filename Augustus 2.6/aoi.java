import java.util.Iterator;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public class aoi extends aoh
{
    private Random k;
    private adm l;
    private cj m;
    int a;
    int b;
    double c;
    double d;
    double e;
    double f;
    int g;
    int h;
    int i;
    List<a> j;
    
    public aoi(final boolean \u2603) {
        super(\u2603);
        this.m = cj.a;
        this.c = 0.618;
        this.d = 0.381;
        this.e = 1.0;
        this.f = 1.0;
        this.g = 1;
        this.h = 12;
        this.i = 4;
    }
    
    void a() {
        this.b = (int)(this.a * this.c);
        if (this.b >= this.a) {
            this.b = this.a - 1;
        }
        int n = (int)(1.382 + Math.pow(this.f * this.a / 13.0, 2.0));
        if (n < 1) {
            n = 1;
        }
        final int \u2603 = this.m.o() + this.b;
        int i = this.a - this.i;
        (this.j = (List<a>)Lists.newArrayList()).add(new a(this.m.b(i), \u2603));
        while (i >= 0) {
            final float a = this.a(i);
            if (a >= 0.0f) {
                for (int j = 0; j < n; ++j) {
                    final double n2 = this.e * a * (this.k.nextFloat() + 0.328);
                    final double n3 = this.k.nextFloat() * 2.0f * 3.141592653589793;
                    final double \u26032 = n2 * Math.sin(n3) + 0.5;
                    final double \u26033 = n2 * Math.cos(n3) + 0.5;
                    final cj a2 = this.m.a(\u26032, i - 1, \u26033);
                    final cj b = a2.b(this.i);
                    if (this.a(a2, b) == -1) {
                        final int n4 = this.m.n() - a2.n();
                        final int n5 = this.m.p() - a2.p();
                        final double n6 = a2.o() - Math.sqrt(n4 * n4 + n5 * n5) * this.d;
                        final int \u26034 = (n6 > \u2603) ? \u2603 : ((int)n6);
                        final cj \u26035 = new cj(this.m.n(), \u26034, this.m.p());
                        if (this.a(\u26035, a2) == -1) {
                            this.j.add(new a(a2, \u26035.o()));
                        }
                    }
                }
            }
            --i;
        }
    }
    
    void a(final cj \u2603, final float \u2603, final alz \u2603) {
        for (int n = (int)(\u2603 + 0.618), i = -n; i <= n; ++i) {
            for (int j = -n; j <= n; ++j) {
                if (Math.pow(Math.abs(i) + 0.5, 2.0) + Math.pow(Math.abs(j) + 0.5, 2.0) <= \u2603 * \u2603) {
                    final cj a = \u2603.a(i, 0, j);
                    final arm t = this.l.p(a).c().t();
                    if (t == arm.a || t == arm.j) {
                        this.a(this.l, a, \u2603);
                    }
                }
            }
        }
    }
    
    float a(final int \u2603) {
        if (\u2603 < this.a * 0.3f) {
            return -1.0f;
        }
        final float n = this.a / 2.0f;
        final float a = n - \u2603;
        float c = ns.c(n * n - a * a);
        if (a == 0.0f) {
            c = n;
        }
        else if (Math.abs(a) >= n) {
            return 0.0f;
        }
        return c * 0.5f;
    }
    
    float b(final int \u2603) {
        if (\u2603 < 0 || \u2603 >= this.i) {
            return -1.0f;
        }
        if (\u2603 == 0 || \u2603 == this.i - 1) {
            return 2.0f;
        }
        return 3.0f;
    }
    
    void a(final cj \u2603) {
        for (int i = 0; i < this.i; ++i) {
            this.a(\u2603.b(i), this.b(i), afi.t.Q().a((amo<Comparable>)ahs.b, false));
        }
    }
    
    void a(final cj \u2603, final cj \u2603, final afh \u2603) {
        final cj a = \u2603.a(-\u2603.n(), -\u2603.o(), -\u2603.p());
        final int b = this.b(a);
        final float n = a.n() / (float)b;
        final float n2 = a.o() / (float)b;
        final float n3 = a.p() / (float)b;
        for (int i = 0; i <= b; ++i) {
            final cj a2 = \u2603.a(0.5f + i * n, 0.5f + i * n2, 0.5f + i * n3);
            final ahw.a b2 = this.b(\u2603, a2);
            this.a(this.l, a2, \u2603.Q().a(ahw.a, b2));
        }
    }
    
    private int b(final cj \u2603) {
        final int a = ns.a(\u2603.n());
        final int a2 = ns.a(\u2603.o());
        final int a3 = ns.a(\u2603.p());
        if (a3 > a && a3 > a2) {
            return a3;
        }
        if (a2 > a) {
            return a2;
        }
        return a;
    }
    
    private ahw.a b(final cj \u2603, final cj \u2603) {
        ahw.a a = ahw.a.b;
        final int abs = Math.abs(\u2603.n() - \u2603.n());
        final int abs2 = Math.abs(\u2603.p() - \u2603.p());
        final int max = Math.max(abs, abs2);
        if (max > 0) {
            if (abs == max) {
                a = ahw.a.a;
            }
            else if (abs2 == max) {
                a = ahw.a.c;
            }
        }
        return a;
    }
    
    void b() {
        for (final a \u2603 : this.j) {
            this.a(\u2603);
        }
    }
    
    boolean c(final int \u2603) {
        return \u2603 >= this.a * 0.2;
    }
    
    void c() {
        final cj m = this.m;
        final cj b = this.m.b(this.b);
        final afh r = afi.r;
        this.a(m, b, r);
        if (this.g == 2) {
            this.a(m.f(), b.f(), r);
            this.a(m.f().d(), b.f().d(), r);
            this.a(m.d(), b.d(), r);
        }
    }
    
    void d() {
        for (final a a : this.j) {
            final int q = a.q();
            final cj \u2603 = new cj(this.m.n(), q, this.m.p());
            if (!\u2603.equals(a) && this.c(q - this.m.o())) {
                this.a(\u2603, a, afi.r);
            }
        }
    }
    
    int a(final cj \u2603, final cj \u2603) {
        final cj a = \u2603.a(-\u2603.n(), -\u2603.o(), -\u2603.p());
        final int b = this.b(a);
        final float n = a.n() / (float)b;
        final float n2 = a.o() / (float)b;
        final float n3 = a.p() / (float)b;
        if (b == 0) {
            return -1;
        }
        for (int i = 0; i <= b; ++i) {
            final cj a2 = \u2603.a(0.5f + i * n, 0.5f + i * n2, 0.5f + i * n3);
            if (!this.a(this.l.p(a2).c())) {
                return i;
            }
        }
        return -1;
    }
    
    @Override
    public void e() {
        this.i = 5;
    }
    
    @Override
    public boolean b(final adm \u2603, final Random \u2603, final cj \u2603) {
        this.l = \u2603;
        this.m = \u2603;
        this.k = new Random(\u2603.nextLong());
        if (this.a == 0) {
            this.a = 5 + this.k.nextInt(this.h);
        }
        if (!this.f()) {
            return false;
        }
        this.a();
        this.b();
        this.c();
        this.d();
        return true;
    }
    
    private boolean f() {
        final afh c = this.l.p(this.m.b()).c();
        if (c != afi.d && c != afi.c && c != afi.ak) {
            return false;
        }
        final int a = this.a(this.m, this.m.b(this.a - 1));
        if (a == -1) {
            return true;
        }
        if (a < 6) {
            return false;
        }
        this.a = a;
        return true;
    }
    
    static class a extends cj
    {
        private final int c;
        
        public a(final cj \u2603, final int \u2603) {
            super(\u2603.n(), \u2603.o(), \u2603.p());
            this.c = \u2603;
        }
        
        public int q() {
            return this.c;
        }
    }
}
