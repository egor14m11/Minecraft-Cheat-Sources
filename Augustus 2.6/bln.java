// 
// Decompiled by Procyon v0.5.36
// 

public class bln extends bjl<bet>
{
    private boolean a;
    
    public bln(final biu \u2603) {
        this(\u2603, false);
    }
    
    public bln(final biu \u2603, final boolean \u2603) {
        super(\u2603, new bbr(0.0f, \u2603), 0.5f);
        this.a = \u2603;
        ((bjl<pr>)this).a(new bkx(this));
        ((bjl<pr>)this).a(new bky(this));
        ((bjl<pr>)this).a(new bko(this));
        ((bjl<pr>)this).a(new bkt(this));
        ((bjl<pr>)this).a(new bkp(this));
        ((bjl<pr>)this).a(new bks(this.g().e));
    }
    
    public bbr g() {
        return (bbr)super.b();
    }
    
    @Override
    public void a(final bet \u2603, final double \u2603, final double \u2603, final double \u2603, final float \u2603, final float \u2603) {
        if (\u2603.cc() && this.b.c != \u2603) {
            return;
        }
        double \u26032 = \u2603;
        if (\u2603.av() && !(\u2603 instanceof bew)) {
            \u26032 -= 0.125;
        }
        this.d(\u2603);
        super.a(\u2603, \u2603, \u26032, \u2603, \u2603, \u2603);
    }
    
    private void d(final bet \u2603) {
        final bbr g = this.g();
        if (\u2603.v()) {
            g.a(false);
            g.e.j = true;
            g.f.j = true;
        }
        else {
            final zx h = \u2603.bi.h();
            g.a(true);
            g.f.j = \u2603.a(wo.g);
            g.v.j = \u2603.a(wo.b);
            g.c.j = \u2603.a(wo.e);
            g.d.j = \u2603.a(wo.f);
            g.a.j = \u2603.a(wo.c);
            g.b.j = \u2603.a(wo.d);
            g.l = 0;
            g.o = false;
            g.n = \u2603.av();
            if (h == null) {
                g.m = 0;
            }
            else {
                g.m = 1;
                if (\u2603.bR() > 0) {
                    final aba m = h.m();
                    if (m == aba.d) {
                        g.m = 3;
                    }
                    else if (m == aba.e) {
                        g.o = true;
                    }
                }
            }
        }
    }
    
    @Override
    protected jy a(final bet \u2603) {
        return \u2603.i();
    }
    
    @Override
    public void C_() {
        bfl.b(0.0f, 0.1875f, 0.0f);
    }
    
    @Override
    protected void a(final bet \u2603, final float \u2603) {
        final float n = 0.9375f;
        bfl.a(n, n, n);
    }
    
    @Override
    protected void a(final bet \u2603, final double \u2603, double \u2603, final double \u2603, final String \u2603, final float \u2603, final double \u2603) {
        if (\u2603 < 100.0) {
            final auo cp = \u2603.cp();
            final auk a = cp.a(2);
            if (a != null) {
                final aum c = cp.c(\u2603.e_(), a);
                this.a(\u2603, c.c() + " " + a.d(), \u2603, \u2603, \u2603, 64);
                \u2603 += this.c().a * 1.15f * \u2603;
            }
        }
        super.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
    }
    
    public void b(final bet \u2603) {
        final float n = 1.0f;
        bfl.c(n, n, n);
        final bbr g = this.g();
        this.d(\u2603);
        g.p = 0.0f;
        g.n = false;
        g.a(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f, \u2603);
        g.a();
    }
    
    public void c(final bet \u2603) {
        final float n = 1.0f;
        bfl.c(n, n, n);
        final bbr g = this.g();
        this.d(\u2603);
        g.n = false;
        g.a(g.p = 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f, \u2603);
        g.b();
    }
    
    @Override
    protected void a(final bet \u2603, final double \u2603, final double \u2603, final double \u2603) {
        if (\u2603.ai() && \u2603.bJ()) {
            super.a(\u2603, \u2603 + \u2603.by, \u2603 + \u2603.bZ, \u2603 + \u2603.bz);
        }
        else {
            super.a(\u2603, \u2603, \u2603, \u2603);
        }
    }
    
    @Override
    protected void a(final bet \u2603, final float \u2603, final float \u2603, final float \u2603) {
        if (\u2603.ai() && \u2603.bJ()) {
            bfl.b(\u2603.ce(), 0.0f, 1.0f, 0.0f);
            bfl.b(this.b(\u2603), 0.0f, 0.0f, 1.0f);
            bfl.b(270.0f, 0.0f, 1.0f, 0.0f);
        }
        else {
            super.a(\u2603, \u2603, \u2603, \u2603);
        }
    }
}
