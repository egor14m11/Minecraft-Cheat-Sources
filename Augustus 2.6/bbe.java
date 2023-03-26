// 
// Decompiled by Procyon v0.5.36
// 

public class bbe extends bbo
{
    private static final int[][] a;
    private static final int[][] b;
    private static final int c;
    private final bct[] d;
    
    public bbe() {
        this.d = new bct[bbe.c];
        float \u2603 = -3.5f;
        for (int i = 0; i < this.d.length; ++i) {
            (this.d[i] = new bct(this, bbe.b[i][0], bbe.b[i][1])).a(bbe.a[i][0] * -0.5f, 0.0f, bbe.a[i][2] * -0.5f, bbe.a[i][0], bbe.a[i][1], bbe.a[i][2]);
            this.d[i].a(0.0f, (float)(24 - bbe.a[i][1]), \u2603);
            if (i < this.d.length - 1) {
                \u2603 += (bbe.a[i][2] + bbe.a[i + 1][2]) * 0.5f;
            }
        }
    }
    
    @Override
    public void a(final pk \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603) {
        this.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        for (int i = 0; i < this.d.length; ++i) {
            this.d[i].a(\u2603);
        }
    }
    
    @Override
    public void a(final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final pk \u2603) {
        for (int i = 0; i < this.d.length; ++i) {
            this.d[i].g = ns.b(\u2603 * 0.9f + i * 0.15f * 3.1415927f) * 3.1415927f * 0.01f * (1 + Math.abs(i - 2));
            this.d[i].c = ns.a(\u2603 * 0.9f + i * 0.15f * 3.1415927f) * 3.1415927f * 0.1f * Math.abs(i - 2);
        }
    }
    
    static {
        a = new int[][] { { 4, 3, 2 }, { 6, 4, 5 }, { 3, 3, 1 }, { 1, 2, 1 } };
        b = new int[][] { { 0, 0 }, { 0, 5 }, { 0, 14 }, { 0, 18 } };
        c = bbe.a.length;
    }
}
