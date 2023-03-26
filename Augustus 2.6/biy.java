// 
// Decompiled by Procyon v0.5.36
// 

public class biy extends biv<ws>
{
    private float a;
    
    public biy(final biu \u2603, final float \u2603) {
        super(\u2603);
        this.a = \u2603;
    }
    
    @Override
    public void a(final ws \u2603, final double \u2603, final double \u2603, final double \u2603, final float \u2603, final float \u2603) {
        bfl.E();
        this.c(\u2603);
        bfl.b((float)\u2603, (float)\u2603, (float)\u2603);
        bfl.B();
        bfl.a(this.a, this.a, this.a);
        final bmi a = ave.A().ag().a().a(zy.bL);
        final bfx a2 = bfx.a();
        final bfd c = a2.c();
        final float e = a.e();
        final float f = a.f();
        final float g = a.g();
        final float h = a.h();
        final float n = 1.0f;
        final float n2 = 0.5f;
        final float n3 = 0.25f;
        bfl.b(180.0f - this.b.e, 0.0f, 1.0f, 0.0f);
        bfl.b(-this.b.f, 1.0f, 0.0f, 0.0f);
        c.a(7, bms.j);
        c.b(-0.5, -0.25, 0.0).a(e, h).c(0.0f, 1.0f, 0.0f).d();
        c.b(0.5, -0.25, 0.0).a(f, h).c(0.0f, 1.0f, 0.0f).d();
        c.b(0.5, 0.75, 0.0).a(f, g).c(0.0f, 1.0f, 0.0f).d();
        c.b(-0.5, 0.75, 0.0).a(e, g).c(0.0f, 1.0f, 0.0f).d();
        a2.b();
        bfl.C();
        bfl.F();
        super.a(\u2603, \u2603, \u2603, \u2603, \u2603, \u2603);
    }
    
    @Override
    protected jy a(final ws \u2603) {
        return bmh.g;
    }
}
