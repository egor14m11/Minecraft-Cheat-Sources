import java.util.Iterator;
import com.google.common.collect.Maps;
import java.util.Map;

// 
// Decompiled by Procyon v0.5.36
// 

public class bhc
{
    private Map<Class<? extends akw>, bhd<? extends akw>> m;
    public static bhc a;
    private avn n;
    public static double b;
    public static double c;
    public static double d;
    public bmj e;
    public adm f;
    public pk g;
    public float h;
    public float i;
    public double j;
    public double k;
    public double l;
    
    private bhc() {
        (this.m = (Map<Class<? extends akw>, bhd<? extends akw>>)Maps.newHashMap()).put(aln.class, new bhj());
        this.m.put(all.class, new bhh());
        this.m.put(alu.class, new bhi());
        this.m.put(aky.class, new bhe());
        this.m.put(alf.class, new bhg());
        this.m.put(ale.class, new bhf());
        this.m.put(alp.class, new bhl());
        this.m.put(akv.class, new bhb());
        this.m.put(alo.class, new bhk());
        this.m.put(aku.class, new bha());
        for (final bhd<?> bhd : this.m.values()) {
            bhd.a(this);
        }
    }
    
    public <T extends akw> bhd<T> a(final Class<? extends akw> \u2603) {
        bhd<? extends akw> a = this.m.get(\u2603);
        if (a == null && \u2603 != akw.class) {
            a = this.a((Class<? extends akw>)\u2603.getSuperclass());
            this.m.put(\u2603, a);
        }
        return (bhd<T>)a;
    }
    
    public <T extends akw> bhd<T> b(final akw \u2603) {
        if (\u2603 == null) {
            return null;
        }
        return this.a(\u2603.getClass());
    }
    
    public void a(final adm \u2603, final bmj \u2603, final avn \u2603, final pk \u2603, final float \u2603) {
        if (this.f != \u2603) {
            this.a(\u2603);
        }
        this.e = \u2603;
        this.g = \u2603;
        this.n = \u2603;
        this.h = \u2603.A + (\u2603.y - \u2603.A) * \u2603;
        this.i = \u2603.B + (\u2603.z - \u2603.B) * \u2603;
        this.j = \u2603.P + (\u2603.s - \u2603.P) * \u2603;
        this.k = \u2603.Q + (\u2603.t - \u2603.Q) * \u2603;
        this.l = \u2603.R + (\u2603.u - \u2603.R) * \u2603;
    }
    
    public void a(final akw \u2603, final float \u2603, final int \u2603) {
        if (\u2603.a(this.j, this.k, this.l) < \u2603.s()) {
            final int b = this.f.b(\u2603.v(), 0);
            final int n = b % 65536;
            final int n2 = b / 65536;
            bqs.a(bqs.r, n / 1.0f, n2 / 1.0f);
            bfl.c(1.0f, 1.0f, 1.0f, 1.0f);
            final cj v = \u2603.v();
            this.a(\u2603, v.n() - bhc.b, v.o() - bhc.c, v.p() - bhc.d, \u2603, \u2603);
        }
    }
    
    public void a(final akw \u2603, final double \u2603, final double \u2603, final double \u2603, final float \u2603) {
        this.a(\u2603, \u2603, \u2603, \u2603, \u2603, -1);
    }
    
    public void a(final akw \u2603, final double \u2603, final double \u2603, final double \u2603, final float \u2603, final int \u2603) {
        final bhd<akw> b = this.b(\u2603);
        if (b != null) {
            try {
                b.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
            }
            catch (Throwable \u26032) {
                final b a = b.a(\u26032, "Rendering Block Entity");
                final c a2 = a.a("Block Entity Details");
                \u2603.a(a2);
                throw new e(a);
            }
        }
    }
    
    public void a(final adm \u2603) {
        this.f = \u2603;
    }
    
    public avn a() {
        return this.n;
    }
    
    static {
        bhc.a = new bhc();
    }
}
