import com.google.common.collect.Sets;
import java.util.Set;
import com.google.common.collect.Lists;
import java.util.Arrays;
import java.util.Random;
import java.util.Iterator;
import java.util.Map;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class aqk extends aqq
{
    private int f;
    private int g;
    public static final List<ady> d;
    private static final List<ady.c> h;
    
    public aqk() {
        this.f = 32;
        this.g = 5;
    }
    
    public aqk(final Map<String, String> \u2603) {
        this();
        for (final Map.Entry<String, String> entry : \u2603.entrySet()) {
            if (entry.getKey().equals("spacing")) {
                this.f = ns.a(entry.getValue(), this.f, 1);
            }
            else {
                if (!entry.getKey().equals("separation")) {
                    continue;
                }
                this.g = ns.a(entry.getValue(), this.g, 1);
            }
        }
    }
    
    @Override
    public String a() {
        return "Monument";
    }
    
    @Override
    protected boolean a(int \u2603, int \u2603) {
        final int n = \u2603;
        final int n2 = \u2603;
        if (\u2603 < 0) {
            \u2603 -= this.f - 1;
        }
        if (\u2603 < 0) {
            \u2603 -= this.f - 1;
        }
        int \u26032 = \u2603 / this.f;
        int \u26033 = \u2603 / this.f;
        final Random a = this.c.a(\u26032, \u26033, 10387313);
        \u26032 *= this.f;
        \u26033 *= this.f;
        \u26032 += (a.nextInt(this.f - this.g) + a.nextInt(this.f - this.g)) / 2;
        \u26033 += (a.nextInt(this.f - this.g) + a.nextInt(this.f - this.g)) / 2;
        \u2603 = n;
        \u2603 = n2;
        if (\u2603 == \u26032 && \u2603 == \u26033) {
            if (this.c.v().a(new cj(\u2603 * 16 + 8, 64, \u2603 * 16 + 8), null) != ady.N) {
                return false;
            }
            final boolean a2 = this.c.v().a(\u2603 * 16 + 8, \u2603 * 16 + 8, 29, aqk.d);
            if (a2) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    protected aqu b(final int \u2603, final int \u2603) {
        return new a(this.c, this.b, \u2603, \u2603);
    }
    
    public List<ady.c> b() {
        return aqk.h;
    }
    
    static {
        d = Arrays.asList(ady.p, ady.N, ady.w, ady.z, ady.A);
        (h = Lists.newArrayList()).add(new ady.c(vt.class, 1, 2, 4));
    }
    
    public static class a extends aqu
    {
        private Set<adg> c;
        private boolean d;
        
        public a() {
            this.c = (Set<adg>)Sets.newHashSet();
        }
        
        public a(final adm \u2603, final Random \u2603, final int \u2603, final int \u2603) {
            super(\u2603, \u2603);
            this.c = (Set<adg>)Sets.newHashSet();
            this.b(\u2603, \u2603, \u2603, \u2603);
        }
        
        private void b(final adm \u2603, final Random \u2603, final int \u2603, final int \u2603) {
            \u2603.setSeed(\u2603.J());
            final long nextLong = \u2603.nextLong();
            final long nextLong2 = \u2603.nextLong();
            final long n = \u2603 * nextLong;
            final long n2 = \u2603 * nextLong2;
            \u2603.setSeed(n ^ n2 ^ \u2603.J());
            final int \u26032 = \u2603 * 16 + 8 - 29;
            final int \u26033 = \u2603 * 16 + 8 - 29;
            final cq a = cq.c.a.a(\u2603);
            this.a.add(new aql.h(\u2603, \u26032, \u26033, a));
            this.c();
            this.d = true;
        }
        
        @Override
        public void a(final adm \u2603, final Random \u2603, final aqe \u2603) {
            if (!this.d) {
                this.a.clear();
                this.b(\u2603, \u2603, this.e(), this.f());
            }
            super.a(\u2603, \u2603, \u2603);
        }
        
        @Override
        public boolean a(final adg \u2603) {
            return !this.c.contains(\u2603) && super.a(\u2603);
        }
        
        @Override
        public void b(final adg \u2603) {
            super.b(\u2603);
            this.c.add(\u2603);
        }
        
        @Override
        public void a(final dn \u2603) {
            super.a(\u2603);
            final du \u26032 = new du();
            for (final adg adg : this.c) {
                final dn \u26033 = new dn();
                \u26033.a("X", adg.a);
                \u26033.a("Z", adg.b);
                \u26032.a(\u26033);
            }
            \u2603.a("Processed", \u26032);
        }
        
        @Override
        public void b(final dn \u2603) {
            super.b(\u2603);
            if (\u2603.b("Processed", 9)) {
                final du c = \u2603.c("Processed", 10);
                for (int i = 0; i < c.c(); ++i) {
                    final dn b = c.b(i);
                    this.c.add(new adg(b.f("X"), b.f("Z")));
                }
            }
        }
    }
}
