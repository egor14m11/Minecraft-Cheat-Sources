import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import com.google.common.collect.Lists;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class axy extends axu
{
    private final axu a;
    private final avh f;
    private final List<String> g;
    private final List<String> h;
    private String i;
    private String[] r;
    private a s;
    private avs t;
    
    public axy(final axu \u2603, final avh \u2603) {
        this.g = (List<String>)Lists.newArrayList();
        this.h = (List<String>)Lists.newArrayList();
        this.a = \u2603;
        this.f = \u2603;
    }
    
    @Override
    public void b() {
        this.i = bnq.a("options.snooper.title", new Object[0]);
        final String a = bnq.a("options.snooper.desc", new Object[0]);
        final List<String> arrayList = (List<String>)Lists.newArrayList();
        for (final String s : this.q.c(a, this.l - 30)) {
            arrayList.add(s);
        }
        this.r = arrayList.toArray(new String[arrayList.size()]);
        this.g.clear();
        this.h.clear();
        this.n.add(this.t = new avs(1, this.l / 2 - 152, this.m - 30, 150, 20, this.f.c(avh.a.u)));
        this.n.add(new avs(2, this.l / 2 + 2, this.m - 30, 150, 20, bnq.a("gui.done", new Object[0])));
        final boolean b = this.j.G() != null && this.j.G().av() != null;
        for (final Map.Entry<String, String> entry : new TreeMap(this.j.I().c()).entrySet()) {
            this.g.add((b ? "C " : "") + entry.getKey());
            this.h.add(this.q.a(entry.getValue(), this.l - 220));
        }
        if (b) {
            for (final Map.Entry<String, String> entry : new TreeMap(this.j.G().av().c()).entrySet()) {
                this.g.add("S " + entry.getKey());
                this.h.add(this.q.a(entry.getValue(), this.l - 220));
            }
        }
        this.s = new a();
    }
    
    @Override
    public void k() {
        super.k();
        this.s.p();
    }
    
    @Override
    protected void a(final avs \u2603) {
        if (!\u2603.l) {
            return;
        }
        if (\u2603.k == 2) {
            this.f.b();
            this.f.b();
            this.j.a(this.a);
        }
        if (\u2603.k == 1) {
            this.f.a(avh.a.u, 1);
            this.t.j = this.f.c(avh.a.u);
        }
    }
    
    @Override
    public void a(final int \u2603, final int \u2603, final float \u2603) {
        this.c();
        this.s.a(\u2603, \u2603, \u2603);
        this.a(this.q, this.i, this.l / 2, 8, 16777215);
        int \u26032 = 22;
        for (final String \u26033 : this.r) {
            this.a(this.q, \u26033, this.l / 2, \u26032, 8421504);
            \u26032 += this.q.a;
        }
        super.a(\u2603, \u2603, \u2603);
    }
    
    class a extends awi
    {
        public a() {
            super(axy.this.j, axy.this.l, axy.this.m, 80, axy.this.m - 40, axy.this.q.a + 1);
        }
        
        @Override
        protected int b() {
            return axy.this.g.size();
        }
        
        @Override
        protected void a(final int \u2603, final boolean \u2603, final int \u2603, final int \u2603) {
        }
        
        @Override
        protected boolean a(final int \u2603) {
            return false;
        }
        
        @Override
        protected void a() {
        }
        
        @Override
        protected void a(final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603) {
            axy.this.q.a(axy.this.g.get(\u2603), 10, \u2603, 16777215);
            axy.this.q.a(axy.this.h.get(\u2603), 230, \u2603, 16777215);
        }
        
        @Override
        protected int d() {
            return this.b - 10;
        }
    }
}
