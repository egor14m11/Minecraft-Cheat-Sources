// 
// Decompiled by Procyon v0.5.36
// 

public class bhg extends bhd<alf>
{
    private static final jy c;
    private baz d;
    
    public bhg() {
        this.d = new baz();
    }
    
    @Override
    public void a(final alf \u2603, final double \u2603, final double \u2603, final double \u2603, final float \u2603, final int \u2603) {
        int u = 0;
        if (\u2603.t()) {
            u = \u2603.u();
        }
        if (\u2603 >= 0) {
            this.a(bhg.a[\u2603]);
            bfl.n(5890);
            bfl.E();
            bfl.a(4.0f, 4.0f, 1.0f);
            bfl.b(0.0625f, 0.0625f, 0.0625f);
            bfl.n(5888);
        }
        else {
            this.a(bhg.c);
        }
        bfl.E();
        bfl.B();
        bfl.c(1.0f, 1.0f, 1.0f, 1.0f);
        bfl.b((float)\u2603, (float)\u2603 + 1.0f, (float)\u2603 + 1.0f);
        bfl.a(1.0f, -1.0f, -1.0f);
        bfl.b(0.5f, 0.5f, 0.5f);
        int n = 0;
        if (u == 2) {
            n = 180;
        }
        if (u == 3) {
            n = 0;
        }
        if (u == 4) {
            n = 90;
        }
        if (u == 5) {
            n = -90;
        }
        bfl.b((float)n, 0.0f, 1.0f, 0.0f);
        bfl.b(-0.5f, -0.5f, -0.5f);
        float n2 = \u2603.f + (\u2603.a - \u2603.f) * \u2603;
        n2 = 1.0f - n2;
        n2 = 1.0f - n2 * n2 * n2;
        this.d.a.f = -(n2 * 3.1415927f / 2.0f);
        this.d.a();
        bfl.C();
        bfl.F();
        bfl.c(1.0f, 1.0f, 1.0f, 1.0f);
        if (\u2603 >= 0) {
            bfl.n(5890);
            bfl.F();
            bfl.n(5888);
        }
    }
    
    static {
        c = new jy("textures/entity/chest/ender.png");
    }
}
