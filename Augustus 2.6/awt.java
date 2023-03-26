import net.minecraft.realms.RealmsSimpleScrolledSelectionList;

// 
// Decompiled by Procyon v0.5.36
// 

public class awt extends awi
{
    private final RealmsSimpleScrolledSelectionList u;
    
    public awt(final RealmsSimpleScrolledSelectionList \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603) {
        super(ave.A(), \u2603, \u2603, \u2603, \u2603, \u2603);
        this.u = \u2603;
    }
    
    @Override
    protected int b() {
        return this.u.getItemCount();
    }
    
    @Override
    protected void a(final int \u2603, final boolean \u2603, final int \u2603, final int \u2603) {
        this.u.selectItem(\u2603, \u2603, \u2603, \u2603);
    }
    
    @Override
    protected boolean a(final int \u2603) {
        return this.u.isSelectedItem(\u2603);
    }
    
    @Override
    protected void a() {
        this.u.renderBackground();
    }
    
    @Override
    protected void a(final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603) {
        this.u.renderItem(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
    }
    
    public int e() {
        return super.b;
    }
    
    public int f() {
        return super.j;
    }
    
    public int g() {
        return super.i;
    }
    
    @Override
    protected int k() {
        return this.u.getMaxPosition();
    }
    
    @Override
    protected int d() {
        return this.u.getScrollbarPosition();
    }
    
    @Override
    public void p() {
        super.p();
    }
    
    @Override
    public void a(final int \u2603, final int \u2603, final float \u2603) {
        if (!this.q) {
            return;
        }
        this.i = \u2603;
        this.j = \u2603;
        this.a();
        final int d = this.d();
        final int n = d + 6;
        this.l();
        bfl.f();
        bfl.n();
        final bfx a = bfx.a();
        final bfd c = a.c();
        final int n2 = this.g + (this.b / 2 - this.c() / 2 + 2);
        final int n3 = this.d + 4 - (int)this.n;
        if (this.s) {
            this.a(n2, n3, a);
        }
        this.b(n2, n3, \u2603, \u2603);
        bfl.i();
        final int n4 = 4;
        this.c(0, this.d, 255, 255);
        this.c(this.e, this.c, 255, 255);
        bfl.l();
        bfl.a(770, 771, 0, 1);
        bfl.c();
        bfl.j(7425);
        bfl.x();
        final int m = this.m();
        if (m > 0) {
            int a2 = (this.e - this.d) * (this.e - this.d) / this.k();
            a2 = ns.a(a2, 32, this.e - this.d - 8);
            int d2 = (int)this.n * (this.e - this.d - a2) / m + this.d;
            if (d2 < this.d) {
                d2 = this.d;
            }
            c.a(7, bms.i);
            c.b(d, this.e, 0.0).a(0.0, 1.0).b(0, 0, 0, 255).d();
            c.b(n, this.e, 0.0).a(1.0, 1.0).b(0, 0, 0, 255).d();
            c.b(n, this.d, 0.0).a(1.0, 0.0).b(0, 0, 0, 255).d();
            c.b(d, this.d, 0.0).a(0.0, 0.0).b(0, 0, 0, 255).d();
            a.b();
            c.a(7, bms.i);
            c.b(d, d2 + a2, 0.0).a(0.0, 1.0).b(128, 128, 128, 255).d();
            c.b(n, d2 + a2, 0.0).a(1.0, 1.0).b(128, 128, 128, 255).d();
            c.b(n, d2, 0.0).a(1.0, 0.0).b(128, 128, 128, 255).d();
            c.b(d, d2, 0.0).a(0.0, 0.0).b(128, 128, 128, 255).d();
            a.b();
            c.a(7, bms.i);
            c.b(d, d2 + a2 - 1, 0.0).a(0.0, 1.0).b(192, 192, 192, 255).d();
            c.b(n - 1, d2 + a2 - 1, 0.0).a(1.0, 1.0).b(192, 192, 192, 255).d();
            c.b(n - 1, d2, 0.0).a(1.0, 0.0).b(192, 192, 192, 255).d();
            c.b(d, d2, 0.0).a(0.0, 0.0).b(192, 192, 192, 255).d();
            a.b();
        }
        this.b(\u2603, \u2603);
        bfl.w();
        bfl.j(7424);
        bfl.d();
        bfl.k();
    }
}
