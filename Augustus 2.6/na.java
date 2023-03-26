import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.Set;
import com.google.common.collect.Sets;
import java.util.List;
import java.util.Map;

// 
// Decompiled by Procyon v0.5.36
// 

public class na
{
    protected static Map<String, mw> a;
    public static List<mw> b;
    public static List<mw> c;
    public static List<mu> d;
    public static List<mu> e;
    public static mw f;
    public static mw g;
    public static mw h;
    public static mw i;
    public static mw j;
    public static mw k;
    public static mw l;
    public static mw m;
    public static mw n;
    public static mw o;
    public static mw p;
    public static mw q;
    public static mw r;
    public static mw s;
    public static mw t;
    public static mw u;
    public static mw v;
    public static mw w;
    public static mw x;
    public static mw y;
    public static mw z;
    public static mw A;
    public static mw B;
    public static mw C;
    public static mw D;
    public static mw E;
    public static mw F;
    public static mw G;
    public static mw H;
    public static mw I;
    public static mw J;
    public static mw K;
    public static mw L;
    public static mw M;
    public static mw N;
    public static mw O;
    public static mw P;
    public static mw Q;
    public static mw R;
    public static mw S;
    public static mw T;
    public static mw U;
    public static mw V;
    public static mw W;
    public static mw X;
    public static mw Y;
    public static mw Z;
    public static mw aa;
    public static final mw[] ab;
    public static final mw[] ac;
    public static final mw[] ad;
    public static final mw[] ae;
    
    public static void a() {
        c();
        d();
        e();
        b();
        mr.a();
        pm.a();
    }
    
    private static void b() {
        final Set<zw> hashSet = (Set<zw>)Sets.newHashSet();
        for (final abs abs : abt.a().b()) {
            if (abs.b() == null) {
                continue;
            }
            hashSet.add(abs.b().b());
        }
        for (final zx zx : abo.a().b().values()) {
            hashSet.add(zx.b());
        }
        for (final zw zw : hashSet) {
            if (zw == null) {
                continue;
            }
            final int b = zw.b(zw);
            final String a = a(zw);
            if (a == null) {
                continue;
            }
            na.ac[b] = new mu("stat.craftItem.", a, new fb("stat.craftItem", new Object[] { new zx(zw).C() }), zw).h();
        }
        a(na.ac);
    }
    
    private static void c() {
        for (final afh \u2603 : afh.c) {
            final zw a = zw.a(\u2603);
            if (a == null) {
                continue;
            }
            final int a2 = afh.a(\u2603);
            final String a3 = a(a);
            if (a3 == null || !\u2603.J()) {
                continue;
            }
            na.ab[a2] = new mu("stat.mineBlock.", a3, new fb("stat.mineBlock", new Object[] { new zx(\u2603).C() }), a).h();
            na.e.add((mu)na.ab[a2]);
        }
        a(na.ab);
    }
    
    private static void d() {
        for (final zw zw : zw.e) {
            if (zw == null) {
                continue;
            }
            final int b = zw.b(zw);
            final String a = a(zw);
            if (a == null) {
                continue;
            }
            na.ad[b] = new mu("stat.useItem.", a, new fb("stat.useItem", new Object[] { new zx(zw).C() }), zw).h();
            if (zw instanceof yo) {
                continue;
            }
            na.d.add((mu)na.ad[b]);
        }
        a(na.ad);
    }
    
    private static void e() {
        for (final zw zw : zw.e) {
            if (zw == null) {
                continue;
            }
            final int b = zw.b(zw);
            final String a = a(zw);
            if (a == null || !zw.m()) {
                continue;
            }
            na.ae[b] = new mu("stat.breakItem.", a, new fb("stat.breakItem", new Object[] { new zx(zw).C() }), zw).h();
        }
        a(na.ae);
    }
    
    private static String a(final zw \u2603) {
        final jy jy = zw.e.c(\u2603);
        if (jy != null) {
            return jy.toString().replace(':', '.');
        }
        return null;
    }
    
    private static void a(final mw[] \u2603) {
        a(\u2603, afi.j, afi.i);
        a(\u2603, afi.l, afi.k);
        a(\u2603, afi.aZ, afi.aU);
        a(\u2603, afi.am, afi.al);
        a(\u2603, afi.aD, afi.aC);
        a(\u2603, afi.bc, afi.bb);
        a(\u2603, afi.ck, afi.cj);
        a(\u2603, afi.aF, afi.aE);
        a(\u2603, afi.bK, afi.bJ);
        a(\u2603, afi.T, afi.U);
        a(\u2603, afi.bL, afi.bM);
        a(\u2603, afi.cO, afi.cP);
        a(\u2603, afi.c, afi.d);
        a(\u2603, afi.ak, afi.d);
    }
    
    private static void a(final mw[] \u2603, final afh \u2603, final afh \u2603) {
        final int a = afh.a(\u2603);
        final int a2 = afh.a(\u2603);
        if (\u2603[a] != null && \u2603[a2] == null) {
            \u2603[a2] = \u2603[a];
            return;
        }
        na.b.remove(\u2603[a]);
        na.e.remove(\u2603[a]);
        na.c.remove(\u2603[a]);
        \u2603[a] = \u2603[a2];
    }
    
    public static mw a(final pm.a \u2603) {
        final String b = pm.b(\u2603.a);
        if (b == null) {
            return null;
        }
        return new mw("stat.killEntity." + b, new fb("stat.entityKill", new Object[] { new fb("entity." + b + ".name", new Object[0]) })).h();
    }
    
    public static mw b(final pm.a \u2603) {
        final String b = pm.b(\u2603.a);
        if (b == null) {
            return null;
        }
        return new mw("stat.entityKilledBy." + b, new fb("stat.entityKilledBy", new Object[] { new fb("entity." + b + ".name", new Object[0]) })).h();
    }
    
    public static mw a(final String \u2603) {
        return na.a.get(\u2603);
    }
    
    static {
        na.a = (Map<String, mw>)Maps.newHashMap();
        na.b = (List<mw>)Lists.newArrayList();
        na.c = (List<mw>)Lists.newArrayList();
        na.d = (List<mu>)Lists.newArrayList();
        na.e = (List<mu>)Lists.newArrayList();
        na.f = new mt("stat.leaveGame", new fb("stat.leaveGame", new Object[0])).i().h();
        na.g = new mt("stat.playOneMinute", new fb("stat.playOneMinute", new Object[0]), mw.h).i().h();
        na.h = new mt("stat.timeSinceDeath", new fb("stat.timeSinceDeath", new Object[0]), mw.h).i().h();
        na.i = new mt("stat.walkOneCm", new fb("stat.walkOneCm", new Object[0]), mw.i).i().h();
        na.j = new mt("stat.crouchOneCm", new fb("stat.crouchOneCm", new Object[0]), mw.i).i().h();
        na.k = new mt("stat.sprintOneCm", new fb("stat.sprintOneCm", new Object[0]), mw.i).i().h();
        na.l = new mt("stat.swimOneCm", new fb("stat.swimOneCm", new Object[0]), mw.i).i().h();
        na.m = new mt("stat.fallOneCm", new fb("stat.fallOneCm", new Object[0]), mw.i).i().h();
        na.n = new mt("stat.climbOneCm", new fb("stat.climbOneCm", new Object[0]), mw.i).i().h();
        na.o = new mt("stat.flyOneCm", new fb("stat.flyOneCm", new Object[0]), mw.i).i().h();
        na.p = new mt("stat.diveOneCm", new fb("stat.diveOneCm", new Object[0]), mw.i).i().h();
        na.q = new mt("stat.minecartOneCm", new fb("stat.minecartOneCm", new Object[0]), mw.i).i().h();
        na.r = new mt("stat.boatOneCm", new fb("stat.boatOneCm", new Object[0]), mw.i).i().h();
        na.s = new mt("stat.pigOneCm", new fb("stat.pigOneCm", new Object[0]), mw.i).i().h();
        na.t = new mt("stat.horseOneCm", new fb("stat.horseOneCm", new Object[0]), mw.i).i().h();
        na.u = new mt("stat.jump", new fb("stat.jump", new Object[0])).i().h();
        na.v = new mt("stat.drop", new fb("stat.drop", new Object[0])).i().h();
        na.w = new mt("stat.damageDealt", new fb("stat.damageDealt", new Object[0]), mw.j).h();
        na.x = new mt("stat.damageTaken", new fb("stat.damageTaken", new Object[0]), mw.j).h();
        na.y = new mt("stat.deaths", new fb("stat.deaths", new Object[0])).h();
        na.z = new mt("stat.mobKills", new fb("stat.mobKills", new Object[0])).h();
        na.A = new mt("stat.animalsBred", new fb("stat.animalsBred", new Object[0])).h();
        na.B = new mt("stat.playerKills", new fb("stat.playerKills", new Object[0])).h();
        na.C = new mt("stat.fishCaught", new fb("stat.fishCaught", new Object[0])).h();
        na.D = new mt("stat.junkFished", new fb("stat.junkFished", new Object[0])).h();
        na.E = new mt("stat.treasureFished", new fb("stat.treasureFished", new Object[0])).h();
        na.F = new mt("stat.talkedToVillager", new fb("stat.talkedToVillager", new Object[0])).h();
        na.G = new mt("stat.tradedWithVillager", new fb("stat.tradedWithVillager", new Object[0])).h();
        na.H = new mt("stat.cakeSlicesEaten", new fb("stat.cakeSlicesEaten", new Object[0])).h();
        na.I = new mt("stat.cauldronFilled", new fb("stat.cauldronFilled", new Object[0])).h();
        na.J = new mt("stat.cauldronUsed", new fb("stat.cauldronUsed", new Object[0])).h();
        na.K = new mt("stat.armorCleaned", new fb("stat.armorCleaned", new Object[0])).h();
        na.L = new mt("stat.bannerCleaned", new fb("stat.bannerCleaned", new Object[0])).h();
        na.M = new mt("stat.brewingstandInteraction", new fb("stat.brewingstandInteraction", new Object[0])).h();
        na.N = new mt("stat.beaconInteraction", new fb("stat.beaconInteraction", new Object[0])).h();
        na.O = new mt("stat.dropperInspected", new fb("stat.dropperInspected", new Object[0])).h();
        na.P = new mt("stat.hopperInspected", new fb("stat.hopperInspected", new Object[0])).h();
        na.Q = new mt("stat.dispenserInspected", new fb("stat.dispenserInspected", new Object[0])).h();
        na.R = new mt("stat.noteblockPlayed", new fb("stat.noteblockPlayed", new Object[0])).h();
        na.S = new mt("stat.noteblockTuned", new fb("stat.noteblockTuned", new Object[0])).h();
        na.T = new mt("stat.flowerPotted", new fb("stat.flowerPotted", new Object[0])).h();
        na.U = new mt("stat.trappedChestTriggered", new fb("stat.trappedChestTriggered", new Object[0])).h();
        na.V = new mt("stat.enderchestOpened", new fb("stat.enderchestOpened", new Object[0])).h();
        na.W = new mt("stat.itemEnchanted", new fb("stat.itemEnchanted", new Object[0])).h();
        na.X = new mt("stat.recordPlayed", new fb("stat.recordPlayed", new Object[0])).h();
        na.Y = new mt("stat.furnaceInteraction", new fb("stat.furnaceInteraction", new Object[0])).h();
        na.Z = new mt("stat.craftingTableInteraction", new fb("stat.workbenchInteraction", new Object[0])).h();
        na.aa = new mt("stat.chestOpened", new fb("stat.chestOpened", new Object[0])).h();
        ab = new mw[4096];
        ac = new mw[32000];
        ad = new mw[32000];
        ae = new mw[32000];
    }
}
