import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class uv extends uu
{
    private int b;
    public long a;
    private int c;
    
    public uv(final adm \u2603, final double \u2603, final double \u2603, final double \u2603) {
        super(\u2603);
        this.b(\u2603, \u2603, \u2603, 0.0f, 0.0f);
        this.b = 2;
        this.a = this.V.nextLong();
        this.c = this.V.nextInt(3) + 1;
        final cj cj = new cj(this);
        if (!\u2603.D && \u2603.Q().b("doFireTick") && (\u2603.aa() == oj.c || \u2603.aa() == oj.d) && \u2603.a(cj, 10)) {
            if (\u2603.p(cj).c().t() == arm.a && afi.ab.d(\u2603, cj)) {
                \u2603.a(cj, afi.ab.Q());
            }
            for (int i = 0; i < 4; ++i) {
                final cj a = cj.a(this.V.nextInt(3) - 1, this.V.nextInt(3) - 1, this.V.nextInt(3) - 1);
                if (\u2603.p(a).c().t() == arm.a && afi.ab.d(\u2603, a)) {
                    \u2603.a(a, afi.ab.Q());
                }
            }
        }
    }
    
    @Override
    public void t_() {
        super.t_();
        if (this.b == 2) {
            this.o.a(this.s, this.t, this.u, "ambient.weather.thunder", 10000.0f, 0.8f + this.V.nextFloat() * 0.2f);
            this.o.a(this.s, this.t, this.u, "random.explode", 2.0f, 0.5f + this.V.nextFloat() * 0.2f);
        }
        --this.b;
        if (this.b < 0) {
            if (this.c == 0) {
                this.J();
            }
            else if (this.b < -this.V.nextInt(10)) {
                --this.c;
                this.b = 1;
                this.a = this.V.nextLong();
                final cj cj = new cj(this);
                if (!this.o.D && this.o.Q().b("doFireTick") && this.o.a(cj, 10) && this.o.p(cj).c().t() == arm.a && afi.ab.d(this.o, cj)) {
                    this.o.a(cj, afi.ab.Q());
                }
            }
        }
        if (this.b >= 0) {
            if (this.o.D) {
                this.o.d(2);
            }
            else {
                final double n = 3.0;
                final List<pk> b = this.o.b(this, new aug(this.s - n, this.t - n, this.u - n, this.s + n, this.t + 6.0 + n, this.u + n));
                for (int i = 0; i < b.size(); ++i) {
                    final pk pk = b.get(i);
                    pk.a(this);
                }
            }
        }
    }
    
    @Override
    protected void h() {
    }
    
    @Override
    protected void a(final dn \u2603) {
    }
    
    @Override
    protected void b(final dn \u2603) {
    }
}
