// 
// Decompiled by Procyon v0.5.36
// 

public class bda
{
    private final ave a;
    private final bcy b;
    private cj c;
    private zx d;
    private float e;
    private float f;
    private int g;
    private boolean h;
    private adp.a i;
    private int j;
    
    public bda(final ave \u2603, final bcy \u2603) {
        this.c = new cj(-1, -1, -1);
        this.i = adp.a.b;
        this.a = \u2603;
        this.b = \u2603;
    }
    
    public static void a(final ave \u2603, final bda \u2603, final cj \u2603, final cq \u2603) {
        if (!\u2603.f.a(\u2603.h, \u2603, \u2603)) {
            \u2603.a(\u2603, \u2603);
        }
    }
    
    public void a(final wn \u2603) {
        this.i.a(\u2603.bA);
    }
    
    public boolean a() {
        return this.i == adp.a.e;
    }
    
    public void a(final adp.a \u2603) {
        (this.i = \u2603).a(this.a.h.bA);
    }
    
    public void b(final wn \u2603) {
        \u2603.y = -180.0f;
    }
    
    public boolean b() {
        return this.i.e();
    }
    
    public boolean a(final cj \u2603, final cq \u2603) {
        if (this.i.c()) {
            if (this.i == adp.a.e) {
                return false;
            }
            if (!this.a.h.cn()) {
                final afh c = this.a.f.p(\u2603).c();
                final zx bz = this.a.h.bZ();
                if (bz == null) {
                    return false;
                }
                if (!bz.c(c)) {
                    return false;
                }
            }
        }
        if (this.i.d() && this.a.h.bA() != null && this.a.h.bA().b() instanceof aay) {
            return false;
        }
        final adm f = this.a.f;
        final alz p = f.p(\u2603);
        final afh c2 = p.c();
        if (c2.t() == arm.a) {
            return false;
        }
        f.b(2001, \u2603, afh.f(p));
        final boolean g = f.g(\u2603);
        if (g) {
            c2.d(f, \u2603, p);
        }
        this.c = new cj(this.c.n(), -1, this.c.p());
        if (!this.i.d()) {
            final zx bz2 = this.a.h.bZ();
            if (bz2 != null) {
                bz2.a(f, c2, \u2603, this.a.h);
                if (bz2.b == 0) {
                    this.a.h.ca();
                }
            }
        }
        return g;
    }
    
    public boolean b(final cj \u2603, final cq \u2603) {
        if (this.i.c()) {
            if (this.i == adp.a.e) {
                return false;
            }
            if (!this.a.h.cn()) {
                final afh \u26032 = this.a.f.p(\u2603).c();
                final zx bz = this.a.h.bZ();
                if (bz == null) {
                    return false;
                }
                if (!bz.c(\u26032)) {
                    return false;
                }
            }
        }
        if (!this.a.f.af().a(\u2603)) {
            return false;
        }
        if (this.i.d()) {
            this.b.a(new ir(ir.a.a, \u2603, \u2603));
            a(this.a, this, \u2603, \u2603);
            this.g = 5;
        }
        else if (!this.h || !this.a(\u2603)) {
            if (this.h) {
                this.b.a(new ir(ir.a.b, this.c, \u2603));
            }
            this.b.a(new ir(ir.a.a, \u2603, \u2603));
            final afh \u26032 = this.a.f.p(\u2603).c();
            final boolean b = \u26032.t() != arm.a;
            if (b && this.e == 0.0f) {
                \u26032.a(this.a.f, \u2603, this.a.h);
            }
            if (b && \u26032.a(this.a.h, this.a.h.o, \u2603) >= 1.0f) {
                this.a(\u2603, \u2603);
            }
            else {
                this.h = true;
                this.c = \u2603;
                this.d = this.a.h.bA();
                this.e = 0.0f;
                this.f = 0.0f;
                this.a.f.c(this.a.h.F(), this.c, (int)(this.e * 10.0f) - 1);
            }
        }
        return true;
    }
    
    public void c() {
        if (this.h) {
            this.b.a(new ir(ir.a.b, this.c, cq.a));
            this.h = false;
            this.e = 0.0f;
            this.a.f.c(this.a.h.F(), this.c, -1);
        }
    }
    
    public boolean c(final cj \u2603, final cq \u2603) {
        this.n();
        if (this.g > 0) {
            --this.g;
            return true;
        }
        if (this.i.d() && this.a.f.af().a(\u2603)) {
            this.g = 5;
            this.b.a(new ir(ir.a.a, \u2603, \u2603));
            a(this.a, this, \u2603, \u2603);
            return true;
        }
        if (!this.a(\u2603)) {
            return this.b(\u2603, \u2603);
        }
        final afh c = this.a.f.p(\u2603).c();
        if (c.t() == arm.a) {
            return this.h = false;
        }
        this.e += c.a(this.a.h, this.a.h.o, \u2603);
        if (this.f % 4.0f == 0.0f) {
            this.a.W().a(new bpf(new jy(c.H.c()), (c.H.d() + 1.0f) / 8.0f, c.H.e() * 0.5f, \u2603.n() + 0.5f, \u2603.o() + 0.5f, \u2603.p() + 0.5f));
        }
        ++this.f;
        if (this.e >= 1.0f) {
            this.h = false;
            this.b.a(new ir(ir.a.c, \u2603, \u2603));
            this.a(\u2603, \u2603);
            this.e = 0.0f;
            this.f = 0.0f;
            this.g = 5;
        }
        this.a.f.c(this.a.h.F(), this.c, (int)(this.e * 10.0f) - 1);
        return true;
    }
    
    public float d() {
        if (this.i.d()) {
            return 5.0f;
        }
        return 4.5f;
    }
    
    public void e() {
        this.n();
        if (this.b.a().g()) {
            this.b.a().a();
        }
        else {
            this.b.a().l();
        }
    }
    
    private boolean a(final cj \u2603) {
        final zx ba = this.a.h.bA();
        boolean b = this.d == null && ba == null;
        if (this.d != null && ba != null) {
            b = (ba.b() == this.d.b() && zx.a(ba, this.d) && (ba.e() || ba.i() == this.d.i()));
        }
        return \u2603.equals(this.c) && b;
    }
    
    private void n() {
        final int c = this.a.h.bi.c;
        if (c != this.j) {
            this.j = c;
            this.b.a(new iv(this.j));
        }
    }
    
    public boolean a(final bew \u2603, final bdb \u2603, final zx \u2603, final cj \u2603, final cq \u2603, final aui \u2603) {
        this.n();
        final float n = (float)(\u2603.a - \u2603.n());
        final float n2 = (float)(\u2603.b - \u2603.o());
        final float n3 = (float)(\u2603.c - \u2603.p());
        boolean b = false;
        if (!this.a.f.af().a(\u2603)) {
            return false;
        }
        if (this.i != adp.a.e) {
            final alz p = \u2603.p(\u2603);
            if ((!\u2603.av() || \u2603.bA() == null) && p.c().a(\u2603, \u2603, p, \u2603, \u2603, n, n2, n3)) {
                b = true;
            }
            if (!b && \u2603 != null && \u2603.b() instanceof yo) {
                final yo yo = (yo)\u2603.b();
                if (!yo.a(\u2603, \u2603, \u2603, \u2603, \u2603)) {
                    return false;
                }
            }
        }
        this.b.a(new ja(\u2603, \u2603.a(), \u2603.bi.h(), n, n2, n3));
        if (b || this.i == adp.a.e) {
            return true;
        }
        if (\u2603 == null) {
            return false;
        }
        if (this.i.d()) {
            final int i = \u2603.i();
            final int b2 = \u2603.b;
            final boolean a = \u2603.a(\u2603, \u2603, \u2603, \u2603, n, n2, n3);
            \u2603.b(i);
            \u2603.b = b2;
            return a;
        }
        return \u2603.a(\u2603, \u2603, \u2603, \u2603, n, n2, n3);
    }
    
    public boolean a(final wn \u2603, final adm \u2603, final zx \u2603) {
        if (this.i == adp.a.e) {
            return false;
        }
        this.n();
        this.b.a(new ja(\u2603.bi.h()));
        final int b = \u2603.b;
        final zx a = \u2603.a(\u2603, \u2603);
        if (a != \u2603 || (a != null && a.b != b)) {
            \u2603.bi.a[\u2603.bi.c] = a;
            if (a.b == 0) {
                \u2603.bi.a[\u2603.bi.c] = null;
            }
            return true;
        }
        return false;
    }
    
    public bew a(final adm \u2603, final nb \u2603) {
        return new bew(this.a, \u2603, this.b, \u2603);
    }
    
    public void a(final wn \u2603, final pk \u2603) {
        this.n();
        this.b.a(new in(\u2603, in.a.b));
        if (this.i != adp.a.e) {
            \u2603.f(\u2603);
        }
    }
    
    public boolean b(final wn \u2603, final pk \u2603) {
        this.n();
        this.b.a(new in(\u2603, in.a.a));
        return this.i != adp.a.e && \u2603.u(\u2603);
    }
    
    public boolean a(final wn \u2603, final pk \u2603, final auh \u2603) {
        this.n();
        final aui aui = new aui(\u2603.c.a - \u2603.s, \u2603.c.b - \u2603.t, \u2603.c.c - \u2603.u);
        this.b.a(new in(\u2603, aui));
        return this.i != adp.a.e && \u2603.a(\u2603, aui);
    }
    
    public zx a(final int \u2603, final int \u2603, final int \u2603, final int \u2603, final wn \u2603) {
        final short a = \u2603.bk.a(\u2603.bi);
        final zx a2 = \u2603.bk.a(\u2603, \u2603, \u2603, \u2603);
        this.b.a(new ik(\u2603, \u2603, \u2603, \u2603, a2, a));
        return a2;
    }
    
    public void a(final int \u2603, final int \u2603) {
        this.b.a(new ij(\u2603, \u2603));
    }
    
    public void a(final zx \u2603, final int \u2603) {
        if (this.i.d()) {
            this.b.a(new iw(\u2603, \u2603));
        }
    }
    
    public void a(final zx \u2603) {
        if (this.i.d() && \u2603 != null) {
            this.b.a(new iw(-1, \u2603));
        }
    }
    
    public void c(final wn \u2603) {
        this.n();
        this.b.a(new ir(ir.a.f, cj.a, cq.a));
        \u2603.bU();
    }
    
    public boolean f() {
        return this.i.e();
    }
    
    public boolean g() {
        return !this.i.d();
    }
    
    public boolean h() {
        return this.i.d();
    }
    
    public boolean i() {
        return this.i.d();
    }
    
    public boolean j() {
        return this.a.h.au() && this.a.h.m instanceof tp;
    }
    
    public boolean k() {
        return this.i == adp.a.e;
    }
    
    public adp.a l() {
        return this.i;
    }
    
    public boolean m() {
        return this.h;
    }
}
