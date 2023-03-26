import java.util.concurrent.Callable;
import java.util.Iterator;
import java.util.Collection;
import com.google.common.collect.Maps;
import com.google.common.collect.Lists;
import java.util.Map;
import java.util.Random;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class bec
{
    private static final jy b;
    protected adm a;
    private List<beb>[][] c;
    private List<bep> d;
    private bmj e;
    private Random f;
    private Map<Integer, bed> g;
    
    public bec(final adm \u2603, final bmj \u2603) {
        this.c = (List<beb>[][])new List[4][];
        this.d = (List<bep>)Lists.newArrayList();
        this.f = new Random();
        this.g = (Map<Integer, bed>)Maps.newHashMap();
        this.a = \u2603;
        this.e = \u2603;
        for (int i = 0; i < 4; ++i) {
            this.c[i] = (List<beb>[])new List[2];
            for (int j = 0; j < 2; ++j) {
                this.c[i][j] = (List<beb>)Lists.newArrayList();
            }
        }
        this.c();
    }
    
    private void c() {
        this.a(cy.a.c(), new bdp.a());
        this.a(cy.e.c(), new bdl.a());
        this.a(cy.f.c(), new bek.a());
        this.a(cy.g.c(), new beq.a());
        this.a(cy.N.c(), new ber.a());
        this.a(cy.h.c(), new bel.a());
        this.a(cy.i.c(), new bem.b());
        this.a(cy.j.c(), new bdm.b());
        this.a(cy.k.c(), new bdm.a());
        this.a(cy.l.c(), new beh.a());
        this.a(cy.m.c(), new bdx.a());
        this.a(cy.n.c(), new bej.d());
        this.a(cy.o.c(), new bej.b());
        this.a(cy.p.c(), new bej.c());
        this.a(cy.q.c(), new bej.a());
        this.a(cy.r.c(), new bej.e());
        this.a(cy.s.c(), new bdn.b());
        this.a(cy.t.c(), new bdn.a());
        this.a(cy.u.c(), new bdt.a());
        this.a(cy.v.c(), new bem.a());
        this.a(cy.w.c(), new bem.b());
        this.a(cy.x.c(), new bea.a());
        this.a(cy.y.c(), new bef.a());
        this.a(cy.z.c(), new bdo.a());
        this.a(cy.A.c(), new bdr.a());
        this.a(cy.B.c(), new bdy.a());
        this.a(cy.C.c(), new bds.a());
        this.a(cy.D.c(), new bee.a());
        this.a(cy.E.c(), new beg.a());
        this.a(cy.F.c(), new bdk.c());
        this.a(cy.G.c(), new bei.a());
        this.a(cy.H.c(), new bdk.b());
        this.a(cy.I.c(), new bdt.b());
        this.a(cy.J.c(), new bdj.a());
        this.a(cy.K.c(), new bdk.a());
        this.a(cy.L.c(), new beo.a());
        this.a(cy.M.c(), new ben.a());
        this.a(cy.c.c(), new bdv.a());
        this.a(cy.b.c(), new bdu.a());
        this.a(cy.d.c(), new bdq.d());
        this.a(cy.P.c(), new bdz.a());
    }
    
    public void a(final int \u2603, final bed \u2603) {
        this.g.put(\u2603, \u2603);
    }
    
    public void a(final pk \u2603, final cy \u2603) {
        this.d.add(new bep(this.a, \u2603, \u2603));
    }
    
    public beb a(final int \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final double \u2603, final int... \u2603) {
        final bed bed = this.g.get(\u2603);
        if (bed != null) {
            final beb a = bed.a(\u2603, this.a, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
            if (a != null) {
                this.a(a);
                return a;
            }
        }
        return null;
    }
    
    public void a(final beb \u2603) {
        final int a = \u2603.a();
        final int n = (\u2603.j() == 1.0f) ? 1 : 0;
        if (this.c[a][n].size() >= 4000) {
            this.c[a][n].remove(0);
        }
        this.c[a][n].add(\u2603);
    }
    
    public void a() {
        for (int i = 0; i < 4; ++i) {
            this.a(i);
        }
        final List<bep> arrayList = (List<bep>)Lists.newArrayList();
        for (final bep bep : this.d) {
            bep.t_();
            if (bep.I) {
                arrayList.add(bep);
            }
        }
        this.d.removeAll(arrayList);
    }
    
    private void a(final int \u2603) {
        for (int i = 0; i < 2; ++i) {
            this.a(this.c[\u2603][i]);
        }
    }
    
    private void a(final List<beb> \u2603) {
        final List<beb> arrayList = (List<beb>)Lists.newArrayList();
        for (int i = 0; i < \u2603.size(); ++i) {
            final beb \u26032 = \u2603.get(i);
            this.d(\u26032);
            if (\u26032.I) {
                arrayList.add(\u26032);
            }
        }
        \u2603.removeAll(arrayList);
    }
    
    private void d(final beb \u2603) {
        try {
            \u2603.t_();
        }
        catch (Throwable \u26032) {
            final b a = b.a(\u26032, "Ticking Particle");
            final c a2 = a.a("Particle being ticked");
            final int a3 = \u2603.a();
            a2.a("Particle", new Callable<String>() {
                public String a() throws Exception {
                    return \u2603.toString();
                }
            });
            a2.a("Particle Type", new Callable<String>() {
                public String a() throws Exception {
                    if (a3 == 0) {
                        return "MISC_TEXTURE";
                    }
                    if (a3 == 1) {
                        return "TERRAIN_TEXTURE";
                    }
                    if (a3 == 3) {
                        return "ENTITY_PARTICLE_TEXTURE";
                    }
                    return "Unknown - " + a3;
                }
            });
            throw new e(a);
        }
    }
    
    public void a(final pk \u2603, final float \u2603) {
        final float b = auz.b();
        final float d = auz.d();
        final float e = auz.e();
        final float f = auz.f();
        final float c = auz.c();
        beb.aw = \u2603.P + (\u2603.s - \u2603.P) * \u2603;
        beb.ax = \u2603.Q + (\u2603.t - \u2603.Q) * \u2603;
        beb.ay = \u2603.R + (\u2603.u - \u2603.R) * \u2603;
        bfl.l();
        bfl.b(770, 771);
        bfl.a(516, 0.003921569f);
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 2; ++j) {
                if (!this.c[i][j].isEmpty()) {
                    switch (j) {
                        case 0: {
                            bfl.a(false);
                            break;
                        }
                        case 1: {
                            bfl.a(true);
                            break;
                        }
                    }
                    switch (i) {
                        default: {
                            this.e.a(bec.b);
                            break;
                        }
                        case 1: {
                            this.e.a(bmh.g);
                            break;
                        }
                    }
                    bfl.c(1.0f, 1.0f, 1.0f, 1.0f);
                    final bfx a = bfx.a();
                    final bfd c2 = a.c();
                    c2.a(7, bms.d);
                    for (int k = 0; k < this.c[i][j].size(); ++k) {
                        final beb beb = this.c[i][j].get(k);
                        try {
                            beb.a(c2, \u2603, \u2603, b, c, d, e, f);
                        }
                        catch (Throwable \u26032) {
                            final b a2 = b.a(\u26032, "Rendering Particle");
                            final c a3 = a2.a("Particle being rendered");
                            final int n = i;
                            a3.a("Particle", new Callable<String>() {
                                public String a() throws Exception {
                                    return beb.toString();
                                }
                            });
                            a3.a("Particle Type", new Callable<String>() {
                                public String a() throws Exception {
                                    if (n == 0) {
                                        return "MISC_TEXTURE";
                                    }
                                    if (n == 1) {
                                        return "TERRAIN_TEXTURE";
                                    }
                                    if (n == 3) {
                                        return "ENTITY_PARTICLE_TEXTURE";
                                    }
                                    return "Unknown - " + n;
                                }
                            });
                            throw new e(a2);
                        }
                    }
                    a.b();
                }
            }
        }
        bfl.a(true);
        bfl.k();
        bfl.a(516, 0.1f);
    }
    
    public void b(final pk \u2603, final float \u2603) {
        final float n = 0.017453292f;
        final float b = ns.b(\u2603.y * 0.017453292f);
        final float a = ns.a(\u2603.y * 0.017453292f);
        final float \u26032 = -a * ns.a(\u2603.z * 0.017453292f);
        final float \u26033 = b * ns.a(\u2603.z * 0.017453292f);
        final float b2 = ns.b(\u2603.z * 0.017453292f);
        for (int i = 0; i < 2; ++i) {
            final List<beb> list = this.c[3][i];
            if (!list.isEmpty()) {
                final bfx a2 = bfx.a();
                final bfd c = a2.c();
                for (int j = 0; j < list.size(); ++j) {
                    final beb beb = list.get(j);
                    beb.a(c, \u2603, \u2603, b, b2, a, \u26032, \u26033);
                }
            }
        }
    }
    
    public void a(final adm \u2603) {
        this.a = \u2603;
        for (int i = 0; i < 4; ++i) {
            for (int j = 0; j < 2; ++j) {
                this.c[i][j].clear();
            }
        }
        this.d.clear();
    }
    
    public void a(final cj \u2603, alz \u2603) {
        if (\u2603.c().t() == arm.a) {
            return;
        }
        \u2603 = \u2603.c().a(\u2603, this.a, \u2603);
        for (int n = 4, i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                for (int k = 0; k < n; ++k) {
                    final double \u26032 = \u2603.n() + (i + 0.5) / n;
                    final double \u26033 = \u2603.o() + (j + 0.5) / n;
                    final double \u26034 = \u2603.p() + (k + 0.5) / n;
                    this.a(new beo(this.a, \u26032, \u26033, \u26034, \u26032 - \u2603.n() - 0.5, \u26033 - \u2603.o() - 0.5, \u26034 - \u2603.p() - 0.5, \u2603).a(\u2603));
                }
            }
        }
    }
    
    public void a(final cj \u2603, final cq \u2603) {
        final alz p = this.a.p(\u2603);
        final afh c = p.c();
        if (c.b() == -1) {
            return;
        }
        final int n = \u2603.n();
        final int o = \u2603.o();
        final int p2 = \u2603.p();
        final float n2 = 0.1f;
        double \u26032 = n + this.f.nextDouble() * (c.C() - c.B() - n2 * 2.0f) + n2 + c.B();
        double \u26033 = o + this.f.nextDouble() * (c.E() - c.D() - n2 * 2.0f) + n2 + c.D();
        double \u26034 = p2 + this.f.nextDouble() * (c.G() - c.F() - n2 * 2.0f) + n2 + c.F();
        if (\u2603 == cq.a) {
            \u26033 = o + c.D() - n2;
        }
        if (\u2603 == cq.b) {
            \u26033 = o + c.E() + n2;
        }
        if (\u2603 == cq.c) {
            \u26034 = p2 + c.F() - n2;
        }
        if (\u2603 == cq.d) {
            \u26034 = p2 + c.G() + n2;
        }
        if (\u2603 == cq.e) {
            \u26032 = n + c.B() - n2;
        }
        if (\u2603 == cq.f) {
            \u26032 = n + c.C() + n2;
        }
        this.a(new beo(this.a, \u26032, \u26033, \u26034, 0.0, 0.0, 0.0, p).a(\u2603).a(0.2f).h(0.6f));
    }
    
    public void b(final beb \u2603) {
        this.a(\u2603, 1, 0);
    }
    
    public void c(final beb \u2603) {
        this.a(\u2603, 0, 1);
    }
    
    private void a(final beb \u2603, final int \u2603, final int \u2603) {
        for (int i = 0; i < 4; ++i) {
            if (this.c[i][\u2603].contains(\u2603)) {
                this.c[i][\u2603].remove(\u2603);
                this.c[i][\u2603].add(\u2603);
            }
        }
    }
    
    public String b() {
        int i = 0;
        for (int j = 0; j < 4; ++j) {
            for (int k = 0; k < 2; ++k) {
                i += this.c[j][k].size();
            }
        }
        return "" + i;
    }
    
    static {
        b = new jy("textures/particle/particles.png");
    }
}
