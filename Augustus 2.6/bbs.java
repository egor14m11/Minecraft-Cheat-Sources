// 
// Decompiled by Procyon v0.5.36
// 

public class bbs
{
    public bcg[] a;
    public int b;
    private boolean c;
    
    public bbs(final bcg[] \u2603) {
        this.a = \u2603;
        this.b = \u2603.length;
    }
    
    public bbs(final bcg[] \u2603, final int \u2603, final int \u2603, final int \u2603, final int \u2603, final float \u2603, final float \u2603) {
        this(\u2603);
        final float n = 0.0f / \u2603;
        final float n2 = 0.0f / \u2603;
        \u2603[0] = \u2603[0].a(\u2603 / \u2603 - n, \u2603 / \u2603 + n2);
        \u2603[1] = \u2603[1].a(\u2603 / \u2603 + n, \u2603 / \u2603 + n2);
        \u2603[2] = \u2603[2].a(\u2603 / \u2603 + n, \u2603 / \u2603 - n2);
        \u2603[3] = \u2603[3].a(\u2603 / \u2603 - n, \u2603 / \u2603 - n2);
    }
    
    public void a() {
        final bcg[] a = new bcg[this.a.length];
        for (int i = 0; i < this.a.length; ++i) {
            a[i] = this.a[this.a.length - i - 1];
        }
        this.a = a;
    }
    
    public void a(final bfd \u2603, final float \u2603) {
        final aui a = this.a[1].a.a(this.a[0].a);
        final aui a2 = this.a[1].a.a(this.a[2].a);
        final aui a3 = a2.c(a).a();
        float \u26032 = (float)a3.a;
        float \u26033 = (float)a3.b;
        float \u26034 = (float)a3.c;
        if (this.c) {
            \u26032 = -\u26032;
            \u26033 = -\u26033;
            \u26034 = -\u26034;
        }
        \u2603.a(7, bms.c);
        for (int i = 0; i < 4; ++i) {
            final bcg bcg = this.a[i];
            \u2603.b(bcg.a.a * \u2603, bcg.a.b * \u2603, bcg.a.c * \u2603).a(bcg.b, bcg.c).c(\u26032, \u26033, \u26034).d();
        }
        bfx.a().b();
    }
}
