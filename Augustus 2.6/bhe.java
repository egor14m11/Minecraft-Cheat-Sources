import java.util.Calendar;

// 
// Decompiled by Procyon v0.5.36
// 

public class bhe extends bhd<aky>
{
    private static final jy c;
    private static final jy d;
    private static final jy e;
    private static final jy f;
    private static final jy g;
    private static final jy h;
    private baz i;
    private baz j;
    private boolean k;
    
    public bhe() {
        this.i = new baz();
        this.j = new bbk();
        final Calendar instance = Calendar.getInstance();
        if (instance.get(2) + 1 == 12 && instance.get(5) >= 24 && instance.get(5) <= 26) {
            this.k = true;
        }
    }
    
    @Override
    public void a(final aky \u2603, final double \u2603, final double \u2603, final double \u2603, final float \u2603, final int \u2603) {
        bfl.j();
        bfl.c(515);
        bfl.a(true);
        int n;
        if (!\u2603.t()) {
            n = 0;
        }
        else {
            final afh w = \u2603.w();
            n = \u2603.u();
            if (w instanceof afs && n == 0) {
                ((afs)w).e(\u2603.z(), \u2603.v(), \u2603.z().p(\u2603.v()));
                n = \u2603.u();
            }
            \u2603.m();
        }
        if (\u2603.f != null || \u2603.h != null) {
            return;
        }
        baz baz;
        if (\u2603.g != null || \u2603.i != null) {
            baz = this.j;
            if (\u2603 >= 0) {
                this.a(bhe.a[\u2603]);
                bfl.n(5890);
                bfl.E();
                bfl.a(8.0f, 4.0f, 1.0f);
                bfl.b(0.0625f, 0.0625f, 0.0625f);
                bfl.n(5888);
            }
            else if (\u2603.n() == 1) {
                this.a(bhe.c);
            }
            else if (this.k) {
                this.a(bhe.d);
            }
            else {
                this.a(bhe.e);
            }
        }
        else {
            baz = this.i;
            if (\u2603 >= 0) {
                this.a(bhe.a[\u2603]);
                bfl.n(5890);
                bfl.E();
                bfl.a(4.0f, 4.0f, 1.0f);
                bfl.b(0.0625f, 0.0625f, 0.0625f);
                bfl.n(5888);
            }
            else if (\u2603.n() == 1) {
                this.a(bhe.f);
            }
            else if (this.k) {
                this.a(bhe.g);
            }
            else {
                this.a(bhe.h);
            }
        }
        bfl.E();
        bfl.B();
        if (\u2603 < 0) {
            bfl.c(1.0f, 1.0f, 1.0f, 1.0f);
        }
        bfl.b((float)\u2603, (float)\u2603 + 1.0f, (float)\u2603 + 1.0f);
        bfl.a(1.0f, -1.0f, -1.0f);
        bfl.b(0.5f, 0.5f, 0.5f);
        int n2 = 0;
        if (n == 2) {
            n2 = 180;
        }
        if (n == 3) {
            n2 = 0;
        }
        if (n == 4) {
            n2 = 90;
        }
        if (n == 5) {
            n2 = -90;
        }
        if (n == 2 && \u2603.g != null) {
            bfl.b(1.0f, 0.0f, 0.0f);
        }
        if (n == 5 && \u2603.i != null) {
            bfl.b(0.0f, 0.0f, -1.0f);
        }
        bfl.b((float)n2, 0.0f, 1.0f, 0.0f);
        bfl.b(-0.5f, -0.5f, -0.5f);
        float n3 = \u2603.k + (\u2603.j - \u2603.k) * \u2603;
        if (\u2603.f != null) {
            final float n4 = \u2603.f.k + (\u2603.f.j - \u2603.f.k) * \u2603;
            if (n4 > n3) {
                n3 = n4;
            }
        }
        if (\u2603.h != null) {
            final float n4 = \u2603.h.k + (\u2603.h.j - \u2603.h.k) * \u2603;
            if (n4 > n3) {
                n3 = n4;
            }
        }
        n3 = 1.0f - n3;
        n3 = 1.0f - n3 * n3 * n3;
        baz.a.f = -(n3 * 3.1415927f / 2.0f);
        baz.a();
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
        c = new jy("textures/entity/chest/trapped_double.png");
        d = new jy("textures/entity/chest/christmas_double.png");
        e = new jy("textures/entity/chest/normal_double.png");
        f = new jy("textures/entity/chest/trapped.png");
        g = new jy("textures/entity/chest/christmas.png");
        h = new jy("textures/entity/chest/normal.png");
    }
}
