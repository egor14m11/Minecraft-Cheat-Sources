import org.lwjgl.input.Keyboard;
import java.util.Iterator;
import com.google.common.collect.Sets;
import java.util.Set;

// 
// Decompiled by Procyon v0.5.36
// 

public abstract class ayl extends axu
{
    protected static final jy a;
    protected int f;
    protected int g;
    public xi h;
    protected int i;
    protected int r;
    private yg u;
    private yg v;
    private boolean w;
    private zx x;
    private int y;
    private int z;
    private yg A;
    private long B;
    private zx C;
    private yg D;
    private long E;
    protected final Set<yg> s;
    protected boolean t;
    private int F;
    private int G;
    private boolean H;
    private int I;
    private long J;
    private yg K;
    private int L;
    private boolean M;
    private zx N;
    
    public ayl(final xi \u2603) {
        this.f = 176;
        this.g = 166;
        this.s = (Set<yg>)Sets.newHashSet();
        this.h = \u2603;
        this.H = true;
    }
    
    @Override
    public void b() {
        super.b();
        this.j.h.bk = this.h;
        this.i = (this.l - this.f) / 2;
        this.r = (this.m - this.g) / 2;
    }
    
    @Override
    public void a(final int \u2603, final int \u2603, final float \u2603) {
        this.c();
        final int i = this.i;
        final int r = this.r;
        this.a(\u2603, \u2603, \u2603);
        bfl.C();
        avc.a();
        bfl.f();
        bfl.i();
        super.a(\u2603, \u2603, \u2603);
        avc.c();
        bfl.E();
        bfl.b((float)i, (float)r, 0.0f);
        bfl.c(1.0f, 1.0f, 1.0f, 1.0f);
        bfl.B();
        this.u = null;
        final int n = 240;
        final int n2 = 240;
        bqs.a(bqs.r, n / 1.0f, n2 / 1.0f);
        bfl.c(1.0f, 1.0f, 1.0f, 1.0f);
        for (int j = 0; j < this.h.c.size(); ++j) {
            final yg u = this.h.c.get(j);
            this.a(u);
            if (this.a(u, \u2603, \u2603) && u.b()) {
                this.u = u;
                bfl.f();
                bfl.i();
                final int f = u.f;
                final int g = u.g;
                bfl.a(true, true, true, false);
                this.a(f, g, f + 16, g + 16, -2130706433, -2130706433);
                bfl.a(true, true, true, true);
                bfl.e();
                bfl.j();
            }
        }
        avc.a();
        this.b(\u2603, \u2603);
        avc.c();
        final wm bi = this.j.h.bi;
        zx \u26032 = (this.x == null) ? bi.p() : this.x;
        if (\u26032 != null) {
            final int f = 8;
            final int g = (this.x == null) ? 8 : 16;
            String string = null;
            if (this.x != null && this.w) {
                \u26032 = \u26032.k();
                \u26032.b = ns.f(\u26032.b / 2.0f);
            }
            else if (this.t && this.s.size() > 1) {
                \u26032 = \u26032.k();
                \u26032.b = this.I;
                if (\u26032.b == 0) {
                    string = "" + a.o + "0";
                }
            }
            this.a(\u26032, \u2603 - i - f, \u2603 - r - g, string);
        }
        if (this.C != null) {
            float n3 = (ave.J() - this.B) / 100.0f;
            if (n3 >= 1.0f) {
                n3 = 1.0f;
                this.C = null;
            }
            final int g = this.A.f - this.y;
            final int n4 = this.A.g - this.z;
            final int \u26033 = this.y + (int)(g * n3);
            final int \u26034 = this.z + (int)(n4 * n3);
            this.a(this.C, \u26033, \u26034, null);
        }
        bfl.F();
        if (bi.p() == null && this.u != null && this.u.e()) {
            final zx d = this.u.d();
            this.a(d, \u2603, \u2603);
        }
        bfl.e();
        bfl.j();
        avc.b();
    }
    
    private void a(final zx \u2603, final int \u2603, final int \u2603, final String \u2603) {
        bfl.b(0.0f, 0.0f, 32.0f);
        this.e = 200.0f;
        this.k.a = 200.0f;
        this.k.b(\u2603, \u2603, \u2603);
        this.k.a(this.q, \u2603, \u2603, \u2603 - ((this.x == null) ? 0 : 8), \u2603);
        this.e = 0.0f;
        this.k.a = 0.0f;
    }
    
    protected void b(final int \u2603, final int \u2603) {
    }
    
    protected abstract void a(final float p0, final int p1, final int p2);
    
    private void a(final yg \u2603) {
        final int f = \u2603.f;
        final int g = \u2603.g;
        zx zx = \u2603.d();
        boolean b = false;
        boolean b2 = \u2603 == this.v && this.x != null && !this.w;
        final zx p = this.j.h.bi.p();
        String \u26032 = null;
        if (\u2603 == this.v && this.x != null && this.w && zx != null) {
            final zx k;
            zx = (k = zx.k());
            k.b /= 2;
        }
        else if (this.t && this.s.contains(\u2603) && p != null) {
            if (this.s.size() == 1) {
                return;
            }
            if (xi.a(\u2603, p, true) && this.h.b(\u2603)) {
                zx = p.k();
                b = true;
                xi.a(this.s, this.F, zx, (\u2603.d() == null) ? 0 : \u2603.d().b);
                if (zx.b > zx.c()) {
                    \u26032 = a.o + "" + zx.c();
                    zx.b = zx.c();
                }
                if (zx.b > \u2603.b(zx)) {
                    \u26032 = a.o + "" + \u2603.b(zx);
                    zx.b = \u2603.b(zx);
                }
            }
            else {
                this.s.remove(\u2603);
                this.a();
            }
        }
        this.e = 100.0f;
        this.k.a = 100.0f;
        if (zx == null) {
            final String c = \u2603.c();
            if (c != null) {
                final bmi a = this.j.T().a(c);
                bfl.f();
                this.j.P().a(bmh.g);
                this.a(f, g, a, 16, 16);
                bfl.e();
                b2 = true;
            }
        }
        if (!b2) {
            if (b) {
                avp.a(f, g, f + 16, g + 16, -2130706433);
            }
            bfl.j();
            this.k.b(zx, f, g);
            this.k.a(this.q, zx, f, g, \u26032);
        }
        this.k.a = 0.0f;
        this.e = 0.0f;
    }
    
    private void a() {
        final zx p = this.j.h.bi.p();
        if (p == null || !this.t) {
            return;
        }
        this.I = p.b;
        for (final yg yg : this.s) {
            final zx k = p.k();
            final int \u2603 = (yg.d() == null) ? 0 : yg.d().b;
            xi.a(this.s, this.F, k, \u2603);
            if (k.b > k.c()) {
                k.b = k.c();
            }
            if (k.b > yg.b(k)) {
                k.b = yg.b(k);
            }
            this.I -= k.b - \u2603;
        }
    }
    
    private yg c(final int \u2603, final int \u2603) {
        for (int i = 0; i < this.h.c.size(); ++i) {
            final yg \u26032 = this.h.c.get(i);
            if (this.a(\u26032, \u2603, \u2603)) {
                return \u26032;
            }
        }
        return null;
    }
    
    @Override
    protected void a(final int \u2603, final int \u2603, final int \u2603) {
        super.a(\u2603, \u2603, \u2603);
        final boolean b = \u2603 == this.j.t.ai.i() + 100;
        final yg c = this.c(\u2603, \u2603);
        final long j = ave.J();
        this.M = (this.K == c && j - this.J < 250L && this.L == \u2603);
        this.H = false;
        if (\u2603 == 0 || \u2603 == 1 || b) {
            final int i = this.i;
            final int r = this.r;
            final boolean b2 = \u2603 < i || \u2603 < r || \u2603 >= i + this.f || \u2603 >= r + this.g;
            int e = -1;
            if (c != null) {
                e = c.e;
            }
            if (b2) {
                e = -999;
            }
            if (this.j.t.A && b2 && this.j.h.bi.p() == null) {
                this.j.a((axu)null);
                return;
            }
            if (e != -1) {
                if (this.j.t.A) {
                    if (c != null && c.e()) {
                        this.v = c;
                        this.x = null;
                        this.w = (\u2603 == 1);
                    }
                    else {
                        this.v = null;
                    }
                }
                else if (!this.t) {
                    if (this.j.h.bi.p() == null) {
                        if (\u2603 == this.j.t.ai.i() + 100) {
                            this.a(c, e, \u2603, 3);
                        }
                        else {
                            final boolean b3 = e != -999 && (Keyboard.isKeyDown(42) || Keyboard.isKeyDown(54));
                            int \u26032 = 0;
                            if (b3) {
                                this.N = ((c != null && c.e()) ? c.d() : null);
                                \u26032 = 1;
                            }
                            else if (e == -999) {
                                \u26032 = 4;
                            }
                            this.a(c, e, \u2603, \u26032);
                        }
                        this.H = true;
                    }
                    else {
                        this.t = true;
                        this.G = \u2603;
                        this.s.clear();
                        if (\u2603 == 0) {
                            this.F = 0;
                        }
                        else if (\u2603 == 1) {
                            this.F = 1;
                        }
                        else if (\u2603 == this.j.t.ai.i() + 100) {
                            this.F = 2;
                        }
                    }
                }
            }
        }
        this.K = c;
        this.J = j;
        this.L = \u2603;
    }
    
    @Override
    protected void a(final int \u2603, final int \u2603, final int \u2603, final long \u2603) {
        final yg c = this.c(\u2603, \u2603);
        final zx p = this.j.h.bi.p();
        if (this.v != null && this.j.t.A) {
            if (\u2603 == 0 || \u2603 == 1) {
                if (this.x == null) {
                    if (c != this.v && this.v.d() != null) {
                        this.x = this.v.d().k();
                    }
                }
                else if (this.x.b > 1 && c != null && xi.a(c, this.x, false)) {
                    final long j = ave.J();
                    if (this.D == c) {
                        if (j - this.E > 500L) {
                            this.a(this.v, this.v.e, 0, 0);
                            this.a(c, c.e, 1, 0);
                            this.a(this.v, this.v.e, 0, 0);
                            this.E = j + 750L;
                            final zx x = this.x;
                            --x.b;
                        }
                    }
                    else {
                        this.D = c;
                        this.E = j;
                    }
                }
            }
        }
        else if (this.t && c != null && p != null && p.b > this.s.size() && xi.a(c, p, true) && c.a(p) && this.h.b(c)) {
            this.s.add(c);
            this.a();
        }
    }
    
    @Override
    protected void b(final int \u2603, final int \u2603, final int \u2603) {
        final yg c = this.c(\u2603, \u2603);
        final int i = this.i;
        final int r = this.r;
        final boolean b = \u2603 < i || \u2603 < r || \u2603 >= i + this.f || \u2603 >= r + this.g;
        int e = -1;
        if (c != null) {
            e = c.e;
        }
        if (b) {
            e = -999;
        }
        if (this.M && c != null && \u2603 == 0 && this.h.a(null, c)) {
            if (r()) {
                if (c != null && c.d != null && this.N != null) {
                    for (final yg \u26032 : this.h.c) {
                        if (\u26032 != null && \u26032.a(this.j.h) && \u26032.e() && \u26032.d == c.d && xi.a(\u26032, this.N, true)) {
                            this.a(\u26032, \u26032.e, \u2603, 1);
                        }
                    }
                }
            }
            else {
                this.a(c, e, \u2603, 6);
            }
            this.M = false;
            this.J = 0L;
        }
        else {
            if (this.t && this.G != \u2603) {
                this.t = false;
                this.s.clear();
                this.H = true;
                return;
            }
            if (this.H) {
                this.H = false;
                return;
            }
            if (this.v != null && this.j.t.A) {
                if (\u2603 == 0 || \u2603 == 1) {
                    if (this.x == null && c != this.v) {
                        this.x = this.v.d();
                    }
                    final boolean a = xi.a(c, this.x, false);
                    if (e != -1 && this.x != null && a) {
                        this.a(this.v, this.v.e, \u2603, 0);
                        this.a(c, e, 0, 0);
                        if (this.j.h.bi.p() != null) {
                            this.a(this.v, this.v.e, \u2603, 0);
                            this.y = \u2603 - i;
                            this.z = \u2603 - r;
                            this.A = this.v;
                            this.C = this.x;
                            this.B = ave.J();
                        }
                        else {
                            this.C = null;
                        }
                    }
                    else if (this.x != null) {
                        this.y = \u2603 - i;
                        this.z = \u2603 - r;
                        this.A = this.v;
                        this.C = this.x;
                        this.B = ave.J();
                    }
                    this.x = null;
                    this.v = null;
                }
            }
            else if (this.t && !this.s.isEmpty()) {
                this.a(null, -999, xi.d(0, this.F), 5);
                for (final yg \u26032 : this.s) {
                    this.a(\u26032, \u26032.e, xi.d(1, this.F), 5);
                }
                this.a(null, -999, xi.d(2, this.F), 5);
            }
            else if (this.j.h.bi.p() != null) {
                if (\u2603 == this.j.t.ai.i() + 100) {
                    this.a(c, e, \u2603, 3);
                }
                else {
                    final boolean a = e != -999 && (Keyboard.isKeyDown(42) || Keyboard.isKeyDown(54));
                    if (a) {
                        this.N = ((c != null && c.e()) ? c.d() : null);
                    }
                    this.a(c, e, \u2603, a ? 1 : 0);
                }
            }
        }
        if (this.j.h.bi.p() == null) {
            this.J = 0L;
        }
        this.t = false;
    }
    
    private boolean a(final yg \u2603, final int \u2603, final int \u2603) {
        return this.c(\u2603.f, \u2603.g, 16, 16, \u2603, \u2603);
    }
    
    protected boolean c(final int \u2603, final int \u2603, final int \u2603, final int \u2603, int \u2603, int \u2603) {
        final int i = this.i;
        final int r = this.r;
        \u2603 -= i;
        \u2603 -= r;
        return \u2603 >= \u2603 - 1 && \u2603 < \u2603 + \u2603 + 1 && \u2603 >= \u2603 - 1 && \u2603 < \u2603 + \u2603 + 1;
    }
    
    protected void a(final yg \u2603, int \u2603, final int \u2603, final int \u2603) {
        if (\u2603 != null) {
            \u2603 = \u2603.e;
        }
        this.j.c.a(this.h.d, \u2603, \u2603, \u2603, this.j.h);
    }
    
    @Override
    protected void a(final char \u2603, final int \u2603) {
        if (\u2603 == 1 || \u2603 == this.j.t.ae.i()) {
            this.j.h.n();
        }
        this.b(\u2603);
        if (this.u != null && this.u.e()) {
            if (\u2603 == this.j.t.ai.i()) {
                this.a(this.u, this.u.e, 0, 3);
            }
            else if (\u2603 == this.j.t.ag.i()) {
                this.a(this.u, this.u.e, axu.q() ? 1 : 0, 4);
            }
        }
    }
    
    protected boolean b(final int \u2603) {
        if (this.j.h.bi.p() == null && this.u != null) {
            for (int i = 0; i < 9; ++i) {
                if (\u2603 == this.j.t.av[i].i()) {
                    this.a(this.u, this.u.e, i, 2);
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public void m() {
        if (this.j.h == null) {
            return;
        }
        this.h.b(this.j.h);
    }
    
    @Override
    public boolean d() {
        return false;
    }
    
    @Override
    public void e() {
        super.e();
        if (!this.j.h.ai() || this.j.h.I) {
            this.j.h.n();
        }
    }
    
    static {
        a = new jy("textures/gui/container/inventory.png");
    }
}
