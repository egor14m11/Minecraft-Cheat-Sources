import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public class vr extends pq implements vq
{
    private int a;
    
    public vr(final adm \u2603) {
        super(\u2603);
        this.a = 1;
        this.a(4.0f, 4.0f);
        this.ab = true;
        this.b_ = 5;
        this.f = new b(this);
        this.i.a(5, new d(this));
        this.i.a(7, new a(this));
        this.i.a(7, new c(this));
        this.bi.a(1, new so(this));
    }
    
    public boolean n() {
        return this.ac.a(16) != 0;
    }
    
    public void a(final boolean \u2603) {
        this.ac.b(16, (byte)(\u2603 ? 1 : 0));
    }
    
    public int cf() {
        return this.a;
    }
    
    @Override
    public void t_() {
        super.t_();
        if (!this.o.D && this.o.aa() == oj.a) {
            this.J();
        }
    }
    
    @Override
    public boolean a(final ow \u2603, final float \u2603) {
        if (this.b(\u2603)) {
            return false;
        }
        if ("fireball".equals(\u2603.p()) && \u2603.j() instanceof wn) {
            super.a(\u2603, 1000.0f);
            ((wn)\u2603.j()).b(mr.z);
            return true;
        }
        return super.a(\u2603, \u2603);
    }
    
    @Override
    protected void h() {
        super.h();
        this.ac.a(16, (Byte)0);
    }
    
    @Override
    protected void aX() {
        super.aX();
        this.a(vy.a).a(10.0);
        this.a(vy.b).a(100.0);
    }
    
    @Override
    protected String z() {
        return "mob.ghast.moan";
    }
    
    @Override
    protected String bo() {
        return "mob.ghast.scream";
    }
    
    @Override
    protected String bp() {
        return "mob.ghast.death";
    }
    
    @Override
    protected zw A() {
        return zy.H;
    }
    
    @Override
    protected void b(final boolean \u2603, final int \u2603) {
        for (int n = this.V.nextInt(2) + this.V.nextInt(1 + \u2603), i = 0; i < n; ++i) {
            this.a(zy.bw, 1);
        }
        for (int n = this.V.nextInt(3) + this.V.nextInt(1 + \u2603), i = 0; i < n; ++i) {
            this.a(zy.H, 1);
        }
    }
    
    @Override
    protected float bB() {
        return 10.0f;
    }
    
    @Override
    public boolean bR() {
        return this.V.nextInt(20) == 0 && super.bR() && this.o.aa() != oj.a;
    }
    
    @Override
    public int bV() {
        return 1;
    }
    
    @Override
    public void b(final dn \u2603) {
        super.b(\u2603);
        \u2603.a("ExplosionPower", this.a);
    }
    
    @Override
    public void a(final dn \u2603) {
        super.a(\u2603);
        if (\u2603.b("ExplosionPower", 99)) {
            this.a = \u2603.f("ExplosionPower");
        }
    }
    
    @Override
    public float aS() {
        return 2.6f;
    }
    
    static class b extends qq
    {
        private vr g;
        private int h;
        
        public b(final vr \u2603) {
            super(\u2603);
            this.g = \u2603;
        }
        
        @Override
        public void c() {
            if (!this.f) {
                return;
            }
            final double n = this.b - this.g.s;
            final double n2 = this.c - this.g.t;
            final double n3 = this.d - this.g.u;
            double n4 = n * n + n2 * n2 + n3 * n3;
            if (this.h-- <= 0) {
                this.h += this.g.bc().nextInt(5) + 2;
                n4 = ns.a(n4);
                if (this.b(this.b, this.c, this.d, n4)) {
                    final vr g = this.g;
                    g.v += n / n4 * 0.1;
                    final vr g2 = this.g;
                    g2.w += n2 / n4 * 0.1;
                    final vr g3 = this.g;
                    g3.x += n3 / n4 * 0.1;
                }
                else {
                    this.f = false;
                }
            }
        }
        
        private boolean b(final double \u2603, final double \u2603, final double \u2603, final double \u2603) {
            final double \u26032 = (\u2603 - this.g.s) / \u2603;
            final double \u26033 = (\u2603 - this.g.t) / \u2603;
            final double \u26034 = (\u2603 - this.g.u) / \u2603;
            aug \u26035 = this.g.aR();
            for (int n = 1; n < \u2603; ++n) {
                \u26035 = \u26035.c(\u26032, \u26033, \u26034);
                if (!this.g.o.a(this.g, \u26035).isEmpty()) {
                    return false;
                }
            }
            return true;
        }
    }
    
    static class d extends rd
    {
        private vr a;
        
        public d(final vr \u2603) {
            this.a = \u2603;
            this.a(1);
        }
        
        @Override
        public boolean a() {
            final qq q = this.a.q();
            if (!q.a()) {
                return true;
            }
            final double n = q.d() - this.a.s;
            final double n2 = q.e() - this.a.t;
            final double n3 = q.f() - this.a.u;
            final double n4 = n * n + n2 * n2 + n3 * n3;
            return n4 < 1.0 || n4 > 3600.0;
        }
        
        @Override
        public boolean b() {
            return false;
        }
        
        @Override
        public void c() {
            final Random bc = this.a.bc();
            final double \u2603 = this.a.s + (bc.nextFloat() * 2.0f - 1.0f) * 16.0f;
            final double \u26032 = this.a.t + (bc.nextFloat() * 2.0f - 1.0f) * 16.0f;
            final double \u26033 = this.a.u + (bc.nextFloat() * 2.0f - 1.0f) * 16.0f;
            this.a.q().a(\u2603, \u26032, \u26033, 1.0);
        }
    }
    
    static class a extends rd
    {
        private vr a;
        
        public a(final vr \u2603) {
            this.a = \u2603;
            this.a(2);
        }
        
        @Override
        public boolean a() {
            return true;
        }
        
        @Override
        public void e() {
            if (this.a.u() == null) {
                final vr a = this.a;
                final vr a2 = this.a;
                final float n = -(float)ns.b(this.a.v, this.a.x) * 180.0f / 3.1415927f;
                a2.y = n;
                a.aI = n;
            }
            else {
                final pr u = this.a.u();
                final double n2 = 64.0;
                if (u.h(this.a) < n2 * n2) {
                    final double \u2603 = u.s - this.a.s;
                    final double \u26032 = u.u - this.a.u;
                    final vr a3 = this.a;
                    final vr a4 = this.a;
                    final float n3 = -(float)ns.b(\u2603, \u26032) * 180.0f / 3.1415927f;
                    a4.y = n3;
                    a3.aI = n3;
                }
            }
        }
    }
    
    static class c extends rd
    {
        private vr b;
        public int a;
        
        public c(final vr \u2603) {
            this.b = \u2603;
        }
        
        @Override
        public boolean a() {
            return this.b.u() != null;
        }
        
        @Override
        public void c() {
            this.a = 0;
        }
        
        @Override
        public void d() {
            this.b.a(false);
        }
        
        @Override
        public void e() {
            final pr u = this.b.u();
            final double n = 64.0;
            if (u.h(this.b) < n * n && this.b.t(u)) {
                final adm o = this.b.o;
                ++this.a;
                if (this.a == 10) {
                    o.a(null, 1007, new cj(this.b), 0);
                }
                if (this.a == 20) {
                    final double n2 = 4.0;
                    final aui d = this.b.d(1.0f);
                    final double \u2603 = u.s - (this.b.s + d.a * n2);
                    final double \u26032 = u.aR().b + u.K / 2.0f - (0.5 + this.b.t + this.b.K / 2.0f);
                    final double \u26033 = u.u - (this.b.u + d.c * n2);
                    o.a(null, 1008, new cj(this.b), 0);
                    final wu \u26034 = new wu(o, this.b, \u2603, \u26032, \u26033);
                    \u26034.e = this.b.cf();
                    \u26034.s = this.b.s + d.a * n2;
                    \u26034.t = this.b.t + this.b.K / 2.0f + 0.5;
                    \u26034.u = this.b.u + d.c * n2;
                    o.d(\u26034);
                    this.a = -40;
                }
            }
            else if (this.a > 0) {
                --this.a;
            }
            this.b.a(this.a > 10);
        }
    }
}
