import org.apache.logging.log4j.LogManager;
import org.lwjgl.opengl.GLContext;
import java.util.concurrent.Callable;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.glu.Project;
import java.util.List;
import com.google.common.base.Predicates;
import com.google.common.base.Predicate;
import com.google.gson.JsonSyntaxException;
import java.io.IOException;
import java.nio.FloatBuffer;
import java.util.Random;
import org.apache.logging.log4j.Logger;

// 
// Decompiled by Procyon v0.5.36
// 

public class bfk implements bnj
{
    private static final Logger e;
    private static final jy f;
    private static final jy g;
    public static boolean a;
    public static int b;
    private ave h;
    private final bni i;
    private Random j;
    private float k;
    public final bfn c;
    private final avq l;
    private int m;
    private pk n;
    private nv o;
    private nv p;
    private float q;
    private float r;
    private float s;
    private float t;
    private float u;
    private float v;
    private float w;
    private float x;
    private float y;
    private float z;
    private float A;
    private boolean B;
    private boolean C;
    private boolean D;
    private long E;
    private long F;
    private final blz G;
    private final int[] H;
    private final jy I;
    private boolean J;
    private float K;
    private float L;
    private int M;
    private float[] N;
    private float[] O;
    private FloatBuffer P;
    private float Q;
    private float R;
    private float S;
    private float T;
    private float U;
    private int V;
    private boolean W;
    private double X;
    private double Y;
    private double Z;
    private blr aa;
    private static final jy[] ab;
    public static final int d;
    private int ac;
    private boolean ad;
    private int ae;
    
    public bfk(final ave \u2603, final bni \u2603) {
        this.j = new Random();
        this.o = new nv();
        this.p = new nv();
        this.q = 4.0f;
        this.r = 4.0f;
        this.C = true;
        this.D = true;
        this.E = ave.J();
        this.N = new float[1024];
        this.O = new float[1024];
        this.P = avd.h(16);
        this.V = 0;
        this.W = false;
        this.X = 1.0;
        this.ac = bfk.d;
        this.ad = false;
        this.ae = 0;
        this.h = \u2603;
        this.i = \u2603;
        this.c = \u2603.ah();
        this.l = new avq(\u2603.P());
        this.G = new blz(16, 16);
        this.I = \u2603.P().a("lightMap", this.G);
        this.H = this.G.e();
        this.aa = null;
        for (int i = 0; i < 32; ++i) {
            for (int j = 0; j < 32; ++j) {
                final float n = (float)(j - 16);
                final float n2 = (float)(i - 16);
                final float c = ns.c(n * n + n2 * n2);
                this.N[i << 5 | j] = -n2 / c;
                this.O[i << 5 | j] = n / c;
            }
        }
    }
    
    public boolean a() {
        return bqs.O && this.aa != null;
    }
    
    public void b() {
        if (this.aa != null) {
            this.aa.a();
        }
        this.aa = null;
        this.ac = bfk.d;
    }
    
    public void c() {
        this.ad = !this.ad;
    }
    
    public void a(final pk \u2603) {
        if (!bqs.O) {
            return;
        }
        if (this.aa != null) {
            this.aa.a();
        }
        this.aa = null;
        if (\u2603 instanceof vn) {
            this.a(new jy("shaders/post/creeper.json"));
        }
        else if (\u2603 instanceof wc) {
            this.a(new jy("shaders/post/spider.json"));
        }
        else if (\u2603 instanceof vo) {
            this.a(new jy("shaders/post/invert.json"));
        }
    }
    
    public void d() {
        if (!bqs.O) {
            return;
        }
        if (!(this.h.ac() instanceof wn)) {
            return;
        }
        if (this.aa != null) {
            this.aa.a();
        }
        this.ac = (this.ac + 1) % (bfk.ab.length + 1);
        if (this.ac != bfk.d) {
            this.a(bfk.ab[this.ac]);
        }
        else {
            this.aa = null;
        }
    }
    
    private void a(final jy \u2603) {
        try {
            (this.aa = new blr(this.h.P(), this.i, this.h.b(), \u2603)).a(this.h.d, this.h.e);
            this.ad = true;
        }
        catch (IOException throwable) {
            bfk.e.warn("Failed to load shader: " + \u2603, throwable);
            this.ac = bfk.d;
            this.ad = false;
        }
        catch (JsonSyntaxException throwable2) {
            bfk.e.warn("Failed to load shader: " + \u2603, throwable2);
            this.ac = bfk.d;
            this.ad = false;
        }
    }
    
    @Override
    public void a(final bni \u2603) {
        if (this.aa != null) {
            this.aa.a();
        }
        this.aa = null;
        if (this.ac != bfk.d) {
            this.a(bfk.ab[this.ac]);
        }
        else {
            this.a(this.h.ac());
        }
    }
    
    public void e() {
        if (bqs.O && blu.b() == null) {
            blu.a();
        }
        this.l();
        this.m();
        this.T = this.U;
        this.r = this.q;
        if (this.h.t.aF) {
            final float o = this.h.t.a * 0.6f + 0.2f;
            final float n = o * o * o * 8.0f;
            this.u = this.o.a(this.s, 0.05f * n);
            this.v = this.p.a(this.t, 0.05f * n);
            this.w = 0.0f;
            this.s = 0.0f;
            this.t = 0.0f;
        }
        else {
            this.u = 0.0f;
            this.v = 0.0f;
            this.o.a();
            this.p.a();
        }
        if (this.h.ac() == null) {
            this.h.a(this.h.h);
        }
        final float o = this.h.f.o(new cj(this.h.ac()));
        final float n = this.h.t.c / 32.0f;
        final float n2 = o * (1.0f - n) + n;
        this.U += (n2 - this.U) * 0.1f;
        ++this.m;
        this.c.a();
        this.o();
        this.A = this.z;
        if (bfc.d) {
            this.z += 0.05f;
            if (this.z > 1.0f) {
                this.z = 1.0f;
            }
            bfc.d = false;
        }
        else if (this.z > 0.0f) {
            this.z -= 0.0125f;
        }
    }
    
    public blr f() {
        return this.aa;
    }
    
    public void a(final int \u2603, final int \u2603) {
        if (!bqs.O) {
            return;
        }
        if (this.aa != null) {
            this.aa.a(\u2603, \u2603);
        }
        this.h.g.a(\u2603, \u2603);
    }
    
    public void a(final float \u2603) {
        final pk ac = this.h.ac();
        if (ac == null) {
            return;
        }
        if (this.h.f == null) {
            return;
        }
        this.h.A.a("pick");
        this.h.i = null;
        double \u26032 = this.h.c.d();
        this.h.s = ac.a(\u26032, \u2603);
        double f = \u26032;
        final aui e = ac.e(\u2603);
        boolean b = false;
        final int n = 3;
        if (this.h.c.i()) {
            \u26032 = (f = 6.0);
        }
        else {
            if (f > 3.0) {
                b = true;
            }
            \u26032 = f;
        }
        if (this.h.s != null) {
            f = this.h.s.c.f(e);
        }
        final aui d = ac.d(\u2603);
        final aui b2 = e.b(d.a * \u26032, d.b * \u26032, d.c * \u26032);
        this.n = null;
        aui aui = null;
        final float n2 = 1.0f;
        final List<pk> a = this.h.f.a(ac, ac.aR().a(d.a * \u26032, d.b * \u26032, d.c * \u26032).b(n2, n2, n2), Predicates.and((Predicate<? super pk>)po.d, (Predicate<? super pk>)new Predicate<pk>() {
            public boolean a(final pk \u2603) {
                return \u2603.ad();
            }
        }));
        double n3 = f;
        for (int i = 0; i < a.size(); ++i) {
            final pk n4 = a.get(i);
            final float ao = n4.ao();
            final aug b3 = n4.aR().b(ao, ao, ao);
            final auh a2 = b3.a(e, b2);
            if (b3.a(e)) {
                if (n3 >= 0.0) {
                    this.n = n4;
                    aui = ((a2 == null) ? e : a2.c);
                    n3 = 0.0;
                }
            }
            else if (a2 != null) {
                final double f2 = e.f(a2.c);
                if (f2 < n3 || n3 == 0.0) {
                    if (n4 == ac.m) {
                        if (n3 == 0.0) {
                            this.n = n4;
                            aui = a2.c;
                        }
                    }
                    else {
                        this.n = n4;
                        aui = a2.c;
                        n3 = f2;
                    }
                }
            }
        }
        if (this.n != null && b && e.f(aui) > 3.0) {
            this.n = null;
            this.h.s = new auh(auh.a.a, aui, null, new cj(aui));
        }
        if (this.n != null && (n3 < f || this.h.s == null)) {
            this.h.s = new auh(this.n, aui);
            if (this.n instanceof pr || this.n instanceof uo) {
                this.h.i = this.n;
            }
        }
        this.h.A.b();
    }
    
    private void l() {
        float o = 1.0f;
        if (this.h.ac() instanceof bet) {
            final bet bet = (bet)this.h.ac();
            o = bet.o();
        }
        this.y = this.x;
        this.x += (o - this.x) * 0.5f;
        if (this.x > 1.5f) {
            this.x = 1.5f;
        }
        if (this.x < 0.1f) {
            this.x = 0.1f;
        }
    }
    
    private float a(final float \u2603, final boolean \u2603) {
        if (this.W) {
            return 90.0f;
        }
        final pk ac = this.h.ac();
        float ah = 70.0f;
        if (\u2603) {
            ah = this.h.t.aH;
            ah *= this.y + (this.x - this.y) * \u2603;
        }
        if (ac instanceof pr && ((pr)ac).bn() <= 0.0f) {
            final float n = ((pr)ac).ax + \u2603;
            ah /= (1.0f - 500.0f / (n + 500.0f)) * 2.0f + 1.0f;
        }
        final afh a = auz.a(this.h.f, ac, \u2603);
        if (a.t() == arm.h) {
            ah = ah * 60.0f / 70.0f;
        }
        return ah;
    }
    
    private void d(final float \u2603) {
        if (this.h.ac() instanceof pr) {
            final pr pr = (pr)this.h.ac();
            float a = pr.au - \u2603;
            if (pr.bn() <= 0.0f) {
                final float aw = pr.ax + \u2603;
                bfl.b(40.0f - 8000.0f / (aw + 200.0f), 0.0f, 0.0f, 1.0f);
            }
            if (a < 0.0f) {
                return;
            }
            a /= pr.av;
            a = ns.a(a * a * a * a * 3.1415927f);
            final float aw = pr.aw;
            bfl.b(-aw, 0.0f, 1.0f, 0.0f);
            bfl.b(-a * 14.0f, 0.0f, 0.0f, 1.0f);
            bfl.b(aw, 0.0f, 1.0f, 0.0f);
        }
    }
    
    private void e(final float \u2603) {
        if (!(this.h.ac() instanceof wn)) {
            return;
        }
        final wn wn = (wn)this.h.ac();
        final float n = wn.M - wn.L;
        final float n2 = -(wn.M + n * \u2603);
        final float n3 = wn.bn + (wn.bo - wn.bn) * \u2603;
        final float \u26032 = wn.aE + (wn.aF - wn.aE) * \u2603;
        bfl.b(ns.a(n2 * 3.1415927f) * n3 * 0.5f, -Math.abs(ns.b(n2 * 3.1415927f) * n3), 0.0f);
        bfl.b(ns.a(n2 * 3.1415927f) * n3 * 3.0f, 0.0f, 0.0f, 1.0f);
        bfl.b(Math.abs(ns.b(n2 * 3.1415927f - 0.2f) * n3) * 5.0f, 1.0f, 0.0f, 0.0f);
        bfl.b(\u26032, 1.0f, 0.0f, 0.0f);
    }
    
    private void f(final float \u2603) {
        final pk ac = this.h.ac();
        float as = ac.aS();
        double n = ac.p + (ac.s - ac.p) * \u2603;
        double n2 = ac.q + (ac.t - ac.q) * \u2603 + as;
        double n3 = ac.r + (ac.u - ac.r) * \u2603;
        if (ac instanceof pr && ((pr)ac).bJ()) {
            ++as;
            bfl.b(0.0f, 0.3f, 0.0f);
            if (!this.h.t.aG) {
                final cj \u26032 = new cj(ac);
                final alz p = this.h.f.p(\u26032);
                final afh c = p.c();
                if (c == afi.C) {
                    final int b = p.b((amo<cq>)afg.O).b();
                    bfl.b((float)(b * 90), 0.0f, 1.0f, 0.0f);
                }
                bfl.b(ac.A + (ac.y - ac.A) * \u2603 + 180.0f, 0.0f, -1.0f, 0.0f);
                bfl.b(ac.B + (ac.z - ac.B) * \u2603, -1.0f, 0.0f, 0.0f);
            }
        }
        else if (this.h.t.aA > 0) {
            double n4 = this.r + (this.q - this.r) * \u2603;
            if (this.h.t.aG) {
                bfl.b(0.0f, 0.0f, (float)(-n4));
            }
            else {
                final float y = ac.y;
                float z = ac.z;
                if (this.h.t.aA == 2) {
                    z += 180.0f;
                }
                final double n5 = -ns.a(y / 180.0f * 3.1415927f) * ns.b(z / 180.0f * 3.1415927f) * n4;
                final double n6 = ns.b(y / 180.0f * 3.1415927f) * ns.b(z / 180.0f * 3.1415927f) * n4;
                final double n7 = -ns.a(z / 180.0f * 3.1415927f) * n4;
                for (int i = 0; i < 8; ++i) {
                    float n8 = (float)((i & 0x1) * 2 - 1);
                    float n9 = (float)((i >> 1 & 0x1) * 2 - 1);
                    float n10 = (float)((i >> 2 & 0x1) * 2 - 1);
                    n8 *= 0.1f;
                    n9 *= 0.1f;
                    n10 *= 0.1f;
                    final auh a = this.h.f.a(new aui(n + n8, n2 + n9, n3 + n10), new aui(n - n5 + n8 + n10, n2 - n7 + n9, n3 - n6 + n10));
                    if (a != null) {
                        final double f = a.c.f(new aui(n, n2, n3));
                        if (f < n4) {
                            n4 = f;
                        }
                    }
                }
                if (this.h.t.aA == 2) {
                    bfl.b(180.0f, 0.0f, 1.0f, 0.0f);
                }
                bfl.b(ac.z - z, 1.0f, 0.0f, 0.0f);
                bfl.b(ac.y - y, 0.0f, 1.0f, 0.0f);
                bfl.b(0.0f, 0.0f, (float)(-n4));
                bfl.b(y - ac.y, 0.0f, 1.0f, 0.0f);
                bfl.b(z - ac.z, 1.0f, 0.0f, 0.0f);
            }
        }
        else {
            bfl.b(0.0f, 0.0f, -0.1f);
        }
        if (!this.h.t.aG) {
            bfl.b(ac.B + (ac.z - ac.B) * \u2603, 1.0f, 0.0f, 0.0f);
            if (ac instanceof tm) {
                final tm tm = (tm)ac;
                bfl.b(tm.aL + (tm.aK - tm.aL) * \u2603 + 180.0f, 0.0f, 1.0f, 0.0f);
            }
            else {
                bfl.b(ac.A + (ac.y - ac.A) * \u2603 + 180.0f, 0.0f, 1.0f, 0.0f);
            }
        }
        bfl.b(0.0f, -as, 0.0f);
        n = ac.p + (ac.s - ac.p) * \u2603;
        n2 = ac.q + (ac.t - ac.q) * \u2603 + as;
        n3 = ac.r + (ac.u - ac.r) * \u2603;
        this.B = this.h.g.a(n, n2, n3, \u2603);
    }
    
    private void a(final float \u2603, final int \u2603) {
        this.k = (float)(this.h.t.c * 16);
        bfl.n(5889);
        bfl.D();
        final float n = 0.07f;
        if (this.h.t.e) {
            bfl.b(-(\u2603 * 2 - 1) * n, 0.0f, 0.0f);
        }
        if (this.X != 1.0) {
            bfl.b((float)this.Y, (float)(-this.Z), 0.0f);
            bfl.a(this.X, this.X, 1.0);
        }
        Project.gluPerspective(this.a(\u2603, true), this.h.d / (float)this.h.e, 0.05f, this.k * ns.a);
        bfl.n(5888);
        bfl.D();
        if (this.h.t.e) {
            bfl.b((\u2603 * 2 - 1) * 0.1f, 0.0f, 0.0f);
        }
        this.d(\u2603);
        if (this.h.t.d) {
            this.e(\u2603);
        }
        final float n2 = this.h.h.bI + (this.h.h.bH - this.h.h.bI) * \u2603;
        if (n2 > 0.0f) {
            int n3 = 20;
            if (this.h.h.a(pe.k)) {
                n3 = 7;
            }
            float n4 = 5.0f / (n2 * n2 + 5.0f) - n2 * 0.04f;
            n4 *= n4;
            bfl.b((this.m + \u2603) * n3, 0.0f, 1.0f, 1.0f);
            bfl.a(1.0f / n4, 1.0f, 1.0f);
            bfl.b(-(this.m + \u2603) * n3, 0.0f, 1.0f, 1.0f);
        }
        this.f(\u2603);
        if (this.W) {
            switch (this.V) {
                case 0: {
                    bfl.b(90.0f, 0.0f, 1.0f, 0.0f);
                    break;
                }
                case 1: {
                    bfl.b(180.0f, 0.0f, 1.0f, 0.0f);
                    break;
                }
                case 2: {
                    bfl.b(-90.0f, 0.0f, 1.0f, 0.0f);
                    break;
                }
                case 3: {
                    bfl.b(90.0f, 1.0f, 0.0f, 0.0f);
                    break;
                }
                case 4: {
                    bfl.b(-90.0f, 1.0f, 0.0f, 0.0f);
                    break;
                }
            }
        }
    }
    
    private void b(final float \u2603, final int \u2603) {
        if (this.W) {
            return;
        }
        bfl.n(5889);
        bfl.D();
        final float n = 0.07f;
        if (this.h.t.e) {
            bfl.b(-(\u2603 * 2 - 1) * n, 0.0f, 0.0f);
        }
        Project.gluPerspective(this.a(\u2603, false), this.h.d / (float)this.h.e, 0.05f, this.k * 2.0f);
        bfl.n(5888);
        bfl.D();
        if (this.h.t.e) {
            bfl.b((\u2603 * 2 - 1) * 0.1f, 0.0f, 0.0f);
        }
        bfl.E();
        this.d(\u2603);
        if (this.h.t.d) {
            this.e(\u2603);
        }
        final boolean b = this.h.ac() instanceof pr && ((pr)this.h.ac()).bJ();
        if (this.h.t.aA == 0 && !b && !this.h.t.az && !this.h.c.a()) {
            this.i();
            this.c.a(\u2603);
            this.h();
        }
        bfl.F();
        if (this.h.t.aA == 0 && !b) {
            this.c.b(\u2603);
            this.d(\u2603);
        }
        if (this.h.t.d) {
            this.e(\u2603);
        }
    }
    
    public void h() {
        bfl.g(bqs.r);
        bfl.x();
        bfl.g(bqs.q);
    }
    
    public void i() {
        bfl.g(bqs.r);
        bfl.n(5890);
        bfl.D();
        final float n = 0.00390625f;
        bfl.a(n, n, n);
        bfl.b(8.0f, 8.0f, 8.0f);
        bfl.n(5888);
        this.h.P().a(this.I);
        GL11.glTexParameteri(3553, 10241, 9729);
        GL11.glTexParameteri(3553, 10240, 9729);
        GL11.glTexParameteri(3553, 10242, 10496);
        GL11.glTexParameteri(3553, 10243, 10496);
        bfl.c(1.0f, 1.0f, 1.0f, 1.0f);
        bfl.w();
        bfl.g(bqs.q);
    }
    
    private void m() {
        this.L += (float)((Math.random() - Math.random()) * Math.random() * Math.random());
        this.L *= (float)0.9;
        this.K += (this.L - this.K) * 1.0f;
        this.J = true;
    }
    
    private void g(final float \u2603) {
        if (!this.J) {
            return;
        }
        this.h.A.a("lightTex");
        final adm f = this.h.f;
        if (f == null) {
            return;
        }
        final float b = f.b(1.0f);
        final float n = b * 0.95f + 0.05f;
        for (int i = 0; i < 256; ++i) {
            float n2 = f.t.p()[i / 16] * n;
            final float n3 = f.t.p()[i % 16] * (this.K * 0.1f + 1.5f);
            if (f.ac() > 0) {
                n2 = f.t.p()[i / 16];
            }
            final float n4 = n2 * (b * 0.65f + 0.35f);
            final float n5 = n2 * (b * 0.65f + 0.35f);
            final float n6 = n2;
            final float n7 = n3;
            final float n8 = n3 * ((n3 * 0.6f + 0.4f) * 0.6f + 0.4f);
            final float n9 = n3 * (n3 * n3 * 0.6f + 0.4f);
            float n10 = n4 + n7;
            float n11 = n5 + n8;
            float n12 = n6 + n9;
            n10 = n10 * 0.96f + 0.03f;
            n11 = n11 * 0.96f + 0.03f;
            n12 = n12 * 0.96f + 0.03f;
            if (this.z > 0.0f) {
                final float n13 = this.A + (this.z - this.A) * \u2603;
                n10 = n10 * (1.0f - n13) + n10 * 0.7f * n13;
                n11 = n11 * (1.0f - n13) + n11 * 0.6f * n13;
                n12 = n12 * (1.0f - n13) + n12 * 0.6f * n13;
            }
            if (f.t.q() == 1) {
                n10 = 0.22f + n7 * 0.75f;
                n11 = 0.28f + n8 * 0.75f;
                n12 = 0.25f + n9 * 0.75f;
            }
            if (this.h.h.a(pe.r)) {
                final float n13 = this.a(this.h.h, \u2603);
                float n14 = 1.0f / n10;
                if (n14 > 1.0f / n11) {
                    n14 = 1.0f / n11;
                }
                if (n14 > 1.0f / n12) {
                    n14 = 1.0f / n12;
                }
                n10 = n10 * (1.0f - n13) + n10 * n14 * n13;
                n11 = n11 * (1.0f - n13) + n11 * n14 * n13;
                n12 = n12 * (1.0f - n13) + n12 * n14 * n13;
            }
            if (n10 > 1.0f) {
                n10 = 1.0f;
            }
            if (n11 > 1.0f) {
                n11 = 1.0f;
            }
            if (n12 > 1.0f) {
                n12 = 1.0f;
            }
            final float n13 = this.h.t.aI;
            float n14 = 1.0f - n10;
            float n15 = 1.0f - n11;
            float n16 = 1.0f - n12;
            n14 = 1.0f - n14 * n14 * n14 * n14;
            n15 = 1.0f - n15 * n15 * n15 * n15;
            n16 = 1.0f - n16 * n16 * n16 * n16;
            n10 = n10 * (1.0f - n13) + n14 * n13;
            n11 = n11 * (1.0f - n13) + n15 * n13;
            n12 = n12 * (1.0f - n13) + n16 * n13;
            n10 = n10 * 0.96f + 0.03f;
            n11 = n11 * 0.96f + 0.03f;
            n12 = n12 * 0.96f + 0.03f;
            if (n10 > 1.0f) {
                n10 = 1.0f;
            }
            if (n11 > 1.0f) {
                n11 = 1.0f;
            }
            if (n12 > 1.0f) {
                n12 = 1.0f;
            }
            if (n10 < 0.0f) {
                n10 = 0.0f;
            }
            if (n11 < 0.0f) {
                n11 = 0.0f;
            }
            if (n12 < 0.0f) {
                n12 = 0.0f;
            }
            final int n17 = 255;
            final int n18 = (int)(n10 * 255.0f);
            final int n19 = (int)(n11 * 255.0f);
            final int n20 = (int)(n12 * 255.0f);
            this.H[i] = (n17 << 24 | n18 << 16 | n19 << 8 | n20);
        }
        this.G.d();
        this.J = false;
        this.h.A.b();
    }
    
    private float a(final pr \u2603, final float \u2603) {
        final int b = \u2603.b(pe.r).b();
        if (b > 200) {
            return 1.0f;
        }
        return 0.7f + ns.a((b - \u2603) * 3.1415927f * 0.2f) * 0.3f;
    }
    
    public void a(final float \u2603, final long \u2603) {
        final boolean active = Display.isActive();
        if (active || !this.h.t.z || (this.h.t.A && Mouse.isButtonDown(1))) {
            this.E = ave.J();
        }
        else if (ave.J() - this.E > 500L) {
            this.h.p();
        }
        this.h.A.a("mouse");
        if (active && ave.a && this.h.w && !Mouse.isInsideWindow()) {
            Mouse.setGrabbed(false);
            Mouse.setCursorPosition(Display.getWidth() / 2, Display.getHeight() / 2);
            Mouse.setGrabbed(true);
        }
        if (this.h.w && active) {
            this.h.u.c();
            final float n = this.h.t.a * 0.6f + 0.2f;
            final float n2 = n * n * n * 8.0f;
            float n3 = this.h.u.a * n2;
            float n4 = this.h.u.b * n2;
            int \u26032 = 1;
            if (this.h.t.b) {
                \u26032 = -1;
            }
            if (this.h.t.aF) {
                this.s += n3;
                this.t += n4;
                final float n5 = \u2603 - this.w;
                this.w = \u2603;
                n3 = this.u * n5;
                n4 = this.v * n5;
                this.h.h.c(n3, n4 * \u26032);
            }
            else {
                this.s = 0.0f;
                this.t = 0.0f;
                this.h.h.c(n3, n4 * \u26032);
            }
        }
        this.h.A.b();
        if (this.h.r) {
            return;
        }
        bfk.a = this.h.t.e;
        final avr avr = new avr(this.h);
        final int a = avr.a();
        final int b = avr.b();
        final int \u26033 = Mouse.getX() * a / this.h.d;
        int \u26032 = b - Mouse.getY() * b / this.h.e - 1;
        final int g = this.h.t.g;
        if (this.h.f != null) {
            this.h.A.a("level");
            int a2 = Math.min(ave.ai(), g);
            a2 = Math.max(a2, 60);
            final long n6 = System.nanoTime() - \u2603;
            final long max = Math.max(1000000000 / a2 / 4 - n6, 0L);
            this.b(\u2603, System.nanoTime() + max);
            if (bqs.O) {
                this.h.g.c();
                if (this.aa != null && this.ad) {
                    bfl.n(5890);
                    bfl.E();
                    bfl.D();
                    this.aa.a(\u2603);
                    bfl.F();
                }
                this.h.b().a(true);
            }
            this.F = System.nanoTime();
            this.h.A.c("gui");
            if (!this.h.t.az || this.h.m != null) {
                bfl.a(516, 0.1f);
                this.h.q.a(\u2603);
            }
            this.h.A.b();
        }
        else {
            bfl.b(0, 0, this.h.d, this.h.e);
            bfl.n(5889);
            bfl.D();
            bfl.n(5888);
            bfl.D();
            this.j();
            this.F = System.nanoTime();
        }
        if (this.h.m != null) {
            bfl.m(256);
            try {
                this.h.m.a(\u26033, \u26032, \u2603);
            }
            catch (Throwable \u26034) {
                final b a3 = b.a(\u26034, "Rendering screen");
                final c a4 = a3.a("Screen render details");
                a4.a("Screen name", new Callable<String>() {
                    public String a() throws Exception {
                        return bfk.this.h.m.getClass().getCanonicalName();
                    }
                });
                a4.a("Mouse location", new Callable<String>() {
                    public String a() throws Exception {
                        return String.format("Scaled: (%d, %d). Absolute: (%d, %d)", \u26033, \u26032, Mouse.getX(), Mouse.getY());
                    }
                });
                a4.a("Screen size", new Callable<String>() {
                    public String a() throws Exception {
                        return String.format("Scaled: (%d, %d). Absolute: (%d, %d). Scale factor of %d", avr.a(), avr.b(), bfk.this.h.d, bfk.this.h.e, avr.e());
                    }
                });
                throw new e(a3);
            }
        }
    }
    
    public void b(final float \u2603) {
        this.j();
        this.h.q.c(new avr(this.h));
    }
    
    private boolean n() {
        if (!this.D) {
            return false;
        }
        final pk ac = this.h.ac();
        boolean b = ac instanceof wn && !this.h.t.az;
        if (b && !((wn)ac).bA.e) {
            final zx bz = ((wn)ac).bZ();
            if (this.h.s != null && this.h.s.a == auh.a.b) {
                final cj a = this.h.s.a();
                final afh c = this.h.f.p(a).c();
                if (this.h.c.l() == adp.a.e) {
                    b = (c.z() && this.h.f.s(a) instanceof og);
                }
                else {
                    b = (bz != null && (bz.c(c) || bz.d(c)));
                }
            }
        }
        return b;
    }
    
    private void h(final float \u2603) {
        if (this.h.t.aB && !this.h.t.az && !this.h.h.cq() && !this.h.t.w) {
            final pk ac = this.h.ac();
            bfl.l();
            bfl.a(770, 771, 1, 0);
            GL11.glLineWidth(1.0f);
            bfl.x();
            bfl.a(false);
            bfl.E();
            bfl.n(5888);
            bfl.D();
            this.f(\u2603);
            bfl.b(0.0f, ac.aS(), 0.0f);
            bfr.a(new aug(0.0, 0.0, 0.0, 0.005, 1.0E-4, 1.0E-4), 255, 0, 0, 255);
            bfr.a(new aug(0.0, 0.0, 0.0, 1.0E-4, 1.0E-4, 0.005), 0, 0, 255, 255);
            bfr.a(new aug(0.0, 0.0, 0.0, 1.0E-4, 0.0033, 1.0E-4), 0, 255, 0, 255);
            bfl.F();
            bfl.a(true);
            bfl.w();
            bfl.k();
        }
    }
    
    public void b(final float \u2603, final long \u2603) {
        this.g(\u2603);
        if (this.h.ac() == null) {
            this.h.a(this.h.h);
        }
        this.a(\u2603);
        bfl.j();
        bfl.d();
        bfl.a(516, 0.5f);
        this.h.A.a("center");
        if (this.h.t.e) {
            bfk.b = 0;
            bfl.a(false, true, true, false);
            this.a(0, \u2603, \u2603);
            bfk.b = 1;
            bfl.a(true, false, false, false);
            this.a(1, \u2603, \u2603);
            bfl.a(true, true, true, false);
        }
        else {
            this.a(2, \u2603, \u2603);
        }
        this.h.A.b();
    }
    
    private void a(final int \u2603, final float \u2603, final long \u2603) {
        final bfr g = this.h.g;
        final bec j = this.h.j;
        final boolean n = this.n();
        bfl.o();
        this.h.A.c("clear");
        bfl.b(0, 0, this.h.d, this.h.e);
        this.i(\u2603);
        bfl.m(16640);
        this.h.A.c("camera");
        this.a(\u2603, \u2603);
        auz.a(this.h.h, this.h.t.aA == 2);
        this.h.A.c("frustum");
        bib.a();
        this.h.A.c("culling");
        final bia bia = new bic();
        final pk ac = this.h.ac();
        final double n2 = ac.P + (ac.s - ac.P) * \u2603;
        final double n3 = ac.Q + (ac.t - ac.Q) * \u2603;
        final double n4 = ac.R + (ac.u - ac.R) * \u2603;
        bia.a(n2, n3, n4);
        if (this.h.t.c >= 4) {
            this.a(-1, \u2603);
            this.h.A.c("sky");
            bfl.n(5889);
            bfl.D();
            Project.gluPerspective(this.a(\u2603, true), this.h.d / (float)this.h.e, 0.05f, this.k * 2.0f);
            bfl.n(5888);
            g.a(\u2603, \u2603);
            bfl.n(5889);
            bfl.D();
            Project.gluPerspective(this.a(\u2603, true), this.h.d / (float)this.h.e, 0.05f, this.k * ns.a);
            bfl.n(5888);
        }
        this.a(0, \u2603);
        bfl.j(7425);
        if (ac.t + ac.aS() < 128.0) {
            this.a(g, \u2603, \u2603);
        }
        this.h.A.c("prepareterrain");
        this.a(0, \u2603);
        this.h.P().a(bmh.g);
        avc.a();
        this.h.A.c("terrain_setup");
        g.a(ac, \u2603, bia, this.ae++, this.h.h.v());
        if (\u2603 == 0 || \u2603 == 2) {
            this.h.A.c("updatechunks");
            this.h.g.a(\u2603);
        }
        this.h.A.c("terrain");
        bfl.n(5888);
        bfl.E();
        bfl.c();
        g.a(adf.a, \u2603, \u2603, ac);
        bfl.d();
        g.a(adf.b, \u2603, \u2603, ac);
        this.h.P().b(bmh.g).b(false, false);
        g.a(adf.c, \u2603, \u2603, ac);
        this.h.P().b(bmh.g).a();
        bfl.j(7424);
        bfl.a(516, 0.1f);
        if (!this.W) {
            bfl.n(5888);
            bfl.F();
            bfl.E();
            avc.b();
            this.h.A.c("entities");
            g.a(ac, bia, \u2603);
            avc.a();
            this.h();
            bfl.n(5888);
            bfl.F();
            bfl.E();
            if (this.h.s != null && ac.a(arm.h) && n) {
                final wn wn = (wn)ac;
                bfl.c();
                this.h.A.c("outline");
                g.a(wn, this.h.s, 0, \u2603);
                bfl.d();
            }
        }
        bfl.n(5888);
        bfl.F();
        if (n && this.h.s != null && !ac.a(arm.h)) {
            final wn wn = (wn)ac;
            bfl.c();
            this.h.A.c("outline");
            g.a(wn, this.h.s, 0, \u2603);
            bfl.d();
        }
        this.h.A.c("destroyProgress");
        bfl.l();
        bfl.a(770, 1, 1, 0);
        this.h.P().b(bmh.g).b(false, false);
        g.a(bfx.a(), bfx.a().c(), ac, \u2603);
        this.h.P().b(bmh.g).a();
        bfl.k();
        if (!this.W) {
            this.i();
            this.h.A.c("litParticles");
            j.b(ac, \u2603);
            avc.a();
            this.a(0, \u2603);
            this.h.A.c("particles");
            j.a(ac, \u2603);
            this.h();
        }
        bfl.a(false);
        bfl.o();
        this.h.A.c("weather");
        this.c(\u2603);
        bfl.a(true);
        g.a(ac, \u2603);
        bfl.k();
        bfl.o();
        bfl.a(770, 771, 1, 0);
        bfl.a(516, 0.1f);
        this.a(0, \u2603);
        bfl.l();
        bfl.a(false);
        this.h.P().a(bmh.g);
        bfl.j(7425);
        this.h.A.c("translucent");
        g.a(adf.d, \u2603, \u2603, ac);
        bfl.j(7424);
        bfl.a(true);
        bfl.o();
        bfl.k();
        bfl.n();
        if (ac.t + ac.aS() >= 128.0) {
            this.h.A.c("aboveClouds");
            this.a(g, \u2603, \u2603);
        }
        this.h.A.c("hand");
        if (this.C) {
            bfl.m(256);
            this.b(\u2603, \u2603);
            this.h(\u2603);
        }
    }
    
    private void a(final bfr \u2603, final float \u2603, final int \u2603) {
        if (this.h.t.e() != 0) {
            this.h.A.c("clouds");
            bfl.n(5889);
            bfl.D();
            Project.gluPerspective(this.a(\u2603, true), this.h.d / (float)this.h.e, 0.05f, this.k * 4.0f);
            bfl.n(5888);
            bfl.E();
            this.a(0, \u2603);
            \u2603.b(\u2603, \u2603);
            bfl.n();
            bfl.F();
            bfl.n(5889);
            bfl.D();
            Project.gluPerspective(this.a(\u2603, true), this.h.d / (float)this.h.e, 0.05f, this.k * ns.a);
            bfl.n(5888);
        }
    }
    
    private void o() {
        float j = this.h.f.j(1.0f);
        if (!this.h.t.i) {
            j /= 2.0f;
        }
        if (j == 0.0f) {
            return;
        }
        this.j.setSeed(this.m * 312987231L);
        final pk ac = this.h.ac();
        final adm f = this.h.f;
        final cj \u2603 = new cj(ac);
        final int n = 10;
        double n2 = 0.0;
        double n3 = 0.0;
        double n4 = 0.0;
        int n5 = 0;
        int n6 = (int)(100.0f * j * j);
        if (this.h.t.aL == 1) {
            n6 >>= 1;
        }
        else if (this.h.t.aL == 2) {
            n6 = 0;
        }
        for (int i = 0; i < n6; ++i) {
            final cj q = f.q(\u2603.a(this.j.nextInt(n) - this.j.nextInt(n), 0, this.j.nextInt(n) - this.j.nextInt(n)));
            final ady b = f.b(q);
            final cj b2 = q.b();
            final afh c = f.p(b2).c();
            if (q.o() <= \u2603.o() + n && q.o() >= \u2603.o() - n && b.e() && b.a(q) >= 0.15f) {
                final double nextDouble = this.j.nextDouble();
                final double nextDouble2 = this.j.nextDouble();
                if (c.t() == arm.i) {
                    this.h.f.a(cy.l, q.n() + nextDouble, q.o() + 0.1f - c.D(), q.p() + nextDouble2, 0.0, 0.0, 0.0, new int[0]);
                }
                else if (c.t() != arm.a) {
                    c.a((adq)f, b2);
                    if (this.j.nextInt(++n5) == 0) {
                        n2 = b2.n() + nextDouble;
                        n3 = b2.o() + 0.1f + c.E() - 1.0;
                        n4 = b2.p() + nextDouble2;
                    }
                    this.h.f.a(cy.N, b2.n() + nextDouble, b2.o() + 0.1f + c.E(), b2.p() + nextDouble2, 0.0, 0.0, 0.0, new int[0]);
                }
            }
        }
        if (n5 > 0 && this.j.nextInt(3) < this.M++) {
            this.M = 0;
            if (n3 > \u2603.o() + 1 && f.q(\u2603).o() > ns.d((float)\u2603.o())) {
                this.h.f.a(n2, n3, n4, "ambient.weather.rain", 0.1f, 0.5f, false);
            }
            else {
                this.h.f.a(n2, n3, n4, "ambient.weather.rain", 0.2f, 1.0f, false);
            }
        }
    }
    
    protected void c(final float \u2603) {
        final float j = this.h.f.j(\u2603);
        if (j <= 0.0f) {
            return;
        }
        this.i();
        final pk ac = this.h.ac();
        final adm f = this.h.f;
        final int c = ns.c(ac.s);
        final int c2 = ns.c(ac.t);
        final int c3 = ns.c(ac.u);
        final bfx a = bfx.a();
        final bfd c4 = a.c();
        bfl.p();
        GL11.glNormal3f(0.0f, 1.0f, 0.0f);
        bfl.l();
        bfl.a(770, 771, 1, 0);
        bfl.a(516, 0.1f);
        final double n = ac.P + (ac.s - ac.P) * \u2603;
        final double \u26032 = ac.Q + (ac.t - ac.Q) * \u2603;
        final double n2 = ac.R + (ac.u - ac.R) * \u2603;
        final int c5 = ns.c(\u26032);
        int n3 = 5;
        if (this.h.t.i) {
            n3 = 10;
        }
        int n4 = -1;
        final float n5 = this.m + \u2603;
        c4.c(-n, -\u26032, -n2);
        bfl.c(1.0f, 1.0f, 1.0f, 1.0f);
        final cj.a \u26033 = new cj.a();
        for (int i = c3 - n3; i <= c3 + n3; ++i) {
            for (int k = c - n3; k <= c + n3; ++k) {
                final int n6 = (i - c3 + 16) * 32 + (k - c + 16);
                final double n7 = this.N[n6] * 0.5;
                final double n8 = this.O[n6] * 0.5;
                \u26033.c(k, 0, i);
                final ady b = f.b(\u26033);
                if (b.e() || b.d()) {
                    final int o = f.q(\u26033).o();
                    int \u26034 = c2 - n3;
                    int n9 = c2 + n3;
                    if (\u26034 < o) {
                        \u26034 = o;
                    }
                    if (n9 < o) {
                        n9 = o;
                    }
                    int n10 = o;
                    if (n10 < c5) {
                        n10 = c5;
                    }
                    if (\u26034 != n9) {
                        this.j.setSeed(k * k * 3121 + k * 45238971 ^ i * i * 418711 + i * 13761);
                        \u26033.c(k, \u26034, i);
                        final float a2 = b.a(\u26033);
                        if (f.v().a(a2, o) >= 0.15f) {
                            if (n4 != 0) {
                                if (n4 >= 0) {
                                    a.b();
                                }
                                n4 = 0;
                                this.h.P().a(bfk.f);
                                c4.a(7, bms.d);
                            }
                            final double n11 = ((this.m + k * k * 3121 + k * 45238971 + i * i * 418711 + i * 13761 & 0x1F) + (double)\u2603) / 32.0 * (3.0 + this.j.nextDouble());
                            final double n12 = k + 0.5f - ac.s;
                            final double n13 = i + 0.5f - ac.u;
                            final float n14 = ns.a(n12 * n12 + n13 * n13) / n3;
                            final float n15 = ((1.0f - n14 * n14) * 0.5f + 0.5f) * j;
                            \u26033.c(k, n10, i);
                            final int b2 = f.b(\u26033, 0);
                            final int n16 = b2 >> 16 & 0xFFFF;
                            final int n17 = b2 & 0xFFFF;
                            c4.b(k - n7 + 0.5, \u26034, i - n8 + 0.5).a(0.0, \u26034 * 0.25 + n11).a(1.0f, 1.0f, 1.0f, n15).a(n16, n17).d();
                            c4.b(k + n7 + 0.5, \u26034, i + n8 + 0.5).a(1.0, \u26034 * 0.25 + n11).a(1.0f, 1.0f, 1.0f, n15).a(n16, n17).d();
                            c4.b(k + n7 + 0.5, n9, i + n8 + 0.5).a(1.0, n9 * 0.25 + n11).a(1.0f, 1.0f, 1.0f, n15).a(n16, n17).d();
                            c4.b(k - n7 + 0.5, n9, i - n8 + 0.5).a(0.0, n9 * 0.25 + n11).a(1.0f, 1.0f, 1.0f, n15).a(n16, n17).d();
                        }
                        else {
                            if (n4 != 1) {
                                if (n4 >= 0) {
                                    a.b();
                                }
                                n4 = 1;
                                this.h.P().a(bfk.g);
                                c4.a(7, bms.d);
                            }
                            final double n11 = ((this.m & 0x1FF) + \u2603) / 512.0f;
                            final double n12 = this.j.nextDouble() + n5 * 0.01 * (float)this.j.nextGaussian();
                            final double n13 = this.j.nextDouble() + n5 * (float)this.j.nextGaussian() * 0.001;
                            final double n18 = k + 0.5f - ac.s;
                            final double n19 = i + 0.5f - ac.u;
                            final float n20 = ns.a(n18 * n18 + n19 * n19) / n3;
                            final float n21 = ((1.0f - n20 * n20) * 0.3f + 0.5f) * j;
                            \u26033.c(k, n10, i);
                            final int n22 = (f.b(\u26033, 0) * 3 + 15728880) / 4;
                            final int n23 = n22 >> 16 & 0xFFFF;
                            final int n24 = n22 & 0xFFFF;
                            c4.b(k - n7 + 0.5, \u26034, i - n8 + 0.5).a(0.0 + n12, \u26034 * 0.25 + n11 + n13).a(1.0f, 1.0f, 1.0f, n21).a(n23, n24).d();
                            c4.b(k + n7 + 0.5, \u26034, i + n8 + 0.5).a(1.0 + n12, \u26034 * 0.25 + n11 + n13).a(1.0f, 1.0f, 1.0f, n21).a(n23, n24).d();
                            c4.b(k + n7 + 0.5, n9, i + n8 + 0.5).a(1.0 + n12, n9 * 0.25 + n11 + n13).a(1.0f, 1.0f, 1.0f, n21).a(n23, n24).d();
                            c4.b(k - n7 + 0.5, n9, i - n8 + 0.5).a(0.0 + n12, n9 * 0.25 + n11 + n13).a(1.0f, 1.0f, 1.0f, n21).a(n23, n24).d();
                        }
                    }
                }
            }
        }
        if (n4 >= 0) {
            a.b();
        }
        c4.c(0.0, 0.0, 0.0);
        bfl.o();
        bfl.k();
        bfl.a(516, 0.1f);
        this.h();
    }
    
    public void j() {
        final avr avr = new avr(this.h);
        bfl.m(256);
        bfl.n(5889);
        bfl.D();
        bfl.a(0.0, avr.c(), avr.d(), 0.0, 1000.0, 3000.0);
        bfl.n(5888);
        bfl.D();
        bfl.b(0.0f, 0.0f, -2000.0f);
    }
    
    private void i(final float \u2603) {
        final adm f = this.h.f;
        final pk ac = this.h.ac();
        float n = 0.25f + 0.75f * this.h.t.c / 32.0f;
        n = 1.0f - (float)Math.pow(n, 0.25);
        final aui a = f.a(this.h.ac(), \u2603);
        final float n2 = (float)a.a;
        final float n3 = (float)a.b;
        final float n4 = (float)a.c;
        final aui f2 = f.f(\u2603);
        this.Q = (float)f2.a;
        this.R = (float)f2.b;
        this.S = (float)f2.c;
        if (this.h.t.c >= 4) {
            final double \u26032 = -1.0;
            final aui \u26033 = (ns.a(f.d(\u2603)) > 0.0f) ? new aui(\u26032, 0.0, 0.0) : new aui(1.0, 0.0, 0.0);
            float n5 = (float)ac.d(\u2603).b(\u26033);
            if (n5 < 0.0f) {
                n5 = 0.0f;
            }
            if (n5 > 0.0f) {
                final float[] a2 = f.t.a(f.c(\u2603), \u2603);
                if (a2 != null) {
                    n5 *= a2[3];
                    this.Q = this.Q * (1.0f - n5) + a2[0] * n5;
                    this.R = this.R * (1.0f - n5) + a2[1] * n5;
                    this.S = this.S * (1.0f - n5) + a2[2] * n5;
                }
            }
        }
        this.Q += (n2 - this.Q) * n;
        this.R += (n3 - this.R) * n;
        this.S += (n4 - this.S) * n;
        final float j = f.j(\u2603);
        if (j > 0.0f) {
            final float h = 1.0f - j * 0.5f;
            final float n6 = 1.0f - j * 0.4f;
            this.Q *= h;
            this.R *= h;
            this.S *= n6;
        }
        final float h = f.h(\u2603);
        if (h > 0.0f) {
            final float n6 = 1.0f - h * 0.5f;
            this.Q *= n6;
            this.R *= n6;
            this.S *= n6;
        }
        final afh a3 = auz.a(this.h.f, ac, \u2603);
        if (this.B) {
            final aui e = f.e(\u2603);
            this.Q = (float)e.a;
            this.R = (float)e.b;
            this.S = (float)e.c;
        }
        else if (a3.t() == arm.h) {
            float n5 = ack.a(ac) * 0.2f;
            if (ac instanceof pr && ((pr)ac).a(pe.o)) {
                n5 = n5 * 0.3f + 0.6f;
            }
            this.Q = 0.02f + n5;
            this.R = 0.02f + n5;
            this.S = 0.2f + n5;
        }
        else if (a3.t() == arm.i) {
            this.Q = 0.6f;
            this.R = 0.1f;
            this.S = 0.0f;
        }
        float n5 = this.T + (this.U - this.T) * \u2603;
        this.Q *= n5;
        this.R *= n5;
        this.S *= n5;
        double n7 = (ac.Q + (ac.t - ac.Q) * \u2603) * f.t.j();
        if (ac instanceof pr && ((pr)ac).a(pe.q)) {
            final int b = ((pr)ac).b(pe.q).b();
            if (b < 20) {
                n7 *= 1.0f - b / 20.0f;
            }
            else {
                n7 = 0.0;
            }
        }
        if (n7 < 1.0) {
            if (n7 < 0.0) {
                n7 = 0.0;
            }
            n7 *= n7;
            this.Q *= (float)n7;
            this.R *= (float)n7;
            this.S *= (float)n7;
        }
        if (this.z > 0.0f) {
            final float a4 = this.A + (this.z - this.A) * \u2603;
            this.Q = this.Q * (1.0f - a4) + this.Q * 0.7f * a4;
            this.R = this.R * (1.0f - a4) + this.R * 0.6f * a4;
            this.S = this.S * (1.0f - a4) + this.S * 0.6f * a4;
        }
        if (ac instanceof pr && ((pr)ac).a(pe.r)) {
            final float a4 = this.a((pr)ac, \u2603);
            float r = 1.0f / this.Q;
            if (r > 1.0f / this.R) {
                r = 1.0f / this.R;
            }
            if (r > 1.0f / this.S) {
                r = 1.0f / this.S;
            }
            this.Q = this.Q * (1.0f - a4) + this.Q * r * a4;
            this.R = this.R * (1.0f - a4) + this.R * r * a4;
            this.S = this.S * (1.0f - a4) + this.S * r * a4;
        }
        if (this.h.t.e) {
            final float a4 = (this.Q * 30.0f + this.R * 59.0f + this.S * 11.0f) / 100.0f;
            final float r = (this.Q * 30.0f + this.R * 70.0f) / 100.0f;
            final float s = (this.Q * 30.0f + this.S * 70.0f) / 100.0f;
            this.Q = a4;
            this.R = r;
            this.S = s;
        }
        bfl.a(this.Q, this.R, this.S, 0.0f);
    }
    
    private void a(final int \u2603, final float \u2603) {
        final pk ac = this.h.ac();
        boolean d = false;
        if (ac instanceof wn) {
            d = ((wn)ac).bA.d;
        }
        GL11.glFog(2918, this.a(this.Q, this.R, this.S, 1.0f));
        GL11.glNormal3f(0.0f, -1.0f, 0.0f);
        bfl.c(1.0f, 1.0f, 1.0f, 1.0f);
        final afh a = auz.a(this.h.f, ac, \u2603);
        if (ac instanceof pr && ((pr)ac).a(pe.q)) {
            float k = 5.0f;
            final int b = ((pr)ac).b(pe.q).b();
            if (b < 20) {
                k = 5.0f + (this.k - 5.0f) * (1.0f - b / 20.0f);
            }
            bfl.d(9729);
            if (\u2603 == -1) {
                bfl.b(0.0f);
                bfl.c(k * 0.8f);
            }
            else {
                bfl.b(k * 0.25f);
                bfl.c(k);
            }
            if (GLContext.getCapabilities().GL_NV_fog_distance) {
                GL11.glFogi(34138, 34139);
            }
        }
        else if (this.B) {
            bfl.d(2048);
            bfl.a(0.1f);
        }
        else if (a.t() == arm.h) {
            bfl.d(2048);
            if (ac instanceof pr && ((pr)ac).a(pe.o)) {
                bfl.a(0.01f);
            }
            else {
                bfl.a(0.1f - ack.a(ac) * 0.03f);
            }
        }
        else if (a.t() == arm.i) {
            bfl.d(2048);
            bfl.a(2.0f);
        }
        else {
            final float k = this.k;
            bfl.d(9729);
            if (\u2603 == -1) {
                bfl.b(0.0f);
                bfl.c(k);
            }
            else {
                bfl.b(k * 0.75f);
                bfl.c(k);
            }
            if (GLContext.getCapabilities().GL_NV_fog_distance) {
                GL11.glFogi(34138, 34139);
            }
            if (this.h.f.t.b((int)ac.s, (int)ac.u)) {
                bfl.b(k * 0.05f);
                bfl.c(Math.min(k, 192.0f) * 0.5f);
            }
        }
        bfl.g();
        bfl.m();
        bfl.a(1028, 4608);
    }
    
    private FloatBuffer a(final float \u2603, final float \u2603, final float \u2603, final float \u2603) {
        this.P.clear();
        this.P.put(\u2603).put(\u2603).put(\u2603).put(\u2603);
        this.P.flip();
        return this.P;
    }
    
    public avq k() {
        return this.l;
    }
    
    static {
        e = LogManager.getLogger();
        f = new jy("textures/environment/rain.png");
        g = new jy("textures/environment/snow.png");
        ab = new jy[] { new jy("shaders/post/notch.json"), new jy("shaders/post/fxaa.json"), new jy("shaders/post/art.json"), new jy("shaders/post/bumpy.json"), new jy("shaders/post/blobs2.json"), new jy("shaders/post/pencil.json"), new jy("shaders/post/color_convolve.json"), new jy("shaders/post/deconverge.json"), new jy("shaders/post/flip.json"), new jy("shaders/post/invert.json"), new jy("shaders/post/ntsc.json"), new jy("shaders/post/outline.json"), new jy("shaders/post/phosphor.json"), new jy("shaders/post/scan_pincushion.json"), new jy("shaders/post/sobel.json"), new jy("shaders/post/bits.json"), new jy("shaders/post/desaturate.json"), new jy("shaders/post/green.json"), new jy("shaders/post/blur.json"), new jy("shaders/post/wobble.json"), new jy("shaders/post/blobs.json"), new jy("shaders/post/antialias.json"), new jy("shaders/post/creeper.json"), new jy("shaders/post/spider.json") };
        d = bfk.ab.length;
    }
}
