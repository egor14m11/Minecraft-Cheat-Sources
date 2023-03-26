import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class ug extends ps implements uc, ud, vq
{
    public double a;
    public double b;
    public double c;
    public double[][] bk;
    public int bl;
    public ue[] bm;
    public ue bn;
    public ue bo;
    public ue bp;
    public ue bq;
    public ue br;
    public ue bs;
    public ue bt;
    public float bu;
    public float bv;
    public boolean bw;
    public boolean bx;
    private pk bA;
    public int by;
    public uf bz;
    
    public ug(final adm \u2603) {
        super(\u2603);
        this.bk = new double[64][3];
        this.bl = -1;
        this.bm = new ue[] { this.bn = new ue(this, "head", 6.0f, 6.0f), this.bo = new ue(this, "body", 8.0f, 8.0f), this.bp = new ue(this, "tail", 4.0f, 4.0f), this.bq = new ue(this, "tail", 4.0f, 4.0f), this.br = new ue(this, "tail", 4.0f, 4.0f), this.bs = new ue(this, "wing", 4.0f, 4.0f), this.bt = new ue(this, "wing", 4.0f, 4.0f) };
        this.i(this.bu());
        this.a(16.0f, 8.0f);
        this.T = true;
        this.ab = true;
        this.b = 100.0;
        this.ah = true;
    }
    
    @Override
    protected void aX() {
        super.aX();
        this.a(vy.a).a(200.0);
    }
    
    @Override
    protected void h() {
        super.h();
    }
    
    public double[] b(final int \u2603, float \u2603) {
        if (this.bn() <= 0.0f) {
            \u2603 = 0.0f;
        }
        \u2603 = 1.0f - \u2603;
        final int n = this.bl - \u2603 * 1 & 0x3F;
        final int n2 = this.bl - \u2603 * 1 - 1 & 0x3F;
        final double[] array = new double[3];
        double n3 = this.bk[n][0];
        double g = ns.g(this.bk[n2][0] - n3);
        array[0] = n3 + g * \u2603;
        n3 = this.bk[n][1];
        g = this.bk[n2][1] - n3;
        array[1] = n3 + g * \u2603;
        array[2] = this.bk[n][2] + (this.bk[n2][2] - this.bk[n][2]) * \u2603;
        return array;
    }
    
    @Override
    public void m() {
        if (this.o.D) {
            final float b = ns.b(this.bv * 3.1415927f * 2.0f);
            final float b2 = ns.b(this.bu * 3.1415927f * 2.0f);
            if (b2 <= -0.3f && b >= -0.3f && !this.R()) {
                this.o.a(this.s, this.t, this.u, "mob.enderdragon.wings", 5.0f, 0.8f + this.V.nextFloat() * 0.3f, false);
            }
        }
        this.bu = this.bv;
        if (this.bn() <= 0.0f) {
            final float b = (this.V.nextFloat() - 0.5f) * 8.0f;
            final float b2 = (this.V.nextFloat() - 0.5f) * 4.0f;
            final float b3 = (this.V.nextFloat() - 0.5f) * 8.0f;
            this.o.a(cy.b, this.s + b, this.t + 2.0 + b2, this.u + b3, 0.0, 0.0, 0.0, new int[0]);
            return;
        }
        this.n();
        float b = 0.2f / (ns.a(this.v * this.v + this.x * this.x) * 10.0f + 1.0f);
        b *= (float)Math.pow(2.0, this.w);
        if (this.bx) {
            this.bv += b * 0.5f;
        }
        else {
            this.bv += b;
        }
        this.y = ns.g(this.y);
        if (this.ce()) {
            this.bv = 0.5f;
            return;
        }
        if (this.bl < 0) {
            for (int i = 0; i < this.bk.length; ++i) {
                this.bk[i][0] = this.y;
                this.bk[i][1] = this.t;
            }
        }
        if (++this.bl == this.bk.length) {
            this.bl = 0;
        }
        this.bk[this.bl][0] = this.y;
        this.bk[this.bl][1] = this.t;
        if (this.o.D) {
            if (this.bc > 0) {
                final double n = this.s + (this.bd - this.s) / this.bc;
                final double a = this.t + (this.be - this.t) / this.bc;
                final double n2 = this.u + (this.bf - this.u) / this.bc;
                final double g = ns.g(this.bg - this.y);
                this.y += (float)(g / this.bc);
                this.z += (float)((this.bh - this.z) / this.bc);
                --this.bc;
                this.b(n, a, n2);
                this.b(this.y, this.z);
            }
        }
        else {
            final double n = this.a - this.s;
            double a = this.b - this.t;
            final double n2 = this.c - this.u;
            final double g = n * n + a * a + n2 * n2;
            if (this.bA != null) {
                this.a = this.bA.s;
                this.c = this.bA.u;
                final double n3 = this.a - this.s;
                final double n4 = this.c - this.u;
                final double sqrt = Math.sqrt(n3 * n3 + n4 * n4);
                double \u2603 = 0.4000000059604645 + sqrt / 80.0 - 1.0;
                if (\u2603 > 10.0) {
                    \u2603 = 10.0;
                }
                this.b = this.bA.aR().b + \u2603;
            }
            else {
                this.a += this.V.nextGaussian() * 2.0;
                this.c += this.V.nextGaussian() * 2.0;
            }
            if (this.bw || g < 100.0 || g > 22500.0 || this.D || this.E) {
                this.cf();
            }
            a /= ns.a(n * n + n2 * n2);
            final float a2 = 0.6f;
            a = ns.a(a, -a2, a2);
            this.w += a * 0.10000000149011612;
            this.y = ns.g(this.y);
            final double n5 = 180.0 - ns.b(n, n2) * 180.0 / 3.1415927410125732;
            double g2 = ns.g(n5 - this.y);
            if (g2 > 50.0) {
                g2 = 50.0;
            }
            if (g2 < -50.0) {
                g2 = -50.0;
            }
            final aui a3 = new aui(this.a - this.s, this.b - this.t, this.c - this.u).a();
            double \u2603 = -ns.b(this.y * 3.1415927f / 180.0f);
            final aui a4 = new aui(ns.a(this.y * 3.1415927f / 180.0f), this.w, \u2603).a();
            float n6 = ((float)a4.b(a3) + 0.5f) / 1.5f;
            if (n6 < 0.0f) {
                n6 = 0.0f;
            }
            this.bb *= 0.8f;
            final float n7 = ns.a(this.v * this.v + this.x * this.x) * 1.0f + 1.0f;
            double n8 = Math.sqrt(this.v * this.v + this.x * this.x) * 1.0 + 1.0;
            if (n8 > 40.0) {
                n8 = 40.0;
            }
            this.bb += (float)(g2 * (0.699999988079071 / n8 / n7));
            this.y += this.bb * 0.1f;
            final float n9 = (float)(2.0 / (n8 + 1.0));
            final float n10 = 0.06f;
            this.a(0.0f, -1.0f, n10 * (n6 * n9 + (1.0f - n9)));
            if (this.bx) {
                this.d(this.v * 0.800000011920929, this.w * 0.800000011920929, this.x * 0.800000011920929);
            }
            else {
                this.d(this.v, this.w, this.x);
            }
            final aui a5 = new aui(this.v, this.w, this.x).a();
            float n11 = ((float)a5.b(a4) + 1.0f) / 2.0f;
            n11 = 0.8f + 0.15f * n11;
            this.v *= n11;
            this.x *= n11;
            this.w *= 0.9100000262260437;
        }
        this.aI = this.y;
        final ue bn = this.bn;
        final ue bn2 = this.bn;
        final float n12 = 3.0f;
        bn2.K = n12;
        bn.J = n12;
        final ue bp = this.bp;
        final ue bp2 = this.bp;
        final float n13 = 2.0f;
        bp2.K = n13;
        bp.J = n13;
        final ue bq = this.bq;
        final ue bq2 = this.bq;
        final float n14 = 2.0f;
        bq2.K = n14;
        bq.J = n14;
        final ue br = this.br;
        final ue br2 = this.br;
        final float n15 = 2.0f;
        br2.K = n15;
        br.J = n15;
        this.bo.K = 3.0f;
        this.bo.J = 5.0f;
        this.bs.K = 2.0f;
        this.bs.J = 4.0f;
        this.bt.K = 3.0f;
        this.bt.J = 4.0f;
        final float b2 = (float)(this.b(5, 1.0f)[1] - this.b(10, 1.0f)[1]) * 10.0f / 180.0f * 3.1415927f;
        final float b3 = ns.b(b2);
        final float n16 = -ns.a(b2);
        final float n17 = this.y * 3.1415927f / 180.0f;
        final float a6 = ns.a(n17);
        final float b4 = ns.b(n17);
        this.bo.t_();
        this.bo.b(this.s + a6 * 0.5f, this.t, this.u - b4 * 0.5f, 0.0f, 0.0f);
        this.bs.t_();
        this.bs.b(this.s + b4 * 4.5f, this.t + 2.0, this.u + a6 * 4.5f, 0.0f, 0.0f);
        this.bt.t_();
        this.bt.b(this.s - b4 * 4.5f, this.t + 2.0, this.u - a6 * 4.5f, 0.0f, 0.0f);
        if (!this.o.D && this.au == 0) {
            this.a(this.o.b(this, this.bs.aR().b(4.0, 2.0, 4.0).c(0.0, -2.0, 0.0)));
            this.a(this.o.b(this, this.bt.aR().b(4.0, 2.0, 4.0).c(0.0, -2.0, 0.0)));
            this.b(this.o.b(this, this.bn.aR().b(1.0, 1.0, 1.0)));
        }
        final double[] b5 = this.b(5, 1.0f);
        final double[] b6 = this.b(0, 1.0f);
        final float a2 = ns.a(this.y * 3.1415927f / 180.0f - this.bb * 0.01f);
        final float b7 = ns.b(this.y * 3.1415927f / 180.0f - this.bb * 0.01f);
        this.bn.t_();
        this.bn.b(this.s + a2 * 5.5f * b3, this.t + (b6[1] - b5[1]) * 1.0 + n16 * 5.5f, this.u - b7 * 5.5f * b3, 0.0f, 0.0f);
        for (int j = 0; j < 3; ++j) {
            ue ue = null;
            if (j == 0) {
                ue = this.bp;
            }
            if (j == 1) {
                ue = this.bq;
            }
            if (j == 2) {
                ue = this.br;
            }
            final double[] b8 = this.b(12 + j * 2, 1.0f);
            final float n18 = this.y * 3.1415927f / 180.0f + this.b(b8[0] - b5[0]) * 3.1415927f / 180.0f * 1.0f;
            final float a7 = ns.a(n18);
            final float b9 = ns.b(n18);
            final float n19 = 1.5f;
            final float n20 = (j + 1) * 2.0f;
            ue.t_();
            ue.b(this.s - (a6 * n19 + a7 * n20) * b3, this.t + (b8[1] - b5[1]) * 1.0 - (n20 + n19) * n16 + 1.5, this.u + (b4 * n19 + b9 * n20) * b3, 0.0f, 0.0f);
        }
        if (!this.o.D) {
            this.bx = (this.b(this.bn.aR()) | this.b(this.bo.aR()));
        }
    }
    
    private void n() {
        if (this.bz != null) {
            if (this.bz.I) {
                if (!this.o.D) {
                    this.a(this.bn, ow.a((adi)null), 10.0f);
                }
                this.bz = null;
            }
            else if (this.W % 10 == 0 && this.bn() < this.bu()) {
                this.i(this.bn() + 1.0f);
            }
        }
        if (this.V.nextInt(10) == 0) {
            final float n = 32.0f;
            final List<uf> a = this.o.a((Class<? extends uf>)uf.class, this.aR().b(n, n, n));
            uf bz = null;
            double n2 = Double.MAX_VALUE;
            for (final uf uf : a) {
                final double h = uf.h(this);
                if (h < n2) {
                    n2 = h;
                    bz = uf;
                }
            }
            this.bz = bz;
        }
    }
    
    private void a(final List<pk> \u2603) {
        final double n = (this.bo.aR().a + this.bo.aR().d) / 2.0;
        final double n2 = (this.bo.aR().c + this.bo.aR().f) / 2.0;
        for (final pk pk : \u2603) {
            if (pk instanceof pr) {
                final double n3 = pk.s - n;
                final double n4 = pk.u - n2;
                final double n5 = n3 * n3 + n4 * n4;
                pk.g(n3 / n5 * 4.0, 0.20000000298023224, n4 / n5 * 4.0);
            }
        }
    }
    
    private void b(final List<pk> \u2603) {
        for (int i = 0; i < \u2603.size(); ++i) {
            final pk \u26032 = \u2603.get(i);
            if (\u26032 instanceof pr) {
                \u26032.a(ow.a(this), 10.0f);
                this.a(this, \u26032);
            }
        }
    }
    
    private void cf() {
        this.bw = false;
        final List<wn> arrayList = (List<wn>)Lists.newArrayList((Iterable<?>)this.o.j);
        final Iterator<wn> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().v()) {
                iterator.remove();
            }
        }
        if (this.V.nextInt(2) == 0 && !arrayList.isEmpty()) {
            this.bA = arrayList.get(this.V.nextInt(arrayList.size()));
        }
        else {
            boolean b;
            do {
                this.a = 0.0;
                this.b = 70.0f + this.V.nextFloat() * 50.0f;
                this.c = 0.0;
                this.a += this.V.nextFloat() * 120.0f - 60.0f;
                this.c += this.V.nextFloat() * 120.0f - 60.0f;
                final double n = this.s - this.a;
                final double n2 = this.t - this.b;
                final double n3 = this.u - this.c;
                b = (n * n + n2 * n2 + n3 * n3 > 100.0);
            } while (!b);
            this.bA = null;
        }
    }
    
    private float b(final double \u2603) {
        return (float)ns.g(\u2603);
    }
    
    private boolean b(final aug \u2603) {
        final int c = ns.c(\u2603.a);
        final int c2 = ns.c(\u2603.b);
        final int c3 = ns.c(\u2603.c);
        final int c4 = ns.c(\u2603.d);
        final int c5 = ns.c(\u2603.e);
        final int c6 = ns.c(\u2603.f);
        boolean b = false;
        boolean b2 = false;
        for (int i = c; i <= c4; ++i) {
            for (int j = c2; j <= c5; ++j) {
                for (int k = c3; k <= c6; ++k) {
                    final cj cj = new cj(i, j, k);
                    final afh c7 = this.o.p(cj).c();
                    if (c7.t() != arm.a) {
                        if (c7 == afi.cv || c7 == afi.Z || c7 == afi.bH || c7 == afi.h || c7 == afi.bX || !this.o.Q().b("mobGriefing")) {
                            b = true;
                        }
                        else {
                            b2 = (this.o.g(cj) || b2);
                        }
                    }
                }
            }
        }
        if (b2) {
            final double \u26032 = \u2603.a + (\u2603.d - \u2603.a) * this.V.nextFloat();
            final double \u26033 = \u2603.b + (\u2603.e - \u2603.b) * this.V.nextFloat();
            final double \u26034 = \u2603.c + (\u2603.f - \u2603.c) * this.V.nextFloat();
            this.o.a(cy.b, \u26032, \u26033, \u26034, 0.0, 0.0, 0.0, new int[0]);
        }
        return b;
    }
    
    @Override
    public boolean a(final ue \u2603, final ow \u2603, float \u2603) {
        if (\u2603 != this.bn) {
            \u2603 = \u2603 / 4.0f + 1.0f;
        }
        final float n = this.y * 3.1415927f / 180.0f;
        final float a = ns.a(n);
        final float b = ns.b(n);
        this.a = this.s + a * 5.0f + (this.V.nextFloat() - 0.5f) * 2.0f;
        this.b = this.t + this.V.nextFloat() * 3.0f + 1.0;
        this.c = this.u - b * 5.0f + (this.V.nextFloat() - 0.5f) * 2.0f;
        this.bA = null;
        if (\u2603.j() instanceof wn || \u2603.c()) {
            this.e(\u2603, \u2603);
        }
        return true;
    }
    
    @Override
    public boolean a(final ow \u2603, final float \u2603) {
        if (\u2603 instanceof ox && ((ox)\u2603).w()) {
            this.e(\u2603, \u2603);
        }
        return false;
    }
    
    protected boolean e(final ow \u2603, final float \u2603) {
        return super.a(\u2603, \u2603);
    }
    
    @Override
    public void G() {
        this.J();
    }
    
    @Override
    protected void aZ() {
        ++this.by;
        if (this.by >= 180 && this.by <= 200) {
            final float n = (this.V.nextFloat() - 0.5f) * 8.0f;
            final float n2 = (this.V.nextFloat() - 0.5f) * 4.0f;
            final float n3 = (this.V.nextFloat() - 0.5f) * 8.0f;
            this.o.a(cy.c, this.s + n, this.t + 2.0 + n2, this.u + n3, 0.0, 0.0, 0.0, new int[0]);
        }
        final boolean b = this.o.Q().b("doMobLoot");
        if (!this.o.D) {
            if (this.by > 150 && this.by % 5 == 0 && b) {
                int i = 1000;
                while (i > 0) {
                    final int n4 = pp.a(i);
                    i -= n4;
                    this.o.d(new pp(this.o, this.s, this.t, this.u, n4));
                }
            }
            if (this.by == 1) {
                this.o.a(1018, new cj(this), 0);
            }
        }
        this.d(0.0, 0.10000000149011612, 0.0);
        final float n5 = this.y + 20.0f;
        this.y = n5;
        this.aI = n5;
        if (this.by == 200 && !this.o.D) {
            if (b) {
                int i = 2000;
                while (i > 0) {
                    final int n4 = pp.a(i);
                    i -= n4;
                    this.o.d(new pp(this.o, this.s, this.t, this.u, n4));
                }
            }
            this.a(new cj(this.s, 64.0, this.u));
            this.J();
        }
    }
    
    private void a(final cj \u2603) {
        final int n = 4;
        final double n2 = 12.25;
        final double n3 = 6.25;
        for (int i = -1; i <= 32; ++i) {
            for (int j = -4; j <= 4; ++j) {
                for (int k = -4; k <= 4; ++k) {
                    final double n4 = j * j + k * k;
                    if (n4 <= 12.25) {
                        final cj a = \u2603.a(j, i, k);
                        if (i < 0) {
                            if (n4 <= 6.25) {
                                this.o.a(a, afi.h.Q());
                            }
                        }
                        else if (i > 0) {
                            this.o.a(a, afi.a.Q());
                        }
                        else if (n4 > 6.25) {
                            this.o.a(a, afi.h.Q());
                        }
                        else {
                            this.o.a(a, afi.bF.Q());
                        }
                    }
                }
            }
        }
        this.o.a(\u2603, afi.h.Q());
        this.o.a(\u2603.a(), afi.h.Q());
        final cj b = \u2603.b(2);
        this.o.a(b, afi.h.Q());
        this.o.a(b.e(), afi.aa.Q().a((amo<Comparable>)akf.a, cq.f));
        this.o.a(b.f(), afi.aa.Q().a((amo<Comparable>)akf.a, cq.e));
        this.o.a(b.c(), afi.aa.Q().a((amo<Comparable>)akf.a, cq.d));
        this.o.a(b.d(), afi.aa.Q().a((amo<Comparable>)akf.a, cq.c));
        this.o.a(\u2603.b(3), afi.h.Q());
        this.o.a(\u2603.b(4), afi.bI.Q());
    }
    
    @Override
    protected void D() {
    }
    
    @Override
    public pk[] aB() {
        return this.bm;
    }
    
    @Override
    public boolean ad() {
        return false;
    }
    
    @Override
    public adm a() {
        return this.o;
    }
    
    @Override
    protected String z() {
        return "mob.enderdragon.growl";
    }
    
    @Override
    protected String bo() {
        return "mob.enderdragon.hit";
    }
    
    @Override
    protected float bB() {
        return 5.0f;
    }
}
