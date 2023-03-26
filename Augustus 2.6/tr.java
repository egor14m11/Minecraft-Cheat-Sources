// 
// Decompiled by Procyon v0.5.36
// 

public class tr extends to
{
    public tr(final adm \u2603) {
        super(\u2603);
        this.a(0.9f, 1.3f);
        this.bn = afi.bw;
    }
    
    @Override
    public boolean a(final wn \u2603) {
        final zx h = \u2603.bi.h();
        if (h != null && h.b() == zy.z && this.l() >= 0) {
            if (h.b == 1) {
                \u2603.bi.a(\u2603.bi.c, new zx(zy.A));
                return true;
            }
            if (\u2603.bi.a(new zx(zy.A)) && !\u2603.bA.d) {
                \u2603.bi.a(\u2603.bi.c, 1);
                return true;
            }
        }
        if (h != null && h.b() == zy.be && this.l() >= 0) {
            this.J();
            this.o.a(cy.b, this.s, this.t + this.K / 2.0f, this.u, 0.0, 0.0, 0.0, new int[0]);
            if (!this.o.D) {
                final to \u26032 = new to(this.o);
                \u26032.b(this.s, this.t, this.u, this.y, this.z);
                \u26032.i(this.bn());
                \u26032.aI = this.aI;
                if (this.l_()) {
                    \u26032.a(this.aM());
                }
                this.o.d(\u26032);
                for (int i = 0; i < 5; ++i) {
                    this.o.d(new uz(this.o, this.s, this.t + this.K, this.u, new zx(afi.Q)));
                }
                h.a(1, \u2603);
                this.a("mob.sheep.shear", 1.0f, 1.0f);
            }
            return true;
        }
        return super.a(\u2603);
    }
    
    public tr c(final ph \u2603) {
        return new tr(this.o);
    }
}
