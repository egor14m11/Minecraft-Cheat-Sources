import java.util.Iterator;
import java.util.List;
import com.google.common.base.Predicates;
import com.google.common.base.Predicate;

// 
// Decompiled by Procyon v0.5.36
// 

public class uk extends vv implements uc, vx
{
    private float[] a;
    private float[] b;
    private float[] c;
    private float[] bm;
    private int[] bn;
    private int[] bo;
    private int bp;
    private static final Predicate<pk> bq;
    
    public uk(final adm \u2603) {
        super(\u2603);
        this.a = new float[2];
        this.b = new float[2];
        this.c = new float[2];
        this.bm = new float[2];
        this.bn = new int[2];
        this.bo = new int[2];
        this.i(this.bu());
        this.a(0.9f, 3.5f);
        this.ab = true;
        ((sv)this.s()).d(true);
        this.i.a(0, new ra(this));
        this.i.a(2, new sa(this, 1.0, 40, 20.0f));
        this.i.a(5, new rz(this, 1.0));
        this.i.a(6, new ri(this, wn.class, 8.0f));
        this.i.a(7, new ry(this));
        this.bi.a(1, new sm(this, false, new Class[0]));
        this.bi.a(2, new sp<Object>(this, ps.class, 0, false, false, uk.bq));
        this.b_ = 50;
    }
    
    @Override
    protected void h() {
        super.h();
        this.ac.a(17, new Integer(0));
        this.ac.a(18, new Integer(0));
        this.ac.a(19, new Integer(0));
        this.ac.a(20, new Integer(0));
    }
    
    @Override
    public void b(final dn \u2603) {
        super.b(\u2603);
        \u2603.a("Invul", this.cl());
    }
    
    @Override
    public void a(final dn \u2603) {
        super.a(\u2603);
        this.r(\u2603.f("Invul"));
    }
    
    @Override
    protected String z() {
        return "mob.wither.idle";
    }
    
    @Override
    protected String bo() {
        return "mob.wither.hurt";
    }
    
    @Override
    protected String bp() {
        return "mob.wither.death";
    }
    
    @Override
    public void m() {
        this.w *= 0.6000000238418579;
        if (!this.o.D && this.s(0) > 0) {
            final pk a = this.o.a(this.s(0));
            if (a != null) {
                if (this.t < a.t || (!this.cm() && this.t < a.t + 5.0)) {
                    if (this.w < 0.0) {
                        this.w = 0.0;
                    }
                    this.w += (0.5 - this.w) * 0.6000000238418579;
                }
                final double n = a.s - this.s;
                final double t = a.u - this.u;
                final double u = n * n + t * t;
                if (u > 9.0) {
                    final double v = ns.a(u);
                    this.v += (n / v * 0.5 - this.v) * 0.6000000238418579;
                    this.x += (t / v * 0.5 - this.x) * 0.6000000238418579;
                }
            }
        }
        if (this.v * this.v + this.x * this.x > 0.05000000074505806) {
            this.y = (float)ns.b(this.x, this.v) * 57.295776f - 90.0f;
        }
        super.m();
        for (int i = 0; i < 2; ++i) {
            this.bm[i] = this.b[i];
            this.c[i] = this.a[i];
        }
        for (int i = 0; i < 2; ++i) {
            final int j = this.s(i + 1);
            pk a2 = null;
            if (j > 0) {
                a2 = this.o.a(j);
            }
            if (a2 != null) {
                final double t = this.t(i + 1);
                final double u = this.u(i + 1);
                final double v = this.v(i + 1);
                final double \u2603 = a2.s - t;
                final double \u26032 = a2.t + a2.aS() - u;
                final double \u26033 = a2.u - v;
                final double \u26034 = ns.a(\u2603 * \u2603 + \u26033 * \u26033);
                final float \u26035 = (float)(ns.b(\u26033, \u2603) * 180.0 / 3.1415927410125732) - 90.0f;
                final float \u26036 = (float)(-(ns.b(\u26032, \u26034) * 180.0 / 3.1415927410125732));
                this.a[i] = this.b(this.a[i], \u26036, 40.0f);
                this.b[i] = this.b(this.b[i], \u26035, 10.0f);
            }
            else {
                this.b[i] = this.b(this.b[i], this.aI, 10.0f);
            }
        }
        final boolean cm = this.cm();
        for (int j = 0; j < 3; ++j) {
            final double t2 = this.t(j);
            final double u2 = this.u(j);
            final double v2 = this.v(j);
            this.o.a(cy.l, t2 + this.V.nextGaussian() * 0.30000001192092896, u2 + this.V.nextGaussian() * 0.30000001192092896, v2 + this.V.nextGaussian() * 0.30000001192092896, 0.0, 0.0, 0.0, new int[0]);
            if (cm && this.o.s.nextInt(4) == 0) {
                this.o.a(cy.p, t2 + this.V.nextGaussian() * 0.30000001192092896, u2 + this.V.nextGaussian() * 0.30000001192092896, v2 + this.V.nextGaussian() * 0.30000001192092896, 0.699999988079071, 0.699999988079071, 0.5, new int[0]);
            }
        }
        if (this.cl() > 0) {
            for (int j = 0; j < 3; ++j) {
                this.o.a(cy.p, this.s + this.V.nextGaussian() * 1.0, this.t + this.V.nextFloat() * 3.3f, this.u + this.V.nextGaussian() * 1.0, 0.699999988079071, 0.699999988079071, 0.8999999761581421, new int[0]);
            }
        }
    }
    
    @Override
    protected void E() {
        if (this.cl() > 0) {
            final int i = this.cl() - 1;
            if (i <= 0) {
                this.o.a(this, this.s, this.t + this.aS(), this.u, 7.0f, false, this.o.Q().b("mobGriefing"));
                this.o.a(1013, new cj(this), 0);
            }
            this.r(i);
            if (this.W % 10 == 0) {
                this.h(10.0f);
            }
            return;
        }
        super.E();
        for (int i = 1; i < 3; ++i) {
            if (this.W >= this.bn[i - 1]) {
                this.bn[i - 1] = this.W + 10 + this.V.nextInt(10);
                if ((this.o.aa() == oj.c || this.o.aa() == oj.d) && this.bo[i - 1]++ > 15) {
                    final float n = 10.0f;
                    final float n2 = 5.0f;
                    final double a = ns.a(this.V, this.s - n, this.s + n);
                    final double a2 = ns.a(this.V, this.t - n2, this.t + n2);
                    final double a3 = ns.a(this.V, this.u - n, this.u + n);
                    this.a(i + 1, a, a2, a3, true);
                    this.bo[i - 1] = 0;
                }
                final int \u2603 = this.s(i);
                if (\u2603 > 0) {
                    final pk a4 = this.o.a(\u2603);
                    if (a4 == null || !a4.ai() || this.h(a4) > 900.0 || !this.t(a4)) {
                        this.b(i, 0);
                    }
                    else if (a4 instanceof wn && ((wn)a4).bA.a) {
                        this.b(i, 0);
                    }
                    else {
                        this.a(i + 1, (pr)a4);
                        this.bn[i - 1] = this.W + 40 + this.V.nextInt(20);
                        this.bo[i - 1] = 0;
                    }
                }
                else {
                    final List<pr> a5 = this.o.a((Class<? extends pr>)pr.class, this.aR().b(20.0, 8.0, 20.0), Predicates.and((Predicate<? super pr>)uk.bq, (Predicate<? super pr>)po.d));
                    int n3 = 0;
                    while (n3 < 10 && !a5.isEmpty()) {
                        final pr \u26032 = a5.get(this.V.nextInt(a5.size()));
                        if (\u26032 != this && \u26032.ai() && this.t(\u26032)) {
                            if (!(\u26032 instanceof wn)) {
                                this.b(i, \u26032.F());
                                break;
                            }
                            if (!((wn)\u26032).bA.a) {
                                this.b(i, \u26032.F());
                                break;
                            }
                            break;
                        }
                        else {
                            a5.remove(\u26032);
                            ++n3;
                        }
                    }
                }
            }
        }
        if (this.u() != null) {
            this.b(0, this.u().F());
        }
        else {
            this.b(0, 0);
        }
        if (this.bp > 0) {
            --this.bp;
            if (this.bp == 0 && this.o.Q().b("mobGriefing")) {
                final int i = ns.c(this.t);
                final int \u2603 = ns.c(this.s);
                final int c = ns.c(this.u);
                boolean b = false;
                for (int j = -1; j <= 1; ++j) {
                    for (int k = -1; k <= 1; ++k) {
                        for (int l = 0; l <= 3; ++l) {
                            final int \u26033 = \u2603 + j;
                            final int \u26034 = i + l;
                            final int \u26035 = c + k;
                            final cj cj = new cj(\u26033, \u26034, \u26035);
                            final afh c2 = this.o.p(cj).c();
                            if (c2.t() != arm.a && a(c2)) {
                                b = (this.o.b(cj, true) || b);
                            }
                        }
                    }
                }
                if (b) {
                    this.o.a(null, 1012, new cj(this), 0);
                }
            }
        }
        if (this.W % 20 == 0) {
            this.h(1.0f);
        }
    }
    
    public static boolean a(final afh \u2603) {
        return \u2603 != afi.h && \u2603 != afi.bF && \u2603 != afi.bG && \u2603 != afi.bX && \u2603 != afi.cv;
    }
    
    public void n() {
        this.r(220);
        this.i(this.bu() / 3.0f);
    }
    
    @Override
    public void aA() {
    }
    
    @Override
    public int br() {
        return 4;
    }
    
    private double t(final int \u2603) {
        if (\u2603 <= 0) {
            return this.s;
        }
        final float \u26032 = (this.aI + 180 * (\u2603 - 1)) / 180.0f * 3.1415927f;
        final float b = ns.b(\u26032);
        return this.s + b * 1.3;
    }
    
    private double u(final int \u2603) {
        if (\u2603 <= 0) {
            return this.t + 3.0;
        }
        return this.t + 2.2;
    }
    
    private double v(final int \u2603) {
        if (\u2603 <= 0) {
            return this.u;
        }
        final float \u26032 = (this.aI + 180 * (\u2603 - 1)) / 180.0f * 3.1415927f;
        final float a = ns.a(\u26032);
        return this.u + a * 1.3;
    }
    
    private float b(final float \u2603, final float \u2603, final float \u2603) {
        float g = ns.g(\u2603 - \u2603);
        if (g > \u2603) {
            g = \u2603;
        }
        if (g < -\u2603) {
            g = -\u2603;
        }
        return \u2603 + g;
    }
    
    private void a(final int \u2603, final pr \u2603) {
        this.a(\u2603, \u2603.s, \u2603.t + \u2603.aS() * 0.5, \u2603.u, \u2603 == 0 && this.V.nextFloat() < 0.001f);
    }
    
    private void a(final int \u2603, final double \u2603, final double \u2603, final double \u2603, final boolean \u2603) {
        this.o.a(null, 1014, new cj(this), 0);
        final double t = this.t(\u2603);
        final double u = this.u(\u2603);
        final double v = this.v(\u2603);
        final double \u26032 = \u2603 - t;
        final double \u26033 = \u2603 - u;
        final double \u26034 = \u2603 - v;
        final xd \u26035 = new xd(this.o, this, \u26032, \u26033, \u26034);
        if (\u2603) {
            \u26035.a(true);
        }
        \u26035.t = u;
        \u26035.s = t;
        \u26035.u = v;
        this.o.d(\u26035);
    }
    
    @Override
    public void a(final pr \u2603, final float \u2603) {
        this.a(0, \u2603);
    }
    
    @Override
    public boolean a(final ow \u2603, final float \u2603) {
        if (this.b(\u2603)) {
            return false;
        }
        if (\u2603 == ow.f || \u2603.j() instanceof uk) {
            return false;
        }
        if (this.cl() > 0 && \u2603 != ow.j) {
            return false;
        }
        if (this.cm()) {
            final pk pk = \u2603.i();
            if (pk instanceof wq) {
                return false;
            }
        }
        final pk pk = \u2603.j();
        if (pk != null) {
            if (!(pk instanceof wn)) {
                if (pk instanceof pr && ((pr)pk).bz() == this.bz()) {
                    return false;
                }
            }
        }
        if (this.bp <= 0) {
            this.bp = 20;
        }
        for (int i = 0; i < this.bo.length; ++i) {
            final int[] bo = this.bo;
            final int n = i;
            bo[n] += 3;
        }
        return super.a(\u2603, \u2603);
    }
    
    @Override
    protected void b(final boolean \u2603, final int \u2603) {
        final uz a = this.a(zy.bZ, 1);
        if (a != null) {
            a.u();
        }
        if (!this.o.D) {
            for (final wn wn : this.o.a((Class<? extends pk>)wn.class, this.aR().b(50.0, 100.0, 50.0))) {
                wn.b(mr.J);
            }
        }
    }
    
    @Override
    protected void D() {
        this.aQ = 0;
    }
    
    @Override
    public int b(final float \u2603) {
        return 15728880;
    }
    
    @Override
    public void e(final float \u2603, final float \u2603) {
    }
    
    @Override
    public void c(final pf \u2603) {
    }
    
    @Override
    protected void aX() {
        super.aX();
        this.a(vy.a).a(300.0);
        this.a(vy.d).a(0.6000000238418579);
        this.a(vy.b).a(40.0);
    }
    
    public float a(final int \u2603) {
        return this.b[\u2603];
    }
    
    public float b(final int \u2603) {
        return this.a[\u2603];
    }
    
    public int cl() {
        return this.ac.c(20);
    }
    
    public void r(final int \u2603) {
        this.ac.b(20, \u2603);
    }
    
    public int s(final int \u2603) {
        return this.ac.c(17 + \u2603);
    }
    
    public void b(final int \u2603, final int \u2603) {
        this.ac.b(17 + \u2603, \u2603);
    }
    
    public boolean cm() {
        return this.bn() <= this.bu() / 2.0f;
    }
    
    @Override
    public pw bz() {
        return pw.b;
    }
    
    @Override
    public void a(final pk \u2603) {
        this.m = null;
    }
    
    static {
        bq = new Predicate<pk>() {
            public boolean a(final pk \u2603) {
                return \u2603 instanceof pr && ((pr)\u2603).bz() != pw.b;
            }
        };
    }
}
