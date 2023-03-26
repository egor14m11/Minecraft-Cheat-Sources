import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public abstract class agd extends age
{
    protected final boolean N;
    
    protected agd(final boolean \u2603) {
        super(arm.q);
        this.N = \u2603;
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 0.125f, 1.0f);
    }
    
    @Override
    public boolean d() {
        return false;
    }
    
    @Override
    public boolean d(final adm \u2603, final cj \u2603) {
        return adm.a(\u2603, \u2603.b()) && super.d(\u2603, \u2603);
    }
    
    public boolean e(final adm \u2603, final cj \u2603) {
        return adm.a(\u2603, \u2603.b());
    }
    
    @Override
    public void a(final adm \u2603, final cj \u2603, final alz \u2603, final Random \u2603) {
    }
    
    @Override
    public void b(final adm \u2603, final cj \u2603, final alz \u2603, final Random \u2603) {
        if (this.b((adq)\u2603, \u2603, \u2603)) {
            return;
        }
        final boolean e = this.e(\u2603, \u2603, \u2603);
        if (this.N && !e) {
            \u2603.a(\u2603, this.k(\u2603), 2);
        }
        else if (!this.N) {
            \u2603.a(\u2603, this.e(\u2603), 2);
            if (!e) {
                \u2603.a(\u2603, this.e(\u2603).c(), this.m(\u2603), -1);
            }
        }
    }
    
    @Override
    public boolean a(final adq \u2603, final cj \u2603, final cq \u2603) {
        return \u2603.k() != cq.a.b;
    }
    
    protected boolean l(final alz \u2603) {
        return this.N;
    }
    
    @Override
    public int b(final adq \u2603, final cj \u2603, final alz \u2603, final cq \u2603) {
        return this.a(\u2603, \u2603, \u2603, \u2603);
    }
    
    @Override
    public int a(final adq \u2603, final cj \u2603, final alz \u2603, final cq \u2603) {
        if (!this.l(\u2603)) {
            return 0;
        }
        if (\u2603.b((amo<Comparable>)agd.O) == \u2603) {
            return this.a(\u2603, \u2603, \u2603);
        }
        return 0;
    }
    
    @Override
    public void a(final adm \u2603, final cj \u2603, final alz \u2603, final afh \u2603) {
        if (this.e(\u2603, \u2603)) {
            this.g(\u2603, \u2603, \u2603);
            return;
        }
        this.b(\u2603, \u2603, \u2603, 0);
        \u2603.g(\u2603);
        for (final cq \u26032 : cq.values()) {
            \u2603.c(\u2603.a(\u26032), this);
        }
    }
    
    protected void g(final adm \u2603, final cj \u2603, final alz \u2603) {
        if (this.b((adq)\u2603, \u2603, \u2603)) {
            return;
        }
        final boolean e = this.e(\u2603, \u2603, \u2603);
        if (((this.N && !e) || (!this.N && e)) && !\u2603.a(\u2603, this)) {
            int \u26032 = -1;
            if (this.i(\u2603, \u2603, \u2603)) {
                \u26032 = -3;
            }
            else if (this.N) {
                \u26032 = -2;
            }
            \u2603.a(\u2603, this, this.d(\u2603), \u26032);
        }
    }
    
    public boolean b(final adq \u2603, final cj \u2603, final alz \u2603) {
        return false;
    }
    
    protected boolean e(final adm \u2603, final cj \u2603, final alz \u2603) {
        return this.f(\u2603, \u2603, \u2603) > 0;
    }
    
    protected int f(final adm \u2603, final cj \u2603, final alz \u2603) {
        final cq cq = \u2603.b((amo<cq>)agd.O);
        final cj a = \u2603.a(cq);
        final int c = \u2603.c(a, cq);
        if (c >= 15) {
            return c;
        }
        final alz p = \u2603.p(a);
        return Math.max(c, (p.c() == afi.af) ? ((int)p.b((amo<Integer>)ajb.P)) : 0);
    }
    
    protected int c(final adq \u2603, final cj \u2603, final alz \u2603) {
        final cq cq = \u2603.b((amo<cq>)agd.O);
        final cq e = cq.e();
        final cq f = cq.f();
        return Math.max(this.c(\u2603, \u2603.a(e), e), this.c(\u2603, \u2603.a(f), f));
    }
    
    protected int c(final adq \u2603, final cj \u2603, final cq \u2603) {
        final alz p = \u2603.p(\u2603);
        final afh c = p.c();
        if (!this.c(c)) {
            return 0;
        }
        if (c == afi.af) {
            return p.b((amo<Integer>)ajb.P);
        }
        return \u2603.a(\u2603, \u2603);
    }
    
    @Override
    public boolean i() {
        return true;
    }
    
    @Override
    public alz a(final adm \u2603, final cj \u2603, final cq \u2603, final float \u2603, final float \u2603, final float \u2603, final int \u2603, final pr \u2603) {
        return this.Q().a((amo<Comparable>)agd.O, \u2603.aP().d());
    }
    
    @Override
    public void a(final adm \u2603, final cj \u2603, final alz \u2603, final pr \u2603, final zx \u2603) {
        if (this.e(\u2603, \u2603, \u2603)) {
            \u2603.a(\u2603, this, 1);
        }
    }
    
    @Override
    public void c(final adm \u2603, final cj \u2603, final alz \u2603) {
        this.h(\u2603, \u2603, \u2603);
    }
    
    protected void h(final adm \u2603, final cj \u2603, final alz \u2603) {
        final cq \u26032 = \u2603.b((amo<cq>)agd.O);
        final cj a = \u2603.a(\u26032.d());
        \u2603.d(a, this);
        \u2603.a(a, this, \u26032);
    }
    
    @Override
    public void d(final adm \u2603, final cj \u2603, final alz \u2603) {
        if (this.N) {
            for (final cq \u26032 : cq.values()) {
                \u2603.c(\u2603.a(\u26032), this);
            }
        }
        super.d(\u2603, \u2603, \u2603);
    }
    
    @Override
    public boolean c() {
        return false;
    }
    
    protected boolean c(final afh \u2603) {
        return \u2603.i();
    }
    
    protected int a(final adq \u2603, final cj \u2603, final alz \u2603) {
        return 15;
    }
    
    public static boolean d(final afh \u2603) {
        return afi.bb.e(\u2603) || afi.cj.e(\u2603);
    }
    
    public boolean e(final afh \u2603) {
        return \u2603 == this.e(this.Q()).c() || \u2603 == this.k(this.Q()).c();
    }
    
    public boolean i(final adm \u2603, final cj \u2603, final alz \u2603) {
        final cq d = \u2603.b((amo<cq>)agd.O).d();
        final cj a = \u2603.a(d);
        return d(\u2603.p(a).c()) && \u2603.p(a).b((amo<Comparable>)agd.O) != d;
    }
    
    protected int m(final alz \u2603) {
        return this.d(\u2603);
    }
    
    protected abstract int d(final alz p0);
    
    protected abstract alz e(final alz p0);
    
    protected abstract alz k(final alz p0);
    
    @Override
    public boolean b(final afh \u2603) {
        return this.e(\u2603);
    }
    
    @Override
    public adf m() {
        return adf.c;
    }
}
