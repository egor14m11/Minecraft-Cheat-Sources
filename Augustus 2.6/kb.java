import org.apache.logging.log4j.LogManager;
import java.io.OutputStream;
import java.util.UUID;
import com.mojang.authlib.GameProfile;
import java.util.Random;
import org.apache.logging.log4j.Logger;
import java.io.PrintStream;

// 
// Decompiled by Procyon v0.5.36
// 

public class kb
{
    private static final PrintStream a;
    private static boolean b;
    private static final Logger c;
    
    public static boolean a() {
        return kb.b;
    }
    
    static void b() {
        agg.N.a(zy.g, new ka() {
            @Override
            protected wv a(final adm \u2603, final cz \u2603) {
                final wq wq = new wq(\u2603, \u2603.a(), \u2603.b(), \u2603.c());
                wq.a = 1;
                return wq;
            }
        });
        agg.N.a(zy.aP, new ka() {
            @Override
            protected wv a(final adm \u2603, final cz \u2603) {
                return new wz(\u2603, \u2603.a(), \u2603.b(), \u2603.c());
            }
        });
        agg.N.a(zy.aD, new ka() {
            @Override
            protected wv a(final adm \u2603, final cz \u2603) {
                return new wx(\u2603, \u2603.a(), \u2603.b(), \u2603.c());
            }
        });
        agg.N.a(zy.bK, new ka() {
            @Override
            protected wv a(final adm \u2603, final cz \u2603) {
                return new xb(\u2603, \u2603.a(), \u2603.b(), \u2603.c());
            }
            
            @Override
            protected float a() {
                return super.a() * 0.5f;
            }
            
            @Override
            protected float b() {
                return super.b() * 1.25f;
            }
        });
        agg.N.a(zy.bz, new cr() {
            private final cn b = new cn();
            
            @Override
            public zx a(final ck \u2603, final zx \u2603) {
                if (aai.f(\u2603.i())) {
                    return new ka() {
                        @Override
                        protected wv a(final adm \u2603, final cz \u2603) {
                            return new xc(\u2603, \u2603.a(), \u2603.b(), \u2603.c(), \u2603.k());
                        }
                        
                        @Override
                        protected float a() {
                            return super.a() * 0.5f;
                        }
                        
                        @Override
                        protected float b() {
                            return super.b() * 1.25f;
                        }
                    }.a(\u2603, \u2603);
                }
                return this.b.a(\u2603, \u2603);
            }
        });
        agg.N.a(zy.bJ, new cn() {
            public zx b(final ck \u2603, final zx \u2603) {
                final cq b = agg.b(\u2603.f());
                final double \u26032 = \u2603.a() + b.g();
                final double \u26033 = \u2603.d().o() + 0.2f;
                final double \u26034 = \u2603.c() + b.i();
                final pk a = aax.a(\u2603.i(), \u2603.i(), \u26032, \u26033, \u26034);
                if (a instanceof pr && \u2603.s()) {
                    ((ps)a).a(\u2603.q());
                }
                \u2603.a(1);
                return \u2603;
            }
        });
        agg.N.a(zy.cb, new cn() {
            public zx b(final ck \u2603, final zx \u2603) {
                final cq b = agg.b(\u2603.f());
                final double \u26032 = \u2603.a() + b.g();
                final double \u26033 = \u2603.d().o() + 0.2f;
                final double \u26034 = \u2603.c() + b.i();
                final wt \u26035 = new wt(\u2603.i(), \u26032, \u26033, \u26034, \u2603);
                \u2603.i().d(\u26035);
                \u2603.a(1);
                return \u2603;
            }
            
            @Override
            protected void a(final ck \u2603) {
                \u2603.i().b(1002, \u2603.d(), 0);
            }
        });
        agg.N.a(zy.bL, new cn() {
            public zx b(final ck \u2603, final zx \u2603) {
                final cq b = agg.b(\u2603.f());
                final cz a = agg.a(\u2603);
                final double \u26032 = a.a() + b.g() * 0.3f;
                final double \u26033 = a.b() + b.h() * 0.3f;
                final double \u26034 = a.c() + b.i() * 0.3f;
                final adm i = \u2603.i();
                final Random s = i.s;
                final double \u26035 = s.nextGaussian() * 0.05 + b.g();
                final double \u26036 = s.nextGaussian() * 0.05 + b.h();
                final double \u26037 = s.nextGaussian() * 0.05 + b.i();
                i.d(new ww(i, \u26032, \u26033, \u26034, \u26035, \u26036, \u26037));
                \u2603.a(1);
                return \u2603;
            }
            
            @Override
            protected void a(final ck \u2603) {
                \u2603.i().b(1009, \u2603.d(), 0);
            }
        });
        agg.N.a(zy.aE, new cn() {
            private final cn b = new cn();
            
            public zx b(final ck \u2603, final zx \u2603) {
                final cq b = agg.b(\u2603.f());
                final adm i = \u2603.i();
                final double \u26032 = \u2603.a() + b.g() * 1.125f;
                final double n = \u2603.b() + b.h() * 1.125f;
                final double \u26033 = \u2603.c() + b.i() * 1.125f;
                final cj a = \u2603.d().a(b);
                final arm t = i.p(a).c().t();
                double n2;
                if (arm.h.equals(t)) {
                    n2 = 1.0;
                }
                else {
                    if (!arm.a.equals(t) || !arm.h.equals(i.p(a.b()).c().t())) {
                        return this.b.a(\u2603, \u2603);
                    }
                    n2 = 0.0;
                }
                final ux \u26034 = new ux(i, \u26032, n + n2, \u26033);
                i.d(\u26034);
                \u2603.a(1);
                return \u2603;
            }
            
            @Override
            protected void a(final ck \u2603) {
                \u2603.i().b(1000, \u2603.d(), 0);
            }
        });
        final cr cr = new cn() {
            private final cn b = new cn();
            
            public zx b(final ck \u2603, final zx \u2603) {
                final yv yv = (yv)\u2603.b();
                final cj a = \u2603.d().a(agg.b(\u2603.f()));
                if (yv.a(\u2603.i(), a)) {
                    \u2603.a(zy.aw);
                    \u2603.b = 1;
                    return \u2603;
                }
                return this.b.a(\u2603, \u2603);
            }
        };
        agg.N.a(zy.ay, cr);
        agg.N.a(zy.ax, cr);
        agg.N.a(zy.aw, new cn() {
            private final cn b = new cn();
            
            public zx b(final ck \u2603, final zx \u2603) {
                final adm i = \u2603.i();
                final cj a = \u2603.d().a(agg.b(\u2603.f()));
                final alz p = i.p(a);
                final afh c = p.c();
                final arm t = c.t();
                zw \u26032;
                if (arm.h.equals(t) && c instanceof ahv && p.b((amo<Integer>)ahv.b) == 0) {
                    \u26032 = zy.ax;
                }
                else {
                    if (!arm.i.equals(t) || !(c instanceof ahv) || p.b((amo<Integer>)ahv.b) != 0) {
                        return super.b(\u2603, \u2603);
                    }
                    \u26032 = zy.ay;
                }
                i.g(a);
                final int b = \u2603.b - 1;
                \u2603.b = b;
                if (b == 0) {
                    \u2603.a(\u26032);
                    \u2603.b = 1;
                }
                else if (\u2603.h().a(new zx(\u26032)) < 0) {
                    this.b.a(\u2603, new zx(\u26032));
                }
                return \u2603;
            }
        });
        agg.N.a(zy.d, new cn() {
            private boolean b = true;
            
            @Override
            protected zx b(final ck \u2603, final zx \u2603) {
                final adm i = \u2603.i();
                final cj a = \u2603.d().a(agg.b(\u2603.f()));
                if (i.d(a)) {
                    i.a(a, afi.ab.Q());
                    if (\u2603.a(1, i.s)) {
                        \u2603.b = 0;
                    }
                }
                else if (i.p(a).c() == afi.W) {
                    afi.W.d(i, a, afi.W.Q().a((amo<Comparable>)ake.a, true));
                    i.g(a);
                }
                else {
                    this.b = false;
                }
                return \u2603;
            }
            
            @Override
            protected void a(final ck \u2603) {
                if (this.b) {
                    \u2603.i().b(1000, \u2603.d(), 0);
                }
                else {
                    \u2603.i().b(1001, \u2603.d(), 0);
                }
            }
        });
        agg.N.a(zy.aW, new cn() {
            private boolean b = true;
            
            @Override
            protected zx b(final ck \u2603, final zx \u2603) {
                if (zd.a == zd.a(\u2603.i())) {
                    final adm i = \u2603.i();
                    final cj a = \u2603.d().a(agg.b(\u2603.f()));
                    if (ze.a(\u2603, i, a)) {
                        if (!i.D) {
                            i.b(2005, a, 0);
                        }
                    }
                    else {
                        this.b = false;
                    }
                    return \u2603;
                }
                return super.b(\u2603, \u2603);
            }
            
            @Override
            protected void a(final ck \u2603) {
                if (this.b) {
                    \u2603.i().b(1000, \u2603.d(), 0);
                }
                else {
                    \u2603.i().b(1001, \u2603.d(), 0);
                }
            }
        });
        agg.N.a(zw.a(afi.W), new cn() {
            @Override
            protected zx b(final ck \u2603, final zx \u2603) {
                final adm i = \u2603.i();
                final cj a = \u2603.d().a(agg.b(\u2603.f()));
                final vj vj = new vj(i, a.n() + 0.5, a.o(), a.p() + 0.5, null);
                i.d(vj);
                i.a(vj, "game.tnt.primed", 1.0f, 1.0f);
                --\u2603.b;
                return \u2603;
            }
        });
        agg.N.a(zy.bX, new cn() {
            private boolean b = true;
            
            @Override
            protected zx b(final ck \u2603, final zx \u2603) {
                final adm i = \u2603.i();
                final cq b = agg.b(\u2603.f());
                final cj a = \u2603.d().a(b);
                final ajm ce = afi.ce;
                if (i.d(a) && ce.b(i, a, \u2603)) {
                    if (!i.D) {
                        i.a(a, ce.Q().a((amo<Comparable>)ajm.a, cq.b), 3);
                        final akw s = i.s(a);
                        if (s instanceof alo) {
                            if (\u2603.i() == 3) {
                                GameProfile a2 = null;
                                if (\u2603.n()) {
                                    final dn o = \u2603.o();
                                    if (o.b("SkullOwner", 10)) {
                                        a2 = dy.a(o.m("SkullOwner"));
                                    }
                                    else if (o.b("SkullOwner", 8)) {
                                        final String j = o.j("SkullOwner");
                                        if (!nx.b(j)) {
                                            a2 = new GameProfile(null, j);
                                        }
                                    }
                                }
                                ((alo)s).a(a2);
                            }
                            else {
                                ((alo)s).a(\u2603.i());
                            }
                            ((alo)s).b(b.d().b() * 4);
                            afi.ce.a(i, a, (alo)s);
                        }
                        --\u2603.b;
                    }
                }
                else {
                    this.b = false;
                }
                return \u2603;
            }
            
            @Override
            protected void a(final ck \u2603) {
                if (this.b) {
                    \u2603.i().b(1000, \u2603.d(), 0);
                }
                else {
                    \u2603.i().b(1001, \u2603.d(), 0);
                }
            }
        });
        agg.N.a(zw.a(afi.aU), new cn() {
            private boolean b = true;
            
            @Override
            protected zx b(final ck \u2603, final zx \u2603) {
                final adm i = \u2603.i();
                final cj a = \u2603.d().a(agg.b(\u2603.f()));
                final aiv aiv = (aiv)afi.aU;
                if (i.d(a) && aiv.e(i, a)) {
                    if (!i.D) {
                        i.a(a, aiv.Q(), 3);
                    }
                    --\u2603.b;
                }
                else {
                    this.b = false;
                }
                return \u2603;
            }
            
            @Override
            protected void a(final ck \u2603) {
                if (this.b) {
                    \u2603.i().b(1000, \u2603.d(), 0);
                }
                else {
                    \u2603.i().b(1001, \u2603.d(), 0);
                }
            }
        });
    }
    
    public static void c() {
        if (kb.b) {
            return;
        }
        kb.b = true;
        if (kb.c.isDebugEnabled()) {
            d();
        }
        afh.S();
        agv.l();
        zw.t();
        na.a();
        b();
    }
    
    private static void d() {
        System.setErr(new kg("STDERR", System.err));
        System.setOut(new kg("STDOUT", kb.a));
    }
    
    public static void a(final String \u2603) {
        kb.a.println(\u2603);
    }
    
    static {
        a = System.out;
        kb.b = false;
        c = LogManager.getLogger();
    }
}
