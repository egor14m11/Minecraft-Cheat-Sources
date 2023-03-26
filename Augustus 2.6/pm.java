import com.google.common.collect.Maps;
import org.apache.logging.log4j.LogManager;
import java.util.Iterator;
import java.util.Set;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Map;
import org.apache.logging.log4j.Logger;

// 
// Decompiled by Procyon v0.5.36
// 

public class pm
{
    private static final Logger b;
    private static final Map<String, Class<? extends pk>> c;
    private static final Map<Class<? extends pk>, String> d;
    private static final Map<Integer, Class<? extends pk>> e;
    private static final Map<Class<? extends pk>, Integer> f;
    private static final Map<String, Integer> g;
    public static final Map<Integer, a> a;
    
    private static void a(final Class<? extends pk> \u2603, final String \u2603, final int \u2603) {
        if (pm.c.containsKey(\u2603)) {
            throw new IllegalArgumentException("ID is already registered: " + \u2603);
        }
        if (pm.e.containsKey(\u2603)) {
            throw new IllegalArgumentException("ID is already registered: " + \u2603);
        }
        if (\u2603 == 0) {
            throw new IllegalArgumentException("Cannot register to reserved id: " + \u2603);
        }
        if (\u2603 == null) {
            throw new IllegalArgumentException("Cannot register null clazz for id: " + \u2603);
        }
        pm.c.put(\u2603, \u2603);
        pm.d.put(\u2603, \u2603);
        pm.e.put(\u2603, \u2603);
        pm.f.put(\u2603, \u2603);
        pm.g.put(\u2603, \u2603);
    }
    
    private static void a(final Class<? extends pk> \u2603, final String \u2603, final int \u2603, final int \u2603, final int \u2603) {
        a(\u2603, \u2603, \u2603);
        pm.a.put(\u2603, new a(\u2603, \u2603, \u2603));
    }
    
    public static pk a(final String \u2603, final adm \u2603) {
        pk pk = null;
        try {
            final Class<? extends pk> clazz = pm.c.get(\u2603);
            if (clazz != null) {
                pk = (pk)clazz.getConstructor(adm.class).newInstance(\u2603);
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        return pk;
    }
    
    public static pk a(final dn \u2603, final adm \u2603) {
        pk pk = null;
        if ("Minecart".equals(\u2603.j("id"))) {
            \u2603.a("id", va.a.a(\u2603.f("Type")).b());
            \u2603.o("Type");
        }
        try {
            final Class<? extends pk> clazz = pm.c.get(\u2603.j("id"));
            if (clazz != null) {
                pk = (pk)clazz.getConstructor(adm.class).newInstance(\u2603);
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        if (pk != null) {
            pk.f(\u2603);
        }
        else {
            pm.b.warn("Skipping Entity with id " + \u2603.j("id"));
        }
        return pk;
    }
    
    public static pk a(final int \u2603, final adm \u2603) {
        pk pk = null;
        try {
            final Class<? extends pk> a = a(\u2603);
            if (a != null) {
                pk = (pk)a.getConstructor(adm.class).newInstance(\u2603);
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        if (pk == null) {
            pm.b.warn("Skipping Entity with id " + \u2603);
        }
        return pk;
    }
    
    public static int a(final pk \u2603) {
        final Integer n = pm.f.get(\u2603.getClass());
        return (n == null) ? 0 : n;
    }
    
    public static Class<? extends pk> a(final int \u2603) {
        return pm.e.get(\u2603);
    }
    
    public static String b(final pk \u2603) {
        return pm.d.get(\u2603.getClass());
    }
    
    public static int a(final String \u2603) {
        final Integer n = pm.g.get(\u2603);
        if (n == null) {
            return 90;
        }
        return n;
    }
    
    public static String b(final int \u2603) {
        return pm.d.get(a(\u2603));
    }
    
    public static void a() {
    }
    
    public static List<String> b() {
        final Set<String> keySet = pm.c.keySet();
        final List<String> arrayList = (List<String>)Lists.newArrayList();
        for (final String s : keySet) {
            final Class<? extends pk> clazz = pm.c.get(s);
            if ((clazz.getModifiers() & 0x400) != 0x400) {
                arrayList.add(s);
            }
        }
        arrayList.add("LightningBolt");
        return arrayList;
    }
    
    public static boolean a(final pk \u2603, final String \u2603) {
        String b = b(\u2603);
        if (b == null && \u2603 instanceof wn) {
            b = "Player";
        }
        else if (b == null && \u2603 instanceof uv) {
            b = "LightningBolt";
        }
        return \u2603.equals(b);
    }
    
    public static boolean b(final String \u2603) {
        return "Player".equals(\u2603) || b().contains(\u2603);
    }
    
    static {
        b = LogManager.getLogger();
        c = Maps.newHashMap();
        d = Maps.newHashMap();
        e = Maps.newHashMap();
        f = Maps.newHashMap();
        g = Maps.newHashMap();
        a = Maps.newLinkedHashMap();
        a(uz.class, "Item", 1);
        a(pp.class, "XPOrb", 2);
        a(wz.class, "ThrownEgg", 7);
        a(up.class, "LeashKnot", 8);
        a(uq.class, "Painting", 9);
        a(wq.class, "Arrow", 10);
        a(wx.class, "Snowball", 11);
        a(wu.class, "Fireball", 12);
        a(ww.class, "SmallFireball", 13);
        a(xa.class, "ThrownEnderpearl", 14);
        a(wr.class, "EyeOfEnderSignal", 15);
        a(xc.class, "ThrownPotion", 16);
        a(xb.class, "ThrownExpBottle", 17);
        a(uo.class, "ItemFrame", 18);
        a(xd.class, "WitherSkull", 19);
        a(vj.class, "PrimedTnt", 20);
        a(uy.class, "FallingSand", 21);
        a(wt.class, "FireworksRocketEntity", 22);
        a(um.class, "ArmorStand", 30);
        a(ux.class, "Boat", 41);
        a(vg.class, va.a.a.b(), 42);
        a(vb.class, va.a.b.b(), 43);
        a(ve.class, va.a.c.b(), 44);
        a(vi.class, va.a.d.b(), 45);
        a(vf.class, va.a.f.b(), 46);
        a(vh.class, va.a.e.b(), 47);
        a(vc.class, va.a.g.b(), 40);
        a(ps.class, "Mob", 48);
        a(vv.class, "Monster", 49);
        a(vn.class, "Creeper", 50, 894731, 0);
        a(wa.class, "Skeleton", 51, 12698049, 4802889);
        a(wc.class, "Spider", 52, 3419431, 11013646);
        a(vs.class, "Giant", 53);
        a(we.class, "Zombie", 54, 44975, 7969893);
        a(wb.class, "Slime", 55, 5349438, 8306542);
        a(vr.class, "Ghast", 56, 16382457, 12369084);
        a(vw.class, "PigZombie", 57, 15373203, 5009705);
        a(vo.class, "Enderman", 58, 1447446, 0);
        a(vm.class, "CaveSpider", 59, 803406, 11013646);
        a(vz.class, "Silverfish", 60, 7237230, 3158064);
        a(vl.class, "Blaze", 61, 16167425, 16775294);
        a(vu.class, "LavaSlime", 62, 3407872, 16579584);
        a(ug.class, "EnderDragon", 63);
        a(uk.class, "WitherBoss", 64);
        a(tk.class, "Bat", 65, 4996656, 986895);
        a(wd.class, "Witch", 66, 3407872, 5349438);
        a(vp.class, "Endermite", 67, 1447446, 7237230);
        a(vt.class, "Guardian", 68, 5931634, 15826224);
        a(tt.class, "Pig", 90, 15771042, 14377823);
        a(tv.class, "Sheep", 91, 15198183, 16758197);
        a(to.class, "Cow", 92, 4470310, 10592673);
        a(tn.class, "Chicken", 93, 10592673, 16711680);
        a(tx.class, "Squid", 94, 2243405, 7375001);
        a(ua.class, "Wolf", 95, 14144467, 13545366);
        a(tr.class, "MushroomCow", 96, 10489616, 12040119);
        a(tw.class, "SnowMan", 97);
        a(ts.class, "Ozelot", 98, 15720061, 5653556);
        a(ty.class, "VillagerGolem", 99);
        a(tp.class, "EntityHorse", 100, 12623485, 15656192);
        a(tu.class, "Rabbit", 101, 10051392, 7555121);
        a(wi.class, "Villager", 120, 5651507, 12422002);
        a(uf.class, "EnderCrystal", 200);
    }
    
    public static class a
    {
        public final int a;
        public final int b;
        public final int c;
        public final mw d;
        public final mw e;
        
        public a(final int \u2603, final int \u2603, final int \u2603) {
            this.a = \u2603;
            this.b = \u2603;
            this.c = \u2603;
            this.d = na.a(this);
            this.e = na.b(this);
        }
    }
}
