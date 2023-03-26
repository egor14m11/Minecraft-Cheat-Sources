// 
// Decompiled by Procyon v0.5.36
// 

public class qw extends rd
{
    private final ps a;
    private final float b;
    private float c;
    private boolean d;
    private int e;
    private int f;
    
    public qw(final ps \u2603, final float \u2603) {
        this.a = \u2603;
        this.b = \u2603;
        this.a(7);
    }
    
    @Override
    public void c() {
        this.c = 0.0f;
    }
    
    @Override
    public void d() {
        this.d = false;
        this.c = 0.0f;
    }
    
    @Override
    public boolean a() {
        return this.a.ai() && this.a.l != null && this.a.l instanceof wn && (this.d || this.a.bW());
    }
    
    @Override
    public void e() {
        final wn \u2603 = (wn)this.a.l;
        final py py = (py)this.a;
        float n = ns.g(\u2603.y - this.a.y) * 0.5f;
        if (n > 5.0f) {
            n = 5.0f;
        }
        if (n < -5.0f) {
            n = -5.0f;
        }
        this.a.y = ns.g(this.a.y + n);
        if (this.c < this.b) {
            this.c += (this.b - this.c) * 0.01f;
        }
        if (this.c > this.b) {
            this.c = this.b;
        }
        final int c = ns.c(this.a.s);
        final int c2 = ns.c(this.a.t);
        final int c3 = ns.c(this.a.u);
        float c4 = this.c;
        if (this.d) {
            if (this.e++ > this.f) {
                this.d = false;
            }
            c4 += c4 * 1.15f * ns.a(this.e / (float)this.f * 3.1415927f);
        }
        float n2 = 0.91f;
        if (this.a.C) {
            n2 = this.a.o.p(new cj(ns.d((float)c), ns.d((float)c2) - 1, ns.d((float)c3))).c().L * 0.91f;
        }
        final float n3 = 0.16277136f / (n2 * n2 * n2);
        final float a = ns.a(py.y * 3.1415927f / 180.0f);
        final float b = ns.b(py.y * 3.1415927f / 180.0f);
        final float n4 = py.bI() * n3;
        float max = Math.max(c4, 1.0f);
        max = n4 / max;
        final float n5 = c4 * max;
        float \u26032 = -(n5 * a);
        float \u26033 = n5 * b;
        if (ns.e(\u26032) > ns.e(\u26033)) {
            if (\u26032 < 0.0f) {
                \u26032 -= this.a.J / 2.0f;
            }
            if (\u26032 > 0.0f) {
                \u26032 += this.a.J / 2.0f;
            }
            \u26033 = 0.0f;
        }
        else {
            \u26032 = 0.0f;
            if (\u26033 < 0.0f) {
                \u26033 -= this.a.J / 2.0f;
            }
            if (\u26033 > 0.0f) {
                \u26033 += this.a.J / 2.0f;
            }
        }
        final int c5 = ns.c(this.a.s + \u26032);
        final int c6 = ns.c(this.a.u + \u26033);
        final int d = ns.d(this.a.J + 1.0f);
        final int d2 = ns.d(this.a.K + \u2603.K + 1.0f);
        final int d3 = ns.d(this.a.J + 1.0f);
        if (c != c5 || c3 != c6) {
            final afh c7 = this.a.o.p(new cj(c, c2, c3)).c();
            final boolean b2 = !this.a(c7) && (c7.t() != arm.a || !this.a(this.a.o.p(new cj(c, c2 - 1, c3)).c()));
            if (b2 && 0 == ata.a(this.a.o, this.a, c5, c2, c6, d, d2, d3, false, false, true) && 1 == ata.a(this.a.o, this.a, c, c2 + 1, c3, d, d2, d3, false, false, true) && 1 == ata.a(this.a.o, this.a, c5, c2 + 1, c6, d, d2, d3, false, false, true)) {
                py.r().a();
            }
        }
        if (!\u2603.bA.d && this.c >= this.b * 0.5f && this.a.bc().nextFloat() < 0.006f && !this.d) {
            final zx ba = \u2603.bA();
            if (ba != null && ba.b() == zy.bY) {
                ba.a(1, \u2603);
                if (ba.b == 0) {
                    final zx zx = new zx(zy.aR);
                    zx.d(ba.o());
                    \u2603.bi.a[\u2603.bi.c] = zx;
                }
            }
        }
        this.a.g(0.0f, c4);
    }
    
    private boolean a(final afh \u2603) {
        return \u2603 instanceof aju || \u2603 instanceof ahh;
    }
    
    public boolean f() {
        return this.d;
    }
    
    public void g() {
        this.d = true;
        this.e = 0;
        this.f = this.a.bc().nextInt(841) + 140;
    }
    
    public boolean h() {
        return !this.f() && this.c > this.b * 0.3f;
    }
}
