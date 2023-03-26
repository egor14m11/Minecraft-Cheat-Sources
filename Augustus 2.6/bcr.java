// 
// Decompiled by Procyon v0.5.36
// 

public class bcr
{
    private bcg[] h;
    private bbs[] i;
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public String g;
    
    public bcr(final bct \u2603, final int \u2603, final int \u2603, final float \u2603, final float \u2603, final float \u2603, final int \u2603, final int \u2603, final int \u2603, final float \u2603) {
        this(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603.i);
    }
    
    public bcr(final bct \u2603, final int \u2603, final int \u2603, float \u2603, float \u2603, float \u2603, final int \u2603, final int \u2603, final int \u2603, final float \u2603, final boolean \u2603) {
        this.a = \u2603;
        this.b = \u2603;
        this.c = \u2603;
        this.d = \u2603 + \u2603;
        this.e = \u2603 + \u2603;
        this.f = \u2603 + \u2603;
        this.h = new bcg[8];
        this.i = new bbs[6];
        float n = \u2603 + \u2603;
        float n2 = \u2603 + \u2603;
        float n3 = \u2603 + \u2603;
        \u2603 -= \u2603;
        \u2603 -= \u2603;
        \u2603 -= \u2603;
        n += \u2603;
        n2 += \u2603;
        n3 += \u2603;
        if (\u2603) {
            final float n4 = n;
            n = \u2603;
            \u2603 = n4;
        }
        final bcg bcg = new bcg(\u2603, \u2603, \u2603, 0.0f, 0.0f);
        final bcg bcg2 = new bcg(n, \u2603, \u2603, 0.0f, 8.0f);
        final bcg bcg3 = new bcg(n, n2, \u2603, 8.0f, 8.0f);
        final bcg bcg4 = new bcg(\u2603, n2, \u2603, 8.0f, 0.0f);
        final bcg bcg5 = new bcg(\u2603, \u2603, n3, 0.0f, 0.0f);
        final bcg bcg6 = new bcg(n, \u2603, n3, 0.0f, 8.0f);
        final bcg bcg7 = new bcg(n, n2, n3, 8.0f, 8.0f);
        final bcg bcg8 = new bcg(\u2603, n2, n3, 8.0f, 0.0f);
        this.h[0] = bcg;
        this.h[1] = bcg2;
        this.h[2] = bcg3;
        this.h[3] = bcg4;
        this.h[4] = bcg5;
        this.h[5] = bcg6;
        this.h[6] = bcg7;
        this.h[7] = bcg8;
        this.i[0] = new bbs(new bcg[] { bcg6, bcg2, bcg3, bcg7 }, \u2603 + \u2603 + \u2603, \u2603 + \u2603, \u2603 + \u2603 + \u2603 + \u2603, \u2603 + \u2603 + \u2603, \u2603.a, \u2603.b);
        this.i[1] = new bbs(new bcg[] { bcg, bcg5, bcg8, bcg4 }, \u2603, \u2603 + \u2603, \u2603 + \u2603, \u2603 + \u2603 + \u2603, \u2603.a, \u2603.b);
        this.i[2] = new bbs(new bcg[] { bcg6, bcg5, bcg, bcg2 }, \u2603 + \u2603, \u2603, \u2603 + \u2603 + \u2603, \u2603 + \u2603, \u2603.a, \u2603.b);
        this.i[3] = new bbs(new bcg[] { bcg3, bcg4, bcg8, bcg7 }, \u2603 + \u2603 + \u2603, \u2603 + \u2603, \u2603 + \u2603 + \u2603 + \u2603, \u2603, \u2603.a, \u2603.b);
        this.i[4] = new bbs(new bcg[] { bcg2, bcg, bcg4, bcg3 }, \u2603 + \u2603, \u2603 + \u2603, \u2603 + \u2603 + \u2603, \u2603 + \u2603 + \u2603, \u2603.a, \u2603.b);
        this.i[5] = new bbs(new bcg[] { bcg5, bcg6, bcg7, bcg8 }, \u2603 + \u2603 + \u2603 + \u2603, \u2603 + \u2603, \u2603 + \u2603 + \u2603 + \u2603 + \u2603, \u2603 + \u2603 + \u2603, \u2603.a, \u2603.b);
        if (\u2603) {
            for (int i = 0; i < this.i.length; ++i) {
                this.i[i].a();
            }
        }
    }
    
    public void a(final bfd \u2603, final float \u2603) {
        for (int i = 0; i < this.i.length; ++i) {
            this.i[i].a(\u2603, \u2603);
        }
    }
    
    public bcr a(final String \u2603) {
        this.g = \u2603;
        return this;
    }
}
