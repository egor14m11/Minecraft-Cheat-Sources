// 
// Decompiled by Procyon v0.5.36
// 

public class bco extends bbo
{
    private bct a;
    private bct b;
    private bct c;
    private bct d;
    private bct e;
    private bct f;
    private bct g;
    private bct h;
    private bct i;
    private bct j;
    private bct k;
    private bct l;
    private float m;
    
    public bco(final float \u2603) {
        this.t = 256;
        this.u = 256;
        this.a("body.body", 0, 0);
        this.a("wing.skin", -56, 88);
        this.a("wingtip.skin", -56, 144);
        this.a("rearleg.main", 0, 0);
        this.a("rearfoot.main", 112, 0);
        this.a("rearlegtip.main", 196, 0);
        this.a("head.upperhead", 112, 30);
        this.a("wing.bone", 112, 88);
        this.a("head.upperlip", 176, 44);
        this.a("jaw.jaw", 176, 65);
        this.a("frontleg.main", 112, 104);
        this.a("wingtip.bone", 112, 136);
        this.a("frontfoot.main", 144, 104);
        this.a("neck.box", 192, 104);
        this.a("frontlegtip.main", 226, 138);
        this.a("body.scale", 220, 53);
        this.a("head.scale", 0, 0);
        this.a("neck.scale", 48, 0);
        this.a("head.nostril", 112, 0);
        final float n = -16.0f;
        (this.a = new bct(this, "head")).a("upperlip", -6.0f, -1.0f, -8.0f + n, 12, 5, 16);
        this.a.a("upperhead", -8.0f, -8.0f, 6.0f + n, 16, 16, 16);
        this.a.i = true;
        this.a.a("scale", -5.0f, -12.0f, 12.0f + n, 2, 4, 6);
        this.a.a("nostril", -5.0f, -3.0f, -6.0f + n, 2, 2, 4);
        this.a.i = false;
        this.a.a("scale", 3.0f, -12.0f, 12.0f + n, 2, 4, 6);
        this.a.a("nostril", 3.0f, -3.0f, -6.0f + n, 2, 2, 4);
        (this.c = new bct(this, "jaw")).a(0.0f, 4.0f, 8.0f + n);
        this.c.a("jaw", -6.0f, 0.0f, -16.0f, 12, 4, 16);
        this.a.a(this.c);
        (this.b = new bct(this, "neck")).a("box", -5.0f, -5.0f, -5.0f, 10, 10, 10);
        this.b.a("scale", -1.0f, -9.0f, -3.0f, 2, 4, 6);
        (this.d = new bct(this, "body")).a(0.0f, 4.0f, 8.0f);
        this.d.a("body", -12.0f, 0.0f, -16.0f, 24, 24, 64);
        this.d.a("scale", -1.0f, -6.0f, -10.0f, 2, 6, 12);
        this.d.a("scale", -1.0f, -6.0f, 10.0f, 2, 6, 12);
        this.d.a("scale", -1.0f, -6.0f, 30.0f, 2, 6, 12);
        (this.k = new bct(this, "wing")).a(-12.0f, 5.0f, 2.0f);
        this.k.a("bone", -56.0f, -4.0f, -4.0f, 56, 8, 8);
        this.k.a("skin", -56.0f, 0.0f, 2.0f, 56, 0, 56);
        (this.l = new bct(this, "wingtip")).a(-56.0f, 0.0f, 0.0f);
        this.l.a("bone", -56.0f, -2.0f, -2.0f, 56, 4, 4);
        this.l.a("skin", -56.0f, 0.0f, 2.0f, 56, 0, 56);
        this.k.a(this.l);
        (this.f = new bct(this, "frontleg")).a(-12.0f, 20.0f, 2.0f);
        this.f.a("main", -4.0f, -4.0f, -4.0f, 8, 24, 8);
        (this.h = new bct(this, "frontlegtip")).a(0.0f, 20.0f, -1.0f);
        this.h.a("main", -3.0f, -1.0f, -3.0f, 6, 24, 6);
        this.f.a(this.h);
        (this.j = new bct(this, "frontfoot")).a(0.0f, 23.0f, 0.0f);
        this.j.a("main", -4.0f, 0.0f, -12.0f, 8, 4, 16);
        this.h.a(this.j);
        (this.e = new bct(this, "rearleg")).a(-16.0f, 16.0f, 42.0f);
        this.e.a("main", -8.0f, -4.0f, -8.0f, 16, 32, 16);
        (this.g = new bct(this, "rearlegtip")).a(0.0f, 32.0f, -4.0f);
        this.g.a("main", -6.0f, -2.0f, 0.0f, 12, 32, 12);
        this.e.a(this.g);
        (this.i = new bct(this, "rearfoot")).a(0.0f, 31.0f, 4.0f);
        this.i.a("main", -9.0f, 0.0f, -20.0f, 18, 6, 24);
        this.g.a(this.i);
    }
    
    @Override
    public void a(final pr \u2603, final float \u2603, final float \u2603, final float \u2603) {
        this.m = \u2603;
    }
    
    @Override
    public void a(final pk \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603) {
        bfl.E();
        final ug ug = (ug)\u2603;
        final float n = ug.bu + (ug.bv - ug.bu) * this.m;
        this.c.f = (float)(Math.sin(n * 3.1415927f * 2.0f) + 1.0) * 0.2f;
        float n2 = (float)(Math.sin(n * 3.1415927f * 2.0f - 1.0f) + 1.0);
        n2 = (n2 * n2 * 1.0f + n2 * 2.0f) * 0.05f;
        bfl.b(0.0f, n2 - 2.0f, -3.0f);
        bfl.b(n2 * 2.0f, 1.0f, 0.0f, 0.0f);
        float d = -30.0f;
        float c = 0.0f;
        final float n3 = 1.5f;
        double[] array = ug.b(6, this.m);
        final float a = this.a(ug.b(5, this.m)[0] - ug.b(10, this.m)[0]);
        final float a2 = this.a(ug.b(5, this.m)[0] + a / 2.0f);
        d += 2.0f;
        float n4 = n * 3.1415927f * 2.0f;
        d = 20.0f;
        float e = -12.0f;
        for (int i = 0; i < 5; ++i) {
            final double[] b = ug.b(5 - i, this.m);
            final float n5 = (float)Math.cos(i * 0.45f + n4) * 0.15f;
            this.b.g = this.a(b[0] - array[0]) * 3.1415927f / 180.0f * n3;
            this.b.f = n5 + (float)(b[1] - array[1]) * 3.1415927f / 180.0f * n3 * 5.0f;
            this.b.h = -this.a(b[0] - a2) * 3.1415927f / 180.0f * n3;
            this.b.d = d;
            this.b.e = e;
            this.b.c = c;
            d += (float)(Math.sin(this.b.f) * 10.0);
            e -= (float)(Math.cos(this.b.g) * Math.cos(this.b.f) * 10.0);
            c -= (float)(Math.sin(this.b.g) * Math.cos(this.b.f) * 10.0);
            this.b.a(\u2603);
        }
        this.a.d = d;
        this.a.e = e;
        this.a.c = c;
        double[] array2 = ug.b(0, this.m);
        this.a.g = this.a(array2[0] - array[0]) * 3.1415927f / 180.0f * 1.0f;
        this.a.h = -this.a(array2[0] - a2) * 3.1415927f / 180.0f * 1.0f;
        this.a.a(\u2603);
        bfl.E();
        bfl.b(0.0f, 1.0f, 0.0f);
        bfl.b(-a * n3 * 1.0f, 0.0f, 0.0f, 1.0f);
        bfl.b(0.0f, -1.0f, 0.0f);
        this.d.h = 0.0f;
        this.d.a(\u2603);
        for (int j = 0; j < 2; ++j) {
            bfl.o();
            final float n5 = n * 3.1415927f * 2.0f;
            this.k.f = 0.125f - (float)Math.cos(n5) * 0.2f;
            this.k.g = 0.25f;
            this.k.h = (float)(Math.sin(n5) + 0.125) * 0.8f;
            this.l.h = -(float)(Math.sin(n5 + 2.0f) + 0.5) * 0.75f;
            this.e.f = 1.0f + n2 * 0.1f;
            this.g.f = 0.5f + n2 * 0.1f;
            this.i.f = 0.75f + n2 * 0.1f;
            this.f.f = 1.3f + n2 * 0.1f;
            this.h.f = -0.5f - n2 * 0.1f;
            this.j.f = 0.75f + n2 * 0.1f;
            this.k.a(\u2603);
            this.f.a(\u2603);
            this.e.a(\u2603);
            bfl.a(-1.0f, 1.0f, 1.0f);
            if (j == 0) {
                bfl.e(1028);
            }
        }
        bfl.F();
        bfl.e(1029);
        bfl.p();
        float n6 = -(float)Math.sin(n * 3.1415927f * 2.0f) * 0.0f;
        n4 = n * 3.1415927f * 2.0f;
        d = 10.0f;
        e = 60.0f;
        c = 0.0f;
        array = ug.b(11, this.m);
        for (int k = 0; k < 12; ++k) {
            array2 = ug.b(12 + k, this.m);
            n6 += (float)(Math.sin(k * 0.45f + n4) * 0.05000000074505806);
            this.b.g = (this.a(array2[0] - array[0]) * n3 + 180.0f) * 3.1415927f / 180.0f;
            this.b.f = n6 + (float)(array2[1] - array[1]) * 3.1415927f / 180.0f * n3 * 5.0f;
            this.b.h = this.a(array2[0] - a2) * 3.1415927f / 180.0f * n3;
            this.b.d = d;
            this.b.e = e;
            this.b.c = c;
            d += (float)(Math.sin(this.b.f) * 10.0);
            e -= (float)(Math.cos(this.b.g) * Math.cos(this.b.f) * 10.0);
            c -= (float)(Math.sin(this.b.g) * Math.cos(this.b.f) * 10.0);
            this.b.a(\u2603);
        }
        bfl.F();
    }
    
    private float a(double \u2603) {
        while (\u2603 >= 180.0) {
            \u2603 -= 360.0;
        }
        while (\u2603 < -180.0) {
            \u2603 += 360.0;
        }
        return (float)\u2603;
    }
}
