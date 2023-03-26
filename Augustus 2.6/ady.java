import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import org.apache.logging.log4j.LogManager;
import java.util.Collections;
import java.util.Random;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.logging.log4j.Logger;

// 
// Decompiled by Procyon v0.5.36
// 

public abstract class ady
{
    private static final Logger aD;
    protected static final a a;
    protected static final a b;
    protected static final a c;
    protected static final a d;
    protected static final a e;
    protected static final a f;
    protected static final a g;
    protected static final a h;
    protected static final a i;
    protected static final a j;
    protected static final a k;
    protected static final a l;
    protected static final a m;
    private static final ady[] aE;
    public static final Set<ady> n;
    public static final Map<String, ady> o;
    public static final ady p;
    public static final ady q;
    public static final ady r;
    public static final ady s;
    public static final ady t;
    public static final ady u;
    public static final ady v;
    public static final ady w;
    public static final ady x;
    public static final ady y;
    public static final ady z;
    public static final ady A;
    public static final ady B;
    public static final ady C;
    public static final ady D;
    public static final ady E;
    public static final ady F;
    public static final ady G;
    public static final ady H;
    public static final ady I;
    public static final ady J;
    public static final ady K;
    public static final ady L;
    public static final ady M;
    public static final ady N;
    public static final ady O;
    public static final ady P;
    public static final ady Q;
    public static final ady R;
    public static final ady S;
    public static final ady T;
    public static final ady U;
    public static final ady V;
    public static final ady W;
    public static final ady X;
    public static final ady Y;
    public static final ady Z;
    public static final ady aa;
    public static final ady ab;
    public static final ady ac;
    public static final ady ad;
    protected static final ard ae;
    protected static final ard af;
    protected static final aos ag;
    public String ah;
    public int ai;
    public int aj;
    public alz ak;
    public alz al;
    public int am;
    public float an;
    public float ao;
    public float ap;
    public float aq;
    public int ar;
    public aeb as;
    protected List<c> at;
    protected List<c> au;
    protected List<c> av;
    protected List<c> aw;
    protected boolean ax;
    protected boolean ay;
    public final int az;
    protected apv aA;
    protected aoi aB;
    protected apt aC;
    
    protected ady(final int \u2603) {
        this.ak = afi.c.Q();
        this.al = afi.d.Q();
        this.am = 5169201;
        this.an = ady.a.a;
        this.ao = ady.a.b;
        this.ap = 0.5f;
        this.aq = 0.5f;
        this.ar = 16777215;
        this.at = (List<c>)Lists.newArrayList();
        this.au = (List<c>)Lists.newArrayList();
        this.av = (List<c>)Lists.newArrayList();
        this.aw = (List<c>)Lists.newArrayList();
        this.ay = true;
        this.aA = new apv(false);
        this.aB = new aoi(false);
        this.aC = new apt();
        this.az = \u2603;
        ady.aE[\u2603] = this;
        this.as = this.a();
        this.au.add(new c(tv.class, 12, 4, 4));
        this.au.add(new c(tu.class, 10, 3, 3));
        this.au.add(new c(tt.class, 10, 4, 4));
        this.au.add(new c(tn.class, 10, 4, 4));
        this.au.add(new c(to.class, 8, 4, 4));
        this.at.add(new c(wc.class, 100, 4, 4));
        this.at.add(new c(we.class, 100, 4, 4));
        this.at.add(new c(wa.class, 100, 4, 4));
        this.at.add(new c(vn.class, 100, 4, 4));
        this.at.add(new c(wb.class, 100, 4, 4));
        this.at.add(new c(vo.class, 10, 1, 4));
        this.at.add(new c(wd.class, 5, 1, 1));
        this.av.add(new c(tx.class, 10, 4, 4));
        this.aw.add(new c(tk.class, 10, 8, 8));
    }
    
    protected aeb a() {
        return new aeb();
    }
    
    protected ady a(final float \u2603, final float \u2603) {
        if (\u2603 > 0.1f && \u2603 < 0.2f) {
            throw new IllegalArgumentException("Please avoid temperatures in the range 0.1 - 0.2 because of snow");
        }
        this.ap = \u2603;
        this.aq = \u2603;
        return this;
    }
    
    protected final ady a(final a \u2603) {
        this.an = \u2603.a;
        this.ao = \u2603.b;
        return this;
    }
    
    protected ady b() {
        this.ay = false;
        return this;
    }
    
    public aoh a(final Random \u2603) {
        if (\u2603.nextInt(10) == 0) {
            return this.aB;
        }
        return this.aA;
    }
    
    public aot b(final Random \u2603) {
        return new apu(akc.a.b);
    }
    
    public agw.a a(final Random \u2603, final cj \u2603) {
        if (\u2603.nextInt(3) > 0) {
            return agw.a.a;
        }
        return agw.a.b;
    }
    
    protected ady c() {
        this.ax = true;
        return this;
    }
    
    protected ady a(final String \u2603) {
        this.ah = \u2603;
        return this;
    }
    
    protected ady a(final int \u2603) {
        this.am = \u2603;
        return this;
    }
    
    protected ady b(final int \u2603) {
        this.a(\u2603, false);
        return this;
    }
    
    protected ady c(final int \u2603) {
        this.aj = \u2603;
        return this;
    }
    
    protected ady a(final int \u2603, final boolean \u2603) {
        this.ai = \u2603;
        if (\u2603) {
            this.aj = (\u2603 & 0xFEFEFE) >> 1;
        }
        else {
            this.aj = \u2603;
        }
        return this;
    }
    
    public int a(float \u2603) {
        \u2603 /= 3.0f;
        \u2603 = ns.a(\u2603, -1.0f, 1.0f);
        return ns.c(0.62222224f - \u2603 * 0.05f, 0.5f + \u2603 * 0.1f, 1.0f);
    }
    
    public List<c> a(final pt \u2603) {
        switch (ady$1.a[\u2603.ordinal()]) {
            case 1: {
                return this.at;
            }
            case 2: {
                return this.au;
            }
            case 3: {
                return this.av;
            }
            case 4: {
                return this.aw;
            }
            default: {
                return Collections.emptyList();
            }
        }
    }
    
    public boolean d() {
        return this.j();
    }
    
    public boolean e() {
        return !this.j() && this.ay;
    }
    
    public boolean f() {
        return this.aq > 0.85f;
    }
    
    public float g() {
        return 0.1f;
    }
    
    public final int h() {
        return (int)(this.aq * 65536.0f);
    }
    
    public final float i() {
        return this.aq;
    }
    
    public final float a(final cj \u2603) {
        if (\u2603.o() > 64) {
            final float n = (float)(ady.ae.a(\u2603.n() * 1.0 / 8.0, \u2603.p() * 1.0 / 8.0) * 4.0);
            return this.ap - (n + \u2603.o() - 64.0f) * 0.05f / 30.0f;
        }
        return this.ap;
    }
    
    public void a(final adm \u2603, final Random \u2603, final cj \u2603) {
        this.as.a(\u2603, \u2603, this, \u2603);
    }
    
    public int b(final cj \u2603) {
        final double \u26032 = ns.a(this.a(\u2603), 0.0f, 1.0f);
        final double \u26033 = ns.a(this.i(), 0.0f, 1.0f);
        return adl.a(\u26032, \u26033);
    }
    
    public int c(final cj \u2603) {
        final double \u26032 = ns.a(this.a(\u2603), 0.0f, 1.0f);
        final double \u26033 = ns.a(this.i(), 0.0f, 1.0f);
        return adj.a(\u26032, \u26033);
    }
    
    public boolean j() {
        return this.ax;
    }
    
    public void a(final adm \u2603, final Random \u2603, final ans \u2603, final int \u2603, final int \u2603, final double \u2603) {
        this.b(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
    }
    
    public final void b(final adm \u2603, final Random \u2603, final ans \u2603, final int \u2603, final int \u2603, final double \u2603) {
        final int f = \u2603.F();
        alz \u26032 = this.ak;
        alz alz = this.al;
        int n = -1;
        final int n2 = (int)(\u2603 / 3.0 + 3.0 + \u2603.nextDouble() * 0.25);
        final int n3 = \u2603 & 0xF;
        final int n4 = \u2603 & 0xF;
        final cj.a a = new cj.a();
        for (int i = 255; i >= 0; --i) {
            if (i <= \u2603.nextInt(5)) {
                \u2603.a(n4, i, n3, afi.h.Q());
            }
            else {
                final alz a2 = \u2603.a(n4, i, n3);
                if (a2.c().t() == arm.a) {
                    n = -1;
                }
                else if (a2.c() == afi.b) {
                    if (n == -1) {
                        if (n2 <= 0) {
                            \u26032 = null;
                            alz = afi.b.Q();
                        }
                        else if (i >= f - 4 && i <= f + 1) {
                            \u26032 = this.ak;
                            alz = this.al;
                        }
                        if (i < f && (\u26032 == null || \u26032.c().t() == arm.a)) {
                            if (this.a(a.c(\u2603, i, \u2603)) < 0.15f) {
                                \u26032 = afi.aI.Q();
                            }
                            else {
                                \u26032 = afi.j.Q();
                            }
                        }
                        n = n2;
                        if (i >= f - 1) {
                            \u2603.a(n4, i, n3, \u26032);
                        }
                        else if (i < f - 7 - n2) {
                            \u26032 = null;
                            alz = afi.b.Q();
                            \u2603.a(n4, i, n3, afi.n.Q());
                        }
                        else {
                            \u2603.a(n4, i, n3, alz);
                        }
                    }
                    else if (n > 0) {
                        --n;
                        \u2603.a(n4, i, n3, alz);
                        if (n == 0 && alz.c() == afi.m) {
                            n = \u2603.nextInt(4) + Math.max(0, i - 63);
                            alz = ((alz.b(ajh.a) == ajh.a.b) ? afi.cM.Q() : afi.A.Q());
                        }
                    }
                }
            }
        }
    }
    
    protected ady k() {
        return this.d(this.az + 128);
    }
    
    protected ady d(final int \u2603) {
        return new aem(\u2603, this);
    }
    
    public Class<? extends ady> l() {
        return this.getClass();
    }
    
    public boolean a(final ady \u2603) {
        return \u2603 == this || (\u2603 != null && this.l() == \u2603.l());
    }
    
    public b m() {
        if (this.ap < 0.2) {
            return ady.b.b;
        }
        if (this.ap < 1.0) {
            return ady.b.c;
        }
        return ady.b.d;
    }
    
    public static ady[] n() {
        return ady.aE;
    }
    
    public static ady e(final int \u2603) {
        return a(\u2603, null);
    }
    
    public static ady a(final int \u2603, final ady \u2603) {
        if (\u2603 < 0 || \u2603 > ady.aE.length) {
            ady.aD.warn("Biome ID is out of bounds: " + \u2603 + ", defaulting to 0 (Ocean)");
            return ady.p;
        }
        final ady ady = ady.aE[\u2603];
        if (ady == null) {
            return \u2603;
        }
        return ady;
    }
    
    static {
        aD = LogManager.getLogger();
        a = new a(0.1f, 0.2f);
        b = new a(-0.5f, 0.0f);
        c = new a(-1.0f, 0.1f);
        d = new a(-1.8f, 0.1f);
        e = new a(0.125f, 0.05f);
        f = new a(0.2f, 0.2f);
        g = new a(0.45f, 0.3f);
        h = new a(1.5f, 0.025f);
        i = new a(1.0f, 0.5f);
        j = new a(0.0f, 0.025f);
        k = new a(0.1f, 0.8f);
        l = new a(0.2f, 0.3f);
        m = new a(-0.2f, 0.1f);
        aE = new ady[256];
        n = Sets.newHashSet();
        o = Maps.newHashMap();
        p = new aen(0).b(112).a("Ocean").a(ady.c);
        q = new aeo(1).b(9286496).a("Plains");
        r = new aed(2).b(16421912).a("Desert").b().a(2.0f, 0.0f).a(ady.e);
        s = new aee(3, false).b(6316128).a("Extreme Hills").a(ady.i).a(0.2f, 0.3f);
        t = new aeg(4, 0).b(353825).a("Forest");
        u = new aeu(5, 0).b(747097).a("Taiga").a(5159473).a(0.25f, 0.8f).a(ady.f);
        v = new aet(6).b(522674).a("Swampland").a(9154376).a(ady.m).a(0.8f, 0.9f);
        w = new aeq(7).b(255).a("River").a(ady.b);
        x = new aeh(8).b(16711680).a("Hell").b().a(2.0f, 0.0f);
        y = new aev(9).b(8421631).a("The End").b();
        z = new aen(10).b(9474208).a("FrozenOcean").c().a(ady.c).a(0.0f, 0.5f);
        A = new aeq(11).b(10526975).a("FrozenRiver").c().a(ady.b).a(0.0f, 0.5f);
        B = new aei(12, false).b(16777215).a("Ice Plains").c().a(0.0f, 0.5f).a(ady.e);
        C = new aei(13, false).b(10526880).a("Ice Mountains").c().a(ady.g).a(0.0f, 0.5f);
        D = new ael(14).b(16711935).a("MushroomIsland").a(0.9f, 1.0f).a(ady.l);
        E = new ael(15).b(10486015).a("MushroomIslandShore").a(0.9f, 1.0f).a(ady.j);
        F = new adx(16).b(16440917).a("Beach").a(0.8f, 0.4f).a(ady.j);
        G = new aed(17).b(13786898).a("DesertHills").b().a(2.0f, 0.0f).a(ady.g);
        H = new aeg(18, 0).b(2250012).a("ForestHills").a(ady.g);
        I = new aeu(19, 0).b(1456435).a("TaigaHills").a(5159473).a(0.25f, 0.8f).a(ady.g);
        J = new aee(20, true).b(7501978).a("Extreme Hills Edge").a(ady.i.a()).a(0.2f, 0.3f);
        K = new aej(21, false).b(5470985).a("Jungle").a(5470985).a(0.95f, 0.9f);
        L = new aej(22, false).b(2900485).a("JungleHills").a(5470985).a(0.95f, 0.9f).a(ady.g);
        M = new aej(23, true).b(6458135).a("JungleEdge").a(5470985).a(0.95f, 0.8f);
        N = new aen(24).b(48).a("Deep Ocean").a(ady.d);
        O = new aes(25).b(10658436).a("Stone Beach").a(0.2f, 0.3f).a(ady.k);
        P = new adx(26).b(16445632).a("Cold Beach").a(0.05f, 0.3f).a(ady.j).c();
        Q = new aeg(27, 2).a("Birch Forest").b(3175492);
        R = new aeg(28, 2).a("Birch Forest Hills").b(2055986).a(ady.g);
        S = new aeg(29, 3).b(4215066).a("Roofed Forest");
        T = new aeu(30, 0).b(3233098).a("Cold Taiga").a(5159473).c().a(-0.5f, 0.4f).a(ady.f).c(16777215);
        U = new aeu(31, 0).b(2375478).a("Cold Taiga Hills").a(5159473).c().a(-0.5f, 0.4f).a(ady.g).c(16777215);
        V = new aeu(32, 1).b(5858897).a("Mega Taiga").a(5159473).a(0.3f, 0.8f).a(ady.f);
        W = new aeu(33, 1).b(4542270).a("Mega Taiga Hills").a(5159473).a(0.3f, 0.8f).a(ady.g);
        X = new aee(34, true).b(5271632).a("Extreme Hills+").a(ady.i).a(0.2f, 0.3f);
        Y = new aer(35).b(12431967).a("Savanna").a(1.2f, 0.0f).b().a(ady.e);
        Z = new aer(36).b(10984804).a("Savanna Plateau").a(1.0f, 0.0f).b().a(ady.h);
        aa = new aek(37, false, false).b(14238997).a("Mesa");
        ab = new aek(38, false, true).b(11573093).a("Mesa Plateau F").a(ady.h);
        ac = new aek(39, false, false).b(13274213).a("Mesa Plateau").a(ady.h);
        ad = ady.p;
        ady.q.k();
        ady.r.k();
        ady.t.k();
        ady.u.k();
        ady.v.k();
        ady.B.k();
        ady.K.k();
        ady.M.k();
        ady.T.k();
        ady.Y.k();
        ady.Z.k();
        ady.aa.k();
        ady.ab.k();
        ady.ac.k();
        ady.Q.k();
        ady.R.k();
        ady.S.k();
        ady.V.k();
        ady.s.k();
        ady.X.k();
        ady.V.d(ady.W.az + 128).a("Redwood Taiga Hills M");
        for (final ady ady : ady.aE) {
            if (ady != null) {
                if (ady.o.containsKey(ady.ah)) {
                    throw new Error("Biome \"" + ady.ah + "\" is defined as both ID " + ady.o.get(ady.ah).az + " and " + ady.az);
                }
                ady.o.put(ady.ah, ady);
                if (ady.az < 128) {
                    ady.n.add(ady);
                }
            }
        }
        ady.n.remove(ady.x);
        ady.n.remove(ady.y);
        ady.n.remove(ady.z);
        ady.n.remove(ady.J);
        ae = new ard(new Random(1234L), 1);
        af = new ard(new Random(2345L), 1);
        ag = new aos();
    }
    
    public enum b
    {
        a, 
        b, 
        c, 
        d;
    }
    
    public static class a
    {
        public float a;
        public float b;
        
        public a(final float \u2603, final float \u2603) {
            this.a = \u2603;
            this.b = \u2603;
        }
        
        public a a() {
            return new a(this.a * 0.8f, this.b * 0.6f);
        }
    }
    
    public static class c extends oa.a
    {
        public Class<? extends ps> b;
        public int c;
        public int d;
        
        public c(final Class<? extends ps> \u2603, final int \u2603, final int \u2603, final int \u2603) {
            super(\u2603);
            this.b = \u2603;
            this.c = \u2603;
            this.d = \u2603;
        }
        
        @Override
        public String toString() {
            return this.b.getSimpleName() + "*(" + this.c + "-" + this.d + "):" + this.a;
        }
    }
}
