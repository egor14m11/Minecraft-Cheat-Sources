// 
// Decompiled by Procyon v0.5.36
// 

public class bcl extends bbo
{
    private bct[] a;
    private bct[] b;
    
    public bcl(final float \u2603) {
        this.t = 64;
        this.u = 64;
        this.a = new bct[3];
        (this.a[0] = new bct(this, 0, 16)).a(-10.0f, 3.9f, -0.5f, 20, 3, 3, \u2603);
        (this.a[1] = new bct(this).b(this.t, this.u)).a(-2.0f, 6.9f, -0.5f);
        this.a[1].a(0, 22).a(0.0f, 0.0f, 0.0f, 3, 10, 3, \u2603);
        this.a[1].a(24, 22).a(-4.0f, 1.5f, 0.5f, 11, 2, 2, \u2603);
        this.a[1].a(24, 22).a(-4.0f, 4.0f, 0.5f, 11, 2, 2, \u2603);
        this.a[1].a(24, 22).a(-4.0f, 6.5f, 0.5f, 11, 2, 2, \u2603);
        (this.a[2] = new bct(this, 12, 22)).a(0.0f, 0.0f, 0.0f, 3, 6, 3, \u2603);
        this.b = new bct[3];
        (this.b[0] = new bct(this, 0, 0)).a(-4.0f, -4.0f, -4.0f, 8, 8, 8, \u2603);
        (this.b[1] = new bct(this, 32, 0)).a(-4.0f, -4.0f, -4.0f, 6, 6, 6, \u2603);
        this.b[1].c = -8.0f;
        this.b[1].d = 4.0f;
        (this.b[2] = new bct(this, 32, 0)).a(-4.0f, -4.0f, -4.0f, 6, 6, 6, \u2603);
        this.b[2].c = 10.0f;
        this.b[2].d = 4.0f;
    }
    
    @Override
    public void a(final pk \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603) {
        this.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        for (final bct bct : this.b) {
            bct.a(\u2603);
        }
        for (final bct bct : this.a) {
            bct.a(\u2603);
        }
    }
    
    @Override
    public void a(final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final pk \u2603) {
        final float b = ns.b(\u2603 * 0.1f);
        this.a[1].f = (0.065f + 0.05f * b) * 3.1415927f;
        this.a[2].a(-2.0f, 6.9f + ns.b(this.a[1].f) * 10.0f, -0.5f + ns.a(this.a[1].f) * 10.0f);
        this.a[2].f = (0.265f + 0.1f * b) * 3.1415927f;
        this.b[0].g = \u2603 / 57.295776f;
        this.b[0].f = \u2603 / 57.295776f;
    }
    
    @Override
    public void a(final pr \u2603, final float \u2603, final float \u2603, final float \u2603) {
        final uk uk = (uk)\u2603;
        for (int i = 1; i < 3; ++i) {
            this.b[i].g = (uk.a(i - 1) - \u2603.aI) / 57.295776f;
            this.b[i].f = uk.b(i - 1) / 57.295776f;
        }
    }
}
