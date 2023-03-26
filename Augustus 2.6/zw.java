import com.google.common.collect.Maps;
import com.google.common.base.Function;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import java.util.Map;

// 
// Decompiled by Procyon v0.5.36
// 

public class zw
{
    public static final cx<jy, zw> e;
    private static final Map<afh, zw> a;
    protected static final UUID f;
    private yz b;
    protected static Random g;
    protected int h;
    private int c;
    protected boolean i;
    protected boolean j;
    private zw d;
    private String k;
    private String l;
    
    public zw() {
        this.h = 64;
    }
    
    public static int b(final zw \u2603) {
        return (\u2603 == null) ? 0 : zw.e.b(\u2603);
    }
    
    public static zw b(final int \u2603) {
        return zw.e.a(\u2603);
    }
    
    public static zw a(final afh \u2603) {
        return zw.a.get(\u2603);
    }
    
    public static zw d(final String \u2603) {
        final zw zw = zw.e.a(new jy(\u2603));
        if (zw == null) {
            try {
                return b(Integer.parseInt(\u2603));
            }
            catch (NumberFormatException ex) {}
        }
        return zw;
    }
    
    public boolean a(final dn \u2603) {
        return false;
    }
    
    public zw c(final int \u2603) {
        this.h = \u2603;
        return this;
    }
    
    public boolean a(final zx \u2603, final wn \u2603, final adm \u2603, final cj \u2603, final cq \u2603, final float \u2603, final float \u2603, final float \u2603) {
        return false;
    }
    
    public float a(final zx \u2603, final afh \u2603) {
        return 1.0f;
    }
    
    public zx a(final zx \u2603, final adm \u2603, final wn \u2603) {
        return \u2603;
    }
    
    public zx b(final zx \u2603, final adm \u2603, final wn \u2603) {
        return \u2603;
    }
    
    public int j() {
        return this.h;
    }
    
    public int a(final int \u2603) {
        return 0;
    }
    
    public boolean k() {
        return this.j;
    }
    
    protected zw a(final boolean \u2603) {
        this.j = \u2603;
        return this;
    }
    
    public int l() {
        return this.c;
    }
    
    protected zw d(final int \u2603) {
        this.c = \u2603;
        return this;
    }
    
    public boolean m() {
        return this.c > 0 && !this.j;
    }
    
    public boolean a(final zx \u2603, final pr \u2603, final pr \u2603) {
        return false;
    }
    
    public boolean a(final zx \u2603, final adm \u2603, final afh \u2603, final cj \u2603, final pr \u2603) {
        return false;
    }
    
    public boolean b(final afh \u2603) {
        return false;
    }
    
    public boolean a(final zx \u2603, final wn \u2603, final pr \u2603) {
        return false;
    }
    
    public zw n() {
        this.i = true;
        return this;
    }
    
    public boolean w_() {
        return this.i;
    }
    
    public boolean e() {
        return false;
    }
    
    public zw c(final String \u2603) {
        this.l = \u2603;
        return this;
    }
    
    public String k(final zx \u2603) {
        final String e_ = this.e_(\u2603);
        if (e_ == null) {
            return "";
        }
        return di.a(e_);
    }
    
    public String a() {
        return "item." + this.l;
    }
    
    public String e_(final zx \u2603) {
        return "item." + this.l;
    }
    
    public zw c(final zw \u2603) {
        this.d = \u2603;
        return this;
    }
    
    public boolean p() {
        return true;
    }
    
    public zw q() {
        return this.d;
    }
    
    public boolean r() {
        return this.d != null;
    }
    
    public int a(final zx \u2603, final int \u2603) {
        return 16777215;
    }
    
    public void a(final zx \u2603, final adm \u2603, final pk \u2603, final int \u2603, final boolean \u2603) {
    }
    
    public void d(final zx \u2603, final adm \u2603, final wn \u2603) {
    }
    
    public boolean f() {
        return false;
    }
    
    public aba e(final zx \u2603) {
        return aba.a;
    }
    
    public int d(final zx \u2603) {
        return 0;
    }
    
    public void a(final zx \u2603, final adm \u2603, final wn \u2603, final int \u2603) {
    }
    
    protected zw e(final String \u2603) {
        this.k = \u2603;
        return this;
    }
    
    public String j(final zx \u2603) {
        return this.k;
    }
    
    public boolean l(final zx \u2603) {
        return this.j(\u2603) != null;
    }
    
    public void a(final zx \u2603, final wn \u2603, final List<String> \u2603, final boolean \u2603) {
    }
    
    public String a(final zx \u2603) {
        return ("" + di.a(this.k(\u2603) + ".name")).trim();
    }
    
    public boolean f(final zx \u2603) {
        return \u2603.w();
    }
    
    public aaj g(final zx \u2603) {
        if (\u2603.w()) {
            return aaj.c;
        }
        return aaj.a;
    }
    
    public boolean f_(final zx \u2603) {
        return this.j() == 1 && this.m();
    }
    
    protected auh a(final adm \u2603, final wn \u2603, final boolean \u2603) {
        final float z = \u2603.z;
        final float y = \u2603.y;
        final double s = \u2603.s;
        final double \u26032 = \u2603.t + \u2603.aS();
        final double u = \u2603.u;
        final aui \u26033 = new aui(s, \u26032, u);
        final float b = ns.b(-y * 0.017453292f - 3.1415927f);
        final float a = ns.a(-y * 0.017453292f - 3.1415927f);
        final float n = -ns.b(-z * 0.017453292f);
        final float a2 = ns.a(-z * 0.017453292f);
        final float n2 = a * n;
        final float n3 = a2;
        final float n4 = b * n;
        final double n5 = 5.0;
        final aui b2 = \u26033.b(n2 * n5, n3 * n5, n4 * n5);
        return \u2603.a(\u26033, b2, \u2603, !\u2603, false);
    }
    
    public int b() {
        return 0;
    }
    
    public void a(final zw \u2603, final yz \u2603, final List<zx> \u2603) {
        \u2603.add(new zx(\u2603, 1, 0));
    }
    
    public yz c() {
        return this.b;
    }
    
    public zw a(final yz \u2603) {
        this.b = \u2603;
        return this;
    }
    
    public boolean s() {
        return false;
    }
    
    public boolean a(final zx \u2603, final zx \u2603) {
        return false;
    }
    
    public Multimap<String, qd> i() {
        return (Multimap<String, qd>)HashMultimap.create();
    }
    
    public static void t() {
        a(afi.b, new aae(afi.b, afi.b, new Function<zx, String>() {
            public String a(final zx \u2603) {
                return ajy.a.a(\u2603.i()).d();
            }
        }).b("stone"));
        a(afi.c, new aaz(afi.c, false));
        a(afi.d, new aae(afi.d, afi.d, new Function<zx, String>() {
            public String a(final zx \u2603) {
                return agf.a.a(\u2603.i()).c();
            }
        }).b("dirt"));
        c(afi.e);
        a(afi.f, new aae(afi.f, afi.f, new Function<zx, String>() {
            public String a(final zx \u2603) {
                return aio.a.a(\u2603.i()).d();
            }
        }).b("wood"));
        a(afi.g, new aae(afi.g, afi.g, new Function<zx, String>() {
            public String a(final zx \u2603) {
                return aio.a.a(\u2603.i()).d();
            }
        }).b("sapling"));
        c(afi.h);
        a(afi.m, new aae(afi.m, afi.m, new Function<zx, String>() {
            public String a(final zx \u2603) {
                return ajh.a.a(\u2603.i()).d();
            }
        }).b("sand"));
        c(afi.n);
        c(afi.o);
        c(afi.p);
        c(afi.q);
        a(afi.r, new aae(afi.r, afi.r, new Function<zx, String>() {
            public String a(final zx \u2603) {
                return aio.a.a(\u2603.i()).d();
            }
        }).b("log"));
        a(afi.s, new aae(afi.s, afi.s, new Function<zx, String>() {
            public String a(final zx \u2603) {
                return aio.a.a(\u2603.i() + 4).d();
            }
        }).b("log"));
        a(afi.t, new aaa(afi.t).b("leaves"));
        a(afi.u, new aaa(afi.u).b("leaves"));
        a(afi.v, new aae(afi.v, afi.v, new Function<zx, String>() {
            public String a(final zx \u2603) {
                return ((\u2603.i() & 0x1) == 0x1) ? "wet" : "dry";
            }
        }).b("sponge"));
        c(afi.w);
        c(afi.x);
        c(afi.y);
        c(afi.z);
        a(afi.A, new aae(afi.A, afi.A, new Function<zx, String>() {
            public String a(final zx \u2603) {
                return aji.a.a(\u2603.i()).c();
            }
        }).b("sandStone"));
        c(afi.B);
        c(afi.D);
        c(afi.E);
        a(afi.F, new aah(afi.F));
        c(afi.G);
        a(afi.H, new aaz(afi.H, true).a(new String[] { "shrub", "grass", "fern" }));
        c(afi.I);
        a(afi.J, new aah(afi.J));
        a(afi.L, new zf(afi.L).b("cloth"));
        a(afi.N, new aae(afi.N, afi.N, new Function<zx, String>() {
            public String a(final zx \u2603) {
                return agw.a.a(agw.b.a, \u2603.i()).d();
            }
        }).b("flower"));
        a(afi.O, new aae(afi.O, afi.O, new Function<zx, String>() {
            public String a(final zx \u2603) {
                return agw.a.a(agw.b.b, \u2603.i()).d();
            }
        }).b("rose"));
        c(afi.P);
        c(afi.Q);
        c(afi.R);
        c(afi.S);
        a(afi.U, new aau(afi.U, afi.U, afi.T).b("stoneSlab"));
        c(afi.V);
        c(afi.W);
        c(afi.X);
        c(afi.Y);
        c(afi.Z);
        c(afi.aa);
        c(afi.ac);
        c(afi.ad);
        c(afi.ae);
        c(afi.ag);
        c(afi.ah);
        c(afi.ai);
        c(afi.ak);
        c(afi.al);
        c(afi.am);
        c(afi.au);
        c(afi.av);
        c(afi.aw);
        c(afi.ay);
        c(afi.az);
        c(afi.aB);
        c(afi.aC);
        c(afi.aF);
        c(afi.aG);
        a(afi.aH, new aav(afi.aH));
        c(afi.aI);
        c(afi.aJ);
        c(afi.aK);
        c(afi.aL);
        c(afi.aN);
        c(afi.aO);
        c(afi.aP);
        c(afi.aQ);
        c(afi.aR);
        c(afi.aS);
        c(afi.aT);
        c(afi.aU);
        c(afi.aV);
        c(afi.aW);
        c(afi.aX);
        c(afi.aZ);
        c(afi.bd);
        a(afi.be, new aae(afi.be, afi.be, new Function<zx, String>() {
            public String a(final zx \u2603) {
                return ahz.a.a(\u2603.i()).c();
            }
        }).b("monsterStoneEgg"));
        a(afi.bf, new aae(afi.bf, afi.bf, new Function<zx, String>() {
            public String a(final zx \u2603) {
                return ajz.a.a(\u2603.i()).c();
            }
        }).b("stonebricksmooth"));
        c(afi.bg);
        c(afi.bh);
        c(afi.bi);
        c(afi.bj);
        c(afi.bk);
        a(afi.bn, new aaz(afi.bn, false));
        c(afi.bo);
        c(afi.bp);
        c(afi.bq);
        c(afi.br);
        c(afi.bs);
        c(afi.bt);
        c(afi.bu);
        c(afi.bv);
        c(afi.bw);
        a(afi.bx, new abb(afi.bx));
        c(afi.by);
        c(afi.bz);
        c(afi.bA);
        c(afi.bC);
        c(afi.bG);
        c(afi.bH);
        c(afi.bI);
        c(afi.bJ);
        a(afi.bM, new aau(afi.bM, afi.bM, afi.bL).b("woodSlab"));
        c(afi.bO);
        c(afi.bP);
        c(afi.bQ);
        c(afi.bR);
        c(afi.bT);
        c(afi.bU);
        c(afi.bV);
        c(afi.bW);
        c(afi.bX);
        c(afi.bY);
        a(afi.bZ, new aae(afi.bZ, afi.bZ, new Function<zx, String>() {
            public String a(final zx \u2603) {
                return akl.a.a(\u2603.i()).c();
            }
        }).b("cobbleWall"));
        c(afi.cd);
        a(afi.cf, new yi(afi.cf).b("anvil"));
        c(afi.cg);
        c(afi.ch);
        c(afi.ci);
        c(afi.cl);
        c(afi.cn);
        c(afi.co);
        c(afi.cp);
        a(afi.cq, new aae(afi.cq, afi.cq, new String[] { "default", "chiseled", "lines" }).b("quartzBlock"));
        c(afi.cr);
        c(afi.cs);
        c(afi.ct);
        a(afi.cu, new zf(afi.cu).b("clayHardenedStained"));
        c(afi.cv);
        c(afi.cw);
        c(afi.cx);
        a(afi.cy, new zf(afi.cy).b("woolCarpet"));
        c(afi.cz);
        c(afi.cA);
        c(afi.cB);
        c(afi.cC);
        c(afi.cD);
        c(afi.cE);
        a(afi.cF, new zc(afi.cF, afi.cF, new Function<zx, String>() {
            public String a(final zx \u2603) {
                return agi.b.a(\u2603.i()).c();
            }
        }).b("doublePlant"));
        a(afi.cG, new zf(afi.cG).b("stainedGlass"));
        a(afi.cH, new zf(afi.cH).b("stainedGlassPane"));
        a(afi.cI, new aae(afi.cI, afi.cI, new Function<zx, String>() {
            public String a(final zx \u2603) {
                return aiu.a.a(\u2603.i()).c();
            }
        }).b("prismarine"));
        c(afi.cJ);
        a(afi.cM, new aae(afi.cM, afi.cM, new Function<zx, String>() {
            public String a(final zx \u2603) {
                return aiz.a.a(\u2603.i()).c();
            }
        }).b("redSandStone"));
        c(afi.cN);
        a(afi.cP, new aau(afi.cP, afi.cP, afi.cO).b("stoneSlab2"));
        a(256, "iron_shovel", new aaq(zw.a.c).c("shovelIron"));
        a(257, "iron_pickaxe", new aag(zw.a.c).c("pickaxeIron"));
        a(258, "iron_axe", new yl(zw.a.c).c("hatchetIron"));
        a(259, "flint_and_steel", new zr().c("flintAndSteel"));
        a(260, "apple", new zs(4, 0.3f, false).c("apple"));
        a(261, "bow", new yt().c("bow"));
        a(262, "arrow", new zw().c("arrow").a(yz.j));
        a(263, "coal", new yx().c("coal"));
        a(264, "diamond", new zw().c("diamond").a(yz.l));
        a(265, "iron_ingot", new zw().c("ingotIron").a(yz.l));
        a(266, "gold_ingot", new zw().c("ingotGold").a(yz.l));
        a(267, "iron_sword", new aay(zw.a.c).c("swordIron"));
        a(268, "wooden_sword", new aay(zw.a.a).c("swordWood"));
        a(269, "wooden_shovel", new aaq(zw.a.a).c("shovelWood"));
        a(270, "wooden_pickaxe", new aag(zw.a.a).c("pickaxeWood"));
        a(271, "wooden_axe", new yl(zw.a.a).c("hatchetWood"));
        a(272, "stone_sword", new aay(zw.a.b).c("swordStone"));
        a(273, "stone_shovel", new aaq(zw.a.b).c("shovelStone"));
        a(274, "stone_pickaxe", new aag(zw.a.b).c("pickaxeStone"));
        a(275, "stone_axe", new yl(zw.a.b).c("hatchetStone"));
        a(276, "diamond_sword", new aay(zw.a.d).c("swordDiamond"));
        a(277, "diamond_shovel", new aaq(zw.a.d).c("shovelDiamond"));
        a(278, "diamond_pickaxe", new aag(zw.a.d).c("pickaxeDiamond"));
        a(279, "diamond_axe", new yl(zw.a.d).c("hatchetDiamond"));
        a(280, "stick", new zw().n().c("stick").a(yz.l));
        a(281, "bowl", new zw().c("bowl").a(yz.l));
        a(282, "mushroom_stew", new yu(6).c("mushroomStew"));
        a(283, "golden_sword", new aay(zw.a.e).c("swordGold"));
        a(284, "golden_shovel", new aaq(zw.a.e).c("shovelGold"));
        a(285, "golden_pickaxe", new aag(zw.a.e).c("pickaxeGold"));
        a(286, "golden_axe", new yl(zw.a.e).c("hatchetGold"));
        a(287, "string", new yp(afi.bS).c("string").a(yz.l));
        a(288, "feather", new zw().c("feather").a(yz.l));
        a(289, "gunpowder", new zw().c("sulphur").e(abe.k).a(yz.l));
        a(290, "wooden_hoe", new zv(zw.a.a).c("hoeWood"));
        a(291, "stone_hoe", new zv(zw.a.b).c("hoeStone"));
        a(292, "iron_hoe", new zv(zw.a.c).c("hoeIron"));
        a(293, "diamond_hoe", new zv(zw.a.d).c("hoeDiamond"));
        a(294, "golden_hoe", new zv(zw.a.e).c("hoeGold"));
        a(295, "wheat_seeds", new aao(afi.aj, afi.ak).c("seeds"));
        a(296, "wheat", new zw().c("wheat").a(yz.l));
        a(297, "bread", new zs(5, 0.6f, false).c("bread"));
        a(298, "leather_helmet", new yj(yj.a.a, 0, 0).c("helmetCloth"));
        a(299, "leather_chestplate", new yj(yj.a.a, 0, 1).c("chestplateCloth"));
        a(300, "leather_leggings", new yj(yj.a.a, 0, 2).c("leggingsCloth"));
        a(301, "leather_boots", new yj(yj.a.a, 0, 3).c("bootsCloth"));
        a(302, "chainmail_helmet", new yj(yj.a.b, 1, 0).c("helmetChain"));
        a(303, "chainmail_chestplate", new yj(yj.a.b, 1, 1).c("chestplateChain"));
        a(304, "chainmail_leggings", new yj(yj.a.b, 1, 2).c("leggingsChain"));
        a(305, "chainmail_boots", new yj(yj.a.b, 1, 3).c("bootsChain"));
        a(306, "iron_helmet", new yj(yj.a.c, 2, 0).c("helmetIron"));
        a(307, "iron_chestplate", new yj(yj.a.c, 2, 1).c("chestplateIron"));
        a(308, "iron_leggings", new yj(yj.a.c, 2, 2).c("leggingsIron"));
        a(309, "iron_boots", new yj(yj.a.c, 2, 3).c("bootsIron"));
        a(310, "diamond_helmet", new yj(yj.a.e, 3, 0).c("helmetDiamond"));
        a(311, "diamond_chestplate", new yj(yj.a.e, 3, 1).c("chestplateDiamond"));
        a(312, "diamond_leggings", new yj(yj.a.e, 3, 2).c("leggingsDiamond"));
        a(313, "diamond_boots", new yj(yj.a.e, 3, 3).c("bootsDiamond"));
        a(314, "golden_helmet", new yj(yj.a.d, 4, 0).c("helmetGold"));
        a(315, "golden_chestplate", new yj(yj.a.d, 4, 1).c("chestplateGold"));
        a(316, "golden_leggings", new yj(yj.a.d, 4, 2).c("leggingsGold"));
        a(317, "golden_boots", new yj(yj.a.d, 4, 3).c("bootsGold"));
        a(318, "flint", new zw().c("flint").a(yz.l));
        a(319, "porkchop", new zs(3, 0.3f, true).c("porkchopRaw"));
        a(320, "cooked_porkchop", new zs(8, 0.8f, true).c("porkchopCooked"));
        a(321, "painting", new zu(uq.class).c("painting"));
        a(322, "golden_apple", new zt(4, 1.2f, false).h().a(pe.l.H, 5, 1, 1.0f).c("appleGold"));
        a(323, "sign", new aar().c("sign"));
        a(324, "wooden_door", new zb(afi.ao).c("doorOak"));
        final zw c = new yv(afi.a).c("bucket").c(16);
        a(325, "bucket", c);
        a(326, "water_bucket", new yv(afi.i).c("bucketWater").c(c));
        a(327, "lava_bucket", new yv(afi.k).c("bucketLava").c(c));
        a(328, "minecart", new aad(va.a.a).c("minecart"));
        a(329, "saddle", new aam().c("saddle"));
        a(330, "iron_door", new zb(afi.aA).c("doorIron"));
        a(331, "redstone", new aal().c("redstone").e(abe.i));
        a(332, "snowball", new aaw().c("snowball"));
        a(333, "boat", new yq().c("boat"));
        a(334, "leather", new zw().c("leather").a(yz.l));
        a(335, "milk_bucket", new aac().c("milk").c(c));
        a(336, "brick", new zw().c("brick").a(yz.l));
        a(337, "clay_ball", new zw().c("clay").a(yz.l));
        a(338, "reeds", new yp(afi.aM).c("reeds").a(yz.l));
        a(339, "paper", new zw().c("paper").a(yz.f));
        a(340, "book", new yr().c("book").a(yz.f));
        a(341, "slime_ball", new zw().c("slimeball").a(yz.f));
        a(342, "chest_minecart", new aad(va.a.b).c("minecartChest"));
        a(343, "furnace_minecart", new aad(va.a.c).c("minecartFurnace"));
        a(344, "egg", new zg().c("egg"));
        a(345, "compass", new zw().c("compass").a(yz.i));
        a(346, "fishing_rod", new zq().c("fishingRod"));
        a(347, "clock", new zw().c("clock").a(yz.i));
        a(348, "glowstone_dust", new zw().c("yellowDust").e(abe.j).a(yz.l));
        a(349, "fish", new zp(false).c("fish").a(true));
        a(350, "cooked_fish", new zp(true).c("fish").a(true));
        a(351, "dye", new ze().c("dyePowder"));
        a(352, "bone", new zw().c("bone").n().a(yz.f));
        a(353, "sugar", new zw().c("sugar").e(abe.b).a(yz.l));
        a(354, "cake", new yp(afi.ba).c(1).c("cake").a(yz.h));
        a(355, "bed", new yn().c(1).c("bed"));
        a(356, "repeater", new yp(afi.bb).c("diode").a(yz.d));
        a(357, "cookie", new zs(2, 0.1f, false).c("cookie"));
        a(358, "filled_map", new aab().c("map"));
        a(359, "shears", new aap().c("shears"));
        a(360, "melon", new zs(2, 0.3f, false).c("melon"));
        a(361, "pumpkin_seeds", new aao(afi.bl, afi.ak).c("seeds_pumpkin"));
        a(362, "melon_seeds", new aao(afi.bm, afi.ak).c("seeds_melon"));
        a(363, "beef", new zs(3, 0.3f, true).c("beefRaw"));
        a(364, "cooked_beef", new zs(8, 0.8f, true).c("beefCooked"));
        a(365, "chicken", new zs(2, 0.3f, true).a(pe.s.H, 30, 0, 0.3f).c("chickenRaw"));
        a(366, "cooked_chicken", new zs(6, 0.6f, true).c("chickenCooked"));
        a(367, "rotten_flesh", new zs(4, 0.1f, true).a(pe.s.H, 30, 0, 0.8f).c("rottenFlesh"));
        a(368, "ender_pearl", new zk().c("enderPearl"));
        a(369, "blaze_rod", new zw().c("blazeRod").a(yz.l).n());
        a(370, "ghast_tear", new zw().c("ghastTear").e(abe.c).a(yz.k));
        a(371, "gold_nugget", new zw().c("goldNugget").a(yz.l));
        a(372, "nether_wart", new aao(afi.bB, afi.aW).c("netherStalkSeeds").e("+4"));
        a(373, "potion", new aai().c("potion"));
        a(374, "glass_bottle", new ys().c("glassBottle"));
        a(375, "spider_eye", new zs(2, 0.8f, false).a(pe.u.H, 5, 0, 1.0f).c("spiderEye").e(abe.d));
        a(376, "fermented_spider_eye", new zw().c("fermentedSpiderEye").e(abe.e).a(yz.k));
        a(377, "blaze_powder", new zw().c("blazePowder").e(abe.g).a(yz.k));
        a(378, "magma_cream", new zw().c("magmaCream").e(abe.h).a(yz.k));
        a(379, "brewing_stand", new yp(afi.bD).c("brewingStand").a(yz.k));
        a(380, "cauldron", new yp(afi.bE).c("cauldron").a(yz.k));
        a(381, "ender_eye", new zj().c("eyeOfEnder"));
        a(382, "speckled_melon", new zw().c("speckledMelon").e(abe.f).a(yz.k));
        a(383, "spawn_egg", new aax().c("monsterPlacer"));
        a(384, "experience_bottle", new zl().c("expBottle"));
        a(385, "fire_charge", new zm().c("fireball"));
        a(386, "writable_book", new abc().c("writingBook").a(yz.f));
        a(387, "written_book", new abd().c("writtenBook").c(16));
        a(388, "emerald", new zw().c("emerald").a(yz.l));
        a(389, "item_frame", new zu(uo.class).c("frame"));
        a(390, "flower_pot", new yp(afi.ca).c("flowerPot").a(yz.c));
        a(391, "carrot", new aan(3, 0.6f, afi.cb, afi.ak).c("carrots"));
        a(392, "potato", new aan(1, 0.3f, afi.cc, afi.ak).c("potato"));
        a(393, "baked_potato", new zs(5, 0.6f, false).c("potatoBaked"));
        a(394, "poisonous_potato", new zs(2, 0.3f, false).a(pe.u.H, 5, 0, 0.6f).c("potatoPoisonous"));
        a(395, "map", new zh().c("emptyMap"));
        a(396, "golden_carrot", new zs(6, 1.2f, false).c("carrotGolden").e(abe.l).a(yz.k));
        a(397, "skull", new aat().c("skull"));
        a(398, "carrot_on_a_stick", new yw().c("carrotOnAStick"));
        a(399, "nether_star", new aas().c("netherStar").a(yz.l));
        a(400, "pumpkin_pie", new zs(8, 0.3f, false).c("pumpkinPie").a(yz.h));
        a(401, "fireworks", new zo().c("fireworks"));
        a(402, "firework_charge", new zn().c("fireworksCharge").a(yz.f));
        a(403, "enchanted_book", new zi().c(1).c("enchantedBook"));
        a(404, "comparator", new yp(afi.cj).c("comparator").a(yz.d));
        a(405, "netherbrick", new zw().c("netherbrick").a(yz.l));
        a(406, "quartz", new zw().c("netherquartz").a(yz.l));
        a(407, "tnt_minecart", new aad(va.a.d).c("minecartTnt"));
        a(408, "hopper_minecart", new aad(va.a.f).c("minecartHopper"));
        a(409, "prismarine_shard", new zw().c("prismarineShard").a(yz.l));
        a(410, "prismarine_crystals", new zw().c("prismarineCrystals").a(yz.l));
        a(411, "rabbit", new zs(3, 0.3f, true).c("rabbitRaw"));
        a(412, "cooked_rabbit", new zs(5, 0.6f, true).c("rabbitCooked"));
        a(413, "rabbit_stew", new yu(10).c("rabbitStew"));
        a(414, "rabbit_foot", new zw().c("rabbitFoot").e(abe.n).a(yz.k));
        a(415, "rabbit_hide", new zw().c("rabbitHide").a(yz.l));
        a(416, "armor_stand", new yk().c("armorStand").c(16));
        a(417, "iron_horse_armor", new zw().c("horsearmormetal").c(1).a(yz.f));
        a(418, "golden_horse_armor", new zw().c("horsearmorgold").c(1).a(yz.f));
        a(419, "diamond_horse_armor", new zw().c("horsearmordiamond").c(1).a(yz.f));
        a(420, "lead", new zz().c("leash"));
        a(421, "name_tag", new aaf().c("nameTag"));
        a(422, "command_block_minecart", new aad(va.a.g).c("minecartCommandBlock").a((yz)null));
        a(423, "mutton", new zs(2, 0.3f, true).c("muttonRaw"));
        a(424, "cooked_mutton", new zs(6, 0.8f, true).c("muttonCooked"));
        a(425, "banner", new ym().b("banner"));
        a(427, "spruce_door", new zb(afi.ap).c("doorSpruce"));
        a(428, "birch_door", new zb(afi.aq).c("doorBirch"));
        a(429, "jungle_door", new zb(afi.ar).c("doorJungle"));
        a(430, "acacia_door", new zb(afi.as).c("doorAcacia"));
        a(431, "dark_oak_door", new zb(afi.at).c("doorDarkOak"));
        a(2256, "record_13", new aak("13").c("record"));
        a(2257, "record_cat", new aak("cat").c("record"));
        a(2258, "record_blocks", new aak("blocks").c("record"));
        a(2259, "record_chirp", new aak("chirp").c("record"));
        a(2260, "record_far", new aak("far").c("record"));
        a(2261, "record_mall", new aak("mall").c("record"));
        a(2262, "record_mellohi", new aak("mellohi").c("record"));
        a(2263, "record_stal", new aak("stal").c("record"));
        a(2264, "record_strad", new aak("strad").c("record"));
        a(2265, "record_ward", new aak("ward").c("record"));
        a(2266, "record_11", new aak("11").c("record"));
        a(2267, "record_wait", new aak("wait").c("record"));
    }
    
    private static void c(final afh \u2603) {
        a(\u2603, new yo(\u2603));
    }
    
    protected static void a(final afh \u2603, final zw \u2603) {
        a(afh.a(\u2603), afh.c.c(\u2603), \u2603);
        zw.a.put(\u2603, \u2603);
    }
    
    private static void a(final int \u2603, final String \u2603, final zw \u2603) {
        a(\u2603, new jy(\u2603), \u2603);
    }
    
    private static void a(final int \u2603, final jy \u2603, final zw \u2603) {
        zw.e.a(\u2603, \u2603, \u2603);
    }
    
    static {
        e = new cx<jy, zw>();
        a = Maps.newHashMap();
        f = UUID.fromString("CB3F55D3-645C-4F38-A497-9C13A33DB5CF");
        zw.g = new Random();
    }
    
    public enum a
    {
        a(0, 59, 2.0f, 0.0f, 15), 
        b(1, 131, 4.0f, 1.0f, 5), 
        c(2, 250, 6.0f, 2.0f, 14), 
        d(3, 1561, 8.0f, 3.0f, 10), 
        e(0, 32, 12.0f, 0.0f, 22);
        
        private final int f;
        private final int g;
        private final float h;
        private final float i;
        private final int j;
        
        private a(final int \u2603, final int \u2603, final float \u2603, final float \u2603, final int \u2603) {
            this.f = \u2603;
            this.g = \u2603;
            this.h = \u2603;
            this.i = \u2603;
            this.j = \u2603;
        }
        
        public int a() {
            return this.g;
        }
        
        public float b() {
            return this.h;
        }
        
        public float c() {
            return this.i;
        }
        
        public int d() {
            return this.f;
        }
        
        public int e() {
            return this.j;
        }
        
        public zw f() {
            if (this == a.a) {
                return zw.a(afi.f);
            }
            if (this == a.b) {
                return zw.a(afi.e);
            }
            if (this == a.e) {
                return zy.k;
            }
            if (this == a.c) {
                return zy.j;
            }
            if (this == a.d) {
                return zy.i;
            }
            return null;
        }
    }
}
