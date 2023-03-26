import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public class bku implements blb<ug>
{
    @Override
    public void a(final ug \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603) {
        if (\u2603.by <= 0) {
            return;
        }
        final bfx a = bfx.a();
        final bfd c = a.c();
        avc.a();
        final float n = (\u2603.by + \u2603) / 200.0f;
        float n2 = 0.0f;
        if (n > 0.8f) {
            n2 = (n - 0.8f) / 0.2f;
        }
        final Random random = new Random(432L);
        bfl.x();
        bfl.j(7425);
        bfl.l();
        bfl.b(770, 1);
        bfl.c();
        bfl.o();
        bfl.a(false);
        bfl.E();
        bfl.b(0.0f, -1.0f, -2.0f);
        for (int n3 = 0; n3 < (n + n * n) / 2.0f * 60.0f; ++n3) {
            bfl.b(random.nextFloat() * 360.0f, 1.0f, 0.0f, 0.0f);
            bfl.b(random.nextFloat() * 360.0f, 0.0f, 1.0f, 0.0f);
            bfl.b(random.nextFloat() * 360.0f, 0.0f, 0.0f, 1.0f);
            bfl.b(random.nextFloat() * 360.0f, 1.0f, 0.0f, 0.0f);
            bfl.b(random.nextFloat() * 360.0f, 0.0f, 1.0f, 0.0f);
            bfl.b(random.nextFloat() * 360.0f + n * 90.0f, 0.0f, 0.0f, 1.0f);
            final float n4 = random.nextFloat() * 20.0f + 5.0f + n2 * 10.0f;
            final float n5 = random.nextFloat() * 2.0f + 1.0f + n2 * 2.0f;
            c.a(6, bms.f);
            c.b(0.0, 0.0, 0.0).b(255, 255, 255, (int)(255.0f * (1.0f - n2))).d();
            c.b(-0.866 * n5, n4, -0.5f * n5).b(255, 0, 255, 0).d();
            c.b(0.866 * n5, n4, -0.5f * n5).b(255, 0, 255, 0).d();
            c.b(0.0, n4, 1.0f * n5).b(255, 0, 255, 0).d();
            c.b(-0.866 * n5, n4, -0.5f * n5).b(255, 0, 255, 0).d();
            a.b();
        }
        bfl.F();
        bfl.a(true);
        bfl.p();
        bfl.k();
        bfl.j(7424);
        bfl.c(1.0f, 1.0f, 1.0f, 1.0f);
        bfl.w();
        bfl.d();
        avc.b();
    }
    
    @Override
    public boolean b() {
        return false;
    }
}
