// 
// Decompiled by Procyon v0.5.36
// 

public class bcp extends bbo
{
    private bct a;
    private bct b;
    private bct c;
    
    public bcp(final float \u2603, final boolean \u2603) {
        this.b = new bct(this, "glass");
        this.b.a(0, 0).a(-4.0f, -4.0f, -4.0f, 8, 8, 8);
        this.a = new bct(this, "cube");
        this.a.a(32, 0).a(-4.0f, -4.0f, -4.0f, 8, 8, 8);
        if (\u2603) {
            this.c = new bct(this, "base");
            this.c.a(0, 16).a(-6.0f, 0.0f, -6.0f, 12, 4, 12);
        }
    }
    
    @Override
    public void a(final pk \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603) {
        bfl.E();
        bfl.a(2.0f, 2.0f, 2.0f);
        bfl.b(0.0f, -0.5f, 0.0f);
        if (this.c != null) {
            this.c.a(\u2603);
        }
        bfl.b(\u2603, 0.0f, 1.0f, 0.0f);
        bfl.b(0.0f, 0.8f + \u2603, 0.0f);
        bfl.b(60.0f, 0.7071f, 0.0f, 0.7071f);
        this.b.a(\u2603);
        final float n = 0.875f;
        bfl.a(n, n, n);
        bfl.b(60.0f, 0.7071f, 0.0f, 0.7071f);
        bfl.b(\u2603, 0.0f, 1.0f, 0.0f);
        this.b.a(\u2603);
        bfl.a(n, n, n);
        bfl.b(60.0f, 0.7071f, 0.0f, 0.7071f);
        bfl.b(\u2603, 0.0f, 1.0f, 0.0f);
        this.a.a(\u2603);
        bfl.F();
    }
}
