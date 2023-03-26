// 
// Decompiled by Procyon v0.5.36
// 

public class bax extends bbo
{
    public bct[] a;
    
    public bax() {
        (this.a = new bct[5])[0] = new bct(this, 0, 8);
        this.a[1] = new bct(this, 0, 0);
        this.a[2] = new bct(this, 0, 0);
        this.a[3] = new bct(this, 0, 0);
        this.a[4] = new bct(this, 0, 0);
        final int \u2603 = 24;
        final int n = 6;
        final int n2 = 20;
        final int n3 = 4;
        this.a[0].a((float)(-\u2603 / 2), (float)(-n2 / 2 + 2), -3.0f, \u2603, n2 - 4, 4, 0.0f);
        this.a[0].a(0.0f, (float)n3, 0.0f);
        this.a[1].a((float)(-\u2603 / 2 + 2), (float)(-n - 1), -1.0f, \u2603 - 4, n, 2, 0.0f);
        this.a[1].a((float)(-\u2603 / 2 + 1), (float)n3, 0.0f);
        this.a[2].a((float)(-\u2603 / 2 + 2), (float)(-n - 1), -1.0f, \u2603 - 4, n, 2, 0.0f);
        this.a[2].a((float)(\u2603 / 2 - 1), (float)n3, 0.0f);
        this.a[3].a((float)(-\u2603 / 2 + 2), (float)(-n - 1), -1.0f, \u2603 - 4, n, 2, 0.0f);
        this.a[3].a(0.0f, (float)n3, (float)(-n2 / 2 + 1));
        this.a[4].a((float)(-\u2603 / 2 + 2), (float)(-n - 1), -1.0f, \u2603 - 4, n, 2, 0.0f);
        this.a[4].a(0.0f, (float)n3, (float)(n2 / 2 - 1));
        this.a[0].f = 1.5707964f;
        this.a[1].g = 4.712389f;
        this.a[2].g = 1.5707964f;
        this.a[3].g = 3.1415927f;
    }
    
    @Override
    public void a(final pk \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603) {
        for (int i = 0; i < 5; ++i) {
            this.a[i].a(\u2603);
        }
    }
}
