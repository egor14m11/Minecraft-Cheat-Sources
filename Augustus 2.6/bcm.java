// 
// Decompiled by Procyon v0.5.36
// 

public class bcm extends bbo
{
    public bct a;
    public bct b;
    public bct c;
    public bct d;
    public bct e;
    public bct f;
    bct g;
    bct h;
    
    public bcm() {
        final float \u2603 = 0.0f;
        final float \u26032 = 13.5f;
        (this.a = new bct(this, 0, 0)).a(-3.0f, -3.0f, -2.0f, 6, 6, 4, \u2603);
        this.a.a(-1.0f, \u26032, -7.0f);
        (this.b = new bct(this, 18, 14)).a(-4.0f, -2.0f, -3.0f, 6, 9, 6, \u2603);
        this.b.a(0.0f, 14.0f, 2.0f);
        (this.h = new bct(this, 21, 0)).a(-4.0f, -3.0f, -3.0f, 8, 6, 7, \u2603);
        this.h.a(-1.0f, 14.0f, 2.0f);
        (this.c = new bct(this, 0, 18)).a(-1.0f, 0.0f, -1.0f, 2, 8, 2, \u2603);
        this.c.a(-2.5f, 16.0f, 7.0f);
        (this.d = new bct(this, 0, 18)).a(-1.0f, 0.0f, -1.0f, 2, 8, 2, \u2603);
        this.d.a(0.5f, 16.0f, 7.0f);
        (this.e = new bct(this, 0, 18)).a(-1.0f, 0.0f, -1.0f, 2, 8, 2, \u2603);
        this.e.a(-2.5f, 16.0f, -4.0f);
        (this.f = new bct(this, 0, 18)).a(-1.0f, 0.0f, -1.0f, 2, 8, 2, \u2603);
        this.f.a(0.5f, 16.0f, -4.0f);
        (this.g = new bct(this, 9, 18)).a(-1.0f, 0.0f, -1.0f, 2, 8, 2, \u2603);
        this.g.a(-1.0f, 12.0f, 8.0f);
        this.a.a(16, 14).a(-3.0f, -5.0f, 0.0f, 2, 2, 1, \u2603);
        this.a.a(16, 14).a(1.0f, -5.0f, 0.0f, 2, 2, 1, \u2603);
        this.a.a(0, 10).a(-1.5f, 0.0f, -5.0f, 3, 3, 4, \u2603);
    }
    
    @Override
    public void a(final pk \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603) {
        super.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        this.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        if (this.r) {
            final float n = 2.0f;
            bfl.E();
            bfl.b(0.0f, 5.0f * \u2603, 2.0f * \u2603);
            this.a.b(\u2603);
            bfl.F();
            bfl.E();
            bfl.a(1.0f / n, 1.0f / n, 1.0f / n);
            bfl.b(0.0f, 24.0f * \u2603, 0.0f);
            this.b.a(\u2603);
            this.c.a(\u2603);
            this.d.a(\u2603);
            this.e.a(\u2603);
            this.f.a(\u2603);
            this.g.b(\u2603);
            this.h.a(\u2603);
            bfl.F();
        }
        else {
            this.a.b(\u2603);
            this.b.a(\u2603);
            this.c.a(\u2603);
            this.d.a(\u2603);
            this.e.a(\u2603);
            this.f.a(\u2603);
            this.g.b(\u2603);
            this.h.a(\u2603);
        }
    }
    
    @Override
    public void a(final pr \u2603, final float \u2603, final float \u2603, final float \u2603) {
        final ua ua = (ua)\u2603;
        if (ua.cv()) {
            this.g.g = 0.0f;
        }
        else {
            this.g.g = ns.b(\u2603 * 0.6662f) * 1.4f * \u2603;
        }
        if (ua.cn()) {
            this.h.a(-1.0f, 16.0f, -3.0f);
            this.h.f = 1.2566371f;
            this.h.g = 0.0f;
            this.b.a(0.0f, 18.0f, 0.0f);
            this.b.f = 0.7853982f;
            this.g.a(-1.0f, 21.0f, 6.0f);
            this.c.a(-2.5f, 22.0f, 2.0f);
            this.c.f = 4.712389f;
            this.d.a(0.5f, 22.0f, 2.0f);
            this.d.f = 4.712389f;
            this.e.f = 5.811947f;
            this.e.a(-2.49f, 17.0f, -4.0f);
            this.f.f = 5.811947f;
            this.f.a(0.51f, 17.0f, -4.0f);
        }
        else {
            this.b.a(0.0f, 14.0f, 2.0f);
            this.b.f = 1.5707964f;
            this.h.a(-1.0f, 14.0f, -3.0f);
            this.h.f = this.b.f;
            this.g.a(-1.0f, 12.0f, 8.0f);
            this.c.a(-2.5f, 16.0f, 7.0f);
            this.d.a(0.5f, 16.0f, 7.0f);
            this.e.a(-2.5f, 16.0f, -4.0f);
            this.f.a(0.5f, 16.0f, -4.0f);
            this.c.f = ns.b(\u2603 * 0.6662f) * 1.4f * \u2603;
            this.d.f = ns.b(\u2603 * 0.6662f + 3.1415927f) * 1.4f * \u2603;
            this.e.f = ns.b(\u2603 * 0.6662f + 3.1415927f) * 1.4f * \u2603;
            this.f.f = ns.b(\u2603 * 0.6662f) * 1.4f * \u2603;
        }
        this.a.h = ua.q(\u2603) + ua.i(\u2603, 0.0f);
        this.h.h = ua.i(\u2603, -0.08f);
        this.b.h = ua.i(\u2603, -0.16f);
        this.g.h = ua.i(\u2603, -0.2f);
    }
    
    @Override
    public void a(final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final pk \u2603) {
        super.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        this.a.f = \u2603 / 57.295776f;
        this.a.g = \u2603 / 57.295776f;
        this.g.f = \u2603;
    }
}
