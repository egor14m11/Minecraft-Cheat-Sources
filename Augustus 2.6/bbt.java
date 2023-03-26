// 
// Decompiled by Procyon v0.5.36
// 

public class bbt extends bbo
{
    public bct a;
    public bct b;
    public bct c;
    public bct d;
    public bct e;
    public bct f;
    protected float g;
    protected float h;
    
    public bbt(final int \u2603, final float \u2603) {
        this.g = 8.0f;
        this.h = 4.0f;
        (this.a = new bct(this, 0, 0)).a(-4.0f, -4.0f, -8.0f, 8, 8, 8, \u2603);
        this.a.a(0.0f, (float)(18 - \u2603), -6.0f);
        (this.b = new bct(this, 28, 8)).a(-5.0f, -10.0f, -7.0f, 10, 16, 8, \u2603);
        this.b.a(0.0f, (float)(17 - \u2603), 2.0f);
        (this.c = new bct(this, 0, 16)).a(-2.0f, 0.0f, -2.0f, 4, \u2603, 4, \u2603);
        this.c.a(-3.0f, (float)(24 - \u2603), 7.0f);
        (this.d = new bct(this, 0, 16)).a(-2.0f, 0.0f, -2.0f, 4, \u2603, 4, \u2603);
        this.d.a(3.0f, (float)(24 - \u2603), 7.0f);
        (this.e = new bct(this, 0, 16)).a(-2.0f, 0.0f, -2.0f, 4, \u2603, 4, \u2603);
        this.e.a(-3.0f, (float)(24 - \u2603), -5.0f);
        (this.f = new bct(this, 0, 16)).a(-2.0f, 0.0f, -2.0f, 4, \u2603, 4, \u2603);
        this.f.a(3.0f, (float)(24 - \u2603), -5.0f);
    }
    
    @Override
    public void a(final pk \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603) {
        this.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        if (this.r) {
            final float n = 2.0f;
            bfl.E();
            bfl.b(0.0f, this.g * \u2603, this.h * \u2603);
            this.a.a(\u2603);
            bfl.F();
            bfl.E();
            bfl.a(1.0f / n, 1.0f / n, 1.0f / n);
            bfl.b(0.0f, 24.0f * \u2603, 0.0f);
            this.b.a(\u2603);
            this.c.a(\u2603);
            this.d.a(\u2603);
            this.e.a(\u2603);
            this.f.a(\u2603);
            bfl.F();
        }
        else {
            this.a.a(\u2603);
            this.b.a(\u2603);
            this.c.a(\u2603);
            this.d.a(\u2603);
            this.e.a(\u2603);
            this.f.a(\u2603);
        }
    }
    
    @Override
    public void a(final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final pk \u2603) {
        final float n = 57.295776f;
        this.a.f = \u2603 / 57.295776f;
        this.a.g = \u2603 / 57.295776f;
        this.b.f = 1.5707964f;
        this.c.f = ns.b(\u2603 * 0.6662f) * 1.4f * \u2603;
        this.d.f = ns.b(\u2603 * 0.6662f + 3.1415927f) * 1.4f * \u2603;
        this.e.f = ns.b(\u2603 * 0.6662f + 3.1415927f) * 1.4f * \u2603;
        this.f.f = ns.b(\u2603 * 0.6662f) * 1.4f * \u2603;
    }
}
