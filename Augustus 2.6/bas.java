// 
// Decompiled by Procyon v0.5.36
// 

public class bas extends bbj
{
    public bas() {
        this(0.0f);
    }
    
    public bas(final float \u2603) {
        this(\u2603, 64, 32);
    }
    
    protected bas(final float \u2603, final int \u2603, final int \u2603) {
        super(\u2603, 0.0f, \u2603, \u2603);
    }
    
    @Override
    public void a(final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final pk \u2603) {
        if (!(\u2603 instanceof um)) {
            return;
        }
        final um um = (um)\u2603;
        this.e.f = 0.017453292f * um.t().b();
        this.e.g = 0.017453292f * um.t().c();
        this.e.h = 0.017453292f * um.t().d();
        this.e.a(0.0f, 1.0f, 0.0f);
        this.g.f = 0.017453292f * um.u().b();
        this.g.g = 0.017453292f * um.u().c();
        this.g.h = 0.017453292f * um.u().d();
        this.i.f = 0.017453292f * um.v().b();
        this.i.g = 0.017453292f * um.v().c();
        this.i.h = 0.017453292f * um.v().d();
        this.h.f = 0.017453292f * um.w().b();
        this.h.g = 0.017453292f * um.w().c();
        this.h.h = 0.017453292f * um.w().d();
        this.k.f = 0.017453292f * um.x().b();
        this.k.g = 0.017453292f * um.x().c();
        this.k.h = 0.017453292f * um.x().d();
        this.k.a(1.9f, 11.0f, 0.0f);
        this.j.f = 0.017453292f * um.y().b();
        this.j.g = 0.017453292f * um.y().c();
        this.j.h = 0.017453292f * um.y().d();
        this.j.a(-1.9f, 11.0f, 0.0f);
        bbo.a(this.e, this.f);
    }
}
