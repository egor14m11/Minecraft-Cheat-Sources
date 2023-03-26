// 
// Decompiled by Procyon v0.5.36
// 

public class bbl extends bbo
{
    bct[] a;
    bct b;
    
    public bbl() {
        this.a = new bct[8];
        for (int i = 0; i < this.a.length; ++i) {
            int \u2603 = 0;
            int \u26032;
            if ((\u26032 = i) == 2) {
                \u2603 = 24;
                \u26032 = 10;
            }
            else if (i == 3) {
                \u2603 = 24;
                \u26032 = 19;
            }
            (this.a[i] = new bct(this, \u2603, \u26032)).a(-4.0f, (float)(16 + i), -4.0f, 8, 1, 8);
        }
        (this.b = new bct(this, 0, 16)).a(-2.0f, 18.0f, -2.0f, 4, 4, 4);
    }
    
    @Override
    public void a(final pr \u2603, final float \u2603, final float \u2603, final float \u2603) {
        final vu vu = (vu)\u2603;
        float n = vu.c + (vu.b - vu.c) * \u2603;
        if (n < 0.0f) {
            n = 0.0f;
        }
        for (int i = 0; i < this.a.length; ++i) {
            this.a[i].d = -(4 - i) * n * 1.7f;
        }
    }
    
    @Override
    public void a(final pk \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603) {
        this.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        this.b.a(\u2603);
        for (int i = 0; i < this.a.length; ++i) {
            this.a[i].a(\u2603);
        }
    }
}
