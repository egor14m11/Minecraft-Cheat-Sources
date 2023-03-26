import com.google.common.base.Predicate;

// 
// Decompiled by Procyon v0.5.36
// 

public final class po
{
    public static final Predicate<pk> a;
    public static final Predicate<pk> b;
    public static final Predicate<pk> c;
    public static final Predicate<pk> d;
    
    static {
        a = new Predicate<pk>() {
            public boolean a(final pk \u2603) {
                return \u2603.ai();
            }
        };
        b = new Predicate<pk>() {
            public boolean a(final pk \u2603) {
                return \u2603.ai() && \u2603.l == null && \u2603.m == null;
            }
        };
        c = new Predicate<pk>() {
            public boolean a(final pk \u2603) {
                return \u2603 instanceof og && \u2603.ai();
            }
        };
        d = new Predicate<pk>() {
            public boolean a(final pk \u2603) {
                return !(\u2603 instanceof wn) || !((wn)\u2603).v();
            }
        };
    }
    
    public static class a implements Predicate<pk>
    {
        private final zx a;
        
        public a(final zx \u2603) {
            this.a = \u2603;
        }
        
        public boolean a(final pk \u2603) {
            if (!\u2603.ai()) {
                return false;
            }
            if (!(\u2603 instanceof pr)) {
                return false;
            }
            final pr pr = (pr)\u2603;
            if (pr.p(ps.c(this.a)) != null) {
                return false;
            }
            if (pr instanceof ps) {
                return ((ps)pr).bY();
            }
            return pr instanceof um || pr instanceof wn;
        }
    }
}
