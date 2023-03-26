// 
// Decompiled by Procyon v0.5.36
// 

public class bck extends bci
{
    public boolean g;
    private bct h;
    private bct i;
    
    public bck(final float \u2603) {
        super(\u2603, 0.0f, 64, 128);
        (this.h = new bct(this).b(64, 128)).a(0.0f, -2.0f, 0.0f);
        this.h.a(0, 0).a(0.0f, 3.0f, -6.75f, 1, 1, 1, -0.25f);
        this.f.a(this.h);
        (this.i = new bct(this).b(64, 128)).a(-5.0f, -10.03125f, -5.0f);
        this.i.a(0, 64).a(0.0f, 0.0f, 0.0f, 10, 2, 10);
        this.a.a(this.i);
        final bct b = new bct(this).b(64, 128);
        b.a(1.75f, -4.0f, 2.0f);
        b.a(0, 76).a(0.0f, 0.0f, 0.0f, 7, 4, 7);
        b.f = -0.05235988f;
        b.h = 0.02617994f;
        this.i.a(b);
        final bct b2 = new bct(this).b(64, 128);
        b2.a(1.75f, -4.0f, 2.0f);
        b2.a(0, 87).a(0.0f, 0.0f, 0.0f, 4, 4, 4);
        b2.f = -0.10471976f;
        b2.h = 0.05235988f;
        b.a(b2);
        final bct b3 = new bct(this).b(64, 128);
        b3.a(1.75f, -2.0f, 2.0f);
        b3.a(0, 95).a(0.0f, 0.0f, 0.0f, 1, 2, 1, 0.25f);
        b3.f = -0.20943952f;
        b3.h = 0.10471976f;
        b2.a(b3);
    }
    
    @Override
    public void a(final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final pk \u2603) {
        super.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
        final bct f = this.f;
        final bct f2 = this.f;
        final bct f3 = this.f;
        final float o = 0.0f;
        f3.q = o;
        f2.p = o;
        f.o = o;
        final float n = 0.01f * (\u2603.F() % 10);
        this.f.f = ns.a(\u2603.W * n) * 4.5f * 3.1415927f / 180.0f;
        this.f.g = 0.0f;
        this.f.h = ns.b(\u2603.W * n) * 2.5f * 3.1415927f / 180.0f;
        if (this.g) {
            this.f.f = -0.9f;
            this.f.q = -0.09375f;
            this.f.p = 0.1875f;
        }
    }
}
