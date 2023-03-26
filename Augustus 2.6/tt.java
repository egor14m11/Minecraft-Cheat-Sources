// 
// Decompiled by Procyon v0.5.36
// 

public class tt extends tm
{
    private final qw bm;
    
    public tt(final adm \u2603) {
        super(\u2603);
        this.a(0.9f, 0.9f);
        ((sv)this.s()).a(true);
        this.i.a(0, new ra(this));
        this.i.a(1, new rv(this, 1.25));
        this.i.a(2, this.bm = new qw(this, 0.3f));
        this.i.a(3, new qv(this, 1.0));
        this.i.a(4, new sh(this, 1.2, zy.bY, false));
        this.i.a(4, new sh(this, 1.2, zy.bR, false));
        this.i.a(5, new rc(this, 1.1));
        this.i.a(6, new rz(this, 1.0));
        this.i.a(7, new ri(this, wn.class, 6.0f));
        this.i.a(8, new ry(this));
    }
    
    @Override
    protected void aX() {
        super.aX();
        this.a(vy.a).a(10.0);
        this.a(vy.d).a(0.25);
    }
    
    @Override
    public boolean bW() {
        final zx ba = ((wn)this.l).bA();
        return ba != null && ba.b() == zy.bY;
    }
    
    @Override
    protected void h() {
        super.h();
        this.ac.a(16, (Byte)0);
    }
    
    @Override
    public void b(final dn \u2603) {
        super.b(\u2603);
        \u2603.a("Saddle", this.cl());
    }
    
    @Override
    public void a(final dn \u2603) {
        super.a(\u2603);
        this.l(\u2603.n("Saddle"));
    }
    
    @Override
    protected String z() {
        return "mob.pig.say";
    }
    
    @Override
    protected String bo() {
        return "mob.pig.say";
    }
    
    @Override
    protected String bp() {
        return "mob.pig.death";
    }
    
    @Override
    protected void a(final cj \u2603, final afh \u2603) {
        this.a("mob.pig.step", 0.15f, 1.0f);
    }
    
    @Override
    public boolean a(final wn \u2603) {
        if (super.a(\u2603)) {
            return true;
        }
        if (this.cl() && !this.o.D && (this.l == null || this.l == \u2603)) {
            \u2603.a((pk)this);
            return true;
        }
        return false;
    }
    
    @Override
    protected zw A() {
        if (this.at()) {
            return zy.am;
        }
        return zy.al;
    }
    
    @Override
    protected void b(final boolean \u2603, final int \u2603) {
        for (int n = this.V.nextInt(3) + 1 + this.V.nextInt(1 + \u2603), i = 0; i < n; ++i) {
            if (this.at()) {
                this.a(zy.am, 1);
            }
            else {
                this.a(zy.al, 1);
            }
        }
        if (this.cl()) {
            this.a(zy.aA, 1);
        }
    }
    
    public boolean cl() {
        return (this.ac.a(16) & 0x1) != 0x0;
    }
    
    public void l(final boolean \u2603) {
        if (\u2603) {
            this.ac.b(16, (Byte)1);
        }
        else {
            this.ac.b(16, (Byte)0);
        }
    }
    
    @Override
    public void a(final uv \u2603) {
        if (this.o.D || this.I) {
            return;
        }
        final vw \u26032 = new vw(this.o);
        \u26032.c(0, new zx(zy.B));
        \u26032.b(this.s, this.t, this.u, this.y, this.z);
        \u26032.k(this.ce());
        if (this.l_()) {
            \u26032.a(this.aM());
            \u26032.g(this.aN());
        }
        this.o.d(\u26032);
        this.J();
    }
    
    @Override
    public void e(final float \u2603, final float \u2603) {
        super.e(\u2603, \u2603);
        if (\u2603 > 5.0f && this.l instanceof wn) {
            ((wn)this.l).b(mr.u);
        }
    }
    
    public tt b(final ph \u2603) {
        return new tt(this.o);
    }
    
    @Override
    public boolean d(final zx \u2603) {
        return \u2603 != null && \u2603.b() == zy.bR;
    }
    
    public qw cm() {
        return this.bm;
    }
}
