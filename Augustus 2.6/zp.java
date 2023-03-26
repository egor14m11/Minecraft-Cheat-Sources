import com.google.common.collect.Maps;
import java.util.Map;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class zp extends zs
{
    private final boolean b;
    
    public zp(final boolean \u2603) {
        super(0, 0.0f, false);
        this.b = \u2603;
    }
    
    @Override
    public int h(final zx \u2603) {
        final a a = zp.a.a(\u2603);
        if (this.b && a.g()) {
            return a.e();
        }
        return a.c();
    }
    
    @Override
    public float i(final zx \u2603) {
        final a a = zp.a.a(\u2603);
        if (this.b && a.g()) {
            return a.f();
        }
        return a.d();
    }
    
    @Override
    public String j(final zx \u2603) {
        if (a.a(\u2603) == a.d) {
            return abe.m;
        }
        return null;
    }
    
    @Override
    protected void c(final zx \u2603, final adm \u2603, final wn \u2603) {
        final a a = zp.a.a(\u2603);
        if (a == zp.a.d) {
            \u2603.c(new pf(pe.u.H, 1200, 3));
            \u2603.c(new pf(pe.s.H, 300, 2));
            \u2603.c(new pf(pe.k.H, 300, 1));
        }
        super.c(\u2603, \u2603, \u2603);
    }
    
    @Override
    public void a(final zw \u2603, final yz \u2603, final List<zx> \u2603) {
        for (final a a : a.values()) {
            if (!this.b || a.g()) {
                \u2603.add(new zx(this, 1, a.a()));
            }
        }
    }
    
    @Override
    public String e_(final zx \u2603) {
        final a a = zp.a.a(\u2603);
        return this.a() + "." + a.b() + "." + ((this.b && a.g()) ? "cooked" : "raw");
    }
    
    public enum a
    {
        a(0, "cod", 2, 0.1f, 5, 0.6f), 
        b(1, "salmon", 2, 0.1f, 6, 0.8f), 
        c(2, "clownfish", 1, 0.1f), 
        d(3, "pufferfish", 1, 0.1f);
        
        private static final Map<Integer, a> e;
        private final int f;
        private final String g;
        private final int h;
        private final float i;
        private final int j;
        private final float k;
        private boolean l;
        
        private a(final int \u2603, final String \u2603, final int \u2603, final float \u2603, final int \u2603, final float \u2603) {
            this.l = false;
            this.f = \u2603;
            this.g = \u2603;
            this.h = \u2603;
            this.i = \u2603;
            this.j = \u2603;
            this.k = \u2603;
            this.l = true;
        }
        
        private a(final int \u2603, final String \u2603, final int \u2603, final float \u2603) {
            this.l = false;
            this.f = \u2603;
            this.g = \u2603;
            this.h = \u2603;
            this.i = \u2603;
            this.j = 0;
            this.k = 0.0f;
            this.l = false;
        }
        
        public int a() {
            return this.f;
        }
        
        public String b() {
            return this.g;
        }
        
        public int c() {
            return this.h;
        }
        
        public float d() {
            return this.i;
        }
        
        public int e() {
            return this.j;
        }
        
        public float f() {
            return this.k;
        }
        
        public boolean g() {
            return this.l;
        }
        
        public static a a(final int \u2603) {
            final a a = zp.a.e.get(\u2603);
            if (a == null) {
                return zp.a.a;
            }
            return a;
        }
        
        public static a a(final zx \u2603) {
            if (\u2603.b() instanceof zp) {
                return a(\u2603.i());
            }
            return a.a;
        }
        
        static {
            e = Maps.newHashMap();
            for (final a a2 : values()) {
                a.e.put(a2.a(), a2);
            }
        }
    }
}
