import java.util.List;
import com.google.common.base.Predicates;
import com.google.common.base.Predicate;

// 
// Decompiled by Procyon v0.5.36
// 

public class qs<T extends pk> extends rd
{
    private final Predicate<pk> c;
    protected py a;
    private double d;
    private double e;
    protected T b;
    private float f;
    private asx g;
    private sw h;
    private Class<T> i;
    private Predicate<? super T> j;
    
    public qs(final py \u2603, final Class<T> \u2603, final float \u2603, final double \u2603, final double \u2603) {
        this(\u2603, \u2603, Predicates.alwaysTrue(), \u2603, \u2603, \u2603);
    }
    
    public qs(final py \u2603, final Class<T> \u2603, final Predicate<? super T> \u2603, final float \u2603, final double \u2603, final double \u2603) {
        this.c = new Predicate<pk>() {
            public boolean a(final pk \u2603) {
                return \u2603.ai() && qs.this.a.t().a(\u2603);
            }
        };
        this.a = \u2603;
        this.i = \u2603;
        this.j = \u2603;
        this.f = \u2603;
        this.d = \u2603;
        this.e = \u2603;
        this.h = \u2603.s();
        this.a(1);
    }
    
    @Override
    public boolean a() {
        final List<T> a = this.a.o.a((Class<? extends T>)this.i, this.a.aR().b(this.f, 3.0, this.f), Predicates.and(po.d, this.c, this.j));
        if (a.isEmpty()) {
            return false;
        }
        this.b = a.get(0);
        final aui b = tc.b(this.a, 16, 7, new aui(this.b.s, this.b.t, this.b.u));
        if (b == null) {
            return false;
        }
        if (this.b.e(b.a, b.b, b.c) < this.b.h(this.a)) {
            return false;
        }
        this.g = this.h.a(b.a, b.b, b.c);
        return this.g != null && this.g.b(b);
    }
    
    @Override
    public boolean b() {
        return !this.h.m();
    }
    
    @Override
    public void c() {
        this.h.a(this.g, this.d);
    }
    
    @Override
    public void d() {
        this.b = null;
    }
    
    @Override
    public void e() {
        if (this.a.h(this.b) < 49.0) {
            this.a.s().a(this.e);
        }
        else {
            this.a.s().a(this.d);
        }
    }
}
