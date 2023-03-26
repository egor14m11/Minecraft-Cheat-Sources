import java.util.Iterator;

// 
// Decompiled by Procyon v0.5.36
// 

public abstract class ahw extends ajg
{
    public static final amm<a> a;
    
    public ahw() {
        super(arm.d);
        this.a(yz.b);
        this.c(2.0f);
        this.a(ahw.f);
    }
    
    @Override
    public void b(final adm \u2603, final cj \u2603, final alz \u2603) {
        final int n = 4;
        final int n2 = n + 1;
        if (!\u2603.a(\u2603.a(-n2, -n2, -n2), \u2603.a(n2, n2, n2))) {
            return;
        }
        for (final cj cj : cj.a(\u2603.a(-n, -n, -n), \u2603.a(n, n, n))) {
            final alz p = \u2603.p(cj);
            if (p.c().t() == arm.j && !p.b((amo<Boolean>)ahs.b)) {
                \u2603.a(cj, p.a((amo<Comparable>)ahs.b, true), 4);
            }
        }
    }
    
    @Override
    public alz a(final adm \u2603, final cj \u2603, final cq \u2603, final float \u2603, final float \u2603, final float \u2603, final int \u2603, final pr \u2603) {
        return super.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603).a(ahw.a, ahw.a.a(\u2603.k()));
    }
    
    static {
        a = amm.a("axis", a.class);
    }
    
    public enum a implements nw
    {
        a("x"), 
        b("y"), 
        c("z"), 
        d("none");
        
        private final String e;
        
        private a(final String \u2603) {
            this.e = \u2603;
        }
        
        @Override
        public String toString() {
            return this.e;
        }
        
        public static a a(final cq.a \u2603) {
            switch (ahw$1.a[\u2603.ordinal()]) {
                case 1: {
                    return a.a;
                }
                case 2: {
                    return a.b;
                }
                case 3: {
                    return a.c;
                }
                default: {
                    return a.d;
                }
            }
        }
        
        @Override
        public String l() {
            return this.e;
        }
    }
}
