import java.util.List;
import java.util.Comparator;
import java.util.Collections;
import com.google.common.base.Predicates;
import com.google.common.base.Predicate;

// 
// Decompiled by Procyon v0.5.36
// 

public class sp<T extends pr> extends st
{
    protected final Class<T> a;
    private final int g;
    protected final a b;
    protected Predicate<? super T> c;
    protected pr d;
    
    public sp(final py \u2603, final Class<T> \u2603, final boolean \u2603) {
        this(\u2603, \u2603, \u2603, false);
    }
    
    public sp(final py \u2603, final Class<T> \u2603, final boolean \u2603, final boolean \u2603) {
        this(\u2603, \u2603, 10, \u2603, \u2603, null);
    }
    
    public sp(final py \u2603, final Class<T> \u2603, final int \u2603, final boolean \u2603, final boolean \u2603, final Predicate<? super T> \u2603) {
        super(\u2603, \u2603, \u2603);
        this.a = \u2603;
        this.g = \u2603;
        this.b = new a(\u2603);
        this.a(1);
        this.c = new Predicate<T>() {
            public boolean a(final T \u2603) {
                if (\u2603 != null && !\u2603.apply(\u2603)) {
                    return false;
                }
                if (\u2603 instanceof wn) {
                    double f = sp.this.f();
                    if (\u2603.av()) {
                        f *= 0.800000011920929;
                    }
                    if (\u2603.ax()) {
                        float by = ((wn)\u2603).bY();
                        if (by < 0.1f) {
                            by = 0.1f;
                        }
                        f *= 0.7f * by;
                    }
                    if (\u2603.g(sp.this.e) > f) {
                        return false;
                    }
                }
                return sp.this.a(\u2603, false);
            }
        };
    }
    
    @Override
    public boolean a() {
        if (this.g > 0 && this.e.bc().nextInt(this.g) != 0) {
            return false;
        }
        final double f = this.f();
        final List<T> a = this.e.o.a((Class<? extends T>)this.a, this.e.aR().b(f, 4.0, f), Predicates.and(this.c, (Predicate<? super T>)po.d));
        Collections.sort(a, this.b);
        if (a.isEmpty()) {
            return false;
        }
        this.d = a.get(0);
        return true;
    }
    
    @Override
    public void c() {
        this.e.d(this.d);
        super.c();
    }
    
    public static class a implements Comparator<pk>
    {
        private final pk a;
        
        public a(final pk \u2603) {
            this.a = \u2603;
        }
        
        public int a(final pk \u2603, final pk \u2603) {
            final double h = this.a.h(\u2603);
            final double h2 = this.a.h(\u2603);
            if (h < h2) {
                return -1;
            }
            if (h > h2) {
                return 1;
            }
            return 0;
        }
    }
}
