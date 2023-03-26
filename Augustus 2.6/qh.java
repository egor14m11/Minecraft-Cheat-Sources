import java.util.Iterator;
import com.google.common.collect.Lists;
import java.util.Collection;
import com.google.common.collect.Sets;
import com.google.common.collect.Maps;
import java.util.UUID;
import java.util.Set;
import java.util.Map;

// 
// Decompiled by Procyon v0.5.36
// 

public class qh implements qc
{
    private final qf a;
    private final qb b;
    private final Map<Integer, Set<qd>> c;
    private final Map<String, Set<qd>> d;
    private final Map<UUID, qd> e;
    private double f;
    private boolean g;
    private double h;
    
    public qh(final qf \u2603, final qb \u2603) {
        this.c = (Map<Integer, Set<qd>>)Maps.newHashMap();
        this.d = (Map<String, Set<qd>>)Maps.newHashMap();
        this.e = (Map<UUID, qd>)Maps.newHashMap();
        this.g = true;
        this.a = \u2603;
        this.b = \u2603;
        this.f = \u2603.b();
        for (int i = 0; i < 3; ++i) {
            this.c.put(i, (Set<qd>)Sets.newHashSet());
        }
    }
    
    @Override
    public qb a() {
        return this.b;
    }
    
    @Override
    public double b() {
        return this.f;
    }
    
    @Override
    public void a(final double \u2603) {
        if (\u2603 == this.b()) {
            return;
        }
        this.f = \u2603;
        this.f();
    }
    
    @Override
    public Collection<qd> a(final int \u2603) {
        return this.c.get(\u2603);
    }
    
    @Override
    public Collection<qd> c() {
        final Set<qd> hashSet = (Set<qd>)Sets.newHashSet();
        for (int i = 0; i < 3; ++i) {
            hashSet.addAll(this.a(i));
        }
        return hashSet;
    }
    
    @Override
    public qd a(final UUID \u2603) {
        return this.e.get(\u2603);
    }
    
    @Override
    public boolean a(final qd \u2603) {
        return this.e.get(\u2603.a()) != null;
    }
    
    @Override
    public void b(final qd \u2603) {
        if (this.a(\u2603.a()) != null) {
            throw new IllegalArgumentException("Modifier is already applied on this attribute!");
        }
        Set<qd> hashSet = this.d.get(\u2603.b());
        if (hashSet == null) {
            hashSet = (Set<qd>)Sets.newHashSet();
            this.d.put(\u2603.b(), hashSet);
        }
        this.c.get(\u2603.c()).add(\u2603);
        hashSet.add(\u2603);
        this.e.put(\u2603.a(), \u2603);
        this.f();
    }
    
    protected void f() {
        this.g = true;
        this.a.a(this);
    }
    
    @Override
    public void c(final qd \u2603) {
        for (int i = 0; i < 3; ++i) {
            final Set<qd> set = this.c.get(i);
            set.remove(\u2603);
        }
        final Set<qd> set2 = this.d.get(\u2603.b());
        if (set2 != null) {
            set2.remove(\u2603);
            if (set2.isEmpty()) {
                this.d.remove(\u2603.b());
            }
        }
        this.e.remove(\u2603.a());
        this.f();
    }
    
    @Override
    public void d() {
        Collection<qd> elements = this.c();
        if (elements == null) {
            return;
        }
        elements = (Collection<qd>)Lists.newArrayList((Iterable<?>)elements);
        for (final qd \u2603 : elements) {
            this.c(\u2603);
        }
    }
    
    @Override
    public double e() {
        if (this.g) {
            this.h = this.g();
            this.g = false;
        }
        return this.h;
    }
    
    private double g() {
        double b = this.b();
        for (final qd qd : this.b(0)) {
            b += qd.d();
        }
        double n = b;
        for (final qd qd2 : this.b(1)) {
            n += b * qd2.d();
        }
        for (final qd qd2 : this.b(2)) {
            n *= 1.0 + qd2.d();
        }
        return this.b.a(n);
    }
    
    private Collection<qd> b(final int \u2603) {
        final Set<qd> hashSet = (Set<qd>)Sets.newHashSet((Iterable<?>)this.a(\u2603));
        for (qb \u26032 = this.b.d(); \u26032 != null; \u26032 = \u26032.d()) {
            final qc a = this.a.a(\u26032);
            if (a != null) {
                hashSet.addAll(a.a(\u2603));
            }
        }
        return hashSet;
    }
}
