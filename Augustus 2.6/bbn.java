// 
// Decompiled by Procyon v0.5.36
// 

public class bbn extends bbo
{
    public bct[] a;
    
    public bbn() {
        (this.a = new bct[7])[0] = new bct(this, 0, 10);
        this.a[1] = new bct(this, 0, 0);
        this.a[2] = new bct(this, 0, 0);
        this.a[3] = new bct(this, 0, 0);
        this.a[4] = new bct(this, 0, 0);
        this.a[5] = new bct(this, 44, 10);
        final int \u2603 = 20;
        final int n = 8;
        final int \u26032 = 16;
        final int n2 = 4;
        this.a[0].a((float)(-\u2603 / 2), (float)(-\u26032 / 2), -1.0f, \u2603, \u26032, 2, 0.0f);
        this.a[0].a(0.0f, (float)n2, 0.0f);
        this.a[5].a((float)(-\u2603 / 2 + 1), (float)(-\u26032 / 2 + 1), -1.0f, \u2603 - 2, \u26032 - 2, 1, 0.0f);
        this.a[5].a(0.0f, (float)n2, 0.0f);
        this.a[1].a((float)(-\u2603 / 2 + 2), (float)(-n - 1), -1.0f, \u2603 - 4, n, 2, 0.0f);
        this.a[1].a((float)(-\u2603 / 2 + 1), (float)n2, 0.0f);
        this.a[2].a((float)(-\u2603 / 2 + 2), (float)(-n - 1), -1.0f, \u2603 - 4, n, 2, 0.0f);
        this.a[2].a((float)(\u2603 / 2 - 1), (float)n2, 0.0f);
        this.a[3].a((float)(-\u2603 / 2 + 2), (float)(-n - 1), -1.0f, \u2603 - 4, n, 2, 0.0f);
        this.a[3].a(0.0f, (float)n2, (float)(-\u26032 / 2 + 1));
        this.a[4].a((float)(-\u2603 / 2 + 2), (float)(-n - 1), -1.0f, \u2603 - 4, n, 2, 0.0f);
        this.a[4].a(0.0f, (float)n2, (float)(\u26032 / 2 - 1));
        this.a[0].f = 1.5707964f;
        this.a[1].g = 4.712389f;
        this.a[2].g = 1.5707964f;
        this.a[3].g = 3.1415927f;
        this.a[5].f = -1.5707964f;
    }
    
    @Override
    public void a(final pk \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603) {
        this.a[5].d = 4.0f - \u2603;
        for (int i = 0; i < 6; ++i) {
            this.a[i].a(\u2603);
        }
    }
}
