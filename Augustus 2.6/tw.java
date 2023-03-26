import com.google.common.base.Predicate;

// 
// Decompiled by Procyon v0.5.36
// 

public class tw extends tq implements vx
{
    public tw(final adm \u2603) {
        super(\u2603);
        this.a(0.7f, 1.9f);
        ((sv)this.s()).a(true);
        this.i.a(1, new sa(this, 1.25, 20, 10.0f));
        this.i.a(2, new rz(this, 1.0));
        this.i.a(3, new ri(this, wn.class, 6.0f));
        this.i.a(4, new ry(this));
        this.bi.a(1, new sp<Object>(this, ps.class, 10, true, false, vq.d));
    }
    
    @Override
    protected void aX() {
        super.aX();
        this.a(vy.a).a(4.0);
        this.a(vy.d).a(0.20000000298023224);
    }
    
    @Override
    public void m() {
        super.m();
        if (!this.o.D) {
            int n = ns.c(this.s);
            int n2 = ns.c(this.t);
            int n3 = ns.c(this.u);
            if (this.U()) {
                this.a(ow.f, 1.0f);
            }
            if (this.o.b(new cj(n, 0, n3)).a(new cj(n, n2, n3)) > 1.0f) {
                this.a(ow.c, 1.0f);
            }
            for (int i = 0; i < 4; ++i) {
                n = ns.c(this.s + (i % 2 * 2 - 1) * 0.25f);
                n2 = ns.c(this.t);
                n3 = ns.c(this.u + (i / 2 % 2 * 2 - 1) * 0.25f);
                final cj cj = new cj(n, n2, n3);
                if (this.o.p(cj).c().t() == arm.a && this.o.b(new cj(n, 0, n3)).a(cj) < 0.8f && afi.aH.d(this.o, cj)) {
                    this.o.a(cj, afi.aH.Q());
                }
            }
        }
    }
    
    @Override
    protected zw A() {
        return zy.aD;
    }
    
    @Override
    protected void b(final boolean \u2603, final int \u2603) {
        for (int nextInt = this.V.nextInt(16), i = 0; i < nextInt; ++i) {
            this.a(zy.aD, 1);
        }
    }
    
    @Override
    public void a(final pr \u2603, final float \u2603) {
        final wx \u26032 = new wx(this.o, this);
        final double n = \u2603.t + \u2603.aS() - 1.100000023841858;
        final double \u26033 = \u2603.s - this.s;
        final double n2 = n - \u26032.t;
        final double \u26034 = \u2603.u - this.u;
        final float n3 = ns.a(\u26033 * \u26033 + \u26034 * \u26034) * 0.2f;
        \u26032.c(\u26033, n2 + n3, \u26034, 1.6f, 12.0f);
        this.a("random.bow", 1.0f, 1.0f / (this.bc().nextFloat() * 0.4f + 0.8f));
        this.o.d(\u26032);
    }
    
    @Override
    public float aS() {
        return 1.7f;
    }
}
