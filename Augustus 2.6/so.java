import org.apache.logging.log4j.LogManager;
import java.util.List;
import java.util.Comparator;
import java.util.Collections;
import com.google.common.base.Predicate;
import org.apache.logging.log4j.Logger;

// 
// Decompiled by Procyon v0.5.36
// 

public class so extends rd
{
    private static final Logger a;
    private ps b;
    private final Predicate<pk> c;
    private final sp.a d;
    private pr e;
    
    public so(final ps \u2603) {
        this.b = \u2603;
        if (\u2603 instanceof py) {
            so.a.warn("Use NearestAttackableTargetGoal.class for PathfinerMob mobs!");
        }
        this.c = new Predicate<pk>() {
            public boolean a(final pk \u2603) {
                if (!(\u2603 instanceof wn)) {
                    return false;
                }
                if (((wn)\u2603).bA.a) {
                    return false;
                }
                double f = so.this.f();
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
                return \u2603.g(so.this.b) <= f && st.a(so.this.b, (pr)\u2603, false, true);
            }
        };
        this.d = new sp.a(\u2603);
    }
    
    @Override
    public boolean a() {
        final double f = this.f();
        final List<wn> a = this.b.o.a((Class<? extends wn>)wn.class, this.b.aR().b(f, 4.0, f), (Predicate<? super wn>)this.c);
        Collections.sort(a, this.d);
        if (a.isEmpty()) {
            return false;
        }
        this.e = a.get(0);
        return true;
    }
    
    @Override
    public boolean b() {
        final pr u = this.b.u();
        if (u == null) {
            return false;
        }
        if (!u.ai()) {
            return false;
        }
        if (u instanceof wn && ((wn)u).bA.a) {
            return false;
        }
        final auq bo = this.b.bO();
        final auq bo2 = u.bO();
        if (bo != null && bo2 == bo) {
            return false;
        }
        final double f = this.f();
        return this.b.h(u) <= f * f && (!(u instanceof lf) || !((lf)u).c.d());
    }
    
    @Override
    public void c() {
        this.b.d(this.e);
        super.c();
    }
    
    @Override
    public void d() {
        this.b.d((pr)null);
        super.c();
    }
    
    protected double f() {
        final qc a = this.b.a(vy.b);
        return (a == null) ? 16.0 : a.e();
    }
    
    static {
        a = LogManager.getLogger();
    }
}
