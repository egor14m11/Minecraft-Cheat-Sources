// 
// Decompiled by Procyon v0.5.36
// 

public class bch extends bbo
{
    public bct a;
    public bct b;
    public bct c;
    public bct d;
    public bct e;
    public bct f;
    
    public bch() {
        this(0.0f);
    }
    
    public bch(final float \u2603) {
        this(\u2603, -7.0f);
    }
    
    public bch(final float \u2603, final float \u2603) {
        final int n = 128;
        final int n2 = 128;
        (this.a = new bct(this).b(n, n2)).a(0.0f, 0.0f + \u2603, -2.0f);
        this.a.a(0, 0).a(-4.0f, -12.0f, -5.5f, 8, 10, 8, \u2603);
        this.a.a(24, 0).a(-1.0f, -5.0f, -7.5f, 2, 4, 2, \u2603);
        (this.b = new bct(this).b(n, n2)).a(0.0f, 0.0f + \u2603, 0.0f);
        this.b.a(0, 40).a(-9.0f, -2.0f, -6.0f, 18, 12, 11, \u2603);
        this.b.a(0, 70).a(-4.5f, 10.0f, -3.0f, 9, 5, 6, \u2603 + 0.5f);
        (this.c = new bct(this).b(n, n2)).a(0.0f, -7.0f, 0.0f);
        this.c.a(60, 21).a(-13.0f, -2.5f, -3.0f, 4, 30, 6, \u2603);
        (this.d = new bct(this).b(n, n2)).a(0.0f, -7.0f, 0.0f);
        this.d.a(60, 58).a(9.0f, -2.5f, -3.0f, 4, 30, 6, \u2603);
        (this.e = new bct(this, 0, 22).b(n, n2)).a(-4.0f, 18.0f + \u2603, 0.0f);
        this.e.a(37, 0).a(-3.5f, -3.0f, -3.0f, 6, 16, 5, \u2603);
        this.f = new bct(this, 0, 22).b(n, n2);
        this.f.i = true;
        this.f.a(60, 0).a(5.0f, 18.0f + \u2603, 0.0f);
        this.f.a(-3.5f, -3.0f, -3.0f, 6, 16, 5, \u2603);
    }
    
    @Override
    public void a(final pk \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603) {
        this.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        this.a.a(\u2603);
        this.b.a(\u2603);
        this.e.a(\u2603);
        this.f.a(\u2603);
        this.c.a(\u2603);
        this.d.a(\u2603);
    }
    
    @Override
    public void a(final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final pk \u2603) {
        this.a.g = \u2603 / 57.295776f;
        this.a.f = \u2603 / 57.295776f;
        this.e.f = -1.5f * this.a(\u2603, 13.0f) * \u2603;
        this.f.f = 1.5f * this.a(\u2603, 13.0f) * \u2603;
        this.e.g = 0.0f;
        this.f.g = 0.0f;
    }
    
    @Override
    public void a(final pr \u2603, final float \u2603, final float \u2603, final float \u2603) {
        final ty ty = (ty)\u2603;
        final int cl = ty.cl();
        if (cl > 0) {
            this.c.f = -2.0f + 1.5f * this.a(cl - \u2603, 10.0f);
            this.d.f = -2.0f + 1.5f * this.a(cl - \u2603, 10.0f);
        }
        else {
            final int cm = ty.cm();
            if (cm > 0) {
                this.c.f = -0.8f + 0.025f * this.a((float)cm, 70.0f);
                this.d.f = 0.0f;
            }
            else {
                this.c.f = (-0.2f + 1.5f * this.a(\u2603, 13.0f)) * \u2603;
                this.d.f = (-0.2f - 1.5f * this.a(\u2603, 13.0f)) * \u2603;
            }
        }
    }
    
    private float a(final float \u2603, final float \u2603) {
        return (Math.abs(\u2603 % \u2603 - \u2603 * 0.5f) - \u2603 * 0.25f) / (\u2603 * 0.25f);
    }
}
