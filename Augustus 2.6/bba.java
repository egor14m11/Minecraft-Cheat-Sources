// 
// Decompiled by Procyon v0.5.36
// 

public class bba extends bbo
{
    public bct a;
    public bct b;
    public bct c;
    public bct d;
    public bct e;
    public bct f;
    public bct g;
    public bct h;
    
    public bba() {
        final int n = 16;
        (this.a = new bct(this, 0, 0)).a(-2.0f, -6.0f, -2.0f, 4, 6, 3, 0.0f);
        this.a.a(0.0f, (float)(-1 + n), -4.0f);
        (this.g = new bct(this, 14, 0)).a(-2.0f, -4.0f, -4.0f, 4, 2, 2, 0.0f);
        this.g.a(0.0f, (float)(-1 + n), -4.0f);
        (this.h = new bct(this, 14, 4)).a(-1.0f, -2.0f, -3.0f, 2, 2, 2, 0.0f);
        this.h.a(0.0f, (float)(-1 + n), -4.0f);
        (this.b = new bct(this, 0, 9)).a(-3.0f, -4.0f, -3.0f, 6, 8, 6, 0.0f);
        this.b.a(0.0f, (float)n, 0.0f);
        (this.c = new bct(this, 26, 0)).a(-1.0f, 0.0f, -3.0f, 3, 5, 3);
        this.c.a(-2.0f, (float)(3 + n), 1.0f);
        (this.d = new bct(this, 26, 0)).a(-1.0f, 0.0f, -3.0f, 3, 5, 3);
        this.d.a(1.0f, (float)(3 + n), 1.0f);
        (this.e = new bct(this, 24, 13)).a(0.0f, 0.0f, -3.0f, 1, 4, 6);
        this.e.a(-4.0f, (float)(-3 + n), 0.0f);
        (this.f = new bct(this, 24, 13)).a(-1.0f, 0.0f, -3.0f, 1, 4, 6);
        this.f.a(4.0f, (float)(-3 + n), 0.0f);
    }
    
    @Override
    public void a(final pk \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603) {
        this.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        if (this.r) {
            final float n = 2.0f;
            bfl.E();
            bfl.b(0.0f, 5.0f * \u2603, 2.0f * \u2603);
            this.a.a(\u2603);
            this.g.a(\u2603);
            this.h.a(\u2603);
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
            this.g.a(\u2603);
            this.h.a(\u2603);
            this.b.a(\u2603);
            this.c.a(\u2603);
            this.d.a(\u2603);
            this.e.a(\u2603);
            this.f.a(\u2603);
        }
    }
    
    @Override
    public void a(final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final pk \u2603) {
        this.a.f = \u2603 / 57.295776f;
        this.a.g = \u2603 / 57.295776f;
        this.g.f = this.a.f;
        this.g.g = this.a.g;
        this.h.f = this.a.f;
        this.h.g = this.a.g;
        this.b.f = 1.5707964f;
        this.c.f = ns.b(\u2603 * 0.6662f) * 1.4f * \u2603;
        this.d.f = ns.b(\u2603 * 0.6662f + 3.1415927f) * 1.4f * \u2603;
        this.e.h = \u2603;
        this.f.h = -\u2603;
    }
}
