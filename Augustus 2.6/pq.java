// 
// Decompiled by Procyon v0.5.36
// 

public abstract class pq extends ps
{
    public pq(final adm \u2603) {
        super(\u2603);
    }
    
    @Override
    public void e(final float \u2603, final float \u2603) {
    }
    
    @Override
    protected void a(final double \u2603, final boolean \u2603, final afh \u2603, final cj \u2603) {
    }
    
    @Override
    public void g(final float \u2603, final float \u2603) {
        if (this.V()) {
            this.a(\u2603, \u2603, 0.02f);
            this.d(this.v, this.w, this.x);
            this.v *= 0.800000011920929;
            this.w *= 0.800000011920929;
            this.x *= 0.800000011920929;
        }
        else if (this.ab()) {
            this.a(\u2603, \u2603, 0.02f);
            this.d(this.v, this.w, this.x);
            this.v *= 0.5;
            this.w *= 0.5;
            this.x *= 0.5;
        }
        else {
            float n = 0.91f;
            if (this.C) {
                n = this.o.p(new cj(ns.c(this.s), ns.c(this.aR().b) - 1, ns.c(this.u))).c().L * 0.91f;
            }
            final float n2 = 0.16277136f / (n * n * n);
            this.a(\u2603, \u2603, this.C ? (0.1f * n2) : 0.02f);
            n = 0.91f;
            if (this.C) {
                n = this.o.p(new cj(ns.c(this.s), ns.c(this.aR().b) - 1, ns.c(this.u))).c().L * 0.91f;
            }
            this.d(this.v, this.w, this.x);
            this.v *= n;
            this.w *= n;
            this.x *= n;
        }
        this.aA = this.aB;
        final double n3 = this.s - this.p;
        final double n4 = this.u - this.r;
        float n5 = ns.a(n3 * n3 + n4 * n4) * 4.0f;
        if (n5 > 1.0f) {
            n5 = 1.0f;
        }
        this.aB += (n5 - this.aB) * 0.4f;
        this.aC += this.aB;
    }
    
    @Override
    public boolean k_() {
        return false;
    }
}
