import java.util.EnumSet;
import org.apache.logging.log4j.LogManager;
import java.util.concurrent.Callable;
import org.lwjgl.util.vector.Matrix4f;
import org.lwjgl.util.vector.Vector3f;
import java.util.Queue;
import java.util.Collection;
import java.util.Iterator;
import java.util.Random;
import com.google.gson.JsonSyntaxException;
import java.io.IOException;
import org.lwjgl.opengl.GL11;
import com.google.common.collect.Maps;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import org.lwjgl.util.vector.Vector4f;
import java.util.Map;
import java.util.List;
import java.util.Set;
import org.apache.logging.log4j.Logger;

// 
// Decompiled by Procyon v0.5.36
// 

public class bfr implements ado, bnj
{
    private static final Logger b;
    private static final jy c;
    private static final jy d;
    private static final jy e;
    private static final jy f;
    private static final jy g;
    private final ave h;
    private final bmj i;
    private final biu j;
    private bdb k;
    private Set<bht> l;
    private List<a> m;
    private final Set<akw> n;
    private bga o;
    private int p;
    private int q;
    private int r;
    private bmu s;
    private bmt t;
    private bmt u;
    private bmt v;
    private int w;
    private final Map<Integer, kw> x;
    private final Map<cj, bpj> y;
    private final bmi[] z;
    private bfw A;
    private blr B;
    private double C;
    private double D;
    private double E;
    private int F;
    private int G;
    private int H;
    private double I;
    private double J;
    private double K;
    private double L;
    private double M;
    private final bho N;
    private bfh O;
    private int P;
    private int Q;
    private int R;
    private int S;
    private int T;
    private boolean U;
    private bid V;
    private final Vector4f[] W;
    private final bqr X;
    private boolean Y;
    bhu a;
    private double Z;
    private double aa;
    private double ab;
    private boolean ac;
    
    public bfr(final ave \u2603) {
        this.l = (Set<bht>)Sets.newLinkedHashSet();
        this.m = (List<a>)Lists.newArrayListWithCapacity(69696);
        this.n = (Set<akw>)Sets.newHashSet();
        this.p = -1;
        this.q = -1;
        this.r = -1;
        this.x = (Map<Integer, kw>)Maps.newHashMap();
        this.y = (Map<cj, bpj>)Maps.newHashMap();
        this.z = new bmi[10];
        this.C = Double.MIN_VALUE;
        this.D = Double.MIN_VALUE;
        this.E = Double.MIN_VALUE;
        this.F = Integer.MIN_VALUE;
        this.G = Integer.MIN_VALUE;
        this.H = Integer.MIN_VALUE;
        this.I = Double.MIN_VALUE;
        this.J = Double.MIN_VALUE;
        this.K = Double.MIN_VALUE;
        this.L = Double.MIN_VALUE;
        this.M = Double.MIN_VALUE;
        this.N = new bho();
        this.P = -1;
        this.Q = 2;
        this.U = false;
        this.W = new Vector4f[8];
        this.X = new bqr();
        this.Y = false;
        this.ac = true;
        this.h = \u2603;
        this.j = \u2603.af();
        (this.i = \u2603.P()).a(bfr.g);
        GL11.glTexParameteri(3553, 10242, 10497);
        GL11.glTexParameteri(3553, 10243, 10497);
        bfl.i(0);
        this.n();
        this.Y = bqs.f();
        if (this.Y) {
            this.O = new bfy();
            this.a = new bhv();
        }
        else {
            this.O = new bft();
            this.a = new bhr();
        }
        (this.s = new bmu()).a(new bmv(0, bmv.a.a, bmv.b.a, 3));
        this.q();
        this.p();
        this.o();
    }
    
    @Override
    public void a(final bni \u2603) {
        this.n();
    }
    
    private void n() {
        final bmh t = this.h.T();
        for (int i = 0; i < this.z.length; ++i) {
            this.z[i] = t.a("minecraft:blocks/destroy_stage_" + i);
        }
    }
    
    public void b() {
        if (bqs.O) {
            if (blu.b() == null) {
                blu.a();
            }
            final jy obj = new jy("shaders/post/entity_outline.json");
            try {
                (this.B = new blr(this.h.P(), this.h.Q(), this.h.b(), obj)).a(this.h.d, this.h.e);
                this.A = this.B.a("final");
            }
            catch (IOException throwable) {
                bfr.b.warn("Failed to load shader: " + obj, throwable);
                this.B = null;
                this.A = null;
            }
            catch (JsonSyntaxException throwable2) {
                bfr.b.warn("Failed to load shader: " + obj, throwable2);
                this.B = null;
                this.A = null;
            }
        }
        else {
            this.B = null;
            this.A = null;
        }
    }
    
    public void c() {
        if (this.d()) {
            bfl.l();
            bfl.a(770, 771, 0, 1);
            this.A.a(this.h.d, this.h.e, false);
            bfl.k();
        }
    }
    
    protected boolean d() {
        return this.A != null && this.B != null && this.h.h != null && this.h.h.v() && this.h.t.aq.d();
    }
    
    private void o() {
        final bfx a = bfx.a();
        final bfd c = a.c();
        if (this.v != null) {
            this.v.c();
        }
        if (this.r >= 0) {
            avd.b(this.r);
            this.r = -1;
        }
        if (this.Y) {
            this.v = new bmt(this.s);
            this.a(c, -16.0f, true);
            c.e();
            c.b();
            this.v.a(c.f());
        }
        else {
            GL11.glNewList(this.r = avd.a(1), 4864);
            this.a(c, -16.0f, true);
            a.b();
            GL11.glEndList();
        }
    }
    
    private void p() {
        final bfx a = bfx.a();
        final bfd c = a.c();
        if (this.u != null) {
            this.u.c();
        }
        if (this.q >= 0) {
            avd.b(this.q);
            this.q = -1;
        }
        if (this.Y) {
            this.u = new bmt(this.s);
            this.a(c, 16.0f, false);
            c.e();
            c.b();
            this.u.a(c.f());
        }
        else {
            GL11.glNewList(this.q = avd.a(1), 4864);
            this.a(c, 16.0f, false);
            a.b();
            GL11.glEndList();
        }
    }
    
    private void a(final bfd \u2603, final float \u2603, final boolean \u2603) {
        final int n = 64;
        final int n2 = 6;
        \u2603.a(7, bms.e);
        for (int i = -384; i <= 384; i += 64) {
            for (int j = -384; j <= 384; j += 64) {
                float n3 = (float)i;
                float n4 = (float)(i + 64);
                if (\u2603) {
                    n4 = (float)i;
                    n3 = (float)(i + 64);
                }
                \u2603.b(n3, \u2603, (double)j).d();
                \u2603.b(n4, \u2603, (double)j).d();
                \u2603.b(n4, \u2603, (double)(j + 64)).d();
                \u2603.b(n3, \u2603, (double)(j + 64)).d();
            }
        }
    }
    
    private void q() {
        final bfx a = bfx.a();
        final bfd c = a.c();
        if (this.t != null) {
            this.t.c();
        }
        if (this.p >= 0) {
            avd.b(this.p);
            this.p = -1;
        }
        if (this.Y) {
            this.t = new bmt(this.s);
            this.a(c);
            c.e();
            c.b();
            this.t.a(c.f());
        }
        else {
            this.p = avd.a(1);
            bfl.E();
            GL11.glNewList(this.p, 4864);
            this.a(c);
            a.b();
            GL11.glEndList();
            bfl.F();
        }
    }
    
    private void a(final bfd \u2603) {
        final Random random = new Random(10842L);
        \u2603.a(7, bms.e);
        for (int i = 0; i < 1500; ++i) {
            double y = random.nextFloat() * 2.0f - 1.0f;
            double x = random.nextFloat() * 2.0f - 1.0f;
            double x2 = random.nextFloat() * 2.0f - 1.0f;
            final double n = 0.15f + random.nextFloat() * 0.1f;
            double a = y * y + x * x + x2 * x2;
            if (a < 1.0 && a > 0.01) {
                a = 1.0 / Math.sqrt(a);
                y *= a;
                x *= a;
                x2 *= a;
                final double n2 = y * 100.0;
                final double n3 = x * 100.0;
                final double n4 = x2 * 100.0;
                final double atan2 = Math.atan2(y, x2);
                final double sin = Math.sin(atan2);
                final double cos = Math.cos(atan2);
                final double atan3 = Math.atan2(Math.sqrt(y * y + x2 * x2), x);
                final double sin2 = Math.sin(atan3);
                final double cos2 = Math.cos(atan3);
                final double n5 = random.nextDouble() * 3.141592653589793 * 2.0;
                final double sin3 = Math.sin(n5);
                final double cos3 = Math.cos(n5);
                for (int j = 0; j < 4; ++j) {
                    final double n6 = 0.0;
                    final double n7 = ((j & 0x2) - 1) * n;
                    final double n8 = ((j + 1 & 0x2) - 1) * n;
                    final double n9 = 0.0;
                    final double n10 = n7 * cos3 - n8 * sin3;
                    final double n12;
                    final double n11 = n12 = n8 * cos3 + n7 * sin3;
                    final double n13 = n10 * sin2 + 0.0 * cos2;
                    final double n14 = 0.0 * sin2 - n10 * cos2;
                    final double n15 = n14 * sin - n12 * cos;
                    final double n16 = n13;
                    final double n17 = n12 * sin + n14 * cos;
                    \u2603.b(n2 + n15, n3 + n16, n4 + n17).d();
                }
            }
        }
    }
    
    public void a(final bdb \u2603) {
        if (this.k != null) {
            this.k.b(this);
        }
        this.C = Double.MIN_VALUE;
        this.D = Double.MIN_VALUE;
        this.E = Double.MIN_VALUE;
        this.F = Integer.MIN_VALUE;
        this.G = Integer.MIN_VALUE;
        this.H = Integer.MIN_VALUE;
        this.j.a(\u2603);
        if ((this.k = \u2603) != null) {
            \u2603.a(this);
            this.a();
        }
    }
    
    public void a() {
        if (this.k == null) {
            return;
        }
        this.ac = true;
        afi.t.b(this.h.t.i);
        afi.u.b(this.h.t.i);
        this.P = this.h.t.c;
        final boolean y = this.Y;
        this.Y = bqs.f();
        if (y && !this.Y) {
            this.O = new bft();
            this.a = new bhr();
        }
        else if (!y && this.Y) {
            this.O = new bfy();
            this.a = new bhv();
        }
        if (y != this.Y) {
            this.q();
            this.p();
            this.o();
        }
        if (this.o != null) {
            this.o.a();
        }
        this.e();
        synchronized (this.n) {
            this.n.clear();
        }
        this.o = new bga(this.k, this.h.t.c, this, this.a);
        if (this.k != null) {
            final pk ac = this.h.ac();
            if (ac != null) {
                this.o.a(ac.s, ac.u);
            }
        }
        this.Q = 2;
    }
    
    protected void e() {
        this.l.clear();
        this.N.b();
    }
    
    public void a(final int \u2603, final int \u2603) {
        if (!bqs.O) {
            return;
        }
        if (this.B != null) {
            this.B.a(\u2603, \u2603);
        }
    }
    
    public void a(final pk \u2603, final bia \u2603, final float \u2603) {
        if (this.Q > 0) {
            --this.Q;
            return;
        }
        final double \u26032 = \u2603.p + (\u2603.s - \u2603.p) * \u2603;
        final double \u26033 = \u2603.q + (\u2603.t - \u2603.q) * \u2603;
        final double \u26034 = \u2603.r + (\u2603.u - \u2603.r) * \u2603;
        this.k.B.a("prepare");
        bhc.a.a(this.k, this.h.P(), this.h.k, this.h.ac(), \u2603);
        this.j.a(this.k, this.h.k, this.h.ac(), this.h.i, this.h.t, \u2603);
        this.R = 0;
        this.S = 0;
        this.T = 0;
        final pk ac = this.h.ac();
        final double n = ac.P + (ac.s - ac.P) * \u2603;
        final double n2 = ac.Q + (ac.t - ac.Q) * \u2603;
        final double n3 = ac.R + (ac.u - ac.R) * \u2603;
        bhc.b = n;
        bhc.c = n2;
        bhc.d = n3;
        this.j.a(n, n2, n3);
        this.h.o.i();
        this.k.B.c("global");
        final List<pk> e = this.k.E();
        this.R = e.size();
        for (int i = 0; i < this.k.k.size(); ++i) {
            final pk pk = this.k.k.get(i);
            ++this.S;
            if (pk.h(\u26032, \u26033, \u26034)) {
                this.j.a(pk, \u2603);
            }
        }
        if (this.d()) {
            bfl.c(519);
            bfl.n();
            this.A.f();
            this.A.a(false);
            this.k.B.c("entityOutlines");
            avc.a();
            this.j.c(true);
            for (int i = 0; i < e.size(); ++i) {
                final pk pk = e.get(i);
                final boolean b = this.h.ac() instanceof pr && ((pr)this.h.ac()).bJ();
                final boolean b2 = pk.h(\u26032, \u26033, \u26034) && (pk.ah || \u2603.a(pk.aR()) || pk.l == this.h.h) && pk instanceof wn;
                if (pk != this.h.ac() || this.h.t.aA != 0 || b) {
                    if (b2) {
                        this.j.a(pk, \u2603);
                    }
                }
            }
            this.j.c(false);
            avc.b();
            bfl.a(false);
            this.B.a(\u2603);
            bfl.e();
            bfl.a(true);
            this.h.b().a(false);
            bfl.m();
            bfl.l();
            bfl.g();
            bfl.c(515);
            bfl.j();
            bfl.d();
        }
        this.k.B.c("entities");
        for (final a a : this.m) {
            final amy f = this.k.f(a.a.j());
            final ne<pk> ne = f.s()[a.a.j().o() / 16];
            if (ne.isEmpty()) {
                continue;
            }
            for (final pk pk2 : ne) {
                final boolean b3 = this.j.a(pk2, \u2603, \u26032, \u26033, \u26034) || pk2.l == this.h.h;
                if (b3) {
                    final boolean b4 = this.h.ac() instanceof pr && ((pr)this.h.ac()).bJ();
                    if (pk2 == this.h.ac() && this.h.t.aA == 0 && !b4) {
                        continue;
                    }
                    if (pk2.t >= 0.0 && pk2.t < 256.0 && !this.k.e(new cj(pk2))) {
                        continue;
                    }
                    ++this.S;
                    this.j.a(pk2, \u2603);
                }
                if (!b3 && pk2 instanceof xd) {
                    this.h.af().b(pk2, \u2603);
                }
            }
        }
        this.k.B.c("blockentities");
        avc.b();
        for (final a a : this.m) {
            final List<akw> b5 = a.a.g().b();
            if (b5.isEmpty()) {
                continue;
            }
            for (final akw \u26035 : b5) {
                bhc.a.a(\u26035, \u2603, -1);
            }
        }
        synchronized (this.n) {
            for (final akw \u26036 : this.n) {
                bhc.a.a(\u26036, \u2603, -1);
            }
        }
        this.s();
        for (final kw kw : this.x.values()) {
            cj cj = kw.b();
            akw \u26037 = this.k.s(cj);
            if (\u26037 instanceof aky) {
                final aky aky = (aky)\u26037;
                if (aky.h != null) {
                    cj = cj.a(cq.e);
                    \u26037 = this.k.s(cj);
                }
                else if (aky.f != null) {
                    cj = cj.a(cq.c);
                    \u26037 = this.k.s(cj);
                }
            }
            final afh c = this.k.p(cj).c();
            if (\u26037 != null && (c instanceof afs || c instanceof agp || c instanceof ajl || c instanceof ajm)) {
                bhc.a.a(\u26037, \u2603, kw.c());
            }
        }
        this.t();
        this.h.o.h();
        this.h.A.b();
    }
    
    public String f() {
        final int length = this.o.f.length;
        int i = 0;
        for (final a a : this.m) {
            final bhq b = a.a.b;
            if (b != bhq.a && !b.a()) {
                ++i;
            }
        }
        return String.format("C: %d/%d %sD: %d, %s", i, length, this.h.G ? "(s) " : "", this.P, this.N.a());
    }
    
    public String g() {
        return "E: " + this.S + "/" + this.R + ", B: " + this.T + ", I: " + (this.R - this.T - this.S);
    }
    
    public void a(final pk \u2603, final double \u2603, bia \u2603, final int \u2603, final boolean \u2603) {
        if (this.h.t.c != this.P) {
            this.a();
        }
        this.k.B.a("camera");
        final double n = \u2603.s - this.C;
        final double n2 = \u2603.t - this.D;
        final double n3 = \u2603.u - this.E;
        if (this.F != \u2603.ae || this.G != \u2603.af || this.H != \u2603.ag || n * n + n2 * n2 + n3 * n3 > 16.0) {
            this.C = \u2603.s;
            this.D = \u2603.t;
            this.E = \u2603.u;
            this.F = \u2603.ae;
            this.G = \u2603.af;
            this.H = \u2603.ag;
            this.o.a(\u2603.s, \u2603.u);
        }
        this.k.B.c("renderlistcamera");
        final double \u26032 = \u2603.P + (\u2603.s - \u2603.P) * \u2603;
        final double n4 = \u2603.Q + (\u2603.t - \u2603.Q) * \u2603;
        final double \u26033 = \u2603.R + (\u2603.u - \u2603.R) * \u2603;
        this.O.a(\u26032, n4, \u26033);
        this.k.B.c("cull");
        if (this.V != null) {
            final bic bic = new bic(this.V);
            bic.a(this.X.a, this.X.b, this.X.c);
            \u2603 = bic;
        }
        this.h.A.c("culling");
        final cj \u26034 = new cj(\u26032, n4 + \u2603.aS(), \u26033);
        final bht a = this.o.a(\u26034);
        final cj cj = new cj(ns.c(\u26032 / 16.0) * 16, ns.c(n4 / 16.0) * 16, ns.c(\u26033 / 16.0) * 16);
        this.ac = (this.ac || !this.l.isEmpty() || \u2603.s != this.I || \u2603.t != this.J || \u2603.u != this.K || \u2603.z != this.L || \u2603.y != this.M);
        this.I = \u2603.s;
        this.J = \u2603.t;
        this.K = \u2603.u;
        this.L = \u2603.z;
        this.M = \u2603.y;
        final boolean b = this.V != null;
        if (!b && this.ac) {
            this.ac = false;
            this.m = (List<a>)Lists.newArrayList();
            final Queue<a> linkedList = (Queue<a>)Lists.newLinkedList();
            boolean g = this.h.G;
            if (a == null) {
                final int \u26035 = (\u26034.o() > 0) ? 248 : 8;
                for (int i = -this.P; i <= this.P; ++i) {
                    for (int j = -this.P; j <= this.P; ++j) {
                        final bht a2 = this.o.a(new cj((i << 4) + 8, \u26035, (j << 4) + 8));
                        if (a2 != null && \u2603.a(a2.c)) {
                            a2.a(\u2603);
                            linkedList.add(new a(a2, (cq)null, 0));
                        }
                    }
                }
            }
            else {
                boolean b2 = false;
                final a a3 = new a(a, (cq)null, 0);
                final Set<cq> c = this.c(\u26034);
                if (c.size() == 1) {
                    final Vector3f a4 = this.a(\u2603, \u2603);
                    final cq d = cq.a(a4.x, a4.y, a4.z).d();
                    c.remove(d);
                }
                if (c.isEmpty()) {
                    b2 = true;
                }
                if (!b2 || \u2603) {
                    if (\u2603 && this.k.p(\u26034).c().c()) {
                        g = false;
                    }
                    a.a(\u2603);
                    linkedList.add(a3);
                }
                else {
                    this.m.add(a3);
                }
            }
            while (!linkedList.isEmpty()) {
                final a a5 = linkedList.poll();
                final bht bht = a5.a;
                final cq b3 = a5.b;
                final cj k = bht.j();
                this.m.add(a5);
                for (final cq \u26036 : cq.values()) {
                    final bht a6 = this.a(cj, bht, \u26036);
                    if (!g || !a5.c.contains(\u26036.d())) {
                        if (!g || b3 == null || bht.g().a(b3.d(), \u26036)) {
                            if (a6 != null) {
                                if (a6.a(\u2603)) {
                                    if (\u2603.a(a6.c)) {
                                        final a a7 = new a(a6, \u26036, a5.d + 1);
                                        a7.c.addAll(a5.c);
                                        a7.c.add(\u26036);
                                        linkedList.add(a7);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (this.U) {
            this.a(\u26032, n4, \u26033);
            this.U = false;
        }
        this.N.e();
        final Set<bht> m = this.l;
        this.l = (Set<bht>)Sets.newLinkedHashSet();
        final Iterator iterator = this.m.iterator();
        while (iterator.hasNext()) {
            final a a5 = iterator.next();
            final bht bht = a5.a;
            if (bht.l() || m.contains(bht)) {
                this.ac = true;
                if (this.a(cj, a5.a)) {
                    this.h.A.a("build near");
                    this.N.b(bht);
                    bht.a(false);
                    this.h.A.b();
                }
                else {
                    this.l.add(bht);
                }
            }
        }
        this.l.addAll(m);
        this.h.A.b();
    }
    
    private boolean a(final cj \u2603, final bht \u2603) {
        final cj j = \u2603.j();
        return ns.a(\u2603.n() - j.n()) <= 16 && ns.a(\u2603.o() - j.o()) <= 16 && ns.a(\u2603.p() - j.p()) <= 16;
    }
    
    private Set<cq> c(final cj \u2603) {
        final bhw bhw = new bhw();
        final cj cj = new cj(\u2603.n() >> 4 << 4, \u2603.o() >> 4 << 4, \u2603.p() >> 4 << 4);
        final amy f = this.k.f(cj);
        for (final cj.a a : cj.b(cj, cj.a(15, 15, 15))) {
            if (f.a(a).c()) {
                bhw.a(a);
            }
        }
        return bhw.b(\u2603);
    }
    
    private bht a(final cj \u2603, final bht \u2603, final cq \u2603) {
        final cj a = \u2603.a(\u2603);
        if (ns.a(\u2603.n() - a.n()) > this.P * 16) {
            return null;
        }
        if (a.o() < 0 || a.o() >= 256) {
            return null;
        }
        if (ns.a(\u2603.p() - a.p()) > this.P * 16) {
            return null;
        }
        return this.o.a(a);
    }
    
    private void a(final double \u2603, final double \u2603, final double \u2603) {
        this.V = new bib();
        ((bib)this.V).b();
        final bqq right = new bqq(this.V.c);
        right.transpose();
        final bqq left = new bqq(this.V.b);
        left.transpose();
        final bqq bqq = new bqq();
        Matrix4f.mul(left, right, bqq);
        bqq.invert();
        this.X.a = \u2603;
        this.X.b = \u2603;
        this.X.c = \u2603;
        this.W[0] = new Vector4f(-1.0f, -1.0f, -1.0f, 1.0f);
        this.W[1] = new Vector4f(1.0f, -1.0f, -1.0f, 1.0f);
        this.W[2] = new Vector4f(1.0f, 1.0f, -1.0f, 1.0f);
        this.W[3] = new Vector4f(-1.0f, 1.0f, -1.0f, 1.0f);
        this.W[4] = new Vector4f(-1.0f, -1.0f, 1.0f, 1.0f);
        this.W[5] = new Vector4f(1.0f, -1.0f, 1.0f, 1.0f);
        this.W[6] = new Vector4f(1.0f, 1.0f, 1.0f, 1.0f);
        this.W[7] = new Vector4f(-1.0f, 1.0f, 1.0f, 1.0f);
        for (int i = 0; i < 8; ++i) {
            Matrix4f.transform(bqq, this.W[i], this.W[i]);
            final Vector4f vector4f = this.W[i];
            vector4f.x /= this.W[i].w;
            final Vector4f vector4f2 = this.W[i];
            vector4f2.y /= this.W[i].w;
            final Vector4f vector4f3 = this.W[i];
            vector4f3.z /= this.W[i].w;
            this.W[i].w = 1.0f;
        }
    }
    
    protected Vector3f a(final pk \u2603, final double \u2603) {
        float n = (float)(\u2603.B + (\u2603.z - \u2603.B) * \u2603);
        final float n2 = (float)(\u2603.A + (\u2603.y - \u2603.A) * \u2603);
        if (ave.A().t.aA == 2) {
            n += 180.0f;
        }
        final float b = ns.b(-n2 * 0.017453292f - 3.1415927f);
        final float a = ns.a(-n2 * 0.017453292f - 3.1415927f);
        final float n3 = -ns.b(-n * 0.017453292f);
        final float a2 = ns.a(-n * 0.017453292f);
        return new Vector3f(a * n3, a2, b * n3);
    }
    
    public int a(final adf \u2603, final double \u2603, final int \u2603, final pk \u2603) {
        avc.a();
        if (\u2603 == adf.d) {
            this.h.A.a("translucent_sort");
            final double n = \u2603.s - this.Z;
            final double n2 = \u2603.t - this.aa;
            final double n3 = \u2603.u - this.ab;
            if (n * n + n2 * n2 + n3 * n3 > 1.0) {
                this.Z = \u2603.s;
                this.aa = \u2603.t;
                this.ab = \u2603.u;
                int n4 = 0;
                for (final a a : this.m) {
                    if (a.a.b.d(\u2603) && n4++ < 15) {
                        this.N.c(a.a);
                    }
                }
            }
            this.h.A.b();
        }
        this.h.A.a("filterempty");
        int n5 = 0;
        final boolean b = \u2603 == adf.d;
        final int n6 = b ? (this.m.size() - 1) : 0;
        for (int n7 = b ? -1 : this.m.size(), n8 = b ? -1 : 1, i = n6; i != n7; i += n8) {
            final bht a2 = this.m.get(i).a;
            if (!a2.g().b(\u2603)) {
                ++n5;
                this.O.a(a2, \u2603);
            }
        }
        this.h.A.c("render_" + \u2603);
        this.a(\u2603);
        this.h.A.b();
        return n5;
    }
    
    private void a(final adf \u2603) {
        this.h.o.i();
        if (bqs.f()) {
            GL11.glEnableClientState(32884);
            bqs.l(bqs.q);
            GL11.glEnableClientState(32888);
            bqs.l(bqs.r);
            GL11.glEnableClientState(32888);
            bqs.l(bqs.q);
            GL11.glEnableClientState(32886);
        }
        this.O.a(\u2603);
        if (bqs.f()) {
            final List<bmv> h = bms.a.h();
            for (final bmv bmv : h) {
                final bmv.b b = bmv.b();
                final int d = bmv.d();
                switch (bfr$2.a[b.ordinal()]) {
                    case 1: {
                        GL11.glDisableClientState(32884);
                        continue;
                    }
                    case 2: {
                        bqs.l(bqs.q + d);
                        GL11.glDisableClientState(32888);
                        bqs.l(bqs.q);
                        continue;
                    }
                    case 3: {
                        GL11.glDisableClientState(32886);
                        bfl.G();
                        continue;
                    }
                }
            }
        }
        this.h.o.h();
    }
    
    private void a(final Iterator<kw> \u2603) {
        while (\u2603.hasNext()) {
            final kw kw = \u2603.next();
            final int d = kw.d();
            if (this.w - d > 400) {
                \u2603.remove();
            }
        }
    }
    
    public void j() {
        ++this.w;
        if (this.w % 20 == 0) {
            this.a(this.x.values().iterator());
        }
    }
    
    private void r() {
        bfl.n();
        bfl.c();
        bfl.l();
        bfl.a(770, 771, 1, 0);
        avc.a();
        bfl.a(false);
        this.i.a(bfr.f);
        final bfx a = bfx.a();
        final bfd c = a.c();
        for (int i = 0; i < 6; ++i) {
            bfl.E();
            if (i == 1) {
                bfl.b(90.0f, 1.0f, 0.0f, 0.0f);
            }
            if (i == 2) {
                bfl.b(-90.0f, 1.0f, 0.0f, 0.0f);
            }
            if (i == 3) {
                bfl.b(180.0f, 1.0f, 0.0f, 0.0f);
            }
            if (i == 4) {
                bfl.b(90.0f, 0.0f, 0.0f, 1.0f);
            }
            if (i == 5) {
                bfl.b(-90.0f, 0.0f, 0.0f, 1.0f);
            }
            c.a(7, bms.i);
            c.b(-100.0, -100.0, -100.0).a(0.0, 0.0).b(40, 40, 40, 255).d();
            c.b(-100.0, -100.0, 100.0).a(0.0, 16.0).b(40, 40, 40, 255).d();
            c.b(100.0, -100.0, 100.0).a(16.0, 16.0).b(40, 40, 40, 255).d();
            c.b(100.0, -100.0, -100.0).a(16.0, 0.0).b(40, 40, 40, 255).d();
            a.b();
            bfl.F();
        }
        bfl.a(true);
        bfl.w();
        bfl.d();
    }
    
    public void a(final float \u2603, final int \u2603) {
        if (this.h.f.t.q() == 1) {
            this.r();
            return;
        }
        if (!this.h.f.t.d()) {
            return;
        }
        bfl.x();
        final aui a = this.k.a(this.h.ac(), \u2603);
        float \u26032 = (float)a.a;
        float \u26033 = (float)a.b;
        float \u26034 = (float)a.c;
        if (\u2603 != 2) {
            final float n = (\u26032 * 30.0f + \u26033 * 59.0f + \u26034 * 11.0f) / 100.0f;
            final float n2 = (\u26032 * 30.0f + \u26033 * 70.0f) / 100.0f;
            final float n3 = (\u26032 * 30.0f + \u26034 * 70.0f) / 100.0f;
            \u26032 = n;
            \u26033 = n2;
            \u26034 = n3;
        }
        bfl.c(\u26032, \u26033, \u26034);
        final bfx a2 = bfx.a();
        final bfd c = a2.c();
        bfl.a(false);
        bfl.m();
        bfl.c(\u26032, \u26033, \u26034);
        if (this.Y) {
            this.u.a();
            GL11.glEnableClientState(32884);
            GL11.glVertexPointer(3, 5126, 12, 0L);
            this.u.a(7);
            this.u.b();
            GL11.glDisableClientState(32884);
        }
        else {
            bfl.o(this.q);
        }
        bfl.n();
        bfl.c();
        bfl.l();
        bfl.a(770, 771, 1, 0);
        avc.a();
        final float[] a3 = this.k.t.a(this.k.c(\u2603), \u2603);
        if (a3 != null) {
            bfl.x();
            bfl.j(7425);
            bfl.E();
            bfl.b(90.0f, 1.0f, 0.0f, 0.0f);
            bfl.b((ns.a(this.k.d(\u2603)) < 0.0f) ? 180.0f : 0.0f, 0.0f, 0.0f, 1.0f);
            bfl.b(90.0f, 0.0f, 0.0f, 1.0f);
            float n4 = a3[0];
            float \u26035 = a3[1];
            float \u26036 = a3[2];
            if (\u2603 != 2) {
                final float n5 = (n4 * 30.0f + \u26035 * 59.0f + \u26036 * 11.0f) / 100.0f;
                final float n6 = (n4 * 30.0f + \u26035 * 70.0f) / 100.0f;
                final float n7 = (n4 * 30.0f + \u26036 * 70.0f) / 100.0f;
                n4 = n5;
                \u26035 = n6;
                \u26036 = n7;
            }
            c.a(6, bms.f);
            c.b(0.0, 100.0, 0.0).a(n4, \u26035, \u26036, a3[3]).d();
            final int n8 = 16;
            for (int i = 0; i <= 16; ++i) {
                final float n7 = i * 3.1415927f * 2.0f / 16.0f;
                final float a4 = ns.a(n7);
                final float b = ns.b(n7);
                c.b(a4 * 120.0f, b * 120.0f, (double)(-b * 40.0f * a3[3])).a(a3[0], a3[1], a3[2], 0.0f).d();
            }
            a2.b();
            bfl.F();
            bfl.j(7424);
        }
        bfl.w();
        bfl.a(770, 1, 1, 0);
        bfl.E();
        float n4 = 1.0f - this.k.j(\u2603);
        bfl.c(1.0f, 1.0f, 1.0f, n4);
        bfl.b(-90.0f, 0.0f, 1.0f, 0.0f);
        bfl.b(this.k.c(\u2603) * 360.0f, 1.0f, 0.0f, 0.0f);
        float \u26035 = 30.0f;
        this.i.a(bfr.d);
        c.a(7, bms.g);
        c.b(-\u26035, 100.0, -\u26035).a(0.0, 0.0).d();
        c.b(\u26035, 100.0, -\u26035).a(1.0, 0.0).d();
        c.b(\u26035, 100.0, \u26035).a(1.0, 1.0).d();
        c.b(-\u26035, 100.0, \u26035).a(0.0, 1.0).d();
        a2.b();
        \u26035 = 20.0f;
        this.i.a(bfr.c);
        final int x = this.k.x();
        final int n8 = x % 4;
        int i = x / 4 % 2;
        float n7 = (n8 + 0) / 4.0f;
        final float a4 = (i + 0) / 2.0f;
        final float b = (n8 + 1) / 4.0f;
        final float n9 = (i + 1) / 2.0f;
        c.a(7, bms.g);
        c.b(-\u26035, -100.0, \u26035).a(b, n9).d();
        c.b(\u26035, -100.0, \u26035).a(n7, n9).d();
        c.b(\u26035, -100.0, -\u26035).a(n7, a4).d();
        c.b(-\u26035, -100.0, -\u26035).a(b, a4).d();
        a2.b();
        bfl.x();
        final float n10 = this.k.g(\u2603) * n4;
        if (n10 > 0.0f) {
            bfl.c(n10, n10, n10, n10);
            if (this.Y) {
                this.t.a();
                GL11.glEnableClientState(32884);
                GL11.glVertexPointer(3, 5126, 12, 0L);
                this.t.a(7);
                this.t.b();
                GL11.glDisableClientState(32884);
            }
            else {
                bfl.o(this.p);
            }
        }
        bfl.c(1.0f, 1.0f, 1.0f, 1.0f);
        bfl.k();
        bfl.d();
        bfl.m();
        bfl.F();
        bfl.x();
        bfl.c(0.0f, 0.0f, 0.0f);
        final double n11 = this.h.h.e(\u2603).b - this.k.X();
        if (n11 < 0.0) {
            bfl.E();
            bfl.b(0.0f, 12.0f, 0.0f);
            if (this.Y) {
                this.v.a();
                GL11.glEnableClientState(32884);
                GL11.glVertexPointer(3, 5126, 12, 0L);
                this.v.a(7);
                this.v.b();
                GL11.glDisableClientState(32884);
            }
            else {
                bfl.o(this.r);
            }
            bfl.F();
            final float \u26036 = 1.0f;
            final float n5 = -(float)(n11 + 65.0);
            final float n6 = -1.0f;
            n7 = n5;
            c.a(7, bms.f);
            c.b(-1.0, n7, 1.0).b(0, 0, 0, 255).d();
            c.b(1.0, n7, 1.0).b(0, 0, 0, 255).d();
            c.b(1.0, -1.0, 1.0).b(0, 0, 0, 255).d();
            c.b(-1.0, -1.0, 1.0).b(0, 0, 0, 255).d();
            c.b(-1.0, -1.0, -1.0).b(0, 0, 0, 255).d();
            c.b(1.0, -1.0, -1.0).b(0, 0, 0, 255).d();
            c.b(1.0, n7, -1.0).b(0, 0, 0, 255).d();
            c.b(-1.0, n7, -1.0).b(0, 0, 0, 255).d();
            c.b(1.0, -1.0, -1.0).b(0, 0, 0, 255).d();
            c.b(1.0, -1.0, 1.0).b(0, 0, 0, 255).d();
            c.b(1.0, n7, 1.0).b(0, 0, 0, 255).d();
            c.b(1.0, n7, -1.0).b(0, 0, 0, 255).d();
            c.b(-1.0, n7, -1.0).b(0, 0, 0, 255).d();
            c.b(-1.0, n7, 1.0).b(0, 0, 0, 255).d();
            c.b(-1.0, -1.0, 1.0).b(0, 0, 0, 255).d();
            c.b(-1.0, -1.0, -1.0).b(0, 0, 0, 255).d();
            c.b(-1.0, -1.0, -1.0).b(0, 0, 0, 255).d();
            c.b(-1.0, -1.0, 1.0).b(0, 0, 0, 255).d();
            c.b(1.0, -1.0, 1.0).b(0, 0, 0, 255).d();
            c.b(1.0, -1.0, -1.0).b(0, 0, 0, 255).d();
            a2.b();
        }
        if (this.k.t.g()) {
            bfl.c(\u26032 * 0.2f + 0.04f, \u26033 * 0.2f + 0.04f, \u26034 * 0.6f + 0.1f);
        }
        else {
            bfl.c(\u26032, \u26033, \u26034);
        }
        bfl.E();
        bfl.b(0.0f, -(float)(n11 - 16.0), 0.0f);
        bfl.o(this.r);
        bfl.F();
        bfl.w();
        bfl.a(true);
    }
    
    public void b(final float \u2603, final int \u2603) {
        if (!this.h.f.t.d()) {
            return;
        }
        if (this.h.t.e() == 2) {
            this.c(\u2603, \u2603);
            return;
        }
        bfl.p();
        final float n = (float)(this.h.ac().Q + (this.h.ac().t - this.h.ac().Q) * \u2603);
        final int n2 = 32;
        final int n3 = 8;
        final bfx a = bfx.a();
        final bfd c = a.c();
        this.i.a(bfr.e);
        bfl.l();
        bfl.a(770, 771, 1, 0);
        final aui e = this.k.e(\u2603);
        float n4 = (float)e.a;
        float n5 = (float)e.b;
        float n6 = (float)e.c;
        if (\u2603 != 2) {
            final float n7 = (n4 * 30.0f + n5 * 59.0f + n6 * 11.0f) / 100.0f;
            final float n8 = (n4 * 30.0f + n5 * 70.0f) / 100.0f;
            final float n9 = (n4 * 30.0f + n6 * 70.0f) / 100.0f;
            n4 = n7;
            n5 = n8;
            n6 = n9;
        }
        final float n7 = 4.8828125E-4f;
        final double n10 = this.w + \u2603;
        double n11 = this.h.ac().p + (this.h.ac().s - this.h.ac().p) * \u2603 + n10 * 0.029999999329447746;
        double n12 = this.h.ac().r + (this.h.ac().u - this.h.ac().r) * \u2603;
        final int c2 = ns.c(n11 / 2048.0);
        final int c3 = ns.c(n12 / 2048.0);
        n11 -= c2 * 2048;
        n12 -= c3 * 2048;
        final float n13 = this.k.t.f() - n + 0.33f;
        final float n14 = (float)(n11 * 4.8828125E-4);
        final float n15 = (float)(n12 * 4.8828125E-4);
        c.a(7, bms.i);
        for (int i = -256; i < 256; i += 32) {
            for (int j = -256; j < 256; j += 32) {
                c.b(i + 0, n13, (double)(j + 32)).a((i + 0) * 4.8828125E-4f + n14, (j + 32) * 4.8828125E-4f + n15).a(n4, n5, n6, 0.8f).d();
                c.b(i + 32, n13, (double)(j + 32)).a((i + 32) * 4.8828125E-4f + n14, (j + 32) * 4.8828125E-4f + n15).a(n4, n5, n6, 0.8f).d();
                c.b(i + 32, n13, (double)(j + 0)).a((i + 32) * 4.8828125E-4f + n14, (j + 0) * 4.8828125E-4f + n15).a(n4, n5, n6, 0.8f).d();
                c.b(i + 0, n13, (double)(j + 0)).a((i + 0) * 4.8828125E-4f + n14, (j + 0) * 4.8828125E-4f + n15).a(n4, n5, n6, 0.8f).d();
            }
        }
        a.b();
        bfl.c(1.0f, 1.0f, 1.0f, 1.0f);
        bfl.k();
        bfl.o();
    }
    
    public boolean a(final double \u2603, final double \u2603, final double \u2603, final float \u2603) {
        return false;
    }
    
    private void c(final float \u2603, final int \u2603) {
        bfl.p();
        final float n = (float)(this.h.ac().Q + (this.h.ac().t - this.h.ac().Q) * \u2603);
        final bfx a = bfx.a();
        final bfd c = a.c();
        final float n2 = 12.0f;
        final float n3 = 4.0f;
        final double n4 = this.w + \u2603;
        double n5 = (this.h.ac().p + (this.h.ac().s - this.h.ac().p) * \u2603 + n4 * 0.029999999329447746) / 12.0;
        double n6 = (this.h.ac().r + (this.h.ac().u - this.h.ac().r) * \u2603) / 12.0 + 0.33000001311302185;
        final float n7 = this.k.t.f() - n + 0.33f;
        final int c2 = ns.c(n5 / 2048.0);
        final int c3 = ns.c(n6 / 2048.0);
        n5 -= c2 * 2048;
        n6 -= c3 * 2048;
        this.i.a(bfr.e);
        bfl.l();
        bfl.a(770, 771, 1, 0);
        final aui e = this.k.e(\u2603);
        float n8 = (float)e.a;
        float n9 = (float)e.b;
        float n10 = (float)e.c;
        if (\u2603 != 2) {
            final float n11 = (n8 * 30.0f + n9 * 59.0f + n10 * 11.0f) / 100.0f;
            final float n12 = (n8 * 30.0f + n9 * 70.0f) / 100.0f;
            final float n13 = (n8 * 30.0f + n10 * 70.0f) / 100.0f;
            n8 = n11;
            n9 = n12;
            n10 = n13;
        }
        final float n11 = n8 * 0.9f;
        final float n12 = n9 * 0.9f;
        final float n13 = n10 * 0.9f;
        final float n14 = n8 * 0.7f;
        final float n15 = n9 * 0.7f;
        final float n16 = n10 * 0.7f;
        final float n17 = n8 * 0.8f;
        final float n18 = n9 * 0.8f;
        final float n19 = n10 * 0.8f;
        final float n20 = 0.00390625f;
        final float n21 = ns.c(n5) * 0.00390625f;
        final float n22 = ns.c(n6) * 0.00390625f;
        final float n23 = (float)(n5 - ns.c(n5));
        final float n24 = (float)(n6 - ns.c(n6));
        final int n25 = 8;
        final int n26 = 4;
        final float n27 = 9.765625E-4f;
        bfl.a(12.0f, 1.0f, 12.0f);
        for (int i = 0; i < 2; ++i) {
            if (i == 0) {
                bfl.a(false, false, false, false);
            }
            else {
                switch (\u2603) {
                    case 0: {
                        bfl.a(false, true, true, true);
                        break;
                    }
                    case 1: {
                        bfl.a(true, false, false, true);
                        break;
                    }
                    case 2: {
                        bfl.a(true, true, true, true);
                        break;
                    }
                }
            }
            for (int j = -3; j <= 4; ++j) {
                for (int k = -3; k <= 4; ++k) {
                    c.a(7, bms.l);
                    final float n28 = (float)(j * 8);
                    final float n29 = (float)(k * 8);
                    final float n30 = n28 - n23;
                    final float n31 = n29 - n24;
                    if (n7 > -5.0f) {
                        c.b(n30 + 0.0f, n7 + 0.0f, (double)(n31 + 8.0f)).a((n28 + 0.0f) * 0.00390625f + n21, (n29 + 8.0f) * 0.00390625f + n22).a(n14, n15, n16, 0.8f).c(0.0f, -1.0f, 0.0f).d();
                        c.b(n30 + 8.0f, n7 + 0.0f, (double)(n31 + 8.0f)).a((n28 + 8.0f) * 0.00390625f + n21, (n29 + 8.0f) * 0.00390625f + n22).a(n14, n15, n16, 0.8f).c(0.0f, -1.0f, 0.0f).d();
                        c.b(n30 + 8.0f, n7 + 0.0f, (double)(n31 + 0.0f)).a((n28 + 8.0f) * 0.00390625f + n21, (n29 + 0.0f) * 0.00390625f + n22).a(n14, n15, n16, 0.8f).c(0.0f, -1.0f, 0.0f).d();
                        c.b(n30 + 0.0f, n7 + 0.0f, (double)(n31 + 0.0f)).a((n28 + 0.0f) * 0.00390625f + n21, (n29 + 0.0f) * 0.00390625f + n22).a(n14, n15, n16, 0.8f).c(0.0f, -1.0f, 0.0f).d();
                    }
                    if (n7 <= 5.0f) {
                        c.b(n30 + 0.0f, n7 + 4.0f - 9.765625E-4f, (double)(n31 + 8.0f)).a((n28 + 0.0f) * 0.00390625f + n21, (n29 + 8.0f) * 0.00390625f + n22).a(n8, n9, n10, 0.8f).c(0.0f, 1.0f, 0.0f).d();
                        c.b(n30 + 8.0f, n7 + 4.0f - 9.765625E-4f, (double)(n31 + 8.0f)).a((n28 + 8.0f) * 0.00390625f + n21, (n29 + 8.0f) * 0.00390625f + n22).a(n8, n9, n10, 0.8f).c(0.0f, 1.0f, 0.0f).d();
                        c.b(n30 + 8.0f, n7 + 4.0f - 9.765625E-4f, (double)(n31 + 0.0f)).a((n28 + 8.0f) * 0.00390625f + n21, (n29 + 0.0f) * 0.00390625f + n22).a(n8, n9, n10, 0.8f).c(0.0f, 1.0f, 0.0f).d();
                        c.b(n30 + 0.0f, n7 + 4.0f - 9.765625E-4f, (double)(n31 + 0.0f)).a((n28 + 0.0f) * 0.00390625f + n21, (n29 + 0.0f) * 0.00390625f + n22).a(n8, n9, n10, 0.8f).c(0.0f, 1.0f, 0.0f).d();
                    }
                    if (j > -1) {
                        for (int l = 0; l < 8; ++l) {
                            c.b(n30 + l + 0.0f, n7 + 0.0f, (double)(n31 + 8.0f)).a((n28 + l + 0.5f) * 0.00390625f + n21, (n29 + 8.0f) * 0.00390625f + n22).a(n11, n12, n13, 0.8f).c(-1.0f, 0.0f, 0.0f).d();
                            c.b(n30 + l + 0.0f, n7 + 4.0f, (double)(n31 + 8.0f)).a((n28 + l + 0.5f) * 0.00390625f + n21, (n29 + 8.0f) * 0.00390625f + n22).a(n11, n12, n13, 0.8f).c(-1.0f, 0.0f, 0.0f).d();
                            c.b(n30 + l + 0.0f, n7 + 4.0f, (double)(n31 + 0.0f)).a((n28 + l + 0.5f) * 0.00390625f + n21, (n29 + 0.0f) * 0.00390625f + n22).a(n11, n12, n13, 0.8f).c(-1.0f, 0.0f, 0.0f).d();
                            c.b(n30 + l + 0.0f, n7 + 0.0f, (double)(n31 + 0.0f)).a((n28 + l + 0.5f) * 0.00390625f + n21, (n29 + 0.0f) * 0.00390625f + n22).a(n11, n12, n13, 0.8f).c(-1.0f, 0.0f, 0.0f).d();
                        }
                    }
                    if (j <= 1) {
                        for (int l = 0; l < 8; ++l) {
                            c.b(n30 + l + 1.0f - 9.765625E-4f, n7 + 0.0f, (double)(n31 + 8.0f)).a((n28 + l + 0.5f) * 0.00390625f + n21, (n29 + 8.0f) * 0.00390625f + n22).a(n11, n12, n13, 0.8f).c(1.0f, 0.0f, 0.0f).d();
                            c.b(n30 + l + 1.0f - 9.765625E-4f, n7 + 4.0f, (double)(n31 + 8.0f)).a((n28 + l + 0.5f) * 0.00390625f + n21, (n29 + 8.0f) * 0.00390625f + n22).a(n11, n12, n13, 0.8f).c(1.0f, 0.0f, 0.0f).d();
                            c.b(n30 + l + 1.0f - 9.765625E-4f, n7 + 4.0f, (double)(n31 + 0.0f)).a((n28 + l + 0.5f) * 0.00390625f + n21, (n29 + 0.0f) * 0.00390625f + n22).a(n11, n12, n13, 0.8f).c(1.0f, 0.0f, 0.0f).d();
                            c.b(n30 + l + 1.0f - 9.765625E-4f, n7 + 0.0f, (double)(n31 + 0.0f)).a((n28 + l + 0.5f) * 0.00390625f + n21, (n29 + 0.0f) * 0.00390625f + n22).a(n11, n12, n13, 0.8f).c(1.0f, 0.0f, 0.0f).d();
                        }
                    }
                    if (k > -1) {
                        for (int l = 0; l < 8; ++l) {
                            c.b(n30 + 0.0f, n7 + 4.0f, (double)(n31 + l + 0.0f)).a((n28 + 0.0f) * 0.00390625f + n21, (n29 + l + 0.5f) * 0.00390625f + n22).a(n17, n18, n19, 0.8f).c(0.0f, 0.0f, -1.0f).d();
                            c.b(n30 + 8.0f, n7 + 4.0f, (double)(n31 + l + 0.0f)).a((n28 + 8.0f) * 0.00390625f + n21, (n29 + l + 0.5f) * 0.00390625f + n22).a(n17, n18, n19, 0.8f).c(0.0f, 0.0f, -1.0f).d();
                            c.b(n30 + 8.0f, n7 + 0.0f, (double)(n31 + l + 0.0f)).a((n28 + 8.0f) * 0.00390625f + n21, (n29 + l + 0.5f) * 0.00390625f + n22).a(n17, n18, n19, 0.8f).c(0.0f, 0.0f, -1.0f).d();
                            c.b(n30 + 0.0f, n7 + 0.0f, (double)(n31 + l + 0.0f)).a((n28 + 0.0f) * 0.00390625f + n21, (n29 + l + 0.5f) * 0.00390625f + n22).a(n17, n18, n19, 0.8f).c(0.0f, 0.0f, -1.0f).d();
                        }
                    }
                    if (k <= 1) {
                        for (int l = 0; l < 8; ++l) {
                            c.b(n30 + 0.0f, n7 + 4.0f, (double)(n31 + l + 1.0f - 9.765625E-4f)).a((n28 + 0.0f) * 0.00390625f + n21, (n29 + l + 0.5f) * 0.00390625f + n22).a(n17, n18, n19, 0.8f).c(0.0f, 0.0f, 1.0f).d();
                            c.b(n30 + 8.0f, n7 + 4.0f, (double)(n31 + l + 1.0f - 9.765625E-4f)).a((n28 + 8.0f) * 0.00390625f + n21, (n29 + l + 0.5f) * 0.00390625f + n22).a(n17, n18, n19, 0.8f).c(0.0f, 0.0f, 1.0f).d();
                            c.b(n30 + 8.0f, n7 + 0.0f, (double)(n31 + l + 1.0f - 9.765625E-4f)).a((n28 + 8.0f) * 0.00390625f + n21, (n29 + l + 0.5f) * 0.00390625f + n22).a(n17, n18, n19, 0.8f).c(0.0f, 0.0f, 1.0f).d();
                            c.b(n30 + 0.0f, n7 + 0.0f, (double)(n31 + l + 1.0f - 9.765625E-4f)).a((n28 + 0.0f) * 0.00390625f + n21, (n29 + l + 0.5f) * 0.00390625f + n22).a(n17, n18, n19, 0.8f).c(0.0f, 0.0f, 1.0f).d();
                        }
                    }
                    a.b();
                }
            }
        }
        bfl.c(1.0f, 1.0f, 1.0f, 1.0f);
        bfl.k();
        bfl.o();
    }
    
    public void a(final long \u2603) {
        this.ac |= this.N.a(\u2603);
        if (!this.l.isEmpty()) {
            final Iterator<bht> iterator = this.l.iterator();
            while (iterator.hasNext()) {
                final bht \u26032 = iterator.next();
                if (!this.N.a(\u26032)) {
                    break;
                }
                \u26032.a(false);
                iterator.remove();
                final long n = \u2603 - System.nanoTime();
                if (n < 0L) {
                    break;
                }
            }
        }
    }
    
    public void a(final pk \u2603, final float \u2603) {
        final bfx a = bfx.a();
        final bfd c = a.c();
        final ams af = this.k.af();
        final double n = this.h.t.c * 16;
        if (\u2603.s < af.d() - n && \u2603.s > af.b() + n && \u2603.u < af.e() - n && \u2603.u > af.c() + n) {
            return;
        }
        double pow = 1.0 - af.a(\u2603) / n;
        pow = Math.pow(pow, 4.0);
        final double n2 = \u2603.P + (\u2603.s - \u2603.P) * \u2603;
        final double n3 = \u2603.Q + (\u2603.t - \u2603.Q) * \u2603;
        final double n4 = \u2603.R + (\u2603.u - \u2603.R) * \u2603;
        bfl.l();
        bfl.a(770, 1, 1, 0);
        this.i.a(bfr.g);
        bfl.a(false);
        bfl.E();
        final int a2 = af.a().a();
        final float \u26032 = (a2 >> 16 & 0xFF) / 255.0f;
        final float \u26033 = (a2 >> 8 & 0xFF) / 255.0f;
        final float \u26034 = (a2 & 0xFF) / 255.0f;
        bfl.c(\u26032, \u26033, \u26034, (float)pow);
        bfl.a(-3.0f, -3.0f);
        bfl.q();
        bfl.a(516, 0.1f);
        bfl.d();
        bfl.p();
        final float n5 = ave.J() % 3000L / 3000.0f;
        final float n6 = 0.0f;
        final float n7 = 0.0f;
        final float n8 = 128.0f;
        c.a(7, bms.g);
        c.c(-n2, -n3, -n4);
        double n9 = Math.max(ns.c(n4 - n), af.c());
        double n10 = Math.min(ns.f(n4 + n), af.e());
        if (n2 > af.d() - n) {
            float n11 = 0.0f;
            for (double n12 = n9; n12 < n10; ++n12, n11 += 0.5f) {
                final double n13 = Math.min(1.0, n10 - n12);
                final float n14 = (float)n13 * 0.5f;
                c.b(af.d(), 256.0, n12).a(n5 + n11, n5 + 0.0f).d();
                c.b(af.d(), 256.0, n12 + n13).a(n5 + n14 + n11, n5 + 0.0f).d();
                c.b(af.d(), 0.0, n12 + n13).a(n5 + n14 + n11, n5 + 128.0f).d();
                c.b(af.d(), 0.0, n12).a(n5 + n11, n5 + 128.0f).d();
            }
        }
        if (n2 < af.b() + n) {
            float n11 = 0.0f;
            for (double n12 = n9; n12 < n10; ++n12, n11 += 0.5f) {
                final double n13 = Math.min(1.0, n10 - n12);
                final float n14 = (float)n13 * 0.5f;
                c.b(af.b(), 256.0, n12).a(n5 + n11, n5 + 0.0f).d();
                c.b(af.b(), 256.0, n12 + n13).a(n5 + n14 + n11, n5 + 0.0f).d();
                c.b(af.b(), 0.0, n12 + n13).a(n5 + n14 + n11, n5 + 128.0f).d();
                c.b(af.b(), 0.0, n12).a(n5 + n11, n5 + 128.0f).d();
            }
        }
        n9 = Math.max(ns.c(n2 - n), af.b());
        n10 = Math.min(ns.f(n2 + n), af.d());
        if (n4 > af.e() - n) {
            float n11 = 0.0f;
            for (double n12 = n9; n12 < n10; ++n12, n11 += 0.5f) {
                final double n13 = Math.min(1.0, n10 - n12);
                final float n14 = (float)n13 * 0.5f;
                c.b(n12, 256.0, af.e()).a(n5 + n11, n5 + 0.0f).d();
                c.b(n12 + n13, 256.0, af.e()).a(n5 + n14 + n11, n5 + 0.0f).d();
                c.b(n12 + n13, 0.0, af.e()).a(n5 + n14 + n11, n5 + 128.0f).d();
                c.b(n12, 0.0, af.e()).a(n5 + n11, n5 + 128.0f).d();
            }
        }
        if (n4 < af.c() + n) {
            float n11 = 0.0f;
            for (double n12 = n9; n12 < n10; ++n12, n11 += 0.5f) {
                final double n13 = Math.min(1.0, n10 - n12);
                final float n14 = (float)n13 * 0.5f;
                c.b(n12, 256.0, af.c()).a(n5 + n11, n5 + 0.0f).d();
                c.b(n12 + n13, 256.0, af.c()).a(n5 + n14 + n11, n5 + 0.0f).d();
                c.b(n12 + n13, 0.0, af.c()).a(n5 + n14 + n11, n5 + 128.0f).d();
                c.b(n12, 0.0, af.c()).a(n5 + n11, n5 + 128.0f).d();
            }
        }
        a.b();
        c.c(0.0, 0.0, 0.0);
        bfl.o();
        bfl.c();
        bfl.a(0.0f, 0.0f);
        bfl.r();
        bfl.d();
        bfl.k();
        bfl.F();
        bfl.a(true);
    }
    
    private void s() {
        bfl.a(774, 768, 1, 0);
        bfl.l();
        bfl.c(1.0f, 1.0f, 1.0f, 0.5f);
        bfl.a(-3.0f, -3.0f);
        bfl.q();
        bfl.a(516, 0.1f);
        bfl.d();
        bfl.E();
    }
    
    private void t() {
        bfl.c();
        bfl.a(0.0f, 0.0f);
        bfl.r();
        bfl.d();
        bfl.a(true);
        bfl.F();
    }
    
    public void a(final bfx \u2603, final bfd \u2603, final pk \u2603, final float \u2603) {
        final double n = \u2603.P + (\u2603.s - \u2603.P) * \u2603;
        final double n2 = \u2603.Q + (\u2603.t - \u2603.Q) * \u2603;
        final double n3 = \u2603.R + (\u2603.u - \u2603.R) * \u2603;
        if (!this.x.isEmpty()) {
            this.i.a(bmh.g);
            this.s();
            \u2603.a(7, bms.a);
            \u2603.c(-n, -n2, -n3);
            \u2603.c();
            final Iterator<kw> iterator = this.x.values().iterator();
            while (iterator.hasNext()) {
                final kw kw = iterator.next();
                final cj b = kw.b();
                final double n4 = b.n() - n;
                final double n5 = b.o() - n2;
                final double n6 = b.p() - n3;
                final afh c = this.k.p(b).c();
                if (!(c instanceof afs) && !(c instanceof agp) && !(c instanceof ajl)) {
                    if (c instanceof ajm) {
                        continue;
                    }
                    if (n4 * n4 + n5 * n5 + n6 * n6 > 1024.0) {
                        iterator.remove();
                    }
                    else {
                        final alz p = this.k.p(b);
                        if (p.c().t() == arm.a) {
                            continue;
                        }
                        final int c2 = kw.c();
                        final bmi \u26032 = this.z[c2];
                        final bgd ae = this.h.ae();
                        ae.a(p, b, \u26032, this.k);
                    }
                }
            }
            \u2603.b();
            \u2603.c(0.0, 0.0, 0.0);
            this.t();
        }
    }
    
    public void a(final wn \u2603, final auh \u2603, final int \u2603, final float \u2603) {
        if (\u2603 == 0 && \u2603.a == auh.a.b) {
            bfl.l();
            bfl.a(770, 771, 1, 0);
            bfl.c(0.0f, 0.0f, 0.0f, 0.4f);
            GL11.glLineWidth(2.0f);
            bfl.x();
            bfl.a(false);
            final float n = 0.002f;
            final cj a = \u2603.a();
            final afh c = this.k.p(a).c();
            if (c.t() != arm.a && this.k.af().a(a)) {
                c.a((adq)this.k, a);
                final double n2 = \u2603.P + (\u2603.s - \u2603.P) * \u2603;
                final double n3 = \u2603.Q + (\u2603.t - \u2603.Q) * \u2603;
                final double n4 = \u2603.R + (\u2603.u - \u2603.R) * \u2603;
                a(c.b(this.k, a).b(0.0020000000949949026, 0.0020000000949949026, 0.0020000000949949026).c(-n2, -n3, -n4));
            }
            bfl.a(true);
            bfl.w();
            bfl.k();
        }
    }
    
    public static void a(final aug \u2603) {
        final bfx a = bfx.a();
        final bfd c = a.c();
        c.a(3, bms.e);
        c.b(\u2603.a, \u2603.b, \u2603.c).d();
        c.b(\u2603.d, \u2603.b, \u2603.c).d();
        c.b(\u2603.d, \u2603.b, \u2603.f).d();
        c.b(\u2603.a, \u2603.b, \u2603.f).d();
        c.b(\u2603.a, \u2603.b, \u2603.c).d();
        a.b();
        c.a(3, bms.e);
        c.b(\u2603.a, \u2603.e, \u2603.c).d();
        c.b(\u2603.d, \u2603.e, \u2603.c).d();
        c.b(\u2603.d, \u2603.e, \u2603.f).d();
        c.b(\u2603.a, \u2603.e, \u2603.f).d();
        c.b(\u2603.a, \u2603.e, \u2603.c).d();
        a.b();
        c.a(1, bms.e);
        c.b(\u2603.a, \u2603.b, \u2603.c).d();
        c.b(\u2603.a, \u2603.e, \u2603.c).d();
        c.b(\u2603.d, \u2603.b, \u2603.c).d();
        c.b(\u2603.d, \u2603.e, \u2603.c).d();
        c.b(\u2603.d, \u2603.b, \u2603.f).d();
        c.b(\u2603.d, \u2603.e, \u2603.f).d();
        c.b(\u2603.a, \u2603.b, \u2603.f).d();
        c.b(\u2603.a, \u2603.e, \u2603.f).d();
        a.b();
    }
    
    public static void a(final aug \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603) {
        final bfx a = bfx.a();
        final bfd c = a.c();
        c.a(3, bms.f);
        c.b(\u2603.a, \u2603.b, \u2603.c).b(\u2603, \u2603, \u2603, \u2603).d();
        c.b(\u2603.d, \u2603.b, \u2603.c).b(\u2603, \u2603, \u2603, \u2603).d();
        c.b(\u2603.d, \u2603.b, \u2603.f).b(\u2603, \u2603, \u2603, \u2603).d();
        c.b(\u2603.a, \u2603.b, \u2603.f).b(\u2603, \u2603, \u2603, \u2603).d();
        c.b(\u2603.a, \u2603.b, \u2603.c).b(\u2603, \u2603, \u2603, \u2603).d();
        a.b();
        c.a(3, bms.f);
        c.b(\u2603.a, \u2603.e, \u2603.c).b(\u2603, \u2603, \u2603, \u2603).d();
        c.b(\u2603.d, \u2603.e, \u2603.c).b(\u2603, \u2603, \u2603, \u2603).d();
        c.b(\u2603.d, \u2603.e, \u2603.f).b(\u2603, \u2603, \u2603, \u2603).d();
        c.b(\u2603.a, \u2603.e, \u2603.f).b(\u2603, \u2603, \u2603, \u2603).d();
        c.b(\u2603.a, \u2603.e, \u2603.c).b(\u2603, \u2603, \u2603, \u2603).d();
        a.b();
        c.a(1, bms.f);
        c.b(\u2603.a, \u2603.b, \u2603.c).b(\u2603, \u2603, \u2603, \u2603).d();
        c.b(\u2603.a, \u2603.e, \u2603.c).b(\u2603, \u2603, \u2603, \u2603).d();
        c.b(\u2603.d, \u2603.b, \u2603.c).b(\u2603, \u2603, \u2603, \u2603).d();
        c.b(\u2603.d, \u2603.e, \u2603.c).b(\u2603, \u2603, \u2603, \u2603).d();
        c.b(\u2603.d, \u2603.b, \u2603.f).b(\u2603, \u2603, \u2603, \u2603).d();
        c.b(\u2603.d, \u2603.e, \u2603.f).b(\u2603, \u2603, \u2603, \u2603).d();
        c.b(\u2603.a, \u2603.b, \u2603.f).b(\u2603, \u2603, \u2603, \u2603).d();
        c.b(\u2603.a, \u2603.e, \u2603.f).b(\u2603, \u2603, \u2603, \u2603).d();
        a.b();
    }
    
    private void b(final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603) {
        this.o.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
    }
    
    @Override
    public void a(final cj \u2603) {
        final int n = \u2603.n();
        final int o = \u2603.o();
        final int p = \u2603.p();
        this.b(n - 1, o - 1, p - 1, n + 1, o + 1, p + 1);
    }
    
    @Override
    public void b(final cj \u2603) {
        final int n = \u2603.n();
        final int o = \u2603.o();
        final int p = \u2603.p();
        this.b(n - 1, o - 1, p - 1, n + 1, o + 1, p + 1);
    }
    
    @Override
    public void a(final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603) {
        this.b(\u2603 - 1, \u2603 - 1, \u2603 - 1, \u2603 + 1, \u2603 + 1, \u2603 + 1);
    }
    
    @Override
    public void a(final String \u2603, final cj \u2603) {
        bpj a = this.y.get(\u2603);
        if (a != null) {
            this.h.W().b(a);
            this.y.remove(\u2603);
        }
        if (\u2603 != null) {
            final aak b = aak.b(\u2603);
            if (b != null) {
                this.h.q.a(b.g());
            }
            a = bpf.a(new jy(\u2603), (float)\u2603.n(), (float)\u2603.o(), (float)\u2603.p());
            this.y.put(\u2603, a);
            this.h.W().a(a);
        }
    }
    
    @Override
    public void a(final String \u2603, final double \u2603, final double \u2603, final double \u2603, final float \u2603, final float \u2603) {
    }
    
    @Override
    public void a(final wn \u2603, final String \u2603, final double \u2603, final double \u2603, final double \u2603, final float \u2603, final float \u2603) {
    }
    
    @Override
    public void a(final int \u2603, final boolean \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final int... \u2603) {
        try {
            this.b(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        }
        catch (Throwable \u26032) {
            final b a = b.a(\u26032, "Exception while adding particle");
            final c a2 = a.a("Particle being added");
            a2.a("ID", \u2603);
            if (\u2603 != null) {
                a2.a("Parameters", \u2603);
            }
            a2.a("Position", new Callable<String>() {
                public String a() throws Exception {
                    return c.a(\u2603, \u2603, \u2603);
                }
            });
            throw new e(a);
        }
    }
    
    private void a(final cy \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final int... \u2603) {
        this.a(\u2603.c(), \u2603.e(), \u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
    }
    
    private beb b(final int \u2603, final boolean \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final int... \u2603) {
        if (this.h == null || this.h.ac() == null || this.h.j == null) {
            return null;
        }
        int al = this.h.t.aL;
        if (al == 1 && this.k.s.nextInt(3) == 0) {
            al = 2;
        }
        final double n = this.h.ac().s - \u2603;
        final double n2 = this.h.ac().t - \u2603;
        final double n3 = this.h.ac().u - \u2603;
        if (\u2603) {
            return this.h.j.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        }
        final double n4 = 16.0;
        if (n * n + n2 * n2 + n3 * n3 > 256.0) {
            return null;
        }
        if (al > 1) {
            return null;
        }
        return this.h.j.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
    }
    
    @Override
    public void a(final pk \u2603) {
    }
    
    @Override
    public void b(final pk \u2603) {
    }
    
    public void k() {
    }
    
    @Override
    public void a(final int \u2603, final cj \u2603, final int \u2603) {
        switch (\u2603) {
            case 1013:
            case 1018: {
                if (this.h.ac() == null) {
                    break;
                }
                final double n = \u2603.n() - this.h.ac().s;
                final double n2 = \u2603.o() - this.h.ac().t;
                final double n3 = \u2603.p() - this.h.ac().u;
                final double sqrt = Math.sqrt(n * n + n2 * n2 + n3 * n3);
                double s = this.h.ac().s;
                double t = this.h.ac().t;
                double u = this.h.ac().u;
                if (sqrt > 0.0) {
                    s += n / sqrt * 2.0;
                    t += n2 / sqrt * 2.0;
                    u += n3 / sqrt * 2.0;
                }
                if (\u2603 == 1013) {
                    this.k.a(s, t, u, "mob.wither.spawn", 1.0f, 1.0f, false);
                    break;
                }
                this.k.a(s, t, u, "mob.enderdragon.end", 5.0f, 1.0f, false);
                break;
            }
        }
    }
    
    @Override
    public void a(final wn \u2603, final int \u2603, final cj \u2603, final int \u2603) {
        final Random s = this.k.s;
        switch (\u2603) {
            case 1001: {
                this.k.a(\u2603, "random.click", 1.0f, 1.2f, false);
                break;
            }
            case 1000: {
                this.k.a(\u2603, "random.click", 1.0f, 1.0f, false);
                break;
            }
            case 1002: {
                this.k.a(\u2603, "random.bow", 1.0f, 1.2f, false);
                break;
            }
            case 2000: {
                final int n = \u2603 % 3 - 1;
                final int n2 = \u2603 / 3 % 3 - 1;
                final double n3 = \u2603.n() + n * 0.6 + 0.5;
                final double n4 = \u2603.o() + 0.5;
                final double n5 = \u2603.p() + n2 * 0.6 + 0.5;
                for (int i = 0; i < 10; ++i) {
                    final double n6 = s.nextDouble() * 0.2 + 0.01;
                    final double \u26032 = n3 + n * 0.01 + (s.nextDouble() - 0.5) * n2 * 0.5;
                    final double \u26033 = n4 + (s.nextDouble() - 0.5) * 0.5;
                    final double \u26034 = n5 + n2 * 0.01 + (s.nextDouble() - 0.5) * n * 0.5;
                    final double \u26035 = n * n6 + s.nextGaussian() * 0.01;
                    final double \u26036 = -0.03 + s.nextGaussian() * 0.01;
                    final double \u26037 = n2 * n6 + s.nextGaussian() * 0.01;
                    this.a(cy.l, \u26032, \u26033, \u26034, \u26035, \u26036, \u26037, new int[0]);
                }
                break;
            }
            case 2003: {
                final double n7 = \u2603.n() + 0.5;
                final double n3 = \u2603.o();
                final double n4 = \u2603.p() + 0.5;
                for (int j = 0; j < 8; ++j) {
                    this.a(cy.K, n7, n3, n4, s.nextGaussian() * 0.15, s.nextDouble() * 0.2, s.nextGaussian() * 0.15, zw.b(zy.bH));
                }
                for (double n5 = 0.0; n5 < 6.283185307179586; n5 += 0.15707963267948966) {
                    this.a(cy.y, n7 + Math.cos(n5) * 5.0, n3 - 0.4, n4 + Math.sin(n5) * 5.0, Math.cos(n5) * -5.0, 0.0, Math.sin(n5) * -5.0, new int[0]);
                    this.a(cy.y, n7 + Math.cos(n5) * 5.0, n3 - 0.4, n4 + Math.sin(n5) * 5.0, Math.cos(n5) * -7.0, 0.0, Math.sin(n5) * -7.0, new int[0]);
                }
                break;
            }
            case 2002: {
                final double n7 = \u2603.n();
                final double n3 = \u2603.o();
                final double n4 = \u2603.p();
                for (int j = 0; j < 8; ++j) {
                    this.a(cy.K, n7, n3, n4, s.nextGaussian() * 0.15, s.nextDouble() * 0.2, s.nextGaussian() * 0.15, zw.b(zy.bz), \u2603);
                }
                int j = zy.bz.g(\u2603);
                final float n8 = (j >> 16 & 0xFF) / 255.0f;
                final float n9 = (j >> 8 & 0xFF) / 255.0f;
                final float n10 = (j >> 0 & 0xFF) / 255.0f;
                cy cy = cy.n;
                if (zy.bz.h(\u2603)) {
                    cy = cy.o;
                }
                for (int k = 0; k < 100; ++k) {
                    final double n11 = s.nextDouble() * 4.0;
                    final double n12 = s.nextDouble() * 3.141592653589793 * 2.0;
                    final double \u26038 = Math.cos(n12) * n11;
                    final double \u26039 = 0.01 + s.nextDouble() * 0.5;
                    final double \u260310 = Math.sin(n12) * n11;
                    final beb b = this.b(cy.c(), cy.e(), n7 + \u26038 * 0.1, n3 + 0.3, n4 + \u260310 * 0.1, \u26038, \u26039, \u260310, new int[0]);
                    if (b != null) {
                        final float n13 = 0.75f + s.nextFloat() * 0.25f;
                        b.b(n8 * n13, n9 * n13, n10 * n13);
                        b.a((float)n11);
                    }
                }
                this.k.a(\u2603, "game.potion.smash", 1.0f, this.k.s.nextFloat() * 0.1f + 0.9f, false);
                break;
            }
            case 2001: {
                final afh c = afh.c(\u2603 & 0xFFF);
                if (c.t() != arm.a) {
                    this.h.W().a(new bpf(new jy(c.H.a()), (c.H.d() + 1.0f) / 2.0f, c.H.e() * 0.8f, \u2603.n() + 0.5f, \u2603.o() + 0.5f, \u2603.p() + 0.5f));
                }
                this.h.j.a(\u2603, c.a(\u2603 >> 12 & 0xFF));
                break;
            }
            case 2004: {
                for (int k = 0; k < 20; ++k) {
                    final double n11 = \u2603.n() + 0.5 + (this.k.s.nextFloat() - 0.5) * 2.0;
                    final double n12 = \u2603.o() + 0.5 + (this.k.s.nextFloat() - 0.5) * 2.0;
                    final double \u26038 = \u2603.p() + 0.5 + (this.k.s.nextFloat() - 0.5) * 2.0;
                    this.k.a(cy.l, n11, n12, \u26038, 0.0, 0.0, 0.0, new int[0]);
                    this.k.a(cy.A, n11, n12, \u26038, 0.0, 0.0, 0.0, new int[0]);
                }
                break;
            }
            case 2005: {
                ze.a(this.k, \u2603, \u2603);
                break;
            }
            case 1006: {
                this.k.a(\u2603, "random.door_close", 1.0f, this.k.s.nextFloat() * 0.1f + 0.9f, false);
                break;
            }
            case 1003: {
                this.k.a(\u2603, "random.door_open", 1.0f, this.k.s.nextFloat() * 0.1f + 0.9f, false);
                break;
            }
            case 1004: {
                this.k.a(\u2603, "random.fizz", 0.5f, 2.6f + (s.nextFloat() - s.nextFloat()) * 0.8f, false);
                break;
            }
            case 1020: {
                this.k.a(\u2603, "random.anvil_break", 1.0f, this.k.s.nextFloat() * 0.1f + 0.9f, false);
                break;
            }
            case 1021: {
                this.k.a(\u2603, "random.anvil_use", 1.0f, this.k.s.nextFloat() * 0.1f + 0.9f, false);
                break;
            }
            case 1022: {
                this.k.a(\u2603, "random.anvil_land", 0.3f, this.k.s.nextFloat() * 0.1f + 0.9f, false);
                break;
            }
            case 1005: {
                if (zw.b(\u2603) instanceof aak) {
                    this.k.a(\u2603, "records." + ((aak)zw.b(\u2603)).a);
                    break;
                }
                this.k.a(\u2603, (String)null);
                break;
            }
            case 1007: {
                this.k.a(\u2603, "mob.ghast.charge", 10.0f, (s.nextFloat() - s.nextFloat()) * 0.2f + 1.0f, false);
                break;
            }
            case 1008: {
                this.k.a(\u2603, "mob.ghast.fireball", 10.0f, (s.nextFloat() - s.nextFloat()) * 0.2f + 1.0f, false);
                break;
            }
            case 1010: {
                this.k.a(\u2603, "mob.zombie.wood", 2.0f, (s.nextFloat() - s.nextFloat()) * 0.2f + 1.0f, false);
                break;
            }
            case 1012: {
                this.k.a(\u2603, "mob.zombie.woodbreak", 2.0f, (s.nextFloat() - s.nextFloat()) * 0.2f + 1.0f, false);
                break;
            }
            case 1011: {
                this.k.a(\u2603, "mob.zombie.metal", 2.0f, (s.nextFloat() - s.nextFloat()) * 0.2f + 1.0f, false);
                break;
            }
            case 1009: {
                this.k.a(\u2603, "mob.ghast.fireball", 2.0f, (s.nextFloat() - s.nextFloat()) * 0.2f + 1.0f, false);
                break;
            }
            case 1014: {
                this.k.a(\u2603, "mob.wither.shoot", 2.0f, (s.nextFloat() - s.nextFloat()) * 0.2f + 1.0f, false);
                break;
            }
            case 1016: {
                this.k.a(\u2603, "mob.zombie.infect", 2.0f, (s.nextFloat() - s.nextFloat()) * 0.2f + 1.0f, false);
                break;
            }
            case 1017: {
                this.k.a(\u2603, "mob.zombie.unfect", 2.0f, (s.nextFloat() - s.nextFloat()) * 0.2f + 1.0f, false);
                break;
            }
            case 1015: {
                this.k.a(\u2603, "mob.bat.takeoff", 0.05f, (s.nextFloat() - s.nextFloat()) * 0.2f + 1.0f, false);
                break;
            }
        }
    }
    
    @Override
    public void b(final int \u2603, final cj \u2603, final int \u2603) {
        if (\u2603 < 0 || \u2603 >= 10) {
            this.x.remove(\u2603);
        }
        else {
            kw kw = this.x.get(\u2603);
            if (kw == null || kw.b().n() != \u2603.n() || kw.b().o() != \u2603.o() || kw.b().p() != \u2603.p()) {
                kw = new kw(\u2603, \u2603);
                this.x.put(\u2603, kw);
            }
            kw.a(\u2603);
            kw.b(this.w);
        }
    }
    
    public void m() {
        this.ac = true;
    }
    
    public void a(final Collection<akw> \u2603, final Collection<akw> \u2603) {
        synchronized (this.n) {
            this.n.removeAll(\u2603);
            this.n.addAll(\u2603);
        }
    }
    
    static {
        b = LogManager.getLogger();
        c = new jy("textures/environment/moon_phases.png");
        d = new jy("textures/environment/sun.png");
        e = new jy("textures/environment/clouds.png");
        f = new jy("textures/environment/end_sky.png");
        g = new jy("textures/misc/forcefield.png");
    }
    
    class a
    {
        final bht a;
        final cq b;
        final Set<cq> c;
        final int d;
        
        private a(final bht \u2603, final cq \u2603, final int \u2603) {
            this.c = EnumSet.noneOf(cq.class);
            this.a = \u2603;
            this.b = \u2603;
            this.d = \u2603;
        }
    }
}
