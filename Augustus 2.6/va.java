import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Iterator;
import net.minecraft.server.MinecraftServer;

// 
// Decompiled by Procyon v0.5.36
// 

public abstract class va extends pk implements op
{
    private boolean a;
    private String b;
    private static final int[][][] c;
    private int d;
    private double e;
    private double f;
    private double g;
    private double h;
    private double i;
    private double ar;
    private double as;
    private double at;
    
    public va(final adm \u2603) {
        super(\u2603);
        this.k = true;
        this.a(0.98f, 0.7f);
    }
    
    public static va a(final adm \u2603, final double \u2603, final double \u2603, final double \u2603, final a \u2603) {
        switch (va$1.a[\u2603.ordinal()]) {
            case 1: {
                return new vb(\u2603, \u2603, \u2603, \u2603);
            }
            case 2: {
                return new ve(\u2603, \u2603, \u2603, \u2603);
            }
            case 3: {
                return new vi(\u2603, \u2603, \u2603, \u2603);
            }
            case 4: {
                return new vh(\u2603, \u2603, \u2603, \u2603);
            }
            case 5: {
                return new vf(\u2603, \u2603, \u2603, \u2603);
            }
            case 6: {
                return new vc(\u2603, \u2603, \u2603, \u2603);
            }
            default: {
                return new vg(\u2603, \u2603, \u2603, \u2603);
            }
        }
    }
    
    @Override
    protected boolean s_() {
        return false;
    }
    
    @Override
    protected void h() {
        this.ac.a(17, new Integer(0));
        this.ac.a(18, new Integer(1));
        this.ac.a(19, new Float(0.0f));
        this.ac.a(20, new Integer(0));
        this.ac.a(21, new Integer(6));
        this.ac.a(22, (Byte)0);
    }
    
    @Override
    public aug j(final pk \u2603) {
        if (\u2603.ae()) {
            return \u2603.aR();
        }
        return null;
    }
    
    @Override
    public aug S() {
        return null;
    }
    
    @Override
    public boolean ae() {
        return true;
    }
    
    public va(final adm \u2603, final double \u2603, final double \u2603, final double \u2603) {
        this(\u2603);
        this.b(\u2603, \u2603, \u2603);
        this.v = 0.0;
        this.w = 0.0;
        this.x = 0.0;
        this.p = \u2603;
        this.q = \u2603;
        this.r = \u2603;
    }
    
    @Override
    public double an() {
        return 0.0;
    }
    
    @Override
    public boolean a(final ow \u2603, final float \u2603) {
        if (this.o.D || this.I) {
            return true;
        }
        if (this.b(\u2603)) {
            return false;
        }
        this.k(-this.r());
        this.j(10);
        this.ac();
        this.a(this.p() + \u2603 * 10.0f);
        final boolean b = \u2603.j() instanceof wn && ((wn)\u2603.j()).bA.d;
        if (b || this.p() > 40.0f) {
            if (this.l != null) {
                this.l.a((pk)null);
            }
            if (!b || this.l_()) {
                this.a(\u2603);
            }
            else {
                this.J();
            }
        }
        return true;
    }
    
    public void a(final ow \u2603) {
        this.J();
        if (this.o.Q().b("doEntityDrops")) {
            final zx \u26032 = new zx(zy.az, 1);
            if (this.b != null) {
                \u26032.c(this.b);
            }
            this.a(\u26032, 0.0f);
        }
    }
    
    @Override
    public void ar() {
        this.k(-this.r());
        this.j(10);
        this.a(this.p() + this.p() * 10.0f);
    }
    
    @Override
    public boolean ad() {
        return !this.I;
    }
    
    @Override
    public void J() {
        super.J();
    }
    
    @Override
    public void t_() {
        if (this.q() > 0) {
            this.j(this.q() - 1);
        }
        if (this.p() > 0.0f) {
            this.a(this.p() - 1.0f);
        }
        if (this.t < -64.0) {
            this.O();
        }
        if (!this.o.D && this.o instanceof le) {
            this.o.B.a("portal");
            final MinecraftServer r = ((le)this.o).r();
            final int \u2603 = this.L();
            if (this.ak) {
                if (r.C()) {
                    if (this.m == null && this.al++ >= \u2603) {
                        this.al = \u2603;
                        this.aj = this.aq();
                        int c;
                        if (this.o.t.q() == -1) {
                            c = 0;
                        }
                        else {
                            c = -1;
                        }
                        this.c(c);
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
        if (this.o.D) {
            if (this.d > 0) {
                final double \u26032 = this.s + (this.e - this.s) / this.d;
                final double \u26033 = this.t + (this.f - this.t) / this.d;
                final double \u26034 = this.u + (this.g - this.u) / this.d;
                final double g = ns.g(this.h - this.y);
                this.y += (float)(g / this.d);
                this.z += (float)((this.i - this.z) / this.d);
                --this.d;
                this.b(\u26032, \u26033, \u26034);
                this.b(this.y, this.z);
            }
            else {
                this.b(this.s, this.t, this.u);
                this.b(this.y, this.z);
            }
            return;
        }
        this.p = this.s;
        this.q = this.t;
        this.r = this.u;
        this.w -= 0.03999999910593033;
        final int c2 = ns.c(this.s);
        int \u2603 = ns.c(this.t);
        int c = ns.c(this.u);
        if (afe.e(this.o, new cj(c2, \u2603 - 1, c))) {
            --\u2603;
        }
        final cj cj = new cj(c2, \u2603, c);
        final alz p = this.o.p(cj);
        if (afe.d(p)) {
            this.a(cj, p);
            if (p.c() == afi.cs) {
                this.a(c2, \u2603, c, p.b((amo<Boolean>)ais.N));
            }
        }
        else {
            this.n();
        }
        this.Q();
        this.z = 0.0f;
        final double \u26035 = this.p - this.s;
        final double \u26036 = this.r - this.u;
        if (\u26035 * \u26035 + \u26036 * \u26036 > 0.001) {
            this.y = (float)(ns.b(\u26036, \u26035) * 180.0 / 3.141592653589793);
            if (this.a) {
                this.y += 180.0f;
            }
        }
        final double n = ns.g(this.y - this.A);
        if (n < -170.0 || n >= 170.0) {
            this.y += 180.0f;
            this.a = !this.a;
        }
        this.b(this.y, this.z);
        for (final pk pk : this.o.b(this, this.aR().b(0.20000000298023224, 0.0, 0.20000000298023224))) {
            if (pk != this.l && pk.ae() && pk instanceof va) {
                pk.i(this);
            }
        }
        if (this.l != null && this.l.I) {
            if (this.l.m == this) {
                this.l.m = null;
            }
            this.l = null;
        }
        this.W();
    }
    
    protected double m() {
        return 0.4;
    }
    
    public void a(final int \u2603, final int \u2603, final int \u2603, final boolean \u2603) {
    }
    
    protected void n() {
        final double m = this.m();
        this.v = ns.a(this.v, -m, m);
        this.x = ns.a(this.x, -m, m);
        if (this.C) {
            this.v *= 0.5;
            this.w *= 0.5;
            this.x *= 0.5;
        }
        this.d(this.v, this.w, this.x);
        if (!this.C) {
            this.v *= 0.949999988079071;
            this.w *= 0.949999988079071;
            this.x *= 0.949999988079071;
        }
    }
    
    protected void a(final cj \u2603, final alz \u2603) {
        this.O = 0.0f;
        final aui k = this.k(this.s, this.t, this.u);
        this.t = \u2603.o();
        boolean booleanValue = false;
        boolean b = false;
        final afe afe = (afe)\u2603.c();
        if (afe == afi.D) {
            booleanValue = \u2603.b((amo<Boolean>)ais.N);
            b = !booleanValue;
        }
        final double n = 0.0078125;
        final afe.b b2 = \u2603.b(afe.n());
        switch (va$1.b[b2.ordinal()]) {
            case 1: {
                this.v -= 0.0078125;
                ++this.t;
                break;
            }
            case 2: {
                this.v += 0.0078125;
                ++this.t;
                break;
            }
            case 3: {
                this.x += 0.0078125;
                ++this.t;
                break;
            }
            case 4: {
                this.x -= 0.0078125;
                ++this.t;
                break;
            }
        }
        final int[][] array = va.c[b2.a()];
        double n2 = array[1][0] - array[0][0];
        double n3 = array[1][2] - array[0][2];
        final double sqrt = Math.sqrt(n2 * n2 + n3 * n3);
        final double n4 = this.v * n2 + this.x * n3;
        if (n4 < 0.0) {
            n2 = -n2;
            n3 = -n3;
        }
        double n5 = Math.sqrt(this.v * this.v + this.x * this.x);
        if (n5 > 2.0) {
            n5 = 2.0;
        }
        this.v = n5 * n2 / sqrt;
        this.x = n5 * n3 / sqrt;
        if (this.l instanceof pr) {
            final double sqrt2 = ((pr)this.l).ba;
            if (sqrt2 > 0.0) {
                final double n6 = -Math.sin(this.l.y * 3.1415927f / 180.0f);
                final double cos = Math.cos(this.l.y * 3.1415927f / 180.0f);
                final double n7 = this.v * this.v + this.x * this.x;
                if (n7 < 0.01) {
                    this.v += n6 * 0.1;
                    this.x += cos * 0.1;
                    b = false;
                }
            }
        }
        if (b) {
            final double sqrt2 = Math.sqrt(this.v * this.v + this.x * this.x);
            if (sqrt2 < 0.03) {
                this.v *= 0.0;
                this.w *= 0.0;
                this.x *= 0.0;
            }
            else {
                this.v *= 0.5;
                this.w *= 0.0;
                this.x *= 0.5;
            }
        }
        double sqrt2 = 0.0;
        final double n6 = \u2603.n() + 0.5 + array[0][0] * 0.5;
        final double cos = \u2603.p() + 0.5 + array[0][2] * 0.5;
        final double n7 = \u2603.n() + 0.5 + array[1][0] * 0.5;
        final double n8 = \u2603.p() + 0.5 + array[1][2] * 0.5;
        n2 = n7 - n6;
        n3 = n8 - cos;
        if (n2 == 0.0) {
            this.s = \u2603.n() + 0.5;
            sqrt2 = this.u - \u2603.p();
        }
        else if (n3 == 0.0) {
            this.u = \u2603.p() + 0.5;
            sqrt2 = this.s - \u2603.n();
        }
        else {
            final double n9 = this.s - n6;
            final double n10 = this.u - cos;
            sqrt2 = (n9 * n2 + n10 * n3) * 2.0;
        }
        this.s = n6 + n2 * sqrt2;
        this.u = cos + n3 * sqrt2;
        this.b(this.s, this.t, this.u);
        double n9 = this.v;
        double n10 = this.x;
        if (this.l != null) {
            n9 *= 0.75;
            n10 *= 0.75;
        }
        final double m = this.m();
        n9 = ns.a(n9, -m, m);
        n10 = ns.a(n10, -m, m);
        this.d(n9, 0.0, n10);
        if (array[0][1] != 0 && ns.c(this.s) - \u2603.n() == array[0][0] && ns.c(this.u) - \u2603.p() == array[0][2]) {
            this.b(this.s, this.t + array[0][1], this.u);
        }
        else if (array[1][1] != 0 && ns.c(this.s) - \u2603.n() == array[1][0] && ns.c(this.u) - \u2603.p() == array[1][2]) {
            this.b(this.s, this.t + array[1][1], this.u);
        }
        this.o();
        final aui i = this.k(this.s, this.t, this.u);
        if (i != null && k != null) {
            final double n11 = (k.b - i.b) * 0.05;
            n5 = Math.sqrt(this.v * this.v + this.x * this.x);
            if (n5 > 0.0) {
                this.v = this.v / n5 * (n5 + n11);
                this.x = this.x / n5 * (n5 + n11);
            }
            this.b(this.s, i.b, this.u);
        }
        final int c = ns.c(this.s);
        final int c2 = ns.c(this.u);
        if (c != \u2603.n() || c2 != \u2603.p()) {
            n5 = Math.sqrt(this.v * this.v + this.x * this.x);
            this.v = n5 * (c - \u2603.n());
            this.x = n5 * (c2 - \u2603.p());
        }
        if (booleanValue) {
            final double sqrt3 = Math.sqrt(this.v * this.v + this.x * this.x);
            if (sqrt3 > 0.01) {
                final double n12 = 0.06;
                this.v += this.v / sqrt3 * n12;
                this.x += this.x / sqrt3 * n12;
            }
            else if (b2 == afe.b.b) {
                if (this.o.p(\u2603.e()).c().v()) {
                    this.v = 0.02;
                }
                else if (this.o.p(\u2603.f()).c().v()) {
                    this.v = -0.02;
                }
            }
            else if (b2 == afe.b.a) {
                if (this.o.p(\u2603.c()).c().v()) {
                    this.x = 0.02;
                }
                else if (this.o.p(\u2603.d()).c().v()) {
                    this.x = -0.02;
                }
            }
        }
    }
    
    protected void o() {
        if (this.l != null) {
            this.v *= 0.996999979019165;
            this.w *= 0.0;
            this.x *= 0.996999979019165;
        }
        else {
            this.v *= 0.9599999785423279;
            this.w *= 0.0;
            this.x *= 0.9599999785423279;
        }
    }
    
    @Override
    public void b(final double \u2603, final double \u2603, final double \u2603) {
        this.s = \u2603;
        this.t = \u2603;
        this.u = \u2603;
        final float n = this.J / 2.0f;
        final float k = this.K;
        this.a(new aug(\u2603 - n, \u2603, \u2603 - n, \u2603 + n, \u2603 + k, \u2603 + n));
    }
    
    public aui a(double \u2603, double \u2603, double \u2603, final double \u2603) {
        final int c = ns.c(\u2603);
        int c2 = ns.c(\u2603);
        final int c3 = ns.c(\u2603);
        if (afe.e(this.o, new cj(c, c2 - 1, c3))) {
            --c2;
        }
        final alz p = this.o.p(new cj(c, c2, c3));
        if (afe.d(p)) {
            final afe.b b = p.b(((afe)p.c()).n());
            \u2603 = c2;
            if (b.c()) {
                \u2603 = c2 + 1;
            }
            final int[][] array = va.c[b.a()];
            double n = array[1][0] - array[0][0];
            double n2 = array[1][2] - array[0][2];
            final double sqrt = Math.sqrt(n * n + n2 * n2);
            n /= sqrt;
            n2 /= sqrt;
            \u2603 += n * \u2603;
            \u2603 += n2 * \u2603;
            if (array[0][1] != 0 && ns.c(\u2603) - c == array[0][0] && ns.c(\u2603) - c3 == array[0][2]) {
                \u2603 += array[0][1];
            }
            else if (array[1][1] != 0 && ns.c(\u2603) - c == array[1][0] && ns.c(\u2603) - c3 == array[1][2]) {
                \u2603 += array[1][1];
            }
            return this.k(\u2603, \u2603, \u2603);
        }
        return null;
    }
    
    public aui k(double \u2603, double \u2603, double \u2603) {
        final int c = ns.c(\u2603);
        int c2 = ns.c(\u2603);
        final int c3 = ns.c(\u2603);
        if (afe.e(this.o, new cj(c, c2 - 1, c3))) {
            --c2;
        }
        final alz p = this.o.p(new cj(c, c2, c3));
        if (afe.d(p)) {
            final afe.b b = p.b(((afe)p.c()).n());
            final int[][] array = va.c[b.a()];
            double n = 0.0;
            final double n2 = c + 0.5 + array[0][0] * 0.5;
            final double n3 = c2 + 0.0625 + array[0][1] * 0.5;
            final double n4 = c3 + 0.5 + array[0][2] * 0.5;
            final double n5 = c + 0.5 + array[1][0] * 0.5;
            final double n6 = c2 + 0.0625 + array[1][1] * 0.5;
            final double n7 = c3 + 0.5 + array[1][2] * 0.5;
            final double n8 = n5 - n2;
            final double n9 = (n6 - n3) * 2.0;
            final double n10 = n7 - n4;
            if (n8 == 0.0) {
                \u2603 = c + 0.5;
                n = \u2603 - c3;
            }
            else if (n10 == 0.0) {
                \u2603 = c3 + 0.5;
                n = \u2603 - c;
            }
            else {
                final double n11 = \u2603 - n2;
                final double n12 = \u2603 - n4;
                n = (n11 * n8 + n12 * n10) * 2.0;
            }
            \u2603 = n2 + n8 * n;
            \u2603 = n3 + n9 * n;
            \u2603 = n4 + n10 * n;
            if (n9 < 0.0) {
                ++\u2603;
            }
            if (n9 > 0.0) {
                \u2603 += 0.5;
            }
            return new aui(\u2603, \u2603, \u2603);
        }
        return null;
    }
    
    @Override
    protected void a(final dn \u2603) {
        if (\u2603.n("CustomDisplayTile")) {
            final int f = \u2603.f("DisplayData");
            if (\u2603.b("DisplayTile", 8)) {
                final afh afh = afh.b(\u2603.j("DisplayTile"));
                if (afh == null) {
                    this.a(afi.a.Q());
                }
                else {
                    this.a(afh.a(f));
                }
            }
            else {
                final afh afh = afh.c(\u2603.f("DisplayTile"));
                if (afh == null) {
                    this.a(afi.a.Q());
                }
                else {
                    this.a(afh.a(f));
                }
            }
            this.l(\u2603.f("DisplayOffset"));
        }
        if (\u2603.b("CustomName", 8) && \u2603.j("CustomName").length() > 0) {
            this.b = \u2603.j("CustomName");
        }
    }
    
    @Override
    protected void b(final dn \u2603) {
        if (this.x()) {
            \u2603.a("CustomDisplayTile", true);
            final alz t = this.t();
            final jy jy = afh.c.c(t.c());
            \u2603.a("DisplayTile", (jy == null) ? "" : jy.toString());
            \u2603.a("DisplayData", t.c().c(t));
            \u2603.a("DisplayOffset", this.v());
        }
        if (this.b != null && this.b.length() > 0) {
            \u2603.a("CustomName", this.b);
        }
    }
    
    @Override
    public void i(final pk \u2603) {
        if (this.o.D) {
            return;
        }
        if (\u2603.T || this.T) {
            return;
        }
        if (\u2603 == this.l) {
            return;
        }
        if (\u2603 instanceof pr && !(\u2603 instanceof wn) && !(\u2603 instanceof ty) && this.s() == va.a.a && this.v * this.v + this.x * this.x > 0.01 && this.l == null && \u2603.m == null) {
            \u2603.a(this);
        }
        double n = \u2603.s - this.s;
        double n2 = \u2603.u - this.u;
        double \u26032 = n * n + n2 * n2;
        if (\u26032 >= 9.999999747378752E-5) {
            \u26032 = ns.a(\u26032);
            n /= \u26032;
            n2 /= \u26032;
            double n3 = 1.0 / \u26032;
            if (n3 > 1.0) {
                n3 = 1.0;
            }
            n *= n3;
            n2 *= n3;
            n *= 0.10000000149011612;
            n2 *= 0.10000000149011612;
            n *= 1.0f - this.U;
            n2 *= 1.0f - this.U;
            n *= 0.5;
            n2 *= 0.5;
            if (\u2603 instanceof va) {
                final double \u26033 = \u2603.s - this.s;
                final double \u26034 = \u2603.u - this.u;
                final aui a = new aui(\u26033, 0.0, \u26034).a();
                final aui a2 = new aui(ns.b(this.y * 3.1415927f / 180.0f), 0.0, ns.a(this.y * 3.1415927f / 180.0f)).a();
                final double abs = Math.abs(a.b(a2));
                if (abs < 0.800000011920929) {
                    return;
                }
                double n4 = \u2603.v + this.v;
                double n5 = \u2603.x + this.x;
                if (((va)\u2603).s() == va.a.c && this.s() != va.a.c) {
                    this.v *= 0.20000000298023224;
                    this.x *= 0.20000000298023224;
                    this.g(\u2603.v - n, 0.0, \u2603.x - n2);
                    \u2603.v *= 0.949999988079071;
                    \u2603.x *= 0.949999988079071;
                }
                else if (((va)\u2603).s() != va.a.c && this.s() == va.a.c) {
                    \u2603.v *= 0.20000000298023224;
                    \u2603.x *= 0.20000000298023224;
                    \u2603.g(this.v + n, 0.0, this.x + n2);
                    this.v *= 0.949999988079071;
                    this.x *= 0.949999988079071;
                }
                else {
                    n4 /= 2.0;
                    n5 /= 2.0;
                    this.v *= 0.20000000298023224;
                    this.x *= 0.20000000298023224;
                    this.g(n4 - n, 0.0, n5 - n2);
                    \u2603.v *= 0.20000000298023224;
                    \u2603.x *= 0.20000000298023224;
                    \u2603.g(n4 + n, 0.0, n5 + n2);
                }
            }
            else {
                this.g(-n, 0.0, -n2);
                \u2603.g(n / 4.0, 0.0, n2 / 4.0);
            }
        }
    }
    
    @Override
    public void a(final double \u2603, final double \u2603, final double \u2603, final float \u2603, final float \u2603, final int \u2603, final boolean \u2603) {
        this.e = \u2603;
        this.f = \u2603;
        this.g = \u2603;
        this.h = \u2603;
        this.i = \u2603;
        this.d = \u2603 + 2;
        this.v = this.ar;
        this.w = this.as;
        this.x = this.at;
    }
    
    @Override
    public void i(final double \u2603, final double \u2603, final double \u2603) {
        this.v = \u2603;
        this.ar = \u2603;
        this.w = \u2603;
        this.as = \u2603;
        this.x = \u2603;
        this.at = \u2603;
    }
    
    public void a(final float \u2603) {
        this.ac.b(19, \u2603);
    }
    
    public float p() {
        return this.ac.d(19);
    }
    
    public void j(final int \u2603) {
        this.ac.b(17, \u2603);
    }
    
    public int q() {
        return this.ac.c(17);
    }
    
    public void k(final int \u2603) {
        this.ac.b(18, \u2603);
    }
    
    public int r() {
        return this.ac.c(18);
    }
    
    public abstract a s();
    
    public alz t() {
        if (!this.x()) {
            return this.u();
        }
        return afh.d(this.H().c(20));
    }
    
    public alz u() {
        return afi.a.Q();
    }
    
    public int v() {
        if (!this.x()) {
            return this.w();
        }
        return this.H().c(21);
    }
    
    public int w() {
        return 6;
    }
    
    public void a(final alz \u2603) {
        this.H().b(20, afh.f(\u2603));
        this.a(true);
    }
    
    public void l(final int \u2603) {
        this.H().b(21, \u2603);
        this.a(true);
    }
    
    public boolean x() {
        return this.H().a(22) == 1;
    }
    
    public void a(final boolean \u2603) {
        this.H().b(22, (byte)(\u2603 ? 1 : 0));
    }
    
    @Override
    public void a(final String \u2603) {
        this.b = \u2603;
    }
    
    @Override
    public String e_() {
        if (this.b != null) {
            return this.b;
        }
        return super.e_();
    }
    
    @Override
    public boolean l_() {
        return this.b != null;
    }
    
    @Override
    public String aM() {
        return this.b;
    }
    
    @Override
    public eu f_() {
        if (this.l_()) {
            final fa fa = new fa(this.b);
            fa.b().a(this.aQ());
            fa.b().a(this.aK().toString());
            return fa;
        }
        final fb fb = new fb(this.e_(), new Object[0]);
        fb.b().a(this.aQ());
        fb.b().a(this.aK().toString());
        return fb;
    }
    
    static {
        c = new int[][][] { { { 0, 0, -1 }, { 0, 0, 1 } }, { { -1, 0, 0 }, { 1, 0, 0 } }, { { -1, -1, 0 }, { 1, 0, 0 } }, { { -1, 0, 0 }, { 1, -1, 0 } }, { { 0, 0, -1 }, { 0, -1, 1 } }, { { 0, -1, -1 }, { 0, 0, 1 } }, { { 0, 0, 1 }, { 1, 0, 0 } }, { { 0, 0, 1 }, { -1, 0, 0 } }, { { 0, 0, -1 }, { -1, 0, 0 } }, { { 0, 0, -1 }, { 1, 0, 0 } } };
    }
    
    public enum a
    {
        a(0, "MinecartRideable"), 
        b(1, "MinecartChest"), 
        c(2, "MinecartFurnace"), 
        d(3, "MinecartTNT"), 
        e(4, "MinecartSpawner"), 
        f(5, "MinecartHopper"), 
        g(6, "MinecartCommandBlock");
        
        private static final Map<Integer, a> h;
        private final int i;
        private final String j;
        
        private a(final int \u2603, final String \u2603) {
            this.i = \u2603;
            this.j = \u2603;
        }
        
        public int a() {
            return this.i;
        }
        
        public String b() {
            return this.j;
        }
        
        public static a a(final int \u2603) {
            final a a = va.a.h.get(\u2603);
            return (a == null) ? va.a.a : a;
        }
        
        static {
            h = Maps.newHashMap();
            for (final a a2 : values()) {
                a.h.put(a2.a(), a2);
            }
        }
    }
}
