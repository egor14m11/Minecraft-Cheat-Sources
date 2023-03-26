import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import com.google.common.base.Predicate;

// 
// Decompiled by Procyon v0.5.36
// 

public class vt extends vv
{
    private float a;
    private float b;
    private float c;
    private float bm;
    private float bn;
    private pr bo;
    private int bp;
    private boolean bq;
    private rz br;
    
    public vt(final adm \u2603) {
        super(\u2603);
        this.b_ = 10;
        this.a(0.85f, 0.85f);
        this.i.a(4, new a(this));
        final rp rp;
        this.i.a(5, rp = new rp(this, 1.0));
        this.i.a(7, this.br = new rz(this, 1.0, 80));
        this.i.a(8, new ri(this, wn.class, 8.0f));
        this.i.a(8, new ri(this, vt.class, 12.0f, 0.01f));
        this.i.a(9, new ry(this));
        this.br.a(3);
        rp.a(3);
        this.bi.a(1, new sp<Object>(this, pr.class, 10, true, false, new b(this)));
        this.f = new c(this);
        final float nextFloat = this.V.nextFloat();
        this.a = nextFloat;
        this.b = nextFloat;
    }
    
    @Override
    protected void aX() {
        super.aX();
        this.a(vy.e).a(6.0);
        this.a(vy.d).a(0.5);
        this.a(vy.b).a(16.0);
        this.a(vy.a).a(30.0);
    }
    
    @Override
    public void a(final dn \u2603) {
        super.a(\u2603);
        this.a(\u2603.n("Elder"));
    }
    
    @Override
    public void b(final dn \u2603) {
        super.b(\u2603);
        \u2603.a("Elder", this.cn());
    }
    
    @Override
    protected sw b(final adm \u2603) {
        return new sy(this, \u2603);
    }
    
    @Override
    protected void h() {
        super.h();
        this.ac.a(16, Integer.valueOf(0));
        this.ac.a(17, Integer.valueOf(0));
    }
    
    private boolean a(final int \u2603) {
        return (this.ac.c(16) & \u2603) != 0x0;
    }
    
    private void a(final int \u2603, final boolean \u2603) {
        final int c = this.ac.c(16);
        if (\u2603) {
            this.ac.b(16, c | \u2603);
        }
        else {
            this.ac.b(16, c & ~\u2603);
        }
    }
    
    public boolean n() {
        return this.a(2);
    }
    
    private void l(final boolean \u2603) {
        this.a(2, \u2603);
    }
    
    public int cm() {
        if (this.cn()) {
            return 60;
        }
        return 80;
    }
    
    public boolean cn() {
        return this.a(4);
    }
    
    public void a(final boolean \u2603) {
        this.a(4, \u2603);
        if (\u2603) {
            this.a(1.9975f, 1.9975f);
            this.a(vy.d).a(0.30000001192092896);
            this.a(vy.e).a(8.0);
            this.a(vy.a).a(80.0);
            this.bX();
            this.br.b(400);
        }
    }
    
    public void co() {
        this.a(true);
        final float n = 1.0f;
        this.bm = n;
        this.bn = n;
    }
    
    private void b(final int \u2603) {
        this.ac.b(17, \u2603);
    }
    
    public boolean cp() {
        return this.ac.c(17) != 0;
    }
    
    public pr cq() {
        if (!this.cp()) {
            return null;
        }
        if (!this.o.D) {
            return this.u();
        }
        if (this.bo != null) {
            return this.bo;
        }
        final pk a = this.o.a(this.ac.c(17));
        if (a instanceof pr) {
            return this.bo = (pr)a;
        }
        return null;
    }
    
    @Override
    public void i(final int \u2603) {
        super.i(\u2603);
        if (\u2603 == 16) {
            if (this.cn() && this.J < 1.0f) {
                this.a(1.9975f, 1.9975f);
            }
        }
        else if (\u2603 == 17) {
            this.bp = 0;
            this.bo = null;
        }
    }
    
    @Override
    public int w() {
        return 160;
    }
    
    @Override
    protected String z() {
        if (!this.V()) {
            return "mob.guardian.land.idle";
        }
        if (this.cn()) {
            return "mob.guardian.elder.idle";
        }
        return "mob.guardian.idle";
    }
    
    @Override
    protected String bo() {
        if (!this.V()) {
            return "mob.guardian.land.hit";
        }
        if (this.cn()) {
            return "mob.guardian.elder.hit";
        }
        return "mob.guardian.hit";
    }
    
    @Override
    protected String bp() {
        if (!this.V()) {
            return "mob.guardian.land.death";
        }
        if (this.cn()) {
            return "mob.guardian.elder.death";
        }
        return "mob.guardian.death";
    }
    
    @Override
    protected boolean s_() {
        return false;
    }
    
    @Override
    public float aS() {
        return this.K * 0.5f;
    }
    
    @Override
    public float a(final cj \u2603) {
        if (this.o.p(\u2603).c().t() == arm.h) {
            return 10.0f + this.o.o(\u2603) - 0.5f;
        }
        return super.a(\u2603);
    }
    
    @Override
    public void m() {
        if (this.o.D) {
            this.b = this.a;
            if (!this.V()) {
                this.c = 2.0f;
                if (this.w > 0.0 && this.bq && !this.R()) {
                    this.o.a(this.s, this.t, this.u, "mob.guardian.flop", 1.0f, 1.0f, false);
                }
                this.bq = (this.w < 0.0 && this.o.d(new cj(this).b(), false));
            }
            else if (this.n()) {
                if (this.c < 0.5f) {
                    this.c = 4.0f;
                }
                else {
                    this.c += (0.5f - this.c) * 0.1f;
                }
            }
            else {
                this.c += (0.125f - this.c) * 0.2f;
            }
            this.a += this.c;
            this.bn = this.bm;
            if (!this.V()) {
                this.bm = this.V.nextFloat();
            }
            else if (this.n()) {
                this.bm += (0.0f - this.bm) * 0.25f;
            }
            else {
                this.bm += (1.0f - this.bm) * 0.06f;
            }
            if (this.n() && this.V()) {
                final aui d = this.d(0.0f);
                for (int i = 0; i < 2; ++i) {
                    this.o.a(cy.e, this.s + (this.V.nextDouble() - 0.5) * this.J - d.a * 1.5, this.t + this.V.nextDouble() * this.K - d.b * 1.5, this.u + (this.V.nextDouble() - 0.5) * this.J - d.c * 1.5, 0.0, 0.0, 0.0, new int[0]);
                }
            }
            if (this.cp()) {
                if (this.bp < this.cm()) {
                    ++this.bp;
                }
                final pr cq = this.cq();
                if (cq != null) {
                    this.p().a(cq, 90.0f, 90.0f);
                    this.p().a();
                    final double n = this.q(0.0f);
                    double n2 = cq.s - this.s;
                    double n3 = cq.t + cq.K * 0.5f - (this.t + this.aS());
                    double n4 = cq.u - this.u;
                    final double sqrt = Math.sqrt(n2 * n2 + n3 * n3 + n4 * n4);
                    n2 /= sqrt;
                    n3 /= sqrt;
                    n4 /= sqrt;
                    double nextDouble = this.V.nextDouble();
                    while (nextDouble < sqrt) {
                        nextDouble += 1.8 - n + this.V.nextDouble() * (1.7 - n);
                        this.o.a(cy.e, this.s + n2 * nextDouble, this.t + n3 * nextDouble + this.aS(), this.u + n4 * nextDouble, 0.0, 0.0, 0.0, new int[0]);
                    }
                }
            }
        }
        if (this.Y) {
            this.h(300);
        }
        else if (this.C) {
            this.w += 0.5;
            this.v += (this.V.nextFloat() * 2.0f - 1.0f) * 0.4f;
            this.x += (this.V.nextFloat() * 2.0f - 1.0f) * 0.4f;
            this.y = this.V.nextFloat() * 360.0f;
            this.C = false;
            this.ai = true;
        }
        if (this.cp()) {
            this.y = this.aK;
        }
        super.m();
    }
    
    public float a(final float \u2603) {
        return this.b + (this.a - this.b) * \u2603;
    }
    
    public float p(final float \u2603) {
        return this.bn + (this.bm - this.bn) * \u2603;
    }
    
    public float q(final float \u2603) {
        return (this.bp + \u2603) / this.cm();
    }
    
    @Override
    protected void E() {
        super.E();
        if (this.cn()) {
            final int n = 1200;
            final int n2 = 1200;
            final int n3 = 6000;
            final int n4 = 2;
            if ((this.W + this.F()) % 1200 == 0) {
                final pe f = pe.f;
                final List<lf> b = this.o.b((Class<? extends lf>)lf.class, (Predicate<? super lf>)new Predicate<lf>() {
                    public boolean a(final lf \u2603) {
                        return vt.this.h(\u2603) < 2500.0 && \u2603.c.c();
                    }
                });
                for (final lf lf : b) {
                    if (!lf.a(f) || lf.b(f).c() < 2 || lf.b(f).b() < 1200) {
                        lf.a.a(new gm(10, 0.0f));
                        lf.c(new pf(f.H, 6000, 2));
                    }
                }
            }
            if (!this.ck()) {
                this.a(new cj(this), 16);
            }
        }
    }
    
    @Override
    protected void b(final boolean \u2603, final int \u2603) {
        final int \u26032 = this.V.nextInt(3) + this.V.nextInt(\u2603 + 1);
        if (\u26032 > 0) {
            this.a(new zx(zy.cC, \u26032, 0), 1.0f);
        }
        if (this.V.nextInt(3 + \u2603) > 1) {
            this.a(new zx(zy.aU, 1, zp.a.a.a()), 1.0f);
        }
        else if (this.V.nextInt(3 + \u2603) > 1) {
            this.a(new zx(zy.cD, 1, 0), 1.0f);
        }
        if (\u2603 && this.cn()) {
            this.a(new zx(afi.v, 1, 1), 1.0f);
        }
    }
    
    @Override
    protected void bq() {
        final zx a = oa.a(this.V, ur.j()).a(this.V);
        this.a(a, 1.0f);
    }
    
    @Override
    protected boolean n_() {
        return true;
    }
    
    @Override
    public boolean bS() {
        return this.o.a(this.aR(), this) && this.o.a(this, this.aR()).isEmpty();
    }
    
    @Override
    public boolean bR() {
        return (this.V.nextInt(20) == 0 || !this.o.j(new cj(this))) && super.bR();
    }
    
    @Override
    public boolean a(final ow \u2603, final float \u2603) {
        if (!this.n() && !\u2603.s() && \u2603.i() instanceof pr) {
            final pr pr = (pr)\u2603.i();
            if (!\u2603.c()) {
                pr.a(ow.a((pk)this), 2.0f);
                pr.a("damage.thorns", 0.5f, 1.0f);
            }
        }
        this.br.f();
        return super.a(\u2603, \u2603);
    }
    
    @Override
    public int bQ() {
        return 180;
    }
    
    @Override
    public void g(final float \u2603, final float \u2603) {
        if (this.bM()) {
            if (this.V()) {
                this.a(\u2603, \u2603, 0.1f);
                this.d(this.v, this.w, this.x);
                this.v *= 0.8999999761581421;
                this.w *= 0.8999999761581421;
                this.x *= 0.8999999761581421;
                if (!this.n() && this.u() == null) {
                    this.w -= 0.005;
                }
            }
            else {
                super.g(\u2603, \u2603);
            }
        }
        else {
            super.g(\u2603, \u2603);
        }
    }
    
    static class b implements Predicate<pr>
    {
        private vt a;
        
        public b(final vt \u2603) {
            this.a = \u2603;
        }
        
        public boolean a(final pr \u2603) {
            return (\u2603 instanceof wn || \u2603 instanceof tx) && \u2603.h(this.a) > 9.0;
        }
    }
    
    static class a extends rd
    {
        private vt a;
        private int b;
        
        public a(final vt \u2603) {
            this.a = \u2603;
            this.a(3);
        }
        
        @Override
        public boolean a() {
            final pr u = this.a.u();
            return u != null && u.ai();
        }
        
        @Override
        public boolean b() {
            return super.b() && (this.a.cn() || this.a.h(this.a.u()) > 9.0);
        }
        
        @Override
        public void c() {
            this.b = -10;
            this.a.s().n();
            this.a.p().a(this.a.u(), 90.0f, 90.0f);
            this.a.ai = true;
        }
        
        @Override
        public void d() {
            this.a.b(0);
            this.a.d((pr)null);
            this.a.br.f();
        }
        
        @Override
        public void e() {
            final pr u = this.a.u();
            this.a.s().n();
            this.a.p().a(u, 90.0f, 90.0f);
            if (!this.a.t(u)) {
                this.a.d((pr)null);
                return;
            }
            ++this.b;
            if (this.b == 0) {
                this.a.b(this.a.u().F());
                this.a.o.a(this.a, (byte)21);
            }
            else if (this.b >= this.a.cm()) {
                float \u2603 = 1.0f;
                if (this.a.o.aa() == oj.d) {
                    \u2603 += 2.0f;
                }
                if (this.a.cn()) {
                    \u2603 += 2.0f;
                }
                u.a(ow.b(this.a, this.a), \u2603);
                u.a(ow.a(this.a), (float)this.a.a(vy.e).e());
                this.a.d((pr)null);
            }
            else if (this.b < 60 || this.b % 20 == 0) {}
            super.e();
        }
    }
    
    static class c extends qq
    {
        private vt g;
        
        public c(final vt \u2603) {
            super(\u2603);
            this.g = \u2603;
        }
        
        @Override
        public void c() {
            if (!this.f || this.g.s().m()) {
                this.g.k(0.0f);
                this.g.l(false);
                return;
            }
            final double \u2603 = this.b - this.g.s;
            double n = this.c - this.g.t;
            final double \u26032 = this.d - this.g.u;
            double \u26033 = \u2603 * \u2603 + n * n + \u26032 * \u26032;
            \u26033 = ns.a(\u26033);
            n /= \u26033;
            final float \u26034 = (float)(ns.b(\u26032, \u2603) * 180.0 / 3.1415927410125732) - 90.0f;
            this.g.y = this.a(this.g.y, \u26034, 30.0f);
            this.g.aI = this.g.y;
            final float n2 = (float)(this.e * this.g.a(vy.d).e());
            this.g.k(this.g.bI() + (n2 - this.g.bI()) * 0.125f);
            double n3 = Math.sin((this.g.W + this.g.F()) * 0.5) * 0.05;
            final double cos = Math.cos(this.g.y * 3.1415927f / 180.0f);
            final double sin = Math.sin(this.g.y * 3.1415927f / 180.0f);
            final vt g = this.g;
            g.v += n3 * cos;
            final vt g2 = this.g;
            g2.x += n3 * sin;
            n3 = Math.sin((this.g.W + this.g.F()) * 0.75) * 0.05;
            final vt g3 = this.g;
            g3.w += n3 * (sin + cos) * 0.25;
            final vt g4 = this.g;
            g4.w += this.g.bI() * n * 0.1;
            final qp p = this.g.p();
            final double n4 = this.g.s + \u2603 / \u26033 * 2.0;
            final double n5 = this.g.aS() + this.g.t + n / \u26033 * 1.0;
            final double n6 = this.g.u + \u26032 / \u26033 * 2.0;
            double e = p.e();
            double f = p.f();
            double g5 = p.g();
            if (!p.b()) {
                e = n4;
                f = n5;
                g5 = n6;
            }
            this.g.p().a(e + (n4 - e) * 0.125, f + (n5 - f) * 0.125, g5 + (n6 - g5) * 0.125, 10.0f, 40.0f);
            this.g.l(true);
        }
    }
}
