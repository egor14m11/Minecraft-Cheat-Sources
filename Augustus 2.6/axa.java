// 
// Decompiled by Procyon v0.5.36
// 

public class axa extends axu
{
    private final axb a;
    private apz f;
    private String g;
    private String h;
    private String i;
    private a r;
    private avs s;
    private avs t;
    private avs u;
    
    public axa(final axb \u2603, final String \u2603) {
        this.f = apz.e();
        this.a = \u2603;
        this.a(\u2603);
    }
    
    public String a() {
        return this.f.toString();
    }
    
    public void a(final String \u2603) {
        this.f = apz.a(\u2603);
    }
    
    @Override
    public void b() {
        this.n.clear();
        this.g = bnq.a("createWorld.customize.flat.title", new Object[0]);
        this.h = bnq.a("createWorld.customize.flat.tile", new Object[0]);
        this.i = bnq.a("createWorld.customize.flat.height", new Object[0]);
        this.r = new a();
        this.n.add(this.s = new avs(2, this.l / 2 - 154, this.m - 52, 100, 20, bnq.a("createWorld.customize.flat.addLayer", new Object[0]) + " (NYI)"));
        this.n.add(this.t = new avs(3, this.l / 2 - 50, this.m - 52, 100, 20, bnq.a("createWorld.customize.flat.editLayer", new Object[0]) + " (NYI)"));
        this.n.add(this.u = new avs(4, this.l / 2 - 155, this.m - 52, 150, 20, bnq.a("createWorld.customize.flat.removeLayer", new Object[0])));
        this.n.add(new avs(0, this.l / 2 - 155, this.m - 28, 150, 20, bnq.a("gui.done", new Object[0])));
        this.n.add(new avs(5, this.l / 2 + 5, this.m - 52, 150, 20, bnq.a("createWorld.customize.presets", new Object[0])));
        this.n.add(new avs(1, this.l / 2 + 5, this.m - 28, 150, 20, bnq.a("gui.cancel", new Object[0])));
        final avs s = this.s;
        final avs t = this.t;
        final boolean b = false;
        t.m = b;
        s.m = b;
        this.f.d();
        this.f();
    }
    
    @Override
    public void k() {
        super.k();
        this.r.p();
    }
    
    @Override
    protected void a(final avs \u2603) {
        final int n = this.f.c().size() - this.r.u - 1;
        if (\u2603.k == 1) {
            this.j.a(this.a);
        }
        else if (\u2603.k == 0) {
            this.a.a = this.a();
            this.j.a(this.a);
        }
        else if (\u2603.k == 5) {
            this.j.a(new axq(this));
        }
        else if (\u2603.k == 4 && this.g()) {
            this.f.c().remove(n);
            this.r.u = Math.min(this.r.u, this.f.c().size() - 1);
        }
        this.f.d();
        this.f();
    }
    
    public void f() {
        final boolean g = this.g();
        this.u.l = g;
        this.t.l = g;
        this.t.l = false;
        this.s.l = false;
    }
    
    private boolean g() {
        return this.r.u > -1 && this.r.u < this.f.c().size();
    }
    
    @Override
    public void a(final int \u2603, final int \u2603, final float \u2603) {
        this.c();
        this.r.a(\u2603, \u2603, \u2603);
        this.a(this.q, this.g, this.l / 2, 8, 16777215);
        final int \u26032 = this.l / 2 - 92 - 16;
        this.c(this.q, this.h, \u26032, 32, 16777215);
        this.c(this.q, this.i, \u26032 + 2 + 213 - this.q.a(this.i), 32, 16777215);
        super.a(\u2603, \u2603, \u2603);
    }
    
    class a extends awi
    {
        public int u;
        
        public a() {
            super(axa.this.j, axa.this.l, axa.this.m, 43, axa.this.m - 60, 24);
            this.u = -1;
        }
        
        private void a(final int \u2603, final int \u2603, final zx \u2603) {
            this.e(\u2603 + 1, \u2603 + 1);
            bfl.B();
            if (\u2603 != null && \u2603.b() != null) {
                avc.c();
                axa.this.k.a(\u2603, \u2603 + 2, \u2603 + 2);
                avc.a();
            }
            bfl.C();
        }
        
        private void e(final int \u2603, final int \u2603) {
            this.d(\u2603, \u2603, 0, 0);
        }
        
        private void d(final int \u2603, final int \u2603, final int \u2603, final int \u2603) {
            bfl.c(1.0f, 1.0f, 1.0f, 1.0f);
            this.a.P().a(avp.c);
            final float n = 0.0078125f;
            final float n2 = 0.0078125f;
            final int n3 = 18;
            final int n4 = 18;
            final bfx a = bfx.a();
            final bfd c = a.c();
            c.a(7, bms.g);
            c.b(\u2603 + 0, \u2603 + 18, (double)axa.this.e).a((\u2603 + 0) * 0.0078125f, (\u2603 + 18) * 0.0078125f).d();
            c.b(\u2603 + 18, \u2603 + 18, (double)axa.this.e).a((\u2603 + 18) * 0.0078125f, (\u2603 + 18) * 0.0078125f).d();
            c.b(\u2603 + 18, \u2603 + 0, (double)axa.this.e).a((\u2603 + 18) * 0.0078125f, (\u2603 + 0) * 0.0078125f).d();
            c.b(\u2603 + 0, \u2603 + 0, (double)axa.this.e).a((\u2603 + 0) * 0.0078125f, (\u2603 + 0) * 0.0078125f).d();
            a.b();
        }
        
        @Override
        protected int b() {
            return axa.this.f.c().size();
        }
        
        @Override
        protected void a(final int \u2603, final boolean \u2603, final int \u2603, final int \u2603) {
            this.u = \u2603;
            axa.this.f();
        }
        
        @Override
        protected boolean a(final int \u2603) {
            return \u2603 == this.u;
        }
        
        @Override
        protected void a() {
        }
        
        @Override
        protected void a(final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603) {
            final aqa aqa = axa.this.f.c().get(axa.this.f.c().size() - \u2603 - 1);
            final alz c = aqa.c();
            final afh c2 = c.c();
            zw zw = zw.a(c2);
            zx zx = (c2 == afi.a || zw == null) ? null : new zx(zw, 1, c2.c(c));
            String f = (zx == null) ? "Air" : zw.a(zx);
            if (zw == null) {
                if (c2 == afi.j || c2 == afi.i) {
                    zw = zy.ax;
                }
                else if (c2 == afi.l || c2 == afi.k) {
                    zw = zy.ay;
                }
                if (zw != null) {
                    zx = new zx(zw, 1, c2.c(c));
                    f = c2.f();
                }
            }
            this.a(\u2603, \u2603, zx);
            axa.this.q.a(f, \u2603 + 18 + 5, \u2603 + 3, 16777215);
            String s;
            if (\u2603 == 0) {
                s = bnq.a("createWorld.customize.flat.layer.top", aqa.b());
            }
            else if (\u2603 == axa.this.f.c().size() - 1) {
                s = bnq.a("createWorld.customize.flat.layer.bottom", aqa.b());
            }
            else {
                s = bnq.a("createWorld.customize.flat.layer", aqa.b());
            }
            axa.this.q.a(s, \u2603 + 2 + 213 - axa.this.q.a(s), \u2603 + 3, 16777215);
        }
        
        @Override
        protected int d() {
            return this.b - 70;
        }
    }
}
