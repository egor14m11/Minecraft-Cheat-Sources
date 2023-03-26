// 
// Decompiled by Procyon v0.5.36
// 

public class bce extends bbo
{
    public bct a;
    public bct b;
    public bct c;
    public bct d;
    public bct e;
    public bct f;
    public bct g;
    public bct h;
    public bct i;
    public bct j;
    public bct k;
    
    public bce() {
        final float \u2603 = 0.0f;
        final int n = 15;
        (this.a = new bct(this, 32, 4)).a(-4.0f, -4.0f, -8.0f, 8, 8, 8, \u2603);
        this.a.a(0.0f, (float)n, -3.0f);
        (this.b = new bct(this, 0, 0)).a(-3.0f, -3.0f, -3.0f, 6, 6, 6, \u2603);
        this.b.a(0.0f, (float)n, 0.0f);
        (this.c = new bct(this, 0, 12)).a(-5.0f, -4.0f, -6.0f, 10, 8, 12, \u2603);
        this.c.a(0.0f, (float)n, 9.0f);
        (this.d = new bct(this, 18, 0)).a(-15.0f, -1.0f, -1.0f, 16, 2, 2, \u2603);
        this.d.a(-4.0f, (float)n, 2.0f);
        (this.e = new bct(this, 18, 0)).a(-1.0f, -1.0f, -1.0f, 16, 2, 2, \u2603);
        this.e.a(4.0f, (float)n, 2.0f);
        (this.f = new bct(this, 18, 0)).a(-15.0f, -1.0f, -1.0f, 16, 2, 2, \u2603);
        this.f.a(-4.0f, (float)n, 1.0f);
        (this.g = new bct(this, 18, 0)).a(-1.0f, -1.0f, -1.0f, 16, 2, 2, \u2603);
        this.g.a(4.0f, (float)n, 1.0f);
        (this.h = new bct(this, 18, 0)).a(-15.0f, -1.0f, -1.0f, 16, 2, 2, \u2603);
        this.h.a(-4.0f, (float)n, 0.0f);
        (this.i = new bct(this, 18, 0)).a(-1.0f, -1.0f, -1.0f, 16, 2, 2, \u2603);
        this.i.a(4.0f, (float)n, 0.0f);
        (this.j = new bct(this, 18, 0)).a(-15.0f, -1.0f, -1.0f, 16, 2, 2, \u2603);
        this.j.a(-4.0f, (float)n, -1.0f);
        (this.k = new bct(this, 18, 0)).a(-1.0f, -1.0f, -1.0f, 16, 2, 2, \u2603);
        this.k.a(4.0f, (float)n, -1.0f);
    }
    
    @Override
    public void a(final pk \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603) {
        this.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
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
    }
    
    @Override
    public void a(final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final pk \u2603) {
        this.a.g = \u2603 / 57.295776f;
        this.a.f = \u2603 / 57.295776f;
        final float n = 0.7853982f;
        this.d.h = -n;
        this.e.h = n;
        this.f.h = -n * 0.74f;
        this.g.h = n * 0.74f;
        this.h.h = -n * 0.74f;
        this.i.h = n * 0.74f;
        this.j.h = -n;
        this.k.h = n;
        final float n2 = -0.0f;
        final float n3 = 0.3926991f;
        this.d.g = n3 * 2.0f + n2;
        this.e.g = -n3 * 2.0f - n2;
        this.f.g = n3 * 1.0f + n2;
        this.g.g = -n3 * 1.0f - n2;
        this.h.g = -n3 * 1.0f + n2;
        this.i.g = n3 * 1.0f - n2;
        this.j.g = -n3 * 2.0f + n2;
        this.k.g = n3 * 2.0f - n2;
        final float n4 = -(ns.b(\u2603 * 0.6662f * 2.0f + 0.0f) * 0.4f) * \u2603;
        final float n5 = -(ns.b(\u2603 * 0.6662f * 2.0f + 3.1415927f) * 0.4f) * \u2603;
        final float n6 = -(ns.b(\u2603 * 0.6662f * 2.0f + 1.5707964f) * 0.4f) * \u2603;
        final float n7 = -(ns.b(\u2603 * 0.6662f * 2.0f + 4.712389f) * 0.4f) * \u2603;
        final float n8 = Math.abs(ns.a(\u2603 * 0.6662f + 0.0f) * 0.4f) * \u2603;
        final float n9 = Math.abs(ns.a(\u2603 * 0.6662f + 3.1415927f) * 0.4f) * \u2603;
        final float n10 = Math.abs(ns.a(\u2603 * 0.6662f + 1.5707964f) * 0.4f) * \u2603;
        final float n11 = Math.abs(ns.a(\u2603 * 0.6662f + 4.712389f) * 0.4f) * \u2603;
        final bct d = this.d;
        d.g += n4;
        final bct e = this.e;
        e.g += -n4;
        final bct f = this.f;
        f.g += n5;
        final bct g = this.g;
        g.g += -n5;
        final bct h = this.h;
        h.g += n6;
        final bct i = this.i;
        i.g += -n6;
        final bct j = this.j;
        j.g += n7;
        final bct k = this.k;
        k.g += -n7;
        final bct d2 = this.d;
        d2.h += n8;
        final bct e2 = this.e;
        e2.h += -n8;
        final bct f2 = this.f;
        f2.h += n9;
        final bct g2 = this.g;
        g2.h += -n9;
        final bct h2 = this.h;
        h2.h += n10;
        final bct l = this.i;
        l.h += -n10;
        final bct m = this.j;
        m.h += n11;
        final bct k2 = this.k;
        k2.h += -n11;
    }
}
