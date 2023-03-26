// 
// Decompiled by Procyon v0.5.36
// 

public class bbu extends bbo
{
    bct a;
    bct b;
    bct c;
    bct d;
    bct e;
    bct f;
    bct g;
    bct h;
    bct i;
    bct j;
    bct k;
    bct l;
    private float m;
    private float n;
    
    public bbu() {
        this.m = 0.0f;
        this.n = 0.0f;
        this.a("head.main", 0, 0);
        this.a("head.nose", 0, 24);
        this.a("head.ear1", 0, 10);
        this.a("head.ear2", 6, 10);
        (this.a = new bct(this, 26, 24)).a(-1.0f, 5.5f, -3.7f, 2, 1, 7);
        this.a.a(3.0f, 17.5f, 3.7f);
        this.a.i = true;
        this.a(this.a, 0.0f, 0.0f, 0.0f);
        (this.b = new bct(this, 8, 24)).a(-1.0f, 5.5f, -3.7f, 2, 1, 7);
        this.b.a(-3.0f, 17.5f, 3.7f);
        this.b.i = true;
        this.a(this.b, 0.0f, 0.0f, 0.0f);
        (this.c = new bct(this, 30, 15)).a(-1.0f, 0.0f, 0.0f, 2, 4, 5);
        this.c.a(3.0f, 17.5f, 3.7f);
        this.c.i = true;
        this.a(this.c, -0.34906584f, 0.0f, 0.0f);
        (this.d = new bct(this, 16, 15)).a(-1.0f, 0.0f, 0.0f, 2, 4, 5);
        this.d.a(-3.0f, 17.5f, 3.7f);
        this.d.i = true;
        this.a(this.d, -0.34906584f, 0.0f, 0.0f);
        (this.e = new bct(this, 0, 0)).a(-3.0f, -2.0f, -10.0f, 6, 5, 10);
        this.e.a(0.0f, 19.0f, 8.0f);
        this.e.i = true;
        this.a(this.e, -0.34906584f, 0.0f, 0.0f);
        (this.f = new bct(this, 8, 15)).a(-1.0f, 0.0f, -1.0f, 2, 7, 2);
        this.f.a(3.0f, 17.0f, -1.0f);
        this.f.i = true;
        this.a(this.f, -0.17453292f, 0.0f, 0.0f);
        (this.g = new bct(this, 0, 15)).a(-1.0f, 0.0f, -1.0f, 2, 7, 2);
        this.g.a(-3.0f, 17.0f, -1.0f);
        this.g.i = true;
        this.a(this.g, -0.17453292f, 0.0f, 0.0f);
        (this.h = new bct(this, 32, 0)).a(-2.5f, -4.0f, -5.0f, 5, 4, 5);
        this.h.a(0.0f, 16.0f, -1.0f);
        this.h.i = true;
        this.a(this.h, 0.0f, 0.0f, 0.0f);
        (this.i = new bct(this, 52, 0)).a(-2.5f, -9.0f, -1.0f, 2, 5, 1);
        this.i.a(0.0f, 16.0f, -1.0f);
        this.i.i = true;
        this.a(this.i, 0.0f, -0.2617994f, 0.0f);
        (this.j = new bct(this, 58, 0)).a(0.5f, -9.0f, -1.0f, 2, 5, 1);
        this.j.a(0.0f, 16.0f, -1.0f);
        this.j.i = true;
        this.a(this.j, 0.0f, 0.2617994f, 0.0f);
        (this.k = new bct(this, 52, 6)).a(-1.5f, -1.5f, 0.0f, 3, 3, 2);
        this.k.a(0.0f, 20.0f, 7.0f);
        this.k.i = true;
        this.a(this.k, -0.3490659f, 0.0f, 0.0f);
        (this.l = new bct(this, 32, 9)).a(-0.5f, -2.5f, -5.5f, 1, 1, 1);
        this.l.a(0.0f, 16.0f, -1.0f);
        this.l.i = true;
        this.a(this.l, 0.0f, 0.0f, 0.0f);
    }
    
    private void a(final bct \u2603, final float \u2603, final float \u2603, final float \u2603) {
        \u2603.f = \u2603;
        \u2603.g = \u2603;
        \u2603.h = \u2603;
    }
    
    @Override
    public void a(final pk \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603) {
        this.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        if (this.r) {
            final float n = 2.0f;
            bfl.E();
            bfl.b(0.0f, 5.0f * \u2603, 2.0f * \u2603);
            this.h.a(\u2603);
            this.j.a(\u2603);
            this.i.a(\u2603);
            this.l.a(\u2603);
            bfl.F();
            bfl.E();
            bfl.a(1.0f / n, 1.0f / n, 1.0f / n);
            bfl.b(0.0f, 24.0f * \u2603, 0.0f);
            this.a.a(\u2603);
            this.b.a(\u2603);
            this.c.a(\u2603);
            this.d.a(\u2603);
            this.e.a(\u2603);
            this.f.a(\u2603);
            this.g.a(\u2603);
            this.k.a(\u2603);
            bfl.F();
        }
        else {
            this.a.a(\u2603);
            this.b.a(\u2603);
            this.c.a(\u2603);
            this.d.a(\u2603);
            this.e.a(\u2603);
            this.f.a(\u2603);
            this.g.a(\u2603);
            this.h.a(\u2603);
            this.i.a(\u2603);
            this.j.a(\u2603);
            this.k.a(\u2603);
            this.l.a(\u2603);
        }
    }
    
    @Override
    public void a(final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final pk \u2603) {
        final float \u26032 = \u2603 - \u2603.W;
        final tu tu = (tu)\u2603;
        final bct l = this.l;
        final bct h = this.h;
        final bct i = this.i;
        final bct j = this.j;
        final float n = \u2603 * 0.017453292f;
        j.f = n;
        i.f = n;
        h.f = n;
        l.f = n;
        final bct k = this.l;
        final bct h2 = this.h;
        final float n2 = \u2603 * 0.017453292f;
        h2.g = n2;
        k.g = n2;
        this.i.g = this.l.g - 0.2617994f;
        this.j.g = this.l.g + 0.2617994f;
        this.m = ns.a(tu.p(\u26032) * 3.1415927f);
        final bct c = this.c;
        final bct d = this.d;
        final float n3 = (this.m * 50.0f - 21.0f) * 0.017453292f;
        d.f = n3;
        c.f = n3;
        final bct a = this.a;
        final bct b = this.b;
        final float n4 = this.m * 50.0f * 0.017453292f;
        b.f = n4;
        a.f = n4;
        final bct f = this.f;
        final bct g = this.g;
        final float n5 = (this.m * -40.0f - 11.0f) * 0.017453292f;
        g.f = n5;
        f.f = n5;
    }
    
    @Override
    public void a(final pr \u2603, final float \u2603, final float \u2603, final float \u2603) {
    }
}
