// 
// Decompiled by Procyon v0.5.36
// 

public class bcd extends bbo
{
    public bct a;
    public bct b;
    public bct c;
    public bct d;
    public bct e;
    
    public bcd() {
        final float n = 4.0f;
        final float n2 = 0.0f;
        (this.c = new bct(this, 0, 0).b(64, 64)).a(-4.0f, -8.0f, -4.0f, 8, 8, 8, n2 - 0.5f);
        this.c.a(0.0f, 0.0f + n, 0.0f);
        (this.d = new bct(this, 32, 0).b(64, 64)).a(-1.0f, 0.0f, -1.0f, 12, 2, 2, n2 - 0.5f);
        this.d.a(0.0f, 0.0f + n + 9.0f - 7.0f, 0.0f);
        (this.e = new bct(this, 32, 0).b(64, 64)).a(-1.0f, 0.0f, -1.0f, 12, 2, 2, n2 - 0.5f);
        this.e.a(0.0f, 0.0f + n + 9.0f - 7.0f, 0.0f);
        (this.a = new bct(this, 0, 16).b(64, 64)).a(-5.0f, -10.0f, -5.0f, 10, 10, 10, n2 - 0.5f);
        this.a.a(0.0f, 0.0f + n + 9.0f, 0.0f);
        (this.b = new bct(this, 0, 36).b(64, 64)).a(-6.0f, -12.0f, -6.0f, 12, 12, 12, n2 - 0.5f);
        this.b.a(0.0f, 0.0f + n + 20.0f, 0.0f);
    }
    
    @Override
    public void a(final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final pk \u2603) {
        super.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        this.c.g = \u2603 / 57.295776f;
        this.c.f = \u2603 / 57.295776f;
        this.a.g = \u2603 / 57.295776f * 0.25f;
        final float a = ns.a(this.a.g);
        final float b = ns.b(this.a.g);
        this.d.h = 1.0f;
        this.e.h = -1.0f;
        this.d.g = 0.0f + this.a.g;
        this.e.g = 3.1415927f + this.a.g;
        this.d.c = b * 5.0f;
        this.d.e = -a * 5.0f;
        this.e.c = -b * 5.0f;
        this.e.e = a * 5.0f;
    }
    
    @Override
    public void a(final pk \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603) {
        this.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        this.a.a(\u2603);
        this.b.a(\u2603);
        this.c.a(\u2603);
        this.d.a(\u2603);
        this.e.a(\u2603);
    }
}
