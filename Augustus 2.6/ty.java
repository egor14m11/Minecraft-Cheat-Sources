import com.google.common.base.Predicate;

// 
// Decompiled by Procyon v0.5.36
// 

public class ty extends tq
{
    private int b;
    tf a;
    private int c;
    private int bm;
    
    public ty(final adm \u2603) {
        super(\u2603);
        this.a(1.4f, 2.9f);
        ((sv)this.s()).a(true);
        this.i.a(1, new rl(this, 1.0, true));
        this.i.a(2, new rq(this, 0.9, 32.0f));
        this.i.a(3, new rn(this, 0.6, true));
        this.i.a(4, new rp(this, 1.0));
        this.i.a(5, new rt(this));
        this.i.a(6, new rz(this, 0.6));
        this.i.a(7, new ri(this, wn.class, 6.0f));
        this.i.a(8, new ry(this));
        this.bi.a(1, new sl(this));
        this.bi.a(2, new sm(this, false, new Class[0]));
        this.bi.a(3, new a<Object>(this, ps.class, 10, false, true, vq.e));
    }
    
    @Override
    protected void h() {
        super.h();
        this.ac.a(16, (Byte)0);
    }
    
    @Override
    protected void E() {
        final int b = this.b - 1;
        this.b = b;
        if (b <= 0) {
            this.b = 70 + this.V.nextInt(50);
            this.a = this.o.ae().a(new cj(this), 32);
            if (this.a == null) {
                this.cj();
            }
            else {
                final cj a = this.a.a();
                this.a(a, (int)(this.a.b() * 0.6f));
            }
        }
        super.E();
    }
    
    @Override
    protected void aX() {
        super.aX();
        this.a(vy.a).a(100.0);
        this.a(vy.d).a(0.25);
    }
    
    @Override
    protected int j(final int \u2603) {
        return \u2603;
    }
    
    @Override
    protected void s(final pk \u2603) {
        if (\u2603 instanceof vq && !(\u2603 instanceof vn) && this.bc().nextInt(20) == 0) {
            this.d((pr)\u2603);
        }
        super.s(\u2603);
    }
    
    @Override
    public void m() {
        super.m();
        if (this.c > 0) {
            --this.c;
        }
        if (this.bm > 0) {
            --this.bm;
        }
        if (this.v * this.v + this.x * this.x > 2.500000277905201E-7 && this.V.nextInt(5) == 0) {
            final int c = ns.c(this.s);
            final int c2 = ns.c(this.t - 0.20000000298023224);
            final int c3 = ns.c(this.u);
            final alz p = this.o.p(new cj(c, c2, c3));
            final afh c4 = p.c();
            if (c4.t() != arm.a) {
                this.o.a(cy.L, this.s + (this.V.nextFloat() - 0.5) * this.J, this.aR().b + 0.1, this.u + (this.V.nextFloat() - 0.5) * this.J, 4.0 * (this.V.nextFloat() - 0.5), 0.5, (this.V.nextFloat() - 0.5) * 4.0, afh.f(p));
            }
        }
    }
    
    @Override
    public boolean a(final Class<? extends pr> \u2603) {
        return (!this.cn() || !wn.class.isAssignableFrom(\u2603)) && \u2603 != vn.class && super.a(\u2603);
    }
    
    @Override
    public void b(final dn \u2603) {
        super.b(\u2603);
        \u2603.a("PlayerCreated", this.cn());
    }
    
    @Override
    public void a(final dn \u2603) {
        super.a(\u2603);
        this.l(\u2603.n("PlayerCreated"));
    }
    
    @Override
    public boolean r(final pk \u2603) {
        this.c = 10;
        this.o.a(this, (byte)4);
        final boolean a = \u2603.a(ow.a(this), (float)(7 + this.V.nextInt(15)));
        if (a) {
            \u2603.w += 0.4000000059604645;
            this.a(this, \u2603);
        }
        this.a("mob.irongolem.throw", 1.0f, 1.0f);
        return a;
    }
    
    @Override
    public void a(final byte \u2603) {
        if (\u2603 == 4) {
            this.c = 10;
            this.a("mob.irongolem.throw", 1.0f, 1.0f);
        }
        else if (\u2603 == 11) {
            this.bm = 400;
        }
        else {
            super.a(\u2603);
        }
    }
    
    public tf n() {
        return this.a;
    }
    
    public int cl() {
        return this.c;
    }
    
    public void a(final boolean \u2603) {
        this.bm = (\u2603 ? 400 : 0);
        this.o.a(this, (byte)11);
    }
    
    @Override
    protected String bo() {
        return "mob.irongolem.hit";
    }
    
    @Override
    protected String bp() {
        return "mob.irongolem.death";
    }
    
    @Override
    protected void a(final cj \u2603, final afh \u2603) {
        this.a("mob.irongolem.walk", 1.0f, 1.0f);
    }
    
    @Override
    protected void b(final boolean \u2603, final int \u2603) {
        for (int nextInt = this.V.nextInt(3), i = 0; i < nextInt; ++i) {
            this.a(zw.a(afi.O), 1, (float)agw.a.b.b());
        }
        for (int i = 3 + this.V.nextInt(3), j = 0; j < i; ++j) {
            this.a(zy.j, 1);
        }
    }
    
    public int cm() {
        return this.bm;
    }
    
    public boolean cn() {
        return (this.ac.a(16) & 0x1) != 0x0;
    }
    
    public void l(final boolean \u2603) {
        final byte a = this.ac.a(16);
        if (\u2603) {
            this.ac.b(16, (byte)(a | 0x1));
        }
        else {
            this.ac.b(16, (byte)(a & 0xFFFFFFFE));
        }
    }
    
    @Override
    public void a(final ow \u2603) {
        if (!this.cn() && this.aN != null && this.a != null) {
            this.a.a(this.aN.e_(), -5);
        }
        super.a(\u2603);
    }
    
    static class a<T extends pr> extends sp<T>
    {
        public a(final py \u2603, final Class<T> \u2603, final int \u2603, final boolean \u2603, final boolean \u2603, final Predicate<? super T> \u2603) {
            super(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
            this.c = new Predicate<T>() {
                public boolean a(final T \u2603) {
                    if (\u2603 != null && !\u2603.apply(\u2603)) {
                        return false;
                    }
                    if (\u2603 instanceof vn) {
                        return false;
                    }
                    if (\u2603 instanceof wn) {
                        double a = st.this.f();
                        if (\u2603.av()) {
                            a *= 0.800000011920929;
                        }
                        if (\u2603.ax()) {
                            float by = ((wn)\u2603).bY();
                            if (by < 0.1f) {
                                by = 0.1f;
                            }
                            a *= 0.7f * by;
                        }
                        if (\u2603.g(\u2603) > a) {
                            return false;
                        }
                    }
                    return st.this.a(\u2603, false);
                }
            };
        }
    }
}
