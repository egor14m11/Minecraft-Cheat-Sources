import java.util.Random;
import org.lwjgl.input.Mouse;

// 
// Decompiled by Procyon v0.5.36
// 

public class aye extends axu implements ayg
{
    private static final int y;
    private static final int z;
    private static final int A;
    private static final int B;
    private static final jy C;
    protected axu a;
    protected int f;
    protected int g;
    protected int h;
    protected int i;
    protected float r;
    protected double s;
    protected double t;
    protected double u;
    protected double v;
    protected double w;
    protected double x;
    private int D;
    private nb E;
    private boolean F;
    
    public aye(final axu \u2603, final nb \u2603) {
        this.f = 256;
        this.g = 202;
        this.r = 1.0f;
        this.F = true;
        this.a = \u2603;
        this.E = \u2603;
        final int n = 141;
        final int n2 = 141;
        final double s = mr.f.a * 24 - n / 2 - 12;
        this.w = s;
        this.u = s;
        this.s = s;
        final double t = mr.f.b * 24 - n2 / 2;
        this.x = t;
        this.v = t;
        this.t = t;
    }
    
    @Override
    public void b() {
        this.j.u().a(new ig(ig.a.b));
        this.n.clear();
        this.n.add(new awe(1, this.l / 2 + 24, this.m / 2 + 74, 80, 20, bnq.a("gui.done", new Object[0])));
    }
    
    @Override
    protected void a(final avs \u2603) {
        if (this.F) {
            return;
        }
        if (\u2603.k == 1) {
            this.j.a(this.a);
        }
    }
    
    @Override
    protected void a(final char \u2603, final int \u2603) {
        if (\u2603 == this.j.t.ae.i()) {
            this.j.a((axu)null);
            this.j.n();
        }
        else {
            super.a(\u2603, \u2603);
        }
    }
    
    @Override
    public void a(final int \u2603, final int \u2603, final float \u2603) {
        if (this.F) {
            this.c();
            this.a(this.q, bnq.a("multiplayer.downloadingStats", new Object[0]), this.l / 2, this.m / 2, 16777215);
            this.a(this.q, aye.c_[(int)(ave.J() / 150L % aye.c_.length)], this.l / 2, this.m / 2 + this.q.a * 2, 16777215);
        }
        else {
            if (Mouse.isButtonDown(0)) {
                final int dWheel = (this.l - this.f) / 2;
                final int n = (this.m - this.g) / 2;
                final int n2 = dWheel + 8;
                final int n3 = n + 17;
                if ((this.D == 0 || this.D == 1) && \u2603 >= n2 && \u2603 < n2 + 224 && \u2603 >= n3 && \u2603 < n3 + 155) {
                    if (this.D == 0) {
                        this.D = 1;
                    }
                    else {
                        this.u -= (\u2603 - this.h) * this.r;
                        this.v -= (\u2603 - this.i) * this.r;
                        final double u = this.u;
                        this.s = u;
                        this.w = u;
                        final double v = this.v;
                        this.t = v;
                        this.x = v;
                    }
                    this.h = \u2603;
                    this.i = \u2603;
                }
            }
            else {
                this.D = 0;
            }
            final int dWheel = Mouse.getDWheel();
            final float r = this.r;
            if (dWheel < 0) {
                this.r += 0.25f;
            }
            else if (dWheel > 0) {
                this.r -= 0.25f;
            }
            this.r = ns.a(this.r, 1.0f, 2.0f);
            if (this.r != r) {
                final float n4 = r - this.r;
                final float n5 = r * this.f;
                final float n6 = r * this.g;
                final float n7 = this.r * this.f;
                final float n8 = this.r * this.g;
                this.u -= (n7 - n5) * 0.5f;
                this.v -= (n8 - n6) * 0.5f;
                final double u2 = this.u;
                this.s = u2;
                this.w = u2;
                final double v2 = this.v;
                this.t = v2;
                this.x = v2;
            }
            if (this.w < aye.y) {
                this.w = aye.y;
            }
            if (this.x < aye.z) {
                this.x = aye.z;
            }
            if (this.w >= aye.A) {
                this.w = aye.A - 1;
            }
            if (this.x >= aye.B) {
                this.x = aye.B - 1;
            }
            this.c();
            this.b(\u2603, \u2603, \u2603);
            bfl.f();
            bfl.i();
            this.f();
            bfl.e();
            bfl.j();
        }
    }
    
    @Override
    public void a() {
        if (this.F) {
            this.F = false;
        }
    }
    
    @Override
    public void e() {
        if (this.F) {
            return;
        }
        this.s = this.u;
        this.t = this.v;
        final double n = this.w - this.u;
        final double n2 = this.x - this.v;
        if (n * n + n2 * n2 < 4.0) {
            this.u += n;
            this.v += n2;
        }
        else {
            this.u += n * 0.85;
            this.v += n2 * 0.85;
        }
    }
    
    protected void f() {
        final int n = (this.l - this.f) / 2;
        final int n2 = (this.m - this.g) / 2;
        this.q.a(bnq.a("gui.achievements", new Object[0]), n + 15, n2 + 5, 4210752);
    }
    
    protected void b(final int \u2603, final int \u2603, final float \u2603) {
        int n = ns.c(this.s + (this.u - this.s) * \u2603);
        int n2 = ns.c(this.t + (this.v - this.t) * \u2603);
        if (n < aye.y) {
            n = aye.y;
        }
        if (n2 < aye.z) {
            n2 = aye.z;
        }
        if (n >= aye.A) {
            n = aye.A - 1;
        }
        if (n2 >= aye.B) {
            n2 = aye.B - 1;
        }
        final int \u26032 = (this.l - this.f) / 2;
        final int \u26033 = (this.m - this.g) / 2;
        final int n3 = \u26032 + 16;
        final int n4 = \u26033 + 17;
        this.e = 0.0f;
        bfl.c(518);
        bfl.E();
        bfl.b((float)n3, (float)n4, -200.0f);
        bfl.a(1.0f / this.r, 1.0f / this.r, 0.0f);
        bfl.w();
        bfl.f();
        bfl.B();
        bfl.g();
        final int n5 = n + 288 >> 4;
        final int n6 = n2 + 288 >> 4;
        final int n7 = (n + 288) % 16;
        final int n8 = (n2 + 288) % 16;
        final int n9 = 4;
        final int n10 = 8;
        final int n11 = 10;
        final int n12 = 22;
        final int n13 = 37;
        final Random random = new Random();
        final float n14 = 16.0f / this.r;
        final float n15 = 16.0f / this.r;
        for (int i = 0; i * n14 - n8 < 155.0f; ++i) {
            final float n16 = 0.6f - (n6 + i) / 25.0f * 0.3f;
            bfl.c(n16, n16, n16, 1.0f);
            for (int \u26034 = 0; \u26034 * n15 - n7 < 224.0f; ++\u26034) {
                random.setSeed(this.j.L().b().hashCode() + (n5 + \u26034) + (n6 + i) * 16);
                final int j = random.nextInt(1 + n6 + i) + (n6 + i) / 2;
                bmi \u26035 = this.a(afi.m);
                if (j > 37 || n6 + i == 35) {
                    final afh h = afi.h;
                    \u26035 = this.a(h);
                }
                else if (j == 22) {
                    if (random.nextInt(2) == 0) {
                        \u26035 = this.a(afi.ag);
                    }
                    else {
                        \u26035 = this.a(afi.aC);
                    }
                }
                else if (j == 10) {
                    \u26035 = this.a(afi.p);
                }
                else if (j == 8) {
                    \u26035 = this.a(afi.q);
                }
                else if (j > 4) {
                    \u26035 = this.a(afi.b);
                }
                else if (j > 0) {
                    \u26035 = this.a(afi.d);
                }
                this.j.P().a(bmh.g);
                this.a(\u26034 * 16 - n7, i * 16 - n8, \u26035, 16, 16);
            }
        }
        bfl.j();
        bfl.c(515);
        this.j.P().a(aye.C);
        for (int i = 0; i < mr.e.size(); ++i) {
            final mq \u26036 = mr.e.get(i);
            if (\u26036.c != null) {
                final int \u26034 = \u26036.a * 24 - n + 11;
                final int j = \u26036.b * 24 - n2 + 11;
                final int n17 = \u26036.c.a * 24 - n + 11;
                final int n18 = \u26036.c.b * 24 - n2 + 11;
                final boolean a = this.E.a(\u26036);
                final boolean b = this.E.b(\u26036);
                final int n19 = this.E.c(\u26036);
                if (n19 <= 4) {
                    int b2 = -16777216;
                    if (a) {
                        b2 = -6250336;
                    }
                    else if (b) {
                        b2 = -16711936;
                    }
                    this.a(\u26034, n17, j, b2);
                    this.b(n17, j, n18, b2);
                    if (\u26034 > n17) {
                        this.b(\u26034 - 11 - 7, j - 5, 114, 234, 7, 11);
                    }
                    else if (\u26034 < n17) {
                        this.b(\u26034 + 11, j - 5, 107, 234, 7, 11);
                    }
                    else if (j > n18) {
                        this.b(\u26034 - 5, j - 11 - 7, 96, 234, 11, 7);
                    }
                    else if (j < n18) {
                        this.b(\u26034 - 5, j + 11, 96, 241, 11, 7);
                    }
                }
            }
        }
        mq \u26037 = null;
        final float n16 = (\u2603 - n3) * this.r;
        final float n20 = (\u2603 - n4) * this.r;
        avc.c();
        bfl.f();
        bfl.B();
        bfl.g();
        for (int j = 0; j < mr.e.size(); ++j) {
            final mq \u26038 = mr.e.get(j);
            final int n18 = \u26038.a * 24 - n;
            final int n21 = \u26038.b * 24 - n2;
            if (n18 >= -24 && n21 >= -24 && n18 <= 224.0f * this.r && n21 <= 155.0f * this.r) {
                final int n22 = this.E.c(\u26038);
                if (this.E.a(\u26038)) {
                    final float n23 = 0.75f;
                    bfl.c(n23, n23, n23, 1.0f);
                }
                else if (this.E.b(\u26038)) {
                    final float n23 = 1.0f;
                    bfl.c(n23, n23, n23, 1.0f);
                }
                else if (n22 < 3) {
                    final float n23 = 0.3f;
                    bfl.c(n23, n23, n23, 1.0f);
                }
                else if (n22 == 3) {
                    final float n23 = 0.2f;
                    bfl.c(n23, n23, n23, 1.0f);
                }
                else {
                    if (n22 != 4) {
                        continue;
                    }
                    final float n23 = 0.1f;
                    bfl.c(n23, n23, n23, 1.0f);
                }
                this.j.P().a(aye.C);
                if (\u26038.g()) {
                    this.b(n18 - 2, n21 - 2, 26, 202, 26, 26);
                }
                else {
                    this.b(n18 - 2, n21 - 2, 0, 202, 26, 26);
                }
                if (!this.E.b(\u26038)) {
                    final float n23 = 0.1f;
                    bfl.c(n23, n23, n23, 1.0f);
                    this.k.a(false);
                }
                bfl.e();
                bfl.o();
                this.k.b(\u26038.d, n18 + 3, n21 + 3);
                bfl.b(770, 771);
                bfl.f();
                if (!this.E.b(\u26038)) {
                    this.k.a(true);
                }
                bfl.c(1.0f, 1.0f, 1.0f, 1.0f);
                if (n16 >= n18 && n16 <= n18 + 22 && n20 >= n21 && n20 <= n21 + 22) {
                    \u26037 = \u26038;
                }
            }
        }
        bfl.i();
        bfl.l();
        bfl.F();
        bfl.c(1.0f, 1.0f, 1.0f, 1.0f);
        this.j.P().a(aye.C);
        this.b(\u26032, \u26033, 0, 0, this.f, this.g);
        this.e = 0.0f;
        bfl.c(515);
        bfl.i();
        bfl.w();
        super.a(\u2603, \u2603, \u2603);
        if (\u26037 != null) {
            String s = \u26037.e().c();
            final String f = \u26037.f();
            final int n18 = \u2603 + 12;
            final int n21 = \u2603 - 4;
            final int n22 = this.E.c(\u26037);
            if (this.E.b(\u26037)) {
                final int n19 = Math.max(this.q.a(s), 120);
                int b2 = this.q.b(f, n19);
                if (this.E.a(\u26037)) {
                    b2 += 12;
                }
                this.a(n18 - 3, n21 - 3, n18 + n19 + 3, n21 + b2 + 3 + 12, -1073741824, -1073741824);
                this.q.a(f, n18, n21 + 12, n19, -6250336);
                if (this.E.a(\u26037)) {
                    this.q.a(bnq.a("achievement.taken", new Object[0]), (float)n18, (float)(n21 + b2 + 4), -7302913);
                }
            }
            else if (n22 == 3) {
                s = bnq.a("achievement.unknown", new Object[0]);
                final int n19 = Math.max(this.q.a(s), 120);
                final String s2 = new fb("achievement.requires", new Object[] { \u26037.c.e() }).c();
                final int n24 = this.q.b(s2, n19);
                this.a(n18 - 3, n21 - 3, n18 + n19 + 3, n21 + n24 + 12 + 3, -1073741824, -1073741824);
                this.q.a(s2, n18, n21 + 12, n19, -9416624);
            }
            else if (n22 < 3) {
                final int n19 = Math.max(this.q.a(s), 120);
                final String s2 = new fb("achievement.requires", new Object[] { \u26037.c.e() }).c();
                final int n24 = this.q.b(s2, n19);
                this.a(n18 - 3, n21 - 3, n18 + n19 + 3, n21 + n24 + 12 + 3, -1073741824, -1073741824);
                this.q.a(s2, n18, n21 + 12, n19, -9416624);
            }
            else {
                s = null;
            }
            if (s != null) {
                this.q.a(s, (float)n18, (float)n21, this.E.b(\u26037) ? (\u26037.g() ? -128 : -1) : (\u26037.g() ? -8355776 : -8355712));
            }
        }
        bfl.j();
        bfl.e();
        avc.a();
    }
    
    private bmi a(final afh \u2603) {
        return ave.A().ae().a().a(\u2603.Q());
    }
    
    @Override
    public boolean d() {
        return !this.F;
    }
    
    static {
        y = mr.a * 24 - 112;
        z = mr.b * 24 - 112;
        A = mr.c * 24 - 77;
        B = mr.d * 24 - 77;
        C = new jy("textures/gui/achievement/achievement_background.png");
    }
}
