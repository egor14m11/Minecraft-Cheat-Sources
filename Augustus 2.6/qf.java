import java.util.Iterator;
import java.util.Collection;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import java.util.Map;

// 
// Decompiled by Procyon v0.5.36
// 

public abstract class qf
{
    protected final Map<qb, qc> a;
    protected final Map<String, qc> b;
    protected final Multimap<qb, qb> c;
    
    public qf() {
        this.a = (Map<qb, qc>)Maps.newHashMap();
        this.b = new nk<qc>();
        this.c = (Multimap<qb, qb>)HashMultimap.create();
    }
    
    public qc a(final qb \u2603) {
        return this.a.get(\u2603);
    }
    
    public qc a(final String \u2603) {
        return this.b.get(\u2603);
    }
    
    public qc b(final qb \u2603) {
        if (this.b.containsKey(\u2603.a())) {
            throw new IllegalArgumentException("Attribute is already registered!");
        }
        final qc c = this.c(\u2603);
        this.b.put(\u2603.a(), c);
        this.a.put(\u2603, c);
        for (qb qb = \u2603.d(); qb != null; qb = qb.d()) {
            this.c.put(qb, \u2603);
        }
        return c;
    }
    
    protected abstract qc c(final qb p0);
    
    public Collection<qc> a() {
        return this.b.values();
    }
    
    public void a(final qc \u2603) {
    }
    
    public void a(final Multimap<String, qd> \u2603) {
        for (final Map.Entry<String, qd> entry : \u2603.entries()) {
            final qc a = this.a(entry.getKey());
            if (a != null) {
                a.c(entry.getValue());
            }
        }
    }
    
    public void b(final Multimap<String, qd> \u2603) {
        for (final Map.Entry<String, qd> entry : \u2603.entries()) {
            final qc a = this.a(entry.getKey());
            if (a != null) {
                a.c(entry.getValue());
                a.b(entry.getValue());
            }
        }
    }
}
