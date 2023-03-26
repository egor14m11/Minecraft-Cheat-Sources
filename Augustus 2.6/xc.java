import java.util.Iterator;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class xc extends wy
{
    private zx c;
    
    public xc(final adm \u2603) {
        super(\u2603);
    }
    
    public xc(final adm \u2603, final pr \u2603, final int \u2603) {
        this(\u2603, \u2603, new zx(zy.bz, 1, \u2603));
    }
    
    public xc(final adm \u2603, final pr \u2603, final zx \u2603) {
        super(\u2603, \u2603);
        this.c = \u2603;
    }
    
    public xc(final adm \u2603, final double \u2603, final double \u2603, final double \u2603, final int \u2603) {
        this(\u2603, \u2603, \u2603, \u2603, new zx(zy.bz, 1, \u2603));
    }
    
    public xc(final adm \u2603, final double \u2603, final double \u2603, final double \u2603, final zx \u2603) {
        super(\u2603, \u2603, \u2603, \u2603);
        this.c = \u2603;
    }
    
    @Override
    protected float m() {
        return 0.05f;
    }
    
    @Override
    protected float j() {
        return 0.5f;
    }
    
    @Override
    protected float l() {
        return -20.0f;
    }
    
    public void a(final int \u2603) {
        if (this.c == null) {
            this.c = new zx(zy.bz, 1, 0);
        }
        this.c.b(\u2603);
    }
    
    public int o() {
        if (this.c == null) {
            this.c = new zx(zy.bz, 1, 0);
        }
        return this.c.i();
    }
    
    @Override
    protected void a(final auh \u2603) {
        if (!this.o.D) {
            final List<pf> h = zy.bz.h(this.c);
            if (h != null && !h.isEmpty()) {
                final aug b = this.aR().b(4.0, 2.0, 4.0);
                final List<pr> a = this.o.a((Class<? extends pr>)pr.class, b);
                if (!a.isEmpty()) {
                    for (final pr pr : a) {
                        final double h2 = this.h(pr);
                        if (h2 < 16.0) {
                            double \u26032 = 1.0 - Math.sqrt(h2) / 4.0;
                            if (pr == \u2603.d) {
                                \u26032 = 1.0;
                            }
                            for (final pf pf : h) {
                                final int a2 = pf.a();
                                if (pe.a[a2].b()) {
                                    pe.a[a2].a(this, this.n(), pr, pf.c(), \u26032);
                                }
                                else {
                                    final int \u26033 = (int)(\u26032 * pf.b() + 0.5);
                                    if (\u26033 <= 20) {
                                        continue;
                                    }
                                    pr.c(new pf(a2, \u26033, pf.c()));
                                }
                            }
                        }
                    }
                }
            }
            this.o.b(2002, new cj(this), this.o());
            this.J();
        }
    }
    
    @Override
    public void a(final dn \u2603) {
        super.a(\u2603);
        if (\u2603.b("Potion", 10)) {
            this.c = zx.a(\u2603.m("Potion"));
        }
        else {
            this.a(\u2603.f("potionValue"));
        }
        if (this.c == null) {
            this.J();
        }
    }
    
    @Override
    public void b(final dn \u2603) {
        super.b(\u2603);
        if (this.c != null) {
            \u2603.a("Potion", this.c.b(new dn()));
        }
    }
}
