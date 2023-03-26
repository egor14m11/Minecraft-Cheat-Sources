// 
// Decompiled by Procyon v0.5.36
// 

public class azc extends ayw
{
    private float u;
    private float v;
    
    public azc(final wn \u2603) {
        super(\u2603.bj);
        this.p = true;
    }
    
    @Override
    public void e() {
        if (this.j.c.h()) {
            this.j.a(new ayu(this.j.h));
        }
        this.a();
    }
    
    @Override
    public void b() {
        this.n.clear();
        if (this.j.c.h()) {
            this.j.a(new ayu(this.j.h));
        }
        else {
            super.b();
        }
    }
    
    @Override
    protected void b(final int \u2603, final int \u2603) {
        this.q.a(bnq.a("container.crafting", new Object[0]), 86, 16, 4210752);
    }
    
    @Override
    public void a(final int \u2603, final int \u2603, final float \u2603) {
        super.a(\u2603, \u2603, \u2603);
        this.u = (float)\u2603;
        this.v = (float)\u2603;
    }
    
    @Override
    protected void a(final float \u2603, final int \u2603, final int \u2603) {
        bfl.c(1.0f, 1.0f, 1.0f, 1.0f);
        this.j.P().a(azc.a);
        final int i = this.i;
        final int r = this.r;
        this.b(i, r, 0, 0, this.f, this.g);
        a(i + 51, r + 75, 30, i + 51 - this.u, r + 75 - 50 - this.v, this.j.h);
    }
    
    public static void a(final int \u2603, final int \u2603, final int \u2603, final float \u2603, final float \u2603, final pr \u2603) {
        bfl.g();
        bfl.E();
        bfl.b((float)\u2603, (float)\u2603, 50.0f);
        bfl.a((float)(-\u2603), (float)\u2603, (float)\u2603);
        bfl.b(180.0f, 0.0f, 0.0f, 1.0f);
        final float ai = \u2603.aI;
        final float y = \u2603.y;
        final float z = \u2603.z;
        final float al = \u2603.aL;
        final float ak = \u2603.aK;
        bfl.b(135.0f, 0.0f, 1.0f, 0.0f);
        avc.b();
        bfl.b(-135.0f, 0.0f, 1.0f, 0.0f);
        bfl.b(-(float)Math.atan(\u2603 / 40.0f) * 20.0f, 1.0f, 0.0f, 0.0f);
        \u2603.aI = (float)Math.atan(\u2603 / 40.0f) * 20.0f;
        \u2603.y = (float)Math.atan(\u2603 / 40.0f) * 40.0f;
        \u2603.z = -(float)Math.atan(\u2603 / 40.0f) * 20.0f;
        \u2603.aK = \u2603.y;
        \u2603.aL = \u2603.y;
        bfl.b(0.0f, 0.0f, 0.0f);
        final biu af = ave.A().af();
        af.a(180.0f);
        af.a(false);
        af.a(\u2603, 0.0, 0.0, 0.0, 0.0f, 1.0f);
        af.a(true);
        \u2603.aI = ai;
        \u2603.y = y;
        \u2603.z = z;
        \u2603.aL = al;
        \u2603.aK = ak;
        bfl.F();
        avc.a();
        bfl.C();
        bfl.g(bqs.r);
        bfl.x();
        bfl.g(bqs.q);
    }
    
    @Override
    protected void a(final avs \u2603) {
        if (\u2603.k == 0) {
            this.j.a(new aye(this, this.j.h.x()));
        }
        if (\u2603.k == 1) {
            this.j.a(new ayf(this, this.j.h.x()));
        }
    }
}
