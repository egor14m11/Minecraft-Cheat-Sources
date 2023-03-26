import java.util.Random;
import java.util.Iterator;
import java.util.Map;
import com.google.common.collect.Lists;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class aqo extends aqq
{
    private List<ady> d;
    private boolean f;
    private adg[] g;
    private double h;
    private int i;
    
    public aqo() {
        this.g = new adg[3];
        this.h = 32.0;
        this.i = 3;
        this.d = (List<ady>)Lists.newArrayList();
        for (final ady ady : ady.n()) {
            if (ady != null && ady.an > 0.0f) {
                this.d.add(ady);
            }
        }
    }
    
    public aqo(final Map<String, String> \u2603) {
        this();
        for (final Map.Entry<String, String> entry : \u2603.entrySet()) {
            if (entry.getKey().equals("distance")) {
                this.h = ns.a(entry.getValue(), this.h, 1.0);
            }
            else if (entry.getKey().equals("count")) {
                this.g = new adg[ns.a(entry.getValue(), this.g.length, 1)];
            }
            else {
                if (!entry.getKey().equals("spread")) {
                    continue;
                }
                this.i = ns.a(entry.getValue(), this.i, 1);
            }
        }
    }
    
    @Override
    public String a() {
        return "Stronghold";
    }
    
    @Override
    protected boolean a(final int \u2603, final int \u2603) {
        if (!this.f) {
            final Random \u26032 = new Random();
            \u26032.setSeed(this.c.J());
            double n = \u26032.nextDouble() * 3.141592653589793 * 2.0;
            int n2 = 1;
            for (int i = 0; i < this.g.length; ++i) {
                final double n3 = (1.25 * n2 + \u26032.nextDouble()) * (this.h * n2);
                int \u26033 = (int)Math.round(Math.cos(n) * n3);
                int \u26034 = (int)Math.round(Math.sin(n) * n3);
                final cj a = this.c.v().a((\u26033 << 4) + 8, (\u26034 << 4) + 8, 112, this.d, \u26032);
                if (a != null) {
                    \u26033 = a.n() >> 4;
                    \u26034 = a.p() >> 4;
                }
                this.g[i] = new adg(\u26033, \u26034);
                n += 6.283185307179586 * n2 / this.i;
                if (i == this.i) {
                    n2 += 2 + \u26032.nextInt(5);
                    this.i += 1 + \u26032.nextInt(2);
                }
            }
            this.f = true;
        }
        for (final adg adg : this.g) {
            if (\u2603 == adg.a && \u2603 == adg.b) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    protected List<cj> z_() {
        final List<cj> arrayList = (List<cj>)Lists.newArrayList();
        for (final adg adg : this.g) {
            if (adg != null) {
                arrayList.add(adg.a(64));
            }
        }
        return arrayList;
    }
    
    @Override
    protected aqu b(final int \u2603, final int \u2603) {
        a a;
        for (a = new a(this.c, this.b, \u2603, \u2603); a.b().isEmpty() || a.b().get(0).b == null; a = new a(this.c, this.b, \u2603, \u2603)) {}
        return a;
    }
    
    public static class a extends aqu
    {
        public a() {
        }
        
        public a(final adm \u2603, final Random \u2603, final int \u2603, final int \u2603) {
            super(\u2603, \u2603);
            aqp.b();
            final aqp.m \u26032 = new aqp.m(0, \u2603, (\u2603 << 4) + 2, (\u2603 << 4) + 2);
            this.a.add(\u26032);
            \u26032.a(\u26032, this.a, \u2603);
            final List<aqt> c = \u26032.c;
            while (!c.isEmpty()) {
                final int nextInt = \u2603.nextInt(c.size());
                final aqt aqt = c.remove(nextInt);
                aqt.a(\u26032, this.a, \u2603);
            }
            this.c();
            this.a(\u2603, \u2603, 10);
        }
    }
}
