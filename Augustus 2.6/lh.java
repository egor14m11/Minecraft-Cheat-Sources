import org.apache.logging.log4j.LogManager;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import com.google.common.collect.Sets;
import java.util.Set;
import org.apache.logging.log4j.Logger;

// 
// Decompiled by Procyon v0.5.36
// 

public class lh
{
    private static final Logger p;
    public pk a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public double j;
    public double k;
    public double l;
    public int m;
    private double q;
    private double r;
    private double s;
    private boolean t;
    private boolean u;
    private int v;
    private pk w;
    private boolean x;
    private boolean y;
    public boolean n;
    public Set<lf> o;
    
    public lh(final pk \u2603, final int \u2603, final int \u2603, final boolean \u2603) {
        this.o = (Set<lf>)Sets.newHashSet();
        this.a = \u2603;
        this.b = \u2603;
        this.c = \u2603;
        this.u = \u2603;
        this.d = ns.c(\u2603.s * 32.0);
        this.e = ns.c(\u2603.t * 32.0);
        this.f = ns.c(\u2603.u * 32.0);
        this.g = ns.d(\u2603.y * 256.0f / 360.0f);
        this.h = ns.d(\u2603.z * 256.0f / 360.0f);
        this.i = ns.d(\u2603.aC() * 256.0f / 360.0f);
        this.y = \u2603.C;
    }
    
    @Override
    public boolean equals(final Object \u2603) {
        return \u2603 instanceof lh && ((lh)\u2603).a.F() == this.a.F();
    }
    
    @Override
    public int hashCode() {
        return this.a.F();
    }
    
    public void a(final List<wn> \u2603) {
        this.n = false;
        if (!this.t || this.a.e(this.q, this.r, this.s) > 16.0) {
            this.q = this.a.s;
            this.r = this.a.t;
            this.s = this.a.u;
            this.t = true;
            this.n = true;
            this.b(\u2603);
        }
        if (this.w != this.a.m || (this.a.m != null && this.m % 60 == 0)) {
            this.w = this.a.m;
            this.a(new hl(0, this.a, this.a.m));
        }
        if (this.a instanceof uo && this.m % 10 == 0) {
            final uo uo = (uo)this.a;
            final zx o = uo.o();
            if (o != null && o.b() instanceof aab) {
                final atg a = zy.bd.a(o, this.a.o);
                for (final wn wn : \u2603) {
                    final lf lf = (lf)wn;
                    a.a(lf, o);
                    final ff c = zy.bd.c(o, this.a.o, lf);
                    if (c != null) {
                        lf.a.a(c);
                    }
                }
            }
            this.b();
        }
        if (this.m % this.c == 0 || this.a.ai || this.a.H().a()) {
            if (this.a.m == null) {
                ++this.v;
                final int n = ns.c(this.a.s * 32.0);
                final int h = ns.c(this.a.t * 32.0);
                final int c2 = ns.c(this.a.u * 32.0);
                final int d = ns.d(this.a.y * 256.0f / 360.0f);
                final int d2 = ns.d(this.a.z * 256.0f / 360.0f);
                final int a2 = n - this.d;
                final int a3 = h - this.e;
                final int a4 = c2 - this.f;
                ff \u26032 = null;
                final boolean b = Math.abs(a2) >= 4 || Math.abs(a3) >= 4 || Math.abs(a4) >= 4 || this.m % 60 == 0;
                final boolean b2 = Math.abs(d - this.g) >= 4 || Math.abs(d2 - this.h) >= 4;
                if (this.m > 0 || this.a instanceof wq) {
                    if (a2 < -128 || a2 >= 128 || a3 < -128 || a3 >= 128 || a4 < -128 || a4 >= 128 || this.v > 400 || this.x || this.y != this.a.C) {
                        this.y = this.a.C;
                        this.v = 0;
                        \u26032 = new hz(this.a.F(), n, h, c2, (byte)d, (byte)d2, this.a.C);
                    }
                    else if ((b && b2) || this.a instanceof wq) {
                        \u26032 = new gv.b(this.a.F(), (byte)a2, (byte)a3, (byte)a4, (byte)d, (byte)d2, this.a.C);
                    }
                    else if (b) {
                        \u26032 = new gv.a(this.a.F(), (byte)a2, (byte)a3, (byte)a4, this.a.C);
                    }
                    else if (b2) {
                        \u26032 = new gv.c(this.a.F(), (byte)d, (byte)d2, this.a.C);
                    }
                }
                if (this.u) {
                    final double n2 = this.a.v - this.j;
                    final double n3 = this.a.w - this.k;
                    final double n4 = this.a.x - this.l;
                    final double n5 = 0.02;
                    final double n6 = n2 * n2 + n3 * n3 + n4 * n4;
                    if (n6 > n5 * n5 || (n6 > 0.0 && this.a.v == 0.0 && this.a.w == 0.0 && this.a.x == 0.0)) {
                        this.j = this.a.v;
                        this.k = this.a.w;
                        this.l = this.a.x;
                        this.a(new hm(this.a.F(), this.j, this.k, this.l));
                    }
                }
                if (\u26032 != null) {
                    this.a(\u26032);
                }
                this.b();
                if (b) {
                    this.d = n;
                    this.e = h;
                    this.f = c2;
                }
                if (b2) {
                    this.g = d;
                    this.h = d2;
                }
                this.x = false;
            }
            else {
                final int n = ns.d(this.a.y * 256.0f / 360.0f);
                final int h = ns.d(this.a.z * 256.0f / 360.0f);
                final boolean b3 = Math.abs(n - this.g) >= 4 || Math.abs(h - this.h) >= 4;
                if (b3) {
                    this.a(new gv.c(this.a.F(), (byte)n, (byte)h, this.a.C));
                    this.g = n;
                    this.h = h;
                }
                this.d = ns.c(this.a.s * 32.0);
                this.e = ns.c(this.a.t * 32.0);
                this.f = ns.c(this.a.u * 32.0);
                this.b();
                this.x = true;
            }
            final int n = ns.d(this.a.aC() * 256.0f / 360.0f);
            if (Math.abs(n - this.i) >= 4) {
                this.a(new hf(this.a, (byte)n));
                this.i = n;
            }
            this.a.ai = false;
        }
        ++this.m;
        if (this.a.G) {
            this.b(new hm(this.a));
            this.a.G = false;
        }
    }
    
    private void b() {
        final pz h = this.a.H();
        if (h.a()) {
            this.b(new hk(this.a.F(), h, false));
        }
        if (this.a instanceof pr) {
            final qi qi = (qi)((pr)this.a).by();
            final Set<qc> b = qi.b();
            if (!b.isEmpty()) {
                this.b(new ia(this.a.F(), b));
            }
            b.clear();
        }
    }
    
    public void a(final ff \u2603) {
        for (final lf lf : this.o) {
            lf.a.a(\u2603);
        }
    }
    
    public void b(final ff \u2603) {
        this.a(\u2603);
        if (this.a instanceof lf) {
            ((lf)this.a).a.a(\u2603);
        }
    }
    
    public void a() {
        for (final lf lf : this.o) {
            lf.d(this.a);
        }
    }
    
    public void a(final lf \u2603) {
        if (this.o.contains(\u2603)) {
            \u2603.d(this.a);
            this.o.remove(\u2603);
        }
    }
    
    public void b(final lf \u2603) {
        if (\u2603 == this.a) {
            return;
        }
        if (this.c(\u2603)) {
            if (!this.o.contains(\u2603) && (this.e(\u2603) || this.a.n)) {
                this.o.add(\u2603);
                final ff c = this.c();
                \u2603.a.a(c);
                if (!this.a.H().d()) {
                    \u2603.a.a(new hk(this.a.F(), this.a.H(), true));
                }
                final dn av = this.a.aV();
                if (av != null) {
                    \u2603.a.a(new gj(this.a.F(), av));
                }
                if (this.a instanceof pr) {
                    final qi qi = (qi)((pr)this.a).by();
                    final Collection<qc> c2 = qi.c();
                    if (!c2.isEmpty()) {
                        \u2603.a.a(new ia(this.a.F(), c2));
                    }
                }
                this.j = this.a.v;
                this.k = this.a.w;
                this.l = this.a.x;
                if (this.u && !(c instanceof fn)) {
                    \u2603.a.a(new hm(this.a.F(), this.a.v, this.a.w, this.a.x));
                }
                if (this.a.m != null) {
                    \u2603.a.a(new hl(0, this.a, this.a.m));
                }
                if (this.a instanceof ps && ((ps)this.a).cd() != null) {
                    \u2603.a.a(new hl(1, this.a, ((ps)this.a).cd()));
                }
                if (this.a instanceof pr) {
                    for (int i = 0; i < 5; ++i) {
                        final zx p = ((pr)this.a).p(i);
                        if (p != null) {
                            \u2603.a.a(new hn(this.a.F(), i, p));
                        }
                    }
                }
                if (this.a instanceof wn) {
                    final wn \u26032 = (wn)this.a;
                    if (\u26032.bJ()) {
                        \u2603.a.a(new ha(\u26032, new cj(this.a)));
                    }
                }
                if (this.a instanceof pr) {
                    final pr pr = (pr)this.a;
                    for (final pf \u26033 : pr.bl()) {
                        \u2603.a.a(new ib(this.a.F(), \u26033));
                    }
                }
            }
        }
        else if (this.o.contains(\u2603)) {
            this.o.remove(\u2603);
            \u2603.d(this.a);
        }
    }
    
    public boolean c(final lf \u2603) {
        final double n = \u2603.s - this.d / 32;
        final double n2 = \u2603.u - this.f / 32;
        return n >= -this.b && n <= this.b && n2 >= -this.b && n2 <= this.b && this.a.a(\u2603);
    }
    
    private boolean e(final lf \u2603) {
        return \u2603.u().t().a(\u2603, this.a.ae, this.a.ag);
    }
    
    public void b(final List<wn> \u2603) {
        for (int i = 0; i < \u2603.size(); ++i) {
            this.b(\u2603.get(i));
        }
    }
    
    private ff c() {
        if (this.a.I) {
            lh.p.warn("Fetching addPacket for removed entity");
        }
        if (this.a instanceof uz) {
            return new fk(this.a, 2, 1);
        }
        if (this.a instanceof lf) {
            return new fp((wn)this.a);
        }
        if (this.a instanceof va) {
            final va va = (va)this.a;
            return new fk(this.a, 10, va.s().a());
        }
        if (this.a instanceof ux) {
            return new fk(this.a, 1);
        }
        if (this.a instanceof pi) {
            this.i = ns.d(this.a.aC() * 256.0f / 360.0f);
            return new fn((pr)this.a);
        }
        if (this.a instanceof ur) {
            final pk pk = ((ur)this.a).b;
            return new fk(this.a, 90, (pk != null) ? pk.F() : this.a.F());
        }
        if (this.a instanceof wq) {
            final pk pk = ((wq)this.a).c;
            return new fk(this.a, 60, (pk != null) ? pk.F() : this.a.F());
        }
        if (this.a instanceof wx) {
            return new fk(this.a, 61);
        }
        if (this.a instanceof xc) {
            return new fk(this.a, 73, ((xc)this.a).o());
        }
        if (this.a instanceof xb) {
            return new fk(this.a, 75);
        }
        if (this.a instanceof xa) {
            return new fk(this.a, 65);
        }
        if (this.a instanceof wr) {
            return new fk(this.a, 72);
        }
        if (this.a instanceof wt) {
            return new fk(this.a, 76);
        }
        if (this.a instanceof ws) {
            final ws ws = (ws)this.a;
            fk fk = null;
            int n = 63;
            if (this.a instanceof ww) {
                n = 64;
            }
            else if (this.a instanceof xd) {
                n = 66;
            }
            if (ws.a != null) {
                fk = new fk(this.a, n, ((ws)this.a).a.F());
            }
            else {
                fk = new fk(this.a, n, 0);
            }
            fk.d((int)(ws.b * 8000.0));
            fk.e((int)(ws.c * 8000.0));
            fk.f((int)(ws.d * 8000.0));
            return fk;
        }
        if (this.a instanceof wz) {
            return new fk(this.a, 62);
        }
        if (this.a instanceof vj) {
            return new fk(this.a, 50);
        }
        if (this.a instanceof uf) {
            return new fk(this.a, 51);
        }
        if (this.a instanceof uy) {
            final uy uy = (uy)this.a;
            return new fk(this.a, 70, afh.f(uy.l()));
        }
        if (this.a instanceof um) {
            return new fk(this.a, 78);
        }
        if (this.a instanceof uq) {
            return new fo((uq)this.a);
        }
        if (this.a instanceof uo) {
            final uo uo = (uo)this.a;
            final fk fk = new fk(this.a, 71, uo.b.b());
            final cj cj = uo.n();
            fk.a(ns.d((float)(cj.n() * 32)));
            fk.b(ns.d((float)(cj.o() * 32)));
            fk.c(ns.d((float)(cj.p() * 32)));
            return fk;
        }
        if (this.a instanceof up) {
            final up up = (up)this.a;
            final fk fk = new fk(this.a, 77);
            final cj cj = up.n();
            fk.a(ns.d((float)(cj.n() * 32)));
            fk.b(ns.d((float)(cj.o() * 32)));
            fk.c(ns.d((float)(cj.p() * 32)));
            return fk;
        }
        if (this.a instanceof pp) {
            return new fl((pp)this.a);
        }
        throw new IllegalArgumentException("Don't know how to add " + this.a.getClass() + "!");
    }
    
    public void d(final lf \u2603) {
        if (this.o.contains(\u2603)) {
            this.o.remove(\u2603);
            \u2603.d(this.a);
        }
    }
    
    static {
        p = LogManager.getLogger();
    }
}
