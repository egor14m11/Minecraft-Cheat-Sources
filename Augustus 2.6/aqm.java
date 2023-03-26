import java.util.Arrays;
import java.util.Random;
import java.util.Iterator;
import java.util.Map;
import com.google.common.collect.Lists;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class aqm extends aqq
{
    private static final List<ady> d;
    private List<ady.c> f;
    private int g;
    private int h;
    
    public aqm() {
        this.f = (List<ady.c>)Lists.newArrayList();
        this.g = 32;
        this.h = 8;
        this.f.add(new ady.c(wd.class, 1, 1, 1));
    }
    
    public aqm(final Map<String, String> \u2603) {
        this();
        for (final Map.Entry<String, String> entry : \u2603.entrySet()) {
            if (entry.getKey().equals("distance")) {
                this.g = ns.a(entry.getValue(), this.g, this.h + 1);
            }
        }
    }
    
    @Override
    public String a() {
        return "Temple";
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
        final Random a = this.c.a(\u26032, \u26033, 14357617);
        \u26032 *= this.g;
        \u26033 *= this.g;
        \u26032 += a.nextInt(this.g - this.h);
        \u26033 += a.nextInt(this.g - this.h);
        \u2603 = n;
        \u2603 = n2;
        if (\u2603 == \u26032 && \u2603 == \u26033) {
            final ady a2 = this.c.v().a(new cj(\u2603 * 16 + 8, 0, \u2603 * 16 + 8));
            if (a2 == null) {
                return false;
            }
            for (final ady ady : aqm.d) {
                if (a2 == ady) {
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    protected aqu b(final int \u2603, final int \u2603) {
        return new a(this.c, this.b, \u2603, \u2603);
    }
    
    public boolean a(final cj \u2603) {
        final aqu c = this.c(\u2603);
        if (c == null || !(c instanceof a) || c.a.isEmpty()) {
            return false;
        }
        final aqt aqt = c.a.getFirst();
        return aqt instanceof aqn.d;
    }
    
    public List<ady.c> b() {
        return this.f;
    }
    
    static {
        d = Arrays.asList(ady.r, ady.G, ady.K, ady.L, ady.v);
    }
    
    public static class a extends aqu
    {
        public a() {
        }
        
        public a(final adm \u2603, final Random \u2603, final int \u2603, final int \u2603) {
            super(\u2603, \u2603);
            final ady b = \u2603.b(new cj(\u2603 * 16 + 8, 0, \u2603 * 16 + 8));
            if (b == ady.K || b == ady.L) {
                final aqn.b e = new aqn.b(\u2603, \u2603 * 16, \u2603 * 16);
                this.a.add(e);
            }
            else if (b == ady.v) {
                final aqn.d e2 = new aqn.d(\u2603, \u2603 * 16, \u2603 * 16);
                this.a.add(e2);
            }
            else if (b == ady.r || b == ady.G) {
                final aqn.a e3 = new aqn.a(\u2603, \u2603 * 16, \u2603 * 16);
                this.a.add(e3);
            }
            this.c();
        }
    }
}
