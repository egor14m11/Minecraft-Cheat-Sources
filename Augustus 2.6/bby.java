// 
// Decompiled by Procyon v0.5.36
// 

public class bby extends bbo
{
    private bct[] a;
    private bct[] b;
    private float[] c;
    private static final int[][] d;
    private static final int[][] e;
    
    public bby() {
        this.c = new float[7];
        this.a = new bct[7];
        float \u2603 = -3.5f;
        for (int i = 0; i < this.a.length; ++i) {
            (this.a[i] = new bct(this, bby.e[i][0], bby.e[i][1])).a(bby.d[i][0] * -0.5f, 0.0f, bby.d[i][2] * -0.5f, bby.d[i][0], bby.d[i][1], bby.d[i][2]);
            this.a[i].a(0.0f, (float)(24 - bby.d[i][1]), \u2603);
            this.c[i] = \u2603;
            if (i < this.a.length - 1) {
                \u2603 += (bby.d[i][2] + bby.d[i + 1][2]) * 0.5f;
            }
        }
        this.b = new bct[3];
        (this.b[0] = new bct(this, 20, 0)).a(-5.0f, 0.0f, bby.d[2][2] * -0.5f, 10, 8, bby.d[2][2]);
        this.b[0].a(0.0f, 16.0f, this.c[2]);
        (this.b[1] = new bct(this, 20, 11)).a(-3.0f, 0.0f, bby.d[4][2] * -0.5f, 6, 4, bby.d[4][2]);
        this.b[1].a(0.0f, 20.0f, this.c[4]);
        (this.b[2] = new bct(this, 20, 18)).a(-3.0f, 0.0f, bby.d[4][2] * -0.5f, 6, 5, bby.d[1][2]);
        this.b[2].a(0.0f, 19.0f, this.c[1]);
    }
    
    @Override
    public void a(final pk \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603) {
        this.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        for (int i = 0; i < this.a.length; ++i) {
            this.a[i].a(\u2603);
        }
        for (int i = 0; i < this.b.length; ++i) {
            this.b[i].a(\u2603);
        }
    }
    
    @Override
    public void a(final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final pk \u2603) {
        for (int i = 0; i < this.a.length; ++i) {
            this.a[i].g = ns.b(\u2603 * 0.9f + i * 0.15f * 3.1415927f) * 3.1415927f * 0.05f * (1 + Math.abs(i - 2));
            this.a[i].c = ns.a(\u2603 * 0.9f + i * 0.15f * 3.1415927f) * 3.1415927f * 0.2f * Math.abs(i - 2);
        }
        this.b[0].g = this.a[2].g;
        this.b[1].g = this.a[4].g;
        this.b[1].c = this.a[4].c;
        this.b[2].g = this.a[1].g;
        this.b[2].c = this.a[1].c;
    }
    
    static {
        d = new int[][] { { 3, 2, 2 }, { 4, 3, 2 }, { 6, 4, 3 }, { 3, 3, 3 }, { 2, 2, 3 }, { 2, 1, 2 }, { 1, 1, 2 } };
        e = new int[][] { { 0, 0 }, { 0, 4 }, { 0, 9 }, { 0, 16 }, { 0, 22 }, { 11, 0 }, { 13, 4 } };
    }
}
