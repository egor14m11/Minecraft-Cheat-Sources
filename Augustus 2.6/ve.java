// 
// Decompiled by Procyon v0.5.36
// 

public class ve extends va
{
    private int c;
    public double a;
    public double b;
    
    public ve(final adm \u2603) {
        super(\u2603);
    }
    
    public ve(final adm \u2603, final double \u2603, final double \u2603, final double \u2603) {
        super(\u2603, \u2603, \u2603, \u2603);
    }
    
    @Override
    public a s() {
        return va.a.c;
    }
    
    @Override
    protected void h() {
        super.h();
        this.ac.a(16, new Byte((byte)0));
    }
    
    @Override
    public void t_() {
        super.t_();
        if (this.c > 0) {
            --this.c;
        }
        if (this.c <= 0) {
            final double n = 0.0;
            this.b = n;
            this.a = n;
        }
        this.i(this.c > 0);
        if (this.j() && this.V.nextInt(4) == 0) {
            this.o.a(cy.m, this.s, this.t + 0.8, this.u, 0.0, 0.0, 0.0, new int[0]);
        }
    }
    
    @Override
    protected double m() {
        return 0.2;
    }
    
    @Override
    public void a(final ow \u2603) {
        super.a(\u2603);
        if (!\u2603.c() && this.o.Q().b("doEntityDrops")) {
            this.a(new zx(afi.al, 1), 0.0f);
        }
    }
    
    @Override
    protected void a(final cj \u2603, final alz \u2603) {
        super.a(\u2603, \u2603);
        double \u26032 = this.a * this.a + this.b * this.b;
        if (\u26032 > 1.0E-4 && this.v * this.v + this.x * this.x > 0.001) {
            \u26032 = ns.a(\u26032);
            this.a /= \u26032;
            this.b /= \u26032;
            if (this.a * this.v + this.b * this.x < 0.0) {
                this.a = 0.0;
                this.b = 0.0;
            }
            else {
                final double n = \u26032 / this.m();
                this.a *= n;
                this.b *= n;
            }
        }
    }
    
    @Override
    protected void o() {
        double \u2603 = this.a * this.a + this.b * this.b;
        if (\u2603 > 1.0E-4) {
            \u2603 = ns.a(\u2603);
            this.a /= \u2603;
            this.b /= \u2603;
            final double n = 1.0;
            this.v *= 0.800000011920929;
            this.w *= 0.0;
            this.x *= 0.800000011920929;
            this.v += this.a * n;
            this.x += this.b * n;
        }
        else {
            this.v *= 0.9800000190734863;
            this.w *= 0.0;
            this.x *= 0.9800000190734863;
        }
        super.o();
    }
    
    @Override
    public boolean e(final wn \u2603) {
        final zx h = \u2603.bi.h();
        if (h != null && h.b() == zy.h) {
            if (!\u2603.bA.d) {
                final zx zx = h;
                if (--zx.b == 0) {
                    \u2603.bi.a(\u2603.bi.c, null);
                }
            }
            this.c += 3600;
        }
        this.a = this.s - \u2603.s;
        this.b = this.u - \u2603.u;
        return true;
    }
    
    @Override
    protected void b(final dn \u2603) {
        super.b(\u2603);
        \u2603.a("PushX", this.a);
        \u2603.a("PushZ", this.b);
        \u2603.a("Fuel", (short)this.c);
    }
    
    @Override
    protected void a(final dn \u2603) {
        super.a(\u2603);
        this.a = \u2603.i("PushX");
        this.b = \u2603.i("PushZ");
        this.c = \u2603.e("Fuel");
    }
    
    protected boolean j() {
        return (this.ac.a(16) & 0x1) != 0x0;
    }
    
    protected void i(final boolean \u2603) {
        if (\u2603) {
            this.ac.b(16, (byte)(this.ac.a(16) | 0x1));
        }
        else {
            this.ac.b(16, (byte)(this.ac.a(16) & 0xFFFFFFFE));
        }
    }
    
    @Override
    public alz u() {
        return (this.j() ? afi.am : afi.al).Q().a((amo<Comparable>)ahb.a, cq.c);
    }
}
