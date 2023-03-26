// 
// Decompiled by Procyon v0.5.36
// 

public class bbg extends bbo
{
    private bct a;
    private bct b;
    private bct[] c;
    private bct[] d;
    
    public bbg() {
        this.t = 64;
        this.u = 64;
        this.c = new bct[12];
        this.a = new bct(this);
        this.a.a(0, 0).a(-6.0f, 10.0f, -8.0f, 12, 12, 16);
        this.a.a(0, 28).a(-8.0f, 10.0f, -6.0f, 2, 12, 12);
        this.a.a(0, 28).a(6.0f, 10.0f, -6.0f, 2, 12, 12, true);
        this.a.a(16, 40).a(-6.0f, 8.0f, -6.0f, 12, 2, 12);
        this.a.a(16, 40).a(-6.0f, 22.0f, -6.0f, 12, 2, 12);
        for (int i = 0; i < this.c.length; ++i) {
            (this.c[i] = new bct(this, 0, 0)).a(-1.0f, -4.5f, -1.0f, 2, 9, 2);
            this.a.a(this.c[i]);
        }
        (this.b = new bct(this, 8, 0)).a(-1.0f, 15.0f, 0.0f, 2, 2, 1);
        this.a.a(this.b);
        this.d = new bct[3];
        (this.d[0] = new bct(this, 40, 0)).a(-2.0f, 14.0f, 7.0f, 4, 4, 8);
        (this.d[1] = new bct(this, 0, 54)).a(0.0f, 14.0f, 0.0f, 3, 3, 7);
        this.d[2] = new bct(this);
        this.d[2].a(41, 32).a(0.0f, 14.0f, 0.0f, 2, 2, 6);
        this.d[2].a(25, 19).a(1.0f, 10.5f, 3.0f, 1, 9, 9);
        this.a.a(this.d[0]);
        this.d[0].a(this.d[1]);
        this.d[1].a(this.d[2]);
    }
    
    public int a() {
        return 54;
    }
    
    @Override
    public void a(final pk \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603) {
        this.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        this.a.a(\u2603);
    }
    
    @Override
    public void a(final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final pk \u2603) {
        final vt vt = (vt)\u2603;
        final float n = \u2603 - vt.W;
        this.a.g = \u2603 / 57.295776f;
        this.a.f = \u2603 / 57.295776f;
        final float[] array = { 1.75f, 0.25f, 0.0f, 0.0f, 0.5f, 0.5f, 0.5f, 0.5f, 1.25f, 0.75f, 0.0f, 0.0f };
        final float[] array2 = { 0.0f, 0.0f, 0.0f, 0.0f, 0.25f, 1.75f, 1.25f, 0.75f, 0.0f, 0.0f, 0.0f, 0.0f };
        final float[] array3 = { 0.0f, 0.0f, 0.25f, 1.75f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.75f, 1.25f };
        final float[] array4 = { 0.0f, 0.0f, 8.0f, -8.0f, -8.0f, 8.0f, 8.0f, -8.0f, 0.0f, 0.0f, 8.0f, -8.0f };
        final float[] array5 = { -8.0f, -8.0f, -8.0f, -8.0f, 0.0f, 0.0f, 0.0f, 0.0f, 8.0f, 8.0f, 8.0f, 8.0f };
        final float[] array6 = { 8.0f, -8.0f, 0.0f, 0.0f, -8.0f, -8.0f, 8.0f, 8.0f, 8.0f, -8.0f, 0.0f, 0.0f };
        final float n2 = (1.0f - vt.p(n)) * 0.55f;
        for (int i = 0; i < 12; ++i) {
            this.c[i].f = 3.1415927f * array[i];
            this.c[i].g = 3.1415927f * array2[i];
            this.c[i].h = 3.1415927f * array3[i];
            this.c[i].c = array4[i] * (1.0f + ns.b(\u2603 * 1.5f + i) * 0.01f - n2);
            this.c[i].d = 16.0f + array5[i] * (1.0f + ns.b(\u2603 * 1.5f + i) * 0.01f - n2);
            this.c[i].e = array6[i] * (1.0f + ns.b(\u2603 * 1.5f + i) * 0.01f - n2);
        }
        this.b.e = -8.25f;
        pk pk = ave.A().ac();
        if (vt.cp()) {
            pk = vt.cq();
        }
        if (pk != null) {
            final aui e = pk.e(0.0f);
            final aui e2 = \u2603.e(0.0f);
            final double n3 = e.b - e2.b;
            if (n3 > 0.0) {
                this.b.d = 0.0f;
            }
            else {
                this.b.d = 1.0f;
            }
            aui d = \u2603.d(0.0f);
            d = new aui(d.a, 0.0, d.c);
            final aui b = new aui(e2.a - e.a, 0.0, e2.c - e.c).a().b(1.5707964f);
            final double b2 = d.b(b);
            this.b.c = ns.c((float)Math.abs(b2)) * 2.0f * (float)Math.signum(b2);
        }
        this.b.j = true;
        final float a = vt.a(n);
        this.d[0].g = ns.a(a) * 3.1415927f * 0.05f;
        this.d[1].g = ns.a(a) * 3.1415927f * 0.1f;
        this.d[1].c = -1.5f;
        this.d[1].d = 0.5f;
        this.d[1].e = 14.0f;
        this.d[2].g = ns.a(a) * 3.1415927f * 0.15f;
        this.d[2].c = 0.5f;
        this.d[2].d = 0.5f;
        this.d[2].e = 6.0f;
    }
}
