import java.util.concurrent.Callable;
import java.util.Iterator;
import java.util.List;
import net.minecraft.server.MinecraftServer;
import java.util.UUID;
import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public abstract class pk implements m
{
    private static final aug a;
    private static int b;
    private int c;
    public double j;
    public boolean k;
    public pk l;
    public pk m;
    public boolean n;
    public adm o;
    public double p;
    public double q;
    public double r;
    public double s;
    public double t;
    public double u;
    public double v;
    public double w;
    public double x;
    public float y;
    public float z;
    public float A;
    public float B;
    private aug f;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    protected boolean H;
    private boolean g;
    public boolean I;
    public float J;
    public float K;
    public float L;
    public float M;
    public float N;
    public float O;
    private int h;
    public double P;
    public double Q;
    public double R;
    public float S;
    public boolean T;
    public float U;
    protected Random V;
    public int W;
    public int X;
    private int i;
    protected boolean Y;
    public int Z;
    protected boolean aa;
    protected boolean ab;
    protected pz ac;
    private double ar;
    private double as;
    public boolean ad;
    public int ae;
    public int af;
    public int ag;
    public int bW;
    public int bX;
    public int bY;
    public boolean ah;
    public boolean ai;
    public int aj;
    protected boolean ak;
    protected int al;
    public int am;
    protected cj an;
    protected aui ao;
    protected cq ap;
    private boolean at;
    protected UUID aq;
    private final n au;
    
    public int F() {
        return this.c;
    }
    
    public void d(final int \u2603) {
        this.c = \u2603;
    }
    
    public void G() {
        this.J();
    }
    
    public pk(final adm \u2603) {
        this.c = pk.b++;
        this.j = 1.0;
        this.f = pk.a;
        this.J = 0.6f;
        this.K = 1.8f;
        this.h = 1;
        this.V = new Random();
        this.X = 1;
        this.aa = true;
        this.aq = ns.a(this.V);
        this.au = new n();
        this.o = \u2603;
        this.b(0.0, 0.0, 0.0);
        if (\u2603 != null) {
            this.am = \u2603.t.q();
        }
        (this.ac = new pz(this)).a(0, (Byte)0);
        this.ac.a(1, (Short)300);
        this.ac.a(3, (Byte)0);
        this.ac.a(2, "");
        this.ac.a(4, (Byte)0);
        this.h();
    }
    
    protected abstract void h();
    
    public pz H() {
        return this.ac;
    }
    
    @Override
    public boolean equals(final Object \u2603) {
        return \u2603 instanceof pk && ((pk)\u2603).c == this.c;
    }
    
    @Override
    public int hashCode() {
        return this.c;
    }
    
    protected void I() {
        if (this.o == null) {
            return;
        }
        while (this.t > 0.0 && this.t < 256.0) {
            this.b(this.s, this.t, this.u);
            if (this.o.a(this, this.aR()).isEmpty()) {
                break;
            }
            ++this.t;
        }
        final double v = 0.0;
        this.x = v;
        this.w = v;
        this.v = v;
        this.z = 0.0f;
    }
    
    public void J() {
        this.I = true;
    }
    
    protected void a(final float \u2603, final float \u2603) {
        if (\u2603 != this.J || \u2603 != this.K) {
            final float j = this.J;
            this.J = \u2603;
            this.K = \u2603;
            this.a(new aug(this.aR().a, this.aR().b, this.aR().c, this.aR().a + this.J, this.aR().b + this.K, this.aR().c + this.J));
            if (this.J > j && !this.aa && !this.o.D) {
                this.d(j - this.J, 0.0, j - this.J);
            }
        }
    }
    
    protected void b(final float \u2603, final float \u2603) {
        this.y = \u2603 % 360.0f;
        this.z = \u2603 % 360.0f;
    }
    
    public void b(final double \u2603, final double \u2603, final double \u2603) {
        this.s = \u2603;
        this.t = \u2603;
        this.u = \u2603;
        final float n = this.J / 2.0f;
        final float k = this.K;
        this.a(new aug(\u2603 - n, \u2603, \u2603 - n, \u2603 + n, \u2603 + k, \u2603 + n));
    }
    
    public void c(final float \u2603, final float \u2603) {
        final float z = this.z;
        final float y = this.y;
        this.y += (float)(\u2603 * 0.15);
        this.z -= (float)(\u2603 * 0.15);
        this.z = ns.a(this.z, -90.0f, 90.0f);
        this.B += this.z - z;
        this.A += this.y - y;
    }
    
    public void t_() {
        this.K();
    }
    
    public void K() {
        this.o.B.a("entityBaseTick");
        if (this.m != null && this.m.I) {
            this.m = null;
        }
        this.L = this.M;
        this.p = this.s;
        this.q = this.t;
        this.r = this.u;
        this.B = this.z;
        this.A = this.y;
        if (!this.o.D && this.o instanceof le) {
            this.o.B.a("portal");
            final MinecraftServer r = ((le)this.o).r();
            final int l = this.L();
            if (this.ak) {
                if (r.C()) {
                    if (this.m == null && this.al++ >= l) {
                        this.al = l;
                        this.aj = this.aq();
                        int \u2603;
                        if (this.o.t.q() == -1) {
                            \u2603 = 0;
                        }
                        else {
                            \u2603 = -1;
                        }
                        this.c(\u2603);
                    }
                    this.ak = false;
                }
            }
            else {
                if (this.al > 0) {
                    this.al -= 4;
                }
                if (this.al < 0) {
                    this.al = 0;
                }
            }
            if (this.aj > 0) {
                --this.aj;
            }
            this.o.B.b();
        }
        this.Y();
        this.W();
        if (this.o.D) {
            this.i = 0;
        }
        else if (this.i > 0) {
            if (this.ab) {
                this.i -= 4;
                if (this.i < 0) {
                    this.i = 0;
                }
            }
            else {
                if (this.i % 20 == 0) {
                    this.a(ow.c, 1.0f);
                }
                --this.i;
            }
        }
        if (this.ab()) {
            this.M();
            this.O *= 0.5f;
        }
        if (this.t < -64.0) {
            this.O();
        }
        if (!this.o.D) {
            this.b(0, this.i > 0);
        }
        this.aa = false;
        this.o.B.b();
    }
    
    public int L() {
        return 0;
    }
    
    protected void M() {
        if (this.ab) {
            return;
        }
        this.a(ow.d, 4.0f);
        this.e(15);
    }
    
    public void e(final int \u2603) {
        int a = \u2603 * 20;
        a = acr.a(this, a);
        if (this.i < a) {
            this.i = a;
        }
    }
    
    public void N() {
        this.i = 0;
    }
    
    protected void O() {
        this.J();
    }
    
    public boolean c(final double \u2603, final double \u2603, final double \u2603) {
        final aug c = this.aR().c(\u2603, \u2603, \u2603);
        return this.b(c);
    }
    
    private boolean b(final aug \u2603) {
        return this.o.a(this, \u2603).isEmpty() && !this.o.d(\u2603);
    }
    
    public void d(double \u2603, double \u2603, double \u2603) {
        if (this.T) {
            this.a(this.aR().c(\u2603, \u2603, \u2603));
            this.m();
            return;
        }
        this.o.B.a("move");
        final double s = this.s;
        final double t = this.t;
        final double u = this.u;
        if (this.H) {
            this.H = false;
            \u2603 *= 0.25;
            \u2603 *= 0.05000000074505806;
            \u2603 *= 0.25;
            this.v = 0.0;
            this.w = 0.0;
            this.x = 0.0;
        }
        double n = \u2603;
        final double n2 = \u2603;
        double n3 = \u2603;
        final boolean b = this.C && this.av() && this instanceof wn;
        if (b) {
            final double n4 = 0.05;
            while (\u2603 != 0.0 && this.o.a(this, this.aR().c(\u2603, -1.0, 0.0)).isEmpty()) {
                if (\u2603 < n4 && \u2603 >= -n4) {
                    \u2603 = 0.0;
                }
                else if (\u2603 > 0.0) {
                    \u2603 -= n4;
                }
                else {
                    \u2603 += n4;
                }
                n = \u2603;
            }
            while (\u2603 != 0.0 && this.o.a(this, this.aR().c(0.0, -1.0, \u2603)).isEmpty()) {
                if (\u2603 < n4 && \u2603 >= -n4) {
                    \u2603 = 0.0;
                }
                else if (\u2603 > 0.0) {
                    \u2603 -= n4;
                }
                else {
                    \u2603 += n4;
                }
                n3 = \u2603;
            }
            while (\u2603 != 0.0 && \u2603 != 0.0 && this.o.a(this, this.aR().c(\u2603, -1.0, \u2603)).isEmpty()) {
                if (\u2603 < n4 && \u2603 >= -n4) {
                    \u2603 = 0.0;
                }
                else if (\u2603 > 0.0) {
                    \u2603 -= n4;
                }
                else {
                    \u2603 += n4;
                }
                n = \u2603;
                if (\u2603 < n4 && \u2603 >= -n4) {
                    \u2603 = 0.0;
                }
                else if (\u2603 > 0.0) {
                    \u2603 -= n4;
                }
                else {
                    \u2603 += n4;
                }
                n3 = \u2603;
            }
        }
        final List<aug> a = this.o.a(this, this.aR().a(\u2603, \u2603, \u2603));
        final aug ar = this.aR();
        for (final aug aug : a) {
            \u2603 = aug.b(this.aR(), \u2603);
        }
        this.a(this.aR().c(0.0, \u2603, 0.0));
        final boolean b2 = this.C || (n2 != \u2603 && n2 < 0.0);
        for (final aug aug2 : a) {
            \u2603 = aug2.a(this.aR(), \u2603);
        }
        this.a(this.aR().c(\u2603, 0.0, 0.0));
        for (final aug aug2 : a) {
            \u2603 = aug2.c(this.aR(), \u2603);
        }
        this.a(this.aR().c(0.0, 0.0, \u2603));
        if (this.S > 0.0f && b2 && (n != \u2603 || n3 != \u2603)) {
            final double n5 = \u2603;
            final double n6 = \u2603;
            final double n7 = \u2603;
            final aug ar2 = this.aR();
            this.a(ar);
            \u2603 = n;
            \u2603 = this.S;
            \u2603 = n3;
            final List<aug> a2 = this.o.a(this, this.aR().a(\u2603, \u2603, \u2603));
            aug \u26032 = this.aR();
            final aug a3 = \u26032.a(\u2603, 0.0, \u2603);
            double b3 = \u2603;
            for (final aug aug3 : a2) {
                b3 = aug3.b(a3, b3);
            }
            \u26032 = \u26032.c(0.0, b3, 0.0);
            double a4 = \u2603;
            for (final aug aug4 : a2) {
                a4 = aug4.a(\u26032, a4);
            }
            \u26032 = \u26032.c(a4, 0.0, 0.0);
            double c = \u2603;
            for (final aug aug5 : a2) {
                c = aug5.c(\u26032, c);
            }
            \u26032 = \u26032.c(0.0, 0.0, c);
            aug aug6 = this.aR();
            double b4 = \u2603;
            for (final aug aug7 : a2) {
                b4 = aug7.b(aug6, b4);
            }
            aug6 = aug6.c(0.0, b4, 0.0);
            double a5 = \u2603;
            for (final aug aug8 : a2) {
                a5 = aug8.a(aug6, a5);
            }
            aug6 = aug6.c(a5, 0.0, 0.0);
            double c2 = \u2603;
            for (final aug aug9 : a2) {
                c2 = aug9.c(aug6, c2);
            }
            aug6 = aug6.c(0.0, 0.0, c2);
            final double n8 = a4 * a4 + c * c;
            final double n9 = a5 * a5 + c2 * c2;
            if (n8 > n9) {
                \u2603 = a4;
                \u2603 = c;
                \u2603 = -b3;
                this.a(\u26032);
            }
            else {
                \u2603 = a5;
                \u2603 = c2;
                \u2603 = -b4;
                this.a(aug6);
            }
            for (final aug aug10 : a2) {
                \u2603 = aug10.b(this.aR(), \u2603);
            }
            this.a(this.aR().c(0.0, \u2603, 0.0));
            if (n5 * n5 + n7 * n7 >= \u2603 * \u2603 + \u2603 * \u2603) {
                \u2603 = n5;
                \u2603 = n6;
                \u2603 = n7;
                this.a(ar2);
            }
        }
        this.o.B.b();
        this.o.B.a("rest");
        this.m();
        this.D = (n != \u2603 || n3 != \u2603);
        this.E = (n2 != \u2603);
        this.C = (this.E && n2 < 0.0);
        this.F = (this.D || this.E);
        final int c3 = ns.c(this.s);
        final int c4 = ns.c(this.t - 0.20000000298023224);
        final int c5 = ns.c(this.u);
        cj b5 = new cj(c3, c4, c5);
        afh c6 = this.o.p(b5).c();
        if (c6.t() == arm.a) {
            final afh c7 = this.o.p(b5.b()).c();
            if (c7 instanceof agt || c7 instanceof akl || c7 instanceof agu) {
                c6 = c7;
                b5 = b5.b();
            }
        }
        this.a(\u2603, this.C, c6, b5);
        if (n != \u2603) {
            this.v = 0.0;
        }
        if (n3 != \u2603) {
            this.x = 0.0;
        }
        if (n2 != \u2603) {
            c6.a(this.o, this);
        }
        if (this.s_() && !b && this.m == null) {
            final double n10 = this.s - s;
            double n11 = this.t - t;
            final double n12 = this.u - u;
            if (c6 != afi.au) {
                n11 = 0.0;
            }
            if (c6 != null && this.C) {
                c6.a(this.o, b5, this);
            }
            this.M += (float)(ns.a(n10 * n10 + n12 * n12) * 0.6);
            this.N += (float)(ns.a(n10 * n10 + n11 * n11 + n12 * n12) * 0.6);
            if (this.N > this.h && c6.t() != arm.a) {
                this.h = (int)this.N + 1;
                if (this.V()) {
                    float \u26033 = ns.a(this.v * this.v * 0.20000000298023224 + this.w * this.w + this.x * this.x * 0.20000000298023224) * 0.35f;
                    if (\u26033 > 1.0f) {
                        \u26033 = 1.0f;
                    }
                    this.a(this.P(), \u26033, 1.0f + (this.V.nextFloat() - this.V.nextFloat()) * 0.4f);
                }
                this.a(b5, c6);
            }
        }
        try {
            this.Q();
        }
        catch (Throwable \u26034) {
            final b a6 = b.a(\u26034, "Checking entity block collision");
            final c a7 = a6.a("Entity being checked for collision");
            this.a(a7);
            throw new e(a6);
        }
        final boolean u2 = this.U();
        if (this.o.e(this.aR().d(0.001, 0.001, 0.001))) {
            this.f(1);
            if (!u2) {
                ++this.i;
                if (this.i == 0) {
                    this.e(8);
                }
            }
        }
        else if (this.i <= 0) {
            this.i = -this.X;
        }
        if (u2 && this.i > 0) {
            this.a("random.fizz", 0.7f, 1.6f + (this.V.nextFloat() - this.V.nextFloat()) * 0.4f);
            this.i = -this.X;
        }
        this.o.B.b();
    }
    
    private void m() {
        this.s = (this.aR().a + this.aR().d) / 2.0;
        this.t = this.aR().b;
        this.u = (this.aR().c + this.aR().f) / 2.0;
    }
    
    protected String P() {
        return "game.neutral.swim";
    }
    
    protected void Q() {
        final cj \u2603 = new cj(this.aR().a + 0.001, this.aR().b + 0.001, this.aR().c + 0.001);
        final cj \u26032 = new cj(this.aR().d - 0.001, this.aR().e - 0.001, this.aR().f - 0.001);
        if (this.o.a(\u2603, \u26032)) {
            for (int i = \u2603.n(); i <= \u26032.n(); ++i) {
                for (int j = \u2603.o(); j <= \u26032.o(); ++j) {
                    for (int k = \u2603.p(); k <= \u26032.p(); ++k) {
                        final cj \u26033 = new cj(i, j, k);
                        final alz p = this.o.p(\u26033);
                        try {
                            p.c().a(this.o, \u26033, p, this);
                        }
                        catch (Throwable \u26034) {
                            final b a = b.a(\u26034, "Colliding entity with block");
                            final c a2 = a.a("Block being collided with");
                            c.a(a2, \u26033, p);
                            throw new e(a);
                        }
                    }
                }
            }
        }
    }
    
    protected void a(final cj \u2603, final afh \u2603) {
        afh.b b = \u2603.H;
        if (this.o.p(\u2603.a()).c() == afi.aH) {
            b = afi.aH.H;
            this.a(b.c(), b.d() * 0.15f, b.e());
        }
        else if (!\u2603.t().d()) {
            this.a(b.c(), b.d() * 0.15f, b.e());
        }
    }
    
    public void a(final String \u2603, final float \u2603, final float \u2603) {
        if (!this.R()) {
            this.o.a(this, \u2603, \u2603, \u2603);
        }
    }
    
    public boolean R() {
        return this.ac.a(4) == 1;
    }
    
    public void b(final boolean \u2603) {
        this.ac.b(4, (byte)(\u2603 ? 1 : 0));
    }
    
    protected boolean s_() {
        return true;
    }
    
    protected void a(final double \u2603, final boolean \u2603, final afh \u2603, final cj \u2603) {
        if (\u2603) {
            if (this.O > 0.0f) {
                if (\u2603 != null) {
                    \u2603.a(this.o, \u2603, this, this.O);
                }
                else {
                    this.e(this.O, 1.0f);
                }
                this.O = 0.0f;
            }
        }
        else if (\u2603 < 0.0) {
            this.O -= (float)\u2603;
        }
    }
    
    public aug S() {
        return null;
    }
    
    protected void f(final int \u2603) {
        if (!this.ab) {
            this.a(ow.a, (float)\u2603);
        }
    }
    
    public final boolean T() {
        return this.ab;
    }
    
    public void e(final float \u2603, final float \u2603) {
        if (this.l != null) {
            this.l.e(\u2603, \u2603);
        }
    }
    
    public boolean U() {
        return this.Y || this.o.C(new cj(this.s, this.t, this.u)) || this.o.C(new cj(this.s, this.t + this.K, this.u));
    }
    
    public boolean V() {
        return this.Y;
    }
    
    public boolean W() {
        if (this.o.a(this.aR().b(0.0, -0.4000000059604645, 0.0).d(0.001, 0.001, 0.001), arm.h, this)) {
            if (!this.Y && !this.aa) {
                this.X();
            }
            this.O = 0.0f;
            this.Y = true;
            this.i = 0;
        }
        else {
            this.Y = false;
        }
        return this.Y;
    }
    
    protected void X() {
        float \u2603 = ns.a(this.v * this.v * 0.20000000298023224 + this.w * this.w + this.x * this.x * 0.20000000298023224) * 0.2f;
        if (\u2603 > 1.0f) {
            \u2603 = 1.0f;
        }
        this.a(this.aa(), \u2603, 1.0f + (this.V.nextFloat() - this.V.nextFloat()) * 0.4f);
        final float n = (float)ns.c(this.aR().b);
        for (int n2 = 0; n2 < 1.0f + this.J * 20.0f; ++n2) {
            final float n3 = (this.V.nextFloat() * 2.0f - 1.0f) * this.J;
            final float n4 = (this.V.nextFloat() * 2.0f - 1.0f) * this.J;
            this.o.a(cy.e, this.s + n3, n + 1.0f, this.u + n4, this.v, this.w - this.V.nextFloat() * 0.2f, this.x, new int[0]);
        }
        for (int n2 = 0; n2 < 1.0f + this.J * 20.0f; ++n2) {
            final float n3 = (this.V.nextFloat() * 2.0f - 1.0f) * this.J;
            final float n4 = (this.V.nextFloat() * 2.0f - 1.0f) * this.J;
            this.o.a(cy.f, this.s + n3, n + 1.0f, this.u + n4, this.v, this.w, this.x, new int[0]);
        }
    }
    
    public void Y() {
        if (this.aw() && !this.V()) {
            this.Z();
        }
    }
    
    protected void Z() {
        final int c = ns.c(this.s);
        final int c2 = ns.c(this.t - 0.20000000298023224);
        final int c3 = ns.c(this.u);
        final cj \u2603 = new cj(c, c2, c3);
        final alz p = this.o.p(\u2603);
        final afh c4 = p.c();
        if (c4.b() != -1) {
            this.o.a(cy.L, this.s + (this.V.nextFloat() - 0.5) * this.J, this.aR().b + 0.1, this.u + (this.V.nextFloat() - 0.5) * this.J, -this.v * 4.0, 1.5, -this.x * 4.0, afh.f(p));
        }
    }
    
    protected String aa() {
        return "game.neutral.swim.splash";
    }
    
    public boolean a(final arm \u2603) {
        final double \u26032 = this.t + this.aS();
        final cj \u26033 = new cj(this.s, \u26032, this.u);
        final alz p = this.o.p(\u26033);
        final afh c = p.c();
        if (c.t() == \u2603) {
            final float n = ahv.b(p.c().c(p)) - 0.11111111f;
            final float n2 = \u26033.o() + 1 - n;
            final boolean b = \u26032 < n2;
            return (b || !(this instanceof wn)) && b;
        }
        return false;
    }
    
    public boolean ab() {
        return this.o.a(this.aR().b(-0.10000000149011612, -0.4000000059604645, -0.10000000149011612), arm.i);
    }
    
    public void a(float \u2603, float \u2603, final float \u2603) {
        float c = \u2603 * \u2603 + \u2603 * \u2603;
        if (c < 1.0E-4f) {
            return;
        }
        c = ns.c(c);
        if (c < 1.0f) {
            c = 1.0f;
        }
        c = \u2603 / c;
        \u2603 *= c;
        \u2603 *= c;
        final float a = ns.a(this.y * 3.1415927f / 180.0f);
        final float b = ns.b(this.y * 3.1415927f / 180.0f);
        this.v += \u2603 * b - \u2603 * a;
        this.x += \u2603 * b + \u2603 * a;
    }
    
    public int b(final float \u2603) {
        final cj cj = new cj(this.s, this.t + this.aS(), this.u);
        if (this.o.e(cj)) {
            return this.o.b(cj, 0);
        }
        return 0;
    }
    
    public float c(final float \u2603) {
        final cj cj = new cj(this.s, this.t + this.aS(), this.u);
        if (this.o.e(cj)) {
            return this.o.o(cj);
        }
        return 0.0f;
    }
    
    public void a(final adm \u2603) {
        this.o = \u2603;
    }
    
    public void a(final double \u2603, final double \u2603, final double \u2603, final float \u2603, final float \u2603) {
        this.s = \u2603;
        this.p = \u2603;
        this.t = \u2603;
        this.q = \u2603;
        this.u = \u2603;
        this.r = \u2603;
        this.y = \u2603;
        this.A = \u2603;
        this.z = \u2603;
        this.B = \u2603;
        final double n = this.A - \u2603;
        if (n < -180.0) {
            this.A += 360.0f;
        }
        if (n >= 180.0) {
            this.A -= 360.0f;
        }
        this.b(this.s, this.t, this.u);
        this.b(\u2603, \u2603);
    }
    
    public void a(final cj \u2603, final float \u2603, final float \u2603) {
        this.b(\u2603.n() + 0.5, \u2603.o(), \u2603.p() + 0.5, \u2603, \u2603);
    }
    
    public void b(final double \u2603, final double \u2603, final double \u2603, final float \u2603, final float \u2603) {
        this.s = \u2603;
        this.p = \u2603;
        this.P = \u2603;
        this.t = \u2603;
        this.q = \u2603;
        this.Q = \u2603;
        this.u = \u2603;
        this.r = \u2603;
        this.R = \u2603;
        this.y = \u2603;
        this.z = \u2603;
        this.b(this.s, this.t, this.u);
    }
    
    public float g(final pk \u2603) {
        final float n = (float)(this.s - \u2603.s);
        final float n2 = (float)(this.t - \u2603.t);
        final float n3 = (float)(this.u - \u2603.u);
        return ns.c(n * n + n2 * n2 + n3 * n3);
    }
    
    public double e(final double \u2603, final double \u2603, final double \u2603) {
        final double n = this.s - \u2603;
        final double n2 = this.t - \u2603;
        final double n3 = this.u - \u2603;
        return n * n + n2 * n2 + n3 * n3;
    }
    
    public double b(final cj \u2603) {
        return \u2603.c(this.s, this.t, this.u);
    }
    
    public double c(final cj \u2603) {
        return \u2603.d(this.s, this.t, this.u);
    }
    
    public double f(final double \u2603, final double \u2603, final double \u2603) {
        final double n = this.s - \u2603;
        final double n2 = this.t - \u2603;
        final double n3 = this.u - \u2603;
        return ns.a(n * n + n2 * n2 + n3 * n3);
    }
    
    public double h(final pk \u2603) {
        final double n = this.s - \u2603.s;
        final double n2 = this.t - \u2603.t;
        final double n3 = this.u - \u2603.u;
        return n * n + n2 * n2 + n3 * n3;
    }
    
    public void d(final wn \u2603) {
    }
    
    public void i(final pk \u2603) {
        if (\u2603.l == this || \u2603.m == this) {
            return;
        }
        if (\u2603.T || this.T) {
            return;
        }
        double n = \u2603.s - this.s;
        double n2 = \u2603.u - this.u;
        double a = ns.a(n, n2);
        if (a >= 0.009999999776482582) {
            a = ns.a(a);
            n /= a;
            n2 /= a;
            double n3 = 1.0 / a;
            if (n3 > 1.0) {
                n3 = 1.0;
            }
            n *= n3;
            n2 *= n3;
            n *= 0.05000000074505806;
            n2 *= 0.05000000074505806;
            n *= 1.0f - this.U;
            n2 *= 1.0f - this.U;
            if (this.l == null) {
                this.g(-n, 0.0, -n2);
            }
            if (\u2603.l == null) {
                \u2603.g(n, 0.0, n2);
            }
        }
    }
    
    public void g(final double \u2603, final double \u2603, final double \u2603) {
        this.v += \u2603;
        this.w += \u2603;
        this.x += \u2603;
        this.ai = true;
    }
    
    protected void ac() {
        this.G = true;
    }
    
    public boolean a(final ow \u2603, final float \u2603) {
        if (this.b(\u2603)) {
            return false;
        }
        this.ac();
        return false;
    }
    
    public aui d(final float \u2603) {
        if (\u2603 == 1.0f) {
            return this.f(this.z, this.y);
        }
        final float \u26032 = this.B + (this.z - this.B) * \u2603;
        final float \u26033 = this.A + (this.y - this.A) * \u2603;
        return this.f(\u26032, \u26033);
    }
    
    protected final aui f(final float \u2603, final float \u2603) {
        final float b = ns.b(-\u2603 * 0.017453292f - 3.1415927f);
        final float a = ns.a(-\u2603 * 0.017453292f - 3.1415927f);
        final float n = -ns.b(-\u2603 * 0.017453292f);
        final float a2 = ns.a(-\u2603 * 0.017453292f);
        return new aui(a * n, a2, b * n);
    }
    
    public aui e(final float \u2603) {
        if (\u2603 == 1.0f) {
            return new aui(this.s, this.t + this.aS(), this.u);
        }
        final double \u26032 = this.p + (this.s - this.p) * \u2603;
        final double \u26033 = this.q + (this.t - this.q) * \u2603 + this.aS();
        final double \u26034 = this.r + (this.u - this.r) * \u2603;
        return new aui(\u26032, \u26033, \u26034);
    }
    
    public auh a(final double \u2603, final float \u2603) {
        final aui e = this.e(\u2603);
        final aui d = this.d(\u2603);
        final aui b = e.b(d.a * \u2603, d.b * \u2603, d.c * \u2603);
        return this.o.a(e, b, false, false, true);
    }
    
    public boolean ad() {
        return false;
    }
    
    public boolean ae() {
        return false;
    }
    
    public void b(final pk \u2603, final int \u2603) {
    }
    
    public boolean h(final double \u2603, final double \u2603, final double \u2603) {
        final double n = this.s - \u2603;
        final double n2 = this.t - \u2603;
        final double n3 = this.u - \u2603;
        final double \u26032 = n * n + n2 * n2 + n3 * n3;
        return this.a(\u26032);
    }
    
    public boolean a(final double \u2603) {
        double a = this.aR().a();
        if (Double.isNaN(a)) {
            a = 1.0;
        }
        a *= 64.0 * this.j;
        return \u2603 < a * a;
    }
    
    public boolean c(final dn \u2603) {
        final String ag = this.ag();
        if (this.I || ag == null) {
            return false;
        }
        \u2603.a("id", ag);
        this.e(\u2603);
        return true;
    }
    
    public boolean d(final dn \u2603) {
        final String ag = this.ag();
        if (this.I || ag == null || this.l != null) {
            return false;
        }
        \u2603.a("id", ag);
        this.e(\u2603);
        return true;
    }
    
    public void e(final dn \u2603) {
        try {
            \u2603.a("Pos", this.a(new double[] { this.s, this.t, this.u }));
            \u2603.a("Motion", this.a(new double[] { this.v, this.w, this.x }));
            \u2603.a("Rotation", this.a(new float[] { this.y, this.z }));
            \u2603.a("FallDistance", this.O);
            \u2603.a("Fire", (short)this.i);
            \u2603.a("Air", (short)this.az());
            \u2603.a("OnGround", this.C);
            \u2603.a("Dimension", this.am);
            \u2603.a("Invulnerable", this.at);
            \u2603.a("PortalCooldown", this.aj);
            \u2603.a("UUIDMost", this.aK().getMostSignificantBits());
            \u2603.a("UUIDLeast", this.aK().getLeastSignificantBits());
            if (this.aM() != null && this.aM().length() > 0) {
                \u2603.a("CustomName", this.aM());
                \u2603.a("CustomNameVisible", this.aN());
            }
            this.au.b(\u2603);
            if (this.R()) {
                \u2603.a("Silent", this.R());
            }
            this.b(\u2603);
            if (this.m != null) {
                final dn dn = new dn();
                if (this.m.c(dn)) {
                    \u2603.a("Riding", dn);
                }
            }
        }
        catch (Throwable \u26032) {
            final b a = b.a(\u26032, "Saving entity NBT");
            final c a2 = a.a("Entity being saved");
            this.a(a2);
            throw new e(a);
        }
    }
    
    public void f(final dn \u2603) {
        try {
            final du c = \u2603.c("Pos", 6);
            final du c2 = \u2603.c("Motion", 6);
            final du c3 = \u2603.c("Rotation", 5);
            this.v = c2.d(0);
            this.w = c2.d(1);
            this.x = c2.d(2);
            if (Math.abs(this.v) > 10.0) {
                this.v = 0.0;
            }
            if (Math.abs(this.w) > 10.0) {
                this.w = 0.0;
            }
            if (Math.abs(this.x) > 10.0) {
                this.x = 0.0;
            }
            final double d = c.d(0);
            this.s = d;
            this.P = d;
            this.p = d;
            final double d2 = c.d(1);
            this.t = d2;
            this.Q = d2;
            this.q = d2;
            final double d3 = c.d(2);
            this.u = d3;
            this.R = d3;
            this.r = d3;
            final float e = c3.e(0);
            this.y = e;
            this.A = e;
            final float e2 = c3.e(1);
            this.z = e2;
            this.B = e2;
            this.f(this.y);
            this.g(this.y);
            this.O = \u2603.h("FallDistance");
            this.i = \u2603.e("Fire");
            this.h(\u2603.e("Air"));
            this.C = \u2603.n("OnGround");
            this.am = \u2603.f("Dimension");
            this.at = \u2603.n("Invulnerable");
            this.aj = \u2603.f("PortalCooldown");
            if (\u2603.b("UUIDMost", 4) && \u2603.b("UUIDLeast", 4)) {
                this.aq = new UUID(\u2603.g("UUIDMost"), \u2603.g("UUIDLeast"));
            }
            else if (\u2603.b("UUID", 8)) {
                this.aq = UUID.fromString(\u2603.j("UUID"));
            }
            this.b(this.s, this.t, this.u);
            this.b(this.y, this.z);
            if (\u2603.b("CustomName", 8) && \u2603.j("CustomName").length() > 0) {
                this.a(\u2603.j("CustomName"));
            }
            this.g(\u2603.n("CustomNameVisible"));
            this.au.a(\u2603);
            this.b(\u2603.n("Silent"));
            this.a(\u2603);
            if (this.af()) {
                this.b(this.s, this.t, this.u);
            }
        }
        catch (Throwable \u26032) {
            final b a = b.a(\u26032, "Loading entity NBT");
            final c a2 = a.a("Entity being loaded");
            this.a(a2);
            throw new e(a);
        }
    }
    
    protected boolean af() {
        return true;
    }
    
    protected final String ag() {
        return pm.b(this);
    }
    
    protected abstract void a(final dn p0);
    
    protected abstract void b(final dn p0);
    
    public void ah() {
    }
    
    protected du a(final double... \u2603) {
        final du du = new du();
        for (final double \u26032 : \u2603) {
            du.a(new dp(\u26032));
        }
        return du;
    }
    
    protected du a(final float... \u2603) {
        final du du = new du();
        for (final float \u26032 : \u2603) {
            du.a(new dr(\u26032));
        }
        return du;
    }
    
    public uz a(final zw \u2603, final int \u2603) {
        return this.a(\u2603, \u2603, 0.0f);
    }
    
    public uz a(final zw \u2603, final int \u2603, final float \u2603) {
        return this.a(new zx(\u2603, \u2603, 0), \u2603);
    }
    
    public uz a(final zx \u2603, final float \u2603) {
        if (\u2603.b == 0 || \u2603.b() == null) {
            return null;
        }
        final uz \u26032 = new uz(this.o, this.s, this.t + \u2603, this.u, \u2603);
        \u26032.p();
        this.o.d(\u26032);
        return \u26032;
    }
    
    public boolean ai() {
        return !this.I;
    }
    
    public boolean aj() {
        if (this.T) {
            return false;
        }
        final cj.a \u2603 = new cj.a(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        for (int i = 0; i < 8; ++i) {
            final int c = ns.c(this.t + ((i >> 0) % 2 - 0.5f) * 0.1f + this.aS());
            final int c2 = ns.c(this.s + ((i >> 1) % 2 - 0.5f) * this.J * 0.8f);
            final int c3 = ns.c(this.u + ((i >> 2) % 2 - 0.5f) * this.J * 0.8f);
            if (\u2603.n() != c2 || \u2603.o() != c || \u2603.p() != c3) {
                \u2603.c(c2, c, c3);
                if (this.o.p(\u2603).c().w()) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public boolean e(final wn \u2603) {
        return false;
    }
    
    public aug j(final pk \u2603) {
        return null;
    }
    
    public void ak() {
        if (this.m.I) {
            this.m = null;
            return;
        }
        this.v = 0.0;
        this.w = 0.0;
        this.x = 0.0;
        this.t_();
        if (this.m == null) {
            return;
        }
        this.m.al();
        this.as += this.m.y - this.m.A;
        this.ar += this.m.z - this.m.B;
        while (this.as >= 180.0) {
            this.as -= 360.0;
        }
        while (this.as < -180.0) {
            this.as += 360.0;
        }
        while (this.ar >= 180.0) {
            this.ar -= 360.0;
        }
        while (this.ar < -180.0) {
            this.ar += 360.0;
        }
        double n = this.as * 0.5;
        double n2 = this.ar * 0.5;
        final float n3 = 10.0f;
        if (n > n3) {
            n = n3;
        }
        if (n < -n3) {
            n = -n3;
        }
        if (n2 > n3) {
            n2 = n3;
        }
        if (n2 < -n3) {
            n2 = -n3;
        }
        this.as -= n;
        this.ar -= n2;
    }
    
    public void al() {
        if (this.l == null) {
            return;
        }
        this.l.b(this.s, this.t + this.an() + this.l.am(), this.u);
    }
    
    public double am() {
        return 0.0;
    }
    
    public double an() {
        return this.K * 0.75;
    }
    
    public void a(final pk \u2603) {
        this.ar = 0.0;
        this.as = 0.0;
        if (\u2603 == null) {
            if (this.m != null) {
                this.b(this.m.s, this.m.aR().b + this.m.K, this.m.u, this.y, this.z);
                this.m.l = null;
            }
            this.m = null;
            return;
        }
        if (this.m != null) {
            this.m.l = null;
        }
        if (\u2603 != null) {
            for (pk pk = \u2603.m; pk != null; pk = pk.m) {
                if (pk == this) {
                    return;
                }
            }
        }
        this.m = \u2603;
        \u2603.l = this;
    }
    
    public void a(final double \u2603, double \u2603, final double \u2603, final float \u2603, final float \u2603, final int \u2603, final boolean \u2603) {
        this.b(\u2603, \u2603, \u2603);
        this.b(\u2603, \u2603);
        final List<aug> a = this.o.a(this, this.aR().d(0.03125, 0.0, 0.03125));
        if (!a.isEmpty()) {
            double e = 0.0;
            for (final aug aug : a) {
                if (aug.e > e) {
                    e = aug.e;
                }
            }
            \u2603 += e - this.aR().b;
            this.b(\u2603, \u2603, \u2603);
        }
    }
    
    public float ao() {
        return 0.1f;
    }
    
    public aui ap() {
        return null;
    }
    
    public void d(final cj \u2603) {
        if (this.aj > 0) {
            this.aj = this.aq();
            return;
        }
        if (!this.o.D && !\u2603.equals(this.an)) {
            this.an = \u2603;
            final amd.b f = afi.aY.f(this.o, \u2603);
            final double \u26032 = (f.b().k() == cq.a.a) ? f.a().p() : ((double)f.a().n());
            double abs = (f.b().k() == cq.a.a) ? this.u : this.s;
            abs = Math.abs(ns.c(abs - (double)((f.b().e().c() == cq.b.b) ? 1 : 0), \u26032, \u26032 - f.d()));
            final double c = ns.c(this.t - 1.0, f.a().o(), f.a().o() - f.e());
            this.ao = new aui(abs, c, 0.0);
            this.ap = f.b();
        }
        this.ak = true;
    }
    
    public int aq() {
        return 300;
    }
    
    public void i(final double \u2603, final double \u2603, final double \u2603) {
        this.v = \u2603;
        this.w = \u2603;
        this.x = \u2603;
    }
    
    public void a(final byte \u2603) {
    }
    
    public void ar() {
    }
    
    public zx[] as() {
        return null;
    }
    
    public void c(final int \u2603, final zx \u2603) {
    }
    
    public boolean at() {
        final boolean b = this.o != null && this.o.D;
        return !this.ab && (this.i > 0 || (b && this.g(0)));
    }
    
    public boolean au() {
        return this.m != null;
    }
    
    public boolean av() {
        return this.g(1);
    }
    
    public void c(final boolean \u2603) {
        this.b(1, \u2603);
    }
    
    public boolean aw() {
        return this.g(3);
    }
    
    public void d(final boolean \u2603) {
        this.b(3, \u2603);
    }
    
    public boolean ax() {
        return this.g(5);
    }
    
    public boolean f(final wn \u2603) {
        return !\u2603.v() && this.ax();
    }
    
    public void e(final boolean \u2603) {
        this.b(5, \u2603);
    }
    
    public boolean ay() {
        return this.g(4);
    }
    
    public void f(final boolean \u2603) {
        this.b(4, \u2603);
    }
    
    protected boolean g(final int \u2603) {
        return (this.ac.a(0) & 1 << \u2603) != 0x0;
    }
    
    protected void b(final int \u2603, final boolean \u2603) {
        final byte a = this.ac.a(0);
        if (\u2603) {
            this.ac.b(0, (byte)(a | 1 << \u2603));
        }
        else {
            this.ac.b(0, (byte)(a & ~(1 << \u2603)));
        }
    }
    
    public int az() {
        return this.ac.b(1);
    }
    
    public void h(final int \u2603) {
        this.ac.b(1, (short)\u2603);
    }
    
    public void a(final uv \u2603) {
        this.a(ow.b, 5.0f);
        ++this.i;
        if (this.i == 0) {
            this.e(8);
        }
    }
    
    public void a(final pr \u2603) {
    }
    
    protected boolean j(final double \u2603, final double \u2603, final double \u2603) {
        final cj \u26032 = new cj(\u2603, \u2603, \u2603);
        final double n = \u2603 - \u26032.n();
        final double n2 = \u2603 - \u26032.o();
        final double n3 = \u2603 - \u26032.p();
        final List<aug> a = this.o.a(this.aR());
        if (!a.isEmpty() || this.o.u(\u26032)) {
            int n4 = 3;
            double n5 = 9999.0;
            if (!this.o.u(\u26032.e()) && n < n5) {
                n5 = n;
                n4 = 0;
            }
            if (!this.o.u(\u26032.f()) && 1.0 - n < n5) {
                n5 = 1.0 - n;
                n4 = 1;
            }
            if (!this.o.u(\u26032.a()) && 1.0 - n2 < n5) {
                n5 = 1.0 - n2;
                n4 = 3;
            }
            if (!this.o.u(\u26032.c()) && n3 < n5) {
                n5 = n3;
                n4 = 4;
            }
            if (!this.o.u(\u26032.d()) && 1.0 - n3 < n5) {
                n5 = 1.0 - n3;
                n4 = 5;
            }
            final float n6 = this.V.nextFloat() * 0.2f + 0.1f;
            if (n4 == 0) {
                this.v = -n6;
            }
            if (n4 == 1) {
                this.v = n6;
            }
            if (n4 == 3) {
                this.w = n6;
            }
            if (n4 == 4) {
                this.x = -n6;
            }
            if (n4 == 5) {
                this.x = n6;
            }
            return true;
        }
        return false;
    }
    
    public void aA() {
        this.H = true;
        this.O = 0.0f;
    }
    
    @Override
    public String e_() {
        if (this.l_()) {
            return this.aM();
        }
        String b = pm.b(this);
        if (b == null) {
            b = "generic";
        }
        return di.a("entity." + b + ".name");
    }
    
    public pk[] aB() {
        return null;
    }
    
    public boolean k(final pk \u2603) {
        return this == \u2603;
    }
    
    public float aC() {
        return 0.0f;
    }
    
    public void f(final float \u2603) {
    }
    
    public void g(final float \u2603) {
    }
    
    public boolean aD() {
        return true;
    }
    
    public boolean l(final pk \u2603) {
        return false;
    }
    
    @Override
    public String toString() {
        return String.format("%s['%s'/%d, l='%s', x=%.2f, y=%.2f, z=%.2f]", this.getClass().getSimpleName(), this.e_(), this.c, (this.o == null) ? "~NULL~" : this.o.P().k(), this.s, this.t, this.u);
    }
    
    public boolean b(final ow \u2603) {
        return this.at && \u2603 != ow.j && !\u2603.u();
    }
    
    public void m(final pk \u2603) {
        this.b(\u2603.s, \u2603.t, \u2603.u, \u2603.y, \u2603.z);
    }
    
    public void n(final pk \u2603) {
        final dn dn = new dn();
        \u2603.e(dn);
        this.f(dn);
        this.aj = \u2603.aj;
        this.an = \u2603.an;
        this.ao = \u2603.ao;
        this.ap = \u2603.ap;
    }
    
    public void c(final int \u2603) {
        if (this.o.D || this.I) {
            return;
        }
        this.o.B.a("changeDimension");
        final MinecraftServer n = MinecraftServer.N();
        final int am = this.am;
        final le a = n.a(am);
        le le = n.a(\u2603);
        this.am = \u2603;
        if (am == 1 && \u2603 == 1) {
            le = n.a(0);
            this.am = 0;
        }
        this.o.e(this);
        this.I = false;
        this.o.B.a("reposition");
        n.ap().a(this, am, a, le);
        this.o.B.c("reloading");
        final pk a2 = pm.a(pm.b(this), le);
        if (a2 != null) {
            a2.n(this);
            if (am == 1 && \u2603 == 1) {
                final cj r = this.o.r(le.M());
                a2.a(r, a2.y, a2.z);
            }
            le.d(a2);
        }
        this.I = true;
        this.o.B.b();
        a.j();
        le.j();
        this.o.B.b();
    }
    
    public float a(final adi \u2603, final adm \u2603, final cj \u2603, final alz \u2603) {
        return \u2603.c().a(this);
    }
    
    public boolean a(final adi \u2603, final adm \u2603, final cj \u2603, final alz \u2603, final float \u2603) {
        return true;
    }
    
    public int aE() {
        return 3;
    }
    
    public aui aG() {
        return this.ao;
    }
    
    public cq aH() {
        return this.ap;
    }
    
    public boolean aI() {
        return false;
    }
    
    public void a(final c \u2603) {
        \u2603.a("Entity Type", new Callable<String>() {
            public String a() throws Exception {
                return pm.b(pk.this) + " (" + pk.this.getClass().getCanonicalName() + ")";
            }
        });
        \u2603.a("Entity ID", this.c);
        \u2603.a("Entity Name", new Callable<String>() {
            public String a() throws Exception {
                return pk.this.e_();
            }
        });
        \u2603.a("Entity's Exact location", String.format("%.2f, %.2f, %.2f", this.s, this.t, this.u));
        \u2603.a("Entity's Block location", c.a(ns.c(this.s), ns.c(this.t), ns.c(this.u)));
        \u2603.a("Entity's Momentum", String.format("%.2f, %.2f, %.2f", this.v, this.w, this.x));
        \u2603.a("Entity's Rider", new Callable<String>() {
            public String a() throws Exception {
                return pk.this.l.toString();
            }
        });
        \u2603.a("Entity's Vehicle", new Callable<String>() {
            public String a() throws Exception {
                return pk.this.m.toString();
            }
        });
    }
    
    public boolean aJ() {
        return this.at();
    }
    
    public UUID aK() {
        return this.aq;
    }
    
    public boolean aL() {
        return true;
    }
    
    @Override
    public eu f_() {
        final fa fa = new fa(this.e_());
        fa.b().a(this.aQ());
        fa.b().a(this.aK().toString());
        return fa;
    }
    
    public void a(final String \u2603) {
        this.ac.b(2, \u2603);
    }
    
    public String aM() {
        return this.ac.e(2);
    }
    
    public boolean l_() {
        return this.ac.e(2).length() > 0;
    }
    
    public void g(final boolean \u2603) {
        this.ac.b(3, (byte)(\u2603 ? 1 : 0));
    }
    
    public boolean aN() {
        return this.ac.a(3) == 1;
    }
    
    public void a(final double \u2603, final double \u2603, final double \u2603) {
        this.b(\u2603, \u2603, \u2603, this.y, this.z);
    }
    
    public boolean aO() {
        return this.aN();
    }
    
    public void i(final int \u2603) {
    }
    
    public cq aP() {
        return cq.b(ns.c(this.y * 4.0f / 360.0f + 0.5) & 0x3);
    }
    
    protected ew aQ() {
        final dn dn = new dn();
        final String b = pm.b(this);
        dn.a("id", this.aK().toString());
        if (b != null) {
            dn.a("type", b);
        }
        dn.a("name", this.e_());
        return new ew(ew.a.d, new fa(dn.toString()));
    }
    
    public boolean a(final lf \u2603) {
        return true;
    }
    
    public aug aR() {
        return this.f;
    }
    
    public void a(final aug \u2603) {
        this.f = \u2603;
    }
    
    public float aS() {
        return this.K * 0.85f;
    }
    
    public boolean aT() {
        return this.g;
    }
    
    public void h(final boolean \u2603) {
        this.g = \u2603;
    }
    
    public boolean d(final int \u2603, final zx \u2603) {
        return false;
    }
    
    @Override
    public void a(final eu \u2603) {
    }
    
    @Override
    public boolean a(final int \u2603, final String \u2603) {
        return true;
    }
    
    @Override
    public cj c() {
        return new cj(this.s, this.t + 0.5, this.u);
    }
    
    @Override
    public aui d() {
        return new aui(this.s, this.t, this.u);
    }
    
    @Override
    public adm e() {
        return this.o;
    }
    
    @Override
    public pk f() {
        return this;
    }
    
    @Override
    public boolean u_() {
        return false;
    }
    
    @Override
    public void a(final n.a \u2603, final int \u2603) {
        this.au.a(this, \u2603, \u2603);
    }
    
    public n aU() {
        return this.au;
    }
    
    public void o(final pk \u2603) {
        this.au.a(\u2603.aU());
    }
    
    public dn aV() {
        return null;
    }
    
    public void g(final dn \u2603) {
    }
    
    public boolean a(final wn \u2603, final aui \u2603) {
        return false;
    }
    
    public boolean aW() {
        return false;
    }
    
    protected void a(final pr \u2603, final pk \u2603) {
        if (\u2603 instanceof pr) {
            ack.a((pr)\u2603, \u2603);
        }
        ack.b(\u2603, \u2603);
    }
    
    static {
        a = new aug(0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
    }
}
