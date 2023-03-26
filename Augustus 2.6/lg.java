// 
// Decompiled by Procyon v0.5.36
// 

public class lg
{
    public adm a;
    public lf b;
    private adp.a c;
    private boolean d;
    private int e;
    private cj f;
    private int g;
    private boolean h;
    private cj i;
    private int j;
    private int k;
    
    public lg(final adm \u2603) {
        this.c = adp.a.a;
        this.f = cj.a;
        this.i = cj.a;
        this.k = -1;
        this.a = \u2603;
    }
    
    public void a(final adp.a \u2603) {
        (this.c = \u2603).a(this.b.bA);
        this.b.t();
        this.b.b.ap().a(new gz(gz.a.b, new lf[] { this.b }));
    }
    
    public adp.a b() {
        return this.c;
    }
    
    public boolean c() {
        return this.c.e();
    }
    
    public boolean d() {
        return this.c.d();
    }
    
    public void b(final adp.a \u2603) {
        if (this.c == adp.a.a) {
            this.c = \u2603;
        }
        this.a(this.c);
    }
    
    public void a() {
        ++this.g;
        if (this.h) {
            final int n = this.g - this.j;
            final afh c = this.a.p(this.i).c();
            if (c.t() == arm.a) {
                this.h = false;
            }
            else {
                final float n2 = c.a(this.b, this.b.o, this.i) * (n + 1);
                final int n3 = (int)(n2 * 10.0f);
                if (n3 != this.k) {
                    this.a.c(this.b.F(), this.i, n3);
                    this.k = n3;
                }
                if (n2 >= 1.0f) {
                    this.h = false;
                    this.b(this.i);
                }
            }
        }
        else if (this.d) {
            final afh c2 = this.a.p(this.f).c();
            if (c2.t() == arm.a) {
                this.a.c(this.b.F(), this.f, -1);
                this.k = -1;
                this.d = false;
            }
            else {
                final int n4 = this.g - this.e;
                final float n2 = c2.a(this.b, this.b.o, this.i) * (n4 + 1);
                final int n3 = (int)(n2 * 10.0f);
                if (n3 != this.k) {
                    this.a.c(this.b.F(), this.f, n3);
                    this.k = n3;
                }
            }
        }
    }
    
    public void a(final cj \u2603, final cq \u2603) {
        if (this.d()) {
            if (!this.a.a(null, \u2603, \u2603)) {
                this.b(\u2603);
            }
            return;
        }
        final afh c = this.a.p(\u2603).c();
        if (this.c.c()) {
            if (this.c == adp.a.e) {
                return;
            }
            if (!this.b.cn()) {
                final zx bz = this.b.bZ();
                if (bz == null) {
                    return;
                }
                if (!bz.c(c)) {
                    return;
                }
            }
        }
        this.a.a(null, \u2603, \u2603);
        this.e = this.g;
        float a = 1.0f;
        if (c.t() != arm.a) {
            c.a(this.a, \u2603, this.b);
            a = c.a(this.b, this.b.o, \u2603);
        }
        if (c.t() != arm.a && a >= 1.0f) {
            this.b(\u2603);
        }
        else {
            this.d = true;
            this.f = \u2603;
            final int n = (int)(a * 10.0f);
            this.a.c(this.b.F(), \u2603, n);
            this.k = n;
        }
    }
    
    public void a(final cj \u2603) {
        if (\u2603.equals(this.f)) {
            final int n = this.g - this.e;
            final afh c = this.a.p(\u2603).c();
            if (c.t() != arm.a) {
                final float n2 = c.a(this.b, this.b.o, \u2603) * (n + 1);
                if (n2 >= 0.7f) {
                    this.d = false;
                    this.a.c(this.b.F(), \u2603, -1);
                    this.b(\u2603);
                }
                else if (!this.h) {
                    this.d = false;
                    this.h = true;
                    this.i = \u2603;
                    this.j = this.e;
                }
            }
        }
    }
    
    public void e() {
        this.d = false;
        this.a.c(this.b.F(), this.f, -1);
    }
    
    private boolean c(final cj \u2603) {
        final alz p = this.a.p(\u2603);
        p.c().a(this.a, \u2603, p, this.b);
        final boolean g = this.a.g(\u2603);
        if (g) {
            p.c().d(this.a, \u2603, p);
        }
        return g;
    }
    
    public boolean b(final cj \u2603) {
        if (this.c.d() && this.b.bA() != null && this.b.bA().b() instanceof aay) {
            return false;
        }
        final alz p = this.a.p(\u2603);
        final akw s = this.a.s(\u2603);
        if (this.c.c()) {
            if (this.c == adp.a.e) {
                return false;
            }
            if (!this.b.cn()) {
                final zx bz = this.b.bZ();
                if (bz == null) {
                    return false;
                }
                if (!bz.c(p.c())) {
                    return false;
                }
            }
        }
        this.a.a(this.b, 2001, \u2603, afh.f(p));
        final boolean c = this.c(\u2603);
        if (this.d()) {
            this.b.a.a(new fv(this.a, \u2603));
        }
        else {
            final zx bz2 = this.b.bZ();
            final boolean b = this.b.b(p.c());
            if (bz2 != null) {
                bz2.a(this.a, p.c(), \u2603, this.b);
                if (bz2.b == 0) {
                    this.b.ca();
                }
            }
            if (c && b) {
                p.c().a(this.a, this.b, \u2603, p, s);
            }
        }
        return c;
    }
    
    public boolean a(final wn \u2603, final adm \u2603, final zx \u2603) {
        if (this.c == adp.a.e) {
            return false;
        }
        final int b = \u2603.b;
        final int i = \u2603.i();
        final zx a = \u2603.a(\u2603, \u2603);
        if (a != \u2603 || (a != null && (a.b != b || a.l() > 0 || a.i() != i))) {
            \u2603.bi.a[\u2603.bi.c] = a;
            if (this.d()) {
                a.b = b;
                if (a.e()) {
                    a.b(i);
                }
            }
            if (a.b == 0) {
                \u2603.bi.a[\u2603.bi.c] = null;
            }
            if (!\u2603.bS()) {
                ((lf)\u2603).a(\u2603.bj);
            }
            return true;
        }
        return false;
    }
    
    public boolean a(final wn \u2603, final adm \u2603, final zx \u2603, final cj \u2603, final cq \u2603, final float \u2603, final float \u2603, final float \u2603) {
        if (this.c == adp.a.e) {
            final akw s = \u2603.s(\u2603);
            if (s instanceof oo) {
                final afh c = \u2603.p(\u2603).c();
                oo f = (oo)s;
                if (f instanceof aky && c instanceof afs) {
                    f = ((afs)c).f(\u2603, \u2603);
                }
                if (f != null) {
                    \u2603.a((og)f);
                    return true;
                }
            }
            else if (s instanceof og) {
                \u2603.a((og)s);
                return true;
            }
            return false;
        }
        if (!\u2603.av() || \u2603.bA() == null) {
            final alz p = \u2603.p(\u2603);
            if (p.c().a(\u2603, \u2603, p, \u2603, \u2603, \u2603, \u2603, \u2603)) {
                return true;
            }
        }
        if (\u2603 == null) {
            return false;
        }
        if (this.d()) {
            final int i = \u2603.i();
            final int b = \u2603.b;
            final boolean a = \u2603.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
            \u2603.b(i);
            \u2603.b = b;
            return a;
        }
        return \u2603.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
    }
    
    public void a(final le \u2603) {
        this.a = \u2603;
    }
}
