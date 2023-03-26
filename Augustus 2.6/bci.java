// 
// Decompiled by Procyon v0.5.36
// 

public class bci extends bbo
{
    public bct a;
    public bct b;
    public bct c;
    public bct d;
    public bct e;
    public bct f;
    
    public bci(final float \u2603) {
        this(\u2603, 0.0f, 64, 64);
    }
    
    public bci(final float \u2603, final float \u2603, final int \u2603, final int \u2603) {
        (this.a = new bct(this).b(\u2603, \u2603)).a(0.0f, 0.0f + \u2603, 0.0f);
        this.a.a(0, 0).a(-4.0f, -10.0f, -4.0f, 8, 10, 8, \u2603);
        (this.f = new bct(this).b(\u2603, \u2603)).a(0.0f, \u2603 - 2.0f, 0.0f);
        this.f.a(24, 0).a(-1.0f, -1.0f, -6.0f, 2, 4, 2, \u2603);
        this.a.a(this.f);
        (this.b = new bct(this).b(\u2603, \u2603)).a(0.0f, 0.0f + \u2603, 0.0f);
        this.b.a(16, 20).a(-4.0f, 0.0f, -3.0f, 8, 12, 6, \u2603);
        this.b.a(0, 38).a(-4.0f, 0.0f, -3.0f, 8, 18, 6, \u2603 + 0.5f);
        (this.c = new bct(this).b(\u2603, \u2603)).a(0.0f, 0.0f + \u2603 + 2.0f, 0.0f);
        this.c.a(44, 22).a(-8.0f, -2.0f, -2.0f, 4, 8, 4, \u2603);
        this.c.a(44, 22).a(4.0f, -2.0f, -2.0f, 4, 8, 4, \u2603);
        this.c.a(40, 38).a(-4.0f, 2.0f, -2.0f, 8, 4, 4, \u2603);
        (this.d = new bct(this, 0, 22).b(\u2603, \u2603)).a(-2.0f, 12.0f + \u2603, 0.0f);
        this.d.a(-2.0f, 0.0f, -2.0f, 4, 12, 4, \u2603);
        this.e = new bct(this, 0, 22).b(\u2603, \u2603);
        this.e.i = true;
        this.e.a(2.0f, 12.0f + \u2603, 0.0f);
        this.e.a(-2.0f, 0.0f, -2.0f, 4, 12, 4, \u2603);
    }
    
    @Override
    public void a(final pk \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603) {
        this.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        this.a.a(\u2603);
        this.b.a(\u2603);
        this.d.a(\u2603);
        this.e.a(\u2603);
        this.c.a(\u2603);
    }
    
    @Override
    public void a(final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final pk \u2603) {
        this.a.g = \u2603 / 57.295776f;
        this.a.f = \u2603 / 57.295776f;
        this.c.d = 3.0f;
        this.c.e = -1.0f;
        this.c.f = -0.75f;
        this.d.f = ns.b(\u2603 * 0.6662f) * 1.4f * \u2603 * 0.5f;
        this.e.f = ns.b(\u2603 * 0.6662f + 3.1415927f) * 1.4f * \u2603 * 0.5f;
        this.d.g = 0.0f;
        this.e.g = 0.0f;
    }
}
