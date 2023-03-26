import java.util.Arrays;
import java.util.Random;
import java.util.Iterator;
import java.util.Map;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class aqv extends aqq
{
    public static final List<ady> d;
    private int f;
    private int g;
    private int h;
    
    public aqv() {
        this.g = 32;
        this.h = 8;
    }
    
    public aqv(final Map<String, String> \u2603) {
        this();
        for (final Map.Entry<String, String> entry : \u2603.entrySet()) {
            if (entry.getKey().equals("size")) {
                this.f = ns.a(entry.getValue(), this.f, 0);
            }
            else {
                if (!entry.getKey().equals("distance")) {
                    continue;
                }
                this.g = ns.a(entry.getValue(), this.g, this.h + 1);
            }
        }
    }
    
    @Override
    public String a() {
        return "Village";
    }
    
    @Override
    protected boolean a(int \u2603, int \u2603) {
        final int n = \u2603;
        final int n2 = \u2603;
        if (\u2603 < 0) {
            \u2603 -= this.g - 1;
        }
        if (\u2603 < 0) {
            \u2603 -= this.g - 1;
        }
        int \u26032 = \u2603 / this.g;
        int \u26033 = \u2603 / this.g;
        final Random a = this.c.a(\u26032, \u26033, 10387312);
        \u26032 *= this.g;
        \u26033 *= this.g;
        \u26032 += a.nextInt(this.g - this.h);
        \u26033 += a.nextInt(this.g - this.h);
        \u2603 = n;
        \u2603 = n2;
        if (\u2603 == \u26032 && \u2603 == \u26033) {
            final boolean a2 = this.c.v().a(\u2603 * 16 + 8, \u2603 * 16 + 8, 0, aqv.d);
            if (a2) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    protected aqu b(final int \u2603, final int \u2603) {
        return new a(this.c, this.b, \u2603, \u2603, this.f);
    }
    
    static {
        d = Arrays.asList(ady.q, ady.r, ady.Y);
    }
    
    public static class a extends aqu
    {
        private boolean c;
        
        public a() {
        }
        
        public a(final adm \u2603, final Random \u2603, final int \u2603, final int \u2603, final int \u2603) {
            super(\u2603, \u2603);
            final List<aqw.e> a = aqw.a(\u2603, \u2603);
            final aqw.k k = new aqw.k(\u2603.v(), 0, \u2603, (\u2603 << 4) + 2, (\u2603 << 4) + 2, a, \u2603);
            this.a.add(k);
            k.a(k, this.a, \u2603);
            final List<aqt> g = k.g;
            final List<aqt> f = k.f;
            while (!g.isEmpty() || !f.isEmpty()) {
                if (g.isEmpty()) {
                    final int n = \u2603.nextInt(f.size());
                    final aqt aqt = f.remove(n);
                    aqt.a(k, this.a, \u2603);
                }
                else {
                    final int n = \u2603.nextInt(g.size());
                    final aqt aqt = g.remove(n);
                    aqt.a(k, this.a, \u2603);
                }
            }
            this.c();
            int n = 0;
            for (final aqt aqt2 : this.a) {
                if (!(aqt2 instanceof aqw.o)) {
                    ++n;
                }
            }
            this.c = (n > 2);
        }
        
        @Override
        public boolean d() {
            return this.c;
        }
        
        @Override
        public void a(final dn \u2603) {
            super.a(\u2603);
            \u2603.a("Valid", this.c);
        }
        
        @Override
        public void b(final dn \u2603) {
            super.b(\u2603);
            this.c = \u2603.n("Valid");
        }
    }
}
