// 
// Decompiled by Procyon v0.5.36
// 

public class awk
{
    private static final jy a;
    private final ave b;
    private float c;
    private int d;
    
    public awk(final ave \u2603) {
        this.c = 1.0f;
        this.d = 1;
        this.b = \u2603;
    }
    
    public void a(final int \u2603, final int \u2603) {
        if (this.b.Y().k()) {
            bfl.l();
            final int x = this.b.Y().x();
            if (x > 0) {
                final String string = "" + x;
                final int a = this.b.k.a(string);
                final int n = 20;
                final int n2 = \u2603 - a - 1;
                final int n3 = \u2603 + 20 - 1;
                final int n4 = \u2603;
                final int n5 = \u2603 + 20 + this.b.k.a - 1;
                bfl.x();
                final bfx a2 = bfx.a();
                final bfd c = a2.c();
                bfl.c(0.0f, 0.0f, 0.0f, (0.65f + 0.35000002f * this.c) / 2.0f);
                c.a(7, bms.e);
                c.b(n2, n5, 0.0).d();
                c.b(n4, n5, 0.0).d();
                c.b(n4, n3, 0.0).d();
                c.b(n2, n3, 0.0).d();
                a2.b();
                bfl.w();
                this.b.k.a(string, \u2603 - a, \u2603 + 20, 16777215);
            }
            this.a(\u2603, \u2603, this.b(), 0);
            this.a(\u2603, \u2603, this.c(), 17);
        }
    }
    
    private void a(final int \u2603, final int \u2603, final int \u2603, final int \u2603) {
        bfl.c(1.0f, 1.0f, 1.0f, 0.65f + 0.35000002f * this.c);
        this.b.P().a(awk.a);
        final float n = 150.0f;
        final float n2 = 0.0f;
        final float n3 = \u2603 * 0.015625f;
        final float n4 = 1.0f;
        final float n5 = (\u2603 + 16) * 0.015625f;
        final bfx a = bfx.a();
        final bfd c = a.c();
        c.a(7, bms.g);
        c.b(\u2603 - 16 - \u2603, \u2603 + 16, (double)n).a(n2, n5).d();
        c.b(\u2603 - \u2603, \u2603 + 16, (double)n).a(n4, n5).d();
        c.b(\u2603 - \u2603, \u2603 + 0, (double)n).a(n4, n3).d();
        c.b(\u2603 - 16 - \u2603, \u2603 + 0, (double)n).a(n2, n3).d();
        a.b();
        bfl.c(1.0f, 1.0f, 1.0f, 1.0f);
    }
    
    private int b() {
        return this.b.Y().l() ? 16 : 0;
    }
    
    private int c() {
        return this.b.Y().D() ? 48 : 32;
    }
    
    public void a() {
        if (this.b.Y().k()) {
            this.c += 0.025f * this.d;
            if (this.c < 0.0f) {
                this.d *= -1;
                this.c = 0.0f;
            }
            else if (this.c > 1.0f) {
                this.d *= -1;
                this.c = 1.0f;
            }
        }
        else {
            this.c = 1.0f;
            this.d = 1;
        }
    }
    
    static {
        a = new jy("textures/gui/stream_indicator.png");
    }
}
