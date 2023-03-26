// 
// Decompiled by Procyon v0.5.36
// 

public class bbc extends bbo
{
    public bct a;
    public bct b;
    public bct c;
    public bct d;
    public bct e;
    public bct f;
    public bct g;
    
    public bbc() {
        this(0.0f);
    }
    
    public bbc(final float \u2603) {
        final int n = 6;
        (this.a = new bct(this, 0, 0)).a(-4.0f, -8.0f, -4.0f, 8, 8, 8, \u2603);
        this.a.a(0.0f, (float)n, 0.0f);
        (this.b = new bct(this, 32, 0)).a(-4.0f, -8.0f, -4.0f, 8, 8, 8, \u2603 + 0.5f);
        this.b.a(0.0f, (float)n, 0.0f);
        (this.c = new bct(this, 16, 16)).a(-4.0f, 0.0f, -2.0f, 8, 12, 4, \u2603);
        this.c.a(0.0f, (float)n, 0.0f);
        (this.d = new bct(this, 0, 16)).a(-2.0f, 0.0f, -2.0f, 4, 6, 4, \u2603);
        this.d.a(-2.0f, (float)(12 + n), 4.0f);
        (this.e = new bct(this, 0, 16)).a(-2.0f, 0.0f, -2.0f, 4, 6, 4, \u2603);
        this.e.a(2.0f, (float)(12 + n), 4.0f);
        (this.f = new bct(this, 0, 16)).a(-2.0f, 0.0f, -2.0f, 4, 6, 4, \u2603);
        this.f.a(-2.0f, (float)(12 + n), -4.0f);
        (this.g = new bct(this, 0, 16)).a(-2.0f, 0.0f, -2.0f, 4, 6, 4, \u2603);
        this.g.a(2.0f, (float)(12 + n), -4.0f);
    }
    
    @Override
    public void a(final pk \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603) {
        this.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        this.a.a(\u2603);
        this.c.a(\u2603);
        this.d.a(\u2603);
        this.e.a(\u2603);
        this.f.a(\u2603);
        this.g.a(\u2603);
    }
    
    @Override
    public void a(final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final pk \u2603) {
        this.a.g = \u2603 / 57.295776f;
        this.a.f = \u2603 / 57.295776f;
        this.d.f = ns.b(\u2603 * 0.6662f) * 1.4f * \u2603;
        this.e.f = ns.b(\u2603 * 0.6662f + 3.1415927f) * 1.4f * \u2603;
        this.f.f = ns.b(\u2603 * 0.6662f + 3.1415927f) * 1.4f * \u2603;
        this.g.f = ns.b(\u2603 * 0.6662f) * 1.4f * \u2603;
    }
}
