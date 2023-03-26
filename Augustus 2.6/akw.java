import com.google.common.collect.Maps;
import org.apache.logging.log4j.LogManager;
import java.util.concurrent.Callable;
import java.util.Map;
import org.apache.logging.log4j.Logger;

// 
// Decompiled by Procyon v0.5.36
// 

public abstract class akw
{
    private static final Logger a;
    private static Map<String, Class<? extends akw>> f;
    private static Map<Class<? extends akw>, String> g;
    protected adm b;
    protected cj c;
    protected boolean d;
    private int h;
    protected afh e;
    
    public akw() {
        this.c = cj.a;
        this.h = -1;
    }
    
    private static void a(final Class<? extends akw> \u2603, final String \u2603) {
        if (akw.f.containsKey(\u2603)) {
            throw new IllegalArgumentException("Duplicate id: " + \u2603);
        }
        akw.f.put(\u2603, \u2603);
        akw.g.put(\u2603, \u2603);
    }
    
    public adm z() {
        return this.b;
    }
    
    public void a(final adm \u2603) {
        this.b = \u2603;
    }
    
    public boolean t() {
        return this.b != null;
    }
    
    public void a(final dn \u2603) {
        this.c = new cj(\u2603.f("x"), \u2603.f("y"), \u2603.f("z"));
    }
    
    public void b(final dn \u2603) {
        final String \u26032 = akw.g.get(this.getClass());
        if (\u26032 == null) {
            throw new RuntimeException(this.getClass() + " is missing a mapping! This is a bug!");
        }
        \u2603.a("id", \u26032);
        \u2603.a("x", this.c.n());
        \u2603.a("y", this.c.o());
        \u2603.a("z", this.c.p());
    }
    
    public static akw c(final dn \u2603) {
        akw akw = null;
        try {
            final Class<? extends akw> clazz = akw.f.get(\u2603.j("id"));
            if (clazz != null) {
                akw = (akw)clazz.newInstance();
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        if (akw != null) {
            akw.a(\u2603);
        }
        else {
            akw.a.warn("Skipping BlockEntity with id " + \u2603.j("id"));
        }
        return akw;
    }
    
    public int u() {
        if (this.h == -1) {
            final alz p = this.b.p(this.c);
            this.h = p.c().c(p);
        }
        return this.h;
    }
    
    public void p_() {
        if (this.b != null) {
            final alz p = this.b.p(this.c);
            this.h = p.c().c(p);
            this.b.b(this.c, this);
            if (this.w() != afi.a) {
                this.b.e(this.c, this.w());
            }
        }
    }
    
    public double a(final double \u2603, final double \u2603, final double \u2603) {
        final double n = this.c.n() + 0.5 - \u2603;
        final double n2 = this.c.o() + 0.5 - \u2603;
        final double n3 = this.c.p() + 0.5 - \u2603;
        return n * n + n2 * n2 + n3 * n3;
    }
    
    public double s() {
        return 4096.0;
    }
    
    public cj v() {
        return this.c;
    }
    
    public afh w() {
        if (this.e == null) {
            this.e = this.b.p(this.c).c();
        }
        return this.e;
    }
    
    public ff y_() {
        return null;
    }
    
    public boolean x() {
        return this.d;
    }
    
    public void y() {
        this.d = true;
    }
    
    public void D() {
        this.d = false;
    }
    
    public boolean c(final int \u2603, final int \u2603) {
        return false;
    }
    
    public void E() {
        this.e = null;
        this.h = -1;
    }
    
    public void a(final c \u2603) {
        \u2603.a("Name", new Callable<String>() {
            public String a() throws Exception {
                return akw.g.get(akw.this.getClass()) + " // " + akw.this.getClass().getCanonicalName();
            }
        });
        if (this.b == null) {
            return;
        }
        c.a(\u2603, this.c, this.w(), this.u());
        \u2603.a("Actual block type", new Callable<String>() {
            public String a() throws Exception {
                final int a = afh.a(akw.this.b.p(akw.this.c).c());
                try {
                    return String.format("ID #%d (%s // %s)", a, afh.c(a).a(), afh.c(a).getClass().getCanonicalName());
                }
                catch (Throwable t) {
                    return "ID #" + a;
                }
            }
        });
        \u2603.a("Actual block data value", new Callable<String>() {
            public String a() throws Exception {
                final alz p = akw.this.b.p(akw.this.c);
                final int c = p.c().c(p);
                if (c < 0) {
                    return "Unknown? (Got " + c + ")";
                }
                final String replace = String.format("%4s", Integer.toBinaryString(c)).replace(" ", "0");
                return String.format("%1$d / 0x%1$X / 0b%2$s", c, replace);
            }
        });
    }
    
    public void a(final cj \u2603) {
        this.c = \u2603;
    }
    
    public boolean F() {
        return false;
    }
    
    static {
        a = LogManager.getLogger();
        akw.f = (Map<String, Class<? extends akw>>)Maps.newHashMap();
        akw.g = (Map<Class<? extends akw>, String>)Maps.newHashMap();
        a(alh.class, "Furnace");
        a(aky.class, "Chest");
        a(alf.class, "EnderChest");
        a(ahq.a.class, "RecordPlayer");
        a(alc.class, "Trap");
        a(ald.class, "Dropper");
        a(aln.class, "Sign");
        a(all.class, "MobSpawner");
        a(alm.class, "Music");
        a(alu.class, "Piston");
        a(akx.class, "Cauldron");
        a(ale.class, "EnchantTable");
        a(alp.class, "Airportal");
        a(akz.class, "Control");
        a(akv.class, "Beacon");
        a(alo.class, "Skull");
        a(alb.class, "DLDetector");
        a(alj.class, "Hopper");
        a(ala.class, "Comparator");
        a(alg.class, "FlowerPot");
        a(aku.class, "Banner");
    }
}
