import java.util.Iterator;
import com.google.common.collect.Maps;
import java.util.Map;

// 
// Decompiled by Procyon v0.5.36
// 

public class bgc
{
    private final Map<alz, boq> a;
    private final bgv b;
    private final bou c;
    
    public bgc(final bou \u2603) {
        this.a = (Map<alz, boq>)Maps.newIdentityHashMap();
        this.b = new bgv();
        this.c = \u2603;
        this.d();
    }
    
    public bgv a() {
        return this.b;
    }
    
    public bmi a(final alz \u2603) {
        final afh c = \u2603.c();
        boq boq = this.b(\u2603);
        if (boq == null || boq == this.c.a()) {
            if (c == afi.ax || c == afi.an || c == afi.ae || c == afi.cg || c == afi.cK || c == afi.cL) {
                return this.c.b().a("minecraft:blocks/planks_oak");
            }
            if (c == afi.bQ) {
                return this.c.b().a("minecraft:blocks/obsidian");
            }
            if (c == afi.k || c == afi.l) {
                return this.c.b().a("minecraft:blocks/lava_still");
            }
            if (c == afi.i || c == afi.j) {
                return this.c.b().a("minecraft:blocks/water_still");
            }
            if (c == afi.ce) {
                return this.c.b().a("minecraft:blocks/soul_sand");
            }
            if (c == afi.cv) {
                return this.c.b().a("minecraft:items/barrier");
            }
        }
        if (boq == null) {
            boq = this.c.a();
        }
        return boq.e();
    }
    
    public boq b(final alz \u2603) {
        boq a = this.a.get(\u2603);
        if (a == null) {
            a = this.c.a();
        }
        return a;
    }
    
    public bou b() {
        return this.c;
    }
    
    public void c() {
        this.a.clear();
        for (final Map.Entry<alz, bov> entry : this.b.a().entrySet()) {
            this.a.put(entry.getKey(), this.c.a(entry.getValue()));
        }
    }
    
    public void a(final afh \u2603, final bgy \u2603) {
        this.b.a(\u2603, \u2603);
    }
    
    public void a(final afh... \u2603) {
        this.b.a(\u2603);
    }
    
    private void d() {
        this.a(afi.a, afi.i, afi.j, afi.k, afi.l, afi.M, afi.ae, afi.bQ, afi.cg, afi.an, afi.ce, afi.bF, afi.cv, afi.ax, afi.cL, afi.cK);
        this.a(afi.b, new bgx.a().a(ajy.a).a());
        this.a(afi.cI, new bgx.a().a(aiu.a).a());
        this.a(afi.t, new bgx.a().a(aik.Q).a("_leaves").a(ahs.b, ahs.a).a());
        this.a(afi.u, new bgx.a().a(aif.Q).a("_leaves").a(ahs.b, ahs.a).a());
        this.a(afi.aK, new bgx.a().a((amo<?>[])new amo[] { afo.a }).a());
        this.a(afi.aM, new bgx.a().a((amo<?>[])new amo[] { aje.a }).a());
        this.a(afi.aN, new bgx.a().a((amo<?>[])new amo[] { ahq.a }).a());
        this.a(afi.bX, new bgx.a().a((amo<?>[])new amo[] { afw.a }).a());
        this.a(afi.bZ, new bgx.a().a(akl.Q).a("_wall").a());
        this.a(afi.cF, new bgx.a().a(agi.a).a((amo<?>[])new amo[] { agi.N }).a());
        this.a(afi.bo, new bgx.a().a((amo<?>[])new amo[] { agu.b }).a());
        this.a(afi.bp, new bgx.a().a((amo<?>[])new amo[] { agu.b }).a());
        this.a(afi.bq, new bgx.a().a((amo<?>[])new amo[] { agu.b }).a());
        this.a(afi.br, new bgx.a().a((amo<?>[])new amo[] { agu.b }).a());
        this.a(afi.bs, new bgx.a().a((amo<?>[])new amo[] { agu.b }).a());
        this.a(afi.bt, new bgx.a().a((amo<?>[])new amo[] { agu.b }).a());
        this.a(afi.bS, new bgx.a().a(aki.O, aki.a).a());
        this.a(afi.bL, new bgx.a().a(aio.a).a("_double_slab").a());
        this.a(afi.bM, new bgx.a().a(aio.a).a("_slab").a());
        this.a(afi.W, new bgx.a().a((amo<?>[])new amo[] { ake.a }).a());
        this.a(afi.ab, new bgx.a().a((amo<?>[])new amo[] { agv.a }).a());
        this.a(afi.af, new bgx.a().a((amo<?>[])new amo[] { ajb.P }).a());
        this.a(afi.ao, new bgx.a().a((amo<?>[])new amo[] { agh.O }).a());
        this.a(afi.ap, new bgx.a().a((amo<?>[])new amo[] { agh.O }).a());
        this.a(afi.aq, new bgx.a().a((amo<?>[])new amo[] { agh.O }).a());
        this.a(afi.ar, new bgx.a().a((amo<?>[])new amo[] { agh.O }).a());
        this.a(afi.as, new bgx.a().a((amo<?>[])new amo[] { agh.O }).a());
        this.a(afi.at, new bgx.a().a((amo<?>[])new amo[] { agh.O }).a());
        this.a(afi.aA, new bgx.a().a((amo<?>[])new amo[] { agh.O }).a());
        this.a(afi.L, new bgx.a().a(afv.a).a("_wool").a());
        this.a(afi.cy, new bgx.a().a(afv.a).a("_carpet").a());
        this.a(afi.cu, new bgx.a().a(afv.a).a("_stained_hardened_clay").a());
        this.a(afi.cH, new bgx.a().a(afv.a).a("_stained_glass_pane").a());
        this.a(afi.cG, new bgx.a().a(afv.a).a("_stained_glass").a());
        this.a(afi.A, new bgx.a().a(aji.a).a());
        this.a(afi.cM, new bgx.a().a(aiz.a).a());
        this.a(afi.H, new bgx.a().a(akc.a).a());
        this.a(afi.C, new bgx.a().a((amo<?>[])new amo[] { afg.b }).a());
        this.a(afi.N, new bgx.a().a(afi.N.n()).a());
        this.a(afi.O, new bgx.a().a(afi.O.n()).a());
        this.a(afi.U, new bgx.a().a(akb.N).a("_slab").a());
        this.a(afi.cP, new bgx.a().a(aih.N).a("_slab").a());
        this.a(afi.be, new bgx.a().a(ahz.a).a("_monster_egg").a());
        this.a(afi.bf, new bgx.a().a(ajz.a).a());
        this.a(afi.z, new bgx.a().a((amo<?>[])new amo[] { agg.b }).a());
        this.a(afi.ct, new bgx.a().a((amo<?>[])new amo[] { agk.b }).a());
        this.a(afi.r, new bgx.a().a(ail.b).a("_log").a());
        this.a(afi.s, new bgx.a().a(aig.b).a("_log").a());
        this.a(afi.f, new bgx.a().a(aio.a).a("_planks").a());
        this.a(afi.g, new bgx.a().a(ajj.a).a("_sapling").a());
        this.a(afi.m, new bgx.a().a(ajh.a).a());
        this.a(afi.cp, new bgx.a().a((amo<?>[])new amo[] { ahn.b }).a());
        this.a(afi.ca, new bgx.a().a((amo<?>[])new amo[] { agx.a }).a());
        this.a(afi.cq, new bgu() {
            @Override
            protected bov a(final alz \u2603) {
                final aiw.a a = \u2603.b(aiw.a);
                switch (bgc$8.a[a.ordinal()]) {
                    default: {
                        return new bov("quartz_block", "normal");
                    }
                    case 2: {
                        return new bov("chiseled_quartz_block", "normal");
                    }
                    case 3: {
                        return new bov("quartz_column", "axis=y");
                    }
                    case 4: {
                        return new bov("quartz_column", "axis=x");
                    }
                    case 5: {
                        return new bov("quartz_column", "axis=z");
                    }
                }
            }
        });
        this.a(afi.I, new bgu() {
            @Override
            protected bov a(final alz \u2603) {
                return new bov("dead_bush", "normal");
            }
        });
        this.a(afi.bl, new bgu() {
            @Override
            protected bov a(final alz \u2603) {
                final Map<amo, Comparable> linkedHashMap = (Map<amo, Comparable>)Maps.newLinkedHashMap((Map<?, ?>)\u2603.b());
                if (\u2603.b((amo<Comparable>)ajx.b) != cq.b) {
                    linkedHashMap.remove(ajx.a);
                }
                return new bov(afh.c.c(\u2603.c()), this.a(linkedHashMap));
            }
        });
        this.a(afi.bm, new bgu() {
            @Override
            protected bov a(final alz \u2603) {
                final Map<amo, Comparable> linkedHashMap = (Map<amo, Comparable>)Maps.newLinkedHashMap((Map<?, ?>)\u2603.b());
                if (\u2603.b((amo<Comparable>)ajx.b) != cq.b) {
                    linkedHashMap.remove(ajx.a);
                }
                return new bov(afh.c.c(\u2603.c()), this.a(linkedHashMap));
            }
        });
        this.a(afi.d, new bgu() {
            @Override
            protected bov a(final alz \u2603) {
                final Map<amo, Comparable> linkedHashMap = (Map<amo, Comparable>)Maps.newLinkedHashMap((Map<?, ?>)\u2603.b());
                final String a = agf.a.a((agf.a)linkedHashMap.remove(agf.a));
                if (agf.a.c != \u2603.b(agf.a)) {
                    linkedHashMap.remove(agf.b);
                }
                return new bov(a, this.a(linkedHashMap));
            }
        });
        this.a(afi.T, new bgu() {
            @Override
            protected bov a(final alz \u2603) {
                final Map<amo, Comparable> linkedHashMap = (Map<amo, Comparable>)Maps.newLinkedHashMap((Map<?, ?>)\u2603.b());
                final String a = akb.N.a((akb.a)linkedHashMap.remove(akb.N));
                linkedHashMap.remove(akb.b);
                final String \u26032 = \u2603.b((amo<Boolean>)akb.b) ? "all" : "normal";
                return new bov(a + "_double_slab", \u26032);
            }
        });
        this.a(afi.cO, new bgu() {
            @Override
            protected bov a(final alz \u2603) {
                final Map<amo, Comparable> linkedHashMap = (Map<amo, Comparable>)Maps.newLinkedHashMap((Map<?, ?>)\u2603.b());
                final String a = aih.N.a((aih.a)linkedHashMap.remove(aih.N));
                linkedHashMap.remove(akb.b);
                final String \u26032 = \u2603.b((amo<Boolean>)aih.b) ? "all" : "normal";
                return new bov(a + "_double_slab", \u26032);
            }
        });
    }
}
