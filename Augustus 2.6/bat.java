// 
// Decompiled by Procyon v0.5.36
// 

public class bat extends bas
{
    public bct a;
    public bct b;
    public bct c;
    public bct d;
    
    public bat() {
        this(0.0f);
    }
    
    public bat(final float \u2603) {
        super(\u2603, 64, 64);
        (this.e = new bct(this, 0, 0)).a(-1.0f, -7.0f, -1.0f, 2, 7, 2, \u2603);
        this.e.a(0.0f, 0.0f, 0.0f);
        (this.g = new bct(this, 0, 26)).a(-6.0f, 0.0f, -1.5f, 12, 3, 3, \u2603);
        this.g.a(0.0f, 0.0f, 0.0f);
        (this.h = new bct(this, 24, 0)).a(-2.0f, -2.0f, -1.0f, 2, 12, 2, \u2603);
        this.h.a(-5.0f, 2.0f, 0.0f);
        this.i = new bct(this, 32, 16);
        this.i.i = true;
        this.i.a(0.0f, -2.0f, -1.0f, 2, 12, 2, \u2603);
        this.i.a(5.0f, 2.0f, 0.0f);
        (this.j = new bct(this, 8, 0)).a(-1.0f, 0.0f, -1.0f, 2, 11, 2, \u2603);
        this.j.a(-1.9f, 12.0f, 0.0f);
        this.k = new bct(this, 40, 16);
        this.k.i = true;
        this.k.a(-1.0f, 0.0f, -1.0f, 2, 11, 2, \u2603);
        this.k.a(1.9f, 12.0f, 0.0f);
        (this.a = new bct(this, 16, 0)).a(-3.0f, 3.0f, -1.0f, 2, 7, 2, \u2603);
        this.a.a(0.0f, 0.0f, 0.0f);
        this.a.j = true;
        (this.b = new bct(this, 48, 16)).a(1.0f, 3.0f, -1.0f, 2, 7, 2, \u2603);
        this.b.a(0.0f, 0.0f, 0.0f);
        (this.c = new bct(this, 0, 48)).a(-4.0f, 10.0f, -1.0f, 8, 2, 2, \u2603);
        this.c.a(0.0f, 0.0f, 0.0f);
        (this.d = new bct(this, 0, 32)).a(-6.0f, 11.0f, -6.0f, 12, 1, 12, \u2603);
        this.d.a(0.0f, 12.0f, 0.0f);
    }
    
    @Override
    public void a(final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final pk \u2603) {
        super.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        if (!(\u2603 instanceof um)) {
            return;
        }
        final um um = (um)\u2603;
        this.i.j = um.q();
        this.h.j = um.q();
        this.d.j = !um.r();
        this.k.a(1.9f, 12.0f, 0.0f);
        this.j.a(-1.9f, 12.0f, 0.0f);
        this.a.f = 0.017453292f * um.u().b();
        this.a.g = 0.017453292f * um.u().c();
        this.a.h = 0.017453292f * um.u().d();
        this.b.f = 0.017453292f * um.u().b();
        this.b.g = 0.017453292f * um.u().c();
        this.b.h = 0.017453292f * um.u().d();
        this.c.f = 0.017453292f * um.u().b();
        this.c.g = 0.017453292f * um.u().c();
        this.c.h = 0.017453292f * um.u().d();
        final float n = (um.x().b() + um.y().b()) / 2.0f;
        final float n2 = (um.x().c() + um.y().c()) / 2.0f;
        final float n3 = (um.x().d() + um.y().d()) / 2.0f;
        this.d.f = 0.0f;
        this.d.g = 0.017453292f * -\u2603.y;
        this.d.h = 0.0f;
    }
    
    @Override
    public void a(final pk \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603) {
        super.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        bfl.E();
        if (this.r) {
            final float n = 2.0f;
            bfl.a(1.0f / n, 1.0f / n, 1.0f / n);
            bfl.b(0.0f, 24.0f * \u2603, 0.0f);
            this.a.a(\u2603);
            this.b.a(\u2603);
            this.c.a(\u2603);
            this.d.a(\u2603);
        }
        else {
            if (\u2603.av()) {
                bfl.b(0.0f, 0.2f, 0.0f);
            }
            this.a.a(\u2603);
            this.b.a(\u2603);
            this.c.a(\u2603);
            this.d.a(\u2603);
        }
        bfl.F();
    }
    
    @Override
    public void a(final float \u2603) {
        final boolean j = this.h.j;
        this.h.j = true;
        super.a(\u2603);
        this.h.j = j;
    }
}
