import org.apache.logging.log4j.LogManager;
import java.util.Deque;
import com.google.common.collect.Queues;
import java.util.Comparator;
import com.google.common.collect.Sets;
import java.util.Collections;
import java.io.StringReader;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.IOException;
import org.apache.commons.io.IOUtils;
import java.io.Reader;
import java.io.InputStreamReader;
import com.google.common.base.Charsets;
import java.util.Iterator;
import java.util.Collection;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import com.google.common.base.Joiner;
import java.util.Map;
import org.apache.logging.log4j.Logger;
import java.util.Set;

// 
// Decompiled by Procyon v0.5.36
// 

public class bot
{
    private static final Set<jy> b;
    private static final Logger c;
    protected static final bov a;
    private static final Map<String, String> d;
    private static final Joiner e;
    private final bni f;
    private final Map<jy, bmi> g;
    private final Map<jy, bgl> h;
    private final Map<bov, bgm.d> i;
    private final bmh j;
    private final bgc k;
    private final bgo l;
    private final bgp m;
    private dd<bov, boq> n;
    private static final bgl o;
    private static final bgl p;
    private static final bgl q;
    private static final bgl r;
    private Map<String, jy> s;
    private final Map<jy, bgm> t;
    private Map<zw, List<String>> u;
    
    public bot(final bni \u2603, final bmh \u2603, final bgc \u2603) {
        this.g = (Map<jy, bmi>)Maps.newHashMap();
        this.h = (Map<jy, bgl>)Maps.newLinkedHashMap();
        this.i = (Map<bov, bgm.d>)Maps.newLinkedHashMap();
        this.l = new bgo();
        this.m = new bgp();
        this.n = new dd<bov, boq>();
        this.s = (Map<String, jy>)Maps.newLinkedHashMap();
        this.t = (Map<jy, bgm>)Maps.newHashMap();
        this.u = (Map<zw, List<String>>)Maps.newIdentityHashMap();
        this.f = \u2603;
        this.j = \u2603;
        this.k = \u2603;
    }
    
    public db<bov, boq> a() {
        this.b();
        this.h();
        this.j();
        this.l();
        this.f();
        return this.n;
    }
    
    private void b() {
        this.a(this.k.a().a().values());
        this.i.put(bot.a, new bgm.d(bot.a.c(), Lists.newArrayList(new bgm.c(new jy(bot.a.a()), bor.a, false, 1))));
        final jy \u2603 = new jy("item_frame");
        final bgm a = this.a(\u2603);
        this.a(a, new bov(\u2603, "normal"));
        this.a(a, new bov(\u2603, "map"));
        this.c();
        this.d();
    }
    
    private void a(final Collection<bov> \u2603) {
        for (final bov bov : \u2603) {
            try {
                final bgm a = this.a(bov);
                try {
                    this.a(a, bov);
                }
                catch (Exception ex) {
                    bot.c.warn("Unable to load variant: " + bov.c() + " from " + bov);
                }
            }
            catch (Exception throwable) {
                bot.c.warn("Unable to load definition " + bov, throwable);
            }
        }
    }
    
    private void a(final bgm \u2603, final bov \u2603) {
        this.i.put(\u2603, \u2603.b(\u2603.c()));
    }
    
    private bgm a(final jy \u2603) {
        final jy b = this.b(\u2603);
        bgm bgm = this.t.get(b);
        if (bgm == null) {
            final List<bgm> arrayList = (List<bgm>)Lists.newArrayList();
            try {
                for (final bnh bnh : this.f.b(b)) {
                    InputStream b2 = null;
                    try {
                        b2 = bnh.b();
                        final bgm a = bgm.a(new InputStreamReader(b2, Charsets.UTF_8));
                        arrayList.add(a);
                    }
                    catch (Exception cause) {
                        throw new RuntimeException("Encountered an exception when loading model definition of '" + \u2603 + "' from: '" + bnh.a() + "' in resourcepack: '" + bnh.d() + "'", cause);
                    }
                    finally {
                        IOUtils.closeQuietly(b2);
                    }
                }
            }
            catch (IOException cause2) {
                throw new RuntimeException("Encountered an exception when loading model definition of model " + b.toString(), cause2);
            }
            bgm = new bgm(arrayList);
            this.t.put(b, bgm);
        }
        return bgm;
    }
    
    private jy b(final jy \u2603) {
        return new jy(\u2603.b(), "blockstates/" + \u2603.a() + ".json");
    }
    
    private void c() {
        for (final bov obj : this.i.keySet()) {
            for (final bgm.c c : this.i.get(obj).b()) {
                final jy a = c.a();
                if (this.h.get(a) != null) {
                    continue;
                }
                try {
                    final bgl c2 = this.c(a);
                    this.h.put(a, c2);
                }
                catch (Exception throwable) {
                    bot.c.warn("Unable to load block model: '" + a + "' for variant: '" + obj + "'", throwable);
                }
            }
        }
    }
    
    private bgl c(final jy \u2603) throws IOException {
        final String a = \u2603.a();
        if ("builtin/generated".equals(a)) {
            return bot.o;
        }
        if ("builtin/compass".equals(a)) {
            return bot.p;
        }
        if ("builtin/clock".equals(a)) {
            return bot.q;
        }
        if ("builtin/entity".equals(a)) {
            return bot.r;
        }
        Reader \u26032;
        if (a.startsWith("builtin/")) {
            final String substring = a.substring("builtin/".length());
            final String s = bot.d.get(substring);
            if (s == null) {
                throw new FileNotFoundException(\u2603.toString());
            }
            \u26032 = new StringReader(s);
        }
        else {
            final bnh a2 = this.f.a(this.d(\u2603));
            \u26032 = new InputStreamReader(a2.b(), Charsets.UTF_8);
        }
        try {
            final bgl a3 = bgl.a(\u26032);
            a3.b = \u2603.toString();
            return a3;
        }
        finally {
            \u26032.close();
        }
    }
    
    private jy d(final jy \u2603) {
        return new jy(\u2603.b(), "models/" + \u2603.a() + ".json");
    }
    
    private void d() {
        this.e();
        for (final zw zw : zw.e) {
            final List<String> a = this.a(zw);
            for (final String \u2603 : a) {
                final jy a2 = this.a(\u2603);
                this.s.put(\u2603, a2);
                if (this.h.get(a2) != null) {
                    continue;
                }
                try {
                    final bgl c = this.c(a2);
                    this.h.put(a2, c);
                }
                catch (Exception throwable) {
                    bot.c.warn("Unable to load item model: '" + a2 + "' for item: '" + zw.e.c(zw) + "'", throwable);
                }
            }
        }
    }
    
    private void e() {
        this.u.put(zw.a(afi.b), Lists.newArrayList("stone", "granite", "granite_smooth", "diorite", "diorite_smooth", "andesite", "andesite_smooth"));
        this.u.put(zw.a(afi.d), Lists.newArrayList("dirt", "coarse_dirt", "podzol"));
        this.u.put(zw.a(afi.f), Lists.newArrayList("oak_planks", "spruce_planks", "birch_planks", "jungle_planks", "acacia_planks", "dark_oak_planks"));
        this.u.put(zw.a(afi.g), Lists.newArrayList("oak_sapling", "spruce_sapling", "birch_sapling", "jungle_sapling", "acacia_sapling", "dark_oak_sapling"));
        this.u.put(zw.a(afi.m), Lists.newArrayList("sand", "red_sand"));
        this.u.put(zw.a(afi.r), Lists.newArrayList("oak_log", "spruce_log", "birch_log", "jungle_log"));
        this.u.put(zw.a(afi.t), Lists.newArrayList("oak_leaves", "spruce_leaves", "birch_leaves", "jungle_leaves"));
        this.u.put(zw.a(afi.v), Lists.newArrayList("sponge", "sponge_wet"));
        this.u.put(zw.a(afi.A), Lists.newArrayList("sandstone", "chiseled_sandstone", "smooth_sandstone"));
        this.u.put(zw.a(afi.cM), Lists.newArrayList("red_sandstone", "chiseled_red_sandstone", "smooth_red_sandstone"));
        this.u.put(zw.a(afi.H), Lists.newArrayList("dead_bush", "tall_grass", "fern"));
        this.u.put(zw.a(afi.I), Lists.newArrayList("dead_bush"));
        this.u.put(zw.a(afi.L), Lists.newArrayList("black_wool", "red_wool", "green_wool", "brown_wool", "blue_wool", "purple_wool", "cyan_wool", "silver_wool", "gray_wool", "pink_wool", "lime_wool", "yellow_wool", "light_blue_wool", "magenta_wool", "orange_wool", "white_wool"));
        this.u.put(zw.a(afi.N), Lists.newArrayList("dandelion"));
        this.u.put(zw.a(afi.O), Lists.newArrayList("poppy", "blue_orchid", "allium", "houstonia", "red_tulip", "orange_tulip", "white_tulip", "pink_tulip", "oxeye_daisy"));
        this.u.put(zw.a(afi.U), Lists.newArrayList("stone_slab", "sandstone_slab", "cobblestone_slab", "brick_slab", "stone_brick_slab", "nether_brick_slab", "quartz_slab"));
        this.u.put(zw.a(afi.cP), Lists.newArrayList("red_sandstone_slab"));
        this.u.put(zw.a(afi.cG), Lists.newArrayList("black_stained_glass", "red_stained_glass", "green_stained_glass", "brown_stained_glass", "blue_stained_glass", "purple_stained_glass", "cyan_stained_glass", "silver_stained_glass", "gray_stained_glass", "pink_stained_glass", "lime_stained_glass", "yellow_stained_glass", "light_blue_stained_glass", "magenta_stained_glass", "orange_stained_glass", "white_stained_glass"));
        this.u.put(zw.a(afi.be), Lists.newArrayList("stone_monster_egg", "cobblestone_monster_egg", "stone_brick_monster_egg", "mossy_brick_monster_egg", "cracked_brick_monster_egg", "chiseled_brick_monster_egg"));
        this.u.put(zw.a(afi.bf), Lists.newArrayList("stonebrick", "mossy_stonebrick", "cracked_stonebrick", "chiseled_stonebrick"));
        this.u.put(zw.a(afi.bM), Lists.newArrayList("oak_slab", "spruce_slab", "birch_slab", "jungle_slab", "acacia_slab", "dark_oak_slab"));
        this.u.put(zw.a(afi.bZ), Lists.newArrayList("cobblestone_wall", "mossy_cobblestone_wall"));
        this.u.put(zw.a(afi.cf), Lists.newArrayList("anvil_intact", "anvil_slightly_damaged", "anvil_very_damaged"));
        this.u.put(zw.a(afi.cq), Lists.newArrayList("quartz_block", "chiseled_quartz_block", "quartz_column"));
        this.u.put(zw.a(afi.cu), Lists.newArrayList("black_stained_hardened_clay", "red_stained_hardened_clay", "green_stained_hardened_clay", "brown_stained_hardened_clay", "blue_stained_hardened_clay", "purple_stained_hardened_clay", "cyan_stained_hardened_clay", "silver_stained_hardened_clay", "gray_stained_hardened_clay", "pink_stained_hardened_clay", "lime_stained_hardened_clay", "yellow_stained_hardened_clay", "light_blue_stained_hardened_clay", "magenta_stained_hardened_clay", "orange_stained_hardened_clay", "white_stained_hardened_clay"));
        this.u.put(zw.a(afi.cH), Lists.newArrayList("black_stained_glass_pane", "red_stained_glass_pane", "green_stained_glass_pane", "brown_stained_glass_pane", "blue_stained_glass_pane", "purple_stained_glass_pane", "cyan_stained_glass_pane", "silver_stained_glass_pane", "gray_stained_glass_pane", "pink_stained_glass_pane", "lime_stained_glass_pane", "yellow_stained_glass_pane", "light_blue_stained_glass_pane", "magenta_stained_glass_pane", "orange_stained_glass_pane", "white_stained_glass_pane"));
        this.u.put(zw.a(afi.u), Lists.newArrayList("acacia_leaves", "dark_oak_leaves"));
        this.u.put(zw.a(afi.s), Lists.newArrayList("acacia_log", "dark_oak_log"));
        this.u.put(zw.a(afi.cI), Lists.newArrayList("prismarine", "prismarine_bricks", "dark_prismarine"));
        this.u.put(zw.a(afi.cy), Lists.newArrayList("black_carpet", "red_carpet", "green_carpet", "brown_carpet", "blue_carpet", "purple_carpet", "cyan_carpet", "silver_carpet", "gray_carpet", "pink_carpet", "lime_carpet", "yellow_carpet", "light_blue_carpet", "magenta_carpet", "orange_carpet", "white_carpet"));
        this.u.put(zw.a(afi.cF), Lists.newArrayList("sunflower", "syringa", "double_grass", "double_fern", "double_rose", "paeonia"));
        this.u.put(zy.f, Lists.newArrayList("bow", "bow_pulling_0", "bow_pulling_1", "bow_pulling_2"));
        this.u.put(zy.h, Lists.newArrayList("coal", "charcoal"));
        this.u.put(zy.aR, Lists.newArrayList("fishing_rod", "fishing_rod_cast"));
        this.u.put(zy.aU, Lists.newArrayList("cod", "salmon", "clownfish", "pufferfish"));
        this.u.put(zy.aV, Lists.newArrayList("cooked_cod", "cooked_salmon"));
        this.u.put(zy.aW, Lists.newArrayList("dye_black", "dye_red", "dye_green", "dye_brown", "dye_blue", "dye_purple", "dye_cyan", "dye_silver", "dye_gray", "dye_pink", "dye_lime", "dye_yellow", "dye_light_blue", "dye_magenta", "dye_orange", "dye_white"));
        this.u.put(zy.bz, Lists.newArrayList("bottle_drinkable", "bottle_splash"));
        this.u.put(zy.bX, Lists.newArrayList("skull_skeleton", "skull_wither", "skull_zombie", "skull_char", "skull_creeper"));
        this.u.put(zw.a(afi.bo), Lists.newArrayList("oak_fence_gate"));
        this.u.put(zw.a(afi.aO), Lists.newArrayList("oak_fence"));
        this.u.put(zy.aq, Lists.newArrayList("oak_door"));
    }
    
    private List<String> a(final zw \u2603) {
        List<String> singletonList = this.u.get(\u2603);
        if (singletonList == null) {
            singletonList = Collections.singletonList(zw.e.c(\u2603).toString());
        }
        return singletonList;
    }
    
    private jy a(final String \u2603) {
        final jy jy = new jy(\u2603);
        return new jy(jy.b(), "item/" + jy.a());
    }
    
    private void f() {
        for (final bov bov : this.i.keySet()) {
            final box.a a = new box.a();
            int n = 0;
            for (final bgm.c c : this.i.get(bov).b()) {
                final bgl \u2603 = this.h.get(c.a());
                if (\u2603 == null || !\u2603.d()) {
                    bot.c.warn("Missing model for: " + bov);
                }
                else {
                    ++n;
                    a.a(this.a(\u2603, c.b(), c.c()), c.d());
                }
            }
            if (n == 0) {
                bot.c.warn("No weighted models for: " + bov);
            }
            else if (n == 1) {
                this.n.a(bov, a.b());
            }
            else {
                this.n.a(bov, a.a());
            }
        }
        for (final Map.Entry<String, jy> entry : this.s.entrySet()) {
            final jy obj = entry.getValue();
            final bov bov2 = new bov(entry.getKey(), "inventory");
            final bgl bgl = this.h.get(obj);
            if (bgl == null || !bgl.d()) {
                bot.c.warn("Missing model for: " + obj);
            }
            else if (this.c(bgl)) {
                this.n.a(bov2, new bos(bgl.g()));
            }
            else {
                this.n.a(bov2, this.a(bgl, bor.a, false));
            }
        }
    }
    
    private Set<jy> g() {
        final Set<jy> hashSet = (Set<jy>)Sets.newHashSet();
        final List<bov> arrayList = (List<bov>)Lists.newArrayList((Iterable<?>)this.i.keySet());
        Collections.sort(arrayList, new Comparator<bov>() {
            public int a(final bov \u2603, final bov \u2603) {
                return \u2603.toString().compareTo(\u2603.toString());
            }
        });
        for (final bov obj : arrayList) {
            final bgm.d d = this.i.get(obj);
            for (final bgm.c c : d.b()) {
                final bgl \u2603 = this.h.get(c.a());
                if (\u2603 == null) {
                    bot.c.warn("Missing model for: " + obj);
                }
                else {
                    hashSet.addAll(this.a(\u2603));
                }
            }
        }
        hashSet.addAll(bot.b);
        return hashSet;
    }
    
    private boq a(final bgl \u2603, final bor \u2603, final boolean \u2603) {
        final bmi \u26032 = this.g.get(new jy(\u2603.c("particle")));
        final bow.a a = new bow.a(\u2603).a(\u26032);
        for (final bgh bgh : \u2603.a()) {
            for (final cq cq : bgh.c.keySet()) {
                final bgi bgi = bgh.c.get(cq);
                final bmi bmi = this.g.get(new jy(\u2603.c(bgi.d)));
                if (bgi.b == null) {
                    a.a(this.a(bgh, bgi, bmi, cq, \u2603, \u2603));
                }
                else {
                    a.a(\u2603.a(bgi.b), this.a(bgh, bgi, bmi, cq, \u2603, \u2603));
                }
            }
        }
        return a.b();
    }
    
    private bgg a(final bgh \u2603, final bgi \u2603, final bmi \u2603, final cq \u2603, final bor \u2603, final boolean \u2603) {
        return this.l.a(\u2603.a, \u2603.b, \u2603, \u2603, \u2603, \u2603, \u2603.d, \u2603, \u2603.e);
    }
    
    private void h() {
        this.i();
        for (final bgl bgl : this.h.values()) {
            bgl.a(this.h);
        }
        bgl.b(this.h);
    }
    
    private void i() {
        final Deque<jy> arrayDeque = (Deque<jy>)Queues.newArrayDeque();
        final Set<jy> hashSet = (Set<jy>)Sets.newHashSet();
        for (final jy jy : this.h.keySet()) {
            hashSet.add(jy);
            final jy jy2 = this.h.get(jy).e();
            if (jy2 != null) {
                arrayDeque.add(jy2);
            }
        }
        while (!arrayDeque.isEmpty()) {
            final jy \u2603 = arrayDeque.pop();
            try {
                if (this.h.get(\u2603) != null) {
                    continue;
                }
                final bgl c = this.c(\u2603);
                this.h.put(\u2603, c);
                final jy jy2 = c.e();
                if (jy2 != null && !hashSet.contains(jy2)) {
                    arrayDeque.add(jy2);
                }
            }
            catch (Exception throwable) {
                bot.c.warn("In parent chain: " + bot.e.join(this.e(\u2603)) + "; unable to load model: '" + \u2603 + "'", throwable);
            }
            hashSet.add(\u2603);
        }
    }
    
    private List<jy> e(final jy \u2603) {
        final List<jy> arrayList = Lists.newArrayList(\u2603);
        jy f = \u2603;
        while ((f = this.f(f)) != null) {
            arrayList.add(0, f);
        }
        return arrayList;
    }
    
    private jy f(final jy \u2603) {
        for (final Map.Entry<jy, bgl> entry : this.h.entrySet()) {
            final bgl bgl = entry.getValue();
            if (bgl != null && \u2603.equals(bgl.e())) {
                return entry.getKey();
            }
        }
        return null;
    }
    
    private Set<jy> a(final bgl \u2603) {
        final Set<jy> hashSet = (Set<jy>)Sets.newHashSet();
        for (final bgh bgh : \u2603.a()) {
            for (final bgi bgi : bgh.c.values()) {
                final jy jy = new jy(\u2603.c(bgi.d));
                hashSet.add(jy);
            }
        }
        hashSet.add(new jy(\u2603.c("particle")));
        return hashSet;
    }
    
    private void j() {
        final Set<jy> g = this.g();
        g.addAll(this.k());
        g.remove(bmh.f);
        final bmb \u2603 = new bmb() {
            @Override
            public void a(final bmh \u2603) {
                for (final jy \u26032 : g) {
                    final bmi a = \u2603.a(\u26032);
                    bot.this.g.put(\u26032, a);
                }
            }
        };
        this.j.a(this.f, \u2603);
        this.g.put(new jy("missingno"), this.j.f());
    }
    
    private Set<jy> k() {
        final Set<jy> hashSet = (Set<jy>)Sets.newHashSet();
        for (final jy jy : this.s.values()) {
            final bgl bgl = this.h.get(jy);
            if (bgl == null) {
                continue;
            }
            hashSet.add(new jy(bgl.c("particle")));
            if (this.b(bgl)) {
                for (final String \u2603 : bgp.a) {
                    final jy jy2 = new jy(bgl.c(\u2603));
                    if (bgl.f() == bot.p && !bmh.f.equals(jy2)) {
                        bmi.b(jy2.toString());
                    }
                    else if (bgl.f() == bot.q && !bmh.f.equals(jy2)) {
                        bmi.a(jy2.toString());
                    }
                    hashSet.add(jy2);
                }
            }
            else {
                if (this.c(bgl)) {
                    continue;
                }
                for (final bgh bgh : bgl.a()) {
                    for (final bgi bgi : bgh.c.values()) {
                        final jy jy3 = new jy(bgl.c(bgi.d));
                        hashSet.add(jy3);
                    }
                }
            }
        }
        return hashSet;
    }
    
    private boolean b(final bgl \u2603) {
        if (\u2603 == null) {
            return false;
        }
        final bgl f = \u2603.f();
        return f == bot.o || f == bot.p || f == bot.q;
    }
    
    private boolean c(final bgl \u2603) {
        if (\u2603 == null) {
            return false;
        }
        final bgl f = \u2603.f();
        return f == bot.r;
    }
    
    private void l() {
        for (final jy jy : this.s.values()) {
            final bgl \u2603 = this.h.get(jy);
            if (this.b(\u2603)) {
                final bgl d = this.d(\u2603);
                if (d != null) {
                    d.b = jy.toString();
                }
                this.h.put(jy, d);
            }
            else {
                if (!this.c(\u2603)) {
                    continue;
                }
                this.h.put(jy, \u2603);
            }
        }
        for (final bmi bmi : this.g.values()) {
            if (!bmi.m()) {
                bmi.l();
            }
        }
    }
    
    private bgl d(final bgl \u2603) {
        return this.m.a(this.j, \u2603);
    }
    
    static {
        b = Sets.newHashSet(new jy("blocks/water_flow"), new jy("blocks/water_still"), new jy("blocks/lava_flow"), new jy("blocks/lava_still"), new jy("blocks/destroy_stage_0"), new jy("blocks/destroy_stage_1"), new jy("blocks/destroy_stage_2"), new jy("blocks/destroy_stage_3"), new jy("blocks/destroy_stage_4"), new jy("blocks/destroy_stage_5"), new jy("blocks/destroy_stage_6"), new jy("blocks/destroy_stage_7"), new jy("blocks/destroy_stage_8"), new jy("blocks/destroy_stage_9"), new jy("items/empty_armor_slot_helmet"), new jy("items/empty_armor_slot_chestplate"), new jy("items/empty_armor_slot_leggings"), new jy("items/empty_armor_slot_boots"));
        c = LogManager.getLogger();
        a = new bov("builtin/missing", "missing");
        (d = Maps.newHashMap()).put("missing", "{ \"textures\": {   \"particle\": \"missingno\",   \"missingno\": \"missingno\"}, \"elements\": [ {     \"from\": [ 0, 0, 0 ],     \"to\": [ 16, 16, 16 ],     \"faces\": {         \"down\":  { \"uv\": [ 0, 0, 16, 16 ], \"cullface\": \"down\", \"texture\": \"#missingno\" },         \"up\":    { \"uv\": [ 0, 0, 16, 16 ], \"cullface\": \"up\", \"texture\": \"#missingno\" },         \"north\": { \"uv\": [ 0, 0, 16, 16 ], \"cullface\": \"north\", \"texture\": \"#missingno\" },         \"south\": { \"uv\": [ 0, 0, 16, 16 ], \"cullface\": \"south\", \"texture\": \"#missingno\" },         \"west\":  { \"uv\": [ 0, 0, 16, 16 ], \"cullface\": \"west\", \"texture\": \"#missingno\" },         \"east\":  { \"uv\": [ 0, 0, 16, 16 ], \"cullface\": \"east\", \"texture\": \"#missingno\" }    }}]}");
        e = Joiner.on(" -> ");
        o = bgl.a("{\"elements\":[{  \"from\": [0, 0, 0],   \"to\": [16, 16, 16],   \"faces\": {       \"down\": {\"uv\": [0, 0, 16, 16], \"texture\":\"\"}   }}]}");
        p = bgl.a("{\"elements\":[{  \"from\": [0, 0, 0],   \"to\": [16, 16, 16],   \"faces\": {       \"down\": {\"uv\": [0, 0, 16, 16], \"texture\":\"\"}   }}]}");
        q = bgl.a("{\"elements\":[{  \"from\": [0, 0, 0],   \"to\": [16, 16, 16],   \"faces\": {       \"down\": {\"uv\": [0, 0, 16, 16], \"texture\":\"\"}   }}]}");
        r = bgl.a("{\"elements\":[{  \"from\": [0, 0, 0],   \"to\": [16, 16, 16],   \"faces\": {       \"down\": {\"uv\": [0, 0, 16, 16], \"texture\":\"\"}   }}]}");
        bot.o.b = "generation marker";
        bot.p.b = "compass generation marker";
        bot.q.b = "class generation marker";
        bot.r.b = "block entity marker";
    }
}
