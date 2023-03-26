import com.google.common.base.Objects;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.CacheBuilder;
import java.util.Iterator;
import com.google.common.cache.LoadingCache;
import com.google.common.base.Predicate;

// 
// Decompiled by Procyon v0.5.36
// 

public class amd
{
    private final Predicate<amc>[][][] a;
    private final int b;
    private final int c;
    private final int d;
    
    public amd(final Predicate<amc>[][][] \u2603) {
        this.a = \u2603;
        this.b = \u2603.length;
        if (this.b > 0) {
            this.c = \u2603[0].length;
            if (this.c > 0) {
                this.d = \u2603[0][0].length;
            }
            else {
                this.d = 0;
            }
        }
        else {
            this.c = 0;
            this.d = 0;
        }
    }
    
    public int b() {
        return this.c;
    }
    
    public int c() {
        return this.d;
    }
    
    private b a(final cj \u2603, final cq \u2603, final cq \u2603, final LoadingCache<cj, amc> \u2603) {
        for (int i = 0; i < this.d; ++i) {
            for (int j = 0; j < this.c; ++j) {
                for (int k = 0; k < this.b; ++k) {
                    if (!this.a[k][j][i].apply(\u2603.getUnchecked(a(\u2603, \u2603, \u2603, i, j, k)))) {
                        return null;
                    }
                }
            }
        }
        return new b(\u2603, \u2603, \u2603, \u2603, this.d, this.c, this.b);
    }
    
    public b a(final adm \u2603, final cj \u2603) {
        final LoadingCache<cj, amc> a = a(\u2603, false);
        final int max = Math.max(Math.max(this.d, this.c), this.b);
        for (final cj \u26032 : cj.a(\u2603, \u2603.a(max - 1, max - 1, max - 1))) {
            for (final cq \u26033 : cq.values()) {
                for (final cq \u26034 : cq.values()) {
                    if (\u26034 != \u26033) {
                        if (\u26034 != \u26033.d()) {
                            final b a2 = this.a(\u26032, \u26033, \u26034, a);
                            if (a2 != null) {
                                return a2;
                            }
                        }
                    }
                }
            }
        }
        return null;
    }
    
    public static LoadingCache<cj, amc> a(final adm \u2603, final boolean \u2603) {
        return CacheBuilder.newBuilder().build((CacheLoader<? super cj, amc>)new a(\u2603, \u2603));
    }
    
    protected static cj a(final cj \u2603, final cq \u2603, final cq \u2603, final int \u2603, final int \u2603, final int \u2603) {
        if (\u2603 == \u2603 || \u2603 == \u2603.d()) {
            throw new IllegalArgumentException("Invalid forwards & up combination");
        }
        final df df = new df(\u2603.g(), \u2603.h(), \u2603.i());
        final df \u26032 = new df(\u2603.g(), \u2603.h(), \u2603.i());
        final df d = df.d(\u26032);
        return \u2603.a(\u26032.n() * -\u2603 + d.n() * \u2603 + df.n() * \u2603, \u26032.o() * -\u2603 + d.o() * \u2603 + df.o() * \u2603, \u26032.p() * -\u2603 + d.p() * \u2603 + df.p() * \u2603);
    }
    
    static class a extends CacheLoader<cj, amc>
    {
        private final adm a;
        private final boolean b;
        
        public a(final adm \u2603, final boolean \u2603) {
            this.a = \u2603;
            this.b = \u2603;
        }
        
        public amc a(final cj \u2603) throws Exception {
            return new amc(this.a, \u2603, this.b);
        }
    }
    
    public static class b
    {
        private final cj a;
        private final cq b;
        private final cq c;
        private final LoadingCache<cj, amc> d;
        private final int e;
        private final int f;
        private final int g;
        
        public b(final cj \u2603, final cq \u2603, final cq \u2603, final LoadingCache<cj, amc> \u2603, final int \u2603, final int \u2603, final int \u2603) {
            this.a = \u2603;
            this.b = \u2603;
            this.c = \u2603;
            this.d = \u2603;
            this.e = \u2603;
            this.f = \u2603;
            this.g = \u2603;
        }
        
        public cj a() {
            return this.a;
        }
        
        public cq b() {
            return this.b;
        }
        
        public cq c() {
            return this.c;
        }
        
        public int d() {
            return this.e;
        }
        
        public int e() {
            return this.f;
        }
        
        public amc a(final int \u2603, final int \u2603, final int \u2603) {
            return this.d.getUnchecked(amd.a(this.a, this.b(), this.c(), \u2603, \u2603, \u2603));
        }
        
        @Override
        public String toString() {
            return Objects.toStringHelper((Object)this).add("up", (Object)this.c).add("forwards", (Object)this.b).add("frontTopLeft", (Object)this.a).toString();
        }
    }
}
