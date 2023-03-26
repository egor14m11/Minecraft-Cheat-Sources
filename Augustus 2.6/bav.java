// 
// Decompiled by Procyon v0.5.36
// 

public class bav extends bbo
{
    private bct a;
    private bct b;
    private bct c;
    private bct d;
    private bct e;
    private bct f;
    
    public bav() {
        this.t = 64;
        this.u = 64;
        (this.a = new bct(this, 0, 0)).a(-3.0f, -3.0f, -3.0f, 6, 6, 6);
        final bct \u2603 = new bct(this, 24, 0);
        \u2603.a(-4.0f, -6.0f, -2.0f, 3, 4, 1);
        this.a.a(\u2603);
        final bct \u26032 = new bct(this, 24, 0);
        \u26032.i = true;
        \u26032.a(1.0f, -6.0f, -2.0f, 3, 4, 1);
        this.a.a(\u26032);
        (this.b = new bct(this, 0, 16)).a(-3.0f, 4.0f, -3.0f, 6, 12, 6);
        this.b.a(0, 34).a(-5.0f, 16.0f, 0.0f, 10, 6, 1);
        (this.c = new bct(this, 42, 0)).a(-12.0f, 1.0f, 1.5f, 10, 16, 1);
        (this.e = new bct(this, 24, 16)).a(-12.0f, 1.0f, 1.5f);
        this.e.a(-8.0f, 1.0f, 0.0f, 8, 12, 1);
        this.d = new bct(this, 42, 0);
        this.d.i = true;
        this.d.a(2.0f, 1.0f, 1.5f, 10, 16, 1);
        this.f = new bct(this, 24, 16);
        this.f.i = true;
        this.f.a(12.0f, 1.0f, 1.5f);
        this.f.a(0.0f, 1.0f, 0.0f, 8, 12, 1);
        this.b.a(this.c);
        this.b.a(this.d);
        this.c.a(this.e);
        this.d.a(this.f);
    }
    
    @Override
    public void a(final pk \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603) {
        this.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        this.a.a(\u2603);
        this.b.a(\u2603);
    }
    
    @Override
    public void a(final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final pk \u2603) {
        if (((tk)\u2603).n()) {
            final float n = 57.295776f;
            this.a.f = \u2603 / 57.295776f;
            this.a.g = 3.1415927f - \u2603 / 57.295776f;
            this.a.h = 3.1415927f;
            this.a.a(0.0f, -2.0f, 0.0f);
            this.c.a(-3.0f, 0.0f, 3.0f);
            this.d.a(3.0f, 0.0f, 3.0f);
            this.b.f = 3.1415927f;
            this.c.f = -0.15707964f;
            this.c.g = -1.2566371f;
            this.e.g = -1.7278761f;
            this.d.f = this.c.f;
            this.d.g = -this.c.g;
            this.f.g = -this.e.g;
        }
        else {
            final float n = 57.295776f;
            this.a.f = \u2603 / 57.295776f;
            this.a.g = \u2603 / 57.295776f;
            this.a.h = 0.0f;
            this.a.a(0.0f, 0.0f, 0.0f);
            this.c.a(0.0f, 0.0f, 0.0f);
            this.d.a(0.0f, 0.0f, 0.0f);
            this.b.f = 0.7853982f + ns.b(\u2603 * 0.1f) * 0.15f;
            this.b.g = 0.0f;
            this.c.g = ns.b(\u2603 * 1.3f) * 3.1415927f * 0.25f;
            this.d.g = -this.c.g;
            this.e.g = this.c.g * 0.5f;
            this.f.g = -this.c.g * 0.5f;
        }
    }
}
