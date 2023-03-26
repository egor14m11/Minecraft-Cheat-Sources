import com.google.common.base.Predicate;

// 
// Decompiled by Procyon v0.5.36
// 

public class ts extends qa
{
    private qs<wn> bo;
    private sh bp;
    
    public ts(final adm \u2603) {
        super(\u2603);
        this.a(0.6f, 0.7f);
        ((sv)this.s()).a(true);
        this.i.a(1, new ra(this));
        this.i.a(2, this.bm);
        this.i.a(3, this.bp = new sh(this, 0.6, zy.aU, true));
        this.i.a(5, new rb(this, 1.0, 10.0f, 5.0f));
        this.i.a(6, new rs(this, 0.8));
        this.i.a(7, new rh(this, 0.3f));
        this.i.a(8, new rr(this));
        this.i.a(9, new qv(this, 0.8));
        this.i.a(10, new rz(this, 0.8));
        this.i.a(11, new ri(this, wn.class, 10.0f));
        this.bi.a(1, new sq<Object>(this, tn.class, false, null));
    }
    
    @Override
    protected void h() {
        super.h();
        this.ac.a(18, (Byte)0);
    }
    
    public void E() {
        if (this.q().a()) {
            final double b = this.q().b();
            if (b == 0.6) {
                this.c(true);
                this.d(false);
            }
            else if (b == 1.33) {
                this.c(false);
                this.d(true);
            }
            else {
                this.c(false);
                this.d(false);
            }
        }
        else {
            this.c(false);
            this.d(false);
        }
    }
    
    @Override
    protected boolean C() {
        return !this.cl() && this.W > 2400;
    }
    
    @Override
    protected void aX() {
        super.aX();
        this.a(vy.a).a(10.0);
        this.a(vy.d).a(0.30000001192092896);
    }
    
    @Override
    public void e(final float \u2603, final float \u2603) {
    }
    
    @Override
    public void b(final dn \u2603) {
        super.b(\u2603);
        \u2603.a("CatType", this.ct());
    }
    
    @Override
    public void a(final dn \u2603) {
        super.a(\u2603);
        this.r(\u2603.f("CatType"));
    }
    
    @Override
    protected String z() {
        if (!this.cl()) {
            return "";
        }
        if (this.cr()) {
            return "mob.cat.purr";
        }
        if (this.V.nextInt(4) == 0) {
            return "mob.cat.purreow";
        }
        return "mob.cat.meow";
    }
    
    @Override
    protected String bo() {
        return "mob.cat.hitt";
    }
    
    @Override
    protected String bp() {
        return "mob.cat.hitt";
    }
    
    @Override
    protected float bB() {
        return 0.4f;
    }
    
    @Override
    protected zw A() {
        return zy.aF;
    }
    
    @Override
    public boolean r(final pk \u2603) {
        return \u2603.a(ow.a(this), 3.0f);
    }
    
    @Override
    public boolean a(final ow \u2603, final float \u2603) {
        if (this.b(\u2603)) {
            return false;
        }
        this.bm.a(false);
        return super.a(\u2603, \u2603);
    }
    
    @Override
    protected void b(final boolean \u2603, final int \u2603) {
    }
    
    @Override
    public boolean a(final wn \u2603) {
        final zx h = \u2603.bi.h();
        if (this.cl()) {
            if (this.e((pr)\u2603) && !this.o.D && !this.d(h)) {
                this.bm.a(!this.cn());
            }
        }
        else if (this.bp.f() && h != null && h.b() == zy.aU && \u2603.h(this) < 9.0) {
            if (!\u2603.bA.d) {
                final zx zx = h;
                --zx.b;
            }
            if (h.b <= 0) {
                \u2603.bi.a(\u2603.bi.c, null);
            }
            if (!this.o.D) {
                if (this.V.nextInt(3) == 0) {
                    this.m(true);
                    this.r(1 + this.o.s.nextInt(3));
                    this.b(\u2603.aK().toString());
                    this.l(true);
                    this.bm.a(true);
                    this.o.a(this, (byte)7);
                }
                else {
                    this.l(false);
                    this.o.a(this, (byte)6);
                }
            }
            return true;
        }
        return super.a(\u2603);
    }
    
    public ts b(final ph \u2603) {
        final ts ts = new ts(this.o);
        if (this.cl()) {
            ts.b(this.b());
            ts.m(true);
            ts.r(this.ct());
        }
        return ts;
    }
    
    @Override
    public boolean d(final zx \u2603) {
        return \u2603 != null && \u2603.b() == zy.aU;
    }
    
    @Override
    public boolean a(final tm \u2603) {
        if (\u2603 == this) {
            return false;
        }
        if (!this.cl()) {
            return false;
        }
        if (!(\u2603 instanceof ts)) {
            return false;
        }
        final ts ts = (ts)\u2603;
        return ts.cl() && this.cr() && ts.cr();
    }
    
    public int ct() {
        return this.ac.a(18);
    }
    
    public void r(final int \u2603) {
        this.ac.b(18, (byte)\u2603);
    }
    
    @Override
    public boolean bR() {
        return this.o.s.nextInt(3) != 0;
    }
    
    @Override
    public boolean bS() {
        if (this.o.a(this.aR(), this) && this.o.a(this, this.aR()).isEmpty() && !this.o.d(this.aR())) {
            final cj cj = new cj(this.s, this.aR().b, this.u);
            if (cj.o() < this.o.F()) {
                return false;
            }
            final afh c = this.o.p(cj.b()).c();
            if (c == afi.c || c.t() == arm.j) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public String e_() {
        if (this.l_()) {
            return this.aM();
        }
        if (this.cl()) {
            return di.a("entity.Cat.name");
        }
        return super.e_();
    }
    
    @Override
    public void m(final boolean \u2603) {
        super.m(\u2603);
    }
    
    @Override
    protected void cm() {
        if (this.bo == null) {
            this.bo = new qs<wn>(this, wn.class, 16.0f, 0.8, 1.33);
        }
        this.i.a(this.bo);
        if (!this.cl()) {
            this.i.a(4, this.bo);
        }
    }
    
    @Override
    public pu a(final ok \u2603, pu \u2603) {
        \u2603 = super.a(\u2603, \u2603);
        if (this.o.s.nextInt(7) == 0) {
            for (int i = 0; i < 2; ++i) {
                final ts \u26032 = new ts(this.o);
                \u26032.b(this.s, this.t, this.u, this.y, 0.0f);
                \u26032.b(-24000);
                this.o.d(\u26032);
            }
        }
        return \u2603;
    }
}
