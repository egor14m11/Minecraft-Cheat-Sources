// 
// Decompiled by Procyon v0.5.36
// 

public abstract class qx extends rd
{
    protected ps a;
    protected cj b;
    protected agh c;
    boolean d;
    float e;
    float f;
    
    public qx(final ps \u2603) {
        this.b = cj.a;
        this.a = \u2603;
        if (!(\u2603.s() instanceof sv)) {
            throw new IllegalArgumentException("Unsupported mob type for DoorInteractGoal");
        }
    }
    
    @Override
    public boolean a() {
        if (!this.a.D) {
            return false;
        }
        final sv sv = (sv)this.a.s();
        final asx j = sv.j();
        if (j == null || j.b() || !sv.g()) {
            return false;
        }
        for (int i = 0; i < Math.min(j.e() + 2, j.d()); ++i) {
            final asv a = j.a(i);
            this.b = new cj(a.a, a.b + 1, a.c);
            if (this.a.e(this.b.n(), this.a.t, this.b.p()) <= 2.25) {
                this.c = this.a(this.b);
                if (this.c != null) {
                    return true;
                }
            }
        }
        this.b = new cj(this.a).a();
        this.c = this.a(this.b);
        return this.c != null;
    }
    
    @Override
    public boolean b() {
        return !this.d;
    }
    
    @Override
    public void c() {
        this.d = false;
        this.e = (float)(this.b.n() + 0.5f - this.a.s);
        this.f = (float)(this.b.p() + 0.5f - this.a.u);
    }
    
    @Override
    public void e() {
        final float n = (float)(this.b.n() + 0.5f - this.a.s);
        final float n2 = (float)(this.b.p() + 0.5f - this.a.u);
        final float n3 = this.e * n + this.f * n2;
        if (n3 < 0.0f) {
            this.d = true;
        }
    }
    
    private agh a(final cj \u2603) {
        final afh c = this.a.o.p(\u2603).c();
        if (c instanceof agh && c.t() == arm.d) {
            return (agh)c;
        }
        return null;
    }
}
