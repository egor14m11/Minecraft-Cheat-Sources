import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class aiw extends afh
{
    public static final amm<a> a;
    
    public aiw() {
        super(arm.e);
        this.j(this.M.b().a(aiw.a, aiw.a.a));
        this.a(yz.b);
    }
    
    @Override
    public alz a(final adm \u2603, final cj \u2603, final cq \u2603, final float \u2603, final float \u2603, final float \u2603, final int \u2603, final pr \u2603) {
        if (\u2603 == aiw.a.c.a()) {
            switch (aiw$1.a[\u2603.k().ordinal()]) {
                case 1: {
                    return this.Q().a(aiw.a, aiw.a.e);
                }
                case 2: {
                    return this.Q().a(aiw.a, aiw.a.d);
                }
                default: {
                    return this.Q().a(aiw.a, aiw.a.c);
                }
            }
        }
        else {
            if (\u2603 == aiw.a.b.a()) {
                return this.Q().a(aiw.a, aiw.a.b);
            }
            return this.Q().a(aiw.a, aiw.a.a);
        }
    }
    
    @Override
    public int a(final alz \u2603) {
        final a a = \u2603.b(aiw.a);
        if (a == aiw.a.d || a == aiw.a.e) {
            return aiw.a.c.a();
        }
        return a.a();
    }
    
    @Override
    protected zx i(final alz \u2603) {
        final a a = \u2603.b(aiw.a);
        if (a == aiw.a.d || a == aiw.a.e) {
            return new zx(zw.a(this), 1, aiw.a.c.a());
        }
        return super.i(\u2603);
    }
    
    @Override
    public void a(final zw \u2603, final yz \u2603, final List<zx> \u2603) {
        \u2603.add(new zx(\u2603, 1, aiw.a.a.a()));
        \u2603.add(new zx(\u2603, 1, aiw.a.b.a()));
        \u2603.add(new zx(\u2603, 1, aiw.a.c.a()));
    }
    
    @Override
    public arn g(final alz \u2603) {
        return arn.p;
    }
    
    @Override
    public alz a(final int \u2603) {
        return this.Q().a(aiw.a, aiw.a.a(\u2603));
    }
    
    @Override
    public int c(final alz \u2603) {
        return \u2603.b(aiw.a).a();
    }
    
    @Override
    protected ama e() {
        return new ama(this, new amo[] { aiw.a });
    }
    
    static {
        a = amm.a("variant", a.class);
    }
    
    public enum a implements nw
    {
        a(0, "default", "default"), 
        b(1, "chiseled", "chiseled"), 
        c(2, "lines_y", "lines"), 
        d(3, "lines_x", "lines"), 
        e(4, "lines_z", "lines");
        
        private static final a[] f;
        private final int g;
        private final String h;
        private final String i;
        
        private a(final int \u2603, final String \u2603, final String \u2603) {
            this.g = \u2603;
            this.h = \u2603;
            this.i = \u2603;
        }
        
        public int a() {
            return this.g;
        }
        
        @Override
        public String toString() {
            return this.i;
        }
        
        public static a a(int \u2603) {
            if (\u2603 < 0 || \u2603 >= a.f.length) {
                \u2603 = 0;
            }
            return a.f[\u2603];
        }
        
        @Override
        public String l() {
            return this.h;
        }
        
        static {
            f = new a[values().length];
            for (final a a2 : values()) {
                a.f[a2.a()] = a2;
            }
        }
    }
}
