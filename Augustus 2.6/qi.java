import java.util.Collection;
import java.util.Iterator;
import com.google.common.collect.Sets;
import java.util.Map;
import java.util.Set;

// 
// Decompiled by Procyon v0.5.36
// 

public class qi extends qf
{
    private final Set<qc> e;
    protected final Map<String, qc> d;
    
    public qi() {
        this.e = (Set<qc>)Sets.newHashSet();
        this.d = new nk<qc>();
    }
    
    public qh e(final qb \u2603) {
        return (qh)super.a(\u2603);
    }
    
    public qh b(final String \u2603) {
        qc a = super.a(\u2603);
        if (a == null) {
            a = this.d.get(\u2603);
        }
        return (qh)a;
    }
    
    @Override
    public qc b(final qb \u2603) {
        final qc b = super.b(\u2603);
        if (\u2603 instanceof qj && ((qj)\u2603).g() != null) {
            this.d.put(((qj)\u2603).g(), b);
        }
        return b;
    }
    
    @Override
    protected qc c(final qb \u2603) {
        return new qh(this, \u2603);
    }
    
    @Override
    public void a(final qc \u2603) {
        if (\u2603.a().c()) {
            this.e.add(\u2603);
        }
        for (final qb \u26032 : this.c.get(\u2603.a())) {
            final qh e = this.e(\u26032);
            if (e != null) {
                e.f();
            }
        }
    }
    
    public Set<qc> b() {
        return this.e;
    }
    
    public Collection<qc> c() {
        final Set<qc> hashSet = (Set<qc>)Sets.newHashSet();
        for (final qc qc : this.a()) {
            if (qc.a().c()) {
                hashSet.add(qc);
            }
        }
        return hashSet;
    }
}
