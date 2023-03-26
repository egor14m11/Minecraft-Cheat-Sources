// 
// Decompiled by Procyon v0.5.36
// 

public class to extends tm
{
    public to(final adm \u2603) {
        super(\u2603);
        this.a(0.9f, 1.3f);
        ((sv)this.s()).a(true);
        this.i.a(0, new ra(this));
        this.i.a(1, new rv(this, 2.0));
        this.i.a(2, new qv(this, 1.0));
        this.i.a(3, new sh(this, 1.25, zy.O, false));
        this.i.a(4, new rc(this, 1.25));
        this.i.a(5, new rz(this, 1.0));
        this.i.a(6, new ri(this, wn.class, 6.0f));
        this.i.a(7, new ry(this));
    }
    
    @Override
    protected void aX() {
        super.aX();
        this.a(vy.a).a(10.0);
        this.a(vy.d).a(0.20000000298023224);
    }
    
    @Override
    protected String z() {
        return "mob.cow.say";
    }
    
    @Override
    protected String bo() {
        return "mob.cow.hurt";
    }
    
    @Override
    protected String bp() {
        return "mob.cow.hurt";
    }
    
    @Override
    protected void a(final cj \u2603, final afh \u2603) {
        this.a("mob.cow.step", 0.15f, 1.0f);
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
    protected void b(final boolean \u2603, final int \u2603) {
        for (int n = this.V.nextInt(3) + this.V.nextInt(1 + \u2603), i = 0; i < n; ++i) {
            this.a(zy.aF, 1);
        }
        for (int n = this.V.nextInt(3) + 1 + this.V.nextInt(1 + \u2603), i = 0; i < n; ++i) {
            if (this.at()) {
                this.a(zy.bj, 1);
            }
            else {
                this.a(zy.bi, 1);
            }
        }
    }
    
    @Override
    public boolean a(final wn \u2603) {
        final zx h = \u2603.bi.h();
        if (h != null && h.b() == zy.aw && !\u2603.bA.d && !this.j_()) {
            if (h.b-- == 1) {
                \u2603.bi.a(\u2603.bi.c, new zx(zy.aG));
            }
            else if (!\u2603.bi.a(new zx(zy.aG))) {
                \u2603.a(new zx(zy.aG, 1, 0), false);
            }
            return true;
        }
        return super.a(\u2603);
    }
    
    public to b(final ph \u2603) {
        return new to(this.o);
    }
    
    @Override
    public float aS() {
        return this.K;
    }
}
