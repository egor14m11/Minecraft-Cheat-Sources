// 
// Decompiled by Procyon v0.5.36
// 

public class bbj extends bbo
{
    public bct e;
    public bct f;
    public bct g;
    public bct h;
    public bct i;
    public bct j;
    public bct k;
    public int l;
    public int m;
    public boolean n;
    public boolean o;
    
    public bbj() {
        this(0.0f);
    }
    
    public bbj(final float \u2603) {
        this(\u2603, 0.0f, 64, 32);
    }
    
    public bbj(final float \u2603, final float \u2603, final int \u2603, final int \u2603) {
        this.t = \u2603;
        this.u = \u2603;
        (this.e = new bct(this, 0, 0)).a(-4.0f, -8.0f, -4.0f, 8, 8, 8, \u2603);
        this.e.a(0.0f, 0.0f + \u2603, 0.0f);
        (this.f = new bct(this, 32, 0)).a(-4.0f, -8.0f, -4.0f, 8, 8, 8, \u2603 + 0.5f);
        this.f.a(0.0f, 0.0f + \u2603, 0.0f);
        (this.g = new bct(this, 16, 16)).a(-4.0f, 0.0f, -2.0f, 8, 12, 4, \u2603);
        this.g.a(0.0f, 0.0f + \u2603, 0.0f);
        (this.h = new bct(this, 40, 16)).a(-3.0f, -2.0f, -2.0f, 4, 12, 4, \u2603);
        this.h.a(-5.0f, 2.0f + \u2603, 0.0f);
        this.i = new bct(this, 40, 16);
        this.i.i = true;
        this.i.a(-1.0f, -2.0f, -2.0f, 4, 12, 4, \u2603);
        this.i.a(5.0f, 2.0f + \u2603, 0.0f);
        (this.j = new bct(this, 0, 16)).a(-2.0f, 0.0f, -2.0f, 4, 12, 4, \u2603);
        this.j.a(-1.9f, 12.0f + \u2603, 0.0f);
        this.k = new bct(this, 0, 16);
        this.k.i = true;
        this.k.a(-2.0f, 0.0f, -2.0f, 4, 12, 4, \u2603);
        this.k.a(1.9f, 12.0f + \u2603, 0.0f);
    }
    
    @Override
    public void a(final pk \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603) {
        this.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        bfl.E();
        if (this.r) {
            final float n = 2.0f;
            bfl.a(1.5f / n, 1.5f / n, 1.5f / n);
            bfl.b(0.0f, 16.0f * \u2603, 0.0f);
            this.e.a(\u2603);
            bfl.F();
            bfl.E();
            bfl.a(1.0f / n, 1.0f / n, 1.0f / n);
            bfl.b(0.0f, 24.0f * \u2603, 0.0f);
            this.g.a(\u2603);
            this.h.a(\u2603);
            this.i.a(\u2603);
            this.j.a(\u2603);
            this.k.a(\u2603);
            this.f.a(\u2603);
        }
        else {
            if (\u2603.av()) {
                bfl.b(0.0f, 0.2f, 0.0f);
            }
            this.e.a(\u2603);
            this.g.a(\u2603);
            this.h.a(\u2603);
            this.i.a(\u2603);
            this.j.a(\u2603);
            this.k.a(\u2603);
            this.f.a(\u2603);
        }
        bfl.F();
    }
    
    @Override
    public void a(final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final pk \u2603) {
        this.e.g = \u2603 / 57.295776f;
        this.e.f = \u2603 / 57.295776f;
        this.h.f = ns.b(\u2603 * 0.6662f + 3.1415927f) * 2.0f * \u2603 * 0.5f;
        this.i.f = ns.b(\u2603 * 0.6662f) * 2.0f * \u2603 * 0.5f;
        this.h.h = 0.0f;
        this.i.h = 0.0f;
        this.j.f = ns.b(\u2603 * 0.6662f) * 1.4f * \u2603;
        this.k.f = ns.b(\u2603 * 0.6662f + 3.1415927f) * 1.4f * \u2603;
        this.j.g = 0.0f;
        this.k.g = 0.0f;
        if (this.q) {
            final bct h = this.h;
            h.f -= 0.62831855f;
            final bct i = this.i;
            i.f -= 0.62831855f;
            this.j.f = -1.2566371f;
            this.k.f = -1.2566371f;
            this.j.g = 0.31415927f;
            this.k.g = -0.31415927f;
        }
        if (this.l != 0) {
            this.i.f = this.i.f * 0.5f - 0.31415927f * this.l;
        }
        this.h.g = 0.0f;
        this.h.h = 0.0f;
        switch (this.m) {
            case 3: {
                this.h.f = this.h.f * 0.5f - 0.31415927f * this.m;
                this.h.g = -0.5235988f;
                break;
            }
            case 1: {
                this.h.f = this.h.f * 0.5f - 0.31415927f * this.m;
                break;
            }
        }
        this.i.g = 0.0f;
        if (this.p > -9990.0f) {
            float p = this.p;
            this.g.g = ns.a(ns.c(p) * 3.1415927f * 2.0f) * 0.2f;
            this.h.e = ns.a(this.g.g) * 5.0f;
            this.h.c = -ns.b(this.g.g) * 5.0f;
            this.i.e = -ns.a(this.g.g) * 5.0f;
            this.i.c = ns.b(this.g.g) * 5.0f;
            final bct h2 = this.h;
            h2.g += this.g.g;
            final bct j = this.i;
            j.g += this.g.g;
            final bct k = this.i;
            k.f += this.g.g;
            p = 1.0f - this.p;
            p *= p;
            p *= p;
            p = 1.0f - p;
            final float a = ns.a(p * 3.1415927f);
            final float n = ns.a(this.p * 3.1415927f) * -(this.e.f - 0.7f) * 0.75f;
            final bct h3 = this.h;
            h3.f -= (float)(a * 1.2 + n);
            final bct h4 = this.h;
            h4.g += this.g.g * 2.0f;
            final bct h5 = this.h;
            h5.h += ns.a(this.p * 3.1415927f) * -0.4f;
        }
        if (this.n) {
            this.g.f = 0.5f;
            final bct h6 = this.h;
            h6.f += 0.4f;
            final bct l = this.i;
            l.f += 0.4f;
            this.j.e = 4.0f;
            this.k.e = 4.0f;
            this.j.d = 9.0f;
            this.k.d = 9.0f;
            this.e.d = 1.0f;
        }
        else {
            this.g.f = 0.0f;
            this.j.e = 0.1f;
            this.k.e = 0.1f;
            this.j.d = 12.0f;
            this.k.d = 12.0f;
            this.e.d = 0.0f;
        }
        final bct h7 = this.h;
        h7.h += ns.b(\u2603 * 0.09f) * 0.05f + 0.05f;
        final bct m = this.i;
        m.h -= ns.b(\u2603 * 0.09f) * 0.05f + 0.05f;
        final bct h8 = this.h;
        h8.f += ns.a(\u2603 * 0.067f) * 0.05f;
        final bct i2 = this.i;
        i2.f -= ns.a(\u2603 * 0.067f) * 0.05f;
        if (this.o) {
            final float p = 0.0f;
            final float a = 0.0f;
            this.h.h = 0.0f;
            this.i.h = 0.0f;
            this.h.g = -(0.1f - p * 0.6f) + this.e.g;
            this.i.g = 0.1f - p * 0.6f + this.e.g + 0.4f;
            this.h.f = -1.5707964f + this.e.f;
            this.i.f = -1.5707964f + this.e.f;
            final bct h9 = this.h;
            h9.f -= p * 1.2f - a * 0.4f;
            final bct i3 = this.i;
            i3.f -= p * 1.2f - a * 0.4f;
            final bct h10 = this.h;
            h10.h += ns.b(\u2603 * 0.09f) * 0.05f + 0.05f;
            final bct i4 = this.i;
            i4.h -= ns.b(\u2603 * 0.09f) * 0.05f + 0.05f;
            final bct h11 = this.h;
            h11.f += ns.a(\u2603 * 0.067f) * 0.05f;
            final bct i5 = this.i;
            i5.f -= ns.a(\u2603 * 0.067f) * 0.05f;
        }
        bbo.a(this.e, this.f);
    }
    
    @Override
    public void a(final bbo \u2603) {
        super.a(\u2603);
        if (\u2603 instanceof bbj) {
            final bbj bbj = (bbj)\u2603;
            this.l = bbj.l;
            this.m = bbj.m;
            this.n = bbj.n;
            this.o = bbj.o;
        }
    }
    
    public void a(final boolean \u2603) {
        this.e.j = \u2603;
        this.f.j = \u2603;
        this.g.j = \u2603;
        this.h.j = \u2603;
        this.i.j = \u2603;
        this.j.j = \u2603;
        this.k.j = \u2603;
    }
    
    public void a(final float \u2603) {
        this.h.c(\u2603);
    }
}
