import java.nio.FloatBuffer;
import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public class bhl extends bhd<alp>
{
    private static final jy d;
    private static final jy e;
    private static final Random f;
    FloatBuffer c;
    
    public bhl() {
        this.c = avd.h(16);
    }
    
    @Override
    public void a(final alp \u2603, final double \u2603, final double \u2603, final double \u2603, final float \u2603, final int \u2603) {
        final float \u26032 = (float)this.b.j;
        final float n = (float)this.b.k;
        final float \u26033 = (float)this.b.l;
        bfl.f();
        bhl.f.setSeed(31100L);
        final float n2 = 0.75f;
        for (int i = 0; i < 16; ++i) {
            bfl.E();
            float n3 = (float)(16 - i);
            float n4 = 0.0625f;
            float n5 = 1.0f / (n3 + 1.0f);
            if (i == 0) {
                this.a(bhl.d);
                n5 = 0.1f;
                n3 = 65.0f;
                n4 = 0.125f;
                bfl.l();
                bfl.b(770, 771);
            }
            if (i >= 1) {
                this.a(bhl.e);
            }
            if (i == 1) {
                bfl.l();
                bfl.b(1, 1);
                n4 = 0.5f;
            }
            final float n6 = (float)(-(\u2603 + n2));
            float n7 = n6 + (float)auz.a().b;
            final float n8 = n6 + n3 + (float)auz.a().b;
            float \u26034 = n7 / n8;
            \u26034 += (float)(\u2603 + n2);
            bfl.b(\u26032, \u26034, \u26033);
            bfl.a(bfl.o.a, 9217);
            bfl.a(bfl.o.b, 9217);
            bfl.a(bfl.o.c, 9217);
            bfl.a(bfl.o.d, 9216);
            bfl.a(bfl.o.a, 9473, this.a(1.0f, 0.0f, 0.0f, 0.0f));
            bfl.a(bfl.o.b, 9473, this.a(0.0f, 0.0f, 1.0f, 0.0f));
            bfl.a(bfl.o.c, 9473, this.a(0.0f, 0.0f, 0.0f, 1.0f));
            bfl.a(bfl.o.d, 9474, this.a(0.0f, 1.0f, 0.0f, 0.0f));
            bfl.a(bfl.o.a);
            bfl.a(bfl.o.b);
            bfl.a(bfl.o.c);
            bfl.a(bfl.o.d);
            bfl.F();
            bfl.n(5890);
            bfl.E();
            bfl.D();
            bfl.b(0.0f, ave.J() % 700000L / 700000.0f, 0.0f);
            bfl.a(n4, n4, n4);
            bfl.b(0.5f, 0.5f, 0.0f);
            bfl.b((i * i * 4321 + i * 9) * 2.0f, 0.0f, 0.0f, 1.0f);
            bfl.b(-0.5f, -0.5f, 0.0f);
            bfl.b(-\u26032, -\u26033, -n);
            n7 = n6 + (float)auz.a().b;
            bfl.b((float)auz.a().a * n3 / n7, (float)auz.a().c * n3 / n7, -n);
            final bfx a = bfx.a();
            final bfd c = a.c();
            c.a(7, bms.f);
            float n9 = (bhl.f.nextFloat() * 0.5f + 0.1f) * n5;
            float n10 = (bhl.f.nextFloat() * 0.5f + 0.4f) * n5;
            float n11 = (bhl.f.nextFloat() * 0.5f + 0.5f) * n5;
            if (i == 0) {
                n10 = (n9 = (n11 = 1.0f * n5));
            }
            c.b(\u2603, \u2603 + n2, \u2603).a(n9, n10, n11, 1.0f).d();
            c.b(\u2603, \u2603 + n2, \u2603 + 1.0).a(n9, n10, n11, 1.0f).d();
            c.b(\u2603 + 1.0, \u2603 + n2, \u2603 + 1.0).a(n9, n10, n11, 1.0f).d();
            c.b(\u2603 + 1.0, \u2603 + n2, \u2603).a(n9, n10, n11, 1.0f).d();
            a.b();
            bfl.F();
            bfl.n(5888);
            this.a(bhl.d);
        }
        bfl.k();
        bfl.b(bfl.o.a);
        bfl.b(bfl.o.b);
        bfl.b(bfl.o.c);
        bfl.b(bfl.o.d);
        bfl.e();
    }
    
    private FloatBuffer a(final float \u2603, final float \u2603, final float \u2603, final float \u2603) {
        this.c.clear();
        this.c.put(\u2603).put(\u2603).put(\u2603).put(\u2603);
        this.c.flip();
        return this.c;
    }
    
    static {
        d = new jy("textures/environment/end_sky.png");
        e = new jy("textures/entity/end_portal.png");
        f = new Random(31100L);
    }
}
