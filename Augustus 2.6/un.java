import java.util.Iterator;
import java.util.List;
import org.apache.commons.lang3.Validate;

// 
// Decompiled by Procyon v0.5.36
// 

public abstract class un extends pk
{
    private int c;
    protected cj a;
    public cq b;
    
    public un(final adm \u2603) {
        super(\u2603);
        this.a(0.5f, 0.5f);
    }
    
    public un(final adm \u2603, final cj \u2603) {
        this(\u2603);
        this.a = \u2603;
    }
    
    @Override
    protected void h() {
    }
    
    protected void a(final cq \u2603) {
        Validate.notNull(\u2603);
        Validate.isTrue(\u2603.k().c());
        this.b = \u2603;
        final float n = (float)(this.b.b() * 90);
        this.y = n;
        this.A = n;
        this.o();
    }
    
    private void o() {
        if (this.b == null) {
            return;
        }
        double s = this.a.n() + 0.5;
        double t = this.a.o() + 0.5;
        double u = this.a.p() + 0.5;
        final double n = 0.46875;
        final double a = this.a(this.l());
        final double a2 = this.a(this.m());
        s -= this.b.g() * 0.46875;
        u -= this.b.i() * 0.46875;
        t += a2;
        final cq f = this.b.f();
        s += a * f.g();
        u += a * f.i();
        this.s = s;
        this.t = t;
        this.u = u;
        double n2 = this.l();
        double n3 = this.m();
        double n4 = this.l();
        if (this.b.k() == cq.a.c) {
            n4 = 1.0;
        }
        else {
            n2 = 1.0;
        }
        n2 /= 32.0;
        n3 /= 32.0;
        n4 /= 32.0;
        this.a(new aug(s - n2, t - n3, u - n4, s + n2, t + n3, u + n4));
    }
    
    private double a(final int \u2603) {
        return (\u2603 % 32 == 0) ? 0.5 : 0.0;
    }
    
    @Override
    public void t_() {
        this.p = this.s;
        this.q = this.t;
        this.r = this.u;
        if (this.c++ == 100 && !this.o.D) {
            this.c = 0;
            if (!this.I && !this.j()) {
                this.J();
                this.b((pk)null);
            }
        }
    }
    
    public boolean j() {
        if (!this.o.a(this, this.aR()).isEmpty()) {
            return false;
        }
        final int max = Math.max(1, this.l() / 16);
        final int max2 = Math.max(1, this.m() / 16);
        final cj a = this.a.a(this.b.d());
        final cq f = this.b.f();
        for (int i = 0; i < max; ++i) {
            for (int j = 0; j < max2; ++j) {
                final cj b = a.a(f, i).b(j);
                final afh c = this.o.p(b).c();
                if (!c.t().a() && !agd.d(c)) {
                    return false;
                }
            }
        }
        final List<pk> b2 = this.o.b(this, this.aR());
        for (final pk pk : b2) {
            if (pk instanceof un) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public boolean ad() {
        return true;
    }
    
    @Override
    public boolean l(final pk \u2603) {
        return \u2603 instanceof wn && this.a(ow.a((wn)\u2603), 0.0f);
    }
    
    @Override
    public cq aP() {
        return this.b;
    }
    
    @Override
    public boolean a(final ow \u2603, final float \u2603) {
        if (this.b(\u2603)) {
            return false;
        }
        if (!this.I && !this.o.D) {
            this.J();
            this.ac();
            this.b(\u2603.j());
        }
        return true;
    }
    
    @Override
    public void d(final double \u2603, final double \u2603, final double \u2603) {
        if (!this.o.D && !this.I && \u2603 * \u2603 + \u2603 * \u2603 + \u2603 * \u2603 > 0.0) {
            this.J();
            this.b((pk)null);
        }
    }
    
    @Override
    public void g(final double \u2603, final double \u2603, final double \u2603) {
        if (!this.o.D && !this.I && \u2603 * \u2603 + \u2603 * \u2603 + \u2603 * \u2603 > 0.0) {
            this.J();
            this.b((pk)null);
        }
    }
    
    public void b(final dn \u2603) {
        \u2603.a("Facing", (byte)this.b.b());
        \u2603.a("TileX", this.n().n());
        \u2603.a("TileY", this.n().o());
        \u2603.a("TileZ", this.n().p());
    }
    
    public void a(final dn \u2603) {
        this.a = new cj(\u2603.f("TileX"), \u2603.f("TileY"), \u2603.f("TileZ"));
        cq cq;
        if (\u2603.b("Direction", 99)) {
            cq = cq.b(\u2603.d("Direction"));
            this.a = this.a.a(cq);
        }
        else if (\u2603.b("Facing", 99)) {
            cq = cq.b(\u2603.d("Facing"));
        }
        else {
            cq = cq.b(\u2603.d("Dir"));
        }
        this.a(cq);
    }
    
    public abstract int l();
    
    public abstract int m();
    
    public abstract void b(final pk p0);
    
    @Override
    protected boolean af() {
        return false;
    }
    
    @Override
    public void b(final double \u2603, final double \u2603, final double \u2603) {
        this.s = \u2603;
        this.t = \u2603;
        this.u = \u2603;
        final cj a = this.a;
        this.a = new cj(\u2603, \u2603, \u2603);
        if (!this.a.equals(a)) {
            this.o();
            this.ai = true;
        }
    }
    
    public cj n() {
        return this.a;
    }
}
