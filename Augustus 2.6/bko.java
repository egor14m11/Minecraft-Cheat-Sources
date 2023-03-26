import java.util.Random;

// 
// Decompiled by Procyon v0.5.36
// 

public class bko implements blb<pr>
{
    private final bjl a;
    
    public bko(final bjl \u2603) {
        this.a = \u2603;
    }
    
    @Override
    public void a(final pr \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603, final float \u2603) {
        final int bv = \u2603.bv();
        if (bv <= 0) {
            return;
        }
        final pk \u26032 = new wq(\u2603.o, \u2603.s, \u2603.t, \u2603.u);
        final Random \u26033 = new Random(\u2603.F());
        avc.a();
        for (int i = 0; i < bv; ++i) {
            bfl.E();
            final bct a = this.a.b().a(\u26033);
            final bcr bcr = a.l.get(\u26033.nextInt(a.l.size()));
            a.c(0.0625f);
            float nextFloat = \u26033.nextFloat();
            float nextFloat2 = \u26033.nextFloat();
            float nextFloat3 = \u26033.nextFloat();
            final float \u26034 = (bcr.a + (bcr.d - bcr.a) * nextFloat) / 16.0f;
            final float \u26035 = (bcr.b + (bcr.e - bcr.b) * nextFloat2) / 16.0f;
            final float \u26036 = (bcr.c + (bcr.f - bcr.c) * nextFloat3) / 16.0f;
            bfl.b(\u26034, \u26035, \u26036);
            nextFloat = nextFloat * 2.0f - 1.0f;
            nextFloat2 = nextFloat2 * 2.0f - 1.0f;
            nextFloat3 = nextFloat3 * 2.0f - 1.0f;
            nextFloat *= -1.0f;
            nextFloat2 *= -1.0f;
            nextFloat3 *= -1.0f;
            final float c = ns.c(nextFloat * nextFloat + nextFloat3 * nextFloat3);
            final pk pk = \u26032;
            final pk pk2 = \u26032;
            final float n = (float)(Math.atan2(nextFloat, nextFloat3) * 180.0 / 3.1415927410125732);
            pk2.y = n;
            pk.A = n;
            final pk pk3 = \u26032;
            final pk pk4 = \u26032;
            final float n2 = (float)(Math.atan2(nextFloat2, c) * 180.0 / 3.1415927410125732);
            pk4.z = n2;
            pk3.B = n2;
            final double \u26037 = 0.0;
            final double \u26038 = 0.0;
            final double \u26039 = 0.0;
            this.a.d().a(\u26032, \u26037, \u26038, \u26039, 0.0f, \u2603);
            bfl.F();
        }
        avc.b();
    }
    
    @Override
    public boolean b() {
        return false;
    }
}
