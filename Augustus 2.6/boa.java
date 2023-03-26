import java.util.Iterator;
import com.google.common.collect.Sets;
import java.util.Set;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class boa implements bnw
{
    private final List<bnz> a;
    private final int b;
    private final int c;
    private final int d;
    private final boolean e;
    
    public boa(final List<bnz> \u2603, final int \u2603, final int \u2603, final int \u2603, final boolean \u2603) {
        this.a = \u2603;
        this.b = \u2603;
        this.c = \u2603;
        this.d = \u2603;
        this.e = \u2603;
    }
    
    public int a() {
        return this.c;
    }
    
    public int b() {
        return this.b;
    }
    
    public int c() {
        return this.a.size();
    }
    
    public int d() {
        return this.d;
    }
    
    public boolean e() {
        return this.e;
    }
    
    private bnz d(final int \u2603) {
        return this.a.get(\u2603);
    }
    
    public int a(final int \u2603) {
        final bnz d = this.d(\u2603);
        if (d.a()) {
            return this.d;
        }
        return d.b();
    }
    
    public boolean b(final int \u2603) {
        return !this.a.get(\u2603).a();
    }
    
    public int c(final int \u2603) {
        return this.a.get(\u2603).c();
    }
    
    public Set<Integer> f() {
        final Set<Integer> hashSet = (Set<Integer>)Sets.newHashSet();
        for (final bnz bnz : this.a) {
            hashSet.add(bnz.c());
        }
        return hashSet;
    }
}
