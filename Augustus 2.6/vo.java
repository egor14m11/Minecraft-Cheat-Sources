import java.util.Random;
import java.util.List;
import java.util.Comparator;
import java.util.Collections;
import com.google.common.collect.Sets;
import com.google.common.base.Predicate;
import java.util.Set;
import java.util.UUID;

// 
// Decompiled by Procyon v0.5.36
// 

public class vo extends vv
{
    private static final UUID a;
    private static final qd b;
    private static final Set<afh> c;
    private boolean bm;
    
    public vo(final adm \u2603) {
        super(\u2603);
        this.a(0.6f, 2.9f);
        this.S = 1.0f;
        this.i.a(0, new ra(this));
        this.i.a(2, new rl(this, 1.0, false));
        this.i.a(7, new rz(this, 1.0));
        this.i.a(8, new ri(this, wn.class, 8.0f));
        this.i.a(8, new ry(this));
        this.i.a(10, new a(this));
        this.i.a(11, new c(this));
        this.bi.a(1, new sm(this, false, new Class[0]));
        this.bi.a(2, new b(this));
        this.bi.a(3, new sp<Object>(this, vp.class, 10, true, false, new Predicate<vp>() {
            public boolean a(final vp \u2603) {
                return \u2603.n();
            }
        }));
    }
    
    @Override
    protected void aX() {
        super.aX();
        this.a(vy.a).a(40.0);
        this.a(vy.d).a(0.30000001192092896);
        this.a(vy.e).a(7.0);
        this.a(vy.b).a(64.0);
    }
    
    @Override
    protected void h() {
        super.h();
        this.ac.a(16, new Short((short)0));
        this.ac.a(17, new Byte((byte)0));
        this.ac.a(18, new Byte((byte)0));
    }
    
    @Override
    public void b(final dn \u2603) {
        super.b(\u2603);
        final alz cm = this.cm();
        \u2603.a("carried", (short)afh.a(cm.c()));
        \u2603.a("carriedData", (short)cm.c().c(cm));
    }
    
    @Override
    public void a(final dn \u2603) {
        super.a(\u2603);
        alz \u26032;
        if (\u2603.b("carried", 8)) {
            \u26032 = afh.b(\u2603.j("carried")).a(\u2603.e("carriedData") & 0xFFFF);
        }
        else {
            \u26032 = afh.c(\u2603.e("carried")).a(\u2603.e("carriedData") & 0xFFFF);
        }
        this.a(\u26032);
    }
    
    private boolean c(final wn \u2603) {
        final zx zx = \u2603.bi.b[3];
        if (zx != null && zx.b() == zw.a(afi.aU)) {
            return false;
        }
        final aui a = \u2603.d(1.0f).a();
        aui a2 = new aui(this.s - \u2603.s, this.aR().b + this.K / 2.0f - (\u2603.t + \u2603.aS()), this.u - \u2603.u);
        final double b = a2.b();
        a2 = a2.a();
        final double b2 = a.b(a2);
        return b2 > 1.0 - 0.025 / b && \u2603.t(this);
    }
    
    @Override
    public float aS() {
        return 2.55f;
    }
    
    @Override
    public void m() {
        if (this.o.D) {
            for (int i = 0; i < 2; ++i) {
                this.o.a(cy.y, this.s + (this.V.nextDouble() - 0.5) * this.J, this.t + this.V.nextDouble() * this.K - 0.25, this.u + (this.V.nextDouble() - 0.5) * this.J, (this.V.nextDouble() - 0.5) * 2.0, -this.V.nextDouble(), (this.V.nextDouble() - 0.5) * 2.0, new int[0]);
            }
        }
        this.aY = false;
        super.m();
    }
    
    @Override
    protected void E() {
        if (this.U()) {
            this.a(ow.f, 1.0f);
        }
        if (this.co() && !this.bm && this.V.nextInt(100) == 0) {
            this.a(false);
        }
        if (this.o.w()) {
            final float c = this.c(1.0f);
            if (c > 0.5f && this.o.i(new cj(this)) && this.V.nextFloat() * 30.0f < (c - 0.4f) * 2.0f) {
                this.d((pr)null);
                this.a(false);
                this.bm = false;
                this.n();
            }
        }
        super.E();
    }
    
    protected boolean n() {
        final double \u2603 = this.s + (this.V.nextDouble() - 0.5) * 64.0;
        final double \u26032 = this.t + (this.V.nextInt(64) - 32);
        final double \u26033 = this.u + (this.V.nextDouble() - 0.5) * 64.0;
        return this.k(\u2603, \u26032, \u26033);
    }
    
    protected boolean b(final pk \u2603) {
        aui a = new aui(this.s - \u2603.s, this.aR().b + this.K / 2.0f - \u2603.t + \u2603.aS(), this.u - \u2603.u);
        a = a.a();
        final double n = 16.0;
        final double \u26032 = this.s + (this.V.nextDouble() - 0.5) * 8.0 - a.a * n;
        final double \u26033 = this.t + (this.V.nextInt(16) - 8) - a.b * n;
        final double \u26034 = this.u + (this.V.nextDouble() - 0.5) * 8.0 - a.c * n;
        return this.k(\u26032, \u26033, \u26034);
    }
    
    protected boolean k(final double \u2603, final double \u2603, final double \u2603) {
        final double s = this.s;
        final double t = this.t;
        final double u = this.u;
        this.s = \u2603;
        this.t = \u2603;
        this.u = \u2603;
        boolean b = false;
        cj \u26032 = new cj(this.s, this.t, this.u);
        if (this.o.e(\u26032)) {
            boolean b2 = false;
            while (!b2 && \u26032.o() > 0) {
                final cj b3 = \u26032.b();
                final afh c = this.o.p(b3).c();
                if (c.t().c()) {
                    b2 = true;
                }
                else {
                    --this.t;
                    \u26032 = b3;
                }
            }
            if (b2) {
                super.a(this.s, this.t, this.u);
                if (this.o.a(this, this.aR()).isEmpty() && !this.o.d(this.aR())) {
                    b = true;
                }
            }
        }
        if (b) {
            for (int n = 128, i = 0; i < n; ++i) {
                final double n2 = i / (n - 1.0);
                final float n3 = (this.V.nextFloat() - 0.5f) * 0.2f;
                final float n4 = (this.V.nextFloat() - 0.5f) * 0.2f;
                final float n5 = (this.V.nextFloat() - 0.5f) * 0.2f;
                final double \u26033 = s + (this.s - s) * n2 + (this.V.nextDouble() - 0.5) * this.J * 2.0;
                final double \u26034 = t + (this.t - t) * n2 + this.V.nextDouble() * this.K;
                final double \u26035 = u + (this.u - u) * n2 + (this.V.nextDouble() - 0.5) * this.J * 2.0;
                this.o.a(cy.y, \u26033, \u26034, \u26035, n3, n4, n5, new int[0]);
            }
            this.o.a(s, t, u, "mob.endermen.portal", 1.0f, 1.0f);
            this.a("mob.endermen.portal", 1.0f, 1.0f);
            return true;
        }
        this.b(s, t, u);
        return false;
    }
    
    @Override
    protected String z() {
        return this.co() ? "mob.endermen.scream" : "mob.endermen.idle";
    }
    
    @Override
    protected String bo() {
        return "mob.endermen.hit";
    }
    
    @Override
    protected String bp() {
        return "mob.endermen.death";
    }
    
    @Override
    protected zw A() {
        return zy.bu;
    }
    
    @Override
    protected void b(final boolean \u2603, final int \u2603) {
        final zw a = this.A();
        if (a != null) {
            for (int nextInt = this.V.nextInt(2 + \u2603), i = 0; i < nextInt; ++i) {
                this.a(a, 1);
            }
        }
    }
    
    public void a(final alz \u2603) {
        this.ac.b(16, (short)(afh.f(\u2603) & 0xFFFF));
    }
    
    public alz cm() {
        return afh.d(this.ac.b(16) & 0xFFFF);
    }
    
    @Override
    public boolean a(final ow \u2603, final float \u2603) {
        if (this.b(\u2603)) {
            return false;
        }
        if (\u2603.j() == null || !(\u2603.j() instanceof vp)) {
            if (!this.o.D) {
                this.a(true);
            }
            if (\u2603 instanceof ox && \u2603.j() instanceof wn) {
                if (\u2603.j() instanceof lf && ((lf)\u2603.j()).c.d()) {
                    this.a(false);
                }
                else {
                    this.bm = true;
                }
            }
            if (\u2603 instanceof oy) {
                this.bm = false;
                for (int i = 0; i < 64; ++i) {
                    if (this.n()) {
                        return true;
                    }
                }
                return false;
            }
        }
        final boolean a = super.a(\u2603, \u2603);
        if (\u2603.e() && this.V.nextInt(10) != 0) {
            this.n();
        }
        return a;
    }
    
    public boolean co() {
        return this.ac.a(18) > 0;
    }
    
    public void a(final boolean \u2603) {
        this.ac.b(18, (byte)(\u2603 ? 1 : 0));
    }
    
    static {
        a = UUID.fromString("020E0DFB-87AE-4653-9556-831010E291A0");
        b = new qd(vo.a, "Attacking speed boost", 0.15000000596046448, 0).a(false);
        (c = Sets.newIdentityHashSet()).add(afi.c);
        vo.c.add(afi.d);
        vo.c.add(afi.m);
        vo.c.add(afi.n);
        vo.c.add(afi.N);
        vo.c.add(afi.O);
        vo.c.add(afi.P);
        vo.c.add(afi.Q);
        vo.c.add(afi.W);
        vo.c.add(afi.aK);
        vo.c.add(afi.aL);
        vo.c.add(afi.aU);
        vo.c.add(afi.bk);
        vo.c.add(afi.bw);
    }
    
    static class b extends sp
    {
        private wn g;
        private int h;
        private int i;
        private vo j;
        
        public b(final vo \u2603) {
            super(\u2603, wn.class, true);
            this.j = \u2603;
        }
        
        @Override
        public boolean a() {
            final double f = this.f();
            final List<wn> a = this.e.o.a((Class<? extends wn>)wn.class, this.e.aR().b(f, 4.0, f), (Predicate<? super wn>)this.c);
            Collections.sort(a, this.b);
            if (a.isEmpty()) {
                return false;
            }
            this.g = a.get(0);
            return true;
        }
        
        @Override
        public void c() {
            this.h = 5;
            this.i = 0;
        }
        
        @Override
        public void d() {
            this.g = null;
            this.j.a(false);
            final qc a = this.j.a(vy.d);
            a.c(vo.b);
            super.d();
        }
        
        @Override
        public boolean b() {
            if (this.g == null) {
                return super.b();
            }
            if (!this.j.c(this.g)) {
                return false;
            }
            this.j.bm = true;
            this.j.a(this.g, 10.0f, 10.0f);
            return true;
        }
        
        @Override
        public void e() {
            if (this.g != null) {
                if (--this.h <= 0) {
                    this.d = this.g;
                    this.g = null;
                    super.c();
                    this.j.a("mob.endermen.stare", 1.0f, 1.0f);
                    this.j.a(true);
                    final qc a = this.j.a(vy.d);
                    a.b(vo.b);
                }
            }
            else {
                if (this.d != null) {
                    if (this.d instanceof wn && this.j.c((wn)this.d)) {
                        if (this.d.h(this.j) < 16.0) {
                            this.j.n();
                        }
                        this.i = 0;
                    }
                    else if (this.d.h(this.j) > 256.0 && this.i++ >= 30 && this.j.b((pk)this.d)) {
                        this.i = 0;
                    }
                }
                super.e();
            }
        }
    }
    
    static class a extends rd
    {
        private vo a;
        
        public a(final vo \u2603) {
            this.a = \u2603;
        }
        
        @Override
        public boolean a() {
            return this.a.o.Q().b("mobGriefing") && this.a.cm().c().t() != arm.a && this.a.bc().nextInt(2000) == 0;
        }
        
        @Override
        public void e() {
            final Random bc = this.a.bc();
            final adm o = this.a.o;
            final int c = ns.c(this.a.s - 1.0 + bc.nextDouble() * 2.0);
            final int c2 = ns.c(this.a.t + bc.nextDouble() * 2.0);
            final int c3 = ns.c(this.a.u - 1.0 + bc.nextDouble() * 2.0);
            final cj \u2603 = new cj(c, c2, c3);
            final afh c4 = o.p(\u2603).c();
            final afh c5 = o.p(\u2603.b()).c();
            if (this.a(o, \u2603, this.a.cm().c(), c4, c5)) {
                o.a(\u2603, this.a.cm(), 3);
                this.a.a(afi.a.Q());
            }
        }
        
        private boolean a(final adm \u2603, final cj \u2603, final afh \u2603, final afh \u2603, final afh \u2603) {
            return \u2603.d(\u2603, \u2603) && \u2603.t() == arm.a && \u2603.t() != arm.a && \u2603.d();
        }
    }
    
    static class c extends rd
    {
        private vo a;
        
        public c(final vo \u2603) {
            this.a = \u2603;
        }
        
        @Override
        public boolean a() {
            return this.a.o.Q().b("mobGriefing") && this.a.cm().c().t() == arm.a && this.a.bc().nextInt(20) == 0;
        }
        
        @Override
        public void e() {
            final Random bc = this.a.bc();
            final adm o = this.a.o;
            final int c = ns.c(this.a.s - 2.0 + bc.nextDouble() * 4.0);
            final int c2 = ns.c(this.a.t + bc.nextDouble() * 3.0);
            final int c3 = ns.c(this.a.u - 2.0 + bc.nextDouble() * 4.0);
            final cj cj = new cj(c, c2, c3);
            final alz p = o.p(cj);
            final afh c4 = p.c();
            if (vo.c.contains(c4)) {
                this.a.a(p);
                o.a(cj, afi.a.Q());
            }
        }
    }
}
