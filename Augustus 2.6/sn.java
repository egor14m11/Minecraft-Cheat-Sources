import org.apache.logging.log4j.LogManager;
import java.util.List;
import java.util.Comparator;
import java.util.Collections;
import com.google.common.base.Predicate;
import org.apache.logging.log4j.Logger;

// 
// Decompiled by Procyon v0.5.36
// 

public class sn extends rd
{
    private static final Logger a;
    private ps b;
    private final Predicate<pr> c;
    private final sp.a d;
    private pr e;
    private Class<? extends pr> f;
    
    public sn(final ps \u2603, final Class<? extends pr> \u2603) {
        this.b = \u2603;
        this.f = \u2603;
        if (\u2603 instanceof py) {
            sn.a.warn("Use NearestAttackableTargetGoal.class for PathfinerMob mobs!");
        }
        this.c = new Predicate<pr>() {
            public boolean a(final pr \u2603) {
                double f = sn.this.f();
                if (\u2603.av()) {
                    f *= 0.800000011920929;
                }
                return !\u2603.ax() && \u2603.g(sn.this.b) <= f && st.a(sn.this.b, \u2603, false, true);
            }
        };
        this.d = new sp.a(\u2603);
    }
    
    @Override
    public boolean a() {
        final double f = this.f();
        final List<pr> a = this.b.o.a(this.f, this.b.aR().b(f, 4.0, f), (Predicate<? super pr>)this.c);
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
