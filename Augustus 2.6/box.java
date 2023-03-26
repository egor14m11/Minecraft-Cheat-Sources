import com.google.common.collect.ComparisonChain;
import java.util.Collections;
import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class box implements boq
{
    private final int a;
    private final List<b> b;
    private final boq c;
    
    public box(final List<b> \u2603) {
        this.b = \u2603;
        this.a = oa.a(\u2603);
        this.c = \u2603.get(0).b;
    }
    
    @Override
    public List<bgg> a(final cq \u2603) {
        return this.c.a(\u2603);
    }
    
    @Override
    public List<bgg> a() {
        return this.c.a();
    }
    
    @Override
    public boolean b() {
        return this.c.b();
    }
    
    @Override
    public boolean c() {
        return this.c.c();
    }
    
    @Override
    public boolean d() {
        return this.c.d();
    }
    
    @Override
    public bmi e() {
        return this.c.e();
    }
    
    @Override
    public bgr f() {
        return this.c.f();
    }
    
    public boq a(final long \u2603) {
        return oa.a(this.b, Math.abs((int)\u2603 >> 16) % this.a).b;
    }
    
    public static class a
    {
        private List<b> a;
        
        public a() {
            this.a = (List<b>)Lists.newArrayList();
        }
        
        public a a(final boq \u2603, final int \u2603) {
            this.a.add(new b(\u2603, \u2603));
            return this;
        }
        
        public box a() {
            Collections.sort(this.a);
            return new box(this.a);
        }
        
        public boq b() {
            return this.a.get(0).b;
        }
    }
    
    static class b extends oa.a implements Comparable<b>
    {
        protected final boq b;
        
        public b(final boq \u2603, final int \u2603) {
            super(\u2603);
            this.b = \u2603;
        }
        
        public int a(final b \u2603) {
            return ComparisonChain.start().compare(\u2603.a, this.a).compare(this.a(), \u2603.a()).result();
        }
        
        protected int a() {
            int size = this.b.a().size();
            for (final cq cq : cq.values()) {
                size += this.b.a(cq).size();
            }
            return size;
        }
        
        @Override
        public String toString() {
            return "MyWeighedRandomItem{weight=" + this.a + ", model=" + this.b + '}';
        }
    }
}
