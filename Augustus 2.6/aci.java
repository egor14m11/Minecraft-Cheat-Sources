import java.util.List;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.Set;
import java.util.Map;

// 
// Decompiled by Procyon v0.5.36
// 

public abstract class aci
{
    private static final aci[] a;
    public static final aci[] b;
    private static final Map<jy, aci> E;
    public static final aci c;
    public static final aci d;
    public static final aci e;
    public static final aci f;
    public static final aci g;
    public static final aci h;
    public static final aci i;
    public static final aci j;
    public static final aci k;
    public static final aci l;
    public static final aci m;
    public static final aci n;
    public static final aci o;
    public static final aci p;
    public static final aci q;
    public static final aci r;
    public static final aci s;
    public static final aci t;
    public static final aci u;
    public static final aci v;
    public static final aci w;
    public static final aci x;
    public static final aci y;
    public static final aci z;
    public static final aci A;
    public final int B;
    private final int F;
    public acj C;
    protected String D;
    
    public static aci c(final int \u2603) {
        if (\u2603 < 0 || \u2603 >= aci.a.length) {
            return null;
        }
        return aci.a[\u2603];
    }
    
    protected aci(final int \u2603, final jy \u2603, final int \u2603, final acj \u2603) {
        this.B = \u2603;
        this.F = \u2603;
        this.C = \u2603;
        if (aci.a[\u2603] != null) {
            throw new IllegalArgumentException("Duplicate enchantment id!");
        }
        aci.a[\u2603] = this;
        aci.E.put(\u2603, this);
    }
    
    public static aci b(final String \u2603) {
        return aci.E.get(new jy(\u2603));
    }
    
    public static Set<jy> c() {
        return aci.E.keySet();
    }
    
    public int d() {
        return this.F;
    }
    
    public int e() {
        return 1;
    }
    
    public int b() {
        return 1;
    }
    
    public int a(final int \u2603) {
        return 1 + \u2603 * 10;
    }
    
    public int b(final int \u2603) {
        return this.a(\u2603) + 5;
    }
    
    public int a(final int \u2603, final ow \u2603) {
        return 0;
    }
    
    public float a(final int \u2603, final pw \u2603) {
        return 0.0f;
    }
    
    public boolean a(final aci \u2603) {
        return this != \u2603;
    }
    
    public aci c(final String \u2603) {
        this.D = \u2603;
        return this;
    }
    
    public String a() {
        return "enchantment." + this.D;
    }
    
    public String d(final int \u2603) {
        final String a = di.a(this.a());
        return a + " " + di.a("enchantment.level." + \u2603);
    }
    
    public boolean a(final zx \u2603) {
        return this.C.a(\u2603.b());
    }
    
    public void a(final pr \u2603, final pk \u2603, final int \u2603) {
    }
    
    public void b(final pr \u2603, final pk \u2603, final int \u2603) {
    }
    
    static {
        a = new aci[256];
        E = Maps.newHashMap();
        c = new acr(0, new jy("protection"), 10, 0);
        d = new acr(1, new jy("fire_protection"), 5, 1);
        e = new acr(2, new jy("feather_falling"), 5, 2);
        f = new acr(3, new jy("blast_protection"), 2, 3);
        g = new acr(4, new jy("projectile_protection"), 5, 4);
        h = new acq(5, new jy("respiration"), 2);
        i = new acv(6, new jy("aqua_affinity"), 2);
        j = new acs(7, new jy("thorns"), 1);
        k = new acu(8, new jy("depth_strider"), 2);
        l = new acf(16, new jy("sharpness"), 10, 0);
        m = new acf(17, new jy("smite"), 5, 1);
        n = new acf(18, new jy("bane_of_arthropods"), 5, 2);
        o = new aco(19, new jy("knockback"), 5);
        p = new acm(20, new jy("fire_aspect"), 2);
        q = new acp(21, new jy("looting"), 2, acj.g);
        r = new ach(32, new jy("efficiency"), 10);
        s = new act(33, new jy("silk_touch"), 1);
        t = new acg(34, new jy("unbreaking"), 5);
        u = new acp(35, new jy("fortune"), 2, acj.h);
        v = new acb(48, new jy("power"), 10);
        w = new ace(49, new jy("punch"), 2);
        x = new acc(50, new jy("flame"), 2);
        y = new acd(51, new jy("infinity"), 1);
        z = new acp(61, new jy("luck_of_the_sea"), 2, acj.i);
        A = new acn(62, new jy("lure"), 2, acj.i);
        final List<aci> arrayList = (List<aci>)Lists.newArrayList();
        for (final aci aci : aci.a) {
            if (aci != null) {
                arrayList.add(aci);
            }
        }
        b = arrayList.toArray(new aci[arrayList.size()]);
    }
}
