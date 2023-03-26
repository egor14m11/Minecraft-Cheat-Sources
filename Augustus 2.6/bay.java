// 
// Decompiled by Procyon v0.5.36
// 

public class bay extends bbo
{
    public bct a;
    public bct b;
    public bct c;
    public bct d;
    public bct e;
    public bct f;
    public bct g;
    
    public bay() {
        this.a = new bct(this).a(0, 0).a(-6.0f, -5.0f, 0.0f, 6, 10, 0);
        this.b = new bct(this).a(16, 0).a(0.0f, -5.0f, 0.0f, 6, 10, 0);
        this.g = new bct(this).a(12, 0).a(-1.0f, -5.0f, 0.0f, 2, 10, 0);
        this.c = new bct(this).a(0, 10).a(0.0f, -4.0f, -0.99f, 5, 8, 1);
        this.d = new bct(this).a(12, 10).a(0.0f, -4.0f, -0.01f, 5, 8, 1);
        this.e = new bct(this).a(24, 10).a(0.0f, -4.0f, 0.0f, 5, 8, 0);
        this.f = new bct(this).a(24, 10).a(0.0f, -4.0f, 0.0f, 5, 8, 0);
        this.a.a(0.0f, 0.0f, -1.0f);
        this.b.a(0.0f, 0.0f, 1.0f);
        this.g.g = 1.5707964f;
    }
    
    @Override
    public void a(final pk \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603) {
        this.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        this.a.a(\u2603);
        this.b.a(\u2603);
        this.g.a(\u2603);
        this.c.a(\u2603);
        this.d.a(\u2603);
        this.e.a(\u2603);
        this.f.a(\u2603);
    }
    
    @Override
    public void a(final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final pk \u2603) {
        final float \u26032 = (ns.a(\u2603 * 0.02f) * 0.1f + 1.25f) * \u2603;
        this.a.g = 3.1415927f + \u26032;
        this.b.g = -\u26032;
        this.c.g = \u26032;
        this.d.g = -\u26032;
        this.e.g = \u26032 - \u26032 * 2.0f * \u2603;
        this.f.g = \u26032 - \u26032 * 2.0f * \u2603;
        this.c.c = ns.a(\u26032);
        this.d.c = ns.a(\u26032);
        this.e.c = ns.a(\u26032);
        this.f.c = ns.a(\u26032);
    }
}
