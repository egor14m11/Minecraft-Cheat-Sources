import java.util.Random;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class afr extends afh
{
    public static final amn a;
    
    public afr() {
        super(arm.f, arn.m);
        this.j(this.M.b().a((amo<Comparable>)afr.a, 0));
    }
    
    @Override
    public void a(final adm \u2603, final cj \u2603, final alz \u2603, final aug \u2603, final List<aug> \u2603, final pk \u2603) {
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 0.3125f, 1.0f);
        super.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        final float n = 0.125f;
        this.a(0.0f, 0.0f, 0.0f, n, 1.0f, 1.0f);
        super.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, n);
        super.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        this.a(1.0f - n, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
        super.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        this.a(0.0f, 0.0f, 1.0f - n, 1.0f, 1.0f, 1.0f);
        super.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        this.j();
    }
    
    @Override
    public void j() {
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
    }
    
    @Override
    public boolean c() {
        return false;
    }
    
    @Override
    public boolean d() {
        return false;
    }
    
    @Override
    public void a(final adm \u2603, final cj \u2603, final alz \u2603, final pk \u2603) {
        final int intValue = \u2603.b((amo<Integer>)afr.a);
        final float n = \u2603.o() + (6.0f + 3 * intValue) / 16.0f;
        if (!\u2603.D && \u2603.at() && intValue > 0 && \u2603.aR().b <= n) {
            \u2603.N();
            this.a(\u2603, \u2603, \u2603, intValue - 1);
        }
    }
    
    @Override
    public boolean a(final adm \u2603, final cj \u2603, final alz \u2603, final wn \u2603, final cq \u2603, final float \u2603, final float \u2603, final float \u2603) {
        if (\u2603.D) {
            return true;
        }
        final zx h = \u2603.bi.h();
        if (h == null) {
            return true;
        }
        final int intValue = \u2603.b((amo<Integer>)afr.a);
        final zw b = h.b();
        if (b == zy.ax) {
            if (intValue < 3) {
                if (!\u2603.bA.d) {
                    \u2603.bi.a(\u2603.bi.c, new zx(zy.aw));
                }
                \u2603.b(na.I);
                this.a(\u2603, \u2603, \u2603, 3);
            }
            return true;
        }
        if (b == zy.bA) {
            if (intValue > 0) {
                if (!\u2603.bA.d) {
                    final zx k = new zx(zy.bz, 1, 0);
                    if (!\u2603.bi.a(k)) {
                        \u2603.d(new uz(\u2603, \u2603.n() + 0.5, \u2603.o() + 1.5, \u2603.p() + 0.5, k));
                    }
                    else if (\u2603 instanceof lf) {
                        ((lf)\u2603).a(\u2603.bj);
                    }
                    \u2603.b(na.J);
                    final zx zx = h;
                    --zx.b;
                    if (h.b <= 0) {
                        \u2603.bi.a(\u2603.bi.c, null);
                    }
                }
                this.a(\u2603, \u2603, \u2603, intValue - 1);
            }
            return true;
        }
        if (intValue > 0 && b instanceof yj) {
            final yj yj = (yj)b;
            if (yj.x_() == yj.a.a && yj.d_(h)) {
                yj.c(h);
                this.a(\u2603, \u2603, \u2603, intValue - 1);
                \u2603.b(na.K);
                return true;
            }
        }
        if (intValue > 0 && b instanceof ym && aku.c(h) > 0) {
            final zx k = h.k();
            k.b = 1;
            aku.e(k);
            if (h.b > 1 || \u2603.bA.d) {
                if (!\u2603.bi.a(k)) {
                    \u2603.d(new uz(\u2603, \u2603.n() + 0.5, \u2603.o() + 1.5, \u2603.p() + 0.5, k));
                }
                else if (\u2603 instanceof lf) {
                    ((lf)\u2603).a(\u2603.bj);
                }
                \u2603.b(na.L);
                if (!\u2603.bA.d) {
                    final zx zx2 = h;
                    --zx2.b;
                }
            }
            else {
                \u2603.bi.a(\u2603.bi.c, k);
            }
            if (!\u2603.bA.d) {
                this.a(\u2603, \u2603, \u2603, intValue - 1);
            }
            return true;
        }
        return false;
    }
    
    public void a(final adm \u2603, final cj \u2603, final alz \u2603, final int \u2603) {
        \u2603.a(\u2603, \u2603.a((amo<Comparable>)afr.a, ns.a(\u2603, 0, 3)), 2);
        \u2603.e(\u2603, this);
    }
    
    @Override
    public void k(final adm \u2603, final cj \u2603) {
        if (\u2603.s.nextInt(20) != 1) {
            return;
        }
        final alz p = \u2603.p(\u2603);
        if (p.b((amo<Integer>)afr.a) < 3) {
            \u2603.a(\u2603, p.a((amo<Comparable>)afr.a), 2);
        }
    }
    
    @Override
    public zw a(final alz \u2603, final Random \u2603, final int \u2603) {
        return zy.bG;
    }
    
    @Override
    public zw c(final adm \u2603, final cj \u2603) {
        return zy.bG;
    }
    
    @Override
    public boolean O() {
        return true;
    }
    
    @Override
    public int l(final adm \u2603, final cj \u2603) {
        return \u2603.p(\u2603).b((amo<Integer>)afr.a);
    }
    
    @Override
    public alz a(final int \u2603) {
        return this.Q().a((amo<Comparable>)afr.a, \u2603);
    }
    
    @Override
    public int c(final alz \u2603) {
        return \u2603.b((amo<Integer>)afr.a);
    }
    
    @Override
    protected ama e() {
        return new ama(this, new amo[] { afr.a });
    }
    
    static {
        a = amn.a("level", 0, 3);
    }
}
