import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class bow implements boq
{
    protected final List<bgg> a;
    protected final List<List<bgg>> b;
    protected final boolean c;
    protected final boolean d;
    protected final bmi e;
    protected final bgr f;
    
    public bow(final List<bgg> \u2603, final List<List<bgg>> \u2603, final boolean \u2603, final boolean \u2603, final bmi \u2603, final bgr \u2603) {
        this.a = \u2603;
        this.b = \u2603;
        this.c = \u2603;
        this.d = \u2603;
        this.e = \u2603;
        this.f = \u2603;
    }
    
    @Override
    public List<bgg> a(final cq \u2603) {
        return this.b.get(\u2603.ordinal());
    }
    
    @Override
    public List<bgg> a() {
        return this.a;
    }
    
    @Override
    public boolean b() {
        return this.c;
    }
    
    @Override
    public boolean c() {
        return this.d;
    }
    
    @Override
    public boolean d() {
        return false;
    }
    
    @Override
    public bmi e() {
        return this.e;
    }
    
    @Override
    public bgr f() {
        return this.f;
    }
    
    public static class a
    {
        private final List<bgg> a;
        private final List<List<bgg>> b;
        private final boolean c;
        private bmi d;
        private boolean e;
        private bgr f;
        
        public a(final bgl \u2603) {
            this(\u2603.b(), \u2603.c(), \u2603.g());
        }
        
        public a(final boq \u2603, final bmi \u2603) {
            this(\u2603.b(), \u2603.c(), \u2603.f());
            this.d = \u2603.e();
            for (final cq \u26032 : cq.values()) {
                this.a(\u2603, \u2603, \u26032);
            }
            this.a(\u2603, \u2603);
        }
        
        private void a(final boq \u2603, final bmi \u2603, final cq \u2603) {
            for (final bgg \u26032 : \u2603.a(\u2603)) {
                this.a(\u2603, new bgn(\u26032, \u2603));
            }
        }
        
        private void a(final boq \u2603, final bmi \u2603) {
            for (final bgg \u26032 : \u2603.a()) {
                this.a(new bgn(\u26032, \u2603));
            }
        }
        
        private a(final boolean \u2603, final boolean \u2603, final bgr \u2603) {
            this.a = (List<bgg>)Lists.newArrayList();
            this.b = (List<List<bgg>>)Lists.newArrayListWithCapacity(6);
            for (final cq cq : cq.values()) {
                this.b.add((List<bgg>)Lists.newArrayList());
            }
            this.c = \u2603;
            this.e = \u2603;
            this.f = \u2603;
        }
        
        public a a(final cq \u2603, final bgg \u2603) {
            this.b.get(\u2603.ordinal()).add(\u2603);
            return this;
        }
        
        public a a(final bgg \u2603) {
            this.a.add(\u2603);
            return this;
        }
        
        public a a(final bmi \u2603) {
            this.d = \u2603;
            return this;
        }
        
        public boq b() {
            if (this.d == null) {
                throw new RuntimeException("Missing particle!");
            }
            return new bow(this.a, this.b, this.c, this.e, this.d, this.f);
        }
    }
}
