// 
// Decompiled by Procyon v0.5.36
// 

public class bbd extends bbj
{
    public boolean a;
    public boolean b;
    
    public bbd(final float \u2603) {
        super(0.0f, -14.0f, 64, 32);
        final float n = -14.0f;
        (this.f = new bct(this, 0, 16)).a(-4.0f, -8.0f, -4.0f, 8, 8, 8, \u2603 - 0.5f);
        this.f.a(0.0f, 0.0f + n, 0.0f);
        (this.g = new bct(this, 32, 16)).a(-4.0f, 0.0f, -2.0f, 8, 12, 4, \u2603);
        this.g.a(0.0f, 0.0f + n, 0.0f);
        (this.h = new bct(this, 56, 0)).a(-1.0f, -2.0f, -1.0f, 2, 30, 2, \u2603);
        this.h.a(-3.0f, 2.0f + n, 0.0f);
        this.i = new bct(this, 56, 0);
        this.i.i = true;
        this.i.a(-1.0f, -2.0f, -1.0f, 2, 30, 2, \u2603);
        this.i.a(5.0f, 2.0f + n, 0.0f);
        (this.j = new bct(this, 56, 0)).a(-1.0f, 0.0f, -1.0f, 2, 30, 2, \u2603);
        this.j.a(-2.0f, 12.0f + n, 0.0f);
        this.k = new bct(this, 56, 0);
        this.k.i = true;
        this.k.a(-1.0f, 0.0f, -1.0f, 2, 30, 2, \u2603);
        this.k.a(2.0f, 12.0f + n, 0.0f);
    }
    
    @Override
    public void a(final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final pk \u2603) {
        super.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        this.e.j = true;
        final float d = -14.0f;
        this.g.f = 0.0f;
        this.g.d = d;
        this.g.e = -0.0f;
        final bct j = this.j;
        j.f -= 0.0f;
        final bct k = this.k;
        k.f -= 0.0f;
        final bct h = this.h;
        h.f *= 0.5;
        final bct i = this.i;
        i.f *= 0.5;
        final bct l = this.j;
        l.f *= 0.5;
        final bct m = this.k;
        m.f *= 0.5;
        final float n = 0.4f;
        if (this.h.f > n) {
            this.h.f = n;
        }
        if (this.i.f > n) {
            this.i.f = n;
        }
        if (this.h.f < -n) {
            this.h.f = -n;
        }
        if (this.i.f < -n) {
            this.i.f = -n;
        }
        if (this.j.f > n) {
            this.j.f = n;
        }
        if (this.k.f > n) {
            this.k.f = n;
        }
        if (this.j.f < -n) {
            this.j.f = -n;
        }
        if (this.k.f < -n) {
            this.k.f = -n;
        }
        if (this.a) {
            this.h.f = -0.5f;
            this.i.f = -0.5f;
            this.h.h = 0.05f;
            this.i.h = -0.05f;
        }
        this.h.e = 0.0f;
        this.i.e = 0.0f;
        this.j.e = 0.0f;
        this.k.e = 0.0f;
        this.j.d = 9.0f + d;
        this.k.d = 9.0f + d;
        this.e.e = -0.0f;
        this.e.d = d + 1.0f;
        this.f.c = this.e.c;
        this.f.d = this.e.d;
        this.f.e = this.e.e;
        this.f.f = this.e.f;
        this.f.g = this.e.g;
        this.f.h = this.e.h;
        if (this.b) {
            final float n2 = 1.0f;
            final bct e = this.e;
            e.d -= n2 * 5.0f;
        }
    }
}
