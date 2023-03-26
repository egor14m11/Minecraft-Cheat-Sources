import com.google.common.collect.Lists;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class mr
{
    public static int a;
    public static int b;
    public static int c;
    public static int d;
    public static List<mq> e;
    public static mq f;
    public static mq g;
    public static mq h;
    public static mq i;
    public static mq j;
    public static mq k;
    public static mq l;
    public static mq m;
    public static mq n;
    public static mq o;
    public static mq p;
    public static mq q;
    public static mq r;
    public static mq s;
    public static mq t;
    public static mq u;
    public static mq v;
    public static mq w;
    public static mq x;
    public static mq y;
    public static mq z;
    public static mq A;
    public static mq B;
    public static mq C;
    public static mq D;
    public static mq E;
    public static mq F;
    public static mq G;
    public static mq H;
    public static mq I;
    public static mq J;
    public static mq K;
    public static mq L;
    public static mq M;
    
    public static void a() {
    }
    
    static {
        mr.e = (List<mq>)Lists.newArrayList();
        mr.f = new mq("achievement.openInventory", "openInventory", 0, 0, zy.aL, null).a().c();
        mr.g = new mq("achievement.mineWood", "mineWood", 2, 1, afi.r, mr.f).c();
        mr.h = new mq("achievement.buildWorkBench", "buildWorkBench", 4, -1, afi.ai, mr.g).c();
        mr.i = new mq("achievement.buildPickaxe", "buildPickaxe", 4, 2, zy.o, mr.h).c();
        mr.j = new mq("achievement.buildFurnace", "buildFurnace", 3, 4, afi.al, mr.i).c();
        mr.k = new mq("achievement.acquireIron", "acquireIron", 1, 4, zy.j, mr.j).c();
        mr.l = new mq("achievement.buildHoe", "buildHoe", 2, -3, zy.I, mr.h).c();
        mr.m = new mq("achievement.makeBread", "makeBread", -1, -3, zy.P, mr.l).c();
        mr.n = new mq("achievement.bakeCake", "bakeCake", 0, -5, zy.aZ, mr.l).c();
        mr.o = new mq("achievement.buildBetterPickaxe", "buildBetterPickaxe", 6, 2, zy.s, mr.i).c();
        mr.p = new mq("achievement.cookFish", "cookFish", 2, 6, zy.aV, mr.j).c();
        mr.q = new mq("achievement.onARail", "onARail", 2, 3, afi.av, mr.k).b().c();
        mr.r = new mq("achievement.buildSword", "buildSword", 6, -1, zy.m, mr.h).c();
        mr.s = new mq("achievement.killEnemy", "killEnemy", 8, -1, zy.aX, mr.r).c();
        mr.t = new mq("achievement.killCow", "killCow", 7, -3, zy.aF, mr.r).c();
        mr.u = new mq("achievement.flyPig", "flyPig", 9, -3, zy.aA, mr.t).b().c();
        mr.v = new mq("achievement.snipeSkeleton", "snipeSkeleton", 7, 0, zy.f, mr.s).b().c();
        mr.w = new mq("achievement.diamonds", "diamonds", -1, 5, afi.ag, mr.k).c();
        mr.x = new mq("achievement.diamondsToYou", "diamondsToYou", -1, 2, zy.i, mr.w).c();
        mr.y = new mq("achievement.portal", "portal", -1, 7, afi.Z, mr.w).c();
        mr.z = new mq("achievement.ghast", "ghast", -4, 8, zy.bw, mr.y).b().c();
        mr.A = new mq("achievement.blazeRod", "blazeRod", 0, 9, zy.bv, mr.y).c();
        mr.B = new mq("achievement.potion", "potion", 2, 8, zy.bz, mr.A).c();
        mr.C = new mq("achievement.theEnd", "theEnd", 3, 10, zy.bH, mr.A).b().c();
        mr.D = new mq("achievement.theEnd2", "theEnd2", 4, 13, afi.bI, mr.C).b().c();
        mr.E = new mq("achievement.enchantments", "enchantments", -4, 4, afi.bC, mr.w).c();
        mr.F = new mq("achievement.overkill", "overkill", -4, 1, zy.u, mr.E).b().c();
        mr.G = new mq("achievement.bookcase", "bookcase", -3, 6, afi.X, mr.E).c();
        mr.H = new mq("achievement.breedCow", "breedCow", 7, -5, zy.O, mr.t).c();
        mr.I = new mq("achievement.spawnWither", "spawnWither", 7, 12, new zx(zy.bX, 1, 1), mr.D).c();
        mr.J = new mq("achievement.killWither", "killWither", 7, 10, zy.bZ, mr.I).c();
        mr.K = new mq("achievement.fullBeacon", "fullBeacon", 7, 8, afi.bY, mr.J).b().c();
        mr.L = new mq("achievement.exploreAllBiomes", "exploreAllBiomes", 4, 8, zy.af, mr.C).a(nc.class).b().c();
        mr.M = new mq("achievement.overpowered", "overpowered", 6, 4, new zx(zy.ao, 1, 1), mr.o).b().c();
    }
}
