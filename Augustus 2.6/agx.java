import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public class agx extends afc
{
    public static final amn a;
    public static final amm<a> b;
    
    public agx() {
        super(arm.q);
        this.j(this.M.b().a(agx.b, agx.a.a).a((amo<Comparable>)agx.a, 0));
        this.j();
    }
    
    @Override
    public String f() {
        return di.a("item.flowerPot.name");
    }
    
    @Override
    public void j() {
        final float \u2603 = 0.375f;
        final float n = \u2603 / 2.0f;
        this.a(0.5f - n, 0.0f, 0.5f - n, 0.5f + n, \u2603, 0.5f + n);
    }
    
    @Override
    public boolean c() {
        return false;
    }
    
    @Override
    public int b() {
        return 3;
    }
    
    @Override
    public boolean d() {
        return false;
    }
    
    @Override
    public int a(final adq \u2603, final cj \u2603, final int \u2603) {
        final akw s = \u2603.s(\u2603);
        if (s instanceof alg) {
            final zw b = ((alg)s).b();
            if (b instanceof yo) {
                return afh.a(b).a(\u2603, \u2603, \u2603);
            }
        }
        return 16777215;
    }
    
    @Override
    public boolean a(final adm \u2603, final cj \u2603, final alz \u2603, final wn \u2603, final cq \u2603, final float \u2603, final float \u2603, final float \u2603) {
        final zx h = \u2603.bi.h();
        if (h == null || !(h.b() instanceof yo)) {
            return false;
        }
        final alg f = this.f(\u2603, \u2603);
        if (f == null) {
            return false;
        }
        if (f.b() != null) {
            return false;
        }
        final afh a = afh.a(h.b());
        if (!this.a(a, h.i())) {
            return false;
        }
        f.a(h.b(), h.i());
        f.p_();
        \u2603.h(\u2603);
        \u2603.b(na.T);
        if (!\u2603.bA.d) {
            final zx zx = h;
            if (--zx.b <= 0) {
                \u2603.bi.a(\u2603.bi.c, null);
            }
        }
        return true;
    }
    
    private boolean a(final afh \u2603, final int \u2603) {
        return \u2603 == afi.N || \u2603 == afi.O || \u2603 == afi.aK || \u2603 == afi.P || \u2603 == afi.Q || \u2603 == afi.g || \u2603 == afi.I || (\u2603 == afi.H && \u2603 == akc.a.c.a());
    }
    
    @Override
    public zw c(final adm \u2603, final cj \u2603) {
        final alg f = this.f(\u2603, \u2603);
        if (f != null && f.b() != null) {
            return f.b();
        }
        return zy.bQ;
    }
    
    @Override
    public int j(final adm \u2603, final cj \u2603) {
        final alg f = this.f(\u2603, \u2603);
        if (f != null && f.b() != null) {
            return f.c();
        }
        return 0;
    }
    
    @Override
    public boolean M() {
        return true;
    }
    
    @Override
    public boolean d(final adm \u2603, final cj \u2603) {
        return super.d(\u2603, \u2603) && adm.a(\u2603, \u2603.b());
    }
    
    @Override
    public void a(final adm \u2603, final cj \u2603, final alz \u2603, final afh \u2603) {
        if (!adm.a(\u2603, \u2603.b())) {
            this.b(\u2603, \u2603, \u2603, 0);
            \u2603.g(\u2603);
        }
    }
    
    @Override
    public void b(final adm \u2603, final cj \u2603, final alz \u2603) {
        final alg f = this.f(\u2603, \u2603);
        if (f != null && f.b() != null) {
            afh.a(\u2603, \u2603, new zx(f.b(), 1, f.c()));
        }
        super.b(\u2603, \u2603, \u2603);
    }
    
    @Override
    public void a(final adm \u2603, final cj \u2603, final alz \u2603, final wn \u2603) {
        super.a(\u2603, \u2603, \u2603, \u2603);
        if (\u2603.bA.d) {
            final alg f = this.f(\u2603, \u2603);
            if (f != null) {
                f.a(null, 0);
            }
        }
    }
    
    @Override
    public zw a(final alz \u2603, final Random \u2603, final int \u2603) {
        return zy.bQ;
    }
    
    private alg f(final adm \u2603, final cj \u2603) {
        final akw s = \u2603.s(\u2603);
        if (s instanceof alg) {
            return (alg)s;
        }
        return null;
    }
    
    @Override
    public akw a(final adm \u2603, final int \u2603) {
        afh \u26032 = null;
        int \u26033 = 0;
        switch (\u2603) {
            case 1: {
                \u26032 = afi.O;
                \u26033 = agw.a.b.b();
                break;
            }
            case 2: {
                \u26032 = afi.N;
                break;
            }
            case 3: {
                \u26032 = afi.g;
                \u26033 = aio.a.a.a();
                break;
            }
            case 4: {
                \u26032 = afi.g;
                \u26033 = aio.a.b.a();
                break;
            }
            case 5: {
                \u26032 = afi.g;
                \u26033 = aio.a.c.a();
                break;
            }
            case 6: {
                \u26032 = afi.g;
                \u26033 = aio.a.d.a();
                break;
            }
            case 12: {
                \u26032 = afi.g;
                \u26033 = aio.a.e.a();
                break;
            }
            case 13: {
                \u26032 = afi.g;
                \u26033 = aio.a.f.a();
                break;
            }
            case 7: {
                \u26032 = afi.Q;
                break;
            }
            case 8: {
                \u26032 = afi.P;
                break;
            }
            case 9: {
                \u26032 = afi.aK;
                break;
            }
            case 10: {
                \u26032 = afi.I;
                break;
            }
            case 11: {
                \u26032 = afi.H;
                \u26033 = akc.a.c.a();
                break;
            }
        }
        return new alg(zw.a(\u26032), \u26033);
    }
    
    @Override
    protected ama e() {
        return new ama(this, new amo[] { agx.b, agx.a });
    }
    
    @Override
    public int c(final alz \u2603) {
        return \u2603.b((amo<Integer>)agx.a);
    }
    
    @Override
    public alz a(final alz \u2603, final adq \u2603, final cj \u2603) {
        a a = agx.a.a;
        final akw s = \u2603.s(\u2603);
        if (s instanceof alg) {
            final alg alg = (alg)s;
            final zw b = alg.b();
            if (b instanceof yo) {
                final int c = alg.c();
                final afh a2 = afh.a(b);
                if (a2 == afi.g) {
                    switch (agx$1.a[aio.a.a(c).ordinal()]) {
                        case 1: {
                            a = agx.a.l;
                            break;
                        }
                        case 2: {
                            a = agx.a.m;
                            break;
                        }
                        case 3: {
                            a = agx.a.n;
                            break;
                        }
                        case 4: {
                            a = agx.a.o;
                            break;
                        }
                        case 5: {
                            a = agx.a.p;
                            break;
                        }
                        case 6: {
                            a = agx.a.q;
                            break;
                        }
                        default: {
                            a = agx.a.a;
                            break;
                        }
                    }
                }
                else if (a2 == afi.H) {
                    switch (c) {
                        case 0: {
                            a = agx.a.t;
                            break;
                        }
                        case 2: {
                            a = agx.a.u;
                            break;
                        }
                        default: {
                            a = agx.a.a;
                            break;
                        }
                    }
                }
                else if (a2 == afi.N) {
                    a = agx.a.k;
                }
                else if (a2 == afi.O) {
                    switch (agx$1.b[agw.a.a(agw.b.b, c).ordinal()]) {
                        case 1: {
                            a = agx.a.b;
                            break;
                        }
                        case 2: {
                            a = agx.a.c;
                            break;
                        }
                        case 3: {
                            a = agx.a.d;
                            break;
                        }
                        case 4: {
                            a = agx.a.e;
                            break;
                        }
                        case 5: {
                            a = agx.a.f;
                            break;
                        }
                        case 6: {
                            a = agx.a.g;
                            break;
                        }
                        case 7: {
                            a = agx.a.h;
                            break;
                        }
                        case 8: {
                            a = agx.a.i;
                            break;
                        }
                        case 9: {
                            a = agx.a.j;
                            break;
                        }
                        default: {
                            a = agx.a.a;
                            break;
                        }
                    }
                }
                else if (a2 == afi.Q) {
                    a = agx.a.r;
                }
                else if (a2 == afi.P) {
                    a = agx.a.s;
                }
                else if (a2 == afi.I) {
                    a = agx.a.t;
                }
                else if (a2 == afi.aK) {
                    a = agx.a.v;
                }
            }
        }
        return \u2603.a(agx.b, a);
    }
    
    @Override
    public adf m() {
        return adf.c;
    }
    
    static {
        a = amn.a("legacy_data", 0, 15);
        b = amm.a("contents", a.class);
    }
    
    public enum a implements nw
    {
        a("empty"), 
        b("rose"), 
        c("blue_orchid"), 
        d("allium"), 
        e("houstonia"), 
        f("red_tulip"), 
        g("orange_tulip"), 
        h("white_tulip"), 
        i("pink_tulip"), 
        j("oxeye_daisy"), 
        k("dandelion"), 
        l("oak_sapling"), 
        m("spruce_sapling"), 
        n("birch_sapling"), 
        o("jungle_sapling"), 
        p("acacia_sapling"), 
        q("dark_oak_sapling"), 
        r("mushroom_red"), 
        s("mushroom_brown"), 
        t("dead_bush"), 
        u("fern"), 
        v("cactus");
        
        private final String w;
        
        private a(final String \u2603) {
            this.w = \u2603;
        }
        
        @Override
        public String toString() {
            return this.w;
        }
        
        @Override
        public String l() {
            return this.w;
        }
    }
}
