import org.lwjgl.input.Mouse;

// 
// Decompiled by Procyon v0.5.36
// 

public abstract class awi
{
    protected final ave a;
    protected int b;
    protected int c;
    protected int d;
    protected int e;
    protected int f;
    protected int g;
    protected final int h;
    private int u;
    private int v;
    protected int i;
    protected int j;
    protected boolean k;
    protected int l;
    protected float m;
    protected float n;
    protected int o;
    protected long p;
    protected boolean q;
    protected boolean r;
    protected boolean s;
    protected int t;
    private boolean w;
    
    public awi(final ave \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603) {
        this.k = true;
        this.l = -2;
        this.o = -1;
        this.q = true;
        this.r = true;
        this.w = true;
        this.a = \u2603;
        this.b = \u2603;
        this.c = \u2603;
        this.d = \u2603;
        this.e = \u2603;
        this.h = \u2603;
        this.g = 0;
        this.f = \u2603;
    }
    
    public void a(final int \u2603, final int \u2603, final int \u2603, final int \u2603) {
        this.b = \u2603;
        this.c = \u2603;
        this.d = \u2603;
        this.e = \u2603;
        this.g = 0;
        this.f = \u2603;
    }
    
    public void b(final boolean \u2603) {
        this.r = \u2603;
    }
    
    protected void a(final boolean \u2603, final int \u2603) {
        this.s = \u2603;
        this.t = \u2603;
        if (!\u2603) {
            this.t = 0;
        }
    }
    
    protected abstract int b();
    
    protected abstract void a(final int p0, final boolean p1, final int p2, final int p3);
    
    protected abstract boolean a(final int p0);
    
    protected int k() {
        return this.b() * this.h + this.t;
    }
    
    protected abstract void a();
    
    protected void a(final int \u2603, final int \u2603, final int \u2603) {
    }
    
    protected abstract void a(final int p0, final int p1, final int p2, final int p3, final int p4, final int p5);
    
    protected void a(final int \u2603, final int \u2603, final bfx \u2603) {
    }
    
    protected void a(final int \u2603, final int \u2603) {
    }
    
    protected void b(final int \u2603, final int \u2603) {
    }
    
    public int c(final int \u2603, final int \u2603) {
        final int n = this.g + this.b / 2 - this.c() / 2;
        final int n2 = this.g + this.b / 2 + this.c() / 2;
        final int n3 = \u2603 - this.d - this.t + (int)this.n - 4;
        final int n4 = n3 / this.h;
        if (\u2603 < this.d() && \u2603 >= n && \u2603 <= n2 && n4 >= 0 && n3 >= 0 && n4 < this.b()) {
            return n4;
        }
        return -1;
    }
    
    public void d(final int \u2603, final int \u2603) {
        this.u = \u2603;
        this.v = \u2603;
    }
    
    protected void l() {
        this.n = ns.a(this.n, 0.0f, (float)this.m());
    }
    
    public int m() {
        return Math.max(0, this.k() - (this.e - this.d - 4));
    }
    
    public int n() {
        return (int)this.n;
    }
    
    public boolean g(final int \u2603) {
        return \u2603 >= this.d && \u2603 <= this.e && this.i >= this.g && this.i <= this.f;
    }
    
    public void h(final int \u2603) {
        this.n += \u2603;
        this.l();
        this.l = -2;
    }
    
    public void a(final avs \u2603) {
        if (!\u2603.l) {
            return;
        }
        if (\u2603.k == this.u) {
            this.n -= this.h * 2 / 3;
            this.l = -2;
            this.l();
        }
        else if (\u2603.k == this.v) {
            this.n += this.h * 2 / 3;
            this.l = -2;
            this.l();
        }
    }
    
    public void a(final int \u2603, final int \u2603, final float \u2603) {
        if (!this.q) {
            return;
        }
        this.i = \u2603;
        this.j = \u2603;
        this.a();
        final int d = this.d();
        final int n = d + 6;
        this.l();
        bfl.f();
        bfl.n();
        final bfx a = bfx.a();
        final bfd c = a.c();
        this.a.P().a(avp.b);
        bfl.c(1.0f, 1.0f, 1.0f, 1.0f);
        final float n2 = 32.0f;
        c.a(7, bms.i);
        c.b(this.g, this.e, 0.0).a(this.g / n2, (this.e + (int)this.n) / n2).b(32, 32, 32, 255).d();
        c.b(this.f, this.e, 0.0).a(this.f / n2, (this.e + (int)this.n) / n2).b(32, 32, 32, 255).d();
        c.b(this.f, this.d, 0.0).a(this.f / n2, (this.d + (int)this.n) / n2).b(32, 32, 32, 255).d();
        c.b(this.g, this.d, 0.0).a(this.g / n2, (this.d + (int)this.n) / n2).b(32, 32, 32, 255).d();
        a.b();
        final int n3 = this.g + (this.b / 2 - this.c() / 2 + 2);
        final int n4 = this.d + 4 - (int)this.n;
        if (this.s) {
            this.a(n3, n4, a);
        }
        this.b(n3, n4, \u2603, \u2603);
        bfl.i();
        final int n5 = 4;
        this.c(0, this.d, 255, 255);
        this.c(this.e, this.c, 255, 255);
        bfl.l();
        bfl.a(770, 771, 0, 1);
        bfl.c();
        bfl.j(7425);
        bfl.x();
        c.a(7, bms.i);
        c.b(this.g, this.d + n5, 0.0).a(0.0, 1.0).b(0, 0, 0, 0).d();
        c.b(this.f, this.d + n5, 0.0).a(1.0, 1.0).b(0, 0, 0, 0).d();
        c.b(this.f, this.d, 0.0).a(1.0, 0.0).b(0, 0, 0, 255).d();
        c.b(this.g, this.d, 0.0).a(0.0, 0.0).b(0, 0, 0, 255).d();
        a.b();
        c.a(7, bms.i);
        c.b(this.g, this.e, 0.0).a(0.0, 1.0).b(0, 0, 0, 255).d();
        c.b(this.f, this.e, 0.0).a(1.0, 1.0).b(0, 0, 0, 255).d();
        c.b(this.f, this.e - n5, 0.0).a(1.0, 0.0).b(0, 0, 0, 0).d();
        c.b(this.g, this.e - n5, 0.0).a(0.0, 0.0).b(0, 0, 0, 0).d();
        a.b();
        final int m = this.m();
        if (m > 0) {
            int a2 = (this.e - this.d) * (this.e - this.d) / this.k();
            a2 = ns.a(a2, 32, this.e - this.d - 8);
            int d2 = (int)this.n * (this.e - this.d - a2) / m + this.d;
            if (d2 < this.d) {
                d2 = this.d;
            }
            c.a(7, bms.i);
            c.b(d, this.e, 0.0).a(0.0, 1.0).b(0, 0, 0, 255).d();
            c.b(n, this.e, 0.0).a(1.0, 1.0).b(0, 0, 0, 255).d();
            c.b(n, this.d, 0.0).a(1.0, 0.0).b(0, 0, 0, 255).d();
            c.b(d, this.d, 0.0).a(0.0, 0.0).b(0, 0, 0, 255).d();
            a.b();
            c.a(7, bms.i);
            c.b(d, d2 + a2, 0.0).a(0.0, 1.0).b(128, 128, 128, 255).d();
            c.b(n, d2 + a2, 0.0).a(1.0, 1.0).b(128, 128, 128, 255).d();
            c.b(n, d2, 0.0).a(1.0, 0.0).b(128, 128, 128, 255).d();
            c.b(d, d2, 0.0).a(0.0, 0.0).b(128, 128, 128, 255).d();
            a.b();
            c.a(7, bms.i);
            c.b(d, d2 + a2 - 1, 0.0).a(0.0, 1.0).b(192, 192, 192, 255).d();
            c.b(n - 1, d2 + a2 - 1, 0.0).a(1.0, 1.0).b(192, 192, 192, 255).d();
            c.b(n - 1, d2, 0.0).a(1.0, 0.0).b(192, 192, 192, 255).d();
            c.b(d, d2, 0.0).a(0.0, 0.0).b(192, 192, 192, 255).d();
            a.b();
        }
        this.b(\u2603, \u2603);
        bfl.w();
        bfl.j(7424);
        bfl.d();
        bfl.k();
    }
    
    public void p() {
        if (!this.g(this.j)) {
            return;
        }
        if (Mouse.getEventButton() == 0 && Mouse.getEventButtonState() && this.j >= this.d && this.j <= this.e) {
            final int eventDWheel = (this.b - this.c()) / 2;
            final int n = (this.b + this.c()) / 2;
            final int n2 = this.j - this.d - this.t + (int)this.n - 4;
            final int o = n2 / this.h;
            if (o < this.b() && this.i >= eventDWheel && this.i <= n && o >= 0 && n2 >= 0) {
                this.a(o, false, this.i, this.j);
                this.o = o;
            }
            else if (this.i >= eventDWheel && this.i <= n && n2 < 0) {
                this.a(this.i - eventDWheel, this.j - this.d + (int)this.n - 4);
            }
        }
        if (Mouse.isButtonDown(0) && this.q()) {
            if (this.l == -1) {
                boolean b = true;
                if (this.j >= this.d && this.j <= this.e) {
                    final int n = (this.b - this.c()) / 2;
                    final int n2 = (this.b + this.c()) / 2;
                    final int o = this.j - this.d - this.t + (int)this.n - 4;
                    final int o2 = o / this.h;
                    if (o2 < this.b() && this.i >= n && this.i <= n2 && o2 >= 0 && o >= 0) {
                        final boolean b2 = o2 == this.o && ave.J() - this.p < 250L;
                        this.a(o2, b2, this.i, this.j);
                        this.o = o2;
                        this.p = ave.J();
                    }
                    else if (this.i >= n && this.i <= n2 && o < 0) {
                        this.a(this.i - n, this.j - this.d + (int)this.n - 4);
                        b = false;
                    }
                    final int d = this.d();
                    final int n3 = d + 6;
                    if (this.i >= d && this.i <= n3) {
                        this.m = -1.0f;
                        int m = this.m();
                        if (m < 1) {
                            m = 1;
                        }
                        int a = (int)((this.e - this.d) * (this.e - this.d) / (float)this.k());
                        a = ns.a(a, 32, this.e - this.d - 8);
                        this.m /= (this.e - this.d - a) / (float)m;
                    }
                    else {
                        this.m = 1.0f;
                    }
                    if (b) {
                        this.l = this.j;
                    }
                    else {
                        this.l = -2;
                    }
                }
                else {
                    this.l = -2;
                }
            }
            else if (this.l >= 0) {
                this.n -= (this.j - this.l) * this.m;
                this.l = this.j;
            }
        }
        else {
            this.l = -1;
        }
        int eventDWheel = Mouse.getEventDWheel();
        if (eventDWheel != 0) {
            if (eventDWheel > 0) {
                eventDWheel = -1;
            }
            else if (eventDWheel < 0) {
                eventDWheel = 1;
            }
            this.n += eventDWheel * this.h / 2;
        }
    }
    
    public void d(final boolean \u2603) {
        this.w = \u2603;
    }
    
    public boolean q() {
        return this.w;
    }
    
    public int c() {
        return 220;
    }
    
    protected void b(final int \u2603, final int \u2603, final int \u2603, final int \u2603) {
        final int b = this.b();
        final bfx a = bfx.a();
        final bfd c = a.c();
        for (int i = 0; i < b; ++i) {
            final int \u26032 = \u2603 + i * this.h + this.t;
            final int n = this.h - 4;
            if (\u26032 > this.e || \u26032 + n < this.d) {
                this.a(i, \u2603, \u26032);
            }
            if (this.r && this.a(i)) {
                final int n2 = this.g + (this.b / 2 - this.c() / 2);
                final int n3 = this.g + (this.b / 2 + this.c() / 2);
                bfl.c(1.0f, 1.0f, 1.0f, 1.0f);
                bfl.x();
                c.a(7, bms.i);
                c.b(n2, \u26032 + n + 2, 0.0).a(0.0, 1.0).b(128, 128, 128, 255).d();
                c.b(n3, \u26032 + n + 2, 0.0).a(1.0, 1.0).b(128, 128, 128, 255).d();
                c.b(n3, \u26032 - 2, 0.0).a(1.0, 0.0).b(128, 128, 128, 255).d();
                c.b(n2, \u26032 - 2, 0.0).a(0.0, 0.0).b(128, 128, 128, 255).d();
                c.b(n2 + 1, \u26032 + n + 1, 0.0).a(0.0, 1.0).b(0, 0, 0, 255).d();
                c.b(n3 - 1, \u26032 + n + 1, 0.0).a(1.0, 1.0).b(0, 0, 0, 255).d();
                c.b(n3 - 1, \u26032 - 1, 0.0).a(1.0, 0.0).b(0, 0, 0, 255).d();
                c.b(n2 + 1, \u26032 - 1, 0.0).a(0.0, 0.0).b(0, 0, 0, 255).d();
                a.b();
                bfl.w();
            }
            this.a(i, \u2603, \u26032, n, \u2603, \u2603);
        }
    }
    
    protected int d() {
        return this.b / 2 + 124;
    }
    
    protected void c(final int \u2603, final int \u2603, final int \u2603, final int \u2603) {
        final bfx a = bfx.a();
        final bfd c = a.c();
        this.a.P().a(avp.b);
        bfl.c(1.0f, 1.0f, 1.0f, 1.0f);
        final float n = 32.0f;
        c.a(7, bms.i);
        c.b(this.g, \u2603, 0.0).a(0.0, \u2603 / 32.0f).b(64, 64, 64, \u2603).d();
        c.b(this.g + this.b, \u2603, 0.0).a(this.b / 32.0f, \u2603 / 32.0f).b(64, 64, 64, \u2603).d();
        c.b(this.g + this.b, \u2603, 0.0).a(this.b / 32.0f, \u2603 / 32.0f).b(64, 64, 64, \u2603).d();
        c.b(this.g, \u2603, 0.0).a(0.0, \u2603 / 32.0f).b(64, 64, 64, \u2603).d();
        a.b();
    }
    
    public void i(final int \u2603) {
        this.g = \u2603;
        this.f = \u2603 + this.b;
    }
    
    public int r() {
        return this.h;
    }
}
