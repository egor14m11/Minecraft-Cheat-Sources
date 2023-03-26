// 
// Decompiled by Procyon v0.5.36
// 

public class bbr extends bbj
{
    public bct a;
    public bct b;
    public bct c;
    public bct d;
    public bct v;
    private bct w;
    private bct x;
    private boolean y;
    
    public bbr(final float \u2603, final boolean \u2603) {
        super(\u2603, 0.0f, 64, 64);
        this.y = \u2603;
        (this.x = new bct(this, 24, 0)).a(-3.0f, -6.0f, -1.0f, 6, 6, 1, \u2603);
        (this.w = new bct(this, 0, 0)).b(64, 32);
        this.w.a(-5.0f, 0.0f, -1.0f, 10, 16, 1, \u2603);
        if (\u2603) {
            (this.i = new bct(this, 32, 48)).a(-1.0f, -2.0f, -2.0f, 3, 12, 4, \u2603);
            this.i.a(5.0f, 2.5f, 0.0f);
            (this.h = new bct(this, 40, 16)).a(-2.0f, -2.0f, -2.0f, 3, 12, 4, \u2603);
            this.h.a(-5.0f, 2.5f, 0.0f);
            (this.a = new bct(this, 48, 48)).a(-1.0f, -2.0f, -2.0f, 3, 12, 4, \u2603 + 0.25f);
            this.a.a(5.0f, 2.5f, 0.0f);
            (this.b = new bct(this, 40, 32)).a(-2.0f, -2.0f, -2.0f, 3, 12, 4, \u2603 + 0.25f);
            this.b.a(-5.0f, 2.5f, 10.0f);
        }
        else {
            (this.i = new bct(this, 32, 48)).a(-1.0f, -2.0f, -2.0f, 4, 12, 4, \u2603);
            this.i.a(5.0f, 2.0f, 0.0f);
            (this.a = new bct(this, 48, 48)).a(-1.0f, -2.0f, -2.0f, 4, 12, 4, \u2603 + 0.25f);
            this.a.a(5.0f, 2.0f, 0.0f);
            (this.b = new bct(this, 40, 32)).a(-3.0f, -2.0f, -2.0f, 4, 12, 4, \u2603 + 0.25f);
            this.b.a(-5.0f, 2.0f, 10.0f);
        }
        (this.k = new bct(this, 16, 48)).a(-2.0f, 0.0f, -2.0f, 4, 12, 4, \u2603);
        this.k.a(1.9f, 12.0f, 0.0f);
        (this.c = new bct(this, 0, 48)).a(-2.0f, 0.0f, -2.0f, 4, 12, 4, \u2603 + 0.25f);
        this.c.a(1.9f, 12.0f, 0.0f);
        (this.d = new bct(this, 0, 32)).a(-2.0f, 0.0f, -2.0f, 4, 12, 4, \u2603 + 0.25f);
        this.d.a(-1.9f, 12.0f, 0.0f);
        (this.v = new bct(this, 16, 32)).a(-4.0f, 0.0f, -2.0f, 8, 12, 4, \u2603 + 0.25f);
        this.v.a(0.0f, 0.0f, 0.0f);
    }
    
    @Override
    public void a(final pk \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603) {
        super.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        bfl.E();
        if (this.r) {
            final float n = 2.0f;
            bfl.a(1.0f / n, 1.0f / n, 1.0f / n);
            bfl.b(0.0f, 24.0f * \u2603, 0.0f);
            this.c.a(\u2603);
            this.d.a(\u2603);
            this.a.a(\u2603);
            this.b.a(\u2603);
            this.v.a(\u2603);
        }
        else {
            if (\u2603.av()) {
                bfl.b(0.0f, 0.2f, 0.0f);
            }
            this.c.a(\u2603);
            this.d.a(\u2603);
            this.a.a(\u2603);
            this.b.a(\u2603);
            this.v.a(\u2603);
        }
        bfl.F();
    }
    
    public void b(final float \u2603) {
        bbo.a(this.e, this.x);
        this.x.c = 0.0f;
        this.x.d = 0.0f;
        this.x.a(\u2603);
    }
    
    public void c(final float \u2603) {
        this.w.a(\u2603);
    }
    
    @Override
    public void a(final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final pk \u2603) {
        super.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        bbo.a(this.k, this.c);
        bbo.a(this.j, this.d);
        bbo.a(this.i, this.a);
        bbo.a(this.h, this.b);
        bbo.a(this.g, this.v);
        if (\u2603.av()) {
            this.w.d = 2.0f;
        }
        else {
            this.w.d = 0.0f;
        }
    }
    
    public void a() {
        this.h.a(0.0625f);
        this.b.a(0.0625f);
    }
    
    public void b() {
        this.i.a(0.0625f);
        this.a.a(0.0625f);
    }
    
    @Override
    public void a(final boolean \u2603) {
        super.a(\u2603);
        this.a.j = \u2603;
        this.b.j = \u2603;
        this.c.j = \u2603;
        this.d.j = \u2603;
        this.v.j = \u2603;
        this.w.j = \u2603;
        this.x.j = \u2603;
    }
    
    @Override
    public void a(final float \u2603) {
        if (this.y) {
            final bct h = this.h;
            ++h.c;
            this.h.c(\u2603);
            final bct h2 = this.h;
            --h2.c;
        }
        else {
            this.h.c(\u2603);
        }
    }
}
