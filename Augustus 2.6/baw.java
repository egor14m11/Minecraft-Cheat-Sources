// 
// Decompiled by Procyon v0.5.36
// 

public class baw extends bbo
{
    private bct[] a;
    private bct b;
    
    public baw() {
        this.a = new bct[12];
        for (int i = 0; i < this.a.length; ++i) {
            (this.a[i] = new bct(this, 0, 16)).a(0.0f, 0.0f, 0.0f, 2, 8, 2);
        }
        (this.b = new bct(this, 0, 0)).a(-4.0f, -4.0f, -4.0f, 8, 8, 8);
    }
    
    @Override
    public void a(final pk \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603) {
        this.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        this.b.a(\u2603);
        for (int i = 0; i < this.a.length; ++i) {
            this.a[i].a(\u2603);
        }
    }
    
    @Override
    public void a(final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final pk \u2603) {
        float n = \u2603 * 3.1415927f * -0.1f;
        for (int i = 0; i < 4; ++i) {
            this.a[i].d = -2.0f + ns.b((i * 2 + \u2603) * 0.25f);
            this.a[i].c = ns.b(n) * 9.0f;
            this.a[i].e = ns.a(n) * 9.0f;
            n += 1.5707964f;
        }
        n = 0.7853982f + \u2603 * 3.1415927f * 0.03f;
        for (int i = 4; i < 8; ++i) {
            this.a[i].d = 2.0f + ns.b((i * 2 + \u2603) * 0.25f);
            this.a[i].c = ns.b(n) * 7.0f;
            this.a[i].e = ns.a(n) * 7.0f;
            n += 1.5707964f;
        }
        n = 0.47123894f + \u2603 * 3.1415927f * -0.05f;
        for (int i = 8; i < 12; ++i) {
            this.a[i].d = 11.0f + ns.b((i * 1.5f + \u2603) * 0.5f);
            this.a[i].c = ns.b(n) * 5.0f;
            this.a[i].e = ns.a(n) * 5.0f;
            n += 1.5707964f;
        }
        this.b.g = \u2603 / 57.295776f;
        this.b.f = \u2603 / 57.295776f;
    }
}
