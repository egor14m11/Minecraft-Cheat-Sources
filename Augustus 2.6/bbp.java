// 
// Decompiled by Procyon v0.5.36
// 

public class bbp extends bbo
{
    bct a;
    bct b;
    bct c;
    bct d;
    bct e;
    bct f;
    bct g;
    bct h;
    int i;
    
    public bbp() {
        this.i = 1;
        this.a("head.main", 0, 0);
        this.a("head.nose", 0, 24);
        this.a("head.ear1", 0, 10);
        this.a("head.ear2", 6, 10);
        (this.g = new bct(this, "head")).a("main", -2.5f, -2.0f, -3.0f, 5, 4, 5);
        this.g.a("nose", -1.5f, 0.0f, -4.0f, 3, 2, 2);
        this.g.a("ear1", -2.0f, -3.0f, 0.0f, 1, 1, 2);
        this.g.a("ear2", 1.0f, -3.0f, 0.0f, 1, 1, 2);
        this.g.a(0.0f, 15.0f, -9.0f);
        (this.h = new bct(this, 20, 0)).a(-2.0f, 3.0f, -8.0f, 4, 16, 6, 0.0f);
        this.h.a(0.0f, 12.0f, -10.0f);
        (this.e = new bct(this, 0, 15)).a(-0.5f, 0.0f, 0.0f, 1, 8, 1);
        this.e.f = 0.9f;
        this.e.a(0.0f, 15.0f, 8.0f);
        (this.f = new bct(this, 4, 15)).a(-0.5f, 0.0f, 0.0f, 1, 8, 1);
        this.f.a(0.0f, 20.0f, 14.0f);
        (this.a = new bct(this, 8, 13)).a(-1.0f, 0.0f, 1.0f, 2, 6, 2);
        this.a.a(1.1f, 18.0f, 5.0f);
        (this.b = new bct(this, 8, 13)).a(-1.0f, 0.0f, 1.0f, 2, 6, 2);
        this.b.a(-1.1f, 18.0f, 5.0f);
        (this.c = new bct(this, 40, 0)).a(-1.0f, 0.0f, 0.0f, 2, 10, 2);
        this.c.a(1.2f, 13.8f, -5.0f);
        (this.d = new bct(this, 40, 0)).a(-1.0f, 0.0f, 0.0f, 2, 10, 2);
        this.d.a(-1.2f, 13.8f, -5.0f);
    }
    
    @Override
    public void a(final pk \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603) {
        this.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        if (this.r) {
            final float n = 2.0f;
            bfl.E();
            bfl.a(1.5f / n, 1.5f / n, 1.5f / n);
            bfl.b(0.0f, 10.0f * \u2603, 4.0f * \u2603);
            this.g.a(\u2603);
            bfl.F();
            bfl.E();
            bfl.a(1.0f / n, 1.0f / n, 1.0f / n);
            bfl.b(0.0f, 24.0f * \u2603, 0.0f);
            this.h.a(\u2603);
            this.a.a(\u2603);
            this.b.a(\u2603);
            this.c.a(\u2603);
            this.d.a(\u2603);
            this.e.a(\u2603);
            this.f.a(\u2603);
            bfl.F();
        }
        else {
            this.g.a(\u2603);
            this.h.a(\u2603);
            this.e.a(\u2603);
            this.f.a(\u2603);
            this.a.a(\u2603);
            this.b.a(\u2603);
            this.c.a(\u2603);
            this.d.a(\u2603);
        }
    }
    
    @Override
    public void a(final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final pk \u2603) {
        this.g.f = \u2603 / 57.295776f;
        this.g.g = \u2603 / 57.295776f;
        if (this.i != 3) {
            this.h.f = 1.5707964f;
            if (this.i == 2) {
                this.a.f = ns.b(\u2603 * 0.6662f) * 1.0f * \u2603;
                this.b.f = ns.b(\u2603 * 0.6662f + 0.3f) * 1.0f * \u2603;
                this.c.f = ns.b(\u2603 * 0.6662f + 3.1415927f + 0.3f) * 1.0f * \u2603;
                this.d.f = ns.b(\u2603 * 0.6662f + 3.1415927f) * 1.0f * \u2603;
                this.f.f = 1.7278761f + 0.31415927f * ns.b(\u2603) * \u2603;
            }
            else {
                this.a.f = ns.b(\u2603 * 0.6662f) * 1.0f * \u2603;
                this.b.f = ns.b(\u2603 * 0.6662f + 3.1415927f) * 1.0f * \u2603;
                this.c.f = ns.b(\u2603 * 0.6662f + 3.1415927f) * 1.0f * \u2603;
                this.d.f = ns.b(\u2603 * 0.6662f) * 1.0f * \u2603;
                if (this.i == 1) {
                    this.f.f = 1.7278761f + 0.7853982f * ns.b(\u2603) * \u2603;
                }
                else {
                    this.f.f = 1.7278761f + 0.47123894f * ns.b(\u2603) * \u2603;
                }
            }
        }
    }
    
    @Override
    public void a(final pr \u2603, final float \u2603, final float \u2603, final float \u2603) {
        final ts ts = (ts)\u2603;
        this.h.d = 12.0f;
        this.h.e = -10.0f;
        this.g.d = 15.0f;
        this.g.e = -9.0f;
        this.e.d = 15.0f;
        this.e.e = 8.0f;
        this.f.d = 20.0f;
        this.f.e = 14.0f;
        final bct c = this.c;
        final bct d = this.d;
        final float n = 13.8f;
        d.d = n;
        c.d = n;
        final bct c2 = this.c;
        final bct d2 = this.d;
        final float n2 = -5.0f;
        d2.e = n2;
        c2.e = n2;
        final bct a = this.a;
        final bct b = this.b;
        final float n3 = 18.0f;
        b.d = n3;
        a.d = n3;
        final bct a2 = this.a;
        final bct b2 = this.b;
        final float n4 = 5.0f;
        b2.e = n4;
        a2.e = n4;
        this.e.f = 0.9f;
        if (ts.av()) {
            final bct h = this.h;
            ++h.d;
            final bct g = this.g;
            g.d += 2.0f;
            final bct e = this.e;
            ++e.d;
            final bct f = this.f;
            f.d -= 4.0f;
            final bct f2 = this.f;
            f2.e += 2.0f;
            this.e.f = 1.5707964f;
            this.f.f = 1.5707964f;
            this.i = 0;
        }
        else if (ts.aw()) {
            this.f.d = this.e.d;
            final bct f3 = this.f;
            f3.e += 2.0f;
            this.e.f = 1.5707964f;
            this.f.f = 1.5707964f;
            this.i = 2;
        }
        else if (ts.cn()) {
            this.h.f = 0.7853982f;
            final bct h2 = this.h;
            h2.d -= 4.0f;
            final bct h3 = this.h;
            h3.e += 5.0f;
            final bct g2 = this.g;
            g2.d -= 3.3f;
            final bct g3 = this.g;
            ++g3.e;
            final bct e2 = this.e;
            e2.d += 8.0f;
            final bct e3 = this.e;
            e3.e -= 2.0f;
            final bct f4 = this.f;
            f4.d += 2.0f;
            final bct f5 = this.f;
            f5.e -= 0.8f;
            this.e.f = 1.7278761f;
            this.f.f = 2.670354f;
            final bct c3 = this.c;
            final bct d3 = this.d;
            final float n5 = -0.15707964f;
            d3.f = n5;
            c3.f = n5;
            final bct c4 = this.c;
            final bct d4 = this.d;
            final float n6 = 15.8f;
            d4.d = n6;
            c4.d = n6;
            final bct c5 = this.c;
            final bct d5 = this.d;
            final float n7 = -7.0f;
            d5.e = n7;
            c5.e = n7;
            final bct a3 = this.a;
            final bct b3 = this.b;
            final float n8 = -1.5707964f;
            b3.f = n8;
            a3.f = n8;
            final bct a4 = this.a;
            final bct b4 = this.b;
            final float n9 = 21.0f;
            b4.d = n9;
            a4.d = n9;
            final bct a5 = this.a;
            final bct b5 = this.b;
            final float n10 = 1.0f;
            b5.e = n10;
            a5.e = n10;
            this.i = 3;
        }
        else {
            this.i = 1;
        }
    }
}
