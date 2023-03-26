import java.util.Iterator;
import com.google.common.collect.Maps;
import com.google.common.collect.Lists;
import java.util.Map;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class axl extends axu
{
    protected axu a;
    private a f;
    private final avh g;
    private final bns h;
    private awe i;
    private awe r;
    
    public axl(final axu \u2603, final avh \u2603, final bns \u2603) {
        this.a = \u2603;
        this.g = \u2603;
        this.h = \u2603;
    }
    
    @Override
    public void b() {
        this.n.add(this.i = new awe(100, this.l / 2 - 155, this.m - 38, avh.a.E, this.g.c(avh.a.E)));
        this.n.add(this.r = new awe(6, this.l / 2 - 155 + 160, this.m - 38, bnq.a("gui.done", new Object[0])));
        (this.f = new a(this.j)).d(7, 8);
    }
    
    @Override
    public void k() {
        super.k();
        this.f.p();
    }
    
    @Override
    protected void a(final avs \u2603) {
        if (!\u2603.l) {
            return;
        }
        switch (\u2603.k) {
            case 100: {
                if (\u2603 instanceof awe) {
                    this.g.a(((awe)\u2603).c(), 1);
                    \u2603.j = this.g.c(avh.a.E);
                    final avr avr = new avr(this.j);
                    final int a = avr.a();
                    final int b = avr.b();
                    this.a(this.j, a, b);
                    break;
                }
                break;
            }
            case 5: {
                break;
            }
            case 6: {
                this.j.a(this.a);
                break;
            }
            default: {
                this.f.a(\u2603);
                break;
            }
        }
    }
    
    @Override
    public void a(final int \u2603, final int \u2603, final float \u2603) {
        this.f.a(\u2603, \u2603, \u2603);
        this.a(this.q, bnq.a("options.language", new Object[0]), this.l / 2, 16, 16777215);
        this.a(this.q, "(" + bnq.a("options.languageWarning", new Object[0]) + ")", this.l / 2, this.m - 56, 8421504);
        super.a(\u2603, \u2603, \u2603);
    }
    
    class a extends awi
    {
        private final List<String> v;
        private final Map<String, bnr> w;
        
        public a(final ave \u2603) {
            super(\u2603, axl.this.l, axl.this.m, 32, axl.this.m - 65 + 4, 18);
            this.v = (List<String>)Lists.newArrayList();
            this.w = (Map<String, bnr>)Maps.newHashMap();
            for (final bnr bnr : axl.this.h.d()) {
                this.w.put(bnr.a(), bnr);
                this.v.add(bnr.a());
            }
        }
        
        @Override
        protected int b() {
            return this.v.size();
        }
        
        @Override
        protected void a(final int \u2603, final boolean \u2603, final int \u2603, final int \u2603) {
            final bnr \u26032 = this.w.get(this.v.get(\u2603));
            axl.this.h.a(\u26032);
            axl.this.g.aM = \u26032.a();
            this.a.e();
            axl.this.q.a(axl.this.h.a() || axl.this.g.aN);
            axl.this.q.b(axl.this.h.b());
            axl.this.r.j = bnq.a("gui.done", new Object[0]);
            axl.this.i.j = axl.this.g.c(avh.a.E);
            axl.this.g.b();
        }
        
        @Override
        protected boolean a(final int \u2603) {
            return this.v.get(\u2603).equals(axl.this.h.c().a());
        }
        
        @Override
        protected int k() {
            return this.b() * 18;
        }
        
        @Override
        protected void a() {
            axl.this.c();
        }
        
        @Override
        protected void a(final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603) {
            axl.this.q.b(true);
            axl.this.a(axl.this.q, this.w.get(this.v.get(\u2603)).toString(), this.b / 2, \u2603 + 1, 16777215);
            axl.this.q.b(axl.this.h.c().b());
        }
    }
}
